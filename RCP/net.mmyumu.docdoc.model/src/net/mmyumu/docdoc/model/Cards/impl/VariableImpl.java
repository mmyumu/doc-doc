/**
 */
package net.mmyumu.docdoc.model.Cards.impl;

import net.mmyumu.docdoc.model.Cards.CardFilter;
import net.mmyumu.docdoc.model.Cards.CardsPackage;
import net.mmyumu.docdoc.model.Cards.Target;
import net.mmyumu.docdoc.model.Cards.Variable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.VariableImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.VariableImpl#getCardFilter <em>Card Filter</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.VariableImpl#getAbility <em>Ability</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.VariableImpl#getCounterType <em>Counter Type</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.VariableImpl#getFromTrigger <em>From Trigger</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.VariableImpl#getIncludeSchool <em>Include School</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.VariableImpl#getLevelType <em>Level Type</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.VariableImpl#getMustBeTargetable <em>Must Be Targetable</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.VariableImpl#getSide <em>Side</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.VariableImpl#getType <em>Type</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.VariableImpl#getUnitType <em>Unit Type</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.VariableImpl#getUseCurrentTarget <em>Use Current Target</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.VariableImpl#getUseLastTarget <em>Use Last Target</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.VariableImpl#getUseParent <em>Use Parent</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.VariableImpl#getValueModifier <em>Value Modifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableImpl extends MinimalEObjectImpl.Container implements Variable {
	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Target target;

	/**
	 * The cached value of the '{@link #getCardFilter() <em>Card Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardFilter()
	 * @generated
	 * @ordered
	 */
	protected CardFilter cardFilter;

	/**
	 * The default value of the '{@link #getAbility() <em>Ability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbility()
	 * @generated
	 * @ordered
	 */
	protected static final String ABILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbility() <em>Ability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbility()
	 * @generated
	 * @ordered
	 */
	protected String ability = ABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCounterType() <em>Counter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounterType()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTER_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCounterType() <em>Counter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounterType()
	 * @generated
	 * @ordered
	 */
	protected String counterType = COUNTER_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFromTrigger() <em>From Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromTrigger()
	 * @generated
	 * @ordered
	 */
	protected static final String FROM_TRIGGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFromTrigger() <em>From Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromTrigger()
	 * @generated
	 * @ordered
	 */
	protected String fromTrigger = FROM_TRIGGER_EDEFAULT;

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
	 * The default value of the '{@link #getMustBeTargetable() <em>Must Be Targetable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMustBeTargetable()
	 * @generated
	 * @ordered
	 */
	protected static final String MUST_BE_TARGETABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMustBeTargetable() <em>Must Be Targetable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMustBeTargetable()
	 * @generated
	 * @ordered
	 */
	protected String mustBeTargetable = MUST_BE_TARGETABLE_EDEFAULT;

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
	 * The default value of the '{@link #getUnitType() <em>Unit Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitType()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnitType() <em>Unit Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitType()
	 * @generated
	 * @ordered
	 */
	protected String unitType = UNIT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseCurrentTarget() <em>Use Current Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseCurrentTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String USE_CURRENT_TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUseCurrentTarget() <em>Use Current Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseCurrentTarget()
	 * @generated
	 * @ordered
	 */
	protected String useCurrentTarget = USE_CURRENT_TARGET_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseLastTarget() <em>Use Last Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseLastTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String USE_LAST_TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUseLastTarget() <em>Use Last Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseLastTarget()
	 * @generated
	 * @ordered
	 */
	protected String useLastTarget = USE_LAST_TARGET_EDEFAULT;

	/**
	 * The default value of the '{@link #getUseParent() <em>Use Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseParent()
	 * @generated
	 * @ordered
	 */
	protected static final String USE_PARENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUseParent() <em>Use Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseParent()
	 * @generated
	 * @ordered
	 */
	protected String useParent = USE_PARENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueModifier() <em>Value Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueModifier()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_MODIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueModifier() <em>Value Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueModifier()
	 * @generated
	 * @ordered
	 */
	protected String valueModifier = VALUE_MODIFIER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CardsPackage.Literals.VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Target getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Target newTarget, NotificationChain msgs) {
		Target oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CardsPackage.VARIABLE__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Target newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CardsPackage.VARIABLE__TARGET, null, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CardsPackage.VARIABLE__TARGET, null, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.VARIABLE__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardFilter getCardFilter() {
		return cardFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCardFilter(CardFilter newCardFilter, NotificationChain msgs) {
		CardFilter oldCardFilter = cardFilter;
		cardFilter = newCardFilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CardsPackage.VARIABLE__CARD_FILTER, oldCardFilter, newCardFilter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardFilter(CardFilter newCardFilter) {
		if (newCardFilter != cardFilter) {
			NotificationChain msgs = null;
			if (cardFilter != null)
				msgs = ((InternalEObject)cardFilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CardsPackage.VARIABLE__CARD_FILTER, null, msgs);
			if (newCardFilter != null)
				msgs = ((InternalEObject)newCardFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CardsPackage.VARIABLE__CARD_FILTER, null, msgs);
			msgs = basicSetCardFilter(newCardFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.VARIABLE__CARD_FILTER, newCardFilter, newCardFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAbility() {
		return ability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbility(String newAbility) {
		String oldAbility = ability;
		ability = newAbility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.VARIABLE__ABILITY, oldAbility, ability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCounterType() {
		return counterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCounterType(String newCounterType) {
		String oldCounterType = counterType;
		counterType = newCounterType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.VARIABLE__COUNTER_TYPE, oldCounterType, counterType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFromTrigger() {
		return fromTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromTrigger(String newFromTrigger) {
		String oldFromTrigger = fromTrigger;
		fromTrigger = newFromTrigger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.VARIABLE__FROM_TRIGGER, oldFromTrigger, fromTrigger));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.VARIABLE__INCLUDE_SCHOOL, oldIncludeSchool, includeSchool));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.VARIABLE__LEVEL_TYPE, oldLevelType, levelType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMustBeTargetable() {
		return mustBeTargetable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMustBeTargetable(String newMustBeTargetable) {
		String oldMustBeTargetable = mustBeTargetable;
		mustBeTargetable = newMustBeTargetable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.VARIABLE__MUST_BE_TARGETABLE, oldMustBeTargetable, mustBeTargetable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.VARIABLE__SIDE, oldSide, side));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.VARIABLE__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnitType() {
		return unitType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnitType(String newUnitType) {
		String oldUnitType = unitType;
		unitType = newUnitType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.VARIABLE__UNIT_TYPE, oldUnitType, unitType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUseCurrentTarget() {
		return useCurrentTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseCurrentTarget(String newUseCurrentTarget) {
		String oldUseCurrentTarget = useCurrentTarget;
		useCurrentTarget = newUseCurrentTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.VARIABLE__USE_CURRENT_TARGET, oldUseCurrentTarget, useCurrentTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUseLastTarget() {
		return useLastTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseLastTarget(String newUseLastTarget) {
		String oldUseLastTarget = useLastTarget;
		useLastTarget = newUseLastTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.VARIABLE__USE_LAST_TARGET, oldUseLastTarget, useLastTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUseParent() {
		return useParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseParent(String newUseParent) {
		String oldUseParent = useParent;
		useParent = newUseParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.VARIABLE__USE_PARENT, oldUseParent, useParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueModifier() {
		return valueModifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueModifier(String newValueModifier) {
		String oldValueModifier = valueModifier;
		valueModifier = newValueModifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.VARIABLE__VALUE_MODIFIER, oldValueModifier, valueModifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CardsPackage.VARIABLE__TARGET:
				return basicSetTarget(null, msgs);
			case CardsPackage.VARIABLE__CARD_FILTER:
				return basicSetCardFilter(null, msgs);
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
			case CardsPackage.VARIABLE__TARGET:
				return getTarget();
			case CardsPackage.VARIABLE__CARD_FILTER:
				return getCardFilter();
			case CardsPackage.VARIABLE__ABILITY:
				return getAbility();
			case CardsPackage.VARIABLE__COUNTER_TYPE:
				return getCounterType();
			case CardsPackage.VARIABLE__FROM_TRIGGER:
				return getFromTrigger();
			case CardsPackage.VARIABLE__INCLUDE_SCHOOL:
				return getIncludeSchool();
			case CardsPackage.VARIABLE__LEVEL_TYPE:
				return getLevelType();
			case CardsPackage.VARIABLE__MUST_BE_TARGETABLE:
				return getMustBeTargetable();
			case CardsPackage.VARIABLE__SIDE:
				return getSide();
			case CardsPackage.VARIABLE__TYPE:
				return getType();
			case CardsPackage.VARIABLE__UNIT_TYPE:
				return getUnitType();
			case CardsPackage.VARIABLE__USE_CURRENT_TARGET:
				return getUseCurrentTarget();
			case CardsPackage.VARIABLE__USE_LAST_TARGET:
				return getUseLastTarget();
			case CardsPackage.VARIABLE__USE_PARENT:
				return getUseParent();
			case CardsPackage.VARIABLE__VALUE_MODIFIER:
				return getValueModifier();
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
			case CardsPackage.VARIABLE__TARGET:
				setTarget((Target)newValue);
				return;
			case CardsPackage.VARIABLE__CARD_FILTER:
				setCardFilter((CardFilter)newValue);
				return;
			case CardsPackage.VARIABLE__ABILITY:
				setAbility((String)newValue);
				return;
			case CardsPackage.VARIABLE__COUNTER_TYPE:
				setCounterType((String)newValue);
				return;
			case CardsPackage.VARIABLE__FROM_TRIGGER:
				setFromTrigger((String)newValue);
				return;
			case CardsPackage.VARIABLE__INCLUDE_SCHOOL:
				setIncludeSchool((String)newValue);
				return;
			case CardsPackage.VARIABLE__LEVEL_TYPE:
				setLevelType((String)newValue);
				return;
			case CardsPackage.VARIABLE__MUST_BE_TARGETABLE:
				setMustBeTargetable((String)newValue);
				return;
			case CardsPackage.VARIABLE__SIDE:
				setSide((String)newValue);
				return;
			case CardsPackage.VARIABLE__TYPE:
				setType((String)newValue);
				return;
			case CardsPackage.VARIABLE__UNIT_TYPE:
				setUnitType((String)newValue);
				return;
			case CardsPackage.VARIABLE__USE_CURRENT_TARGET:
				setUseCurrentTarget((String)newValue);
				return;
			case CardsPackage.VARIABLE__USE_LAST_TARGET:
				setUseLastTarget((String)newValue);
				return;
			case CardsPackage.VARIABLE__USE_PARENT:
				setUseParent((String)newValue);
				return;
			case CardsPackage.VARIABLE__VALUE_MODIFIER:
				setValueModifier((String)newValue);
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
			case CardsPackage.VARIABLE__TARGET:
				setTarget((Target)null);
				return;
			case CardsPackage.VARIABLE__CARD_FILTER:
				setCardFilter((CardFilter)null);
				return;
			case CardsPackage.VARIABLE__ABILITY:
				setAbility(ABILITY_EDEFAULT);
				return;
			case CardsPackage.VARIABLE__COUNTER_TYPE:
				setCounterType(COUNTER_TYPE_EDEFAULT);
				return;
			case CardsPackage.VARIABLE__FROM_TRIGGER:
				setFromTrigger(FROM_TRIGGER_EDEFAULT);
				return;
			case CardsPackage.VARIABLE__INCLUDE_SCHOOL:
				setIncludeSchool(INCLUDE_SCHOOL_EDEFAULT);
				return;
			case CardsPackage.VARIABLE__LEVEL_TYPE:
				setLevelType(LEVEL_TYPE_EDEFAULT);
				return;
			case CardsPackage.VARIABLE__MUST_BE_TARGETABLE:
				setMustBeTargetable(MUST_BE_TARGETABLE_EDEFAULT);
				return;
			case CardsPackage.VARIABLE__SIDE:
				setSide(SIDE_EDEFAULT);
				return;
			case CardsPackage.VARIABLE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case CardsPackage.VARIABLE__UNIT_TYPE:
				setUnitType(UNIT_TYPE_EDEFAULT);
				return;
			case CardsPackage.VARIABLE__USE_CURRENT_TARGET:
				setUseCurrentTarget(USE_CURRENT_TARGET_EDEFAULT);
				return;
			case CardsPackage.VARIABLE__USE_LAST_TARGET:
				setUseLastTarget(USE_LAST_TARGET_EDEFAULT);
				return;
			case CardsPackage.VARIABLE__USE_PARENT:
				setUseParent(USE_PARENT_EDEFAULT);
				return;
			case CardsPackage.VARIABLE__VALUE_MODIFIER:
				setValueModifier(VALUE_MODIFIER_EDEFAULT);
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
			case CardsPackage.VARIABLE__TARGET:
				return target != null;
			case CardsPackage.VARIABLE__CARD_FILTER:
				return cardFilter != null;
			case CardsPackage.VARIABLE__ABILITY:
				return ABILITY_EDEFAULT == null ? ability != null : !ABILITY_EDEFAULT.equals(ability);
			case CardsPackage.VARIABLE__COUNTER_TYPE:
				return COUNTER_TYPE_EDEFAULT == null ? counterType != null : !COUNTER_TYPE_EDEFAULT.equals(counterType);
			case CardsPackage.VARIABLE__FROM_TRIGGER:
				return FROM_TRIGGER_EDEFAULT == null ? fromTrigger != null : !FROM_TRIGGER_EDEFAULT.equals(fromTrigger);
			case CardsPackage.VARIABLE__INCLUDE_SCHOOL:
				return INCLUDE_SCHOOL_EDEFAULT == null ? includeSchool != null : !INCLUDE_SCHOOL_EDEFAULT.equals(includeSchool);
			case CardsPackage.VARIABLE__LEVEL_TYPE:
				return LEVEL_TYPE_EDEFAULT == null ? levelType != null : !LEVEL_TYPE_EDEFAULT.equals(levelType);
			case CardsPackage.VARIABLE__MUST_BE_TARGETABLE:
				return MUST_BE_TARGETABLE_EDEFAULT == null ? mustBeTargetable != null : !MUST_BE_TARGETABLE_EDEFAULT.equals(mustBeTargetable);
			case CardsPackage.VARIABLE__SIDE:
				return SIDE_EDEFAULT == null ? side != null : !SIDE_EDEFAULT.equals(side);
			case CardsPackage.VARIABLE__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case CardsPackage.VARIABLE__UNIT_TYPE:
				return UNIT_TYPE_EDEFAULT == null ? unitType != null : !UNIT_TYPE_EDEFAULT.equals(unitType);
			case CardsPackage.VARIABLE__USE_CURRENT_TARGET:
				return USE_CURRENT_TARGET_EDEFAULT == null ? useCurrentTarget != null : !USE_CURRENT_TARGET_EDEFAULT.equals(useCurrentTarget);
			case CardsPackage.VARIABLE__USE_LAST_TARGET:
				return USE_LAST_TARGET_EDEFAULT == null ? useLastTarget != null : !USE_LAST_TARGET_EDEFAULT.equals(useLastTarget);
			case CardsPackage.VARIABLE__USE_PARENT:
				return USE_PARENT_EDEFAULT == null ? useParent != null : !USE_PARENT_EDEFAULT.equals(useParent);
			case CardsPackage.VARIABLE__VALUE_MODIFIER:
				return VALUE_MODIFIER_EDEFAULT == null ? valueModifier != null : !VALUE_MODIFIER_EDEFAULT.equals(valueModifier);
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
		result.append(" (ability: ");
		result.append(ability);
		result.append(", counterType: ");
		result.append(counterType);
		result.append(", fromTrigger: ");
		result.append(fromTrigger);
		result.append(", includeSchool: ");
		result.append(includeSchool);
		result.append(", levelType: ");
		result.append(levelType);
		result.append(", mustBeTargetable: ");
		result.append(mustBeTargetable);
		result.append(", side: ");
		result.append(side);
		result.append(", type: ");
		result.append(type);
		result.append(", unitType: ");
		result.append(unitType);
		result.append(", useCurrentTarget: ");
		result.append(useCurrentTarget);
		result.append(", useLastTarget: ");
		result.append(useLastTarget);
		result.append(", useParent: ");
		result.append(useParent);
		result.append(", valueModifier: ");
		result.append(valueModifier);
		result.append(')');
		return result.toString();
	}

} //VariableImpl
