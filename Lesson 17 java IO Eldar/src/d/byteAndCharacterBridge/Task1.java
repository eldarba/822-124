package d.byteAndCharacterBridge;

import java.io.IOException;
import java.io.InputStreamReader;

public class Task1 {

	public static void main(String[] args) {

		// Task:
		// Write a program that gets a line of text from the user and print it to
		// screen.
		// Do not use Scanner

		InputStreamReader in = new InputStreamReader(System.in);

		String ls = System.getProperty("line.separator");
//		System.out.println((int) ls.charAt(0));
//		System.out.println((int) ls.charAt(1));

		System.out.println("enter a line of text");

		try {
			int c = in.read();
			while (c != ls.charAt(0)) {
				System.out.print((char) c);
//				System.out.println(c);
				c = in.read();
			}
			System.out.println();
			System.out.println("bye");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
