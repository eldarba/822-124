package a.automobils;

public class Automobil {

	private int km;
	private int speed;
	private Location location;

	public enum Location {
		NORTH, SOUTH, EAST, WEST
	}

	public void go(int distance, int speed, Location location) {
		this.km += distance;
		this.speed = speed;
		this.location = location;
	}

	@Override
	public String toString() {
		return "Automobil [km=" + km + ", speed=" + speed + ", location=" + location + "]";
	}

}
