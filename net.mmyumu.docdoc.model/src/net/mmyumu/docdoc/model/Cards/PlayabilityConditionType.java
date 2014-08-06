/**
 */
package net.mmyumu.docdoc.model.Cards;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Playability Condition Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.PlayabilityConditionType#getOperator <em>Operator</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.PlayabilityConditionType#getValueA <em>Value A</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.PlayabilityConditionType#getValueB <em>Value B</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getPlayabilityConditionType()
 * @model extendedMetaData="name='PlayabilityCondition_._type' kind='empty'"
 * @generated
 */
public interface PlayabilityConditionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see #setOperator(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getPlayabilityConditionType_Operator()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Operator' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOperator();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.PlayabilityConditionType#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(String value);

	/**
	 * Returns the value of the '<em><b>Value A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value A</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value A</em>' attribute.
	 * @see #setValueA(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getPlayabilityConditionType_ValueA()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ValueA' namespace='##targetNamespace'"
	 * @generated
	 */
	String getValueA();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.PlayabilityConditionType#getValueA <em>Value A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value A</em>' attribute.
	 * @see #getValueA()
	 * @generated
	 */
	void setValueA(String value);

	/**
	 * Returns the value of the '<em><b>Value B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value B</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value B</em>' attribute.
	 * @see #isSetValueB()
	 * @see #unsetValueB()
	 * @see #setValueB(int)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getPlayabilityConditionType_ValueB()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='ValueB' namespace='##targetNamespace'"
	 * @generated
	 */
	int getValueB();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.PlayabilityConditionType#getValueB <em>Value B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value B</em>' attribute.
	 * @see #isSetValueB()
	 * @see #unsetValueB()
	 * @see #getValueB()
	 * @generated
	 */
	void setValueB(int value);

	/**
	 * Unsets the value of the '{@link net.mmyumu.docdoc.model.Cards.PlayabilityConditionType#getValueB <em>Value B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetValueB()
	 * @see #getValueB()
	 * @see #setValueB(int)
	 * @generated
	 */
	void unsetValueB();

	/**
	 * Returns whether the value of the '{@link net.mmyumu.docdoc.model.Cards.PlayabilityConditionType#getValueB <em>Value B</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Value B</em>' attribute is set.
	 * @see #unsetValueB()
	 * @see #getValueB()
	 * @see #setValueB(int)
	 * @generated
	 */
	boolean isSetValueB();

} // PlayabilityConditionType
