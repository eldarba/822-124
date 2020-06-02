package z.types;

import java.io.Serializable;

public class Person implements Serializable {

	private int id;
	private String name;
	private int age;

	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

}
