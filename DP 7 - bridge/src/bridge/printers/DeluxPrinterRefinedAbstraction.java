package bridge.printers;

/**
 * lower case + upper case + Reversed + tabbed
 *
 */
public class DeluxPrinterRefinedAbstraction extends PrinterAbstraction {

	@Override
	protected void loadPrinterImplementors() {
		this.implementors.add(new ConcreteLowerPrinterImplementor());
		this.implementors.add(new ConcreteUpperPrinterImplementor());
		this.implementors.add(new ConcreteReveresePrinterImplementor());
		this.implementors.add(new ConcreteTabbedPrinterImplementor());
	}

}
