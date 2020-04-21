package f.constants;

public class Person {

	// constant is a class final variable
	public static final int MAX_AGE = 120;
	public static final int MIN_AGE = 0;
	// class variable
	private static int counter; // used for id initialization

	// object attributes
	// final variable
	public final int id = ++counter;
	private int age = 18;
	private String name;

	public Person(int age, String name) {
		super();
		setAge(age);
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age >= Person.MIN_AGE && age <= Person.MAX_AGE) {
			this.age = age;
		}
	}

	public static int getCounter() {
		return counter;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", age=" + age + ", name=" + name + "]";
	}

}
