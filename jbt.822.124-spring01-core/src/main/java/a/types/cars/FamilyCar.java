package a.types.cars;

public class FamilyCar implements Car {

	// helper object - should be initialized - will be injected by spring
	private Honker honker;

	public FamilyCar() {
	}

	public FamilyCar(Honker honker) {
		super();
		this.honker = honker;
	}

	@Override
	public String startDriving() {
		return "driving in a family car";
	}

	@Override
	public String startHonking() {
		return honker.honk();
	}

	public void setHonker(Honker honker) {
		this.honker = honker;
	}
}
