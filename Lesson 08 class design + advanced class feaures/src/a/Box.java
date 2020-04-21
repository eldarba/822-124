package a;

public class Box {

	private int length;
	private int width;
	private int heigth;

	public Box(int length, int width, int heigth) {
		super();
		this.length = length;
		this.width = width;
		this.heigth = heigth;
	}

	// OBJECT METHODS ===================================

	// toString
	@Override
	public String toString() {
		return "Box [length=" + length + ", width=" + width + ", heigth=" + heigth + "]";
	}

	// hashCode and equals (go together)

	@Override
	public int hashCode() {
		return this.length + this.width + this.heigth;
	}

	@Override
	public boolean equals(Object obj) {
		// check for equality between "this" and "obj" parameter

		// is it the same memory address
		if (this == obj) {
			return true;
		}

		// is "obj" of the same type (Box)
		if (!(obj instanceof Box)) {
			return false;
		}

		// if we are here "obj" is of type Box
		// convert the "obj" reference to Box
		Box other = (Box) obj;
		// check equality using logic
		return this.length == other.length && this.width == other.width && this.heigth == other.heigth;

	}
	//

	// ==================================================

	public int getLength() {
		return length;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("I am about to be GCed");
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeigth() {
		return heigth;
	}

	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}

}
