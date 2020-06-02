package d;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import z.types.Person;

public class Tar6C {

	public static void main(String[] args) {

		List<Person> persons = new ArrayList<>();
		File file = new File("files/bin/persons.lst");

		try (

				Scanner sc = new Scanner(System.in);

				ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));

		) {

			while (true) {
				System.out.print("do you want to add a person? y/n: ");
				String input = sc.nextLine();
				if (input.equals("n")) {
					break;
				}

				System.out.print("enter id: ");
				int id = Integer.parseInt(sc.nextLine());
				System.out.print("enter name: ");
				String name = sc.nextLine();
				System.out.print("enter age: ");
				int age = Integer.parseInt(sc.nextLine());

				Person p = new Person(id, name, age);

				persons.add(p);

			}

			out.writeObject(persons);
			System.out.println("list of persons added to: " + file);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
