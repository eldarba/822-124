package app.core;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import app.core.beans.Person;

public class RestClientProgram3Jackson {

	public static void main(String[] args) {

		try {

			Person person = new Person(101, "aaa", 33);
			System.out.println(person);
			String jsonString;

			ObjectMapper mapper = new ObjectMapper();

			// object to json
			jsonString = mapper.writeValueAsString(person);
//			jsonString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(person);
			System.out.println(jsonString);

			// json to object
			Person p2 = mapper.readValue(jsonString, Person.class);
			System.out.println(p2);

		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}

	}

}
