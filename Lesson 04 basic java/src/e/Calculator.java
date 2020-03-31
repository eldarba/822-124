package e;

public class Calculator {

	private double currentResult;

	// method definition
	public void add(double value) {
		// the this keyword is a reference to the current object
		// the object that invoked the method
		this.currentResult += value;
		value = 0;
	}

	public void sub(double value) {
		this.currentResult -= value;
	}

	public void mul(double value) {
		this.currentResult *= value;
	}

	public void div(double value) {
		this.currentResult /= value;
	}
	
	public void clear() {
		this.currentResult = 0;
	}

	public double getCurrentResult() {
		return this.currentResult;
	}

}
