package org.spring.eldar.cars;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		ParkingLot lot = new ParkingLot();
		lot.setVehicles(new ArrayList<>());

		Vehicle v;
		int i;

		for (i = 1; i <= 5; i++) {
			v = new CarImpl();
			v.setNumber(i);
			lot.addVehicle(v);
		}
		
		for (; i <= 10; i++) {
			v = new SUVImpl();
			v.setNumber(i);
			lot.addVehicle(v);
		}

		for (; i <= 15; i++) {
			v = new TruckImpl();
			v.setNumber(i);
			lot.addVehicle(v);
		}
		
		System.out.println(lot.getVehicles());

	}

}
