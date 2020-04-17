package a;

public class Person {

	private final int id;
	protected String name;
	private int age;

	public Person(int id, String name, int age) {
		super(); // invoke another CTOR in SUPER class
		this.id = id;
		this.name = name;
		this.age = age;
	}

	public Person(int id) {
		this(id, "default name", 5); // invoke another CTOR in THIS class
	}

	public Person() {
		this(1); // invoke another CTOR in THIS class
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Person)) {
			return false;
		}
		Person other = (Person) obj;
		if (id != other.id) {
			return false;
		}
		return true;
	}

}
