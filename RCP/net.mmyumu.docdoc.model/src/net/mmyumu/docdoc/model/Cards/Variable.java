/**
 */
package net.mmyumu.docdoc.model.Cards;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Variable#getTarget <em>Target</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Variable#getCardFilter <em>Card Filter</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Variable#getAbility <em>Ability</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Variable#getCounterType <em>Counter Type</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Variable#getFromTrigger <em>From Trigger</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Variable#getIncludeSchool <em>Include School</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Variable#getLevelType <em>Level Type</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Variable#getMustBeTargetable <em>Must Be Targetable</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Variable#getSide <em>Side</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Variable#getType <em>Type</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Variable#getUnitType <em>Unit Type</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Variable#getUseCurrentTarget <em>Use Current Target</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Variable#getUseLastTarget <em>Use Last Target</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Variable#getUseParent <em>Use Parent</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Variable#getValueModifier <em>Value Modifier</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getVariable()
 * @model extendedMetaData="name='Variable' kind='elementOnly'"
 * @generated
 */
public interface Variable extends EObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(Target)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getVariable_Target()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Target' namespace='##targetNamespace'"
	 * @generated
	 */
	Target getTarget();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Variable#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Target value);

	/**
	 * Returns the value of the '<em><b>Card Filter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Card Filter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card Filter</em>' containment reference.
	 * @see #setCardFilter(CardFilter)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getVariable_CardFilter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CardFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	CardFilter getCardFilter();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Variable#getCardFilter <em>Card Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card Filter</em>' containment reference.
	 * @see #getCardFilter()
	 * @generated
	 */
	void setCardFilter(CardFilter value);

	/**
	 * Returns the value of the '<em><b>Ability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ability</em>' attribute.
	 * @see #setAbility(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getVariable_Ability()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Ability' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAbility();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Variable#getAbility <em>Ability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ability</em>' attribute.
	 * @see #getAbility()
	 * @generated
	 */
	void setAbility(String value);

	/**
	 * Returns the value of the '<em><b>Counter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Counter Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Counter Type</em>' attribute.
	 * @see #setCounterType(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getVariable_CounterType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='CounterType' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCounterType();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Variable#getCounterType <em>Counter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counter Type</em>' attribute.
	 * @see #getCounterType()
	 * @generated
	 */
	void setCounterType(String value);

	/**
	 * Returns the value of the '<em><b>From Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Trigger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Trigger</em>' attribute.
	 * @see #setFromTrigger(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getVariable_FromTrigger()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='FromTrigger' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFromTrigger();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Variable#getFromTrigger <em>From Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Trigger</em>' attribute.
	 * @see #getFromTrigger()
	 * @generated
	 */
	void setFromTrigger(String value);

	/**
	 * Returns the value of the '<em><b>Include School</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include School</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include School</em>' attribute.
	 * @see #setIncludeSchool(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getVariable_IncludeSchool()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='IncludeSchool' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIncludeSchool();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Variable#getIncludeSchool <em>Include School</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include School</em>' attribute.
	 * @see #getIncludeSchool()
	 * @generated
	 */
	void setIncludeSchool(String value);

	/**
	 * Returns the value of the '<em><b>Level Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level Type</em>' attribute.
	 * @see #setLevelType(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getVariable_LevelType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='LevelType' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLevelType();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Variable#getLevelType <em>Level Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level Type</em>' attribute.
	 * @see #getLevelType()
	 * @generated
	 */
	void setLevelType(String value);

	/**
	 * Returns the value of the '<em><b>Must Be Targetable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Must Be Targetable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Must Be Targetable</em>' attribute.
	 * @see #setMustBeTargetable(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getVariable_MustBeTargetable()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='MustBeTargetable' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMustBeTargetable();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Variable#getMustBeTargetable <em>Must Be Targetable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Must Be Targetable</em>' attribute.
	 * @see #getMustBeTargetable()
	 * @generated
	 */
	void setMustBeTargetable(String value);

	/**
	 * Returns the value of the '<em><b>Side</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Side</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Side</em>' attribute.
	 * @see #setSide(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getVariable_Side()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Side' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSide();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Variable#getSide <em>Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Side</em>' attribute.
	 * @see #getSide()
	 * @generated
	 */
	void setSide(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getVariable_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Type' namespace='##targetNamespace'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Variable#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Unit Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Type</em>' attribute.
	 * @see #setUnitType(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getVariable_UnitType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='UnitType' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUnitType();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Variable#getUnitType <em>Unit Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit Type</em>' attribute.
	 * @see #getUnitType()
	 * @generated
	 */
	void setUnitType(String value);

	/**
	 * Returns the value of the '<em><b>Use Current Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Current Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Current Target</em>' attribute.
	 * @see #setUseCurrentTarget(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getVariable_UseCurrentTarget()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='UseCurrentTarget' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUseCurrentTarget();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Variable#getUseCurrentTarget <em>Use Current Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Current Target</em>' attribute.
	 * @see #getUseCurrentTarget()
	 * @generated
	 */
	void setUseCurrentTarget(String value);

	/**
	 * Returns the value of the '<em><b>Use Last Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Last Target</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Last Target</em>' attribute.
	 * @see #setUseLastTarget(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getVariable_UseLastTarget()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='UseLastTarget' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUseLastTarget();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Variable#getUseLastTarget <em>Use Last Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Last Target</em>' attribute.
	 * @see #getUseLastTarget()
	 * @generated
	 */
	void setUseLastTarget(String value);

	/**
	 * Returns the value of the '<em><b>Use Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Parent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Parent</em>' attribute.
	 * @see #setUseParent(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getVariable_UseParent()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='UseParent' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUseParent();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Variable#getUseParent <em>Use Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Parent</em>' attribute.
	 * @see #getUseParent()
	 * @generated
	 */
	void setUseParent(String value);

	/**
	 * Returns the value of the '<em><b>Value Modifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Modifier</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Modifier</em>' attribute.
	 * @see #setValueModifier(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getVariable_ValueModifier()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ValueModifier' namespace='##targetNamespace'"
	 * @generated
	 */
	String getValueModifier();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Variable#getValueModifier <em>Value Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Modifier</em>' attribute.
	 * @see #getValueModifier()
	 * @generated
	 */
	void setValueModifier(String value);

} // Variable
