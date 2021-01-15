package bridge.printers;

/**
 * lower case + upper case
 *
 */
public class RegularPrinterRefinedAbstraction extends PrinterAbstraction {

	@Override
	protected void loadPrinterImplementors() {
		this.implementors.add(new ConcreteLowerPrinterImplementor());
		this.implementors.add(new ConcreteUpperPrinterImplementor());
	}

}
