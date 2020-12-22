package a;

import java.util.Arrays;
import java.util.List;

import a.decorators.CherryDecorator;
import a.decorators.IceDecorator;
import a.decorators.StrawDecorator;

public class Test {

	public static void main(String[] args) {
		Beverage b1 = new Vodka();
		Beverage b2 = new Coffee();
		Beverage b3 = new CherryDecorator(new Vodka());
		Beverage b4 = new IceDecorator(new StrawDecorator(new Coffee()));
		Beverage b5 = new CherryDecorator(new CherryDecorator(new Coffee()));

		List<Beverage> list = Arrays.asList(b1, b2, b3, b4, b5);

		for (Beverage beverage : list) {
			System.out.println(beverage.getDescription() + ", cost: " + beverage.getCost());
		}

	}

}
