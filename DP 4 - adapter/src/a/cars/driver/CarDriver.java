package a.cars.driver;

import a.cars.Car;

public class CarDriver {

	private Car car;

	public CarDriver(Car car) {
		super();
		this.car = car;
	}

	public void driveCar(int speed, int distance, String direction) {
		car.drive(speed, distance, direction);
	}

}
