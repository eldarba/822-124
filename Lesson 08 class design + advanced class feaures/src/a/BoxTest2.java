package a;

public class BoxTest2 {

	public static void main(String[] args) {

		Box box = new Box(10, 6, 9);
		// ...

		box = null;
		// ... if GC runs the unreferenced box is GCed

		System.gc();

		System.out.println("== end ==");

	}

}
