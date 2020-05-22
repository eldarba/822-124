package c.abstractClass;

public class Test {

	public static void main(String[] args) {

		Calculator c = new MyCalculatorImpl();

		c.add(5);

		System.out.println(c.getCurrResult());
	}
}
