package a.animals.tests;

import a.animals.Animal;
import a.animals.Bat;
import a.animals.Bee;
import a.animals.Cat;
import a.animals.Kiwi;
import a.animals.Owl;
import b.interfaces.Flyer;

public class Test2 {

	public static void main(String[] args) {

		Animal[] animals = new Animal[10];

		animals[0] = new Cat();
		animals[1] = new Bat();
		animals[2] = new Kiwi();
		animals[3] = new Owl();
//		animals[4] = new Ant();
		animals[5] = new Bee();
		animals[6] = new Cat();
		animals[7] = new Cat();
		animals[8] = new Kiwi();
		animals[9] = new Cat();

		for (int i = 0; i < animals.length; i++) {
			Animal currAnimal = animals[i];
			if (currAnimal != null) {
				currAnimal.speak();
				if (currAnimal instanceof Flyer) {
					// if we are here the current animal can fly
					Flyer flyer = (Flyer) currAnimal;
					flyer.fly();
				}
			} else {
				System.out.println(animals[i]);
			}
			System.out.println("==================");
		}

	}

}
