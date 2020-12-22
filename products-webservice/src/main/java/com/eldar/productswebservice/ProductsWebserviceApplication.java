package com.eldar.productswebservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

import com.eldar.productswebservice.filters.LoginFilter;
import com.eldar.productswebservice.filters.OtherFilter;

@SpringBootApplication
public class ProductsWebserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductsWebserviceApplication.class, args);
	}

	@Bean
	public FilterRegistrationBean<LoginFilter> loginFilter() {
		FilterRegistrationBean<LoginFilter> registration = new FilterRegistrationBean<>();
		registration.setFilter(new LoginFilter());
		registration.addUrlPatterns("/products/get-all");
		registration.setOrder(1);
		registration.setName("aaa");
		return registration;
	}

	@Bean
	public FilterRegistrationBean<LoginFilter> loginFilter2() {
		FilterRegistrationBean<LoginFilter> registration = new FilterRegistrationBean<>();
		registration.setFilter(new LoginFilter());
		registration.addUrlPatterns("/products/add");
		registration.setOrder(1);
		registration.setName("aaa");
		return registration;
	}

//	@Bean
	public FilterRegistrationBean<OtherFilter> otherFilter() {
		FilterRegistrationBean<OtherFilter> registration = new FilterRegistrationBean<>();
		registration.setFilter(new OtherFilter());
		registration.addUrlPatterns("/products/*");
		registration.setOrder(3);
		registration.setName("ccc");
		return registration;
	}

//	@Bean
	public FilterRegistrationBean<OtherFilter> otherFilter2() {
		FilterRegistrationBean<OtherFilter> registration = new FilterRegistrationBean<>();
		registration.setFilter(new OtherFilter());
		registration.addUrlPatterns("/products/*");
		registration.setOrder(4);
		registration.setName("ddd");
		return registration;
	}

}
