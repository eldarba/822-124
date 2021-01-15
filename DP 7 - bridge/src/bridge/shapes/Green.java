package bridge.shapes;

public class Green implements ColorImplementor {

	private String color = "Green";
	private int red = 0;
	private int green = 255;
	private int blue = 0;

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
