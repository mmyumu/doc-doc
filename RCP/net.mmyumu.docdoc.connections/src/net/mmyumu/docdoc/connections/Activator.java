package net.mmyumu.docdoc.connections;

import net.mmyumu.docdoc.connections.factories.FreeboxAirMediaConnectionFactory;

import org.eclipse.e4.core.di.InjectorFactory;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	private static BundleContext context;

	static BundleContext getContext() {
		return context;
	}

	@Override
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
		InjectorFactory
				.getDefault().addBinding(AirMediaConnectionFactory.class)
				.implementedBy(FreeboxAirMediaConnectionFactory.class);
	}

	@Override
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
	}

}
