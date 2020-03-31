package h;

public class Operators {

	public static void main(String[] args) {

		System.out.println(2 + 4 * 3);
		System.out.println((2 + 4) * 3);

		System.out.println(2 + 4 + 5 + -3);

		System.out.println("=================");
		int x = 5;
		System.out.println(-++x);

		System.out.println("=================");
		int a = 15;
		int b = 9;
//		?: ternary operator
		int max = a > b ? a : b;
		System.out.println(max);

		System.out.println("=================");
//		?: ternary operator
		a = 2;
		b = 3;
		int n = a == b ? 0 : a > b ? 1 : -1;
		System.out.println(n);

		// if a is bigger ===> n = 1
		// if a is smaller ===> n = -1
		// if a == b ===> n = 0

	}

}
