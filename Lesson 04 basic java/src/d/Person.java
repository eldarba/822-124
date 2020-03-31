package d;

public class Person {
	
	private int id; // primitive (int)
	private String name; // Object (String)
	
	
	
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}



	public static void main(String[] args) {
		String name = "Dan";
		Person p = new Person(111, name);
		name = "David";
	}

}
