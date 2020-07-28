package org.spring.eldar.cars;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Component
@Primary
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@ToString @Getter @Setter
public class CarImpl implements Car {
	
	private int number;

	@Override
	public int getNumber() {
		return this.number;
	}

	@Override
	public void start() {
		System.out.println("car start engine");

	}

	@Override
	public void stop() {
		System.out.println("car stop engine");

	}

}
