package net.mmyumu.docdoc.library;

import java.io.File;
import java.io.IOException;

import net.mmyumu.docdoc.library.exceptions.LibraryException;
import net.mmyumu.docdoc.model.Cards.util.CardsResourceFactoryImpl;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

public class LibraryLoader {

	private final static String SET_IDENTIFIER = "cards";

	private final static String SET_EXTENSION = ".xml";

	private String gameLocation;

	private ResourceFactoryImpl resourceFactory;

	public LibraryLoader(String gameLocation) {
		this.gameLocation = gameLocation;
		this.resourceFactory = new CardsResourceFactoryImpl();
	}

	public void load() throws LibraryException {
		if (gameLocation != null) {
			loadLibrary(gameLocation);
		} else {
			throw new LibraryException("The game location is not valid");
		}
	}

	private void loadLibrary(String gameLocation) throws LibraryException {
		File gameFolder = new File(gameLocation);

		for (final File file : gameFolder.listFiles()) {
			if (isSetFile(file)) {
				loadSet(file.getAbsolutePath());
			}
		}
	}

	private boolean isSetFile(File file) {
		return file.getName().startsWith(SET_IDENTIFIER)
				&& file.getName().endsWith(SET_EXTENSION);
	}

	private void loadSet(String setPath) throws LibraryException {
		try {
			loadSetWithErrors(setPath);
		} catch (IOException e) {
			throw new LibraryException("Cannot load set of cards", e);
		}
	}

	private void loadSetWithErrors(String setPath) throws IOException {
		this.resourceFactory = new CardsResourceFactoryImpl();
		Resource resource = resourceFactory.createResource(URI
				.createFileURI(setPath));
		resource.load(null);
		EObject object = resource.getContents().get(0);
		System.out.println("OK=" + setPath);
	}
}
