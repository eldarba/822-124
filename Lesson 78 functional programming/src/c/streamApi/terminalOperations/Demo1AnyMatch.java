package c.streamApi.terminalOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Demo1AnyMatch {

	public static void main(String[] args) {

		{
			List<String> list = new ArrayList<String>();
			list.add("aaa bbb ccc");
			list.add("rrr kkk ccc");
			list.add("fff bbb ddd");
			list.add("aff bbb ddd");

			Stream<String> stream = list.stream();

			boolean anyMatch = stream.anyMatch(e -> e.startsWith("rrk"));
			System.out.println(anyMatch);
		}

		/*
		 * create a list of 5 person instances. print if any of them is younger than 18
		 */

		{
			List<Person> list = new ArrayList<Person>();
			list.add(new Person(1, "aaa", 16));
			list.add(new Person(2, "bbb", 55));
			list.add(new Person(3, "ccc", 17));
			list.add(new Person(4, "ddd", 5));
			list.add(new Person(5, "eee", 70));

			// anyMatch is terminal operation
			boolean isThereanyMinor = list.stream().anyMatch(person -> person.getAge() < 18);

			System.out.println("are there any minors: " + isThereanyMinor);

		}
		/*
		 * create a list of 5 person instances. print if any of them is younger than 18
		 * two years from now
		 */

		{
			List<Person> list = new ArrayList<Person>();
			list.add(new Person(1, "aaa", 16));
			list.add(new Person(2, "bbb", 55));
			list.add(new Person(3, "ccc", 17));
			list.add(new Person(4, "ddd", 17));
			list.add(new Person(5, "eee", 70));

			// anyMatch is terminal operation
			int x = 2;
			boolean isThereanyMinorIn2Years = list.stream().map(p -> new Person(p.getId(), p.getName(), p.getAge() + x))
					.anyMatch(person -> person.getAge() < 18);

			System.out.println("are there any minors in 2 years: " + isThereanyMinorIn2Years);

		}

	}

}

class Person {

	private int id;
	private String name;
	private int age;

	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}