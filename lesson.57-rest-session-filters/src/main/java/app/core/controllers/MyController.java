package app.core.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import app.core.models.Person;
import app.core.sessions.Session;
import app.core.sessions.SessionContext;

@RestController
@RequestMapping("/api")
public class MyController {

	private Map<Integer, Person> personsMap = new HashMap<>();
	@Autowired
	SessionContext sessionContext;

	@PostMapping("/login/{userName}")
	public String login(@PathVariable String userName) {
		Session session = sessionContext.createSession();
		session.setAttribute("userName", userName);
		return session.token;
	}

	@GetMapping("/greet2")
	public String greet2(@RequestHeader String token) {
		Session session = sessionContext.getSession(token);
		if (session != null) {
			return "Hello " + session.getAttribute("userName");
		}
		return "Hello unlogged User";
	}

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
		try {
			if (Math.random() < 0.5) {
				throw new RuntimeException("get person error - test");
			} else {
				Person person = personsMap.get(id);

				if (person != null) {
					return ResponseEntity.ok(person);
				} else {
					return ResponseEntity.status(HttpStatus.NOT_FOUND).body("id " + id + " not found");
				}
			}
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, "get person failed - " + e.getMessage(),
					e);
		}

	}

}
