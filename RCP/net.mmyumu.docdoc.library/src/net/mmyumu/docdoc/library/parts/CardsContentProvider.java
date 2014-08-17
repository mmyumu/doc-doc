package net.mmyumu.docdoc.library.parts;

import net.mmyumu.docdoc.model.Library.Library;

import org.eclipse.jface.viewers.IStructuredContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class CardsContentProvider implements IStructuredContentProvider {

	@Override
	public void dispose() {
	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}

	@Override
	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof Library) {
			Library library = (Library) inputElement;
			return library.getAllCard().toArray();
		}
		return null;
	}
}
