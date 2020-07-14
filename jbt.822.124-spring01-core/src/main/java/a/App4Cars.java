package a;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import a.types.cars.Car;

public class App4Cars {

	public static void main(String[] args) {

		try (ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");) {
			Car car = ctx.getBean("theCar", Car.class);
			System.out.println(car.startDriving());
			System.out.println(car.startHonking());
		}

	}

}
