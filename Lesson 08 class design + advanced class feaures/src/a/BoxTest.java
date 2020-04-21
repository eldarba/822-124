package a;

public class BoxTest {

	public static void main(String[] args) {

		// create 2 Box instances
		Box box = new Box(10, 6, 9);
		Box box2 = new Box(10, 5, 10);

		// 1. use toString to get a string representation of the object
		System.out.println(box.toString());
		System.out.println(box2.toString());

		// 2. use equals to check for logical equality
		System.out.println(box.equals(box2));

		// 3. use hashCode to get a numeric representation of the object
		System.out.println(box.hashCode());
		System.out.println(box2.hashCode());
	}

}
