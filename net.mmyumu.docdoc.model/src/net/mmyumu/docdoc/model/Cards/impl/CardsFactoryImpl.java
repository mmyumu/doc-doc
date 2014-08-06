/**
 */
package net.mmyumu.docdoc.model.Cards.impl;

import net.mmyumu.docdoc.model.Cards.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CardsFactoryImpl extends EFactoryImpl implements CardsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CardsFactory init() {
		try {
			CardsFactory theCardsFactory = (CardsFactory)EPackage.Registry.INSTANCE.getEFactory(CardsPackage.eNS_URI);
			if (theCardsFactory != null) {
				return theCardsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CardsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CardsPackage.CARDS_TYPE: return createCardsType();
			case CardsPackage.CARD_TYPE: return createCardType();
			case CardsPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case CardsPackage.EFFECT_TYPE: return createEffectType();
			case CardsPackage.PLAYABILITY_CONDITION_TYPE: return createPlayabilityConditionType();
			case CardsPackage.TARGET_TYPE: return createTargetType();
			case CardsPackage.VARIABLE_TYPE: return createVariableType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardsType createCardsType() {
		CardsTypeImpl cardsType = new CardsTypeImpl();
		return cardsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardType createCardType() {
		CardTypeImpl cardType = new CardTypeImpl();
		return cardType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EffectType createEffectType() {
		EffectTypeImpl effectType = new EffectTypeImpl();
		return effectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayabilityConditionType createPlayabilityConditionType() {
		PlayabilityConditionTypeImpl playabilityConditionType = new PlayabilityConditionTypeImpl();
		return playabilityConditionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetType createTargetType() {
		TargetTypeImpl targetType = new TargetTypeImpl();
		return targetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableType createVariableType() {
		VariableTypeImpl variableType = new VariableTypeImpl();
		return variableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardsPackage getCardsPackage() {
		return (CardsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CardsPackage getPackage() {
		return CardsPackage.eINSTANCE;
	}

} //CardsFactoryImpl
