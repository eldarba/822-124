package c.editors.plain;

import a.editors.Editor;
import b.editors.EditorFactory;

public class PlainEditorFactory extends EditorFactory {

	@Override
	public Editor createEditor() {
		return new PlainEditor();
	}

}
