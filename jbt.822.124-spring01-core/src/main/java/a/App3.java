package a;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import a.types.person.Person;

public class App3 {

	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");) {
			Person p = ctx.getBean("thePersonSingle", Person.class);
			System.out.println(p);

			p.setName("AAA");
			System.out.println(p);
		}

	}

}
