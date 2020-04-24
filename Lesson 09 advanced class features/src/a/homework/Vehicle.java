package a.homework;

public abstract class Vehicle {

//	fields
	public static final int MIN_SPEED = 0;
	public static final int MAX_SPEED = 200;
	private static int counter;

//	attributes
	public final int number;
	protected String color;
	protected int km;
	protected int speed;

//	initializer
	{
		// in the initializer you can add code as much as needed
		this.number = ++counter;
	}

	// the finalize method
	@Override
	protected void finalize() throws Throwable {
		System.out.println("GC is cleaning vehicle number: " + this.number);
		counter--;
	}

	// CTOR
	public Vehicle(String color) {
		super();
		this.color = color;
	}

	/** implementors need to prints an appropriate message */
	public abstract void turnOn();

	/** implementors need to prints an appropriate message */
	public abstract void turnOff();

	/**
	 * implementors need to print an appropriate message. if the speed is legal: set
	 * the speed and increment the km attribute as needed. otherwise not moving.
	 */
	public abstract void move(int distance, int speed);

//	get set methods
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public static int getCounter() {
		return counter;
	}

	public int getKm() {
		return km;
	}

}
