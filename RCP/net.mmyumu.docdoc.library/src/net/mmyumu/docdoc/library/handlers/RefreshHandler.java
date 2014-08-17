package net.mmyumu.docdoc.library.handlers;

import net.mmyumu.docdoc.library.parts.CardsPart;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.ui.basic.MPart;

public class RefreshHandler {
	@Execute
	public void execute(MPart part) {
		CardsPart cardsPart = (CardsPart) part.getObject();
		cardsPart.addData();
	}
}
