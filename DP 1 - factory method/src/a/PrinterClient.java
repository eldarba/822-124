package a;

public class PrinterClient {

	public static void main(String[] args) {

		Printer printer;

		printer = PrinterFactory.createPrinter(PrinterType.PLAIN_TEXT);
		printer.print("hello world");

		printer = PrinterFactory.createPrinter(PrinterType.HTML);
		printer.print("hello world");
	}

}
