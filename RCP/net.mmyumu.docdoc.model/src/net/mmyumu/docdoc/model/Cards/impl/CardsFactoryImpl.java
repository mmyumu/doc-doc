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
			case CardsPackage.ABILITY: return createAbility();
			case CardsPackage.ADDITIONAL_COST: return createAdditionalCost();
			case CardsPackage.BATTLEGROUND_FILTER: return createBattlegroundFilter();
			case CardsPackage.CARD: return createCard();
			case CardsPackage.CARD_FILTER: return createCardFilter();
			case CardsPackage.CARDS: return createCards();
			case CardsPackage.CARD_TYPE: return createCardType();
			case CardsPackage.CONDITION: return createCondition();
			case CardsPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case CardsPackage.EFFECT: return createEffect();
			case CardsPackage.EXISTING_CARD: return createExistingCard();
			case CardsPackage.ON_GOING: return createOnGoing();
			case CardsPackage.OPTION: return createOption();
			case CardsPackage.SCHOOL: return createSchool();
			case CardsPackage.SUBGROUP: return createSubgroup();
			case CardsPackage.TARGET: return createTarget();
			case CardsPackage.TEMPLATE_EFFECT: return createTemplateEffect();
			case CardsPackage.TRIGGER: return createTrigger();
			case CardsPackage.VARIABLE: return createVariable();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ability createAbility() {
		AbilityImpl ability = new AbilityImpl();
		return ability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionalCost createAdditionalCost() {
		AdditionalCostImpl additionalCost = new AdditionalCostImpl();
		return additionalCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BattlegroundFilter createBattlegroundFilter() {
		BattlegroundFilterImpl battlegroundFilter = new BattlegroundFilterImpl();
		return battlegroundFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Card createCard() {
		CardImpl card = new CardImpl();
		return card;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardFilter createCardFilter() {
		CardFilterImpl cardFilter = new CardFilterImpl();
		return cardFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Cards createCards() {
		CardsImpl cards = new CardsImpl();
		return cards;
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
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
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
	public Effect createEffect() {
		EffectImpl effect = new EffectImpl();
		return effect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExistingCard createExistingCard() {
		ExistingCardImpl existingCard = new ExistingCardImpl();
		return existingCard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OnGoing createOnGoing() {
		OnGoingImpl onGoing = new OnGoingImpl();
		return onGoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Option createOption() {
		OptionImpl option = new OptionImpl();
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public School createSchool() {
		SchoolImpl school = new SchoolImpl();
		return school;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Subgroup createSubgroup() {
		SubgroupImpl subgroup = new SubgroupImpl();
		return subgroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Target createTarget() {
		TargetImpl target = new TargetImpl();
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemplateEffect createTemplateEffect() {
		TemplateEffectImpl templateEffect = new TemplateEffectImpl();
		return templateEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Trigger createTrigger() {
		TriggerImpl trigger = new TriggerImpl();
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
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
