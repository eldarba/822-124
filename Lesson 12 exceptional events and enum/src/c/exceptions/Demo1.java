package c.exceptions;

public class Demo1 {

	public static void main(String[] args) {
		Calculator c = new Calculator();

		int a, b, result;

		a = 10;
		b = 0;

		System.out.println("trying to divide " + a + " by " + b);

		// handling #2 - try-catch (handler)
		try {
			result = c.divide(a, b);
			System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("=== END ===");
	}

}
