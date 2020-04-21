package g.abstractDemo;

public class ShapeTest {

	public static void main(String[] args) {

		Shape s = null;

//		s = new Shape();

		s = new Rectangle(5, 3);
		System.out.println("rectangle area: " + s.getArea());

		s = new Circle(3);
		System.out.println("Circle area: " + s.getArea());

	}

}
