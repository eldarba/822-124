package a.cars.driver;

import a.automobils.Automobil;
import a.cars.Car;
import a.cars.FamilyCar;
import b.adapters.CarToAutomobilAdapter;

public class CarDriverTest {

	public static void main(String[] args) {

		Car car = new FamilyCar();
		CarDriver driver = new CarDriver(car);
		driver.driveCar(100, 50, "NORTH");
		System.out.println(car);

		Automobil automobil = new Automobil();
		CarDriver autoDriver = new CarDriver(new CarToAutomobilAdapter(automobil));
		autoDriver.driveCar(70, 10, "EAST");
		System.out.println(automobil);

	}

}
