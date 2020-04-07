package b;

public class Demo1ArrayOfObjects {

	public static void main(String[] args) {

		// create an array of points
		Point[] points = new Point[3];

		Point p1 = new Point(10, 10);
		Point p2 = new Point(30, 70);

		points[0] = p1;
		points[1] = p2;
		points[2] = new Point(0, 0);

		// create an array of boxes
		Box[] boxes = new Box[5];
		boxes[0] = new Box(10, 15, 7);
		boxes[1] = new Box(100, 43, 65);
		boxes[3] = new Box(33, 76, 7);
		boxes[4] = new Box(34, 98, 54);

	}

}
