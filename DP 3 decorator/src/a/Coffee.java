package a;

public class Coffee extends Beverage {

	@Override
	public double getCost() {
		return 5;
	}

	@Override
	public String getDescription() {
		return "Coffee";
	}

}
