package a.decorators;

import a.Beverage;

public class IceDecorator extends BeverageAddonDecorator {

	private double addedCost = 3.70;
	private String addedDescription = " + ice";

	public IceDecorator(Beverage beverage) {
		super(beverage);
	}

	@Override
	public double getCost() {
		return this.beverage.getCost() + this.addedCost;
	}

	@Override
	public String getDescription() {
		return this.beverage.getDescription() + this.addedDescription;
	}

}
