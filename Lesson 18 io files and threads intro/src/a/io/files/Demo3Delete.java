package a.io.files;

import java.io.File;

public class Demo3Delete {

	public static void main(String[] args) {
		File dir = new File("files/b");
		File file = new File(dir, "myFile");

		if (file.delete()) {
			System.out.println("file: " + file + " deleted");
		} else {
			System.out.println("file: " + file + " NOT deleted");
		}
	}

}
