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
		FilterRegistrationBean<LoginFilter> registrationBean = new FilterRegistrationBean<>();
		registrationBean.setFilter(new LoginFilter());
		registrationBean.addUrlPatterns("/products/*");
		registrationBean.setOrder(1);
		return registrationBean;
	}

	@Bean
	public FilterRegistrationBean<OtherFilter> otherFilter() {
		FilterRegistrationBean<OtherFilter> registrationBean = new FilterRegistrationBean<>();
		registrationBean.setFilter(new OtherFilter());
		registrationBean.addUrlPatterns("/products/*");
		registrationBean.setOrder(2);
		return registrationBean;
	}

}
