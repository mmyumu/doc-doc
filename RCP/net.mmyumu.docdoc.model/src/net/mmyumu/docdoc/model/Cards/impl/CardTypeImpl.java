/**
 */
package net.mmyumu.docdoc.model.Cards.impl;

import net.mmyumu.docdoc.model.Cards.CardType;
import net.mmyumu.docdoc.model.Cards.CardsPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Card Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardTypeImpl#getExclude <em>Exclude</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.CardTypeImpl#getInclude <em>Include</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CardTypeImpl extends MinimalEObjectImpl.Container implements CardType {
	/**
	 * The default value of the '{@link #getExclude() <em>Exclude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclude()
	 * @generated
	 * @ordered
	 */
	protected static final String EXCLUDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExclude() <em>Exclude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclude()
	 * @generated
	 * @ordered
	 */
	protected String exclude = EXCLUDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInclude() <em>Include</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclude()
	 * @generated
	 * @ordered
	 */
	protected static final String INCLUDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInclude() <em>Include</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInclude()
	 * @generated
	 * @ordered
	 */
	protected String include = INCLUDE_EDEFAULT;

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
	public String getExclude() {
		return exclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExclude(String newExclude) {
		String oldExclude = exclude;
		exclude = newExclude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD_TYPE__EXCLUDE, oldExclude, exclude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInclude() {
		return include;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInclude(String newInclude) {
		String oldInclude = include;
		include = newInclude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CARD_TYPE__INCLUDE, oldInclude, include));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CardsPackage.CARD_TYPE__EXCLUDE:
				return getExclude();
			case CardsPackage.CARD_TYPE__INCLUDE:
				return getInclude();
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
			case CardsPackage.CARD_TYPE__EXCLUDE:
				setExclude((String)newValue);
				return;
			case CardsPackage.CARD_TYPE__INCLUDE:
				setInclude((String)newValue);
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
			case CardsPackage.CARD_TYPE__EXCLUDE:
				setExclude(EXCLUDE_EDEFAULT);
				return;
			case CardsPackage.CARD_TYPE__INCLUDE:
				setInclude(INCLUDE_EDEFAULT);
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
			case CardsPackage.CARD_TYPE__EXCLUDE:
				return EXCLUDE_EDEFAULT == null ? exclude != null : !EXCLUDE_EDEFAULT.equals(exclude);
			case CardsPackage.CARD_TYPE__INCLUDE:
				return INCLUDE_EDEFAULT == null ? include != null : !INCLUDE_EDEFAULT.equals(include);
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
		result.append(" (exclude: ");
		result.append(exclude);
		result.append(", include: ");
		result.append(include);
		result.append(')');
		return result.toString();
	}

} //CardTypeImpl
