package net.mmyumu.docdoc.game.location.pages;

import net.mmyumu.docdoc.game.location.PreferencesManager;

import org.eclipse.jface.preference.FieldEditorPreferencePage;

public class RootPage extends FieldEditorPreferencePage {

	public RootPage() {
		super(GRID);
	}

	@Override
	protected void createFieldEditors() {
		addField(new ExeFileFieldEditor(PreferencesManager.GAME_LOCATION,
				"Game executable file path", getFieldEditorParent()));
	}
}
