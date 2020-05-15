package c;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import b.sorting.Person;

public class IteratorDemo {

	public static void main(String[] args) {

		Set<Person> set = new HashSet<>();

		set.add(new Person(101, "Dan", 25));
		set.add(new Person(102, "Dfna", 28));
		set.add(new Person(103, "Moshe", 30));

		System.out.println(set);

		// iterator is an object to get access to any collection element
		Iterator<Person> iterator = set.iterator();

		Person p1 = iterator.next();
		Person p2 = iterator.next();
		Person p3 = iterator.next();

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
