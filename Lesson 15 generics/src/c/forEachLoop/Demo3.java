package c.forEachLoop;

public class Demo3 {

	public static void main(String[] args) {

		int[] arr = { 5, 8, 3 };
		System.out.println(arr);

		// for loop
		System.out.println("=============");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("=============");

//		// while loop
//		Iterator<Integer> it = arr.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
//		System.out.println("=============");

		// for-each loop
		for (int curr : arr) {
			System.out.println(curr);
		}
		System.out.println("=============");

	}
}
