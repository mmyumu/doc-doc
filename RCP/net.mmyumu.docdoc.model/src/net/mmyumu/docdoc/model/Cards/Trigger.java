/**
 */
package net.mmyumu.docdoc.model.Cards;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Trigger#getGroup <em>Group</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Trigger#getCardFilter <em>Card Filter</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Trigger#getTarget <em>Target</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Trigger#getCondition <em>Condition</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Trigger#getDamageIncludeFlags <em>Damage Include Flags</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Trigger#getDuration <em>Duration</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Trigger#getExecuteOncePerTransaction <em>Execute Once Per Transaction</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Trigger#getExecuteOncePerTurn <em>Execute Once Per Turn</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Trigger#getLocation <em>Location</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Trigger#getSide <em>Side</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Trigger#getType <em>Type</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Trigger#getUseTriggererAsInitiator <em>Use Triggerer As Initiator</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTrigger()
 * @model extendedMetaData="name='Trigger' kind='elementOnly'"
 * @generated
 */
public interface Trigger extends EObject {
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
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTrigger_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

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
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTrigger_CardFilter()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='CardFilter' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<CardFilter> getCardFilter();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' containment reference list.
	 * The list contents are of type {@link net.mmyumu.docdoc.model.Cards.Target}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' containment reference list.
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTrigger_Target()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Target' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<Target> getTarget();

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
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTrigger_Condition()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Condition' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<Condition> getCondition();

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
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTrigger_DamageIncludeFlags()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='DamageIncludeFlags' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDamageIncludeFlags();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Trigger#getDamageIncludeFlags <em>Damage Include Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Damage Include Flags</em>' attribute.
	 * @see #getDamageIncludeFlags()
	 * @generated
	 */
	void setDamageIncludeFlags(String value);

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
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTrigger_Duration()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Duration' namespace='##targetNamespace'"
	 * @generated
	 */
	String getDuration();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Trigger#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(String value);

	/**
	 * Returns the value of the '<em><b>Execute Once Per Transaction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execute Once Per Transaction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execute Once Per Transaction</em>' attribute.
	 * @see #setExecuteOncePerTransaction(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTrigger_ExecuteOncePerTransaction()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ExecuteOncePerTransaction' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExecuteOncePerTransaction();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Trigger#getExecuteOncePerTransaction <em>Execute Once Per Transaction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execute Once Per Transaction</em>' attribute.
	 * @see #getExecuteOncePerTransaction()
	 * @generated
	 */
	void setExecuteOncePerTransaction(String value);

	/**
	 * Returns the value of the '<em><b>Execute Once Per Turn</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execute Once Per Turn</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execute Once Per Turn</em>' attribute.
	 * @see #setExecuteOncePerTurn(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTrigger_ExecuteOncePerTurn()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='ExecuteOncePerTurn' namespace='##targetNamespace'"
	 * @generated
	 */
	String getExecuteOncePerTurn();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Trigger#getExecuteOncePerTurn <em>Execute Once Per Turn</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execute Once Per Turn</em>' attribute.
	 * @see #getExecuteOncePerTurn()
	 * @generated
	 */
	void setExecuteOncePerTurn(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTrigger_Location()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Location' namespace='##targetNamespace'"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Trigger#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

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
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTrigger_Side()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Side' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSide();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Trigger#getSide <em>Side</em>}' attribute.
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
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTrigger_Type()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='Type' namespace='##targetNamespace'"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Trigger#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>Use Triggerer As Initiator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Triggerer As Initiator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Triggerer As Initiator</em>' attribute.
	 * @see #setUseTriggererAsInitiator(String)
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getTrigger_UseTriggererAsInitiator()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='attribute' name='UseTriggererAsInitiator' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUseTriggererAsInitiator();

	/**
	 * Sets the value of the '{@link net.mmyumu.docdoc.model.Cards.Trigger#getUseTriggererAsInitiator <em>Use Triggerer As Initiator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Triggerer As Initiator</em>' attribute.
	 * @see #getUseTriggererAsInitiator()
	 * @generated
	 */
	void setUseTriggererAsInitiator(String value);

} // Trigger
