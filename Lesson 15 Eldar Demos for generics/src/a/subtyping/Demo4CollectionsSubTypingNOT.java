package a.subtyping;

import java.util.ArrayList;
import java.util.List;

import z.types.foods.Apple;
import z.types.foods.Food;
import z.types.foods.Fruit;

public class Demo4CollectionsSubTypingNOT {

	public static void main(String[] args) {

		// a reference of type List<Food> can ONLY point to an object of type List<Food>
		List<Food> foods = new ArrayList<Food>();

		// this will fail early on compile time
//		 List<Food> foods = new ArrayList<Apple>();

		// this is a type safe approach (unlike arrays)
		// tough on the programmer
		// no flexibility in references and methods

		List<Fruit> fruits = new ArrayList<>();
		fruits.add(new Fruit());
		fruits.add(new Apple());
		printFruitElements(fruits); // ok

		// the method printFoodElements(List<Fruit>) will not accept this list
		List<Apple> apples = new ArrayList<>();
		apples.add(new Apple());
		apples.add(new Apple());

//		printFruitElements(apples); // compile error

	}

	/**
	 * this method can take any List of foods and print it's elements.
	 */
	private static void printFruitElements(List<Fruit> fruits) {
		System.out.println(">>> printing fruit elements:");
		for (int i = 0; i < fruits.size(); i++) {
			System.out.println(fruits.get(i));
		}
		System.out.println("===============");
	}

}
