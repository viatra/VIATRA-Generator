/**
 */
package TaxationWithRoot.impl;

import TaxationWithRoot.Address;
import TaxationWithRoot.Agriculture_and_Forestry_Income;
import TaxationWithRoot.CE_Type;
import TaxationWithRoot.Capital_and_Investments_Income;
import TaxationWithRoot.Category_of_Health_and_Pension_Insurances;
import TaxationWithRoot.Category_of_Permanent_Expense;
import TaxationWithRoot.Category_of_Private_Insurance_and_Plan;
import TaxationWithRoot.Constants;
import TaxationWithRoot.Country;
import TaxationWithRoot.Dependent;
import TaxationWithRoot.Dependent_Type;
import TaxationWithRoot.Disability_Types;
import TaxationWithRoot.Donation;
import TaxationWithRoot.Employment_Income;
import TaxationWithRoot.Expense;
import TaxationWithRoot.Expense_Purpose;
import TaxationWithRoot.External_Allowance;
import TaxationWithRoot.Extraordinary_Expense_CE;
import TaxationWithRoot.Fiscal_Address;
import TaxationWithRoot.Foreign_Income;
import TaxationWithRoot.FromAgent;
import TaxationWithRoot.FromLaw;
import TaxationWithRoot.Grantor;
import TaxationWithRoot.Habitual_Address;
import TaxationWithRoot.Health_and_Pension_Insurance;
import TaxationWithRoot.Household;
import TaxationWithRoot.Income;
import TaxationWithRoot.Income_Detail;
import TaxationWithRoot.Income_Tax;
import TaxationWithRoot.Income_Tax_Credit;
import TaxationWithRoot.Income_Type;
import TaxationWithRoot.Interest_Expense;
import TaxationWithRoot.Job_Activity;
import TaxationWithRoot.Legal_Union_Record;
import TaxationWithRoot.Legal_Union_Types;
import TaxationWithRoot.Local_Income;
import TaxationWithRoot.Loss_Carryforward;
import TaxationWithRoot.Marriage_Record;
import TaxationWithRoot.Miscellaneous_Expense_FO;
import TaxationWithRoot.Non_Resident_Tax_Payer;
import TaxationWithRoot.Partnership_Record;
import TaxationWithRoot.Pensions_and_Annuities_Income;
import TaxationWithRoot.Permanent_Expense;
import TaxationWithRoot.Physical_Person;
import TaxationWithRoot.Private_Insurance_and_Plan;
import TaxationWithRoot.Professional_Expense;
import TaxationWithRoot.Rentals_and_Leases_Income;
import TaxationWithRoot.Resident_Tax_Payer;
import TaxationWithRoot.Resource;
import TaxationWithRoot.Separation_Causes;
import TaxationWithRoot.Special_Expense_DS;
import TaxationWithRoot.Spousal_Expense_AC;
import TaxationWithRoot.Tax_Card;
import TaxationWithRoot.Tax_Case;
import TaxationWithRoot.Tax_Class_Category;
import TaxationWithRoot.Tax_Office;
import TaxationWithRoot.Tax_Payer;
import TaxationWithRoot.Tax_Property;
import TaxationWithRoot.TaxationWithRootFactory;
import TaxationWithRoot.TaxationWithRootPackage;
import TaxationWithRoot.Town;
import TaxationWithRoot.Trade_and_Business_Income;
import TaxationWithRoot.Travel_Expense_FD;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TaxationWithRootPackageImpl extends EPackageImpl implements TaxationWithRootPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass income_TaxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tax_PayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass physical_PersonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expenseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dependentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass external_AllowanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass householdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legal_Union_RecordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tax_PropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tax_CaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fromAgentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass incomeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass income_TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tax_CardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass income_Tax_CreditEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass income_DetailEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fromLawEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fiscal_AddressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass habitual_AddressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass marriage_RecordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass non_Resident_Tax_PayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partnership_RecordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resident_Tax_PayerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trade_and_Business_IncomeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agriculture_and_Forestry_IncomeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pensions_and_Annuities_IncomeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capital_and_Investments_IncomeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass employment_IncomeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rentals_and_Leases_IncomeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass foreign_IncomeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass local_IncomeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cimEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cisEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permanent_ExpenseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass special_Expense_DSEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interest_ExpenseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass private_Insurance_and_PlanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass health_and_Pension_InsuranceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass donationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loss_CarryforwardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spousal_Expense_ACEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extraordinary_Expense_CEEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass travel_Expense_FDEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass professional_ExpenseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass miscellaneous_Expense_FOEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum grantorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum disability_TypesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum countryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tax_OfficeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tax_Class_CategoryEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum job_ActivityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum townEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cE_TypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum expense_PurposeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dependent_TypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum separation_CausesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum category_of_Permanent_ExpenseEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum category_of_Health_and_Pension_InsurancesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum category_of_Private_Insurance_and_PlanEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum legal_Union_TypesEEnum = null;

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
	 * @see TaxationWithRoot.TaxationWithRootPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TaxationWithRootPackageImpl() {
		super(eNS_URI, TaxationWithRootFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link TaxationWithRootPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TaxationWithRootPackage init() {
		if (isInited) return (TaxationWithRootPackage)EPackage.Registry.INSTANCE.getEPackage(TaxationWithRootPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredTaxationWithRootPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		TaxationWithRootPackageImpl theTaxationWithRootPackage = registeredTaxationWithRootPackage instanceof TaxationWithRootPackageImpl ? (TaxationWithRootPackageImpl)registeredTaxationWithRootPackage : new TaxationWithRootPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theTaxationWithRootPackage.createPackageContents();

		// Initialize created meta-data
		theTaxationWithRootPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTaxationWithRootPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TaxationWithRootPackage.eNS_URI, theTaxationWithRootPackage);
		return theTaxationWithRootPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConstants() {
		return constantsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConstants_MAXIMUM_CE_RATE_FOR_CHILD_NOT_BEING_PART_OF_HOUSEHOLD() {
		return (EAttribute)constantsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConstants_MAXIMUM_CE_RATE_FOR_HOUSE_CARE_AND_CHILD_PART_OF_THE_HOUSEHOLD_CARE() {
		return (EAttribute)constantsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConstants_MINIMUM_SALARY() {
		return (EAttribute)constantsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConstants_FLAT_RATE_FOR_EXTRA_PROFESSIONAL_DEDUCTION() {
		return (EAttribute)constantsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConstants_MAXIMUM_DEDUCTIBLE_PERCENTAGE_FOR_DONATIONS() {
		return (EAttribute)constantsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConstants_MINIMUM_DEDUCTIBLE_AMOUNT_FOR_DONATIONS() {
		return (EAttribute)constantsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConstants_MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANC() {
		return (EAttribute)constantsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConstants_MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ALIMONY_EXPENSE() {
		return (EAttribute)constantsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConstants_MAXIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION() {
		return (EAttribute)constantsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConstants_MAXIMAL_FLAT_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION() {
		return (EAttribute)constantsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConstants_MINIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION() {
		return (EAttribute)constantsEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConstants_FLAT_RATE_CIM_DAILY() {
		return (EAttribute)constantsEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConstants_FLAT_RATE_CIM_MONTHLY() {
		return (EAttribute)constantsEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConstants_FLAT_RATE_CIM_YEARLY() {
		return (EAttribute)constantsEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConstants_FLAT_RATE_CIP_DAILY() {
		return (EAttribute)constantsEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConstants_FLAT_RATE_CIP_MONTHLY() {
		return (EAttribute)constantsEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConstants_FLAT_RATE_CIP_YEARLY() {
		return (EAttribute)constantsEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConstants_FLAT_RATE_CIS_DAILY() {
		return (EAttribute)constantsEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConstants_FLAT_RATE_CIS_MONTHLY() {
		return (EAttribute)constantsEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConstants_FLAT_RATE_CIS_YEARLY() {
		return (EAttribute)constantsEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConstants_FLAT_RATE_FOR_TRAVEL_EXPENSE_PER_UNIT() {
		return (EAttribute)constantsEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConstants_MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_DS() {
		return (EAttribute)constantsEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConstants_FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE() {
		return (EAttribute)constantsEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConstants_DISABILITY_FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE() {
		return (EAttribute)constantsEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConstants_MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANCE() {
		return (EAttribute)constantsEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIncome_Tax() {
		return income_TaxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIncome_Tax_TaxPayer() {
		return (EReference)income_TaxEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIncome_Tax_Tax_amount() {
		return (EAttribute)income_TaxEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIncome_Tax_Tax_year() {
		return (EAttribute)income_TaxEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIncome_Tax_Id6() {
		return (EAttribute)income_TaxEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTax_Payer() {
		return tax_PayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTax_Payer_Dependents() {
		return (EReference)tax_PayerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTax_Payer_From_agent() {
		return (EReference)tax_PayerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTax_Payer_Incomes() {
		return (EReference)tax_PayerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTax_Payer_From_law() {
		return (EReference)tax_PayerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPhysical_Person() {
		return physical_PersonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPhysical_Person_SSNo() {
		return (EAttribute)physical_PersonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPhysical_Person_Addresses() {
		return (EReference)physical_PersonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPhysical_Person_Birth_year() {
		return (EAttribute)physical_PersonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPhysical_Person_Disability_percentage() {
		return (EAttribute)physical_PersonEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPhysical_Person_Disability_type() {
		return (EAttribute)physical_PersonEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPhysical_Person_Birth_month() {
		return (EAttribute)physical_PersonEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPhysical_Person_Birth_day() {
		return (EAttribute)physical_PersonEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPhysical_Person_Expenses() {
		return (EReference)physical_PersonEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPhysical_Person_Is_widower() {
		return (EAttribute)physical_PersonEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAddress() {
		return addressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddress_Country() {
		return (EAttribute)addressEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddress_Street() {
		return (EAttribute)addressEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddress_ZipCode() {
		return (EAttribute)addressEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddress_City() {
		return (EAttribute)addressEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAddress_Id2() {
		return (EAttribute)addressEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAddress_TaxPayer() {
		return (EReference)addressEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExpense() {
		return expenseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExpense_Declared_amount() {
		return (EAttribute)expenseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExpense_Expense_purpose() {
		return (EAttribute)expenseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExpense_Dependent() {
		return (EReference)expenseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExpense_From_agent() {
		return (EReference)expenseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExpense_Income() {
		return (EReference)expenseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExpense_Id4() {
		return (EAttribute)expenseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExpense_Beneficiary() {
		return (EReference)expenseEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDependent() {
		return dependentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDependent_Dependent_type() {
		return (EAttribute)dependentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDependent_Responsible_person() {
		return (EReference)dependentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDependent_Continued_studies() {
		return (EAttribute)dependentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDependent_Allowances() {
		return (EReference)dependentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDependent_Household() {
		return (EReference)dependentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDependent_From_agent() {
		return (EReference)dependentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDependent_Expense() {
		return (EReference)dependentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExternal_Allowance() {
		return external_AllowanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExternal_Allowance_Grantor() {
		return (EAttribute)external_AllowanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExternal_Allowance_Starting_year() {
		return (EAttribute)external_AllowanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExternal_Allowance_Ending_year() {
		return (EAttribute)external_AllowanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExternal_Allowance_Reciver() {
		return (EReference)external_AllowanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExternal_Allowance_Id5() {
		return (EAttribute)external_AllowanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExternal_Allowance_Person() {
		return (EReference)external_AllowanceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHousehold() {
		return householdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHousehold_Parents() {
		return (EReference)householdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHousehold_Id1() {
		return (EAttribute)householdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHousehold_Children() {
		return (EReference)householdEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLegal_Union_Record() {
		return legal_Union_RecordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLegal_Union_Record_Start_year() {
		return (EAttribute)legal_Union_RecordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLegal_Union_Record_End_year() {
		return (EAttribute)legal_Union_RecordEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLegal_Union_Record_Separation_cause() {
		return (EAttribute)legal_Union_RecordEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLegal_Union_Record_Individual_A() {
		return (EReference)legal_Union_RecordEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLegal_Union_Record_Individual_B() {
		return (EReference)legal_Union_RecordEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLegal_Union_Record_Properties() {
		return (EReference)legal_Union_RecordEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLegal_Union_Record_Mutual_agreement() {
		return (EAttribute)legal_Union_RecordEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLegal_Union_Record_Id9() {
		return (EAttribute)legal_Union_RecordEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLegal_Union_Record_Household() {
		return (EReference)legal_Union_RecordEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTax_Property() {
		return tax_PropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTax_Property_Starting_year() {
		return (EAttribute)tax_PropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTax_Property_Id10() {
		return (EAttribute)tax_PropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTax_Property_Union_record() {
		return (EReference)tax_PropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTax_Case() {
		return tax_CaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFromAgent() {
		return fromAgentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFromAgent_TaxPayer() {
		return (EReference)fromAgentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFromAgent_Is_dependent_eligible_for_CE_Not_In_Houshold_Children_Care() {
		return (EAttribute)fromAgentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFromAgent_Expense() {
		return (EReference)fromAgentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFromAgent_Is_eligible_debt() {
		return (EAttribute)fromAgentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFromAgent_Dependent() {
		return (EReference)fromAgentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIncome() {
		return incomeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIncome_Income_amount() {
		return (EAttribute)incomeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIncome_Income_type() {
		return (EReference)incomeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIncome_Tax_card() {
		return (EReference)incomeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIncome_Tax_liability() {
		return (EAttribute)incomeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIncome_TaxPayer() {
		return (EReference)incomeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIncome_Details() {
		return (EReference)incomeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIncome_Num() {
		return (EAttribute)incomeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIncome_Expenses() {
		return (EReference)incomeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIncome_Type() {
		return income_TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIncome_Type_Id8() {
		return (EAttribute)income_TypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIncome_Type_Income() {
		return (EReference)income_TypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTax_Card() {
		return tax_CardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTax_Card_Card_identifier() {
		return (EAttribute)tax_CardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTax_Card_Tax_office() {
		return (EAttribute)tax_CardEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTax_Card_Percentage_of_witholding() {
		return (EAttribute)tax_CardEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTax_Card_Tax_payers_name_surname() {
		return (EAttribute)tax_CardEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTax_Card_Tax_payers_partner_name_surname() {
		return (EAttribute)tax_CardEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTax_Card_Tax_payers_address() {
		return (EReference)tax_CardEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTax_Card_Jobs_Employer_SSNo() {
		return (EAttribute)tax_CardEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTax_Card_Jobs_employers_name() {
		return (EAttribute)tax_CardEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTax_Card_Jobs_activity_type() {
		return (EAttribute)tax_CardEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTax_Card_Jobs_place_of_work() {
		return (EAttribute)tax_CardEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTax_Card_Deduction_FD_daily() {
		return (EAttribute)tax_CardEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTax_Card_Deduction_FD_monthly() {
		return (EAttribute)tax_CardEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTax_Card_Deduction_AC_daily() {
		return (EAttribute)tax_CardEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTax_Card_Deduction_AC_monthly() {
		return (EAttribute)tax_CardEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTax_Card_Deduction_AC_yearly() {
		return (EAttribute)tax_CardEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTax_Card_Deduction_CE_daily() {
		return (EAttribute)tax_CardEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTax_Card_Deduction_CE_monthly() {
		return (EAttribute)tax_CardEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTax_Card_Deduction_CE_yearly() {
		return (EAttribute)tax_CardEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTax_Card_Deduction_DS_daily() {
		return (EAttribute)tax_CardEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTax_Card_Deduction_DS_monthly() {
		return (EAttribute)tax_CardEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTax_Card_Deduction_FO_daily() {
		return (EAttribute)tax_CardEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTax_Card_Deduction_FO_monthly() {
		return (EAttribute)tax_CardEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTax_Card_Deduction_FO_yearly() {
		return (EAttribute)tax_CardEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTax_Card_Credit_CIS_daily() {
		return (EAttribute)tax_CardEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTax_Card_Credit_CIS_monthly() {
		return (EAttribute)tax_CardEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTax_Card_Credit_CIM_daily() {
		return (EAttribute)tax_CardEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTax_Card_Validity() {
		return (EAttribute)tax_CardEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTax_Card_Income_Tax_Credit() {
		return (EReference)tax_CardEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTax_Card_Previous() {
		return (EReference)tax_CardEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTax_Card_Current_tax_card() {
		return (EReference)tax_CardEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTax_Card_Credit_CIM_yearly() {
		return (EAttribute)tax_CardEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTax_Card_Deduction_DS_Alimony_yearly() {
		return (EAttribute)tax_CardEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTax_Card_Deduction_DS_Debt_yearly() {
		return (EAttribute)tax_CardEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTax_Card_Income() {
		return (EReference)tax_CardEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIncome_Tax_Credit() {
		return income_Tax_CreditEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIncome_Tax_Credit_GrantedBy() {
		return (EAttribute)income_Tax_CreditEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIncome_Tax_Credit_TaxPayer() {
		return (EReference)income_Tax_CreditEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIncome_Tax_Credit_Tax_year() {
		return (EAttribute)income_Tax_CreditEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIncome_Tax_Credit_Yearly() {
		return (EAttribute)income_Tax_CreditEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIncome_Tax_Credit_Monthly() {
		return (EAttribute)income_Tax_CreditEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIncome_Tax_Credit_Daily() {
		return (EAttribute)income_Tax_CreditEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIncome_Tax_Credit_Id7() {
		return (EAttribute)income_Tax_CreditEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIncome_Tax_Credit_Taxation_Frame() {
		return (EReference)income_Tax_CreditEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIncome_Detail() {
		return income_DetailEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIncome_Detail_Amount() {
		return (EAttribute)income_DetailEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIncome_Detail_Is_worked() {
		return (EAttribute)income_DetailEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIncome_Detail_Distance() {
		return (EAttribute)income_DetailEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIncome_Detail_Worked_days() {
		return (EAttribute)income_DetailEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIncome_Detail_Is_contributing_CNS() {
		return (EAttribute)income_DetailEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIncome_Detail_Id5() {
		return (EAttribute)income_DetailEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getIncome_Detail_Income() {
		return (EReference)income_DetailEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFromLaw() {
		return fromLawEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFromLaw_Id() {
		return (EAttribute)fromLawEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFromLaw_TaxPayer() {
		return (EReference)fromLawEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFiscal_Address() {
		return fiscal_AddressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHabitual_Address() {
		return habitual_AddressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMarriage_Record() {
		return marriage_RecordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNon_Resident_Tax_Payer() {
		return non_Resident_Tax_PayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNon_Resident_Tax_Payer_Is_assimilated_to_resident() {
		return (EAttribute)non_Resident_Tax_PayerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPartnership_Record() {
		return partnership_RecordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResident_Tax_Payer() {
		return resident_Tax_PayerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrade_and_Business_Income() {
		return trade_and_Business_IncomeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAgriculture_and_Forestry_Income() {
		return agriculture_and_Forestry_IncomeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPensions_and_Annuities_Income() {
		return pensions_and_Annuities_IncomeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPensions_and_Annuities_Income_Occasional_payement() {
		return (EAttribute)pensions_and_Annuities_IncomeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCapital_and_Investments_Income() {
		return capital_and_Investments_IncomeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEmployment_Income() {
		return employment_IncomeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRentals_and_Leases_Income() {
		return rentals_and_Leases_IncomeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRentals_and_Leases_Income_Is_periodic() {
		return (EAttribute)rentals_and_Leases_IncomeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getForeign_Income() {
		return foreign_IncomeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLocal_Income() {
		return local_IncomeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCIM() {
		return cimEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCIP() {
		return cipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCIS() {
		return cisEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPermanent_Expense() {
		return permanent_ExpenseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPermanent_Expense_Category() {
		return (EAttribute)permanent_ExpenseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpecial_Expense_DS() {
		return special_Expense_DSEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterest_Expense() {
		return interest_ExpenseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrivate_Insurance_and_Plan() {
		return private_Insurance_and_PlanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrivate_Insurance_and_Plan_Category() {
		return (EAttribute)private_Insurance_and_PlanEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrivate_Insurance_and_Plan_Duration_of_contract() {
		return (EAttribute)private_Insurance_and_PlanEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHealth_and_Pension_Insurance() {
		return health_and_Pension_InsuranceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHealth_and_Pension_Insurance_Category() {
		return (EAttribute)health_and_Pension_InsuranceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHealth_and_Pension_Insurance_Is_related_to_additional_salary() {
		return (EAttribute)health_and_Pension_InsuranceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDonation() {
		return donationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDonation_Beneficiary1() {
		return (EAttribute)donationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDonation_Is_donation_reported() {
		return (EAttribute)donationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLoss_Carryforward() {
		return loss_CarryforwardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpousal_Expense_AC() {
		return spousal_Expense_ACEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExtraordinary_Expense_CE() {
		return extraordinary_Expense_CEEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExtraordinary_Expense_CE_Thresholded_deduction_percentage() {
		return (EAttribute)extraordinary_Expense_CEEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExtraordinary_Expense_CE_Ce_type() {
		return (EAttribute)extraordinary_Expense_CEEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTravel_Expense_FD() {
		return travel_Expense_FDEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProfessional_Expense() {
		return professional_ExpenseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMiscellaneous_Expense_FO() {
		return miscellaneous_Expense_FOEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getResource() {
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getResource_Contains() {
		return (EReference)resourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getGrantor() {
		return grantorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDisability_Types() {
		return disability_TypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCountry() {
		return countryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTax_Office() {
		return tax_OfficeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTax_Class_Category() {
		return tax_Class_CategoryEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getJob_Activity() {
		return job_ActivityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTown() {
		return townEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCE_Type() {
		return cE_TypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getExpense_Purpose() {
		return expense_PurposeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDependent_Type() {
		return dependent_TypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSeparation_Causes() {
		return separation_CausesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCategory_of_Permanent_Expense() {
		return category_of_Permanent_ExpenseEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCategory_of_Health_and_Pension_Insurances() {
		return category_of_Health_and_Pension_InsurancesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCategory_of_Private_Insurance_and_Plan() {
		return category_of_Private_Insurance_and_PlanEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLegal_Union_Types() {
		return legal_Union_TypesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaxationWithRootFactory getTaxationWithRootFactory() {
		return (TaxationWithRootFactory)getEFactoryInstance();
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
		constantsEClass = createEClass(CONSTANTS);
		createEAttribute(constantsEClass, CONSTANTS__MAXIMUM_CE_RATE_FOR_CHILD_NOT_BEING_PART_OF_HOUSEHOLD);
		createEAttribute(constantsEClass, CONSTANTS__MAXIMUM_CE_RATE_FOR_HOUSE_CARE_AND_CHILD_PART_OF_THE_HOUSEHOLD_CARE);
		createEAttribute(constantsEClass, CONSTANTS__MINIMUM_SALARY);
		createEAttribute(constantsEClass, CONSTANTS__FLAT_RATE_FOR_EXTRA_PROFESSIONAL_DEDUCTION);
		createEAttribute(constantsEClass, CONSTANTS__MAXIMUM_DEDUCTIBLE_PERCENTAGE_FOR_DONATIONS);
		createEAttribute(constantsEClass, CONSTANTS__MINIMUM_DEDUCTIBLE_AMOUNT_FOR_DONATIONS);
		createEAttribute(constantsEClass, CONSTANTS__MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANC);
		createEAttribute(constantsEClass, CONSTANTS__MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ALIMONY_EXPENSE);
		createEAttribute(constantsEClass, CONSTANTS__MAXIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION);
		createEAttribute(constantsEClass, CONSTANTS__MAXIMAL_FLAT_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION);
		createEAttribute(constantsEClass, CONSTANTS__MINIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION);
		createEAttribute(constantsEClass, CONSTANTS__FLAT_RATE_CIM_DAILY);
		createEAttribute(constantsEClass, CONSTANTS__FLAT_RATE_CIM_MONTHLY);
		createEAttribute(constantsEClass, CONSTANTS__FLAT_RATE_CIM_YEARLY);
		createEAttribute(constantsEClass, CONSTANTS__FLAT_RATE_CIP_DAILY);
		createEAttribute(constantsEClass, CONSTANTS__FLAT_RATE_CIP_MONTHLY);
		createEAttribute(constantsEClass, CONSTANTS__FLAT_RATE_CIP_YEARLY);
		createEAttribute(constantsEClass, CONSTANTS__FLAT_RATE_CIS_DAILY);
		createEAttribute(constantsEClass, CONSTANTS__FLAT_RATE_CIS_MONTHLY);
		createEAttribute(constantsEClass, CONSTANTS__FLAT_RATE_CIS_YEARLY);
		createEAttribute(constantsEClass, CONSTANTS__FLAT_RATE_FOR_TRAVEL_EXPENSE_PER_UNIT);
		createEAttribute(constantsEClass, CONSTANTS__MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_DS);
		createEAttribute(constantsEClass, CONSTANTS__FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE);
		createEAttribute(constantsEClass, CONSTANTS__DISABILITY_FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE);
		createEAttribute(constantsEClass, CONSTANTS__MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANCE);

		income_TaxEClass = createEClass(INCOME_TAX);
		createEReference(income_TaxEClass, INCOME_TAX__TAX_PAYER);
		createEAttribute(income_TaxEClass, INCOME_TAX__TAX_AMOUNT);
		createEAttribute(income_TaxEClass, INCOME_TAX__TAX_YEAR);
		createEAttribute(income_TaxEClass, INCOME_TAX__ID6);

		tax_PayerEClass = createEClass(TAX_PAYER);
		createEReference(tax_PayerEClass, TAX_PAYER__DEPENDENTS);
		createEReference(tax_PayerEClass, TAX_PAYER__FROM_AGENT);
		createEReference(tax_PayerEClass, TAX_PAYER__INCOMES);
		createEReference(tax_PayerEClass, TAX_PAYER__FROM_LAW);

		physical_PersonEClass = createEClass(PHYSICAL_PERSON);
		createEAttribute(physical_PersonEClass, PHYSICAL_PERSON__SS_NO);
		createEReference(physical_PersonEClass, PHYSICAL_PERSON__ADDRESSES);
		createEAttribute(physical_PersonEClass, PHYSICAL_PERSON__BIRTH_YEAR);
		createEAttribute(physical_PersonEClass, PHYSICAL_PERSON__DISABILITY_PERCENTAGE);
		createEAttribute(physical_PersonEClass, PHYSICAL_PERSON__DISABILITY_TYPE);
		createEAttribute(physical_PersonEClass, PHYSICAL_PERSON__BIRTH_MONTH);
		createEAttribute(physical_PersonEClass, PHYSICAL_PERSON__BIRTH_DAY);
		createEReference(physical_PersonEClass, PHYSICAL_PERSON__EXPENSES);
		createEAttribute(physical_PersonEClass, PHYSICAL_PERSON__IS_WIDOWER);

		addressEClass = createEClass(ADDRESS);
		createEAttribute(addressEClass, ADDRESS__COUNTRY);
		createEAttribute(addressEClass, ADDRESS__STREET);
		createEAttribute(addressEClass, ADDRESS__ZIP_CODE);
		createEAttribute(addressEClass, ADDRESS__CITY);
		createEAttribute(addressEClass, ADDRESS__ID2);
		createEReference(addressEClass, ADDRESS__TAX_PAYER);

		expenseEClass = createEClass(EXPENSE);
		createEAttribute(expenseEClass, EXPENSE__DECLARED_AMOUNT);
		createEAttribute(expenseEClass, EXPENSE__EXPENSE_PURPOSE);
		createEReference(expenseEClass, EXPENSE__DEPENDENT);
		createEReference(expenseEClass, EXPENSE__FROM_AGENT);
		createEReference(expenseEClass, EXPENSE__INCOME);
		createEAttribute(expenseEClass, EXPENSE__ID4);
		createEReference(expenseEClass, EXPENSE__BENEFICIARY);

		dependentEClass = createEClass(DEPENDENT);
		createEAttribute(dependentEClass, DEPENDENT__DEPENDENT_TYPE);
		createEReference(dependentEClass, DEPENDENT__RESPONSIBLE_PERSON);
		createEAttribute(dependentEClass, DEPENDENT__CONTINUED_STUDIES);
		createEReference(dependentEClass, DEPENDENT__ALLOWANCES);
		createEReference(dependentEClass, DEPENDENT__HOUSEHOLD);
		createEReference(dependentEClass, DEPENDENT__FROM_AGENT);
		createEReference(dependentEClass, DEPENDENT__EXPENSE);

		external_AllowanceEClass = createEClass(EXTERNAL_ALLOWANCE);
		createEAttribute(external_AllowanceEClass, EXTERNAL_ALLOWANCE__GRANTOR);
		createEAttribute(external_AllowanceEClass, EXTERNAL_ALLOWANCE__STARTING_YEAR);
		createEAttribute(external_AllowanceEClass, EXTERNAL_ALLOWANCE__ENDING_YEAR);
		createEReference(external_AllowanceEClass, EXTERNAL_ALLOWANCE__RECIVER);
		createEAttribute(external_AllowanceEClass, EXTERNAL_ALLOWANCE__ID5);
		createEReference(external_AllowanceEClass, EXTERNAL_ALLOWANCE__PERSON);

		householdEClass = createEClass(HOUSEHOLD);
		createEReference(householdEClass, HOUSEHOLD__PARENTS);
		createEAttribute(householdEClass, HOUSEHOLD__ID1);
		createEReference(householdEClass, HOUSEHOLD__CHILDREN);

		legal_Union_RecordEClass = createEClass(LEGAL_UNION_RECORD);
		createEAttribute(legal_Union_RecordEClass, LEGAL_UNION_RECORD__START_YEAR);
		createEAttribute(legal_Union_RecordEClass, LEGAL_UNION_RECORD__END_YEAR);
		createEAttribute(legal_Union_RecordEClass, LEGAL_UNION_RECORD__SEPARATION_CAUSE);
		createEReference(legal_Union_RecordEClass, LEGAL_UNION_RECORD__INDIVIDUAL_A);
		createEReference(legal_Union_RecordEClass, LEGAL_UNION_RECORD__INDIVIDUAL_B);
		createEReference(legal_Union_RecordEClass, LEGAL_UNION_RECORD__PROPERTIES);
		createEAttribute(legal_Union_RecordEClass, LEGAL_UNION_RECORD__MUTUAL_AGREEMENT);
		createEAttribute(legal_Union_RecordEClass, LEGAL_UNION_RECORD__ID9);
		createEReference(legal_Union_RecordEClass, LEGAL_UNION_RECORD__HOUSEHOLD);

		tax_PropertyEClass = createEClass(TAX_PROPERTY);
		createEAttribute(tax_PropertyEClass, TAX_PROPERTY__STARTING_YEAR);
		createEAttribute(tax_PropertyEClass, TAX_PROPERTY__ID10);
		createEReference(tax_PropertyEClass, TAX_PROPERTY__UNION_RECORD);

		tax_CaseEClass = createEClass(TAX_CASE);

		fromAgentEClass = createEClass(FROM_AGENT);
		createEReference(fromAgentEClass, FROM_AGENT__TAX_PAYER);
		createEAttribute(fromAgentEClass, FROM_AGENT__IS_DEPENDENT_ELIGIBLE_FOR_CE_NOT_IN_HOUSHOLD_CHILDREN_CARE);
		createEReference(fromAgentEClass, FROM_AGENT__EXPENSE);
		createEAttribute(fromAgentEClass, FROM_AGENT__IS_ELIGIBLE_DEBT);
		createEReference(fromAgentEClass, FROM_AGENT__DEPENDENT);

		incomeEClass = createEClass(INCOME);
		createEAttribute(incomeEClass, INCOME__INCOME_AMOUNT);
		createEReference(incomeEClass, INCOME__INCOME_TYPE);
		createEReference(incomeEClass, INCOME__TAX_CARD);
		createEAttribute(incomeEClass, INCOME__TAX_LIABILITY);
		createEReference(incomeEClass, INCOME__TAX_PAYER);
		createEReference(incomeEClass, INCOME__DETAILS);
		createEAttribute(incomeEClass, INCOME__NUM);
		createEReference(incomeEClass, INCOME__EXPENSES);

		income_TypeEClass = createEClass(INCOME_TYPE);
		createEAttribute(income_TypeEClass, INCOME_TYPE__ID8);
		createEReference(income_TypeEClass, INCOME_TYPE__INCOME);

		tax_CardEClass = createEClass(TAX_CARD);
		createEAttribute(tax_CardEClass, TAX_CARD__CARD_IDENTIFIER);
		createEAttribute(tax_CardEClass, TAX_CARD__TAX_OFFICE);
		createEAttribute(tax_CardEClass, TAX_CARD__PERCENTAGE_OF_WITHOLDING);
		createEAttribute(tax_CardEClass, TAX_CARD__TAX_PAYERS_NAME_SURNAME);
		createEAttribute(tax_CardEClass, TAX_CARD__TAX_PAYERS_PARTNER_NAME_SURNAME);
		createEReference(tax_CardEClass, TAX_CARD__TAX_PAYERS_ADDRESS);
		createEAttribute(tax_CardEClass, TAX_CARD__JOBS_EMPLOYER_SS_NO);
		createEAttribute(tax_CardEClass, TAX_CARD__JOBS_EMPLOYERS_NAME);
		createEAttribute(tax_CardEClass, TAX_CARD__JOBS_ACTIVITY_TYPE);
		createEAttribute(tax_CardEClass, TAX_CARD__JOBS_PLACE_OF_WORK);
		createEAttribute(tax_CardEClass, TAX_CARD__DEDUCTION_FD_DAILY);
		createEAttribute(tax_CardEClass, TAX_CARD__DEDUCTION_FD_MONTHLY);
		createEAttribute(tax_CardEClass, TAX_CARD__DEDUCTION_AC_DAILY);
		createEAttribute(tax_CardEClass, TAX_CARD__DEDUCTION_AC_MONTHLY);
		createEAttribute(tax_CardEClass, TAX_CARD__DEDUCTION_AC_YEARLY);
		createEAttribute(tax_CardEClass, TAX_CARD__DEDUCTION_CE_DAILY);
		createEAttribute(tax_CardEClass, TAX_CARD__DEDUCTION_CE_MONTHLY);
		createEAttribute(tax_CardEClass, TAX_CARD__DEDUCTION_CE_YEARLY);
		createEAttribute(tax_CardEClass, TAX_CARD__DEDUCTION_DS_DAILY);
		createEAttribute(tax_CardEClass, TAX_CARD__DEDUCTION_DS_MONTHLY);
		createEAttribute(tax_CardEClass, TAX_CARD__DEDUCTION_FO_DAILY);
		createEAttribute(tax_CardEClass, TAX_CARD__DEDUCTION_FO_MONTHLY);
		createEAttribute(tax_CardEClass, TAX_CARD__DEDUCTION_FO_YEARLY);
		createEAttribute(tax_CardEClass, TAX_CARD__CREDIT_CIS_DAILY);
		createEAttribute(tax_CardEClass, TAX_CARD__CREDIT_CIS_MONTHLY);
		createEAttribute(tax_CardEClass, TAX_CARD__CREDIT_CIM_DAILY);
		createEAttribute(tax_CardEClass, TAX_CARD__VALIDITY);
		createEReference(tax_CardEClass, TAX_CARD__INCOME_TAX_CREDIT);
		createEReference(tax_CardEClass, TAX_CARD__PREVIOUS);
		createEReference(tax_CardEClass, TAX_CARD__CURRENT_TAX_CARD);
		createEAttribute(tax_CardEClass, TAX_CARD__CREDIT_CIM_YEARLY);
		createEAttribute(tax_CardEClass, TAX_CARD__DEDUCTION_DS_ALIMONY_YEARLY);
		createEAttribute(tax_CardEClass, TAX_CARD__DEDUCTION_DS_DEBT_YEARLY);
		createEReference(tax_CardEClass, TAX_CARD__INCOME);

		income_Tax_CreditEClass = createEClass(INCOME_TAX_CREDIT);
		createEAttribute(income_Tax_CreditEClass, INCOME_TAX_CREDIT__GRANTED_BY);
		createEReference(income_Tax_CreditEClass, INCOME_TAX_CREDIT__TAX_PAYER);
		createEAttribute(income_Tax_CreditEClass, INCOME_TAX_CREDIT__TAX_YEAR);
		createEAttribute(income_Tax_CreditEClass, INCOME_TAX_CREDIT__YEARLY);
		createEAttribute(income_Tax_CreditEClass, INCOME_TAX_CREDIT__MONTHLY);
		createEAttribute(income_Tax_CreditEClass, INCOME_TAX_CREDIT__DAILY);
		createEAttribute(income_Tax_CreditEClass, INCOME_TAX_CREDIT__ID7);
		createEReference(income_Tax_CreditEClass, INCOME_TAX_CREDIT__TAXATION_FRAME);

		income_DetailEClass = createEClass(INCOME_DETAIL);
		createEAttribute(income_DetailEClass, INCOME_DETAIL__AMOUNT);
		createEAttribute(income_DetailEClass, INCOME_DETAIL__IS_WORKED);
		createEAttribute(income_DetailEClass, INCOME_DETAIL__DISTANCE);
		createEAttribute(income_DetailEClass, INCOME_DETAIL__WORKED_DAYS);
		createEAttribute(income_DetailEClass, INCOME_DETAIL__IS_CONTRIBUTING_CNS);
		createEAttribute(income_DetailEClass, INCOME_DETAIL__ID5);
		createEReference(income_DetailEClass, INCOME_DETAIL__INCOME);

		fromLawEClass = createEClass(FROM_LAW);
		createEAttribute(fromLawEClass, FROM_LAW__ID);
		createEReference(fromLawEClass, FROM_LAW__TAX_PAYER);

		fiscal_AddressEClass = createEClass(FISCAL_ADDRESS);

		habitual_AddressEClass = createEClass(HABITUAL_ADDRESS);

		marriage_RecordEClass = createEClass(MARRIAGE_RECORD);

		non_Resident_Tax_PayerEClass = createEClass(NON_RESIDENT_TAX_PAYER);
		createEAttribute(non_Resident_Tax_PayerEClass, NON_RESIDENT_TAX_PAYER__IS_ASSIMILATED_TO_RESIDENT);

		partnership_RecordEClass = createEClass(PARTNERSHIP_RECORD);

		resident_Tax_PayerEClass = createEClass(RESIDENT_TAX_PAYER);

		trade_and_Business_IncomeEClass = createEClass(TRADE_AND_BUSINESS_INCOME);

		agriculture_and_Forestry_IncomeEClass = createEClass(AGRICULTURE_AND_FORESTRY_INCOME);

		pensions_and_Annuities_IncomeEClass = createEClass(PENSIONS_AND_ANNUITIES_INCOME);
		createEAttribute(pensions_and_Annuities_IncomeEClass, PENSIONS_AND_ANNUITIES_INCOME__OCCASIONAL_PAYEMENT);

		capital_and_Investments_IncomeEClass = createEClass(CAPITAL_AND_INVESTMENTS_INCOME);

		employment_IncomeEClass = createEClass(EMPLOYMENT_INCOME);

		rentals_and_Leases_IncomeEClass = createEClass(RENTALS_AND_LEASES_INCOME);
		createEAttribute(rentals_and_Leases_IncomeEClass, RENTALS_AND_LEASES_INCOME__IS_PERIODIC);

		foreign_IncomeEClass = createEClass(FOREIGN_INCOME);

		local_IncomeEClass = createEClass(LOCAL_INCOME);

		cimEClass = createEClass(CIM);

		cipEClass = createEClass(CIP);

		cisEClass = createEClass(CIS);

		permanent_ExpenseEClass = createEClass(PERMANENT_EXPENSE);
		createEAttribute(permanent_ExpenseEClass, PERMANENT_EXPENSE__CATEGORY);

		special_Expense_DSEClass = createEClass(SPECIAL_EXPENSE_DS);

		interest_ExpenseEClass = createEClass(INTEREST_EXPENSE);

		private_Insurance_and_PlanEClass = createEClass(PRIVATE_INSURANCE_AND_PLAN);
		createEAttribute(private_Insurance_and_PlanEClass, PRIVATE_INSURANCE_AND_PLAN__CATEGORY);
		createEAttribute(private_Insurance_and_PlanEClass, PRIVATE_INSURANCE_AND_PLAN__DURATION_OF_CONTRACT);

		health_and_Pension_InsuranceEClass = createEClass(HEALTH_AND_PENSION_INSURANCE);
		createEAttribute(health_and_Pension_InsuranceEClass, HEALTH_AND_PENSION_INSURANCE__CATEGORY);
		createEAttribute(health_and_Pension_InsuranceEClass, HEALTH_AND_PENSION_INSURANCE__IS_RELATED_TO_ADDITIONAL_SALARY);

		donationEClass = createEClass(DONATION);
		createEAttribute(donationEClass, DONATION__BENEFICIARY1);
		createEAttribute(donationEClass, DONATION__IS_DONATION_REPORTED);

		loss_CarryforwardEClass = createEClass(LOSS_CARRYFORWARD);

		spousal_Expense_ACEClass = createEClass(SPOUSAL_EXPENSE_AC);

		extraordinary_Expense_CEEClass = createEClass(EXTRAORDINARY_EXPENSE_CE);
		createEAttribute(extraordinary_Expense_CEEClass, EXTRAORDINARY_EXPENSE_CE__THRESHOLDED_DEDUCTION_PERCENTAGE);
		createEAttribute(extraordinary_Expense_CEEClass, EXTRAORDINARY_EXPENSE_CE__CE_TYPE);

		travel_Expense_FDEClass = createEClass(TRAVEL_EXPENSE_FD);

		professional_ExpenseEClass = createEClass(PROFESSIONAL_EXPENSE);

		miscellaneous_Expense_FOEClass = createEClass(MISCELLANEOUS_EXPENSE_FO);

		resourceEClass = createEClass(RESOURCE);
		createEReference(resourceEClass, RESOURCE__CONTAINS);

		// Create enums
		grantorEEnum = createEEnum(GRANTOR);
		disability_TypesEEnum = createEEnum(DISABILITY_TYPES);
		countryEEnum = createEEnum(COUNTRY);
		tax_OfficeEEnum = createEEnum(TAX_OFFICE);
		tax_Class_CategoryEEnum = createEEnum(TAX_CLASS_CATEGORY);
		job_ActivityEEnum = createEEnum(JOB_ACTIVITY);
		townEEnum = createEEnum(TOWN);
		cE_TypeEEnum = createEEnum(CE_TYPE);
		expense_PurposeEEnum = createEEnum(EXPENSE_PURPOSE);
		dependent_TypeEEnum = createEEnum(DEPENDENT_TYPE);
		separation_CausesEEnum = createEEnum(SEPARATION_CAUSES);
		category_of_Permanent_ExpenseEEnum = createEEnum(CATEGORY_OF_PERMANENT_EXPENSE);
		category_of_Health_and_Pension_InsurancesEEnum = createEEnum(CATEGORY_OF_HEALTH_AND_PENSION_INSURANCES);
		category_of_Private_Insurance_and_PlanEEnum = createEEnum(CATEGORY_OF_PRIVATE_INSURANCE_AND_PLAN);
		legal_Union_TypesEEnum = createEEnum(LEGAL_UNION_TYPES);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		tax_PayerEClass.getESuperTypes().add(this.getPhysical_Person());
		tax_PayerEClass.getESuperTypes().add(this.getTax_Case());
		dependentEClass.getESuperTypes().add(this.getPhysical_Person());
		householdEClass.getESuperTypes().add(this.getTax_Case());
		fiscal_AddressEClass.getESuperTypes().add(this.getAddress());
		habitual_AddressEClass.getESuperTypes().add(this.getAddress());
		marriage_RecordEClass.getESuperTypes().add(this.getLegal_Union_Record());
		non_Resident_Tax_PayerEClass.getESuperTypes().add(this.getTax_Payer());
		partnership_RecordEClass.getESuperTypes().add(this.getLegal_Union_Record());
		resident_Tax_PayerEClass.getESuperTypes().add(this.getTax_Payer());
		trade_and_Business_IncomeEClass.getESuperTypes().add(this.getIncome_Type());
		agriculture_and_Forestry_IncomeEClass.getESuperTypes().add(this.getIncome_Type());
		pensions_and_Annuities_IncomeEClass.getESuperTypes().add(this.getIncome_Type());
		capital_and_Investments_IncomeEClass.getESuperTypes().add(this.getIncome_Type());
		employment_IncomeEClass.getESuperTypes().add(this.getIncome_Type());
		rentals_and_Leases_IncomeEClass.getESuperTypes().add(this.getIncome_Type());
		foreign_IncomeEClass.getESuperTypes().add(this.getIncome());
		local_IncomeEClass.getESuperTypes().add(this.getIncome());
		cimEClass.getESuperTypes().add(this.getIncome_Tax_Credit());
		cipEClass.getESuperTypes().add(this.getIncome_Tax_Credit());
		cisEClass.getESuperTypes().add(this.getIncome_Tax_Credit());
		permanent_ExpenseEClass.getESuperTypes().add(this.getSpecial_Expense_DS());
		special_Expense_DSEClass.getESuperTypes().add(this.getExpense());
		interest_ExpenseEClass.getESuperTypes().add(this.getSpecial_Expense_DS());
		private_Insurance_and_PlanEClass.getESuperTypes().add(this.getSpecial_Expense_DS());
		health_and_Pension_InsuranceEClass.getESuperTypes().add(this.getSpecial_Expense_DS());
		donationEClass.getESuperTypes().add(this.getSpecial_Expense_DS());
		loss_CarryforwardEClass.getESuperTypes().add(this.getSpecial_Expense_DS());
		spousal_Expense_ACEClass.getESuperTypes().add(this.getExpense());
		extraordinary_Expense_CEEClass.getESuperTypes().add(this.getExpense());
		travel_Expense_FDEClass.getESuperTypes().add(this.getProfessional_Expense());
		professional_ExpenseEClass.getESuperTypes().add(this.getExpense());
		miscellaneous_Expense_FOEClass.getESuperTypes().add(this.getProfessional_Expense());

		// Initialize classes, features, and operations; add parameters
		initEClass(constantsEClass, Constants.class, "Constants", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstants_MAXIMUM_CE_RATE_FOR_CHILD_NOT_BEING_PART_OF_HOUSEHOLD(), ecorePackage.getEDouble(), "MAXIMUM_CE_RATE_FOR_CHILD_NOT_BEING_PART_OF_HOUSEHOLD", "3480.0", 1, 1, Constants.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstants_MAXIMUM_CE_RATE_FOR_HOUSE_CARE_AND_CHILD_PART_OF_THE_HOUSEHOLD_CARE(), ecorePackage.getEDouble(), "MAXIMUM_CE_RATE_FOR_HOUSE_CARE_AND_CHILD_PART_OF_THE_HOUSEHOLD_CARE", "3600.0", 1, 1, Constants.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstants_MINIMUM_SALARY(), ecorePackage.getEDouble(), "MINIMUM_SALARY", "1500.0", 1, 1, Constants.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstants_FLAT_RATE_FOR_EXTRA_PROFESSIONAL_DEDUCTION(), ecorePackage.getEDouble(), "FLAT_RATE_FOR_EXTRA_PROFESSIONAL_DEDUCTION", "4500.0", 1, 1, Constants.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstants_MAXIMUM_DEDUCTIBLE_PERCENTAGE_FOR_DONATIONS(), ecorePackage.getEDouble(), "MAXIMUM_DEDUCTIBLE_PERCENTAGE_FOR_DONATIONS", "20.0", 1, 1, Constants.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstants_MINIMUM_DEDUCTIBLE_AMOUNT_FOR_DONATIONS(), ecorePackage.getEDouble(), "MINIMUM_DEDUCTIBLE_AMOUNT_FOR_DONATIONS", "120.0", 1, 1, Constants.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstants_MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANC(), ecorePackage.getEDouble(), "MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANC", "0.0", 1, 1, Constants.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstants_MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ALIMONY_EXPENSE(), ecorePackage.getEDouble(), "MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ALIMONY_EXPENSE", "24000.0", 1, 1, Constants.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstants_MAXIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION(), ecorePackage.getEDouble(), "MAXIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION", "99.0", 1, 1, Constants.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstants_MAXIMAL_FLAT_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION(), ecorePackage.getEDouble(), "MAXIMAL_FLAT_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION", "30.0", 1, 1, Constants.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstants_MINIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION(), ecorePackage.getEDouble(), "MINIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION", "4.0", 1, 1, Constants.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstants_FLAT_RATE_CIM_DAILY(), ecorePackage.getEDouble(), "FLAT_RATE_CIM_DAILY", "2.0", 1, 1, Constants.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstants_FLAT_RATE_CIM_MONTHLY(), ecorePackage.getEDouble(), "FLAT_RATE_CIM_MONTHLY", "62.0", 1, 1, Constants.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstants_FLAT_RATE_CIM_YEARLY(), ecorePackage.getEDouble(), "FLAT_RATE_CIM_YEARLY", "750.0", 1, 1, Constants.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstants_FLAT_RATE_CIP_DAILY(), ecorePackage.getEDouble(), "FLAT_RATE_CIP_DAILY", "1.0", 1, 1, Constants.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstants_FLAT_RATE_CIP_MONTHLY(), ecorePackage.getEDouble(), "FLAT_RATE_CIP_MONTHLY", "25.0", 1, 1, Constants.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstants_FLAT_RATE_CIP_YEARLY(), ecorePackage.getEDouble(), "FLAT_RATE_CIP_YEARLY", "30.0", 1, 1, Constants.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstants_FLAT_RATE_CIS_DAILY(), ecorePackage.getEDouble(), "FLAT_RATE_CIS_DAILY", "1.0", 1, 1, Constants.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstants_FLAT_RATE_CIS_MONTHLY(), ecorePackage.getEDouble(), "FLAT_RATE_CIS_MONTHLY", "25.0", 1, 1, Constants.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstants_FLAT_RATE_CIS_YEARLY(), ecorePackage.getEDouble(), "FLAT_RATE_CIS_YEARLY", "300.0", 1, 1, Constants.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstants_FLAT_RATE_FOR_TRAVEL_EXPENSE_PER_UNIT(), ecorePackage.getEDouble(), "FLAT_RATE_FOR_TRAVEL_EXPENSE_PER_UNIT", "99.0", 1, 1, Constants.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstants_MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_DS(), ecorePackage.getEDouble(), "MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_DS", null, 1, 1, Constants.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstants_FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE(), ecorePackage.getEDouble(), "FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE", null, 1, 1, Constants.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstants_DISABILITY_FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE(), ecorePackage.getEDouble(), "DISABILITY_FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE", null, 1, 1, Constants.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConstants_MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANCE(), ecorePackage.getEDouble(), "MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANCE", null, 1, 1, Constants.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(income_TaxEClass, Income_Tax.class, "Income_Tax", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIncome_Tax_TaxPayer(), this.getTax_Payer(), null, "taxPayer", null, 1, 1, Income_Tax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIncome_Tax_Tax_amount(), ecorePackage.getEDouble(), "tax_amount", null, 1, 1, Income_Tax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIncome_Tax_Tax_year(), ecorePackage.getEInt(), "tax_year", null, 1, 1, Income_Tax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIncome_Tax_Id6(), ecorePackage.getEString(), "id6", null, 1, 1, Income_Tax.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(tax_PayerEClass, Tax_Payer.class, "Tax_Payer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTax_Payer_Dependents(), this.getDependent(), this.getDependent_Responsible_person(), "dependents", null, 0, 6, Tax_Payer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTax_Payer_From_agent(), this.getFromAgent(), this.getFromAgent_TaxPayer(), "from_agent", null, 1, 1, Tax_Payer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTax_Payer_Incomes(), this.getIncome(), this.getIncome_TaxPayer(), "incomes", null, 1, -1, Tax_Payer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTax_Payer_From_law(), this.getFromLaw(), this.getFromLaw_TaxPayer(), "from_law", null, 1, 1, Tax_Payer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(physical_PersonEClass, Physical_Person.class, "Physical_Person", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPhysical_Person_SSNo(), ecorePackage.getEString(), "SSNo", null, 1, 1, Physical_Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPhysical_Person_Addresses(), this.getAddress(), this.getAddress_TaxPayer(), "addresses", null, 0, -1, Physical_Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPhysical_Person_Birth_year(), ecorePackage.getEInt(), "birth_year", null, 1, 1, Physical_Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPhysical_Person_Disability_percentage(), ecorePackage.getEDouble(), "disability_percentage", null, 1, 1, Physical_Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPhysical_Person_Disability_type(), this.getDisability_Types(), "disability_type", null, 1, 1, Physical_Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPhysical_Person_Birth_month(), ecorePackage.getEInt(), "birth_month", null, 1, 1, Physical_Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPhysical_Person_Birth_day(), ecorePackage.getEInt(), "birth_day", null, 1, 1, Physical_Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPhysical_Person_Expenses(), this.getExpense(), this.getExpense_Beneficiary(), "expenses", null, 0, -1, Physical_Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getPhysical_Person_Is_widower(), ecorePackage.getEBoolean(), "is_widower", null, 1, 1, Physical_Person.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(addressEClass, Address.class, "Address", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddress_Country(), this.getCountry(), "country", "ZZ", 1, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddress_Street(), ecorePackage.getEString(), "street", null, 1, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddress_ZipCode(), ecorePackage.getEString(), "zipCode", null, 1, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddress_City(), ecorePackage.getEString(), "city", null, 1, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddress_Id2(), ecorePackage.getEString(), "id2", null, 1, 1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAddress_TaxPayer(), this.getPhysical_Person(), this.getPhysical_Person_Addresses(), "taxPayer", null, 0, -1, Address.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(expenseEClass, Expense.class, "Expense", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExpense_Declared_amount(), ecorePackage.getEDouble(), "declared_amount", null, 1, 1, Expense.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExpense_Expense_purpose(), this.getExpense_Purpose(), "expense_purpose", "OTHER", 1, 1, Expense.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpense_Dependent(), this.getDependent(), this.getDependent_Expense(), "dependent", null, 0, 1, Expense.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExpense_From_agent(), this.getFromAgent(), this.getFromAgent_Expense(), "from_agent", null, 0, 1, Expense.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getExpense_Income(), this.getIncome(), this.getIncome_Expenses(), "income", null, 1, 1, Expense.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExpense_Id4(), ecorePackage.getEString(), "id4", null, 1, 1, Expense.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getExpense_Beneficiary(), this.getPhysical_Person(), this.getPhysical_Person_Expenses(), "beneficiary", null, 0, 1, Expense.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dependentEClass, Dependent.class, "Dependent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDependent_Dependent_type(), this.getDependent_Type(), "dependent_type", null, 1, 1, Dependent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependent_Responsible_person(), this.getTax_Payer(), this.getTax_Payer_Dependents(), "responsible_person", null, 0, 1, Dependent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDependent_Continued_studies(), ecorePackage.getEBoolean(), "continued_studies", "false", 1, 1, Dependent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDependent_Allowances(), this.getExternal_Allowance(), this.getExternal_Allowance_Person(), "allowances", null, 0, 1, Dependent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDependent_Household(), this.getHousehold(), this.getHousehold_Children(), "household", null, 0, 1, Dependent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDependent_From_agent(), this.getFromAgent(), this.getFromAgent_Dependent(), "from_agent", null, 0, 1, Dependent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDependent_Expense(), this.getExpense(), this.getExpense_Dependent(), "expense", null, 0, -1, Dependent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(external_AllowanceEClass, External_Allowance.class, "External_Allowance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExternal_Allowance_Grantor(), this.getGrantor(), "grantor", null, 1, 1, External_Allowance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExternal_Allowance_Starting_year(), ecorePackage.getEInt(), "starting_year", null, 1, 1, External_Allowance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getExternal_Allowance_Ending_year(), ecorePackage.getEInt(), "ending_year", null, 1, 1, External_Allowance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getExternal_Allowance_Reciver(), this.getPhysical_Person(), null, "reciver", null, 1, 1, External_Allowance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getExternal_Allowance_Id5(), ecorePackage.getEString(), "id5", null, 1, 1, External_Allowance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getExternal_Allowance_Person(), this.getDependent(), this.getDependent_Allowances(), "person", null, 1, 1, External_Allowance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(householdEClass, Household.class, "Household", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHousehold_Parents(), this.getLegal_Union_Record(), this.getLegal_Union_Record_Household(), "parents", null, 1, 1, Household.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHousehold_Id1(), ecorePackage.getEString(), "id1", null, 1, 1, Household.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getHousehold_Children(), this.getDependent(), this.getDependent_Household(), "children", null, 0, -1, Household.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(legal_Union_RecordEClass, Legal_Union_Record.class, "Legal_Union_Record", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLegal_Union_Record_Start_year(), ecorePackage.getEInt(), "start_year", null, 1, 1, Legal_Union_Record.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegal_Union_Record_End_year(), ecorePackage.getEInt(), "end_year", null, 1, 1, Legal_Union_Record.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLegal_Union_Record_Separation_cause(), this.getSeparation_Causes(), "separation_cause", null, 1, 1, Legal_Union_Record.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLegal_Union_Record_Individual_A(), this.getPhysical_Person(), null, "individual_A", null, 1, 1, Legal_Union_Record.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLegal_Union_Record_Individual_B(), this.getPhysical_Person(), null, "individual_B", null, 1, -1, Legal_Union_Record.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLegal_Union_Record_Properties(), this.getTax_Property(), this.getTax_Property_Union_record(), "properties", null, 1, -1, Legal_Union_Record.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLegal_Union_Record_Mutual_agreement(), ecorePackage.getEBoolean(), "mutual_agreement", null, 1, 1, Legal_Union_Record.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getLegal_Union_Record_Id9(), ecorePackage.getEString(), "id9", null, 1, 1, Legal_Union_Record.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLegal_Union_Record_Household(), this.getHousehold(), this.getHousehold_Parents(), "household", null, 1, 1, Legal_Union_Record.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(tax_PropertyEClass, Tax_Property.class, "Tax_Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTax_Property_Starting_year(), ecorePackage.getEInt(), "starting_year", null, 1, 1, Tax_Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTax_Property_Id10(), ecorePackage.getEString(), "id10", null, 1, 1, Tax_Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTax_Property_Union_record(), this.getLegal_Union_Record(), this.getLegal_Union_Record_Properties(), "union_record", null, 1, 1, Tax_Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(tax_CaseEClass, Tax_Case.class, "Tax_Case", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fromAgentEClass, FromAgent.class, "FromAgent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFromAgent_TaxPayer(), this.getTax_Payer(), this.getTax_Payer_From_agent(), "taxPayer", null, 1, 1, FromAgent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFromAgent_Is_dependent_eligible_for_CE_Not_In_Houshold_Children_Care(), ecorePackage.getEBoolean(), "is_dependent_eligible_for_CE_Not_In_Houshold_Children_Care", null, 1, 1, FromAgent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFromAgent_Expense(), this.getExpense(), this.getExpense_From_agent(), "expense", null, 0, 1, FromAgent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFromAgent_Is_eligible_debt(), ecorePackage.getEBoolean(), "is_eligible_debt", null, 1, 1, FromAgent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFromAgent_Dependent(), this.getDependent(), this.getDependent_From_agent(), "dependent", null, 0, 1, FromAgent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(incomeEClass, Income.class, "Income", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIncome_Income_amount(), ecorePackage.getEDouble(), "income_amount", null, 1, 1, Income.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIncome_Income_type(), this.getIncome_Type(), this.getIncome_Type_Income(), "income_type", null, 1, 1, Income.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIncome_Tax_card(), this.getTax_Card(), this.getTax_Card_Income(), "tax_card", null, 0, 1, Income.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIncome_Tax_liability(), ecorePackage.getEDouble(), "tax_liability", null, 1, 1, Income.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIncome_TaxPayer(), this.getTax_Payer(), this.getTax_Payer_Incomes(), "taxPayer", null, 1, 1, Income.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIncome_Details(), this.getIncome_Detail(), this.getIncome_Detail_Income(), "details", null, 12, 12, Income.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIncome_Num(), ecorePackage.getEInt(), "num", null, 1, 1, Income.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIncome_Expenses(), this.getExpense(), this.getExpense_Income(), "expenses", null, 0, -1, Income.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(income_TypeEClass, Income_Type.class, "Income_Type", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIncome_Type_Id8(), ecorePackage.getEString(), "id8", null, 1, 1, Income_Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIncome_Type_Income(), this.getIncome(), this.getIncome_Income_type(), "income", null, 1, 1, Income_Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tax_CardEClass, Tax_Card.class, "Tax_Card", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTax_Card_Card_identifier(), ecorePackage.getEString(), "card_identifier", null, 0, 1, Tax_Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTax_Card_Tax_office(), this.getTax_Office(), "tax_office", null, 1, 1, Tax_Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTax_Card_Percentage_of_witholding(), ecorePackage.getEDouble(), "percentage_of_witholding", null, 1, 1, Tax_Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTax_Card_Tax_payers_name_surname(), ecorePackage.getEString(), "tax_payers_name_surname", null, 0, -1, Tax_Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTax_Card_Tax_payers_partner_name_surname(), ecorePackage.getEString(), "tax_payers_partner_name_surname", null, 0, -1, Tax_Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTax_Card_Tax_payers_address(), this.getAddress(), null, "tax_payers_address", null, 0, 1, Tax_Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTax_Card_Jobs_Employer_SSNo(), ecorePackage.getEString(), "jobs_Employer_SSNo", null, 0, 1, Tax_Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTax_Card_Jobs_employers_name(), ecorePackage.getEString(), "jobs_employers_name", null, 0, 1, Tax_Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTax_Card_Jobs_activity_type(), this.getJob_Activity(), "jobs_activity_type", null, 1, 1, Tax_Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTax_Card_Jobs_place_of_work(), this.getTown(), "jobs_place_of_work", null, 1, 1, Tax_Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTax_Card_Deduction_FD_daily(), ecorePackage.getEDouble(), "deduction_FD_daily", "0.0", 1, 1, Tax_Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTax_Card_Deduction_FD_monthly(), ecorePackage.getEDouble(), "deduction_FD_monthly", "0.0", 1, 1, Tax_Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTax_Card_Deduction_AC_daily(), ecorePackage.getEDouble(), "deduction_AC_daily", "0.0", 1, 1, Tax_Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTax_Card_Deduction_AC_monthly(), ecorePackage.getEDouble(), "deduction_AC_monthly", "0.0", 1, 1, Tax_Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTax_Card_Deduction_AC_yearly(), ecorePackage.getEDouble(), "deduction_AC_yearly", "0.0", 1, 1, Tax_Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTax_Card_Deduction_CE_daily(), ecorePackage.getEDouble(), "deduction_CE_daily", "0.0", 1, 1, Tax_Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTax_Card_Deduction_CE_monthly(), ecorePackage.getEDouble(), "deduction_CE_monthly", "0.0", 1, 1, Tax_Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTax_Card_Deduction_CE_yearly(), ecorePackage.getEDouble(), "deduction_CE_yearly", "0.0", 1, 1, Tax_Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTax_Card_Deduction_DS_daily(), ecorePackage.getEDouble(), "deduction_DS_daily", "0.0", 1, 1, Tax_Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTax_Card_Deduction_DS_monthly(), ecorePackage.getEDouble(), "deduction_DS_monthly", "0.0", 1, 1, Tax_Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTax_Card_Deduction_FO_daily(), ecorePackage.getEDouble(), "deduction_FO_daily", "0.0", 1, 1, Tax_Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTax_Card_Deduction_FO_monthly(), ecorePackage.getEDouble(), "deduction_FO_monthly", "0.0", 1, 1, Tax_Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTax_Card_Deduction_FO_yearly(), ecorePackage.getEDouble(), "deduction_FO_yearly", "0.0", 1, 1, Tax_Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTax_Card_Credit_CIS_daily(), ecorePackage.getEDouble(), "credit_CIS_daily", "0.0", 1, 1, Tax_Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTax_Card_Credit_CIS_monthly(), ecorePackage.getEDouble(), "credit_CIS_monthly", "0.0", 1, 1, Tax_Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTax_Card_Credit_CIM_daily(), ecorePackage.getEDouble(), "credit_CIM_daily", "0.0", 1, 1, Tax_Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTax_Card_Validity(), ecorePackage.getEBoolean(), "validity", null, 1, 1, Tax_Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTax_Card_Income_Tax_Credit(), this.getIncome_Tax_Credit(), this.getIncome_Tax_Credit_Taxation_Frame(), "income_Tax_Credit", null, 0, -1, Tax_Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTax_Card_Previous(), this.getTax_Card(), this.getTax_Card_Current_tax_card(), "previous", null, 0, 1, Tax_Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTax_Card_Current_tax_card(), this.getTax_Card(), this.getTax_Card_Previous(), "current_tax_card", null, 0, 1, Tax_Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTax_Card_Credit_CIM_yearly(), ecorePackage.getEDouble(), "credit_CIM_yearly", null, 1, 1, Tax_Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTax_Card_Deduction_DS_Alimony_yearly(), ecorePackage.getEDouble(), "deduction_DS_Alimony_yearly", null, 1, 1, Tax_Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTax_Card_Deduction_DS_Debt_yearly(), ecorePackage.getEDouble(), "deduction_DS_Debt_yearly", null, 1, 1, Tax_Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTax_Card_Income(), this.getIncome(), this.getIncome_Tax_card(), "income", null, 1, 1, Tax_Card.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(income_Tax_CreditEClass, Income_Tax_Credit.class, "Income_Tax_Credit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIncome_Tax_Credit_GrantedBy(), this.getGrantor(), "grantedBy", null, 1, 1, Income_Tax_Credit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getIncome_Tax_Credit_TaxPayer(), this.getTax_Payer(), null, "taxPayer", null, 0, 1, Income_Tax_Credit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIncome_Tax_Credit_Tax_year(), ecorePackage.getEInt(), "tax_year", null, 1, 1, Income_Tax_Credit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIncome_Tax_Credit_Yearly(), ecorePackage.getEDouble(), "yearly", "300.0", 1, 1, Income_Tax_Credit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIncome_Tax_Credit_Monthly(), ecorePackage.getEDouble(), "monthly", "25.0", 1, 1, Income_Tax_Credit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIncome_Tax_Credit_Daily(), ecorePackage.getEDouble(), "daily", "1.0", 1, 1, Income_Tax_Credit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIncome_Tax_Credit_Id7(), ecorePackage.getEString(), "id7", null, 1, 1, Income_Tax_Credit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIncome_Tax_Credit_Taxation_Frame(), this.getTax_Card(), this.getTax_Card_Income_Tax_Credit(), "taxation_Frame", null, 0, 1, Income_Tax_Credit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(income_DetailEClass, Income_Detail.class, "Income_Detail", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIncome_Detail_Amount(), ecorePackage.getEDouble(), "amount", null, 1, 1, Income_Detail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIncome_Detail_Is_worked(), ecorePackage.getEBoolean(), "is_worked", null, 1, 1, Income_Detail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIncome_Detail_Distance(), ecorePackage.getEDouble(), "distance", null, 1, 1, Income_Detail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIncome_Detail_Worked_days(), ecorePackage.getEInt(), "worked_days", null, 1, 1, Income_Detail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIncome_Detail_Is_contributing_CNS(), ecorePackage.getEBoolean(), "is_contributing_CNS", null, 1, 1, Income_Detail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getIncome_Detail_Id5(), ecorePackage.getEString(), "id5", null, 1, 1, Income_Detail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getIncome_Detail_Income(), this.getIncome(), this.getIncome_Details(), "income", null, 1, 1, Income_Detail.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fromLawEClass, FromLaw.class, "FromLaw", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFromLaw_Id(), ecorePackage.getEString(), "id", null, 1, 1, FromLaw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFromLaw_TaxPayer(), this.getTax_Payer(), this.getTax_Payer_From_law(), "taxPayer", null, 1, 1, FromLaw.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fiscal_AddressEClass, Fiscal_Address.class, "Fiscal_Address", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(habitual_AddressEClass, Habitual_Address.class, "Habitual_Address", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(marriage_RecordEClass, Marriage_Record.class, "Marriage_Record", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(non_Resident_Tax_PayerEClass, Non_Resident_Tax_Payer.class, "Non_Resident_Tax_Payer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNon_Resident_Tax_Payer_Is_assimilated_to_resident(), ecorePackage.getEBoolean(), "is_assimilated_to_resident", "false", 1, 1, Non_Resident_Tax_Payer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partnership_RecordEClass, Partnership_Record.class, "Partnership_Record", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resident_Tax_PayerEClass, Resident_Tax_Payer.class, "Resident_Tax_Payer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trade_and_Business_IncomeEClass, Trade_and_Business_Income.class, "Trade_and_Business_Income", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(agriculture_and_Forestry_IncomeEClass, Agriculture_and_Forestry_Income.class, "Agriculture_and_Forestry_Income", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(pensions_and_Annuities_IncomeEClass, Pensions_and_Annuities_Income.class, "Pensions_and_Annuities_Income", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPensions_and_Annuities_Income_Occasional_payement(), ecorePackage.getEBoolean(), "occasional_payement", "false", 0, 1, Pensions_and_Annuities_Income.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(capital_and_Investments_IncomeEClass, Capital_and_Investments_Income.class, "Capital_and_Investments_Income", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(employment_IncomeEClass, Employment_Income.class, "Employment_Income", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(rentals_and_Leases_IncomeEClass, Rentals_and_Leases_Income.class, "Rentals_and_Leases_Income", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRentals_and_Leases_Income_Is_periodic(), ecorePackage.getEBoolean(), "is_periodic", "true", 1, 1, Rentals_and_Leases_Income.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(foreign_IncomeEClass, Foreign_Income.class, "Foreign_Income", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(local_IncomeEClass, Local_Income.class, "Local_Income", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cimEClass, TaxationWithRoot.CIM.class, "CIM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cipEClass, TaxationWithRoot.CIP.class, "CIP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cisEClass, TaxationWithRoot.CIS.class, "CIS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(permanent_ExpenseEClass, Permanent_Expense.class, "Permanent_Expense", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPermanent_Expense_Category(), this.getCategory_of_Permanent_Expense(), "category", null, 1, 1, Permanent_Expense.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(special_Expense_DSEClass, Special_Expense_DS.class, "Special_Expense_DS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interest_ExpenseEClass, Interest_Expense.class, "Interest_Expense", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(private_Insurance_and_PlanEClass, Private_Insurance_and_Plan.class, "Private_Insurance_and_Plan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrivate_Insurance_and_Plan_Category(), this.getCategory_of_Private_Insurance_and_Plan(), "category", null, 1, 1, Private_Insurance_and_Plan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrivate_Insurance_and_Plan_Duration_of_contract(), ecorePackage.getEInt(), "duration_of_contract", null, 1, 1, Private_Insurance_and_Plan.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(health_and_Pension_InsuranceEClass, Health_and_Pension_Insurance.class, "Health_and_Pension_Insurance", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHealth_and_Pension_Insurance_Category(), this.getCategory_of_Health_and_Pension_Insurances(), "category", null, 1, 1, Health_and_Pension_Insurance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHealth_and_Pension_Insurance_Is_related_to_additional_salary(), ecorePackage.getEBoolean(), "is_related_to_additional_salary", "false", 1, 1, Health_and_Pension_Insurance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(donationEClass, Donation.class, "Donation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDonation_Beneficiary1(), ecorePackage.getEString(), "beneficiary1", null, 1, 1, Donation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDonation_Is_donation_reported(), ecorePackage.getEBoolean(), "is_donation_reported", null, 1, 1, Donation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(loss_CarryforwardEClass, Loss_Carryforward.class, "Loss_Carryforward", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(spousal_Expense_ACEClass, Spousal_Expense_AC.class, "Spousal_Expense_AC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(extraordinary_Expense_CEEClass, Extraordinary_Expense_CE.class, "Extraordinary_Expense_CE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtraordinary_Expense_CE_Thresholded_deduction_percentage(), ecorePackage.getEDouble(), "thresholded_deduction_percentage", null, 1, 1, Extraordinary_Expense_CE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtraordinary_Expense_CE_Ce_type(), this.getCE_Type(), "ce_type", null, 1, 1, Extraordinary_Expense_CE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(travel_Expense_FDEClass, Travel_Expense_FD.class, "Travel_Expense_FD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(professional_ExpenseEClass, Professional_Expense.class, "Professional_Expense", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(miscellaneous_Expense_FOEClass, Miscellaneous_Expense_FO.class, "Miscellaneous_Expense_FO", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(resourceEClass, Resource.class, "Resource", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResource_Contains(), this.getHousehold(), null, "contains", null, 0, -1, Resource.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(grantorEEnum, Grantor.class, "Grantor");
		addEEnumLiteral(grantorEEnum, Grantor.WWW);
		addEEnumLiteral(grantorEEnum, Grantor.EMPLOYER);
		addEEnumLiteral(grantorEEnum, Grantor.MMM);
		addEEnumLiteral(grantorEEnum, Grantor.UUU);
		addEEnumLiteral(grantorEEnum, Grantor.YYY);
		addEEnumLiteral(grantorEEnum, Grantor.OOO);

		initEEnum(disability_TypesEEnum, Disability_Types.class, "Disability_Types");
		addEEnumLiteral(disability_TypesEEnum, Disability_Types.BEUG);
		addEEnumLiteral(disability_TypesEEnum, Disability_Types.NONE);
		addEEnumLiteral(disability_TypesEEnum, Disability_Types.A);
		addEEnumLiteral(disability_TypesEEnum, Disability_Types.B);
		addEEnumLiteral(disability_TypesEEnum, Disability_Types.C);
		addEEnumLiteral(disability_TypesEEnum, Disability_Types.D);
		addEEnumLiteral(disability_TypesEEnum, Disability_Types.E);
		addEEnumLiteral(disability_TypesEEnum, Disability_Types.OTHER);

		initEEnum(countryEEnum, Country.class, "Country");
		addEEnumLiteral(countryEEnum, Country.ZZ);
		addEEnumLiteral(countryEEnum, Country.FF);
		addEEnumLiteral(countryEEnum, Country.BB);
		addEEnumLiteral(countryEEnum, Country.DD);
		addEEnumLiteral(countryEEnum, Country.NN);
		addEEnumLiteral(countryEEnum, Country.OTHER);

		initEEnum(tax_OfficeEEnum, Tax_Office.class, "Tax_Office");
		addEEnumLiteral(tax_OfficeEEnum, Tax_Office.RTS_2);
		addEEnumLiteral(tax_OfficeEEnum, Tax_Office.RTS_3);
		addEEnumLiteral(tax_OfficeEEnum, Tax_Office.RTS_4);
		addEEnumLiteral(tax_OfficeEEnum, Tax_Office.RTS_5);

		initEEnum(tax_Class_CategoryEEnum, Tax_Class_Category.class, "Tax_Class_Category");
		addEEnumLiteral(tax_Class_CategoryEEnum, Tax_Class_Category.ONE);
		addEEnumLiteral(tax_Class_CategoryEEnum, Tax_Class_Category.ONE_A);
		addEEnumLiteral(tax_Class_CategoryEEnum, Tax_Class_Category.TWO);

		initEEnum(job_ActivityEEnum, Job_Activity.class, "Job_Activity");
		addEEnumLiteral(job_ActivityEEnum, Job_Activity.SALARY);
		addEEnumLiteral(job_ActivityEEnum, Job_Activity.PENSION);
		addEEnumLiteral(job_ActivityEEnum, Job_Activity.ANNUITY);

		initEEnum(townEEnum, Town.class, "Town");
		addEEnumLiteral(townEEnum, Town.LL);
		addEEnumLiteral(townEEnum, Town.BB);
		addEEnumLiteral(townEEnum, Town.SS);
		addEEnumLiteral(townEEnum, Town.TT);
		addEEnumLiteral(townEEnum, Town.OTHER);

		initEEnum(cE_TypeEEnum, CE_Type.class, "CE_Type");
		addEEnumLiteral(cE_TypeEEnum, CE_Type.INALIDITY_AND_INFIRMITY);
		addEEnumLiteral(cE_TypeEEnum, CE_Type.DEPENDENCE_AND_CARE_EXCLUDING_CHLIDREN_NOT_PART_OF_HOUSEHOLD);
		addEEnumLiteral(cE_TypeEEnum, CE_Type.CARE_FOR_CHILDREN_NOT_BEING_PART_OF_HOUSEHOLD);

		initEEnum(expense_PurposeEEnum, Expense_Purpose.class, "Expense_Purpose");
		addEEnumLiteral(expense_PurposeEEnum, Expense_Purpose.HOUSE_CARE);
		addEEnumLiteral(expense_PurposeEEnum, Expense_Purpose.CHILD_CARE);
		addEEnumLiteral(expense_PurposeEEnum, Expense_Purpose.DEPENDENCE_CARE);
		addEEnumLiteral(expense_PurposeEEnum, Expense_Purpose.OTHER);
		addEEnumLiteral(expense_PurposeEEnum, Expense_Purpose.ALIMONY);
		addEEnumLiteral(expense_PurposeEEnum, Expense_Purpose.RECURRENT_DEPT);

		initEEnum(dependent_TypeEEnum, Dependent_Type.class, "Dependent_Type");
		addEEnumLiteral(dependent_TypeEEnum, Dependent_Type.CHILD);
		addEEnumLiteral(dependent_TypeEEnum, Dependent_Type.SPOUSE);
		addEEnumLiteral(dependent_TypeEEnum, Dependent_Type.RELATIVE);
		addEEnumLiteral(dependent_TypeEEnum, Dependent_Type.OTHER_FAMILY_MEMBER);
		addEEnumLiteral(dependent_TypeEEnum, Dependent_Type.NOT_OWN_CHILD);

		initEEnum(separation_CausesEEnum, Separation_Causes.class, "Separation_Causes");
		addEEnumLiteral(separation_CausesEEnum, Separation_Causes.NONE);
		addEEnumLiteral(separation_CausesEEnum, Separation_Causes.DIVORCE);
		addEEnumLiteral(separation_CausesEEnum, Separation_Causes.SEPARATION_DE_FAIT);
		addEEnumLiteral(separation_CausesEEnum, Separation_Causes.SEPARATION_BY_COURT);

		initEEnum(category_of_Permanent_ExpenseEEnum, Category_of_Permanent_Expense.class, "Category_of_Permanent_Expense");
		addEEnumLiteral(category_of_Permanent_ExpenseEEnum, Category_of_Permanent_Expense.MISCELLANEOUS_DEBT);
		addEEnumLiteral(category_of_Permanent_ExpenseEEnum, Category_of_Permanent_Expense.ALIMONY);

		initEEnum(category_of_Health_and_Pension_InsurancesEEnum, Category_of_Health_and_Pension_Insurances.class, "Category_of_Health_and_Pension_Insurances");
		addEEnumLiteral(category_of_Health_and_Pension_InsurancesEEnum, Category_of_Health_and_Pension_Insurances.MANDATORY_HEALTH_AND_PENSION_INSURANCE);
		addEEnumLiteral(category_of_Health_and_Pension_InsurancesEEnum, Category_of_Health_and_Pension_Insurances.ADDITIONAL_EMPLOYERS_PENSION_INSURANCE);
		addEEnumLiteral(category_of_Health_and_Pension_InsurancesEEnum, Category_of_Health_and_Pension_Insurances.CONTINUED_HEALTH_AND_PENSION_INSURANCE);

		initEEnum(category_of_Private_Insurance_and_PlanEEnum, Category_of_Private_Insurance_and_Plan.class, "Category_of_Private_Insurance_and_Plan");
		addEEnumLiteral(category_of_Private_Insurance_and_PlanEEnum, Category_of_Private_Insurance_and_Plan.PRIVATE_INSURANCE);
		addEEnumLiteral(category_of_Private_Insurance_and_PlanEEnum, Category_of_Private_Insurance_and_Plan.PRIVATE_LIFE_INSURANCE);
		addEEnumLiteral(category_of_Private_Insurance_and_PlanEEnum, Category_of_Private_Insurance_and_Plan.COMPANY_MEMBERS_PRIVATE_INSURANCE);
		addEEnumLiteral(category_of_Private_Insurance_and_PlanEEnum, Category_of_Private_Insurance_and_Plan.HOUSING_SAVING_PLAN);
		addEEnumLiteral(category_of_Private_Insurance_and_PlanEEnum, Category_of_Private_Insurance_and_Plan.OLD_AGE_PENSION_PLAN);

		initEEnum(legal_Union_TypesEEnum, Legal_Union_Types.class, "Legal_Union_Types");
		addEEnumLiteral(legal_Union_TypesEEnum, Legal_Union_Types.MARIAGE);
		addEEnumLiteral(legal_Union_TypesEEnum, Legal_Union_Types.PARTNERSHIP);
		addEEnumLiteral(legal_Union_TypesEEnum, Legal_Union_Types.OTHER);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// duplicates
		createDuplicatesAnnotations();
		// http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName
		createEmofAnnotations();
		// http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
		createPivotAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "ecore", "http://www.eclipse.org/emf/2002/Ecore"
		   });
	}

	/**
	 * Initializes the annotations for <b>duplicates</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDuplicatesAnnotations() {
		String source = "duplicates";
		addAnnotation
		  (tax_PayerEClass,
		   source,
		   new String[] {
		   });
	}

	/**
	 * Initializes the annotations for <b>http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEmofAnnotations() {
		String source = "http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName";
		addAnnotation
		  (getLegal_Union_Record_Individual_A(),
		   source,
		   new String[] {
			   "body", "legal_union_A"
		   });
		addAnnotation
		  (getLegal_Union_Record_Individual_B(),
		   source,
		   new String[] {
			   "body", "legal_union_B"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createPivotAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";
		addAnnotation
		  (getIncome_Income_amount(),
		   source,
		   new String[] {
			   "derivation", "let non_null_amounts:OrderedSet(Income_Detail)=self.details->select(det:Income_Detail|det.amount>0)->asOrderedSet() in\nnon_null_amounts->collect(amount)->min()"
		   });
	}

} //TaxationWithRootPackageImpl
