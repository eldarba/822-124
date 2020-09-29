package app.core;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import app.core.entities.Employee;
import app.core.repositories.EmployeeRepository;

//@Configuration
public class PopulateDatabase {

	@Bean
	CommandLineRunner initDb(EmployeeRepository er) {

		// implement interface using anonymous inner class
		CommandLineRunner runner = new CommandLineRunner() {

			@Override
			public void run(String... args) throws Exception {
				System.out.println("add 2 employees");
				er.save(new Employee("Ron", "Manager"));
				er.save(new Employee("Dan", "Lawyer"));

			}
		};

		return runner;
	}

}
