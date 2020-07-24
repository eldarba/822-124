package calc.web;

import calc.core.Calculator;

public class App1 {

	public static void main(String[] args) {

		// how to use a jar model from an EE project

		Calculator calc = new Calculator();
		calc.add(5);
		calc.mul(3);

		System.out.println(calc.getCurrResult());

	}

}
