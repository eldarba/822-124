package exercise05.conditions;

import java.util.Random;

public class Tar1 {

	/*
	 * Create a class that defines 2 random numbers and prints the bigger value
	 */

	public static void main(String[] args) {
		/*
		 * this is just another way to randomize numbers. a little bit different than
		 * what we learned:
		 */
		Random random = new Random();
		int a = random.nextInt(101);
		int b = random.nextInt(101);

		System.out.println(a + ", " + b);
		int max = a > b ? a : b;
		System.out.println("max: " + max);
	}

}
