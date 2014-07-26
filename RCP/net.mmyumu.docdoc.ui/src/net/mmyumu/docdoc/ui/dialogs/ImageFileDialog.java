package net.mmyumu.docdoc.ui.dialogs;

import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;

public class ImageFileDialog {

	private static final String[] FILTER_EXTENSIONS = new String[] {
			"*.jpg;*.jpeg;*.jpe;*.jfif", "*.png", "*.*" };
	private static final String[] FILTER_NAMES = new String[] {
			"JPEG (*.jpg;*.jpeg;*.jpe;*.jfif)", "PNG (*.png)",
			"All Files (*.*)" };

	private FileDialog fileDialog;

	public ImageFileDialog(Shell parent) {
		fileDialog = new FileDialog(parent);
		initFilters();
	}

	private void initFilters() {
		fileDialog.setFilterExtensions(FILTER_EXTENSIONS);
		fileDialog.setFilterNames(FILTER_NAMES);
	}

	public String open() {
		return fileDialog.open();
	}
}
