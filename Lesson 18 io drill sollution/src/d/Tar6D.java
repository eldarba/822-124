package d;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import z.types.Person;

public class Tar6D {

	public static void main(String[] args) {

		List<Person> persons;
		File file = new File("files/bin/persons.lst");

		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));) {

			persons = (List<Person>) in.readObject();

			for (Person person : persons) {
				System.out.println(person);
			}

		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
