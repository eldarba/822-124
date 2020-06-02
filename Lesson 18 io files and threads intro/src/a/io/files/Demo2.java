package a.io.files;

import java.io.File;
import java.io.IOException;

public class Demo2 {

	public static void main(String[] args) throws IOException {

		// create abstract paths
		File dir = new File("files/b");
		File file = new File(dir, "myFile");

		// print
		System.out.println(dir);
		System.out.println(file);

		// create directory , including any necessary parent directories
		dir.mkdirs();

		// create file
		file.createNewFile();

		// tests whether the file or directory exists
		System.out.println(file.exists());
		System.out.println(dir.exists());

		// check if directory
		System.out.println(file.isDirectory());
		// check if file
		System.out.println(file.isFile());

		// check if file readable
		System.out.println(file.canRead());
		// check if file writable
		System.out.println(file.canWrite());

	}

}
