package b.targil.printers.tests;

import b.targil.interfaces.Configurable;
import b.targil.printers.Printer;
import b.targil.printers.TextPrinter;
import b.targil.printers.XMLPrinter;
import b.targil.vehicles.FamilyCar;
import b.targil.vehicles.SportsCar;

public class Test1 {

	public static void main(String[] args) {

		// how to know if the reference points to a configurable object - instanceof
		Printer printer;

		printer = new TextPrinter();
		System.out.println(printer instanceof Configurable);

		printer = new XMLPrinter();
		System.out.println(printer instanceof Configurable);

		// find the configurables in an array of objects
		Object[] objects = new Object[5];
		objects[0] = "AAA";
		objects[1] = new FamilyCar(111);
		objects[2] = new SportsCar(222);
		objects[3] = new XMLPrinter();
		objects[4] = new TextPrinter();

		for (int i = 0; i < objects.length; i++) {
			if (objects[i] instanceof Configurable) {
				System.out.println("element  at index " + i + " is configurable");
				((Configurable) objects[i]).resotreDefaultSettings();
			} else {
				System.out.println("element  at index " + i + " is NOT configurable");
			}
		}

		// array of configurable objects
		Configurable[] arr = new Configurable[5];
		arr[0] = new SportsCar(111);
		arr[1] = new TextPrinter();
//		arr[2] = new XMLPrinter();

	}

}
