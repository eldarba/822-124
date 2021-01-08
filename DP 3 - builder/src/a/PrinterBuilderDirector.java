package a;

public class PrinterBuilderDirector {

	public static Printer getBasicPrinter() {
		return new Printer.Builder("basic", "black", "AS-16").build();
	}

	public static Printer getFaxPrinter() {
		return new Printer.Builder("fax", "black", "AS-16").setFaxEnabled(true).build();
	}

	public static Printer getScannerPrinter() {
		return new Printer.Builder("scanner", "black", "AS-16").setScannerEnabled(true).build();
	}

}
