/**
 */
package net.mmyumu.docdoc.model.Cards.impl;

import net.mmyumu.docdoc.model.Cards.CardType;
import net.mmyumu.docdoc.model.Cards.CardsFactory;
import net.mmyumu.docdoc.model.Cards.CardsPackage;
import net.mmyumu.docdoc.model.Cards.CardsType;
import net.mmyumu.docdoc.model.Cards.DocumentRoot;
import net.mmyumu.docdoc.model.Cards.EffectType;
import net.mmyumu.docdoc.model.Cards.PlayabilityConditionType;
import net.mmyumu.docdoc.model.Cards.TargetType;
import net.mmyumu.docdoc.model.Cards.VariableType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CardsPackageImpl extends EPackageImpl implements CardsPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass effectTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass playabilityConditionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableTypeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see net.mmyumu.docdoc.model.Cards.CardsPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CardsPackageImpl() {
		super(eNS_URI, CardsFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CardsPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CardsPackage init() {
		if (isInited) return (CardsPackage)EPackage.Registry.INSTANCE.getEPackage(CardsPackage.eNS_URI);

		// Obtain or create and register package
		CardsPackageImpl theCardsPackage = (CardsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CardsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CardsPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCardsPackage.createPackageContents();

		// Initialize created meta-data
		theCardsPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCardsPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CardsPackage.eNS_URI, theCardsPackage);
		return theCardsPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCardsType() {
		return cardsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCardsType_Card() {
		return (EReference)cardsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCardType() {
		return cardTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCardType_Variable() {
		return (EReference)cardTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCardType_PlayabilityCondition() {
		return (EReference)cardTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCardType_Target() {
		return (EReference)cardTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardType_Description() {
		return (EAttribute)cardTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardType_Cost() {
		return (EAttribute)cardTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardType_DestinyLevel() {
		return (EAttribute)cardTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardType_DisplayName() {
		return (EAttribute)cardTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardType_Faction() {
		return (EAttribute)cardTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardType_ID() {
		return (EAttribute)cardTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardType_Name() {
		return (EAttribute)cardTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardType_Rarity() {
		return (EAttribute)cardTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardType_Type() {
		return (EAttribute)cardTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Cards() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEffectType() {
		return effectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffectType_Type() {
		return (EAttribute)effectTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffectType_Value() {
		return (EAttribute)effectTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlayabilityConditionType() {
		return playabilityConditionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlayabilityConditionType_Operator() {
		return (EAttribute)playabilityConditionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlayabilityConditionType_ValueA() {
		return (EAttribute)playabilityConditionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPlayabilityConditionType_ValueB() {
		return (EAttribute)playabilityConditionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTargetType() {
		return targetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTargetType_Effect() {
		return (EReference)targetTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetType_Amount() {
		return (EAttribute)targetTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetType_Side() {
		return (EAttribute)targetTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTargetType_Zone() {
		return (EAttribute)targetTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableType() {
		return variableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableType_Side() {
		return (EAttribute)variableTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableType_Type() {
		return (EAttribute)variableTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardsFactory getCardsFactory() {
		return (CardsFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		cardsTypeEClass = createEClass(CARDS_TYPE);
		createEReference(cardsTypeEClass, CARDS_TYPE__CARD);

		cardTypeEClass = createEClass(CARD_TYPE);
		createEReference(cardTypeEClass, CARD_TYPE__VARIABLE);
		createEReference(cardTypeEClass, CARD_TYPE__PLAYABILITY_CONDITION);
		createEReference(cardTypeEClass, CARD_TYPE__TARGET);
		createEAttribute(cardTypeEClass, CARD_TYPE__DESCRIPTION);
		createEAttribute(cardTypeEClass, CARD_TYPE__COST);
		createEAttribute(cardTypeEClass, CARD_TYPE__DESTINY_LEVEL);
		createEAttribute(cardTypeEClass, CARD_TYPE__DISPLAY_NAME);
		createEAttribute(cardTypeEClass, CARD_TYPE__FACTION);
		createEAttribute(cardTypeEClass, CARD_TYPE__ID);
		createEAttribute(cardTypeEClass, CARD_TYPE__NAME);
		createEAttribute(cardTypeEClass, CARD_TYPE__RARITY);
		createEAttribute(cardTypeEClass, CARD_TYPE__TYPE);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CARDS);

		effectTypeEClass = createEClass(EFFECT_TYPE);
		createEAttribute(effectTypeEClass, EFFECT_TYPE__TYPE);
		createEAttribute(effectTypeEClass, EFFECT_TYPE__VALUE);

		playabilityConditionTypeEClass = createEClass(PLAYABILITY_CONDITION_TYPE);
		createEAttribute(playabilityConditionTypeEClass, PLAYABILITY_CONDITION_TYPE__OPERATOR);
		createEAttribute(playabilityConditionTypeEClass, PLAYABILITY_CONDITION_TYPE__VALUE_A);
		createEAttribute(playabilityConditionTypeEClass, PLAYABILITY_CONDITION_TYPE__VALUE_B);

		targetTypeEClass = createEClass(TARGET_TYPE);
		createEReference(targetTypeEClass, TARGET_TYPE__EFFECT);
		createEAttribute(targetTypeEClass, TARGET_TYPE__AMOUNT);
		createEAttribute(targetTypeEClass, TARGET_TYPE__SIDE);
		createEAttribute(targetTypeEClass, TARGET_TYPE__ZONE);

		variableTypeEClass = createEClass(VARIABLE_TYPE);
		createEAttribute(variableTypeEClass, VARIABLE_TYPE__SIDE);
		createEAttribute(variableTypeEClass, VARIABLE_TYPE__TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(cardsTypeEClass, CardsType.class, "CardsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCardsType_Card(), this.getCardType(), null, "card", null, 1, -1, CardsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cardTypeEClass, CardType.class, "CardType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCardType_Variable(), this.getVariableType(), null, "variable", null, 1, 1, CardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCardType_PlayabilityCondition(), this.getPlayabilityConditionType(), null, "playabilityCondition", null, 1, 1, CardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCardType_Target(), this.getTargetType(), null, "target", null, 1, 1, CardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardType_Description(), theXMLTypePackage.getString(), "description", null, 1, 1, CardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardType_Cost(), theXMLTypePackage.getInt(), "cost", null, 0, 1, CardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardType_DestinyLevel(), theXMLTypePackage.getInt(), "destinyLevel", null, 0, 1, CardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardType_DisplayName(), theXMLTypePackage.getString(), "displayName", null, 0, 1, CardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardType_Faction(), theXMLTypePackage.getString(), "faction", null, 0, 1, CardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardType_ID(), theXMLTypePackage.getInt(), "iD", null, 0, 1, CardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardType_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, CardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardType_Rarity(), theXMLTypePackage.getString(), "rarity", null, 0, 1, CardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardType_Type(), theXMLTypePackage.getString(), "type", null, 0, 1, CardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Cards(), this.getCardsType(), null, "cards", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(effectTypeEClass, EffectType.class, "EffectType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEffectType_Type(), theXMLTypePackage.getString(), "type", null, 0, 1, EffectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEffectType_Value(), theXMLTypePackage.getInt(), "value", null, 0, 1, EffectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(playabilityConditionTypeEClass, PlayabilityConditionType.class, "PlayabilityConditionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPlayabilityConditionType_Operator(), theXMLTypePackage.getString(), "operator", null, 0, 1, PlayabilityConditionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlayabilityConditionType_ValueA(), theXMLTypePackage.getString(), "valueA", null, 0, 1, PlayabilityConditionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPlayabilityConditionType_ValueB(), theXMLTypePackage.getInt(), "valueB", null, 0, 1, PlayabilityConditionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(targetTypeEClass, TargetType.class, "TargetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTargetType_Effect(), this.getEffectType(), null, "effect", null, 1, 1, TargetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTargetType_Amount(), theXMLTypePackage.getString(), "amount", null, 0, 1, TargetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTargetType_Side(), theXMLTypePackage.getString(), "side", null, 0, 1, TargetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTargetType_Zone(), theXMLTypePackage.getString(), "zone", null, 0, 1, TargetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableTypeEClass, VariableType.class, "VariableType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariableType_Side(), theXMLTypePackage.getString(), "side", null, 0, 1, VariableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariableType_Type(), theXMLTypePackage.getString(), "type", null, 0, 1, VariableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "qualified", "false"
		   });	
		addAnnotation
		  (cardsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Cards_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getCardsType_Card(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Card",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (cardTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Card_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getCardType_Variable(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Variable",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCardType_PlayabilityCondition(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PlayabilityCondition",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCardType_Target(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Target",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCardType_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Description",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCardType_Cost(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Cost",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCardType_DestinyLevel(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "DestinyLevel",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCardType_DisplayName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "DisplayName",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCardType_Faction(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Faction",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCardType_ID(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ID",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCardType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCardType_Rarity(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Rarity",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCardType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Type",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });	
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });	
		addAnnotation
		  (getDocumentRoot_Cards(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Cards",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (effectTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Effect_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getEffectType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Type",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEffectType_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (playabilityConditionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "PlayabilityCondition_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getPlayabilityConditionType_Operator(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Operator",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPlayabilityConditionType_ValueA(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ValueA",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getPlayabilityConditionType_ValueB(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ValueB",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (targetTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Target_._type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getTargetType_Effect(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Effect",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTargetType_Amount(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Amount",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTargetType_Side(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Side",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTargetType_Zone(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Zone",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (variableTypeEClass, 
		   source, 
		   new String[] {
			 "name", "Variable_._type",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getVariableType_Side(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Side",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getVariableType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Type",
			 "namespace", "##targetNamespace"
		   });
	}

} //CardsPackageImpl
