/**
 */
package net.mmyumu.docdoc.model.Library;

import net.mmyumu.docdoc.model.Cards.Cards;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Library</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mmyumu.docdoc.model.Library.Library#getCards <em>Cards</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mmyumu.docdoc.model.Library.LibraryPackage#getLibrary()
 * @model
 * @generated
 */
public interface Library extends EObject {
	/**
	 * Returns the value of the '<em><b>Cards</b></em>' reference list.
	 * The list contents are of type {@link net.mmyumu.docdoc.model.Cards.Cards}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cards</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cards</em>' reference list.
	 * @see net.mmyumu.docdoc.model.Library.LibraryPackage#getLibrary_Cards()
	 * @model
	 * @generated
	 */
	EList<Cards> getCards();

} // Library
