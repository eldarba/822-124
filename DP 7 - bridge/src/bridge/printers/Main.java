package bridge.printers;

public class Main {

	public static void main(String[] args) {

		PrinterAbstraction regular = new RegularPrinterRefinedAbstraction();
		PrinterAbstraction mid = new MidPrinterRefinedAbstraction();
		PrinterAbstraction delux = new DeluxPrinterRefinedAbstraction();

		regular.printInAllFormats("Regular");
		System.out.println("============");
		mid.printInAllFormats("Middle");
		System.out.println("============");
		delux.printInAllFormats("Delux");
	}

}
