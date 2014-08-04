package net.mmyumu.docdoc.connections;

import javax.inject.Inject;

import org.eclipse.e4.core.di.InjectorFactory;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.core.di.extensions.Preference;
import org.osgi.service.log.LogService;

public class PreferencesManager {

	@Inject
	private LogService logService;

	public final static String AIRMEDIA_TYPE = "airmedia.type";

	public final static String ID = Activator.PLUGIN_ID;

	public final static String SCOPE = "/instance/";

	@Inject
	@Optional
	public void trackAirMediaTypeSettings(
			@Preference(nodePath = SCOPE + ID, value = AIRMEDIA_TYPE) String airMediaTypePref) {
		AirMediaType airMediaType = AirMediaType.get(airMediaTypePref);

		logService.log(LogService.LOG_DEBUG, "Air Media Type changed to "
				+ airMediaType);
		// logger.log(LogService.LOG_DEBUG, "Air Media Type changed to "
		// + airMediaType);
		InjectorFactory.getDefault()
				.addBinding(AirMediaConnectionFactory.class)
				.implementedBy(airMediaType.getFactoryClass());
	}
}
