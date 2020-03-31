package a;

public class Test {

	public static void main(String[] args) {
		
		// create an instance of the Rectangle class
		Rectangle r1 = new Rectangle();
		r1.print();
		r1.setLength(10);
		r1.setWidth(30);
		r1.print();
		
		Rectangle r2 = new Rectangle(500, 300);
		r2.print();
		r2.setLength(1520);
		r2.print();

	}

}
