package bridge.shapes;

public class Blue implements ColorImplementor {

	private String color = "Blue";
	private int red = 0;
	private int green = 0;
	private int blue = 255;

	@Override
	public String getColor() {
		return this.color;
	}

	@Override
	public int getRed() {
		return this.red;
	}

	@Override
	public int getGreen() {
		return this.green;
	}

	@Override
	public int getBlue() {
		return this.blue;
	}
}
