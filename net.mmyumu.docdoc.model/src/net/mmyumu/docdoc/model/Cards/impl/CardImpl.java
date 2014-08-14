/**
 */
package net.mmyumu.docdoc.model.Cards.impl;

import java.util.Collection;

import net.mmyumu.docdoc.model.Cards.Card;
import net.mmyumu.docdoc.model.Cards.CardsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Card</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardImpl#getSchool <em>School</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardImpl#getOngoing <em>Ongoing</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardImpl#getDestinyLevel <em>Destiny Level</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardImpl#getFaction <em>Faction</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardImpl#getHP <em>HP</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardImpl#getID <em>ID</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardImpl#getMagicLevel <em>Magic Level</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardImpl#getMightLevel <em>Might Level</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardImpl#getRarity <em>Rarity</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CardImpl extends MinimalEObjectImpl.Container implements Card {
	/**
	 * The cached value of the '{@link #getSchool() <em>School</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchool()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> school;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOngoing() <em>Ongoing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOngoing()
	 * @generated
	 * @ordered
	 */
	protected EObject ongoing;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<EObject> target;

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
	public EList<EObject> getSchool() {
		if (school == null) {
			school = new EObjectContainmentEList<EObject>(EObject.class, this, CardsPackage.CARD__SCHOOL);
		}
		return school;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getOngoing() {
		return ongoing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOngoing(EObject newOngoing, NotificationChain msgs) {
		EObject oldOngoing = ongoing;
		ongoing = newOngoing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CardsPackage.CARD__ONGOING, oldOngoing, newOngoing);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOngoing(EObject newOngoing) {
		if (newOngoing != ongoing) {
			NotificationChain msgs = null;
			if (ongoing != null)
				msgs = ((InternalEObject)ongoing).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CardsPackage.CARD__ONGOING, null, msgs);
			if (newOngoing != null)
				msgs = ((InternalEObject)newOngoing).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CardsPackage.CARD__ONGOING, null, msgs);
			msgs = basicSetOngoing(newOngoing, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD__ONGOING, newOngoing, newOngoing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EObject> getTarget() {
		if (target == null) {
			target = new EObjectContainmentEList<EObject>(EObject.class, this, CardsPackage.CARD__TARGET);
		}
		return target;
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CardsPackage.CARD__SCHOOL:
				return ((InternalEList<?>)getSchool()).basicRemove(otherEnd, msgs);
			case CardsPackage.CARD__ONGOING:
				return basicSetOngoing(null, msgs);
			case CardsPackage.CARD__TARGET:
				return ((InternalEList<?>)getTarget()).basicRemove(otherEnd, msgs);
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
			case CardsPackage.CARD__SCHOOL:
				return getSchool();
			case CardsPackage.CARD__DESCRIPTION:
				return getDescription();
			case CardsPackage.CARD__ONGOING:
				return getOngoing();
			case CardsPackage.CARD__TARGET:
				return getTarget();
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
			case CardsPackage.CARD__RARITY:
				return getRarity();
			case CardsPackage.CARD__TYPE:
				return getType();
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
			case CardsPackage.CARD__SCHOOL:
				getSchool().clear();
				getSchool().addAll((Collection<? extends EObject>)newValue);
				return;
			case CardsPackage.CARD__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CardsPackage.CARD__ONGOING:
				setOngoing((EObject)newValue);
				return;
			case CardsPackage.CARD__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends EObject>)newValue);
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
			case CardsPackage.CARD__RARITY:
				setRarity((String)newValue);
				return;
			case CardsPackage.CARD__TYPE:
				setType((String)newValue);
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
			case CardsPackage.CARD__SCHOOL:
				getSchool().clear();
				return;
			case CardsPackage.CARD__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CardsPackage.CARD__ONGOING:
				setOngoing((EObject)null);
				return;
			case CardsPackage.CARD__TARGET:
				getTarget().clear();
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
			case CardsPackage.CARD__RARITY:
				setRarity(RARITY_EDEFAULT);
				return;
			case CardsPackage.CARD__TYPE:
				setType(TYPE_EDEFAULT);
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
			case CardsPackage.CARD__SCHOOL:
				return school != null && !school.isEmpty();
			case CardsPackage.CARD__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CardsPackage.CARD__ONGOING:
				return ongoing != null;
			case CardsPackage.CARD__TARGET:
				return target != null && !target.isEmpty();
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
			case CardsPackage.CARD__RARITY:
				return RARITY_EDEFAULT == null ? rarity != null : !RARITY_EDEFAULT.equals(rarity);
			case CardsPackage.CARD__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
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
		result.append(" (description: ");
		result.append(description);
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
		result.append(", rarity: ");
		result.append(rarity);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //CardImpl
