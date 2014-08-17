/**
 */
package net.mmyumu.docdoc.model.Cards.impl;

import java.util.Collection;

import net.mmyumu.docdoc.model.Cards.Card;
import net.mmyumu.docdoc.model.Cards.Cards;
import net.mmyumu.docdoc.model.Cards.CardsPackage;
import net.mmyumu.docdoc.model.Cards.ExistingCard;
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
 * An implementation of the model object '<em><b>Cards</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardsImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardsImpl#getCard <em>Card</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardsImpl#getExistingCard <em>Existing Card</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardsImpl#getTemplateEffect <em>Template Effect</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CardsImpl extends MinimalEObjectImpl.Container implements Cards {
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
	protected CardsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CardsPackage.Literals.CARDS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, CardsPackage.CARDS__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Card> getCard() {
		return getGroup().list(CardsPackage.Literals.CARDS__CARD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExistingCard> getExistingCard() {
		return getGroup().list(CardsPackage.Literals.CARDS__EXISTING_CARD);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TemplateEffect> getTemplateEffect() {
		return getGroup().list(CardsPackage.Literals.CARDS__TEMPLATE_EFFECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CardsPackage.CARDS__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case CardsPackage.CARDS__CARD:
				return ((InternalEList<?>)getCard()).basicRemove(otherEnd, msgs);
			case CardsPackage.CARDS__EXISTING_CARD:
				return ((InternalEList<?>)getExistingCard()).basicRemove(otherEnd, msgs);
			case CardsPackage.CARDS__TEMPLATE_EFFECT:
				return ((InternalEList<?>)getTemplateEffect()).basicRemove(otherEnd, msgs);
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
			case CardsPackage.CARDS__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case CardsPackage.CARDS__CARD:
				return getCard();
			case CardsPackage.CARDS__EXISTING_CARD:
				return getExistingCard();
			case CardsPackage.CARDS__TEMPLATE_EFFECT:
				return getTemplateEffect();
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
			case CardsPackage.CARDS__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case CardsPackage.CARDS__CARD:
				getCard().clear();
				getCard().addAll((Collection<? extends Card>)newValue);
				return;
			case CardsPackage.CARDS__EXISTING_CARD:
				getExistingCard().clear();
				getExistingCard().addAll((Collection<? extends ExistingCard>)newValue);
				return;
			case CardsPackage.CARDS__TEMPLATE_EFFECT:
				getTemplateEffect().clear();
				getTemplateEffect().addAll((Collection<? extends TemplateEffect>)newValue);
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
			case CardsPackage.CARDS__GROUP:
				getGroup().clear();
				return;
			case CardsPackage.CARDS__CARD:
				getCard().clear();
				return;
			case CardsPackage.CARDS__EXISTING_CARD:
				getExistingCard().clear();
				return;
			case CardsPackage.CARDS__TEMPLATE_EFFECT:
				getTemplateEffect().clear();
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
			case CardsPackage.CARDS__GROUP:
				return group != null && !group.isEmpty();
			case CardsPackage.CARDS__CARD:
				return !getCard().isEmpty();
			case CardsPackage.CARDS__EXISTING_CARD:
				return !getExistingCard().isEmpty();
			case CardsPackage.CARDS__TEMPLATE_EFFECT:
				return !getTemplateEffect().isEmpty();
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

} //CardsImpl
