package b.targil.vehicles;

import b.targil.interfaces.Configurable;

public abstract class ConfigurableVehicle extends Vehicle implements Configurable {

	// CTOR
	public ConfigurableVehicle(int number) {
		super(number);
	}

}
