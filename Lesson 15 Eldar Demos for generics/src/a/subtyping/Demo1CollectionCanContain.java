package a.subtyping;

import java.util.ArrayList;
import java.util.List;

import z.types.foods.Apple;
import z.types.foods.Food;
import z.types.foods.Fruit;

public class Demo1CollectionCanContain {

	public static void main(String[] args) {

		// WHAT A COLLECTION OF TYPE CAN CONTAIN

		/*
		 * the following inheritance hierarchy is defined:
		 * 
		 * Food (is an object)
		 * 
		 * Fruit (is a food)
		 * 
		 * Apple (is a fruit)
		 * 
		 */

		// a List of Food
		List<Food> foods = new ArrayList<>();
		// can contain food
		foods.add(new Food());
		// fruits
		foods.add(new Fruit());
		// and apples
		foods.add(new Apple());
		System.out.println("List<Food>====\t" + foods);

		// a List of Fruit
		List<Fruit> fruits = new ArrayList<>();
		// can contain fruits
		fruits.add(new Fruit());
		// and apples
		fruits.add(new Apple());
		System.out.println("List<Fruit>===\t" + fruits);

		// a List of Apple
		List<Apple> apples = new ArrayList<>();
		// can contain apples only
		apples.add(new Apple());
		System.out.println("List<Apple>===\t" + apples);
	}
}
