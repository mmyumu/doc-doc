/**
 */
package net.mmyumu.docdoc.model.Cards.impl;

import java.util.Collection;
import net.mmyumu.docdoc.model.Cards.CardsPackage;
import net.mmyumu.docdoc.model.Cards.Condition;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.ConditionImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.ConditionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.ConditionImpl#getValueA <em>Value A</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.ConditionImpl#getValueB <em>Value B</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionImpl extends MinimalEObjectImpl.Container implements Condition {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected EList<Condition> condition;

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
	protected static final String VALUE_B_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValueB() <em>Value B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueB()
	 * @generated
	 * @ordered
	 */
	protected String valueB = VALUE_B_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CardsPackage.Literals.CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getCondition() {
		if (condition == null) {
			condition = new EObjectContainmentEList<Condition>(Condition.class, this, CardsPackage.CONDITION__CONDITION);
		}
		return condition;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CONDITION__OPERATOR, oldOperator, operator));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CONDITION__VALUE_A, oldValueA, valueA));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValueB() {
		return valueB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValueB(String newValueB) {
		String oldValueB = valueB;
		valueB = newValueB;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.CONDITION__VALUE_B, oldValueB, valueB));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CardsPackage.CONDITION__CONDITION:
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
			case CardsPackage.CONDITION__CONDITION:
				return getCondition();
			case CardsPackage.CONDITION__OPERATOR:
				return getOperator();
			case CardsPackage.CONDITION__VALUE_A:
				return getValueA();
			case CardsPackage.CONDITION__VALUE_B:
				return getValueB();
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
			case CardsPackage.CONDITION__CONDITION:
				getCondition().clear();
				getCondition().addAll((Collection<? extends Condition>)newValue);
				return;
			case CardsPackage.CONDITION__OPERATOR:
				setOperator((String)newValue);
				return;
			case CardsPackage.CONDITION__VALUE_A:
				setValueA((String)newValue);
				return;
			case CardsPackage.CONDITION__VALUE_B:
				setValueB((String)newValue);
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
			case CardsPackage.CONDITION__CONDITION:
				getCondition().clear();
				return;
			case CardsPackage.CONDITION__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case CardsPackage.CONDITION__VALUE_A:
				setValueA(VALUE_A_EDEFAULT);
				return;
			case CardsPackage.CONDITION__VALUE_B:
				setValueB(VALUE_B_EDEFAULT);
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
			case CardsPackage.CONDITION__CONDITION:
				return condition != null && !condition.isEmpty();
			case CardsPackage.CONDITION__OPERATOR:
				return OPERATOR_EDEFAULT == null ? operator != null : !OPERATOR_EDEFAULT.equals(operator);
			case CardsPackage.CONDITION__VALUE_A:
				return VALUE_A_EDEFAULT == null ? valueA != null : !VALUE_A_EDEFAULT.equals(valueA);
			case CardsPackage.CONDITION__VALUE_B:
				return VALUE_B_EDEFAULT == null ? valueB != null : !VALUE_B_EDEFAULT.equals(valueB);
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
		result.append(valueB);
		result.append(')');
		return result.toString();
	}

} //ConditionImpl
