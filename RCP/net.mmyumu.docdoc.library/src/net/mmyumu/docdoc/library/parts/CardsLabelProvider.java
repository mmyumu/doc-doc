package net.mmyumu.docdoc.library.parts;

import net.mmyumu.docdoc.model.Cards.Card;

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

public class CardsLabelProvider extends LabelProvider implements
		ITableLabelProvider {

	@Override
	public Image getColumnImage(Object element, int columnIndex) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getColumnText(Object element, int columnIndex) {
		if (element instanceof Card) {
			Card card = (Card) element;
			return card.getDisplayName();
		}
		return null;
	}
}
