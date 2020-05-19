package b.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {

		// arrays
		Integer[] arr = { 6, 1, 8, 4, 9, 3, 5 };
		// convert array to a list using the Arrays utility class
		List<Integer> list = Arrays.asList(arr);
		System.out.println(list);

		// sorting the collection using the utility class Collections
		Collections.sort(list);
		System.out.println(list);
	}
}
