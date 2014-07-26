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

import net.mmyumu.docdoc.ui.dialogs.ImageFileDialog;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.swt.widgets.Shell;

public class AirMediaOpenHandler {

	private Shell shell;

	@Execute
	public void execute(Shell shell) {
		this.shell = shell;
		openImageToSendToAirMediaServer();
	}

	private void openImageToSendToAirMediaServer() {
		String filePath = getFilePathFromDialog();
		if (filePath != null) {
			sendImageToAirMediaServer();
		}
	}

	private void sendImageToAirMediaServer() {

	}

	private String getFilePathFromDialog() {
		ImageFileDialog dialog = new ImageFileDialog(shell);
		String filePath = dialog.open();

		return filePath;
	}
}
