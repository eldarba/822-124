package org.spring.eldar;

import org.spring.eldar.interceptors.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {
	
	@Bean
	public MyBean otherMyBean() {
		return new MyBean();
	}

}
