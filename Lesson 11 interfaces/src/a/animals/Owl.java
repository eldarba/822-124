package a.animals;

import b.interfaces.Flyer;
import b.interfaces.Navigator;

public class Owl extends Bird implements Flyer, Navigator {

	@Override
	public void speak() {
		System.out.println("speak like an owl");
	}

	@Override
	public void navigate() {
		System.out.println("navigate like an owl");
	}

	@Override
	public void fly() {
		System.out.println("fly like an owl");
	}

}
