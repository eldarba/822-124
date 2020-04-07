package d.copy;

import java.util.Arrays;

public class Demo2 {

	public static void main(String[] args) {

		char[] arr = { 'a', 'b', 'c', 'd', 'e' };
		System.out.println(Arrays.toString(arr));

		char[] arrTemp = new char[arr.length + 2];
		System.arraycopy(arr, 0, arrTemp, 0, arr.length);
		arr = arrTemp;

		System.out.println(Arrays.toString(arr));

		arr[5] = 'A';
		arr[6] = 'B';
		System.out.println(Arrays.toString(arr));

	}

}
