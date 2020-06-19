package z.types;

public class Person {
	
	public static int classVar = 5; // belongs to class
	public int instanceVar = 5; // belong to class instances
	
	// static blocks run on class load
	static {
		System.out.println("class Person loaded to memory");
	}
	
	// initializer runs on instance creation
	{
		System.out.println("a new Person instance created");
	}
	

}
