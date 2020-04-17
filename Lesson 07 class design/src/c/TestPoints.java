package c;

public class TestPoints {

	public static void main(String[] args) {
		System.out.println("=========== Point");
		Point p1 = new Point();
		p1.print();

		p1.move(3);
		p1.print();

		p1.move(2, 4);
		p1.print();

		System.out.println("=========== Pixel");
		Pixel px1 = new Pixel();
		px1.print();
	}

}
