package e.object;

import java.util.Date;

import a.Person;

public class Demo3 {

	public static void main(String[] args) {

		String str1 = new String("aaa");
		String str2 = new String("aaa");

		// is it the same string?

		// is it the same object in memory
		System.out.println(str1 == str2);

		// is it the same object logically
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(new Date()));

		System.out.println("==========");

		Person p1 = new Person(101, "aaa", 33);
		Person p2 = new Person(101, "aaa", 33);

		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		System.out.println(p1.hashCode());
		System.out.println(p2.hashCode());

	}

}
