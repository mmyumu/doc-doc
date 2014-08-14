/**
 */
package net.mmyumu.docdoc.model.Cards.impl;

import net.mmyumu.docdoc.model.Cards.CardsPackage;
import net.mmyumu.docdoc.model.Cards.Subgroup;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subgroup</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.SubgroupImpl#getTemplateEffect <em>Template Effect</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.SubgroupImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubgroupImpl extends MinimalEObjectImpl.Container implements Subgroup {
	/**
	 * The cached value of the '{@link #getTemplateEffect() <em>Template Effect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemplateEffect()
	 * @generated
	 * @ordered
	 */
	protected EObject templateEffect;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EObject target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubgroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CardsPackage.Literals.SUBGROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getTemplateEffect() {
		return templateEffect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemplateEffect(EObject newTemplateEffect, NotificationChain msgs) {
		EObject oldTemplateEffect = templateEffect;
		templateEffect = newTemplateEffect;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CardsPackage.SUBGROUP__TEMPLATE_EFFECT, oldTemplateEffect, newTemplateEffect);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemplateEffect(EObject newTemplateEffect) {
		if (newTemplateEffect != templateEffect) {
			NotificationChain msgs = null;
			if (templateEffect != null)
				msgs = ((InternalEObject)templateEffect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CardsPackage.SUBGROUP__TEMPLATE_EFFECT, null, msgs);
			if (newTemplateEffect != null)
				msgs = ((InternalEObject)newTemplateEffect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CardsPackage.SUBGROUP__TEMPLATE_EFFECT, null, msgs);
			msgs = basicSetTemplateEffect(newTemplateEffect, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.SUBGROUP__TEMPLATE_EFFECT, newTemplateEffect, newTemplateEffect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(EObject newTarget, NotificationChain msgs) {
		EObject oldTarget = target;
		target = newTarget;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CardsPackage.SUBGROUP__TARGET, oldTarget, newTarget);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(EObject newTarget) {
		if (newTarget != target) {
			NotificationChain msgs = null;
			if (target != null)
				msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CardsPackage.SUBGROUP__TARGET, null, msgs);
			if (newTarget != null)
				msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CardsPackage.SUBGROUP__TARGET, null, msgs);
			msgs = basicSetTarget(newTarget, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.SUBGROUP__TARGET, newTarget, newTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CardsPackage.SUBGROUP__TEMPLATE_EFFECT:
				return basicSetTemplateEffect(null, msgs);
			case CardsPackage.SUBGROUP__TARGET:
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
			case CardsPackage.SUBGROUP__TEMPLATE_EFFECT:
				return getTemplateEffect();
			case CardsPackage.SUBGROUP__TARGET:
				return getTarget();
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
			case CardsPackage.SUBGROUP__TEMPLATE_EFFECT:
				setTemplateEffect((EObject)newValue);
				return;
			case CardsPackage.SUBGROUP__TARGET:
				setTarget((EObject)newValue);
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
			case CardsPackage.SUBGROUP__TEMPLATE_EFFECT:
				setTemplateEffect((EObject)null);
				return;
			case CardsPackage.SUBGROUP__TARGET:
				setTarget((EObject)null);
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
			case CardsPackage.SUBGROUP__TEMPLATE_EFFECT:
				return templateEffect != null;
			case CardsPackage.SUBGROUP__TARGET:
				return target != null;
		}
		return super.eIsSet(featureID);
	}

} //SubgroupImpl
