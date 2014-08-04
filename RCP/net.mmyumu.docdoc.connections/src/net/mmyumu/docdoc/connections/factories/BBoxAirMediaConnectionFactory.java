package net.mmyumu.docdoc.connections.factories;

import net.mmyumu.docdoc.connections.AirMediaConnection;
import net.mmyumu.docdoc.connections.AirMediaConnectionFactory;

public class BBoxAirMediaConnectionFactory implements AirMediaConnectionFactory {

	@Override
	public AirMediaConnection instance() {
		System.out.println("toto ooo");
		return null;
	}

}
