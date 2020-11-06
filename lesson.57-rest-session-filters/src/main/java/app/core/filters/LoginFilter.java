package app.core.filters;

import java.io.IOException;

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
		// get token
		String token = req.getHeader("token");
		if (token != null) {
			Session session = sessionContext.getSession(token);
			if (session != null) {
				// there is an active session - what to do?
				System.out.println("SESSION good - forward the request");
				chain.doFilter(request, response);
				return;
			}
		}

		// if we are here - there is no session
		HttpServletResponse resp = (HttpServletResponse) response;
		System.out.println("NO SESSION - block request and send error to client");
		resp.sendError(HttpStatus.UNAUTHORIZED.value(), "You are not logged in");

	}

}
