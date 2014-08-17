/**
 */
package net.mmyumu.docdoc.model.Cards.util;

import net.mmyumu.docdoc.model.Cards.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see net.mmyumu.docdoc.model.Cards.CardsPackage
 * @generated
 */
public class CardsAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CardsPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardsAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = CardsPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CardsSwitch<Adapter> modelSwitch =
		new CardsSwitch<Adapter>() {
			@Override
			public Adapter caseAbility(Ability object) {
				return createAbilityAdapter();
			}
			@Override
			public Adapter caseAdditionalCost(AdditionalCost object) {
				return createAdditionalCostAdapter();
			}
			@Override
			public Adapter caseBattlegroundFilter(BattlegroundFilter object) {
				return createBattlegroundFilterAdapter();
			}
			@Override
			public Adapter caseCard(Card object) {
				return createCardAdapter();
			}
			@Override
			public Adapter caseCardFilter(CardFilter object) {
				return createCardFilterAdapter();
			}
			@Override
			public Adapter caseCards(Cards object) {
				return createCardsAdapter();
			}
			@Override
			public Adapter caseCardType(CardType object) {
				return createCardTypeAdapter();
			}
			@Override
			public Adapter caseCondition(Condition object) {
				return createConditionAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseEffect(Effect object) {
				return createEffectAdapter();
			}
			@Override
			public Adapter caseExistingCard(ExistingCard object) {
				return createExistingCardAdapter();
			}
			@Override
			public Adapter caseOnGoing(OnGoing object) {
				return createOnGoingAdapter();
			}
			@Override
			public Adapter caseOption(Option object) {
				return createOptionAdapter();
			}
			@Override
			public Adapter caseSchool(School object) {
				return createSchoolAdapter();
			}
			@Override
			public Adapter caseSubgroup(Subgroup object) {
				return createSubgroupAdapter();
			}
			@Override
			public Adapter caseTarget(Target object) {
				return createTargetAdapter();
			}
			@Override
			public Adapter caseTemplateEffect(TemplateEffect object) {
				return createTemplateEffectAdapter();
			}
			@Override
			public Adapter caseTrigger(Trigger object) {
				return createTriggerAdapter();
			}
			@Override
			public Adapter caseVariable(Variable object) {
				return createVariableAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link net.mmyumu.docdoc.model.Cards.Ability <em>Ability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mmyumu.docdoc.model.Cards.Ability
	 * @generated
	 */
	public Adapter createAbilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mmyumu.docdoc.model.Cards.AdditionalCost <em>Additional Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mmyumu.docdoc.model.Cards.AdditionalCost
	 * @generated
	 */
	public Adapter createAdditionalCostAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mmyumu.docdoc.model.Cards.BattlegroundFilter <em>Battleground Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mmyumu.docdoc.model.Cards.BattlegroundFilter
	 * @generated
	 */
	public Adapter createBattlegroundFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mmyumu.docdoc.model.Cards.Card <em>Card</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mmyumu.docdoc.model.Cards.Card
	 * @generated
	 */
	public Adapter createCardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mmyumu.docdoc.model.Cards.CardFilter <em>Card Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mmyumu.docdoc.model.Cards.CardFilter
	 * @generated
	 */
	public Adapter createCardFilterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mmyumu.docdoc.model.Cards.Cards <em>Cards</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mmyumu.docdoc.model.Cards.Cards
	 * @generated
	 */
	public Adapter createCardsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mmyumu.docdoc.model.Cards.CardType <em>Card Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mmyumu.docdoc.model.Cards.CardType
	 * @generated
	 */
	public Adapter createCardTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mmyumu.docdoc.model.Cards.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mmyumu.docdoc.model.Cards.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mmyumu.docdoc.model.Cards.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mmyumu.docdoc.model.Cards.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mmyumu.docdoc.model.Cards.Effect <em>Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mmyumu.docdoc.model.Cards.Effect
	 * @generated
	 */
	public Adapter createEffectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mmyumu.docdoc.model.Cards.ExistingCard <em>Existing Card</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mmyumu.docdoc.model.Cards.ExistingCard
	 * @generated
	 */
	public Adapter createExistingCardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mmyumu.docdoc.model.Cards.OnGoing <em>On Going</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mmyumu.docdoc.model.Cards.OnGoing
	 * @generated
	 */
	public Adapter createOnGoingAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mmyumu.docdoc.model.Cards.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mmyumu.docdoc.model.Cards.Option
	 * @generated
	 */
	public Adapter createOptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mmyumu.docdoc.model.Cards.School <em>School</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mmyumu.docdoc.model.Cards.School
	 * @generated
	 */
	public Adapter createSchoolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mmyumu.docdoc.model.Cards.Subgroup <em>Subgroup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mmyumu.docdoc.model.Cards.Subgroup
	 * @generated
	 */
	public Adapter createSubgroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mmyumu.docdoc.model.Cards.Target <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mmyumu.docdoc.model.Cards.Target
	 * @generated
	 */
	public Adapter createTargetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mmyumu.docdoc.model.Cards.TemplateEffect <em>Template Effect</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mmyumu.docdoc.model.Cards.TemplateEffect
	 * @generated
	 */
	public Adapter createTemplateEffectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mmyumu.docdoc.model.Cards.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mmyumu.docdoc.model.Cards.Trigger
	 * @generated
	 */
	public Adapter createTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link net.mmyumu.docdoc.model.Cards.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see net.mmyumu.docdoc.model.Cards.Variable
	 * @generated
	 */
	public Adapter createVariableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //CardsAdapterFactory
