package a;

import java.util.Arrays;

public class Demo3StaticInitialization {

	public static void main(String[] args) {

		int[] arr1 = new int[15];

		int[] arr2 = { 2, 4, 6, 8, 10, -987 };

		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}

}
