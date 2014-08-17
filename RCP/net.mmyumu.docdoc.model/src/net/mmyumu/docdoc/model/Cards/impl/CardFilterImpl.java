/**
 */
package net.mmyumu.docdoc.model.Cards.impl;

import net.mmyumu.docdoc.model.Cards.CardFilter;
import net.mmyumu.docdoc.model.Cards.CardsPackage;
import net.mmyumu.docdoc.model.Cards.Variable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Card Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardFilterImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardFilterImpl#getAttackHeroLastTurn <em>Attack Hero Last Turn</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardFilterImpl#getBaseMaxCost <em>Base Max Cost</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardFilterImpl#getDealDamageToHeroLastTurn <em>Deal Damage To Hero Last Turn</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardFilterImpl#getExcludeFaction <em>Exclude Faction</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardFilterImpl#getExcludeRaces <em>Exclude Races</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardFilterImpl#getExcludeSchool <em>Exclude School</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardFilterImpl#getExcludeToken <em>Exclude Token</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardFilterImpl#getExcludeUnique <em>Exclude Unique</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardFilterImpl#getExcludeUnitType <em>Exclude Unit Type</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardFilterImpl#getIncludeAbility <em>Include Ability</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardFilterImpl#getIncludeCardID <em>Include Card ID</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardFilterImpl#getIncludeCardType <em>Include Card Type</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardFilterImpl#getIncludeColumn <em>Include Column</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardFilterImpl#getIncludeCounter <em>Include Counter</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardFilterImpl#getIncludeEnchantUnit <em>Include Enchant Unit</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardFilterImpl#getIncludeFaction <em>Include Faction</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardFilterImpl#getIncludeFrontLine <em>Include Front Line</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardFilterImpl#getIncludeOccupant <em>Include Occupant</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardFilterImpl#getIncludeOngoingType <em>Include Ongoing Type</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardFilterImpl#getIncludeRaces <em>Include Races</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardFilterImpl#getIncludeSchool <em>Include School</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardFilterImpl#getIncludeStatus <em>Include Status</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardFilterImpl#getIncludeUnique <em>Include Unique</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardFilterImpl#getIncludeUnitType <em>Include Unit Type</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardFilterImpl#getLevelType <em>Level Type</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardFilterImpl#getMaxAttack <em>Max Attack</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardFilterImpl#getMaxCost <em>Max Cost</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardFilterImpl#getMaxLevel <em>Max Level</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardFilterImpl#getSameCardType <em>Same Card Type</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardFilterImpl#getSameGPID <em>Same GPID</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardFilterImpl#getShareRaces <em>Share Races</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardFilterImpl#getShareRacesWithOccupant <em>Share Races With Occupant</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardFilterImpl#getSide <em>Side</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardFilterImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CardFilterImpl extends MinimalEObjectImpl.Container implements CardFilter {
	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected Variable variable;

	/**
	 * The default value of the '{@link #getAttackHeroLastTurn() <em>Attack Hero Last Turn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttackHeroLastTurn()
	 * @generated
	 * @ordered
	 */
	protected static final String ATTACK_HERO_LAST_TURN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAttackHeroLastTurn() <em>Attack Hero Last Turn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttackHeroLastTurn()
	 * @generated
	 * @ordered
	 */
	protected String attackHeroLastTurn = ATTACK_HERO_LAST_TURN_EDEFAULT;

	/**
	 * The default value of the '{@link #getBaseMaxCost() <em>Base Max Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseMaxCost()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_MAX_COST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseMaxCost() <em>Base Max Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseMaxCost()
	 * @generated
	 * @ordered
	 */
	protected String baseMaxCost = BASE_MAX_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getDealDamageToHeroLastTurn() <em>Deal Damage To Hero Last Turn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDealDamageToHeroLastTurn()
	 * @generated
	 * @ordered
	 */
	protected static final String DEAL_DAMAGE_TO_HERO_LAST_TURN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDealDamageToHeroLastTurn() <em>Deal Damage To Hero Last Turn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDealDamageToHeroLastTurn()
	 * @generated
	 * @ordered
	 */
	protected String dealDamageToHeroLastTurn = DEAL_DAMAGE_TO_HERO_LAST_TURN_EDEFAULT;

	/**
	 * The default value of the '{@link #getExcludeFaction() <em>Exclude Faction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeFaction()
	 * @generated
	 * @ordered
	 */
	protected static final String EXCLUDE_FACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExcludeFaction() <em>Exclude Faction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeFaction()
	 * @generated
	 * @ordered
	 */
	protected String excludeFaction = EXCLUDE_FACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getExcludeRaces() <em>Exclude Races</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeRaces()
	 * @generated
	 * @ordered
	 */
	protected static final String EXCLUDE_RACES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExcludeRaces() <em>Exclude Races</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeRaces()
	 * @generated
	 * @ordered
	 */
	protected String excludeRaces = EXCLUDE_RACES_EDEFAULT;

	/**
	 * The default value of the '{@link #getExcludeSchool() <em>Exclude School</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeSchool()
	 * @generated
	 * @ordered
	 */
	protected static final String EXCLUDE_SCHOOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExcludeSchool() <em>Exclude School</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeSchool()
	 * @generated
	 * @ordered
	 */
	protected String excludeSchool = EXCLUDE_SCHOOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getExcludeToken() <em>Exclude Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeToken()
	 * @generated
	 * @ordered
	 */
	protected static final String EXCLUDE_TOKEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExcludeToken() <em>Exclude Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeToken()
	 * @generated
	 * @ordered
	 */
	protected String excludeToken = EXCLUDE_TOKEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getExcludeUnique() <em>Exclude Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeUnique()
	 * @generated
	 * @ordered
	 */
	protected static final String EXCLUDE_UNIQUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExcludeUnique() <em>Exclude Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeUnique()
	 * @generated
	 * @ordered
	 */
	protected String excludeUnique = EXCLUDE_UNIQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getExcludeUnitType() <em>Exclude Unit Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeUnitType()
	 * @generated
	 * @ordered
	 */
	protected static final String EXCLUDE_UNIT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExcludeUnitType() <em>Exclude Unit Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeUnitType()
	 * @generated
	 * @ordered
	 */
	protected String excludeUnitType = EXCLUDE_UNIT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeAbility() <em>Include Ability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeAbility()
	 * @generated
	 * @ordered
	 */
	protected static final String INCLUDE_ABILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIncludeAbility() <em>Include Ability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeAbility()
	 * @generated
	 * @ordered
	 */
	protected String includeAbility = INCLUDE_ABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeCardID() <em>Include Card ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeCardID()
	 * @generated
	 * @ordered
	 */
	protected static final String INCLUDE_CARD_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIncludeCardID() <em>Include Card ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeCardID()
	 * @generated
	 * @ordered
	 */
	protected String includeCardID = INCLUDE_CARD_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeCardType() <em>Include Card Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeCardType()
	 * @generated
	 * @ordered
	 */
	protected static final String INCLUDE_CARD_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIncludeCardType() <em>Include Card Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeCardType()
	 * @generated
	 * @ordered
	 */
	protected String includeCardType = INCLUDE_CARD_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeColumn() <em>Include Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeColumn()
	 * @generated
	 * @ordered
	 */
	protected static final String INCLUDE_COLUMN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIncludeColumn() <em>Include Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeColumn()
	 * @generated
	 * @ordered
	 */
	protected String includeColumn = INCLUDE_COLUMN_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeCounter() <em>Include Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeCounter()
	 * @generated
	 * @ordered
	 */
	protected static final String INCLUDE_COUNTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIncludeCounter() <em>Include Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeCounter()
	 * @generated
	 * @ordered
	 */
	protected String includeCounter = INCLUDE_COUNTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeEnchantUnit() <em>Include Enchant Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeEnchantUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String INCLUDE_ENCHANT_UNIT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIncludeEnchantUnit() <em>Include Enchant Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeEnchantUnit()
	 * @generated
	 * @ordered
	 */
	protected String includeEnchantUnit = INCLUDE_ENCHANT_UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeFaction() <em>Include Faction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeFaction()
	 * @generated
	 * @ordered
	 */
	protected static final String INCLUDE_FACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIncludeFaction() <em>Include Faction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeFaction()
	 * @generated
	 * @ordered
	 */
	protected String includeFaction = INCLUDE_FACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeFrontLine() <em>Include Front Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeFrontLine()
	 * @generated
	 * @ordered
	 */
	protected static final String INCLUDE_FRONT_LINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIncludeFrontLine() <em>Include Front Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeFrontLine()
	 * @generated
	 * @ordered
	 */
	protected String includeFrontLine = INCLUDE_FRONT_LINE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeOccupant() <em>Include Occupant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeOccupant()
	 * @generated
	 * @ordered
	 */
	protected static final String INCLUDE_OCCUPANT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIncludeOccupant() <em>Include Occupant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeOccupant()
	 * @generated
	 * @ordered
	 */
	protected String includeOccupant = INCLUDE_OCCUPANT_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeOngoingType() <em>Include Ongoing Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeOngoingType()
	 * @generated
	 * @ordered
	 */
	protected static final String INCLUDE_ONGOING_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIncludeOngoingType() <em>Include Ongoing Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeOngoingType()
	 * @generated
	 * @ordered
	 */
	protected String includeOngoingType = INCLUDE_ONGOING_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeRaces() <em>Include Races</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeRaces()
	 * @generated
	 * @ordered
	 */
	protected static final String INCLUDE_RACES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIncludeRaces() <em>Include Races</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeRaces()
	 * @generated
	 * @ordered
	 */
	protected String includeRaces = INCLUDE_RACES_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeSchool() <em>Include School</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeSchool()
	 * @generated
	 * @ordered
	 */
	protected static final String INCLUDE_SCHOOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIncludeSchool() <em>Include School</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeSchool()
	 * @generated
	 * @ordered
	 */
	protected String includeSchool = INCLUDE_SCHOOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeStatus() <em>Include Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String INCLUDE_STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIncludeStatus() <em>Include Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeStatus()
	 * @generated
	 * @ordered
	 */
	protected String includeStatus = INCLUDE_STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeUnique() <em>Include Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeUnique()
	 * @generated
	 * @ordered
	 */
	protected static final String INCLUDE_UNIQUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIncludeUnique() <em>Include Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeUnique()
	 * @generated
	 * @ordered
	 */
	protected String includeUnique = INCLUDE_UNIQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncludeUnitType() <em>Include Unit Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeUnitType()
	 * @generated
	 * @ordered
	 */
	protected static final String INCLUDE_UNIT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIncludeUnitType() <em>Include Unit Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludeUnitType()
	 * @generated
	 * @ordered
	 */
	protected String includeUnitType = INCLUDE_UNIT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLevelType() <em>Level Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelType()
	 * @generated
	 * @ordered
	 */
	protected static final String LEVEL_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLevelType() <em>Level Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelType()
	 * @generated
	 * @ordered
	 */
	protected String levelType = LEVEL_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxAttack() <em>Max Attack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAttack()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_ATTACK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxAttack() <em>Max Attack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAttack()
	 * @generated
	 * @ordered
	 */
	protected String maxAttack = MAX_ATTACK_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxCost() <em>Max Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCost()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_COST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxCost() <em>Max Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCost()
	 * @generated
	 * @ordered
	 */
	protected String maxCost = MAX_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxLevel() <em>Max Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String MAX_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxLevel() <em>Max Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLevel()
	 * @generated
	 * @ordered
	 */
	protected String maxLevel = MAX_LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getSameCardType() <em>Same Card Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSameCardType()
	 * @generated
	 * @ordered
	 */
	protected static final String SAME_CARD_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSameCardType() <em>Same Card Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSameCardType()
	 * @generated
	 * @ordered
	 */
	protected String sameCardType = SAME_CARD_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSameGPID() <em>Same GPID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSameGPID()
	 * @generated
	 * @ordered
	 */
	protected static final String SAME_GPID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSameGPID() <em>Same GPID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSameGPID()
	 * @generated
	 * @ordered
	 */
	protected String sameGPID = SAME_GPID_EDEFAULT;

	/**
	 * The default value of the '{@link #getShareRaces() <em>Share Races</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShareRaces()
	 * @generated
	 * @ordered
	 */
	protected static final String SHARE_RACES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShareRaces() <em>Share Races</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShareRaces()
	 * @generated
	 * @ordered
	 */
	protected String shareRaces = SHARE_RACES_EDEFAULT;

	/**
	 * The default value of the '{@link #getShareRacesWithOccupant() <em>Share Races With Occupant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShareRacesWithOccupant()
	 * @generated
	 * @ordered
	 */
	protected static final String SHARE_RACES_WITH_OCCUPANT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShareRacesWithOccupant() <em>Share Races With Occupant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShareRacesWithOccupant()
	 * @generated
	 * @ordered
	 */
	protected String shareRacesWithOccupant = SHARE_RACES_WITH_OCCUPANT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSide() <em>Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSide()
	 * @generated
	 * @ordered
	 */
	protected static final String SIDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSide() <em>Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSide()
	 * @generated
	 * @ordered
	 */
	protected String side = SIDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CardFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CardsPackage.Literals.CARD_FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariable(Variable newVariable, NotificationChain msgs) {
		Variable oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CardsPackage.CARD_FILTER__VARIABLE, oldVariable, newVariable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(Variable newVariable) {
		if (newVariable != variable) {
			NotificationChain msgs = null;
			if (variable != null)
				msgs = ((InternalEObject)variable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CardsPackage.CARD_FILTER__VARIABLE, null, msgs);
			if (newVariable != null)
				msgs = ((InternalEObject)newVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CardsPackage.CARD_FILTER__VARIABLE, null, msgs);
			msgs = basicSetVariable(newVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD_FILTER__VARIABLE, newVariable, newVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAttackHeroLastTurn() {
		return attackHeroLastTurn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttackHeroLastTurn(String newAttackHeroLastTurn) {
		String oldAttackHeroLastTurn = attackHeroLastTurn;
		attackHeroLastTurn = newAttackHeroLastTurn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD_FILTER__ATTACK_HERO_LAST_TURN, oldAttackHeroLastTurn, attackHeroLastTurn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBaseMaxCost() {
		return baseMaxCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseMaxCost(String newBaseMaxCost) {
		String oldBaseMaxCost = baseMaxCost;
		baseMaxCost = newBaseMaxCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD_FILTER__BASE_MAX_COST, oldBaseMaxCost, baseMaxCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDealDamageToHeroLastTurn() {
		return dealDamageToHeroLastTurn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDealDamageToHeroLastTurn(String newDealDamageToHeroLastTurn) {
		String oldDealDamageToHeroLastTurn = dealDamageToHeroLastTurn;
		dealDamageToHeroLastTurn = newDealDamageToHeroLastTurn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD_FILTER__DEAL_DAMAGE_TO_HERO_LAST_TURN, oldDealDamageToHeroLastTurn, dealDamageToHeroLastTurn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExcludeFaction() {
		return excludeFaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExcludeFaction(String newExcludeFaction) {
		String oldExcludeFaction = excludeFaction;
		excludeFaction = newExcludeFaction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD_FILTER__EXCLUDE_FACTION, oldExcludeFaction, excludeFaction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExcludeRaces() {
		return excludeRaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExcludeRaces(String newExcludeRaces) {
		String oldExcludeRaces = excludeRaces;
		excludeRaces = newExcludeRaces;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD_FILTER__EXCLUDE_RACES, oldExcludeRaces, excludeRaces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExcludeSchool() {
		return excludeSchool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExcludeSchool(String newExcludeSchool) {
		String oldExcludeSchool = excludeSchool;
		excludeSchool = newExcludeSchool;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD_FILTER__EXCLUDE_SCHOOL, oldExcludeSchool, excludeSchool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExcludeToken() {
		return excludeToken;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExcludeToken(String newExcludeToken) {
		String oldExcludeToken = excludeToken;
		excludeToken = newExcludeToken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD_FILTER__EXCLUDE_TOKEN, oldExcludeToken, excludeToken));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExcludeUnique() {
		return excludeUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExcludeUnique(String newExcludeUnique) {
		String oldExcludeUnique = excludeUnique;
		excludeUnique = newExcludeUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD_FILTER__EXCLUDE_UNIQUE, oldExcludeUnique, excludeUnique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExcludeUnitType() {
		return excludeUnitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExcludeUnitType(String newExcludeUnitType) {
		String oldExcludeUnitType = excludeUnitType;
		excludeUnitType = newExcludeUnitType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD_FILTER__EXCLUDE_UNIT_TYPE, oldExcludeUnitType, excludeUnitType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIncludeAbility() {
		return includeAbility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludeAbility(String newIncludeAbility) {
		String oldIncludeAbility = includeAbility;
		includeAbility = newIncludeAbility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD_FILTER__INCLUDE_ABILITY, oldIncludeAbility, includeAbility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIncludeCardID() {
		return includeCardID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludeCardID(String newIncludeCardID) {
		String oldIncludeCardID = includeCardID;
		includeCardID = newIncludeCardID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD_FILTER__INCLUDE_CARD_ID, oldIncludeCardID, includeCardID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIncludeCardType() {
		return includeCardType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludeCardType(String newIncludeCardType) {
		String oldIncludeCardType = includeCardType;
		includeCardType = newIncludeCardType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD_FILTER__INCLUDE_CARD_TYPE, oldIncludeCardType, includeCardType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIncludeColumn() {
		return includeColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludeColumn(String newIncludeColumn) {
		String oldIncludeColumn = includeColumn;
		includeColumn = newIncludeColumn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD_FILTER__INCLUDE_COLUMN, oldIncludeColumn, includeColumn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIncludeCounter() {
		return includeCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludeCounter(String newIncludeCounter) {
		String oldIncludeCounter = includeCounter;
		includeCounter = newIncludeCounter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD_FILTER__INCLUDE_COUNTER, oldIncludeCounter, includeCounter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIncludeEnchantUnit() {
		return includeEnchantUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludeEnchantUnit(String newIncludeEnchantUnit) {
		String oldIncludeEnchantUnit = includeEnchantUnit;
		includeEnchantUnit = newIncludeEnchantUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD_FILTER__INCLUDE_ENCHANT_UNIT, oldIncludeEnchantUnit, includeEnchantUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIncludeFaction() {
		return includeFaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludeFaction(String newIncludeFaction) {
		String oldIncludeFaction = includeFaction;
		includeFaction = newIncludeFaction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD_FILTER__INCLUDE_FACTION, oldIncludeFaction, includeFaction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIncludeFrontLine() {
		return includeFrontLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludeFrontLine(String newIncludeFrontLine) {
		String oldIncludeFrontLine = includeFrontLine;
		includeFrontLine = newIncludeFrontLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD_FILTER__INCLUDE_FRONT_LINE, oldIncludeFrontLine, includeFrontLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIncludeOccupant() {
		return includeOccupant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludeOccupant(String newIncludeOccupant) {
		String oldIncludeOccupant = includeOccupant;
		includeOccupant = newIncludeOccupant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD_FILTER__INCLUDE_OCCUPANT, oldIncludeOccupant, includeOccupant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIncludeOngoingType() {
		return includeOngoingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludeOngoingType(String newIncludeOngoingType) {
		String oldIncludeOngoingType = includeOngoingType;
		includeOngoingType = newIncludeOngoingType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD_FILTER__INCLUDE_ONGOING_TYPE, oldIncludeOngoingType, includeOngoingType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIncludeRaces() {
		return includeRaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludeRaces(String newIncludeRaces) {
		String oldIncludeRaces = includeRaces;
		includeRaces = newIncludeRaces;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD_FILTER__INCLUDE_RACES, oldIncludeRaces, includeRaces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIncludeSchool() {
		return includeSchool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludeSchool(String newIncludeSchool) {
		String oldIncludeSchool = includeSchool;
		includeSchool = newIncludeSchool;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD_FILTER__INCLUDE_SCHOOL, oldIncludeSchool, includeSchool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIncludeStatus() {
		return includeStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludeStatus(String newIncludeStatus) {
		String oldIncludeStatus = includeStatus;
		includeStatus = newIncludeStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD_FILTER__INCLUDE_STATUS, oldIncludeStatus, includeStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIncludeUnique() {
		return includeUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludeUnique(String newIncludeUnique) {
		String oldIncludeUnique = includeUnique;
		includeUnique = newIncludeUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD_FILTER__INCLUDE_UNIQUE, oldIncludeUnique, includeUnique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIncludeUnitType() {
		return includeUnitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludeUnitType(String newIncludeUnitType) {
		String oldIncludeUnitType = includeUnitType;
		includeUnitType = newIncludeUnitType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD_FILTER__INCLUDE_UNIT_TYPE, oldIncludeUnitType, includeUnitType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLevelType() {
		return levelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevelType(String newLevelType) {
		String oldLevelType = levelType;
		levelType = newLevelType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD_FILTER__LEVEL_TYPE, oldLevelType, levelType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaxAttack() {
		return maxAttack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxAttack(String newMaxAttack) {
		String oldMaxAttack = maxAttack;
		maxAttack = newMaxAttack;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD_FILTER__MAX_ATTACK, oldMaxAttack, maxAttack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaxCost() {
		return maxCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxCost(String newMaxCost) {
		String oldMaxCost = maxCost;
		maxCost = newMaxCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD_FILTER__MAX_COST, oldMaxCost, maxCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMaxLevel() {
		return maxLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxLevel(String newMaxLevel) {
		String oldMaxLevel = maxLevel;
		maxLevel = newMaxLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD_FILTER__MAX_LEVEL, oldMaxLevel, maxLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSameCardType() {
		return sameCardType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSameCardType(String newSameCardType) {
		String oldSameCardType = sameCardType;
		sameCardType = newSameCardType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD_FILTER__SAME_CARD_TYPE, oldSameCardType, sameCardType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSameGPID() {
		return sameGPID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSameGPID(String newSameGPID) {
		String oldSameGPID = sameGPID;
		sameGPID = newSameGPID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD_FILTER__SAME_GPID, oldSameGPID, sameGPID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShareRaces() {
		return shareRaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShareRaces(String newShareRaces) {
		String oldShareRaces = shareRaces;
		shareRaces = newShareRaces;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD_FILTER__SHARE_RACES, oldShareRaces, shareRaces));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShareRacesWithOccupant() {
		return shareRacesWithOccupant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShareRacesWithOccupant(String newShareRacesWithOccupant) {
		String oldShareRacesWithOccupant = shareRacesWithOccupant;
		shareRacesWithOccupant = newShareRacesWithOccupant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD_FILTER__SHARE_RACES_WITH_OCCUPANT, oldShareRacesWithOccupant, shareRacesWithOccupant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSide() {
		return side;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSide(String newSide) {
		String oldSide = side;
		side = newSide;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD_FILTER__SIDE, oldSide, side));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD_FILTER__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CardsPackage.CARD_FILTER__VARIABLE:
				return basicSetVariable(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CardsPackage.CARD_FILTER__VARIABLE:
				return getVariable();
			case CardsPackage.CARD_FILTER__ATTACK_HERO_LAST_TURN:
				return getAttackHeroLastTurn();
			case CardsPackage.CARD_FILTER__BASE_MAX_COST:
				return getBaseMaxCost();
			case CardsPackage.CARD_FILTER__DEAL_DAMAGE_TO_HERO_LAST_TURN:
				return getDealDamageToHeroLastTurn();
			case CardsPackage.CARD_FILTER__EXCLUDE_FACTION:
				return getExcludeFaction();
			case CardsPackage.CARD_FILTER__EXCLUDE_RACES:
				return getExcludeRaces();
			case CardsPackage.CARD_FILTER__EXCLUDE_SCHOOL:
				return getExcludeSchool();
			case CardsPackage.CARD_FILTER__EXCLUDE_TOKEN:
				return getExcludeToken();
			case CardsPackage.CARD_FILTER__EXCLUDE_UNIQUE:
				return getExcludeUnique();
			case CardsPackage.CARD_FILTER__EXCLUDE_UNIT_TYPE:
				return getExcludeUnitType();
			case CardsPackage.CARD_FILTER__INCLUDE_ABILITY:
				return getIncludeAbility();
			case CardsPackage.CARD_FILTER__INCLUDE_CARD_ID:
				return getIncludeCardID();
			case CardsPackage.CARD_FILTER__INCLUDE_CARD_TYPE:
				return getIncludeCardType();
			case CardsPackage.CARD_FILTER__INCLUDE_COLUMN:
				return getIncludeColumn();
			case CardsPackage.CARD_FILTER__INCLUDE_COUNTER:
				return getIncludeCounter();
			case CardsPackage.CARD_FILTER__INCLUDE_ENCHANT_UNIT:
				return getIncludeEnchantUnit();
			case CardsPackage.CARD_FILTER__INCLUDE_FACTION:
				return getIncludeFaction();
			case CardsPackage.CARD_FILTER__INCLUDE_FRONT_LINE:
				return getIncludeFrontLine();
			case CardsPackage.CARD_FILTER__INCLUDE_OCCUPANT:
				return getIncludeOccupant();
			case CardsPackage.CARD_FILTER__INCLUDE_ONGOING_TYPE:
				return getIncludeOngoingType();
			case CardsPackage.CARD_FILTER__INCLUDE_RACES:
				return getIncludeRaces();
			case CardsPackage.CARD_FILTER__INCLUDE_SCHOOL:
				return getIncludeSchool();
			case CardsPackage.CARD_FILTER__INCLUDE_STATUS:
				return getIncludeStatus();
			case CardsPackage.CARD_FILTER__INCLUDE_UNIQUE:
				return getIncludeUnique();
			case CardsPackage.CARD_FILTER__INCLUDE_UNIT_TYPE:
				return getIncludeUnitType();
			case CardsPackage.CARD_FILTER__LEVEL_TYPE:
				return getLevelType();
			case CardsPackage.CARD_FILTER__MAX_ATTACK:
				return getMaxAttack();
			case CardsPackage.CARD_FILTER__MAX_COST:
				return getMaxCost();
			case CardsPackage.CARD_FILTER__MAX_LEVEL:
				return getMaxLevel();
			case CardsPackage.CARD_FILTER__SAME_CARD_TYPE:
				return getSameCardType();
			case CardsPackage.CARD_FILTER__SAME_GPID:
				return getSameGPID();
			case CardsPackage.CARD_FILTER__SHARE_RACES:
				return getShareRaces();
			case CardsPackage.CARD_FILTER__SHARE_RACES_WITH_OCCUPANT:
				return getShareRacesWithOccupant();
			case CardsPackage.CARD_FILTER__SIDE:
				return getSide();
			case CardsPackage.CARD_FILTER__VALUE:
				return getValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CardsPackage.CARD_FILTER__VARIABLE:
				setVariable((Variable)newValue);
				return;
			case CardsPackage.CARD_FILTER__ATTACK_HERO_LAST_TURN:
				setAttackHeroLastTurn((String)newValue);
				return;
			case CardsPackage.CARD_FILTER__BASE_MAX_COST:
				setBaseMaxCost((String)newValue);
				return;
			case CardsPackage.CARD_FILTER__DEAL_DAMAGE_TO_HERO_LAST_TURN:
				setDealDamageToHeroLastTurn((String)newValue);
				return;
			case CardsPackage.CARD_FILTER__EXCLUDE_FACTION:
				setExcludeFaction((String)newValue);
				return;
			case CardsPackage.CARD_FILTER__EXCLUDE_RACES:
				setExcludeRaces((String)newValue);
				return;
			case CardsPackage.CARD_FILTER__EXCLUDE_SCHOOL:
				setExcludeSchool((String)newValue);
				return;
			case CardsPackage.CARD_FILTER__EXCLUDE_TOKEN:
				setExcludeToken((String)newValue);
				return;
			case CardsPackage.CARD_FILTER__EXCLUDE_UNIQUE:
				setExcludeUnique((String)newValue);
				return;
			case CardsPackage.CARD_FILTER__EXCLUDE_UNIT_TYPE:
				setExcludeUnitType((String)newValue);
				return;
			case CardsPackage.CARD_FILTER__INCLUDE_ABILITY:
				setIncludeAbility((String)newValue);
				return;
			case CardsPackage.CARD_FILTER__INCLUDE_CARD_ID:
				setIncludeCardID((String)newValue);
				return;
			case CardsPackage.CARD_FILTER__INCLUDE_CARD_TYPE:
				setIncludeCardType((String)newValue);
				return;
			case CardsPackage.CARD_FILTER__INCLUDE_COLUMN:
				setIncludeColumn((String)newValue);
				return;
			case CardsPackage.CARD_FILTER__INCLUDE_COUNTER:
				setIncludeCounter((String)newValue);
				return;
			case CardsPackage.CARD_FILTER__INCLUDE_ENCHANT_UNIT:
				setIncludeEnchantUnit((String)newValue);
				return;
			case CardsPackage.CARD_FILTER__INCLUDE_FACTION:
				setIncludeFaction((String)newValue);
				return;
			case CardsPackage.CARD_FILTER__INCLUDE_FRONT_LINE:
				setIncludeFrontLine((String)newValue);
				return;
			case CardsPackage.CARD_FILTER__INCLUDE_OCCUPANT:
				setIncludeOccupant((String)newValue);
				return;
			case CardsPackage.CARD_FILTER__INCLUDE_ONGOING_TYPE:
				setIncludeOngoingType((String)newValue);
				return;
			case CardsPackage.CARD_FILTER__INCLUDE_RACES:
				setIncludeRaces((String)newValue);
				return;
			case CardsPackage.CARD_FILTER__INCLUDE_SCHOOL:
				setIncludeSchool((String)newValue);
				return;
			case CardsPackage.CARD_FILTER__INCLUDE_STATUS:
				setIncludeStatus((String)newValue);
				return;
			case CardsPackage.CARD_FILTER__INCLUDE_UNIQUE:
				setIncludeUnique((String)newValue);
				return;
			case CardsPackage.CARD_FILTER__INCLUDE_UNIT_TYPE:
				setIncludeUnitType((String)newValue);
				return;
			case CardsPackage.CARD_FILTER__LEVEL_TYPE:
				setLevelType((String)newValue);
				return;
			case CardsPackage.CARD_FILTER__MAX_ATTACK:
				setMaxAttack((String)newValue);
				return;
			case CardsPackage.CARD_FILTER__MAX_COST:
				setMaxCost((String)newValue);
				return;
			case CardsPackage.CARD_FILTER__MAX_LEVEL:
				setMaxLevel((String)newValue);
				return;
			case CardsPackage.CARD_FILTER__SAME_CARD_TYPE:
				setSameCardType((String)newValue);
				return;
			case CardsPackage.CARD_FILTER__SAME_GPID:
				setSameGPID((String)newValue);
				return;
			case CardsPackage.CARD_FILTER__SHARE_RACES:
				setShareRaces((String)newValue);
				return;
			case CardsPackage.CARD_FILTER__SHARE_RACES_WITH_OCCUPANT:
				setShareRacesWithOccupant((String)newValue);
				return;
			case CardsPackage.CARD_FILTER__SIDE:
				setSide((String)newValue);
				return;
			case CardsPackage.CARD_FILTER__VALUE:
				setValue((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CardsPackage.CARD_FILTER__VARIABLE:
				setVariable((Variable)null);
				return;
			case CardsPackage.CARD_FILTER__ATTACK_HERO_LAST_TURN:
				setAttackHeroLastTurn(ATTACK_HERO_LAST_TURN_EDEFAULT);
				return;
			case CardsPackage.CARD_FILTER__BASE_MAX_COST:
				setBaseMaxCost(BASE_MAX_COST_EDEFAULT);
				return;
			case CardsPackage.CARD_FILTER__DEAL_DAMAGE_TO_HERO_LAST_TURN:
				setDealDamageToHeroLastTurn(DEAL_DAMAGE_TO_HERO_LAST_TURN_EDEFAULT);
				return;
			case CardsPackage.CARD_FILTER__EXCLUDE_FACTION:
				setExcludeFaction(EXCLUDE_FACTION_EDEFAULT);
				return;
			case CardsPackage.CARD_FILTER__EXCLUDE_RACES:
				setExcludeRaces(EXCLUDE_RACES_EDEFAULT);
				return;
			case CardsPackage.CARD_FILTER__EXCLUDE_SCHOOL:
				setExcludeSchool(EXCLUDE_SCHOOL_EDEFAULT);
				return;
			case CardsPackage.CARD_FILTER__EXCLUDE_TOKEN:
				setExcludeToken(EXCLUDE_TOKEN_EDEFAULT);
				return;
			case CardsPackage.CARD_FILTER__EXCLUDE_UNIQUE:
				setExcludeUnique(EXCLUDE_UNIQUE_EDEFAULT);
				return;
			case CardsPackage.CARD_FILTER__EXCLUDE_UNIT_TYPE:
				setExcludeUnitType(EXCLUDE_UNIT_TYPE_EDEFAULT);
				return;
			case CardsPackage.CARD_FILTER__INCLUDE_ABILITY:
				setIncludeAbility(INCLUDE_ABILITY_EDEFAULT);
				return;
			case CardsPackage.CARD_FILTER__INCLUDE_CARD_ID:
				setIncludeCardID(INCLUDE_CARD_ID_EDEFAULT);
				return;
			case CardsPackage.CARD_FILTER__INCLUDE_CARD_TYPE:
				setIncludeCardType(INCLUDE_CARD_TYPE_EDEFAULT);
				return;
			case CardsPackage.CARD_FILTER__INCLUDE_COLUMN:
				setIncludeColumn(INCLUDE_COLUMN_EDEFAULT);
				return;
			case CardsPackage.CARD_FILTER__INCLUDE_COUNTER:
				setIncludeCounter(INCLUDE_COUNTER_EDEFAULT);
				return;
			case CardsPackage.CARD_FILTER__INCLUDE_ENCHANT_UNIT:
				setIncludeEnchantUnit(INCLUDE_ENCHANT_UNIT_EDEFAULT);
				return;
			case CardsPackage.CARD_FILTER__INCLUDE_FACTION:
				setIncludeFaction(INCLUDE_FACTION_EDEFAULT);
				return;
			case CardsPackage.CARD_FILTER__INCLUDE_FRONT_LINE:
				setIncludeFrontLine(INCLUDE_FRONT_LINE_EDEFAULT);
				return;
			case CardsPackage.CARD_FILTER__INCLUDE_OCCUPANT:
				setIncludeOccupant(INCLUDE_OCCUPANT_EDEFAULT);
				return;
			case CardsPackage.CARD_FILTER__INCLUDE_ONGOING_TYPE:
				setIncludeOngoingType(INCLUDE_ONGOING_TYPE_EDEFAULT);
				return;
			case CardsPackage.CARD_FILTER__INCLUDE_RACES:
				setIncludeRaces(INCLUDE_RACES_EDEFAULT);
				return;
			case CardsPackage.CARD_FILTER__INCLUDE_SCHOOL:
				setIncludeSchool(INCLUDE_SCHOOL_EDEFAULT);
				return;
			case CardsPackage.CARD_FILTER__INCLUDE_STATUS:
				setIncludeStatus(INCLUDE_STATUS_EDEFAULT);
				return;
			case CardsPackage.CARD_FILTER__INCLUDE_UNIQUE:
				setIncludeUnique(INCLUDE_UNIQUE_EDEFAULT);
				return;
			case CardsPackage.CARD_FILTER__INCLUDE_UNIT_TYPE:
				setIncludeUnitType(INCLUDE_UNIT_TYPE_EDEFAULT);
				return;
			case CardsPackage.CARD_FILTER__LEVEL_TYPE:
				setLevelType(LEVEL_TYPE_EDEFAULT);
				return;
			case CardsPackage.CARD_FILTER__MAX_ATTACK:
				setMaxAttack(MAX_ATTACK_EDEFAULT);
				return;
			case CardsPackage.CARD_FILTER__MAX_COST:
				setMaxCost(MAX_COST_EDEFAULT);
				return;
			case CardsPackage.CARD_FILTER__MAX_LEVEL:
				setMaxLevel(MAX_LEVEL_EDEFAULT);
				return;
			case CardsPackage.CARD_FILTER__SAME_CARD_TYPE:
				setSameCardType(SAME_CARD_TYPE_EDEFAULT);
				return;
			case CardsPackage.CARD_FILTER__SAME_GPID:
				setSameGPID(SAME_GPID_EDEFAULT);
				return;
			case CardsPackage.CARD_FILTER__SHARE_RACES:
				setShareRaces(SHARE_RACES_EDEFAULT);
				return;
			case CardsPackage.CARD_FILTER__SHARE_RACES_WITH_OCCUPANT:
				setShareRacesWithOccupant(SHARE_RACES_WITH_OCCUPANT_EDEFAULT);
				return;
			case CardsPackage.CARD_FILTER__SIDE:
				setSide(SIDE_EDEFAULT);
				return;
			case CardsPackage.CARD_FILTER__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CardsPackage.CARD_FILTER__VARIABLE:
				return variable != null;
			case CardsPackage.CARD_FILTER__ATTACK_HERO_LAST_TURN:
				return ATTACK_HERO_LAST_TURN_EDEFAULT == null ? attackHeroLastTurn != null : !ATTACK_HERO_LAST_TURN_EDEFAULT.equals(attackHeroLastTurn);
			case CardsPackage.CARD_FILTER__BASE_MAX_COST:
				return BASE_MAX_COST_EDEFAULT == null ? baseMaxCost != null : !BASE_MAX_COST_EDEFAULT.equals(baseMaxCost);
			case CardsPackage.CARD_FILTER__DEAL_DAMAGE_TO_HERO_LAST_TURN:
				return DEAL_DAMAGE_TO_HERO_LAST_TURN_EDEFAULT == null ? dealDamageToHeroLastTurn != null : !DEAL_DAMAGE_TO_HERO_LAST_TURN_EDEFAULT.equals(dealDamageToHeroLastTurn);
			case CardsPackage.CARD_FILTER__EXCLUDE_FACTION:
				return EXCLUDE_FACTION_EDEFAULT == null ? excludeFaction != null : !EXCLUDE_FACTION_EDEFAULT.equals(excludeFaction);
			case CardsPackage.CARD_FILTER__EXCLUDE_RACES:
				return EXCLUDE_RACES_EDEFAULT == null ? excludeRaces != null : !EXCLUDE_RACES_EDEFAULT.equals(excludeRaces);
			case CardsPackage.CARD_FILTER__EXCLUDE_SCHOOL:
				return EXCLUDE_SCHOOL_EDEFAULT == null ? excludeSchool != null : !EXCLUDE_SCHOOL_EDEFAULT.equals(excludeSchool);
			case CardsPackage.CARD_FILTER__EXCLUDE_TOKEN:
				return EXCLUDE_TOKEN_EDEFAULT == null ? excludeToken != null : !EXCLUDE_TOKEN_EDEFAULT.equals(excludeToken);
			case CardsPackage.CARD_FILTER__EXCLUDE_UNIQUE:
				return EXCLUDE_UNIQUE_EDEFAULT == null ? excludeUnique != null : !EXCLUDE_UNIQUE_EDEFAULT.equals(excludeUnique);
			case CardsPackage.CARD_FILTER__EXCLUDE_UNIT_TYPE:
				return EXCLUDE_UNIT_TYPE_EDEFAULT == null ? excludeUnitType != null : !EXCLUDE_UNIT_TYPE_EDEFAULT.equals(excludeUnitType);
			case CardsPackage.CARD_FILTER__INCLUDE_ABILITY:
				return INCLUDE_ABILITY_EDEFAULT == null ? includeAbility != null : !INCLUDE_ABILITY_EDEFAULT.equals(includeAbility);
			case CardsPackage.CARD_FILTER__INCLUDE_CARD_ID:
				return INCLUDE_CARD_ID_EDEFAULT == null ? includeCardID != null : !INCLUDE_CARD_ID_EDEFAULT.equals(includeCardID);
			case CardsPackage.CARD_FILTER__INCLUDE_CARD_TYPE:
				return INCLUDE_CARD_TYPE_EDEFAULT == null ? includeCardType != null : !INCLUDE_CARD_TYPE_EDEFAULT.equals(includeCardType);
			case CardsPackage.CARD_FILTER__INCLUDE_COLUMN:
				return INCLUDE_COLUMN_EDEFAULT == null ? includeColumn != null : !INCLUDE_COLUMN_EDEFAULT.equals(includeColumn);
			case CardsPackage.CARD_FILTER__INCLUDE_COUNTER:
				return INCLUDE_COUNTER_EDEFAULT == null ? includeCounter != null : !INCLUDE_COUNTER_EDEFAULT.equals(includeCounter);
			case CardsPackage.CARD_FILTER__INCLUDE_ENCHANT_UNIT:
				return INCLUDE_ENCHANT_UNIT_EDEFAULT == null ? includeEnchantUnit != null : !INCLUDE_ENCHANT_UNIT_EDEFAULT.equals(includeEnchantUnit);
			case CardsPackage.CARD_FILTER__INCLUDE_FACTION:
				return INCLUDE_FACTION_EDEFAULT == null ? includeFaction != null : !INCLUDE_FACTION_EDEFAULT.equals(includeFaction);
			case CardsPackage.CARD_FILTER__INCLUDE_FRONT_LINE:
				return INCLUDE_FRONT_LINE_EDEFAULT == null ? includeFrontLine != null : !INCLUDE_FRONT_LINE_EDEFAULT.equals(includeFrontLine);
			case CardsPackage.CARD_FILTER__INCLUDE_OCCUPANT:
				return INCLUDE_OCCUPANT_EDEFAULT == null ? includeOccupant != null : !INCLUDE_OCCUPANT_EDEFAULT.equals(includeOccupant);
			case CardsPackage.CARD_FILTER__INCLUDE_ONGOING_TYPE:
				return INCLUDE_ONGOING_TYPE_EDEFAULT == null ? includeOngoingType != null : !INCLUDE_ONGOING_TYPE_EDEFAULT.equals(includeOngoingType);
			case CardsPackage.CARD_FILTER__INCLUDE_RACES:
				return INCLUDE_RACES_EDEFAULT == null ? includeRaces != null : !INCLUDE_RACES_EDEFAULT.equals(includeRaces);
			case CardsPackage.CARD_FILTER__INCLUDE_SCHOOL:
				return INCLUDE_SCHOOL_EDEFAULT == null ? includeSchool != null : !INCLUDE_SCHOOL_EDEFAULT.equals(includeSchool);
			case CardsPackage.CARD_FILTER__INCLUDE_STATUS:
				return INCLUDE_STATUS_EDEFAULT == null ? includeStatus != null : !INCLUDE_STATUS_EDEFAULT.equals(includeStatus);
			case CardsPackage.CARD_FILTER__INCLUDE_UNIQUE:
				return INCLUDE_UNIQUE_EDEFAULT == null ? includeUnique != null : !INCLUDE_UNIQUE_EDEFAULT.equals(includeUnique);
			case CardsPackage.CARD_FILTER__INCLUDE_UNIT_TYPE:
				return INCLUDE_UNIT_TYPE_EDEFAULT == null ? includeUnitType != null : !INCLUDE_UNIT_TYPE_EDEFAULT.equals(includeUnitType);
			case CardsPackage.CARD_FILTER__LEVEL_TYPE:
				return LEVEL_TYPE_EDEFAULT == null ? levelType != null : !LEVEL_TYPE_EDEFAULT.equals(levelType);
			case CardsPackage.CARD_FILTER__MAX_ATTACK:
				return MAX_ATTACK_EDEFAULT == null ? maxAttack != null : !MAX_ATTACK_EDEFAULT.equals(maxAttack);
			case CardsPackage.CARD_FILTER__MAX_COST:
				return MAX_COST_EDEFAULT == null ? maxCost != null : !MAX_COST_EDEFAULT.equals(maxCost);
			case CardsPackage.CARD_FILTER__MAX_LEVEL:
				return MAX_LEVEL_EDEFAULT == null ? maxLevel != null : !MAX_LEVEL_EDEFAULT.equals(maxLevel);
			case CardsPackage.CARD_FILTER__SAME_CARD_TYPE:
				return SAME_CARD_TYPE_EDEFAULT == null ? sameCardType != null : !SAME_CARD_TYPE_EDEFAULT.equals(sameCardType);
			case CardsPackage.CARD_FILTER__SAME_GPID:
				return SAME_GPID_EDEFAULT == null ? sameGPID != null : !SAME_GPID_EDEFAULT.equals(sameGPID);
			case CardsPackage.CARD_FILTER__SHARE_RACES:
				return SHARE_RACES_EDEFAULT == null ? shareRaces != null : !SHARE_RACES_EDEFAULT.equals(shareRaces);
			case CardsPackage.CARD_FILTER__SHARE_RACES_WITH_OCCUPANT:
				return SHARE_RACES_WITH_OCCUPANT_EDEFAULT == null ? shareRacesWithOccupant != null : !SHARE_RACES_WITH_OCCUPANT_EDEFAULT.equals(shareRacesWithOccupant);
			case CardsPackage.CARD_FILTER__SIDE:
				return SIDE_EDEFAULT == null ? side != null : !SIDE_EDEFAULT.equals(side);
			case CardsPackage.CARD_FILTER__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (attackHeroLastTurn: ");
		result.append(attackHeroLastTurn);
		result.append(", baseMaxCost: ");
		result.append(baseMaxCost);
		result.append(", dealDamageToHeroLastTurn: ");
		result.append(dealDamageToHeroLastTurn);
		result.append(", excludeFaction: ");
		result.append(excludeFaction);
		result.append(", excludeRaces: ");
		result.append(excludeRaces);
		result.append(", excludeSchool: ");
		result.append(excludeSchool);
		result.append(", excludeToken: ");
		result.append(excludeToken);
		result.append(", excludeUnique: ");
		result.append(excludeUnique);
		result.append(", excludeUnitType: ");
		result.append(excludeUnitType);
		result.append(", includeAbility: ");
		result.append(includeAbility);
		result.append(", includeCardID: ");
		result.append(includeCardID);
		result.append(", includeCardType: ");
		result.append(includeCardType);
		result.append(", includeColumn: ");
		result.append(includeColumn);
		result.append(", includeCounter: ");
		result.append(includeCounter);
		result.append(", includeEnchantUnit: ");
		result.append(includeEnchantUnit);
		result.append(", includeFaction: ");
		result.append(includeFaction);
		result.append(", includeFrontLine: ");
		result.append(includeFrontLine);
		result.append(", includeOccupant: ");
		result.append(includeOccupant);
		result.append(", includeOngoingType: ");
		result.append(includeOngoingType);
		result.append(", includeRaces: ");
		result.append(includeRaces);
		result.append(", includeSchool: ");
		result.append(includeSchool);
		result.append(", includeStatus: ");
		result.append(includeStatus);
		result.append(", includeUnique: ");
		result.append(includeUnique);
		result.append(", includeUnitType: ");
		result.append(includeUnitType);
		result.append(", levelType: ");
		result.append(levelType);
		result.append(", maxAttack: ");
		result.append(maxAttack);
		result.append(", maxCost: ");
		result.append(maxCost);
		result.append(", maxLevel: ");
		result.append(maxLevel);
		result.append(", sameCardType: ");
		result.append(sameCardType);
		result.append(", sameGPID: ");
		result.append(sameGPID);
		result.append(", shareRaces: ");
		result.append(shareRaces);
		result.append(", shareRacesWithOccupant: ");
		result.append(shareRacesWithOccupant);
		result.append(", side: ");
		result.append(side);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //CardFilterImpl
