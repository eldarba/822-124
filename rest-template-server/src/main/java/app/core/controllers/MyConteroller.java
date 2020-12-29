package app.core.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.core.beans.Person;

@RestController
@RequestMapping("/api")
public class MyConteroller {

	private List<Person> persons = new ArrayList<Person>();
	private int nextId = 4;

	@PostMapping("/person")
	public Person addPerson(@RequestBody Person person) {
		person.setId(nextId++);
		persons.add(person);
		return person;
	}

	{
		persons.add(new Person(1, "aaa", 11));
		persons.add(new Person(2, "bbb", 22));
		persons.add(new Person(3, "ccc", 33));
	}

	@GetMapping("/person/{id}")
	public Person getPerson(@PathVariable int id) {
		for (Person person : persons) {
			if (person.getId() == id) {
				return person;
			}
		}
		return null;
	}

	@GetMapping("/greet")
	public String greet() {
		return "Hello from greet";
	}

	@GetMapping("/person")
	public Person getPerson() {
		return new Person(101, "Yosi", 25);
	}

}
