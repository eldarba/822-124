package a;

public class PrinterClient {

	public static void main(String[] args) {

		Printer printer = new Printer.Builder("plain", "color", "1500SE").build();
		Printer printer2 = new Printer.Builder("plain", "color", "1500SE").setFaxEnabled(true).build();

		// we use director for pre defined printers
		Printer printer3 = PrinterBuilderDirector.getScannerPrinter();

		System.out.println(printer);
		System.out.println(printer2);
		System.out.println(printer3);

	}

}
