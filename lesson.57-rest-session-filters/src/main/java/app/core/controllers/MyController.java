package app.core.controllers;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import app.core.models.Person;
import app.core.sessions.Session;
import app.core.sessions.SessionContext;

@CrossOrigin(origins = "http://127.0.0.1:5500", allowedHeaders = { "content-type", "token" })
//@CrossOrigin(origins = "http://127.0.0.1:5500", allowedHeaders = { "content-type", "token" }, maxAge = 10)
//@CrossOrigin
@RestController
@RequestMapping("/api")
public class MyController {

	private Map<Integer, Person> personsMap = new HashMap<>();
	@Autowired
	private SessionContext sessionContext;

	@Autowired
	private ApplicationContext ctx;

	private void closeContext(long seconds) {
		try {
			Thread.sleep(TimeUnit.SECONDS.toMillis(seconds));
			((ConfigurableApplicationContext) ctx).close();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@PutMapping
	public ResponseEntity<String> kill(@RequestHeader String token, @RequestParam long seconds) {
		new Thread() {

			@Override
			public void run() {
				closeContext(seconds);
			}
		}.start();

		return ResponseEntity.status(HttpStatus.OK).body("the application will go down in " + seconds + " seconds");
	}

	@GetMapping("/greet2")
	public String greet2(@RequestHeader String token) {
		Session session = sessionContext.getSession(token);
		return "Hello " + session.getAttribute("userName");
	}

	@GetMapping("/greet")
	public String greet(@RequestHeader String token) {
		return "Hello User";
	}

	@PostMapping("/person")
	public ResponseEntity<String> addPerson(@RequestHeader String token, @RequestBody Person person) {
		personsMap.put(person.getId(), person);
		return ResponseEntity.ok("person added");
	}

	@GetMapping("/person/{id}")
	public ResponseEntity<Person> getPerson(@RequestHeader String token, @PathVariable int id) {
		try {
			Person person = personsMap.get(id);

			if (person != null) {
				return ResponseEntity.ok(person);
			} else {
//				return ResponseEntity.status(HttpStatus.NOT_FOUND).body("id " + id + " not found");
				throw new ResponseStatusException(HttpStatus.NOT_FOUND, "get person failed");
			}
		} catch (Exception e) {
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,
					": get person failed - " + e.getMessage(), e);
		}
	}

}
