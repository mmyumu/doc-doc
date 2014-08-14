/**
 */
package net.mmyumu.docdoc.model.Cards;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Card</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Card#getSchool <em>School</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Card#getDescription <em>Description</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Card#getOngoing <em>Ongoing</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Card#getTarget <em>Target</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Card#getDestinyLevel <em>Destiny Level</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Card#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Card#getFaction <em>Faction</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Card#getHP <em>HP</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Card#getID <em>ID</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Card#getMagicLevel <em>Magic Level</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Card#getMightLevel <em>Might Level</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Card#getName <em>Name</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Card#getRarity <em>Rarity</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Card#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCard()
 * @model extendedMetaData="name='Card' kind='elementOnly'"
 * @generated
 */
public interface Card extends EObject {
	/**
	 * Returns the value of the '<em><b>School</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>School</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>School</em>' containment reference list.
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCard_School()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='School' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EObject> getSchool();

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
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCard_Description()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='Description' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Card#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Ongoing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ongoing</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ongoing</em>' containment reference.
	 * @see #setOngoing(EObject)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCard_Ongoing()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Ongoing' namespace='##targetNamespace'"
	 * @generated
	 */
	EObject getOngoing();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Card#getOngoing <em>Ongoing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ongoing</em>' containment reference.
	 * @see #getOngoing()
	 * @generated
	 */
	void setOngoing(EObject value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference list.
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCard_Target()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='Target' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<EObject> getTarget();

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
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCard_DestinyLevel()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='DestinyLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	int getDestinyLevel();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Card#getDestinyLevel <em>Destiny Level</em>}' attribute.
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
	 * Unsets the value of the '{@link net.mmyumu.docdoc.model.Cards.Card#getDestinyLevel <em>Destiny Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetDestinyLevel()
	 * @see #getDestinyLevel()
	 * @see #setDestinyLevel(int)
	 * @generated
	 */
	void unsetDestinyLevel();

	/**
	 * Returns whether the value of the '{@link net.mmyumu.docdoc.model.Cards.Card#getDestinyLevel <em>Destiny Level</em>}' attribute is set.
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
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCard_DisplayName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='DisplayName' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDisplayName();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Card#getDisplayName <em>Display Name</em>}' attribute.
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
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCard_Faction()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Faction' namespace='##targetNamespace'"
	 * @generated
	 */
	String getFaction();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Card#getFaction <em>Faction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Faction</em>' attribute.
	 * @see #getFaction()
	 * @generated
	 */
	void setFaction(String value);

	/**
	 * Returns the value of the '<em><b>HP</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>HP</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>HP</em>' attribute.
	 * @see #isSetHP()
	 * @see #unsetHP()
	 * @see #setHP(int)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCard_HP()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='HP' namespace='##targetNamespace'"
	 * @generated
	 */
	int getHP();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Card#getHP <em>HP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HP</em>' attribute.
	 * @see #isSetHP()
	 * @see #unsetHP()
	 * @see #getHP()
	 * @generated
	 */
	void setHP(int value);

	/**
	 * Unsets the value of the '{@link net.mmyumu.docdoc.model.Cards.Card#getHP <em>HP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetHP()
	 * @see #getHP()
	 * @see #setHP(int)
	 * @generated
	 */
	void unsetHP();

	/**
	 * Returns whether the value of the '{@link net.mmyumu.docdoc.model.Cards.Card#getHP <em>HP</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>HP</em>' attribute is set.
	 * @see #unsetHP()
	 * @see #getHP()
	 * @see #setHP(int)
	 * @generated
	 */
	boolean isSetHP();

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
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCard_ID()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='ID' namespace='##targetNamespace'"
	 * @generated
	 */
	int getID();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Card#getID <em>ID</em>}' attribute.
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
	 * Unsets the value of the '{@link net.mmyumu.docdoc.model.Cards.Card#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetID()
	 * @see #getID()
	 * @see #setID(int)
	 * @generated
	 */
	void unsetID();

	/**
	 * Returns whether the value of the '{@link net.mmyumu.docdoc.model.Cards.Card#getID <em>ID</em>}' attribute is set.
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
	 * Returns the value of the '<em><b>Magic Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Magic Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Magic Level</em>' attribute.
	 * @see #isSetMagicLevel()
	 * @see #unsetMagicLevel()
	 * @see #setMagicLevel(int)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCard_MagicLevel()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='MagicLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	int getMagicLevel();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Card#getMagicLevel <em>Magic Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Magic Level</em>' attribute.
	 * @see #isSetMagicLevel()
	 * @see #unsetMagicLevel()
	 * @see #getMagicLevel()
	 * @generated
	 */
	void setMagicLevel(int value);

	/**
	 * Unsets the value of the '{@link net.mmyumu.docdoc.model.Cards.Card#getMagicLevel <em>Magic Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMagicLevel()
	 * @see #getMagicLevel()
	 * @see #setMagicLevel(int)
	 * @generated
	 */
	void unsetMagicLevel();

	/**
	 * Returns whether the value of the '{@link net.mmyumu.docdoc.model.Cards.Card#getMagicLevel <em>Magic Level</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Magic Level</em>' attribute is set.
	 * @see #unsetMagicLevel()
	 * @see #getMagicLevel()
	 * @see #setMagicLevel(int)
	 * @generated
	 */
	boolean isSetMagicLevel();

	/**
	 * Returns the value of the '<em><b>Might Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Might Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Might Level</em>' attribute.
	 * @see #isSetMightLevel()
	 * @see #unsetMightLevel()
	 * @see #setMightLevel(int)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCard_MightLevel()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Int"
	 *        extendedMetaData="kind='attribute' name='MightLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	int getMightLevel();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Card#getMightLevel <em>Might Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Might Level</em>' attribute.
	 * @see #isSetMightLevel()
	 * @see #unsetMightLevel()
	 * @see #getMightLevel()
	 * @generated
	 */
	void setMightLevel(int value);

	/**
	 * Unsets the value of the '{@link net.mmyumu.docdoc.model.Cards.Card#getMightLevel <em>Might Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetMightLevel()
	 * @see #getMightLevel()
	 * @see #setMightLevel(int)
	 * @generated
	 */
	void unsetMightLevel();

	/**
	 * Returns whether the value of the '{@link net.mmyumu.docdoc.model.Cards.Card#getMightLevel <em>Might Level</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Might Level</em>' attribute is set.
	 * @see #unsetMightLevel()
	 * @see #getMightLevel()
	 * @see #setMightLevel(int)
	 * @generated
	 */
	boolean isSetMightLevel();

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
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCard_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Name' namespace='##targetNamespace'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Card#getName <em>Name</em>}' attribute.
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
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCard_Rarity()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Rarity' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRarity();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Card#getRarity <em>Rarity</em>}' attribute.
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
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCard_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Type' namespace='##targetNamespace'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Card#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // Card
