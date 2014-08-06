/**
 */
package net.mmyumu.docdoc.model.Cards;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see net.mmyumu.docdoc.model.Cards.CardsPackage
 * @generated
 */
public interface CardsFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CardsFactory eINSTANCE = net.mmyumu.docdoc.model.Cards.impl.CardsFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type</em>'.
	 * @generated
	 */
	CardsType createCardsType();

	/**
	 * Returns a new object of class '<em>Card Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Card Type</em>'.
	 * @generated
	 */
	CardType createCardType();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Effect Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Effect Type</em>'.
	 * @generated
	 */
	EffectType createEffectType();

	/**
	 * Returns a new object of class '<em>Playability Condition Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Playability Condition Type</em>'.
	 * @generated
	 */
	PlayabilityConditionType createPlayabilityConditionType();

	/**
	 * Returns a new object of class '<em>Target Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Target Type</em>'.
	 * @generated
	 */
	TargetType createTargetType();

	/**
	 * Returns a new object of class '<em>Variable Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Type</em>'.
	 * @generated
	 */
	VariableType createVariableType();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	CardsPackage getCardsPackage();

} //CardsFactory
