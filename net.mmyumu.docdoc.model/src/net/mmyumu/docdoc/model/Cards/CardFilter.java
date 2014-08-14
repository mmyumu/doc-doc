/**
 */
package net.mmyumu.docdoc.model.Cards;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Card Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeUnitType <em>Include Unit Type</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.CardFilter#getSide <em>Side</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCardFilter()
 * @model extendedMetaData="name='CardFilter' kind='empty'"
 * @generated
 */
public interface CardFilter extends EObject {
	/**
	 * Returns the value of the '<em><b>Include Unit Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include Unit Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Unit Type</em>' attribute.
	 * @see #setIncludeUnitType(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCardFilter_IncludeUnitType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='IncludeUnitType' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIncludeUnitType();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeUnitType <em>Include Unit Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Unit Type</em>' attribute.
	 * @see #getIncludeUnitType()
	 * @generated
	 */
	void setIncludeUnitType(String value);

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
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCardFilter_Side()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Side' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSide();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getSide <em>Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Side</em>' attribute.
	 * @see #getSide()
	 * @generated
	 */
	void setSide(String value);

} // CardFilter
