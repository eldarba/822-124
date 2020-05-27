package a.byteStreams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1CopyFile {

	public static void main(String[] args) {
		try (

				BufferedInputStream in = new BufferedInputStream(new FileInputStream("files/butterfly1.jpg"));

				BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream("files/butterfly2.jpg"))

		) {

			int b = in.read();

			while (b != -1) {
				out.write(b);
				b = in.read();
			}

			System.out.println("copy finished");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
