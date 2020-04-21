package b.wrapperClasses;

import javax.swing.JOptionPane;

public class Demo2 {

	public static void main(String[] args) {

		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println("=============");

		String ageAsString = JOptionPane.showInputDialog("Enter your age");
		System.out.println(ageAsString);

		int ageAsInt = Integer.parseInt(ageAsString);

		System.out.println(ageAsInt);
		ageAsInt += 10;
		System.out.println(ageAsInt);
	}

}
