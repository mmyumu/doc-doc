/**
 */
package net.mmyumu.docdoc.model.Cards;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Card Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.CardType#getExclude <em>Exclude</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.CardType#getInclude <em>Include</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCardType()
 * @model extendedMetaData="name='CardType' kind='empty'"
 * @generated
 */
public interface CardType extends EObject {
	/**
	 * Returns the value of the '<em><b>Exclude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclude</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclude</em>' attribute.
	 * @see #setExclude(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCardType_Exclude()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Exclude' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExclude();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.CardType#getExclude <em>Exclude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclude</em>' attribute.
	 * @see #getExclude()
	 * @generated
	 */
	void setExclude(String value);

	/**
	 * Returns the value of the '<em><b>Include</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include</em>' attribute.
	 * @see #setInclude(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCardType_Include()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Include' namespace='##targetNamespace'"
	 * @generated
	 */
	String getInclude();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.CardType#getInclude <em>Include</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include</em>' attribute.
	 * @see #getInclude()
	 * @generated
	 */
	void setInclude(String value);

} // CardType
