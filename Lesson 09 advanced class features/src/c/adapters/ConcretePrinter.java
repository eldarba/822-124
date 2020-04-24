package c.adapters;

public class ConcretePrinter extends AbstractPrinter {

	// must implement all - do I have to? YES

	@Override
	public void printText() {
		System.out.println("printing text");

	}

	@Override
	public void printImage() {
		System.out.println("printing image");

	}

	@Override
	public void printXML() {
		System.out.println("printing XML");

	}

	@Override
	public void printHTML() {
		System.out.println("printing HTML");

	}

}
