/**
 */
package net.mmyumu.docdoc.model.Cards.impl;

import net.mmyumu.docdoc.model.Cards.CardsPackage;
import net.mmyumu.docdoc.model.Cards.Target;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.TargetImpl#getOption <em>Option</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.TargetImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.TargetImpl#getEffect <em>Effect</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.TargetImpl#getSubgroup <em>Subgroup</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.TargetImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.TargetImpl#getSide <em>Side</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.TargetImpl#getZone <em>Zone</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TargetImpl extends MinimalEObjectImpl.Container implements Target {
	/**
	 * The cached value of the '{@link #getOption() <em>Option</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOption()
	 * @generated
	 * @ordered
	 */
	protected EObject option;

	/**
	 * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected EObject trigger;

	/**
	 * The cached value of the '{@link #getEffect() <em>Effect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEffect()
	 * @generated
	 * @ordered
	 */
	protected EObject effect;

	/**
	 * The cached value of the '{@link #getSubgroup() <em>Subgroup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubgroup()
	 * @generated
	 * @ordered
	 */
	protected EObject subgroup;

	/**
	 * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected static final String AMOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected String amount = AMOUNT_EDEFAULT;

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
	protected TargetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CardsPackage.Literals.TARGET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getOption() {
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOption(EObject newOption, NotificationChain msgs) {
		EObject oldOption = option;
		option = newOption;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CardsPackage.TARGET__OPTION, oldOption, newOption);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOption(EObject newOption) {
		if (newOption != option) {
			NotificationChain msgs = null;
			if (option != null)
				msgs = ((InternalEObject)option).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CardsPackage.TARGET__OPTION, null, msgs);
			if (newOption != null)
				msgs = ((InternalEObject)newOption).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CardsPackage.TARGET__OPTION, null, msgs);
			msgs = basicSetOption(newOption, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.TARGET__OPTION, newOption, newOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getTrigger() {
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrigger(EObject newTrigger, NotificationChain msgs) {
		EObject oldTrigger = trigger;
		trigger = newTrigger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CardsPackage.TARGET__TRIGGER, oldTrigger, newTrigger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrigger(EObject newTrigger) {
		if (newTrigger != trigger) {
			NotificationChain msgs = null;
			if (trigger != null)
				msgs = ((InternalEObject)trigger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CardsPackage.TARGET__TRIGGER, null, msgs);
			if (newTrigger != null)
				msgs = ((InternalEObject)newTrigger).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CardsPackage.TARGET__TRIGGER, null, msgs);
			msgs = basicSetTrigger(newTrigger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.TARGET__TRIGGER, newTrigger, newTrigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getEffect() {
		return effect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEffect(EObject newEffect, NotificationChain msgs) {
		EObject oldEffect = effect;
		effect = newEffect;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CardsPackage.TARGET__EFFECT, oldEffect, newEffect);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEffect(EObject newEffect) {
		if (newEffect != effect) {
			NotificationChain msgs = null;
			if (effect != null)
				msgs = ((InternalEObject)effect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CardsPackage.TARGET__EFFECT, null, msgs);
			if (newEffect != null)
				msgs = ((InternalEObject)newEffect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CardsPackage.TARGET__EFFECT, null, msgs);
			msgs = basicSetEffect(newEffect, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.TARGET__EFFECT, newEffect, newEffect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getSubgroup() {
		return subgroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubgroup(EObject newSubgroup, NotificationChain msgs) {
		EObject oldSubgroup = subgroup;
		subgroup = newSubgroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CardsPackage.TARGET__SUBGROUP, oldSubgroup, newSubgroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubgroup(EObject newSubgroup) {
		if (newSubgroup != subgroup) {
			NotificationChain msgs = null;
			if (subgroup != null)
				msgs = ((InternalEObject)subgroup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CardsPackage.TARGET__SUBGROUP, null, msgs);
			if (newSubgroup != null)
				msgs = ((InternalEObject)newSubgroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CardsPackage.TARGET__SUBGROUP, null, msgs);
			msgs = basicSetSubgroup(newSubgroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.TARGET__SUBGROUP, newSubgroup, newSubgroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmount(String newAmount) {
		String oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.TARGET__AMOUNT, oldAmount, amount));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.TARGET__SIDE, oldSide, side));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.TARGET__ZONE, oldZone, zone));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CardsPackage.TARGET__OPTION:
				return basicSetOption(null, msgs);
			case CardsPackage.TARGET__TRIGGER:
				return basicSetTrigger(null, msgs);
			case CardsPackage.TARGET__EFFECT:
				return basicSetEffect(null, msgs);
			case CardsPackage.TARGET__SUBGROUP:
				return basicSetSubgroup(null, msgs);
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
			case CardsPackage.TARGET__OPTION:
				return getOption();
			case CardsPackage.TARGET__TRIGGER:
				return getTrigger();
			case CardsPackage.TARGET__EFFECT:
				return getEffect();
			case CardsPackage.TARGET__SUBGROUP:
				return getSubgroup();
			case CardsPackage.TARGET__AMOUNT:
				return getAmount();
			case CardsPackage.TARGET__SIDE:
				return getSide();
			case CardsPackage.TARGET__ZONE:
				return getZone();
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
			case CardsPackage.TARGET__OPTION:
				setOption((EObject)newValue);
				return;
			case CardsPackage.TARGET__TRIGGER:
				setTrigger((EObject)newValue);
				return;
			case CardsPackage.TARGET__EFFECT:
				setEffect((EObject)newValue);
				return;
			case CardsPackage.TARGET__SUBGROUP:
				setSubgroup((EObject)newValue);
				return;
			case CardsPackage.TARGET__AMOUNT:
				setAmount((String)newValue);
				return;
			case CardsPackage.TARGET__SIDE:
				setSide((String)newValue);
				return;
			case CardsPackage.TARGET__ZONE:
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
			case CardsPackage.TARGET__OPTION:
				setOption((EObject)null);
				return;
			case CardsPackage.TARGET__TRIGGER:
				setTrigger((EObject)null);
				return;
			case CardsPackage.TARGET__EFFECT:
				setEffect((EObject)null);
				return;
			case CardsPackage.TARGET__SUBGROUP:
				setSubgroup((EObject)null);
				return;
			case CardsPackage.TARGET__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case CardsPackage.TARGET__SIDE:
				setSide(SIDE_EDEFAULT);
				return;
			case CardsPackage.TARGET__ZONE:
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
			case CardsPackage.TARGET__OPTION:
				return option != null;
			case CardsPackage.TARGET__TRIGGER:
				return trigger != null;
			case CardsPackage.TARGET__EFFECT:
				return effect != null;
			case CardsPackage.TARGET__SUBGROUP:
				return subgroup != null;
			case CardsPackage.TARGET__AMOUNT:
				return AMOUNT_EDEFAULT == null ? amount != null : !AMOUNT_EDEFAULT.equals(amount);
			case CardsPackage.TARGET__SIDE:
				return SIDE_EDEFAULT == null ? side != null : !SIDE_EDEFAULT.equals(side);
			case CardsPackage.TARGET__ZONE:
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
		result.append(" (amount: ");
		result.append(amount);
		result.append(", side: ");
		result.append(side);
		result.append(", zone: ");
		result.append(zone);
		result.append(')');
		return result.toString();
	}

} //TargetImpl
