package app.lines;

/**
 * Lines Test
 * 
 * @author Eldae
 *
 */
public class Test {

	/**
	 * create a line. print its length. change the length and print again.
	 */
	public static void main(String[] args) {
		Line line1 = new Line(5);
		System.out.println("length: " + line1.getLength());
		line1.setLength(80);
		System.out.println("length: " + line1.getLength());

	}

}
