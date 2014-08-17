/**
 */
package net.mmyumu.docdoc.model.Cards.impl;

import java.util.Collection;

import net.mmyumu.docdoc.model.Cards.CardFilter;
import net.mmyumu.docdoc.model.Cards.CardsPackage;
import net.mmyumu.docdoc.model.Cards.Condition;
import net.mmyumu.docdoc.model.Cards.Target;
import net.mmyumu.docdoc.model.Cards.Trigger;

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
 * An implementation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.TriggerImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.TriggerImpl#getCardFilter <em>Card Filter</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.TriggerImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.TriggerImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.TriggerImpl#getDamageIncludeFlags <em>Damage Include Flags</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.TriggerImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.TriggerImpl#getExecuteOncePerTransaction <em>Execute Once Per Transaction</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.TriggerImpl#getExecuteOncePerTurn <em>Execute Once Per Turn</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.TriggerImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.TriggerImpl#getSide <em>Side</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.TriggerImpl#getType <em>Type</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.TriggerImpl#getUseTriggererAsInitiator <em>Use Triggerer As Initiator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TriggerImpl extends MinimalEObjectImpl.Container implements Trigger {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The default value of the '{@link #getDamageIncludeFlags() <em>Damage Include Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDamageIncludeFlags()
	 * @generated
	 * @ordered
	 */
	protected static final String DAMAGE_INCLUDE_FLAGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDamageIncludeFlags() <em>Damage Include Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDamageIncludeFlags()
	 * @generated
	 * @ordered
	 */
	protected String damageIncludeFlags = DAMAGE_INCLUDE_FLAGS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final String DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected String duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getExecuteOncePerTransaction() <em>Execute Once Per Transaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecuteOncePerTransaction()
	 * @generated
	 * @ordered
	 */
	protected static final String EXECUTE_ONCE_PER_TRANSACTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExecuteOncePerTransaction() <em>Execute Once Per Transaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecuteOncePerTransaction()
	 * @generated
	 * @ordered
	 */
	protected String executeOncePerTransaction = EXECUTE_ONCE_PER_TRANSACTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getExecuteOncePerTurn() <em>Execute Once Per Turn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecuteOncePerTurn()
	 * @generated
	 * @ordered
	 */
	protected static final String EXECUTE_ONCE_PER_TURN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExecuteOncePerTurn() <em>Execute Once Per Turn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecuteOncePerTurn()
	 * @generated
	 * @ordered
	 */
	protected String executeOncePerTurn = EXECUTE_ONCE_PER_TURN_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected String location = LOCATION_EDEFAULT;

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
	 * The default value of the '{@link #getUseTriggererAsInitiator() <em>Use Triggerer As Initiator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseTriggererAsInitiator()
	 * @generated
	 * @ordered
	 */
	protected static final String USE_TRIGGERER_AS_INITIATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUseTriggererAsInitiator() <em>Use Triggerer As Initiator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseTriggererAsInitiator()
	 * @generated
	 * @ordered
	 */
	protected String useTriggererAsInitiator = USE_TRIGGERER_AS_INITIATOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TriggerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CardsPackage.Literals.TRIGGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, CardsPackage.TRIGGER__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CardFilter> getCardFilter() {
		return getGroup().list(CardsPackage.Literals.TRIGGER__CARD_FILTER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Target> getTarget() {
		return getGroup().list(CardsPackage.Literals.TRIGGER__TARGET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getCondition() {
		return getGroup().list(CardsPackage.Literals.TRIGGER__CONDITION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDamageIncludeFlags() {
		return damageIncludeFlags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDamageIncludeFlags(String newDamageIncludeFlags) {
		String oldDamageIncludeFlags = damageIncludeFlags;
		damageIncludeFlags = newDamageIncludeFlags;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.TRIGGER__DAMAGE_INCLUDE_FLAGS, oldDamageIncludeFlags, damageIncludeFlags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(String newDuration) {
		String oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.TRIGGER__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExecuteOncePerTransaction() {
		return executeOncePerTransaction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecuteOncePerTransaction(String newExecuteOncePerTransaction) {
		String oldExecuteOncePerTransaction = executeOncePerTransaction;
		executeOncePerTransaction = newExecuteOncePerTransaction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.TRIGGER__EXECUTE_ONCE_PER_TRANSACTION, oldExecuteOncePerTransaction, executeOncePerTransaction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExecuteOncePerTurn() {
		return executeOncePerTurn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecuteOncePerTurn(String newExecuteOncePerTurn) {
		String oldExecuteOncePerTurn = executeOncePerTurn;
		executeOncePerTurn = newExecuteOncePerTurn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.TRIGGER__EXECUTE_ONCE_PER_TURN, oldExecuteOncePerTurn, executeOncePerTurn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(String newLocation) {
		String oldLocation = location;
		location = newLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.TRIGGER__LOCATION, oldLocation, location));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.TRIGGER__SIDE, oldSide, side));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.TRIGGER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUseTriggererAsInitiator() {
		return useTriggererAsInitiator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseTriggererAsInitiator(String newUseTriggererAsInitiator) {
		String oldUseTriggererAsInitiator = useTriggererAsInitiator;
		useTriggererAsInitiator = newUseTriggererAsInitiator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.TRIGGER__USE_TRIGGERER_AS_INITIATOR, oldUseTriggererAsInitiator, useTriggererAsInitiator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CardsPackage.TRIGGER__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case CardsPackage.TRIGGER__CARD_FILTER:
				return ((InternalEList<?>)getCardFilter()).basicRemove(otherEnd, msgs);
			case CardsPackage.TRIGGER__TARGET:
				return ((InternalEList<?>)getTarget()).basicRemove(otherEnd, msgs);
			case CardsPackage.TRIGGER__CONDITION:
				return ((InternalEList<?>)getCondition()).basicRemove(otherEnd, msgs);
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
			case CardsPackage.TRIGGER__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case CardsPackage.TRIGGER__CARD_FILTER:
				return getCardFilter();
			case CardsPackage.TRIGGER__TARGET:
				return getTarget();
			case CardsPackage.TRIGGER__CONDITION:
				return getCondition();
			case CardsPackage.TRIGGER__DAMAGE_INCLUDE_FLAGS:
				return getDamageIncludeFlags();
			case CardsPackage.TRIGGER__DURATION:
				return getDuration();
			case CardsPackage.TRIGGER__EXECUTE_ONCE_PER_TRANSACTION:
				return getExecuteOncePerTransaction();
			case CardsPackage.TRIGGER__EXECUTE_ONCE_PER_TURN:
				return getExecuteOncePerTurn();
			case CardsPackage.TRIGGER__LOCATION:
				return getLocation();
			case CardsPackage.TRIGGER__SIDE:
				return getSide();
			case CardsPackage.TRIGGER__TYPE:
				return getType();
			case CardsPackage.TRIGGER__USE_TRIGGERER_AS_INITIATOR:
				return getUseTriggererAsInitiator();
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
			case CardsPackage.TRIGGER__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case CardsPackage.TRIGGER__CARD_FILTER:
				getCardFilter().clear();
				getCardFilter().addAll((Collection<? extends CardFilter>)newValue);
				return;
			case CardsPackage.TRIGGER__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends Target>)newValue);
				return;
			case CardsPackage.TRIGGER__CONDITION:
				getCondition().clear();
				getCondition().addAll((Collection<? extends Condition>)newValue);
				return;
			case CardsPackage.TRIGGER__DAMAGE_INCLUDE_FLAGS:
				setDamageIncludeFlags((String)newValue);
				return;
			case CardsPackage.TRIGGER__DURATION:
				setDuration((String)newValue);
				return;
			case CardsPackage.TRIGGER__EXECUTE_ONCE_PER_TRANSACTION:
				setExecuteOncePerTransaction((String)newValue);
				return;
			case CardsPackage.TRIGGER__EXECUTE_ONCE_PER_TURN:
				setExecuteOncePerTurn((String)newValue);
				return;
			case CardsPackage.TRIGGER__LOCATION:
				setLocation((String)newValue);
				return;
			case CardsPackage.TRIGGER__SIDE:
				setSide((String)newValue);
				return;
			case CardsPackage.TRIGGER__TYPE:
				setType((String)newValue);
				return;
			case CardsPackage.TRIGGER__USE_TRIGGERER_AS_INITIATOR:
				setUseTriggererAsInitiator((String)newValue);
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
			case CardsPackage.TRIGGER__GROUP:
				getGroup().clear();
				return;
			case CardsPackage.TRIGGER__CARD_FILTER:
				getCardFilter().clear();
				return;
			case CardsPackage.TRIGGER__TARGET:
				getTarget().clear();
				return;
			case CardsPackage.TRIGGER__CONDITION:
				getCondition().clear();
				return;
			case CardsPackage.TRIGGER__DAMAGE_INCLUDE_FLAGS:
				setDamageIncludeFlags(DAMAGE_INCLUDE_FLAGS_EDEFAULT);
				return;
			case CardsPackage.TRIGGER__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case CardsPackage.TRIGGER__EXECUTE_ONCE_PER_TRANSACTION:
				setExecuteOncePerTransaction(EXECUTE_ONCE_PER_TRANSACTION_EDEFAULT);
				return;
			case CardsPackage.TRIGGER__EXECUTE_ONCE_PER_TURN:
				setExecuteOncePerTurn(EXECUTE_ONCE_PER_TURN_EDEFAULT);
				return;
			case CardsPackage.TRIGGER__LOCATION:
				setLocation(LOCATION_EDEFAULT);
				return;
			case CardsPackage.TRIGGER__SIDE:
				setSide(SIDE_EDEFAULT);
				return;
			case CardsPackage.TRIGGER__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case CardsPackage.TRIGGER__USE_TRIGGERER_AS_INITIATOR:
				setUseTriggererAsInitiator(USE_TRIGGERER_AS_INITIATOR_EDEFAULT);
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
			case CardsPackage.TRIGGER__GROUP:
				return group != null && !group.isEmpty();
			case CardsPackage.TRIGGER__CARD_FILTER:
				return !getCardFilter().isEmpty();
			case CardsPackage.TRIGGER__TARGET:
				return !getTarget().isEmpty();
			case CardsPackage.TRIGGER__CONDITION:
				return !getCondition().isEmpty();
			case CardsPackage.TRIGGER__DAMAGE_INCLUDE_FLAGS:
				return DAMAGE_INCLUDE_FLAGS_EDEFAULT == null ? damageIncludeFlags != null : !DAMAGE_INCLUDE_FLAGS_EDEFAULT.equals(damageIncludeFlags);
			case CardsPackage.TRIGGER__DURATION:
				return DURATION_EDEFAULT == null ? duration != null : !DURATION_EDEFAULT.equals(duration);
			case CardsPackage.TRIGGER__EXECUTE_ONCE_PER_TRANSACTION:
				return EXECUTE_ONCE_PER_TRANSACTION_EDEFAULT == null ? executeOncePerTransaction != null : !EXECUTE_ONCE_PER_TRANSACTION_EDEFAULT.equals(executeOncePerTransaction);
			case CardsPackage.TRIGGER__EXECUTE_ONCE_PER_TURN:
				return EXECUTE_ONCE_PER_TURN_EDEFAULT == null ? executeOncePerTurn != null : !EXECUTE_ONCE_PER_TURN_EDEFAULT.equals(executeOncePerTurn);
			case CardsPackage.TRIGGER__LOCATION:
				return LOCATION_EDEFAULT == null ? location != null : !LOCATION_EDEFAULT.equals(location);
			case CardsPackage.TRIGGER__SIDE:
				return SIDE_EDEFAULT == null ? side != null : !SIDE_EDEFAULT.equals(side);
			case CardsPackage.TRIGGER__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case CardsPackage.TRIGGER__USE_TRIGGERER_AS_INITIATOR:
				return USE_TRIGGERER_AS_INITIATOR_EDEFAULT == null ? useTriggererAsInitiator != null : !USE_TRIGGERER_AS_INITIATOR_EDEFAULT.equals(useTriggererAsInitiator);
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
		result.append(" (group: ");
		result.append(group);
		result.append(", damageIncludeFlags: ");
		result.append(damageIncludeFlags);
		result.append(", duration: ");
		result.append(duration);
		result.append(", executeOncePerTransaction: ");
		result.append(executeOncePerTransaction);
		result.append(", executeOncePerTurn: ");
		result.append(executeOncePerTurn);
		result.append(", location: ");
		result.append(location);
		result.append(", side: ");
		result.append(side);
		result.append(", type: ");
		result.append(type);
		result.append(", useTriggererAsInitiator: ");
		result.append(useTriggererAsInitiator);
		result.append(')');
		return result.toString();
	}

} //TriggerImpl
