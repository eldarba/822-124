package c.exceptions;

public class Calculator {

	/**
	 * calculate and return tge division of 2 integers
	 * 
	 * @param a the first value
	 * @param b the second value
	 * 
	 * @return the division value
	 * 
	 * @throws RuntimeException in case of division by 0
	 */
	public int divide(int a, int b) {
		if (b != 0) {
			return a / b;
		} else {
			RuntimeException e = new RuntimeException("somethig is wrong. are you trying to divide by 0");
			throw e;
		}
	}

//	HOW DO WE SOLVE THIS METHOD SO IT COMPILES WITHOUT ERROR?
//	as per the method declaration it must return int

	public void sayHi() {
		System.out.println("Hi");
		return;
	}

}
