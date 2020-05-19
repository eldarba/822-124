package d.varargs;

import java.util.Arrays;
import java.util.List;

public class Demo1 {

	public static void main(String... args) {

		// you can send integers
		int sum = sum(3, 5, 7, 1, 7);
		// you can send array as argument
		int[] arr = { 2, 2, 2 };
		sum = sum(arr);

		// use varags to create list statically
		List<Integer> list1 = Arrays.asList(2, 4, 6);
		List<String> list2 = Arrays.asList("aaa", "bbb", "ccc");

	}

	static int sum(int a, int b) {
		return a + b;
	}

	static int sum(int... arr) {
		int sum = 0;
		for (int curr : arr) {
			sum += curr;
		}
		return sum;
	}

	static int sum(String name, int... arr) {
		int sum = 0;
		for (int curr : arr) {
			sum += curr;
		}
		return sum;
	}

}
