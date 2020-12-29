package app.core;

import javax.swing.JOptionPane;

import org.springframework.web.client.RestTemplate;

import app.core.beans.Person;

public class RestClientProgram5PostObject {

	public static void main(String[] args) {

		int id = Integer.parseInt(JOptionPane.showInputDialog("enter person id"));
		String url = "http://localhost:8080/api/person/" + id;

		RestTemplate restTemplate = new RestTemplate();
		Person p = restTemplate.getForObject(url, Person.class);
		System.out.println("================================");
		System.out.println(p);

	}

}
