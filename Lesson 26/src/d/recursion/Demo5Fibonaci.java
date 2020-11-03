package d.recursion;

public class Demo5Fibonaci {

	// 1, 1, 2, 3, 5, 8, 13

	public static void main(String[] args) {
		long ts1, ts2;
//		int n = 5;
//		int n = 10;
//		int n = 20;
//		int n = 30;
//		int n = 41;
		int n = 5;

		ts1 = System.currentTimeMillis();
		System.out.println(fibonaciNonRecursive(n));
		ts2 = System.currentTimeMillis();
		System.out.println("non recursive algorithm time: " + (ts2 - ts1) + " ms");

		ts1 = System.currentTimeMillis();
		System.out.println(fibonaciRecursive(n));
		ts2 = System.currentTimeMillis();
		System.out.println("recursive algorithm time: " + (ts2 - ts1) + " ms");
	}

	// Exponential Time O(2^n)
	public static int fibonaciRecursive(int n) {
		if (n == 1 || n == 0) {
			return n;
		} else {
			return fibonaciRecursive(n - 1) + fibonaciRecursive(n - 2);
		}
	}

	// Linear Time: O(n)
	public static int fibonaciNonRecursive(int n) {
		int f1 = 1, f2 = 1, temp;
		for (int i = 2; i < n; i++) {
			temp = f2;
			f2 = f1 + f2;
			f1 = temp;
		}
		return f2;
	}

}
