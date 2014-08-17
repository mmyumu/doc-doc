/**
 */
package net.mmyumu.docdoc.model.Cards;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Condition#getCondition <em>Condition</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Condition#getOperator <em>Operator</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Condition#getValueA <em>Value A</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Condition#getValueB <em>Value B</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCondition()
 * @model extendedMetaData="name='Condition' kind='elementOnly'"
 * @generated
 */
public interface Condition extends EObject {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference list.
	 * The list contents are of type {@link net.mmyumu.docdoc.model.Cards.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference list.
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCondition_Condition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Condition' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Condition> getCondition();

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
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCondition_Operator()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Operator' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOperator();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Condition#getOperator <em>Operator</em>}' attribute.
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
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCondition_ValueA()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ValueA' namespace='##targetNamespace'"
	 * @generated
	 */
	String getValueA();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Condition#getValueA <em>Value A</em>}' attribute.
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
	 * @see #setValueB(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCondition_ValueB()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ValueB' namespace='##targetNamespace'"
	 * @generated
	 */
	String getValueB();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Condition#getValueB <em>Value B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value B</em>' attribute.
	 * @see #getValueB()
	 * @generated
	 */
	void setValueB(String value);

} // Condition
