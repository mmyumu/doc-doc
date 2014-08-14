/**
 */
package net.mmyumu.docdoc.model.Cards.impl;

import net.mmyumu.docdoc.model.Cards.Card;
import net.mmyumu.docdoc.model.Cards.CardFilter;
import net.mmyumu.docdoc.model.Cards.Cards;
import net.mmyumu.docdoc.model.Cards.CardsFactory;
import net.mmyumu.docdoc.model.Cards.CardsPackage;
import net.mmyumu.docdoc.model.Cards.DocumentRoot;
import net.mmyumu.docdoc.model.Cards.Effect;
import net.mmyumu.docdoc.model.Cards.OnGoing;
import net.mmyumu.docdoc.model.Cards.Option;
import net.mmyumu.docdoc.model.Cards.School;
import net.mmyumu.docdoc.model.Cards.Subgroup;
import net.mmyumu.docdoc.model.Cards.Target;
import net.mmyumu.docdoc.model.Cards.TemplateEffect;
import net.mmyumu.docdoc.model.Cards.Trigger;

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
	private EClass cardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardFilterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardsEClass = null;

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
	private EClass effectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass onGoingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass schoolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subgroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass targetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass templateEffectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triggerEClass = null;

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
	public EClass getCard() {
		return cardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCard_School() {
		return (EReference)cardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_Description() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCard_Ongoing() {
		return (EReference)cardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCard_Target() {
		return (EReference)cardEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_DestinyLevel() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_DisplayName() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_Faction() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_HP() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_ID() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_MagicLevel() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_MightLevel() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_Name() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_Rarity() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_Type() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCardFilter() {
		return cardFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardFilter_IncludeUnitType() {
		return (EAttribute)cardFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardFilter_Side() {
		return (EAttribute)cardFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCards() {
		return cardsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCards_Card() {
		return (EReference)cardsEClass.getEStructuralFeatures().get(0);
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
	public EClass getEffect() {
		return effectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffect_Duration() {
		return (EAttribute)effectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffect_Type() {
		return (EAttribute)effectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffect_Value() {
		return (EAttribute)effectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOnGoing() {
		return onGoingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOnGoing_Duration() {
		return (EAttribute)onGoingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOption() {
		return optionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOption_DisplayText() {
		return (EAttribute)optionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOption_Value() {
		return (EAttribute)optionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSchool() {
		return schoolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSchool_Name() {
		return (EAttribute)schoolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubgroup() {
		return subgroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubgroup_TemplateEffect() {
		return (EReference)subgroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubgroup_Target() {
		return (EReference)subgroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTarget() {
		return targetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTarget_Option() {
		return (EReference)targetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTarget_Trigger() {
		return (EReference)targetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTarget_Effect() {
		return (EReference)targetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTarget_Subgroup() {
		return (EReference)targetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTarget_Amount() {
		return (EAttribute)targetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTarget_Side() {
		return (EAttribute)targetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTarget_Zone() {
		return (EAttribute)targetEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTemplateEffect() {
		return templateEffectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemplateEffect_Name() {
		return (EAttribute)templateEffectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTrigger() {
		return triggerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrigger_CardFilter() {
		return (EReference)triggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrigger_Target() {
		return (EReference)triggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrigger_Type() {
		return (EAttribute)triggerEClass.getEStructuralFeatures().get(2);
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
		cardEClass = createEClass(CARD);
		createEReference(cardEClass, CARD__SCHOOL);
		createEAttribute(cardEClass, CARD__DESCRIPTION);
		createEReference(cardEClass, CARD__ONGOING);
		createEReference(cardEClass, CARD__TARGET);
		createEAttribute(cardEClass, CARD__DESTINY_LEVEL);
		createEAttribute(cardEClass, CARD__DISPLAY_NAME);
		createEAttribute(cardEClass, CARD__FACTION);
		createEAttribute(cardEClass, CARD__HP);
		createEAttribute(cardEClass, CARD__ID);
		createEAttribute(cardEClass, CARD__MAGIC_LEVEL);
		createEAttribute(cardEClass, CARD__MIGHT_LEVEL);
		createEAttribute(cardEClass, CARD__NAME);
		createEAttribute(cardEClass, CARD__RARITY);
		createEAttribute(cardEClass, CARD__TYPE);

		cardFilterEClass = createEClass(CARD_FILTER);
		createEAttribute(cardFilterEClass, CARD_FILTER__INCLUDE_UNIT_TYPE);
		createEAttribute(cardFilterEClass, CARD_FILTER__SIDE);

		cardsEClass = createEClass(CARDS);
		createEReference(cardsEClass, CARDS__CARD);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CARDS);

		effectEClass = createEClass(EFFECT);
		createEAttribute(effectEClass, EFFECT__DURATION);
		createEAttribute(effectEClass, EFFECT__TYPE);
		createEAttribute(effectEClass, EFFECT__VALUE);

		onGoingEClass = createEClass(ON_GOING);
		createEAttribute(onGoingEClass, ON_GOING__DURATION);

		optionEClass = createEClass(OPTION);
		createEAttribute(optionEClass, OPTION__DISPLAY_TEXT);
		createEAttribute(optionEClass, OPTION__VALUE);

		schoolEClass = createEClass(SCHOOL);
		createEAttribute(schoolEClass, SCHOOL__NAME);

		subgroupEClass = createEClass(SUBGROUP);
		createEReference(subgroupEClass, SUBGROUP__TEMPLATE_EFFECT);
		createEReference(subgroupEClass, SUBGROUP__TARGET);

		targetEClass = createEClass(TARGET);
		createEReference(targetEClass, TARGET__OPTION);
		createEReference(targetEClass, TARGET__TRIGGER);
		createEReference(targetEClass, TARGET__EFFECT);
		createEReference(targetEClass, TARGET__SUBGROUP);
		createEAttribute(targetEClass, TARGET__AMOUNT);
		createEAttribute(targetEClass, TARGET__SIDE);
		createEAttribute(targetEClass, TARGET__ZONE);

		templateEffectEClass = createEClass(TEMPLATE_EFFECT);
		createEAttribute(templateEffectEClass, TEMPLATE_EFFECT__NAME);

		triggerEClass = createEClass(TRIGGER);
		createEReference(triggerEClass, TRIGGER__CARD_FILTER);
		createEReference(triggerEClass, TRIGGER__TARGET);
		createEAttribute(triggerEClass, TRIGGER__TYPE);
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
		initEClass(cardEClass, Card.class, "Card", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCard_School(), ecorePackage.getEObject(), null, "school", null, 1, -1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_Description(), theXMLTypePackage.getString(), "description", null, 1, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCard_Ongoing(), ecorePackage.getEObject(), null, "ongoing", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCard_Target(), ecorePackage.getEObject(), null, "target", null, 1, -1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_DestinyLevel(), theXMLTypePackage.getInt(), "destinyLevel", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_DisplayName(), theXMLTypePackage.getString(), "displayName", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_Faction(), theXMLTypePackage.getString(), "faction", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_HP(), theXMLTypePackage.getInt(), "hP", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_ID(), theXMLTypePackage.getInt(), "iD", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_MagicLevel(), theXMLTypePackage.getInt(), "magicLevel", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_MightLevel(), theXMLTypePackage.getInt(), "mightLevel", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_Rarity(), theXMLTypePackage.getString(), "rarity", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_Type(), theXMLTypePackage.getString(), "type", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cardFilterEClass, CardFilter.class, "CardFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCardFilter_IncludeUnitType(), theXMLTypePackage.getString(), "includeUnitType", null, 0, 1, CardFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardFilter_Side(), theXMLTypePackage.getString(), "side", null, 0, 1, CardFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cardsEClass, Cards.class, "Cards", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCards_Card(), this.getCard(), null, "card", null, 1, -1, Cards.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Cards(), this.getCards(), null, "cards", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(effectEClass, Effect.class, "Effect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEffect_Duration(), theXMLTypePackage.getString(), "duration", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEffect_Type(), theXMLTypePackage.getString(), "type", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEffect_Value(), theXMLTypePackage.getInt(), "value", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(onGoingEClass, OnGoing.class, "OnGoing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOnGoing_Duration(), theXMLTypePackage.getString(), "duration", null, 0, 1, OnGoing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionEClass, Option.class, "Option", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOption_DisplayText(), theXMLTypePackage.getString(), "displayText", null, 0, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOption_Value(), theXMLTypePackage.getInt(), "value", null, 0, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schoolEClass, School.class, "School", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSchool_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, School.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subgroupEClass, Subgroup.class, "Subgroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubgroup_TemplateEffect(), ecorePackage.getEObject(), null, "templateEffect", null, 1, 1, Subgroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubgroup_Target(), ecorePackage.getEObject(), null, "target", null, 0, 1, Subgroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(targetEClass, Target.class, "Target", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTarget_Option(), ecorePackage.getEObject(), null, "option", null, 1, 1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTarget_Trigger(), ecorePackage.getEObject(), null, "trigger", null, 1, 1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTarget_Effect(), ecorePackage.getEObject(), null, "effect", null, 1, 1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTarget_Subgroup(), ecorePackage.getEObject(), null, "subgroup", null, 1, 1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTarget_Amount(), theXMLTypePackage.getString(), "amount", null, 0, 1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTarget_Side(), theXMLTypePackage.getString(), "side", null, 0, 1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTarget_Zone(), theXMLTypePackage.getString(), "zone", null, 0, 1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(templateEffectEClass, TemplateEffect.class, "TemplateEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTemplateEffect_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, TemplateEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triggerEClass, Trigger.class, "Trigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrigger_CardFilter(), ecorePackage.getEObject(), null, "cardFilter", null, 1, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrigger_Target(), ecorePackage.getEObject(), null, "target", null, 1, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrigger_Type(), theXMLTypePackage.getString(), "type", null, 0, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (cardEClass, 
		   source, 
		   new String[] {
			 "name", "Card",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getCard_School(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "School",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCard_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Description",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCard_Ongoing(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Ongoing",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCard_Target(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Target",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCard_DestinyLevel(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "DestinyLevel",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCard_DisplayName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "DisplayName",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCard_Faction(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Faction",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCard_HP(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "HP",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCard_ID(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ID",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCard_MagicLevel(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "MagicLevel",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCard_MightLevel(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "MightLevel",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCard_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCard_Rarity(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Rarity",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCard_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Type",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (cardFilterEClass, 
		   source, 
		   new String[] {
			 "name", "CardFilter",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getCardFilter_IncludeUnitType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IncludeUnitType",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCardFilter_Side(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Side",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (cardsEClass, 
		   source, 
		   new String[] {
			 "name", "Cards",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getCards_Card(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Card",
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
		  (effectEClass, 
		   source, 
		   new String[] {
			 "name", "Effect",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getEffect_Duration(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Duration",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEffect_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Type",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEffect_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (onGoingEClass, 
		   source, 
		   new String[] {
			 "name", "OnGoing",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getOnGoing_Duration(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Duration",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (optionEClass, 
		   source, 
		   new String[] {
			 "name", "Option",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getOption_DisplayText(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "DisplayText",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getOption_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (schoolEClass, 
		   source, 
		   new String[] {
			 "name", "School",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getSchool_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (subgroupEClass, 
		   source, 
		   new String[] {
			 "name", "Subgroup",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getSubgroup_TemplateEffect(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TemplateEffect",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getSubgroup_Target(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Target",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (targetEClass, 
		   source, 
		   new String[] {
			 "name", "Target",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getTarget_Option(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Option",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTarget_Trigger(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Trigger",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTarget_Effect(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Effect",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTarget_Subgroup(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Subgroup",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTarget_Amount(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Amount",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTarget_Side(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Side",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTarget_Zone(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Zone",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (templateEffectEClass, 
		   source, 
		   new String[] {
			 "name", "TemplateEffect",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getTemplateEffect_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (triggerEClass, 
		   source, 
		   new String[] {
			 "name", "Trigger",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getTrigger_CardFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CardFilter",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTrigger_Target(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Target",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTrigger_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Type",
			 "namespace", "##targetNamespace"
		   });
	}

} //CardsPackageImpl
