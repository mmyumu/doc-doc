/**
 */
package net.mmyumu.docdoc.model.Cards;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Effect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Effect#getCardFilter <em>Card Filter</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Effect#getCondition <em>Condition</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Effect#getAbility <em>Ability</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Effect#getBottom <em>Bottom</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Effect#getCancelDestination <em>Cancel Destination</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Effect#getCantTargetParent <em>Cant Target Parent</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Effect#getCardHolder <em>Card Holder</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Effect#getCounterType <em>Counter Type</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Effect#getDamageExcludeFlags <em>Damage Exclude Flags</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Effect#getDamageFlags <em>Damage Flags</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Effect#getDamageIncludeFlags <em>Damage Include Flags</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Effect#getDamageLethalSchools <em>Damage Lethal Schools</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Effect#getDestination <em>Destination</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Effect#getDontGenerateTargetPosition <em>Dont Generate Target Position</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Effect#getDuration <em>Duration</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Effect#getEpicEnrage <em>Epic Enrage</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Effect#getEvaluationOrder <em>Evaluation Order</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Effect#getFakeAdditionalCost <em>Fake Additional Cost</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Effect#getForce <em>Force</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Effect#getFree <em>Free</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Effect#getGlobalEffectType <em>Global Effect Type</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Effect#getLevelType <em>Level Type</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Effect#getMoveFromLastKnownParent <em>Move From Last Known Parent</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Effect#getName <em>Name</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Effect#getNewDuration <em>New Duration</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Effect#getOwnerAbility <em>Owner Ability</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Effect#getPersistent <em>Persistent</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Effect#getPlayEffectType <em>Play Effect Type</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Effect#getRemove <em>Remove</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Effect#getRequireLevel <em>Require Level</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Effect#getRevealToOther <em>Reveal To Other</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Effect#getReverse <em>Reverse</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Effect#getShuffle <em>Shuffle</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Effect#getSide <em>Side</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Effect#getSubType <em>Sub Type</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Effect#getType <em>Type</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Effect#getUnfreeze <em>Unfreeze</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Effect#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getEffect()
 * @model extendedMetaData="name='Effect' kind='elementOnly'"
 * @generated
 */
public interface Effect extends EObject {
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
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getEffect_CardFilter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='CardFilter' namespace='##targetNamespace'"
	 * @generated
	 */
	CardFilter getCardFilter();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Effect#getCardFilter <em>Card Filter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card Filter</em>' containment reference.
	 * @see #getCardFilter()
	 * @generated
	 */
	void setCardFilter(CardFilter value);

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(Condition)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getEffect_Condition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Condition' namespace='##targetNamespace'"
	 * @generated
	 */
	Condition getCondition();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Effect#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Condition value);

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
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getEffect_Ability()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Ability' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAbility();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Effect#getAbility <em>Ability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ability</em>' attribute.
	 * @see #getAbility()
	 * @generated
	 */
	void setAbility(String value);

	/**
	 * Returns the value of the '<em><b>Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bottom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bottom</em>' attribute.
	 * @see #setBottom(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getEffect_Bottom()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Bottom' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBottom();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Effect#getBottom <em>Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bottom</em>' attribute.
	 * @see #getBottom()
	 * @generated
	 */
	void setBottom(String value);

	/**
	 * Returns the value of the '<em><b>Cancel Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cancel Destination</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancel Destination</em>' attribute.
	 * @see #setCancelDestination(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getEffect_CancelDestination()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='CancelDestination' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCancelDestination();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Effect#getCancelDestination <em>Cancel Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancel Destination</em>' attribute.
	 * @see #getCancelDestination()
	 * @generated
	 */
	void setCancelDestination(String value);

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
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getEffect_CantTargetParent()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='CantTargetParent' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCantTargetParent();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Effect#getCantTargetParent <em>Cant Target Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cant Target Parent</em>' attribute.
	 * @see #getCantTargetParent()
	 * @generated
	 */
	void setCantTargetParent(String value);

	/**
	 * Returns the value of the '<em><b>Card Holder</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Card Holder</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Card Holder</em>' attribute.
	 * @see #setCardHolder(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getEffect_CardHolder()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='CardHolder' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCardHolder();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Effect#getCardHolder <em>Card Holder</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Card Holder</em>' attribute.
	 * @see #getCardHolder()
	 * @generated
	 */
	void setCardHolder(String value);

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
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getEffect_CounterType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='CounterType' namespace='##targetNamespace'"
	 * @generated
	 */
	String getCounterType();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Effect#getCounterType <em>Counter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Counter Type</em>' attribute.
	 * @see #getCounterType()
	 * @generated
	 */
	void setCounterType(String value);

	/**
	 * Returns the value of the '<em><b>Damage Exclude Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Damage Exclude Flags</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Damage Exclude Flags</em>' attribute.
	 * @see #setDamageExcludeFlags(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getEffect_DamageExcludeFlags()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='DamageExcludeFlags' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDamageExcludeFlags();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Effect#getDamageExcludeFlags <em>Damage Exclude Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Damage Exclude Flags</em>' attribute.
	 * @see #getDamageExcludeFlags()
	 * @generated
	 */
	void setDamageExcludeFlags(String value);

	/**
	 * Returns the value of the '<em><b>Damage Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Damage Flags</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Damage Flags</em>' attribute.
	 * @see #setDamageFlags(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getEffect_DamageFlags()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='DamageFlags' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDamageFlags();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Effect#getDamageFlags <em>Damage Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Damage Flags</em>' attribute.
	 * @see #getDamageFlags()
	 * @generated
	 */
	void setDamageFlags(String value);

	/**
	 * Returns the value of the '<em><b>Damage Include Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Damage Include Flags</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Damage Include Flags</em>' attribute.
	 * @see #setDamageIncludeFlags(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getEffect_DamageIncludeFlags()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='DamageIncludeFlags' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDamageIncludeFlags();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Effect#getDamageIncludeFlags <em>Damage Include Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Damage Include Flags</em>' attribute.
	 * @see #getDamageIncludeFlags()
	 * @generated
	 */
	void setDamageIncludeFlags(String value);

	/**
	 * Returns the value of the '<em><b>Damage Lethal Schools</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Damage Lethal Schools</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Damage Lethal Schools</em>' attribute.
	 * @see #setDamageLethalSchools(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getEffect_DamageLethalSchools()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='DamageLethalSchools' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDamageLethalSchools();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Effect#getDamageLethalSchools <em>Damage Lethal Schools</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Damage Lethal Schools</em>' attribute.
	 * @see #getDamageLethalSchools()
	 * @generated
	 */
	void setDamageLethalSchools(String value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' attribute.
	 * @see #setDestination(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getEffect_Destination()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Destination' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDestination();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Effect#getDestination <em>Destination</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' attribute.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(String value);

	/**
	 * Returns the value of the '<em><b>Dont Generate Target Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dont Generate Target Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dont Generate Target Position</em>' attribute.
	 * @see #setDontGenerateTargetPosition(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getEffect_DontGenerateTargetPosition()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='DontGenerateTargetPosition' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDontGenerateTargetPosition();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Effect#getDontGenerateTargetPosition <em>Dont Generate Target Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dont Generate Target Position</em>' attribute.
	 * @see #getDontGenerateTargetPosition()
	 * @generated
	 */
	void setDontGenerateTargetPosition(String value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getEffect_Duration()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Duration' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDuration();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Effect#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(String value);

	/**
	 * Returns the value of the '<em><b>Epic Enrage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Epic Enrage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Epic Enrage</em>' attribute.
	 * @see #setEpicEnrage(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getEffect_EpicEnrage()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='EpicEnrage' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEpicEnrage();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Effect#getEpicEnrage <em>Epic Enrage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Epic Enrage</em>' attribute.
	 * @see #getEpicEnrage()
	 * @generated
	 */
	void setEpicEnrage(String value);

	/**
	 * Returns the value of the '<em><b>Evaluation Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evaluation Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evaluation Order</em>' attribute.
	 * @see #setEvaluationOrder(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getEffect_EvaluationOrder()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='EvaluationOrder' namespace='##targetNamespace'"
	 * @generated
	 */
	String getEvaluationOrder();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Effect#getEvaluationOrder <em>Evaluation Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evaluation Order</em>' attribute.
	 * @see #getEvaluationOrder()
	 * @generated
	 */
	void setEvaluationOrder(String value);

	/**
	 * Returns the value of the '<em><b>Fake Additional Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fake Additional Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fake Additional Cost</em>' attribute.
	 * @see #setFakeAdditionalCost(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getEffect_FakeAdditionalCost()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='FakeAdditionalCost' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFakeAdditionalCost();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Effect#getFakeAdditionalCost <em>Fake Additional Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fake Additional Cost</em>' attribute.
	 * @see #getFakeAdditionalCost()
	 * @generated
	 */
	void setFakeAdditionalCost(String value);

	/**
	 * Returns the value of the '<em><b>Force</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Force</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Force</em>' attribute.
	 * @see #setForce(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getEffect_Force()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Force' namespace='##targetNamespace'"
	 * @generated
	 */
	String getForce();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Effect#getForce <em>Force</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Force</em>' attribute.
	 * @see #getForce()
	 * @generated
	 */
	void setForce(String value);

	/**
	 * Returns the value of the '<em><b>Free</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Free</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Free</em>' attribute.
	 * @see #setFree(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getEffect_Free()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Free' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFree();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Effect#getFree <em>Free</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Free</em>' attribute.
	 * @see #getFree()
	 * @generated
	 */
	void setFree(String value);

	/**
	 * Returns the value of the '<em><b>Global Effect Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Effect Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Effect Type</em>' attribute.
	 * @see #setGlobalEffectType(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getEffect_GlobalEffectType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='GlobalEffectType' namespace='##targetNamespace'"
	 * @generated
	 */
	String getGlobalEffectType();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Effect#getGlobalEffectType <em>Global Effect Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Effect Type</em>' attribute.
	 * @see #getGlobalEffectType()
	 * @generated
	 */
	void setGlobalEffectType(String value);

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
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getEffect_LevelType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='LevelType' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLevelType();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Effect#getLevelType <em>Level Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level Type</em>' attribute.
	 * @see #getLevelType()
	 * @generated
	 */
	void setLevelType(String value);

	/**
	 * Returns the value of the '<em><b>Move From Last Known Parent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Move From Last Known Parent</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Move From Last Known Parent</em>' attribute.
	 * @see #setMoveFromLastKnownParent(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getEffect_MoveFromLastKnownParent()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='MoveFromLastKnownParent' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMoveFromLastKnownParent();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Effect#getMoveFromLastKnownParent <em>Move From Last Known Parent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Move From Last Known Parent</em>' attribute.
	 * @see #getMoveFromLastKnownParent()
	 * @generated
	 */
	void setMoveFromLastKnownParent(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getEffect_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Effect#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>New Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Duration</em>' attribute.
	 * @see #setNewDuration(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getEffect_NewDuration()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='NewDuration' namespace='##targetNamespace'"
	 * @generated
	 */
	String getNewDuration();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Effect#getNewDuration <em>New Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Duration</em>' attribute.
	 * @see #getNewDuration()
	 * @generated
	 */
	void setNewDuration(String value);

	/**
	 * Returns the value of the '<em><b>Owner Ability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner Ability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner Ability</em>' attribute.
	 * @see #setOwnerAbility(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getEffect_OwnerAbility()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='OwnerAbility' namespace='##targetNamespace'"
	 * @generated
	 */
	String getOwnerAbility();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Effect#getOwnerAbility <em>Owner Ability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner Ability</em>' attribute.
	 * @see #getOwnerAbility()
	 * @generated
	 */
	void setOwnerAbility(String value);

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
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getEffect_Persistent()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Persistent' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPersistent();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Effect#getPersistent <em>Persistent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Persistent</em>' attribute.
	 * @see #getPersistent()
	 * @generated
	 */
	void setPersistent(String value);

	/**
	 * Returns the value of the '<em><b>Play Effect Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Play Effect Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Play Effect Type</em>' attribute.
	 * @see #setPlayEffectType(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getEffect_PlayEffectType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='PlayEffectType' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPlayEffectType();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Effect#getPlayEffectType <em>Play Effect Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Play Effect Type</em>' attribute.
	 * @see #getPlayEffectType()
	 * @generated
	 */
	void setPlayEffectType(String value);

	/**
	 * Returns the value of the '<em><b>Remove</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remove</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remove</em>' attribute.
	 * @see #setRemove(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getEffect_Remove()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Remove' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRemove();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Effect#getRemove <em>Remove</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remove</em>' attribute.
	 * @see #getRemove()
	 * @generated
	 */
	void setRemove(String value);

	/**
	 * Returns the value of the '<em><b>Require Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Require Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Require Level</em>' attribute.
	 * @see #setRequireLevel(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getEffect_RequireLevel()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='RequireLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRequireLevel();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Effect#getRequireLevel <em>Require Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Require Level</em>' attribute.
	 * @see #getRequireLevel()
	 * @generated
	 */
	void setRequireLevel(String value);

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
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getEffect_RevealToOther()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='RevealToOther' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRevealToOther();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Effect#getRevealToOther <em>Reveal To Other</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reveal To Other</em>' attribute.
	 * @see #getRevealToOther()
	 * @generated
	 */
	void setRevealToOther(String value);

	/**
	 * Returns the value of the '<em><b>Reverse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reverse</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reverse</em>' attribute.
	 * @see #setReverse(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getEffect_Reverse()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Reverse' namespace='##targetNamespace'"
	 * @generated
	 */
	String getReverse();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Effect#getReverse <em>Reverse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reverse</em>' attribute.
	 * @see #getReverse()
	 * @generated
	 */
	void setReverse(String value);

	/**
	 * Returns the value of the '<em><b>Shuffle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Shuffle</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shuffle</em>' attribute.
	 * @see #setShuffle(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getEffect_Shuffle()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Shuffle' namespace='##targetNamespace'"
	 * @generated
	 */
	String getShuffle();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Effect#getShuffle <em>Shuffle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shuffle</em>' attribute.
	 * @see #getShuffle()
	 * @generated
	 */
	void setShuffle(String value);

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
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getEffect_Side()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Side' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSide();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Effect#getSide <em>Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Side</em>' attribute.
	 * @see #getSide()
	 * @generated
	 */
	void setSide(String value);

	/**
	 * Returns the value of the '<em><b>Sub Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Type</em>' attribute.
	 * @see #setSubType(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getEffect_SubType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='SubType' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSubType();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Effect#getSubType <em>Sub Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sub Type</em>' attribute.
	 * @see #getSubType()
	 * @generated
	 */
	void setSubType(String value);

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
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getEffect_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Type' namespace='##targetNamespace'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Effect#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Unfreeze</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unfreeze</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unfreeze</em>' attribute.
	 * @see #setUnfreeze(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getEffect_Unfreeze()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Unfreeze' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUnfreeze();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Effect#getUnfreeze <em>Unfreeze</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unfreeze</em>' attribute.
	 * @see #getUnfreeze()
	 * @generated
	 */
	void setUnfreeze(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getEffect_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Value' namespace='##targetNamespace'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Effect#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // Effect
