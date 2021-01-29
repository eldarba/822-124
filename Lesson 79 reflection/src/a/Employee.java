package a;

import java.io.Serializable;

public class Employee implements Serializable, Comparable<Employee> {

	private int id;
	private String name;

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Employee() {
	}

	public boolean performTask(String description) {
		System.out.println("performTask: " + description);
		return true;
	}

	public boolean performTask(String description, int times) {
		for (int i = 0; i < times; i++) {
			performTask(name + " is doing: " + description);
		}
		return false;
	}

	@Override
	public int compareTo(Employee o) {

		return this.id - o.id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

}
