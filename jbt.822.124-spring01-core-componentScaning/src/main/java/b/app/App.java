package b.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import a.types.cars.Car;

public class App {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml")) {
			Car c = ctx.getBean("theCar", Car.class);
			System.out.println(c.startDriving());
			System.out.println(c.startHonking());
		}

	}

}
