package a.factory;

import a.HtmlPrinter;
import a.Printer;

public class HtmlPrinterFactory implements PrinterAbstractFactory {

	@Override
	public Printer createPrinter() {
		return new HtmlPrinter("html printer", "black");
	}

}
