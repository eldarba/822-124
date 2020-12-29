package app.core;

import org.springframework.web.client.RestTemplate;

import app.core.beans.Person;

public class RestClientProgram6JsonToPerson {

	public static void main(String[] args) {

		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/api/person";
		Person p = new Person("Yaniv", 87);
		p = restTemplate.postForObject(url, p, Person.class);
		System.out.println("=======================");
		System.out.println(p);

	}

}
