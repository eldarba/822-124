package a.enums.cars;

public class Test {

	public static void main(String[] args) {

		Car car1 = new Car(111, 0, CarColor.GREEN, Car.Type.TOYOTA);
		System.out.println(car1);

		car1.setColor(CarColor.PINK);
		System.out.println(car1);

		car1.setColor(CarColor.BLACK);
		System.out.println(car1);
	}

}
