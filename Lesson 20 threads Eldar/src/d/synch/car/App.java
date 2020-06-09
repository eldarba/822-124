package d.synch.car;

public class App {

	public static void main(String[] args) {

		Car car = new Car(101);

		CarDriverThread dani = new CarDriverThread(car, 4, 50, "Dani");
		CarDriverThread lea = new CarDriverThread(car, 2, 70, "Lea");
		CarDriverThread yosi = new CarDriverThread(car, 5, 70, "Yosi");

		dani.start();
		lea.start();
		yosi.start();

	}

}
