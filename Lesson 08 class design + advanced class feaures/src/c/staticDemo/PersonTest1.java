package c.staticDemo;

public class PersonTest1 {

	public static void main(String[] args) {

		System.out.println("number of person instances: " + Person.getCounter());

		Person p1 = new Person();
		Person p2 = new Person();

//		p1.id = 101;
//		p2.id = 102;

//		Person.counter = -200;

		System.out.println(p1.id);
		System.out.println(p2.id);

		System.out.println("number of person instances: " + Person.getCounter());
	}

}
