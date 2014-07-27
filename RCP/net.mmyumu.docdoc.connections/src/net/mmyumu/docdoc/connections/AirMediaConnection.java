package net.mmyumu.docdoc.connections;

import net.mmyumu.docdoc.connections.exceptions.AirMediaConnectionException;

public interface AirMediaConnection {
	void send(String filePath) throws AirMediaConnectionException;

	void send(byte[] data) throws AirMediaConnectionException;

	String readResponse() throws AirMediaConnectionException;
}
