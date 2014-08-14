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
	 * The meta object id for the '{@link net.mmyumu.docdoc.model.Cards.impl.CardImpl <em>Card</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mmyumu.docdoc.model.Cards.impl.CardImpl
	 * @see net.mmyumu.docdoc.model.Cards.impl.CardsPackageImpl#getCard()
	 * @generated
	 */
	int CARD = 0;

	/**
	 * The feature id for the '<em><b>School</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__SCHOOL = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Ongoing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__ONGOING = 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__TARGET = 3;

	/**
	 * The feature id for the '<em><b>Destiny Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__DESTINY_LEVEL = 4;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__DISPLAY_NAME = 5;

	/**
	 * The feature id for the '<em><b>Faction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__FACTION = 6;

	/**
	 * The feature id for the '<em><b>HP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__HP = 7;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__ID = 8;

	/**
	 * The feature id for the '<em><b>Magic Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__MAGIC_LEVEL = 9;

	/**
	 * The feature id for the '<em><b>Might Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__MIGHT_LEVEL = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__NAME = 11;

	/**
	 * The feature id for the '<em><b>Rarity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__RARITY = 12;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD__TYPE = 13;

	/**
	 * The number of structural features of the '<em>Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FEATURE_COUNT = 14;

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
	int CARD_FILTER = 1;

	/**
	 * The feature id for the '<em><b>Include Unit Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FILTER__INCLUDE_UNIT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FILTER__SIDE = 1;

	/**
	 * The number of structural features of the '<em>Card Filter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_FILTER_FEATURE_COUNT = 2;

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
	int CARDS = 2;

	/**
	 * The feature id for the '<em><b>Card</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS__CARD = 0;

	/**
	 * The number of structural features of the '<em>Cards</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Cards</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.mmyumu.docdoc.model.Cards.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mmyumu.docdoc.model.Cards.impl.DocumentRootImpl
	 * @see net.mmyumu.docdoc.model.Cards.impl.CardsPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 3;

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
	int EFFECT = 4;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__DURATION = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.mmyumu.docdoc.model.Cards.impl.OnGoingImpl <em>On Going</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mmyumu.docdoc.model.Cards.impl.OnGoingImpl
	 * @see net.mmyumu.docdoc.model.Cards.impl.CardsPackageImpl#getOnGoing()
	 * @generated
	 */
	int ON_GOING = 5;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_GOING__DURATION = 0;

	/**
	 * The number of structural features of the '<em>On Going</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ON_GOING_FEATURE_COUNT = 1;

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
	int OPTION = 6;

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
	int SCHOOL = 7;

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
	int SUBGROUP = 8;

	/**
	 * The feature id for the '<em><b>Template Effect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGROUP__TEMPLATE_EFFECT = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGROUP__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Subgroup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBGROUP_FEATURE_COUNT = 2;

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
	int TARGET = 9;

	/**
	 * The feature id for the '<em><b>Option</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__OPTION = 0;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__TRIGGER = 1;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__EFFECT = 2;

	/**
	 * The feature id for the '<em><b>Subgroup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__SUBGROUP = 3;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__AMOUNT = 4;

	/**
	 * The feature id for the '<em><b>Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__SIDE = 5;

	/**
	 * The feature id for the '<em><b>Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET__ZONE = 6;

	/**
	 * The number of structural features of the '<em>Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_FEATURE_COUNT = 7;

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
	int TEMPLATE_EFFECT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EFFECT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Template Effect</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPLATE_EFFECT_FEATURE_COUNT = 1;

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
	int TRIGGER = 11;

	/**
	 * The feature id for the '<em><b>Card Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__CARD_FILTER = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__TYPE = 2;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_OPERATION_COUNT = 0;


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
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.Card#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Card#getDescription()
	 * @see #getCard()
	 * @generated
	 */
	EAttribute getCard_Description();

	/**
	 * Returns the meta object for the containment reference '{@link net.mmyumu.docdoc.model.Cards.Card#getOngoing <em>Ongoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ongoing</em>'.
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
	 * Returns the meta object for class '{@link net.mmyumu.docdoc.model.Cards.CardFilter <em>Card Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Card Filter</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.CardFilter
	 * @generated
	 */
	EClass getCardFilter();

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
	 * Returns the meta object for class '{@link net.mmyumu.docdoc.model.Cards.Cards <em>Cards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cards</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Cards
	 * @generated
	 */
	EClass getCards();

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
	 * Returns the meta object for class '{@link net.mmyumu.docdoc.model.Cards.OnGoing <em>On Going</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>On Going</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.OnGoing
	 * @generated
	 */
	EClass getOnGoing();

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
	 * Returns the meta object for the containment reference '{@link net.mmyumu.docdoc.model.Cards.Subgroup#getTemplateEffect <em>Template Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Template Effect</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Subgroup#getTemplateEffect()
	 * @see #getSubgroup()
	 * @generated
	 */
	EReference getSubgroup_TemplateEffect();

	/**
	 * Returns the meta object for the containment reference '{@link net.mmyumu.docdoc.model.Cards.Subgroup#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
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
	 * Returns the meta object for the containment reference '{@link net.mmyumu.docdoc.model.Cards.Target#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Option</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Target#getOption()
	 * @see #getTarget()
	 * @generated
	 */
	EReference getTarget_Option();

	/**
	 * Returns the meta object for the containment reference '{@link net.mmyumu.docdoc.model.Cards.Target#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trigger</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Target#getTrigger()
	 * @see #getTarget()
	 * @generated
	 */
	EReference getTarget_Trigger();

	/**
	 * Returns the meta object for the containment reference '{@link net.mmyumu.docdoc.model.Cards.Target#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Effect</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Target#getEffect()
	 * @see #getTarget()
	 * @generated
	 */
	EReference getTarget_Effect();

	/**
	 * Returns the meta object for the containment reference '{@link net.mmyumu.docdoc.model.Cards.Target#getSubgroup <em>Subgroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subgroup</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Target#getSubgroup()
	 * @see #getTarget()
	 * @generated
	 */
	EReference getTarget_Subgroup();

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
	 * Returns the meta object for the containment reference '{@link net.mmyumu.docdoc.model.Cards.Trigger#getCardFilter <em>Card Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Card Filter</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Trigger#getCardFilter()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_CardFilter();

	/**
	 * Returns the meta object for the containment reference '{@link net.mmyumu.docdoc.model.Cards.Trigger#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.Trigger#getTarget()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_Target();

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
		 * The meta object literal for the '{@link net.mmyumu.docdoc.model.Cards.impl.CardImpl <em>Card</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mmyumu.docdoc.model.Cards.impl.CardImpl
		 * @see net.mmyumu.docdoc.model.Cards.impl.CardsPackageImpl#getCard()
		 * @generated
		 */
		EClass CARD = eINSTANCE.getCard();

		/**
		 * The meta object literal for the '<em><b>School</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD__SCHOOL = eINSTANCE.getCard_School();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__DESCRIPTION = eINSTANCE.getCard_Description();

		/**
		 * The meta object literal for the '<em><b>Ongoing</b></em>' containment reference feature.
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
		 * The meta object literal for the '<em><b>Rarity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__RARITY = eINSTANCE.getCard_Rarity();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD__TYPE = eINSTANCE.getCard_Type();

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
		 * The meta object literal for the '<em><b>Include Unit Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_FILTER__INCLUDE_UNIT_TYPE = eINSTANCE.getCardFilter_IncludeUnitType();

		/**
		 * The meta object literal for the '<em><b>Side</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_FILTER__SIDE = eINSTANCE.getCardFilter_Side();

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
		 * The meta object literal for the '<em><b>Card</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARDS__CARD = eINSTANCE.getCards_Card();

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
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFECT__DURATION = eINSTANCE.getEffect_Duration();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFECT__TYPE = eINSTANCE.getEffect_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFECT__VALUE = eINSTANCE.getEffect_Value();

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
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ON_GOING__DURATION = eINSTANCE.getOnGoing_Duration();

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
		 * The meta object literal for the '<em><b>Template Effect</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBGROUP__TEMPLATE_EFFECT = eINSTANCE.getSubgroup_TemplateEffect();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
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
		 * The meta object literal for the '<em><b>Option</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET__OPTION = eINSTANCE.getTarget_Option();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET__TRIGGER = eINSTANCE.getTarget_Trigger();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET__EFFECT = eINSTANCE.getTarget_Effect();

		/**
		 * The meta object literal for the '<em><b>Subgroup</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET__SUBGROUP = eINSTANCE.getTarget_Subgroup();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET__AMOUNT = eINSTANCE.getTarget_Amount();

		/**
		 * The meta object literal for the '<em><b>Side</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET__SIDE = eINSTANCE.getTarget_Side();

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
		 * The meta object literal for the '<em><b>Card Filter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER__CARD_FILTER = eINSTANCE.getTrigger_CardFilter();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER__TARGET = eINSTANCE.getTrigger_Target();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__TYPE = eINSTANCE.getTrigger_Type();

	}

} //CardsPackage
