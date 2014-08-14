package net.mmyumu.docdoc.library.parts;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;

public class CardsTableViewer extends TableViewer {

	public CardsTableViewer(Composite parent) {
		super(parent);
		getTable().setLayoutData(new GridData(GridData.FILL_BOTH));
		setContentProvider(ArrayContentProvider.getInstance());
	}

}
