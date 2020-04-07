package c.mltiDim;

import java.util.Arrays;

public class Demo2 {

	public static void main(String[] args) {

		// creating a matrix - 2D array with even array lengths
		int[][] matrix = new int[3][5];

		matrix[2][3] = 100;
		// populate
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (Math.random() * 10);
			}
			System.out.println(Arrays.toString(matrix[i]));
		}
		System.out.println("==========================");

		// creating a 2D array with different array lengths
		int[][] arr = new int[3][];
		arr[0] = new int[10];
		arr[1] = new int[3];
		arr[2] = new int[5];

		// populate
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int) (Math.random() * 10);
			}
			System.out.println(Arrays.toString(arr[i]));
		}
		System.out.println("==========================");

		// get access to elements using the array reference and the element index
		System.out.println(arr[0][0]);

	}

}
