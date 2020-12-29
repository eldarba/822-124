package app.core;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import app.core.beans.Person;

public class RestClientProgram7getList_WRONG {

	public static void main(String[] args) {

		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/api/person/all";
		// This is wrong
		List<Person> list = restTemplate.getForObject(url, List.class);
		ResponseEntity<String> resp = restTemplate.getForEntity(url, String.class);

		System.out.println("=======================");
		System.out.println(list);
		System.out.println(resp.getBody());

		Person p = list.get(0);
		System.out.println(p);

	}

}
