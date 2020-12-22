package a.decorators;

import a.Beverage;

public abstract class BeverageAddonDecorator extends Beverage {

	protected Beverage beverage;

	public BeverageAddonDecorator(Beverage beverage) {
		super();
		this.beverage = beverage;
	}

}
