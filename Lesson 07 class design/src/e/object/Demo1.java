package e.object;

import a.Person;
import c.Point;

public class Demo1 {

	public static void main(String[] args) {

		Object obj = new Object();
		Object obj2 = new Object();

		System.out.println(obj.toString());
		System.out.println(obj2.toString());

		System.out.println(obj);
		System.out.println(obj2);

		System.out.println("==========");

		Point p = new Point(5, 9);
		Point p2 = new Point(25, 98);
		System.out.println(p);
		System.out.println(p2);

		System.out.println("==========");
		Person person = new Person(103, "Danna", 26);
		System.out.println(person);

	}

}
