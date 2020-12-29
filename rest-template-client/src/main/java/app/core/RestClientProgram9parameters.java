package app.core;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.client.RestTemplate;

import app.core.beans.Person;

public class RestClientProgram9parameters {

	public static void main(String[] args) {

		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/api/person/{id}";

		Map<String, String> parametersMap = new HashMap<String, String>();
		parametersMap.put("id", "1");

		Person person = restTemplate.getForObject(url, Person.class, parametersMap);
		System.out.println("=======================");
		System.out.println(person);

		// targil - write 2 more controller methods:

		// 1. to update an existing person

		// 2. to delete an existing person

		// syntax for put and delete
//		restTemplate.put(url, person);
//		restTemplate.delete(url);
//		restTemplate.delete(url, parametersMap);

	}

}
