package a.io.files;

import java.io.File;
import java.io.IOException;

public class Demo4Rename {

	public static void main(String[] args) throws IOException {
		File dir = new File("files/b");
		File file = new File(dir, "myFile");

		dir.mkdirs();
		file.createNewFile();

		boolean b = file.renameTo(new File("files/b/myRenamedFile"));
		System.out.println(b);

	}

}
