/**
 */
package net.mmyumu.docdoc.model.Cards;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>On Going</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.OnGoing#getCondition <em>Condition</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.OnGoing#getDuration <em>Duration</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.OnGoing#getSuicideParent <em>Suicide Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getOnGoing()
 * @model extendedMetaData="name='OnGoing' kind='elementOnly'"
 * @generated
 */
public interface OnGoing extends EObject {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Condition)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getOnGoing_Condition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Condition' namespace='##targetNamespace'"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.OnGoing#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getOnGoing_Duration()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Duration' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDuration();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.OnGoing#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(String value);

	/**
	 * Returns the value of the '<em><b>Suicide Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Suicide Parent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Suicide Parent</em>' attribute.
	 * @see #setSuicideParent(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getOnGoing_SuicideParent()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='SuicideParent' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSuicideParent();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.OnGoing#getSuicideParent <em>Suicide Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Suicide Parent</em>' attribute.
	 * @see #getSuicideParent()
	 * @generated
	 */
	void setSuicideParent(String value);

} // OnGoing
