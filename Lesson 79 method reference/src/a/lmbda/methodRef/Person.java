package a.lmbda.methodRef;

import java.time.LocalDate;
import java.util.Objects;

public class Person {

	private int id;
	private String name;
	private LocalDate birthdate;

	public Person() {
	}

	public Person(int id, String name, LocalDate birthdate) {
		super();
		this.id = id;
		this.name = name;
		this.birthdate = birthdate;
	}

	/**
	 * compare 2 people by age. return -1 if p1 is smaller, 1 if p1 is bigger and 0
	 * if same
	 * 
	 * @param p1
	 * @param p2
	 * @return
	 */
	public static int compareByAge(Person p1, Person p2) {
		return p1.birthdate.compareTo(p2.birthdate);
	}

	public int compareById(Person other) {
		return this.id < other.id ? -1 : this.id > other.id ? 1 : 0;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public LocalDate getBirthdate() {
		return birthdate;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBirthdate(LocalDate birthdate) {
		this.birthdate = birthdate;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", birthdate=" + birthdate + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
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
		return id == other.id;
	}

}
