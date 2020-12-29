package app.core;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class RestClientProgram1Text {

	public static void main(String[] args) {
		System.out.println("start");

		String url = "http://localhost:8080/api/greet";

		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> resp = restTemplate.getForEntity(url, String.class);

		System.out.println("================================");
		System.out.println(resp);
		System.out.println(resp.getStatusCode());
		System.out.println(resp.getBody());

	}

}
