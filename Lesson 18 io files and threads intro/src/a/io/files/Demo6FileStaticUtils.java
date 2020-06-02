package a.io.files;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Demo6FileStaticUtils {

	public static void main(String[] args) throws IOException {

		// roots
		File[] roots = File.listRoots();
		System.out.println(Arrays.toString(roots));

		// creating temp file
		File dir = new File("files/b");
		File file = File.createTempFile("log", ".txt", dir);
		file.deleteOnExit();

		System.out.println("press any key to terminate");
		System.in.read();
	}

}
