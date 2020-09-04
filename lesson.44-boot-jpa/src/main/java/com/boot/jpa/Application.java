package com.boot.jpa;

import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@SpringBootApplication
public class Application implements ApplicationContextAware {

	private static ApplicationContext ctx;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println(ctx);

		Integer a = ctx.getBean(Integer.class);
		Object b = ctx.getBean("number");
		Integer c = ctx.getBean("number", Integer.class);

		System.out.println(ctx.getBean(Integer.class));
		System.out.println(ctx.getBean("number"));
		System.out.println(ctx.getBean(Integer.class));
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		ctx = applicationContext;
	}

	@Bean
	@Primary
	@Scope("prototype")
	public Integer number() {
		return (int) (Math.random() * 101);
	}

	@Bean
	@Scope("prototype")
	public Integer number2() {
		return (int) (Math.random() * 101);
	}

}
