package a.reminder;

// a class can represent an object type
public class Car {

	int number;
	String color;
	int speed;

	public Car(int number, String color, int speed) {
		this.number = number;
		this.color = color;
		this.speed = speed;
	}

	public void stop() {
		this.speed = 0;
		System.out.println("car stopped");
	}

}
