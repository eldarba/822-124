package org.eldar.spring.cars;

import org.eldar.spring.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)) {

			Car car = ctx.getBean("car", Car.class);
			Car car2 = ctx.getBean("car", Car.class);
			Car car3 = ctx.getBean("raceCar", Car.class);

			System.out.println(car);
			System.out.println(car2);
			System.out.println(car3);

		}

	}
}