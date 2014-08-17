/**
 */
package net.mmyumu.docdoc.model.Cards;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see net.mmyumu.docdoc.model.Cards.CardsFactory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
public interface CardsPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Cards";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/resource/net.mmyumu.docdoc.model/resources/xsd/cards.xsd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Cards";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CardsPackage eINSTANCE = net.mmyumu.docdoc.model.Cards.impl.CardsPackageImpl.init();

	/**
	 * The meta object id for the '{@link net.mmyumu.docdoc.model.Cards.impl.AbilityImpl <em>Ability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mmyumu.docdoc.model.Cards.impl.AbilityImpl
	 * @see net.mmyumu.docdoc.model.Cards.impl.CardsPackageImpl#getAbility()
	 * @generated
	 */
	int ABILITY = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Ability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Ability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABILITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.mmyumu.docdoc.model.Cards.impl.AdditionalCostImpl <em>Additional Cost</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mmyumu.docdoc.model.Cards.impl.AdditionalCostImpl
	 * @see net.mmyumu.docdoc.model.Cards.impl.CardsPackageImpl#getAdditionalCost()
	 * @generated
	 */
	int ADDITIONAL_COST = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_COST__TARGET = 0;

	/**
	 * The number of structural features of the '<em>Additional Cost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_COST_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Additional Cost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_COST_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.mmyumu.docdoc.model.Cards.impl.BattlegroundFilterImpl <em>Battleground Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mmyumu.docdoc.model.Cards.impl.BattlegroundFilterImpl
	 * @see net.mmyumu.docdoc.model.Cards.impl.CardsPackageImpl#getBattlegroundFilter()
	 * @generated
	 */
	int BATTLEGROUND_FILTER = 2;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTLEGROUND_FILTER__LINE = 0;

	/**
	 * The number of structural features of the '<em>Battleground Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTLEGROUND_FILTER_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Battleground Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BATTLEGROUND_FILTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.mmyumu.docdoc.model.Cards.impl.CardImpl <em>Card</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mmyumu.docdoc.model.Cards.impl.CardImpl
	 * @see net.mmyumu.docdoc.model.Cards.impl.CardsPackageImpl#getCard()
	 * @generated
	 */
	int CARD = 3;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Ability</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__ABILITY = 2;

	/**
	 * The feature id for the '<em><b>School</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__SCHOOL = 3;

	/**
	 * The feature id for the '<em><b>Ongoing</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__ONGOING = 4;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__TARGET = 5;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__DESCRIPTION = 6;

	/**
	 * The feature id for the '<em><b>Extra Description</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__EXTRA_DESCRIPTION = 7;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__VARIABLE = 8;

	/**
	 * The feature id for the '<em><b>Variable2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__VARIABLE2 = 9;

	/**
	 * The feature id for the '<em><b>Variable3</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__VARIABLE3 = 10;

	/**
	 * The feature id for the '<em><b>Variable4</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__VARIABLE4 = 11;

	/**
	 * The feature id for the '<em><b>Variable5</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__VARIABLE5 = 12;

	/**
	 * The feature id for the '<em><b>Variable6</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__VARIABLE6 = 13;

	/**
	 * The feature id for the '<em><b>Variable7</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__VARIABLE7 = 14;

	/**
	 * The feature id for the '<em><b>Playability Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__PLAYABILITY_CONDITION = 15;

	/**
	 * The feature id for the '<em><b>Attack Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__ATTACK_CONDITION = 16;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__TRIGGER = 17;

	/**
	 * The feature id for the '<em><b>Additional Cost</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__ADDITIONAL_COST = 18;

	/**
	 * The feature id for the '<em><b>Attack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__ATTACK = 19;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__COST = 20;

	/**
	 * The feature id for the '<em><b>Destiny Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__DESTINY_LEVEL = 21;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__DISPLAY_NAME = 22;

	/**
	 * The feature id for the '<em><b>Faction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__FACTION = 23;

	/**
	 * The feature id for the '<em><b>HP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__HP = 24;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__ID = 25;

	/**
	 * The feature id for the '<em><b>Magic Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__MAGIC_LEVEL = 26;

	/**
	 * The feature id for the '<em><b>Might Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__MIGHT_LEVEL = 27;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__NAME = 28;

	/**
	 * The feature id for the '<em><b>Not Localized</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__NOT_LOCALIZED = 29;

	/**
	 * The feature id for the '<em><b>Race</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__RACE = 30;

	/**
	 * The feature id for the '<em><b>Rarity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__RARITY = 31;

	/**
	 * The feature id for the '<em><b>Resource Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__RESOURCE_NAME = 32;

	/**
	 * The feature id for the '<em><b>Retaliate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__RETALIATE = 33;

	/**
	 * The feature id for the '<em><b>School1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__SCHOOL1 = 34;

	/**
	 * The feature id for the '<em><b>Schools Aligned</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__SCHOOLS_ALIGNED = 35;

	/**
	 * The feature id for the '<em><b>Sub Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__SUB_TYPE = 36;

	/**
	 * The feature id for the '<em><b>Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__TOKEN = 37;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__TYPE = 38;

	/**
	 * The feature id for the '<em><b>Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__UNIQUE = 39;

	/**
	 * The feature id for the '<em><b>Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__ZONE = 40;

	/**
	 * The number of structural features of the '<em>Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FEATURE_COUNT = 41;

	/**
	 * The number of operations of the '<em>Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.mmyumu.docdoc.model.Cards.impl.CardFilterImpl <em>Card Filter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mmyumu.docdoc.model.Cards.impl.CardFilterImpl
	 * @see net.mmyumu.docdoc.model.Cards.impl.CardsPackageImpl#getCardFilter()
	 * @generated
	 */
	int CARD_FILTER = 4;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FILTER__VARIABLE = 0;

	/**
	 * The feature id for the '<em><b>Attack Hero Last Turn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FILTER__ATTACK_HERO_LAST_TURN = 1;

	/**
	 * The feature id for the '<em><b>Base Max Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FILTER__BASE_MAX_COST = 2;

	/**
	 * The feature id for the '<em><b>Deal Damage To Hero Last Turn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FILTER__DEAL_DAMAGE_TO_HERO_LAST_TURN = 3;

	/**
	 * The feature id for the '<em><b>Exclude Faction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FILTER__EXCLUDE_FACTION = 4;

	/**
	 * The feature id for the '<em><b>Exclude Races</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FILTER__EXCLUDE_RACES = 5;

	/**
	 * The feature id for the '<em><b>Exclude School</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FILTER__EXCLUDE_SCHOOL = 6;

	/**
	 * The feature id for the '<em><b>Exclude Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FILTER__EXCLUDE_TOKEN = 7;

	/**
	 * The feature id for the '<em><b>Exclude Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FILTER__EXCLUDE_UNIQUE = 8;

	/**
	 * The feature id for the '<em><b>Exclude Unit Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FILTER__EXCLUDE_UNIT_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Include Ability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FILTER__INCLUDE_ABILITY = 10;

	/**
	 * The feature id for the '<em><b>Include Card ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FILTER__INCLUDE_CARD_ID = 11;

	/**
	 * The feature id for the '<em><b>Include Card Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FILTER__INCLUDE_CARD_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Include Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FILTER__INCLUDE_COLUMN = 13;

	/**
	 * The feature id for the '<em><b>Include Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FILTER__INCLUDE_COUNTER = 14;

	/**
	 * The feature id for the '<em><b>Include Enchant Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FILTER__INCLUDE_ENCHANT_UNIT = 15;

	/**
	 * The feature id for the '<em><b>Include Faction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FILTER__INCLUDE_FACTION = 16;

	/**
	 * The feature id for the '<em><b>Include Front Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FILTER__INCLUDE_FRONT_LINE = 17;

	/**
	 * The feature id for the '<em><b>Include Occupant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FILTER__INCLUDE_OCCUPANT = 18;

	/**
	 * The feature id for the '<em><b>Include Ongoing Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FILTER__INCLUDE_ONGOING_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Include Races</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FILTER__INCLUDE_RACES = 20;

	/**
	 * The feature id for the '<em><b>Include School</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FILTER__INCLUDE_SCHOOL = 21;

	/**
	 * The feature id for the '<em><b>Include Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FILTER__INCLUDE_STATUS = 22;

	/**
	 * The feature id for the '<em><b>Include Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FILTER__INCLUDE_UNIQUE = 23;

	/**
	 * The feature id for the '<em><b>Include Unit Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FILTER__INCLUDE_UNIT_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Level Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FILTER__LEVEL_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Max Attack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FILTER__MAX_ATTACK = 26;

	/**
	 * The feature id for the '<em><b>Max Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FILTER__MAX_COST = 27;

	/**
	 * The feature id for the '<em><b>Max Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FILTER__MAX_LEVEL = 28;

	/**
	 * The feature id for the '<em><b>Same Card Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FILTER__SAME_CARD_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Same GPID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FILTER__SAME_GPID = 30;

	/**
	 * The feature id for the '<em><b>Share Races</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FILTER__SHARE_RACES = 31;

	/**
	 * The feature id for the '<em><b>Share Races With Occupant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FILTER__SHARE_RACES_WITH_OCCUPANT = 32;

	/**
	 * The feature id for the '<em><b>Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FILTER__SIDE = 33;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FILTER__VALUE = 34;

	/**
	 * The number of structural features of the '<em>Card Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FILTER_FEATURE_COUNT = 35;

	/**
	 * The number of operations of the '<em>Card Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FILTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.mmyumu.docdoc.model.Cards.impl.CardsImpl <em>Cards</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mmyumu.docdoc.model.Cards.impl.CardsImpl
	 * @see net.mmyumu.docdoc.model.Cards.impl.CardsPackageImpl#getCards()
	 * @generated
	 */
	int CARDS = 5;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Card</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS__CARD = 1;

	/**
	 * The feature id for the '<em><b>Existing Card</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS__EXISTING_CARD = 2;

	/**
	 * The feature id for the '<em><b>Template Effect</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS__TEMPLATE_EFFECT = 3;

	/**
	 * The number of structural features of the '<em>Cards</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Cards</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.mmyumu.docdoc.model.Cards.impl.CardTypeImpl <em>Card Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mmyumu.docdoc.model.Cards.impl.CardTypeImpl
	 * @see net.mmyumu.docdoc.model.Cards.impl.CardsPackageImpl#getCardType()
	 * @generated
	 */
	int CARD_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Exclude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_TYPE__EXCLUDE = 0;

	/**
	 * The feature id for the '<em><b>Include</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_TYPE__INCLUDE = 1;

	/**
	 * The number of structural features of the '<em>Card Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Card Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.mmyumu.docdoc.model.Cards.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mmyumu.docdoc.model.Cards.impl.ConditionImpl
	 * @see net.mmyumu.docdoc.model.Cards.impl.CardsPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 7;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__OPERATOR = 1;

	/**
	 * The feature id for the '<em><b>Value A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__VALUE_A = 2;

	/**
	 * The feature id for the '<em><b>Value B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__VALUE_B = 3;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.mmyumu.docdoc.model.Cards.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mmyumu.docdoc.model.Cards.impl.DocumentRootImpl
	 * @see net.mmyumu.docdoc.model.Cards.impl.CardsPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 8;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Cards</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CARDS = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.mmyumu.docdoc.model.Cards.impl.EffectImpl <em>Effect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mmyumu.docdoc.model.Cards.impl.EffectImpl
	 * @see net.mmyumu.docdoc.model.Cards.impl.CardsPackageImpl#getEffect()
	 * @generated
	 */
	int EFFECT = 9;

	/**
	 * The feature id for the '<em><b>Card Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__CARD_FILTER = 0;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Ability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__ABILITY = 2;

	/**
	 * The feature id for the '<em><b>Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__BOTTOM = 3;

	/**
	 * The feature id for the '<em><b>Cancel Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__CANCEL_DESTINATION = 4;

	/**
	 * The feature id for the '<em><b>Cant Target Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__CANT_TARGET_PARENT = 5;

	/**
	 * The feature id for the '<em><b>Card Holder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__CARD_HOLDER = 6;

	/**
	 * The feature id for the '<em><b>Counter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__COUNTER_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Damage Exclude Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__DAMAGE_EXCLUDE_FLAGS = 8;

	/**
	 * The feature id for the '<em><b>Damage Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__DAMAGE_FLAGS = 9;

	/**
	 * The feature id for the '<em><b>Damage Include Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__DAMAGE_INCLUDE_FLAGS = 10;

	/**
	 * The feature id for the '<em><b>Damage Lethal Schools</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__DAMAGE_LETHAL_SCHOOLS = 11;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__DESTINATION = 12;

	/**
	 * The feature id for the '<em><b>Dont Generate Target Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__DONT_GENERATE_TARGET_POSITION = 13;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__DURATION = 14;

	/**
	 * The feature id for the '<em><b>Epic Enrage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__EPIC_ENRAGE = 15;

	/**
	 * The feature id for the '<em><b>Evaluation Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__EVALUATION_ORDER = 16;

	/**
	 * The feature id for the '<em><b>Fake Additional Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__FAKE_ADDITIONAL_COST = 17;

	/**
	 * The feature id for the '<em><b>Force</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__FORCE = 18;

	/**
	 * The feature id for the '<em><b>Free</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__FREE = 19;

	/**
	 * The feature id for the '<em><b>Global Effect Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__GLOBAL_EFFECT_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Level Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__LEVEL_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Move From Last Known Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__MOVE_FROM_LAST_KNOWN_PARENT = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__NAME = 23;

	/**
	 * The feature id for the '<em><b>New Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__NEW_DURATION = 24;

	/**
	 * The feature id for the '<em><b>Owner Ability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__OWNER_ABILITY = 25;

	/**
	 * The feature id for the '<em><b>Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__PERSISTENT = 26;

	/**
	 * The feature id for the '<em><b>Play Effect Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__PLAY_EFFECT_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Remove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__REMOVE = 28;

	/**
	 * The feature id for the '<em><b>Require Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__REQUIRE_LEVEL = 29;

	/**
	 * The feature id for the '<em><b>Reveal To Other</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__REVEAL_TO_OTHER = 30;

	/**
	 * The feature id for the '<em><b>Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__REVERSE = 31;

	/**
	 * The feature id for the '<em><b>Shuffle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__SHUFFLE = 32;

	/**
	 * The feature id for the '<em><b>Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__SIDE = 33;

	/**
	 * The feature id for the '<em><b>Sub Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__SUB_TYPE = 34;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__TYPE = 35;

	/**
	 * The feature id for the '<em><b>Unfreeze</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__UNFREEZE = 36;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__VALUE = 37;

	/**
	 * The number of structural features of the '<em>Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_FEATURE_COUNT = 38;

	/**
	 * The number of operations of the '<em>Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.mmyumu.docdoc.model.Cards.impl.ExistingCardImpl <em>Existing Card</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mmyumu.docdoc.model.Cards.impl.ExistingCardImpl
	 * @see net.mmyumu.docdoc.model.Cards.impl.CardsPackageImpl#getExistingCard()
	 * @generated
	 */
	int EXISTING_CARD = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTING_CARD__NAME = 0;

	/**
	 * The feature id for the '<em><b>Rarity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTING_CARD__RARITY = 1;

	/**
	 * The number of structural features of the '<em>Existing Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTING_CARD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Existing Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTING_CARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.mmyumu.docdoc.model.Cards.impl.OnGoingImpl <em>On Going</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mmyumu.docdoc.model.Cards.impl.OnGoingImpl
	 * @see net.mmyumu.docdoc.model.Cards.impl.CardsPackageImpl#getOnGoing()
	 * @generated
	 */
	int ON_GOING = 11;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_GOING__CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_GOING__DURATION = 1;

	/**
	 * The feature id for the '<em><b>Suicide Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_GOING__SUICIDE_PARENT = 2;

	/**
	 * The number of structural features of the '<em>On Going</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_GOING_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>On Going</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_GOING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.mmyumu.docdoc.model.Cards.impl.OptionImpl <em>Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mmyumu.docdoc.model.Cards.impl.OptionImpl
	 * @see net.mmyumu.docdoc.model.Cards.impl.CardsPackageImpl#getOption()
	 * @generated
	 */
	int OPTION = 12;

	/**
	 * The feature id for the '<em><b>Display Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__DISPLAY_TEXT = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.mmyumu.docdoc.model.Cards.impl.SchoolImpl <em>School</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mmyumu.docdoc.model.Cards.impl.SchoolImpl
	 * @see net.mmyumu.docdoc.model.Cards.impl.CardsPackageImpl#getSchool()
	 * @generated
	 */
	int SCHOOL = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL__NAME = 0;

	/**
	 * The number of structural features of the '<em>School</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>School</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHOOL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.mmyumu.docdoc.model.Cards.impl.SubgroupImpl <em>Subgroup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mmyumu.docdoc.model.Cards.impl.SubgroupImpl
	 * @see net.mmyumu.docdoc.model.Cards.impl.CardsPackageImpl#getSubgroup()
	 * @generated
	 */
	int SUBGROUP = 14;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGROUP__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Template Effect</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGROUP__TEMPLATE_EFFECT = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGROUP__TARGET = 2;

	/**
	 * The number of structural features of the '<em>Subgroup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGROUP_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Subgroup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.mmyumu.docdoc.model.Cards.impl.TargetImpl <em>Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mmyumu.docdoc.model.Cards.impl.TargetImpl
	 * @see net.mmyumu.docdoc.model.Cards.impl.CardsPackageImpl#getTarget()
	 * @generated
	 */
	int TARGET = 15;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__VARIABLE = 1;

	/**
	 * The feature id for the '<em><b>Variable2</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__VARIABLE2 = 2;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__CONDITION = 3;

	/**
	 * The feature id for the '<em><b>Option</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__OPTION = 4;

	/**
	 * The feature id for the '<em><b>Card Type</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__CARD_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Card Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__CARD_FILTER = 6;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__TRIGGER = 7;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__EFFECT = 8;

	/**
	 * The feature id for the '<em><b>Subgroup</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__SUBGROUP = 9;

	/**
	 * The feature id for the '<em><b>Battleground Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__BATTLEGROUND_FILTER = 10;

	/**
	 * The feature id for the '<em><b>Allow Duplicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__ALLOW_DUPLICATE = 11;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__AMOUNT = 12;

	/**
	 * The feature id for the '<em><b>Amount Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__AMOUNT_VISIBLE = 13;

	/**
	 * The feature id for the '<em><b>Auto Take First Inputs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__AUTO_TAKE_FIRST_INPUTS = 14;

	/**
	 * The feature id for the '<em><b>Battleground Position State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__BATTLEGROUND_POSITION_STATE = 15;

	/**
	 * The feature id for the '<em><b>Cancelable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__CANCELABLE = 16;

	/**
	 * The feature id for the '<em><b>Cant Target Occupant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__CANT_TARGET_OCCUPANT = 17;

	/**
	 * The feature id for the '<em><b>Cant Target Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__CANT_TARGET_PARENT = 18;

	/**
	 * The feature id for the '<em><b>Cant Target Previous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__CANT_TARGET_PREVIOUS = 19;

	/**
	 * The feature id for the '<em><b>Cant Target Self</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__CANT_TARGET_SELF = 20;

	/**
	 * The feature id for the '<em><b>Card Type1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__CARD_TYPE1 = 21;

	/**
	 * The feature id for the '<em><b>Dont Update After Execution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__DONT_UPDATE_AFTER_EXECUTION = 22;

	/**
	 * The feature id for the '<em><b>Except From Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__EXCEPT_FROM_TRIGGER = 23;

	/**
	 * The feature id for the '<em><b>Exclude Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__EXCLUDE_UNIQUE = 24;

	/**
	 * The feature id for the '<em><b>Force Execute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__FORCE_EXECUTE = 25;

	/**
	 * The feature id for the '<em><b>Ignore Ward</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__IGNORE_WARD = 26;

	/**
	 * The feature id for the '<em><b>Input On Exec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__INPUT_ON_EXEC = 27;

	/**
	 * The feature id for the '<em><b>Min Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__MIN_AMOUNT = 28;

	/**
	 * The feature id for the '<em><b>Need Activation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__NEED_ACTIVATION = 29;

	/**
	 * The feature id for the '<em><b>Option1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__OPTION1 = 30;

	/**
	 * The feature id for the '<em><b>Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__PERSISTENT = 31;

	/**
	 * The feature id for the '<em><b>Random</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__RANDOM = 32;

	/**
	 * The feature id for the '<em><b>Reveal To Other</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__REVEAL_TO_OTHER = 33;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__SHAPE = 34;

	/**
	 * The feature id for the '<em><b>Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__SIDE = 35;

	/**
	 * The feature id for the '<em><b>Skip Next Target Validation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__SKIP_NEXT_TARGET_VALIDATION = 36;

	/**
	 * The feature id for the '<em><b>Skip Sub Target Validation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__SKIP_SUB_TARGET_VALIDATION = 37;

	/**
	 * The feature id for the '<em><b>Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__ZONE = 38;

	/**
	 * The number of structural features of the '<em>Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FEATURE_COUNT = 39;

	/**
	 * The number of operations of the '<em>Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.mmyumu.docdoc.model.Cards.impl.TemplateEffectImpl <em>Template Effect</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mmyumu.docdoc.model.Cards.impl.TemplateEffectImpl
	 * @see net.mmyumu.docdoc.model.Cards.impl.CardsPackageImpl#getTemplateEffect()
	 * @generated
	 */
	int TEMPLATE_EFFECT = 16;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EFFECT__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EFFECT__TRIGGER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EFFECT__NAME = 2;

	/**
	 * The number of structural features of the '<em>Template Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EFFECT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Template Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EFFECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.mmyumu.docdoc.model.Cards.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mmyumu.docdoc.model.Cards.impl.TriggerImpl
	 * @see net.mmyumu.docdoc.model.Cards.impl.CardsPackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 17;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Card Filter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__CARD_FILTER = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__TARGET = 2;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__CONDITION = 3;

	/**
	 * The feature id for the '<em><b>Damage Include Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__DAMAGE_INCLUDE_FLAGS = 4;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__DURATION = 5;

	/**
	 * The feature id for the '<em><b>Execute Once Per Transaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__EXECUTE_ONCE_PER_TRANSACTION = 6;

	/**
	 * The feature id for the '<em><b>Execute Once Per Turn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__EXECUTE_ONCE_PER_TURN = 7;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__LOCATION = 8;

	/**
	 * The feature id for the '<em><b>Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__SIDE = 9;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__TYPE = 10;

	/**
	 * The feature id for the '<em><b>Use Triggerer As Initiator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__USE_TRIGGERER_AS_INITIATOR = 11;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.mmyumu.docdoc.model.Cards.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mmyumu.docdoc.model.Cards.impl.VariableImpl
	 * @see net.mmyumu.docdoc.model.Cards.impl.CardsPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 18;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Card Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__CARD_FILTER = 1;

	/**
	 * The feature id for the '<em><b>Ability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__ABILITY = 2;

	/**
	 * The feature id for the '<em><b>Counter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__COUNTER_TYPE = 3;

	/**
	 * The feature id for the '<em><b>From Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__FROM_TRIGGER = 4;

	/**
	 * The feature id for the '<em><b>Include School</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__INCLUDE_SCHOOL = 5;

	/**
	 * The feature id for the '<em><b>Level Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__LEVEL_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Must Be Targetable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__MUST_BE_TARGETABLE = 7;

	/**
	 * The feature id for the '<em><b>Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__SIDE = 8;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__TYPE = 9;

	/**
	 * The feature id for the '<em><b>Unit Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__UNIT_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Use Current Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__USE_CURRENT_TARGET = 11;

	/**
	 * The feature id for the '<em><b>Use Last Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__USE_LAST_TARGET = 12;

	/**
	 * The feature id for the '<em><b>Use Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__USE_PARENT = 13;

	/**
	 * The feature id for the '<em><b>Value Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VALUE_MODIFIER = 14;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link net.mmyumu.docdoc.model.Cards.Ability <em>Ability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ability</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Ability
	 * @generated
	 */
	EClass getAbility();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Ability#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Ability#getType()
	 * @see #getAbility()
	 * @generated
	 */
	EAttribute getAbility_Type();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Ability#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Ability#getValue()
	 * @see #getAbility()
	 * @generated
	 */
	EAttribute getAbility_Value();

	/**
	 * Returns the meta object for class '{@link net.mmyumu.docdoc.model.Cards.AdditionalCost <em>Additional Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Additional Cost</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.AdditionalCost
	 * @generated
	 */
	EClass getAdditionalCost();

	/**
	 * Returns the meta object for the containment reference '{@link net.mmyumu.docdoc.model.Cards.AdditionalCost#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.AdditionalCost#getTarget()
	 * @see #getAdditionalCost()
	 * @generated
	 */
	EReference getAdditionalCost_Target();

	/**
	 * Returns the meta object for class '{@link net.mmyumu.docdoc.model.Cards.BattlegroundFilter <em>Battleground Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Battleground Filter</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.BattlegroundFilter
	 * @generated
	 */
	EClass getBattlegroundFilter();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.BattlegroundFilter#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.BattlegroundFilter#getLine()
	 * @see #getBattlegroundFilter()
	 * @generated
	 */
	EAttribute getBattlegroundFilter_Line();

	/**
	 * Returns the meta object for class '{@link net.mmyumu.docdoc.model.Cards.Card <em>Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Card</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Card
	 * @generated
	 */
	EClass getCard();

	/**
	 * Returns the meta object for the attribute list '{@link net.mmyumu.docdoc.model.Cards.Card#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Card#getMixed()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link net.mmyumu.docdoc.model.Cards.Card#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Card#getGroup()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mmyumu.docdoc.model.Cards.Card#getAbility <em>Ability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ability</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Card#getAbility()
	 * @see #getCard()
	 * @generated
	 */
	EReference getCard_Ability();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mmyumu.docdoc.model.Cards.Card#getSchool <em>School</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>School</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Card#getSchool()
	 * @see #getCard()
	 * @generated
	 */
	EReference getCard_School();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mmyumu.docdoc.model.Cards.Card#getOngoing <em>Ongoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ongoing</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Card#getOngoing()
	 * @see #getCard()
	 * @generated
	 */
	EReference getCard_Ongoing();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mmyumu.docdoc.model.Cards.Card#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Card#getTarget()
	 * @see #getCard()
	 * @generated
	 */
	EReference getCard_Target();

	/**
	 * Returns the meta object for the attribute list '{@link net.mmyumu.docdoc.model.Cards.Card#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Description</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Card#getDescription()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_Description();

	/**
	 * Returns the meta object for the attribute list '{@link net.mmyumu.docdoc.model.Cards.Card#getExtraDescription <em>Extra Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Extra Description</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Card#getExtraDescription()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_ExtraDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mmyumu.docdoc.model.Cards.Card#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Card#getVariable()
	 * @see #getCard()
	 * @generated
	 */
	EReference getCard_Variable();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mmyumu.docdoc.model.Cards.Card#getVariable2 <em>Variable2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable2</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Card#getVariable2()
	 * @see #getCard()
	 * @generated
	 */
	EReference getCard_Variable2();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mmyumu.docdoc.model.Cards.Card#getVariable3 <em>Variable3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable3</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Card#getVariable3()
	 * @see #getCard()
	 * @generated
	 */
	EReference getCard_Variable3();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mmyumu.docdoc.model.Cards.Card#getVariable4 <em>Variable4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable4</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Card#getVariable4()
	 * @see #getCard()
	 * @generated
	 */
	EReference getCard_Variable4();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mmyumu.docdoc.model.Cards.Card#getVariable5 <em>Variable5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable5</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Card#getVariable5()
	 * @see #getCard()
	 * @generated
	 */
	EReference getCard_Variable5();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mmyumu.docdoc.model.Cards.Card#getVariable6 <em>Variable6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable6</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Card#getVariable6()
	 * @see #getCard()
	 * @generated
	 */
	EReference getCard_Variable6();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mmyumu.docdoc.model.Cards.Card#getVariable7 <em>Variable7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable7</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Card#getVariable7()
	 * @see #getCard()
	 * @generated
	 */
	EReference getCard_Variable7();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mmyumu.docdoc.model.Cards.Card#getPlayabilityCondition <em>Playability Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Playability Condition</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Card#getPlayabilityCondition()
	 * @see #getCard()
	 * @generated
	 */
	EReference getCard_PlayabilityCondition();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mmyumu.docdoc.model.Cards.Card#getAttackCondition <em>Attack Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attack Condition</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Card#getAttackCondition()
	 * @see #getCard()
	 * @generated
	 */
	EReference getCard_AttackCondition();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mmyumu.docdoc.model.Cards.Card#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trigger</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Card#getTrigger()
	 * @see #getCard()
	 * @generated
	 */
	EReference getCard_Trigger();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mmyumu.docdoc.model.Cards.Card#getAdditionalCost <em>Additional Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Additional Cost</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Card#getAdditionalCost()
	 * @see #getCard()
	 * @generated
	 */
	EReference getCard_AdditionalCost();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Card#getAttack <em>Attack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attack</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Card#getAttack()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_Attack();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Card#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Card#getCost()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_Cost();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Card#getDestinyLevel <em>Destiny Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destiny Level</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Card#getDestinyLevel()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_DestinyLevel();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Card#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Card#getDisplayName()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_DisplayName();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Card#getFaction <em>Faction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Faction</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Card#getFaction()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_Faction();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Card#getHP <em>HP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>HP</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Card#getHP()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_HP();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Card#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Card#getID()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_ID();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Card#getMagicLevel <em>Magic Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Magic Level</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Card#getMagicLevel()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_MagicLevel();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Card#getMightLevel <em>Might Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Might Level</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Card#getMightLevel()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_MightLevel();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Card#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Card#getName()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Card#getNotLocalized <em>Not Localized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Localized</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Card#getNotLocalized()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_NotLocalized();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Card#getRace <em>Race</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Race</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Card#getRace()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_Race();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Card#getRarity <em>Rarity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rarity</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Card#getRarity()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_Rarity();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Card#getResourceName <em>Resource Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Resource Name</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Card#getResourceName()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_ResourceName();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Card#getRetaliate <em>Retaliate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Retaliate</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Card#getRetaliate()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_Retaliate();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Card#getSchool1 <em>School1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>School1</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Card#getSchool1()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_School1();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Card#getSchoolsAligned <em>Schools Aligned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Schools Aligned</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Card#getSchoolsAligned()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_SchoolsAligned();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Card#getSubType <em>Sub Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Type</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Card#getSubType()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_SubType();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Card#getToken <em>Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Token</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Card#getToken()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_Token();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Card#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Card#getType()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_Type();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Card#getUnique <em>Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Card#getUnique()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_Unique();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Card#getZone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zone</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Card#getZone()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_Zone();

	/**
	 * Returns the meta object for class '{@link net.mmyumu.docdoc.model.Cards.CardFilter <em>Card Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Card Filter</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.CardFilter
	 * @generated
	 */
	EClass getCardFilter();

	/**
	 * Returns the meta object for the containment reference '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.CardFilter#getVariable()
	 * @see #getCardFilter()
	 * @generated
	 */
	EReference getCardFilter_Variable();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getAttackHeroLastTurn <em>Attack Hero Last Turn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attack Hero Last Turn</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.CardFilter#getAttackHeroLastTurn()
	 * @see #getCardFilter()
	 * @generated
	 */
	EAttribute getCardFilter_AttackHeroLastTurn();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getBaseMaxCost <em>Base Max Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Max Cost</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.CardFilter#getBaseMaxCost()
	 * @see #getCardFilter()
	 * @generated
	 */
	EAttribute getCardFilter_BaseMaxCost();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getDealDamageToHeroLastTurn <em>Deal Damage To Hero Last Turn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deal Damage To Hero Last Turn</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.CardFilter#getDealDamageToHeroLastTurn()
	 * @see #getCardFilter()
	 * @generated
	 */
	EAttribute getCardFilter_DealDamageToHeroLastTurn();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getExcludeFaction <em>Exclude Faction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclude Faction</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.CardFilter#getExcludeFaction()
	 * @see #getCardFilter()
	 * @generated
	 */
	EAttribute getCardFilter_ExcludeFaction();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getExcludeRaces <em>Exclude Races</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclude Races</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.CardFilter#getExcludeRaces()
	 * @see #getCardFilter()
	 * @generated
	 */
	EAttribute getCardFilter_ExcludeRaces();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getExcludeSchool <em>Exclude School</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclude School</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.CardFilter#getExcludeSchool()
	 * @see #getCardFilter()
	 * @generated
	 */
	EAttribute getCardFilter_ExcludeSchool();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getExcludeToken <em>Exclude Token</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclude Token</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.CardFilter#getExcludeToken()
	 * @see #getCardFilter()
	 * @generated
	 */
	EAttribute getCardFilter_ExcludeToken();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getExcludeUnique <em>Exclude Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclude Unique</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.CardFilter#getExcludeUnique()
	 * @see #getCardFilter()
	 * @generated
	 */
	EAttribute getCardFilter_ExcludeUnique();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getExcludeUnitType <em>Exclude Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclude Unit Type</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.CardFilter#getExcludeUnitType()
	 * @see #getCardFilter()
	 * @generated
	 */
	EAttribute getCardFilter_ExcludeUnitType();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeAbility <em>Include Ability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include Ability</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeAbility()
	 * @see #getCardFilter()
	 * @generated
	 */
	EAttribute getCardFilter_IncludeAbility();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeCardID <em>Include Card ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include Card ID</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeCardID()
	 * @see #getCardFilter()
	 * @generated
	 */
	EAttribute getCardFilter_IncludeCardID();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeCardType <em>Include Card Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include Card Type</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeCardType()
	 * @see #getCardFilter()
	 * @generated
	 */
	EAttribute getCardFilter_IncludeCardType();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeColumn <em>Include Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include Column</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeColumn()
	 * @see #getCardFilter()
	 * @generated
	 */
	EAttribute getCardFilter_IncludeColumn();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeCounter <em>Include Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include Counter</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeCounter()
	 * @see #getCardFilter()
	 * @generated
	 */
	EAttribute getCardFilter_IncludeCounter();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeEnchantUnit <em>Include Enchant Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include Enchant Unit</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeEnchantUnit()
	 * @see #getCardFilter()
	 * @generated
	 */
	EAttribute getCardFilter_IncludeEnchantUnit();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeFaction <em>Include Faction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include Faction</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeFaction()
	 * @see #getCardFilter()
	 * @generated
	 */
	EAttribute getCardFilter_IncludeFaction();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeFrontLine <em>Include Front Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include Front Line</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeFrontLine()
	 * @see #getCardFilter()
	 * @generated
	 */
	EAttribute getCardFilter_IncludeFrontLine();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeOccupant <em>Include Occupant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include Occupant</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeOccupant()
	 * @see #getCardFilter()
	 * @generated
	 */
	EAttribute getCardFilter_IncludeOccupant();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeOngoingType <em>Include Ongoing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include Ongoing Type</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeOngoingType()
	 * @see #getCardFilter()
	 * @generated
	 */
	EAttribute getCardFilter_IncludeOngoingType();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeRaces <em>Include Races</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include Races</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeRaces()
	 * @see #getCardFilter()
	 * @generated
	 */
	EAttribute getCardFilter_IncludeRaces();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeSchool <em>Include School</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include School</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeSchool()
	 * @see #getCardFilter()
	 * @generated
	 */
	EAttribute getCardFilter_IncludeSchool();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeStatus <em>Include Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include Status</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeStatus()
	 * @see #getCardFilter()
	 * @generated
	 */
	EAttribute getCardFilter_IncludeStatus();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeUnique <em>Include Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include Unique</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeUnique()
	 * @see #getCardFilter()
	 * @generated
	 */
	EAttribute getCardFilter_IncludeUnique();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeUnitType <em>Include Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include Unit Type</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeUnitType()
	 * @see #getCardFilter()
	 * @generated
	 */
	EAttribute getCardFilter_IncludeUnitType();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getLevelType <em>Level Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level Type</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.CardFilter#getLevelType()
	 * @see #getCardFilter()
	 * @generated
	 */
	EAttribute getCardFilter_LevelType();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getMaxAttack <em>Max Attack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Attack</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.CardFilter#getMaxAttack()
	 * @see #getCardFilter()
	 * @generated
	 */
	EAttribute getCardFilter_MaxAttack();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getMaxCost <em>Max Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Cost</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.CardFilter#getMaxCost()
	 * @see #getCardFilter()
	 * @generated
	 */
	EAttribute getCardFilter_MaxCost();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getMaxLevel <em>Max Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Level</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.CardFilter#getMaxLevel()
	 * @see #getCardFilter()
	 * @generated
	 */
	EAttribute getCardFilter_MaxLevel();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getSameCardType <em>Same Card Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Same Card Type</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.CardFilter#getSameCardType()
	 * @see #getCardFilter()
	 * @generated
	 */
	EAttribute getCardFilter_SameCardType();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getSameGPID <em>Same GPID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Same GPID</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.CardFilter#getSameGPID()
	 * @see #getCardFilter()
	 * @generated
	 */
	EAttribute getCardFilter_SameGPID();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getShareRaces <em>Share Races</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Share Races</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.CardFilter#getShareRaces()
	 * @see #getCardFilter()
	 * @generated
	 */
	EAttribute getCardFilter_ShareRaces();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getShareRacesWithOccupant <em>Share Races With Occupant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Share Races With Occupant</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.CardFilter#getShareRacesWithOccupant()
	 * @see #getCardFilter()
	 * @generated
	 */
	EAttribute getCardFilter_ShareRacesWithOccupant();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getSide <em>Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Side</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.CardFilter#getSide()
	 * @see #getCardFilter()
	 * @generated
	 */
	EAttribute getCardFilter_Side();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.CardFilter#getValue()
	 * @see #getCardFilter()
	 * @generated
	 */
	EAttribute getCardFilter_Value();

	/**
	 * Returns the meta object for class '{@link net.mmyumu.docdoc.model.Cards.Cards <em>Cards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cards</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Cards
	 * @generated
	 */
	EClass getCards();

	/**
	 * Returns the meta object for the attribute list '{@link net.mmyumu.docdoc.model.Cards.Cards#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Cards#getGroup()
	 * @see #getCards()
	 * @generated
	 */
	EAttribute getCards_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mmyumu.docdoc.model.Cards.Cards#getCard <em>Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Card</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Cards#getCard()
	 * @see #getCards()
	 * @generated
	 */
	EReference getCards_Card();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mmyumu.docdoc.model.Cards.Cards#getExistingCard <em>Existing Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Existing Card</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Cards#getExistingCard()
	 * @see #getCards()
	 * @generated
	 */
	EReference getCards_ExistingCard();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mmyumu.docdoc.model.Cards.Cards#getTemplateEffect <em>Template Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Effect</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Cards#getTemplateEffect()
	 * @see #getCards()
	 * @generated
	 */
	EReference getCards_TemplateEffect();

	/**
	 * Returns the meta object for class '{@link net.mmyumu.docdoc.model.Cards.CardType <em>Card Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Card Type</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.CardType
	 * @generated
	 */
	EClass getCardType();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.CardType#getExclude <em>Exclude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclude</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.CardType#getExclude()
	 * @see #getCardType()
	 * @generated
	 */
	EAttribute getCardType_Exclude();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.CardType#getInclude <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.CardType#getInclude()
	 * @see #getCardType()
	 * @generated
	 */
	EAttribute getCardType_Include();

	/**
	 * Returns the meta object for class '{@link net.mmyumu.docdoc.model.Cards.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mmyumu.docdoc.model.Cards.Condition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Condition</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Condition#getCondition()
	 * @see #getCondition()
	 * @generated
	 */
	EReference getCondition_Condition();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Condition#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Condition#getOperator()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Operator();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Condition#getValueA <em>Value A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value A</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Condition#getValueA()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_ValueA();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Condition#getValueB <em>Value B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value B</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Condition#getValueB()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_ValueB();

	/**
	 * Returns the meta object for class '{@link net.mmyumu.docdoc.model.Cards.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link net.mmyumu.docdoc.model.Cards.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link net.mmyumu.docdoc.model.Cards.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link net.mmyumu.docdoc.model.Cards.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link net.mmyumu.docdoc.model.Cards.DocumentRoot#getCards <em>Cards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cards</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.DocumentRoot#getCards()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Cards();

	/**
	 * Returns the meta object for class '{@link net.mmyumu.docdoc.model.Cards.Effect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Effect</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Effect
	 * @generated
	 */
	EClass getEffect();

	/**
	 * Returns the meta object for the containment reference '{@link net.mmyumu.docdoc.model.Cards.Effect#getCardFilter <em>Card Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Card Filter</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Effect#getCardFilter()
	 * @see #getEffect()
	 * @generated
	 */
	EReference getEffect_CardFilter();

	/**
	 * Returns the meta object for the containment reference '{@link net.mmyumu.docdoc.model.Cards.Effect#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Effect#getCondition()
	 * @see #getEffect()
	 * @generated
	 */
	EReference getEffect_Condition();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Effect#getAbility <em>Ability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ability</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Effect#getAbility()
	 * @see #getEffect()
	 * @generated
	 */
	EAttribute getEffect_Ability();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Effect#getBottom <em>Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bottom</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Effect#getBottom()
	 * @see #getEffect()
	 * @generated
	 */
	EAttribute getEffect_Bottom();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Effect#getCancelDestination <em>Cancel Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cancel Destination</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Effect#getCancelDestination()
	 * @see #getEffect()
	 * @generated
	 */
	EAttribute getEffect_CancelDestination();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Effect#getCantTargetParent <em>Cant Target Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cant Target Parent</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Effect#getCantTargetParent()
	 * @see #getEffect()
	 * @generated
	 */
	EAttribute getEffect_CantTargetParent();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Effect#getCardHolder <em>Card Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Card Holder</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Effect#getCardHolder()
	 * @see #getEffect()
	 * @generated
	 */
	EAttribute getEffect_CardHolder();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Effect#getCounterType <em>Counter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Counter Type</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Effect#getCounterType()
	 * @see #getEffect()
	 * @generated
	 */
	EAttribute getEffect_CounterType();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Effect#getDamageExcludeFlags <em>Damage Exclude Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Damage Exclude Flags</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Effect#getDamageExcludeFlags()
	 * @see #getEffect()
	 * @generated
	 */
	EAttribute getEffect_DamageExcludeFlags();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Effect#getDamageFlags <em>Damage Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Damage Flags</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Effect#getDamageFlags()
	 * @see #getEffect()
	 * @generated
	 */
	EAttribute getEffect_DamageFlags();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Effect#getDamageIncludeFlags <em>Damage Include Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Damage Include Flags</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Effect#getDamageIncludeFlags()
	 * @see #getEffect()
	 * @generated
	 */
	EAttribute getEffect_DamageIncludeFlags();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Effect#getDamageLethalSchools <em>Damage Lethal Schools</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Damage Lethal Schools</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Effect#getDamageLethalSchools()
	 * @see #getEffect()
	 * @generated
	 */
	EAttribute getEffect_DamageLethalSchools();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Effect#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destination</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Effect#getDestination()
	 * @see #getEffect()
	 * @generated
	 */
	EAttribute getEffect_Destination();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Effect#getDontGenerateTargetPosition <em>Dont Generate Target Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dont Generate Target Position</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Effect#getDontGenerateTargetPosition()
	 * @see #getEffect()
	 * @generated
	 */
	EAttribute getEffect_DontGenerateTargetPosition();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Effect#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Effect#getDuration()
	 * @see #getEffect()
	 * @generated
	 */
	EAttribute getEffect_Duration();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Effect#getEpicEnrage <em>Epic Enrage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Epic Enrage</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Effect#getEpicEnrage()
	 * @see #getEffect()
	 * @generated
	 */
	EAttribute getEffect_EpicEnrage();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Effect#getEvaluationOrder <em>Evaluation Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Evaluation Order</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Effect#getEvaluationOrder()
	 * @see #getEffect()
	 * @generated
	 */
	EAttribute getEffect_EvaluationOrder();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Effect#getFakeAdditionalCost <em>Fake Additional Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fake Additional Cost</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Effect#getFakeAdditionalCost()
	 * @see #getEffect()
	 * @generated
	 */
	EAttribute getEffect_FakeAdditionalCost();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Effect#getForce <em>Force</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Force</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Effect#getForce()
	 * @see #getEffect()
	 * @generated
	 */
	EAttribute getEffect_Force();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Effect#getFree <em>Free</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Free</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Effect#getFree()
	 * @see #getEffect()
	 * @generated
	 */
	EAttribute getEffect_Free();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Effect#getGlobalEffectType <em>Global Effect Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Global Effect Type</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Effect#getGlobalEffectType()
	 * @see #getEffect()
	 * @generated
	 */
	EAttribute getEffect_GlobalEffectType();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Effect#getLevelType <em>Level Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level Type</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Effect#getLevelType()
	 * @see #getEffect()
	 * @generated
	 */
	EAttribute getEffect_LevelType();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Effect#getMoveFromLastKnownParent <em>Move From Last Known Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Move From Last Known Parent</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Effect#getMoveFromLastKnownParent()
	 * @see #getEffect()
	 * @generated
	 */
	EAttribute getEffect_MoveFromLastKnownParent();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Effect#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Effect#getName()
	 * @see #getEffect()
	 * @generated
	 */
	EAttribute getEffect_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Effect#getNewDuration <em>New Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Duration</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Effect#getNewDuration()
	 * @see #getEffect()
	 * @generated
	 */
	EAttribute getEffect_NewDuration();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Effect#getOwnerAbility <em>Owner Ability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Owner Ability</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Effect#getOwnerAbility()
	 * @see #getEffect()
	 * @generated
	 */
	EAttribute getEffect_OwnerAbility();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Effect#getPersistent <em>Persistent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persistent</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Effect#getPersistent()
	 * @see #getEffect()
	 * @generated
	 */
	EAttribute getEffect_Persistent();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Effect#getPlayEffectType <em>Play Effect Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Play Effect Type</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Effect#getPlayEffectType()
	 * @see #getEffect()
	 * @generated
	 */
	EAttribute getEffect_PlayEffectType();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Effect#getRemove <em>Remove</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remove</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Effect#getRemove()
	 * @see #getEffect()
	 * @generated
	 */
	EAttribute getEffect_Remove();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Effect#getRequireLevel <em>Require Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Require Level</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Effect#getRequireLevel()
	 * @see #getEffect()
	 * @generated
	 */
	EAttribute getEffect_RequireLevel();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Effect#getRevealToOther <em>Reveal To Other</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reveal To Other</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Effect#getRevealToOther()
	 * @see #getEffect()
	 * @generated
	 */
	EAttribute getEffect_RevealToOther();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Effect#getReverse <em>Reverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reverse</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Effect#getReverse()
	 * @see #getEffect()
	 * @generated
	 */
	EAttribute getEffect_Reverse();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Effect#getShuffle <em>Shuffle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shuffle</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Effect#getShuffle()
	 * @see #getEffect()
	 * @generated
	 */
	EAttribute getEffect_Shuffle();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Effect#getSide <em>Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Side</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Effect#getSide()
	 * @see #getEffect()
	 * @generated
	 */
	EAttribute getEffect_Side();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Effect#getSubType <em>Sub Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sub Type</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Effect#getSubType()
	 * @see #getEffect()
	 * @generated
	 */
	EAttribute getEffect_SubType();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Effect#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Effect#getType()
	 * @see #getEffect()
	 * @generated
	 */
	EAttribute getEffect_Type();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Effect#getUnfreeze <em>Unfreeze</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unfreeze</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Effect#getUnfreeze()
	 * @see #getEffect()
	 * @generated
	 */
	EAttribute getEffect_Unfreeze();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Effect#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Effect#getValue()
	 * @see #getEffect()
	 * @generated
	 */
	EAttribute getEffect_Value();

	/**
	 * Returns the meta object for class '{@link net.mmyumu.docdoc.model.Cards.ExistingCard <em>Existing Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Existing Card</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.ExistingCard
	 * @generated
	 */
	EClass getExistingCard();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.ExistingCard#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.ExistingCard#getName()
	 * @see #getExistingCard()
	 * @generated
	 */
	EAttribute getExistingCard_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.ExistingCard#getRarity <em>Rarity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rarity</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.ExistingCard#getRarity()
	 * @see #getExistingCard()
	 * @generated
	 */
	EAttribute getExistingCard_Rarity();

	/**
	 * Returns the meta object for class '{@link net.mmyumu.docdoc.model.Cards.OnGoing <em>On Going</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Going</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.OnGoing
	 * @generated
	 */
	EClass getOnGoing();

	/**
	 * Returns the meta object for the containment reference '{@link net.mmyumu.docdoc.model.Cards.OnGoing#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.OnGoing#getCondition()
	 * @see #getOnGoing()
	 * @generated
	 */
	EReference getOnGoing_Condition();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.OnGoing#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.OnGoing#getDuration()
	 * @see #getOnGoing()
	 * @generated
	 */
	EAttribute getOnGoing_Duration();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.OnGoing#getSuicideParent <em>Suicide Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suicide Parent</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.OnGoing#getSuicideParent()
	 * @see #getOnGoing()
	 * @generated
	 */
	EAttribute getOnGoing_SuicideParent();

	/**
	 * Returns the meta object for class '{@link net.mmyumu.docdoc.model.Cards.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Option
	 * @generated
	 */
	EClass getOption();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Option#getDisplayText <em>Display Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Text</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Option#getDisplayText()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_DisplayText();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Option#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Option#getValue()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Value();

	/**
	 * Returns the meta object for class '{@link net.mmyumu.docdoc.model.Cards.School <em>School</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>School</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.School
	 * @generated
	 */
	EClass getSchool();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.School#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.School#getName()
	 * @see #getSchool()
	 * @generated
	 */
	EAttribute getSchool_Name();

	/**
	 * Returns the meta object for class '{@link net.mmyumu.docdoc.model.Cards.Subgroup <em>Subgroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subgroup</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Subgroup
	 * @generated
	 */
	EClass getSubgroup();

	/**
	 * Returns the meta object for the attribute list '{@link net.mmyumu.docdoc.model.Cards.Subgroup#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Subgroup#getGroup()
	 * @see #getSubgroup()
	 * @generated
	 */
	EAttribute getSubgroup_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mmyumu.docdoc.model.Cards.Subgroup#getTemplateEffect <em>Template Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Template Effect</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Subgroup#getTemplateEffect()
	 * @see #getSubgroup()
	 * @generated
	 */
	EReference getSubgroup_TemplateEffect();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mmyumu.docdoc.model.Cards.Subgroup#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Subgroup#getTarget()
	 * @see #getSubgroup()
	 * @generated
	 */
	EReference getSubgroup_Target();

	/**
	 * Returns the meta object for class '{@link net.mmyumu.docdoc.model.Cards.Target <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Target
	 * @generated
	 */
	EClass getTarget();

	/**
	 * Returns the meta object for the attribute list '{@link net.mmyumu.docdoc.model.Cards.Target#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Target#getGroup()
	 * @see #getTarget()
	 * @generated
	 */
	EAttribute getTarget_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mmyumu.docdoc.model.Cards.Target#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Target#getVariable()
	 * @see #getTarget()
	 * @generated
	 */
	EReference getTarget_Variable();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mmyumu.docdoc.model.Cards.Target#getVariable2 <em>Variable2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable2</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Target#getVariable2()
	 * @see #getTarget()
	 * @generated
	 */
	EReference getTarget_Variable2();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mmyumu.docdoc.model.Cards.Target#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Condition</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Target#getCondition()
	 * @see #getTarget()
	 * @generated
	 */
	EReference getTarget_Condition();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mmyumu.docdoc.model.Cards.Target#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Option</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Target#getOption()
	 * @see #getTarget()
	 * @generated
	 */
	EReference getTarget_Option();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mmyumu.docdoc.model.Cards.Target#getCardType <em>Card Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Card Type</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Target#getCardType()
	 * @see #getTarget()
	 * @generated
	 */
	EReference getTarget_CardType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mmyumu.docdoc.model.Cards.Target#getCardFilter <em>Card Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Card Filter</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Target#getCardFilter()
	 * @see #getTarget()
	 * @generated
	 */
	EReference getTarget_CardFilter();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mmyumu.docdoc.model.Cards.Target#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trigger</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Target#getTrigger()
	 * @see #getTarget()
	 * @generated
	 */
	EReference getTarget_Trigger();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mmyumu.docdoc.model.Cards.Target#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Effect</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Target#getEffect()
	 * @see #getTarget()
	 * @generated
	 */
	EReference getTarget_Effect();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mmyumu.docdoc.model.Cards.Target#getSubgroup <em>Subgroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Subgroup</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Target#getSubgroup()
	 * @see #getTarget()
	 * @generated
	 */
	EReference getTarget_Subgroup();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mmyumu.docdoc.model.Cards.Target#getBattlegroundFilter <em>Battleground Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Battleground Filter</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Target#getBattlegroundFilter()
	 * @see #getTarget()
	 * @generated
	 */
	EReference getTarget_BattlegroundFilter();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Target#getAllowDuplicate <em>Allow Duplicate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Allow Duplicate</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Target#getAllowDuplicate()
	 * @see #getTarget()
	 * @generated
	 */
	EAttribute getTarget_AllowDuplicate();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Target#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Target#getAmount()
	 * @see #getTarget()
	 * @generated
	 */
	EAttribute getTarget_Amount();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Target#getAmountVisible <em>Amount Visible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount Visible</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Target#getAmountVisible()
	 * @see #getTarget()
	 * @generated
	 */
	EAttribute getTarget_AmountVisible();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Target#getAutoTakeFirstInputs <em>Auto Take First Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Take First Inputs</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Target#getAutoTakeFirstInputs()
	 * @see #getTarget()
	 * @generated
	 */
	EAttribute getTarget_AutoTakeFirstInputs();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Target#getBattlegroundPositionState <em>Battleground Position State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Battleground Position State</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Target#getBattlegroundPositionState()
	 * @see #getTarget()
	 * @generated
	 */
	EAttribute getTarget_BattlegroundPositionState();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Target#getCancelable <em>Cancelable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cancelable</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Target#getCancelable()
	 * @see #getTarget()
	 * @generated
	 */
	EAttribute getTarget_Cancelable();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Target#getCantTargetOccupant <em>Cant Target Occupant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cant Target Occupant</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Target#getCantTargetOccupant()
	 * @see #getTarget()
	 * @generated
	 */
	EAttribute getTarget_CantTargetOccupant();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Target#getCantTargetParent <em>Cant Target Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cant Target Parent</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Target#getCantTargetParent()
	 * @see #getTarget()
	 * @generated
	 */
	EAttribute getTarget_CantTargetParent();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Target#getCantTargetPrevious <em>Cant Target Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cant Target Previous</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Target#getCantTargetPrevious()
	 * @see #getTarget()
	 * @generated
	 */
	EAttribute getTarget_CantTargetPrevious();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Target#getCantTargetSelf <em>Cant Target Self</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cant Target Self</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Target#getCantTargetSelf()
	 * @see #getTarget()
	 * @generated
	 */
	EAttribute getTarget_CantTargetSelf();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Target#getCardType1 <em>Card Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Card Type1</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Target#getCardType1()
	 * @see #getTarget()
	 * @generated
	 */
	EAttribute getTarget_CardType1();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Target#getDontUpdateAfterExecution <em>Dont Update After Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dont Update After Execution</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Target#getDontUpdateAfterExecution()
	 * @see #getTarget()
	 * @generated
	 */
	EAttribute getTarget_DontUpdateAfterExecution();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Target#getExceptFromTrigger <em>Except From Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Except From Trigger</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Target#getExceptFromTrigger()
	 * @see #getTarget()
	 * @generated
	 */
	EAttribute getTarget_ExceptFromTrigger();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Target#getExcludeUnique <em>Exclude Unique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclude Unique</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Target#getExcludeUnique()
	 * @see #getTarget()
	 * @generated
	 */
	EAttribute getTarget_ExcludeUnique();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Target#getForceExecute <em>Force Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Force Execute</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Target#getForceExecute()
	 * @see #getTarget()
	 * @generated
	 */
	EAttribute getTarget_ForceExecute();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Target#getIgnoreWard <em>Ignore Ward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore Ward</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Target#getIgnoreWard()
	 * @see #getTarget()
	 * @generated
	 */
	EAttribute getTarget_IgnoreWard();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Target#getInputOnExec <em>Input On Exec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Input On Exec</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Target#getInputOnExec()
	 * @see #getTarget()
	 * @generated
	 */
	EAttribute getTarget_InputOnExec();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Target#getMinAmount <em>Min Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Amount</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Target#getMinAmount()
	 * @see #getTarget()
	 * @generated
	 */
	EAttribute getTarget_MinAmount();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Target#getNeedActivation <em>Need Activation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Need Activation</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Target#getNeedActivation()
	 * @see #getTarget()
	 * @generated
	 */
	EAttribute getTarget_NeedActivation();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Target#getOption1 <em>Option1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Option1</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Target#getOption1()
	 * @see #getTarget()
	 * @generated
	 */
	EAttribute getTarget_Option1();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Target#getPersistent <em>Persistent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persistent</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Target#getPersistent()
	 * @see #getTarget()
	 * @generated
	 */
	EAttribute getTarget_Persistent();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Target#getRandom <em>Random</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Random</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Target#getRandom()
	 * @see #getTarget()
	 * @generated
	 */
	EAttribute getTarget_Random();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Target#getRevealToOther <em>Reveal To Other</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Reveal To Other</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Target#getRevealToOther()
	 * @see #getTarget()
	 * @generated
	 */
	EAttribute getTarget_RevealToOther();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Target#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shape</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Target#getShape()
	 * @see #getTarget()
	 * @generated
	 */
	EAttribute getTarget_Shape();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Target#getSide <em>Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Side</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Target#getSide()
	 * @see #getTarget()
	 * @generated
	 */
	EAttribute getTarget_Side();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Target#getSkipNextTargetValidation <em>Skip Next Target Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Skip Next Target Validation</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Target#getSkipNextTargetValidation()
	 * @see #getTarget()
	 * @generated
	 */
	EAttribute getTarget_SkipNextTargetValidation();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Target#getSkipSubTargetValidation <em>Skip Sub Target Validation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Skip Sub Target Validation</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Target#getSkipSubTargetValidation()
	 * @see #getTarget()
	 * @generated
	 */
	EAttribute getTarget_SkipSubTargetValidation();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Target#getZone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zone</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Target#getZone()
	 * @see #getTarget()
	 * @generated
	 */
	EAttribute getTarget_Zone();

	/**
	 * Returns the meta object for class '{@link net.mmyumu.docdoc.model.Cards.TemplateEffect <em>Template Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Template Effect</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.TemplateEffect
	 * @generated
	 */
	EClass getTemplateEffect();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mmyumu.docdoc.model.Cards.TemplateEffect#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.TemplateEffect#getTarget()
	 * @see #getTemplateEffect()
	 * @generated
	 */
	EReference getTemplateEffect_Target();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mmyumu.docdoc.model.Cards.TemplateEffect#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Trigger</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.TemplateEffect#getTrigger()
	 * @see #getTemplateEffect()
	 * @generated
	 */
	EReference getTemplateEffect_Trigger();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.TemplateEffect#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.TemplateEffect#getName()
	 * @see #getTemplateEffect()
	 * @generated
	 */
	EAttribute getTemplateEffect_Name();

	/**
	 * Returns the meta object for class '{@link net.mmyumu.docdoc.model.Cards.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for the attribute list '{@link net.mmyumu.docdoc.model.Cards.Trigger#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Trigger#getGroup()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mmyumu.docdoc.model.Cards.Trigger#getCardFilter <em>Card Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Card Filter</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Trigger#getCardFilter()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_CardFilter();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mmyumu.docdoc.model.Cards.Trigger#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Trigger#getTarget()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_Target();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mmyumu.docdoc.model.Cards.Trigger#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Condition</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Trigger#getCondition()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_Condition();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Trigger#getDamageIncludeFlags <em>Damage Include Flags</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Damage Include Flags</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Trigger#getDamageIncludeFlags()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_DamageIncludeFlags();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Trigger#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Trigger#getDuration()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_Duration();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Trigger#getExecuteOncePerTransaction <em>Execute Once Per Transaction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execute Once Per Transaction</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Trigger#getExecuteOncePerTransaction()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_ExecuteOncePerTransaction();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Trigger#getExecuteOncePerTurn <em>Execute Once Per Turn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execute Once Per Turn</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Trigger#getExecuteOncePerTurn()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_ExecuteOncePerTurn();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Trigger#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Trigger#getLocation()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_Location();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Trigger#getSide <em>Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Side</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Trigger#getSide()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_Side();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Trigger#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Trigger#getType()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_Type();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Trigger#getUseTriggererAsInitiator <em>Use Triggerer As Initiator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Triggerer As Initiator</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Trigger#getUseTriggererAsInitiator()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_UseTriggererAsInitiator();

	/**
	 * Returns the meta object for class '{@link net.mmyumu.docdoc.model.Cards.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the containment reference '{@link net.mmyumu.docdoc.model.Cards.Variable#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Variable#getTarget()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Target();

	/**
	 * Returns the meta object for the containment reference '{@link net.mmyumu.docdoc.model.Cards.Variable#getCardFilter <em>Card Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Card Filter</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Variable#getCardFilter()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_CardFilter();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Variable#getAbility <em>Ability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ability</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Variable#getAbility()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Ability();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Variable#getCounterType <em>Counter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Counter Type</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Variable#getCounterType()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_CounterType();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Variable#getFromTrigger <em>From Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>From Trigger</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Variable#getFromTrigger()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_FromTrigger();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Variable#getIncludeSchool <em>Include School</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Include School</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Variable#getIncludeSchool()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_IncludeSchool();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Variable#getLevelType <em>Level Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Level Type</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Variable#getLevelType()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_LevelType();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Variable#getMustBeTargetable <em>Must Be Targetable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Must Be Targetable</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Variable#getMustBeTargetable()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_MustBeTargetable();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Variable#getSide <em>Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Side</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Variable#getSide()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Side();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Variable#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Variable#getType()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Type();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Variable#getUnitType <em>Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit Type</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Variable#getUnitType()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_UnitType();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Variable#getUseCurrentTarget <em>Use Current Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Current Target</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Variable#getUseCurrentTarget()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_UseCurrentTarget();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Variable#getUseLastTarget <em>Use Last Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Last Target</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Variable#getUseLastTarget()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_UseLastTarget();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Variable#getUseParent <em>Use Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Parent</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Variable#getUseParent()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_UseParent();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Variable#getValueModifier <em>Value Modifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Modifier</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Variable#getValueModifier()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_ValueModifier();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CardsFactory getCardsFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link net.mmyumu.docdoc.model.Cards.impl.AbilityImpl <em>Ability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mmyumu.docdoc.model.Cards.impl.AbilityImpl
		 * @see net.mmyumu.docdoc.model.Cards.impl.CardsPackageImpl#getAbility()
		 * @generated
		 */
		EClass ABILITY = eINSTANCE.getAbility();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABILITY__TYPE = eINSTANCE.getAbility_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABILITY__VALUE = eINSTANCE.getAbility_Value();

		/**
		 * The meta object literal for the '{@link net.mmyumu.docdoc.model.Cards.impl.AdditionalCostImpl <em>Additional Cost</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mmyumu.docdoc.model.Cards.impl.AdditionalCostImpl
		 * @see net.mmyumu.docdoc.model.Cards.impl.CardsPackageImpl#getAdditionalCost()
		 * @generated
		 */
		EClass ADDITIONAL_COST = eINSTANCE.getAdditionalCost();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITIONAL_COST__TARGET = eINSTANCE.getAdditionalCost_Target();

		/**
		 * The meta object literal for the '{@link net.mmyumu.docdoc.model.Cards.impl.BattlegroundFilterImpl <em>Battleground Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mmyumu.docdoc.model.Cards.impl.BattlegroundFilterImpl
		 * @see net.mmyumu.docdoc.model.Cards.impl.CardsPackageImpl#getBattlegroundFilter()
		 * @generated
		 */
		EClass BATTLEGROUND_FILTER = eINSTANCE.getBattlegroundFilter();

		/**
		 * The meta object literal for the '<em><b>Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BATTLEGROUND_FILTER__LINE = eINSTANCE.getBattlegroundFilter_Line();

		/**
		 * The meta object literal for the '{@link net.mmyumu.docdoc.model.Cards.impl.CardImpl <em>Card</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mmyumu.docdoc.model.Cards.impl.CardImpl
		 * @see net.mmyumu.docdoc.model.Cards.impl.CardsPackageImpl#getCard()
		 * @generated
		 */
		EClass CARD = eINSTANCE.getCard();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__MIXED = eINSTANCE.getCard_Mixed();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__GROUP = eINSTANCE.getCard_Group();

		/**
		 * The meta object literal for the '<em><b>Ability</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD__ABILITY = eINSTANCE.getCard_Ability();

		/**
		 * The meta object literal for the '<em><b>School</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD__SCHOOL = eINSTANCE.getCard_School();

		/**
		 * The meta object literal for the '<em><b>Ongoing</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD__ONGOING = eINSTANCE.getCard_Ongoing();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD__TARGET = eINSTANCE.getCard_Target();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__DESCRIPTION = eINSTANCE.getCard_Description();

		/**
		 * The meta object literal for the '<em><b>Extra Description</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__EXTRA_DESCRIPTION = eINSTANCE.getCard_ExtraDescription();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD__VARIABLE = eINSTANCE.getCard_Variable();

		/**
		 * The meta object literal for the '<em><b>Variable2</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD__VARIABLE2 = eINSTANCE.getCard_Variable2();

		/**
		 * The meta object literal for the '<em><b>Variable3</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD__VARIABLE3 = eINSTANCE.getCard_Variable3();

		/**
		 * The meta object literal for the '<em><b>Variable4</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD__VARIABLE4 = eINSTANCE.getCard_Variable4();

		/**
		 * The meta object literal for the '<em><b>Variable5</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD__VARIABLE5 = eINSTANCE.getCard_Variable5();

		/**
		 * The meta object literal for the '<em><b>Variable6</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD__VARIABLE6 = eINSTANCE.getCard_Variable6();

		/**
		 * The meta object literal for the '<em><b>Variable7</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD__VARIABLE7 = eINSTANCE.getCard_Variable7();

		/**
		 * The meta object literal for the '<em><b>Playability Condition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD__PLAYABILITY_CONDITION = eINSTANCE.getCard_PlayabilityCondition();

		/**
		 * The meta object literal for the '<em><b>Attack Condition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD__ATTACK_CONDITION = eINSTANCE.getCard_AttackCondition();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD__TRIGGER = eINSTANCE.getCard_Trigger();

		/**
		 * The meta object literal for the '<em><b>Additional Cost</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD__ADDITIONAL_COST = eINSTANCE.getCard_AdditionalCost();

		/**
		 * The meta object literal for the '<em><b>Attack</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__ATTACK = eINSTANCE.getCard_Attack();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__COST = eINSTANCE.getCard_Cost();

		/**
		 * The meta object literal for the '<em><b>Destiny Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__DESTINY_LEVEL = eINSTANCE.getCard_DestinyLevel();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__DISPLAY_NAME = eINSTANCE.getCard_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Faction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__FACTION = eINSTANCE.getCard_Faction();

		/**
		 * The meta object literal for the '<em><b>HP</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__HP = eINSTANCE.getCard_HP();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__ID = eINSTANCE.getCard_ID();

		/**
		 * The meta object literal for the '<em><b>Magic Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__MAGIC_LEVEL = eINSTANCE.getCard_MagicLevel();

		/**
		 * The meta object literal for the '<em><b>Might Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__MIGHT_LEVEL = eINSTANCE.getCard_MightLevel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__NAME = eINSTANCE.getCard_Name();

		/**
		 * The meta object literal for the '<em><b>Not Localized</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__NOT_LOCALIZED = eINSTANCE.getCard_NotLocalized();

		/**
		 * The meta object literal for the '<em><b>Race</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__RACE = eINSTANCE.getCard_Race();

		/**
		 * The meta object literal for the '<em><b>Rarity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__RARITY = eINSTANCE.getCard_Rarity();

		/**
		 * The meta object literal for the '<em><b>Resource Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__RESOURCE_NAME = eINSTANCE.getCard_ResourceName();

		/**
		 * The meta object literal for the '<em><b>Retaliate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__RETALIATE = eINSTANCE.getCard_Retaliate();

		/**
		 * The meta object literal for the '<em><b>School1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__SCHOOL1 = eINSTANCE.getCard_School1();

		/**
		 * The meta object literal for the '<em><b>Schools Aligned</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__SCHOOLS_ALIGNED = eINSTANCE.getCard_SchoolsAligned();

		/**
		 * The meta object literal for the '<em><b>Sub Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__SUB_TYPE = eINSTANCE.getCard_SubType();

		/**
		 * The meta object literal for the '<em><b>Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__TOKEN = eINSTANCE.getCard_Token();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__TYPE = eINSTANCE.getCard_Type();

		/**
		 * The meta object literal for the '<em><b>Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__UNIQUE = eINSTANCE.getCard_Unique();

		/**
		 * The meta object literal for the '<em><b>Zone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__ZONE = eINSTANCE.getCard_Zone();

		/**
		 * The meta object literal for the '{@link net.mmyumu.docdoc.model.Cards.impl.CardFilterImpl <em>Card Filter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mmyumu.docdoc.model.Cards.impl.CardFilterImpl
		 * @see net.mmyumu.docdoc.model.Cards.impl.CardsPackageImpl#getCardFilter()
		 * @generated
		 */
		EClass CARD_FILTER = eINSTANCE.getCardFilter();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD_FILTER__VARIABLE = eINSTANCE.getCardFilter_Variable();

		/**
		 * The meta object literal for the '<em><b>Attack Hero Last Turn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_FILTER__ATTACK_HERO_LAST_TURN = eINSTANCE.getCardFilter_AttackHeroLastTurn();

		/**
		 * The meta object literal for the '<em><b>Base Max Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_FILTER__BASE_MAX_COST = eINSTANCE.getCardFilter_BaseMaxCost();

		/**
		 * The meta object literal for the '<em><b>Deal Damage To Hero Last Turn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_FILTER__DEAL_DAMAGE_TO_HERO_LAST_TURN = eINSTANCE.getCardFilter_DealDamageToHeroLastTurn();

		/**
		 * The meta object literal for the '<em><b>Exclude Faction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_FILTER__EXCLUDE_FACTION = eINSTANCE.getCardFilter_ExcludeFaction();

		/**
		 * The meta object literal for the '<em><b>Exclude Races</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_FILTER__EXCLUDE_RACES = eINSTANCE.getCardFilter_ExcludeRaces();

		/**
		 * The meta object literal for the '<em><b>Exclude School</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_FILTER__EXCLUDE_SCHOOL = eINSTANCE.getCardFilter_ExcludeSchool();

		/**
		 * The meta object literal for the '<em><b>Exclude Token</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_FILTER__EXCLUDE_TOKEN = eINSTANCE.getCardFilter_ExcludeToken();

		/**
		 * The meta object literal for the '<em><b>Exclude Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_FILTER__EXCLUDE_UNIQUE = eINSTANCE.getCardFilter_ExcludeUnique();

		/**
		 * The meta object literal for the '<em><b>Exclude Unit Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_FILTER__EXCLUDE_UNIT_TYPE = eINSTANCE.getCardFilter_ExcludeUnitType();

		/**
		 * The meta object literal for the '<em><b>Include Ability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_FILTER__INCLUDE_ABILITY = eINSTANCE.getCardFilter_IncludeAbility();

		/**
		 * The meta object literal for the '<em><b>Include Card ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_FILTER__INCLUDE_CARD_ID = eINSTANCE.getCardFilter_IncludeCardID();

		/**
		 * The meta object literal for the '<em><b>Include Card Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_FILTER__INCLUDE_CARD_TYPE = eINSTANCE.getCardFilter_IncludeCardType();

		/**
		 * The meta object literal for the '<em><b>Include Column</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_FILTER__INCLUDE_COLUMN = eINSTANCE.getCardFilter_IncludeColumn();

		/**
		 * The meta object literal for the '<em><b>Include Counter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_FILTER__INCLUDE_COUNTER = eINSTANCE.getCardFilter_IncludeCounter();

		/**
		 * The meta object literal for the '<em><b>Include Enchant Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_FILTER__INCLUDE_ENCHANT_UNIT = eINSTANCE.getCardFilter_IncludeEnchantUnit();

		/**
		 * The meta object literal for the '<em><b>Include Faction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_FILTER__INCLUDE_FACTION = eINSTANCE.getCardFilter_IncludeFaction();

		/**
		 * The meta object literal for the '<em><b>Include Front Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_FILTER__INCLUDE_FRONT_LINE = eINSTANCE.getCardFilter_IncludeFrontLine();

		/**
		 * The meta object literal for the '<em><b>Include Occupant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_FILTER__INCLUDE_OCCUPANT = eINSTANCE.getCardFilter_IncludeOccupant();

		/**
		 * The meta object literal for the '<em><b>Include Ongoing Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_FILTER__INCLUDE_ONGOING_TYPE = eINSTANCE.getCardFilter_IncludeOngoingType();

		/**
		 * The meta object literal for the '<em><b>Include Races</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_FILTER__INCLUDE_RACES = eINSTANCE.getCardFilter_IncludeRaces();

		/**
		 * The meta object literal for the '<em><b>Include School</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_FILTER__INCLUDE_SCHOOL = eINSTANCE.getCardFilter_IncludeSchool();

		/**
		 * The meta object literal for the '<em><b>Include Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_FILTER__INCLUDE_STATUS = eINSTANCE.getCardFilter_IncludeStatus();

		/**
		 * The meta object literal for the '<em><b>Include Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_FILTER__INCLUDE_UNIQUE = eINSTANCE.getCardFilter_IncludeUnique();

		/**
		 * The meta object literal for the '<em><b>Include Unit Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_FILTER__INCLUDE_UNIT_TYPE = eINSTANCE.getCardFilter_IncludeUnitType();

		/**
		 * The meta object literal for the '<em><b>Level Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_FILTER__LEVEL_TYPE = eINSTANCE.getCardFilter_LevelType();

		/**
		 * The meta object literal for the '<em><b>Max Attack</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_FILTER__MAX_ATTACK = eINSTANCE.getCardFilter_MaxAttack();

		/**
		 * The meta object literal for the '<em><b>Max Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_FILTER__MAX_COST = eINSTANCE.getCardFilter_MaxCost();

		/**
		 * The meta object literal for the '<em><b>Max Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_FILTER__MAX_LEVEL = eINSTANCE.getCardFilter_MaxLevel();

		/**
		 * The meta object literal for the '<em><b>Same Card Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_FILTER__SAME_CARD_TYPE = eINSTANCE.getCardFilter_SameCardType();

		/**
		 * The meta object literal for the '<em><b>Same GPID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_FILTER__SAME_GPID = eINSTANCE.getCardFilter_SameGPID();

		/**
		 * The meta object literal for the '<em><b>Share Races</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_FILTER__SHARE_RACES = eINSTANCE.getCardFilter_ShareRaces();

		/**
		 * The meta object literal for the '<em><b>Share Races With Occupant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_FILTER__SHARE_RACES_WITH_OCCUPANT = eINSTANCE.getCardFilter_ShareRacesWithOccupant();

		/**
		 * The meta object literal for the '<em><b>Side</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_FILTER__SIDE = eINSTANCE.getCardFilter_Side();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_FILTER__VALUE = eINSTANCE.getCardFilter_Value();

		/**
		 * The meta object literal for the '{@link net.mmyumu.docdoc.model.Cards.impl.CardsImpl <em>Cards</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mmyumu.docdoc.model.Cards.impl.CardsImpl
		 * @see net.mmyumu.docdoc.model.Cards.impl.CardsPackageImpl#getCards()
		 * @generated
		 */
		EClass CARDS = eINSTANCE.getCards();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARDS__GROUP = eINSTANCE.getCards_Group();

		/**
		 * The meta object literal for the '<em><b>Card</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARDS__CARD = eINSTANCE.getCards_Card();

		/**
		 * The meta object literal for the '<em><b>Existing Card</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARDS__EXISTING_CARD = eINSTANCE.getCards_ExistingCard();

		/**
		 * The meta object literal for the '<em><b>Template Effect</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARDS__TEMPLATE_EFFECT = eINSTANCE.getCards_TemplateEffect();

		/**
		 * The meta object literal for the '{@link net.mmyumu.docdoc.model.Cards.impl.CardTypeImpl <em>Card Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mmyumu.docdoc.model.Cards.impl.CardTypeImpl
		 * @see net.mmyumu.docdoc.model.Cards.impl.CardsPackageImpl#getCardType()
		 * @generated
		 */
		EClass CARD_TYPE = eINSTANCE.getCardType();

		/**
		 * The meta object literal for the '<em><b>Exclude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_TYPE__EXCLUDE = eINSTANCE.getCardType_Exclude();

		/**
		 * The meta object literal for the '<em><b>Include</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_TYPE__INCLUDE = eINSTANCE.getCardType_Include();

		/**
		 * The meta object literal for the '{@link net.mmyumu.docdoc.model.Cards.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mmyumu.docdoc.model.Cards.impl.ConditionImpl
		 * @see net.mmyumu.docdoc.model.Cards.impl.CardsPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION__CONDITION = eINSTANCE.getCondition_Condition();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__OPERATOR = eINSTANCE.getCondition_Operator();

		/**
		 * The meta object literal for the '<em><b>Value A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__VALUE_A = eINSTANCE.getCondition_ValueA();

		/**
		 * The meta object literal for the '<em><b>Value B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__VALUE_B = eINSTANCE.getCondition_ValueB();

		/**
		 * The meta object literal for the '{@link net.mmyumu.docdoc.model.Cards.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mmyumu.docdoc.model.Cards.impl.DocumentRootImpl
		 * @see net.mmyumu.docdoc.model.Cards.impl.CardsPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Cards</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CARDS = eINSTANCE.getDocumentRoot_Cards();

		/**
		 * The meta object literal for the '{@link net.mmyumu.docdoc.model.Cards.impl.EffectImpl <em>Effect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mmyumu.docdoc.model.Cards.impl.EffectImpl
		 * @see net.mmyumu.docdoc.model.Cards.impl.CardsPackageImpl#getEffect()
		 * @generated
		 */
		EClass EFFECT = eINSTANCE.getEffect();

		/**
		 * The meta object literal for the '<em><b>Card Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFFECT__CARD_FILTER = eINSTANCE.getEffect_CardFilter();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EFFECT__CONDITION = eINSTANCE.getEffect_Condition();

		/**
		 * The meta object literal for the '<em><b>Ability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFECT__ABILITY = eINSTANCE.getEffect_Ability();

		/**
		 * The meta object literal for the '<em><b>Bottom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFECT__BOTTOM = eINSTANCE.getEffect_Bottom();

		/**
		 * The meta object literal for the '<em><b>Cancel Destination</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFECT__CANCEL_DESTINATION = eINSTANCE.getEffect_CancelDestination();

		/**
		 * The meta object literal for the '<em><b>Cant Target Parent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFECT__CANT_TARGET_PARENT = eINSTANCE.getEffect_CantTargetParent();

		/**
		 * The meta object literal for the '<em><b>Card Holder</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFECT__CARD_HOLDER = eINSTANCE.getEffect_CardHolder();

		/**
		 * The meta object literal for the '<em><b>Counter Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFECT__COUNTER_TYPE = eINSTANCE.getEffect_CounterType();

		/**
		 * The meta object literal for the '<em><b>Damage Exclude Flags</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFECT__DAMAGE_EXCLUDE_FLAGS = eINSTANCE.getEffect_DamageExcludeFlags();

		/**
		 * The meta object literal for the '<em><b>Damage Flags</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFECT__DAMAGE_FLAGS = eINSTANCE.getEffect_DamageFlags();

		/**
		 * The meta object literal for the '<em><b>Damage Include Flags</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFECT__DAMAGE_INCLUDE_FLAGS = eINSTANCE.getEffect_DamageIncludeFlags();

		/**
		 * The meta object literal for the '<em><b>Damage Lethal Schools</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFECT__DAMAGE_LETHAL_SCHOOLS = eINSTANCE.getEffect_DamageLethalSchools();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFECT__DESTINATION = eINSTANCE.getEffect_Destination();

		/**
		 * The meta object literal for the '<em><b>Dont Generate Target Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFECT__DONT_GENERATE_TARGET_POSITION = eINSTANCE.getEffect_DontGenerateTargetPosition();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFECT__DURATION = eINSTANCE.getEffect_Duration();

		/**
		 * The meta object literal for the '<em><b>Epic Enrage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFECT__EPIC_ENRAGE = eINSTANCE.getEffect_EpicEnrage();

		/**
		 * The meta object literal for the '<em><b>Evaluation Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFECT__EVALUATION_ORDER = eINSTANCE.getEffect_EvaluationOrder();

		/**
		 * The meta object literal for the '<em><b>Fake Additional Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFECT__FAKE_ADDITIONAL_COST = eINSTANCE.getEffect_FakeAdditionalCost();

		/**
		 * The meta object literal for the '<em><b>Force</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFECT__FORCE = eINSTANCE.getEffect_Force();

		/**
		 * The meta object literal for the '<em><b>Free</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFECT__FREE = eINSTANCE.getEffect_Free();

		/**
		 * The meta object literal for the '<em><b>Global Effect Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFECT__GLOBAL_EFFECT_TYPE = eINSTANCE.getEffect_GlobalEffectType();

		/**
		 * The meta object literal for the '<em><b>Level Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFECT__LEVEL_TYPE = eINSTANCE.getEffect_LevelType();

		/**
		 * The meta object literal for the '<em><b>Move From Last Known Parent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFECT__MOVE_FROM_LAST_KNOWN_PARENT = eINSTANCE.getEffect_MoveFromLastKnownParent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFECT__NAME = eINSTANCE.getEffect_Name();

		/**
		 * The meta object literal for the '<em><b>New Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFECT__NEW_DURATION = eINSTANCE.getEffect_NewDuration();

		/**
		 * The meta object literal for the '<em><b>Owner Ability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFECT__OWNER_ABILITY = eINSTANCE.getEffect_OwnerAbility();

		/**
		 * The meta object literal for the '<em><b>Persistent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFECT__PERSISTENT = eINSTANCE.getEffect_Persistent();

		/**
		 * The meta object literal for the '<em><b>Play Effect Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFECT__PLAY_EFFECT_TYPE = eINSTANCE.getEffect_PlayEffectType();

		/**
		 * The meta object literal for the '<em><b>Remove</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFECT__REMOVE = eINSTANCE.getEffect_Remove();

		/**
		 * The meta object literal for the '<em><b>Require Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFECT__REQUIRE_LEVEL = eINSTANCE.getEffect_RequireLevel();

		/**
		 * The meta object literal for the '<em><b>Reveal To Other</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFECT__REVEAL_TO_OTHER = eINSTANCE.getEffect_RevealToOther();

		/**
		 * The meta object literal for the '<em><b>Reverse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFECT__REVERSE = eINSTANCE.getEffect_Reverse();

		/**
		 * The meta object literal for the '<em><b>Shuffle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFECT__SHUFFLE = eINSTANCE.getEffect_Shuffle();

		/**
		 * The meta object literal for the '<em><b>Side</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFECT__SIDE = eINSTANCE.getEffect_Side();

		/**
		 * The meta object literal for the '<em><b>Sub Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFECT__SUB_TYPE = eINSTANCE.getEffect_SubType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFECT__TYPE = eINSTANCE.getEffect_Type();

		/**
		 * The meta object literal for the '<em><b>Unfreeze</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFECT__UNFREEZE = eINSTANCE.getEffect_Unfreeze();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFECT__VALUE = eINSTANCE.getEffect_Value();

		/**
		 * The meta object literal for the '{@link net.mmyumu.docdoc.model.Cards.impl.ExistingCardImpl <em>Existing Card</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mmyumu.docdoc.model.Cards.impl.ExistingCardImpl
		 * @see net.mmyumu.docdoc.model.Cards.impl.CardsPackageImpl#getExistingCard()
		 * @generated
		 */
		EClass EXISTING_CARD = eINSTANCE.getExistingCard();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXISTING_CARD__NAME = eINSTANCE.getExistingCard_Name();

		/**
		 * The meta object literal for the '<em><b>Rarity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXISTING_CARD__RARITY = eINSTANCE.getExistingCard_Rarity();

		/**
		 * The meta object literal for the '{@link net.mmyumu.docdoc.model.Cards.impl.OnGoingImpl <em>On Going</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mmyumu.docdoc.model.Cards.impl.OnGoingImpl
		 * @see net.mmyumu.docdoc.model.Cards.impl.CardsPackageImpl#getOnGoing()
		 * @generated
		 */
		EClass ON_GOING = eINSTANCE.getOnGoing();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ON_GOING__CONDITION = eINSTANCE.getOnGoing_Condition();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ON_GOING__DURATION = eINSTANCE.getOnGoing_Duration();

		/**
		 * The meta object literal for the '<em><b>Suicide Parent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ON_GOING__SUICIDE_PARENT = eINSTANCE.getOnGoing_SuicideParent();

		/**
		 * The meta object literal for the '{@link net.mmyumu.docdoc.model.Cards.impl.OptionImpl <em>Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mmyumu.docdoc.model.Cards.impl.OptionImpl
		 * @see net.mmyumu.docdoc.model.Cards.impl.CardsPackageImpl#getOption()
		 * @generated
		 */
		EClass OPTION = eINSTANCE.getOption();

		/**
		 * The meta object literal for the '<em><b>Display Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__DISPLAY_TEXT = eINSTANCE.getOption_DisplayText();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__VALUE = eINSTANCE.getOption_Value();

		/**
		 * The meta object literal for the '{@link net.mmyumu.docdoc.model.Cards.impl.SchoolImpl <em>School</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mmyumu.docdoc.model.Cards.impl.SchoolImpl
		 * @see net.mmyumu.docdoc.model.Cards.impl.CardsPackageImpl#getSchool()
		 * @generated
		 */
		EClass SCHOOL = eINSTANCE.getSchool();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHOOL__NAME = eINSTANCE.getSchool_Name();

		/**
		 * The meta object literal for the '{@link net.mmyumu.docdoc.model.Cards.impl.SubgroupImpl <em>Subgroup</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mmyumu.docdoc.model.Cards.impl.SubgroupImpl
		 * @see net.mmyumu.docdoc.model.Cards.impl.CardsPackageImpl#getSubgroup()
		 * @generated
		 */
		EClass SUBGROUP = eINSTANCE.getSubgroup();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBGROUP__GROUP = eINSTANCE.getSubgroup_Group();

		/**
		 * The meta object literal for the '<em><b>Template Effect</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBGROUP__TEMPLATE_EFFECT = eINSTANCE.getSubgroup_TemplateEffect();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBGROUP__TARGET = eINSTANCE.getSubgroup_Target();

		/**
		 * The meta object literal for the '{@link net.mmyumu.docdoc.model.Cards.impl.TargetImpl <em>Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mmyumu.docdoc.model.Cards.impl.TargetImpl
		 * @see net.mmyumu.docdoc.model.Cards.impl.CardsPackageImpl#getTarget()
		 * @generated
		 */
		EClass TARGET = eINSTANCE.getTarget();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET__GROUP = eINSTANCE.getTarget_Group();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET__VARIABLE = eINSTANCE.getTarget_Variable();

		/**
		 * The meta object literal for the '<em><b>Variable2</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET__VARIABLE2 = eINSTANCE.getTarget_Variable2();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET__CONDITION = eINSTANCE.getTarget_Condition();

		/**
		 * The meta object literal for the '<em><b>Option</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET__OPTION = eINSTANCE.getTarget_Option();

		/**
		 * The meta object literal for the '<em><b>Card Type</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET__CARD_TYPE = eINSTANCE.getTarget_CardType();

		/**
		 * The meta object literal for the '<em><b>Card Filter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET__CARD_FILTER = eINSTANCE.getTarget_CardFilter();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET__TRIGGER = eINSTANCE.getTarget_Trigger();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET__EFFECT = eINSTANCE.getTarget_Effect();

		/**
		 * The meta object literal for the '<em><b>Subgroup</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET__SUBGROUP = eINSTANCE.getTarget_Subgroup();

		/**
		 * The meta object literal for the '<em><b>Battleground Filter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET__BATTLEGROUND_FILTER = eINSTANCE.getTarget_BattlegroundFilter();

		/**
		 * The meta object literal for the '<em><b>Allow Duplicate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET__ALLOW_DUPLICATE = eINSTANCE.getTarget_AllowDuplicate();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET__AMOUNT = eINSTANCE.getTarget_Amount();

		/**
		 * The meta object literal for the '<em><b>Amount Visible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET__AMOUNT_VISIBLE = eINSTANCE.getTarget_AmountVisible();

		/**
		 * The meta object literal for the '<em><b>Auto Take First Inputs</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET__AUTO_TAKE_FIRST_INPUTS = eINSTANCE.getTarget_AutoTakeFirstInputs();

		/**
		 * The meta object literal for the '<em><b>Battleground Position State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET__BATTLEGROUND_POSITION_STATE = eINSTANCE.getTarget_BattlegroundPositionState();

		/**
		 * The meta object literal for the '<em><b>Cancelable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET__CANCELABLE = eINSTANCE.getTarget_Cancelable();

		/**
		 * The meta object literal for the '<em><b>Cant Target Occupant</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET__CANT_TARGET_OCCUPANT = eINSTANCE.getTarget_CantTargetOccupant();

		/**
		 * The meta object literal for the '<em><b>Cant Target Parent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET__CANT_TARGET_PARENT = eINSTANCE.getTarget_CantTargetParent();

		/**
		 * The meta object literal for the '<em><b>Cant Target Previous</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET__CANT_TARGET_PREVIOUS = eINSTANCE.getTarget_CantTargetPrevious();

		/**
		 * The meta object literal for the '<em><b>Cant Target Self</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET__CANT_TARGET_SELF = eINSTANCE.getTarget_CantTargetSelf();

		/**
		 * The meta object literal for the '<em><b>Card Type1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET__CARD_TYPE1 = eINSTANCE.getTarget_CardType1();

		/**
		 * The meta object literal for the '<em><b>Dont Update After Execution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET__DONT_UPDATE_AFTER_EXECUTION = eINSTANCE.getTarget_DontUpdateAfterExecution();

		/**
		 * The meta object literal for the '<em><b>Except From Trigger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET__EXCEPT_FROM_TRIGGER = eINSTANCE.getTarget_ExceptFromTrigger();

		/**
		 * The meta object literal for the '<em><b>Exclude Unique</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET__EXCLUDE_UNIQUE = eINSTANCE.getTarget_ExcludeUnique();

		/**
		 * The meta object literal for the '<em><b>Force Execute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET__FORCE_EXECUTE = eINSTANCE.getTarget_ForceExecute();

		/**
		 * The meta object literal for the '<em><b>Ignore Ward</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET__IGNORE_WARD = eINSTANCE.getTarget_IgnoreWard();

		/**
		 * The meta object literal for the '<em><b>Input On Exec</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET__INPUT_ON_EXEC = eINSTANCE.getTarget_InputOnExec();

		/**
		 * The meta object literal for the '<em><b>Min Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET__MIN_AMOUNT = eINSTANCE.getTarget_MinAmount();

		/**
		 * The meta object literal for the '<em><b>Need Activation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET__NEED_ACTIVATION = eINSTANCE.getTarget_NeedActivation();

		/**
		 * The meta object literal for the '<em><b>Option1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET__OPTION1 = eINSTANCE.getTarget_Option1();

		/**
		 * The meta object literal for the '<em><b>Persistent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET__PERSISTENT = eINSTANCE.getTarget_Persistent();

		/**
		 * The meta object literal for the '<em><b>Random</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET__RANDOM = eINSTANCE.getTarget_Random();

		/**
		 * The meta object literal for the '<em><b>Reveal To Other</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET__REVEAL_TO_OTHER = eINSTANCE.getTarget_RevealToOther();

		/**
		 * The meta object literal for the '<em><b>Shape</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET__SHAPE = eINSTANCE.getTarget_Shape();

		/**
		 * The meta object literal for the '<em><b>Side</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET__SIDE = eINSTANCE.getTarget_Side();

		/**
		 * The meta object literal for the '<em><b>Skip Next Target Validation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET__SKIP_NEXT_TARGET_VALIDATION = eINSTANCE.getTarget_SkipNextTargetValidation();

		/**
		 * The meta object literal for the '<em><b>Skip Sub Target Validation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET__SKIP_SUB_TARGET_VALIDATION = eINSTANCE.getTarget_SkipSubTargetValidation();

		/**
		 * The meta object literal for the '<em><b>Zone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET__ZONE = eINSTANCE.getTarget_Zone();

		/**
		 * The meta object literal for the '{@link net.mmyumu.docdoc.model.Cards.impl.TemplateEffectImpl <em>Template Effect</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mmyumu.docdoc.model.Cards.impl.TemplateEffectImpl
		 * @see net.mmyumu.docdoc.model.Cards.impl.CardsPackageImpl#getTemplateEffect()
		 * @generated
		 */
		EClass TEMPLATE_EFFECT = eINSTANCE.getTemplateEffect();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_EFFECT__TARGET = eINSTANCE.getTemplateEffect_Target();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEMPLATE_EFFECT__TRIGGER = eINSTANCE.getTemplateEffect_Trigger();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPLATE_EFFECT__NAME = eINSTANCE.getTemplateEffect_Name();

		/**
		 * The meta object literal for the '{@link net.mmyumu.docdoc.model.Cards.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mmyumu.docdoc.model.Cards.impl.TriggerImpl
		 * @see net.mmyumu.docdoc.model.Cards.impl.CardsPackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__GROUP = eINSTANCE.getTrigger_Group();

		/**
		 * The meta object literal for the '<em><b>Card Filter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER__CARD_FILTER = eINSTANCE.getTrigger_CardFilter();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER__TARGET = eINSTANCE.getTrigger_Target();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER__CONDITION = eINSTANCE.getTrigger_Condition();

		/**
		 * The meta object literal for the '<em><b>Damage Include Flags</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__DAMAGE_INCLUDE_FLAGS = eINSTANCE.getTrigger_DamageIncludeFlags();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__DURATION = eINSTANCE.getTrigger_Duration();

		/**
		 * The meta object literal for the '<em><b>Execute Once Per Transaction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__EXECUTE_ONCE_PER_TRANSACTION = eINSTANCE.getTrigger_ExecuteOncePerTransaction();

		/**
		 * The meta object literal for the '<em><b>Execute Once Per Turn</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__EXECUTE_ONCE_PER_TURN = eINSTANCE.getTrigger_ExecuteOncePerTurn();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__LOCATION = eINSTANCE.getTrigger_Location();

		/**
		 * The meta object literal for the '<em><b>Side</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__SIDE = eINSTANCE.getTrigger_Side();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__TYPE = eINSTANCE.getTrigger_Type();

		/**
		 * The meta object literal for the '<em><b>Use Triggerer As Initiator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__USE_TRIGGERER_AS_INITIATOR = eINSTANCE.getTrigger_UseTriggererAsInitiator();

		/**
		 * The meta object literal for the '{@link net.mmyumu.docdoc.model.Cards.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mmyumu.docdoc.model.Cards.impl.VariableImpl
		 * @see net.mmyumu.docdoc.model.Cards.impl.CardsPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__TARGET = eINSTANCE.getVariable_Target();

		/**
		 * The meta object literal for the '<em><b>Card Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__CARD_FILTER = eINSTANCE.getVariable_CardFilter();

		/**
		 * The meta object literal for the '<em><b>Ability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__ABILITY = eINSTANCE.getVariable_Ability();

		/**
		 * The meta object literal for the '<em><b>Counter Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__COUNTER_TYPE = eINSTANCE.getVariable_CounterType();

		/**
		 * The meta object literal for the '<em><b>From Trigger</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__FROM_TRIGGER = eINSTANCE.getVariable_FromTrigger();

		/**
		 * The meta object literal for the '<em><b>Include School</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__INCLUDE_SCHOOL = eINSTANCE.getVariable_IncludeSchool();

		/**
		 * The meta object literal for the '<em><b>Level Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__LEVEL_TYPE = eINSTANCE.getVariable_LevelType();

		/**
		 * The meta object literal for the '<em><b>Must Be Targetable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__MUST_BE_TARGETABLE = eINSTANCE.getVariable_MustBeTargetable();

		/**
		 * The meta object literal for the '<em><b>Side</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__SIDE = eINSTANCE.getVariable_Side();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__TYPE = eINSTANCE.getVariable_Type();

		/**
		 * The meta object literal for the '<em><b>Unit Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__UNIT_TYPE = eINSTANCE.getVariable_UnitType();

		/**
		 * The meta object literal for the '<em><b>Use Current Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__USE_CURRENT_TARGET = eINSTANCE.getVariable_UseCurrentTarget();

		/**
		 * The meta object literal for the '<em><b>Use Last Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__USE_LAST_TARGET = eINSTANCE.getVariable_UseLastTarget();

		/**
		 * The meta object literal for the '<em><b>Use Parent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__USE_PARENT = eINSTANCE.getVariable_UseParent();

		/**
		 * The meta object literal for the '<em><b>Value Modifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__VALUE_MODIFIER = eINSTANCE.getVariable_ValueModifier();

	}

} //CardsPackage
