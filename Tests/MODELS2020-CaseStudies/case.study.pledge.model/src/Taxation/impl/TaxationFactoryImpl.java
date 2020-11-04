/**
 */
package Taxation.impl;

import Taxation.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TaxationFactoryImpl extends EFactoryImpl implements TaxationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TaxationFactory init() {
		try {
			TaxationFactory theTaxationFactory = (TaxationFactory)EPackage.Registry.INSTANCE.getEFactory(TaxationPackage.eNS_URI);
			if (theTaxationFactory != null) {
				return theTaxationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TaxationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaxationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case TaxationPackage.INCOME_TAX: return createIncome_Tax();
			case TaxationPackage.PHYSICAL_PERSON: return createPhysical_Person();
			case TaxationPackage.ADDRESS: return createAddress();
			case TaxationPackage.EXPENSE: return createExpense();
			case TaxationPackage.DEPENDENT: return createDependent();
			case TaxationPackage.EXTERNAL_ALLOWANCE: return createExternal_Allowance();
			case TaxationPackage.HOUSEHOLD: return createHousehold();
			case TaxationPackage.TAX_PROPERTY: return createTax_Property();
			case TaxationPackage.FROM_AGENT: return createFromAgent();
			case TaxationPackage.TAX_CARD: return createTax_Card();
			case TaxationPackage.INCOME_TAX_CREDIT: return createIncome_Tax_Credit();
			case TaxationPackage.INCOME_DETAIL: return createIncome_Detail();
			case TaxationPackage.FROM_LAW: return createFromLaw();
			case TaxationPackage.FISCAL_ADDRESS: return createFiscal_Address();
			case TaxationPackage.HABITUAL_ADDRESS: return createHabitual_Address();
			case TaxationPackage.MARRIAGE_RECORD: return createMarriage_Record();
			case TaxationPackage.NON_RESIDENT_TAX_PAYER: return createNon_Resident_Tax_Payer();
			case TaxationPackage.PARTNERSHIP_RECORD: return createPartnership_Record();
			case TaxationPackage.RESIDENT_TAX_PAYER: return createResident_Tax_Payer();
			case TaxationPackage.TRADE_AND_BUSINESS_INCOME: return createTrade_and_Business_Income();
			case TaxationPackage.AGRICULTURE_AND_FORESTRY_INCOME: return createAgriculture_and_Forestry_Income();
			case TaxationPackage.PENSIONS_AND_ANNUITIES_INCOME: return createPensions_and_Annuities_Income();
			case TaxationPackage.CAPITAL_AND_INVESTMENTS_INCOME: return createCapital_and_Investments_Income();
			case TaxationPackage.EMPLOYMENT_INCOME: return createEmployment_Income();
			case TaxationPackage.RENTALS_AND_LEASES_INCOME: return createRentals_and_Leases_Income();
			case TaxationPackage.FOREIGN_INCOME: return createForeign_Income();
			case TaxationPackage.LOCAL_INCOME: return createLocal_Income();
			case TaxationPackage.CIM: return createCIM();
			case TaxationPackage.CIP: return createCIP();
			case TaxationPackage.CIS: return createCIS();
			case TaxationPackage.FD: return createFD();
			case TaxationPackage.PROFESSIONAL_EXPENSES_DEDUCTION: return createProfessional_Expenses_Deduction();
			case TaxationPackage.FO: return createFO();
			case TaxationPackage.DS_FOR_PERMANENT_EXPENSE: return createDS_for_Permanent_Expense();
			case TaxationPackage.DS: return createDS();
			case TaxationPackage.DS_FOR_INTEREST_EXPENSE: return createDS_for_Interest_Expense();
			case TaxationPackage.DS_FOR_HEALTH_AND_PENSION_INSURANCE: return createDS_for_Health_and_Pension_Insurance();
			case TaxationPackage.DS_FOR_PRIVATE_INSURANCE_AND_PLAN: return createDS_for_Private_Insurance_and_Plan();
			case TaxationPackage.DS_FOR_LOSS_CARRYFORWARD: return createDS_for_Loss_Carryforward();
			case TaxationPackage.DS_FOR_DONATION: return createDS_for_Donation();
			case TaxationPackage.PERMANENT_EXPENSE: return createPermanent_Expense();
			case TaxationPackage.SPECIAL_EXPENSE_DS: return createSpecial_Expense_DS();
			case TaxationPackage.INTEREST_EXPENSE: return createInterest_Expense();
			case TaxationPackage.PRIVATE_INSURANCE_AND_PLAN: return createPrivate_Insurance_and_Plan();
			case TaxationPackage.HEALTH_AND_PENSION_INSURANCE: return createHealth_and_Pension_Insurance();
			case TaxationPackage.DONATION: return createDonation();
			case TaxationPackage.LOSS_CARRYFORWARD: return createLoss_Carryforward();
			case TaxationPackage.SPOUSAL_EXPENSE_AC: return createSpousal_Expense_AC();
			case TaxationPackage.EXTRAORDINARY_EXPENSE_CE: return createExtraordinary_Expense_CE();
			case TaxationPackage.TRAVEL_EXPENSE_FD: return createTravel_Expense_FD();
			case TaxationPackage.PROFESSIONAL_EXPENSE: return createProfessional_Expense();
			case TaxationPackage.MISCELLANEOUS_EXPENSE_FO: return createMiscellaneous_Expense_FO();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case TaxationPackage.GRANTOR:
				return createGrantorFromString(eDataType, initialValue);
			case TaxationPackage.DISABILITY_TYPES:
				return createDisability_TypesFromString(eDataType, initialValue);
			case TaxationPackage.COUNTRY:
				return createCountryFromString(eDataType, initialValue);
			case TaxationPackage.TAX_OFFICE:
				return createTax_OfficeFromString(eDataType, initialValue);
			case TaxationPackage.TAX_CLASS_CATEGORY:
				return createTax_Class_CategoryFromString(eDataType, initialValue);
			case TaxationPackage.JOB_ACTIVITY:
				return createJob_ActivityFromString(eDataType, initialValue);
			case TaxationPackage.TOWN:
				return createTownFromString(eDataType, initialValue);
			case TaxationPackage.CE_TYPE:
				return createCE_TypeFromString(eDataType, initialValue);
			case TaxationPackage.EXPENSE_PURPOSE:
				return createExpense_PurposeFromString(eDataType, initialValue);
			case TaxationPackage.DEPENDENT_TYPE:
				return createDependent_TypeFromString(eDataType, initialValue);
			case TaxationPackage.SEPARATION_CAUSES:
				return createSeparation_CausesFromString(eDataType, initialValue);
			case TaxationPackage.CATEGORY_OF_PERMANENT_EXPENSE:
				return createCategory_of_Permanent_ExpenseFromString(eDataType, initialValue);
			case TaxationPackage.CATEGORY_OF_HEALTH_AND_PENSION_INSURANCES:
				return createCategory_of_Health_and_Pension_InsurancesFromString(eDataType, initialValue);
			case TaxationPackage.CATEGORY_OF_PRIVATE_INSURANCE_AND_PLAN:
				return createCategory_of_Private_Insurance_and_PlanFromString(eDataType, initialValue);
			case TaxationPackage.LEGAL_UNION_TYPES:
				return createLegal_Union_TypesFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case TaxationPackage.GRANTOR:
				return convertGrantorToString(eDataType, instanceValue);
			case TaxationPackage.DISABILITY_TYPES:
				return convertDisability_TypesToString(eDataType, instanceValue);
			case TaxationPackage.COUNTRY:
				return convertCountryToString(eDataType, instanceValue);
			case TaxationPackage.TAX_OFFICE:
				return convertTax_OfficeToString(eDataType, instanceValue);
			case TaxationPackage.TAX_CLASS_CATEGORY:
				return convertTax_Class_CategoryToString(eDataType, instanceValue);
			case TaxationPackage.JOB_ACTIVITY:
				return convertJob_ActivityToString(eDataType, instanceValue);
			case TaxationPackage.TOWN:
				return convertTownToString(eDataType, instanceValue);
			case TaxationPackage.CE_TYPE:
				return convertCE_TypeToString(eDataType, instanceValue);
			case TaxationPackage.EXPENSE_PURPOSE:
				return convertExpense_PurposeToString(eDataType, instanceValue);
			case TaxationPackage.DEPENDENT_TYPE:
				return convertDependent_TypeToString(eDataType, instanceValue);
			case TaxationPackage.SEPARATION_CAUSES:
				return convertSeparation_CausesToString(eDataType, instanceValue);
			case TaxationPackage.CATEGORY_OF_PERMANENT_EXPENSE:
				return convertCategory_of_Permanent_ExpenseToString(eDataType, instanceValue);
			case TaxationPackage.CATEGORY_OF_HEALTH_AND_PENSION_INSURANCES:
				return convertCategory_of_Health_and_Pension_InsurancesToString(eDataType, instanceValue);
			case TaxationPackage.CATEGORY_OF_PRIVATE_INSURANCE_AND_PLAN:
				return convertCategory_of_Private_Insurance_and_PlanToString(eDataType, instanceValue);
			case TaxationPackage.LEGAL_UNION_TYPES:
				return convertLegal_Union_TypesToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Income_Tax createIncome_Tax() {
		Income_TaxImpl income_Tax = new Income_TaxImpl();
		return income_Tax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Physical_Person createPhysical_Person() {
		Physical_PersonImpl physical_Person = new Physical_PersonImpl();
		return physical_Person;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Address createAddress() {
		AddressImpl address = new AddressImpl();
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expense createExpense() {
		ExpenseImpl expense = new ExpenseImpl();
		return expense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Dependent createDependent() {
		DependentImpl dependent = new DependentImpl();
		return dependent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public External_Allowance createExternal_Allowance() {
		External_AllowanceImpl external_Allowance = new External_AllowanceImpl();
		return external_Allowance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Household createHousehold() {
		HouseholdImpl household = new HouseholdImpl();
		return household;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tax_Property createTax_Property() {
		Tax_PropertyImpl tax_Property = new Tax_PropertyImpl();
		return tax_Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FromAgent createFromAgent() {
		FromAgentImpl fromAgent = new FromAgentImpl();
		return fromAgent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tax_Card createTax_Card() {
		Tax_CardImpl tax_Card = new Tax_CardImpl();
		return tax_Card;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Income_Tax_Credit createIncome_Tax_Credit() {
		Income_Tax_CreditImpl income_Tax_Credit = new Income_Tax_CreditImpl();
		return income_Tax_Credit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Income_Detail createIncome_Detail() {
		Income_DetailImpl income_Detail = new Income_DetailImpl();
		return income_Detail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FromLaw createFromLaw() {
		FromLawImpl fromLaw = new FromLawImpl();
		return fromLaw;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Fiscal_Address createFiscal_Address() {
		Fiscal_AddressImpl fiscal_Address = new Fiscal_AddressImpl();
		return fiscal_Address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Habitual_Address createHabitual_Address() {
		Habitual_AddressImpl habitual_Address = new Habitual_AddressImpl();
		return habitual_Address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Marriage_Record createMarriage_Record() {
		Marriage_RecordImpl marriage_Record = new Marriage_RecordImpl();
		return marriage_Record;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Non_Resident_Tax_Payer createNon_Resident_Tax_Payer() {
		Non_Resident_Tax_PayerImpl non_Resident_Tax_Payer = new Non_Resident_Tax_PayerImpl();
		return non_Resident_Tax_Payer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Partnership_Record createPartnership_Record() {
		Partnership_RecordImpl partnership_Record = new Partnership_RecordImpl();
		return partnership_Record;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Resident_Tax_Payer createResident_Tax_Payer() {
		Resident_Tax_PayerImpl resident_Tax_Payer = new Resident_Tax_PayerImpl();
		return resident_Tax_Payer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Trade_and_Business_Income createTrade_and_Business_Income() {
		Trade_and_Business_IncomeImpl trade_and_Business_Income = new Trade_and_Business_IncomeImpl();
		return trade_and_Business_Income;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Agriculture_and_Forestry_Income createAgriculture_and_Forestry_Income() {
		Agriculture_and_Forestry_IncomeImpl agriculture_and_Forestry_Income = new Agriculture_and_Forestry_IncomeImpl();
		return agriculture_and_Forestry_Income;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Pensions_and_Annuities_Income createPensions_and_Annuities_Income() {
		Pensions_and_Annuities_IncomeImpl pensions_and_Annuities_Income = new Pensions_and_Annuities_IncomeImpl();
		return pensions_and_Annuities_Income;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Capital_and_Investments_Income createCapital_and_Investments_Income() {
		Capital_and_Investments_IncomeImpl capital_and_Investments_Income = new Capital_and_Investments_IncomeImpl();
		return capital_and_Investments_Income;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Employment_Income createEmployment_Income() {
		Employment_IncomeImpl employment_Income = new Employment_IncomeImpl();
		return employment_Income;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Rentals_and_Leases_Income createRentals_and_Leases_Income() {
		Rentals_and_Leases_IncomeImpl rentals_and_Leases_Income = new Rentals_and_Leases_IncomeImpl();
		return rentals_and_Leases_Income;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Foreign_Income createForeign_Income() {
		Foreign_IncomeImpl foreign_Income = new Foreign_IncomeImpl();
		return foreign_Income;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Local_Income createLocal_Income() {
		Local_IncomeImpl local_Income = new Local_IncomeImpl();
		return local_Income;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIM createCIM() {
		CIMImpl cim = new CIMImpl();
		return cim;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIP createCIP() {
		CIPImpl cip = new CIPImpl();
		return cip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CIS createCIS() {
		CISImpl cis = new CISImpl();
		return cis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FD createFD() {
		FDImpl fd = new FDImpl();
		return fd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Professional_Expenses_Deduction createProfessional_Expenses_Deduction() {
		Professional_Expenses_DeductionImpl professional_Expenses_Deduction = new Professional_Expenses_DeductionImpl();
		return professional_Expenses_Deduction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FO createFO() {
		FOImpl fo = new FOImpl();
		return fo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DS_for_Permanent_Expense createDS_for_Permanent_Expense() {
		DS_for_Permanent_ExpenseImpl dS_for_Permanent_Expense = new DS_for_Permanent_ExpenseImpl();
		return dS_for_Permanent_Expense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DS createDS() {
		DSImpl ds = new DSImpl();
		return ds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DS_for_Interest_Expense createDS_for_Interest_Expense() {
		DS_for_Interest_ExpenseImpl dS_for_Interest_Expense = new DS_for_Interest_ExpenseImpl();
		return dS_for_Interest_Expense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DS_for_Health_and_Pension_Insurance createDS_for_Health_and_Pension_Insurance() {
		DS_for_Health_and_Pension_InsuranceImpl dS_for_Health_and_Pension_Insurance = new DS_for_Health_and_Pension_InsuranceImpl();
		return dS_for_Health_and_Pension_Insurance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DS_for_Private_Insurance_and_Plan createDS_for_Private_Insurance_and_Plan() {
		DS_for_Private_Insurance_and_PlanImpl dS_for_Private_Insurance_and_Plan = new DS_for_Private_Insurance_and_PlanImpl();
		return dS_for_Private_Insurance_and_Plan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DS_for_Loss_Carryforward createDS_for_Loss_Carryforward() {
		DS_for_Loss_CarryforwardImpl dS_for_Loss_Carryforward = new DS_for_Loss_CarryforwardImpl();
		return dS_for_Loss_Carryforward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DS_for_Donation createDS_for_Donation() {
		DS_for_DonationImpl dS_for_Donation = new DS_for_DonationImpl();
		return dS_for_Donation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Permanent_Expense createPermanent_Expense() {
		Permanent_ExpenseImpl permanent_Expense = new Permanent_ExpenseImpl();
		return permanent_Expense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Special_Expense_DS createSpecial_Expense_DS() {
		Special_Expense_DSImpl special_Expense_DS = new Special_Expense_DSImpl();
		return special_Expense_DS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Interest_Expense createInterest_Expense() {
		Interest_ExpenseImpl interest_Expense = new Interest_ExpenseImpl();
		return interest_Expense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Private_Insurance_and_Plan createPrivate_Insurance_and_Plan() {
		Private_Insurance_and_PlanImpl private_Insurance_and_Plan = new Private_Insurance_and_PlanImpl();
		return private_Insurance_and_Plan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Health_and_Pension_Insurance createHealth_and_Pension_Insurance() {
		Health_and_Pension_InsuranceImpl health_and_Pension_Insurance = new Health_and_Pension_InsuranceImpl();
		return health_and_Pension_Insurance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Donation createDonation() {
		DonationImpl donation = new DonationImpl();
		return donation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Loss_Carryforward createLoss_Carryforward() {
		Loss_CarryforwardImpl loss_Carryforward = new Loss_CarryforwardImpl();
		return loss_Carryforward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Spousal_Expense_AC createSpousal_Expense_AC() {
		Spousal_Expense_ACImpl spousal_Expense_AC = new Spousal_Expense_ACImpl();
		return spousal_Expense_AC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Extraordinary_Expense_CE createExtraordinary_Expense_CE() {
		Extraordinary_Expense_CEImpl extraordinary_Expense_CE = new Extraordinary_Expense_CEImpl();
		return extraordinary_Expense_CE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Travel_Expense_FD createTravel_Expense_FD() {
		Travel_Expense_FDImpl travel_Expense_FD = new Travel_Expense_FDImpl();
		return travel_Expense_FD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Professional_Expense createProfessional_Expense() {
		Professional_ExpenseImpl professional_Expense = new Professional_ExpenseImpl();
		return professional_Expense;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Miscellaneous_Expense_FO createMiscellaneous_Expense_FO() {
		Miscellaneous_Expense_FOImpl miscellaneous_Expense_FO = new Miscellaneous_Expense_FOImpl();
		return miscellaneous_Expense_FO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grantor createGrantorFromString(EDataType eDataType, String initialValue) {
		Grantor result = Grantor.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGrantorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Disability_Types createDisability_TypesFromString(EDataType eDataType, String initialValue) {
		Disability_Types result = Disability_Types.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDisability_TypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Country createCountryFromString(EDataType eDataType, String initialValue) {
		Country result = Country.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCountryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tax_Office createTax_OfficeFromString(EDataType eDataType, String initialValue) {
		Tax_Office result = Tax_Office.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTax_OfficeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tax_Class_Category createTax_Class_CategoryFromString(EDataType eDataType, String initialValue) {
		Tax_Class_Category result = Tax_Class_Category.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTax_Class_CategoryToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Job_Activity createJob_ActivityFromString(EDataType eDataType, String initialValue) {
		Job_Activity result = Job_Activity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJob_ActivityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Town createTownFromString(EDataType eDataType, String initialValue) {
		Town result = Town.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTownToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CE_Type createCE_TypeFromString(EDataType eDataType, String initialValue) {
		CE_Type result = CE_Type.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCE_TypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expense_Purpose createExpense_PurposeFromString(EDataType eDataType, String initialValue) {
		Expense_Purpose result = Expense_Purpose.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExpense_PurposeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependent_Type createDependent_TypeFromString(EDataType eDataType, String initialValue) {
		Dependent_Type result = Dependent_Type.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDependent_TypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Separation_Causes createSeparation_CausesFromString(EDataType eDataType, String initialValue) {
		Separation_Causes result = Separation_Causes.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSeparation_CausesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category_of_Permanent_Expense createCategory_of_Permanent_ExpenseFromString(EDataType eDataType, String initialValue) {
		Category_of_Permanent_Expense result = Category_of_Permanent_Expense.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCategory_of_Permanent_ExpenseToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category_of_Health_and_Pension_Insurances createCategory_of_Health_and_Pension_InsurancesFromString(EDataType eDataType, String initialValue) {
		Category_of_Health_and_Pension_Insurances result = Category_of_Health_and_Pension_Insurances.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCategory_of_Health_and_Pension_InsurancesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category_of_Private_Insurance_and_Plan createCategory_of_Private_Insurance_and_PlanFromString(EDataType eDataType, String initialValue) {
		Category_of_Private_Insurance_and_Plan result = Category_of_Private_Insurance_and_Plan.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCategory_of_Private_Insurance_and_PlanToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Legal_Union_Types createLegal_Union_TypesFromString(EDataType eDataType, String initialValue) {
		Legal_Union_Types result = Legal_Union_Types.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLegal_Union_TypesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TaxationPackage getTaxationPackage() {
		return (TaxationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TaxationPackage getPackage() {
		return TaxationPackage.eINSTANCE;
	}

} //TaxationFactoryImpl
