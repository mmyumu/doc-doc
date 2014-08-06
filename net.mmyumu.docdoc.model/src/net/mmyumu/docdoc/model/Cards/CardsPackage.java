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
	String eNS_URI = "platform:/resource/net.mmyumu.docdoc.xml/resources/xsd/cards.xsd";

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
	 * The meta object id for the '{@link net.mmyumu.docdoc.model.Cards.impl.CardsTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mmyumu.docdoc.model.Cards.impl.CardsTypeImpl
	 * @see net.mmyumu.docdoc.model.Cards.impl.CardsPackageImpl#getCardsType()
	 * @generated
	 */
	int CARDS_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Card</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_TYPE__CARD = 0;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARDS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.mmyumu.docdoc.model.Cards.impl.CardTypeImpl <em>Card Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mmyumu.docdoc.model.Cards.impl.CardTypeImpl
	 * @see net.mmyumu.docdoc.model.Cards.impl.CardsPackageImpl#getCardType()
	 * @generated
	 */
	int CARD_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_TYPE__VARIABLE = 0;

	/**
	 * The feature id for the '<em><b>Playability Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_TYPE__PLAYABILITY_CONDITION = 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_TYPE__TARGET = 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_TYPE__DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_TYPE__COST = 4;

	/**
	 * The feature id for the '<em><b>Destiny Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_TYPE__DESTINY_LEVEL = 5;

	/**
	 * The feature id for the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_TYPE__DISPLAY_NAME = 6;

	/**
	 * The feature id for the '<em><b>Faction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_TYPE__FACTION = 7;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_TYPE__ID = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_TYPE__NAME = 9;

	/**
	 * The feature id for the '<em><b>Rarity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_TYPE__RARITY = 10;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_TYPE__TYPE = 11;

	/**
	 * The number of structural features of the '<em>Card Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_TYPE_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Card Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CARD_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.mmyumu.docdoc.model.Cards.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mmyumu.docdoc.model.Cards.impl.DocumentRootImpl
	 * @see net.mmyumu.docdoc.model.Cards.impl.CardsPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 2;

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
	 * The meta object id for the '{@link net.mmyumu.docdoc.model.Cards.impl.EffectTypeImpl <em>Effect Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mmyumu.docdoc.model.Cards.impl.EffectTypeImpl
	 * @see net.mmyumu.docdoc.model.Cards.impl.CardsPackageImpl#getEffectType()
	 * @generated
	 */
	int EFFECT_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_TYPE__TYPE = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_TYPE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Effect Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Effect Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EFFECT_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.mmyumu.docdoc.model.Cards.impl.PlayabilityConditionTypeImpl <em>Playability Condition Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mmyumu.docdoc.model.Cards.impl.PlayabilityConditionTypeImpl
	 * @see net.mmyumu.docdoc.model.Cards.impl.CardsPackageImpl#getPlayabilityConditionType()
	 * @generated
	 */
	int PLAYABILITY_CONDITION_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYABILITY_CONDITION_TYPE__OPERATOR = 0;

	/**
	 * The feature id for the '<em><b>Value A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYABILITY_CONDITION_TYPE__VALUE_A = 1;

	/**
	 * The feature id for the '<em><b>Value B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYABILITY_CONDITION_TYPE__VALUE_B = 2;

	/**
	 * The number of structural features of the '<em>Playability Condition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYABILITY_CONDITION_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Playability Condition Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYABILITY_CONDITION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.mmyumu.docdoc.model.Cards.impl.TargetTypeImpl <em>Target Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mmyumu.docdoc.model.Cards.impl.TargetTypeImpl
	 * @see net.mmyumu.docdoc.model.Cards.impl.CardsPackageImpl#getTargetType()
	 * @generated
	 */
	int TARGET_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Effect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_TYPE__EFFECT = 0;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_TYPE__AMOUNT = 1;

	/**
	 * The feature id for the '<em><b>Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_TYPE__SIDE = 2;

	/**
	 * The feature id for the '<em><b>Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_TYPE__ZONE = 3;

	/**
	 * The number of structural features of the '<em>Target Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Target Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TARGET_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link net.mmyumu.docdoc.model.Cards.impl.VariableTypeImpl <em>Variable Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see net.mmyumu.docdoc.model.Cards.impl.VariableTypeImpl
	 * @see net.mmyumu.docdoc.model.Cards.impl.CardsPackageImpl#getVariableType()
	 * @generated
	 */
	int VARIABLE_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE__SIDE = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE__TYPE = 1;

	/**
	 * The number of structural features of the '<em>Variable Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Variable Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_TYPE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link net.mmyumu.docdoc.model.Cards.CardsType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.CardsType
	 * @generated
	 */
	EClass getCardsType();

	/**
	 * Returns the meta object for the containment reference list '{@link net.mmyumu.docdoc.model.Cards.CardsType#getCard <em>Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Card</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.CardsType#getCard()
	 * @see #getCardsType()
	 * @generated
	 */
	EReference getCardsType_Card();

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
	 * Returns the meta object for the containment reference '{@link net.mmyumu.docdoc.model.Cards.CardType#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.CardType#getVariable()
	 * @see #getCardType()
	 * @generated
	 */
	EReference getCardType_Variable();

	/**
	 * Returns the meta object for the containment reference '{@link net.mmyumu.docdoc.model.Cards.CardType#getPlayabilityCondition <em>Playability Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Playability Condition</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.CardType#getPlayabilityCondition()
	 * @see #getCardType()
	 * @generated
	 */
	EReference getCardType_PlayabilityCondition();

	/**
	 * Returns the meta object for the containment reference '{@link net.mmyumu.docdoc.model.Cards.CardType#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.CardType#getTarget()
	 * @see #getCardType()
	 * @generated
	 */
	EReference getCardType_Target();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.CardType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.CardType#getDescription()
	 * @see #getCardType()
	 * @generated
	 */
	EAttribute getCardType_Description();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.CardType#getCost <em>Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cost</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.CardType#getCost()
	 * @see #getCardType()
	 * @generated
	 */
	EAttribute getCardType_Cost();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.CardType#getDestinyLevel <em>Destiny Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Destiny Level</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.CardType#getDestinyLevel()
	 * @see #getCardType()
	 * @generated
	 */
	EAttribute getCardType_DestinyLevel();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.CardType#getDisplayName <em>Display Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Display Name</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.CardType#getDisplayName()
	 * @see #getCardType()
	 * @generated
	 */
	EAttribute getCardType_DisplayName();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.CardType#getFaction <em>Faction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Faction</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.CardType#getFaction()
	 * @see #getCardType()
	 * @generated
	 */
	EAttribute getCardType_Faction();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.CardType#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.CardType#getID()
	 * @see #getCardType()
	 * @generated
	 */
	EAttribute getCardType_ID();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.CardType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.CardType#getName()
	 * @see #getCardType()
	 * @generated
	 */
	EAttribute getCardType_Name();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.CardType#getRarity <em>Rarity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rarity</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.CardType#getRarity()
	 * @see #getCardType()
	 * @generated
	 */
	EAttribute getCardType_Rarity();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.CardType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.CardType#getType()
	 * @see #getCardType()
	 * @generated
	 */
	EAttribute getCardType_Type();

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
	 * Returns the meta object for class '{@link net.mmyumu.docdoc.model.Cards.EffectType <em>Effect Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Effect Type</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.EffectType
	 * @generated
	 */
	EClass getEffectType();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.EffectType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.EffectType#getType()
	 * @see #getEffectType()
	 * @generated
	 */
	EAttribute getEffectType_Type();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.EffectType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.EffectType#getValue()
	 * @see #getEffectType()
	 * @generated
	 */
	EAttribute getEffectType_Value();

	/**
	 * Returns the meta object for class '{@link net.mmyumu.docdoc.model.Cards.PlayabilityConditionType <em>Playability Condition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Playability Condition Type</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.PlayabilityConditionType
	 * @generated
	 */
	EClass getPlayabilityConditionType();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.PlayabilityConditionType#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.PlayabilityConditionType#getOperator()
	 * @see #getPlayabilityConditionType()
	 * @generated
	 */
	EAttribute getPlayabilityConditionType_Operator();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.PlayabilityConditionType#getValueA <em>Value A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value A</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.PlayabilityConditionType#getValueA()
	 * @see #getPlayabilityConditionType()
	 * @generated
	 */
	EAttribute getPlayabilityConditionType_ValueA();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.PlayabilityConditionType#getValueB <em>Value B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value B</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.PlayabilityConditionType#getValueB()
	 * @see #getPlayabilityConditionType()
	 * @generated
	 */
	EAttribute getPlayabilityConditionType_ValueB();

	/**
	 * Returns the meta object for class '{@link net.mmyumu.docdoc.model.Cards.TargetType <em>Target Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Target Type</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.TargetType
	 * @generated
	 */
	EClass getTargetType();

	/**
	 * Returns the meta object for the containment reference '{@link net.mmyumu.docdoc.model.Cards.TargetType#getEffect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Effect</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.TargetType#getEffect()
	 * @see #getTargetType()
	 * @generated
	 */
	EReference getTargetType_Effect();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.TargetType#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.TargetType#getAmount()
	 * @see #getTargetType()
	 * @generated
	 */
	EAttribute getTargetType_Amount();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.TargetType#getSide <em>Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Side</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.TargetType#getSide()
	 * @see #getTargetType()
	 * @generated
	 */
	EAttribute getTargetType_Side();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.TargetType#getZone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zone</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.TargetType#getZone()
	 * @see #getTargetType()
	 * @generated
	 */
	EAttribute getTargetType_Zone();

	/**
	 * Returns the meta object for class '{@link net.mmyumu.docdoc.model.Cards.VariableType <em>Variable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Type</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.VariableType
	 * @generated
	 */
	EClass getVariableType();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.VariableType#getSide <em>Side</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Side</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.VariableType#getSide()
	 * @see #getVariableType()
	 * @generated
	 */
	EAttribute getVariableType_Side();

	/**
	 * Returns the meta object for the attribute '{@link net.mmyumu.docdoc.model.Cards.VariableType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see net.mmyumu.docdoc.model.Cards.VariableType#getType()
	 * @see #getVariableType()
	 * @generated
	 */
	EAttribute getVariableType_Type();

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
		 * The meta object literal for the '{@link net.mmyumu.docdoc.model.Cards.impl.CardsTypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mmyumu.docdoc.model.Cards.impl.CardsTypeImpl
		 * @see net.mmyumu.docdoc.model.Cards.impl.CardsPackageImpl#getCardsType()
		 * @generated
		 */
		EClass CARDS_TYPE = eINSTANCE.getCardsType();

		/**
		 * The meta object literal for the '<em><b>Card</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARDS_TYPE__CARD = eINSTANCE.getCardsType_Card();

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
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD_TYPE__VARIABLE = eINSTANCE.getCardType_Variable();

		/**
		 * The meta object literal for the '<em><b>Playability Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD_TYPE__PLAYABILITY_CONDITION = eINSTANCE.getCardType_PlayabilityCondition();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CARD_TYPE__TARGET = eINSTANCE.getCardType_Target();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_TYPE__DESCRIPTION = eINSTANCE.getCardType_Description();

		/**
		 * The meta object literal for the '<em><b>Cost</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_TYPE__COST = eINSTANCE.getCardType_Cost();

		/**
		 * The meta object literal for the '<em><b>Destiny Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_TYPE__DESTINY_LEVEL = eINSTANCE.getCardType_DestinyLevel();

		/**
		 * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_TYPE__DISPLAY_NAME = eINSTANCE.getCardType_DisplayName();

		/**
		 * The meta object literal for the '<em><b>Faction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_TYPE__FACTION = eINSTANCE.getCardType_Faction();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_TYPE__ID = eINSTANCE.getCardType_ID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_TYPE__NAME = eINSTANCE.getCardType_Name();

		/**
		 * The meta object literal for the '<em><b>Rarity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_TYPE__RARITY = eINSTANCE.getCardType_Rarity();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CARD_TYPE__TYPE = eINSTANCE.getCardType_Type();

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
		 * The meta object literal for the '{@link net.mmyumu.docdoc.model.Cards.impl.EffectTypeImpl <em>Effect Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mmyumu.docdoc.model.Cards.impl.EffectTypeImpl
		 * @see net.mmyumu.docdoc.model.Cards.impl.CardsPackageImpl#getEffectType()
		 * @generated
		 */
		EClass EFFECT_TYPE = eINSTANCE.getEffectType();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFECT_TYPE__TYPE = eINSTANCE.getEffectType_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EFFECT_TYPE__VALUE = eINSTANCE.getEffectType_Value();

		/**
		 * The meta object literal for the '{@link net.mmyumu.docdoc.model.Cards.impl.PlayabilityConditionTypeImpl <em>Playability Condition Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mmyumu.docdoc.model.Cards.impl.PlayabilityConditionTypeImpl
		 * @see net.mmyumu.docdoc.model.Cards.impl.CardsPackageImpl#getPlayabilityConditionType()
		 * @generated
		 */
		EClass PLAYABILITY_CONDITION_TYPE = eINSTANCE.getPlayabilityConditionType();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYABILITY_CONDITION_TYPE__OPERATOR = eINSTANCE.getPlayabilityConditionType_Operator();

		/**
		 * The meta object literal for the '<em><b>Value A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYABILITY_CONDITION_TYPE__VALUE_A = eINSTANCE.getPlayabilityConditionType_ValueA();

		/**
		 * The meta object literal for the '<em><b>Value B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYABILITY_CONDITION_TYPE__VALUE_B = eINSTANCE.getPlayabilityConditionType_ValueB();

		/**
		 * The meta object literal for the '{@link net.mmyumu.docdoc.model.Cards.impl.TargetTypeImpl <em>Target Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mmyumu.docdoc.model.Cards.impl.TargetTypeImpl
		 * @see net.mmyumu.docdoc.model.Cards.impl.CardsPackageImpl#getTargetType()
		 * @generated
		 */
		EClass TARGET_TYPE = eINSTANCE.getTargetType();

		/**
		 * The meta object literal for the '<em><b>Effect</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TARGET_TYPE__EFFECT = eINSTANCE.getTargetType_Effect();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_TYPE__AMOUNT = eINSTANCE.getTargetType_Amount();

		/**
		 * The meta object literal for the '<em><b>Side</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_TYPE__SIDE = eINSTANCE.getTargetType_Side();

		/**
		 * The meta object literal for the '<em><b>Zone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TARGET_TYPE__ZONE = eINSTANCE.getTargetType_Zone();

		/**
		 * The meta object literal for the '{@link net.mmyumu.docdoc.model.Cards.impl.VariableTypeImpl <em>Variable Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see net.mmyumu.docdoc.model.Cards.impl.VariableTypeImpl
		 * @see net.mmyumu.docdoc.model.Cards.impl.CardsPackageImpl#getVariableType()
		 * @generated
		 */
		EClass VARIABLE_TYPE = eINSTANCE.getVariableType();

		/**
		 * The meta object literal for the '<em><b>Side</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_TYPE__SIDE = eINSTANCE.getVariableType_Side();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_TYPE__TYPE = eINSTANCE.getVariableType_Type();

	}

} //CardsPackage
