package e.data;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo2DataFromFile {

	public static void main(String[] args) {

		File file = new File("files/file1.data");

		try (DataInputStream in = new DataInputStream(new FileInputStream(file));) {

			// read data (primitives)
			int a = in.readInt();
			double b = in.readDouble();
			byte c = in.readByte();
			long ts = in.readLong();

			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(ts);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
