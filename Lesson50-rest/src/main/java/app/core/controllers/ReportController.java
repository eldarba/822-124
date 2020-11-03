package app.core.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.core.entities.Report;
import app.core.repositories.ReportRepository;

@CrossOrigin
@RestController
@RequestMapping("/lesson50/api")
public class ReportController {

	private ReportRepository repo;

	public ReportController(ReportRepository repo) {
		super();
		this.repo = repo;
	}

//	@RequestMapping(path = "/employees", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
//	public List<Employee> getAllEmployees() {
//		return repo.findAll();
//	}

	private static final String json = MediaType.APPLICATION_JSON_VALUE;
	private static final String xml = MediaType.APPLICATION_XML_VALUE;

//	@GetMapping(path = "/employees", produces = { json, xml })
//	public List<Employee> getAllEmployees() {
//		return repo.findAll();
//	}
//
////	@GetMapping("/employees/{theId}")
////	public Employee getOneEmployee(@PathVariable("theId") Long id) {
////		Optional<Employee> opt = repo.findById(id);
////		if (opt.isPresent()) {
////			return opt.get();
////		}
////		return null;
////	}
//	@GetMapping("/employees/{id}")
//	public Employee getOneEmployee(@PathVariable Long id) {
//		Optional<Employee> opt = repo.findById(id);
//		if (opt.isPresent()) {
//			return opt.get();
//		}
//		throw new EmployeeNotFoundException(id);
//	}
//
//	@GetMapping("/employees/ent/{id}")
//	public ResponseEntity<Employee> getOneEmployee2(@PathVariable Long id) {
//		Optional<Employee> opt = repo.findById(id);
//		if (opt.isPresent()) {
//			return new ResponseEntity<Employee>(opt.get(), HttpStatus.OK);
//		} else {
//			return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
//		}
//	}
//
//	@GetMapping("/employees/ent/err/{id}")
//	public ResponseEntity<?> getOneEmployee3(@PathVariable Long id) {
//		Optional<Employee> opt = repo.findById(id);
//		if (opt.isPresent()) {
//			return new ResponseEntity<Employee>(opt.get(), HttpStatus.OK);
//		} else {
//			return new ResponseEntity<String>("employee not found: " + id, HttpStatus.NOT_FOUND);
//		}
//	}

	@PostMapping(path = "/reports", consumes = { xml, json })
	public Report addReport(@RequestBody Report report) {
		return repo.save(report);
	}

//	@PutMapping("/employees")
//	public Employee updateEmployee(@RequestBody Employee employee) {
//		if (repo.existsById(employee.getId())) {
//			return repo.save(employee);
//		}
//		throw new EmployeeNotFoundException(employee.getId());
//	}
//
//	@DeleteMapping("/employees")
//	public Employee delete(@RequestParam Long id) {
//		Employee e = getOneEmployee(id);
//		repo.deleteById(id);
//		return e;
//	}

}
