package a.characterStreams;

import java.io.FileReader;
import java.io.IOException;

public class Demo2 {

	public static void main(String[] args) {

		try (FileReader in = new FileReader("files/textFile1.txt")) {

			int c = in.read(); // read first character
			System.out.println(c);
			System.out.println((char) c);

			c = in.read(); // read 2nd character
			System.out.println(c);
			System.out.println((char) c);

			c = in.read(); // read 3rd character
			System.out.println(c);
			System.out.println((char) c);

		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}

}
