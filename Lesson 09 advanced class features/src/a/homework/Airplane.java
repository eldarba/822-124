package a.homework;

public class Airplane extends Vehicle {

	public Airplane(String color) {
		super(color);
	}

	@Override
	public void turnOn() {
		System.out.println(this.color + " airplane " + this.number + " turned on");
	}

	@Override
	public void turnOff() {
		System.out.println(this.color + " airplane " + this.number + " turned off");

	}

	@Override
	public void move(int distance, int speed) {

		if (speed >= MIN_SPEED && speed <= MAX_SPEED) {
			System.out.println(this.color + " airplane " + this.number + " is flying at " + speed + " km/h");
			this.km += distance;
		} else {
			System.out.println(
					this.color + " airplane " + this.number + " is not flying. speed is illegal: " + speed + " km/h");
		}

	}

}
