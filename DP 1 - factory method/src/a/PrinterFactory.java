package a;

public class PrinterFactory {

	public static Printer createPrinter(PrinterType type) {

		Printer printer = null;

		switch (type) {
		case PLAIN_TEXT:
			printer = new PlaintTextPrinter("plain printer", "color");
			break;
		case HTML:
			printer = new HtmlPrinter("HTML printer", "black");
			break;
		case XML:
			printer = new XmlPrinter("XML printer", "black");
			break;
		}
		return printer;
	}

}
