package org.spring.eldar;

import org.spring.eldar.interceptors.MyBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App2 {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)) {
			MyBean myBean = ctx.getBean("myBean", MyBean.class);
			
			System.out.println("=============================================");
			// get the context using the bean
			System.out.println("the bean context: " + myBean.context.hashCode() + " = " + ctx.hashCode());
			// get the factory using the bean
			System.out.println("the bean factory: " + myBean.factory.hashCode() + " = " + ctx.getBeanFactory().hashCode());
			System.out.println("=============================================");
			
		}
	}

}
