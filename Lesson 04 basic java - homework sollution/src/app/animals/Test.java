package app.animals;

/**
 * animals test
 * 
 * @author Eldar
 *
 *
 */
public class Test {

	/**
	 * create a cow and a dog. print their details and make them speak.
	 */
	public static void main(String[] args) {
		Cow cowEdna = new Cow("Edna", 3);
		Dog dogSnoopy = new Dog("Snoopy", 5);
		
		System.out.println("cow: " + cowEdna.getName() + ", " + cowEdna.getAge() + " years old");
		cowEdna.speak();
		System.out.println("dog: " + dogSnoopy.getName() + ", " + dogSnoopy.getAge() + " years old");
		dogSnoopy.speak();

	}

}
