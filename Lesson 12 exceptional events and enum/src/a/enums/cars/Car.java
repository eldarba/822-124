package a.enums.cars;

public class Car {

	private int number;
	private int speed;
	private CarColor color;
	private Type type; // add an enum for this field (SUBARO, MAZDA, MERCEDES, FORD, TOYOTA)

	public Car(int number, int speed, CarColor color, Type type) {
		super();
		this.number = number;
		this.speed = speed;
		this.color = color;
		this.type = type;
	}

	// enum types can be nested in a class
	public enum Type {
		SUBARO, MAZDA, MERCEDES, FORD, TOYOTA;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public CarColor getColor() {
		return color;
	}

	public void setColor(CarColor color) {
		this.color = color;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Car [number=" + number + ", speed=" + speed + ", color=" + color + ", type=" + type + "]";
	}

}
