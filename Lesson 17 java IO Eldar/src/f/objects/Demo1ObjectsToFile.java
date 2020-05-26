package f.objects;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import z.types.Person;

public class Demo1ObjectsToFile {

	public static void main(String[] args) {

		File file = new File("files/file1.obj");

		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));) {

			// create data (primitives)
			Date date = new Date();
			Calendar cal = new GregorianCalendar();

			out.writeObject(date);
			out.writeObject(cal);

			Person p = new Person(101, "Avi", new GregorianCalendar(1980, 5, 25).getTime());
			out.writeObject(p);
			System.out.println(p);

			System.out.println("objects written to " + file);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

}
