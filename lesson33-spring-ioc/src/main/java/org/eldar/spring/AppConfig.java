package org.eldar.spring;

import org.eldar.spring.cars.Car;
import org.eldar.spring.cars.Engine;
import org.eldar.spring.cars.Transmission;
import org.eldar.spring.persons.Person;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan
// tell spring where is the properties file
@PropertySource("classpath:pplication.properties")
public class AppConfig {

	private static int carId = 1;
	private static int engineId = 101;

	@Bean
	@Scope(BeanDefinition.SCOPE_PROTOTYPE)
	public Person thePerson() {
		Person p = new Person(111, "AAA", 50);
		return p;
	}

	@Bean
	@Scope(BeanDefinition.SCOPE_PROTOTYPE)
	public Person theOtherPerson() {
		Person p = new Person(222, "BBB", 100);
		return p;
	}

	@Bean
	@Scope(BeanDefinition.SCOPE_SINGLETON)
	public Car raceCar() {
		Car car = new Car("Red", new Engine(5000, "V8"), new Transmission(8, Transmission.Type.MANUAL));
		return car;
	}

	@Bean
	@Scope(BeanDefinition.SCOPE_PROTOTYPE)
	public int carId() {
		return carId++;
	}

	@Bean
	@Scope(BeanDefinition.SCOPE_PROTOTYPE)
	public int engineId() {
		return engineId++;
	}

}
