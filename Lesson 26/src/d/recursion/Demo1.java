package d.recursion;

public class Demo1 {

	public static void a() {
		a();
	}

	public static void printOneToVal(int val) {
		if (val <= 1) {
			System.out.println(val);
			return;
		} else {
			printOneToVal(val - 1);
			System.out.println(val);
			return;
		}
	}

	/** print the values from a to b [a is less than b] */
	public static void printAtoB(int a, int b) {
		if (a > b) { // if you want to make sure a is smaller
			int t = a;
			a = b;
			b = t;
		}

		if (a == b) {
			System.out.println(a);
//			return;
		} else {
			System.out.println(a);
			printAtoB(a + 1, b);
//			return;
		}
	}

	public static void main(String[] args) {
		// a(); // stack overflow
//		printOneToVal(5);
		printAtoB(5, 11);
	}
}
