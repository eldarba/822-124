package org.eldar.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import b.Car;

public class SpringApp2 {

	public static void main(String[] args) throws InterruptedException {

		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);) {
			System.out.println("context is up");
			Thread.sleep(5000);
			Car c = ctx.getBean(Car.class);
			System.out.println(c);
		}

	}

}
