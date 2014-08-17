/**
 */
package net.mmyumu.docdoc.model.Cards.impl;

import net.mmyumu.docdoc.model.Cards.Ability;
import net.mmyumu.docdoc.model.Cards.AdditionalCost;
import net.mmyumu.docdoc.model.Cards.BattlegroundFilter;
import net.mmyumu.docdoc.model.Cards.Card;
import net.mmyumu.docdoc.model.Cards.CardFilter;
import net.mmyumu.docdoc.model.Cards.CardType;
import net.mmyumu.docdoc.model.Cards.Cards;
import net.mmyumu.docdoc.model.Cards.CardsFactory;
import net.mmyumu.docdoc.model.Cards.CardsPackage;
import net.mmyumu.docdoc.model.Cards.Condition;
import net.mmyumu.docdoc.model.Cards.DocumentRoot;
import net.mmyumu.docdoc.model.Cards.Effect;
import net.mmyumu.docdoc.model.Cards.ExistingCard;
import net.mmyumu.docdoc.model.Cards.OnGoing;
import net.mmyumu.docdoc.model.Cards.Option;
import net.mmyumu.docdoc.model.Cards.School;
import net.mmyumu.docdoc.model.Cards.Subgroup;
import net.mmyumu.docdoc.model.Cards.Target;
import net.mmyumu.docdoc.model.Cards.TemplateEffect;
import net.mmyumu.docdoc.model.Cards.Trigger;
import net.mmyumu.docdoc.model.Cards.Variable;

import net.mmyumu.docdoc.model.Library.LibraryPackage;

import net.mmyumu.docdoc.model.Library.impl.LibraryPackageImpl;

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
	private EClass abilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionalCostEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass battlegroundFilterEClass = null;

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
	private EClass cardTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionEClass = null;

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
	private EClass existingCardEClass = null;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

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

		// Obtain or create and register interdependencies
		LibraryPackageImpl theLibraryPackage = (LibraryPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(LibraryPackage.eNS_URI) instanceof LibraryPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(LibraryPackage.eNS_URI) : LibraryPackage.eINSTANCE);

		// Create package meta-data objects
		theCardsPackage.createPackageContents();
		theLibraryPackage.createPackageContents();

		// Initialize created meta-data
		theCardsPackage.initializePackageContents();
		theLibraryPackage.initializePackageContents();

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
	public EClass getAbility() {
		return abilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbility_Type() {
		return (EAttribute)abilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbility_Value() {
		return (EAttribute)abilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdditionalCost() {
		return additionalCostEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdditionalCost_Target() {
		return (EReference)additionalCostEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBattlegroundFilter() {
		return battlegroundFilterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBattlegroundFilter_Line() {
		return (EAttribute)battlegroundFilterEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getCard_Mixed() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_Group() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCard_Ability() {
		return (EReference)cardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCard_School() {
		return (EReference)cardEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCard_Ongoing() {
		return (EReference)cardEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCard_Target() {
		return (EReference)cardEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_Description() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_ExtraDescription() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCard_Variable() {
		return (EReference)cardEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCard_Variable2() {
		return (EReference)cardEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCard_Variable3() {
		return (EReference)cardEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCard_Variable4() {
		return (EReference)cardEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCard_Variable5() {
		return (EReference)cardEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCard_Variable6() {
		return (EReference)cardEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCard_Variable7() {
		return (EReference)cardEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCard_PlayabilityCondition() {
		return (EReference)cardEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCard_AttackCondition() {
		return (EReference)cardEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCard_Trigger() {
		return (EReference)cardEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCard_AdditionalCost() {
		return (EReference)cardEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_Attack() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_Cost() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_DestinyLevel() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_DisplayName() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_Faction() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_HP() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_ID() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_MagicLevel() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_MightLevel() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_Name() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_NotLocalized() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_Race() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_Rarity() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_ResourceName() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_Retaliate() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_School1() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_SchoolsAligned() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_SubType() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_Token() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_Type() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_Unique() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCard_Zone() {
		return (EAttribute)cardEClass.getEStructuralFeatures().get(40);
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
	public EReference getCardFilter_Variable() {
		return (EReference)cardFilterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardFilter_AttackHeroLastTurn() {
		return (EAttribute)cardFilterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardFilter_BaseMaxCost() {
		return (EAttribute)cardFilterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardFilter_DealDamageToHeroLastTurn() {
		return (EAttribute)cardFilterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardFilter_ExcludeFaction() {
		return (EAttribute)cardFilterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardFilter_ExcludeRaces() {
		return (EAttribute)cardFilterEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardFilter_ExcludeSchool() {
		return (EAttribute)cardFilterEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardFilter_ExcludeToken() {
		return (EAttribute)cardFilterEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardFilter_ExcludeUnique() {
		return (EAttribute)cardFilterEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardFilter_ExcludeUnitType() {
		return (EAttribute)cardFilterEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardFilter_IncludeAbility() {
		return (EAttribute)cardFilterEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardFilter_IncludeCardID() {
		return (EAttribute)cardFilterEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardFilter_IncludeCardType() {
		return (EAttribute)cardFilterEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardFilter_IncludeColumn() {
		return (EAttribute)cardFilterEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardFilter_IncludeCounter() {
		return (EAttribute)cardFilterEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardFilter_IncludeEnchantUnit() {
		return (EAttribute)cardFilterEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardFilter_IncludeFaction() {
		return (EAttribute)cardFilterEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardFilter_IncludeFrontLine() {
		return (EAttribute)cardFilterEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardFilter_IncludeOccupant() {
		return (EAttribute)cardFilterEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardFilter_IncludeOngoingType() {
		return (EAttribute)cardFilterEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardFilter_IncludeRaces() {
		return (EAttribute)cardFilterEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardFilter_IncludeSchool() {
		return (EAttribute)cardFilterEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardFilter_IncludeStatus() {
		return (EAttribute)cardFilterEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardFilter_IncludeUnique() {
		return (EAttribute)cardFilterEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardFilter_IncludeUnitType() {
		return (EAttribute)cardFilterEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardFilter_LevelType() {
		return (EAttribute)cardFilterEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardFilter_MaxAttack() {
		return (EAttribute)cardFilterEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardFilter_MaxCost() {
		return (EAttribute)cardFilterEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardFilter_MaxLevel() {
		return (EAttribute)cardFilterEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardFilter_SameCardType() {
		return (EAttribute)cardFilterEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardFilter_SameGPID() {
		return (EAttribute)cardFilterEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardFilter_ShareRaces() {
		return (EAttribute)cardFilterEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardFilter_ShareRacesWithOccupant() {
		return (EAttribute)cardFilterEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardFilter_Side() {
		return (EAttribute)cardFilterEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardFilter_Value() {
		return (EAttribute)cardFilterEClass.getEStructuralFeatures().get(34);
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
	public EAttribute getCards_Group() {
		return (EAttribute)cardsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCards_Card() {
		return (EReference)cardsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCards_ExistingCard() {
		return (EReference)cardsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCards_TemplateEffect() {
		return (EReference)cardsEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getCardType_Exclude() {
		return (EAttribute)cardTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardType_Include() {
		return (EAttribute)cardTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCondition() {
		return conditionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCondition_Condition() {
		return (EReference)conditionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCondition_Operator() {
		return (EAttribute)conditionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCondition_ValueA() {
		return (EAttribute)conditionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCondition_ValueB() {
		return (EAttribute)conditionEClass.getEStructuralFeatures().get(3);
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
	public EReference getEffect_CardFilter() {
		return (EReference)effectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEffect_Condition() {
		return (EReference)effectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffect_Ability() {
		return (EAttribute)effectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffect_Bottom() {
		return (EAttribute)effectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffect_CancelDestination() {
		return (EAttribute)effectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffect_CantTargetParent() {
		return (EAttribute)effectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffect_CardHolder() {
		return (EAttribute)effectEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffect_CounterType() {
		return (EAttribute)effectEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffect_DamageExcludeFlags() {
		return (EAttribute)effectEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffect_DamageFlags() {
		return (EAttribute)effectEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffect_DamageIncludeFlags() {
		return (EAttribute)effectEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffect_DamageLethalSchools() {
		return (EAttribute)effectEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffect_Destination() {
		return (EAttribute)effectEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffect_DontGenerateTargetPosition() {
		return (EAttribute)effectEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffect_Duration() {
		return (EAttribute)effectEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffect_EpicEnrage() {
		return (EAttribute)effectEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffect_EvaluationOrder() {
		return (EAttribute)effectEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffect_FakeAdditionalCost() {
		return (EAttribute)effectEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffect_Force() {
		return (EAttribute)effectEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffect_Free() {
		return (EAttribute)effectEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffect_GlobalEffectType() {
		return (EAttribute)effectEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffect_LevelType() {
		return (EAttribute)effectEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffect_MoveFromLastKnownParent() {
		return (EAttribute)effectEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffect_Name() {
		return (EAttribute)effectEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffect_NewDuration() {
		return (EAttribute)effectEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffect_OwnerAbility() {
		return (EAttribute)effectEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffect_Persistent() {
		return (EAttribute)effectEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffect_PlayEffectType() {
		return (EAttribute)effectEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffect_Remove() {
		return (EAttribute)effectEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffect_RequireLevel() {
		return (EAttribute)effectEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffect_RevealToOther() {
		return (EAttribute)effectEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffect_Reverse() {
		return (EAttribute)effectEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffect_Shuffle() {
		return (EAttribute)effectEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffect_Side() {
		return (EAttribute)effectEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffect_SubType() {
		return (EAttribute)effectEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffect_Type() {
		return (EAttribute)effectEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffect_Unfreeze() {
		return (EAttribute)effectEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEffect_Value() {
		return (EAttribute)effectEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExistingCard() {
		return existingCardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExistingCard_Name() {
		return (EAttribute)existingCardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExistingCard_Rarity() {
		return (EAttribute)existingCardEClass.getEStructuralFeatures().get(1);
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
	public EReference getOnGoing_Condition() {
		return (EReference)onGoingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOnGoing_Duration() {
		return (EAttribute)onGoingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOnGoing_SuicideParent() {
		return (EAttribute)onGoingEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getSubgroup_Group() {
		return (EAttribute)subgroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubgroup_TemplateEffect() {
		return (EReference)subgroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubgroup_Target() {
		return (EReference)subgroupEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getTarget_Group() {
		return (EAttribute)targetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTarget_Variable() {
		return (EReference)targetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTarget_Variable2() {
		return (EReference)targetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTarget_Condition() {
		return (EReference)targetEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTarget_Option() {
		return (EReference)targetEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTarget_CardType() {
		return (EReference)targetEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTarget_CardFilter() {
		return (EReference)targetEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTarget_Trigger() {
		return (EReference)targetEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTarget_Effect() {
		return (EReference)targetEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTarget_Subgroup() {
		return (EReference)targetEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTarget_BattlegroundFilter() {
		return (EReference)targetEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTarget_AllowDuplicate() {
		return (EAttribute)targetEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTarget_Amount() {
		return (EAttribute)targetEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTarget_AmountVisible() {
		return (EAttribute)targetEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTarget_AutoTakeFirstInputs() {
		return (EAttribute)targetEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTarget_BattlegroundPositionState() {
		return (EAttribute)targetEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTarget_Cancelable() {
		return (EAttribute)targetEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTarget_CantTargetOccupant() {
		return (EAttribute)targetEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTarget_CantTargetParent() {
		return (EAttribute)targetEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTarget_CantTargetPrevious() {
		return (EAttribute)targetEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTarget_CantTargetSelf() {
		return (EAttribute)targetEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTarget_CardType1() {
		return (EAttribute)targetEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTarget_DontUpdateAfterExecution() {
		return (EAttribute)targetEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTarget_ExceptFromTrigger() {
		return (EAttribute)targetEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTarget_ExcludeUnique() {
		return (EAttribute)targetEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTarget_ForceExecute() {
		return (EAttribute)targetEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTarget_IgnoreWard() {
		return (EAttribute)targetEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTarget_InputOnExec() {
		return (EAttribute)targetEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTarget_MinAmount() {
		return (EAttribute)targetEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTarget_NeedActivation() {
		return (EAttribute)targetEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTarget_Option1() {
		return (EAttribute)targetEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTarget_Persistent() {
		return (EAttribute)targetEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTarget_Random() {
		return (EAttribute)targetEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTarget_RevealToOther() {
		return (EAttribute)targetEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTarget_Shape() {
		return (EAttribute)targetEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTarget_Side() {
		return (EAttribute)targetEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTarget_SkipNextTargetValidation() {
		return (EAttribute)targetEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTarget_SkipSubTargetValidation() {
		return (EAttribute)targetEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTarget_Zone() {
		return (EAttribute)targetEClass.getEStructuralFeatures().get(38);
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
	public EReference getTemplateEffect_Target() {
		return (EReference)templateEffectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTemplateEffect_Trigger() {
		return (EReference)templateEffectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTemplateEffect_Name() {
		return (EAttribute)templateEffectEClass.getEStructuralFeatures().get(2);
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
	public EAttribute getTrigger_Group() {
		return (EAttribute)triggerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrigger_CardFilter() {
		return (EReference)triggerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrigger_Target() {
		return (EReference)triggerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTrigger_Condition() {
		return (EReference)triggerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrigger_DamageIncludeFlags() {
		return (EAttribute)triggerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrigger_Duration() {
		return (EAttribute)triggerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrigger_ExecuteOncePerTransaction() {
		return (EAttribute)triggerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrigger_ExecuteOncePerTurn() {
		return (EAttribute)triggerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrigger_Location() {
		return (EAttribute)triggerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrigger_Side() {
		return (EAttribute)triggerEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrigger_Type() {
		return (EAttribute)triggerEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTrigger_UseTriggererAsInitiator() {
		return (EAttribute)triggerEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_Target() {
		return (EReference)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariable_CardFilter() {
		return (EReference)variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Ability() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_CounterType() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_FromTrigger() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_IncludeSchool() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_LevelType() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_MustBeTargetable() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Side() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Type() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_UnitType() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_UseCurrentTarget() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_UseLastTarget() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_UseParent() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_ValueModifier() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(14);
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
		abilityEClass = createEClass(ABILITY);
		createEAttribute(abilityEClass, ABILITY__TYPE);
		createEAttribute(abilityEClass, ABILITY__VALUE);

		additionalCostEClass = createEClass(ADDITIONAL_COST);
		createEReference(additionalCostEClass, ADDITIONAL_COST__TARGET);

		battlegroundFilterEClass = createEClass(BATTLEGROUND_FILTER);
		createEAttribute(battlegroundFilterEClass, BATTLEGROUND_FILTER__LINE);

		cardEClass = createEClass(CARD);
		createEAttribute(cardEClass, CARD__MIXED);
		createEAttribute(cardEClass, CARD__GROUP);
		createEReference(cardEClass, CARD__ABILITY);
		createEReference(cardEClass, CARD__SCHOOL);
		createEReference(cardEClass, CARD__ONGOING);
		createEReference(cardEClass, CARD__TARGET);
		createEAttribute(cardEClass, CARD__DESCRIPTION);
		createEAttribute(cardEClass, CARD__EXTRA_DESCRIPTION);
		createEReference(cardEClass, CARD__VARIABLE);
		createEReference(cardEClass, CARD__VARIABLE2);
		createEReference(cardEClass, CARD__VARIABLE3);
		createEReference(cardEClass, CARD__VARIABLE4);
		createEReference(cardEClass, CARD__VARIABLE5);
		createEReference(cardEClass, CARD__VARIABLE6);
		createEReference(cardEClass, CARD__VARIABLE7);
		createEReference(cardEClass, CARD__PLAYABILITY_CONDITION);
		createEReference(cardEClass, CARD__ATTACK_CONDITION);
		createEReference(cardEClass, CARD__TRIGGER);
		createEReference(cardEClass, CARD__ADDITIONAL_COST);
		createEAttribute(cardEClass, CARD__ATTACK);
		createEAttribute(cardEClass, CARD__COST);
		createEAttribute(cardEClass, CARD__DESTINY_LEVEL);
		createEAttribute(cardEClass, CARD__DISPLAY_NAME);
		createEAttribute(cardEClass, CARD__FACTION);
		createEAttribute(cardEClass, CARD__HP);
		createEAttribute(cardEClass, CARD__ID);
		createEAttribute(cardEClass, CARD__MAGIC_LEVEL);
		createEAttribute(cardEClass, CARD__MIGHT_LEVEL);
		createEAttribute(cardEClass, CARD__NAME);
		createEAttribute(cardEClass, CARD__NOT_LOCALIZED);
		createEAttribute(cardEClass, CARD__RACE);
		createEAttribute(cardEClass, CARD__RARITY);
		createEAttribute(cardEClass, CARD__RESOURCE_NAME);
		createEAttribute(cardEClass, CARD__RETALIATE);
		createEAttribute(cardEClass, CARD__SCHOOL1);
		createEAttribute(cardEClass, CARD__SCHOOLS_ALIGNED);
		createEAttribute(cardEClass, CARD__SUB_TYPE);
		createEAttribute(cardEClass, CARD__TOKEN);
		createEAttribute(cardEClass, CARD__TYPE);
		createEAttribute(cardEClass, CARD__UNIQUE);
		createEAttribute(cardEClass, CARD__ZONE);

		cardFilterEClass = createEClass(CARD_FILTER);
		createEReference(cardFilterEClass, CARD_FILTER__VARIABLE);
		createEAttribute(cardFilterEClass, CARD_FILTER__ATTACK_HERO_LAST_TURN);
		createEAttribute(cardFilterEClass, CARD_FILTER__BASE_MAX_COST);
		createEAttribute(cardFilterEClass, CARD_FILTER__DEAL_DAMAGE_TO_HERO_LAST_TURN);
		createEAttribute(cardFilterEClass, CARD_FILTER__EXCLUDE_FACTION);
		createEAttribute(cardFilterEClass, CARD_FILTER__EXCLUDE_RACES);
		createEAttribute(cardFilterEClass, CARD_FILTER__EXCLUDE_SCHOOL);
		createEAttribute(cardFilterEClass, CARD_FILTER__EXCLUDE_TOKEN);
		createEAttribute(cardFilterEClass, CARD_FILTER__EXCLUDE_UNIQUE);
		createEAttribute(cardFilterEClass, CARD_FILTER__EXCLUDE_UNIT_TYPE);
		createEAttribute(cardFilterEClass, CARD_FILTER__INCLUDE_ABILITY);
		createEAttribute(cardFilterEClass, CARD_FILTER__INCLUDE_CARD_ID);
		createEAttribute(cardFilterEClass, CARD_FILTER__INCLUDE_CARD_TYPE);
		createEAttribute(cardFilterEClass, CARD_FILTER__INCLUDE_COLUMN);
		createEAttribute(cardFilterEClass, CARD_FILTER__INCLUDE_COUNTER);
		createEAttribute(cardFilterEClass, CARD_FILTER__INCLUDE_ENCHANT_UNIT);
		createEAttribute(cardFilterEClass, CARD_FILTER__INCLUDE_FACTION);
		createEAttribute(cardFilterEClass, CARD_FILTER__INCLUDE_FRONT_LINE);
		createEAttribute(cardFilterEClass, CARD_FILTER__INCLUDE_OCCUPANT);
		createEAttribute(cardFilterEClass, CARD_FILTER__INCLUDE_ONGOING_TYPE);
		createEAttribute(cardFilterEClass, CARD_FILTER__INCLUDE_RACES);
		createEAttribute(cardFilterEClass, CARD_FILTER__INCLUDE_SCHOOL);
		createEAttribute(cardFilterEClass, CARD_FILTER__INCLUDE_STATUS);
		createEAttribute(cardFilterEClass, CARD_FILTER__INCLUDE_UNIQUE);
		createEAttribute(cardFilterEClass, CARD_FILTER__INCLUDE_UNIT_TYPE);
		createEAttribute(cardFilterEClass, CARD_FILTER__LEVEL_TYPE);
		createEAttribute(cardFilterEClass, CARD_FILTER__MAX_ATTACK);
		createEAttribute(cardFilterEClass, CARD_FILTER__MAX_COST);
		createEAttribute(cardFilterEClass, CARD_FILTER__MAX_LEVEL);
		createEAttribute(cardFilterEClass, CARD_FILTER__SAME_CARD_TYPE);
		createEAttribute(cardFilterEClass, CARD_FILTER__SAME_GPID);
		createEAttribute(cardFilterEClass, CARD_FILTER__SHARE_RACES);
		createEAttribute(cardFilterEClass, CARD_FILTER__SHARE_RACES_WITH_OCCUPANT);
		createEAttribute(cardFilterEClass, CARD_FILTER__SIDE);
		createEAttribute(cardFilterEClass, CARD_FILTER__VALUE);

		cardsEClass = createEClass(CARDS);
		createEAttribute(cardsEClass, CARDS__GROUP);
		createEReference(cardsEClass, CARDS__CARD);
		createEReference(cardsEClass, CARDS__EXISTING_CARD);
		createEReference(cardsEClass, CARDS__TEMPLATE_EFFECT);

		cardTypeEClass = createEClass(CARD_TYPE);
		createEAttribute(cardTypeEClass, CARD_TYPE__EXCLUDE);
		createEAttribute(cardTypeEClass, CARD_TYPE__INCLUDE);

		conditionEClass = createEClass(CONDITION);
		createEReference(conditionEClass, CONDITION__CONDITION);
		createEAttribute(conditionEClass, CONDITION__OPERATOR);
		createEAttribute(conditionEClass, CONDITION__VALUE_A);
		createEAttribute(conditionEClass, CONDITION__VALUE_B);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CARDS);

		effectEClass = createEClass(EFFECT);
		createEReference(effectEClass, EFFECT__CARD_FILTER);
		createEReference(effectEClass, EFFECT__CONDITION);
		createEAttribute(effectEClass, EFFECT__ABILITY);
		createEAttribute(effectEClass, EFFECT__BOTTOM);
		createEAttribute(effectEClass, EFFECT__CANCEL_DESTINATION);
		createEAttribute(effectEClass, EFFECT__CANT_TARGET_PARENT);
		createEAttribute(effectEClass, EFFECT__CARD_HOLDER);
		createEAttribute(effectEClass, EFFECT__COUNTER_TYPE);
		createEAttribute(effectEClass, EFFECT__DAMAGE_EXCLUDE_FLAGS);
		createEAttribute(effectEClass, EFFECT__DAMAGE_FLAGS);
		createEAttribute(effectEClass, EFFECT__DAMAGE_INCLUDE_FLAGS);
		createEAttribute(effectEClass, EFFECT__DAMAGE_LETHAL_SCHOOLS);
		createEAttribute(effectEClass, EFFECT__DESTINATION);
		createEAttribute(effectEClass, EFFECT__DONT_GENERATE_TARGET_POSITION);
		createEAttribute(effectEClass, EFFECT__DURATION);
		createEAttribute(effectEClass, EFFECT__EPIC_ENRAGE);
		createEAttribute(effectEClass, EFFECT__EVALUATION_ORDER);
		createEAttribute(effectEClass, EFFECT__FAKE_ADDITIONAL_COST);
		createEAttribute(effectEClass, EFFECT__FORCE);
		createEAttribute(effectEClass, EFFECT__FREE);
		createEAttribute(effectEClass, EFFECT__GLOBAL_EFFECT_TYPE);
		createEAttribute(effectEClass, EFFECT__LEVEL_TYPE);
		createEAttribute(effectEClass, EFFECT__MOVE_FROM_LAST_KNOWN_PARENT);
		createEAttribute(effectEClass, EFFECT__NAME);
		createEAttribute(effectEClass, EFFECT__NEW_DURATION);
		createEAttribute(effectEClass, EFFECT__OWNER_ABILITY);
		createEAttribute(effectEClass, EFFECT__PERSISTENT);
		createEAttribute(effectEClass, EFFECT__PLAY_EFFECT_TYPE);
		createEAttribute(effectEClass, EFFECT__REMOVE);
		createEAttribute(effectEClass, EFFECT__REQUIRE_LEVEL);
		createEAttribute(effectEClass, EFFECT__REVEAL_TO_OTHER);
		createEAttribute(effectEClass, EFFECT__REVERSE);
		createEAttribute(effectEClass, EFFECT__SHUFFLE);
		createEAttribute(effectEClass, EFFECT__SIDE);
		createEAttribute(effectEClass, EFFECT__SUB_TYPE);
		createEAttribute(effectEClass, EFFECT__TYPE);
		createEAttribute(effectEClass, EFFECT__UNFREEZE);
		createEAttribute(effectEClass, EFFECT__VALUE);

		existingCardEClass = createEClass(EXISTING_CARD);
		createEAttribute(existingCardEClass, EXISTING_CARD__NAME);
		createEAttribute(existingCardEClass, EXISTING_CARD__RARITY);

		onGoingEClass = createEClass(ON_GOING);
		createEReference(onGoingEClass, ON_GOING__CONDITION);
		createEAttribute(onGoingEClass, ON_GOING__DURATION);
		createEAttribute(onGoingEClass, ON_GOING__SUICIDE_PARENT);

		optionEClass = createEClass(OPTION);
		createEAttribute(optionEClass, OPTION__DISPLAY_TEXT);
		createEAttribute(optionEClass, OPTION__VALUE);

		schoolEClass = createEClass(SCHOOL);
		createEAttribute(schoolEClass, SCHOOL__NAME);

		subgroupEClass = createEClass(SUBGROUP);
		createEAttribute(subgroupEClass, SUBGROUP__GROUP);
		createEReference(subgroupEClass, SUBGROUP__TEMPLATE_EFFECT);
		createEReference(subgroupEClass, SUBGROUP__TARGET);

		targetEClass = createEClass(TARGET);
		createEAttribute(targetEClass, TARGET__GROUP);
		createEReference(targetEClass, TARGET__VARIABLE);
		createEReference(targetEClass, TARGET__VARIABLE2);
		createEReference(targetEClass, TARGET__CONDITION);
		createEReference(targetEClass, TARGET__OPTION);
		createEReference(targetEClass, TARGET__CARD_TYPE);
		createEReference(targetEClass, TARGET__CARD_FILTER);
		createEReference(targetEClass, TARGET__TRIGGER);
		createEReference(targetEClass, TARGET__EFFECT);
		createEReference(targetEClass, TARGET__SUBGROUP);
		createEReference(targetEClass, TARGET__BATTLEGROUND_FILTER);
		createEAttribute(targetEClass, TARGET__ALLOW_DUPLICATE);
		createEAttribute(targetEClass, TARGET__AMOUNT);
		createEAttribute(targetEClass, TARGET__AMOUNT_VISIBLE);
		createEAttribute(targetEClass, TARGET__AUTO_TAKE_FIRST_INPUTS);
		createEAttribute(targetEClass, TARGET__BATTLEGROUND_POSITION_STATE);
		createEAttribute(targetEClass, TARGET__CANCELABLE);
		createEAttribute(targetEClass, TARGET__CANT_TARGET_OCCUPANT);
		createEAttribute(targetEClass, TARGET__CANT_TARGET_PARENT);
		createEAttribute(targetEClass, TARGET__CANT_TARGET_PREVIOUS);
		createEAttribute(targetEClass, TARGET__CANT_TARGET_SELF);
		createEAttribute(targetEClass, TARGET__CARD_TYPE1);
		createEAttribute(targetEClass, TARGET__DONT_UPDATE_AFTER_EXECUTION);
		createEAttribute(targetEClass, TARGET__EXCEPT_FROM_TRIGGER);
		createEAttribute(targetEClass, TARGET__EXCLUDE_UNIQUE);
		createEAttribute(targetEClass, TARGET__FORCE_EXECUTE);
		createEAttribute(targetEClass, TARGET__IGNORE_WARD);
		createEAttribute(targetEClass, TARGET__INPUT_ON_EXEC);
		createEAttribute(targetEClass, TARGET__MIN_AMOUNT);
		createEAttribute(targetEClass, TARGET__NEED_ACTIVATION);
		createEAttribute(targetEClass, TARGET__OPTION1);
		createEAttribute(targetEClass, TARGET__PERSISTENT);
		createEAttribute(targetEClass, TARGET__RANDOM);
		createEAttribute(targetEClass, TARGET__REVEAL_TO_OTHER);
		createEAttribute(targetEClass, TARGET__SHAPE);
		createEAttribute(targetEClass, TARGET__SIDE);
		createEAttribute(targetEClass, TARGET__SKIP_NEXT_TARGET_VALIDATION);
		createEAttribute(targetEClass, TARGET__SKIP_SUB_TARGET_VALIDATION);
		createEAttribute(targetEClass, TARGET__ZONE);

		templateEffectEClass = createEClass(TEMPLATE_EFFECT);
		createEReference(templateEffectEClass, TEMPLATE_EFFECT__TARGET);
		createEReference(templateEffectEClass, TEMPLATE_EFFECT__TRIGGER);
		createEAttribute(templateEffectEClass, TEMPLATE_EFFECT__NAME);

		triggerEClass = createEClass(TRIGGER);
		createEAttribute(triggerEClass, TRIGGER__GROUP);
		createEReference(triggerEClass, TRIGGER__CARD_FILTER);
		createEReference(triggerEClass, TRIGGER__TARGET);
		createEReference(triggerEClass, TRIGGER__CONDITION);
		createEAttribute(triggerEClass, TRIGGER__DAMAGE_INCLUDE_FLAGS);
		createEAttribute(triggerEClass, TRIGGER__DURATION);
		createEAttribute(triggerEClass, TRIGGER__EXECUTE_ONCE_PER_TRANSACTION);
		createEAttribute(triggerEClass, TRIGGER__EXECUTE_ONCE_PER_TURN);
		createEAttribute(triggerEClass, TRIGGER__LOCATION);
		createEAttribute(triggerEClass, TRIGGER__SIDE);
		createEAttribute(triggerEClass, TRIGGER__TYPE);
		createEAttribute(triggerEClass, TRIGGER__USE_TRIGGERER_AS_INITIATOR);

		variableEClass = createEClass(VARIABLE);
		createEReference(variableEClass, VARIABLE__TARGET);
		createEReference(variableEClass, VARIABLE__CARD_FILTER);
		createEAttribute(variableEClass, VARIABLE__ABILITY);
		createEAttribute(variableEClass, VARIABLE__COUNTER_TYPE);
		createEAttribute(variableEClass, VARIABLE__FROM_TRIGGER);
		createEAttribute(variableEClass, VARIABLE__INCLUDE_SCHOOL);
		createEAttribute(variableEClass, VARIABLE__LEVEL_TYPE);
		createEAttribute(variableEClass, VARIABLE__MUST_BE_TARGETABLE);
		createEAttribute(variableEClass, VARIABLE__SIDE);
		createEAttribute(variableEClass, VARIABLE__TYPE);
		createEAttribute(variableEClass, VARIABLE__UNIT_TYPE);
		createEAttribute(variableEClass, VARIABLE__USE_CURRENT_TARGET);
		createEAttribute(variableEClass, VARIABLE__USE_LAST_TARGET);
		createEAttribute(variableEClass, VARIABLE__USE_PARENT);
		createEAttribute(variableEClass, VARIABLE__VALUE_MODIFIER);
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
		initEClass(abilityEClass, Ability.class, "Ability", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbility_Type(), theXMLTypePackage.getString(), "type", null, 0, 1, Ability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbility_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, Ability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(additionalCostEClass, AdditionalCost.class, "AdditionalCost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdditionalCost_Target(), this.getTarget(), null, "target", null, 1, 1, AdditionalCost.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(battlegroundFilterEClass, BattlegroundFilter.class, "BattlegroundFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBattlegroundFilter_Line(), theXMLTypePackage.getString(), "line", null, 0, 1, BattlegroundFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cardEClass, Card.class, "Card", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCard_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, Card.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCard_Ability(), this.getAbility(), null, "ability", null, 0, -1, Card.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCard_School(), this.getSchool(), null, "school", null, 0, -1, Card.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCard_Ongoing(), this.getOnGoing(), null, "ongoing", null, 0, -1, Card.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCard_Target(), this.getTarget(), null, "target", null, 0, -1, Card.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_Description(), theXMLTypePackage.getString(), "description", null, 0, -1, Card.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_ExtraDescription(), theXMLTypePackage.getString(), "extraDescription", null, 0, -1, Card.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCard_Variable(), this.getVariable(), null, "variable", null, 0, -1, Card.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCard_Variable2(), this.getVariable(), null, "variable2", null, 0, -1, Card.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCard_Variable3(), this.getVariable(), null, "variable3", null, 0, -1, Card.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCard_Variable4(), this.getVariable(), null, "variable4", null, 0, -1, Card.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCard_Variable5(), this.getVariable(), null, "variable5", null, 0, -1, Card.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCard_Variable6(), this.getVariable(), null, "variable6", null, 0, -1, Card.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCard_Variable7(), this.getVariable(), null, "variable7", null, 0, -1, Card.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCard_PlayabilityCondition(), this.getCondition(), null, "playabilityCondition", null, 0, -1, Card.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCard_AttackCondition(), this.getCondition(), null, "attackCondition", null, 0, -1, Card.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCard_Trigger(), this.getTrigger(), null, "trigger", null, 0, -1, Card.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCard_AdditionalCost(), this.getAdditionalCost(), null, "additionalCost", null, 0, -1, Card.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_Attack(), theXMLTypePackage.getInt(), "attack", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_Cost(), theXMLTypePackage.getInt(), "cost", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_DestinyLevel(), theXMLTypePackage.getInt(), "destinyLevel", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_DisplayName(), theXMLTypePackage.getString(), "displayName", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_Faction(), theXMLTypePackage.getString(), "faction", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_HP(), theXMLTypePackage.getInt(), "hP", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_ID(), theXMLTypePackage.getInt(), "iD", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_MagicLevel(), theXMLTypePackage.getInt(), "magicLevel", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_MightLevel(), theXMLTypePackage.getInt(), "mightLevel", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_NotLocalized(), theXMLTypePackage.getString(), "notLocalized", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_Race(), theXMLTypePackage.getString(), "race", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_Rarity(), theXMLTypePackage.getString(), "rarity", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_ResourceName(), theXMLTypePackage.getString(), "resourceName", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_Retaliate(), theXMLTypePackage.getInt(), "retaliate", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_School1(), theXMLTypePackage.getString(), "school1", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_SchoolsAligned(), theXMLTypePackage.getString(), "schoolsAligned", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_SubType(), theXMLTypePackage.getString(), "subType", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_Token(), theXMLTypePackage.getString(), "token", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_Type(), theXMLTypePackage.getString(), "type", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_Unique(), theXMLTypePackage.getString(), "unique", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCard_Zone(), theXMLTypePackage.getString(), "zone", null, 0, 1, Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cardFilterEClass, CardFilter.class, "CardFilter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCardFilter_Variable(), this.getVariable(), null, "variable", null, 0, 1, CardFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardFilter_AttackHeroLastTurn(), theXMLTypePackage.getString(), "attackHeroLastTurn", null, 0, 1, CardFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardFilter_BaseMaxCost(), theXMLTypePackage.getString(), "baseMaxCost", null, 0, 1, CardFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardFilter_DealDamageToHeroLastTurn(), theXMLTypePackage.getString(), "dealDamageToHeroLastTurn", null, 0, 1, CardFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardFilter_ExcludeFaction(), theXMLTypePackage.getString(), "excludeFaction", null, 0, 1, CardFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardFilter_ExcludeRaces(), theXMLTypePackage.getString(), "excludeRaces", null, 0, 1, CardFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardFilter_ExcludeSchool(), theXMLTypePackage.getString(), "excludeSchool", null, 0, 1, CardFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardFilter_ExcludeToken(), theXMLTypePackage.getString(), "excludeToken", null, 0, 1, CardFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardFilter_ExcludeUnique(), theXMLTypePackage.getString(), "excludeUnique", null, 0, 1, CardFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardFilter_ExcludeUnitType(), theXMLTypePackage.getString(), "excludeUnitType", null, 0, 1, CardFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardFilter_IncludeAbility(), theXMLTypePackage.getString(), "includeAbility", null, 0, 1, CardFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardFilter_IncludeCardID(), theXMLTypePackage.getString(), "includeCardID", null, 0, 1, CardFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardFilter_IncludeCardType(), theXMLTypePackage.getString(), "includeCardType", null, 0, 1, CardFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardFilter_IncludeColumn(), theXMLTypePackage.getString(), "includeColumn", null, 0, 1, CardFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardFilter_IncludeCounter(), theXMLTypePackage.getString(), "includeCounter", null, 0, 1, CardFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardFilter_IncludeEnchantUnit(), theXMLTypePackage.getString(), "includeEnchantUnit", null, 0, 1, CardFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardFilter_IncludeFaction(), theXMLTypePackage.getString(), "includeFaction", null, 0, 1, CardFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardFilter_IncludeFrontLine(), theXMLTypePackage.getString(), "includeFrontLine", null, 0, 1, CardFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardFilter_IncludeOccupant(), theXMLTypePackage.getString(), "includeOccupant", null, 0, 1, CardFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardFilter_IncludeOngoingType(), theXMLTypePackage.getString(), "includeOngoingType", null, 0, 1, CardFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardFilter_IncludeRaces(), theXMLTypePackage.getString(), "includeRaces", null, 0, 1, CardFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardFilter_IncludeSchool(), theXMLTypePackage.getString(), "includeSchool", null, 0, 1, CardFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardFilter_IncludeStatus(), theXMLTypePackage.getString(), "includeStatus", null, 0, 1, CardFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardFilter_IncludeUnique(), theXMLTypePackage.getString(), "includeUnique", null, 0, 1, CardFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardFilter_IncludeUnitType(), theXMLTypePackage.getString(), "includeUnitType", null, 0, 1, CardFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardFilter_LevelType(), theXMLTypePackage.getString(), "levelType", null, 0, 1, CardFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardFilter_MaxAttack(), theXMLTypePackage.getString(), "maxAttack", null, 0, 1, CardFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardFilter_MaxCost(), theXMLTypePackage.getString(), "maxCost", null, 0, 1, CardFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardFilter_MaxLevel(), theXMLTypePackage.getString(), "maxLevel", null, 0, 1, CardFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardFilter_SameCardType(), theXMLTypePackage.getString(), "sameCardType", null, 0, 1, CardFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardFilter_SameGPID(), theXMLTypePackage.getString(), "sameGPID", null, 0, 1, CardFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardFilter_ShareRaces(), theXMLTypePackage.getString(), "shareRaces", null, 0, 1, CardFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardFilter_ShareRacesWithOccupant(), theXMLTypePackage.getString(), "shareRacesWithOccupant", null, 0, 1, CardFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardFilter_Side(), theXMLTypePackage.getString(), "side", null, 0, 1, CardFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardFilter_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, CardFilter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cardsEClass, Cards.class, "Cards", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCards_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, Cards.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCards_Card(), this.getCard(), null, "card", null, 0, -1, Cards.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCards_ExistingCard(), this.getExistingCard(), null, "existingCard", null, 0, -1, Cards.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getCards_TemplateEffect(), this.getTemplateEffect(), null, "templateEffect", null, 0, -1, Cards.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(cardTypeEClass, CardType.class, "CardType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCardType_Exclude(), theXMLTypePackage.getString(), "exclude", null, 0, 1, CardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCardType_Include(), theXMLTypePackage.getString(), "include", null, 0, 1, CardType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(conditionEClass, Condition.class, "Condition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCondition_Condition(), this.getCondition(), null, "condition", null, 0, -1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCondition_Operator(), theXMLTypePackage.getString(), "operator", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCondition_ValueA(), theXMLTypePackage.getString(), "valueA", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCondition_ValueB(), theXMLTypePackage.getString(), "valueB", null, 0, 1, Condition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Cards(), this.getCards(), null, "cards", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(effectEClass, Effect.class, "Effect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEffect_CardFilter(), this.getCardFilter(), null, "cardFilter", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEffect_Condition(), this.getCondition(), null, "condition", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEffect_Ability(), theXMLTypePackage.getString(), "ability", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEffect_Bottom(), theXMLTypePackage.getString(), "bottom", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEffect_CancelDestination(), theXMLTypePackage.getString(), "cancelDestination", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEffect_CantTargetParent(), theXMLTypePackage.getString(), "cantTargetParent", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEffect_CardHolder(), theXMLTypePackage.getString(), "cardHolder", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEffect_CounterType(), theXMLTypePackage.getString(), "counterType", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEffect_DamageExcludeFlags(), theXMLTypePackage.getString(), "damageExcludeFlags", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEffect_DamageFlags(), theXMLTypePackage.getString(), "damageFlags", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEffect_DamageIncludeFlags(), theXMLTypePackage.getString(), "damageIncludeFlags", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEffect_DamageLethalSchools(), theXMLTypePackage.getString(), "damageLethalSchools", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEffect_Destination(), theXMLTypePackage.getString(), "destination", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEffect_DontGenerateTargetPosition(), theXMLTypePackage.getString(), "dontGenerateTargetPosition", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEffect_Duration(), theXMLTypePackage.getString(), "duration", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEffect_EpicEnrage(), theXMLTypePackage.getString(), "epicEnrage", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEffect_EvaluationOrder(), theXMLTypePackage.getString(), "evaluationOrder", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEffect_FakeAdditionalCost(), theXMLTypePackage.getString(), "fakeAdditionalCost", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEffect_Force(), theXMLTypePackage.getString(), "force", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEffect_Free(), theXMLTypePackage.getString(), "free", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEffect_GlobalEffectType(), theXMLTypePackage.getString(), "globalEffectType", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEffect_LevelType(), theXMLTypePackage.getString(), "levelType", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEffect_MoveFromLastKnownParent(), theXMLTypePackage.getString(), "moveFromLastKnownParent", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEffect_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEffect_NewDuration(), theXMLTypePackage.getString(), "newDuration", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEffect_OwnerAbility(), theXMLTypePackage.getString(), "ownerAbility", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEffect_Persistent(), theXMLTypePackage.getString(), "persistent", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEffect_PlayEffectType(), theXMLTypePackage.getString(), "playEffectType", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEffect_Remove(), theXMLTypePackage.getString(), "remove", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEffect_RequireLevel(), theXMLTypePackage.getString(), "requireLevel", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEffect_RevealToOther(), theXMLTypePackage.getString(), "revealToOther", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEffect_Reverse(), theXMLTypePackage.getString(), "reverse", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEffect_Shuffle(), theXMLTypePackage.getString(), "shuffle", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEffect_Side(), theXMLTypePackage.getString(), "side", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEffect_SubType(), theXMLTypePackage.getString(), "subType", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEffect_Type(), theXMLTypePackage.getString(), "type", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEffect_Unfreeze(), theXMLTypePackage.getString(), "unfreeze", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEffect_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, Effect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(existingCardEClass, ExistingCard.class, "ExistingCard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExistingCard_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, ExistingCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExistingCard_Rarity(), theXMLTypePackage.getString(), "rarity", null, 0, 1, ExistingCard.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(onGoingEClass, OnGoing.class, "OnGoing", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOnGoing_Condition(), this.getCondition(), null, "condition", null, 0, 1, OnGoing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOnGoing_Duration(), theXMLTypePackage.getString(), "duration", null, 0, 1, OnGoing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOnGoing_SuicideParent(), theXMLTypePackage.getString(), "suicideParent", null, 0, 1, OnGoing.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionEClass, Option.class, "Option", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOption_DisplayText(), theXMLTypePackage.getString(), "displayText", null, 0, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOption_Value(), theXMLTypePackage.getInt(), "value", null, 0, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(schoolEClass, School.class, "School", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSchool_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, School.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(subgroupEClass, Subgroup.class, "Subgroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubgroup_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, Subgroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSubgroup_TemplateEffect(), this.getTemplateEffect(), null, "templateEffect", null, 0, -1, Subgroup.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSubgroup_Target(), this.getTarget(), null, "target", null, 0, -1, Subgroup.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(targetEClass, Target.class, "Target", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTarget_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTarget_Variable(), this.getVariable(), null, "variable", null, 0, -1, Target.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTarget_Variable2(), this.getVariable(), null, "variable2", null, 0, -1, Target.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTarget_Condition(), this.getCondition(), null, "condition", null, 0, -1, Target.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTarget_Option(), this.getOption(), null, "option", null, 0, -1, Target.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTarget_CardType(), this.getCardType(), null, "cardType", null, 0, -1, Target.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTarget_CardFilter(), this.getCardFilter(), null, "cardFilter", null, 0, -1, Target.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTarget_Trigger(), this.getTrigger(), null, "trigger", null, 0, -1, Target.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTarget_Effect(), this.getEffect(), null, "effect", null, 0, -1, Target.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTarget_Subgroup(), this.getSubgroup(), null, "subgroup", null, 0, -1, Target.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTarget_BattlegroundFilter(), this.getBattlegroundFilter(), null, "battlegroundFilter", null, 0, -1, Target.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTarget_AllowDuplicate(), theXMLTypePackage.getString(), "allowDuplicate", null, 0, 1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTarget_Amount(), theXMLTypePackage.getString(), "amount", null, 0, 1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTarget_AmountVisible(), theXMLTypePackage.getString(), "amountVisible", null, 0, 1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTarget_AutoTakeFirstInputs(), theXMLTypePackage.getString(), "autoTakeFirstInputs", null, 0, 1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTarget_BattlegroundPositionState(), theXMLTypePackage.getString(), "battlegroundPositionState", null, 0, 1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTarget_Cancelable(), theXMLTypePackage.getString(), "cancelable", null, 0, 1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTarget_CantTargetOccupant(), theXMLTypePackage.getString(), "cantTargetOccupant", null, 0, 1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTarget_CantTargetParent(), theXMLTypePackage.getString(), "cantTargetParent", null, 0, 1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTarget_CantTargetPrevious(), theXMLTypePackage.getString(), "cantTargetPrevious", null, 0, 1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTarget_CantTargetSelf(), theXMLTypePackage.getString(), "cantTargetSelf", null, 0, 1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTarget_CardType1(), theXMLTypePackage.getString(), "cardType1", null, 0, 1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTarget_DontUpdateAfterExecution(), theXMLTypePackage.getString(), "dontUpdateAfterExecution", null, 0, 1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTarget_ExceptFromTrigger(), theXMLTypePackage.getString(), "exceptFromTrigger", null, 0, 1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTarget_ExcludeUnique(), theXMLTypePackage.getString(), "excludeUnique", null, 0, 1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTarget_ForceExecute(), theXMLTypePackage.getString(), "forceExecute", null, 0, 1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTarget_IgnoreWard(), theXMLTypePackage.getString(), "ignoreWard", null, 0, 1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTarget_InputOnExec(), theXMLTypePackage.getString(), "inputOnExec", null, 0, 1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTarget_MinAmount(), theXMLTypePackage.getString(), "minAmount", null, 0, 1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTarget_NeedActivation(), theXMLTypePackage.getString(), "needActivation", null, 0, 1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTarget_Option1(), theXMLTypePackage.getString(), "option1", null, 0, 1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTarget_Persistent(), theXMLTypePackage.getString(), "persistent", null, 0, 1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTarget_Random(), theXMLTypePackage.getString(), "random", null, 0, 1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTarget_RevealToOther(), theXMLTypePackage.getString(), "revealToOther", null, 0, 1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTarget_Shape(), theXMLTypePackage.getString(), "shape", null, 0, 1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTarget_Side(), theXMLTypePackage.getString(), "side", null, 0, 1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTarget_SkipNextTargetValidation(), theXMLTypePackage.getString(), "skipNextTargetValidation", null, 0, 1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTarget_SkipSubTargetValidation(), theXMLTypePackage.getString(), "skipSubTargetValidation", null, 0, 1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTarget_Zone(), theXMLTypePackage.getString(), "zone", null, 0, 1, Target.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(templateEffectEClass, TemplateEffect.class, "TemplateEffect", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTemplateEffect_Target(), this.getTarget(), null, "target", null, 0, -1, TemplateEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTemplateEffect_Trigger(), this.getTrigger(), null, "trigger", null, 0, -1, TemplateEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemplateEffect_Name(), theXMLTypePackage.getString(), "name", null, 0, 1, TemplateEffect.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triggerEClass, Trigger.class, "Trigger", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrigger_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTrigger_CardFilter(), this.getCardFilter(), null, "cardFilter", null, 0, -1, Trigger.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTrigger_Target(), this.getTarget(), null, "target", null, 0, -1, Trigger.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTrigger_Condition(), this.getCondition(), null, "condition", null, 0, -1, Trigger.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrigger_DamageIncludeFlags(), theXMLTypePackage.getString(), "damageIncludeFlags", null, 0, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrigger_Duration(), theXMLTypePackage.getString(), "duration", null, 0, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrigger_ExecuteOncePerTransaction(), theXMLTypePackage.getString(), "executeOncePerTransaction", null, 0, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrigger_ExecuteOncePerTurn(), theXMLTypePackage.getString(), "executeOncePerTurn", null, 0, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrigger_Location(), theXMLTypePackage.getString(), "location", null, 0, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrigger_Side(), theXMLTypePackage.getString(), "side", null, 0, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrigger_Type(), theXMLTypePackage.getString(), "type", null, 0, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTrigger_UseTriggererAsInitiator(), theXMLTypePackage.getString(), "useTriggererAsInitiator", null, 0, 1, Trigger.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariable_Target(), this.getTarget(), null, "target", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariable_CardFilter(), this.getCardFilter(), null, "cardFilter", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Ability(), theXMLTypePackage.getString(), "ability", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_CounterType(), theXMLTypePackage.getString(), "counterType", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_FromTrigger(), theXMLTypePackage.getString(), "fromTrigger", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_IncludeSchool(), theXMLTypePackage.getString(), "includeSchool", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_LevelType(), theXMLTypePackage.getString(), "levelType", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_MustBeTargetable(), theXMLTypePackage.getString(), "mustBeTargetable", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Side(), theXMLTypePackage.getString(), "side", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Type(), theXMLTypePackage.getString(), "type", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_UnitType(), theXMLTypePackage.getString(), "unitType", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_UseCurrentTarget(), theXMLTypePackage.getString(), "useCurrentTarget", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_UseLastTarget(), theXMLTypePackage.getString(), "useLastTarget", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_UseParent(), theXMLTypePackage.getString(), "useParent", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_ValueModifier(), theXMLTypePackage.getString(), "valueModifier", null, 0, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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
		  (abilityEClass, 
		   source, 
		   new String[] {
			 "name", "Ability",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getAbility_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Type",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAbility_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Value",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (additionalCostEClass, 
		   source, 
		   new String[] {
			 "name", "AdditionalCost",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getAdditionalCost_Target(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Target",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (battlegroundFilterEClass, 
		   source, 
		   new String[] {
			 "name", "BattlegroundFilter",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getBattlegroundFilter_Line(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Line",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (cardEClass, 
		   source, 
		   new String[] {
			 "name", "Card",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getCard_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getCard_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });	
		addAnnotation
		  (getCard_Ability(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Ability",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });	
		addAnnotation
		  (getCard_School(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "School",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });	
		addAnnotation
		  (getCard_Ongoing(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Ongoing",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });	
		addAnnotation
		  (getCard_Target(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Target",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });	
		addAnnotation
		  (getCard_Description(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Description",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });	
		addAnnotation
		  (getCard_ExtraDescription(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ExtraDescription",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });	
		addAnnotation
		  (getCard_Variable(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Variable",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });	
		addAnnotation
		  (getCard_Variable2(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Variable2",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });	
		addAnnotation
		  (getCard_Variable3(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Variable3",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });	
		addAnnotation
		  (getCard_Variable4(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Variable4",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });	
		addAnnotation
		  (getCard_Variable5(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Variable5",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });	
		addAnnotation
		  (getCard_Variable6(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Variable6",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });	
		addAnnotation
		  (getCard_Variable7(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Variable7",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });	
		addAnnotation
		  (getCard_PlayabilityCondition(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "PlayabilityCondition",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });	
		addAnnotation
		  (getCard_AttackCondition(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AttackCondition",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });	
		addAnnotation
		  (getCard_Trigger(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Trigger",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });	
		addAnnotation
		  (getCard_AdditionalCost(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "AdditionalCost",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });	
		addAnnotation
		  (getCard_Attack(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Attack",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCard_Cost(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Cost",
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
		  (getCard_NotLocalized(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "NotLocalized",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCard_Race(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Race",
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
		  (getCard_ResourceName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ResourceName",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCard_Retaliate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Retaliate",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCard_School1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "School",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCard_SchoolsAligned(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "SchoolsAligned",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCard_SubType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "SubType",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCard_Token(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Token",
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
		  (getCard_Unique(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Unique",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCard_Zone(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Zone",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (cardFilterEClass, 
		   source, 
		   new String[] {
			 "name", "CardFilter",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getCardFilter_Variable(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Variable",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCardFilter_AttackHeroLastTurn(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "AttackHeroLastTurn",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCardFilter_BaseMaxCost(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "BaseMaxCost",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCardFilter_DealDamageToHeroLastTurn(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "DealDamageToHeroLastTurn",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCardFilter_ExcludeFaction(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ExcludeFaction",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCardFilter_ExcludeRaces(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ExcludeRaces",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCardFilter_ExcludeSchool(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ExcludeSchool",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCardFilter_ExcludeToken(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ExcludeToken",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCardFilter_ExcludeUnique(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ExcludeUnique",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCardFilter_ExcludeUnitType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ExcludeUnitType",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCardFilter_IncludeAbility(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IncludeAbility",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCardFilter_IncludeCardID(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IncludeCardID",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCardFilter_IncludeCardType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IncludeCardType",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCardFilter_IncludeColumn(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IncludeColumn",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCardFilter_IncludeCounter(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IncludeCounter",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCardFilter_IncludeEnchantUnit(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IncludeEnchantUnit",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCardFilter_IncludeFaction(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IncludeFaction",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCardFilter_IncludeFrontLine(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IncludeFrontLine",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCardFilter_IncludeOccupant(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IncludeOccupant",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCardFilter_IncludeOngoingType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IncludeOngoingType",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCardFilter_IncludeRaces(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IncludeRaces",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCardFilter_IncludeSchool(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IncludeSchool",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCardFilter_IncludeStatus(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IncludeStatus",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCardFilter_IncludeUnique(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IncludeUnique",
			 "namespace", "##targetNamespace"
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
		  (getCardFilter_LevelType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "LevelType",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCardFilter_MaxAttack(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "MaxAttack",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCardFilter_MaxCost(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "MaxCost",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCardFilter_MaxLevel(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "MaxLevel",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCardFilter_SameCardType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "SameCardType",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCardFilter_SameGPID(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "SameGPID",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCardFilter_ShareRaces(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ShareRaces",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCardFilter_ShareRacesWithOccupant(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ShareRacesWithOccupant",
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
		  (getCardFilter_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Value",
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
		  (getCards_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (getCards_Card(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Card",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });	
		addAnnotation
		  (getCards_ExistingCard(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ExistingCard",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });	
		addAnnotation
		  (getCards_TemplateEffect(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TemplateEffect",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });	
		addAnnotation
		  (cardTypeEClass, 
		   source, 
		   new String[] {
			 "name", "CardType",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getCardType_Exclude(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Exclude",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCardType_Include(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Include",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (conditionEClass, 
		   source, 
		   new String[] {
			 "name", "Condition",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getCondition_Condition(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Condition",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCondition_Operator(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Operator",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCondition_ValueA(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ValueA",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCondition_ValueB(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ValueB",
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
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getEffect_CardFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CardFilter",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEffect_Condition(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Condition",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEffect_Ability(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Ability",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEffect_Bottom(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Bottom",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEffect_CancelDestination(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "CancelDestination",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEffect_CantTargetParent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "CantTargetParent",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEffect_CardHolder(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "CardHolder",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEffect_CounterType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "CounterType",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEffect_DamageExcludeFlags(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "DamageExcludeFlags",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEffect_DamageFlags(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "DamageFlags",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEffect_DamageIncludeFlags(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "DamageIncludeFlags",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEffect_DamageLethalSchools(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "DamageLethalSchools",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEffect_Destination(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Destination",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEffect_DontGenerateTargetPosition(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "DontGenerateTargetPosition",
			 "namespace", "##targetNamespace"
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
		  (getEffect_EpicEnrage(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "EpicEnrage",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEffect_EvaluationOrder(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "EvaluationOrder",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEffect_FakeAdditionalCost(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "FakeAdditionalCost",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEffect_Force(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Force",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEffect_Free(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Free",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEffect_GlobalEffectType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "GlobalEffectType",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEffect_LevelType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "LevelType",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEffect_MoveFromLastKnownParent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "MoveFromLastKnownParent",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEffect_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEffect_NewDuration(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "NewDuration",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEffect_OwnerAbility(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "OwnerAbility",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEffect_Persistent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Persistent",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEffect_PlayEffectType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "PlayEffectType",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEffect_Remove(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Remove",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEffect_RequireLevel(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "RequireLevel",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEffect_RevealToOther(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "RevealToOther",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEffect_Reverse(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Reverse",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEffect_Shuffle(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Shuffle",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEffect_Side(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Side",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getEffect_SubType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "SubType",
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
		  (getEffect_Unfreeze(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Unfreeze",
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
		  (existingCardEClass, 
		   source, 
		   new String[] {
			 "name", "ExistingCard",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getExistingCard_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Name",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getExistingCard_Rarity(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Rarity",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (onGoingEClass, 
		   source, 
		   new String[] {
			 "name", "OnGoing",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getOnGoing_Condition(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Condition",
			 "namespace", "##targetNamespace"
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
		  (getOnGoing_SuicideParent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "SuicideParent",
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
		  (getSubgroup_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (getSubgroup_TemplateEffect(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "TemplateEffect",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });	
		addAnnotation
		  (getSubgroup_Target(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Target",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });	
		addAnnotation
		  (targetEClass, 
		   source, 
		   new String[] {
			 "name", "Target",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getTarget_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (getTarget_Variable(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Variable",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });	
		addAnnotation
		  (getTarget_Variable2(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Variable2",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });	
		addAnnotation
		  (getTarget_Condition(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Condition",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });	
		addAnnotation
		  (getTarget_Option(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Option",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });	
		addAnnotation
		  (getTarget_CardType(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CardType",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });	
		addAnnotation
		  (getTarget_CardFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CardFilter",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });	
		addAnnotation
		  (getTarget_Trigger(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Trigger",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });	
		addAnnotation
		  (getTarget_Effect(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Effect",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });	
		addAnnotation
		  (getTarget_Subgroup(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Subgroup",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });	
		addAnnotation
		  (getTarget_BattlegroundFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "BattlegroundFilter",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });	
		addAnnotation
		  (getTarget_AllowDuplicate(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "AllowDuplicate",
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
		  (getTarget_AmountVisible(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "AmountVisible",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTarget_AutoTakeFirstInputs(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "AutoTakeFirstInputs",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTarget_BattlegroundPositionState(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "BattlegroundPositionState",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTarget_Cancelable(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Cancelable",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTarget_CantTargetOccupant(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "CantTargetOccupant",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTarget_CantTargetParent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "CantTargetParent",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTarget_CantTargetPrevious(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "CantTargetPrevious",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTarget_CantTargetSelf(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "CantTargetSelf",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTarget_CardType1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "CardType",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTarget_DontUpdateAfterExecution(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "DontUpdateAfterExecution",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTarget_ExceptFromTrigger(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ExceptFromTrigger",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTarget_ExcludeUnique(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ExcludeUnique",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTarget_ForceExecute(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ForceExecute",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTarget_IgnoreWard(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IgnoreWard",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTarget_InputOnExec(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "InputOnExec",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTarget_MinAmount(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "MinAmount",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTarget_NeedActivation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "NeedActivation",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTarget_Option1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Option",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTarget_Persistent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Persistent",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTarget_Random(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Random",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTarget_RevealToOther(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "RevealToOther",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTarget_Shape(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Shape",
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
		  (getTarget_SkipNextTargetValidation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "SkipNextTargetValidation",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTarget_SkipSubTargetValidation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "SkipSubTargetValidation",
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
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getTemplateEffect_Target(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Target",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTemplateEffect_Trigger(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Trigger",
			 "namespace", "##targetNamespace"
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
		  (getTrigger_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (getTrigger_CardFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CardFilter",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });	
		addAnnotation
		  (getTrigger_Target(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Target",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });	
		addAnnotation
		  (getTrigger_Condition(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Condition",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });	
		addAnnotation
		  (getTrigger_DamageIncludeFlags(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "DamageIncludeFlags",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTrigger_Duration(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Duration",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTrigger_ExecuteOncePerTransaction(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ExecuteOncePerTransaction",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTrigger_ExecuteOncePerTurn(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ExecuteOncePerTurn",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTrigger_Location(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Location",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getTrigger_Side(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Side",
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
		addAnnotation
		  (getTrigger_UseTriggererAsInitiator(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "UseTriggererAsInitiator",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (variableEClass, 
		   source, 
		   new String[] {
			 "name", "Variable",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getVariable_Target(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "Target",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getVariable_CardFilter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "CardFilter",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getVariable_Ability(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Ability",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getVariable_CounterType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "CounterType",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getVariable_FromTrigger(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "FromTrigger",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getVariable_IncludeSchool(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "IncludeSchool",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getVariable_LevelType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "LevelType",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getVariable_MustBeTargetable(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "MustBeTargetable",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getVariable_Side(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Side",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getVariable_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "Type",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getVariable_UnitType(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "UnitType",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getVariable_UseCurrentTarget(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "UseCurrentTarget",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getVariable_UseLastTarget(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "UseLastTarget",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getVariable_UseParent(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "UseParent",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getVariable_ValueModifier(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "ValueModifier",
			 "namespace", "##targetNamespace"
		   });
	}

} //CardsPackageImpl
