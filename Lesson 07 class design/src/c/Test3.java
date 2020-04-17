package c;

public class Test3 {

	public static void main(String[] args) {

		Point pt = new Point();

		pt.print();

		if (pt instanceof Pixel) {
			// danger of casting error
			Pixel px = (Pixel) pt; // explicit casting - downcast
			System.out.println(px.getColor());

			// no danger of casting error
			Point pt2 = px; // implicit casting - upcast
		}

	}

}
