package com.example.rest.Lesson49rest;

import java.time.LocalDateTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class MyController {

	@GetMapping("greet")
	public String greet() {
		return "Hello. today is: " + LocalDateTime.now();
	}

}
