package a.lmbda.methodRef;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Client {

	public static void main(String[] args) {

		List<Person> list = new ArrayList<>();
		list.add(new Person(1, "ccc", LocalDate.of(1980, 3, 12)));
		list.add(new Person(2, "aaa", LocalDate.of(2010, 3, 12)));
		list.add(new Person(3, "bbb", LocalDate.of(1940, 3, 12)));
		list.add(new Person(4, "ddd", LocalDate.of(2000, 3, 12)));

		// option 1: method reference - to a static method
		print(list);
//		list.sort((p1, p2) -> Person.compareByAge(p1, p2)); // identical to the expression below
		list.sort(Person::compareByAge); // lambda expression - reference to a static method
		print(list);

		// option 2: method reference - to a dynamic method of particular object
		ComparisonProivder cp = new ComparisonProivder();
		list.sort(cp::compareByName); // reference to a dynamic method of particular object
		print(list);

		System.out.println("********************");
//		list.forEach(e -> System.out.println(e));
		list.forEach(System.out::println);
		System.out.println("********************");

		// option 3: method reference - to a dynamic method of an arbitrary object of
		// particular type
		list.sort(Person::compareById);
		print(list);

		/*
		 * using method reference lambda expressions we actually create concrete
		 * instances of functional interfaces:
		 */
		Comparator<Person> ageComp = Person::compareByAge; // option 1
		Comparator<Person> idComp = Person::compareById; // option 3

		// option 4 - reference to a constructor
		PersonProvider personProvider = Person::new; // ctor reference
		Person providedPerson = personProvider.getPerson();
		System.out.println(providedPerson);

	}

	public static void print(Collection<?> col) {
		System.out.println("==========");
		for (Object e : col) {
			System.out.println(e);
		}
		System.out.println("==========");
	}

}
