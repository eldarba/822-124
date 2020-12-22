package a;

public class LaptopDisplay implements IObserver {

	private WeatherStation weatherStation;

	public LaptopDisplay(WeatherStation weatherStation) {
		super();
		this.weatherStation = weatherStation;
	}

	@Override
	public void update() {
		int newTemperature = weatherStation.getTemperature();
		System.out.println("========= Laptop display =========");
		System.out.println("temperature updated: " + newTemperature);
		System.out.println("============== ASUS ==============");

	}

}
