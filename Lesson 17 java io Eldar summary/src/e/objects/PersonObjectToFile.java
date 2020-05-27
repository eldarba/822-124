package e.objects;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.GregorianCalendar;

import z.types.Person;

public class PersonObjectToFile {

	public static void main(String[] args) {

		Person person = new Person(101, "Yosi Levi", new GregorianCalendar(1982, Calendar.JULY, 25).getTime());

		File objectFile = new File("files/person.obj");

		try (ObjectOutputStream out = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream(objectFile)));) {

			out.writeObject(person);

			System.out.println(person);
			System.out.println("was serialezed to file:");
			System.out.println(objectFile);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
