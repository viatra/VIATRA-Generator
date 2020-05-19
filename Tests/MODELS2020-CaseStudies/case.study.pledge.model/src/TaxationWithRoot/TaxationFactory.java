/**
 */
package TaxationWithRoot;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see TaxationWithRoot.TaxationPackage
 * @generated
 */
public interface TaxationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TaxationFactory eINSTANCE = TaxationWithRoot.impl.TaxationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Income Tax</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Income Tax</em>'.
	 * @generated
	 */
	Income_Tax createIncome_Tax();

	/**
	 * Returns a new object of class '<em>Physical Person</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Physical Person</em>'.
	 * @generated
	 */
	Physical_Person createPhysical_Person();

	/**
	 * Returns a new object of class '<em>Address</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Address</em>'.
	 * @generated
	 */
	Address createAddress();

	/**
	 * Returns a new object of class '<em>Expense</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Expense</em>'.
	 * @generated
	 */
	Expense createExpense();

	/**
	 * Returns a new object of class '<em>Dependent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dependent</em>'.
	 * @generated
	 */
	Dependent createDependent();

	/**
	 * Returns a new object of class '<em>External Allowance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Allowance</em>'.
	 * @generated
	 */
	External_Allowance createExternal_Allowance();

	/**
	 * Returns a new object of class '<em>Household</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Household</em>'.
	 * @generated
	 */
	Household createHousehold();

	/**
	 * Returns a new object of class '<em>Tax Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tax Property</em>'.
	 * @generated
	 */
	Tax_Property createTax_Property();

	/**
	 * Returns a new object of class '<em>From Agent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>From Agent</em>'.
	 * @generated
	 */
	FromAgent createFromAgent();

	/**
	 * Returns a new object of class '<em>Tax Card</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tax Card</em>'.
	 * @generated
	 */
	Tax_Card createTax_Card();

	/**
	 * Returns a new object of class '<em>Income Tax Credit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Income Tax Credit</em>'.
	 * @generated
	 */
	Income_Tax_Credit createIncome_Tax_Credit();

	/**
	 * Returns a new object of class '<em>Income Detail</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Income Detail</em>'.
	 * @generated
	 */
	Income_Detail createIncome_Detail();

	/**
	 * Returns a new object of class '<em>From Law</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>From Law</em>'.
	 * @generated
	 */
	FromLaw createFromLaw();

	/**
	 * Returns a new object of class '<em>Fiscal Address</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fiscal Address</em>'.
	 * @generated
	 */
	Fiscal_Address createFiscal_Address();

	/**
	 * Returns a new object of class '<em>Habitual Address</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Habitual Address</em>'.
	 * @generated
	 */
	Habitual_Address createHabitual_Address();

	/**
	 * Returns a new object of class '<em>Marriage Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Marriage Record</em>'.
	 * @generated
	 */
	Marriage_Record createMarriage_Record();

	/**
	 * Returns a new object of class '<em>Non Resident Tax Payer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Non Resident Tax Payer</em>'.
	 * @generated
	 */
	Non_Resident_Tax_Payer createNon_Resident_Tax_Payer();

	/**
	 * Returns a new object of class '<em>Partnership Record</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Partnership Record</em>'.
	 * @generated
	 */
	Partnership_Record createPartnership_Record();

	/**
	 * Returns a new object of class '<em>Resident Tax Payer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resident Tax Payer</em>'.
	 * @generated
	 */
	Resident_Tax_Payer createResident_Tax_Payer();

	/**
	 * Returns a new object of class '<em>Trade and Business Income</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trade and Business Income</em>'.
	 * @generated
	 */
	Trade_and_Business_Income createTrade_and_Business_Income();

	/**
	 * Returns a new object of class '<em>Agriculture and Forestry Income</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agriculture and Forestry Income</em>'.
	 * @generated
	 */
	Agriculture_and_Forestry_Income createAgriculture_and_Forestry_Income();

	/**
	 * Returns a new object of class '<em>Pensions and Annuities Income</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pensions and Annuities Income</em>'.
	 * @generated
	 */
	Pensions_and_Annuities_Income createPensions_and_Annuities_Income();

	/**
	 * Returns a new object of class '<em>Capital and Investments Income</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Capital and Investments Income</em>'.
	 * @generated
	 */
	Capital_and_Investments_Income createCapital_and_Investments_Income();

	/**
	 * Returns a new object of class '<em>Employment Income</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Employment Income</em>'.
	 * @generated
	 */
	Employment_Income createEmployment_Income();

	/**
	 * Returns a new object of class '<em>Rentals and Leases Income</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rentals and Leases Income</em>'.
	 * @generated
	 */
	Rentals_and_Leases_Income createRentals_and_Leases_Income();

	/**
	 * Returns a new object of class '<em>Foreign Income</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Foreign Income</em>'.
	 * @generated
	 */
	Foreign_Income createForeign_Income();

	/**
	 * Returns a new object of class '<em>Local Income</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Local Income</em>'.
	 * @generated
	 */
	Local_Income createLocal_Income();

	/**
	 * Returns a new object of class '<em>CIM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIM</em>'.
	 * @generated
	 */
	CIM createCIM();

	/**
	 * Returns a new object of class '<em>CIP</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIP</em>'.
	 * @generated
	 */
	CIP createCIP();

	/**
	 * Returns a new object of class '<em>CIS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>CIS</em>'.
	 * @generated
	 */
	CIS createCIS();

	/**
	 * Returns a new object of class '<em>Permanent Expense</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Permanent Expense</em>'.
	 * @generated
	 */
	Permanent_Expense createPermanent_Expense();

	/**
	 * Returns a new object of class '<em>Special Expense DS</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Special Expense DS</em>'.
	 * @generated
	 */
	Special_Expense_DS createSpecial_Expense_DS();

	/**
	 * Returns a new object of class '<em>Interest Expense</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interest Expense</em>'.
	 * @generated
	 */
	Interest_Expense createInterest_Expense();

	/**
	 * Returns a new object of class '<em>Private Insurance and Plan</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Private Insurance and Plan</em>'.
	 * @generated
	 */
	Private_Insurance_and_Plan createPrivate_Insurance_and_Plan();

	/**
	 * Returns a new object of class '<em>Health and Pension Insurance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Health and Pension Insurance</em>'.
	 * @generated
	 */
	Health_and_Pension_Insurance createHealth_and_Pension_Insurance();

	/**
	 * Returns a new object of class '<em>Donation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Donation</em>'.
	 * @generated
	 */
	Donation createDonation();

	/**
	 * Returns a new object of class '<em>Loss Carryforward</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Loss Carryforward</em>'.
	 * @generated
	 */
	Loss_Carryforward createLoss_Carryforward();

	/**
	 * Returns a new object of class '<em>Spousal Expense AC</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Spousal Expense AC</em>'.
	 * @generated
	 */
	Spousal_Expense_AC createSpousal_Expense_AC();

	/**
	 * Returns a new object of class '<em>Extraordinary Expense CE</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extraordinary Expense CE</em>'.
	 * @generated
	 */
	Extraordinary_Expense_CE createExtraordinary_Expense_CE();

	/**
	 * Returns a new object of class '<em>Travel Expense FD</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Travel Expense FD</em>'.
	 * @generated
	 */
	Travel_Expense_FD createTravel_Expense_FD();

	/**
	 * Returns a new object of class '<em>Professional Expense</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Professional Expense</em>'.
	 * @generated
	 */
	Professional_Expense createProfessional_Expense();

	/**
	 * Returns a new object of class '<em>Miscellaneous Expense FO</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Miscellaneous Expense FO</em>'.
	 * @generated
	 */
	Miscellaneous_Expense_FO createMiscellaneous_Expense_FO();

	/**
	 * Returns a new object of class '<em>Resource</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Resource</em>'.
	 * @generated
	 */
	Resource createResource();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TaxationPackage getTaxationPackage();

} //TaxationFactory
