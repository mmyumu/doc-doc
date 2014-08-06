/**
 */
package net.mmyumu.docdoc.model.Cards;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Card Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.CardType#getVariable <em>Variable</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.CardType#getPlayabilityCondition <em>Playability Condition</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.CardType#getTarget <em>Target</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.CardType#getDescription <em>Description</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.CardType#getCost <em>Cost</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.CardType#getDestinyLevel <em>Destiny Level</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.CardType#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.CardType#getFaction <em>Faction</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.CardType#getID <em>ID</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.CardType#getName <em>Name</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.CardType#getRarity <em>Rarity</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.CardType#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCardType()
 * @model extendedMetaData="name='Card_._type' kind='elementOnly'"
 * @generated
 */
public interface CardType extends EObject {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference.
	 * @see #setVariable(VariableType)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCardType_Variable()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Variable' namespace='##targetNamespace'"
	 * @generated
	 */
	VariableType getVariable();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.CardType#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(VariableType value);

	/**
	 * Returns the value of the '<em><b>Playability Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Playability Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Playability Condition</em>' containment reference.
	 * @see #setPlayabilityCondition(PlayabilityConditionType)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCardType_PlayabilityCondition()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='PlayabilityCondition' namespace='##targetNamespace'"
	 * @generated
	 */
	PlayabilityConditionType getPlayabilityCondition();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.CardType#getPlayabilityCondition <em>Playability Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Playability Condition</em>' containment reference.
	 * @see #getPlayabilityCondition()
	 * @generated
	 */
	void setPlayabilityCondition(PlayabilityConditionType value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference.
	 * @see #setTarget(TargetType)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCardType_Target()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Target' namespace='##targetNamespace'"
	 * @generated
	 */
	TargetType getTarget();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.CardType#getTarget <em>Target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' containment reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TargetType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCardType_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.CardType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cost</em>' attribute.
	 * @see #isSetCost()
	 * @see #unsetCost()
	 * @see #setCost(int)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCardType_Cost()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='Cost' namespace='##targetNamespace'"
	 * @generated
	 */
	int getCost();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.CardType#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cost</em>' attribute.
	 * @see #isSetCost()
	 * @see #unsetCost()
	 * @see #getCost()
	 * @generated
	 */
	void setCost(int value);

	/**
	 * Unsets the value of the '{@link net.mmyumu.docdoc.model.Cards.CardType#getCost <em>Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCost()
	 * @see #getCost()
	 * @see #setCost(int)
	 * @generated
	 */
	void unsetCost();

	/**
	 * Returns whether the value of the '{@link net.mmyumu.docdoc.model.Cards.CardType#getCost <em>Cost</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cost</em>' attribute is set.
	 * @see #unsetCost()
	 * @see #getCost()
	 * @see #setCost(int)
	 * @generated
	 */
	boolean isSetCost();

	/**
	 * Returns the value of the '<em><b>Destiny Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destiny Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destiny Level</em>' attribute.
	 * @see #isSetDestinyLevel()
	 * @see #unsetDestinyLevel()
	 * @see #setDestinyLevel(int)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCardType_DestinyLevel()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='DestinyLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	int getDestinyLevel();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.CardType#getDestinyLevel <em>Destiny Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destiny Level</em>' attribute.
	 * @see #isSetDestinyLevel()
	 * @see #unsetDestinyLevel()
	 * @see #getDestinyLevel()
	 * @generated
	 */
	void setDestinyLevel(int value);

	/**
	 * Unsets the value of the '{@link net.mmyumu.docdoc.model.Cards.CardType#getDestinyLevel <em>Destiny Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDestinyLevel()
	 * @see #getDestinyLevel()
	 * @see #setDestinyLevel(int)
	 * @generated
	 */
	void unsetDestinyLevel();

	/**
	 * Returns whether the value of the '{@link net.mmyumu.docdoc.model.Cards.CardType#getDestinyLevel <em>Destiny Level</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Destiny Level</em>' attribute is set.
	 * @see #unsetDestinyLevel()
	 * @see #getDestinyLevel()
	 * @see #setDestinyLevel(int)
	 * @generated
	 */
	boolean isSetDestinyLevel();

	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Name</em>' attribute.
	 * @see #setDisplayName(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCardType_DisplayName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='DisplayName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDisplayName();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.CardType#getDisplayName <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' attribute.
	 * @see #getDisplayName()
	 * @generated
	 */
	void setDisplayName(String value);

	/**
	 * Returns the value of the '<em><b>Faction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Faction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Faction</em>' attribute.
	 * @see #setFaction(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCardType_Faction()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Faction' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFaction();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.CardType#getFaction <em>Faction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Faction</em>' attribute.
	 * @see #getFaction()
	 * @generated
	 */
	void setFaction(String value);

	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #isSetID()
	 * @see #unsetID()
	 * @see #setID(int)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCardType_ID()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='ID' namespace='##targetNamespace'"
	 * @generated
	 */
	int getID();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.CardType#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #isSetID()
	 * @see #unsetID()
	 * @see #getID()
	 * @generated
	 */
	void setID(int value);

	/**
	 * Unsets the value of the '{@link net.mmyumu.docdoc.model.Cards.CardType#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetID()
	 * @see #getID()
	 * @see #setID(int)
	 * @generated
	 */
	void unsetID();

	/**
	 * Returns whether the value of the '{@link net.mmyumu.docdoc.model.Cards.CardType#getID <em>ID</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>ID</em>' attribute is set.
	 * @see #unsetID()
	 * @see #getID()
	 * @see #setID(int)
	 * @generated
	 */
	boolean isSetID();

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
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCardType_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.CardType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Rarity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rarity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rarity</em>' attribute.
	 * @see #setRarity(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCardType_Rarity()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Rarity' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRarity();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.CardType#getRarity <em>Rarity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rarity</em>' attribute.
	 * @see #getRarity()
	 * @generated
	 */
	void setRarity(String value);

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
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCardType_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Type' namespace='##targetNamespace'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.CardType#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // CardType
