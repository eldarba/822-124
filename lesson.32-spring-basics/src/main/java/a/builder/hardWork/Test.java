package a.builder.hardWork;

public class Test {
	
	public static void main(String[] args) {
		PersonBuilder builder = new PersonBuilder();
		Person p = builder.age(25).build();
		System.out.println(p);
	}

}
