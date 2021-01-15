package bridge.printers;

public class ConcreteReveresePrinterImplementor extends PrinterImplementor {

	@Override
	public void print(String text) {
		char[] characters = text.toCharArray();
		for (int i = characters.length - 1; i >= 0; i--) {
			System.out.print(characters[i]);
		}
		System.out.println();
	}

}
