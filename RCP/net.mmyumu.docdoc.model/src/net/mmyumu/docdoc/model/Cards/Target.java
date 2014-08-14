/**
 */
package net.mmyumu.docdoc.model.Cards;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Target#getOption <em>Option</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Target#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Target#getEffect <em>Effect</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Target#getSubgroup <em>Subgroup</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Target#getAmount <em>Amount</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Target#getSide <em>Side</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Target#getZone <em>Zone</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTarget()
 * @model extendedMetaData="name='Target' kind='elementOnly'"
 * @generated
 */
public interface Target extends EObject {
	/**
	 * Returns the value of the '<em><b>Option</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Option</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option</em>' containment reference.
	 * @see #setOption(EObject)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTarget_Option()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Option' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getOption();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Target#getOption <em>Option</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option</em>' containment reference.
	 * @see #getOption()
	 * @generated
	 */
	void setOption(EObject value);

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' containment reference.
	 * @see #setTrigger(EObject)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTarget_Trigger()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Trigger' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getTrigger();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Target#getTrigger <em>Trigger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' containment reference.
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(EObject value);

	/**
	 * Returns the value of the '<em><b>Effect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effect</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect</em>' containment reference.
	 * @see #setEffect(EObject)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTarget_Effect()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Effect' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getEffect();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Target#getEffect <em>Effect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Effect</em>' containment reference.
	 * @see #getEffect()
	 * @generated
	 */
	void setEffect(EObject value);

	/**
	 * Returns the value of the '<em><b>Subgroup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subgroup</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subgroup</em>' containment reference.
	 * @see #setSubgroup(EObject)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTarget_Subgroup()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Subgroup' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getSubgroup();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Target#getSubgroup <em>Subgroup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subgroup</em>' containment reference.
	 * @see #getSubgroup()
	 * @generated
	 */
	void setSubgroup(EObject value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTarget_Amount()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Amount' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAmount();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Target#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(String value);

	/**
	 * Returns the value of the '<em><b>Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Side</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Side</em>' attribute.
	 * @see #setSide(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTarget_Side()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Side' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSide();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Target#getSide <em>Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Side</em>' attribute.
	 * @see #getSide()
	 * @generated
	 */
	void setSide(String value);

	/**
	 * Returns the value of the '<em><b>Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zone</em>' attribute.
	 * @see #setZone(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTarget_Zone()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Zone' namespace='##targetNamespace'"
	 * @generated
	 */
	String getZone();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Target#getZone <em>Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zone</em>' attribute.
	 * @see #getZone()
	 * @generated
	 */
	void setZone(String value);

} // Target
