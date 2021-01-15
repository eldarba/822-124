package bridge.shapes;

public class Rectangle extends ShapeAbstraction {

	public Rectangle(ColorImplementor colorImplementor) {
		super(colorImplementor);
	}

	@Override
	public void applyColor() {
		System.out.println("Rectangle: " + this.colorImplementor.getColor());
	}

}
