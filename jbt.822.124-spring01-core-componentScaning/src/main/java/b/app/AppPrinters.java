package b.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import a.types.printers.LaserPrinter;
import a.types.printers.Printer;

public class AppPrinters {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml")) {
			Printer p = ctx.getBean(LaserPrinter.class);
			System.out.println(p);
			p.print("Hello Spring");
			p.print("Hello Spring");
			p.print("Hello Spring");
			p.print("Hello Spring");
			p.print("Hello Spring");
			p.print("Hello Spring");
			p.print("Hello Spring");
			p.print("Hello Spring");
			p.print("Hello Spring");
		}

	}

}
