package b.adapters;

import a.automobils.Automobil;
import a.automobils.Automobil.Location;
import a.cars.Car;

public class CarToAutomobilAdapter implements Car {

	private Automobil automobil;

	public CarToAutomobilAdapter(Automobil automobil) {
		super();
		this.automobil = automobil;
	}

	@Override
	public void drive(int speed, int distance, String direction) {
		Location location;
		try {
			location = Location.valueOf(direction);
		} catch (IllegalArgumentException e) {
//			System.out.println(e);
			location = null;
		}
		automobil.go(distance, speed, location);
	}

}
