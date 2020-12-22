package a.duck;

import a.duck.beaviors.DisplayBehavior;
import a.duck.beaviors.FlyBehavior;
import a.duck.beaviors.QuackBehavior;

public class Duck {

	private String name;

	// the behaviors are encapsulated in the class
	private FlyBehavior flyBehavior;
	private QuackBehavior quackBehavior;
	private DisplayBehavior displayBehavior;

	public Duck(String name, FlyBehavior flyBehavior, QuackBehavior quackBehavior, DisplayBehavior displayBehavior) {
		super();
		this.name = name;
		this.flyBehavior = flyBehavior;
		this.quackBehavior = quackBehavior;
		this.displayBehavior = displayBehavior;
	}

	public void fly() {
		this.flyBehavior.fly();
	}

	public void quack() {
		this.quackBehavior.quack();
	}

	public void display() {
		displayBehavior.display(this);
	}

	public FlyBehavior getFlyBehavior() {
		return flyBehavior;
	}

	public QuackBehavior getQuackBehavior() {
		return quackBehavior;
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	public DisplayBehavior getDisplayBehavior() {
		return displayBehavior;
	}

	public void setDisplayBehavior(DisplayBehavior displayBehavior) {
		this.displayBehavior = displayBehavior;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
