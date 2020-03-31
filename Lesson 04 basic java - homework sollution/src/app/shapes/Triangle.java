package app.shapes;

public class Triangle {

	private double base;
	private double height;

	/**
	 * create a triangle of the specified base and height
	 * 
	 * @param base
	 * @param height
	 */
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	/**
	 * create a triangle object that is a replication of the specified triangle
	 * 
	 * @param triangle the triangle to replicate
	 */
	public Triangle(Triangle triangle) {
		this.base = triangle.base;
		this.height = triangle.height;
	}

	public Triangle() {
		this.base = 1;
		this.height = 1;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getArea() {
		return base * height / 2;
	}

}
