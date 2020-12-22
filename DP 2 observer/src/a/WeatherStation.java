package a;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IObservable {

	private int temperature;

	private List<IObserver> observers = new ArrayList<IObserver>();

	@Override
	public void add(IObserver observer) {
		observers.add(observer);

	}

	@Override
	public void remove(IObserver observer) {
		observers.remove(observer);

	}

	@Override
	public void sendNotification() {
		for (IObserver observer : observers) {
			observer.update();
		}

	}

	public int getTemperature() {
		return temperature;
	}

	public void changeTemperature(int temp) {
		this.temperature = temp;
		sendNotification();
	}

}
