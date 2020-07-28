package org.spring.eldar;

import org.spring.eldar.circular.BeanA;
import org.spring.eldar.circular.BeanB;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	
	public static void main(String[] args) {
		try(AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)){
			BeanA a = ctx.getBean(BeanA.class);
			BeanB b = ctx.getBean(BeanB.class);
			System.out.println(a);
			System.out.println(b);
			System.out.println("==============");
			System.out.println(a.beanB);
			System.out.println(b.beanA);
		}
	}

}
