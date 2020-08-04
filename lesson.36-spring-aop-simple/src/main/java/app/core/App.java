package app.core;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import app.core.target.MyTargetObject;

public class App {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)) {
			System.out.println("APP: started");

			MyTargetObject tar = ctx.getBean(MyTargetObject.class);
//			MyTargetObject tar = new MyTargetObject();
			int sum = tar.sum(5, 3);
			System.out.println("APP: " + sum);

			System.out.println("==========");
			tar.sayHi();
		}
		System.out.println("APP: finished");

	}

}
