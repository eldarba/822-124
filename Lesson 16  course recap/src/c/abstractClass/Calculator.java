package c.abstractClass;

/**
 * abstract class - is a basic design that should be inherited
 * 
 * 1. cannot be instantiated
 * 
 * 2. can contain abstract methods
 * 
 * 3. can contain anything like concrete class attributes, CTORs, concrete
 * methods
 */
public abstract class Calculator {

	// attributes
	protected double currResult;

	// CTOR
	public Calculator() {
		super();
	}

	// concrete methods
	public double getCurrResult() {
		return currResult;
	}

	public void setCurrResult(double currResult) {
		this.currResult = currResult;
	}

	// abstract methods
	public abstract void add(double val);

	public abstract void sub(double val);

	public abstract void mul(double val);

	public abstract void div(double val);

}
