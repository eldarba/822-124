package b.wildcards;

import java.util.ArrayList;
import java.util.List;

import z.types.foods.Apple;
import z.types.foods.Food;
import z.types.foods.Fruit;

public class Demo2Extends {

	public static void main(String[] args) {
		List<Food> foods = new ArrayList<>();
		foods.add(new Food());
		foods.add(new Fruit());
		foods.add(new Apple());
//		printElements(foods); // compile error

		List<Fruit> fruits = new ArrayList<>();
		fruits.add(new Fruit());
		fruits.add(new Apple());
		printElements(fruits);

		List<Apple> apples = new ArrayList<>();
		apples.add(new Apple());
		printElements(apples);
	}

	// this method will accept any list of Fruit and down
	public static void printElements(List<? extends Fruit> fruits) {
		System.out.println(">>> printing fruits");
		for (int i = 0; i < fruits.size(); i++) {
			System.out.println(fruits.get(i));
		}
		System.out.println("================");
		// what can we add using this reference
		fruits.add(null);
		// what is the return type of get() method
		Fruit e = fruits.get(0);
	}
	// use the extends wild card when you want to SEND THE METHOD a collection of a
	// certain type (and down)

}
