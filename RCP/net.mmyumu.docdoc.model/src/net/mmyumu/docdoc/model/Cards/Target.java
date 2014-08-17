/**
 */
package net.mmyumu.docdoc.model.Cards;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Target</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Target#getGroup <em>Group</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Target#getVariable <em>Variable</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Target#getVariable2 <em>Variable2</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Target#getCondition <em>Condition</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Target#getOption <em>Option</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Target#getCardType <em>Card Type</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Target#getCardFilter <em>Card Filter</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Target#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Target#getEffect <em>Effect</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Target#getSubgroup <em>Subgroup</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Target#getBattlegroundFilter <em>Battleground Filter</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Target#getAllowDuplicate <em>Allow Duplicate</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Target#getAmount <em>Amount</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Target#getAmountVisible <em>Amount Visible</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Target#getAutoTakeFirstInputs <em>Auto Take First Inputs</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Target#getBattlegroundPositionState <em>Battleground Position State</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Target#getCancelable <em>Cancelable</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Target#getCantTargetOccupant <em>Cant Target Occupant</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Target#getCantTargetParent <em>Cant Target Parent</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Target#getCantTargetPrevious <em>Cant Target Previous</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Target#getCantTargetSelf <em>Cant Target Self</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Target#getCardType1 <em>Card Type1</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Target#getDontUpdateAfterExecution <em>Dont Update After Execution</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Target#getExceptFromTrigger <em>Except From Trigger</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Target#getExcludeUnique <em>Exclude Unique</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Target#getForceExecute <em>Force Execute</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Target#getIgnoreWard <em>Ignore Ward</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Target#getInputOnExec <em>Input On Exec</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Target#getMinAmount <em>Min Amount</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Target#getNeedActivation <em>Need Activation</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Target#getOption1 <em>Option1</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Target#getPersistent <em>Persistent</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Target#getRandom <em>Random</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Target#getRevealToOther <em>Reveal To Other</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Target#getShape <em>Shape</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Target#getSide <em>Side</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Target#getSkipNextTargetValidation <em>Skip Next Target Validation</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Target#getSkipSubTargetValidation <em>Skip Sub Target Validation</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Target#getZone <em>Zone</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTarget()
 * @model extendedMetaData="name='Target' kind='elementOnly'"
 * @generated
 */
public interface Target extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTarget_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
	 * The list contents are of type {@link net.mmyumu.docdoc.model.Cards.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference list.
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTarget_Variable()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Variable' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<Variable> getVariable();

	/**
	 * Returns the value of the '<em><b>Variable2</b></em>' containment reference list.
	 * The list contents are of type {@link net.mmyumu.docdoc.model.Cards.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable2</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable2</em>' containment reference list.
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTarget_Variable2()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Variable2' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<Variable> getVariable2();

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference list.
	 * The list contents are of type {@link net.mmyumu.docdoc.model.Cards.Condition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference list.
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTarget_Condition()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Condition' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<Condition> getCondition();

	/**
	 * Returns the value of the '<em><b>Option</b></em>' containment reference list.
	 * The list contents are of type {@link net.mmyumu.docdoc.model.Cards.Option}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Option</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option</em>' containment reference list.
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTarget_Option()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Option' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<Option> getOption();

	/**
	 * Returns the value of the '<em><b>Card Type</b></em>' containment reference list.
	 * The list contents are of type {@link net.mmyumu.docdoc.model.Cards.CardType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Card Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card Type</em>' containment reference list.
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTarget_CardType()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CardType' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<CardType> getCardType();

	/**
	 * Returns the value of the '<em><b>Card Filter</b></em>' containment reference list.
	 * The list contents are of type {@link net.mmyumu.docdoc.model.Cards.CardFilter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Card Filter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card Filter</em>' containment reference list.
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTarget_CardFilter()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CardFilter' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<CardFilter> getCardFilter();

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' containment reference list.
	 * The list contents are of type {@link net.mmyumu.docdoc.model.Cards.Trigger}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' containment reference list.
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTarget_Trigger()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Trigger' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<Trigger> getTrigger();

	/**
	 * Returns the value of the '<em><b>Effect</b></em>' containment reference list.
	 * The list contents are of type {@link net.mmyumu.docdoc.model.Cards.Effect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Effect</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Effect</em>' containment reference list.
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTarget_Effect()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Effect' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<Effect> getEffect();

	/**
	 * Returns the value of the '<em><b>Subgroup</b></em>' containment reference list.
	 * The list contents are of type {@link net.mmyumu.docdoc.model.Cards.Subgroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subgroup</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subgroup</em>' containment reference list.
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTarget_Subgroup()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Subgroup' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<Subgroup> getSubgroup();

	/**
	 * Returns the value of the '<em><b>Battleground Filter</b></em>' containment reference list.
	 * The list contents are of type {@link net.mmyumu.docdoc.model.Cards.BattlegroundFilter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Battleground Filter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Battleground Filter</em>' containment reference list.
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTarget_BattlegroundFilter()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='BattlegroundFilter' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<BattlegroundFilter> getBattlegroundFilter();

	/**
	 * Returns the value of the '<em><b>Allow Duplicate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Allow Duplicate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Allow Duplicate</em>' attribute.
	 * @see #setAllowDuplicate(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTarget_AllowDuplicate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='AllowDuplicate' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAllowDuplicate();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Target#getAllowDuplicate <em>Allow Duplicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Duplicate</em>' attribute.
	 * @see #getAllowDuplicate()
	 * @generated
	 */
	void setAllowDuplicate(String value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTarget_Amount()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Amount' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAmount();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Target#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(String value);

	/**
	 * Returns the value of the '<em><b>Amount Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Visible</em>' attribute.
	 * @see #setAmountVisible(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTarget_AmountVisible()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='AmountVisible' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAmountVisible();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Target#getAmountVisible <em>Amount Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount Visible</em>' attribute.
	 * @see #getAmountVisible()
	 * @generated
	 */
	void setAmountVisible(String value);

	/**
	 * Returns the value of the '<em><b>Auto Take First Inputs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Take First Inputs</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Take First Inputs</em>' attribute.
	 * @see #setAutoTakeFirstInputs(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTarget_AutoTakeFirstInputs()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='AutoTakeFirstInputs' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAutoTakeFirstInputs();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Target#getAutoTakeFirstInputs <em>Auto Take First Inputs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Take First Inputs</em>' attribute.
	 * @see #getAutoTakeFirstInputs()
	 * @generated
	 */
	void setAutoTakeFirstInputs(String value);

	/**
	 * Returns the value of the '<em><b>Battleground Position State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Battleground Position State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Battleground Position State</em>' attribute.
	 * @see #setBattlegroundPositionState(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTarget_BattlegroundPositionState()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='BattlegroundPositionState' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBattlegroundPositionState();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Target#getBattlegroundPositionState <em>Battleground Position State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Battleground Position State</em>' attribute.
	 * @see #getBattlegroundPositionState()
	 * @generated
	 */
	void setBattlegroundPositionState(String value);

	/**
	 * Returns the value of the '<em><b>Cancelable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cancelable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancelable</em>' attribute.
	 * @see #setCancelable(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTarget_Cancelable()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Cancelable' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCancelable();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Target#getCancelable <em>Cancelable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancelable</em>' attribute.
	 * @see #getCancelable()
	 * @generated
	 */
	void setCancelable(String value);

	/**
	 * Returns the value of the '<em><b>Cant Target Occupant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cant Target Occupant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cant Target Occupant</em>' attribute.
	 * @see #setCantTargetOccupant(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTarget_CantTargetOccupant()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='CantTargetOccupant' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCantTargetOccupant();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Target#getCantTargetOccupant <em>Cant Target Occupant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cant Target Occupant</em>' attribute.
	 * @see #getCantTargetOccupant()
	 * @generated
	 */
	void setCantTargetOccupant(String value);

	/**
	 * Returns the value of the '<em><b>Cant Target Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cant Target Parent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cant Target Parent</em>' attribute.
	 * @see #setCantTargetParent(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTarget_CantTargetParent()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='CantTargetParent' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCantTargetParent();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Target#getCantTargetParent <em>Cant Target Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cant Target Parent</em>' attribute.
	 * @see #getCantTargetParent()
	 * @generated
	 */
	void setCantTargetParent(String value);

	/**
	 * Returns the value of the '<em><b>Cant Target Previous</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cant Target Previous</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cant Target Previous</em>' attribute.
	 * @see #setCantTargetPrevious(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTarget_CantTargetPrevious()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='CantTargetPrevious' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCantTargetPrevious();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Target#getCantTargetPrevious <em>Cant Target Previous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cant Target Previous</em>' attribute.
	 * @see #getCantTargetPrevious()
	 * @generated
	 */
	void setCantTargetPrevious(String value);

	/**
	 * Returns the value of the '<em><b>Cant Target Self</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cant Target Self</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cant Target Self</em>' attribute.
	 * @see #setCantTargetSelf(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTarget_CantTargetSelf()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='CantTargetSelf' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCantTargetSelf();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Target#getCantTargetSelf <em>Cant Target Self</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cant Target Self</em>' attribute.
	 * @see #getCantTargetSelf()
	 * @generated
	 */
	void setCantTargetSelf(String value);

	/**
	 * Returns the value of the '<em><b>Card Type1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Card Type1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card Type1</em>' attribute.
	 * @see #setCardType1(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTarget_CardType1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='CardType' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCardType1();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Target#getCardType1 <em>Card Type1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card Type1</em>' attribute.
	 * @see #getCardType1()
	 * @generated
	 */
	void setCardType1(String value);

	/**
	 * Returns the value of the '<em><b>Dont Update After Execution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dont Update After Execution</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dont Update After Execution</em>' attribute.
	 * @see #setDontUpdateAfterExecution(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTarget_DontUpdateAfterExecution()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='DontUpdateAfterExecution' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDontUpdateAfterExecution();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Target#getDontUpdateAfterExecution <em>Dont Update After Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dont Update After Execution</em>' attribute.
	 * @see #getDontUpdateAfterExecution()
	 * @generated
	 */
	void setDontUpdateAfterExecution(String value);

	/**
	 * Returns the value of the '<em><b>Except From Trigger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Except From Trigger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Except From Trigger</em>' attribute.
	 * @see #setExceptFromTrigger(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTarget_ExceptFromTrigger()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ExceptFromTrigger' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExceptFromTrigger();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Target#getExceptFromTrigger <em>Except From Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Except From Trigger</em>' attribute.
	 * @see #getExceptFromTrigger()
	 * @generated
	 */
	void setExceptFromTrigger(String value);

	/**
	 * Returns the value of the '<em><b>Exclude Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclude Unique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclude Unique</em>' attribute.
	 * @see #setExcludeUnique(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTarget_ExcludeUnique()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ExcludeUnique' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExcludeUnique();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Target#getExcludeUnique <em>Exclude Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclude Unique</em>' attribute.
	 * @see #getExcludeUnique()
	 * @generated
	 */
	void setExcludeUnique(String value);

	/**
	 * Returns the value of the '<em><b>Force Execute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Force Execute</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Force Execute</em>' attribute.
	 * @see #setForceExecute(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTarget_ForceExecute()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ForceExecute' namespace='##targetNamespace'"
	 * @generated
	 */
	String getForceExecute();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Target#getForceExecute <em>Force Execute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Force Execute</em>' attribute.
	 * @see #getForceExecute()
	 * @generated
	 */
	void setForceExecute(String value);

	/**
	 * Returns the value of the '<em><b>Ignore Ward</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ignore Ward</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ignore Ward</em>' attribute.
	 * @see #setIgnoreWard(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTarget_IgnoreWard()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='IgnoreWard' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIgnoreWard();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Target#getIgnoreWard <em>Ignore Ward</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Ward</em>' attribute.
	 * @see #getIgnoreWard()
	 * @generated
	 */
	void setIgnoreWard(String value);

	/**
	 * Returns the value of the '<em><b>Input On Exec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Input On Exec</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Input On Exec</em>' attribute.
	 * @see #setInputOnExec(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTarget_InputOnExec()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='InputOnExec' namespace='##targetNamespace'"
	 * @generated
	 */
	String getInputOnExec();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Target#getInputOnExec <em>Input On Exec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Input On Exec</em>' attribute.
	 * @see #getInputOnExec()
	 * @generated
	 */
	void setInputOnExec(String value);

	/**
	 * Returns the value of the '<em><b>Min Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Amount</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Amount</em>' attribute.
	 * @see #setMinAmount(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTarget_MinAmount()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='MinAmount' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMinAmount();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Target#getMinAmount <em>Min Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Amount</em>' attribute.
	 * @see #getMinAmount()
	 * @generated
	 */
	void setMinAmount(String value);

	/**
	 * Returns the value of the '<em><b>Need Activation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Need Activation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Need Activation</em>' attribute.
	 * @see #setNeedActivation(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTarget_NeedActivation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='NeedActivation' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNeedActivation();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Target#getNeedActivation <em>Need Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Need Activation</em>' attribute.
	 * @see #getNeedActivation()
	 * @generated
	 */
	void setNeedActivation(String value);

	/**
	 * Returns the value of the '<em><b>Option1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Option1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option1</em>' attribute.
	 * @see #setOption1(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTarget_Option1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Option' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOption1();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Target#getOption1 <em>Option1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option1</em>' attribute.
	 * @see #getOption1()
	 * @generated
	 */
	void setOption1(String value);

	/**
	 * Returns the value of the '<em><b>Persistent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Persistent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Persistent</em>' attribute.
	 * @see #setPersistent(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTarget_Persistent()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Persistent' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPersistent();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Target#getPersistent <em>Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistent</em>' attribute.
	 * @see #getPersistent()
	 * @generated
	 */
	void setPersistent(String value);

	/**
	 * Returns the value of the '<em><b>Random</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Random</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Random</em>' attribute.
	 * @see #setRandom(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTarget_Random()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Random' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRandom();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Target#getRandom <em>Random</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Random</em>' attribute.
	 * @see #getRandom()
	 * @generated
	 */
	void setRandom(String value);

	/**
	 * Returns the value of the '<em><b>Reveal To Other</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reveal To Other</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reveal To Other</em>' attribute.
	 * @see #setRevealToOther(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTarget_RevealToOther()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='RevealToOther' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRevealToOther();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Target#getRevealToOther <em>Reveal To Other</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reveal To Other</em>' attribute.
	 * @see #getRevealToOther()
	 * @generated
	 */
	void setRevealToOther(String value);

	/**
	 * Returns the value of the '<em><b>Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shape</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape</em>' attribute.
	 * @see #setShape(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTarget_Shape()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Shape' namespace='##targetNamespace'"
	 * @generated
	 */
	String getShape();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Target#getShape <em>Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape</em>' attribute.
	 * @see #getShape()
	 * @generated
	 */
	void setShape(String value);

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
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTarget_Side()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Side' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSide();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Target#getSide <em>Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Side</em>' attribute.
	 * @see #getSide()
	 * @generated
	 */
	void setSide(String value);

	/**
	 * Returns the value of the '<em><b>Skip Next Target Validation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skip Next Target Validation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skip Next Target Validation</em>' attribute.
	 * @see #setSkipNextTargetValidation(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTarget_SkipNextTargetValidation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='SkipNextTargetValidation' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSkipNextTargetValidation();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Target#getSkipNextTargetValidation <em>Skip Next Target Validation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skip Next Target Validation</em>' attribute.
	 * @see #getSkipNextTargetValidation()
	 * @generated
	 */
	void setSkipNextTargetValidation(String value);

	/**
	 * Returns the value of the '<em><b>Skip Sub Target Validation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skip Sub Target Validation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skip Sub Target Validation</em>' attribute.
	 * @see #setSkipSubTargetValidation(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTarget_SkipSubTargetValidation()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='SkipSubTargetValidation' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSkipSubTargetValidation();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Target#getSkipSubTargetValidation <em>Skip Sub Target Validation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skip Sub Target Validation</em>' attribute.
	 * @see #getSkipSubTargetValidation()
	 * @generated
	 */
	void setSkipSubTargetValidation(String value);

	/**
	 * Returns the value of the '<em><b>Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Zone</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Zone</em>' attribute.
	 * @see #setZone(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTarget_Zone()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Zone' namespace='##targetNamespace'"
	 * @generated
	 */
	String getZone();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Target#getZone <em>Zone</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Zone</em>' attribute.
	 * @see #getZone()
	 * @generated
	 */
	void setZone(String value);

} // Target
