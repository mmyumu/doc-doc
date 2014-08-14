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
package net.mmyumu.docdoc.library.parts;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import net.mmyumu.docdoc.game.location.GameLocationUtils;
import net.mmyumu.docdoc.library.LibraryLoader;
import net.mmyumu.docdoc.library.exceptions.LibraryException;

import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.e4.ui.di.Focus;
import org.eclipse.e4.ui.di.Persist;
import org.eclipse.e4.ui.model.application.ui.MDirtyable;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

public class CardsPart {

	private Text txtInput;
	private TableViewer tableViewer;

	@Inject
	private Logger logger;

	@Inject
	private MDirtyable dirty;

	@Inject
	private GameLocationUtils gameLocationUtils;

	@PostConstruct
	public void createComposite(Composite parent) {
		parent.setLayout(new GridLayout(1, false));

		initSearchText(parent);

		initTableViewer(parent);
		addData();
	}

	private void initSearchText(Composite parent) {
		txtInput = new Text(parent, SWT.BORDER);
		txtInput.setMessage("Enter text to mark part as dirty");
		txtInput.addModifyListener(new ModifyListener() {
			@Override
			public void modifyText(ModifyEvent e) {
				dirty.setDirty(true);
			}
		});
		txtInput.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
	}

	private void initTableViewer(Composite parent) {
		tableViewer = new CardsTableViewer(parent);
	}

	private void addData() {
		loadLibrary();
		List<String> datas = new ArrayList<>();
		datas.add("test 2");
		tableViewer.setInput(datas);
	}

	private void loadLibrary() {
		LibraryLoader libraryLoader = new LibraryLoader(
				gameLocationUtils.getGameFolder());
		try {
			libraryLoader.load();
		} catch (LibraryException e) {
			logger.error(e, "Error while loading cards library");
			displayLoadingErrorMessage();
		}
	}

	private void displayLoadingErrorMessage() {
		MessageDialog.openError(tableViewer.getTable().getShell(), "Error",
				"Error occured while loading cards library");
	}

	@Focus
	public void setFocus() {
		tableViewer.getTable().setFocus();
	}

	@Persist
	public void save() {
		dirty.setDirty(false);
	}
}