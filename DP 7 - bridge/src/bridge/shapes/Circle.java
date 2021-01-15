package bridge.shapes;

public class Circle extends ShapeAbstraction {

	public Circle(ColorImplementor colorImplementor) {
		super(colorImplementor);
	}

	@Override
	public void applyColor() {

		StringBuilder sb = new StringBuilder("Circle: ");
		sb.append(colorImplementor.getColor()).append("[");
		sb.append(colorImplementor.getRed()).append(", ");
		sb.append(colorImplementor.getGreen()).append(", ");
		sb.append(colorImplementor.getBlue()).append("]");
		System.out.println(sb.toString());
	}

}
