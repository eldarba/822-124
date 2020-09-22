package core.calculator;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

// defining RO - Remote Object

@WebService
@SOAPBinding(style = Style.DOCUMENT)
public class Calculator {

	public int sum(int a, int b) {
		return a + b;
	}

	public Person getPerson(int id, String name, int age) {
		return new Person(id, name, age);
	}

	public String greet(Person person) {
		String str = "Hello " + person.getName();
		return str;
	}

}
