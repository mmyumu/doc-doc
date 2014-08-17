/**
 */
package net.mmyumu.docdoc.model.Cards.impl;

import java.util.Collection;

import net.mmyumu.docdoc.model.Cards.CardsPackage;
import net.mmyumu.docdoc.model.Cards.Subgroup;
import net.mmyumu.docdoc.model.Cards.Target;
import net.mmyumu.docdoc.model.Cards.TemplateEffect;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Subgroup</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.SubgroupImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.SubgroupImpl#getTemplateEffect <em>Template Effect</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.SubgroupImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubgroupImpl extends MinimalEObjectImpl.Container implements Subgroup {
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
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, CardsPackage.SUBGROUP__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateEffect> getTemplateEffect() {
		return getGroup().list(CardsPackage.Literals.SUBGROUP__TEMPLATE_EFFECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Target> getTarget() {
		return getGroup().list(CardsPackage.Literals.SUBGROUP__TARGET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CardsPackage.SUBGROUP__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case CardsPackage.SUBGROUP__TEMPLATE_EFFECT:
				return ((InternalEList<?>)getTemplateEffect()).basicRemove(otherEnd, msgs);
			case CardsPackage.SUBGROUP__TARGET:
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
			case CardsPackage.SUBGROUP__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CardsPackage.SUBGROUP__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case CardsPackage.SUBGROUP__TEMPLATE_EFFECT:
				getTemplateEffect().clear();
				getTemplateEffect().addAll((Collection<? extends TemplateEffect>)newValue);
				return;
			case CardsPackage.SUBGROUP__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends Target>)newValue);
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
			case CardsPackage.SUBGROUP__GROUP:
				getGroup().clear();
				return;
			case CardsPackage.SUBGROUP__TEMPLATE_EFFECT:
				getTemplateEffect().clear();
				return;
			case CardsPackage.SUBGROUP__TARGET:
				getTarget().clear();
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
			case CardsPackage.SUBGROUP__GROUP:
				return group != null && !group.isEmpty();
			case CardsPackage.SUBGROUP__TEMPLATE_EFFECT:
				return !getTemplateEffect().isEmpty();
			case CardsPackage.SUBGROUP__TARGET:
				return !getTarget().isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //SubgroupImpl
