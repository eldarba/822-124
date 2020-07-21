package a.builder.hardWork;

public class PersonBuilder {
	
	private int id;
	private String name;
	private int age;
	
	public PersonBuilder() {
		// TODO Auto-generated constructor stub
	}
	
	public PersonBuilder id(int id) {
		this.id = id;
		return this;
	}
	public PersonBuilder name(String name) {
		this.name = name;
		return this;
	}
	public PersonBuilder age(int age) {
		this.age = age;
		return this;
	}
	
	public Person build() {
		Person p = new Person();
		p.setId(id);
		p.setName(name);
		p.setAge(age);
		return p;
	}
}
