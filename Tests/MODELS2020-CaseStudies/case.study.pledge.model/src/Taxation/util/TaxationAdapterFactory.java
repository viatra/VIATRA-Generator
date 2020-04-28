/**
 */
package Taxation.util;

import Taxation.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see Taxation.TaxationPackage
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
			public Adapter caseFD(FD object) {
				return createFDAdapter();
			}
			@Override
			public Adapter caseProfessional_Expenses_Deduction(Professional_Expenses_Deduction object) {
				return createProfessional_Expenses_DeductionAdapter();
			}
			@Override
			public Adapter caseFO(FO object) {
				return createFOAdapter();
			}
			@Override
			public Adapter caseDS_for_Permanent_Expense(DS_for_Permanent_Expense object) {
				return createDS_for_Permanent_ExpenseAdapter();
			}
			@Override
			public Adapter caseDS(DS object) {
				return createDSAdapter();
			}
			@Override
			public Adapter caseDS_for_Interest_Expense(DS_for_Interest_Expense object) {
				return createDS_for_Interest_ExpenseAdapter();
			}
			@Override
			public Adapter caseDS_for_Health_and_Pension_Insurance(DS_for_Health_and_Pension_Insurance object) {
				return createDS_for_Health_and_Pension_InsuranceAdapter();
			}
			@Override
			public Adapter caseDS_for_Private_Insurance_and_Plan(DS_for_Private_Insurance_and_Plan object) {
				return createDS_for_Private_Insurance_and_PlanAdapter();
			}
			@Override
			public Adapter caseDS_for_Loss_Carryforward(DS_for_Loss_Carryforward object) {
				return createDS_for_Loss_CarryforwardAdapter();
			}
			@Override
			public Adapter caseDS_for_Donation(DS_for_Donation object) {
				return createDS_for_DonationAdapter();
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
	 * Creates a new adapter for an object of class '{@link Taxation.Constants <em>Constants</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Taxation.Constants
	 * @generated
	 */
	public Adapter createConstantsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Taxation.Income_Tax <em>Income Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Taxation.Income_Tax
	 * @generated
	 */
	public Adapter createIncome_TaxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Taxation.Tax_Payer <em>Tax Payer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Taxation.Tax_Payer
	 * @generated
	 */
	public Adapter createTax_PayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Taxation.Physical_Person <em>Physical Person</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Taxation.Physical_Person
	 * @generated
	 */
	public Adapter createPhysical_PersonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Taxation.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Taxation.Address
	 * @generated
	 */
	public Adapter createAddressAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Taxation.Expense <em>Expense</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Taxation.Expense
	 * @generated
	 */
	public Adapter createExpenseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Taxation.Dependent <em>Dependent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Taxation.Dependent
	 * @generated
	 */
	public Adapter createDependentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Taxation.External_Allowance <em>External Allowance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Taxation.External_Allowance
	 * @generated
	 */
	public Adapter createExternal_AllowanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Taxation.Household <em>Household</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Taxation.Household
	 * @generated
	 */
	public Adapter createHouseholdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Taxation.Legal_Union_Record <em>Legal Union Record</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Taxation.Legal_Union_Record
	 * @generated
	 */
	public Adapter createLegal_Union_RecordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Taxation.Tax_Property <em>Tax Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Taxation.Tax_Property
	 * @generated
	 */
	public Adapter createTax_PropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Taxation.Tax_Case <em>Tax Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Taxation.Tax_Case
	 * @generated
	 */
	public Adapter createTax_CaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Taxation.FromAgent <em>From Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Taxation.FromAgent
	 * @generated
	 */
	public Adapter createFromAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Taxation.Income <em>Income</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Taxation.Income
	 * @generated
	 */
	public Adapter createIncomeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Taxation.Income_Type <em>Income Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Taxation.Income_Type
	 * @generated
	 */
	public Adapter createIncome_TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Taxation.Tax_Card <em>Tax Card</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Taxation.Tax_Card
	 * @generated
	 */
	public Adapter createTax_CardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Taxation.Income_Tax_Credit <em>Income Tax Credit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Taxation.Income_Tax_Credit
	 * @generated
	 */
	public Adapter createIncome_Tax_CreditAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Taxation.Income_Detail <em>Income Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Taxation.Income_Detail
	 * @generated
	 */
	public Adapter createIncome_DetailAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Taxation.FromLaw <em>From Law</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Taxation.FromLaw
	 * @generated
	 */
	public Adapter createFromLawAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Taxation.Fiscal_Address <em>Fiscal Address</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Taxation.Fiscal_Address
	 * @generated
	 */
	public Adapter createFiscal_AddressAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Taxation.Habitual_Address <em>Habitual Address</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Taxation.Habitual_Address
	 * @generated
	 */
	public Adapter createHabitual_AddressAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Taxation.Marriage_Record <em>Marriage Record</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Taxation.Marriage_Record
	 * @generated
	 */
	public Adapter createMarriage_RecordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Taxation.Non_Resident_Tax_Payer <em>Non Resident Tax Payer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Taxation.Non_Resident_Tax_Payer
	 * @generated
	 */
	public Adapter createNon_Resident_Tax_PayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Taxation.Partnership_Record <em>Partnership Record</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Taxation.Partnership_Record
	 * @generated
	 */
	public Adapter createPartnership_RecordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Taxation.Resident_Tax_Payer <em>Resident Tax Payer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Taxation.Resident_Tax_Payer
	 * @generated
	 */
	public Adapter createResident_Tax_PayerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Taxation.Trade_and_Business_Income <em>Trade and Business Income</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Taxation.Trade_and_Business_Income
	 * @generated
	 */
	public Adapter createTrade_and_Business_IncomeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Taxation.Agriculture_and_Forestry_Income <em>Agriculture and Forestry Income</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Taxation.Agriculture_and_Forestry_Income
	 * @generated
	 */
	public Adapter createAgriculture_and_Forestry_IncomeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Taxation.Pensions_and_Annuities_Income <em>Pensions and Annuities Income</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Taxation.Pensions_and_Annuities_Income
	 * @generated
	 */
	public Adapter createPensions_and_Annuities_IncomeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Taxation.Capital_and_Investments_Income <em>Capital and Investments Income</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Taxation.Capital_and_Investments_Income
	 * @generated
	 */
	public Adapter createCapital_and_Investments_IncomeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Taxation.Employment_Income <em>Employment Income</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Taxation.Employment_Income
	 * @generated
	 */
	public Adapter createEmployment_IncomeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Taxation.Rentals_and_Leases_Income <em>Rentals and Leases Income</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Taxation.Rentals_and_Leases_Income
	 * @generated
	 */
	public Adapter createRentals_and_Leases_IncomeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Taxation.Foreign_Income <em>Foreign Income</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Taxation.Foreign_Income
	 * @generated
	 */
	public Adapter createForeign_IncomeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Taxation.Local_Income <em>Local Income</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Taxation.Local_Income
	 * @generated
	 */
	public Adapter createLocal_IncomeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Taxation.CIM <em>CIM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Taxation.CIM
	 * @generated
	 */
	public Adapter createCIMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Taxation.CIP <em>CIP</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Taxation.CIP
	 * @generated
	 */
	public Adapter createCIPAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Taxation.CIS <em>CIS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Taxation.CIS
	 * @generated
	 */
	public Adapter createCISAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Taxation.FD <em>FD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Taxation.FD
	 * @generated
	 */
	public Adapter createFDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Taxation.Professional_Expenses_Deduction <em>Professional Expenses Deduction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Taxation.Professional_Expenses_Deduction
	 * @generated
	 */
	public Adapter createProfessional_Expenses_DeductionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Taxation.FO <em>FO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Taxation.FO
	 * @generated
	 */
	public Adapter createFOAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Taxation.DS_for_Permanent_Expense <em>DS for Permanent Expense</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Taxation.DS_for_Permanent_Expense
	 * @generated
	 */
	public Adapter createDS_for_Permanent_ExpenseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Taxation.DS <em>DS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Taxation.DS
	 * @generated
	 */
	public Adapter createDSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Taxation.DS_for_Interest_Expense <em>DS for Interest Expense</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Taxation.DS_for_Interest_Expense
	 * @generated
	 */
	public Adapter createDS_for_Interest_ExpenseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Taxation.DS_for_Health_and_Pension_Insurance <em>DS for Health and Pension Insurance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Taxation.DS_for_Health_and_Pension_Insurance
	 * @generated
	 */
	public Adapter createDS_for_Health_and_Pension_InsuranceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Taxation.DS_for_Private_Insurance_and_Plan <em>DS for Private Insurance and Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Taxation.DS_for_Private_Insurance_and_Plan
	 * @generated
	 */
	public Adapter createDS_for_Private_Insurance_and_PlanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Taxation.DS_for_Loss_Carryforward <em>DS for Loss Carryforward</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Taxation.DS_for_Loss_Carryforward
	 * @generated
	 */
	public Adapter createDS_for_Loss_CarryforwardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Taxation.DS_for_Donation <em>DS for Donation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Taxation.DS_for_Donation
	 * @generated
	 */
	public Adapter createDS_for_DonationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Taxation.Permanent_Expense <em>Permanent Expense</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Taxation.Permanent_Expense
	 * @generated
	 */
	public Adapter createPermanent_ExpenseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Taxation.Special_Expense_DS <em>Special Expense DS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Taxation.Special_Expense_DS
	 * @generated
	 */
	public Adapter createSpecial_Expense_DSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Taxation.Interest_Expense <em>Interest Expense</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Taxation.Interest_Expense
	 * @generated
	 */
	public Adapter createInterest_ExpenseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Taxation.Private_Insurance_and_Plan <em>Private Insurance and Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Taxation.Private_Insurance_and_Plan
	 * @generated
	 */
	public Adapter createPrivate_Insurance_and_PlanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Taxation.Health_and_Pension_Insurance <em>Health and Pension Insurance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Taxation.Health_and_Pension_Insurance
	 * @generated
	 */
	public Adapter createHealth_and_Pension_InsuranceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Taxation.Donation <em>Donation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Taxation.Donation
	 * @generated
	 */
	public Adapter createDonationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Taxation.Loss_Carryforward <em>Loss Carryforward</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Taxation.Loss_Carryforward
	 * @generated
	 */
	public Adapter createLoss_CarryforwardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Taxation.Spousal_Expense_AC <em>Spousal Expense AC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Taxation.Spousal_Expense_AC
	 * @generated
	 */
	public Adapter createSpousal_Expense_ACAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Taxation.Extraordinary_Expense_CE <em>Extraordinary Expense CE</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Taxation.Extraordinary_Expense_CE
	 * @generated
	 */
	public Adapter createExtraordinary_Expense_CEAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Taxation.Travel_Expense_FD <em>Travel Expense FD</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Taxation.Travel_Expense_FD
	 * @generated
	 */
	public Adapter createTravel_Expense_FDAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Taxation.Professional_Expense <em>Professional Expense</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Taxation.Professional_Expense
	 * @generated
	 */
	public Adapter createProfessional_ExpenseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Taxation.Miscellaneous_Expense_FO <em>Miscellaneous Expense FO</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Taxation.Miscellaneous_Expense_FO
	 * @generated
	 */
	public Adapter createMiscellaneous_Expense_FOAdapter() {
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
