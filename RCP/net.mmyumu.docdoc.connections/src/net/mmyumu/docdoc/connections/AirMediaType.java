package net.mmyumu.docdoc.connections;

import net.mmyumu.docdoc.connections.factories.BBoxAirMediaConnectionFactory;
import net.mmyumu.docdoc.connections.factories.FreeboxAirMediaConnectionFactory;

public enum AirMediaType {
	FREEBOX(FreeboxAirMediaConnectionFactory.class), BBOX(
			BBoxAirMediaConnectionFactory.class);

	private Class<? extends AirMediaConnectionFactory> factoryClass;

	private AirMediaType(Class<? extends AirMediaConnectionFactory> factoryClass) {
		this.factoryClass = factoryClass;
	}

	public Class<? extends AirMediaConnectionFactory> getFactoryClass() {
		return factoryClass;
	}

	public static AirMediaType get(String value) {
		if (value == null) {
			return FREEBOX;
		}
		return valueOf(value);
	}
}
