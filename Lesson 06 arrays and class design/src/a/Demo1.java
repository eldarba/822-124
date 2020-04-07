package a;

public class Demo1 {

	public static void main(String[] args) {

		int x = 5;
		int y = 127;
		int z = -32;

		// an array is a collection of data of the same type;
		int[] arr = new int[5];
		System.out.println(arr.length);

		// to access an array element we use the array reference + index
		arr[2] = 7; // assign element value

		// print array elements:
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);

	}

}
