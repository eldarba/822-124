package org.eldar.spring.cars;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.ToString;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@ToString
public class Engine {

	private int id;
	private int volume;
	private String type;
	private boolean engineOn;

	public Engine(@Value("1800") int volume, @Value("Regular") String type) {
		super();
		this.volume = volume;
		this.type = type;
	}

	public void startEngine() {
		this.engineOn = true;
		System.out.println("engine started");
	}

	public void stopEngine() {
		this.engineOn = false;
	}

}
