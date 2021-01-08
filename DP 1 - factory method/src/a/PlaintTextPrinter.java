package a;

public class PlaintTextPrinter implements Printer {

	private String description;
	private String ink;

	public PlaintTextPrinter(String description, String ink) {
		super();
		this.description = description;
		this.ink = ink;
	}

	@Override
	public void print(String content) {
		System.out.println(this.description);
		System.out.println("==========================");
		System.out.println(content);
		System.out.println("==========================\n");
	}

	@Override
	public String getPrinterDescription() {
		return description;
	}

	@Override
	public String getInk() {
		return ink;
	}

}
