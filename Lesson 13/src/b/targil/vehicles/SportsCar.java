package b.targil.vehicles;

public class SportsCar extends ConfigurableVehicle {

	private boolean turbo;

	public SportsCar(int number) {
		super(number);
	}

	@Override
	public void resotreDefaultSettings() {
		this.turbo = false;

	}

	public boolean isTurbo() {
		return turbo;
	}

	public void setTurbo(boolean turbo) {
		this.turbo = turbo;
	}

}
