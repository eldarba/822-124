package com.eldar.productswebservice.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

//@Component
//@Order(1)
public class LoginFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.print(">>> login filter");
		HttpServletRequest req = (HttpServletRequest) request;
		String token = req.getHeader("token");
		System.out.print(" - token: " + token + " URI: " + req.getRequestURI());
		if (req.getRequestURI().contains("add")) {
			System.out.println(" - you are adding peoducts");
		} else if (req.getRequestURI().contains("get")) {
			System.out.println(" - you are getting peoducts");
		} else {
			System.out.println(" - you are doing something else");
		}
		chain.doFilter(request, response);
		System.out.println("<<< login filter");

	}

}
