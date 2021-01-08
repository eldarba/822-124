package a.factory;

import a.Printer;
import a.XmlPrinter;

public class XmlPrinterFactory implements PrinterAbstractFactory {

	@Override
	public Printer createPrinter() {
		return new XmlPrinter("xml printer", "black");
	}

}
