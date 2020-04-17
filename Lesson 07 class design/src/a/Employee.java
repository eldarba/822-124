package a;

public class Employee extends Person {

	private double salary;

	public Employee(int id, String name, int age, double salary) {
		super(id, name, age); // invoke another CTOR in SUPER class
		this.salary = salary;
	}

	public Employee(int id, String name, int age) {
		this(id, name, age, 17_000_000); // invoke another CTOR in THIS class
	}

}
