package b.targil.printers;

import b.targil.interfaces.Configurable;

public class TextPrinter extends Printer implements Configurable {

	@Override
	public void resotreDefaultSettings() {
		setColors(DEFAULT_COLORS);
		setOrientation(DEFAULT_ORIENTATION);
	}

	@Override
	public void print(String text) {
		System.out.println(">>> text printer is printing [" + "colors: " + getColors() + ", orientation: "
				+ getOrientation() + "]");
		System.out.println(text);
	}

	public static void main(String[] args) {
		TextPrinter p = new TextPrinter();
		p.print("aaa");
		System.out.println();
		p.setOrientation(Orientation.LANDSCAPE);
		p.setColors(Colors.COLOR);
		p.print("bbb");
		System.out.println();

		p.resotreDefaultSettings();
		p.print("ccc");

	}

}
