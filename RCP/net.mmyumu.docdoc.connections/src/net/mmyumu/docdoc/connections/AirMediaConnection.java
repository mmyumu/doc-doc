package net.mmyumu.docdoc.connections;

import net.mmyumu.docdoc.connections.exceptions.AirMediaConnectionException;

public interface AirMediaConnection {
	void send(String filePath) throws AirMediaConnectionException;

	String readResponse() throws AirMediaConnectionException;
}
