package b.enums.planets;

public enum Planet {

	// the instances (constants)
	MARS(100, 5), EARTH(150, 7), MERQURI(200, 9), VENUS(130, 3), JUPITER(700, 9);

	// attributes
	private int orbit; // distance from sun
	private int mass;

	// CTOR
	private Planet(int orbit, int mass) {
		this.orbit = orbit;
		this.mass = mass;
	}

	// methods
	public int getOrbit() {
		return orbit;
	}

	public int getMass() {
		return mass;
	}

}
