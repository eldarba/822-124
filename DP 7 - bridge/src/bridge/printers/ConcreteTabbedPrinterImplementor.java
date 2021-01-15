package bridge.printers;

public class ConcreteTabbedPrinterImplementor extends PrinterImplementor {

	@Override
	public void print(String text) {
		char[] caracters = text.toCharArray();
		for (char c : caracters) {
			System.out.print(c + "\t");
		}
		System.out.println();
	}

}
