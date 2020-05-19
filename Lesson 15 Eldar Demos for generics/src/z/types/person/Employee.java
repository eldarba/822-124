package z.types.person;

public class Employee extends Person {

	public Employee(int id, String name, int age) {
		super(id, name, age);
	}

	public Employee() {
	}

	@Override
	public String toString() {
		return "Employee [getId()=" + getId() + ", getName()=" + getName() + ", getAge()=" + getAge() + "]";
	}

}
