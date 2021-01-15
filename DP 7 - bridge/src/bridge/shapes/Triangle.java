package bridge.shapes;

public class Triangle extends ShapeAbstraction {

	public Triangle(ColorImplementor colorImplementor) {
		super(colorImplementor);
	}

	@Override
	public void applyColor() {
		System.out.println("Triangle: " + this.colorImplementor.getRed() + ", " + colorImplementor.getGreen() + ", "
				+ colorImplementor.getBlue());
	}

}
