package net.mmyumu.docdoc.game.location;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.Preference;
import org.osgi.service.log.LogService;

public class PreferencesManager {

	@Inject
	private LogService logService;

	public final static String GAME_LOCATION = "game.location";

	public final static String ID = Activator.PLUGIN_ID;

	public final static String SCOPE = "/instance/";

	@Inject
	@Optional
	public void trackGameLocationSetting(
			@Preference(nodePath = SCOPE + ID, value = GAME_LOCATION) String gameLocationPref) {
		System.out.println(gameLocationPref);
		logService.log(LogService.LOG_DEBUG, "Game location changed to: "
				+ gameLocationPref);
	}
}
