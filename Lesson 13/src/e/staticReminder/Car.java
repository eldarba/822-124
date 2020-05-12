package e.staticReminder;

public class Car {

	int x;
	static int y;

	public static void main(String[] args) {

		System.out.println(Car.y);
//		System.out.println(Car.x);

		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();

		car1.x = 100;
		car2.x = 200;
		car3.x = 300;

		System.out.println(car1.x);
		System.out.println(car2.x);
		System.out.println(car3.x);
	}

}
