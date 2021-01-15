package composite;

public class Person extends Component {

	private String name;

	public Person(String name) {
		super();
		this.name = name;
	}

	@Override
	public void introduceYourself() {
		System.out.println("Hi! I'm " + name);
	}

}
