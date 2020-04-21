package g.abstractDemo;

/*
 * abstract class:
 * 
 * 1. cannot be instantiated
 * 
 * 2. can contain abstract methods
 * 
 * 3. can be used as a reference type - for polymorphism
 * */
public abstract class Shape {

	// field
	private String color;

	// concrete method
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	/*
	 * abstract method:
	 * 
	 * 1. cannot be implemented - no block of code
	 * 
	 * 2. can be contained in abstract classes only (not in concrete classes)
	 */
	public abstract double getArea();

}
