package a;

import a.factory.HtmlPrinterFactory;
import a.factory.PlainTextPrinterFactory;
import a.factory.XmlPrinterFactory;

public class PrinterClient {

	public static void main(String[] args) {

		Printer printer;

		printer = PrinterFactory.createPrinter(new PlainTextPrinterFactory());
		printer.print("hello world");

		printer = PrinterFactory.createPrinter(new HtmlPrinterFactory());
		printer.print("hello world");

		printer = PrinterFactory.createPrinter(new XmlPrinterFactory());
		printer.print("hello world");

		printer = PrinterFactory.createPrinter(new PlainTextPrinterFactory("basic printer", "RGB"));
		printer.print("hello world");
	}

}
