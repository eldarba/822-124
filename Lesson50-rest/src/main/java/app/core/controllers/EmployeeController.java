package app.core.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import app.core.entities.Employee;
import app.core.exceptions.EmployeeNotFoundException;
import app.core.repositories.EmployeeRepository;

@CrossOrigin
@RestController
@RequestMapping("/lesson50/api")
public class EmployeeController {

	private EmployeeRepository repo;

	public EmployeeController(EmployeeRepository er) {
		super();
		this.repo = er;
	}

//	@RequestMapping(path = "/employees", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//	public List<Employee> getAllEmployees() {
//		return repo.findAll();
//	}

	private static final String json = MediaType.APPLICATION_JSON_VALUE;
	private static final String xml = MediaType.APPLICATION_XML_VALUE;

	@GetMapping(path = "/employees", produces = { json, xml })
	public List<Employee> getAllEmployees() {
		return repo.findAll();
	}

//	@GetMapping("/employees/{theId}")
//	public Employee getOneEmployee(@PathVariable("theId") Long id) {
//		Optional<Employee> opt = repo.findById(id);
//		if (opt.isPresent()) {
//			return opt.get();
//		}
//		return null;
//	}
	@GetMapping("/employees/{id}")
	public Employee getOneEmployee(@PathVariable Long id) {
		Optional<Employee> opt = repo.findById(id);
		if (opt.isPresent()) {
			return opt.get();
		}
		throw new EmployeeNotFoundException(id);
	}

	@GetMapping("/employees/ent/{id}")
	public ResponseEntity<Employee> getOneEmployee2(@PathVariable Long id) {
		Optional<Employee> opt = repo.findById(id);
		if (opt.isPresent()) {
			return new ResponseEntity<Employee>(opt.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("/employees/ent/err/{id}")
	public ResponseEntity<?> getOneEmployee3(@PathVariable Long id) {
		Optional<Employee> opt = repo.findById(id);
		if (opt.isPresent()) {
			return new ResponseEntity<Employee>(opt.get(), HttpStatus.OK);
		} else {
			return new ResponseEntity<String>("employee not found: " + id, HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping(path = "/employees", consumes = { xml, json })
	public Employee addEmployee(@RequestBody Employee employee) {
		return repo.save(employee);
	}

	@PutMapping("/employees")
	public Employee updateEmployee(@RequestBody Employee employee) {
		if (repo.existsById(employee.getId())) {
			return repo.save(employee);
		}
		throw new EmployeeNotFoundException(employee.getId());
	}

	@DeleteMapping("/employees")
	public Employee delete(@RequestParam Long id) {
		Employee e = getOneEmployee(id);
		repo.deleteById(id);
		return e;
	}

}
