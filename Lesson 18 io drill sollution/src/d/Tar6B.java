package d;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import z.types.Person;

public class Tar6B {

	public static void main(String[] args) {

		Person p;

		File dir = new File("files/bin");
		File file = new File(dir, "person.obj");

		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));) {

			p = (Person) in.readObject();
			System.out.println(p);

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
