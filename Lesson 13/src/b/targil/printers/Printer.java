package b.targil.printers;

public abstract class Printer {

	// constants for default values
	public static final Colors DEFAULT_COLORS = Colors.BLACK;
	public static final Orientation DEFAULT_ORIENTATION = Orientation.PORTRAIT;

	// attributes
	private Colors colors = DEFAULT_COLORS;
	private Orientation orientation = DEFAULT_ORIENTATION;

	// methods
	public abstract void print(String text);

	public Colors getColors() {
		return colors;
	}

	public void setColors(Colors colors) {
		this.colors = colors;
	}

	public Orientation getOrientation() {
		return orientation;
	}

	public void setOrientation(Orientation orientation) {
		this.orientation = orientation;
	}

	// enums
	public enum Colors {
		BLACK, COLOR;
	}

	public enum Orientation {
		PORTRAIT, LANDSCAPE;
	}

}
