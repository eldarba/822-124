package c;

public class Point {

	protected int x;
	protected int y;

	public Point() {
		this(5, 5);
	}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	// version 1
	public void move(int val) {
		this.x += val;
		this.y += val;
	}

	// version 2 - overload - same method identifier, different parameters
	public void move(int x, int y) {
		this.x += x;
		this.y += y;
	}

	// print method
	public void print() {
		System.out.println("(" + x + ", " + y + ")");
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point (" + x + ", " + y + ")";
	}

	/*
	 * override toString of your Person class then, try to print a person
	 */

}
