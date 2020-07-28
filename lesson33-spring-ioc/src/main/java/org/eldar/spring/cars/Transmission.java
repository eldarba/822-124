package org.eldar.spring.cars;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@ToString
public class Transmission {

	private int id;
	private int gears;
	private Type type;

	// enum
	public enum Type {
		MANUAL, AUTO;
	}

	public Transmission(@Value("4") int gears, @Value("${car.transmission.type}") Type type) {
		super();
		this.gears = gears;
		this.type = type;
	}

}
