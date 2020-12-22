package c.editors.plain;

import a.editors.Printer;
import a.editors.Validator;

public class PlainValidator extends Validator {

	@Override
	public void validate() {
		System.out.println("Plain Validating");

	}

	@Override
	public Printer createPrinter() {
		return new PlainPrinter();
	}

}
