package org.spring.eldar.cars;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

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
