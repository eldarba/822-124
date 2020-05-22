package c.abstractClass;

public class MyCalculatorImpl extends Calculator {

	@Override
	public void add(double val) {
		// this is how we would do it if the currResult attribute was private
		setCurrResult(getCurrResult() + val);
	}

	@Override
	public void sub(double val) {
		this.currResult -= val;

	}

	@Override
	public void mul(double val) {
		this.currResult *= val;
	}

	@Override
	public void div(double val) {
		this.currResult /= val;
	}

}
