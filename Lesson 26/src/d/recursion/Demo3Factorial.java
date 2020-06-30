package d.recursion;

import java.math.BigInteger;

public class Demo3Factorial {

	public static BigInteger factorial(int n) {
		if (n <= 1) {
			return new BigInteger("1");
		} else {
//			return n * factorial(n - 1);
			return factorial(n - 1).multiply(new BigInteger(String.valueOf(n)));
		}
	}

	public static void main(String[] args) {
		System.out.println("0! = " + factorial(0));
		System.out.println("1! = " + factorial(1));
		System.out.println("2! = " + factorial(2));
		System.out.println("3! = " + factorial(3));
		System.out.println("4! = " + factorial(4));
		System.out.println("5! = " + factorial(5));
		System.out.println("100! = " + factorial(100));

	}

}
