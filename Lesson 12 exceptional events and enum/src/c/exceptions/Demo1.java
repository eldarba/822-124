package c.exceptions;

public class Demo1 {

	public static void main(String[] args) {
		Calculator c = new Calculator();

		int a, b, result;

		a = 10;
		b = 0;

		System.out.println("trying to divide " + a + " by " + b);

		result = c.divide(a, b);
		System.out.println(result);

		System.out.println("=== END ===");
	}

}
