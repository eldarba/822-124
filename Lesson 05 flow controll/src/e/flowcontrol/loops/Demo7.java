package e.flowcontrol.loops;

import java.util.Scanner;

public class Demo7 {

	public static void main(String[] args) {
		/*
		 * use scanner to get a number.
		 * 
		 * print how many digits in the number
		 * 
		 * print the sum of the digits
		 * 
		 * 
		 */

		// get a number from user
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int x = sc.nextInt();
		System.out.println(x);
		sc.close();

		// calculate number of digits and sum
		int numOfDigits = 0, sum = 0;

		while (x != 0) {
			numOfDigits++;
			sum += x % 10;
			x /= 10;
		}

		System.out.println("number of digits: " + numOfDigits);
		System.out.println("sum of digits: " + sum);
		
		/*
		 * this solution will not work with input 0
		 * */

	}

}
