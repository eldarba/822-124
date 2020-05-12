package b.targil.vehicles;

public abstract class Vehicle {

	private int number;
	private int speed;

	// CTOR
	public Vehicle(int number) {
		super();
		this.number = number;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getNumber() {
		return number;
	}

}
