package org.spring.eldar;

import java.util.ArrayList;
import java.util.List;

import org.spring.eldar.cars.ParkingLot;
import org.spring.eldar.cars.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan
public class AppConfig {
	
	// here we define what List impl to use for parking lot across the entire application
	@Bean
	@Scope("prototype")
	public List<Vehicle> parkingLotList(){
		List<Vehicle> list = new ArrayList<Vehicle>();
		return list;
	}
	
	@Bean
	public ParkingLot lot2() {
		ParkingLot lot = new ParkingLot();
		return lot;
	}

}
