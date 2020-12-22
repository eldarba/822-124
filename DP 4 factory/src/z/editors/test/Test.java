package z.editors.test;

import a.editors.Editor;
import a.editors.Printer;
import a.editors.Validator;
import b.editors.EditorFactory;
import c.editors.plain.PlainEditorFactory;

public class Test {

	public static void main(String[] args) {

		EditorFactory editorFactory = new PlainEditorFactory();

		Editor editor = editorFactory.createEditor();
		Validator validator = editor.createValidator();
		Printer printer = validator.createPrinter();

		editor.edit();
		validator.validate();
		printer.print();

	}

}
