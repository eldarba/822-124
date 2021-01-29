package a;

public class ClientCode {

	static {
		System.out.println("static init");
	}

	public static void main(String[] args) {
		User user = new User();
		user.instanceMethod(123);

	}

}
