/**
 */
package net.mmyumu.docdoc.model.Cards.impl;

import net.mmyumu.docdoc.model.Cards.CardsPackage;
import net.mmyumu.docdoc.model.Cards.PlayabilityConditionType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Playability Condition Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.PlayabilityConditionTypeImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.PlayabilityConditionTypeImpl#getValueA <em>Value A</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.PlayabilityConditionTypeImpl#getValueB <em>Value B</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PlayabilityConditionTypeImpl extends MinimalEObjectImpl.Container implements PlayabilityConditionType {
	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected String operator = OPERATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueA() <em>Value A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueA()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_A_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueA() <em>Value A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueA()
	 * @generated
	 * @ordered
	 */
	protected String valueA = VALUE_A_EDEFAULT;

	/**
	 * The default value of the '{@link #getValueB() <em>Value B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueB()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_B_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValueB() <em>Value B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueB()
	 * @generated
	 * @ordered
	 */
	protected int valueB = VALUE_B_EDEFAULT;

	/**
	 * This is true if the Value B attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valueBESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlayabilityConditionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CardsPackage.Literals.PLAYABILITY_CONDITION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperator(String newOperator) {
		String oldOperator = operator;
		operator = newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.PLAYABILITY_CONDITION_TYPE__OPERATOR, oldOperator, operator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueA() {
		return valueA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueA(String newValueA) {
		String oldValueA = valueA;
		valueA = newValueA;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.PLAYABILITY_CONDITION_TYPE__VALUE_A, oldValueA, valueA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValueB() {
		return valueB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueB(int newValueB) {
		int oldValueB = valueB;
		valueB = newValueB;
		boolean oldValueBESet = valueBESet;
		valueBESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.PLAYABILITY_CONDITION_TYPE__VALUE_B, oldValueB, valueB, !oldValueBESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValueB() {
		int oldValueB = valueB;
		boolean oldValueBESet = valueBESet;
		valueB = VALUE_B_EDEFAULT;
		valueBESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, CardsPackage.PLAYABILITY_CONDITION_TYPE__VALUE_B, oldValueB, VALUE_B_EDEFAULT, oldValueBESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValueB() {
		return valueBESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CardsPackage.PLAYABILITY_CONDITION_TYPE__OPERATOR:
				return getOperator();
			case CardsPackage.PLAYABILITY_CONDITION_TYPE__VALUE_A:
				return getValueA();
			case CardsPackage.PLAYABILITY_CONDITION_TYPE__VALUE_B:
				return getValueB();
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
			case CardsPackage.PLAYABILITY_CONDITION_TYPE__OPERATOR:
				setOperator((String)newValue);
				return;
			case CardsPackage.PLAYABILITY_CONDITION_TYPE__VALUE_A:
				setValueA((String)newValue);
				return;
			case CardsPackage.PLAYABILITY_CONDITION_TYPE__VALUE_B:
				setValueB((Integer)newValue);
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
			case CardsPackage.PLAYABILITY_CONDITION_TYPE__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case CardsPackage.PLAYABILITY_CONDITION_TYPE__VALUE_A:
				setValueA(VALUE_A_EDEFAULT);
				return;
			case CardsPackage.PLAYABILITY_CONDITION_TYPE__VALUE_B:
				unsetValueB();
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
			case CardsPackage.PLAYABILITY_CONDITION_TYPE__OPERATOR:
				return OPERATOR_EDEFAULT == null ? operator != null : !OPERATOR_EDEFAULT.equals(operator);
			case CardsPackage.PLAYABILITY_CONDITION_TYPE__VALUE_A:
				return VALUE_A_EDEFAULT == null ? valueA != null : !VALUE_A_EDEFAULT.equals(valueA);
			case CardsPackage.PLAYABILITY_CONDITION_TYPE__VALUE_B:
				return isSetValueB();
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
		result.append(" (operator: ");
		result.append(operator);
		result.append(", valueA: ");
		result.append(valueA);
		result.append(", valueB: ");
		if (valueBESet) result.append(valueB); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //PlayabilityConditionTypeImpl
