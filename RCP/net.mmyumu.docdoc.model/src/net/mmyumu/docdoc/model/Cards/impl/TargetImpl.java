/**
 */
package net.mmyumu.docdoc.model.Cards.impl;

import java.util.Collection;

import net.mmyumu.docdoc.model.Cards.BattlegroundFilter;
import net.mmyumu.docdoc.model.Cards.CardFilter;
import net.mmyumu.docdoc.model.Cards.CardType;
import net.mmyumu.docdoc.model.Cards.CardsPackage;
import net.mmyumu.docdoc.model.Cards.Condition;
import net.mmyumu.docdoc.model.Cards.Effect;
import net.mmyumu.docdoc.model.Cards.Option;
import net.mmyumu.docdoc.model.Cards.Subgroup;
import net.mmyumu.docdoc.model.Cards.Target;
import net.mmyumu.docdoc.model.Cards.Trigger;
import net.mmyumu.docdoc.model.Cards.Variable;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.TargetImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.TargetImpl#getVariable <em>Variable</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.TargetImpl#getVariable2 <em>Variable2</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.TargetImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.TargetImpl#getOption <em>Option</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.TargetImpl#getCardType <em>Card Type</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.TargetImpl#getCardFilter <em>Card Filter</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.TargetImpl#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.TargetImpl#getEffect <em>Effect</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.TargetImpl#getSubgroup <em>Subgroup</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.TargetImpl#getBattlegroundFilter <em>Battleground Filter</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.TargetImpl#getAllowDuplicate <em>Allow Duplicate</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.TargetImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.TargetImpl#getAmountVisible <em>Amount Visible</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.TargetImpl#getAutoTakeFirstInputs <em>Auto Take First Inputs</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.TargetImpl#getBattlegroundPositionState <em>Battleground Position State</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.TargetImpl#getCancelable <em>Cancelable</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.TargetImpl#getCantTargetOccupant <em>Cant Target Occupant</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.TargetImpl#getCantTargetParent <em>Cant Target Parent</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.TargetImpl#getCantTargetPrevious <em>Cant Target Previous</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.TargetImpl#getCantTargetSelf <em>Cant Target Self</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.TargetImpl#getCardType1 <em>Card Type1</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.TargetImpl#getDontUpdateAfterExecution <em>Dont Update After Execution</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.TargetImpl#getExceptFromTrigger <em>Except From Trigger</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.TargetImpl#getExcludeUnique <em>Exclude Unique</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.TargetImpl#getForceExecute <em>Force Execute</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.TargetImpl#getIgnoreWard <em>Ignore Ward</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.TargetImpl#getInputOnExec <em>Input On Exec</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.TargetImpl#getMinAmount <em>Min Amount</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.TargetImpl#getNeedActivation <em>Need Activation</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.TargetImpl#getOption1 <em>Option1</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.TargetImpl#getPersistent <em>Persistent</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.TargetImpl#getRandom <em>Random</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.TargetImpl#getRevealToOther <em>Reveal To Other</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.TargetImpl#getShape <em>Shape</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.TargetImpl#getSide <em>Side</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.TargetImpl#getSkipNextTargetValidation <em>Skip Next Target Validation</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.TargetImpl#getSkipSubTargetValidation <em>Skip Sub Target Validation</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.TargetImpl#getZone <em>Zone</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TargetImpl extends MinimalEObjectImpl.Container implements Target {
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
	 * The default value of the '{@link #getAllowDuplicate() <em>Allow Duplicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowDuplicate()
	 * @generated
	 * @ordered
	 */
	protected static final String ALLOW_DUPLICATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAllowDuplicate() <em>Allow Duplicate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowDuplicate()
	 * @generated
	 * @ordered
	 */
	protected String allowDuplicate = ALLOW_DUPLICATE_EDEFAULT;

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
	 * The default value of the '{@link #getAmountVisible() <em>Amount Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountVisible()
	 * @generated
	 * @ordered
	 */
	protected static final String AMOUNT_VISIBLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAmountVisible() <em>Amount Visible</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountVisible()
	 * @generated
	 * @ordered
	 */
	protected String amountVisible = AMOUNT_VISIBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAutoTakeFirstInputs() <em>Auto Take First Inputs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoTakeFirstInputs()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTO_TAKE_FIRST_INPUTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutoTakeFirstInputs() <em>Auto Take First Inputs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoTakeFirstInputs()
	 * @generated
	 * @ordered
	 */
	protected String autoTakeFirstInputs = AUTO_TAKE_FIRST_INPUTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBattlegroundPositionState() <em>Battleground Position State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBattlegroundPositionState()
	 * @generated
	 * @ordered
	 */
	protected static final String BATTLEGROUND_POSITION_STATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBattlegroundPositionState() <em>Battleground Position State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBattlegroundPositionState()
	 * @generated
	 * @ordered
	 */
	protected String battlegroundPositionState = BATTLEGROUND_POSITION_STATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCancelable() <em>Cancelable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancelable()
	 * @generated
	 * @ordered
	 */
	protected static final String CANCELABLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCancelable() <em>Cancelable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancelable()
	 * @generated
	 * @ordered
	 */
	protected String cancelable = CANCELABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCantTargetOccupant() <em>Cant Target Occupant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCantTargetOccupant()
	 * @generated
	 * @ordered
	 */
	protected static final String CANT_TARGET_OCCUPANT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCantTargetOccupant() <em>Cant Target Occupant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCantTargetOccupant()
	 * @generated
	 * @ordered
	 */
	protected String cantTargetOccupant = CANT_TARGET_OCCUPANT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCantTargetParent() <em>Cant Target Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCantTargetParent()
	 * @generated
	 * @ordered
	 */
	protected static final String CANT_TARGET_PARENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCantTargetParent() <em>Cant Target Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCantTargetParent()
	 * @generated
	 * @ordered
	 */
	protected String cantTargetParent = CANT_TARGET_PARENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCantTargetPrevious() <em>Cant Target Previous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCantTargetPrevious()
	 * @generated
	 * @ordered
	 */
	protected static final String CANT_TARGET_PREVIOUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCantTargetPrevious() <em>Cant Target Previous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCantTargetPrevious()
	 * @generated
	 * @ordered
	 */
	protected String cantTargetPrevious = CANT_TARGET_PREVIOUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCantTargetSelf() <em>Cant Target Self</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCantTargetSelf()
	 * @generated
	 * @ordered
	 */
	protected static final String CANT_TARGET_SELF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCantTargetSelf() <em>Cant Target Self</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCantTargetSelf()
	 * @generated
	 * @ordered
	 */
	protected String cantTargetSelf = CANT_TARGET_SELF_EDEFAULT;

	/**
	 * The default value of the '{@link #getCardType1() <em>Card Type1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardType1()
	 * @generated
	 * @ordered
	 */
	protected static final String CARD_TYPE1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCardType1() <em>Card Type1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardType1()
	 * @generated
	 * @ordered
	 */
	protected String cardType1 = CARD_TYPE1_EDEFAULT;

	/**
	 * The default value of the '{@link #getDontUpdateAfterExecution() <em>Dont Update After Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDontUpdateAfterExecution()
	 * @generated
	 * @ordered
	 */
	protected static final String DONT_UPDATE_AFTER_EXECUTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDontUpdateAfterExecution() <em>Dont Update After Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDontUpdateAfterExecution()
	 * @generated
	 * @ordered
	 */
	protected String dontUpdateAfterExecution = DONT_UPDATE_AFTER_EXECUTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getExceptFromTrigger() <em>Except From Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptFromTrigger()
	 * @generated
	 * @ordered
	 */
	protected static final String EXCEPT_FROM_TRIGGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExceptFromTrigger() <em>Except From Trigger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptFromTrigger()
	 * @generated
	 * @ordered
	 */
	protected String exceptFromTrigger = EXCEPT_FROM_TRIGGER_EDEFAULT;

	/**
	 * The default value of the '{@link #getExcludeUnique() <em>Exclude Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeUnique()
	 * @generated
	 * @ordered
	 */
	protected static final String EXCLUDE_UNIQUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExcludeUnique() <em>Exclude Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludeUnique()
	 * @generated
	 * @ordered
	 */
	protected String excludeUnique = EXCLUDE_UNIQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getForceExecute() <em>Force Execute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForceExecute()
	 * @generated
	 * @ordered
	 */
	protected static final String FORCE_EXECUTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForceExecute() <em>Force Execute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForceExecute()
	 * @generated
	 * @ordered
	 */
	protected String forceExecute = FORCE_EXECUTE_EDEFAULT;

	/**
	 * The default value of the '{@link #getIgnoreWard() <em>Ignore Ward</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreWard()
	 * @generated
	 * @ordered
	 */
	protected static final String IGNORE_WARD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIgnoreWard() <em>Ignore Ward</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoreWard()
	 * @generated
	 * @ordered
	 */
	protected String ignoreWard = IGNORE_WARD_EDEFAULT;

	/**
	 * The default value of the '{@link #getInputOnExec() <em>Input On Exec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputOnExec()
	 * @generated
	 * @ordered
	 */
	protected static final String INPUT_ON_EXEC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInputOnExec() <em>Input On Exec</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputOnExec()
	 * @generated
	 * @ordered
	 */
	protected String inputOnExec = INPUT_ON_EXEC_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinAmount() <em>Min Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinAmount()
	 * @generated
	 * @ordered
	 */
	protected static final String MIN_AMOUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinAmount() <em>Min Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinAmount()
	 * @generated
	 * @ordered
	 */
	protected String minAmount = MIN_AMOUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNeedActivation() <em>Need Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeedActivation()
	 * @generated
	 * @ordered
	 */
	protected static final String NEED_ACTIVATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNeedActivation() <em>Need Activation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNeedActivation()
	 * @generated
	 * @ordered
	 */
	protected String needActivation = NEED_ACTIVATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOption1() <em>Option1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOption1()
	 * @generated
	 * @ordered
	 */
	protected static final String OPTION1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOption1() <em>Option1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOption1()
	 * @generated
	 * @ordered
	 */
	protected String option1 = OPTION1_EDEFAULT;

	/**
	 * The default value of the '{@link #getPersistent() <em>Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistent()
	 * @generated
	 * @ordered
	 */
	protected static final String PERSISTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPersistent() <em>Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersistent()
	 * @generated
	 * @ordered
	 */
	protected String persistent = PERSISTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRandom() <em>Random</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRandom()
	 * @generated
	 * @ordered
	 */
	protected static final String RANDOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRandom() <em>Random</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRandom()
	 * @generated
	 * @ordered
	 */
	protected String random = RANDOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getRevealToOther() <em>Reveal To Other</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevealToOther()
	 * @generated
	 * @ordered
	 */
	protected static final String REVEAL_TO_OTHER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRevealToOther() <em>Reveal To Other</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevealToOther()
	 * @generated
	 * @ordered
	 */
	protected String revealToOther = REVEAL_TO_OTHER_EDEFAULT;

	/**
	 * The default value of the '{@link #getShape() <em>Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShape()
	 * @generated
	 * @ordered
	 */
	protected static final String SHAPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShape() <em>Shape</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShape()
	 * @generated
	 * @ordered
	 */
	protected String shape = SHAPE_EDEFAULT;

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
	 * The default value of the '{@link #getSkipNextTargetValidation() <em>Skip Next Target Validation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkipNextTargetValidation()
	 * @generated
	 * @ordered
	 */
	protected static final String SKIP_NEXT_TARGET_VALIDATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSkipNextTargetValidation() <em>Skip Next Target Validation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkipNextTargetValidation()
	 * @generated
	 * @ordered
	 */
	protected String skipNextTargetValidation = SKIP_NEXT_TARGET_VALIDATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSkipSubTargetValidation() <em>Skip Sub Target Validation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkipSubTargetValidation()
	 * @generated
	 * @ordered
	 */
	protected static final String SKIP_SUB_TARGET_VALIDATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSkipSubTargetValidation() <em>Skip Sub Target Validation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSkipSubTargetValidation()
	 * @generated
	 * @ordered
	 */
	protected String skipSubTargetValidation = SKIP_SUB_TARGET_VALIDATION_EDEFAULT;

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
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, CardsPackage.TARGET__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariable() {
		return getGroup().list(CardsPackage.Literals.TARGET__VARIABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variable> getVariable2() {
		return getGroup().list(CardsPackage.Literals.TARGET__VARIABLE2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Condition> getCondition() {
		return getGroup().list(CardsPackage.Literals.TARGET__CONDITION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Option> getOption() {
		return getGroup().list(CardsPackage.Literals.TARGET__OPTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CardType> getCardType() {
		return getGroup().list(CardsPackage.Literals.TARGET__CARD_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CardFilter> getCardFilter() {
		return getGroup().list(CardsPackage.Literals.TARGET__CARD_FILTER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Trigger> getTrigger() {
		return getGroup().list(CardsPackage.Literals.TARGET__TRIGGER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Effect> getEffect() {
		return getGroup().list(CardsPackage.Literals.TARGET__EFFECT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Subgroup> getSubgroup() {
		return getGroup().list(CardsPackage.Literals.TARGET__SUBGROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BattlegroundFilter> getBattlegroundFilter() {
		return getGroup().list(CardsPackage.Literals.TARGET__BATTLEGROUND_FILTER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAllowDuplicate() {
		return allowDuplicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowDuplicate(String newAllowDuplicate) {
		String oldAllowDuplicate = allowDuplicate;
		allowDuplicate = newAllowDuplicate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.TARGET__ALLOW_DUPLICATE, oldAllowDuplicate, allowDuplicate));
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
	public String getAmountVisible() {
		return amountVisible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmountVisible(String newAmountVisible) {
		String oldAmountVisible = amountVisible;
		amountVisible = newAmountVisible;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.TARGET__AMOUNT_VISIBLE, oldAmountVisible, amountVisible));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAutoTakeFirstInputs() {
		return autoTakeFirstInputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoTakeFirstInputs(String newAutoTakeFirstInputs) {
		String oldAutoTakeFirstInputs = autoTakeFirstInputs;
		autoTakeFirstInputs = newAutoTakeFirstInputs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.TARGET__AUTO_TAKE_FIRST_INPUTS, oldAutoTakeFirstInputs, autoTakeFirstInputs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBattlegroundPositionState() {
		return battlegroundPositionState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBattlegroundPositionState(String newBattlegroundPositionState) {
		String oldBattlegroundPositionState = battlegroundPositionState;
		battlegroundPositionState = newBattlegroundPositionState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.TARGET__BATTLEGROUND_POSITION_STATE, oldBattlegroundPositionState, battlegroundPositionState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCancelable() {
		return cancelable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCancelable(String newCancelable) {
		String oldCancelable = cancelable;
		cancelable = newCancelable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.TARGET__CANCELABLE, oldCancelable, cancelable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCantTargetOccupant() {
		return cantTargetOccupant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCantTargetOccupant(String newCantTargetOccupant) {
		String oldCantTargetOccupant = cantTargetOccupant;
		cantTargetOccupant = newCantTargetOccupant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.TARGET__CANT_TARGET_OCCUPANT, oldCantTargetOccupant, cantTargetOccupant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCantTargetParent() {
		return cantTargetParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCantTargetParent(String newCantTargetParent) {
		String oldCantTargetParent = cantTargetParent;
		cantTargetParent = newCantTargetParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.TARGET__CANT_TARGET_PARENT, oldCantTargetParent, cantTargetParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCantTargetPrevious() {
		return cantTargetPrevious;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCantTargetPrevious(String newCantTargetPrevious) {
		String oldCantTargetPrevious = cantTargetPrevious;
		cantTargetPrevious = newCantTargetPrevious;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.TARGET__CANT_TARGET_PREVIOUS, oldCantTargetPrevious, cantTargetPrevious));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCantTargetSelf() {
		return cantTargetSelf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCantTargetSelf(String newCantTargetSelf) {
		String oldCantTargetSelf = cantTargetSelf;
		cantTargetSelf = newCantTargetSelf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.TARGET__CANT_TARGET_SELF, oldCantTargetSelf, cantTargetSelf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCardType1() {
		return cardType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardType1(String newCardType1) {
		String oldCardType1 = cardType1;
		cardType1 = newCardType1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.TARGET__CARD_TYPE1, oldCardType1, cardType1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDontUpdateAfterExecution() {
		return dontUpdateAfterExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDontUpdateAfterExecution(String newDontUpdateAfterExecution) {
		String oldDontUpdateAfterExecution = dontUpdateAfterExecution;
		dontUpdateAfterExecution = newDontUpdateAfterExecution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.TARGET__DONT_UPDATE_AFTER_EXECUTION, oldDontUpdateAfterExecution, dontUpdateAfterExecution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExceptFromTrigger() {
		return exceptFromTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExceptFromTrigger(String newExceptFromTrigger) {
		String oldExceptFromTrigger = exceptFromTrigger;
		exceptFromTrigger = newExceptFromTrigger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.TARGET__EXCEPT_FROM_TRIGGER, oldExceptFromTrigger, exceptFromTrigger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExcludeUnique() {
		return excludeUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExcludeUnique(String newExcludeUnique) {
		String oldExcludeUnique = excludeUnique;
		excludeUnique = newExcludeUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.TARGET__EXCLUDE_UNIQUE, oldExcludeUnique, excludeUnique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getForceExecute() {
		return forceExecute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForceExecute(String newForceExecute) {
		String oldForceExecute = forceExecute;
		forceExecute = newForceExecute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.TARGET__FORCE_EXECUTE, oldForceExecute, forceExecute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIgnoreWard() {
		return ignoreWard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIgnoreWard(String newIgnoreWard) {
		String oldIgnoreWard = ignoreWard;
		ignoreWard = newIgnoreWard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.TARGET__IGNORE_WARD, oldIgnoreWard, ignoreWard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInputOnExec() {
		return inputOnExec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputOnExec(String newInputOnExec) {
		String oldInputOnExec = inputOnExec;
		inputOnExec = newInputOnExec;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.TARGET__INPUT_ON_EXEC, oldInputOnExec, inputOnExec));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMinAmount() {
		return minAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinAmount(String newMinAmount) {
		String oldMinAmount = minAmount;
		minAmount = newMinAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.TARGET__MIN_AMOUNT, oldMinAmount, minAmount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNeedActivation() {
		return needActivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNeedActivation(String newNeedActivation) {
		String oldNeedActivation = needActivation;
		needActivation = newNeedActivation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.TARGET__NEED_ACTIVATION, oldNeedActivation, needActivation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOption1() {
		return option1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOption1(String newOption1) {
		String oldOption1 = option1;
		option1 = newOption1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.TARGET__OPTION1, oldOption1, option1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPersistent() {
		return persistent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersistent(String newPersistent) {
		String oldPersistent = persistent;
		persistent = newPersistent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.TARGET__PERSISTENT, oldPersistent, persistent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRandom() {
		return random;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRandom(String newRandom) {
		String oldRandom = random;
		random = newRandom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.TARGET__RANDOM, oldRandom, random));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRevealToOther() {
		return revealToOther;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevealToOther(String newRevealToOther) {
		String oldRevealToOther = revealToOther;
		revealToOther = newRevealToOther;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.TARGET__REVEAL_TO_OTHER, oldRevealToOther, revealToOther));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShape() {
		return shape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShape(String newShape) {
		String oldShape = shape;
		shape = newShape;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.TARGET__SHAPE, oldShape, shape));
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
	public String getSkipNextTargetValidation() {
		return skipNextTargetValidation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSkipNextTargetValidation(String newSkipNextTargetValidation) {
		String oldSkipNextTargetValidation = skipNextTargetValidation;
		skipNextTargetValidation = newSkipNextTargetValidation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.TARGET__SKIP_NEXT_TARGET_VALIDATION, oldSkipNextTargetValidation, skipNextTargetValidation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSkipSubTargetValidation() {
		return skipSubTargetValidation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSkipSubTargetValidation(String newSkipSubTargetValidation) {
		String oldSkipSubTargetValidation = skipSubTargetValidation;
		skipSubTargetValidation = newSkipSubTargetValidation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.TARGET__SKIP_SUB_TARGET_VALIDATION, oldSkipSubTargetValidation, skipSubTargetValidation));
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
			case CardsPackage.TARGET__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case CardsPackage.TARGET__VARIABLE:
				return ((InternalEList<?>)getVariable()).basicRemove(otherEnd, msgs);
			case CardsPackage.TARGET__VARIABLE2:
				return ((InternalEList<?>)getVariable2()).basicRemove(otherEnd, msgs);
			case CardsPackage.TARGET__CONDITION:
				return ((InternalEList<?>)getCondition()).basicRemove(otherEnd, msgs);
			case CardsPackage.TARGET__OPTION:
				return ((InternalEList<?>)getOption()).basicRemove(otherEnd, msgs);
			case CardsPackage.TARGET__CARD_TYPE:
				return ((InternalEList<?>)getCardType()).basicRemove(otherEnd, msgs);
			case CardsPackage.TARGET__CARD_FILTER:
				return ((InternalEList<?>)getCardFilter()).basicRemove(otherEnd, msgs);
			case CardsPackage.TARGET__TRIGGER:
				return ((InternalEList<?>)getTrigger()).basicRemove(otherEnd, msgs);
			case CardsPackage.TARGET__EFFECT:
				return ((InternalEList<?>)getEffect()).basicRemove(otherEnd, msgs);
			case CardsPackage.TARGET__SUBGROUP:
				return ((InternalEList<?>)getSubgroup()).basicRemove(otherEnd, msgs);
			case CardsPackage.TARGET__BATTLEGROUND_FILTER:
				return ((InternalEList<?>)getBattlegroundFilter()).basicRemove(otherEnd, msgs);
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
			case CardsPackage.TARGET__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case CardsPackage.TARGET__VARIABLE:
				return getVariable();
			case CardsPackage.TARGET__VARIABLE2:
				return getVariable2();
			case CardsPackage.TARGET__CONDITION:
				return getCondition();
			case CardsPackage.TARGET__OPTION:
				return getOption();
			case CardsPackage.TARGET__CARD_TYPE:
				return getCardType();
			case CardsPackage.TARGET__CARD_FILTER:
				return getCardFilter();
			case CardsPackage.TARGET__TRIGGER:
				return getTrigger();
			case CardsPackage.TARGET__EFFECT:
				return getEffect();
			case CardsPackage.TARGET__SUBGROUP:
				return getSubgroup();
			case CardsPackage.TARGET__BATTLEGROUND_FILTER:
				return getBattlegroundFilter();
			case CardsPackage.TARGET__ALLOW_DUPLICATE:
				return getAllowDuplicate();
			case CardsPackage.TARGET__AMOUNT:
				return getAmount();
			case CardsPackage.TARGET__AMOUNT_VISIBLE:
				return getAmountVisible();
			case CardsPackage.TARGET__AUTO_TAKE_FIRST_INPUTS:
				return getAutoTakeFirstInputs();
			case CardsPackage.TARGET__BATTLEGROUND_POSITION_STATE:
				return getBattlegroundPositionState();
			case CardsPackage.TARGET__CANCELABLE:
				return getCancelable();
			case CardsPackage.TARGET__CANT_TARGET_OCCUPANT:
				return getCantTargetOccupant();
			case CardsPackage.TARGET__CANT_TARGET_PARENT:
				return getCantTargetParent();
			case CardsPackage.TARGET__CANT_TARGET_PREVIOUS:
				return getCantTargetPrevious();
			case CardsPackage.TARGET__CANT_TARGET_SELF:
				return getCantTargetSelf();
			case CardsPackage.TARGET__CARD_TYPE1:
				return getCardType1();
			case CardsPackage.TARGET__DONT_UPDATE_AFTER_EXECUTION:
				return getDontUpdateAfterExecution();
			case CardsPackage.TARGET__EXCEPT_FROM_TRIGGER:
				return getExceptFromTrigger();
			case CardsPackage.TARGET__EXCLUDE_UNIQUE:
				return getExcludeUnique();
			case CardsPackage.TARGET__FORCE_EXECUTE:
				return getForceExecute();
			case CardsPackage.TARGET__IGNORE_WARD:
				return getIgnoreWard();
			case CardsPackage.TARGET__INPUT_ON_EXEC:
				return getInputOnExec();
			case CardsPackage.TARGET__MIN_AMOUNT:
				return getMinAmount();
			case CardsPackage.TARGET__NEED_ACTIVATION:
				return getNeedActivation();
			case CardsPackage.TARGET__OPTION1:
				return getOption1();
			case CardsPackage.TARGET__PERSISTENT:
				return getPersistent();
			case CardsPackage.TARGET__RANDOM:
				return getRandom();
			case CardsPackage.TARGET__REVEAL_TO_OTHER:
				return getRevealToOther();
			case CardsPackage.TARGET__SHAPE:
				return getShape();
			case CardsPackage.TARGET__SIDE:
				return getSide();
			case CardsPackage.TARGET__SKIP_NEXT_TARGET_VALIDATION:
				return getSkipNextTargetValidation();
			case CardsPackage.TARGET__SKIP_SUB_TARGET_VALIDATION:
				return getSkipSubTargetValidation();
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CardsPackage.TARGET__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case CardsPackage.TARGET__VARIABLE:
				getVariable().clear();
				getVariable().addAll((Collection<? extends Variable>)newValue);
				return;
			case CardsPackage.TARGET__VARIABLE2:
				getVariable2().clear();
				getVariable2().addAll((Collection<? extends Variable>)newValue);
				return;
			case CardsPackage.TARGET__CONDITION:
				getCondition().clear();
				getCondition().addAll((Collection<? extends Condition>)newValue);
				return;
			case CardsPackage.TARGET__OPTION:
				getOption().clear();
				getOption().addAll((Collection<? extends Option>)newValue);
				return;
			case CardsPackage.TARGET__CARD_TYPE:
				getCardType().clear();
				getCardType().addAll((Collection<? extends CardType>)newValue);
				return;
			case CardsPackage.TARGET__CARD_FILTER:
				getCardFilter().clear();
				getCardFilter().addAll((Collection<? extends CardFilter>)newValue);
				return;
			case CardsPackage.TARGET__TRIGGER:
				getTrigger().clear();
				getTrigger().addAll((Collection<? extends Trigger>)newValue);
				return;
			case CardsPackage.TARGET__EFFECT:
				getEffect().clear();
				getEffect().addAll((Collection<? extends Effect>)newValue);
				return;
			case CardsPackage.TARGET__SUBGROUP:
				getSubgroup().clear();
				getSubgroup().addAll((Collection<? extends Subgroup>)newValue);
				return;
			case CardsPackage.TARGET__BATTLEGROUND_FILTER:
				getBattlegroundFilter().clear();
				getBattlegroundFilter().addAll((Collection<? extends BattlegroundFilter>)newValue);
				return;
			case CardsPackage.TARGET__ALLOW_DUPLICATE:
				setAllowDuplicate((String)newValue);
				return;
			case CardsPackage.TARGET__AMOUNT:
				setAmount((String)newValue);
				return;
			case CardsPackage.TARGET__AMOUNT_VISIBLE:
				setAmountVisible((String)newValue);
				return;
			case CardsPackage.TARGET__AUTO_TAKE_FIRST_INPUTS:
				setAutoTakeFirstInputs((String)newValue);
				return;
			case CardsPackage.TARGET__BATTLEGROUND_POSITION_STATE:
				setBattlegroundPositionState((String)newValue);
				return;
			case CardsPackage.TARGET__CANCELABLE:
				setCancelable((String)newValue);
				return;
			case CardsPackage.TARGET__CANT_TARGET_OCCUPANT:
				setCantTargetOccupant((String)newValue);
				return;
			case CardsPackage.TARGET__CANT_TARGET_PARENT:
				setCantTargetParent((String)newValue);
				return;
			case CardsPackage.TARGET__CANT_TARGET_PREVIOUS:
				setCantTargetPrevious((String)newValue);
				return;
			case CardsPackage.TARGET__CANT_TARGET_SELF:
				setCantTargetSelf((String)newValue);
				return;
			case CardsPackage.TARGET__CARD_TYPE1:
				setCardType1((String)newValue);
				return;
			case CardsPackage.TARGET__DONT_UPDATE_AFTER_EXECUTION:
				setDontUpdateAfterExecution((String)newValue);
				return;
			case CardsPackage.TARGET__EXCEPT_FROM_TRIGGER:
				setExceptFromTrigger((String)newValue);
				return;
			case CardsPackage.TARGET__EXCLUDE_UNIQUE:
				setExcludeUnique((String)newValue);
				return;
			case CardsPackage.TARGET__FORCE_EXECUTE:
				setForceExecute((String)newValue);
				return;
			case CardsPackage.TARGET__IGNORE_WARD:
				setIgnoreWard((String)newValue);
				return;
			case CardsPackage.TARGET__INPUT_ON_EXEC:
				setInputOnExec((String)newValue);
				return;
			case CardsPackage.TARGET__MIN_AMOUNT:
				setMinAmount((String)newValue);
				return;
			case CardsPackage.TARGET__NEED_ACTIVATION:
				setNeedActivation((String)newValue);
				return;
			case CardsPackage.TARGET__OPTION1:
				setOption1((String)newValue);
				return;
			case CardsPackage.TARGET__PERSISTENT:
				setPersistent((String)newValue);
				return;
			case CardsPackage.TARGET__RANDOM:
				setRandom((String)newValue);
				return;
			case CardsPackage.TARGET__REVEAL_TO_OTHER:
				setRevealToOther((String)newValue);
				return;
			case CardsPackage.TARGET__SHAPE:
				setShape((String)newValue);
				return;
			case CardsPackage.TARGET__SIDE:
				setSide((String)newValue);
				return;
			case CardsPackage.TARGET__SKIP_NEXT_TARGET_VALIDATION:
				setSkipNextTargetValidation((String)newValue);
				return;
			case CardsPackage.TARGET__SKIP_SUB_TARGET_VALIDATION:
				setSkipSubTargetValidation((String)newValue);
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
			case CardsPackage.TARGET__GROUP:
				getGroup().clear();
				return;
			case CardsPackage.TARGET__VARIABLE:
				getVariable().clear();
				return;
			case CardsPackage.TARGET__VARIABLE2:
				getVariable2().clear();
				return;
			case CardsPackage.TARGET__CONDITION:
				getCondition().clear();
				return;
			case CardsPackage.TARGET__OPTION:
				getOption().clear();
				return;
			case CardsPackage.TARGET__CARD_TYPE:
				getCardType().clear();
				return;
			case CardsPackage.TARGET__CARD_FILTER:
				getCardFilter().clear();
				return;
			case CardsPackage.TARGET__TRIGGER:
				getTrigger().clear();
				return;
			case CardsPackage.TARGET__EFFECT:
				getEffect().clear();
				return;
			case CardsPackage.TARGET__SUBGROUP:
				getSubgroup().clear();
				return;
			case CardsPackage.TARGET__BATTLEGROUND_FILTER:
				getBattlegroundFilter().clear();
				return;
			case CardsPackage.TARGET__ALLOW_DUPLICATE:
				setAllowDuplicate(ALLOW_DUPLICATE_EDEFAULT);
				return;
			case CardsPackage.TARGET__AMOUNT:
				setAmount(AMOUNT_EDEFAULT);
				return;
			case CardsPackage.TARGET__AMOUNT_VISIBLE:
				setAmountVisible(AMOUNT_VISIBLE_EDEFAULT);
				return;
			case CardsPackage.TARGET__AUTO_TAKE_FIRST_INPUTS:
				setAutoTakeFirstInputs(AUTO_TAKE_FIRST_INPUTS_EDEFAULT);
				return;
			case CardsPackage.TARGET__BATTLEGROUND_POSITION_STATE:
				setBattlegroundPositionState(BATTLEGROUND_POSITION_STATE_EDEFAULT);
				return;
			case CardsPackage.TARGET__CANCELABLE:
				setCancelable(CANCELABLE_EDEFAULT);
				return;
			case CardsPackage.TARGET__CANT_TARGET_OCCUPANT:
				setCantTargetOccupant(CANT_TARGET_OCCUPANT_EDEFAULT);
				return;
			case CardsPackage.TARGET__CANT_TARGET_PARENT:
				setCantTargetParent(CANT_TARGET_PARENT_EDEFAULT);
				return;
			case CardsPackage.TARGET__CANT_TARGET_PREVIOUS:
				setCantTargetPrevious(CANT_TARGET_PREVIOUS_EDEFAULT);
				return;
			case CardsPackage.TARGET__CANT_TARGET_SELF:
				setCantTargetSelf(CANT_TARGET_SELF_EDEFAULT);
				return;
			case CardsPackage.TARGET__CARD_TYPE1:
				setCardType1(CARD_TYPE1_EDEFAULT);
				return;
			case CardsPackage.TARGET__DONT_UPDATE_AFTER_EXECUTION:
				setDontUpdateAfterExecution(DONT_UPDATE_AFTER_EXECUTION_EDEFAULT);
				return;
			case CardsPackage.TARGET__EXCEPT_FROM_TRIGGER:
				setExceptFromTrigger(EXCEPT_FROM_TRIGGER_EDEFAULT);
				return;
			case CardsPackage.TARGET__EXCLUDE_UNIQUE:
				setExcludeUnique(EXCLUDE_UNIQUE_EDEFAULT);
				return;
			case CardsPackage.TARGET__FORCE_EXECUTE:
				setForceExecute(FORCE_EXECUTE_EDEFAULT);
				return;
			case CardsPackage.TARGET__IGNORE_WARD:
				setIgnoreWard(IGNORE_WARD_EDEFAULT);
				return;
			case CardsPackage.TARGET__INPUT_ON_EXEC:
				setInputOnExec(INPUT_ON_EXEC_EDEFAULT);
				return;
			case CardsPackage.TARGET__MIN_AMOUNT:
				setMinAmount(MIN_AMOUNT_EDEFAULT);
				return;
			case CardsPackage.TARGET__NEED_ACTIVATION:
				setNeedActivation(NEED_ACTIVATION_EDEFAULT);
				return;
			case CardsPackage.TARGET__OPTION1:
				setOption1(OPTION1_EDEFAULT);
				return;
			case CardsPackage.TARGET__PERSISTENT:
				setPersistent(PERSISTENT_EDEFAULT);
				return;
			case CardsPackage.TARGET__RANDOM:
				setRandom(RANDOM_EDEFAULT);
				return;
			case CardsPackage.TARGET__REVEAL_TO_OTHER:
				setRevealToOther(REVEAL_TO_OTHER_EDEFAULT);
				return;
			case CardsPackage.TARGET__SHAPE:
				setShape(SHAPE_EDEFAULT);
				return;
			case CardsPackage.TARGET__SIDE:
				setSide(SIDE_EDEFAULT);
				return;
			case CardsPackage.TARGET__SKIP_NEXT_TARGET_VALIDATION:
				setSkipNextTargetValidation(SKIP_NEXT_TARGET_VALIDATION_EDEFAULT);
				return;
			case CardsPackage.TARGET__SKIP_SUB_TARGET_VALIDATION:
				setSkipSubTargetValidation(SKIP_SUB_TARGET_VALIDATION_EDEFAULT);
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
			case CardsPackage.TARGET__GROUP:
				return group != null && !group.isEmpty();
			case CardsPackage.TARGET__VARIABLE:
				return !getVariable().isEmpty();
			case CardsPackage.TARGET__VARIABLE2:
				return !getVariable2().isEmpty();
			case CardsPackage.TARGET__CONDITION:
				return !getCondition().isEmpty();
			case CardsPackage.TARGET__OPTION:
				return !getOption().isEmpty();
			case CardsPackage.TARGET__CARD_TYPE:
				return !getCardType().isEmpty();
			case CardsPackage.TARGET__CARD_FILTER:
				return !getCardFilter().isEmpty();
			case CardsPackage.TARGET__TRIGGER:
				return !getTrigger().isEmpty();
			case CardsPackage.TARGET__EFFECT:
				return !getEffect().isEmpty();
			case CardsPackage.TARGET__SUBGROUP:
				return !getSubgroup().isEmpty();
			case CardsPackage.TARGET__BATTLEGROUND_FILTER:
				return !getBattlegroundFilter().isEmpty();
			case CardsPackage.TARGET__ALLOW_DUPLICATE:
				return ALLOW_DUPLICATE_EDEFAULT == null ? allowDuplicate != null : !ALLOW_DUPLICATE_EDEFAULT.equals(allowDuplicate);
			case CardsPackage.TARGET__AMOUNT:
				return AMOUNT_EDEFAULT == null ? amount != null : !AMOUNT_EDEFAULT.equals(amount);
			case CardsPackage.TARGET__AMOUNT_VISIBLE:
				return AMOUNT_VISIBLE_EDEFAULT == null ? amountVisible != null : !AMOUNT_VISIBLE_EDEFAULT.equals(amountVisible);
			case CardsPackage.TARGET__AUTO_TAKE_FIRST_INPUTS:
				return AUTO_TAKE_FIRST_INPUTS_EDEFAULT == null ? autoTakeFirstInputs != null : !AUTO_TAKE_FIRST_INPUTS_EDEFAULT.equals(autoTakeFirstInputs);
			case CardsPackage.TARGET__BATTLEGROUND_POSITION_STATE:
				return BATTLEGROUND_POSITION_STATE_EDEFAULT == null ? battlegroundPositionState != null : !BATTLEGROUND_POSITION_STATE_EDEFAULT.equals(battlegroundPositionState);
			case CardsPackage.TARGET__CANCELABLE:
				return CANCELABLE_EDEFAULT == null ? cancelable != null : !CANCELABLE_EDEFAULT.equals(cancelable);
			case CardsPackage.TARGET__CANT_TARGET_OCCUPANT:
				return CANT_TARGET_OCCUPANT_EDEFAULT == null ? cantTargetOccupant != null : !CANT_TARGET_OCCUPANT_EDEFAULT.equals(cantTargetOccupant);
			case CardsPackage.TARGET__CANT_TARGET_PARENT:
				return CANT_TARGET_PARENT_EDEFAULT == null ? cantTargetParent != null : !CANT_TARGET_PARENT_EDEFAULT.equals(cantTargetParent);
			case CardsPackage.TARGET__CANT_TARGET_PREVIOUS:
				return CANT_TARGET_PREVIOUS_EDEFAULT == null ? cantTargetPrevious != null : !CANT_TARGET_PREVIOUS_EDEFAULT.equals(cantTargetPrevious);
			case CardsPackage.TARGET__CANT_TARGET_SELF:
				return CANT_TARGET_SELF_EDEFAULT == null ? cantTargetSelf != null : !CANT_TARGET_SELF_EDEFAULT.equals(cantTargetSelf);
			case CardsPackage.TARGET__CARD_TYPE1:
				return CARD_TYPE1_EDEFAULT == null ? cardType1 != null : !CARD_TYPE1_EDEFAULT.equals(cardType1);
			case CardsPackage.TARGET__DONT_UPDATE_AFTER_EXECUTION:
				return DONT_UPDATE_AFTER_EXECUTION_EDEFAULT == null ? dontUpdateAfterExecution != null : !DONT_UPDATE_AFTER_EXECUTION_EDEFAULT.equals(dontUpdateAfterExecution);
			case CardsPackage.TARGET__EXCEPT_FROM_TRIGGER:
				return EXCEPT_FROM_TRIGGER_EDEFAULT == null ? exceptFromTrigger != null : !EXCEPT_FROM_TRIGGER_EDEFAULT.equals(exceptFromTrigger);
			case CardsPackage.TARGET__EXCLUDE_UNIQUE:
				return EXCLUDE_UNIQUE_EDEFAULT == null ? excludeUnique != null : !EXCLUDE_UNIQUE_EDEFAULT.equals(excludeUnique);
			case CardsPackage.TARGET__FORCE_EXECUTE:
				return FORCE_EXECUTE_EDEFAULT == null ? forceExecute != null : !FORCE_EXECUTE_EDEFAULT.equals(forceExecute);
			case CardsPackage.TARGET__IGNORE_WARD:
				return IGNORE_WARD_EDEFAULT == null ? ignoreWard != null : !IGNORE_WARD_EDEFAULT.equals(ignoreWard);
			case CardsPackage.TARGET__INPUT_ON_EXEC:
				return INPUT_ON_EXEC_EDEFAULT == null ? inputOnExec != null : !INPUT_ON_EXEC_EDEFAULT.equals(inputOnExec);
			case CardsPackage.TARGET__MIN_AMOUNT:
				return MIN_AMOUNT_EDEFAULT == null ? minAmount != null : !MIN_AMOUNT_EDEFAULT.equals(minAmount);
			case CardsPackage.TARGET__NEED_ACTIVATION:
				return NEED_ACTIVATION_EDEFAULT == null ? needActivation != null : !NEED_ACTIVATION_EDEFAULT.equals(needActivation);
			case CardsPackage.TARGET__OPTION1:
				return OPTION1_EDEFAULT == null ? option1 != null : !OPTION1_EDEFAULT.equals(option1);
			case CardsPackage.TARGET__PERSISTENT:
				return PERSISTENT_EDEFAULT == null ? persistent != null : !PERSISTENT_EDEFAULT.equals(persistent);
			case CardsPackage.TARGET__RANDOM:
				return RANDOM_EDEFAULT == null ? random != null : !RANDOM_EDEFAULT.equals(random);
			case CardsPackage.TARGET__REVEAL_TO_OTHER:
				return REVEAL_TO_OTHER_EDEFAULT == null ? revealToOther != null : !REVEAL_TO_OTHER_EDEFAULT.equals(revealToOther);
			case CardsPackage.TARGET__SHAPE:
				return SHAPE_EDEFAULT == null ? shape != null : !SHAPE_EDEFAULT.equals(shape);
			case CardsPackage.TARGET__SIDE:
				return SIDE_EDEFAULT == null ? side != null : !SIDE_EDEFAULT.equals(side);
			case CardsPackage.TARGET__SKIP_NEXT_TARGET_VALIDATION:
				return SKIP_NEXT_TARGET_VALIDATION_EDEFAULT == null ? skipNextTargetValidation != null : !SKIP_NEXT_TARGET_VALIDATION_EDEFAULT.equals(skipNextTargetValidation);
			case CardsPackage.TARGET__SKIP_SUB_TARGET_VALIDATION:
				return SKIP_SUB_TARGET_VALIDATION_EDEFAULT == null ? skipSubTargetValidation != null : !SKIP_SUB_TARGET_VALIDATION_EDEFAULT.equals(skipSubTargetValidation);
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
		result.append(" (group: ");
		result.append(group);
		result.append(", allowDuplicate: ");
		result.append(allowDuplicate);
		result.append(", amount: ");
		result.append(amount);
		result.append(", amountVisible: ");
		result.append(amountVisible);
		result.append(", autoTakeFirstInputs: ");
		result.append(autoTakeFirstInputs);
		result.append(", battlegroundPositionState: ");
		result.append(battlegroundPositionState);
		result.append(", cancelable: ");
		result.append(cancelable);
		result.append(", cantTargetOccupant: ");
		result.append(cantTargetOccupant);
		result.append(", cantTargetParent: ");
		result.append(cantTargetParent);
		result.append(", cantTargetPrevious: ");
		result.append(cantTargetPrevious);
		result.append(", cantTargetSelf: ");
		result.append(cantTargetSelf);
		result.append(", cardType1: ");
		result.append(cardType1);
		result.append(", dontUpdateAfterExecution: ");
		result.append(dontUpdateAfterExecution);
		result.append(", exceptFromTrigger: ");
		result.append(exceptFromTrigger);
		result.append(", excludeUnique: ");
		result.append(excludeUnique);
		result.append(", forceExecute: ");
		result.append(forceExecute);
		result.append(", ignoreWard: ");
		result.append(ignoreWard);
		result.append(", inputOnExec: ");
		result.append(inputOnExec);
		result.append(", minAmount: ");
		result.append(minAmount);
		result.append(", needActivation: ");
		result.append(needActivation);
		result.append(", option1: ");
		result.append(option1);
		result.append(", persistent: ");
		result.append(persistent);
		result.append(", random: ");
		result.append(random);
		result.append(", revealToOther: ");
		result.append(revealToOther);
		result.append(", shape: ");
		result.append(shape);
		result.append(", side: ");
		result.append(side);
		result.append(", skipNextTargetValidation: ");
		result.append(skipNextTargetValidation);
		result.append(", skipSubTargetValidation: ");
		result.append(skipSubTargetValidation);
		result.append(", zone: ");
		result.append(zone);
		result.append(')');
		return result.toString();
	}

} //TargetImpl
