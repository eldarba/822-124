package a.cars;

public class FamilyCar implements Car {

	private int speed;
	private int km;
	private String location;

	@Override
	public void drive(int speed, int distance, String direction) {
		this.speed = speed;
		this.km += distance;
		this.location = direction;
	}

	@Override
	public String toString() {
		return "FamilyCar [speed=" + speed + ", km=" + km + ", location=" + location + "]";
	}

}
