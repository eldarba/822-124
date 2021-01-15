package bridge.shapes;

public class Red implements ColorImplementor {

	private String color = "Red";
	private int red = 255;
	private int green = 0;
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
