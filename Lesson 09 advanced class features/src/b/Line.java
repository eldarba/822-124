package b;

public class Line extends AbstractLine {

	private int length;

	public Line(int length) {
		super();
		this.length = length;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public void draw() {
		for (int i = 0; i < this.length; i++) {
			System.out.print(" * ");
		}
		System.out.println();

	}

}
