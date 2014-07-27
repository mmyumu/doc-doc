package net.mmyumu.docdoc.connections.httpurlconnections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

import javax.inject.Inject;

import net.mmyumu.docdoc.connections.AirMediaConnection;
import net.mmyumu.docdoc.connections.exceptions.AirMediaConnectionException;

import org.eclipse.e4.core.services.log.Logger;

public abstract class AirMediaHttpURLConnection implements AirMediaConnection {

	protected static final String PROTOCOL = "http";

	private static final String METHOD = "PUT";

	@Inject
	private Logger logger;

	private HttpURLConnection httpURLConnection;

	private byte[] data;

	@Override
	public void send(String filePath) throws AirMediaConnectionException {
		URL url = getURL();

		readFileContent(filePath);
		initHttpURLConnection(url);
		sendContent();
	}

	private void readFileContent(String filePath)
			throws AirMediaConnectionException {
		try {
			data = Files.readAllBytes(Paths.get(filePath));
		} catch (IOException e) {
			throw new AirMediaConnectionException(
					"Error while getting the content of the file to send", e);
		}
	}

	private URL getURL() throws AirMediaConnectionException {
		URL url = null;
		try {
			url = new URL(getURLAsString());
		} catch (MalformedURLException e) {
			throw new AirMediaConnectionException(
					"Error while getting the URL of the Air Media Server", e);
		}
		return url;
	}

	protected abstract String getURLAsString();

	private void initHttpURLConnection(URL url)
			throws AirMediaConnectionException {
		initHttpURLConnectionFromURL(url);
		initHttpURLConnectionParameters();
		initHttpURLConnectionHeaders();
	}

	private void initHttpURLConnectionFromURL(URL url)
			throws AirMediaConnectionException {
		try {
			httpURLConnection = (HttpURLConnection) url.openConnection();
		} catch (IOException e) {
			throw new AirMediaConnectionException(
					"Error while opening Air Media Server connection", e);
		}

	}

	private void initHttpURLConnectionParameters()
			throws AirMediaConnectionException {
		httpURLConnection.setDoOutput(true);
		try {
			httpURLConnection.setRequestMethod(METHOD);
		} catch (ProtocolException e) {
			throw new AirMediaConnectionException("Error while setting method "
					+ METHOD + " to Air Media connection", e);
		}
	}

	private void initHttpURLConnectionHeaders() {
		httpURLConnection.setRequestProperty("User-Agent", "MediaControl/1.0");
		httpURLConnection.setRequestProperty("X-Apple-Transition", "None");
		httpURLConnection.setRequestProperty("Connection", "keep-alive");
		httpURLConnection.setRequestProperty(
				"Content-Length", String.valueOf(data.length));
	}

	private void sendContent() throws AirMediaConnectionException {
		OutputStream outputStream = null;
		try {
			outputStream = writeToOutputStream();
			httpURLConnection.getResponseCode();
		} catch (IOException e) {
			throw new AirMediaConnectionException(
					"Cannot get the output stream from the Air Media connection",
					e);
		} finally {
			closeOutputStream(outputStream);
		}
	}

	private OutputStream writeToOutputStream() throws IOException {
		OutputStream outputStream = httpURLConnection.getOutputStream();

		outputStream.write(data);
		outputStream.flush();
		return outputStream;
	}

	private void closeOutputStream(OutputStream outputStream)
			throws AirMediaConnectionException {
		if (outputStream != null) {
			try {
				outputStream.close();
			} catch (IOException e) {
				throw new AirMediaConnectionException(
						"Error while closing the Air Media output stream", e);
			}
		} else {
			logger.error("The output stream is already closed.");
		}
	}

	@Override
	public String readResponse() throws AirMediaConnectionException {
		StringBuilder response = new StringBuilder(readResponseCode());
		response.append("\r\n");
		response.append(readResponseBody());
		return response.toString();
	}

	private String readResponseCode() throws AirMediaConnectionException {
		try {
			return "HTTP Response Code: "
					+ String.valueOf(httpURLConnection.getResponseCode());
		} catch (IOException e) {
			throw new AirMediaConnectionException(
					"Error while getting response code of the Air Media connection",
					e);
		}
	}

	private String readResponseBody() throws AirMediaConnectionException {
		StringBuilder responseBody = new StringBuilder(
				"HTTP Response Body:\r\n");
		try {
			InputStream inputStream = httpURLConnection.getInputStream();
			InputStreamReader inputStreamReader = new InputStreamReader(
					inputStream);
			BufferedReader bufferedReader = new BufferedReader(
					inputStreamReader);
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				responseBody.append(line);
			}

			bufferedReader.close();
			inputStreamReader.close();
			inputStream.close();
		} catch (IOException e) {
			throw new AirMediaConnectionException(
					"Error while reading response body of the Air Media connection",
					e);
		}

		return responseBody.toString();
	}

	@Override
	public void send(byte[] data) throws AirMediaConnectionException {
		URL url = getURL();

		this.data = Base64.getDecoder().decode(data);
		initHttpURLConnection(url);
		sendContent();
	}
}
