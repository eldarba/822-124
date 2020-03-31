package g;

public class Test {
	
	public static void main(String[] args) {
		// create a box
		Box box = new Box(2, 4, 6);
		// create a box handler
		BoxHandler boxHandler = new BoxHandler();
		// print
		box.print();
		
		// use the box handler to change the box
		boxHandler.makeBoxHigher(box);
		// print
		box.print();
	}

}
