package a;

public class Test {

	public static void main(String[] args) {

		// observable
		WeatherStation weatherStation = new WeatherStation();

		// observers
		PhoneDisplay observer1 = new PhoneDisplay(weatherStation);
		LaptopDisplay observer2 = new LaptopDisplay(weatherStation);
		WebDisplay observer3 = new WebDisplay(weatherStation);

		// register observers to the observable
		weatherStation.add(observer1);
		weatherStation.add(observer2);
		weatherStation.add(observer3);

		System.out.println("================ ready");

		weatherStation.changeTemperature(20);

		System.out.println("===========================================================");
		weatherStation.changeTemperature(10);

	}

}
