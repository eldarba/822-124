package org.eldar.spring;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import a.Person;
import b.Car;

public class ApringApp {

	public static void main(String[] args) throws InterruptedException {
		
		try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);){
			
			Person p = ctx.getBean("person", Person.class);
			System.out.println(p);
			
			Car c = (Car) ctx.getBean(Car.class);
			System.out.println(c);
			
			Car c2 = ctx.getBean("speadingCar", Car.class);
			System.out.println(c2);
			
			System.out.println("==================");
			
			int[] arr = ctx.getBean("theFiveRandoms", int[].class);
			System.out.println(Arrays.toString(arr));
			
			p = ctx.getBean("person18", Person.class);
			System.out.println(p);
		}
		
		
		

	}

}
