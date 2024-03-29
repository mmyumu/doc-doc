package net.mmyumu.docdoc.library;

import java.io.File;
import java.io.IOException;

import javax.inject.Inject;

import net.mmyumu.docdoc.library.exceptions.LibraryException;
import net.mmyumu.docdoc.model.Cards.DocumentRoot;
import net.mmyumu.docdoc.model.Cards.util.CardsResourceFactoryImpl;
import net.mmyumu.docdoc.model.Library.Library;
import net.mmyumu.docdoc.model.Library.LibraryFactory;

import org.eclipse.e4.core.services.log.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

public class LibraryLoader {

	private final static String SET_IDENTIFIER = "cards";

	private final static String SET_EXTENSION = ".xml";

	@Inject
	private Logger logger;

	private String gameLocation;

	private ResourceFactoryImpl resourceFactory;

	private Library library;

	/**
	 * Instantiates a new library loader. Needed for injection.
	 */
	public LibraryLoader() {
		this.resourceFactory = new CardsResourceFactoryImpl();
		if (library == null) {
			library = LibraryFactory.eINSTANCE.createLibrary();
		}
	}

	public void setGameLocation(String gameLocation) {
		this.gameLocation = gameLocation;
	}

	public Library load() throws LibraryException {
		if (gameLocation != null) {
			loadLibrary(gameLocation);
			return library;
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
		Resource resource = resourceFactory.createResource(URI
				.createFileURI(setPath));
		resource.load(null);
		DocumentRoot documentRoot = (DocumentRoot) resource.getContents()
				.get(0);
		library.getCards().add(documentRoot.getCards());
		logger.info("Loaded: " + setPath);
	}
}
