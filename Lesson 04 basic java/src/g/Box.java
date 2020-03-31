package g;

// copy lines: ctrl + alt + up/down
// move lines: alt + up/down
public class Box {

	private int length;
	private int width;
	private int height;

	public Box(int length, int width, int height) {
		super();
		this.length = length;
		this.width = width;
		this.height = height;
	}

	public void print() {

//		// local variables are not initialized automatically
//		int x;
//		x = 5;
//		System.out.println(x);

//		System.out.print("Box: length=");
//		System.out.print(this.length);
//		System.out.print(", width=");
//		System.out.print(this.width);
//		System.out.print(", height=");
//		System.out.println(this.height);

		System.out.println("Box: length=" + this.length + ", width=" + this.width + ", height=" + this.height);

		System.out.println(3 + 5 + 7 + 1 + 3);
	}

	public int getLength() {
		return length;
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

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}
