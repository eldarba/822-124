package app.shapes;

public class Rectangle {

	private double length;
	private double width;
	private String color;

	/**
	 * create a rectangle of the specified dimensions and color
	 * 
	 * @param length
	 * @param width
	 * @param color
	 */
	public Rectangle(double length, double width, String color) {
		this.length = length;
		this.width = width;
		this.color = color;
	}

	/**
	 * create a black rectangle of the specified dimensions
	 * 
	 * @param length
	 * @param width
	 */
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
		this.color = "black";
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getArea() {
		return length * width;
	}

}
