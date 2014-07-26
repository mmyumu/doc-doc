package net.mmyumu.docdoc.connections.httpurlconnections;

public class FreeboxAirMediaHttpURLConnection extends AirMediaHttpURLConnection {
	private static final String HOST = "freebox-player.local";

	private static final int PORT = 7000;

	public FreeboxAirMediaHttpURLConnection() {
		super();

	}

	@Override
	protected String getURLAsString() {
		return PROTOCOL + "://" + HOST + ":" + PORT + "/photo";
	}
}
