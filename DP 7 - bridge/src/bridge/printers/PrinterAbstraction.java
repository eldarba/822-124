package bridge.printers;

import java.util.ArrayList;
import java.util.List;

public abstract class PrinterAbstraction {

	protected List<PrinterImplementor> implementors = new ArrayList<>();

	public PrinterAbstraction() {
		super();
		loadPrinterImplementors();
	}

	protected abstract void loadPrinterImplementors();

	/**
	 * print the specified content in all formats available in this printer
	 * 
	 * @param text the text to print
	 */
	public void printInAllFormats(String text) {
		for (PrinterImplementor printerImplementor : implementors) {
			printerImplementor.print(text);
		}
	}

}
