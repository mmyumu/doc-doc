/**
 */
package net.mmyumu.docdoc.model.Cards;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cards</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Cards#getCard <em>Card</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCards()
 * @model extendedMetaData="name='Cards' kind='elementOnly'"
 * @generated
 */
public interface Cards extends EObject {
	/**
	 * Returns the value of the '<em><b>Card</b></em>' containment reference list.
	 * The list contents are of type {@link net.mmyumu.docdoc.model.Cards.Card}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Card</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card</em>' containment reference list.
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCards_Card()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Card' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Card> getCard();

} // Cards
