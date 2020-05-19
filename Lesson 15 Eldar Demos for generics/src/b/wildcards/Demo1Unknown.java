package b.wildcards;

import java.util.ArrayList;
import java.util.List;

import z.types.foods.Apple;
import z.types.foods.Food;
import z.types.foods.Fruit;

public class Demo1Unknown {

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
		printElements(apples);

	}

	// this method will accept any parameterized list
	public static void printElements(List<?> list) {
		System.out.println(">>> printing elements");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("================");
		// what can we add using this reference
		list.add(null);
		// what is the return type of get() method
		Object e = list.get(0);
	}

}
