package b.wildcards;

import java.util.ArrayList;
import java.util.List;

import z.types.foods.Apple;
import z.types.foods.Food;
import z.types.foods.Fruit;

public class Demo3Super {

	public static void main(String[] args) {
		List<Food> foods = new ArrayList<>();
		foods.add(new Food());
		foods.add(new Fruit());
		foods.add(new Apple());
		printElements(foods);

		List<Fruit> fruits = new ArrayList<>();
		fruits.add(new Fruit());
		fruits.add(new Apple());
		printElements(fruits);

		List<Apple> apples = new ArrayList<>();
		apples.add(new Apple());
//		printElements(apples); // compile error

	}

	// this method will accept any list of Fruit and up
	public static void printElements(List<? super Fruit> list) {
		System.out.println(">>> printing elements");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("================");
		// what can we add using this reference
		list.add(null);
		list.add(new Fruit());
		list.add(new Apple());
		// what is the return type of get() method
		Object e = list.get(0);
	}

	// use the super wild card when you want to ADD ELEMENTS of a certain type (and
	// down)

}
