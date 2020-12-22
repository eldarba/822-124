package c.editors.plain;

import a.editors.Editor;
import a.editors.Validator;

public class PlainEditor extends Editor {

	@Override
	public void edit() {
		System.out.println("Plain Editing");

	}

	@Override
	public Validator createValidator() {
		return new PlainValidator();
	}

}
