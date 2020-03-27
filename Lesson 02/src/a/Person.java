package a;

// the class is not an object
// from the class we can create objects
public class Person {
	
	// attributes (fields)
	int id;
	String name;
	int age;
	
	// constructor - specials methods for object creation
	Person(String name){
		this.name = name;
	}
	
	Person(int age){
		this.age = age;
	}
	
	Person(int id, String name, int age){
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public Person() {
	}

}
