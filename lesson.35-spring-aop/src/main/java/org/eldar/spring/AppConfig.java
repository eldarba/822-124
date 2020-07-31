package org.eldar.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("application.properties")
public class AppConfig {

	@Bean
	public String name1() {
		return "David";
	}

	@Bean
	public String name2() {
		return "Moshe";
	}

	@Bean
	public int theId() {
		return 123;
	}

}
