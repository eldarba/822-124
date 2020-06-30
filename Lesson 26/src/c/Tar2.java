package c;

/*
 * Tar 2
 * write a method that gets an int[] and an int and returns 
 * true if the array contains the int, otherwise return false
 * 
 * containsValue(int[], int): boolean
 * */
public class Tar2 {

	public static boolean containsValue(int[] arr, int x) {
		for (int curr : arr) {
			if (curr == x) {
				return true;
			}
		}

		return false;
	}

	// O(n) compexity

}
