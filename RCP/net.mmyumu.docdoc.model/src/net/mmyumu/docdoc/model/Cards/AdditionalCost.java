/**
 */
package net.mmyumu.docdoc.model.Cards;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Additional Cost</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.AdditionalCost#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getAdditionalCost()
 * @model extendedMetaData="name='AdditionalCost' kind='elementOnly'"
 * @generated
 */
public interface AdditionalCost extends EObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(Target)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getAdditionalCost_Target()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Target' namespace='##targetNamespace'"
	 * @generated
	 */
	Target getTarget();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.AdditionalCost#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Target value);

} // AdditionalCost
