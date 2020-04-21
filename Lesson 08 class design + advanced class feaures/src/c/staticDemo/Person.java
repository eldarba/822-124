package c.staticDemo;

public class Person {

	int id; // instance variable

	private static int counter; // class variable

	// static initializer - runs on class load
	static {
		System.out.println(">>> from static initializer");
		if (Math.random() < 0.5) {
			counter = 0;
		} else {
			counter = 1;
		}
	}

	// initializer - runs before any CTOR
	{
		System.out.println(">>> from initializer");
		counter++;
		this.id = counter;
	}

//	// CTOR 1
//	public Person() {
//	}
//
//	// CTOR 2
//	public Person(int id) {
//		this.id = id;
//	}

	public static int getCounter() {
		return counter;
	}

}
