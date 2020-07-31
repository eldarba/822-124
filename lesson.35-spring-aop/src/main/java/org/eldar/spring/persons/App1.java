package org.eldar.spring.persons;

import org.eldar.spring.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App1 {

	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)){
			Person p1 = ctx.getBean(Person.class);
			System.out.println(p1);
		}

	}

}
