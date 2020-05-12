package d.generics;

import b.targil.vehicles.FamilyCar;
import b.targil.vehicles.Vehicle;

public class Test {

	public static void main(String[] args) {

		Box<String> box = new Box<>();
		box.setContent("AAA");
		System.out.println(box.getContent());

		Box<Vehicle> box2 = new Box<>();
		box2.setContent(new FamilyCar(555));
		System.out.println(box2.getContent());

		Box.print("AAA");

	}

}
