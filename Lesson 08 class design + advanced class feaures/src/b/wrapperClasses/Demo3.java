package b.wrapperClasses;

public class Demo3 {

	public static void main(String[] args) {

		// inboxing = put an int in an Integer
		int a = 8;
		Integer x = a; // auto inboxing

		// outboxing = get an int out of an Integer
		int b = x.intValue(); // outboxing
		int c = x; // auto outboxing

		// do not use wrapper class objects for arithmetical calculations

	}

}
