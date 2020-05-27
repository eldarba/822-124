package z.types;

import java.io.Serializable;
import java.util.Date;

public class Person implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private String name;
	private transient Date birthdate; // transient fields are not serialized

	public Person(int id, String name, Date birthdate) {
		super();
		this.id = id;
		this.name = name;
		this.birthdate = birthdate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", birthdate=" + birthdate + "]";
	}

}
