package c;

public class Test2 {

	public static void main(String[] args) {

		// references
		Point pt;
		Pixel px;
		Object obj; // the uppermost reference type

		// objects
		new Point();
		new Pixel();

		// polymorphism
		pt = new Point();
		pt = new Pixel();
//		pt = new Date(); // must have an IS A relation

		px = new Pixel();

	}

}
