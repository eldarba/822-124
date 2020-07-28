package org.spring.eldar.cars;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("lot1")
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class ParkingLot {

	
	@Autowired
	@Qualifier("parkingLotList")
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

}
