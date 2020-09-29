package demos;

public class Person {

	void speak() {
		System.out.println("bla");
	}

	public static void main(String[] args) {

		Person p1 = new Person();

		Person p2 = new Person() {
			@Override
			void speak() {
				System.out.println("bla bla");
			}
		};

		p1.speak();
		p2.speak();
	}

}
