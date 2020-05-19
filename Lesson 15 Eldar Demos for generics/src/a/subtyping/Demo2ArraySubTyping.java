package a.subtyping;

import java.util.Arrays;

import z.types.foods.Apple;
import z.types.foods.Food;

public class Demo2ArraySubTyping {

	public static void main(String[] args) {

		// a reference of type Food[] can point to an object of type Apple[]
		Food[] foodsArr = new Apple[5];
		// this was based on the idea that an apple is a food
		// and it's OK so long as we add apples to the array:
		foodsArr[0] = new Apple();
		foodsArr[1] = new Apple();
		System.out.println(Arrays.toString(foodsArr));
		System.out.println();
		// but now, using this reference we can add food to the apples only array.
		// hmmmm???

		foodsArr[2] = new Food();

		// try and see what happens

	}
}
