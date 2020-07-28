package org.spring.eldar.cars;

import java.util.List;

public class ParkingLot {

	private List<Vehicle> vehicles;
	


	/** add a vehicle to the parking lot */
	public void addVehicle(Vehicle vehicle) {
		vehicle.stop();
		vehicles.add(vehicle);
	}

	/**
	 * returns the specified vehicle and remove it from the parking lot. if not
	 * found returns null
	 */
	public Vehicle getVehicle(int number) {
		for (Vehicle vehicle : vehicles) {
			if (vehicle.getNumber() == number) {
				vehicles.remove(vehicle);
				vehicle.start();
				return vehicle;
			}
		}
		return null;
	}

	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}
}
