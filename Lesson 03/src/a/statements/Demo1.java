package a.statements;

public class Demo1 {

	public static void main(String[] args) {

		// STATEMENTS:

		// variable declaration
		int x;
		int numberOfStudents = 25; // Camel case

		// assignment - assign a value to a variable.
		x = 5;

		// variable declaration + assignment
		int y = 10;

		// method invocation
		System.out.println("Hello");

		// block 1
		{
			int a = 10;
//			int a = 20; // error - duplication
			System.out.println(x);
		}
		

		// block 2
		{
			int a = 20;
		}

		// block 3
		{
		}
		
		//class - starts with capital letter
		// variable or method - starts with lower case letter
		// naming conventions
		System.out.println("Hello");
	}

}
