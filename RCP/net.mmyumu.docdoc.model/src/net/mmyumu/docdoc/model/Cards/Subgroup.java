/**
 */
package net.mmyumu.docdoc.model.Cards;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subgroup</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Subgroup#getGroup <em>Group</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Subgroup#getTemplateEffect <em>Template Effect</em>}</li>
 *   <li>{@link net.mmyumu.docdoc.model.Cards.Subgroup#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getSubgroup()
 * @model extendedMetaData="name='Subgroup' kind='elementOnly'"
 * @generated
 */
public interface Subgroup extends EObject {
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
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getSubgroup_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Template Effect</b></em>' containment reference list.
	 * The list contents are of type {@link net.mmyumu.docdoc.model.Cards.TemplateEffect}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Template Effect</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Effect</em>' containment reference list.
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getSubgroup_TemplateEffect()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='TemplateEffect' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<TemplateEffect> getTemplateEffect();

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
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#getSubgroup_Target()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='Target' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<Target> getTarget();

} // Subgroup
