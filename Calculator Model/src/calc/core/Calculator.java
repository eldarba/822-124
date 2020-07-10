package calc.core;

public class Calculator {

	private double currResult;

	public void add(double val) {
		this.currResult += val;
	}

	public void sub(double val) {
		this.currResult -= val;
	}

	public void mul(double val) {
		this.currResult *= val;
	}

	public void div(double val) {
		this.currResult /= val;
	}

	public void clear() {
		this.currResult = 0;
	}

	public double getCurrResult() {
		return currResult;
	}

}
