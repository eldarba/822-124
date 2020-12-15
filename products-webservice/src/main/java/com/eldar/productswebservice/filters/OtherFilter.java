package com.eldar.productswebservice.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

//@Component
//@Order(2)
public class OtherFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println(">>> other filter");
		chain.doFilter(request, response);
		System.out.println("<<< other filter");

	}

}
