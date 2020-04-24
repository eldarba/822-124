package b;

public class Test {

	public static void main(String[] args) {
		Line line1 = new Line(5);
		line1.draw();

		line1.setLength(10);
		System.out.println("===============================");
		line1.draw();

		System.out.println("===============================");

		WLine wl = new WLine(12, 3);
		wl.draw();
	}

}
