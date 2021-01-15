package bridge.printers;

public class ConcreteLowerPrinterImplementor extends PrinterImplementor {

	@Override
	public void print(String text) {
		System.out.println(text.toLowerCase());
	}

}
