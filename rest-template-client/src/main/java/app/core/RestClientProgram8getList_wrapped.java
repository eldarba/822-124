package app.core;

import org.springframework.web.client.RestTemplate;

import app.core.beans.Person;
import app.core.beans.PersonsListWrapper;

public class RestClientProgram8getList_wrapped {

	public static void main(String[] args) {

		RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/api/person/all/wrapper";
		PersonsListWrapper listWrapper = restTemplate.getForObject(url, PersonsListWrapper.class);

		System.out.println("=======================");

		for (Person p : listWrapper.getPersons()) {
			System.out.println(p);
		}

	}

}
