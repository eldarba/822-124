package e.data;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1DataToFile {

	public static void main(String[] args) {

		File file = new File("files/file1.data");

		try (DataOutputStream out = new DataOutputStream(new FileOutputStream(file));) {

			// create data (primitives)
			int a = 345; // 32 bit
			double b = 4.45; // 64 bit
			byte c = 25; // 8 bit
			long ts = System.currentTimeMillis(); // 64 bit

			out.writeInt(a);
			out.writeDouble(b);
			out.writeByte(c);
			out.writeLong(ts);

			System.out.println("data written to " + file);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
