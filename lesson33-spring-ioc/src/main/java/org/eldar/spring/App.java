package org.eldar.spring;

import org.eldar.spring.persons.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)){
			Person p1 = ctx.getBean("person", Person.class);
			Person p2 = ctx.getBean("thePerson", Person.class);
			
			p1.setId(101);
			p2.setId(102);
			
			System.out.println(p1);
			System.out.println(p2);
		}
		

	}

}
