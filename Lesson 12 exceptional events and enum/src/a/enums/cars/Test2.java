package a.enums.cars;

import java.util.Arrays;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		CarColor[] colors = CarColor.values(); // get an array of all CarColor constants
		System.out.println("choose car color: " + Arrays.toString(colors));
		String color = sc.nextLine();
		CarColor carColor = CarColor.valueOf(color); // convert String to CarColor
		System.out.println(carColor);

		Car car = new Car(111, 0, carColor);
		System.out.println(car);

		sc.close();

	}

}
