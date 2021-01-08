package a.factory;

import a.PlaintTextPrinter;
import a.Printer;

public class PlainTextPrinterFactory implements PrinterAbstractFactory {

	private String description;
	private String ink;

	public PlainTextPrinterFactory() {
		this("plain printer", "color");
	}

	public PlainTextPrinterFactory(String description, String ink) {
		super();
		this.description = description;
		this.ink = ink;
	}

	@Override
	public Printer createPrinter() {
		return new PlaintTextPrinter(description, ink);
	}

}
