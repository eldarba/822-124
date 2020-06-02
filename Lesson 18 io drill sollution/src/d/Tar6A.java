package d;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import z.types.Person;

public class Tar6A {

	public static void main(String[] args) {

		Person p = new Person(101, "Dan", 32);

		File dir = new File("files/bin");

		if (!dir.exists()) {
			System.out.println("directory missing: " + dir);
			dir.mkdirs();
			System.out.println("directory created: " + dir);
		} else {
			System.out.println("directory already exist: " + dir);
		}

		File file = new File(dir, "person.obj");

		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));) {

			out.writeObject(p);
			System.out.println(p + " wrriten to file: " + file);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
