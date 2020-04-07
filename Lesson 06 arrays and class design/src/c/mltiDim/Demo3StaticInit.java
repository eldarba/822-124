package c.mltiDim;

import java.util.Arrays;

public class Demo3StaticInit {

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3 }, { 0, 0, 0, 0, 0, 0 }, { 100, 200 }, { -1, -2, -3 } };

		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}

}
