package a.casting;

public class CastingDemo1 {

	public static void main(String[] args) {

//		casting is conversion from one type to another

//		casting on a primitive
		double a = 5.3; // represented as double 64 bit

		// cast the double to float
		float b = (float) a; // represented as double 32 bit

		// cast the double to int
		int c = (int) a; // represented as double 32 bit

		char cr1 = 'A';
		System.out.println(cr1);
		int cr1AsInt = cr1; // implicit casting
		System.out.println(cr1AsInt);

//		casting on object reference 

		RaceCar raceCar = new RaceCar();

		System.out.println(raceCar.number);
		System.out.println(raceCar.speed);
		System.out.println(raceCar.turboOn);

		// up cast from RaceCar to Car (implicit)
		Car car = raceCar;
		System.out.println(car.number);
		System.out.println(car.speed);
//		System.out.println(car.turboOn); // this member is not in the reference interface

		// down cast from Car to RaceCar (explicit) - we get access to more members of
		// the object
		if (car instanceof RaceCar) {
			RaceCar raceCar2 = (RaceCar) car;
			System.out.println(raceCar2.number);
			System.out.println(raceCar2.speed);
			System.out.println(raceCar2.turboOn);
		}

		Car car2 = new Car();
		RaceCar x = (RaceCar) car2; // will fail at runtime

	}

	// access modifiers:
	/*
	 * 1. public - everyone
	 * 
	 * 2. protected - package + subclasses (even if outside the package)
	 * 
	 * 3. default (when not specifying an access modifier) - package private
	 * 
	 * 4. private - only from within the class
	 */
	private static class Car {
		int number;
		int speed;
	}

	private static class RaceCar extends Car {
		boolean turboOn;
	}
}
