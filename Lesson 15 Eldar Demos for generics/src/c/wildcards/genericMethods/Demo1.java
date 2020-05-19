package c.wildcards.genericMethods;

import java.util.ArrayList;
import java.util.List;

import z.types.foods.Apple;
import z.types.foods.Food;
import z.types.foods.Fruit;

public class Demo1 {

	public static void main(String[] args) {
		List<Food> foods = new ArrayList<>();
		foods.add(new Food());
		foods.add(new Fruit());
		foods.add(new Apple());

		List<Fruit> fruits = new ArrayList<>();
		fruits.add(new Fruit());
		fruits.add(new Apple());

		List<Apple> apples = new ArrayList<>();
		apples.add(new Apple());

		copyFoodElements1(apples, apples);
		copyFoodElements1(apples, fruits);
		copyFoodElements1(apples, foods);

		copyFoodElements1(fruits, fruits);
		copyFoodElements1(fruits, foods);

		copyFoodElements1(foods, foods);
	}

	/**
	 * add to destination list of foods and down elements from source list with
	 * compatible elements (of the destination type and down)
	 */

	/**
	 * @param <T> the type Food and down
	 * @param src the source list
	 * @param dst the destination list
	 */
	public static <T extends Food> void copyFoodElements1(List<? extends T> src, List<T> dst) {
		for (int i = 0; i < src.size(); i++) {
			dst.add(src.get(i));
		}
	}

	/**
	 * add to destination list of foods and down, elements from source list with
	 * compatible elements (of the destination type and down)
	 * 
	 * @param <S> source list type - extents D
	 * @param <D> destination list type - extents Food
	 * @param src the source list
	 * @param dst the destination list
	 */
	public static <S extends D, D extends Food> void copyFoodElements2(List<S> src, List<D> dst) {
		for (int i = 0; i < src.size(); i++) {
			dst.add(src.get(i));
		}
	}

	/**
	 * add elements from source list of foods and down to a destination list that
	 * can take them (of the source type and up to Object)
	 * 
	 * @param <S> source list type - extends Food
	 * @param src the source list
	 * @param dst the destination list
	 */
	public static <S extends Food> void copyFoodElements3(List<S> src, List<? super S> dst) {
		for (int i = 0; i < src.size(); i++) {
			dst.add(src.get(i));
		}
	}

}
