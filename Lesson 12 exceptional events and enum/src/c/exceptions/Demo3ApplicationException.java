package c.exceptions;

import a.enums.cars.Car;
import a.enums.cars.CarColor;

//CHECKED
public class Demo3ApplicationException {

	public static void main(String[] args) {

		Car car = new Car(101, 0, CarColor.BLACK, Car.Type.FORD);
		System.out.println(car);

		/**
		 * the method Class.forName(string) - returns the object representing the
		 * specified class
		 */

		try {
			Class clazz = Class.forName("b.enums.cars.Car");
			System.out.println(clazz);
		} catch (Exception e) {
			// handler code - plan B
			System.out.println("somethig is wrong");
		}

		System.out.println("==============");

	}

}
