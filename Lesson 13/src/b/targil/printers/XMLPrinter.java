package b.targil.printers;

public class XMLPrinter extends Printer {

	@Override
	public void print(String text) {
		System.out.println("<header>");
		System.out.println(
				"\txml printer is printing [" + "colors: " + getColors() + ", orientation: " + getOrientation() + "]");
		System.out.println("</header>");
		System.out.println("<body>");
		System.out.println("\t" + text);
		System.out.println("</body>");
	}

	public static void main(String[] args) {
		XMLPrinter p = new XMLPrinter();
		p.print("aaa");
		System.out.println();
		System.out.println();
		System.out.println();
		p.setOrientation(Orientation.LANDSCAPE);
		p.setColors(Colors.COLOR);
		p.print("bbb");
		System.out.println();

//		p.resotreDefaultSettings();
//		p.print("ccc");

	}

}
