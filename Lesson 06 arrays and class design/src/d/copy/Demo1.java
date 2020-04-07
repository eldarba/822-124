package d.copy;

import java.util.Arrays;

public class Demo1 {

	public static void main(String[] args) {

		char[] arr1 = { 'a', 'b', 'c', 'd', 'e' };
		char[] arr2 = new char[arr1.length];

		System.out.println(Arrays.toString(arr2));

		// how to copy array elements to another array
		System.arraycopy(arr1, 0, arr2, 0, arr1.length);

		System.out.println(Arrays.toString(arr2));

	}

}
