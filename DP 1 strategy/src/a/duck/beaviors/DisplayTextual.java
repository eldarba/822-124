package a.duck.beaviors;

import a.duck.Duck;

public class DisplayTextual implements DisplayBehavior {

	@Override
	public void display(Duck duck) {
		System.out.println(duck.getName() + " display as text");

	}

}
