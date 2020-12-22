package a.decorators;

import a.Beverage;

public class StrawDecorator extends BeverageAddonDecorator {

	private double addedCost = 0.50;
	private String addedDescription = " + straw";

	public StrawDecorator(Beverage beverage) {
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
