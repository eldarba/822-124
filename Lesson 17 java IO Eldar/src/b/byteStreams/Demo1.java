package b.byteStreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo1 {

	public static void main(String[] args) {

		try (FileInputStream in = new FileInputStream("files/butterfly1.jpg")) {

			int b = in.read(); // read the first byte
			while (b != -1) {
				System.out.println(b);
				b = in.read(); // read the next byte
			}
			System.out.println(b);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
