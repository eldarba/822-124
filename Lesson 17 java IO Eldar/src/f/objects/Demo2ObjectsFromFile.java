package f.objects;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Calendar;
import java.util.Date;

import z.types.Person;

public class Demo2ObjectsFromFile {

	public static void main(String[] args) {

		// writing an object to stream is called serialization

		File file = new File("files/file1.obj");

		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));) {

			Date date = (Date) in.readObject();
			Calendar cal = (Calendar) in.readObject();
			Person p = (Person) in.readObject();

			System.out.println(date);
			System.out.println(cal);
			System.out.println(p);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
