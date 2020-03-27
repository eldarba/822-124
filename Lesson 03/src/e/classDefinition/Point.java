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
	
	// add a set method for y
	
	// methods - other methods

}
