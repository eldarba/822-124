package c.flowcontrol.ifConstruct;
/*
 * line 1
 * line 2
 * line 3
 * */

/**
 * This class represents a person object
 */
public class Person {

	private int id;
	private String name;
	private int age;

	public static void main(String[] args) {
		Person p = new Person(111, "AAA", 50);
		System.out.println("age: " + p.getAge());
		p.setAge(51);
		System.out.println("age: " + p.getAge());
	}

	/**
	 * creates a person with the specified id, name and age
	 * 
	 * @param id   identification of the person
	 * @param name the person's name
	 * @param age  the person's age
	 */
	public Person(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
//		this.age = age;
		setAge(age);
	}

	/**
	 * sets the age of this person to the specified age value if the age is in the
	 * range 1 to 120
	 * 
	 * @param age the new age to be assigned
	 */
	public void setAge(int age) {
		if (age >= 0 && age <= 120) {
			this.age = age;
		}
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

	public int getAge() {
		return age;
	}

}
