package a;

import a.factory.PrinterAbstractFactory;

public class PrinterFactory {

	public static Printer createPrinter(PrinterAbstractFactory factory) {

		return factory.createPrinter();
	}

}
