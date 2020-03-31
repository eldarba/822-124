package a;

public class Rectangle {

	// attributes
	private int length;
	private int width;

	// ctor 1
	public Rectangle() {

	}

	// ctor 2
	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	// getters and setters
	public int getLength() {
		return this.length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return this.width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	// other methods
	public void print() {
		System.out.print("Rectangle: length=");
		System.out.print(length);
		System.out.print(", width=");
		System.out.println(width);
	}

}
