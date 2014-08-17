/**
 */
package net.mmyumu.docdoc.model.Cards;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Card Filter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.CardFilter#getVariable <em>Variable</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.CardFilter#getAttackHeroLastTurn <em>Attack Hero Last Turn</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.CardFilter#getBaseMaxCost <em>Base Max Cost</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.CardFilter#getDealDamageToHeroLastTurn <em>Deal Damage To Hero Last Turn</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.CardFilter#getExcludeFaction <em>Exclude Faction</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.CardFilter#getExcludeRaces <em>Exclude Races</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.CardFilter#getExcludeSchool <em>Exclude School</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.CardFilter#getExcludeToken <em>Exclude Token</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.CardFilter#getExcludeUnique <em>Exclude Unique</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.CardFilter#getExcludeUnitType <em>Exclude Unit Type</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeAbility <em>Include Ability</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeCardID <em>Include Card ID</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeCardType <em>Include Card Type</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeColumn <em>Include Column</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeCounter <em>Include Counter</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeEnchantUnit <em>Include Enchant Unit</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeFaction <em>Include Faction</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeFrontLine <em>Include Front Line</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeOccupant <em>Include Occupant</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeOngoingType <em>Include Ongoing Type</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeRaces <em>Include Races</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeSchool <em>Include School</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeStatus <em>Include Status</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeUnique <em>Include Unique</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeUnitType <em>Include Unit Type</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.CardFilter#getLevelType <em>Level Type</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.CardFilter#getMaxAttack <em>Max Attack</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.CardFilter#getMaxCost <em>Max Cost</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.CardFilter#getMaxLevel <em>Max Level</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.CardFilter#getSameCardType <em>Same Card Type</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.CardFilter#getSameGPID <em>Same GPID</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.CardFilter#getShareRaces <em>Share Races</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.CardFilter#getShareRacesWithOccupant <em>Share Races With Occupant</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.CardFilter#getSide <em>Side</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.CardFilter#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCardFilter()
 * @model extendedMetaData="name='CardFilter' kind='elementOnly'"
 * @generated
 */
public interface CardFilter extends EObject {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference.
	 * @see #setVariable(Variable)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCardFilter_Variable()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='Variable' namespace='##targetNamespace'"
	 * @generated
	 */
	Variable getVariable();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getVariable <em>Variable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable</em>' containment reference.
	 * @see #getVariable()
	 * @generated
	 */
	void setVariable(Variable value);

	/**
	 * Returns the value of the '<em><b>Attack Hero Last Turn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attack Hero Last Turn</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attack Hero Last Turn</em>' attribute.
	 * @see #setAttackHeroLastTurn(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCardFilter_AttackHeroLastTurn()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='AttackHeroLastTurn' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAttackHeroLastTurn();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getAttackHeroLastTurn <em>Attack Hero Last Turn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attack Hero Last Turn</em>' attribute.
	 * @see #getAttackHeroLastTurn()
	 * @generated
	 */
	void setAttackHeroLastTurn(String value);

	/**
	 * Returns the value of the '<em><b>Base Max Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Max Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Max Cost</em>' attribute.
	 * @see #setBaseMaxCost(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCardFilter_BaseMaxCost()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='BaseMaxCost' namespace='##targetNamespace'"
	 * @generated
	 */
	String getBaseMaxCost();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getBaseMaxCost <em>Base Max Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Max Cost</em>' attribute.
	 * @see #getBaseMaxCost()
	 * @generated
	 */
	void setBaseMaxCost(String value);

	/**
	 * Returns the value of the '<em><b>Deal Damage To Hero Last Turn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deal Damage To Hero Last Turn</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deal Damage To Hero Last Turn</em>' attribute.
	 * @see #setDealDamageToHeroLastTurn(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCardFilter_DealDamageToHeroLastTurn()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='DealDamageToHeroLastTurn' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDealDamageToHeroLastTurn();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getDealDamageToHeroLastTurn <em>Deal Damage To Hero Last Turn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deal Damage To Hero Last Turn</em>' attribute.
	 * @see #getDealDamageToHeroLastTurn()
	 * @generated
	 */
	void setDealDamageToHeroLastTurn(String value);

	/**
	 * Returns the value of the '<em><b>Exclude Faction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclude Faction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclude Faction</em>' attribute.
	 * @see #setExcludeFaction(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCardFilter_ExcludeFaction()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ExcludeFaction' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExcludeFaction();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getExcludeFaction <em>Exclude Faction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclude Faction</em>' attribute.
	 * @see #getExcludeFaction()
	 * @generated
	 */
	void setExcludeFaction(String value);

	/**
	 * Returns the value of the '<em><b>Exclude Races</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclude Races</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclude Races</em>' attribute.
	 * @see #setExcludeRaces(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCardFilter_ExcludeRaces()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ExcludeRaces' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExcludeRaces();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getExcludeRaces <em>Exclude Races</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclude Races</em>' attribute.
	 * @see #getExcludeRaces()
	 * @generated
	 */
	void setExcludeRaces(String value);

	/**
	 * Returns the value of the '<em><b>Exclude School</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclude School</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclude School</em>' attribute.
	 * @see #setExcludeSchool(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCardFilter_ExcludeSchool()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ExcludeSchool' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExcludeSchool();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getExcludeSchool <em>Exclude School</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclude School</em>' attribute.
	 * @see #getExcludeSchool()
	 * @generated
	 */
	void setExcludeSchool(String value);

	/**
	 * Returns the value of the '<em><b>Exclude Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclude Token</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclude Token</em>' attribute.
	 * @see #setExcludeToken(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCardFilter_ExcludeToken()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ExcludeToken' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExcludeToken();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getExcludeToken <em>Exclude Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclude Token</em>' attribute.
	 * @see #getExcludeToken()
	 * @generated
	 */
	void setExcludeToken(String value);

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
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCardFilter_ExcludeUnique()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ExcludeUnique' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExcludeUnique();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getExcludeUnique <em>Exclude Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclude Unique</em>' attribute.
	 * @see #getExcludeUnique()
	 * @generated
	 */
	void setExcludeUnique(String value);

	/**
	 * Returns the value of the '<em><b>Exclude Unit Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclude Unit Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclude Unit Type</em>' attribute.
	 * @see #setExcludeUnitType(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCardFilter_ExcludeUnitType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ExcludeUnitType' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExcludeUnitType();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getExcludeUnitType <em>Exclude Unit Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclude Unit Type</em>' attribute.
	 * @see #getExcludeUnitType()
	 * @generated
	 */
	void setExcludeUnitType(String value);

	/**
	 * Returns the value of the '<em><b>Include Ability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include Ability</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Ability</em>' attribute.
	 * @see #setIncludeAbility(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCardFilter_IncludeAbility()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='IncludeAbility' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIncludeAbility();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeAbility <em>Include Ability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Ability</em>' attribute.
	 * @see #getIncludeAbility()
	 * @generated
	 */
	void setIncludeAbility(String value);

	/**
	 * Returns the value of the '<em><b>Include Card ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include Card ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Card ID</em>' attribute.
	 * @see #setIncludeCardID(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCardFilter_IncludeCardID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='IncludeCardID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIncludeCardID();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeCardID <em>Include Card ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Card ID</em>' attribute.
	 * @see #getIncludeCardID()
	 * @generated
	 */
	void setIncludeCardID(String value);

	/**
	 * Returns the value of the '<em><b>Include Card Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include Card Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Card Type</em>' attribute.
	 * @see #setIncludeCardType(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCardFilter_IncludeCardType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='IncludeCardType' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIncludeCardType();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeCardType <em>Include Card Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Card Type</em>' attribute.
	 * @see #getIncludeCardType()
	 * @generated
	 */
	void setIncludeCardType(String value);

	/**
	 * Returns the value of the '<em><b>Include Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include Column</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Column</em>' attribute.
	 * @see #setIncludeColumn(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCardFilter_IncludeColumn()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='IncludeColumn' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIncludeColumn();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeColumn <em>Include Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Column</em>' attribute.
	 * @see #getIncludeColumn()
	 * @generated
	 */
	void setIncludeColumn(String value);

	/**
	 * Returns the value of the '<em><b>Include Counter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include Counter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Counter</em>' attribute.
	 * @see #setIncludeCounter(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCardFilter_IncludeCounter()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='IncludeCounter' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIncludeCounter();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeCounter <em>Include Counter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Counter</em>' attribute.
	 * @see #getIncludeCounter()
	 * @generated
	 */
	void setIncludeCounter(String value);

	/**
	 * Returns the value of the '<em><b>Include Enchant Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include Enchant Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Enchant Unit</em>' attribute.
	 * @see #setIncludeEnchantUnit(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCardFilter_IncludeEnchantUnit()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='IncludeEnchantUnit' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIncludeEnchantUnit();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeEnchantUnit <em>Include Enchant Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Enchant Unit</em>' attribute.
	 * @see #getIncludeEnchantUnit()
	 * @generated
	 */
	void setIncludeEnchantUnit(String value);

	/**
	 * Returns the value of the '<em><b>Include Faction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include Faction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Faction</em>' attribute.
	 * @see #setIncludeFaction(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCardFilter_IncludeFaction()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='IncludeFaction' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIncludeFaction();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeFaction <em>Include Faction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Faction</em>' attribute.
	 * @see #getIncludeFaction()
	 * @generated
	 */
	void setIncludeFaction(String value);

	/**
	 * Returns the value of the '<em><b>Include Front Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include Front Line</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Front Line</em>' attribute.
	 * @see #setIncludeFrontLine(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCardFilter_IncludeFrontLine()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='IncludeFrontLine' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIncludeFrontLine();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeFrontLine <em>Include Front Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Front Line</em>' attribute.
	 * @see #getIncludeFrontLine()
	 * @generated
	 */
	void setIncludeFrontLine(String value);

	/**
	 * Returns the value of the '<em><b>Include Occupant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include Occupant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Occupant</em>' attribute.
	 * @see #setIncludeOccupant(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCardFilter_IncludeOccupant()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='IncludeOccupant' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIncludeOccupant();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeOccupant <em>Include Occupant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Occupant</em>' attribute.
	 * @see #getIncludeOccupant()
	 * @generated
	 */
	void setIncludeOccupant(String value);

	/**
	 * Returns the value of the '<em><b>Include Ongoing Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include Ongoing Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Ongoing Type</em>' attribute.
	 * @see #setIncludeOngoingType(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCardFilter_IncludeOngoingType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='IncludeOngoingType' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIncludeOngoingType();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeOngoingType <em>Include Ongoing Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Ongoing Type</em>' attribute.
	 * @see #getIncludeOngoingType()
	 * @generated
	 */
	void setIncludeOngoingType(String value);

	/**
	 * Returns the value of the '<em><b>Include Races</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include Races</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Races</em>' attribute.
	 * @see #setIncludeRaces(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCardFilter_IncludeRaces()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='IncludeRaces' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIncludeRaces();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeRaces <em>Include Races</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Races</em>' attribute.
	 * @see #getIncludeRaces()
	 * @generated
	 */
	void setIncludeRaces(String value);

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
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCardFilter_IncludeSchool()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='IncludeSchool' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIncludeSchool();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeSchool <em>Include School</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include School</em>' attribute.
	 * @see #getIncludeSchool()
	 * @generated
	 */
	void setIncludeSchool(String value);

	/**
	 * Returns the value of the '<em><b>Include Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Status</em>' attribute.
	 * @see #setIncludeStatus(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCardFilter_IncludeStatus()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='IncludeStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIncludeStatus();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeStatus <em>Include Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Status</em>' attribute.
	 * @see #getIncludeStatus()
	 * @generated
	 */
	void setIncludeStatus(String value);

	/**
	 * Returns the value of the '<em><b>Include Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include Unique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Unique</em>' attribute.
	 * @see #setIncludeUnique(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCardFilter_IncludeUnique()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='IncludeUnique' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIncludeUnique();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeUnique <em>Include Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Unique</em>' attribute.
	 * @see #getIncludeUnique()
	 * @generated
	 */
	void setIncludeUnique(String value);

	/**
	 * Returns the value of the '<em><b>Include Unit Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include Unit Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Unit Type</em>' attribute.
	 * @see #setIncludeUnitType(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCardFilter_IncludeUnitType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='IncludeUnitType' namespace='##targetNamespace'"
	 * @generated
	 */
	String getIncludeUnitType();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getIncludeUnitType <em>Include Unit Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Unit Type</em>' attribute.
	 * @see #getIncludeUnitType()
	 * @generated
	 */
	void setIncludeUnitType(String value);

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
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCardFilter_LevelType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='LevelType' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLevelType();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getLevelType <em>Level Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level Type</em>' attribute.
	 * @see #getLevelType()
	 * @generated
	 */
	void setLevelType(String value);

	/**
	 * Returns the value of the '<em><b>Max Attack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Attack</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Attack</em>' attribute.
	 * @see #setMaxAttack(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCardFilter_MaxAttack()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='MaxAttack' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMaxAttack();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getMaxAttack <em>Max Attack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Attack</em>' attribute.
	 * @see #getMaxAttack()
	 * @generated
	 */
	void setMaxAttack(String value);

	/**
	 * Returns the value of the '<em><b>Max Cost</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Cost</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Cost</em>' attribute.
	 * @see #setMaxCost(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCardFilter_MaxCost()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='MaxCost' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMaxCost();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getMaxCost <em>Max Cost</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Cost</em>' attribute.
	 * @see #getMaxCost()
	 * @generated
	 */
	void setMaxCost(String value);

	/**
	 * Returns the value of the '<em><b>Max Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Level</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Level</em>' attribute.
	 * @see #setMaxLevel(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCardFilter_MaxLevel()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='MaxLevel' namespace='##targetNamespace'"
	 * @generated
	 */
	String getMaxLevel();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getMaxLevel <em>Max Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Level</em>' attribute.
	 * @see #getMaxLevel()
	 * @generated
	 */
	void setMaxLevel(String value);

	/**
	 * Returns the value of the '<em><b>Same Card Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Same Card Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Same Card Type</em>' attribute.
	 * @see #setSameCardType(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCardFilter_SameCardType()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='SameCardType' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSameCardType();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getSameCardType <em>Same Card Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Same Card Type</em>' attribute.
	 * @see #getSameCardType()
	 * @generated
	 */
	void setSameCardType(String value);

	/**
	 * Returns the value of the '<em><b>Same GPID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Same GPID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Same GPID</em>' attribute.
	 * @see #setSameGPID(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCardFilter_SameGPID()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='SameGPID' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSameGPID();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getSameGPID <em>Same GPID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Same GPID</em>' attribute.
	 * @see #getSameGPID()
	 * @generated
	 */
	void setSameGPID(String value);

	/**
	 * Returns the value of the '<em><b>Share Races</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Share Races</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Share Races</em>' attribute.
	 * @see #setShareRaces(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCardFilter_ShareRaces()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ShareRaces' namespace='##targetNamespace'"
	 * @generated
	 */
	String getShareRaces();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getShareRaces <em>Share Races</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Share Races</em>' attribute.
	 * @see #getShareRaces()
	 * @generated
	 */
	void setShareRaces(String value);

	/**
	 * Returns the value of the '<em><b>Share Races With Occupant</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Share Races With Occupant</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Share Races With Occupant</em>' attribute.
	 * @see #setShareRacesWithOccupant(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCardFilter_ShareRacesWithOccupant()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ShareRacesWithOccupant' namespace='##targetNamespace'"
	 * @generated
	 */
	String getShareRacesWithOccupant();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getShareRacesWithOccupant <em>Share Races With Occupant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Share Races With Occupant</em>' attribute.
	 * @see #getShareRacesWithOccupant()
	 * @generated
	 */
	void setShareRacesWithOccupant(String value);

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
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCardFilter_Side()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Side' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSide();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getSide <em>Side</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Side</em>' attribute.
	 * @see #getSide()
	 * @generated
	 */
	void setSide(String value);

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
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getCardFilter_Value()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Value' namespace='##targetNamespace'"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.CardFilter#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

} // CardFilter
