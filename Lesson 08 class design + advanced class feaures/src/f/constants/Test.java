package f.constants;

public class Test {

	public static void main(String[] args) {
		System.out.println("max person age is " + Person.MAX_AGE);
		System.out.println("minimum person age is " + Person.MIN_AGE);
		System.out.println("people made " + Person.getCounter());

//		Person.MAX_AGE = 200; // error

		Person p1 = new Person(22, "Dan");
		Person p2 = new Person(33, "Ran");
		Person p3 = new Person(121, "Matan");

		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);

		System.out.println("people made " + Person.getCounter());
	}

}
