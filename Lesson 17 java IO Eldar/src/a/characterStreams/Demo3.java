package a.characterStreams;

import java.io.FileReader;
import java.io.IOException;

public class Demo3 {

	public static void main(String[] args) {

		try (FileReader in = new FileReader("files/textFile1.txt")) {

			int c = in.read(); // read first character

			while (c != -1) {
				System.out.print((char) c);
//				System.out.print(c + ", ");
				c = in.read();
			}
			System.out.println();
			System.out.println(c);

			// from this poin on (EOF) we can -1 on each read
			System.out.println(in.read());
			System.out.println(in.read());
			System.out.println(in.read());
			System.out.println(in.read());
			System.out.println(in.read());

		} catch (IOException e1) {
			e1.printStackTrace();
		}

	}

}
