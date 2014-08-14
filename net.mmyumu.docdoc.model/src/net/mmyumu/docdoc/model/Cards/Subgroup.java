/**
 */
package net.mmyumu.docdoc.model.Cards;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subgroup</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Subgroup#getTemplateEffect <em>Template Effect</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Subgroup#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getSubgroup()
 * @model extendedMetaData="name='Subgroup' kind='elementOnly'"
 * @generated
 */
public interface Subgroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Template Effect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Effect</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Effect</em>' containment reference.
	 * @see #setTemplateEffect(EObject)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getSubgroup_TemplateEffect()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='TemplateEffect' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getTemplateEffect();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Subgroup#getTemplateEffect <em>Template Effect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Effect</em>' containment reference.
	 * @see #getTemplateEffect()
	 * @generated
	 */
	void setTemplateEffect(EObject value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(EObject)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getSubgroup_Target()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Target' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getTarget();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Subgroup#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(EObject value);

} // Subgroup
