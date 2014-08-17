/**
 */
package net.mmyumu.docdoc.model.Library.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import net.mmyumu.docdoc.model.Cards.Card;
import net.mmyumu.docdoc.model.Cards.Cards;
import net.mmyumu.docdoc.model.Library.Library;
import net.mmyumu.docdoc.model.Library.LibraryPackage;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Library</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.mmyumu.docdoc.model.Library.impl.LibraryImpl#getCards <em>Cards</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LibraryImpl extends MinimalEObjectImpl.Container implements
		Library {
	/**
	 * The cached value of the '{@link #getCards() <em>Cards</em>}' reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getCards()
	 * @generated
	 * @ordered
	 */
	protected EList<Cards> cards;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected LibraryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LibraryPackage.Literals.LIBRARY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Cards> getCards() {
		if (cards == null) {
			cards = new EObjectResolvingEList<Cards>(Cards.class, this, LibraryPackage.LIBRARY__CARDS);
		}
		return cards;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case LibraryPackage.LIBRARY__CARDS:
				return getCards();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case LibraryPackage.LIBRARY__CARDS:
				getCards().clear();
				getCards().addAll((Collection<? extends Cards>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case LibraryPackage.LIBRARY__CARDS:
				getCards().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case LibraryPackage.LIBRARY__CARDS:
				return cards != null && !cards.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * Get a list of all the Card of the library.
	 * 
	 * @generated not
	 */
	public List<Card> getAllCard() {
		List<Card> allCardFromLibrary = new ArrayList<>();
		for (Cards cards : getCards()) {
			allCardFromLibrary.addAll(cards.getCard());
		}
		return allCardFromLibrary;
	}

} // LibraryImpl
