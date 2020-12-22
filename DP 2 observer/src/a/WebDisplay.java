package a;

public class WebDisplay implements IObserver {

	private WeatherStation weatherStation;

	public WebDisplay(WeatherStation weatherStation) {
		super();
		this.weatherStation = weatherStation;
	}

	@Override
	public void update() {
		int newTemperature = weatherStation.getTemperature();
		System.out.println("========== web display ==========");
		System.out.println("temperature updated: " + newTemperature);
		System.out.println("============== www ==============");

	}

}
