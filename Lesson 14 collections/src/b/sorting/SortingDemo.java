package b.sorting;

import java.util.ArrayList;
import java.util.List;

public class SortingDemo {

	public static void main(String[] args) {

		List<Integer> listOfIntegers = new ArrayList<>();
		listOfIntegers.add(5);
		listOfIntegers.add(45);
		listOfIntegers.add(100);
		listOfIntegers.add(17);
		listOfIntegers.add(2);

		System.out.println("insert order");
		System.out.println(listOfIntegers);

		listOfIntegers.sort(null);
		System.out.println("sorted by natural order");
		System.out.println(listOfIntegers);

		System.out.println("===========================");
		List<String> listOfString = new ArrayList<>();
		listOfString.add("hello");
		listOfString.add("aaa");
		listOfString.add("wow");
		listOfString.add("dog");
		listOfString.add("world");

		System.out.println("insert order");
		System.out.println(listOfString);

		listOfString.sort(null);
		System.out.println("sorted by natural order");
		System.out.println(listOfString);

		System.out.println("===========================");
		List<Person> persons = new ArrayList<>();
		persons.add(new Person(101, "ccc", 17));
		persons.add(new Person(107, "bbb", 3));
		persons.add(new Person(103, "fff", 25));
		persons.add(new Person(109, "zzz", 65));
		persons.add(new Person(102, "www", 12));

		System.out.println("insert order");
		System.out.println(persons);

		persons.sort(null);
		System.out.println("sorted by natural order");
		System.out.println(persons);

		persons.sort(new PersonAgeComparator());
		System.out.println("sorted by person age");
		System.out.println(persons);

		persons.sort(new PersonNameComparator());
		System.out.println("sorted by person name");
		System.out.println(persons);

	}

}
