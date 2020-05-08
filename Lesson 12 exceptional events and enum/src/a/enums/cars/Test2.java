package a.enums.cars;

import java.util.Arrays;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		System.out.println("car colors");
		CarColor[] colors = CarColor.values(); // get an array of all CarColor constants
		for (int i = 0; i < colors.length; i++) {
			System.out.println(colors[i]);
		}
		System.out.println("=================");

		Scanner sc = new Scanner(System.in);

		System.out.println("choose car color: " + Arrays.toString(colors));
		String color = sc.nextLine();
		CarColor carColor = CarColor.valueOf(color); // convert String to CarColor
		System.out.println(carColor);

		System.out.println("enter car type " + Arrays.toString(Car.Type.values()));
		Car car = new Car(111, 0, carColor, Car.Type.valueOf(sc.nextLine()));
		System.out.println(car);

		sc.close();

	}

}
