package c;

public class Pixel extends Point {

	private String color;

	public Pixel(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}

	public Pixel(String color) {
		super();
		this.color = color;
	}

	public Pixel() {
		this("black");
	}

	// print method - override
	@Override
	public void print() {
		super.print();
		System.out.println("color: " + this.color);
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
