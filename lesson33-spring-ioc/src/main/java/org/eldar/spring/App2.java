package org.eldar.spring;

import org.eldar.spring.scope.MyComposit;
import org.eldar.spring.scope.MyPrototype;
import org.eldar.spring.scope.MySingleton;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App2 {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class)) {

			MySingleton single = ctx.getBean(MySingleton.class);
			MyPrototype proto = ctx.getBean(MyPrototype.class);

			System.out.println("single: " + single.x);
			System.out.println("proto: " + proto.x);

			single = ctx.getBean(MySingleton.class);
			proto = ctx.getBean(MyPrototype.class);

			System.out.println("single: " + single.x);
			System.out.println("proto: " + proto.x);
			
			System.out.println("=================");
			MyComposit composit = ctx.getBean(MyComposit.class);
			System.out.println("single: " + composit.single.x);
			System.out.println("proto: " + composit.proto.x);

			composit = ctx.getBean(MyComposit.class);
			System.out.println("single: " + composit.single.x);
			System.out.println("proto: " + composit.proto.x);
			

		}

	}

}
