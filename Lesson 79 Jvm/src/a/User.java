package a;

public class User {

	public int id = 1;

	public void printUserType() {
		System.out.println("User");
	}

	public void instanceMethod(int val) {
		System.out.println("User.instanceMethod(" + val + ")");
	}

	public void staticMethod() {
		System.out.println("User.staticMethod()");
	}

}
