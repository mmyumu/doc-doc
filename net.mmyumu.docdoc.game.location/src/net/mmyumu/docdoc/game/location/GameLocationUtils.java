package net.mmyumu.docdoc.game.location;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.e4.core.di.annotations.Creatable;
import org.eclipse.e4.core.di.extensions.Preference;

@Singleton
@Creatable
public class GameLocationUtils {

	private final static String GAME_EXE = "Game.exe";

	private IEclipsePreferences store;

	@Inject
	public GameLocationUtils(@Preference(nodePath = PreferencesManager.SCOPE
			+ PreferencesManager.ID) IEclipsePreferences store) {
		this.store = store;
	}

	public String getGameFolder() {
		String gameExePath = store.get(PreferencesManager.GAME_LOCATION, null);
		if (gameExePath != null) {
			return getGameFolderFromGameExePath(gameExePath);
		}
		return null;
	}

	private String getGameFolderFromGameExePath(String gameExePath) {
		if (gameExePath.endsWith(GAME_EXE)) {
			return gameExePath.substring(0,
					gameExePath.length() - GAME_EXE.length());
		}
		return null;
	}
}
