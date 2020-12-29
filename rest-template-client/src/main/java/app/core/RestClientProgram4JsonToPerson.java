package app.core;

import org.springframework.web.client.RestTemplate;

import app.core.beans.Person;

public class RestClientProgram4JsonToPerson {

	public static void main(String[] args) {
		System.out.println("start");

		String url = "http://localhost:8080/api/person";

		RestTemplate restTemplate = new RestTemplate();
		Person p = restTemplate.getForObject(url, Person.class);

		System.out.println("================================");
		System.out.println(p);

	}

}
