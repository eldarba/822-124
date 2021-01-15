package bridge.shapes;

public abstract class ShapeAbstraction {

	protected ColorImplementor colorImplementor;

	public ShapeAbstraction(ColorImplementor colorImplementor) {
		super();
		this.colorImplementor = colorImplementor;
	}

	public abstract void applyColor();

}
