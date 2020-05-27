package d.data;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo2DataFromFile {

	public static void main(String[] args) {

		File dataFile = new File("files/primitives.data");

		try (DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream(dataFile)));) {
			int a = in.readInt();
			double b = in.readDouble();
			boolean c = in.readBoolean();
			String str = in.readUTF();
			long d = in.readLong();

			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(str);
			System.out.println(d);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
