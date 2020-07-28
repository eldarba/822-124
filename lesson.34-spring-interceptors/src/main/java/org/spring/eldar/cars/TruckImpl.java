package org.spring.eldar.cars;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString @Getter @Setter
public class TruckImpl implements Truck {
	
	private int number;

	@Override
	public int getNumber() {
		return this.number;
	}

	@Override
	public void start() {
		System.out.println("track start engine");

	}

	@Override
	public void stop() {
		System.out.println("track stop engine");

	}

}
