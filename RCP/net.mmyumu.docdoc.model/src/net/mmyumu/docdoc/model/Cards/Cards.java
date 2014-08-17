/**
 */
package net.mmyumu.docdoc.model.Cards;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cards</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Cards#getGroup <em>Group</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Cards#getCard <em>Card</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Cards#getExistingCard <em>Existing Card</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Cards#getTemplateEffect <em>Template Effect</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCards()
 * @model extendedMetaData="name='Cards' kind='elementOnly'"
 * @generated
 */
public interface Cards extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCards_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

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
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Card' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<Card> getCard();

	/**
	 * Returns the value of the '<em><b>Existing Card</b></em>' containment reference list.
	 * The list contents are of type {@link net.mmyumu.docdoc.model.Cards.ExistingCard}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Existing Card</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Existing Card</em>' containment reference list.
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCards_ExistingCard()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='ExistingCard' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<ExistingCard> getExistingCard();

	/**
	 * Returns the value of the '<em><b>Template Effect</b></em>' containment reference list.
	 * The list contents are of type {@link net.mmyumu.docdoc.model.Cards.TemplateEffect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Effect</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Effect</em>' containment reference list.
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCards_TemplateEffect()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TemplateEffect' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<TemplateEffect> getTemplateEffect();

} // Cards
