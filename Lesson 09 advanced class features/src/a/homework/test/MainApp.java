package a.homework.test;

import a.homework.Airplane;
import a.homework.Boat;
import a.homework.Car;
import a.homework.Vehicle;

public class MainApp {

	public static void main(String[] args) throws InterruptedException {

		// PRINT NUMBER OF VEHICLES
		System.out.println("number of vehicles in heap memory: " + Vehicle.getCounter());

		Vehicle[] vehicles = new Vehicle[5];

		vehicles[0] = new Car("Red");
		vehicles[2] = new Airplane("Green");
		vehicles[4] = new Boat("Blue");

		// PRINT NUMBER OF VEHICLES
		System.out.println("number of vehicles in heap memory: " + Vehicle.getCounter());

		for (int i = 0; i < vehicles.length; i++) {
			Vehicle curr = vehicles[i];
			if (curr != null) {
				// create random values for travel distance and speed
				int distance = (int) (Math.random() * 101);
				int speed = (int) (Math.random() * 301);
				curr.turnOn();
				curr.move(distance, speed);
				curr.turnOff();
			} else {
				System.out.println("NULL");
			}
			System.out.println("==============================");
		}

		vehicles[2] = null;
		vehicles[0] = null;
		System.gc();

		Thread.sleep(4000);
		// PRINT NUMBER OF VEHICLES
		System.out.println("number of vehicles in heap memory: " + Vehicle.getCounter());
	}

}
