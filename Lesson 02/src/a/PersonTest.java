package a;

public class PersonTest {

	public static void main(String[] args) {
		// create 3 instances of Person
		Person p1 = new Person(101, "aaa", 10);
		Person p2 = new Person(102);
		Person p3 = new Person("bbb");
		// assign name for each object
//		p1.name = "aaa";
//		p2.name = "bbb";
//		p3.name = "ccc";
		// print
		System.out.println(p1.name);
		System.out.println(p2.name);
		System.out.println(p3.name);

	}

}
