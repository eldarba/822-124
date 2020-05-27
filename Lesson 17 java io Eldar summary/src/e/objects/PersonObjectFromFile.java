package e.objects;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import z.types.Person;

public class PersonObjectFromFile {

	public static void main(String[] args) {

		File objectFile = new File("files/person.obj");

		try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(objectFile)));) {

			Person person = (Person) in.readObject();

			System.out.println(person);
			System.out.println("was de-serialezed from file:");
			System.out.println(objectFile);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

}
