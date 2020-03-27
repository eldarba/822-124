package a;

public class PersonTask {

	public static void main(String[] args) {
		
		Person p = new Person(222, "Avi", 22);
		
		System.out.print("id: ");
		System.out.print(p.id);
		System.out.print(", name: ");
		System.out.print(p.name);
		System.out.print(", age: ");
		System.out.println(p.age);
		
		System.out.println("-End-");

	}

}
