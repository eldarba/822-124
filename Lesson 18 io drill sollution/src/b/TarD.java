package b;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import z.types.Person;

public class TarD {

	public static void main(String[] args) {

		List<Person> persons = new ArrayList<>();

		persons.add(new Person(111, "aaa", 25));
		persons.add(new Person(222, "bbb", 44));
		persons.add(new Person(333, "ccc", 33));
		persons.add(new Person(444, "ddd", 66));

		File file = new File("files/text/persons.txt");
		try (PrintWriter out = new PrintWriter(file);) {
			for (Person person : persons) {
				out.println(person);
			}

			System.out.println("people written to " + file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
