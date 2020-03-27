package e.classDefinition;

public class Point {

	// attributes - initialized to default values (0, false, null)
	private int x;
	private int y;

	// CTORs
	public Point() {

	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point(int val) {
		this.x = val;
		this.y = val;
	}

	// methods - getters and setters
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	// methods - other methods

	public void print() {
		System.out.print("(");
		System.out.print(x);
		System.out.print(", ");
		System.out.print(y);
		System.out.println(")");
	}

	public void moveRight() {
		x++;
	}

	public void moveLeft() {
		x--;
	}

	public void moveUp() {
		y++;
	}

	public void moveDown() {
		y--;
	}

}
