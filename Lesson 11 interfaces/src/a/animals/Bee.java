package a.animals;

import b.interfaces.Flyer;

public class Bee extends Insect implements Flyer {

	@Override
	public void speak() {
		System.out.println("speak like a bee");
	}

	@Override
	public void fly() {
		System.out.println("fly like a bee");
	}

}
