package bridge.shapes;

public class Main {

	public static void main(String[] args) {

		ShapeAbstraction redRect = new Rectangle(new Red());
		ShapeAbstraction greenRect = new Rectangle(new Green());

		ShapeAbstraction redTri = new Triangle(new Red());
		ShapeAbstraction blueTri = new Triangle(new Blue());

		ShapeAbstraction greenCir = new Circle(new Green());
		ShapeAbstraction redCir = new Circle(new Red());

		redRect.applyColor();
		greenRect.applyColor();

		redTri.applyColor();
		blueTri.applyColor();

		greenCir.applyColor();
		redCir.applyColor();

	}

}
