package app.core.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.core.beans.Person;

@RestController
@RequestMapping("/api")
public class MyConteroller {

	@GetMapping("/greet")
	public String greet() {
		return "Hello from greet";
	}

	@GetMapping("/person")
	public Person getPerson() {
		return new Person(101, "Yosi", 25);
	}

}
