package c.nestedClasses;

public class Test {

	public static void main(String[] args) {

		// instances of static nested classes are not dependent on an object of the
		// enclosing type
		Outer.StaticNestedClass nested1 = new Outer.StaticNestedClass();
		Outer.StaticNestedClass nested2 = new Outer.StaticNestedClass();
		Outer.StaticNestedClass nested3 = new Outer.StaticNestedClass();

		// instances of inner classes are dependent on an object of the enclosing type
		Outer outer = new Outer();
		Outer.InnerClass inner = outer.new InnerClass();

	}

}
