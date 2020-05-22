package emps.core;

public class Employee {

	private String first;
	private String last;
	private double salary;
	private String department;

	public Employee() {
		super();
	}

	public Employee(double salary, String department) {
		super();
		this.salary = salary;
		this.department = department;
	}

	public Employee(String first, String last, double salary, String department) {
		super();
		this.first = first;
		this.last = last;
		this.salary = salary;
		this.department = department;
	}

	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "Employee [first=" + first + ", last=" + last + "]";
	}

}
