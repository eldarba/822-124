package a.decorators;

import a.Beverage;

public class CherryDecorator extends BeverageAddonDecorator {

	private double addedCost = 3;
	private String addedDescription = " + cherry";

	public CherryDecorator(Beverage beverage) {
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
