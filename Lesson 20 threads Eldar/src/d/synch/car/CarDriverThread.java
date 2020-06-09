package d.synch.car;

public class CarDriverThread extends Thread {

	private Car car;
	private int travelDistance;
	private int travelSpeed;

	public CarDriverThread(Car car, int travelDistance, int travelSpeed, String driverName) {
		super(driverName);
		this.car = car;
		this.travelDistance = travelDistance;
		this.travelSpeed = travelSpeed;
	}

	@Override
	public void run() {
		synchronized (car) {
			System.out.println(getName() + " has the key for car " + car.getNumber());
			car.turnOn();
			car.drive(travelDistance, travelSpeed);
			car.turnOff();
			System.out.println("=======================");
		}
	}

}
