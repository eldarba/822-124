package e.object;

import a.Person;

public class Demo2 {

	public static void main(String[] args) {

		Person p1 = new Person(101, "Aaa", 33);
		Person p2 = new Person(101, "Aaa", 33);

		System.out.println(p1);

		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());
	}
}
