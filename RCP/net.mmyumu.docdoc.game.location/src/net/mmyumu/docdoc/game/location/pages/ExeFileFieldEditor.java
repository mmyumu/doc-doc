package net.mmyumu.docdoc.game.location.pages;

import org.eclipse.jface.preference.FileFieldEditor;
import org.eclipse.swt.widgets.Composite;

public class ExeFileFieldEditor extends FileFieldEditor {

	private static String[] fileExtensions = new String[] { "Game.exe" };

	public ExeFileFieldEditor(String name, String labelText, Composite parent) {
		super(name, labelText, parent);
		setFileExtensions(fileExtensions);
	}
}
