package b;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("theCar") // the qualifier 'theCar' is the bean name
@Primary
@Lazy
public class Car {

	private int id;
	private int speed;
	private Engine engine;
	private Transmission transmission;

	
	@Autowired
	public Car(Engine engine, Transmission transmission) {
		super();
		System.out.println("from Car Ctor");
		this.engine = engine;
		this.transmission = transmission;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	

	public Transmission getTransmission() {
		return transmission;
	}

	public void setTransmission(Transmission transmission) {
		this.transmission = transmission;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", speed=" + speed + ", engine=" + engine + ", transmission=" + transmission + "]";
	}

	

}
