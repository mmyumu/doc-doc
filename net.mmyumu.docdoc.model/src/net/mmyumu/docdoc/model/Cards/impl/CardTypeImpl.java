/**
 */
package net.mmyumu.docdoc.model.Cards.impl;

import net.mmyumu.docdoc.model.Cards.CardType;
import net.mmyumu.docdoc.model.Cards.CardsPackage;
import net.mmyumu.docdoc.model.Cards.PlayabilityConditionType;
import net.mmyumu.docdoc.model.Cards.TargetType;
import net.mmyumu.docdoc.model.Cards.VariableType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Card Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardTypeImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardTypeImpl#getPlayabilityCondition <em>Playability Condition</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardTypeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardTypeImpl#getCost <em>Cost</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardTypeImpl#getDestinyLevel <em>Destiny Level</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardTypeImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardTypeImpl#getFaction <em>Faction</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardTypeImpl#getID <em>ID</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardTypeImpl#getRarity <em>Rarity</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardTypeImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CardTypeImpl extends MinimalEObjectImpl.Container implements CardType {
	/**
	 * The cached value of the '{@link #getVariable() <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariable()
	 * @generated
	 * @ordered
	 */
	protected VariableType variable;

	/**
	 * The cached value of the '{@link #getPlayabilityCondition() <em>Playability Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayabilityCondition()
	 * @generated
	 * @ordered
	 */
	protected PlayabilityConditionType playabilityCondition;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected TargetType target;

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
	protected CardTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CardsPackage.Literals.CARD_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableType getVariable() {
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariable(VariableType newVariable, NotificationChain msgs) {
		VariableType oldVariable = variable;
		variable = newVariable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CardsPackage.CARD_TYPE__VARIABLE, oldVariable, newVariable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariable(VariableType newVariable) {
		if (newVariable != variable) {
			NotificationChain msgs = null;
			if (variable != null)
				msgs = ((InternalEObject)variable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CardsPackage.CARD_TYPE__VARIABLE, null, msgs);
			if (newVariable != null)
				msgs = ((InternalEObject)newVariable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CardsPackage.CARD_TYPE__VARIABLE, null, msgs);
			msgs = basicSetVariable(newVariable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD_TYPE__VARIABLE, newVariable, newVariable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlayabilityConditionType getPlayabilityCondition() {
		return playabilityCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPlayabilityCondition(PlayabilityConditionType newPlayabilityCondition, NotificationChain msgs) {
		PlayabilityConditionType oldPlayabilityCondition = playabilityCondition;
		playabilityCondition = newPlayabilityCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CardsPackage.CARD_TYPE__PLAYABILITY_CONDITION, oldPlayabilityCondition, newPlayabilityCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlayabilityCondition(PlayabilityConditionType newPlayabilityCondition) {
		if (newPlayabilityCondition != playabilityCondition) {
			NotificationChain msgs = null;
			if (playabilityCondition != null)
				msgs = ((InternalEObject)playabilityCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CardsPackage.CARD_TYPE__PLAYABILITY_CONDITION, null, msgs);
			if (newPlayabilityCondition != null)
				msgs = ((InternalEObject)newPlayabilityCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CardsPackage.CARD_TYPE__PLAYABILITY_CONDITION, null, msgs);
			msgs = basicSetPlayabilityCondition(newPlayabilityCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD_TYPE__PLAYABILITY_CONDITION, newPlayabilityCondition, newPlayabilityCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetType getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(TargetType newTarget, NotificationChain msgs) {
		TargetType oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CardsPackage.CARD_TYPE__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(TargetType newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CardsPackage.CARD_TYPE__TARGET, null, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CardsPackage.CARD_TYPE__TARGET, null, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD_TYPE__TARGET, newTarget, newTarget));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD_TYPE__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD_TYPE__COST, oldCost, cost, !oldCostESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, CardsPackage.CARD_TYPE__COST, oldCost, COST_EDEFAULT, oldCostESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD_TYPE__DESTINY_LEVEL, oldDestinyLevel, destinyLevel, !oldDestinyLevelESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, CardsPackage.CARD_TYPE__DESTINY_LEVEL, oldDestinyLevel, DESTINY_LEVEL_EDEFAULT, oldDestinyLevelESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD_TYPE__DISPLAY_NAME, oldDisplayName, displayName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD_TYPE__FACTION, oldFaction, faction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD_TYPE__ID, oldID, iD, !oldIDESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, CardsPackage.CARD_TYPE__ID, oldID, ID_EDEFAULT, oldIDESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD_TYPE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD_TYPE__RARITY, oldRarity, rarity));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD_TYPE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CardsPackage.CARD_TYPE__VARIABLE:
				return basicSetVariable(null, msgs);
			case CardsPackage.CARD_TYPE__PLAYABILITY_CONDITION:
				return basicSetPlayabilityCondition(null, msgs);
			case CardsPackage.CARD_TYPE__TARGET:
				return basicSetTarget(null, msgs);
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
			case CardsPackage.CARD_TYPE__VARIABLE:
				return getVariable();
			case CardsPackage.CARD_TYPE__PLAYABILITY_CONDITION:
				return getPlayabilityCondition();
			case CardsPackage.CARD_TYPE__TARGET:
				return getTarget();
			case CardsPackage.CARD_TYPE__DESCRIPTION:
				return getDescription();
			case CardsPackage.CARD_TYPE__COST:
				return getCost();
			case CardsPackage.CARD_TYPE__DESTINY_LEVEL:
				return getDestinyLevel();
			case CardsPackage.CARD_TYPE__DISPLAY_NAME:
				return getDisplayName();
			case CardsPackage.CARD_TYPE__FACTION:
				return getFaction();
			case CardsPackage.CARD_TYPE__ID:
				return getID();
			case CardsPackage.CARD_TYPE__NAME:
				return getName();
			case CardsPackage.CARD_TYPE__RARITY:
				return getRarity();
			case CardsPackage.CARD_TYPE__TYPE:
				return getType();
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
			case CardsPackage.CARD_TYPE__VARIABLE:
				setVariable((VariableType)newValue);
				return;
			case CardsPackage.CARD_TYPE__PLAYABILITY_CONDITION:
				setPlayabilityCondition((PlayabilityConditionType)newValue);
				return;
			case CardsPackage.CARD_TYPE__TARGET:
				setTarget((TargetType)newValue);
				return;
			case CardsPackage.CARD_TYPE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CardsPackage.CARD_TYPE__COST:
				setCost((Integer)newValue);
				return;
			case CardsPackage.CARD_TYPE__DESTINY_LEVEL:
				setDestinyLevel((Integer)newValue);
				return;
			case CardsPackage.CARD_TYPE__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case CardsPackage.CARD_TYPE__FACTION:
				setFaction((String)newValue);
				return;
			case CardsPackage.CARD_TYPE__ID:
				setID((Integer)newValue);
				return;
			case CardsPackage.CARD_TYPE__NAME:
				setName((String)newValue);
				return;
			case CardsPackage.CARD_TYPE__RARITY:
				setRarity((String)newValue);
				return;
			case CardsPackage.CARD_TYPE__TYPE:
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
			case CardsPackage.CARD_TYPE__VARIABLE:
				setVariable((VariableType)null);
				return;
			case CardsPackage.CARD_TYPE__PLAYABILITY_CONDITION:
				setPlayabilityCondition((PlayabilityConditionType)null);
				return;
			case CardsPackage.CARD_TYPE__TARGET:
				setTarget((TargetType)null);
				return;
			case CardsPackage.CARD_TYPE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CardsPackage.CARD_TYPE__COST:
				unsetCost();
				return;
			case CardsPackage.CARD_TYPE__DESTINY_LEVEL:
				unsetDestinyLevel();
				return;
			case CardsPackage.CARD_TYPE__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case CardsPackage.CARD_TYPE__FACTION:
				setFaction(FACTION_EDEFAULT);
				return;
			case CardsPackage.CARD_TYPE__ID:
				unsetID();
				return;
			case CardsPackage.CARD_TYPE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CardsPackage.CARD_TYPE__RARITY:
				setRarity(RARITY_EDEFAULT);
				return;
			case CardsPackage.CARD_TYPE__TYPE:
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
			case CardsPackage.CARD_TYPE__VARIABLE:
				return variable != null;
			case CardsPackage.CARD_TYPE__PLAYABILITY_CONDITION:
				return playabilityCondition != null;
			case CardsPackage.CARD_TYPE__TARGET:
				return target != null;
			case CardsPackage.CARD_TYPE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CardsPackage.CARD_TYPE__COST:
				return isSetCost();
			case CardsPackage.CARD_TYPE__DESTINY_LEVEL:
				return isSetDestinyLevel();
			case CardsPackage.CARD_TYPE__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
			case CardsPackage.CARD_TYPE__FACTION:
				return FACTION_EDEFAULT == null ? faction != null : !FACTION_EDEFAULT.equals(faction);
			case CardsPackage.CARD_TYPE__ID:
				return isSetID();
			case CardsPackage.CARD_TYPE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CardsPackage.CARD_TYPE__RARITY:
				return RARITY_EDEFAULT == null ? rarity != null : !RARITY_EDEFAULT.equals(rarity);
			case CardsPackage.CARD_TYPE__TYPE:
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
		result.append(", cost: ");
		if (costESet) result.append(cost); else result.append("<unset>");
		result.append(", destinyLevel: ");
		if (destinyLevelESet) result.append(destinyLevel); else result.append("<unset>");
		result.append(", displayName: ");
		result.append(displayName);
		result.append(", faction: ");
		result.append(faction);
		result.append(", iD: ");
		if (iDESet) result.append(iD); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", rarity: ");
		result.append(rarity);
		result.append(", type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //CardTypeImpl
