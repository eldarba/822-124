package a.homework;

public class Car extends Vehicle {

	public Car(String color) {
		super(color);
	}

	@Override
	public void turnOn() {
		System.out.println(this.color + " car " + this.number + " turned on");
	}

	@Override
	public void turnOff() {
		System.out.println(this.color + " car " + this.number + " turned off");

	}

	@Override
	public void move(int distance, int speed) {

		if (speed >= MIN_SPEED && speed <= MAX_SPEED) {
			System.out.println(this.color + " car " + this.number + " is driving at " + speed + " km/h");
			this.km += distance;
		} else {
			System.out.println(
					this.color + " car " + this.number + " is not driving. speed is illegal: " + speed + " km/h");
		}

	}

}
