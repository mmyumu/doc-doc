/**
 */
package net.mmyumu.docdoc.model.Cards.impl;

import java.util.Collection;
import net.mmyumu.docdoc.model.Cards.Ability;
import net.mmyumu.docdoc.model.Cards.AdditionalCost;
import net.mmyumu.docdoc.model.Cards.Card;
import net.mmyumu.docdoc.model.Cards.CardsPackage;
import net.mmyumu.docdoc.model.Cards.Condition;
import net.mmyumu.docdoc.model.Cards.OnGoing;
import net.mmyumu.docdoc.model.Cards.School;
import net.mmyumu.docdoc.model.Cards.Target;
import net.mmyumu.docdoc.model.Cards.Trigger;
import net.mmyumu.docdoc.model.Cards.Variable;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Card</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardImpl#getAbility <em>Ability</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardImpl#getSchool <em>School</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardImpl#getOngoing <em>Ongoing</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardImpl#getExtraDescription <em>Extra Description</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardImpl#getVariable2 <em>Variable2</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardImpl#getVariable3 <em>Variable3</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardImpl#getVariable4 <em>Variable4</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardImpl#getVariable5 <em>Variable5</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardImpl#getVariable6 <em>Variable6</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardImpl#getVariable7 <em>Variable7</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardImpl#getPlayabilityCondition <em>Playability Condition</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardImpl#getAttackCondition <em>Attack Condition</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardImpl#getAdditionalCost <em>Additional Cost</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardImpl#getAttack <em>Attack</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardImpl#getDestinyLevel <em>Destiny Level</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardImpl#getFaction <em>Faction</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardImpl#getHP <em>HP</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardImpl#getID <em>ID</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardImpl#getMagicLevel <em>Magic Level</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardImpl#getMightLevel <em>Might Level</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardImpl#getNotLocalized <em>Not Localized</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardImpl#getRace <em>Race</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardImpl#getRarity <em>Rarity</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardImpl#getResourceName <em>Resource Name</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardImpl#getRetaliate <em>Retaliate</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardImpl#getSchool1 <em>School1</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardImpl#getSchoolsAligned <em>Schools Aligned</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardImpl#getSubType <em>Sub Type</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardImpl#getToken <em>Token</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardImpl#getType <em>Type</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardImpl#getUnique <em>Unique</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardImpl#getZone <em>Zone</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CardImpl extends MinimalEObjectImpl.Container implements Card {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The default value of the '{@link #getAttack() <em>Attack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttack()
	 * @generated
	 * @ordered
	 */
	protected static final int ATTACK_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAttack() <em>Attack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttack()
	 * @generated
	 * @ordered
	 */
	protected int attack = ATTACK_EDEFAULT;

	/**
	 * This is true if the Attack attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean attackESet;

	/**
	 * The default value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected static final int COST_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCost() <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCost()
	 * @generated
	 * @ordered
	 */
	protected int cost = COST_EDEFAULT;

	/**
	 * This is true if the Cost attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean costESet;

	/**
	 * The default value of the '{@link #getDestinyLevel() <em>Destiny Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinyLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int DESTINY_LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDestinyLevel() <em>Destiny Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinyLevel()
	 * @generated
	 * @ordered
	 */
	protected int destinyLevel = DESTINY_LEVEL_EDEFAULT;

	/**
	 * This is true if the Destiny Level attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean destinyLevelESet;

	/**
	 * The default value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected String displayName = DISPLAY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getFaction() <em>Faction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaction()
	 * @generated
	 * @ordered
	 */
	protected static final String FACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFaction() <em>Faction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFaction()
	 * @generated
	 * @ordered
	 */
	protected String faction = FACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getHP() <em>HP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHP()
	 * @generated
	 * @ordered
	 */
	protected static final int HP_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHP() <em>HP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHP()
	 * @generated
	 * @ordered
	 */
	protected int hP = HP_EDEFAULT;

	/**
	 * This is true if the HP attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean hPESet;

	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected int iD = ID_EDEFAULT;

	/**
	 * This is true if the ID attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean iDESet;

	/**
	 * The default value of the '{@link #getMagicLevel() <em>Magic Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMagicLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int MAGIC_LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMagicLevel() <em>Magic Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMagicLevel()
	 * @generated
	 * @ordered
	 */
	protected int magicLevel = MAGIC_LEVEL_EDEFAULT;

	/**
	 * This is true if the Magic Level attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean magicLevelESet;

	/**
	 * The default value of the '{@link #getMightLevel() <em>Might Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMightLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int MIGHT_LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMightLevel() <em>Might Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMightLevel()
	 * @generated
	 * @ordered
	 */
	protected int mightLevel = MIGHT_LEVEL_EDEFAULT;

	/**
	 * This is true if the Might Level attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean mightLevelESet;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotLocalized() <em>Not Localized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotLocalized()
	 * @generated
	 * @ordered
	 */
	protected static final String NOT_LOCALIZED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotLocalized() <em>Not Localized</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotLocalized()
	 * @generated
	 * @ordered
	 */
	protected String notLocalized = NOT_LOCALIZED_EDEFAULT;

	/**
	 * The default value of the '{@link #getRace() <em>Race</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRace()
	 * @generated
	 * @ordered
	 */
	protected static final String RACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRace() <em>Race</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRace()
	 * @generated
	 * @ordered
	 */
	protected String race = RACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRarity() <em>Rarity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRarity()
	 * @generated
	 * @ordered
	 */
	protected static final String RARITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRarity() <em>Rarity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRarity()
	 * @generated
	 * @ordered
	 */
	protected String rarity = RARITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getResourceName() <em>Resource Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceName()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResourceName() <em>Resource Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceName()
	 * @generated
	 * @ordered
	 */
	protected String resourceName = RESOURCE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRetaliate() <em>Retaliate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetaliate()
	 * @generated
	 * @ordered
	 */
	protected static final int RETALIATE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRetaliate() <em>Retaliate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetaliate()
	 * @generated
	 * @ordered
	 */
	protected int retaliate = RETALIATE_EDEFAULT;

	/**
	 * This is true if the Retaliate attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean retaliateESet;

	/**
	 * The default value of the '{@link #getSchool1() <em>School1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchool1()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHOOL1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchool1() <em>School1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchool1()
	 * @generated
	 * @ordered
	 */
	protected String school1 = SCHOOL1_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchoolsAligned() <em>Schools Aligned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchoolsAligned()
	 * @generated
	 * @ordered
	 */
	protected static final String SCHOOLS_ALIGNED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSchoolsAligned() <em>Schools Aligned</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchoolsAligned()
	 * @generated
	 * @ordered
	 */
	protected String schoolsAligned = SCHOOLS_ALIGNED_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubType() <em>Sub Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubType()
	 * @generated
	 * @ordered
	 */
	protected static final String SUB_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubType() <em>Sub Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubType()
	 * @generated
	 * @ordered
	 */
	protected String subType = SUB_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected static final String TOKEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToken() <em>Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToken()
	 * @generated
	 * @ordered
	 */
	protected String token = TOKEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnique()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIQUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnique() <em>Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnique()
	 * @generated
	 * @ordered
	 */
	protected String unique = UNIQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getZone() <em>Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZone()
	 * @generated
	 * @ordered
	 */
	protected static final String ZONE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZone() <em>Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZone()
	 * @generated
	 * @ordered
	 */
	protected String zone = ZONE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CardsPackage.Literals.CARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, CardsPackage.CARD__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		return (FeatureMap)getMixed().<FeatureMap.Entry>list(CardsPackage.Literals.CARD__GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Ability> getAbility() {
		return getGroup().list(CardsPackage.Literals.CARD__ABILITY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<School> getSchool() {
		return getGroup().list(CardsPackage.Literals.CARD__SCHOOL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OnGoing> getOngoing() {
		return getGroup().list(CardsPackage.Literals.CARD__ONGOING);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Target> getTarget() {
		return getGroup().list(CardsPackage.Literals.CARD__TARGET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDescription() {
		return getGroup().list(CardsPackage.Literals.CARD__DESCRIPTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getExtraDescription() {
		return getGroup().list(CardsPackage.Literals.CARD__EXTRA_DESCRIPTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariable() {
		return getGroup().list(CardsPackage.Literals.CARD__VARIABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariable2() {
		return getGroup().list(CardsPackage.Literals.CARD__VARIABLE2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariable3() {
		return getGroup().list(CardsPackage.Literals.CARD__VARIABLE3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariable4() {
		return getGroup().list(CardsPackage.Literals.CARD__VARIABLE4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariable5() {
		return getGroup().list(CardsPackage.Literals.CARD__VARIABLE5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariable6() {
		return getGroup().list(CardsPackage.Literals.CARD__VARIABLE6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariable7() {
		return getGroup().list(CardsPackage.Literals.CARD__VARIABLE7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getPlayabilityCondition() {
		return getGroup().list(CardsPackage.Literals.CARD__PLAYABILITY_CONDITION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getAttackCondition() {
		return getGroup().list(CardsPackage.Literals.CARD__ATTACK_CONDITION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trigger> getTrigger() {
		return getGroup().list(CardsPackage.Literals.CARD__TRIGGER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AdditionalCost> getAdditionalCost() {
		return getGroup().list(CardsPackage.Literals.CARD__ADDITIONAL_COST);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAttack() {
		return attack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttack(int newAttack) {
		int oldAttack = attack;
		attack = newAttack;
		boolean oldAttackESet = attackESet;
		attackESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD__ATTACK, oldAttack, attack, !oldAttackESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAttack() {
		int oldAttack = attack;
		boolean oldAttackESet = attackESet;
		attack = ATTACK_EDEFAULT;
		attackESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CardsPackage.CARD__ATTACK, oldAttack, ATTACK_EDEFAULT, oldAttackESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAttack() {
		return attackESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCost() {
		return cost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCost(int newCost) {
		int oldCost = cost;
		cost = newCost;
		boolean oldCostESet = costESet;
		costESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD__COST, oldCost, cost, !oldCostESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCost() {
		int oldCost = cost;
		boolean oldCostESet = costESet;
		cost = COST_EDEFAULT;
		costESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CardsPackage.CARD__COST, oldCost, COST_EDEFAULT, oldCostESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCost() {
		return costESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDestinyLevel() {
		return destinyLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestinyLevel(int newDestinyLevel) {
		int oldDestinyLevel = destinyLevel;
		destinyLevel = newDestinyLevel;
		boolean oldDestinyLevelESet = destinyLevelESet;
		destinyLevelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD__DESTINY_LEVEL, oldDestinyLevel, destinyLevel, !oldDestinyLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetDestinyLevel() {
		int oldDestinyLevel = destinyLevel;
		boolean oldDestinyLevelESet = destinyLevelESet;
		destinyLevel = DESTINY_LEVEL_EDEFAULT;
		destinyLevelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CardsPackage.CARD__DESTINY_LEVEL, oldDestinyLevel, DESTINY_LEVEL_EDEFAULT, oldDestinyLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDestinyLevel() {
		return destinyLevelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayName(String newDisplayName) {
		String oldDisplayName = displayName;
		displayName = newDisplayName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD__DISPLAY_NAME, oldDisplayName, displayName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFaction() {
		return faction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFaction(String newFaction) {
		String oldFaction = faction;
		faction = newFaction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD__FACTION, oldFaction, faction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHP() {
		return hP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHP(int newHP) {
		int oldHP = hP;
		hP = newHP;
		boolean oldHPESet = hPESet;
		hPESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD__HP, oldHP, hP, !oldHPESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHP() {
		int oldHP = hP;
		boolean oldHPESet = hPESet;
		hP = HP_EDEFAULT;
		hPESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CardsPackage.CARD__HP, oldHP, HP_EDEFAULT, oldHPESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHP() {
		return hPESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getID() {
		return iD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(int newID) {
		int oldID = iD;
		iD = newID;
		boolean oldIDESet = iDESet;
		iDESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD__ID, oldID, iD, !oldIDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetID() {
		int oldID = iD;
		boolean oldIDESet = iDESet;
		iD = ID_EDEFAULT;
		iDESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CardsPackage.CARD__ID, oldID, ID_EDEFAULT, oldIDESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetID() {
		return iDESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMagicLevel() {
		return magicLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMagicLevel(int newMagicLevel) {
		int oldMagicLevel = magicLevel;
		magicLevel = newMagicLevel;
		boolean oldMagicLevelESet = magicLevelESet;
		magicLevelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD__MAGIC_LEVEL, oldMagicLevel, magicLevel, !oldMagicLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMagicLevel() {
		int oldMagicLevel = magicLevel;
		boolean oldMagicLevelESet = magicLevelESet;
		magicLevel = MAGIC_LEVEL_EDEFAULT;
		magicLevelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CardsPackage.CARD__MAGIC_LEVEL, oldMagicLevel, MAGIC_LEVEL_EDEFAULT, oldMagicLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMagicLevel() {
		return magicLevelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMightLevel() {
		return mightLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMightLevel(int newMightLevel) {
		int oldMightLevel = mightLevel;
		mightLevel = newMightLevel;
		boolean oldMightLevelESet = mightLevelESet;
		mightLevelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD__MIGHT_LEVEL, oldMightLevel, mightLevel, !oldMightLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMightLevel() {
		int oldMightLevel = mightLevel;
		boolean oldMightLevelESet = mightLevelESet;
		mightLevel = MIGHT_LEVEL_EDEFAULT;
		mightLevelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CardsPackage.CARD__MIGHT_LEVEL, oldMightLevel, MIGHT_LEVEL_EDEFAULT, oldMightLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMightLevel() {
		return mightLevelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNotLocalized() {
		return notLocalized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotLocalized(String newNotLocalized) {
		String oldNotLocalized = notLocalized;
		notLocalized = newNotLocalized;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD__NOT_LOCALIZED, oldNotLocalized, notLocalized));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRace() {
		return race;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRace(String newRace) {
		String oldRace = race;
		race = newRace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD__RACE, oldRace, race));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRarity() {
		return rarity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRarity(String newRarity) {
		String oldRarity = rarity;
		rarity = newRarity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD__RARITY, oldRarity, rarity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResourceName() {
		return resourceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceName(String newResourceName) {
		String oldResourceName = resourceName;
		resourceName = newResourceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD__RESOURCE_NAME, oldResourceName, resourceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRetaliate() {
		return retaliate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetaliate(int newRetaliate) {
		int oldRetaliate = retaliate;
		retaliate = newRetaliate;
		boolean oldRetaliateESet = retaliateESet;
		retaliateESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD__RETALIATE, oldRetaliate, retaliate, !oldRetaliateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetRetaliate() {
		int oldRetaliate = retaliate;
		boolean oldRetaliateESet = retaliateESet;
		retaliate = RETALIATE_EDEFAULT;
		retaliateESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CardsPackage.CARD__RETALIATE, oldRetaliate, RETALIATE_EDEFAULT, oldRetaliateESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRetaliate() {
		return retaliateESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSchool1() {
		return school1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchool1(String newSchool1) {
		String oldSchool1 = school1;
		school1 = newSchool1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD__SCHOOL1, oldSchool1, school1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSchoolsAligned() {
		return schoolsAligned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchoolsAligned(String newSchoolsAligned) {
		String oldSchoolsAligned = schoolsAligned;
		schoolsAligned = newSchoolsAligned;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD__SCHOOLS_ALIGNED, oldSchoolsAligned, schoolsAligned));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubType() {
		return subType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubType(String newSubType) {
		String oldSubType = subType;
		subType = newSubType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD__SUB_TYPE, oldSubType, subType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getToken() {
		return token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToken(String newToken) {
		String oldToken = token;
		token = newToken;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD__TOKEN, oldToken, token));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnique() {
		return unique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnique(String newUnique) {
		String oldUnique = unique;
		unique = newUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD__UNIQUE, oldUnique, unique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getZone() {
		return zone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setZone(String newZone) {
		String oldZone = zone;
		zone = newZone;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD__ZONE, oldZone, zone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CardsPackage.CARD__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case CardsPackage.CARD__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case CardsPackage.CARD__ABILITY:
				return ((InternalEList<?>)getAbility()).basicRemove(otherEnd, msgs);
			case CardsPackage.CARD__SCHOOL:
				return ((InternalEList<?>)getSchool()).basicRemove(otherEnd, msgs);
			case CardsPackage.CARD__ONGOING:
				return ((InternalEList<?>)getOngoing()).basicRemove(otherEnd, msgs);
			case CardsPackage.CARD__TARGET:
				return ((InternalEList<?>)getTarget()).basicRemove(otherEnd, msgs);
			case CardsPackage.CARD__VARIABLE:
				return ((InternalEList<?>)getVariable()).basicRemove(otherEnd, msgs);
			case CardsPackage.CARD__VARIABLE2:
				return ((InternalEList<?>)getVariable2()).basicRemove(otherEnd, msgs);
			case CardsPackage.CARD__VARIABLE3:
				return ((InternalEList<?>)getVariable3()).basicRemove(otherEnd, msgs);
			case CardsPackage.CARD__VARIABLE4:
				return ((InternalEList<?>)getVariable4()).basicRemove(otherEnd, msgs);
			case CardsPackage.CARD__VARIABLE5:
				return ((InternalEList<?>)getVariable5()).basicRemove(otherEnd, msgs);
			case CardsPackage.CARD__VARIABLE6:
				return ((InternalEList<?>)getVariable6()).basicRemove(otherEnd, msgs);
			case CardsPackage.CARD__VARIABLE7:
				return ((InternalEList<?>)getVariable7()).basicRemove(otherEnd, msgs);
			case CardsPackage.CARD__PLAYABILITY_CONDITION:
				return ((InternalEList<?>)getPlayabilityCondition()).basicRemove(otherEnd, msgs);
			case CardsPackage.CARD__ATTACK_CONDITION:
				return ((InternalEList<?>)getAttackCondition()).basicRemove(otherEnd, msgs);
			case CardsPackage.CARD__TRIGGER:
				return ((InternalEList<?>)getTrigger()).basicRemove(otherEnd, msgs);
			case CardsPackage.CARD__ADDITIONAL_COST:
				return ((InternalEList<?>)getAdditionalCost()).basicRemove(otherEnd, msgs);
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
			case CardsPackage.CARD__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case CardsPackage.CARD__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case CardsPackage.CARD__ABILITY:
				return getAbility();
			case CardsPackage.CARD__SCHOOL:
				return getSchool();
			case CardsPackage.CARD__ONGOING:
				return getOngoing();
			case CardsPackage.CARD__TARGET:
				return getTarget();
			case CardsPackage.CARD__DESCRIPTION:
				return getDescription();
			case CardsPackage.CARD__EXTRA_DESCRIPTION:
				return getExtraDescription();
			case CardsPackage.CARD__VARIABLE:
				return getVariable();
			case CardsPackage.CARD__VARIABLE2:
				return getVariable2();
			case CardsPackage.CARD__VARIABLE3:
				return getVariable3();
			case CardsPackage.CARD__VARIABLE4:
				return getVariable4();
			case CardsPackage.CARD__VARIABLE5:
				return getVariable5();
			case CardsPackage.CARD__VARIABLE6:
				return getVariable6();
			case CardsPackage.CARD__VARIABLE7:
				return getVariable7();
			case CardsPackage.CARD__PLAYABILITY_CONDITION:
				return getPlayabilityCondition();
			case CardsPackage.CARD__ATTACK_CONDITION:
				return getAttackCondition();
			case CardsPackage.CARD__TRIGGER:
				return getTrigger();
			case CardsPackage.CARD__ADDITIONAL_COST:
				return getAdditionalCost();
			case CardsPackage.CARD__ATTACK:
				return getAttack();
			case CardsPackage.CARD__COST:
				return getCost();
			case CardsPackage.CARD__DESTINY_LEVEL:
				return getDestinyLevel();
			case CardsPackage.CARD__DISPLAY_NAME:
				return getDisplayName();
			case CardsPackage.CARD__FACTION:
				return getFaction();
			case CardsPackage.CARD__HP:
				return getHP();
			case CardsPackage.CARD__ID:
				return getID();
			case CardsPackage.CARD__MAGIC_LEVEL:
				return getMagicLevel();
			case CardsPackage.CARD__MIGHT_LEVEL:
				return getMightLevel();
			case CardsPackage.CARD__NAME:
				return getName();
			case CardsPackage.CARD__NOT_LOCALIZED:
				return getNotLocalized();
			case CardsPackage.CARD__RACE:
				return getRace();
			case CardsPackage.CARD__RARITY:
				return getRarity();
			case CardsPackage.CARD__RESOURCE_NAME:
				return getResourceName();
			case CardsPackage.CARD__RETALIATE:
				return getRetaliate();
			case CardsPackage.CARD__SCHOOL1:
				return getSchool1();
			case CardsPackage.CARD__SCHOOLS_ALIGNED:
				return getSchoolsAligned();
			case CardsPackage.CARD__SUB_TYPE:
				return getSubType();
			case CardsPackage.CARD__TOKEN:
				return getToken();
			case CardsPackage.CARD__TYPE:
				return getType();
			case CardsPackage.CARD__UNIQUE:
				return getUnique();
			case CardsPackage.CARD__ZONE:
				return getZone();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CardsPackage.CARD__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case CardsPackage.CARD__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case CardsPackage.CARD__ABILITY:
				getAbility().clear();
				getAbility().addAll((Collection<? extends Ability>)newValue);
				return;
			case CardsPackage.CARD__SCHOOL:
				getSchool().clear();
				getSchool().addAll((Collection<? extends School>)newValue);
				return;
			case CardsPackage.CARD__ONGOING:
				getOngoing().clear();
				getOngoing().addAll((Collection<? extends OnGoing>)newValue);
				return;
			case CardsPackage.CARD__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends Target>)newValue);
				return;
			case CardsPackage.CARD__DESCRIPTION:
				getDescription().clear();
				getDescription().addAll((Collection<? extends String>)newValue);
				return;
			case CardsPackage.CARD__EXTRA_DESCRIPTION:
				getExtraDescription().clear();
				getExtraDescription().addAll((Collection<? extends String>)newValue);
				return;
			case CardsPackage.CARD__VARIABLE:
				getVariable().clear();
				getVariable().addAll((Collection<? extends Variable>)newValue);
				return;
			case CardsPackage.CARD__VARIABLE2:
				getVariable2().clear();
				getVariable2().addAll((Collection<? extends Variable>)newValue);
				return;
			case CardsPackage.CARD__VARIABLE3:
				getVariable3().clear();
				getVariable3().addAll((Collection<? extends Variable>)newValue);
				return;
			case CardsPackage.CARD__VARIABLE4:
				getVariable4().clear();
				getVariable4().addAll((Collection<? extends Variable>)newValue);
				return;
			case CardsPackage.CARD__VARIABLE5:
				getVariable5().clear();
				getVariable5().addAll((Collection<? extends Variable>)newValue);
				return;
			case CardsPackage.CARD__VARIABLE6:
				getVariable6().clear();
				getVariable6().addAll((Collection<? extends Variable>)newValue);
				return;
			case CardsPackage.CARD__VARIABLE7:
				getVariable7().clear();
				getVariable7().addAll((Collection<? extends Variable>)newValue);
				return;
			case CardsPackage.CARD__PLAYABILITY_CONDITION:
				getPlayabilityCondition().clear();
				getPlayabilityCondition().addAll((Collection<? extends Condition>)newValue);
				return;
			case CardsPackage.CARD__ATTACK_CONDITION:
				getAttackCondition().clear();
				getAttackCondition().addAll((Collection<? extends Condition>)newValue);
				return;
			case CardsPackage.CARD__TRIGGER:
				getTrigger().clear();
				getTrigger().addAll((Collection<? extends Trigger>)newValue);
				return;
			case CardsPackage.CARD__ADDITIONAL_COST:
				getAdditionalCost().clear();
				getAdditionalCost().addAll((Collection<? extends AdditionalCost>)newValue);
				return;
			case CardsPackage.CARD__ATTACK:
				setAttack((Integer)newValue);
				return;
			case CardsPackage.CARD__COST:
				setCost((Integer)newValue);
				return;
			case CardsPackage.CARD__DESTINY_LEVEL:
				setDestinyLevel((Integer)newValue);
				return;
			case CardsPackage.CARD__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case CardsPackage.CARD__FACTION:
				setFaction((String)newValue);
				return;
			case CardsPackage.CARD__HP:
				setHP((Integer)newValue);
				return;
			case CardsPackage.CARD__ID:
				setID((Integer)newValue);
				return;
			case CardsPackage.CARD__MAGIC_LEVEL:
				setMagicLevel((Integer)newValue);
				return;
			case CardsPackage.CARD__MIGHT_LEVEL:
				setMightLevel((Integer)newValue);
				return;
			case CardsPackage.CARD__NAME:
				setName((String)newValue);
				return;
			case CardsPackage.CARD__NOT_LOCALIZED:
				setNotLocalized((String)newValue);
				return;
			case CardsPackage.CARD__RACE:
				setRace((String)newValue);
				return;
			case CardsPackage.CARD__RARITY:
				setRarity((String)newValue);
				return;
			case CardsPackage.CARD__RESOURCE_NAME:
				setResourceName((String)newValue);
				return;
			case CardsPackage.CARD__RETALIATE:
				setRetaliate((Integer)newValue);
				return;
			case CardsPackage.CARD__SCHOOL1:
				setSchool1((String)newValue);
				return;
			case CardsPackage.CARD__SCHOOLS_ALIGNED:
				setSchoolsAligned((String)newValue);
				return;
			case CardsPackage.CARD__SUB_TYPE:
				setSubType((String)newValue);
				return;
			case CardsPackage.CARD__TOKEN:
				setToken((String)newValue);
				return;
			case CardsPackage.CARD__TYPE:
				setType((String)newValue);
				return;
			case CardsPackage.CARD__UNIQUE:
				setUnique((String)newValue);
				return;
			case CardsPackage.CARD__ZONE:
				setZone((String)newValue);
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
			case CardsPackage.CARD__MIXED:
				getMixed().clear();
				return;
			case CardsPackage.CARD__GROUP:
				getGroup().clear();
				return;
			case CardsPackage.CARD__ABILITY:
				getAbility().clear();
				return;
			case CardsPackage.CARD__SCHOOL:
				getSchool().clear();
				return;
			case CardsPackage.CARD__ONGOING:
				getOngoing().clear();
				return;
			case CardsPackage.CARD__TARGET:
				getTarget().clear();
				return;
			case CardsPackage.CARD__DESCRIPTION:
				getDescription().clear();
				return;
			case CardsPackage.CARD__EXTRA_DESCRIPTION:
				getExtraDescription().clear();
				return;
			case CardsPackage.CARD__VARIABLE:
				getVariable().clear();
				return;
			case CardsPackage.CARD__VARIABLE2:
				getVariable2().clear();
				return;
			case CardsPackage.CARD__VARIABLE3:
				getVariable3().clear();
				return;
			case CardsPackage.CARD__VARIABLE4:
				getVariable4().clear();
				return;
			case CardsPackage.CARD__VARIABLE5:
				getVariable5().clear();
				return;
			case CardsPackage.CARD__VARIABLE6:
				getVariable6().clear();
				return;
			case CardsPackage.CARD__VARIABLE7:
				getVariable7().clear();
				return;
			case CardsPackage.CARD__PLAYABILITY_CONDITION:
				getPlayabilityCondition().clear();
				return;
			case CardsPackage.CARD__ATTACK_CONDITION:
				getAttackCondition().clear();
				return;
			case CardsPackage.CARD__TRIGGER:
				getTrigger().clear();
				return;
			case CardsPackage.CARD__ADDITIONAL_COST:
				getAdditionalCost().clear();
				return;
			case CardsPackage.CARD__ATTACK:
				unsetAttack();
				return;
			case CardsPackage.CARD__COST:
				unsetCost();
				return;
			case CardsPackage.CARD__DESTINY_LEVEL:
				unsetDestinyLevel();
				return;
			case CardsPackage.CARD__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case CardsPackage.CARD__FACTION:
				setFaction(FACTION_EDEFAULT);
				return;
			case CardsPackage.CARD__HP:
				unsetHP();
				return;
			case CardsPackage.CARD__ID:
				unsetID();
				return;
			case CardsPackage.CARD__MAGIC_LEVEL:
				unsetMagicLevel();
				return;
			case CardsPackage.CARD__MIGHT_LEVEL:
				unsetMightLevel();
				return;
			case CardsPackage.CARD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CardsPackage.CARD__NOT_LOCALIZED:
				setNotLocalized(NOT_LOCALIZED_EDEFAULT);
				return;
			case CardsPackage.CARD__RACE:
				setRace(RACE_EDEFAULT);
				return;
			case CardsPackage.CARD__RARITY:
				setRarity(RARITY_EDEFAULT);
				return;
			case CardsPackage.CARD__RESOURCE_NAME:
				setResourceName(RESOURCE_NAME_EDEFAULT);
				return;
			case CardsPackage.CARD__RETALIATE:
				unsetRetaliate();
				return;
			case CardsPackage.CARD__SCHOOL1:
				setSchool1(SCHOOL1_EDEFAULT);
				return;
			case CardsPackage.CARD__SCHOOLS_ALIGNED:
				setSchoolsAligned(SCHOOLS_ALIGNED_EDEFAULT);
				return;
			case CardsPackage.CARD__SUB_TYPE:
				setSubType(SUB_TYPE_EDEFAULT);
				return;
			case CardsPackage.CARD__TOKEN:
				setToken(TOKEN_EDEFAULT);
				return;
			case CardsPackage.CARD__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case CardsPackage.CARD__UNIQUE:
				setUnique(UNIQUE_EDEFAULT);
				return;
			case CardsPackage.CARD__ZONE:
				setZone(ZONE_EDEFAULT);
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
			case CardsPackage.CARD__MIXED:
				return mixed != null && !mixed.isEmpty();
			case CardsPackage.CARD__GROUP:
				return !getGroup().isEmpty();
			case CardsPackage.CARD__ABILITY:
				return !getAbility().isEmpty();
			case CardsPackage.CARD__SCHOOL:
				return !getSchool().isEmpty();
			case CardsPackage.CARD__ONGOING:
				return !getOngoing().isEmpty();
			case CardsPackage.CARD__TARGET:
				return !getTarget().isEmpty();
			case CardsPackage.CARD__DESCRIPTION:
				return !getDescription().isEmpty();
			case CardsPackage.CARD__EXTRA_DESCRIPTION:
				return !getExtraDescription().isEmpty();
			case CardsPackage.CARD__VARIABLE:
				return !getVariable().isEmpty();
			case CardsPackage.CARD__VARIABLE2:
				return !getVariable2().isEmpty();
			case CardsPackage.CARD__VARIABLE3:
				return !getVariable3().isEmpty();
			case CardsPackage.CARD__VARIABLE4:
				return !getVariable4().isEmpty();
			case CardsPackage.CARD__VARIABLE5:
				return !getVariable5().isEmpty();
			case CardsPackage.CARD__VARIABLE6:
				return !getVariable6().isEmpty();
			case CardsPackage.CARD__VARIABLE7:
				return !getVariable7().isEmpty();
			case CardsPackage.CARD__PLAYABILITY_CONDITION:
				return !getPlayabilityCondition().isEmpty();
			case CardsPackage.CARD__ATTACK_CONDITION:
				return !getAttackCondition().isEmpty();
			case CardsPackage.CARD__TRIGGER:
				return !getTrigger().isEmpty();
			case CardsPackage.CARD__ADDITIONAL_COST:
				return !getAdditionalCost().isEmpty();
			case CardsPackage.CARD__ATTACK:
				return isSetAttack();
			case CardsPackage.CARD__COST:
				return isSetCost();
			case CardsPackage.CARD__DESTINY_LEVEL:
				return isSetDestinyLevel();
			case CardsPackage.CARD__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
			case CardsPackage.CARD__FACTION:
				return FACTION_EDEFAULT == null ? faction != null : !FACTION_EDEFAULT.equals(faction);
			case CardsPackage.CARD__HP:
				return isSetHP();
			case CardsPackage.CARD__ID:
				return isSetID();
			case CardsPackage.CARD__MAGIC_LEVEL:
				return isSetMagicLevel();
			case CardsPackage.CARD__MIGHT_LEVEL:
				return isSetMightLevel();
			case CardsPackage.CARD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CardsPackage.CARD__NOT_LOCALIZED:
				return NOT_LOCALIZED_EDEFAULT == null ? notLocalized != null : !NOT_LOCALIZED_EDEFAULT.equals(notLocalized);
			case CardsPackage.CARD__RACE:
				return RACE_EDEFAULT == null ? race != null : !RACE_EDEFAULT.equals(race);
			case CardsPackage.CARD__RARITY:
				return RARITY_EDEFAULT == null ? rarity != null : !RARITY_EDEFAULT.equals(rarity);
			case CardsPackage.CARD__RESOURCE_NAME:
				return RESOURCE_NAME_EDEFAULT == null ? resourceName != null : !RESOURCE_NAME_EDEFAULT.equals(resourceName);
			case CardsPackage.CARD__RETALIATE:
				return isSetRetaliate();
			case CardsPackage.CARD__SCHOOL1:
				return SCHOOL1_EDEFAULT == null ? school1 != null : !SCHOOL1_EDEFAULT.equals(school1);
			case CardsPackage.CARD__SCHOOLS_ALIGNED:
				return SCHOOLS_ALIGNED_EDEFAULT == null ? schoolsAligned != null : !SCHOOLS_ALIGNED_EDEFAULT.equals(schoolsAligned);
			case CardsPackage.CARD__SUB_TYPE:
				return SUB_TYPE_EDEFAULT == null ? subType != null : !SUB_TYPE_EDEFAULT.equals(subType);
			case CardsPackage.CARD__TOKEN:
				return TOKEN_EDEFAULT == null ? token != null : !TOKEN_EDEFAULT.equals(token);
			case CardsPackage.CARD__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case CardsPackage.CARD__UNIQUE:
				return UNIQUE_EDEFAULT == null ? unique != null : !UNIQUE_EDEFAULT.equals(unique);
			case CardsPackage.CARD__ZONE:
				return ZONE_EDEFAULT == null ? zone != null : !ZONE_EDEFAULT.equals(zone);
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(", attack: ");
		if (attackESet) result.append(attack); else result.append("<unset>");
		result.append(", cost: ");
		if (costESet) result.append(cost); else result.append("<unset>");
		result.append(", destinyLevel: ");
		if (destinyLevelESet) result.append(destinyLevel); else result.append("<unset>");
		result.append(", displayName: ");
		result.append(displayName);
		result.append(", faction: ");
		result.append(faction);
		result.append(", hP: ");
		if (hPESet) result.append(hP); else result.append("<unset>");
		result.append(", iD: ");
		if (iDESet) result.append(iD); else result.append("<unset>");
		result.append(", magicLevel: ");
		if (magicLevelESet) result.append(magicLevel); else result.append("<unset>");
		result.append(", mightLevel: ");
		if (mightLevelESet) result.append(mightLevel); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", notLocalized: ");
		result.append(notLocalized);
		result.append(", race: ");
		result.append(race);
		result.append(", rarity: ");
		result.append(rarity);
		result.append(", resourceName: ");
		result.append(resourceName);
		result.append(", retaliate: ");
		if (retaliateESet) result.append(retaliate); else result.append("<unset>");
		result.append(", school1: ");
		result.append(school1);
		result.append(", schoolsAligned: ");
		result.append(schoolsAligned);
		result.append(", subType: ");
		result.append(subType);
		result.append(", token: ");
		result.append(token);
		result.append(", type: ");
		result.append(type);
		result.append(", unique: ");
		result.append(unique);
		result.append(", zone: ");
		result.append(zone);
		result.append(')');
		return result.toString();
	}

} //CardImpl
