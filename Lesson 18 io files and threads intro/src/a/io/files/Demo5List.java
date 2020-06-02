package a.io.files;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Demo5List {

	public static void main(String[] args) throws IOException {
		File dir = new File("files/b");

		File[] files = dir.listFiles();
		System.out.println(Arrays.toString(files));
	}

}
