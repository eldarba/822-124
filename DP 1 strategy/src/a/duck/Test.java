package a.duck;

import a.duck.beaviors.DisplayGraphic;
import a.duck.beaviors.DisplayTextual;
import a.duck.beaviors.FlyOverMountains;
import a.duck.beaviors.FlyWithWings;
import a.duck.beaviors.NoisyQuack;
import a.duck.beaviors.PleasentQuack;

public class Test {

	public static void main(String[] args) {

		Duck mountainDuck = new Duck("Joni", new FlyOverMountains(), new NoisyQuack(), new DisplayTextual());
		Duck homeDuck = new Duck("Boni", new FlyWithWings(), new PleasentQuack(), new DisplayGraphic());

		mountainDuck.fly();
		mountainDuck.quack();

		System.out.println("========================");

		homeDuck.fly();
		homeDuck.quack();

		System.out.println("========================");

		Duck duckCopy = new Duck(mountainDuck.getName(), mountainDuck.getFlyBehavior(), mountainDuck.getQuackBehavior(),
				mountainDuck.getDisplayBehavior());
		duckCopy.fly();
		duckCopy.quack();
		duckCopy.display();

	}

}
