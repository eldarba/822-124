package org.eldar.spring.cars;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@ToString
public class Car {

	@Resource
	@Qualifier("carId")
	private int id;
	private String color;
	private Engine engine;
	private Transmission transmission;

	@Autowired
	public Car(@Value("White") String color, Engine engine, Transmission transmission) {
		super();
		this.color = color;
		this.engine = engine;
		this.transmission = transmission;
	}

	// life cycle hook - on bean creation
	@PostConstruct
	public void starEngine() {
		this.engine.startEngine();
	}

	// life cycle hook - on bean destroyed (only on singletons )
	@PreDestroy
	public void stopEngine() {
		this.engine.stopEngine();
		System.out.println("engine stopped for car: " + id);
	}

}
