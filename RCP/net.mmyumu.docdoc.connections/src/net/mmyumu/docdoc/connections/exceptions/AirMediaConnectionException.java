package net.mmyumu.docdoc.connections.exceptions;

public class AirMediaConnectionException extends Exception {

	private static final long serialVersionUID = 1L;

	public AirMediaConnectionException(String message, Throwable cause) {
		super(message, cause);
	}

	public AirMediaConnectionException(String message) {
		super(message);
	}
}
