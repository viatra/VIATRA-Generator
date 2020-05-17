/**
 */
package TaxationWithRoot.util;

import TaxationWithRoot.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see TaxationWithRoot.TaxationPackage
 * @generated
 */
public class TaxationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TaxationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaxationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TaxationPackage.eINSTANCE;
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
	protected TaxationSwitch<Adapter> modelSwitch =
		new TaxationSwitch<Adapter>() {
			@Override
			public Adapter caseConstants(Constants object) {
				return createConstantsAdapter();
			}
			@Override
			public Adapter caseIncome_Tax(Income_Tax object) {
				return createIncome_TaxAdapter();
			}
			@Override
			public Adapter caseTax_Payer(Tax_Payer object) {
				return createTax_PayerAdapter();
			}
			@Override
			public Adapter casePhysical_Person(Physical_Person object) {
				return createPhysical_PersonAdapter();
			}
			@Override
			public Adapter caseAddress(Address object) {
				return createAddressAdapter();
			}
			@Override
			public Adapter caseExpense(Expense object) {
				return createExpenseAdapter();
			}
			@Override
			public Adapter caseDependent(Dependent object) {
				return createDependentAdapter();
			}
			@Override
			public Adapter caseExternal_Allowance(External_Allowance object) {
				return createExternal_AllowanceAdapter();
			}
			@Override
			public Adapter caseHousehold(Household object) {
				return createHouseholdAdapter();
			}
			@Override
			public Adapter caseLegal_Union_Record(Legal_Union_Record object) {
				return createLegal_Union_RecordAdapter();
			}
			@Override
			public Adapter caseTax_Property(Tax_Property object) {
				return createTax_PropertyAdapter();
			}
			@Override
			public Adapter caseTax_Case(Tax_Case object) {
				return createTax_CaseAdapter();
			}
			@Override
			public Adapter caseFromAgent(FromAgent object) {
				return createFromAgentAdapter();
			}
			@Override
			public Adapter caseIncome(Income object) {
				return createIncomeAdapter();
			}
			@Override
			public Adapter caseIncome_Type(Income_Type object) {
				return createIncome_TypeAdapter();
			}
			@Override
			public Adapter caseTax_Card(Tax_Card object) {
				return createTax_CardAdapter();
			}
			@Override
			public Adapter caseIncome_Tax_Credit(Income_Tax_Credit object) {
				return createIncome_Tax_CreditAdapter();
			}
			@Override
			public Adapter caseIncome_Detail(Income_Detail object) {
				return createIncome_DetailAdapter();
			}
			@Override
			public Adapter caseFromLaw(FromLaw object) {
				return createFromLawAdapter();
			}
			@Override
			public Adapter caseFiscal_Address(Fiscal_Address object) {
				return createFiscal_AddressAdapter();
			}
			@Override
			public Adapter caseHabitual_Address(Habitual_Address object) {
				return createHabitual_AddressAdapter();
			}
			@Override
			public Adapter caseMarriage_Record(Marriage_Record object) {
				return createMarriage_RecordAdapter();
			}
			@Override
			public Adapter caseNon_Resident_Tax_Payer(Non_Resident_Tax_Payer object) {
				return createNon_Resident_Tax_PayerAdapter();
			}
			@Override
			public Adapter casePartnership_Record(Partnership_Record object) {
				return createPartnership_RecordAdapter();
			}
			@Override
			public Adapter caseResident_Tax_Payer(Resident_Tax_Payer object) {
				return createResident_Tax_PayerAdapter();
			}
			@Override
			public Adapter caseTrade_and_Business_Income(Trade_and_Business_Income object) {
				return createTrade_and_Business_IncomeAdapter();
			}
			@Override
			public Adapter caseAgriculture_and_Forestry_Income(Agriculture_and_Forestry_Income object) {
				return createAgriculture_and_Forestry_IncomeAdapter();
			}
			@Override
			public Adapter casePensions_and_Annuities_Income(Pensions_and_Annuities_Income object) {
				return createPensions_and_Annuities_IncomeAdapter();
			}
			@Override
			public Adapter caseCapital_and_Investments_Income(Capital_and_Investments_Income object) {
				return createCapital_and_Investments_IncomeAdapter();
			}
			@Override
			public Adapter caseEmployment_Income(Employment_Income object) {
				return createEmployment_IncomeAdapter();
			}
			@Override
			public Adapter caseRentals_and_Leases_Income(Rentals_and_Leases_Income object) {
				return createRentals_and_Leases_IncomeAdapter();
			}
			@Override
			public Adapter caseForeign_Income(Foreign_Income object) {
				return createForeign_IncomeAdapter();
			}
			@Override
			public Adapter caseLocal_Income(Local_Income object) {
				return createLocal_IncomeAdapter();
			}
			@Override
			public Adapter caseCIM(CIM object) {
				return createCIMAdapter();
			}
			@Override
			public Adapter caseCIP(CIP object) {
				return createCIPAdapter();
			}
			@Override
			public Adapter caseCIS(CIS object) {
				return createCISAdapter();
			}
			@Override
			public Adapter casePermanent_Expense(Permanent_Expense object) {
				return createPermanent_ExpenseAdapter();
			}
			@Override
			public Adapter caseSpecial_Expense_DS(Special_Expense_DS object) {
				return createSpecial_Expense_DSAdapter();
			}
			@Override
			public Adapter caseInterest_Expense(Interest_Expense object) {
				return createInterest_ExpenseAdapter();
			}
			@Override
			public Adapter casePrivate_Insurance_and_Plan(Private_Insurance_and_Plan object) {
				return createPrivate_Insurance_and_PlanAdapter();
			}
			@Override
			public Adapter caseHealth_and_Pension_Insurance(Health_and_Pension_Insurance object) {
				return createHealth_and_Pension_InsuranceAdapter();
			}
			@Override
			public Adapter caseDonation(Donation object) {
				return createDonationAdapter();
			}
			@Override
			public Adapter caseLoss_Carryforward(Loss_Carryforward object) {
				return createLoss_CarryforwardAdapter();
			}
			@Override
			public Adapter caseSpousal_Expense_AC(Spousal_Expense_AC object) {
				return createSpousal_Expense_ACAdapter();
			}
			@Override
			public Adapter caseExtraordinary_Expense_CE(Extraordinary_Expense_CE object) {
				return createExtraordinary_Expense_CEAdapter();
			}
			@Override
			public Adapter caseTravel_Expense_FD(Travel_Expense_FD object) {
				return createTravel_Expense_FDAdapter();
			}
			@Override
			public Adapter caseProfessional_Expense(Professional_Expense object) {
				return createProfessional_ExpenseAdapter();
			}
			@Override
			public Adapter caseMiscellaneous_Expense_FO(Miscellaneous_Expense_FO object) {
				return createMiscellaneous_Expense_FOAdapter();
			}
			@Override
			public Adapter caseResource(Resource object) {
				return createResourceAdapter();
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
	 * Creates a new adapter for an object of class '{@link TaxationWithRoot.Constants <em>Constants</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TaxationWithRoot.Constants
	 * @generated
	 */
	public Adapter createConstantsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TaxationWithRoot.Income_Tax <em>Income Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TaxationWithRoot.Income_Tax
	 * @generated
	 */
	public Adapter createIncome_TaxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TaxationWithRoot.Tax_Payer <em>Tax Payer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TaxationWithRoot.Tax_Payer
	 * @generated
	 */
	public Adapter createTax_PayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TaxationWithRoot.Physical_Person <em>Physical Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TaxationWithRoot.Physical_Person
	 * @generated
	 */
	public Adapter createPhysical_PersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TaxationWithRoot.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TaxationWithRoot.Address
	 * @generated
	 */
	public Adapter createAddressAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TaxationWithRoot.Expense <em>Expense</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TaxationWithRoot.Expense
	 * @generated
	 */
	public Adapter createExpenseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TaxationWithRoot.Dependent <em>Dependent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TaxationWithRoot.Dependent
	 * @generated
	 */
	public Adapter createDependentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TaxationWithRoot.External_Allowance <em>External Allowance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TaxationWithRoot.External_Allowance
	 * @generated
	 */
	public Adapter createExternal_AllowanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TaxationWithRoot.Household <em>Household</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TaxationWithRoot.Household
	 * @generated
	 */
	public Adapter createHouseholdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TaxationWithRoot.Legal_Union_Record <em>Legal Union Record</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TaxationWithRoot.Legal_Union_Record
	 * @generated
	 */
	public Adapter createLegal_Union_RecordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TaxationWithRoot.Tax_Property <em>Tax Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TaxationWithRoot.Tax_Property
	 * @generated
	 */
	public Adapter createTax_PropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TaxationWithRoot.Tax_Case <em>Tax Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TaxationWithRoot.Tax_Case
	 * @generated
	 */
	public Adapter createTax_CaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TaxationWithRoot.FromAgent <em>From Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TaxationWithRoot.FromAgent
	 * @generated
	 */
	public Adapter createFromAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TaxationWithRoot.Income <em>Income</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TaxationWithRoot.Income
	 * @generated
	 */
	public Adapter createIncomeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TaxationWithRoot.Income_Type <em>Income Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TaxationWithRoot.Income_Type
	 * @generated
	 */
	public Adapter createIncome_TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TaxationWithRoot.Tax_Card <em>Tax Card</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TaxationWithRoot.Tax_Card
	 * @generated
	 */
	public Adapter createTax_CardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TaxationWithRoot.Income_Tax_Credit <em>Income Tax Credit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TaxationWithRoot.Income_Tax_Credit
	 * @generated
	 */
	public Adapter createIncome_Tax_CreditAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TaxationWithRoot.Income_Detail <em>Income Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TaxationWithRoot.Income_Detail
	 * @generated
	 */
	public Adapter createIncome_DetailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TaxationWithRoot.FromLaw <em>From Law</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TaxationWithRoot.FromLaw
	 * @generated
	 */
	public Adapter createFromLawAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TaxationWithRoot.Fiscal_Address <em>Fiscal Address</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TaxationWithRoot.Fiscal_Address
	 * @generated
	 */
	public Adapter createFiscal_AddressAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TaxationWithRoot.Habitual_Address <em>Habitual Address</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TaxationWithRoot.Habitual_Address
	 * @generated
	 */
	public Adapter createHabitual_AddressAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TaxationWithRoot.Marriage_Record <em>Marriage Record</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TaxationWithRoot.Marriage_Record
	 * @generated
	 */
	public Adapter createMarriage_RecordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TaxationWithRoot.Non_Resident_Tax_Payer <em>Non Resident Tax Payer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TaxationWithRoot.Non_Resident_Tax_Payer
	 * @generated
	 */
	public Adapter createNon_Resident_Tax_PayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TaxationWithRoot.Partnership_Record <em>Partnership Record</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TaxationWithRoot.Partnership_Record
	 * @generated
	 */
	public Adapter createPartnership_RecordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TaxationWithRoot.Resident_Tax_Payer <em>Resident Tax Payer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TaxationWithRoot.Resident_Tax_Payer
	 * @generated
	 */
	public Adapter createResident_Tax_PayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TaxationWithRoot.Trade_and_Business_Income <em>Trade and Business Income</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TaxationWithRoot.Trade_and_Business_Income
	 * @generated
	 */
	public Adapter createTrade_and_Business_IncomeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TaxationWithRoot.Agriculture_and_Forestry_Income <em>Agriculture and Forestry Income</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TaxationWithRoot.Agriculture_and_Forestry_Income
	 * @generated
	 */
	public Adapter createAgriculture_and_Forestry_IncomeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TaxationWithRoot.Pensions_and_Annuities_Income <em>Pensions and Annuities Income</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TaxationWithRoot.Pensions_and_Annuities_Income
	 * @generated
	 */
	public Adapter createPensions_and_Annuities_IncomeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TaxationWithRoot.Capital_and_Investments_Income <em>Capital and Investments Income</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TaxationWithRoot.Capital_and_Investments_Income
	 * @generated
	 */
	public Adapter createCapital_and_Investments_IncomeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TaxationWithRoot.Employment_Income <em>Employment Income</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TaxationWithRoot.Employment_Income
	 * @generated
	 */
	public Adapter createEmployment_IncomeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TaxationWithRoot.Rentals_and_Leases_Income <em>Rentals and Leases Income</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TaxationWithRoot.Rentals_and_Leases_Income
	 * @generated
	 */
	public Adapter createRentals_and_Leases_IncomeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TaxationWithRoot.Foreign_Income <em>Foreign Income</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TaxationWithRoot.Foreign_Income
	 * @generated
	 */
	public Adapter createForeign_IncomeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TaxationWithRoot.Local_Income <em>Local Income</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TaxationWithRoot.Local_Income
	 * @generated
	 */
	public Adapter createLocal_IncomeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TaxationWithRoot.CIM <em>CIM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TaxationWithRoot.CIM
	 * @generated
	 */
	public Adapter createCIMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TaxationWithRoot.CIP <em>CIP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TaxationWithRoot.CIP
	 * @generated
	 */
	public Adapter createCIPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TaxationWithRoot.CIS <em>CIS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TaxationWithRoot.CIS
	 * @generated
	 */
	public Adapter createCISAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TaxationWithRoot.Permanent_Expense <em>Permanent Expense</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TaxationWithRoot.Permanent_Expense
	 * @generated
	 */
	public Adapter createPermanent_ExpenseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TaxationWithRoot.Special_Expense_DS <em>Special Expense DS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TaxationWithRoot.Special_Expense_DS
	 * @generated
	 */
	public Adapter createSpecial_Expense_DSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TaxationWithRoot.Interest_Expense <em>Interest Expense</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TaxationWithRoot.Interest_Expense
	 * @generated
	 */
	public Adapter createInterest_ExpenseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TaxationWithRoot.Private_Insurance_and_Plan <em>Private Insurance and Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TaxationWithRoot.Private_Insurance_and_Plan
	 * @generated
	 */
	public Adapter createPrivate_Insurance_and_PlanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TaxationWithRoot.Health_and_Pension_Insurance <em>Health and Pension Insurance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TaxationWithRoot.Health_and_Pension_Insurance
	 * @generated
	 */
	public Adapter createHealth_and_Pension_InsuranceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TaxationWithRoot.Donation <em>Donation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TaxationWithRoot.Donation
	 * @generated
	 */
	public Adapter createDonationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TaxationWithRoot.Loss_Carryforward <em>Loss Carryforward</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TaxationWithRoot.Loss_Carryforward
	 * @generated
	 */
	public Adapter createLoss_CarryforwardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TaxationWithRoot.Spousal_Expense_AC <em>Spousal Expense AC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TaxationWithRoot.Spousal_Expense_AC
	 * @generated
	 */
	public Adapter createSpousal_Expense_ACAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TaxationWithRoot.Extraordinary_Expense_CE <em>Extraordinary Expense CE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TaxationWithRoot.Extraordinary_Expense_CE
	 * @generated
	 */
	public Adapter createExtraordinary_Expense_CEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TaxationWithRoot.Travel_Expense_FD <em>Travel Expense FD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TaxationWithRoot.Travel_Expense_FD
	 * @generated
	 */
	public Adapter createTravel_Expense_FDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TaxationWithRoot.Professional_Expense <em>Professional Expense</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TaxationWithRoot.Professional_Expense
	 * @generated
	 */
	public Adapter createProfessional_ExpenseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TaxationWithRoot.Miscellaneous_Expense_FO <em>Miscellaneous Expense FO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TaxationWithRoot.Miscellaneous_Expense_FO
	 * @generated
	 */
	public Adapter createMiscellaneous_Expense_FOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link TaxationWithRoot.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see TaxationWithRoot.Resource
	 * @generated
	 */
	public Adapter createResourceAdapter() {
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

} //TaxationAdapterFactory
