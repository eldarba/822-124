package app.core.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.core.models.Person;

@RestController
@RequestMapping("/api")
public class MyController {

	private Map<Integer, Person> personsMap = new HashMap<>();

	@GetMapping("/greet")
	public String greet() {
		return "Hello User";
	}

	@PostMapping("/person")
	public ResponseEntity<String> addPerson(@RequestBody Person person) {
		personsMap.put(person.getId(), person);
		return ResponseEntity.ok("person added");
	}

	@GetMapping("/person/{id}")
	public ResponseEntity<?> getPerson(@PathVariable int id) {

		Person p = personsMap.get(id);

		if (p != null) {
			return ResponseEntity.ok(p);
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("id " + id + " not found");
		}

	}

}
