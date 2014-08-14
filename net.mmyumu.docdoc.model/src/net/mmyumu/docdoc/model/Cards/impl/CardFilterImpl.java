/**
 */
package net.mmyumu.docdoc.model.Cards.impl;

import net.mmyumu.docdoc.model.Cards.CardFilter;
import net.mmyumu.docdoc.model.Cards.CardsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Card Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardFilterImpl#getIncludeUnitType <em>Include Unit Type</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardFilterImpl#getSide <em>Side</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CardFilterImpl extends MinimalEObjectImpl.Container implements CardFilter {
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CardsPackage.CARD_FILTER__INCLUDE_UNIT_TYPE:
				return getIncludeUnitType();
			case CardsPackage.CARD_FILTER__SIDE:
				return getSide();
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
			case CardsPackage.CARD_FILTER__INCLUDE_UNIT_TYPE:
				setIncludeUnitType((String)newValue);
				return;
			case CardsPackage.CARD_FILTER__SIDE:
				setSide((String)newValue);
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
			case CardsPackage.CARD_FILTER__INCLUDE_UNIT_TYPE:
				setIncludeUnitType(INCLUDE_UNIT_TYPE_EDEFAULT);
				return;
			case CardsPackage.CARD_FILTER__SIDE:
				setSide(SIDE_EDEFAULT);
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
			case CardsPackage.CARD_FILTER__INCLUDE_UNIT_TYPE:
				return INCLUDE_UNIT_TYPE_EDEFAULT == null ? includeUnitType != null : !INCLUDE_UNIT_TYPE_EDEFAULT.equals(includeUnitType);
			case CardsPackage.CARD_FILTER__SIDE:
				return SIDE_EDEFAULT == null ? side != null : !SIDE_EDEFAULT.equals(side);
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
		result.append(" (includeUnitType: ");
		result.append(includeUnitType);
		result.append(", side: ");
		result.append(side);
		result.append(')');
		return result.toString();
	}

} //CardFilterImpl
