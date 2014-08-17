/**
 */
package net.mmyumu.docdoc.model.Cards.impl;

import net.mmyumu.docdoc.model.Cards.CardFilter;
import net.mmyumu.docdoc.model.Cards.CardsPackage;
import net.mmyumu.docdoc.model.Cards.Condition;
import net.mmyumu.docdoc.model.Cards.Effect;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Effect</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.EffectImpl#getCardFilter <em>Card Filter</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.EffectImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.EffectImpl#getAbility <em>Ability</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.EffectImpl#getBottom <em>Bottom</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.EffectImpl#getCancelDestination <em>Cancel Destination</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.EffectImpl#getCantTargetParent <em>Cant Target Parent</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.EffectImpl#getCardHolder <em>Card Holder</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.EffectImpl#getCounterType <em>Counter Type</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.EffectImpl#getDamageExcludeFlags <em>Damage Exclude Flags</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.EffectImpl#getDamageFlags <em>Damage Flags</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.EffectImpl#getDamageIncludeFlags <em>Damage Include Flags</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.EffectImpl#getDamageLethalSchools <em>Damage Lethal Schools</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.EffectImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.EffectImpl#getDontGenerateTargetPosition <em>Dont Generate Target Position</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.EffectImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.EffectImpl#getEpicEnrage <em>Epic Enrage</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.EffectImpl#getEvaluationOrder <em>Evaluation Order</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.EffectImpl#getFakeAdditionalCost <em>Fake Additional Cost</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.EffectImpl#getForce <em>Force</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.EffectImpl#getFree <em>Free</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.EffectImpl#getGlobalEffectType <em>Global Effect Type</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.EffectImpl#getLevelType <em>Level Type</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.EffectImpl#getMoveFromLastKnownParent <em>Move From Last Known Parent</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.EffectImpl#getName <em>Name</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.EffectImpl#getNewDuration <em>New Duration</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.EffectImpl#getOwnerAbility <em>Owner Ability</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.EffectImpl#getPersistent <em>Persistent</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.EffectImpl#getPlayEffectType <em>Play Effect Type</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.EffectImpl#getRemove <em>Remove</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.EffectImpl#getRequireLevel <em>Require Level</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.EffectImpl#getRevealToOther <em>Reveal To Other</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.EffectImpl#getReverse <em>Reverse</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.EffectImpl#getShuffle <em>Shuffle</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.EffectImpl#getSide <em>Side</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.EffectImpl#getSubType <em>Sub Type</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.EffectImpl#getType <em>Type</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.EffectImpl#getUnfreeze <em>Unfreeze</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.impl.EffectImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EffectImpl extends MinimalEObjectImpl.Container implements Effect {
	/**
	 * The cached value of the '{@link #getCardFilter() <em>Card Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardFilter()
	 * @generated
	 * @ordered
	 */
	protected CardFilter cardFilter;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition condition;

	/**
	 * The default value of the '{@link #getAbility() <em>Ability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbility()
	 * @generated
	 * @ordered
	 */
	protected static final String ABILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAbility() <em>Ability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbility()
	 * @generated
	 * @ordered
	 */
	protected String ability = ABILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getBottom() <em>Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottom()
	 * @generated
	 * @ordered
	 */
	protected static final String BOTTOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBottom() <em>Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottom()
	 * @generated
	 * @ordered
	 */
	protected String bottom = BOTTOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getCancelDestination() <em>Cancel Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancelDestination()
	 * @generated
	 * @ordered
	 */
	protected static final String CANCEL_DESTINATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCancelDestination() <em>Cancel Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancelDestination()
	 * @generated
	 * @ordered
	 */
	protected String cancelDestination = CANCEL_DESTINATION_EDEFAULT;

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
	 * The default value of the '{@link #getCardHolder() <em>Card Holder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardHolder()
	 * @generated
	 * @ordered
	 */
	protected static final String CARD_HOLDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCardHolder() <em>Card Holder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardHolder()
	 * @generated
	 * @ordered
	 */
	protected String cardHolder = CARD_HOLDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getCounterType() <em>Counter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounterType()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTER_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCounterType() <em>Counter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCounterType()
	 * @generated
	 * @ordered
	 */
	protected String counterType = COUNTER_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDamageExcludeFlags() <em>Damage Exclude Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDamageExcludeFlags()
	 * @generated
	 * @ordered
	 */
	protected static final String DAMAGE_EXCLUDE_FLAGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDamageExcludeFlags() <em>Damage Exclude Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDamageExcludeFlags()
	 * @generated
	 * @ordered
	 */
	protected String damageExcludeFlags = DAMAGE_EXCLUDE_FLAGS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDamageFlags() <em>Damage Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDamageFlags()
	 * @generated
	 * @ordered
	 */
	protected static final String DAMAGE_FLAGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDamageFlags() <em>Damage Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDamageFlags()
	 * @generated
	 * @ordered
	 */
	protected String damageFlags = DAMAGE_FLAGS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDamageIncludeFlags() <em>Damage Include Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDamageIncludeFlags()
	 * @generated
	 * @ordered
	 */
	protected static final String DAMAGE_INCLUDE_FLAGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDamageIncludeFlags() <em>Damage Include Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDamageIncludeFlags()
	 * @generated
	 * @ordered
	 */
	protected String damageIncludeFlags = DAMAGE_INCLUDE_FLAGS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDamageLethalSchools() <em>Damage Lethal Schools</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDamageLethalSchools()
	 * @generated
	 * @ordered
	 */
	protected static final String DAMAGE_LETHAL_SCHOOLS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDamageLethalSchools() <em>Damage Lethal Schools</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDamageLethalSchools()
	 * @generated
	 * @ordered
	 */
	protected String damageLethalSchools = DAMAGE_LETHAL_SCHOOLS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDestination() <em>Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected static final String DESTINATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected String destination = DESTINATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDontGenerateTargetPosition() <em>Dont Generate Target Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDontGenerateTargetPosition()
	 * @generated
	 * @ordered
	 */
	protected static final String DONT_GENERATE_TARGET_POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDontGenerateTargetPosition() <em>Dont Generate Target Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDontGenerateTargetPosition()
	 * @generated
	 * @ordered
	 */
	protected String dontGenerateTargetPosition = DONT_GENERATE_TARGET_POSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final String DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected String duration = DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getEpicEnrage() <em>Epic Enrage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpicEnrage()
	 * @generated
	 * @ordered
	 */
	protected static final String EPIC_ENRAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEpicEnrage() <em>Epic Enrage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEpicEnrage()
	 * @generated
	 * @ordered
	 */
	protected String epicEnrage = EPIC_ENRAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEvaluationOrder() <em>Evaluation Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluationOrder()
	 * @generated
	 * @ordered
	 */
	protected static final String EVALUATION_ORDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEvaluationOrder() <em>Evaluation Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvaluationOrder()
	 * @generated
	 * @ordered
	 */
	protected String evaluationOrder = EVALUATION_ORDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getFakeAdditionalCost() <em>Fake Additional Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFakeAdditionalCost()
	 * @generated
	 * @ordered
	 */
	protected static final String FAKE_ADDITIONAL_COST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFakeAdditionalCost() <em>Fake Additional Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFakeAdditionalCost()
	 * @generated
	 * @ordered
	 */
	protected String fakeAdditionalCost = FAKE_ADDITIONAL_COST_EDEFAULT;

	/**
	 * The default value of the '{@link #getForce() <em>Force</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForce()
	 * @generated
	 * @ordered
	 */
	protected static final String FORCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForce() <em>Force</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForce()
	 * @generated
	 * @ordered
	 */
	protected String force = FORCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFree() <em>Free</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFree()
	 * @generated
	 * @ordered
	 */
	protected static final String FREE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFree() <em>Free</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFree()
	 * @generated
	 * @ordered
	 */
	protected String free = FREE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGlobalEffectType() <em>Global Effect Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalEffectType()
	 * @generated
	 * @ordered
	 */
	protected static final String GLOBAL_EFFECT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGlobalEffectType() <em>Global Effect Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalEffectType()
	 * @generated
	 * @ordered
	 */
	protected String globalEffectType = GLOBAL_EFFECT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLevelType() <em>Level Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelType()
	 * @generated
	 * @ordered
	 */
	protected static final String LEVEL_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLevelType() <em>Level Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelType()
	 * @generated
	 * @ordered
	 */
	protected String levelType = LEVEL_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMoveFromLastKnownParent() <em>Move From Last Known Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoveFromLastKnownParent()
	 * @generated
	 * @ordered
	 */
	protected static final String MOVE_FROM_LAST_KNOWN_PARENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMoveFromLastKnownParent() <em>Move From Last Known Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMoveFromLastKnownParent()
	 * @generated
	 * @ordered
	 */
	protected String moveFromLastKnownParent = MOVE_FROM_LAST_KNOWN_PARENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNewDuration() <em>New Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewDuration()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNewDuration() <em>New Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewDuration()
	 * @generated
	 * @ordered
	 */
	protected String newDuration = NEW_DURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getOwnerAbility() <em>Owner Ability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnerAbility()
	 * @generated
	 * @ordered
	 */
	protected static final String OWNER_ABILITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOwnerAbility() <em>Owner Ability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnerAbility()
	 * @generated
	 * @ordered
	 */
	protected String ownerAbility = OWNER_ABILITY_EDEFAULT;

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
	 * The default value of the '{@link #getPlayEffectType() <em>Play Effect Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayEffectType()
	 * @generated
	 * @ordered
	 */
	protected static final String PLAY_EFFECT_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPlayEffectType() <em>Play Effect Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayEffectType()
	 * @generated
	 * @ordered
	 */
	protected String playEffectType = PLAY_EFFECT_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemove() <em>Remove</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemove()
	 * @generated
	 * @ordered
	 */
	protected static final String REMOVE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemove() <em>Remove</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemove()
	 * @generated
	 * @ordered
	 */
	protected String remove = REMOVE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequireLevel() <em>Require Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequireLevel()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUIRE_LEVEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequireLevel() <em>Require Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequireLevel()
	 * @generated
	 * @ordered
	 */
	protected String requireLevel = REQUIRE_LEVEL_EDEFAULT;

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
	 * The default value of the '{@link #getReverse() <em>Reverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReverse()
	 * @generated
	 * @ordered
	 */
	protected static final String REVERSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReverse() <em>Reverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReverse()
	 * @generated
	 * @ordered
	 */
	protected String reverse = REVERSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getShuffle() <em>Shuffle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShuffle()
	 * @generated
	 * @ordered
	 */
	protected static final String SHUFFLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShuffle() <em>Shuffle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShuffle()
	 * @generated
	 * @ordered
	 */
	protected String shuffle = SHUFFLE_EDEFAULT;

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
	 * The default value of the '{@link #getSubType() <em>Sub Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubType()
	 * @generated
	 * @ordered
	 */
	protected static final String SUB_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubType() <em>Sub Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubType()
	 * @generated
	 * @ordered
	 */
	protected String subType = SUB_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final String TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected String type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUnfreeze() <em>Unfreeze</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnfreeze()
	 * @generated
	 * @ordered
	 */
	protected static final String UNFREEZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUnfreeze() <em>Unfreeze</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnfreeze()
	 * @generated
	 * @ordered
	 */
	protected String unfreeze = UNFREEZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EffectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CardsPackage.Literals.EFFECT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardFilter getCardFilter() {
		return cardFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCardFilter(CardFilter newCardFilter, NotificationChain msgs) {
		CardFilter oldCardFilter = cardFilter;
		cardFilter = newCardFilter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CardsPackage.EFFECT__CARD_FILTER, oldCardFilter, newCardFilter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardFilter(CardFilter newCardFilter) {
		if (newCardFilter != cardFilter) {
			NotificationChain msgs = null;
			if (cardFilter != null)
				msgs = ((InternalEObject)cardFilter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CardsPackage.EFFECT__CARD_FILTER, null, msgs);
			if (newCardFilter != null)
				msgs = ((InternalEObject)newCardFilter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CardsPackage.EFFECT__CARD_FILTER, null, msgs);
			msgs = basicSetCardFilter(newCardFilter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.EFFECT__CARD_FILTER, newCardFilter, newCardFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition(Condition newCondition, NotificationChain msgs) {
		Condition oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CardsPackage.EFFECT__CONDITION, oldCondition, newCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Condition newCondition) {
		if (newCondition != condition) {
			NotificationChain msgs = null;
			if (condition != null)
				msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CardsPackage.EFFECT__CONDITION, null, msgs);
			if (newCondition != null)
				msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CardsPackage.EFFECT__CONDITION, null, msgs);
			msgs = basicSetCondition(newCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.EFFECT__CONDITION, newCondition, newCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAbility() {
		return ability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbility(String newAbility) {
		String oldAbility = ability;
		ability = newAbility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.EFFECT__ABILITY, oldAbility, ability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBottom() {
		return bottom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBottom(String newBottom) {
		String oldBottom = bottom;
		bottom = newBottom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.EFFECT__BOTTOM, oldBottom, bottom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCancelDestination() {
		return cancelDestination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCancelDestination(String newCancelDestination) {
		String oldCancelDestination = cancelDestination;
		cancelDestination = newCancelDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.EFFECT__CANCEL_DESTINATION, oldCancelDestination, cancelDestination));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.EFFECT__CANT_TARGET_PARENT, oldCantTargetParent, cantTargetParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCardHolder() {
		return cardHolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCardHolder(String newCardHolder) {
		String oldCardHolder = cardHolder;
		cardHolder = newCardHolder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.EFFECT__CARD_HOLDER, oldCardHolder, cardHolder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCounterType() {
		return counterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCounterType(String newCounterType) {
		String oldCounterType = counterType;
		counterType = newCounterType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.EFFECT__COUNTER_TYPE, oldCounterType, counterType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDamageExcludeFlags() {
		return damageExcludeFlags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDamageExcludeFlags(String newDamageExcludeFlags) {
		String oldDamageExcludeFlags = damageExcludeFlags;
		damageExcludeFlags = newDamageExcludeFlags;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.EFFECT__DAMAGE_EXCLUDE_FLAGS, oldDamageExcludeFlags, damageExcludeFlags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDamageFlags() {
		return damageFlags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDamageFlags(String newDamageFlags) {
		String oldDamageFlags = damageFlags;
		damageFlags = newDamageFlags;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.EFFECT__DAMAGE_FLAGS, oldDamageFlags, damageFlags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDamageIncludeFlags() {
		return damageIncludeFlags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDamageIncludeFlags(String newDamageIncludeFlags) {
		String oldDamageIncludeFlags = damageIncludeFlags;
		damageIncludeFlags = newDamageIncludeFlags;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.EFFECT__DAMAGE_INCLUDE_FLAGS, oldDamageIncludeFlags, damageIncludeFlags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDamageLethalSchools() {
		return damageLethalSchools;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDamageLethalSchools(String newDamageLethalSchools) {
		String oldDamageLethalSchools = damageLethalSchools;
		damageLethalSchools = newDamageLethalSchools;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.EFFECT__DAMAGE_LETHAL_SCHOOLS, oldDamageLethalSchools, damageLethalSchools));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestination(String newDestination) {
		String oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.EFFECT__DESTINATION, oldDestination, destination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDontGenerateTargetPosition() {
		return dontGenerateTargetPosition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDontGenerateTargetPosition(String newDontGenerateTargetPosition) {
		String oldDontGenerateTargetPosition = dontGenerateTargetPosition;
		dontGenerateTargetPosition = newDontGenerateTargetPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.EFFECT__DONT_GENERATE_TARGET_POSITION, oldDontGenerateTargetPosition, dontGenerateTargetPosition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(String newDuration) {
		String oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.EFFECT__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEpicEnrage() {
		return epicEnrage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEpicEnrage(String newEpicEnrage) {
		String oldEpicEnrage = epicEnrage;
		epicEnrage = newEpicEnrage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.EFFECT__EPIC_ENRAGE, oldEpicEnrage, epicEnrage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEvaluationOrder() {
		return evaluationOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvaluationOrder(String newEvaluationOrder) {
		String oldEvaluationOrder = evaluationOrder;
		evaluationOrder = newEvaluationOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.EFFECT__EVALUATION_ORDER, oldEvaluationOrder, evaluationOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFakeAdditionalCost() {
		return fakeAdditionalCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFakeAdditionalCost(String newFakeAdditionalCost) {
		String oldFakeAdditionalCost = fakeAdditionalCost;
		fakeAdditionalCost = newFakeAdditionalCost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.EFFECT__FAKE_ADDITIONAL_COST, oldFakeAdditionalCost, fakeAdditionalCost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getForce() {
		return force;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForce(String newForce) {
		String oldForce = force;
		force = newForce;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.EFFECT__FORCE, oldForce, force));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFree() {
		return free;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFree(String newFree) {
		String oldFree = free;
		free = newFree;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.EFFECT__FREE, oldFree, free));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGlobalEffectType() {
		return globalEffectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalEffectType(String newGlobalEffectType) {
		String oldGlobalEffectType = globalEffectType;
		globalEffectType = newGlobalEffectType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.EFFECT__GLOBAL_EFFECT_TYPE, oldGlobalEffectType, globalEffectType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLevelType() {
		return levelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevelType(String newLevelType) {
		String oldLevelType = levelType;
		levelType = newLevelType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.EFFECT__LEVEL_TYPE, oldLevelType, levelType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMoveFromLastKnownParent() {
		return moveFromLastKnownParent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMoveFromLastKnownParent(String newMoveFromLastKnownParent) {
		String oldMoveFromLastKnownParent = moveFromLastKnownParent;
		moveFromLastKnownParent = newMoveFromLastKnownParent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.EFFECT__MOVE_FROM_LAST_KNOWN_PARENT, oldMoveFromLastKnownParent, moveFromLastKnownParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.EFFECT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNewDuration() {
		return newDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewDuration(String newNewDuration) {
		String oldNewDuration = newDuration;
		newDuration = newNewDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.EFFECT__NEW_DURATION, oldNewDuration, newDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOwnerAbility() {
		return ownerAbility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnerAbility(String newOwnerAbility) {
		String oldOwnerAbility = ownerAbility;
		ownerAbility = newOwnerAbility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.EFFECT__OWNER_ABILITY, oldOwnerAbility, ownerAbility));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.EFFECT__PERSISTENT, oldPersistent, persistent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPlayEffectType() {
		return playEffectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlayEffectType(String newPlayEffectType) {
		String oldPlayEffectType = playEffectType;
		playEffectType = newPlayEffectType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.EFFECT__PLAY_EFFECT_TYPE, oldPlayEffectType, playEffectType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRemove() {
		return remove;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemove(String newRemove) {
		String oldRemove = remove;
		remove = newRemove;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.EFFECT__REMOVE, oldRemove, remove));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRequireLevel() {
		return requireLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequireLevel(String newRequireLevel) {
		String oldRequireLevel = requireLevel;
		requireLevel = newRequireLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.EFFECT__REQUIRE_LEVEL, oldRequireLevel, requireLevel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.EFFECT__REVEAL_TO_OTHER, oldRevealToOther, revealToOther));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReverse() {
		return reverse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReverse(String newReverse) {
		String oldReverse = reverse;
		reverse = newReverse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.EFFECT__REVERSE, oldReverse, reverse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShuffle() {
		return shuffle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShuffle(String newShuffle) {
		String oldShuffle = shuffle;
		shuffle = newShuffle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.EFFECT__SHUFFLE, oldShuffle, shuffle));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.EFFECT__SIDE, oldSide, side));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubType() {
		return subType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubType(String newSubType) {
		String oldSubType = subType;
		subType = newSubType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.EFFECT__SUB_TYPE, oldSubType, subType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(String newType) {
		String oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.EFFECT__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUnfreeze() {
		return unfreeze;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnfreeze(String newUnfreeze) {
		String oldUnfreeze = unfreeze;
		unfreeze = newUnfreeze;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.EFFECT__UNFREEZE, oldUnfreeze, unfreeze));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CardsPackage.EFFECT__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CardsPackage.EFFECT__CARD_FILTER:
				return basicSetCardFilter(null, msgs);
			case CardsPackage.EFFECT__CONDITION:
				return basicSetCondition(null, msgs);
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
			case CardsPackage.EFFECT__CARD_FILTER:
				return getCardFilter();
			case CardsPackage.EFFECT__CONDITION:
				return getCondition();
			case CardsPackage.EFFECT__ABILITY:
				return getAbility();
			case CardsPackage.EFFECT__BOTTOM:
				return getBottom();
			case CardsPackage.EFFECT__CANCEL_DESTINATION:
				return getCancelDestination();
			case CardsPackage.EFFECT__CANT_TARGET_PARENT:
				return getCantTargetParent();
			case CardsPackage.EFFECT__CARD_HOLDER:
				return getCardHolder();
			case CardsPackage.EFFECT__COUNTER_TYPE:
				return getCounterType();
			case CardsPackage.EFFECT__DAMAGE_EXCLUDE_FLAGS:
				return getDamageExcludeFlags();
			case CardsPackage.EFFECT__DAMAGE_FLAGS:
				return getDamageFlags();
			case CardsPackage.EFFECT__DAMAGE_INCLUDE_FLAGS:
				return getDamageIncludeFlags();
			case CardsPackage.EFFECT__DAMAGE_LETHAL_SCHOOLS:
				return getDamageLethalSchools();
			case CardsPackage.EFFECT__DESTINATION:
				return getDestination();
			case CardsPackage.EFFECT__DONT_GENERATE_TARGET_POSITION:
				return getDontGenerateTargetPosition();
			case CardsPackage.EFFECT__DURATION:
				return getDuration();
			case CardsPackage.EFFECT__EPIC_ENRAGE:
				return getEpicEnrage();
			case CardsPackage.EFFECT__EVALUATION_ORDER:
				return getEvaluationOrder();
			case CardsPackage.EFFECT__FAKE_ADDITIONAL_COST:
				return getFakeAdditionalCost();
			case CardsPackage.EFFECT__FORCE:
				return getForce();
			case CardsPackage.EFFECT__FREE:
				return getFree();
			case CardsPackage.EFFECT__GLOBAL_EFFECT_TYPE:
				return getGlobalEffectType();
			case CardsPackage.EFFECT__LEVEL_TYPE:
				return getLevelType();
			case CardsPackage.EFFECT__MOVE_FROM_LAST_KNOWN_PARENT:
				return getMoveFromLastKnownParent();
			case CardsPackage.EFFECT__NAME:
				return getName();
			case CardsPackage.EFFECT__NEW_DURATION:
				return getNewDuration();
			case CardsPackage.EFFECT__OWNER_ABILITY:
				return getOwnerAbility();
			case CardsPackage.EFFECT__PERSISTENT:
				return getPersistent();
			case CardsPackage.EFFECT__PLAY_EFFECT_TYPE:
				return getPlayEffectType();
			case CardsPackage.EFFECT__REMOVE:
				return getRemove();
			case CardsPackage.EFFECT__REQUIRE_LEVEL:
				return getRequireLevel();
			case CardsPackage.EFFECT__REVEAL_TO_OTHER:
				return getRevealToOther();
			case CardsPackage.EFFECT__REVERSE:
				return getReverse();
			case CardsPackage.EFFECT__SHUFFLE:
				return getShuffle();
			case CardsPackage.EFFECT__SIDE:
				return getSide();
			case CardsPackage.EFFECT__SUB_TYPE:
				return getSubType();
			case CardsPackage.EFFECT__TYPE:
				return getType();
			case CardsPackage.EFFECT__UNFREEZE:
				return getUnfreeze();
			case CardsPackage.EFFECT__VALUE:
				return getValue();
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
			case CardsPackage.EFFECT__CARD_FILTER:
				setCardFilter((CardFilter)newValue);
				return;
			case CardsPackage.EFFECT__CONDITION:
				setCondition((Condition)newValue);
				return;
			case CardsPackage.EFFECT__ABILITY:
				setAbility((String)newValue);
				return;
			case CardsPackage.EFFECT__BOTTOM:
				setBottom((String)newValue);
				return;
			case CardsPackage.EFFECT__CANCEL_DESTINATION:
				setCancelDestination((String)newValue);
				return;
			case CardsPackage.EFFECT__CANT_TARGET_PARENT:
				setCantTargetParent((String)newValue);
				return;
			case CardsPackage.EFFECT__CARD_HOLDER:
				setCardHolder((String)newValue);
				return;
			case CardsPackage.EFFECT__COUNTER_TYPE:
				setCounterType((String)newValue);
				return;
			case CardsPackage.EFFECT__DAMAGE_EXCLUDE_FLAGS:
				setDamageExcludeFlags((String)newValue);
				return;
			case CardsPackage.EFFECT__DAMAGE_FLAGS:
				setDamageFlags((String)newValue);
				return;
			case CardsPackage.EFFECT__DAMAGE_INCLUDE_FLAGS:
				setDamageIncludeFlags((String)newValue);
				return;
			case CardsPackage.EFFECT__DAMAGE_LETHAL_SCHOOLS:
				setDamageLethalSchools((String)newValue);
				return;
			case CardsPackage.EFFECT__DESTINATION:
				setDestination((String)newValue);
				return;
			case CardsPackage.EFFECT__DONT_GENERATE_TARGET_POSITION:
				setDontGenerateTargetPosition((String)newValue);
				return;
			case CardsPackage.EFFECT__DURATION:
				setDuration((String)newValue);
				return;
			case CardsPackage.EFFECT__EPIC_ENRAGE:
				setEpicEnrage((String)newValue);
				return;
			case CardsPackage.EFFECT__EVALUATION_ORDER:
				setEvaluationOrder((String)newValue);
				return;
			case CardsPackage.EFFECT__FAKE_ADDITIONAL_COST:
				setFakeAdditionalCost((String)newValue);
				return;
			case CardsPackage.EFFECT__FORCE:
				setForce((String)newValue);
				return;
			case CardsPackage.EFFECT__FREE:
				setFree((String)newValue);
				return;
			case CardsPackage.EFFECT__GLOBAL_EFFECT_TYPE:
				setGlobalEffectType((String)newValue);
				return;
			case CardsPackage.EFFECT__LEVEL_TYPE:
				setLevelType((String)newValue);
				return;
			case CardsPackage.EFFECT__MOVE_FROM_LAST_KNOWN_PARENT:
				setMoveFromLastKnownParent((String)newValue);
				return;
			case CardsPackage.EFFECT__NAME:
				setName((String)newValue);
				return;
			case CardsPackage.EFFECT__NEW_DURATION:
				setNewDuration((String)newValue);
				return;
			case CardsPackage.EFFECT__OWNER_ABILITY:
				setOwnerAbility((String)newValue);
				return;
			case CardsPackage.EFFECT__PERSISTENT:
				setPersistent((String)newValue);
				return;
			case CardsPackage.EFFECT__PLAY_EFFECT_TYPE:
				setPlayEffectType((String)newValue);
				return;
			case CardsPackage.EFFECT__REMOVE:
				setRemove((String)newValue);
				return;
			case CardsPackage.EFFECT__REQUIRE_LEVEL:
				setRequireLevel((String)newValue);
				return;
			case CardsPackage.EFFECT__REVEAL_TO_OTHER:
				setRevealToOther((String)newValue);
				return;
			case CardsPackage.EFFECT__REVERSE:
				setReverse((String)newValue);
				return;
			case CardsPackage.EFFECT__SHUFFLE:
				setShuffle((String)newValue);
				return;
			case CardsPackage.EFFECT__SIDE:
				setSide((String)newValue);
				return;
			case CardsPackage.EFFECT__SUB_TYPE:
				setSubType((String)newValue);
				return;
			case CardsPackage.EFFECT__TYPE:
				setType((String)newValue);
				return;
			case CardsPackage.EFFECT__UNFREEZE:
				setUnfreeze((String)newValue);
				return;
			case CardsPackage.EFFECT__VALUE:
				setValue((String)newValue);
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
			case CardsPackage.EFFECT__CARD_FILTER:
				setCardFilter((CardFilter)null);
				return;
			case CardsPackage.EFFECT__CONDITION:
				setCondition((Condition)null);
				return;
			case CardsPackage.EFFECT__ABILITY:
				setAbility(ABILITY_EDEFAULT);
				return;
			case CardsPackage.EFFECT__BOTTOM:
				setBottom(BOTTOM_EDEFAULT);
				return;
			case CardsPackage.EFFECT__CANCEL_DESTINATION:
				setCancelDestination(CANCEL_DESTINATION_EDEFAULT);
				return;
			case CardsPackage.EFFECT__CANT_TARGET_PARENT:
				setCantTargetParent(CANT_TARGET_PARENT_EDEFAULT);
				return;
			case CardsPackage.EFFECT__CARD_HOLDER:
				setCardHolder(CARD_HOLDER_EDEFAULT);
				return;
			case CardsPackage.EFFECT__COUNTER_TYPE:
				setCounterType(COUNTER_TYPE_EDEFAULT);
				return;
			case CardsPackage.EFFECT__DAMAGE_EXCLUDE_FLAGS:
				setDamageExcludeFlags(DAMAGE_EXCLUDE_FLAGS_EDEFAULT);
				return;
			case CardsPackage.EFFECT__DAMAGE_FLAGS:
				setDamageFlags(DAMAGE_FLAGS_EDEFAULT);
				return;
			case CardsPackage.EFFECT__DAMAGE_INCLUDE_FLAGS:
				setDamageIncludeFlags(DAMAGE_INCLUDE_FLAGS_EDEFAULT);
				return;
			case CardsPackage.EFFECT__DAMAGE_LETHAL_SCHOOLS:
				setDamageLethalSchools(DAMAGE_LETHAL_SCHOOLS_EDEFAULT);
				return;
			case CardsPackage.EFFECT__DESTINATION:
				setDestination(DESTINATION_EDEFAULT);
				return;
			case CardsPackage.EFFECT__DONT_GENERATE_TARGET_POSITION:
				setDontGenerateTargetPosition(DONT_GENERATE_TARGET_POSITION_EDEFAULT);
				return;
			case CardsPackage.EFFECT__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case CardsPackage.EFFECT__EPIC_ENRAGE:
				setEpicEnrage(EPIC_ENRAGE_EDEFAULT);
				return;
			case CardsPackage.EFFECT__EVALUATION_ORDER:
				setEvaluationOrder(EVALUATION_ORDER_EDEFAULT);
				return;
			case CardsPackage.EFFECT__FAKE_ADDITIONAL_COST:
				setFakeAdditionalCost(FAKE_ADDITIONAL_COST_EDEFAULT);
				return;
			case CardsPackage.EFFECT__FORCE:
				setForce(FORCE_EDEFAULT);
				return;
			case CardsPackage.EFFECT__FREE:
				setFree(FREE_EDEFAULT);
				return;
			case CardsPackage.EFFECT__GLOBAL_EFFECT_TYPE:
				setGlobalEffectType(GLOBAL_EFFECT_TYPE_EDEFAULT);
				return;
			case CardsPackage.EFFECT__LEVEL_TYPE:
				setLevelType(LEVEL_TYPE_EDEFAULT);
				return;
			case CardsPackage.EFFECT__MOVE_FROM_LAST_KNOWN_PARENT:
				setMoveFromLastKnownParent(MOVE_FROM_LAST_KNOWN_PARENT_EDEFAULT);
				return;
			case CardsPackage.EFFECT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CardsPackage.EFFECT__NEW_DURATION:
				setNewDuration(NEW_DURATION_EDEFAULT);
				return;
			case CardsPackage.EFFECT__OWNER_ABILITY:
				setOwnerAbility(OWNER_ABILITY_EDEFAULT);
				return;
			case CardsPackage.EFFECT__PERSISTENT:
				setPersistent(PERSISTENT_EDEFAULT);
				return;
			case CardsPackage.EFFECT__PLAY_EFFECT_TYPE:
				setPlayEffectType(PLAY_EFFECT_TYPE_EDEFAULT);
				return;
			case CardsPackage.EFFECT__REMOVE:
				setRemove(REMOVE_EDEFAULT);
				return;
			case CardsPackage.EFFECT__REQUIRE_LEVEL:
				setRequireLevel(REQUIRE_LEVEL_EDEFAULT);
				return;
			case CardsPackage.EFFECT__REVEAL_TO_OTHER:
				setRevealToOther(REVEAL_TO_OTHER_EDEFAULT);
				return;
			case CardsPackage.EFFECT__REVERSE:
				setReverse(REVERSE_EDEFAULT);
				return;
			case CardsPackage.EFFECT__SHUFFLE:
				setShuffle(SHUFFLE_EDEFAULT);
				return;
			case CardsPackage.EFFECT__SIDE:
				setSide(SIDE_EDEFAULT);
				return;
			case CardsPackage.EFFECT__SUB_TYPE:
				setSubType(SUB_TYPE_EDEFAULT);
				return;
			case CardsPackage.EFFECT__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case CardsPackage.EFFECT__UNFREEZE:
				setUnfreeze(UNFREEZE_EDEFAULT);
				return;
			case CardsPackage.EFFECT__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case CardsPackage.EFFECT__CARD_FILTER:
				return cardFilter != null;
			case CardsPackage.EFFECT__CONDITION:
				return condition != null;
			case CardsPackage.EFFECT__ABILITY:
				return ABILITY_EDEFAULT == null ? ability != null : !ABILITY_EDEFAULT.equals(ability);
			case CardsPackage.EFFECT__BOTTOM:
				return BOTTOM_EDEFAULT == null ? bottom != null : !BOTTOM_EDEFAULT.equals(bottom);
			case CardsPackage.EFFECT__CANCEL_DESTINATION:
				return CANCEL_DESTINATION_EDEFAULT == null ? cancelDestination != null : !CANCEL_DESTINATION_EDEFAULT.equals(cancelDestination);
			case CardsPackage.EFFECT__CANT_TARGET_PARENT:
				return CANT_TARGET_PARENT_EDEFAULT == null ? cantTargetParent != null : !CANT_TARGET_PARENT_EDEFAULT.equals(cantTargetParent);
			case CardsPackage.EFFECT__CARD_HOLDER:
				return CARD_HOLDER_EDEFAULT == null ? cardHolder != null : !CARD_HOLDER_EDEFAULT.equals(cardHolder);
			case CardsPackage.EFFECT__COUNTER_TYPE:
				return COUNTER_TYPE_EDEFAULT == null ? counterType != null : !COUNTER_TYPE_EDEFAULT.equals(counterType);
			case CardsPackage.EFFECT__DAMAGE_EXCLUDE_FLAGS:
				return DAMAGE_EXCLUDE_FLAGS_EDEFAULT == null ? damageExcludeFlags != null : !DAMAGE_EXCLUDE_FLAGS_EDEFAULT.equals(damageExcludeFlags);
			case CardsPackage.EFFECT__DAMAGE_FLAGS:
				return DAMAGE_FLAGS_EDEFAULT == null ? damageFlags != null : !DAMAGE_FLAGS_EDEFAULT.equals(damageFlags);
			case CardsPackage.EFFECT__DAMAGE_INCLUDE_FLAGS:
				return DAMAGE_INCLUDE_FLAGS_EDEFAULT == null ? damageIncludeFlags != null : !DAMAGE_INCLUDE_FLAGS_EDEFAULT.equals(damageIncludeFlags);
			case CardsPackage.EFFECT__DAMAGE_LETHAL_SCHOOLS:
				return DAMAGE_LETHAL_SCHOOLS_EDEFAULT == null ? damageLethalSchools != null : !DAMAGE_LETHAL_SCHOOLS_EDEFAULT.equals(damageLethalSchools);
			case CardsPackage.EFFECT__DESTINATION:
				return DESTINATION_EDEFAULT == null ? destination != null : !DESTINATION_EDEFAULT.equals(destination);
			case CardsPackage.EFFECT__DONT_GENERATE_TARGET_POSITION:
				return DONT_GENERATE_TARGET_POSITION_EDEFAULT == null ? dontGenerateTargetPosition != null : !DONT_GENERATE_TARGET_POSITION_EDEFAULT.equals(dontGenerateTargetPosition);
			case CardsPackage.EFFECT__DURATION:
				return DURATION_EDEFAULT == null ? duration != null : !DURATION_EDEFAULT.equals(duration);
			case CardsPackage.EFFECT__EPIC_ENRAGE:
				return EPIC_ENRAGE_EDEFAULT == null ? epicEnrage != null : !EPIC_ENRAGE_EDEFAULT.equals(epicEnrage);
			case CardsPackage.EFFECT__EVALUATION_ORDER:
				return EVALUATION_ORDER_EDEFAULT == null ? evaluationOrder != null : !EVALUATION_ORDER_EDEFAULT.equals(evaluationOrder);
			case CardsPackage.EFFECT__FAKE_ADDITIONAL_COST:
				return FAKE_ADDITIONAL_COST_EDEFAULT == null ? fakeAdditionalCost != null : !FAKE_ADDITIONAL_COST_EDEFAULT.equals(fakeAdditionalCost);
			case CardsPackage.EFFECT__FORCE:
				return FORCE_EDEFAULT == null ? force != null : !FORCE_EDEFAULT.equals(force);
			case CardsPackage.EFFECT__FREE:
				return FREE_EDEFAULT == null ? free != null : !FREE_EDEFAULT.equals(free);
			case CardsPackage.EFFECT__GLOBAL_EFFECT_TYPE:
				return GLOBAL_EFFECT_TYPE_EDEFAULT == null ? globalEffectType != null : !GLOBAL_EFFECT_TYPE_EDEFAULT.equals(globalEffectType);
			case CardsPackage.EFFECT__LEVEL_TYPE:
				return LEVEL_TYPE_EDEFAULT == null ? levelType != null : !LEVEL_TYPE_EDEFAULT.equals(levelType);
			case CardsPackage.EFFECT__MOVE_FROM_LAST_KNOWN_PARENT:
				return MOVE_FROM_LAST_KNOWN_PARENT_EDEFAULT == null ? moveFromLastKnownParent != null : !MOVE_FROM_LAST_KNOWN_PARENT_EDEFAULT.equals(moveFromLastKnownParent);
			case CardsPackage.EFFECT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CardsPackage.EFFECT__NEW_DURATION:
				return NEW_DURATION_EDEFAULT == null ? newDuration != null : !NEW_DURATION_EDEFAULT.equals(newDuration);
			case CardsPackage.EFFECT__OWNER_ABILITY:
				return OWNER_ABILITY_EDEFAULT == null ? ownerAbility != null : !OWNER_ABILITY_EDEFAULT.equals(ownerAbility);
			case CardsPackage.EFFECT__PERSISTENT:
				return PERSISTENT_EDEFAULT == null ? persistent != null : !PERSISTENT_EDEFAULT.equals(persistent);
			case CardsPackage.EFFECT__PLAY_EFFECT_TYPE:
				return PLAY_EFFECT_TYPE_EDEFAULT == null ? playEffectType != null : !PLAY_EFFECT_TYPE_EDEFAULT.equals(playEffectType);
			case CardsPackage.EFFECT__REMOVE:
				return REMOVE_EDEFAULT == null ? remove != null : !REMOVE_EDEFAULT.equals(remove);
			case CardsPackage.EFFECT__REQUIRE_LEVEL:
				return REQUIRE_LEVEL_EDEFAULT == null ? requireLevel != null : !REQUIRE_LEVEL_EDEFAULT.equals(requireLevel);
			case CardsPackage.EFFECT__REVEAL_TO_OTHER:
				return REVEAL_TO_OTHER_EDEFAULT == null ? revealToOther != null : !REVEAL_TO_OTHER_EDEFAULT.equals(revealToOther);
			case CardsPackage.EFFECT__REVERSE:
				return REVERSE_EDEFAULT == null ? reverse != null : !REVERSE_EDEFAULT.equals(reverse);
			case CardsPackage.EFFECT__SHUFFLE:
				return SHUFFLE_EDEFAULT == null ? shuffle != null : !SHUFFLE_EDEFAULT.equals(shuffle);
			case CardsPackage.EFFECT__SIDE:
				return SIDE_EDEFAULT == null ? side != null : !SIDE_EDEFAULT.equals(side);
			case CardsPackage.EFFECT__SUB_TYPE:
				return SUB_TYPE_EDEFAULT == null ? subType != null : !SUB_TYPE_EDEFAULT.equals(subType);
			case CardsPackage.EFFECT__TYPE:
				return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
			case CardsPackage.EFFECT__UNFREEZE:
				return UNFREEZE_EDEFAULT == null ? unfreeze != null : !UNFREEZE_EDEFAULT.equals(unfreeze);
			case CardsPackage.EFFECT__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
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
		result.append(" (ability: ");
		result.append(ability);
		result.append(", bottom: ");
		result.append(bottom);
		result.append(", cancelDestination: ");
		result.append(cancelDestination);
		result.append(", cantTargetParent: ");
		result.append(cantTargetParent);
		result.append(", cardHolder: ");
		result.append(cardHolder);
		result.append(", counterType: ");
		result.append(counterType);
		result.append(", damageExcludeFlags: ");
		result.append(damageExcludeFlags);
		result.append(", damageFlags: ");
		result.append(damageFlags);
		result.append(", damageIncludeFlags: ");
		result.append(damageIncludeFlags);
		result.append(", damageLethalSchools: ");
		result.append(damageLethalSchools);
		result.append(", destination: ");
		result.append(destination);
		result.append(", dontGenerateTargetPosition: ");
		result.append(dontGenerateTargetPosition);
		result.append(", duration: ");
		result.append(duration);
		result.append(", epicEnrage: ");
		result.append(epicEnrage);
		result.append(", evaluationOrder: ");
		result.append(evaluationOrder);
		result.append(", fakeAdditionalCost: ");
		result.append(fakeAdditionalCost);
		result.append(", force: ");
		result.append(force);
		result.append(", free: ");
		result.append(free);
		result.append(", globalEffectType: ");
		result.append(globalEffectType);
		result.append(", levelType: ");
		result.append(levelType);
		result.append(", moveFromLastKnownParent: ");
		result.append(moveFromLastKnownParent);
		result.append(", name: ");
		result.append(name);
		result.append(", newDuration: ");
		result.append(newDuration);
		result.append(", ownerAbility: ");
		result.append(ownerAbility);
		result.append(", persistent: ");
		result.append(persistent);
		result.append(", playEffectType: ");
		result.append(playEffectType);
		result.append(", remove: ");
		result.append(remove);
		result.append(", requireLevel: ");
		result.append(requireLevel);
		result.append(", revealToOther: ");
		result.append(revealToOther);
		result.append(", reverse: ");
		result.append(reverse);
		result.append(", shuffle: ");
		result.append(shuffle);
		result.append(", side: ");
		result.append(side);
		result.append(", subType: ");
		result.append(subType);
		result.append(", type: ");
		result.append(type);
		result.append(", unfreeze: ");
		result.append(unfreeze);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //EffectImpl
