package org.eldar.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import a.Person;
import b.Car;
import b.Engine;
import b.Transmission;

@Configuration
//@ComponentScan(basePackages = {"a", "b"})
@ComponentScan(basePackages = "a, b")
public class AppConfig {

//	@Bean
//	public Car speadingCar() {
//		Car car = new Car(new Engine());
//		car.setSpeed(150);
//		return car;
//	}

	@Bean
	public int[] tenRandoms() {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 101);
		}
		return arr;
	}

	@Bean("theFiveRandoms")
	public int[] fiveRandoms() {
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 101);
		}
		return arr;
	}
	
	@Bean
	public Person person18() {
		Person p = new Person();
		p.setAge(18);
		return  p;
	}
	
	@Bean
	@Lazy
	public Transmission autoTransmission() {
		Transmission t = new Transmission();
		t.setType("auto");
		return t;
	}

}
