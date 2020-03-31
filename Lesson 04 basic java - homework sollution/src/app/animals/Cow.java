package app.animals;

public class Cow {
	
	private String name;
	private int age;
	
	public Cow(String name, int age) {
		this.name = name;
		this.age = age;
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

	public void setAge(int age) {
		this.age = age;
	}
	
	/**
	 * Print mooo
	 * */
	public void speak() {
		System.out.println("mooo");
	}
	

}
