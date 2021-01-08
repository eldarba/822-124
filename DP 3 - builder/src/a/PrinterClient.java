package a;

public class PrinterClient {

	public static void main(String[] args) {

		Printer printer = new Printer.Builder("plain", "color", "1500SE").build();
		Printer printer2 = new Printer.Builder("plain", "color", "1500SE").setFaxEnabled(true).build();

		System.out.println(printer);
		System.out.println(printer2);

	}

}
