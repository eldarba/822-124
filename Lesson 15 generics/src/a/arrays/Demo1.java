package a.arrays;

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {

		int[] arr = { 6, 1, 8, 4, 9, 3, 5 };
		System.out.println(Arrays.toString(arr));

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));

		// Arrays.sort(arr, comparator) method can also take a comparator

	}

}
