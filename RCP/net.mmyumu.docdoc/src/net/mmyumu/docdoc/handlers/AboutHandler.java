/*******************************************************************************
 * Copyright (c) 2010 - 2013 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     Lars Vogel <lars.Vogel@gmail.com> - Bug 419770
 *******************************************************************************/
package net.mmyumu.docdoc.handlers;

import net.mmyumu.docdoc.connections.AirMediaType;
import net.mmyumu.docdoc.connections.PreferencesManager;

import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.extensions.Preference;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;

public class AboutHandler {
	@Execute
	public void execute(Shell shell,
			@Preference(nodePath = PreferencesManager.SCOPE
					+ PreferencesManager.ID) IEclipsePreferences prefs) {
		prefs.put(PreferencesManager.AIRMEDIA_TYPE,
				AirMediaType.BBOX.toString());
		MessageDialog.openInformation(shell, "About",
				"Eclipse 4 Application example.");
	}
}
