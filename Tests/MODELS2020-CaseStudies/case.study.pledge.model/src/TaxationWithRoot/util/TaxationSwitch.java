/**
 */
package TaxationWithRoot.util;

import TaxationWithRoot.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see TaxationWithRoot.TaxationPackage
 * @generated
 */
public class TaxationSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TaxationPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaxationSwitch() {
		if (modelPackage == null) {
			modelPackage = TaxationPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TaxationPackage.CONSTANTS: {
				Constants constants = (Constants)theEObject;
				T result = caseConstants(constants);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaxationPackage.INCOME_TAX: {
				Income_Tax income_Tax = (Income_Tax)theEObject;
				T result = caseIncome_Tax(income_Tax);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaxationPackage.TAX_PAYER: {
				Tax_Payer tax_Payer = (Tax_Payer)theEObject;
				T result = caseTax_Payer(tax_Payer);
				if (result == null) result = casePhysical_Person(tax_Payer);
				if (result == null) result = caseTax_Case(tax_Payer);
				if (result == null) result = caseRoot(tax_Payer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaxationPackage.PHYSICAL_PERSON: {
				Physical_Person physical_Person = (Physical_Person)theEObject;
				T result = casePhysical_Person(physical_Person);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaxationPackage.ADDRESS: {
				Address address = (Address)theEObject;
				T result = caseAddress(address);
				if (result == null) result = caseRoot(address);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaxationPackage.EXPENSE: {
				Expense expense = (Expense)theEObject;
				T result = caseExpense(expense);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaxationPackage.DEPENDENT: {
				Dependent dependent = (Dependent)theEObject;
				T result = caseDependent(dependent);
				if (result == null) result = casePhysical_Person(dependent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaxationPackage.EXTERNAL_ALLOWANCE: {
				External_Allowance external_Allowance = (External_Allowance)theEObject;
				T result = caseExternal_Allowance(external_Allowance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaxationPackage.HOUSEHOLD: {
				Household household = (Household)theEObject;
				T result = caseHousehold(household);
				if (result == null) result = caseTax_Case(household);
				if (result == null) result = caseRoot(household);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaxationPackage.LEGAL_UNION_RECORD: {
				Legal_Union_Record legal_Union_Record = (Legal_Union_Record)theEObject;
				T result = caseLegal_Union_Record(legal_Union_Record);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaxationPackage.TAX_PROPERTY: {
				Tax_Property tax_Property = (Tax_Property)theEObject;
				T result = caseTax_Property(tax_Property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaxationPackage.TAX_CASE: {
				Tax_Case tax_Case = (Tax_Case)theEObject;
				T result = caseTax_Case(tax_Case);
				if (result == null) result = caseRoot(tax_Case);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaxationPackage.FROM_AGENT: {
				FromAgent fromAgent = (FromAgent)theEObject;
				T result = caseFromAgent(fromAgent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaxationPackage.INCOME: {
				Income income = (Income)theEObject;
				T result = caseIncome(income);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaxationPackage.INCOME_TYPE: {
				Income_Type income_Type = (Income_Type)theEObject;
				T result = caseIncome_Type(income_Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaxationPackage.TAX_CARD: {
				Tax_Card tax_Card = (Tax_Card)theEObject;
				T result = caseTax_Card(tax_Card);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaxationPackage.INCOME_TAX_CREDIT: {
				Income_Tax_Credit income_Tax_Credit = (Income_Tax_Credit)theEObject;
				T result = caseIncome_Tax_Credit(income_Tax_Credit);
				if (result == null) result = caseRoot(income_Tax_Credit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaxationPackage.INCOME_DETAIL: {
				Income_Detail income_Detail = (Income_Detail)theEObject;
				T result = caseIncome_Detail(income_Detail);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaxationPackage.FROM_LAW: {
				FromLaw fromLaw = (FromLaw)theEObject;
				T result = caseFromLaw(fromLaw);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaxationPackage.FISCAL_ADDRESS: {
				Fiscal_Address fiscal_Address = (Fiscal_Address)theEObject;
				T result = caseFiscal_Address(fiscal_Address);
				if (result == null) result = caseAddress(fiscal_Address);
				if (result == null) result = caseRoot(fiscal_Address);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaxationPackage.HABITUAL_ADDRESS: {
				Habitual_Address habitual_Address = (Habitual_Address)theEObject;
				T result = caseHabitual_Address(habitual_Address);
				if (result == null) result = caseAddress(habitual_Address);
				if (result == null) result = caseRoot(habitual_Address);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaxationPackage.MARRIAGE_RECORD: {
				Marriage_Record marriage_Record = (Marriage_Record)theEObject;
				T result = caseMarriage_Record(marriage_Record);
				if (result == null) result = caseLegal_Union_Record(marriage_Record);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaxationPackage.NON_RESIDENT_TAX_PAYER: {
				Non_Resident_Tax_Payer non_Resident_Tax_Payer = (Non_Resident_Tax_Payer)theEObject;
				T result = caseNon_Resident_Tax_Payer(non_Resident_Tax_Payer);
				if (result == null) result = caseTax_Payer(non_Resident_Tax_Payer);
				if (result == null) result = casePhysical_Person(non_Resident_Tax_Payer);
				if (result == null) result = caseTax_Case(non_Resident_Tax_Payer);
				if (result == null) result = caseRoot(non_Resident_Tax_Payer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaxationPackage.PARTNERSHIP_RECORD: {
				Partnership_Record partnership_Record = (Partnership_Record)theEObject;
				T result = casePartnership_Record(partnership_Record);
				if (result == null) result = caseLegal_Union_Record(partnership_Record);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaxationPackage.RESIDENT_TAX_PAYER: {
				Resident_Tax_Payer resident_Tax_Payer = (Resident_Tax_Payer)theEObject;
				T result = caseResident_Tax_Payer(resident_Tax_Payer);
				if (result == null) result = caseTax_Payer(resident_Tax_Payer);
				if (result == null) result = casePhysical_Person(resident_Tax_Payer);
				if (result == null) result = caseTax_Case(resident_Tax_Payer);
				if (result == null) result = caseRoot(resident_Tax_Payer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaxationPackage.TRADE_AND_BUSINESS_INCOME: {
				Trade_and_Business_Income trade_and_Business_Income = (Trade_and_Business_Income)theEObject;
				T result = caseTrade_and_Business_Income(trade_and_Business_Income);
				if (result == null) result = caseIncome_Type(trade_and_Business_Income);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaxationPackage.AGRICULTURE_AND_FORESTRY_INCOME: {
				Agriculture_and_Forestry_Income agriculture_and_Forestry_Income = (Agriculture_and_Forestry_Income)theEObject;
				T result = caseAgriculture_and_Forestry_Income(agriculture_and_Forestry_Income);
				if (result == null) result = caseIncome_Type(agriculture_and_Forestry_Income);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaxationPackage.PENSIONS_AND_ANNUITIES_INCOME: {
				Pensions_and_Annuities_Income pensions_and_Annuities_Income = (Pensions_and_Annuities_Income)theEObject;
				T result = casePensions_and_Annuities_Income(pensions_and_Annuities_Income);
				if (result == null) result = caseIncome_Type(pensions_and_Annuities_Income);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaxationPackage.CAPITAL_AND_INVESTMENTS_INCOME: {
				Capital_and_Investments_Income capital_and_Investments_Income = (Capital_and_Investments_Income)theEObject;
				T result = caseCapital_and_Investments_Income(capital_and_Investments_Income);
				if (result == null) result = caseIncome_Type(capital_and_Investments_Income);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaxationPackage.EMPLOYMENT_INCOME: {
				Employment_Income employment_Income = (Employment_Income)theEObject;
				T result = caseEmployment_Income(employment_Income);
				if (result == null) result = caseIncome_Type(employment_Income);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaxationPackage.RENTALS_AND_LEASES_INCOME: {
				Rentals_and_Leases_Income rentals_and_Leases_Income = (Rentals_and_Leases_Income)theEObject;
				T result = caseRentals_and_Leases_Income(rentals_and_Leases_Income);
				if (result == null) result = caseIncome_Type(rentals_and_Leases_Income);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaxationPackage.FOREIGN_INCOME: {
				Foreign_Income foreign_Income = (Foreign_Income)theEObject;
				T result = caseForeign_Income(foreign_Income);
				if (result == null) result = caseIncome(foreign_Income);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaxationPackage.LOCAL_INCOME: {
				Local_Income local_Income = (Local_Income)theEObject;
				T result = caseLocal_Income(local_Income);
				if (result == null) result = caseIncome(local_Income);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaxationPackage.CIM: {
				CIM cim = (CIM)theEObject;
				T result = caseCIM(cim);
				if (result == null) result = caseIncome_Tax_Credit(cim);
				if (result == null) result = caseRoot(cim);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaxationPackage.CIP: {
				CIP cip = (CIP)theEObject;
				T result = caseCIP(cip);
				if (result == null) result = caseIncome_Tax_Credit(cip);
				if (result == null) result = caseRoot(cip);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaxationPackage.CIS: {
				CIS cis = (CIS)theEObject;
				T result = caseCIS(cis);
				if (result == null) result = caseIncome_Tax_Credit(cis);
				if (result == null) result = caseRoot(cis);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaxationPackage.FD: {
				FD fd = (FD)theEObject;
				T result = caseFD(fd);
				if (result == null) result = caseProfessional_Expenses_Deduction(fd);
				if (result == null) result = caseRoot(fd);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaxationPackage.PROFESSIONAL_EXPENSES_DEDUCTION: {
				Professional_Expenses_Deduction professional_Expenses_Deduction = (Professional_Expenses_Deduction)theEObject;
				T result = caseProfessional_Expenses_Deduction(professional_Expenses_Deduction);
				if (result == null) result = caseRoot(professional_Expenses_Deduction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaxationPackage.FO: {
				FO fo = (FO)theEObject;
				T result = caseFO(fo);
				if (result == null) result = caseProfessional_Expenses_Deduction(fo);
				if (result == null) result = caseRoot(fo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaxationPackage.DS_FOR_PERMANENT_EXPENSE: {
				DS_for_Permanent_Expense dS_for_Permanent_Expense = (DS_for_Permanent_Expense)theEObject;
				T result = caseDS_for_Permanent_Expense(dS_for_Permanent_Expense);
				if (result == null) result = caseDS(dS_for_Permanent_Expense);
				if (result == null) result = caseRoot(dS_for_Permanent_Expense);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaxationPackage.DS: {
				DS ds = (DS)theEObject;
				T result = caseDS(ds);
				if (result == null) result = caseRoot(ds);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaxationPackage.DS_FOR_INTEREST_EXPENSE: {
				DS_for_Interest_Expense dS_for_Interest_Expense = (DS_for_Interest_Expense)theEObject;
				T result = caseDS_for_Interest_Expense(dS_for_Interest_Expense);
				if (result == null) result = caseDS(dS_for_Interest_Expense);
				if (result == null) result = caseRoot(dS_for_Interest_Expense);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaxationPackage.DS_FOR_HEALTH_AND_PENSION_INSURANCE: {
				DS_for_Health_and_Pension_Insurance dS_for_Health_and_Pension_Insurance = (DS_for_Health_and_Pension_Insurance)theEObject;
				T result = caseDS_for_Health_and_Pension_Insurance(dS_for_Health_and_Pension_Insurance);
				if (result == null) result = caseDS(dS_for_Health_and_Pension_Insurance);
				if (result == null) result = caseRoot(dS_for_Health_and_Pension_Insurance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaxationPackage.DS_FOR_PRIVATE_INSURANCE_AND_PLAN: {
				DS_for_Private_Insurance_and_Plan dS_for_Private_Insurance_and_Plan = (DS_for_Private_Insurance_and_Plan)theEObject;
				T result = caseDS_for_Private_Insurance_and_Plan(dS_for_Private_Insurance_and_Plan);
				if (result == null) result = caseDS(dS_for_Private_Insurance_and_Plan);
				if (result == null) result = caseRoot(dS_for_Private_Insurance_and_Plan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaxationPackage.DS_FOR_LOSS_CARRYFORWARD: {
				DS_for_Loss_Carryforward dS_for_Loss_Carryforward = (DS_for_Loss_Carryforward)theEObject;
				T result = caseDS_for_Loss_Carryforward(dS_for_Loss_Carryforward);
				if (result == null) result = caseDS(dS_for_Loss_Carryforward);
				if (result == null) result = caseRoot(dS_for_Loss_Carryforward);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaxationPackage.DS_FOR_DONATION: {
				DS_for_Donation dS_for_Donation = (DS_for_Donation)theEObject;
				T result = caseDS_for_Donation(dS_for_Donation);
				if (result == null) result = caseDS(dS_for_Donation);
				if (result == null) result = caseRoot(dS_for_Donation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaxationPackage.PERMANENT_EXPENSE: {
				Permanent_Expense permanent_Expense = (Permanent_Expense)theEObject;
				T result = casePermanent_Expense(permanent_Expense);
				if (result == null) result = caseSpecial_Expense_DS(permanent_Expense);
				if (result == null) result = caseExpense(permanent_Expense);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaxationPackage.SPECIAL_EXPENSE_DS: {
				Special_Expense_DS special_Expense_DS = (Special_Expense_DS)theEObject;
				T result = caseSpecial_Expense_DS(special_Expense_DS);
				if (result == null) result = caseExpense(special_Expense_DS);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaxationPackage.INTEREST_EXPENSE: {
				Interest_Expense interest_Expense = (Interest_Expense)theEObject;
				T result = caseInterest_Expense(interest_Expense);
				if (result == null) result = caseSpecial_Expense_DS(interest_Expense);
				if (result == null) result = caseExpense(interest_Expense);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaxationPackage.PRIVATE_INSURANCE_AND_PLAN: {
				Private_Insurance_and_Plan private_Insurance_and_Plan = (Private_Insurance_and_Plan)theEObject;
				T result = casePrivate_Insurance_and_Plan(private_Insurance_and_Plan);
				if (result == null) result = caseSpecial_Expense_DS(private_Insurance_and_Plan);
				if (result == null) result = caseExpense(private_Insurance_and_Plan);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaxationPackage.HEALTH_AND_PENSION_INSURANCE: {
				Health_and_Pension_Insurance health_and_Pension_Insurance = (Health_and_Pension_Insurance)theEObject;
				T result = caseHealth_and_Pension_Insurance(health_and_Pension_Insurance);
				if (result == null) result = caseSpecial_Expense_DS(health_and_Pension_Insurance);
				if (result == null) result = caseExpense(health_and_Pension_Insurance);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaxationPackage.DONATION: {
				Donation donation = (Donation)theEObject;
				T result = caseDonation(donation);
				if (result == null) result = caseSpecial_Expense_DS(donation);
				if (result == null) result = caseExpense(donation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaxationPackage.LOSS_CARRYFORWARD: {
				Loss_Carryforward loss_Carryforward = (Loss_Carryforward)theEObject;
				T result = caseLoss_Carryforward(loss_Carryforward);
				if (result == null) result = caseSpecial_Expense_DS(loss_Carryforward);
				if (result == null) result = caseExpense(loss_Carryforward);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaxationPackage.SPOUSAL_EXPENSE_AC: {
				Spousal_Expense_AC spousal_Expense_AC = (Spousal_Expense_AC)theEObject;
				T result = caseSpousal_Expense_AC(spousal_Expense_AC);
				if (result == null) result = caseExpense(spousal_Expense_AC);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaxationPackage.EXTRAORDINARY_EXPENSE_CE: {
				Extraordinary_Expense_CE extraordinary_Expense_CE = (Extraordinary_Expense_CE)theEObject;
				T result = caseExtraordinary_Expense_CE(extraordinary_Expense_CE);
				if (result == null) result = caseExpense(extraordinary_Expense_CE);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaxationPackage.TRAVEL_EXPENSE_FD: {
				Travel_Expense_FD travel_Expense_FD = (Travel_Expense_FD)theEObject;
				T result = caseTravel_Expense_FD(travel_Expense_FD);
				if (result == null) result = caseProfessional_Expense(travel_Expense_FD);
				if (result == null) result = caseExpense(travel_Expense_FD);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaxationPackage.PROFESSIONAL_EXPENSE: {
				Professional_Expense professional_Expense = (Professional_Expense)theEObject;
				T result = caseProfessional_Expense(professional_Expense);
				if (result == null) result = caseExpense(professional_Expense);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaxationPackage.MISCELLANEOUS_EXPENSE_FO: {
				Miscellaneous_Expense_FO miscellaneous_Expense_FO = (Miscellaneous_Expense_FO)theEObject;
				T result = caseMiscellaneous_Expense_FO(miscellaneous_Expense_FO);
				if (result == null) result = caseProfessional_Expense(miscellaneous_Expense_FO);
				if (result == null) result = caseExpense(miscellaneous_Expense_FO);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaxationPackage.RESOURCE: {
				Resource resource = (Resource)theEObject;
				T result = caseResource(resource);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TaxationPackage.ROOT: {
				Root root = (Root)theEObject;
				T result = caseRoot(root);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constants</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constants</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstants(Constants object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Income Tax</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Income Tax</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncome_Tax(Income_Tax object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tax Payer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tax Payer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTax_Payer(Tax_Payer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Physical Person</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Physical Person</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhysical_Person(Physical_Person object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddress(Address object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expense</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expense</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpense(Expense object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dependent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dependent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDependent(Dependent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Allowance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Allowance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternal_Allowance(External_Allowance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Household</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Household</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHousehold(Household object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legal Union Record</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legal Union Record</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegal_Union_Record(Legal_Union_Record object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tax Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tax Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTax_Property(Tax_Property object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tax Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tax Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTax_Case(Tax_Case object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>From Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>From Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFromAgent(FromAgent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Income</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Income</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncome(Income object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Income Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Income Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncome_Type(Income_Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tax Card</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tax Card</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTax_Card(Tax_Card object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Income Tax Credit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Income Tax Credit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncome_Tax_Credit(Income_Tax_Credit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Income Detail</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Income Detail</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncome_Detail(Income_Detail object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>From Law</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>From Law</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFromLaw(FromLaw object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fiscal Address</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fiscal Address</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFiscal_Address(Fiscal_Address object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Habitual Address</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Habitual Address</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHabitual_Address(Habitual_Address object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Marriage Record</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Marriage Record</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMarriage_Record(Marriage_Record object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Non Resident Tax Payer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Non Resident Tax Payer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNon_Resident_Tax_Payer(Non_Resident_Tax_Payer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Partnership Record</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Partnership Record</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePartnership_Record(Partnership_Record object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resident Tax Payer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resident Tax Payer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResident_Tax_Payer(Resident_Tax_Payer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trade and Business Income</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trade and Business Income</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrade_and_Business_Income(Trade_and_Business_Income object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agriculture and Forestry Income</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agriculture and Forestry Income</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgriculture_and_Forestry_Income(Agriculture_and_Forestry_Income object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pensions and Annuities Income</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pensions and Annuities Income</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePensions_and_Annuities_Income(Pensions_and_Annuities_Income object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Capital and Investments Income</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Capital and Investments Income</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCapital_and_Investments_Income(Capital_and_Investments_Income object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Employment Income</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Employment Income</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmployment_Income(Employment_Income object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rentals and Leases Income</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rentals and Leases Income</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRentals_and_Leases_Income(Rentals_and_Leases_Income object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Foreign Income</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Foreign Income</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForeign_Income(Foreign_Income object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Income</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Income</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocal_Income(Local_Income object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CIM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CIM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCIM(CIM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CIP</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CIP</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCIP(CIP object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>CIS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>CIS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCIS(CIS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFD(FD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Professional Expenses Deduction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Professional Expenses Deduction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProfessional_Expenses_Deduction(Professional_Expenses_Deduction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFO(FO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DS for Permanent Expense</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DS for Permanent Expense</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDS_for_Permanent_Expense(DS_for_Permanent_Expense object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDS(DS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DS for Interest Expense</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DS for Interest Expense</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDS_for_Interest_Expense(DS_for_Interest_Expense object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DS for Health and Pension Insurance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DS for Health and Pension Insurance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDS_for_Health_and_Pension_Insurance(DS_for_Health_and_Pension_Insurance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DS for Private Insurance and Plan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DS for Private Insurance and Plan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDS_for_Private_Insurance_and_Plan(DS_for_Private_Insurance_and_Plan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DS for Loss Carryforward</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DS for Loss Carryforward</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDS_for_Loss_Carryforward(DS_for_Loss_Carryforward object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DS for Donation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DS for Donation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDS_for_Donation(DS_for_Donation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Permanent Expense</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Permanent Expense</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePermanent_Expense(Permanent_Expense object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Special Expense DS</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Special Expense DS</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpecial_Expense_DS(Special_Expense_DS object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interest Expense</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interest Expense</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterest_Expense(Interest_Expense object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Private Insurance and Plan</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Private Insurance and Plan</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrivate_Insurance_and_Plan(Private_Insurance_and_Plan object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Health and Pension Insurance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Health and Pension Insurance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHealth_and_Pension_Insurance(Health_and_Pension_Insurance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Donation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Donation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDonation(Donation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Loss Carryforward</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Loss Carryforward</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLoss_Carryforward(Loss_Carryforward object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Spousal Expense AC</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Spousal Expense AC</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSpousal_Expense_AC(Spousal_Expense_AC object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extraordinary Expense CE</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extraordinary Expense CE</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtraordinary_Expense_CE(Extraordinary_Expense_CE object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Travel Expense FD</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Travel Expense FD</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTravel_Expense_FD(Travel_Expense_FD object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Professional Expense</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Professional Expense</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProfessional_Expense(Professional_Expense object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Miscellaneous Expense FO</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Miscellaneous Expense FO</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMiscellaneous_Expense_FO(Miscellaneous_Expense_FO object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResource(Resource object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoot(Root object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //TaxationSwitch
