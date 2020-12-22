package a;

public class PhoneDisplay implements IObserver {

	private WeatherStation weatherStation;

	public PhoneDisplay(WeatherStation weatherStation) {
		super();
		this.weatherStation = weatherStation;
	}

	@Override
	public void update() {
		int newTemperature = weatherStation.getTemperature();
		System.out.println("========== phone display ==========");
		System.out.println("temperature updated: " + newTemperature);
		System.out.println("========== ************* ==========");

	}

}
