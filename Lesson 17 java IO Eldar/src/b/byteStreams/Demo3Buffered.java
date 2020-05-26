package b.byteStreams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3Buffered {

	public static void main(String[] args) {

		try (

				// use this stream to read from the source file
				BufferedInputStream in = new BufferedInputStream(new FileInputStream("files/butterfly1.jpg"));

				// use this stream to write to the destination file
				BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("files/butterfly2.jpg"));

		) {

			long ts1 = System.currentTimeMillis();
			int b = in.read(); // read the first byte from the source file
			while (b != -1) {
				out.write(b); // write the current byte to the destination file
				b = in.read(); // read the next byte from the source file
			}
			System.out.println(b); // this should print -1 (EOF)
			long ts2 = System.currentTimeMillis();
			System.out.println(ts2 - ts1 + " ms");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
