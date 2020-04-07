package a;

import java.util.Arrays;

public class Demo2 {

	public static void main(String[] args) {
		// 1. create an array
		int[] arr = new int[10];

		// 2. populate the array
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 11);
		}

		// 3. iterate the array and print all elements
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println();

		// 4. convert the array to a String and print it
		System.out.println(Arrays.toString(arr));

		// 5. let's sum all array elements
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("sum: " + sum);

	}

}
