package d;

import javax.swing.JFrame;

public class WindowDemo {
	
	public static void main(String[] args) {
		
		// create a window object
		JFrame fr = new JFrame("my window");
		
		// set the state of the object using methods
		fr.setLocation(400, 300);
		fr.setSize(500, 200);
		fr.setVisible(true);
		fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
