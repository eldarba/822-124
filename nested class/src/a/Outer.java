package a;

public class Outer {

	// instances of inner depends and have reference to instances of Outer
	class Inner {

	}

	// instances of static nested not depends and have reference to instances of
	// Outer
	static class Nested {

	}

}
