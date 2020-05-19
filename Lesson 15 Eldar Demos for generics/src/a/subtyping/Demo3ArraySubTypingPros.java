package a.subtyping;

import z.types.foods.Apple;
import z.types.foods.Food;
import z.types.foods.Fruit;

public class Demo3ArraySubTypingPros {

	public static void main(String[] args) {

		// this flexibility of array references is convenient when working with methods
		Food[] foods = { new Food(), new Fruit(), new Apple() };
		Fruit[] fruits = { new Fruit(), new Apple() };
		Apple[] apples = { new Apple(), new Apple() };

//		printFruitsElements(foods); // compile error
		printFruitsElements(fruits);
		printFruitsElements(apples);
	}

	/**
	 * this method can take any array of foods and print it's elements. Just beware
	 * not to add anything to those arrays because it can fail at runtime
	 */
	private static void printFruitsElements(Fruit[] arr) {
		System.out.println(">>> printing fruit elements:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("===============");

//		// danger
//		arr[0] = new Fruit();
	}

}
