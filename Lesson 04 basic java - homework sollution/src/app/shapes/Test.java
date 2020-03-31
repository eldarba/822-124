package app.shapes;

/**
 * Shapes Test
 * @author Eldar
 *
 */
public class Test {

	/**
	 * create all shapes and print their details including area
	 */
	public static void main(String[] args) {
		
		System.out.println("===================");
		Rectangle rectangle = new Rectangle(12, 5, "green");
		Rectangle blackRectangle = new Rectangle(3, 5);
		
		System.out.println(rectangle.getArea());
		System.out.println(blackRectangle.getArea());
		
		System.out.println("===================");
		Circle circle = new Circle(3);
		System.out.println(circle.getArea());
		
		System.out.println("===================");
		Triangle triangle = new Triangle(5, 6);
		System.out.println(triangle.getArea());
		

	}

}
