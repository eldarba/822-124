package c;

/*
 * Tar 3
 * write a method that gets an int[] and return true if it contains duplicates
 * 
 * otherwise return false
 * 
 * containsDuplicates(int[]): boolean
 * */
public class Tar3 {

	public static boolean containsValue(int[] arr) {
		for (int outer = 0; outer < arr.length; outer++) {
			for (int inner = 0; inner < arr.length; inner++) {
				if (outer == inner) {
					continue;
				}
				if (arr[outer] == arr[inner]) {
					return true;
				}
			}
		}
		return false;
	}

	// O(n^2) compexity

}
