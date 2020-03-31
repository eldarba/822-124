package app.shapes;

public class Circle {
	
	private double radius;
	
	
	/**
	 * Create a Circle with radius of 1
	 */
	public Circle() {
		this.radius = 1;
	}
	

	/**
	 * Create a Circle with the specified radius
	 * @param radius the radius of the created circle object
	 */
	public Circle(double radius) {
		this.radius = radius;
	}


	public double getRadius() {
		return radius;
	}


	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return 3.14 * radius*radius;
	}
	
	

}
