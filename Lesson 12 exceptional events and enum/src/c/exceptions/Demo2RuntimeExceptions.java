package c.exceptions;

import java.util.Date;

// UNCHECKED
public class Demo2RuntimeExceptions {

	public static void main(String[] args) {

		// ClassCastException
		Object date = new Date();
		String str = (String) date;
//		if (date instanceof String) {
//		}

		// NumberFormatException
		int x = Integer.parseInt("aaa");

		// ArrayIndexOutOfBoundsException
		int[] numbers = { 2, 4, 6 };
		System.out.println(numbers[100]);

		// NegativeArraySizeException
		int[] arr = new int[-9];

		// NullPointerException
		Calculator c = null;
		try {
			c.divide(5, 5);
		} catch (Exception e) {
			e.printStackTrace();
		}

		// AritmeticException
		System.out.println(4 / 0);

		System.out.println("=============");
	}

}
