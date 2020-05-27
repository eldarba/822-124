package d.data;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1DataToFile {

	public static void main(String[] args) {

		int a = 45;
		double b = 25.12;
		boolean c = 10 < 100;
		String str = "Hello data to file";
		long d = 400;

		File dataFile = new File("files/primitives.data");

		try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(dataFile)));) {
			out.writeInt(a);
			out.writeDouble(b);
			out.writeBoolean(c);
			out.writeUTF(str);
			out.writeLong(d);

			System.out.println("data written to file: " + dataFile);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
