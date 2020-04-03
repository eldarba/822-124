package a.concatenation;

public class Demo1 {

	public static void main(String[] args) {

		// CONCATENATION EXAMPLE:
		int a = 4;
		int b = 7;
		int sum = a + b;
		System.out.println(a + " + " + b + " = " + sum);

		// CONCATENATION EXERCISE:
		/*
		 * create 2 random numbers in the range 0 - 10 inclusive and calculate the sum.
		 * Print the entire expression + the sum
		 */

		// *** your code here ***

		int x = (int) (Math.random() * 11);
		int y = (int) (Math.random() * 11);
		System.out.println(x + " + " + y + " = " + (x+y));

	}

}
