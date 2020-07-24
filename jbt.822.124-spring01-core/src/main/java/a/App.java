package a;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import a.types.person.Person;

public class App {

	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");) {
			Person p1 = ctx.getBean("thePersonSingle", Person.class);
			p1.setName("David");
			System.out.println(p1);
			System.out.println(p1.hashCode());

			Person p2 = ctx.getBean("thePersonSingle", Person.class);
			System.out.println(p2);
			System.out.println(p2.hashCode());
		}

	}

}
