package net.mmyumu.docdoc.game.location.pages;

import net.mmyumu.docdoc.game.location.PreferencesManager;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.IPreferenceStore;

import com.opcoach.e4.preferences.ScopedPreferenceStore;

public class DefaultValuesInitializer extends AbstractPreferenceInitializer {

	public DefaultValuesInitializer() {
	}

	@Override
	public void initializeDefaultPreferences() {
		IPreferenceStore store = new ScopedPreferenceStore(
				InstanceScope.INSTANCE, PreferencesManager.ID);
		store.setDefault(PreferencesManager.GAME_LOCATION, "toto");
	}
}
