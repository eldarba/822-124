package a;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {

	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");) {
			ctx.getBean("thePersonProto");
			ctx.getBean("thePersonProto");
			ctx.getBean("thePersonProto");
		}

	}

}
