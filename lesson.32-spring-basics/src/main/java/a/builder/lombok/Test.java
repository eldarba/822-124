package a.builder.lombok;

public class Test {

	public static void main(String[] args) {
		
		Person p1 = Person.builder().id(101).build();
		Person p2 = Person.builder().id(102).name("Aaa").build();
		Person p3 = Person.builder().id(103).name("Bbb").age(33).build();
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		
	}
	
		

}
