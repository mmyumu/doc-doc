/*******************************************************************************
 * Copyright (c) 2010 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Lars Vogel <lars.Vogel@gmail.com> - Bug 419770
 *******************************************************************************/
package net.mmyumu.docdoc.ui.handlers;

import javax.inject.Inject;

import net.mmyumu.docdoc.connections.AirMediaConnection;
import net.mmyumu.docdoc.connections.AirMediaConnectionFactory;
import net.mmyumu.docdoc.connections.exceptions.AirMediaConnectionException;
import net.mmyumu.docdoc.ui.dialogs.ImageFileDialog;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.swt.widgets.Shell;

public class AirMediaOpenHandler {
	@Inject
	private Logger logger;

	private AirMediaConnectionFactory airMediaConnectionFactory;

	private Shell shell;

	@Execute
	public void execute(Shell shell,
			AirMediaConnectionFactory airMediaConnectionFactory) {
		this.shell = shell;
		airMediaConnectionFactory.instance();
		this.airMediaConnectionFactory = airMediaConnectionFactory;
		openImageToSendToAirMediaServer();
	}

	private void openImageToSendToAirMediaServer() {
		String filePath = getFilePathFromDialog();
		if (filePath != null) {
			sendImageToAirMediaServer(filePath);
		}
	}

	private void sendImageToAirMediaServer(String filePath) {
		AirMediaConnection airMediaConnection = airMediaConnectionFactory
				.instance();
		try {
			airMediaConnection.send(filePath);
			String response = airMediaConnection.readResponse();
			logger.info(response);
		} catch (AirMediaConnectionException e) {
			logger.error(e, "Error while sending image to Air Media Server");
		}
	}

	private String getFilePathFromDialog() {
		ImageFileDialog dialog = new ImageFileDialog(shell);
		String filePath = dialog.open();

		return filePath;
	}
}
