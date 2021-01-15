package bridge.printers;

/**
 * Reversed + tabbed
 *
 */
public class MidPrinterRefinedAbstraction extends PrinterAbstraction {

	@Override
	protected void loadPrinterImplementors() {
		this.implementors.add(new ConcreteReveresePrinterImplementor());
		this.implementors.add(new ConcreteTabbedPrinterImplementor());
	}

}
