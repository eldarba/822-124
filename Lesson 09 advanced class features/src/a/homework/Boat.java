package a.homework;

public class Boat extends Vehicle {

	public Boat(String color) {
		super(color);
	}

	@Override
	public void turnOn() {
		System.out.println(this.color + " boat " + this.number + " turned on");
	}

	@Override
	public void turnOff() {
		System.out.println(this.color + " boat " + this.number + " turned off");

	}

	@Override
	public void move(int distance, int speed) {

		if (speed >= MIN_SPEED && speed <= MAX_SPEED) {
			System.out.println(this.color + " boat " + this.number + " is sailing at " + speed + " knots");
			this.km += distance;
		} else {
			System.out.println(
					this.color + " boat " + this.number + " is not sailing. speed is illegal: " + speed + " knots");
		}

	}

}
