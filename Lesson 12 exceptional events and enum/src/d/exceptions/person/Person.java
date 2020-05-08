package d.exceptions.person;

public class Person {

	private int id;
	private String name;
	private int age;

	private static final int MAX_AGE = 120;

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	public void setAge(int age) throws PersonIllegalAgeException {
		if (age <= MAX_AGE) {
			this.age = age;
		} else {
			// throw an exception for an illegal age
			throw new PersonIllegalAgeException("the age " + age + " is above " + MAX_AGE);
		}
	}

	public static void main(String[] args) {
		Person p = new Person(101, "Aaa");
		try {
			p.setAge(155); // in case of exception we jump directly out of the try block
			System.out.println(p);
			p = null;
			p.setAge(44);
		} catch (PersonIllegalAgeException e) {
			System.out.println("Age Error");
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Some other Error");
			e.printStackTrace();
		}

		System.out.println("end of main method");
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
}
