package b.enums.planets;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter planet " + Arrays.toString(Planet.values()));
		Planet pl = Planet.valueOf(sc.nextLine());

		System.out.println("Your choice: " + pl);
		System.out.println("mass: " + pl.getMass());
		System.out.println("distance from sun: " + pl.getOrbit());

		sc.close();
	}

}
