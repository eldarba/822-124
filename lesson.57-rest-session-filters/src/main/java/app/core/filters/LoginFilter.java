package app.core.filters;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;

import app.core.sessions.Session;
import app.core.sessions.SessionContext;

public class LoginFilter implements Filter {

	private SessionContext sessionContext;

	public LoginFilter(SessionContext sessionContext) {
		super();
		this.sessionContext = sessionContext;
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// we are now intercepting a coming request
		HttpServletRequest req = (HttpServletRequest) request;
		System.out.println("=== filter === " + req.getMethod() + " : " + LocalDateTime.now());
		// get token
		String token = req.getHeader("token");
		if (token != null) {
			Session session = sessionContext.getSession(token);
			if (session != null) {
				// there is an active session - what to do?
				System.out.println("=== filter === SESSION good - forward the request");
				chain.doFilter(request, response);
				System.out.println("==========================");
				return;
			}
		}

		// if we are here - there is no session or prefligth request (no token header)
		HttpServletResponse resp = (HttpServletResponse) response;

		if (req.getMethod().equalsIgnoreCase("OPTIONS")) {
			System.out.println("=== filter === this is preflight: " + req.getMethod());
			chain.doFilter(request, response);
			System.out.println("==========================");
		} else {
			System.out.println("=== filter === NO SESSION - block request and send error to client");
			resp.setHeader("Access-Control-Allow-Origin", "http://127.0.0.1:5500");
			resp.sendError(HttpStatus.UNAUTHORIZED.value(), "You are not logged in");
			System.out.println("==========================");
		}
//		resp.setHeader("Access-Control-Allow-Headers", "token");

	}

}
