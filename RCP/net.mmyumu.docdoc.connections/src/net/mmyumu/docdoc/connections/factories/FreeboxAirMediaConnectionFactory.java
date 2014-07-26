package net.mmyumu.docdoc.connections.factories;

import javax.inject.Inject;

import net.mmyumu.docdoc.connections.AirMediaConnection;
import net.mmyumu.docdoc.connections.AirMediaConnectionFactory;
import net.mmyumu.docdoc.connections.httpurlconnections.FreeboxAirMediaHttpURLConnection;

import org.eclipse.e4.core.contexts.ContextInjectionFactory;
import org.eclipse.e4.core.contexts.IEclipseContext;

public class FreeboxAirMediaConnectionFactory implements
		AirMediaConnectionFactory {

	@Inject
	private IEclipseContext context;

	@Override
	public AirMediaConnection instance() {
		return ContextInjectionFactory.make(
				FreeboxAirMediaHttpURLConnection.class, context);
	}

}
