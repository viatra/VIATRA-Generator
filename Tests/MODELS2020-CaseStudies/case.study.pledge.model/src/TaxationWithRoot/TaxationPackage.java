/**
 */
package TaxationWithRoot;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see TaxationWithRoot.TaxationFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface TaxationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "TaxationWithRoot";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///TaxCardWithRoot.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "TaxCardWithRoot";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TaxationPackage eINSTANCE = TaxationWithRoot.impl.TaxationPackageImpl.init();

	/**
	 * The meta object id for the '{@link TaxationWithRoot.impl.ConstantsImpl <em>Constants</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.impl.ConstantsImpl
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getConstants()
	 * @generated
	 */
	int CONSTANTS = 0;

	/**
	 * The feature id for the '<em><b>MAXIMUM CE RATE FOR CHILD NOT BEING PART OF HOUSEHOLD</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTS__MAXIMUM_CE_RATE_FOR_CHILD_NOT_BEING_PART_OF_HOUSEHOLD = 0;

	/**
	 * The feature id for the '<em><b>MAXIMUM CE RATE FOR HOUSE CARE AND CHILD PART OF THE HOUSEHOLD CARE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTS__MAXIMUM_CE_RATE_FOR_HOUSE_CARE_AND_CHILD_PART_OF_THE_HOUSEHOLD_CARE = 1;

	/**
	 * The feature id for the '<em><b>MINIMUM SALARY</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTS__MINIMUM_SALARY = 2;

	/**
	 * The feature id for the '<em><b>FLAT RATE FOR EXTRA PROFESSIONAL DEDUCTION</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTS__FLAT_RATE_FOR_EXTRA_PROFESSIONAL_DEDUCTION = 3;

	/**
	 * The feature id for the '<em><b>MAXIMUM DEDUCTIBLE PERCENTAGE FOR DONATIONS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTS__MAXIMUM_DEDUCTIBLE_PERCENTAGE_FOR_DONATIONS = 4;

	/**
	 * The feature id for the '<em><b>MINIMUM DEDUCTIBLE AMOUNT FOR DONATIONS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTS__MINIMUM_DEDUCTIBLE_AMOUNT_FOR_DONATIONS = 5;

	/**
	 * The feature id for the '<em><b>MAXIMUM DEDUCTIBLE AMOUNT FOR ADDITIONAL PENSION AND INSURANC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTS__MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANC = 6;

	/**
	 * The feature id for the '<em><b>MAXIMUM DEDUCTIBLE AMOUNT FOR ALIMONY EXPENSE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTS__MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ALIMONY_EXPENSE = 7;

	/**
	 * The feature id for the '<em><b>MAXIMAL DISTANCE FOR TRAVEL EXPENSE DEDUCTION</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTS__MAXIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION = 8;

	/**
	 * The feature id for the '<em><b>MAXIMAL FLAT DISTANCE FOR TRAVEL EXPENSE DEDUCTION</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTS__MAXIMAL_FLAT_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION = 9;

	/**
	 * The feature id for the '<em><b>MINIMAL DISTANCE FOR TRAVEL EXPENSE DEDUCTION</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTS__MINIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION = 10;

	/**
	 * The feature id for the '<em><b>FLAT RATE CIM DAILY</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTS__FLAT_RATE_CIM_DAILY = 11;

	/**
	 * The feature id for the '<em><b>FLAT RATE CIM MONTHLY</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTS__FLAT_RATE_CIM_MONTHLY = 12;

	/**
	 * The feature id for the '<em><b>FLAT RATE CIM YEARLY</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTS__FLAT_RATE_CIM_YEARLY = 13;

	/**
	 * The feature id for the '<em><b>FLAT RATE CIP DAILY</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTS__FLAT_RATE_CIP_DAILY = 14;

	/**
	 * The feature id for the '<em><b>FLAT RATE CIP MONTHLY</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTS__FLAT_RATE_CIP_MONTHLY = 15;

	/**
	 * The feature id for the '<em><b>FLAT RATE CIP YEARLY</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTS__FLAT_RATE_CIP_YEARLY = 16;

	/**
	 * The feature id for the '<em><b>FLAT RATE CIS DAILY</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTS__FLAT_RATE_CIS_DAILY = 17;

	/**
	 * The feature id for the '<em><b>FLAT RATE CIS MONTHLY</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTS__FLAT_RATE_CIS_MONTHLY = 18;

	/**
	 * The feature id for the '<em><b>FLAT RATE CIS YEARLY</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTS__FLAT_RATE_CIS_YEARLY = 19;

	/**
	 * The feature id for the '<em><b>FLAT RATE FOR TRAVEL EXPENSE PER UNIT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTS__FLAT_RATE_FOR_TRAVEL_EXPENSE_PER_UNIT = 20;

	/**
	 * The feature id for the '<em><b>MAXIMUM DEDUCTIBLE AMOUNT FOR DS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTS__MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_DS = 21;

	/**
	 * The feature id for the '<em><b>FLAT RATE FOR MISCELLANEOUS EXPENSE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTS__FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE = 22;

	/**
	 * The feature id for the '<em><b>DISABILITY FLAT RATE FOR MISCELLANEOUS EXPENSE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTS__DISABILITY_FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE = 23;

	/**
	 * The feature id for the '<em><b>MAXIMUM DEDUCTIBLE AMOUNT FOR ADDITIONAL PENSION AND INSURANCE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTS__MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANCE = 24;

	/**
	 * The number of structural features of the '<em>Constants</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTS_FEATURE_COUNT = 25;

	/**
	 * The number of operations of the '<em>Constants</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.impl.Income_TaxImpl <em>Income Tax</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.impl.Income_TaxImpl
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getIncome_Tax()
	 * @generated
	 */
	int INCOME_TAX = 1;

	/**
	 * The feature id for the '<em><b>Tax Payer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME_TAX__TAX_PAYER = 0;

	/**
	 * The feature id for the '<em><b>Tax amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME_TAX__TAX_AMOUNT = 1;

	/**
	 * The feature id for the '<em><b>Tax year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME_TAX__TAX_YEAR = 2;

	/**
	 * The feature id for the '<em><b>Id6</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME_TAX__ID6 = 3;

	/**
	 * The number of structural features of the '<em>Income Tax</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME_TAX_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Income Tax</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME_TAX_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.impl.Physical_PersonImpl <em>Physical Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.impl.Physical_PersonImpl
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getPhysical_Person()
	 * @generated
	 */
	int PHYSICAL_PERSON = 3;

	/**
	 * The feature id for the '<em><b>SS No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PERSON__SS_NO = 0;

	/**
	 * The feature id for the '<em><b>Addresses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PERSON__ADDRESSES = 1;

	/**
	 * The feature id for the '<em><b>Birth year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PERSON__BIRTH_YEAR = 2;

	/**
	 * The feature id for the '<em><b>Disability percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PERSON__DISABILITY_PERCENTAGE = 3;

	/**
	 * The feature id for the '<em><b>Disability type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PERSON__DISABILITY_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Birth month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PERSON__BIRTH_MONTH = 5;

	/**
	 * The feature id for the '<em><b>Birth day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PERSON__BIRTH_DAY = 6;

	/**
	 * The feature id for the '<em><b>Expenses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PERSON__EXPENSES = 7;

	/**
	 * The feature id for the '<em><b>Is widower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PERSON__IS_WIDOWER = 8;

	/**
	 * The number of structural features of the '<em>Physical Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PERSON_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Physical Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.impl.Tax_PayerImpl <em>Tax Payer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.impl.Tax_PayerImpl
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getTax_Payer()
	 * @generated
	 */
	int TAX_PAYER = 2;

	/**
	 * The feature id for the '<em><b>SS No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_PAYER__SS_NO = PHYSICAL_PERSON__SS_NO;

	/**
	 * The feature id for the '<em><b>Addresses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_PAYER__ADDRESSES = PHYSICAL_PERSON__ADDRESSES;

	/**
	 * The feature id for the '<em><b>Birth year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_PAYER__BIRTH_YEAR = PHYSICAL_PERSON__BIRTH_YEAR;

	/**
	 * The feature id for the '<em><b>Disability percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_PAYER__DISABILITY_PERCENTAGE = PHYSICAL_PERSON__DISABILITY_PERCENTAGE;

	/**
	 * The feature id for the '<em><b>Disability type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_PAYER__DISABILITY_TYPE = PHYSICAL_PERSON__DISABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Birth month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_PAYER__BIRTH_MONTH = PHYSICAL_PERSON__BIRTH_MONTH;

	/**
	 * The feature id for the '<em><b>Birth day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_PAYER__BIRTH_DAY = PHYSICAL_PERSON__BIRTH_DAY;

	/**
	 * The feature id for the '<em><b>Expenses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_PAYER__EXPENSES = PHYSICAL_PERSON__EXPENSES;

	/**
	 * The feature id for the '<em><b>Is widower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_PAYER__IS_WIDOWER = PHYSICAL_PERSON__IS_WIDOWER;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_PAYER__DEPENDENTS = PHYSICAL_PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>From agent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_PAYER__FROM_AGENT = PHYSICAL_PERSON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Incomes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_PAYER__INCOMES = PHYSICAL_PERSON_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>From law</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_PAYER__FROM_LAW = PHYSICAL_PERSON_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Tax Payer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_PAYER_FEATURE_COUNT = PHYSICAL_PERSON_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Tax Payer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_PAYER_OPERATION_COUNT = PHYSICAL_PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.impl.AddressImpl <em>Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.impl.AddressImpl
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getAddress()
	 * @generated
	 */
	int ADDRESS = 4;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__COUNTRY = 0;

	/**
	 * The feature id for the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__STREET = 1;

	/**
	 * The feature id for the '<em><b>Zip Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__ZIP_CODE = 2;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__CITY = 3;

	/**
	 * The feature id for the '<em><b>Id2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__ID2 = 4;

	/**
	 * The feature id for the '<em><b>Tax Payer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS__TAX_PAYER = 5;

	/**
	 * The number of structural features of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.impl.ExpenseImpl <em>Expense</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.impl.ExpenseImpl
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getExpense()
	 * @generated
	 */
	int EXPENSE = 5;

	/**
	 * The feature id for the '<em><b>Declared amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPENSE__DECLARED_AMOUNT = 0;

	/**
	 * The feature id for the '<em><b>Expense purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPENSE__EXPENSE_PURPOSE = 1;

	/**
	 * The feature id for the '<em><b>Dependent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPENSE__DEPENDENT = 2;

	/**
	 * The feature id for the '<em><b>From agent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPENSE__FROM_AGENT = 3;

	/**
	 * The feature id for the '<em><b>Income</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPENSE__INCOME = 4;

	/**
	 * The feature id for the '<em><b>Id4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPENSE__ID4 = 5;

	/**
	 * The feature id for the '<em><b>Beneficiary</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPENSE__BENEFICIARY = 6;

	/**
	 * The number of structural features of the '<em>Expense</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPENSE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Expense</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXPENSE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.impl.DependentImpl <em>Dependent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.impl.DependentImpl
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getDependent()
	 * @generated
	 */
	int DEPENDENT = 6;

	/**
	 * The feature id for the '<em><b>SS No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT__SS_NO = PHYSICAL_PERSON__SS_NO;

	/**
	 * The feature id for the '<em><b>Addresses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT__ADDRESSES = PHYSICAL_PERSON__ADDRESSES;

	/**
	 * The feature id for the '<em><b>Birth year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT__BIRTH_YEAR = PHYSICAL_PERSON__BIRTH_YEAR;

	/**
	 * The feature id for the '<em><b>Disability percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT__DISABILITY_PERCENTAGE = PHYSICAL_PERSON__DISABILITY_PERCENTAGE;

	/**
	 * The feature id for the '<em><b>Disability type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT__DISABILITY_TYPE = PHYSICAL_PERSON__DISABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Birth month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT__BIRTH_MONTH = PHYSICAL_PERSON__BIRTH_MONTH;

	/**
	 * The feature id for the '<em><b>Birth day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT__BIRTH_DAY = PHYSICAL_PERSON__BIRTH_DAY;

	/**
	 * The feature id for the '<em><b>Expenses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT__EXPENSES = PHYSICAL_PERSON__EXPENSES;

	/**
	 * The feature id for the '<em><b>Is widower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT__IS_WIDOWER = PHYSICAL_PERSON__IS_WIDOWER;

	/**
	 * The feature id for the '<em><b>Dependent type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT__DEPENDENT_TYPE = PHYSICAL_PERSON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Responsible person</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT__RESPONSIBLE_PERSON = PHYSICAL_PERSON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Continued studies</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT__CONTINUED_STUDIES = PHYSICAL_PERSON_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Allowances</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT__ALLOWANCES = PHYSICAL_PERSON_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Household</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT__HOUSEHOLD = PHYSICAL_PERSON_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>From agent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT__FROM_AGENT = PHYSICAL_PERSON_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Expense</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT__EXPENSE = PHYSICAL_PERSON_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Dependent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_FEATURE_COUNT = PHYSICAL_PERSON_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Dependent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT_OPERATION_COUNT = PHYSICAL_PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.impl.External_AllowanceImpl <em>External Allowance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.impl.External_AllowanceImpl
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getExternal_Allowance()
	 * @generated
	 */
	int EXTERNAL_ALLOWANCE = 7;

	/**
	 * The feature id for the '<em><b>Grantor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ALLOWANCE__GRANTOR = 0;

	/**
	 * The feature id for the '<em><b>Starting year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ALLOWANCE__STARTING_YEAR = 1;

	/**
	 * The feature id for the '<em><b>Ending year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ALLOWANCE__ENDING_YEAR = 2;

	/**
	 * The feature id for the '<em><b>Reciver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ALLOWANCE__RECIVER = 3;

	/**
	 * The feature id for the '<em><b>Id5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ALLOWANCE__ID5 = 4;

	/**
	 * The feature id for the '<em><b>Person</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ALLOWANCE__PERSON = 5;

	/**
	 * The number of structural features of the '<em>External Allowance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ALLOWANCE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>External Allowance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ALLOWANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.Tax_Case <em>Tax Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.Tax_Case
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getTax_Case()
	 * @generated
	 */
	int TAX_CASE = 11;

	/**
	 * The number of structural features of the '<em>Tax Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CASE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Tax Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CASE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.impl.HouseholdImpl <em>Household</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.impl.HouseholdImpl
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getHousehold()
	 * @generated
	 */
	int HOUSEHOLD = 8;

	/**
	 * The feature id for the '<em><b>Parents</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSEHOLD__PARENTS = TAX_CASE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSEHOLD__ID1 = TAX_CASE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSEHOLD__CHILDREN = TAX_CASE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Household</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSEHOLD_FEATURE_COUNT = TAX_CASE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Household</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOUSEHOLD_OPERATION_COUNT = TAX_CASE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.impl.Legal_Union_RecordImpl <em>Legal Union Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.impl.Legal_Union_RecordImpl
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getLegal_Union_Record()
	 * @generated
	 */
	int LEGAL_UNION_RECORD = 9;

	/**
	 * The feature id for the '<em><b>Start year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_UNION_RECORD__START_YEAR = 0;

	/**
	 * The feature id for the '<em><b>End year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_UNION_RECORD__END_YEAR = 1;

	/**
	 * The feature id for the '<em><b>Separation cause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_UNION_RECORD__SEPARATION_CAUSE = 2;

	/**
	 * The feature id for the '<em><b>Individual A</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_UNION_RECORD__INDIVIDUAL_A = 3;

	/**
	 * The feature id for the '<em><b>Individual B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_UNION_RECORD__INDIVIDUAL_B = 4;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_UNION_RECORD__PROPERTIES = 5;

	/**
	 * The feature id for the '<em><b>Mutual agreement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_UNION_RECORD__MUTUAL_AGREEMENT = 6;

	/**
	 * The feature id for the '<em><b>Id9</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_UNION_RECORD__ID9 = 7;

	/**
	 * The feature id for the '<em><b>Household</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_UNION_RECORD__HOUSEHOLD = 8;

	/**
	 * The number of structural features of the '<em>Legal Union Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_UNION_RECORD_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Legal Union Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_UNION_RECORD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.impl.Tax_PropertyImpl <em>Tax Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.impl.Tax_PropertyImpl
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getTax_Property()
	 * @generated
	 */
	int TAX_PROPERTY = 10;

	/**
	 * The feature id for the '<em><b>Starting year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_PROPERTY__STARTING_YEAR = 0;

	/**
	 * The feature id for the '<em><b>Id10</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_PROPERTY__ID10 = 1;

	/**
	 * The feature id for the '<em><b>Union record</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_PROPERTY__UNION_RECORD = 2;

	/**
	 * The number of structural features of the '<em>Tax Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_PROPERTY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Tax Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_PROPERTY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.impl.FromAgentImpl <em>From Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.impl.FromAgentImpl
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getFromAgent()
	 * @generated
	 */
	int FROM_AGENT = 12;

	/**
	 * The feature id for the '<em><b>Tax Payer</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_AGENT__TAX_PAYER = 0;

	/**
	 * The feature id for the '<em><b>Is dependent eligible for CE Not In Houshold Children Care</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_AGENT__IS_DEPENDENT_ELIGIBLE_FOR_CE_NOT_IN_HOUSHOLD_CHILDREN_CARE = 1;

	/**
	 * The feature id for the '<em><b>Expense</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_AGENT__EXPENSE = 2;

	/**
	 * The feature id for the '<em><b>Is eligible debt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_AGENT__IS_ELIGIBLE_DEBT = 3;

	/**
	 * The feature id for the '<em><b>Dependent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_AGENT__DEPENDENT = 4;

	/**
	 * The number of structural features of the '<em>From Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_AGENT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>From Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_AGENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.impl.IncomeImpl <em>Income</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.impl.IncomeImpl
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getIncome()
	 * @generated
	 */
	int INCOME = 13;

	/**
	 * The feature id for the '<em><b>Income amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME__INCOME_AMOUNT = 0;

	/**
	 * The feature id for the '<em><b>Income type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME__INCOME_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Tax card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME__TAX_CARD = 2;

	/**
	 * The feature id for the '<em><b>Tax liability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME__TAX_LIABILITY = 3;

	/**
	 * The feature id for the '<em><b>Tax Payer</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME__TAX_PAYER = 4;

	/**
	 * The feature id for the '<em><b>Details</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME__DETAILS = 5;

	/**
	 * The feature id for the '<em><b>Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME__NUM = 6;

	/**
	 * The feature id for the '<em><b>Expenses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME__EXPENSES = 7;

	/**
	 * The number of structural features of the '<em>Income</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Income</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.impl.Income_TypeImpl <em>Income Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.impl.Income_TypeImpl
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getIncome_Type()
	 * @generated
	 */
	int INCOME_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Id8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME_TYPE__ID8 = 0;

	/**
	 * The feature id for the '<em><b>Income</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME_TYPE__INCOME = 1;

	/**
	 * The number of structural features of the '<em>Income Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Income Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.impl.Tax_CardImpl <em>Tax Card</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.impl.Tax_CardImpl
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getTax_Card()
	 * @generated
	 */
	int TAX_CARD = 15;

	/**
	 * The feature id for the '<em><b>Card identifier</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__CARD_IDENTIFIER = 0;

	/**
	 * The feature id for the '<em><b>Tax office</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__TAX_OFFICE = 1;

	/**
	 * The feature id for the '<em><b>Percentage of witholding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__PERCENTAGE_OF_WITHOLDING = 2;

	/**
	 * The feature id for the '<em><b>Tax payers name surname</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__TAX_PAYERS_NAME_SURNAME = 3;

	/**
	 * The feature id for the '<em><b>Tax payers partner name surname</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__TAX_PAYERS_PARTNER_NAME_SURNAME = 4;

	/**
	 * The feature id for the '<em><b>Tax payers address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__TAX_PAYERS_ADDRESS = 5;

	/**
	 * The feature id for the '<em><b>Jobs Employer SS No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__JOBS_EMPLOYER_SS_NO = 6;

	/**
	 * The feature id for the '<em><b>Jobs employers name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__JOBS_EMPLOYERS_NAME = 7;

	/**
	 * The feature id for the '<em><b>Jobs activity type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__JOBS_ACTIVITY_TYPE = 8;

	/**
	 * The feature id for the '<em><b>Jobs place of work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__JOBS_PLACE_OF_WORK = 9;

	/**
	 * The feature id for the '<em><b>Deduction FD daily</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__DEDUCTION_FD_DAILY = 10;

	/**
	 * The feature id for the '<em><b>Deduction FD monthly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__DEDUCTION_FD_MONTHLY = 11;

	/**
	 * The feature id for the '<em><b>Deduction AC daily</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__DEDUCTION_AC_DAILY = 12;

	/**
	 * The feature id for the '<em><b>Deduction AC monthly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__DEDUCTION_AC_MONTHLY = 13;

	/**
	 * The feature id for the '<em><b>Deduction AC yearly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__DEDUCTION_AC_YEARLY = 14;

	/**
	 * The feature id for the '<em><b>Deduction CE daily</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__DEDUCTION_CE_DAILY = 15;

	/**
	 * The feature id for the '<em><b>Deduction CE monthly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__DEDUCTION_CE_MONTHLY = 16;

	/**
	 * The feature id for the '<em><b>Deduction CE yearly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__DEDUCTION_CE_YEARLY = 17;

	/**
	 * The feature id for the '<em><b>Deduction DS daily</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__DEDUCTION_DS_DAILY = 18;

	/**
	 * The feature id for the '<em><b>Deduction DS monthly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__DEDUCTION_DS_MONTHLY = 19;

	/**
	 * The feature id for the '<em><b>Deduction FO daily</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__DEDUCTION_FO_DAILY = 20;

	/**
	 * The feature id for the '<em><b>Deduction FO monthly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__DEDUCTION_FO_MONTHLY = 21;

	/**
	 * The feature id for the '<em><b>Deduction FO yearly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__DEDUCTION_FO_YEARLY = 22;

	/**
	 * The feature id for the '<em><b>Credit CIS daily</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__CREDIT_CIS_DAILY = 23;

	/**
	 * The feature id for the '<em><b>Credit CIS monthly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__CREDIT_CIS_MONTHLY = 24;

	/**
	 * The feature id for the '<em><b>Credit CIM daily</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__CREDIT_CIM_DAILY = 25;

	/**
	 * The feature id for the '<em><b>Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__VALIDITY = 26;

	/**
	 * The feature id for the '<em><b>Income Tax Credit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__INCOME_TAX_CREDIT = 27;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__PREVIOUS = 28;

	/**
	 * The feature id for the '<em><b>Current tax card</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__CURRENT_TAX_CARD = 29;

	/**
	 * The feature id for the '<em><b>Credit CIM yearly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__CREDIT_CIM_YEARLY = 30;

	/**
	 * The feature id for the '<em><b>Deduction DS Alimony yearly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__DEDUCTION_DS_ALIMONY_YEARLY = 31;

	/**
	 * The feature id for the '<em><b>Deduction DS Debt yearly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__DEDUCTION_DS_DEBT_YEARLY = 32;

	/**
	 * The feature id for the '<em><b>Income</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__INCOME = 33;

	/**
	 * The number of structural features of the '<em>Tax Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD_FEATURE_COUNT = 34;

	/**
	 * The number of operations of the '<em>Tax Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.impl.Income_Tax_CreditImpl <em>Income Tax Credit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.impl.Income_Tax_CreditImpl
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getIncome_Tax_Credit()
	 * @generated
	 */
	int INCOME_TAX_CREDIT = 16;

	/**
	 * The feature id for the '<em><b>Granted By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME_TAX_CREDIT__GRANTED_BY = 0;

	/**
	 * The feature id for the '<em><b>Tax Payer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME_TAX_CREDIT__TAX_PAYER = 1;

	/**
	 * The feature id for the '<em><b>Tax year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME_TAX_CREDIT__TAX_YEAR = 2;

	/**
	 * The feature id for the '<em><b>Yearly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME_TAX_CREDIT__YEARLY = 3;

	/**
	 * The feature id for the '<em><b>Monthly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME_TAX_CREDIT__MONTHLY = 4;

	/**
	 * The feature id for the '<em><b>Daily</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME_TAX_CREDIT__DAILY = 5;

	/**
	 * The feature id for the '<em><b>Id7</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME_TAX_CREDIT__ID7 = 6;

	/**
	 * The feature id for the '<em><b>Taxation Frame</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME_TAX_CREDIT__TAXATION_FRAME = 7;

	/**
	 * The number of structural features of the '<em>Income Tax Credit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME_TAX_CREDIT_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Income Tax Credit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME_TAX_CREDIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.impl.Income_DetailImpl <em>Income Detail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.impl.Income_DetailImpl
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getIncome_Detail()
	 * @generated
	 */
	int INCOME_DETAIL = 17;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME_DETAIL__AMOUNT = 0;

	/**
	 * The feature id for the '<em><b>Is worked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME_DETAIL__IS_WORKED = 1;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME_DETAIL__DISTANCE = 2;

	/**
	 * The feature id for the '<em><b>Worked days</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME_DETAIL__WORKED_DAYS = 3;

	/**
	 * The feature id for the '<em><b>Is contributing CNS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME_DETAIL__IS_CONTRIBUTING_CNS = 4;

	/**
	 * The feature id for the '<em><b>Id5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME_DETAIL__ID5 = 5;

	/**
	 * The feature id for the '<em><b>Income</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME_DETAIL__INCOME = 6;

	/**
	 * The number of structural features of the '<em>Income Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME_DETAIL_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Income Detail</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME_DETAIL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.impl.FromLawImpl <em>From Law</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.impl.FromLawImpl
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getFromLaw()
	 * @generated
	 */
	int FROM_LAW = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_LAW__ID = 0;

	/**
	 * The feature id for the '<em><b>Tax Payer</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_LAW__TAX_PAYER = 1;

	/**
	 * The number of structural features of the '<em>From Law</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_LAW_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>From Law</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_LAW_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.impl.Fiscal_AddressImpl <em>Fiscal Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.impl.Fiscal_AddressImpl
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getFiscal_Address()
	 * @generated
	 */
	int FISCAL_ADDRESS = 19;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FISCAL_ADDRESS__COUNTRY = ADDRESS__COUNTRY;

	/**
	 * The feature id for the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FISCAL_ADDRESS__STREET = ADDRESS__STREET;

	/**
	 * The feature id for the '<em><b>Zip Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FISCAL_ADDRESS__ZIP_CODE = ADDRESS__ZIP_CODE;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FISCAL_ADDRESS__CITY = ADDRESS__CITY;

	/**
	 * The feature id for the '<em><b>Id2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FISCAL_ADDRESS__ID2 = ADDRESS__ID2;

	/**
	 * The feature id for the '<em><b>Tax Payer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FISCAL_ADDRESS__TAX_PAYER = ADDRESS__TAX_PAYER;

	/**
	 * The number of structural features of the '<em>Fiscal Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FISCAL_ADDRESS_FEATURE_COUNT = ADDRESS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Fiscal Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FISCAL_ADDRESS_OPERATION_COUNT = ADDRESS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.impl.Habitual_AddressImpl <em>Habitual Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.impl.Habitual_AddressImpl
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getHabitual_Address()
	 * @generated
	 */
	int HABITUAL_ADDRESS = 20;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HABITUAL_ADDRESS__COUNTRY = ADDRESS__COUNTRY;

	/**
	 * The feature id for the '<em><b>Street</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HABITUAL_ADDRESS__STREET = ADDRESS__STREET;

	/**
	 * The feature id for the '<em><b>Zip Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HABITUAL_ADDRESS__ZIP_CODE = ADDRESS__ZIP_CODE;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HABITUAL_ADDRESS__CITY = ADDRESS__CITY;

	/**
	 * The feature id for the '<em><b>Id2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HABITUAL_ADDRESS__ID2 = ADDRESS__ID2;

	/**
	 * The feature id for the '<em><b>Tax Payer</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HABITUAL_ADDRESS__TAX_PAYER = ADDRESS__TAX_PAYER;

	/**
	 * The number of structural features of the '<em>Habitual Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HABITUAL_ADDRESS_FEATURE_COUNT = ADDRESS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Habitual Address</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HABITUAL_ADDRESS_OPERATION_COUNT = ADDRESS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.impl.Marriage_RecordImpl <em>Marriage Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.impl.Marriage_RecordImpl
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getMarriage_Record()
	 * @generated
	 */
	int MARRIAGE_RECORD = 21;

	/**
	 * The feature id for the '<em><b>Start year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARRIAGE_RECORD__START_YEAR = LEGAL_UNION_RECORD__START_YEAR;

	/**
	 * The feature id for the '<em><b>End year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARRIAGE_RECORD__END_YEAR = LEGAL_UNION_RECORD__END_YEAR;

	/**
	 * The feature id for the '<em><b>Separation cause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARRIAGE_RECORD__SEPARATION_CAUSE = LEGAL_UNION_RECORD__SEPARATION_CAUSE;

	/**
	 * The feature id for the '<em><b>Individual A</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARRIAGE_RECORD__INDIVIDUAL_A = LEGAL_UNION_RECORD__INDIVIDUAL_A;

	/**
	 * The feature id for the '<em><b>Individual B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARRIAGE_RECORD__INDIVIDUAL_B = LEGAL_UNION_RECORD__INDIVIDUAL_B;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARRIAGE_RECORD__PROPERTIES = LEGAL_UNION_RECORD__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Mutual agreement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARRIAGE_RECORD__MUTUAL_AGREEMENT = LEGAL_UNION_RECORD__MUTUAL_AGREEMENT;

	/**
	 * The feature id for the '<em><b>Id9</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARRIAGE_RECORD__ID9 = LEGAL_UNION_RECORD__ID9;

	/**
	 * The feature id for the '<em><b>Household</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARRIAGE_RECORD__HOUSEHOLD = LEGAL_UNION_RECORD__HOUSEHOLD;

	/**
	 * The number of structural features of the '<em>Marriage Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARRIAGE_RECORD_FEATURE_COUNT = LEGAL_UNION_RECORD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Marriage Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MARRIAGE_RECORD_OPERATION_COUNT = LEGAL_UNION_RECORD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.impl.Non_Resident_Tax_PayerImpl <em>Non Resident Tax Payer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.impl.Non_Resident_Tax_PayerImpl
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getNon_Resident_Tax_Payer()
	 * @generated
	 */
	int NON_RESIDENT_TAX_PAYER = 22;

	/**
	 * The feature id for the '<em><b>SS No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_RESIDENT_TAX_PAYER__SS_NO = TAX_PAYER__SS_NO;

	/**
	 * The feature id for the '<em><b>Addresses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_RESIDENT_TAX_PAYER__ADDRESSES = TAX_PAYER__ADDRESSES;

	/**
	 * The feature id for the '<em><b>Birth year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_RESIDENT_TAX_PAYER__BIRTH_YEAR = TAX_PAYER__BIRTH_YEAR;

	/**
	 * The feature id for the '<em><b>Disability percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_RESIDENT_TAX_PAYER__DISABILITY_PERCENTAGE = TAX_PAYER__DISABILITY_PERCENTAGE;

	/**
	 * The feature id for the '<em><b>Disability type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_RESIDENT_TAX_PAYER__DISABILITY_TYPE = TAX_PAYER__DISABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Birth month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_RESIDENT_TAX_PAYER__BIRTH_MONTH = TAX_PAYER__BIRTH_MONTH;

	/**
	 * The feature id for the '<em><b>Birth day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_RESIDENT_TAX_PAYER__BIRTH_DAY = TAX_PAYER__BIRTH_DAY;

	/**
	 * The feature id for the '<em><b>Expenses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_RESIDENT_TAX_PAYER__EXPENSES = TAX_PAYER__EXPENSES;

	/**
	 * The feature id for the '<em><b>Is widower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_RESIDENT_TAX_PAYER__IS_WIDOWER = TAX_PAYER__IS_WIDOWER;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_RESIDENT_TAX_PAYER__DEPENDENTS = TAX_PAYER__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>From agent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_RESIDENT_TAX_PAYER__FROM_AGENT = TAX_PAYER__FROM_AGENT;

	/**
	 * The feature id for the '<em><b>Incomes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_RESIDENT_TAX_PAYER__INCOMES = TAX_PAYER__INCOMES;

	/**
	 * The feature id for the '<em><b>From law</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_RESIDENT_TAX_PAYER__FROM_LAW = TAX_PAYER__FROM_LAW;

	/**
	 * The feature id for the '<em><b>Is assimilated to resident</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_RESIDENT_TAX_PAYER__IS_ASSIMILATED_TO_RESIDENT = TAX_PAYER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Non Resident Tax Payer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_RESIDENT_TAX_PAYER_FEATURE_COUNT = TAX_PAYER_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Non Resident Tax Payer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_RESIDENT_TAX_PAYER_OPERATION_COUNT = TAX_PAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.impl.Partnership_RecordImpl <em>Partnership Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.impl.Partnership_RecordImpl
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getPartnership_Record()
	 * @generated
	 */
	int PARTNERSHIP_RECORD = 23;

	/**
	 * The feature id for the '<em><b>Start year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNERSHIP_RECORD__START_YEAR = LEGAL_UNION_RECORD__START_YEAR;

	/**
	 * The feature id for the '<em><b>End year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNERSHIP_RECORD__END_YEAR = LEGAL_UNION_RECORD__END_YEAR;

	/**
	 * The feature id for the '<em><b>Separation cause</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNERSHIP_RECORD__SEPARATION_CAUSE = LEGAL_UNION_RECORD__SEPARATION_CAUSE;

	/**
	 * The feature id for the '<em><b>Individual A</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNERSHIP_RECORD__INDIVIDUAL_A = LEGAL_UNION_RECORD__INDIVIDUAL_A;

	/**
	 * The feature id for the '<em><b>Individual B</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNERSHIP_RECORD__INDIVIDUAL_B = LEGAL_UNION_RECORD__INDIVIDUAL_B;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNERSHIP_RECORD__PROPERTIES = LEGAL_UNION_RECORD__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Mutual agreement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNERSHIP_RECORD__MUTUAL_AGREEMENT = LEGAL_UNION_RECORD__MUTUAL_AGREEMENT;

	/**
	 * The feature id for the '<em><b>Id9</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNERSHIP_RECORD__ID9 = LEGAL_UNION_RECORD__ID9;

	/**
	 * The feature id for the '<em><b>Household</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNERSHIP_RECORD__HOUSEHOLD = LEGAL_UNION_RECORD__HOUSEHOLD;

	/**
	 * The number of structural features of the '<em>Partnership Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNERSHIP_RECORD_FEATURE_COUNT = LEGAL_UNION_RECORD_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Partnership Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTNERSHIP_RECORD_OPERATION_COUNT = LEGAL_UNION_RECORD_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.impl.Resident_Tax_PayerImpl <em>Resident Tax Payer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.impl.Resident_Tax_PayerImpl
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getResident_Tax_Payer()
	 * @generated
	 */
	int RESIDENT_TAX_PAYER = 24;

	/**
	 * The feature id for the '<em><b>SS No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIDENT_TAX_PAYER__SS_NO = TAX_PAYER__SS_NO;

	/**
	 * The feature id for the '<em><b>Addresses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIDENT_TAX_PAYER__ADDRESSES = TAX_PAYER__ADDRESSES;

	/**
	 * The feature id for the '<em><b>Birth year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIDENT_TAX_PAYER__BIRTH_YEAR = TAX_PAYER__BIRTH_YEAR;

	/**
	 * The feature id for the '<em><b>Disability percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIDENT_TAX_PAYER__DISABILITY_PERCENTAGE = TAX_PAYER__DISABILITY_PERCENTAGE;

	/**
	 * The feature id for the '<em><b>Disability type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIDENT_TAX_PAYER__DISABILITY_TYPE = TAX_PAYER__DISABILITY_TYPE;

	/**
	 * The feature id for the '<em><b>Birth month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIDENT_TAX_PAYER__BIRTH_MONTH = TAX_PAYER__BIRTH_MONTH;

	/**
	 * The feature id for the '<em><b>Birth day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIDENT_TAX_PAYER__BIRTH_DAY = TAX_PAYER__BIRTH_DAY;

	/**
	 * The feature id for the '<em><b>Expenses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIDENT_TAX_PAYER__EXPENSES = TAX_PAYER__EXPENSES;

	/**
	 * The feature id for the '<em><b>Is widower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIDENT_TAX_PAYER__IS_WIDOWER = TAX_PAYER__IS_WIDOWER;

	/**
	 * The feature id for the '<em><b>Dependents</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIDENT_TAX_PAYER__DEPENDENTS = TAX_PAYER__DEPENDENTS;

	/**
	 * The feature id for the '<em><b>From agent</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIDENT_TAX_PAYER__FROM_AGENT = TAX_PAYER__FROM_AGENT;

	/**
	 * The feature id for the '<em><b>Incomes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIDENT_TAX_PAYER__INCOMES = TAX_PAYER__INCOMES;

	/**
	 * The feature id for the '<em><b>From law</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIDENT_TAX_PAYER__FROM_LAW = TAX_PAYER__FROM_LAW;

	/**
	 * The number of structural features of the '<em>Resident Tax Payer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIDENT_TAX_PAYER_FEATURE_COUNT = TAX_PAYER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Resident Tax Payer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIDENT_TAX_PAYER_OPERATION_COUNT = TAX_PAYER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.impl.Trade_and_Business_IncomeImpl <em>Trade and Business Income</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.impl.Trade_and_Business_IncomeImpl
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getTrade_and_Business_Income()
	 * @generated
	 */
	int TRADE_AND_BUSINESS_INCOME = 25;

	/**
	 * The feature id for the '<em><b>Id8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADE_AND_BUSINESS_INCOME__ID8 = INCOME_TYPE__ID8;

	/**
	 * The feature id for the '<em><b>Income</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADE_AND_BUSINESS_INCOME__INCOME = INCOME_TYPE__INCOME;

	/**
	 * The number of structural features of the '<em>Trade and Business Income</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADE_AND_BUSINESS_INCOME_FEATURE_COUNT = INCOME_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Trade and Business Income</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADE_AND_BUSINESS_INCOME_OPERATION_COUNT = INCOME_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.impl.Agriculture_and_Forestry_IncomeImpl <em>Agriculture and Forestry Income</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.impl.Agriculture_and_Forestry_IncomeImpl
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getAgriculture_and_Forestry_Income()
	 * @generated
	 */
	int AGRICULTURE_AND_FORESTRY_INCOME = 26;

	/**
	 * The feature id for the '<em><b>Id8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGRICULTURE_AND_FORESTRY_INCOME__ID8 = INCOME_TYPE__ID8;

	/**
	 * The feature id for the '<em><b>Income</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGRICULTURE_AND_FORESTRY_INCOME__INCOME = INCOME_TYPE__INCOME;

	/**
	 * The number of structural features of the '<em>Agriculture and Forestry Income</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGRICULTURE_AND_FORESTRY_INCOME_FEATURE_COUNT = INCOME_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Agriculture and Forestry Income</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGRICULTURE_AND_FORESTRY_INCOME_OPERATION_COUNT = INCOME_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.impl.Pensions_and_Annuities_IncomeImpl <em>Pensions and Annuities Income</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.impl.Pensions_and_Annuities_IncomeImpl
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getPensions_and_Annuities_Income()
	 * @generated
	 */
	int PENSIONS_AND_ANNUITIES_INCOME = 27;

	/**
	 * The feature id for the '<em><b>Id8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENSIONS_AND_ANNUITIES_INCOME__ID8 = INCOME_TYPE__ID8;

	/**
	 * The feature id for the '<em><b>Income</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENSIONS_AND_ANNUITIES_INCOME__INCOME = INCOME_TYPE__INCOME;

	/**
	 * The feature id for the '<em><b>Occasional payement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENSIONS_AND_ANNUITIES_INCOME__OCCASIONAL_PAYEMENT = INCOME_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Pensions and Annuities Income</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENSIONS_AND_ANNUITIES_INCOME_FEATURE_COUNT = INCOME_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Pensions and Annuities Income</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENSIONS_AND_ANNUITIES_INCOME_OPERATION_COUNT = INCOME_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.impl.Capital_and_Investments_IncomeImpl <em>Capital and Investments Income</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.impl.Capital_and_Investments_IncomeImpl
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getCapital_and_Investments_Income()
	 * @generated
	 */
	int CAPITAL_AND_INVESTMENTS_INCOME = 28;

	/**
	 * The feature id for the '<em><b>Id8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPITAL_AND_INVESTMENTS_INCOME__ID8 = INCOME_TYPE__ID8;

	/**
	 * The feature id for the '<em><b>Income</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPITAL_AND_INVESTMENTS_INCOME__INCOME = INCOME_TYPE__INCOME;

	/**
	 * The number of structural features of the '<em>Capital and Investments Income</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPITAL_AND_INVESTMENTS_INCOME_FEATURE_COUNT = INCOME_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Capital and Investments Income</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPITAL_AND_INVESTMENTS_INCOME_OPERATION_COUNT = INCOME_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.impl.Employment_IncomeImpl <em>Employment Income</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.impl.Employment_IncomeImpl
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getEmployment_Income()
	 * @generated
	 */
	int EMPLOYMENT_INCOME = 29;

	/**
	 * The feature id for the '<em><b>Id8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYMENT_INCOME__ID8 = INCOME_TYPE__ID8;

	/**
	 * The feature id for the '<em><b>Income</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYMENT_INCOME__INCOME = INCOME_TYPE__INCOME;

	/**
	 * The number of structural features of the '<em>Employment Income</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYMENT_INCOME_FEATURE_COUNT = INCOME_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Employment Income</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYMENT_INCOME_OPERATION_COUNT = INCOME_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.impl.Rentals_and_Leases_IncomeImpl <em>Rentals and Leases Income</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.impl.Rentals_and_Leases_IncomeImpl
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getRentals_and_Leases_Income()
	 * @generated
	 */
	int RENTALS_AND_LEASES_INCOME = 30;

	/**
	 * The feature id for the '<em><b>Id8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTALS_AND_LEASES_INCOME__ID8 = INCOME_TYPE__ID8;

	/**
	 * The feature id for the '<em><b>Income</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTALS_AND_LEASES_INCOME__INCOME = INCOME_TYPE__INCOME;

	/**
	 * The feature id for the '<em><b>Is periodic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTALS_AND_LEASES_INCOME__IS_PERIODIC = INCOME_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Rentals and Leases Income</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTALS_AND_LEASES_INCOME_FEATURE_COUNT = INCOME_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Rentals and Leases Income</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTALS_AND_LEASES_INCOME_OPERATION_COUNT = INCOME_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.impl.Foreign_IncomeImpl <em>Foreign Income</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.impl.Foreign_IncomeImpl
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getForeign_Income()
	 * @generated
	 */
	int FOREIGN_INCOME = 31;

	/**
	 * The feature id for the '<em><b>Income amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_INCOME__INCOME_AMOUNT = INCOME__INCOME_AMOUNT;

	/**
	 * The feature id for the '<em><b>Income type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_INCOME__INCOME_TYPE = INCOME__INCOME_TYPE;

	/**
	 * The feature id for the '<em><b>Tax card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_INCOME__TAX_CARD = INCOME__TAX_CARD;

	/**
	 * The feature id for the '<em><b>Tax liability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_INCOME__TAX_LIABILITY = INCOME__TAX_LIABILITY;

	/**
	 * The feature id for the '<em><b>Tax Payer</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_INCOME__TAX_PAYER = INCOME__TAX_PAYER;

	/**
	 * The feature id for the '<em><b>Details</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_INCOME__DETAILS = INCOME__DETAILS;

	/**
	 * The feature id for the '<em><b>Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_INCOME__NUM = INCOME__NUM;

	/**
	 * The feature id for the '<em><b>Expenses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_INCOME__EXPENSES = INCOME__EXPENSES;

	/**
	 * The number of structural features of the '<em>Foreign Income</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_INCOME_FEATURE_COUNT = INCOME_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Foreign Income</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_INCOME_OPERATION_COUNT = INCOME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.impl.Local_IncomeImpl <em>Local Income</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.impl.Local_IncomeImpl
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getLocal_Income()
	 * @generated
	 */
	int LOCAL_INCOME = 32;

	/**
	 * The feature id for the '<em><b>Income amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_INCOME__INCOME_AMOUNT = INCOME__INCOME_AMOUNT;

	/**
	 * The feature id for the '<em><b>Income type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_INCOME__INCOME_TYPE = INCOME__INCOME_TYPE;

	/**
	 * The feature id for the '<em><b>Tax card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_INCOME__TAX_CARD = INCOME__TAX_CARD;

	/**
	 * The feature id for the '<em><b>Tax liability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_INCOME__TAX_LIABILITY = INCOME__TAX_LIABILITY;

	/**
	 * The feature id for the '<em><b>Tax Payer</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_INCOME__TAX_PAYER = INCOME__TAX_PAYER;

	/**
	 * The feature id for the '<em><b>Details</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_INCOME__DETAILS = INCOME__DETAILS;

	/**
	 * The feature id for the '<em><b>Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_INCOME__NUM = INCOME__NUM;

	/**
	 * The feature id for the '<em><b>Expenses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_INCOME__EXPENSES = INCOME__EXPENSES;

	/**
	 * The number of structural features of the '<em>Local Income</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_INCOME_FEATURE_COUNT = INCOME_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Local Income</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_INCOME_OPERATION_COUNT = INCOME_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.impl.CIMImpl <em>CIM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.impl.CIMImpl
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getCIM()
	 * @generated
	 */
	int CIM = 33;

	/**
	 * The feature id for the '<em><b>Granted By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIM__GRANTED_BY = INCOME_TAX_CREDIT__GRANTED_BY;

	/**
	 * The feature id for the '<em><b>Tax Payer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIM__TAX_PAYER = INCOME_TAX_CREDIT__TAX_PAYER;

	/**
	 * The feature id for the '<em><b>Tax year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIM__TAX_YEAR = INCOME_TAX_CREDIT__TAX_YEAR;

	/**
	 * The feature id for the '<em><b>Yearly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIM__YEARLY = INCOME_TAX_CREDIT__YEARLY;

	/**
	 * The feature id for the '<em><b>Monthly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIM__MONTHLY = INCOME_TAX_CREDIT__MONTHLY;

	/**
	 * The feature id for the '<em><b>Daily</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIM__DAILY = INCOME_TAX_CREDIT__DAILY;

	/**
	 * The feature id for the '<em><b>Id7</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIM__ID7 = INCOME_TAX_CREDIT__ID7;

	/**
	 * The feature id for the '<em><b>Taxation Frame</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIM__TAXATION_FRAME = INCOME_TAX_CREDIT__TAXATION_FRAME;

	/**
	 * The number of structural features of the '<em>CIM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIM_FEATURE_COUNT = INCOME_TAX_CREDIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>CIM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIM_OPERATION_COUNT = INCOME_TAX_CREDIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.impl.CIPImpl <em>CIP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.impl.CIPImpl
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getCIP()
	 * @generated
	 */
	int CIP = 34;

	/**
	 * The feature id for the '<em><b>Granted By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIP__GRANTED_BY = INCOME_TAX_CREDIT__GRANTED_BY;

	/**
	 * The feature id for the '<em><b>Tax Payer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIP__TAX_PAYER = INCOME_TAX_CREDIT__TAX_PAYER;

	/**
	 * The feature id for the '<em><b>Tax year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIP__TAX_YEAR = INCOME_TAX_CREDIT__TAX_YEAR;

	/**
	 * The feature id for the '<em><b>Yearly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIP__YEARLY = INCOME_TAX_CREDIT__YEARLY;

	/**
	 * The feature id for the '<em><b>Monthly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIP__MONTHLY = INCOME_TAX_CREDIT__MONTHLY;

	/**
	 * The feature id for the '<em><b>Daily</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIP__DAILY = INCOME_TAX_CREDIT__DAILY;

	/**
	 * The feature id for the '<em><b>Id7</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIP__ID7 = INCOME_TAX_CREDIT__ID7;

	/**
	 * The feature id for the '<em><b>Taxation Frame</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIP__TAXATION_FRAME = INCOME_TAX_CREDIT__TAXATION_FRAME;

	/**
	 * The number of structural features of the '<em>CIP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIP_FEATURE_COUNT = INCOME_TAX_CREDIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>CIP</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIP_OPERATION_COUNT = INCOME_TAX_CREDIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.impl.CISImpl <em>CIS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.impl.CISImpl
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getCIS()
	 * @generated
	 */
	int CIS = 35;

	/**
	 * The feature id for the '<em><b>Granted By</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIS__GRANTED_BY = INCOME_TAX_CREDIT__GRANTED_BY;

	/**
	 * The feature id for the '<em><b>Tax Payer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIS__TAX_PAYER = INCOME_TAX_CREDIT__TAX_PAYER;

	/**
	 * The feature id for the '<em><b>Tax year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIS__TAX_YEAR = INCOME_TAX_CREDIT__TAX_YEAR;

	/**
	 * The feature id for the '<em><b>Yearly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIS__YEARLY = INCOME_TAX_CREDIT__YEARLY;

	/**
	 * The feature id for the '<em><b>Monthly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIS__MONTHLY = INCOME_TAX_CREDIT__MONTHLY;

	/**
	 * The feature id for the '<em><b>Daily</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIS__DAILY = INCOME_TAX_CREDIT__DAILY;

	/**
	 * The feature id for the '<em><b>Id7</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIS__ID7 = INCOME_TAX_CREDIT__ID7;

	/**
	 * The feature id for the '<em><b>Taxation Frame</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIS__TAXATION_FRAME = INCOME_TAX_CREDIT__TAXATION_FRAME;

	/**
	 * The number of structural features of the '<em>CIS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIS_FEATURE_COUNT = INCOME_TAX_CREDIT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>CIS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIS_OPERATION_COUNT = INCOME_TAX_CREDIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.impl.Special_Expense_DSImpl <em>Special Expense DS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.impl.Special_Expense_DSImpl
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getSpecial_Expense_DS()
	 * @generated
	 */
	int SPECIAL_EXPENSE_DS = 37;

	/**
	 * The feature id for the '<em><b>Declared amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_EXPENSE_DS__DECLARED_AMOUNT = EXPENSE__DECLARED_AMOUNT;

	/**
	 * The feature id for the '<em><b>Expense purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_EXPENSE_DS__EXPENSE_PURPOSE = EXPENSE__EXPENSE_PURPOSE;

	/**
	 * The feature id for the '<em><b>Dependent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_EXPENSE_DS__DEPENDENT = EXPENSE__DEPENDENT;

	/**
	 * The feature id for the '<em><b>From agent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_EXPENSE_DS__FROM_AGENT = EXPENSE__FROM_AGENT;

	/**
	 * The feature id for the '<em><b>Income</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_EXPENSE_DS__INCOME = EXPENSE__INCOME;

	/**
	 * The feature id for the '<em><b>Id4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_EXPENSE_DS__ID4 = EXPENSE__ID4;

	/**
	 * The feature id for the '<em><b>Beneficiary</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_EXPENSE_DS__BENEFICIARY = EXPENSE__BENEFICIARY;

	/**
	 * The number of structural features of the '<em>Special Expense DS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_EXPENSE_DS_FEATURE_COUNT = EXPENSE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Special Expense DS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_EXPENSE_DS_OPERATION_COUNT = EXPENSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.impl.Permanent_ExpenseImpl <em>Permanent Expense</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.impl.Permanent_ExpenseImpl
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getPermanent_Expense()
	 * @generated
	 */
	int PERMANENT_EXPENSE = 36;

	/**
	 * The feature id for the '<em><b>Declared amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMANENT_EXPENSE__DECLARED_AMOUNT = SPECIAL_EXPENSE_DS__DECLARED_AMOUNT;

	/**
	 * The feature id for the '<em><b>Expense purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMANENT_EXPENSE__EXPENSE_PURPOSE = SPECIAL_EXPENSE_DS__EXPENSE_PURPOSE;

	/**
	 * The feature id for the '<em><b>Dependent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMANENT_EXPENSE__DEPENDENT = SPECIAL_EXPENSE_DS__DEPENDENT;

	/**
	 * The feature id for the '<em><b>From agent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMANENT_EXPENSE__FROM_AGENT = SPECIAL_EXPENSE_DS__FROM_AGENT;

	/**
	 * The feature id for the '<em><b>Income</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMANENT_EXPENSE__INCOME = SPECIAL_EXPENSE_DS__INCOME;

	/**
	 * The feature id for the '<em><b>Id4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMANENT_EXPENSE__ID4 = SPECIAL_EXPENSE_DS__ID4;

	/**
	 * The feature id for the '<em><b>Beneficiary</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMANENT_EXPENSE__BENEFICIARY = SPECIAL_EXPENSE_DS__BENEFICIARY;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMANENT_EXPENSE__CATEGORY = SPECIAL_EXPENSE_DS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Permanent Expense</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMANENT_EXPENSE_FEATURE_COUNT = SPECIAL_EXPENSE_DS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Permanent Expense</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMANENT_EXPENSE_OPERATION_COUNT = SPECIAL_EXPENSE_DS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.impl.Interest_ExpenseImpl <em>Interest Expense</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.impl.Interest_ExpenseImpl
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getInterest_Expense()
	 * @generated
	 */
	int INTEREST_EXPENSE = 38;

	/**
	 * The feature id for the '<em><b>Declared amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEREST_EXPENSE__DECLARED_AMOUNT = SPECIAL_EXPENSE_DS__DECLARED_AMOUNT;

	/**
	 * The feature id for the '<em><b>Expense purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEREST_EXPENSE__EXPENSE_PURPOSE = SPECIAL_EXPENSE_DS__EXPENSE_PURPOSE;

	/**
	 * The feature id for the '<em><b>Dependent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEREST_EXPENSE__DEPENDENT = SPECIAL_EXPENSE_DS__DEPENDENT;

	/**
	 * The feature id for the '<em><b>From agent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEREST_EXPENSE__FROM_AGENT = SPECIAL_EXPENSE_DS__FROM_AGENT;

	/**
	 * The feature id for the '<em><b>Income</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEREST_EXPENSE__INCOME = SPECIAL_EXPENSE_DS__INCOME;

	/**
	 * The feature id for the '<em><b>Id4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEREST_EXPENSE__ID4 = SPECIAL_EXPENSE_DS__ID4;

	/**
	 * The feature id for the '<em><b>Beneficiary</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEREST_EXPENSE__BENEFICIARY = SPECIAL_EXPENSE_DS__BENEFICIARY;

	/**
	 * The number of structural features of the '<em>Interest Expense</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEREST_EXPENSE_FEATURE_COUNT = SPECIAL_EXPENSE_DS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interest Expense</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEREST_EXPENSE_OPERATION_COUNT = SPECIAL_EXPENSE_DS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.impl.Private_Insurance_and_PlanImpl <em>Private Insurance and Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.impl.Private_Insurance_and_PlanImpl
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getPrivate_Insurance_and_Plan()
	 * @generated
	 */
	int PRIVATE_INSURANCE_AND_PLAN = 39;

	/**
	 * The feature id for the '<em><b>Declared amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_INSURANCE_AND_PLAN__DECLARED_AMOUNT = SPECIAL_EXPENSE_DS__DECLARED_AMOUNT;

	/**
	 * The feature id for the '<em><b>Expense purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_INSURANCE_AND_PLAN__EXPENSE_PURPOSE = SPECIAL_EXPENSE_DS__EXPENSE_PURPOSE;

	/**
	 * The feature id for the '<em><b>Dependent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_INSURANCE_AND_PLAN__DEPENDENT = SPECIAL_EXPENSE_DS__DEPENDENT;

	/**
	 * The feature id for the '<em><b>From agent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_INSURANCE_AND_PLAN__FROM_AGENT = SPECIAL_EXPENSE_DS__FROM_AGENT;

	/**
	 * The feature id for the '<em><b>Income</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_INSURANCE_AND_PLAN__INCOME = SPECIAL_EXPENSE_DS__INCOME;

	/**
	 * The feature id for the '<em><b>Id4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_INSURANCE_AND_PLAN__ID4 = SPECIAL_EXPENSE_DS__ID4;

	/**
	 * The feature id for the '<em><b>Beneficiary</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_INSURANCE_AND_PLAN__BENEFICIARY = SPECIAL_EXPENSE_DS__BENEFICIARY;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_INSURANCE_AND_PLAN__CATEGORY = SPECIAL_EXPENSE_DS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Duration of contract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_INSURANCE_AND_PLAN__DURATION_OF_CONTRACT = SPECIAL_EXPENSE_DS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Private Insurance and Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_INSURANCE_AND_PLAN_FEATURE_COUNT = SPECIAL_EXPENSE_DS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Private Insurance and Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_INSURANCE_AND_PLAN_OPERATION_COUNT = SPECIAL_EXPENSE_DS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.impl.Health_and_Pension_InsuranceImpl <em>Health and Pension Insurance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.impl.Health_and_Pension_InsuranceImpl
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getHealth_and_Pension_Insurance()
	 * @generated
	 */
	int HEALTH_AND_PENSION_INSURANCE = 40;

	/**
	 * The feature id for the '<em><b>Declared amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_AND_PENSION_INSURANCE__DECLARED_AMOUNT = SPECIAL_EXPENSE_DS__DECLARED_AMOUNT;

	/**
	 * The feature id for the '<em><b>Expense purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_AND_PENSION_INSURANCE__EXPENSE_PURPOSE = SPECIAL_EXPENSE_DS__EXPENSE_PURPOSE;

	/**
	 * The feature id for the '<em><b>Dependent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_AND_PENSION_INSURANCE__DEPENDENT = SPECIAL_EXPENSE_DS__DEPENDENT;

	/**
	 * The feature id for the '<em><b>From agent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_AND_PENSION_INSURANCE__FROM_AGENT = SPECIAL_EXPENSE_DS__FROM_AGENT;

	/**
	 * The feature id for the '<em><b>Income</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_AND_PENSION_INSURANCE__INCOME = SPECIAL_EXPENSE_DS__INCOME;

	/**
	 * The feature id for the '<em><b>Id4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_AND_PENSION_INSURANCE__ID4 = SPECIAL_EXPENSE_DS__ID4;

	/**
	 * The feature id for the '<em><b>Beneficiary</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_AND_PENSION_INSURANCE__BENEFICIARY = SPECIAL_EXPENSE_DS__BENEFICIARY;

	/**
	 * The feature id for the '<em><b>Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_AND_PENSION_INSURANCE__CATEGORY = SPECIAL_EXPENSE_DS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is related to additional salary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_AND_PENSION_INSURANCE__IS_RELATED_TO_ADDITIONAL_SALARY = SPECIAL_EXPENSE_DS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Health and Pension Insurance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_AND_PENSION_INSURANCE_FEATURE_COUNT = SPECIAL_EXPENSE_DS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Health and Pension Insurance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALTH_AND_PENSION_INSURANCE_OPERATION_COUNT = SPECIAL_EXPENSE_DS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.impl.DonationImpl <em>Donation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.impl.DonationImpl
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getDonation()
	 * @generated
	 */
	int DONATION = 41;

	/**
	 * The feature id for the '<em><b>Declared amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATION__DECLARED_AMOUNT = SPECIAL_EXPENSE_DS__DECLARED_AMOUNT;

	/**
	 * The feature id for the '<em><b>Expense purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATION__EXPENSE_PURPOSE = SPECIAL_EXPENSE_DS__EXPENSE_PURPOSE;

	/**
	 * The feature id for the '<em><b>Dependent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATION__DEPENDENT = SPECIAL_EXPENSE_DS__DEPENDENT;

	/**
	 * The feature id for the '<em><b>From agent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATION__FROM_AGENT = SPECIAL_EXPENSE_DS__FROM_AGENT;

	/**
	 * The feature id for the '<em><b>Income</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATION__INCOME = SPECIAL_EXPENSE_DS__INCOME;

	/**
	 * The feature id for the '<em><b>Id4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATION__ID4 = SPECIAL_EXPENSE_DS__ID4;

	/**
	 * The feature id for the '<em><b>Beneficiary</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATION__BENEFICIARY = SPECIAL_EXPENSE_DS__BENEFICIARY;

	/**
	 * The feature id for the '<em><b>Beneficiary1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATION__BENEFICIARY1 = SPECIAL_EXPENSE_DS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is donation reported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATION__IS_DONATION_REPORTED = SPECIAL_EXPENSE_DS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Donation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATION_FEATURE_COUNT = SPECIAL_EXPENSE_DS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Donation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATION_OPERATION_COUNT = SPECIAL_EXPENSE_DS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.impl.Loss_CarryforwardImpl <em>Loss Carryforward</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.impl.Loss_CarryforwardImpl
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getLoss_Carryforward()
	 * @generated
	 */
	int LOSS_CARRYFORWARD = 42;

	/**
	 * The feature id for the '<em><b>Declared amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_CARRYFORWARD__DECLARED_AMOUNT = SPECIAL_EXPENSE_DS__DECLARED_AMOUNT;

	/**
	 * The feature id for the '<em><b>Expense purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_CARRYFORWARD__EXPENSE_PURPOSE = SPECIAL_EXPENSE_DS__EXPENSE_PURPOSE;

	/**
	 * The feature id for the '<em><b>Dependent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_CARRYFORWARD__DEPENDENT = SPECIAL_EXPENSE_DS__DEPENDENT;

	/**
	 * The feature id for the '<em><b>From agent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_CARRYFORWARD__FROM_AGENT = SPECIAL_EXPENSE_DS__FROM_AGENT;

	/**
	 * The feature id for the '<em><b>Income</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_CARRYFORWARD__INCOME = SPECIAL_EXPENSE_DS__INCOME;

	/**
	 * The feature id for the '<em><b>Id4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_CARRYFORWARD__ID4 = SPECIAL_EXPENSE_DS__ID4;

	/**
	 * The feature id for the '<em><b>Beneficiary</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_CARRYFORWARD__BENEFICIARY = SPECIAL_EXPENSE_DS__BENEFICIARY;

	/**
	 * The number of structural features of the '<em>Loss Carryforward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_CARRYFORWARD_FEATURE_COUNT = SPECIAL_EXPENSE_DS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Loss Carryforward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_CARRYFORWARD_OPERATION_COUNT = SPECIAL_EXPENSE_DS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.impl.Spousal_Expense_ACImpl <em>Spousal Expense AC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.impl.Spousal_Expense_ACImpl
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getSpousal_Expense_AC()
	 * @generated
	 */
	int SPOUSAL_EXPENSE_AC = 43;

	/**
	 * The feature id for the '<em><b>Declared amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOUSAL_EXPENSE_AC__DECLARED_AMOUNT = EXPENSE__DECLARED_AMOUNT;

	/**
	 * The feature id for the '<em><b>Expense purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOUSAL_EXPENSE_AC__EXPENSE_PURPOSE = EXPENSE__EXPENSE_PURPOSE;

	/**
	 * The feature id for the '<em><b>Dependent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOUSAL_EXPENSE_AC__DEPENDENT = EXPENSE__DEPENDENT;

	/**
	 * The feature id for the '<em><b>From agent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOUSAL_EXPENSE_AC__FROM_AGENT = EXPENSE__FROM_AGENT;

	/**
	 * The feature id for the '<em><b>Income</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOUSAL_EXPENSE_AC__INCOME = EXPENSE__INCOME;

	/**
	 * The feature id for the '<em><b>Id4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOUSAL_EXPENSE_AC__ID4 = EXPENSE__ID4;

	/**
	 * The feature id for the '<em><b>Beneficiary</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOUSAL_EXPENSE_AC__BENEFICIARY = EXPENSE__BENEFICIARY;

	/**
	 * The number of structural features of the '<em>Spousal Expense AC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOUSAL_EXPENSE_AC_FEATURE_COUNT = EXPENSE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Spousal Expense AC</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPOUSAL_EXPENSE_AC_OPERATION_COUNT = EXPENSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.impl.Extraordinary_Expense_CEImpl <em>Extraordinary Expense CE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.impl.Extraordinary_Expense_CEImpl
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getExtraordinary_Expense_CE()
	 * @generated
	 */
	int EXTRAORDINARY_EXPENSE_CE = 44;

	/**
	 * The feature id for the '<em><b>Declared amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRAORDINARY_EXPENSE_CE__DECLARED_AMOUNT = EXPENSE__DECLARED_AMOUNT;

	/**
	 * The feature id for the '<em><b>Expense purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRAORDINARY_EXPENSE_CE__EXPENSE_PURPOSE = EXPENSE__EXPENSE_PURPOSE;

	/**
	 * The feature id for the '<em><b>Dependent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRAORDINARY_EXPENSE_CE__DEPENDENT = EXPENSE__DEPENDENT;

	/**
	 * The feature id for the '<em><b>From agent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRAORDINARY_EXPENSE_CE__FROM_AGENT = EXPENSE__FROM_AGENT;

	/**
	 * The feature id for the '<em><b>Income</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRAORDINARY_EXPENSE_CE__INCOME = EXPENSE__INCOME;

	/**
	 * The feature id for the '<em><b>Id4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRAORDINARY_EXPENSE_CE__ID4 = EXPENSE__ID4;

	/**
	 * The feature id for the '<em><b>Beneficiary</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRAORDINARY_EXPENSE_CE__BENEFICIARY = EXPENSE__BENEFICIARY;

	/**
	 * The feature id for the '<em><b>Thresholded deduction percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRAORDINARY_EXPENSE_CE__THRESHOLDED_DEDUCTION_PERCENTAGE = EXPENSE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ce type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRAORDINARY_EXPENSE_CE__CE_TYPE = EXPENSE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Extraordinary Expense CE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRAORDINARY_EXPENSE_CE_FEATURE_COUNT = EXPENSE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Extraordinary Expense CE</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRAORDINARY_EXPENSE_CE_OPERATION_COUNT = EXPENSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.impl.Professional_ExpenseImpl <em>Professional Expense</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.impl.Professional_ExpenseImpl
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getProfessional_Expense()
	 * @generated
	 */
	int PROFESSIONAL_EXPENSE = 46;

	/**
	 * The feature id for the '<em><b>Declared amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSIONAL_EXPENSE__DECLARED_AMOUNT = EXPENSE__DECLARED_AMOUNT;

	/**
	 * The feature id for the '<em><b>Expense purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSIONAL_EXPENSE__EXPENSE_PURPOSE = EXPENSE__EXPENSE_PURPOSE;

	/**
	 * The feature id for the '<em><b>Dependent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSIONAL_EXPENSE__DEPENDENT = EXPENSE__DEPENDENT;

	/**
	 * The feature id for the '<em><b>From agent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSIONAL_EXPENSE__FROM_AGENT = EXPENSE__FROM_AGENT;

	/**
	 * The feature id for the '<em><b>Income</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSIONAL_EXPENSE__INCOME = EXPENSE__INCOME;

	/**
	 * The feature id for the '<em><b>Id4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSIONAL_EXPENSE__ID4 = EXPENSE__ID4;

	/**
	 * The feature id for the '<em><b>Beneficiary</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSIONAL_EXPENSE__BENEFICIARY = EXPENSE__BENEFICIARY;

	/**
	 * The number of structural features of the '<em>Professional Expense</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSIONAL_EXPENSE_FEATURE_COUNT = EXPENSE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Professional Expense</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSIONAL_EXPENSE_OPERATION_COUNT = EXPENSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.impl.Travel_Expense_FDImpl <em>Travel Expense FD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.impl.Travel_Expense_FDImpl
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getTravel_Expense_FD()
	 * @generated
	 */
	int TRAVEL_EXPENSE_FD = 45;

	/**
	 * The feature id for the '<em><b>Declared amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_EXPENSE_FD__DECLARED_AMOUNT = PROFESSIONAL_EXPENSE__DECLARED_AMOUNT;

	/**
	 * The feature id for the '<em><b>Expense purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_EXPENSE_FD__EXPENSE_PURPOSE = PROFESSIONAL_EXPENSE__EXPENSE_PURPOSE;

	/**
	 * The feature id for the '<em><b>Dependent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_EXPENSE_FD__DEPENDENT = PROFESSIONAL_EXPENSE__DEPENDENT;

	/**
	 * The feature id for the '<em><b>From agent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_EXPENSE_FD__FROM_AGENT = PROFESSIONAL_EXPENSE__FROM_AGENT;

	/**
	 * The feature id for the '<em><b>Income</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_EXPENSE_FD__INCOME = PROFESSIONAL_EXPENSE__INCOME;

	/**
	 * The feature id for the '<em><b>Id4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_EXPENSE_FD__ID4 = PROFESSIONAL_EXPENSE__ID4;

	/**
	 * The feature id for the '<em><b>Beneficiary</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_EXPENSE_FD__BENEFICIARY = PROFESSIONAL_EXPENSE__BENEFICIARY;

	/**
	 * The number of structural features of the '<em>Travel Expense FD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_EXPENSE_FD_FEATURE_COUNT = PROFESSIONAL_EXPENSE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Travel Expense FD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRAVEL_EXPENSE_FD_OPERATION_COUNT = PROFESSIONAL_EXPENSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.impl.Miscellaneous_Expense_FOImpl <em>Miscellaneous Expense FO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.impl.Miscellaneous_Expense_FOImpl
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getMiscellaneous_Expense_FO()
	 * @generated
	 */
	int MISCELLANEOUS_EXPENSE_FO = 47;

	/**
	 * The feature id for the '<em><b>Declared amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISCELLANEOUS_EXPENSE_FO__DECLARED_AMOUNT = PROFESSIONAL_EXPENSE__DECLARED_AMOUNT;

	/**
	 * The feature id for the '<em><b>Expense purpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISCELLANEOUS_EXPENSE_FO__EXPENSE_PURPOSE = PROFESSIONAL_EXPENSE__EXPENSE_PURPOSE;

	/**
	 * The feature id for the '<em><b>Dependent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISCELLANEOUS_EXPENSE_FO__DEPENDENT = PROFESSIONAL_EXPENSE__DEPENDENT;

	/**
	 * The feature id for the '<em><b>From agent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISCELLANEOUS_EXPENSE_FO__FROM_AGENT = PROFESSIONAL_EXPENSE__FROM_AGENT;

	/**
	 * The feature id for the '<em><b>Income</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISCELLANEOUS_EXPENSE_FO__INCOME = PROFESSIONAL_EXPENSE__INCOME;

	/**
	 * The feature id for the '<em><b>Id4</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISCELLANEOUS_EXPENSE_FO__ID4 = PROFESSIONAL_EXPENSE__ID4;

	/**
	 * The feature id for the '<em><b>Beneficiary</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISCELLANEOUS_EXPENSE_FO__BENEFICIARY = PROFESSIONAL_EXPENSE__BENEFICIARY;

	/**
	 * The number of structural features of the '<em>Miscellaneous Expense FO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISCELLANEOUS_EXPENSE_FO_FEATURE_COUNT = PROFESSIONAL_EXPENSE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Miscellaneous Expense FO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MISCELLANEOUS_EXPENSE_FO_OPERATION_COUNT = PROFESSIONAL_EXPENSE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.impl.ResourceImpl <em>Resource</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.impl.ResourceImpl
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getResource()
	 * @generated
	 */
	int RESOURCE = 48;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE__CONTAINS = 0;

	/**
	 * The number of structural features of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Resource</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.Grantor <em>Grantor</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.Grantor
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getGrantor()
	 * @generated
	 */
	int GRANTOR = 49;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.Disability_Types <em>Disability Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.Disability_Types
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getDisability_Types()
	 * @generated
	 */
	int DISABILITY_TYPES = 50;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.Country <em>Country</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.Country
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getCountry()
	 * @generated
	 */
	int COUNTRY = 51;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.Tax_Office <em>Tax Office</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.Tax_Office
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getTax_Office()
	 * @generated
	 */
	int TAX_OFFICE = 52;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.Tax_Class_Category <em>Tax Class Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.Tax_Class_Category
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getTax_Class_Category()
	 * @generated
	 */
	int TAX_CLASS_CATEGORY = 53;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.Job_Activity <em>Job Activity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.Job_Activity
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getJob_Activity()
	 * @generated
	 */
	int JOB_ACTIVITY = 54;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.Town <em>Town</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.Town
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getTown()
	 * @generated
	 */
	int TOWN = 55;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.CE_Type <em>CE Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.CE_Type
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getCE_Type()
	 * @generated
	 */
	int CE_TYPE = 56;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.Expense_Purpose <em>Expense Purpose</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.Expense_Purpose
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getExpense_Purpose()
	 * @generated
	 */
	int EXPENSE_PURPOSE = 57;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.Dependent_Type <em>Dependent Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.Dependent_Type
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getDependent_Type()
	 * @generated
	 */
	int DEPENDENT_TYPE = 58;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.Separation_Causes <em>Separation Causes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.Separation_Causes
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getSeparation_Causes()
	 * @generated
	 */
	int SEPARATION_CAUSES = 59;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.Category_of_Permanent_Expense <em>Category of Permanent Expense</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.Category_of_Permanent_Expense
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getCategory_of_Permanent_Expense()
	 * @generated
	 */
	int CATEGORY_OF_PERMANENT_EXPENSE = 60;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.Category_of_Health_and_Pension_Insurances <em>Category of Health and Pension Insurances</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.Category_of_Health_and_Pension_Insurances
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getCategory_of_Health_and_Pension_Insurances()
	 * @generated
	 */
	int CATEGORY_OF_HEALTH_AND_PENSION_INSURANCES = 61;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.Category_of_Private_Insurance_and_Plan <em>Category of Private Insurance and Plan</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.Category_of_Private_Insurance_and_Plan
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getCategory_of_Private_Insurance_and_Plan()
	 * @generated
	 */
	int CATEGORY_OF_PRIVATE_INSURANCE_AND_PLAN = 62;

	/**
	 * The meta object id for the '{@link TaxationWithRoot.Legal_Union_Types <em>Legal Union Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see TaxationWithRoot.Legal_Union_Types
	 * @see TaxationWithRoot.impl.TaxationPackageImpl#getLegal_Union_Types()
	 * @generated
	 */
	int LEGAL_UNION_TYPES = 63;


	/**
	 * Returns the meta object for class '{@link TaxationWithRoot.Constants <em>Constants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constants</em>'.
	 * @see TaxationWithRoot.Constants
	 * @generated
	 */
	EClass getConstants();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Constants#getMAXIMUM_CE_RATE_FOR_CHILD_NOT_BEING_PART_OF_HOUSEHOLD <em>MAXIMUM CE RATE FOR CHILD NOT BEING PART OF HOUSEHOLD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MAXIMUM CE RATE FOR CHILD NOT BEING PART OF HOUSEHOLD</em>'.
	 * @see TaxationWithRoot.Constants#getMAXIMUM_CE_RATE_FOR_CHILD_NOT_BEING_PART_OF_HOUSEHOLD()
	 * @see #getConstants()
	 * @generated
	 */
	EAttribute getConstants_MAXIMUM_CE_RATE_FOR_CHILD_NOT_BEING_PART_OF_HOUSEHOLD();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Constants#getMAXIMUM_CE_RATE_FOR_HOUSE_CARE_AND_CHILD_PART_OF_THE_HOUSEHOLD_CARE <em>MAXIMUM CE RATE FOR HOUSE CARE AND CHILD PART OF THE HOUSEHOLD CARE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MAXIMUM CE RATE FOR HOUSE CARE AND CHILD PART OF THE HOUSEHOLD CARE</em>'.
	 * @see TaxationWithRoot.Constants#getMAXIMUM_CE_RATE_FOR_HOUSE_CARE_AND_CHILD_PART_OF_THE_HOUSEHOLD_CARE()
	 * @see #getConstants()
	 * @generated
	 */
	EAttribute getConstants_MAXIMUM_CE_RATE_FOR_HOUSE_CARE_AND_CHILD_PART_OF_THE_HOUSEHOLD_CARE();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Constants#getMINIMUM_SALARY <em>MINIMUM SALARY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MINIMUM SALARY</em>'.
	 * @see TaxationWithRoot.Constants#getMINIMUM_SALARY()
	 * @see #getConstants()
	 * @generated
	 */
	EAttribute getConstants_MINIMUM_SALARY();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Constants#getFLAT_RATE_FOR_EXTRA_PROFESSIONAL_DEDUCTION <em>FLAT RATE FOR EXTRA PROFESSIONAL DEDUCTION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>FLAT RATE FOR EXTRA PROFESSIONAL DEDUCTION</em>'.
	 * @see TaxationWithRoot.Constants#getFLAT_RATE_FOR_EXTRA_PROFESSIONAL_DEDUCTION()
	 * @see #getConstants()
	 * @generated
	 */
	EAttribute getConstants_FLAT_RATE_FOR_EXTRA_PROFESSIONAL_DEDUCTION();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Constants#getMAXIMUM_DEDUCTIBLE_PERCENTAGE_FOR_DONATIONS <em>MAXIMUM DEDUCTIBLE PERCENTAGE FOR DONATIONS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MAXIMUM DEDUCTIBLE PERCENTAGE FOR DONATIONS</em>'.
	 * @see TaxationWithRoot.Constants#getMAXIMUM_DEDUCTIBLE_PERCENTAGE_FOR_DONATIONS()
	 * @see #getConstants()
	 * @generated
	 */
	EAttribute getConstants_MAXIMUM_DEDUCTIBLE_PERCENTAGE_FOR_DONATIONS();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Constants#getMINIMUM_DEDUCTIBLE_AMOUNT_FOR_DONATIONS <em>MINIMUM DEDUCTIBLE AMOUNT FOR DONATIONS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MINIMUM DEDUCTIBLE AMOUNT FOR DONATIONS</em>'.
	 * @see TaxationWithRoot.Constants#getMINIMUM_DEDUCTIBLE_AMOUNT_FOR_DONATIONS()
	 * @see #getConstants()
	 * @generated
	 */
	EAttribute getConstants_MINIMUM_DEDUCTIBLE_AMOUNT_FOR_DONATIONS();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Constants#getMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANC <em>MAXIMUM DEDUCTIBLE AMOUNT FOR ADDITIONAL PENSION AND INSURANC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MAXIMUM DEDUCTIBLE AMOUNT FOR ADDITIONAL PENSION AND INSURANC</em>'.
	 * @see TaxationWithRoot.Constants#getMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANC()
	 * @see #getConstants()
	 * @generated
	 */
	EAttribute getConstants_MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANC();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Constants#getMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ALIMONY_EXPENSE <em>MAXIMUM DEDUCTIBLE AMOUNT FOR ALIMONY EXPENSE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MAXIMUM DEDUCTIBLE AMOUNT FOR ALIMONY EXPENSE</em>'.
	 * @see TaxationWithRoot.Constants#getMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ALIMONY_EXPENSE()
	 * @see #getConstants()
	 * @generated
	 */
	EAttribute getConstants_MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ALIMONY_EXPENSE();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Constants#getMAXIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION <em>MAXIMAL DISTANCE FOR TRAVEL EXPENSE DEDUCTION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MAXIMAL DISTANCE FOR TRAVEL EXPENSE DEDUCTION</em>'.
	 * @see TaxationWithRoot.Constants#getMAXIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION()
	 * @see #getConstants()
	 * @generated
	 */
	EAttribute getConstants_MAXIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Constants#getMAXIMAL_FLAT_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION <em>MAXIMAL FLAT DISTANCE FOR TRAVEL EXPENSE DEDUCTION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MAXIMAL FLAT DISTANCE FOR TRAVEL EXPENSE DEDUCTION</em>'.
	 * @see TaxationWithRoot.Constants#getMAXIMAL_FLAT_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION()
	 * @see #getConstants()
	 * @generated
	 */
	EAttribute getConstants_MAXIMAL_FLAT_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Constants#getMINIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION <em>MINIMAL DISTANCE FOR TRAVEL EXPENSE DEDUCTION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MINIMAL DISTANCE FOR TRAVEL EXPENSE DEDUCTION</em>'.
	 * @see TaxationWithRoot.Constants#getMINIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION()
	 * @see #getConstants()
	 * @generated
	 */
	EAttribute getConstants_MINIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Constants#getFLAT_RATE_CIM_DAILY <em>FLAT RATE CIM DAILY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>FLAT RATE CIM DAILY</em>'.
	 * @see TaxationWithRoot.Constants#getFLAT_RATE_CIM_DAILY()
	 * @see #getConstants()
	 * @generated
	 */
	EAttribute getConstants_FLAT_RATE_CIM_DAILY();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Constants#getFLAT_RATE_CIM_MONTHLY <em>FLAT RATE CIM MONTHLY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>FLAT RATE CIM MONTHLY</em>'.
	 * @see TaxationWithRoot.Constants#getFLAT_RATE_CIM_MONTHLY()
	 * @see #getConstants()
	 * @generated
	 */
	EAttribute getConstants_FLAT_RATE_CIM_MONTHLY();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Constants#getFLAT_RATE_CIM_YEARLY <em>FLAT RATE CIM YEARLY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>FLAT RATE CIM YEARLY</em>'.
	 * @see TaxationWithRoot.Constants#getFLAT_RATE_CIM_YEARLY()
	 * @see #getConstants()
	 * @generated
	 */
	EAttribute getConstants_FLAT_RATE_CIM_YEARLY();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Constants#getFLAT_RATE_CIP_DAILY <em>FLAT RATE CIP DAILY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>FLAT RATE CIP DAILY</em>'.
	 * @see TaxationWithRoot.Constants#getFLAT_RATE_CIP_DAILY()
	 * @see #getConstants()
	 * @generated
	 */
	EAttribute getConstants_FLAT_RATE_CIP_DAILY();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Constants#getFLAT_RATE_CIP_MONTHLY <em>FLAT RATE CIP MONTHLY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>FLAT RATE CIP MONTHLY</em>'.
	 * @see TaxationWithRoot.Constants#getFLAT_RATE_CIP_MONTHLY()
	 * @see #getConstants()
	 * @generated
	 */
	EAttribute getConstants_FLAT_RATE_CIP_MONTHLY();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Constants#getFLAT_RATE_CIP_YEARLY <em>FLAT RATE CIP YEARLY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>FLAT RATE CIP YEARLY</em>'.
	 * @see TaxationWithRoot.Constants#getFLAT_RATE_CIP_YEARLY()
	 * @see #getConstants()
	 * @generated
	 */
	EAttribute getConstants_FLAT_RATE_CIP_YEARLY();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Constants#getFLAT_RATE_CIS_DAILY <em>FLAT RATE CIS DAILY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>FLAT RATE CIS DAILY</em>'.
	 * @see TaxationWithRoot.Constants#getFLAT_RATE_CIS_DAILY()
	 * @see #getConstants()
	 * @generated
	 */
	EAttribute getConstants_FLAT_RATE_CIS_DAILY();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Constants#getFLAT_RATE_CIS_MONTHLY <em>FLAT RATE CIS MONTHLY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>FLAT RATE CIS MONTHLY</em>'.
	 * @see TaxationWithRoot.Constants#getFLAT_RATE_CIS_MONTHLY()
	 * @see #getConstants()
	 * @generated
	 */
	EAttribute getConstants_FLAT_RATE_CIS_MONTHLY();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Constants#getFLAT_RATE_CIS_YEARLY <em>FLAT RATE CIS YEARLY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>FLAT RATE CIS YEARLY</em>'.
	 * @see TaxationWithRoot.Constants#getFLAT_RATE_CIS_YEARLY()
	 * @see #getConstants()
	 * @generated
	 */
	EAttribute getConstants_FLAT_RATE_CIS_YEARLY();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Constants#getFLAT_RATE_FOR_TRAVEL_EXPENSE_PER_UNIT <em>FLAT RATE FOR TRAVEL EXPENSE PER UNIT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>FLAT RATE FOR TRAVEL EXPENSE PER UNIT</em>'.
	 * @see TaxationWithRoot.Constants#getFLAT_RATE_FOR_TRAVEL_EXPENSE_PER_UNIT()
	 * @see #getConstants()
	 * @generated
	 */
	EAttribute getConstants_FLAT_RATE_FOR_TRAVEL_EXPENSE_PER_UNIT();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Constants#getMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_DS <em>MAXIMUM DEDUCTIBLE AMOUNT FOR DS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MAXIMUM DEDUCTIBLE AMOUNT FOR DS</em>'.
	 * @see TaxationWithRoot.Constants#getMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_DS()
	 * @see #getConstants()
	 * @generated
	 */
	EAttribute getConstants_MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_DS();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Constants#getFLAT_RATE_FOR_MISCELLANEOUS_EXPENSE <em>FLAT RATE FOR MISCELLANEOUS EXPENSE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>FLAT RATE FOR MISCELLANEOUS EXPENSE</em>'.
	 * @see TaxationWithRoot.Constants#getFLAT_RATE_FOR_MISCELLANEOUS_EXPENSE()
	 * @see #getConstants()
	 * @generated
	 */
	EAttribute getConstants_FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Constants#getDISABILITY_FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE <em>DISABILITY FLAT RATE FOR MISCELLANEOUS EXPENSE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DISABILITY FLAT RATE FOR MISCELLANEOUS EXPENSE</em>'.
	 * @see TaxationWithRoot.Constants#getDISABILITY_FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE()
	 * @see #getConstants()
	 * @generated
	 */
	EAttribute getConstants_DISABILITY_FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Constants#getMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANCE <em>MAXIMUM DEDUCTIBLE AMOUNT FOR ADDITIONAL PENSION AND INSURANCE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MAXIMUM DEDUCTIBLE AMOUNT FOR ADDITIONAL PENSION AND INSURANCE</em>'.
	 * @see TaxationWithRoot.Constants#getMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANCE()
	 * @see #getConstants()
	 * @generated
	 */
	EAttribute getConstants_MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANCE();

	/**
	 * Returns the meta object for class '{@link TaxationWithRoot.Income_Tax <em>Income Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Income Tax</em>'.
	 * @see TaxationWithRoot.Income_Tax
	 * @generated
	 */
	EClass getIncome_Tax();

	/**
	 * Returns the meta object for the reference '{@link TaxationWithRoot.Income_Tax#getTaxPayer <em>Tax Payer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tax Payer</em>'.
	 * @see TaxationWithRoot.Income_Tax#getTaxPayer()
	 * @see #getIncome_Tax()
	 * @generated
	 */
	EReference getIncome_Tax_TaxPayer();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Income_Tax#getTax_amount <em>Tax amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax amount</em>'.
	 * @see TaxationWithRoot.Income_Tax#getTax_amount()
	 * @see #getIncome_Tax()
	 * @generated
	 */
	EAttribute getIncome_Tax_Tax_amount();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Income_Tax#getTax_year <em>Tax year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax year</em>'.
	 * @see TaxationWithRoot.Income_Tax#getTax_year()
	 * @see #getIncome_Tax()
	 * @generated
	 */
	EAttribute getIncome_Tax_Tax_year();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Income_Tax#getId6 <em>Id6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id6</em>'.
	 * @see TaxationWithRoot.Income_Tax#getId6()
	 * @see #getIncome_Tax()
	 * @generated
	 */
	EAttribute getIncome_Tax_Id6();

	/**
	 * Returns the meta object for class '{@link TaxationWithRoot.Tax_Payer <em>Tax Payer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tax Payer</em>'.
	 * @see TaxationWithRoot.Tax_Payer
	 * @generated
	 */
	EClass getTax_Payer();

	/**
	 * Returns the meta object for the containment reference list '{@link TaxationWithRoot.Tax_Payer#getDependents <em>Dependents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependents</em>'.
	 * @see TaxationWithRoot.Tax_Payer#getDependents()
	 * @see #getTax_Payer()
	 * @generated
	 */
	EReference getTax_Payer_Dependents();

	/**
	 * Returns the meta object for the containment reference '{@link TaxationWithRoot.Tax_Payer#getFrom_agent <em>From agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From agent</em>'.
	 * @see TaxationWithRoot.Tax_Payer#getFrom_agent()
	 * @see #getTax_Payer()
	 * @generated
	 */
	EReference getTax_Payer_From_agent();

	/**
	 * Returns the meta object for the containment reference list '{@link TaxationWithRoot.Tax_Payer#getIncomes <em>Incomes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Incomes</em>'.
	 * @see TaxationWithRoot.Tax_Payer#getIncomes()
	 * @see #getTax_Payer()
	 * @generated
	 */
	EReference getTax_Payer_Incomes();

	/**
	 * Returns the meta object for the containment reference '{@link TaxationWithRoot.Tax_Payer#getFrom_law <em>From law</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From law</em>'.
	 * @see TaxationWithRoot.Tax_Payer#getFrom_law()
	 * @see #getTax_Payer()
	 * @generated
	 */
	EReference getTax_Payer_From_law();

	/**
	 * Returns the meta object for class '{@link TaxationWithRoot.Physical_Person <em>Physical Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Person</em>'.
	 * @see TaxationWithRoot.Physical_Person
	 * @generated
	 */
	EClass getPhysical_Person();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Physical_Person#getSSNo <em>SS No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SS No</em>'.
	 * @see TaxationWithRoot.Physical_Person#getSSNo()
	 * @see #getPhysical_Person()
	 * @generated
	 */
	EAttribute getPhysical_Person_SSNo();

	/**
	 * Returns the meta object for the reference list '{@link TaxationWithRoot.Physical_Person#getAddresses <em>Addresses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Addresses</em>'.
	 * @see TaxationWithRoot.Physical_Person#getAddresses()
	 * @see #getPhysical_Person()
	 * @generated
	 */
	EReference getPhysical_Person_Addresses();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Physical_Person#getBirth_year <em>Birth year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Birth year</em>'.
	 * @see TaxationWithRoot.Physical_Person#getBirth_year()
	 * @see #getPhysical_Person()
	 * @generated
	 */
	EAttribute getPhysical_Person_Birth_year();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Physical_Person#getDisability_percentage <em>Disability percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disability percentage</em>'.
	 * @see TaxationWithRoot.Physical_Person#getDisability_percentage()
	 * @see #getPhysical_Person()
	 * @generated
	 */
	EAttribute getPhysical_Person_Disability_percentage();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Physical_Person#getDisability_type <em>Disability type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disability type</em>'.
	 * @see TaxationWithRoot.Physical_Person#getDisability_type()
	 * @see #getPhysical_Person()
	 * @generated
	 */
	EAttribute getPhysical_Person_Disability_type();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Physical_Person#getBirth_month <em>Birth month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Birth month</em>'.
	 * @see TaxationWithRoot.Physical_Person#getBirth_month()
	 * @see #getPhysical_Person()
	 * @generated
	 */
	EAttribute getPhysical_Person_Birth_month();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Physical_Person#getBirth_day <em>Birth day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Birth day</em>'.
	 * @see TaxationWithRoot.Physical_Person#getBirth_day()
	 * @see #getPhysical_Person()
	 * @generated
	 */
	EAttribute getPhysical_Person_Birth_day();

	/**
	 * Returns the meta object for the reference list '{@link TaxationWithRoot.Physical_Person#getExpenses <em>Expenses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Expenses</em>'.
	 * @see TaxationWithRoot.Physical_Person#getExpenses()
	 * @see #getPhysical_Person()
	 * @generated
	 */
	EReference getPhysical_Person_Expenses();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Physical_Person#isIs_widower <em>Is widower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is widower</em>'.
	 * @see TaxationWithRoot.Physical_Person#isIs_widower()
	 * @see #getPhysical_Person()
	 * @generated
	 */
	EAttribute getPhysical_Person_Is_widower();

	/**
	 * Returns the meta object for class '{@link TaxationWithRoot.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address</em>'.
	 * @see TaxationWithRoot.Address
	 * @generated
	 */
	EClass getAddress();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Address#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see TaxationWithRoot.Address#getCountry()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Country();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Address#getStreet <em>Street</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street</em>'.
	 * @see TaxationWithRoot.Address#getStreet()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Street();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Address#getZipCode <em>Zip Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zip Code</em>'.
	 * @see TaxationWithRoot.Address#getZipCode()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_ZipCode();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Address#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see TaxationWithRoot.Address#getCity()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_City();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Address#getId2 <em>Id2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id2</em>'.
	 * @see TaxationWithRoot.Address#getId2()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Id2();

	/**
	 * Returns the meta object for the reference list '{@link TaxationWithRoot.Address#getTaxPayer <em>Tax Payer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tax Payer</em>'.
	 * @see TaxationWithRoot.Address#getTaxPayer()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_TaxPayer();

	/**
	 * Returns the meta object for class '{@link TaxationWithRoot.Expense <em>Expense</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expense</em>'.
	 * @see TaxationWithRoot.Expense
	 * @generated
	 */
	EClass getExpense();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Expense#getDeclared_amount <em>Declared amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Declared amount</em>'.
	 * @see TaxationWithRoot.Expense#getDeclared_amount()
	 * @see #getExpense()
	 * @generated
	 */
	EAttribute getExpense_Declared_amount();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Expense#getExpense_purpose <em>Expense purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expense purpose</em>'.
	 * @see TaxationWithRoot.Expense#getExpense_purpose()
	 * @see #getExpense()
	 * @generated
	 */
	EAttribute getExpense_Expense_purpose();

	/**
	 * Returns the meta object for the reference '{@link TaxationWithRoot.Expense#getDependent <em>Dependent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dependent</em>'.
	 * @see TaxationWithRoot.Expense#getDependent()
	 * @see #getExpense()
	 * @generated
	 */
	EReference getExpense_Dependent();

	/**
	 * Returns the meta object for the reference '{@link TaxationWithRoot.Expense#getFrom_agent <em>From agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From agent</em>'.
	 * @see TaxationWithRoot.Expense#getFrom_agent()
	 * @see #getExpense()
	 * @generated
	 */
	EReference getExpense_From_agent();

	/**
	 * Returns the meta object for the container reference '{@link TaxationWithRoot.Expense#getIncome <em>Income</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Income</em>'.
	 * @see TaxationWithRoot.Expense#getIncome()
	 * @see #getExpense()
	 * @generated
	 */
	EReference getExpense_Income();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Expense#getId4 <em>Id4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id4</em>'.
	 * @see TaxationWithRoot.Expense#getId4()
	 * @see #getExpense()
	 * @generated
	 */
	EAttribute getExpense_Id4();

	/**
	 * Returns the meta object for the reference '{@link TaxationWithRoot.Expense#getBeneficiary <em>Beneficiary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Beneficiary</em>'.
	 * @see TaxationWithRoot.Expense#getBeneficiary()
	 * @see #getExpense()
	 * @generated
	 */
	EReference getExpense_Beneficiary();

	/**
	 * Returns the meta object for class '{@link TaxationWithRoot.Dependent <em>Dependent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependent</em>'.
	 * @see TaxationWithRoot.Dependent
	 * @generated
	 */
	EClass getDependent();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Dependent#getDependent_type <em>Dependent type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dependent type</em>'.
	 * @see TaxationWithRoot.Dependent#getDependent_type()
	 * @see #getDependent()
	 * @generated
	 */
	EAttribute getDependent_Dependent_type();

	/**
	 * Returns the meta object for the container reference '{@link TaxationWithRoot.Dependent#getResponsible_person <em>Responsible person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Responsible person</em>'.
	 * @see TaxationWithRoot.Dependent#getResponsible_person()
	 * @see #getDependent()
	 * @generated
	 */
	EReference getDependent_Responsible_person();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Dependent#isContinued_studies <em>Continued studies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Continued studies</em>'.
	 * @see TaxationWithRoot.Dependent#isContinued_studies()
	 * @see #getDependent()
	 * @generated
	 */
	EAttribute getDependent_Continued_studies();

	/**
	 * Returns the meta object for the containment reference '{@link TaxationWithRoot.Dependent#getAllowances <em>Allowances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Allowances</em>'.
	 * @see TaxationWithRoot.Dependent#getAllowances()
	 * @see #getDependent()
	 * @generated
	 */
	EReference getDependent_Allowances();

	/**
	 * Returns the meta object for the container reference '{@link TaxationWithRoot.Dependent#getHousehold <em>Household</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Household</em>'.
	 * @see TaxationWithRoot.Dependent#getHousehold()
	 * @see #getDependent()
	 * @generated
	 */
	EReference getDependent_Household();

	/**
	 * Returns the meta object for the reference '{@link TaxationWithRoot.Dependent#getFrom_agent <em>From agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From agent</em>'.
	 * @see TaxationWithRoot.Dependent#getFrom_agent()
	 * @see #getDependent()
	 * @generated
	 */
	EReference getDependent_From_agent();

	/**
	 * Returns the meta object for the reference list '{@link TaxationWithRoot.Dependent#getExpense <em>Expense</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Expense</em>'.
	 * @see TaxationWithRoot.Dependent#getExpense()
	 * @see #getDependent()
	 * @generated
	 */
	EReference getDependent_Expense();

	/**
	 * Returns the meta object for class '{@link TaxationWithRoot.External_Allowance <em>External Allowance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Allowance</em>'.
	 * @see TaxationWithRoot.External_Allowance
	 * @generated
	 */
	EClass getExternal_Allowance();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.External_Allowance#getGrantor <em>Grantor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grantor</em>'.
	 * @see TaxationWithRoot.External_Allowance#getGrantor()
	 * @see #getExternal_Allowance()
	 * @generated
	 */
	EAttribute getExternal_Allowance_Grantor();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.External_Allowance#getStarting_year <em>Starting year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Starting year</em>'.
	 * @see TaxationWithRoot.External_Allowance#getStarting_year()
	 * @see #getExternal_Allowance()
	 * @generated
	 */
	EAttribute getExternal_Allowance_Starting_year();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.External_Allowance#getEnding_year <em>Ending year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ending year</em>'.
	 * @see TaxationWithRoot.External_Allowance#getEnding_year()
	 * @see #getExternal_Allowance()
	 * @generated
	 */
	EAttribute getExternal_Allowance_Ending_year();

	/**
	 * Returns the meta object for the reference '{@link TaxationWithRoot.External_Allowance#getReciver <em>Reciver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reciver</em>'.
	 * @see TaxationWithRoot.External_Allowance#getReciver()
	 * @see #getExternal_Allowance()
	 * @generated
	 */
	EReference getExternal_Allowance_Reciver();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.External_Allowance#getId5 <em>Id5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id5</em>'.
	 * @see TaxationWithRoot.External_Allowance#getId5()
	 * @see #getExternal_Allowance()
	 * @generated
	 */
	EAttribute getExternal_Allowance_Id5();

	/**
	 * Returns the meta object for the container reference '{@link TaxationWithRoot.External_Allowance#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Person</em>'.
	 * @see TaxationWithRoot.External_Allowance#getPerson()
	 * @see #getExternal_Allowance()
	 * @generated
	 */
	EReference getExternal_Allowance_Person();

	/**
	 * Returns the meta object for class '{@link TaxationWithRoot.Household <em>Household</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Household</em>'.
	 * @see TaxationWithRoot.Household
	 * @generated
	 */
	EClass getHousehold();

	/**
	 * Returns the meta object for the containment reference '{@link TaxationWithRoot.Household#getParents <em>Parents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parents</em>'.
	 * @see TaxationWithRoot.Household#getParents()
	 * @see #getHousehold()
	 * @generated
	 */
	EReference getHousehold_Parents();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Household#getId1 <em>Id1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id1</em>'.
	 * @see TaxationWithRoot.Household#getId1()
	 * @see #getHousehold()
	 * @generated
	 */
	EAttribute getHousehold_Id1();

	/**
	 * Returns the meta object for the containment reference list '{@link TaxationWithRoot.Household#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see TaxationWithRoot.Household#getChildren()
	 * @see #getHousehold()
	 * @generated
	 */
	EReference getHousehold_Children();

	/**
	 * Returns the meta object for class '{@link TaxationWithRoot.Legal_Union_Record <em>Legal Union Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legal Union Record</em>'.
	 * @see TaxationWithRoot.Legal_Union_Record
	 * @generated
	 */
	EClass getLegal_Union_Record();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Legal_Union_Record#getStart_year <em>Start year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start year</em>'.
	 * @see TaxationWithRoot.Legal_Union_Record#getStart_year()
	 * @see #getLegal_Union_Record()
	 * @generated
	 */
	EAttribute getLegal_Union_Record_Start_year();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Legal_Union_Record#getEnd_year <em>End year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End year</em>'.
	 * @see TaxationWithRoot.Legal_Union_Record#getEnd_year()
	 * @see #getLegal_Union_Record()
	 * @generated
	 */
	EAttribute getLegal_Union_Record_End_year();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Legal_Union_Record#getSeparation_cause <em>Separation cause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Separation cause</em>'.
	 * @see TaxationWithRoot.Legal_Union_Record#getSeparation_cause()
	 * @see #getLegal_Union_Record()
	 * @generated
	 */
	EAttribute getLegal_Union_Record_Separation_cause();

	/**
	 * Returns the meta object for the containment reference '{@link TaxationWithRoot.Legal_Union_Record#getIndividual_A <em>Individual A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Individual A</em>'.
	 * @see TaxationWithRoot.Legal_Union_Record#getIndividual_A()
	 * @see #getLegal_Union_Record()
	 * @generated
	 */
	EReference getLegal_Union_Record_Individual_A();

	/**
	 * Returns the meta object for the containment reference list '{@link TaxationWithRoot.Legal_Union_Record#getIndividual_B <em>Individual B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Individual B</em>'.
	 * @see TaxationWithRoot.Legal_Union_Record#getIndividual_B()
	 * @see #getLegal_Union_Record()
	 * @generated
	 */
	EReference getLegal_Union_Record_Individual_B();

	/**
	 * Returns the meta object for the containment reference list '{@link TaxationWithRoot.Legal_Union_Record#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see TaxationWithRoot.Legal_Union_Record#getProperties()
	 * @see #getLegal_Union_Record()
	 * @generated
	 */
	EReference getLegal_Union_Record_Properties();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Legal_Union_Record#isMutual_agreement <em>Mutual agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mutual agreement</em>'.
	 * @see TaxationWithRoot.Legal_Union_Record#isMutual_agreement()
	 * @see #getLegal_Union_Record()
	 * @generated
	 */
	EAttribute getLegal_Union_Record_Mutual_agreement();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Legal_Union_Record#getId9 <em>Id9</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id9</em>'.
	 * @see TaxationWithRoot.Legal_Union_Record#getId9()
	 * @see #getLegal_Union_Record()
	 * @generated
	 */
	EAttribute getLegal_Union_Record_Id9();

	/**
	 * Returns the meta object for the container reference '{@link TaxationWithRoot.Legal_Union_Record#getHousehold <em>Household</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Household</em>'.
	 * @see TaxationWithRoot.Legal_Union_Record#getHousehold()
	 * @see #getLegal_Union_Record()
	 * @generated
	 */
	EReference getLegal_Union_Record_Household();

	/**
	 * Returns the meta object for class '{@link TaxationWithRoot.Tax_Property <em>Tax Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tax Property</em>'.
	 * @see TaxationWithRoot.Tax_Property
	 * @generated
	 */
	EClass getTax_Property();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Tax_Property#getStarting_year <em>Starting year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Starting year</em>'.
	 * @see TaxationWithRoot.Tax_Property#getStarting_year()
	 * @see #getTax_Property()
	 * @generated
	 */
	EAttribute getTax_Property_Starting_year();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Tax_Property#getId10 <em>Id10</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id10</em>'.
	 * @see TaxationWithRoot.Tax_Property#getId10()
	 * @see #getTax_Property()
	 * @generated
	 */
	EAttribute getTax_Property_Id10();

	/**
	 * Returns the meta object for the container reference '{@link TaxationWithRoot.Tax_Property#getUnion_record <em>Union record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Union record</em>'.
	 * @see TaxationWithRoot.Tax_Property#getUnion_record()
	 * @see #getTax_Property()
	 * @generated
	 */
	EReference getTax_Property_Union_record();

	/**
	 * Returns the meta object for class '{@link TaxationWithRoot.Tax_Case <em>Tax Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tax Case</em>'.
	 * @see TaxationWithRoot.Tax_Case
	 * @generated
	 */
	EClass getTax_Case();

	/**
	 * Returns the meta object for class '{@link TaxationWithRoot.FromAgent <em>From Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>From Agent</em>'.
	 * @see TaxationWithRoot.FromAgent
	 * @generated
	 */
	EClass getFromAgent();

	/**
	 * Returns the meta object for the container reference '{@link TaxationWithRoot.FromAgent#getTaxPayer <em>Tax Payer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Tax Payer</em>'.
	 * @see TaxationWithRoot.FromAgent#getTaxPayer()
	 * @see #getFromAgent()
	 * @generated
	 */
	EReference getFromAgent_TaxPayer();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.FromAgent#isIs_dependent_eligible_for_CE_Not_In_Houshold_Children_Care <em>Is dependent eligible for CE Not In Houshold Children Care</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is dependent eligible for CE Not In Houshold Children Care</em>'.
	 * @see TaxationWithRoot.FromAgent#isIs_dependent_eligible_for_CE_Not_In_Houshold_Children_Care()
	 * @see #getFromAgent()
	 * @generated
	 */
	EAttribute getFromAgent_Is_dependent_eligible_for_CE_Not_In_Houshold_Children_Care();

	/**
	 * Returns the meta object for the reference '{@link TaxationWithRoot.FromAgent#getExpense <em>Expense</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expense</em>'.
	 * @see TaxationWithRoot.FromAgent#getExpense()
	 * @see #getFromAgent()
	 * @generated
	 */
	EReference getFromAgent_Expense();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.FromAgent#isIs_eligible_debt <em>Is eligible debt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is eligible debt</em>'.
	 * @see TaxationWithRoot.FromAgent#isIs_eligible_debt()
	 * @see #getFromAgent()
	 * @generated
	 */
	EAttribute getFromAgent_Is_eligible_debt();

	/**
	 * Returns the meta object for the reference '{@link TaxationWithRoot.FromAgent#getDependent <em>Dependent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dependent</em>'.
	 * @see TaxationWithRoot.FromAgent#getDependent()
	 * @see #getFromAgent()
	 * @generated
	 */
	EReference getFromAgent_Dependent();

	/**
	 * Returns the meta object for class '{@link TaxationWithRoot.Income <em>Income</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Income</em>'.
	 * @see TaxationWithRoot.Income
	 * @generated
	 */
	EClass getIncome();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Income#getIncome_amount <em>Income amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Income amount</em>'.
	 * @see TaxationWithRoot.Income#getIncome_amount()
	 * @see #getIncome()
	 * @generated
	 */
	EAttribute getIncome_Income_amount();

	/**
	 * Returns the meta object for the containment reference '{@link TaxationWithRoot.Income#getIncome_type <em>Income type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Income type</em>'.
	 * @see TaxationWithRoot.Income#getIncome_type()
	 * @see #getIncome()
	 * @generated
	 */
	EReference getIncome_Income_type();

	/**
	 * Returns the meta object for the containment reference '{@link TaxationWithRoot.Income#getTax_card <em>Tax card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tax card</em>'.
	 * @see TaxationWithRoot.Income#getTax_card()
	 * @see #getIncome()
	 * @generated
	 */
	EReference getIncome_Tax_card();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Income#getTax_liability <em>Tax liability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax liability</em>'.
	 * @see TaxationWithRoot.Income#getTax_liability()
	 * @see #getIncome()
	 * @generated
	 */
	EAttribute getIncome_Tax_liability();

	/**
	 * Returns the meta object for the container reference '{@link TaxationWithRoot.Income#getTaxPayer <em>Tax Payer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Tax Payer</em>'.
	 * @see TaxationWithRoot.Income#getTaxPayer()
	 * @see #getIncome()
	 * @generated
	 */
	EReference getIncome_TaxPayer();

	/**
	 * Returns the meta object for the containment reference list '{@link TaxationWithRoot.Income#getDetails <em>Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Details</em>'.
	 * @see TaxationWithRoot.Income#getDetails()
	 * @see #getIncome()
	 * @generated
	 */
	EReference getIncome_Details();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Income#getNum <em>Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num</em>'.
	 * @see TaxationWithRoot.Income#getNum()
	 * @see #getIncome()
	 * @generated
	 */
	EAttribute getIncome_Num();

	/**
	 * Returns the meta object for the containment reference list '{@link TaxationWithRoot.Income#getExpenses <em>Expenses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expenses</em>'.
	 * @see TaxationWithRoot.Income#getExpenses()
	 * @see #getIncome()
	 * @generated
	 */
	EReference getIncome_Expenses();

	/**
	 * Returns the meta object for class '{@link TaxationWithRoot.Income_Type <em>Income Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Income Type</em>'.
	 * @see TaxationWithRoot.Income_Type
	 * @generated
	 */
	EClass getIncome_Type();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Income_Type#getId8 <em>Id8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id8</em>'.
	 * @see TaxationWithRoot.Income_Type#getId8()
	 * @see #getIncome_Type()
	 * @generated
	 */
	EAttribute getIncome_Type_Id8();

	/**
	 * Returns the meta object for the container reference '{@link TaxationWithRoot.Income_Type#getIncome <em>Income</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Income</em>'.
	 * @see TaxationWithRoot.Income_Type#getIncome()
	 * @see #getIncome_Type()
	 * @generated
	 */
	EReference getIncome_Type_Income();

	/**
	 * Returns the meta object for class '{@link TaxationWithRoot.Tax_Card <em>Tax Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tax Card</em>'.
	 * @see TaxationWithRoot.Tax_Card
	 * @generated
	 */
	EClass getTax_Card();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Tax_Card#getCard_identifier <em>Card identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Card identifier</em>'.
	 * @see TaxationWithRoot.Tax_Card#getCard_identifier()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Card_identifier();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Tax_Card#getTax_office <em>Tax office</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax office</em>'.
	 * @see TaxationWithRoot.Tax_Card#getTax_office()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Tax_office();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Tax_Card#getPercentage_of_witholding <em>Percentage of witholding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage of witholding</em>'.
	 * @see TaxationWithRoot.Tax_Card#getPercentage_of_witholding()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Percentage_of_witholding();

	/**
	 * Returns the meta object for the attribute list '{@link TaxationWithRoot.Tax_Card#getTax_payers_name_surname <em>Tax payers name surname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tax payers name surname</em>'.
	 * @see TaxationWithRoot.Tax_Card#getTax_payers_name_surname()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Tax_payers_name_surname();

	/**
	 * Returns the meta object for the attribute list '{@link TaxationWithRoot.Tax_Card#getTax_payers_partner_name_surname <em>Tax payers partner name surname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tax payers partner name surname</em>'.
	 * @see TaxationWithRoot.Tax_Card#getTax_payers_partner_name_surname()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Tax_payers_partner_name_surname();

	/**
	 * Returns the meta object for the reference '{@link TaxationWithRoot.Tax_Card#getTax_payers_address <em>Tax payers address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tax payers address</em>'.
	 * @see TaxationWithRoot.Tax_Card#getTax_payers_address()
	 * @see #getTax_Card()
	 * @generated
	 */
	EReference getTax_Card_Tax_payers_address();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Tax_Card#getJobs_Employer_SSNo <em>Jobs Employer SS No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jobs Employer SS No</em>'.
	 * @see TaxationWithRoot.Tax_Card#getJobs_Employer_SSNo()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Jobs_Employer_SSNo();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Tax_Card#getJobs_employers_name <em>Jobs employers name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jobs employers name</em>'.
	 * @see TaxationWithRoot.Tax_Card#getJobs_employers_name()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Jobs_employers_name();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Tax_Card#getJobs_activity_type <em>Jobs activity type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jobs activity type</em>'.
	 * @see TaxationWithRoot.Tax_Card#getJobs_activity_type()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Jobs_activity_type();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Tax_Card#getJobs_place_of_work <em>Jobs place of work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jobs place of work</em>'.
	 * @see TaxationWithRoot.Tax_Card#getJobs_place_of_work()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Jobs_place_of_work();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Tax_Card#getDeduction_FD_daily <em>Deduction FD daily</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deduction FD daily</em>'.
	 * @see TaxationWithRoot.Tax_Card#getDeduction_FD_daily()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Deduction_FD_daily();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Tax_Card#getDeduction_FD_monthly <em>Deduction FD monthly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deduction FD monthly</em>'.
	 * @see TaxationWithRoot.Tax_Card#getDeduction_FD_monthly()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Deduction_FD_monthly();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Tax_Card#getDeduction_AC_daily <em>Deduction AC daily</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deduction AC daily</em>'.
	 * @see TaxationWithRoot.Tax_Card#getDeduction_AC_daily()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Deduction_AC_daily();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Tax_Card#getDeduction_AC_monthly <em>Deduction AC monthly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deduction AC monthly</em>'.
	 * @see TaxationWithRoot.Tax_Card#getDeduction_AC_monthly()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Deduction_AC_monthly();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Tax_Card#getDeduction_AC_yearly <em>Deduction AC yearly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deduction AC yearly</em>'.
	 * @see TaxationWithRoot.Tax_Card#getDeduction_AC_yearly()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Deduction_AC_yearly();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Tax_Card#getDeduction_CE_daily <em>Deduction CE daily</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deduction CE daily</em>'.
	 * @see TaxationWithRoot.Tax_Card#getDeduction_CE_daily()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Deduction_CE_daily();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Tax_Card#getDeduction_CE_monthly <em>Deduction CE monthly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deduction CE monthly</em>'.
	 * @see TaxationWithRoot.Tax_Card#getDeduction_CE_monthly()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Deduction_CE_monthly();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Tax_Card#getDeduction_CE_yearly <em>Deduction CE yearly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deduction CE yearly</em>'.
	 * @see TaxationWithRoot.Tax_Card#getDeduction_CE_yearly()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Deduction_CE_yearly();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Tax_Card#getDeduction_DS_daily <em>Deduction DS daily</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deduction DS daily</em>'.
	 * @see TaxationWithRoot.Tax_Card#getDeduction_DS_daily()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Deduction_DS_daily();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Tax_Card#getDeduction_DS_monthly <em>Deduction DS monthly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deduction DS monthly</em>'.
	 * @see TaxationWithRoot.Tax_Card#getDeduction_DS_monthly()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Deduction_DS_monthly();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Tax_Card#getDeduction_FO_daily <em>Deduction FO daily</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deduction FO daily</em>'.
	 * @see TaxationWithRoot.Tax_Card#getDeduction_FO_daily()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Deduction_FO_daily();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Tax_Card#getDeduction_FO_monthly <em>Deduction FO monthly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deduction FO monthly</em>'.
	 * @see TaxationWithRoot.Tax_Card#getDeduction_FO_monthly()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Deduction_FO_monthly();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Tax_Card#getDeduction_FO_yearly <em>Deduction FO yearly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deduction FO yearly</em>'.
	 * @see TaxationWithRoot.Tax_Card#getDeduction_FO_yearly()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Deduction_FO_yearly();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Tax_Card#getCredit_CIS_daily <em>Credit CIS daily</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credit CIS daily</em>'.
	 * @see TaxationWithRoot.Tax_Card#getCredit_CIS_daily()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Credit_CIS_daily();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Tax_Card#getCredit_CIS_monthly <em>Credit CIS monthly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credit CIS monthly</em>'.
	 * @see TaxationWithRoot.Tax_Card#getCredit_CIS_monthly()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Credit_CIS_monthly();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Tax_Card#getCredit_CIM_daily <em>Credit CIM daily</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credit CIM daily</em>'.
	 * @see TaxationWithRoot.Tax_Card#getCredit_CIM_daily()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Credit_CIM_daily();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Tax_Card#isValidity <em>Validity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validity</em>'.
	 * @see TaxationWithRoot.Tax_Card#isValidity()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Validity();

	/**
	 * Returns the meta object for the reference list '{@link TaxationWithRoot.Tax_Card#getIncome_Tax_Credit <em>Income Tax Credit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Income Tax Credit</em>'.
	 * @see TaxationWithRoot.Tax_Card#getIncome_Tax_Credit()
	 * @see #getTax_Card()
	 * @generated
	 */
	EReference getTax_Card_Income_Tax_Credit();

	/**
	 * Returns the meta object for the reference '{@link TaxationWithRoot.Tax_Card#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous</em>'.
	 * @see TaxationWithRoot.Tax_Card#getPrevious()
	 * @see #getTax_Card()
	 * @generated
	 */
	EReference getTax_Card_Previous();

	/**
	 * Returns the meta object for the reference '{@link TaxationWithRoot.Tax_Card#getCurrent_tax_card <em>Current tax card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current tax card</em>'.
	 * @see TaxationWithRoot.Tax_Card#getCurrent_tax_card()
	 * @see #getTax_Card()
	 * @generated
	 */
	EReference getTax_Card_Current_tax_card();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Tax_Card#getCredit_CIM_yearly <em>Credit CIM yearly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credit CIM yearly</em>'.
	 * @see TaxationWithRoot.Tax_Card#getCredit_CIM_yearly()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Credit_CIM_yearly();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Tax_Card#getDeduction_DS_Alimony_yearly <em>Deduction DS Alimony yearly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deduction DS Alimony yearly</em>'.
	 * @see TaxationWithRoot.Tax_Card#getDeduction_DS_Alimony_yearly()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Deduction_DS_Alimony_yearly();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Tax_Card#getDeduction_DS_Debt_yearly <em>Deduction DS Debt yearly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deduction DS Debt yearly</em>'.
	 * @see TaxationWithRoot.Tax_Card#getDeduction_DS_Debt_yearly()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Deduction_DS_Debt_yearly();

	/**
	 * Returns the meta object for the container reference '{@link TaxationWithRoot.Tax_Card#getIncome <em>Income</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Income</em>'.
	 * @see TaxationWithRoot.Tax_Card#getIncome()
	 * @see #getTax_Card()
	 * @generated
	 */
	EReference getTax_Card_Income();

	/**
	 * Returns the meta object for class '{@link TaxationWithRoot.Income_Tax_Credit <em>Income Tax Credit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Income Tax Credit</em>'.
	 * @see TaxationWithRoot.Income_Tax_Credit
	 * @generated
	 */
	EClass getIncome_Tax_Credit();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Income_Tax_Credit#getGrantedBy <em>Granted By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Granted By</em>'.
	 * @see TaxationWithRoot.Income_Tax_Credit#getGrantedBy()
	 * @see #getIncome_Tax_Credit()
	 * @generated
	 */
	EAttribute getIncome_Tax_Credit_GrantedBy();

	/**
	 * Returns the meta object for the reference '{@link TaxationWithRoot.Income_Tax_Credit#getTaxPayer <em>Tax Payer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tax Payer</em>'.
	 * @see TaxationWithRoot.Income_Tax_Credit#getTaxPayer()
	 * @see #getIncome_Tax_Credit()
	 * @generated
	 */
	EReference getIncome_Tax_Credit_TaxPayer();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Income_Tax_Credit#getTax_year <em>Tax year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax year</em>'.
	 * @see TaxationWithRoot.Income_Tax_Credit#getTax_year()
	 * @see #getIncome_Tax_Credit()
	 * @generated
	 */
	EAttribute getIncome_Tax_Credit_Tax_year();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Income_Tax_Credit#getYearly <em>Yearly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Yearly</em>'.
	 * @see TaxationWithRoot.Income_Tax_Credit#getYearly()
	 * @see #getIncome_Tax_Credit()
	 * @generated
	 */
	EAttribute getIncome_Tax_Credit_Yearly();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Income_Tax_Credit#getMonthly <em>Monthly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monthly</em>'.
	 * @see TaxationWithRoot.Income_Tax_Credit#getMonthly()
	 * @see #getIncome_Tax_Credit()
	 * @generated
	 */
	EAttribute getIncome_Tax_Credit_Monthly();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Income_Tax_Credit#getDaily <em>Daily</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Daily</em>'.
	 * @see TaxationWithRoot.Income_Tax_Credit#getDaily()
	 * @see #getIncome_Tax_Credit()
	 * @generated
	 */
	EAttribute getIncome_Tax_Credit_Daily();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Income_Tax_Credit#getId7 <em>Id7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id7</em>'.
	 * @see TaxationWithRoot.Income_Tax_Credit#getId7()
	 * @see #getIncome_Tax_Credit()
	 * @generated
	 */
	EAttribute getIncome_Tax_Credit_Id7();

	/**
	 * Returns the meta object for the reference '{@link TaxationWithRoot.Income_Tax_Credit#getTaxation_Frame <em>Taxation Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Taxation Frame</em>'.
	 * @see TaxationWithRoot.Income_Tax_Credit#getTaxation_Frame()
	 * @see #getIncome_Tax_Credit()
	 * @generated
	 */
	EReference getIncome_Tax_Credit_Taxation_Frame();

	/**
	 * Returns the meta object for class '{@link TaxationWithRoot.Income_Detail <em>Income Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Income Detail</em>'.
	 * @see TaxationWithRoot.Income_Detail
	 * @generated
	 */
	EClass getIncome_Detail();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Income_Detail#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see TaxationWithRoot.Income_Detail#getAmount()
	 * @see #getIncome_Detail()
	 * @generated
	 */
	EAttribute getIncome_Detail_Amount();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Income_Detail#isIs_worked <em>Is worked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is worked</em>'.
	 * @see TaxationWithRoot.Income_Detail#isIs_worked()
	 * @see #getIncome_Detail()
	 * @generated
	 */
	EAttribute getIncome_Detail_Is_worked();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Income_Detail#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see TaxationWithRoot.Income_Detail#getDistance()
	 * @see #getIncome_Detail()
	 * @generated
	 */
	EAttribute getIncome_Detail_Distance();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Income_Detail#getWorked_days <em>Worked days</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Worked days</em>'.
	 * @see TaxationWithRoot.Income_Detail#getWorked_days()
	 * @see #getIncome_Detail()
	 * @generated
	 */
	EAttribute getIncome_Detail_Worked_days();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Income_Detail#isIs_contributing_CNS <em>Is contributing CNS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is contributing CNS</em>'.
	 * @see TaxationWithRoot.Income_Detail#isIs_contributing_CNS()
	 * @see #getIncome_Detail()
	 * @generated
	 */
	EAttribute getIncome_Detail_Is_contributing_CNS();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Income_Detail#getId5 <em>Id5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id5</em>'.
	 * @see TaxationWithRoot.Income_Detail#getId5()
	 * @see #getIncome_Detail()
	 * @generated
	 */
	EAttribute getIncome_Detail_Id5();

	/**
	 * Returns the meta object for the container reference '{@link TaxationWithRoot.Income_Detail#getIncome <em>Income</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Income</em>'.
	 * @see TaxationWithRoot.Income_Detail#getIncome()
	 * @see #getIncome_Detail()
	 * @generated
	 */
	EReference getIncome_Detail_Income();

	/**
	 * Returns the meta object for class '{@link TaxationWithRoot.FromLaw <em>From Law</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>From Law</em>'.
	 * @see TaxationWithRoot.FromLaw
	 * @generated
	 */
	EClass getFromLaw();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.FromLaw#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see TaxationWithRoot.FromLaw#getId()
	 * @see #getFromLaw()
	 * @generated
	 */
	EAttribute getFromLaw_Id();

	/**
	 * Returns the meta object for the container reference '{@link TaxationWithRoot.FromLaw#getTaxPayer <em>Tax Payer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Tax Payer</em>'.
	 * @see TaxationWithRoot.FromLaw#getTaxPayer()
	 * @see #getFromLaw()
	 * @generated
	 */
	EReference getFromLaw_TaxPayer();

	/**
	 * Returns the meta object for class '{@link TaxationWithRoot.Fiscal_Address <em>Fiscal Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fiscal Address</em>'.
	 * @see TaxationWithRoot.Fiscal_Address
	 * @generated
	 */
	EClass getFiscal_Address();

	/**
	 * Returns the meta object for class '{@link TaxationWithRoot.Habitual_Address <em>Habitual Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Habitual Address</em>'.
	 * @see TaxationWithRoot.Habitual_Address
	 * @generated
	 */
	EClass getHabitual_Address();

	/**
	 * Returns the meta object for class '{@link TaxationWithRoot.Marriage_Record <em>Marriage Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marriage Record</em>'.
	 * @see TaxationWithRoot.Marriage_Record
	 * @generated
	 */
	EClass getMarriage_Record();

	/**
	 * Returns the meta object for class '{@link TaxationWithRoot.Non_Resident_Tax_Payer <em>Non Resident Tax Payer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Resident Tax Payer</em>'.
	 * @see TaxationWithRoot.Non_Resident_Tax_Payer
	 * @generated
	 */
	EClass getNon_Resident_Tax_Payer();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Non_Resident_Tax_Payer#isIs_assimilated_to_resident <em>Is assimilated to resident</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is assimilated to resident</em>'.
	 * @see TaxationWithRoot.Non_Resident_Tax_Payer#isIs_assimilated_to_resident()
	 * @see #getNon_Resident_Tax_Payer()
	 * @generated
	 */
	EAttribute getNon_Resident_Tax_Payer_Is_assimilated_to_resident();

	/**
	 * Returns the meta object for class '{@link TaxationWithRoot.Partnership_Record <em>Partnership Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partnership Record</em>'.
	 * @see TaxationWithRoot.Partnership_Record
	 * @generated
	 */
	EClass getPartnership_Record();

	/**
	 * Returns the meta object for class '{@link TaxationWithRoot.Resident_Tax_Payer <em>Resident Tax Payer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resident Tax Payer</em>'.
	 * @see TaxationWithRoot.Resident_Tax_Payer
	 * @generated
	 */
	EClass getResident_Tax_Payer();

	/**
	 * Returns the meta object for class '{@link TaxationWithRoot.Trade_and_Business_Income <em>Trade and Business Income</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trade and Business Income</em>'.
	 * @see TaxationWithRoot.Trade_and_Business_Income
	 * @generated
	 */
	EClass getTrade_and_Business_Income();

	/**
	 * Returns the meta object for class '{@link TaxationWithRoot.Agriculture_and_Forestry_Income <em>Agriculture and Forestry Income</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agriculture and Forestry Income</em>'.
	 * @see TaxationWithRoot.Agriculture_and_Forestry_Income
	 * @generated
	 */
	EClass getAgriculture_and_Forestry_Income();

	/**
	 * Returns the meta object for class '{@link TaxationWithRoot.Pensions_and_Annuities_Income <em>Pensions and Annuities Income</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pensions and Annuities Income</em>'.
	 * @see TaxationWithRoot.Pensions_and_Annuities_Income
	 * @generated
	 */
	EClass getPensions_and_Annuities_Income();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Pensions_and_Annuities_Income#isOccasional_payement <em>Occasional payement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occasional payement</em>'.
	 * @see TaxationWithRoot.Pensions_and_Annuities_Income#isOccasional_payement()
	 * @see #getPensions_and_Annuities_Income()
	 * @generated
	 */
	EAttribute getPensions_and_Annuities_Income_Occasional_payement();

	/**
	 * Returns the meta object for class '{@link TaxationWithRoot.Capital_and_Investments_Income <em>Capital and Investments Income</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capital and Investments Income</em>'.
	 * @see TaxationWithRoot.Capital_and_Investments_Income
	 * @generated
	 */
	EClass getCapital_and_Investments_Income();

	/**
	 * Returns the meta object for class '{@link TaxationWithRoot.Employment_Income <em>Employment Income</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employment Income</em>'.
	 * @see TaxationWithRoot.Employment_Income
	 * @generated
	 */
	EClass getEmployment_Income();

	/**
	 * Returns the meta object for class '{@link TaxationWithRoot.Rentals_and_Leases_Income <em>Rentals and Leases Income</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rentals and Leases Income</em>'.
	 * @see TaxationWithRoot.Rentals_and_Leases_Income
	 * @generated
	 */
	EClass getRentals_and_Leases_Income();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Rentals_and_Leases_Income#isIs_periodic <em>Is periodic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is periodic</em>'.
	 * @see TaxationWithRoot.Rentals_and_Leases_Income#isIs_periodic()
	 * @see #getRentals_and_Leases_Income()
	 * @generated
	 */
	EAttribute getRentals_and_Leases_Income_Is_periodic();

	/**
	 * Returns the meta object for class '{@link TaxationWithRoot.Foreign_Income <em>Foreign Income</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Foreign Income</em>'.
	 * @see TaxationWithRoot.Foreign_Income
	 * @generated
	 */
	EClass getForeign_Income();

	/**
	 * Returns the meta object for class '{@link TaxationWithRoot.Local_Income <em>Local Income</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Income</em>'.
	 * @see TaxationWithRoot.Local_Income
	 * @generated
	 */
	EClass getLocal_Income();

	/**
	 * Returns the meta object for class '{@link TaxationWithRoot.CIM <em>CIM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CIM</em>'.
	 * @see TaxationWithRoot.CIM
	 * @generated
	 */
	EClass getCIM();

	/**
	 * Returns the meta object for class '{@link TaxationWithRoot.CIP <em>CIP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CIP</em>'.
	 * @see TaxationWithRoot.CIP
	 * @generated
	 */
	EClass getCIP();

	/**
	 * Returns the meta object for class '{@link TaxationWithRoot.CIS <em>CIS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CIS</em>'.
	 * @see TaxationWithRoot.CIS
	 * @generated
	 */
	EClass getCIS();

	/**
	 * Returns the meta object for class '{@link TaxationWithRoot.Permanent_Expense <em>Permanent Expense</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Permanent Expense</em>'.
	 * @see TaxationWithRoot.Permanent_Expense
	 * @generated
	 */
	EClass getPermanent_Expense();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Permanent_Expense#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see TaxationWithRoot.Permanent_Expense#getCategory()
	 * @see #getPermanent_Expense()
	 * @generated
	 */
	EAttribute getPermanent_Expense_Category();

	/**
	 * Returns the meta object for class '{@link TaxationWithRoot.Special_Expense_DS <em>Special Expense DS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Special Expense DS</em>'.
	 * @see TaxationWithRoot.Special_Expense_DS
	 * @generated
	 */
	EClass getSpecial_Expense_DS();

	/**
	 * Returns the meta object for class '{@link TaxationWithRoot.Interest_Expense <em>Interest Expense</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interest Expense</em>'.
	 * @see TaxationWithRoot.Interest_Expense
	 * @generated
	 */
	EClass getInterest_Expense();

	/**
	 * Returns the meta object for class '{@link TaxationWithRoot.Private_Insurance_and_Plan <em>Private Insurance and Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Private Insurance and Plan</em>'.
	 * @see TaxationWithRoot.Private_Insurance_and_Plan
	 * @generated
	 */
	EClass getPrivate_Insurance_and_Plan();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Private_Insurance_and_Plan#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see TaxationWithRoot.Private_Insurance_and_Plan#getCategory()
	 * @see #getPrivate_Insurance_and_Plan()
	 * @generated
	 */
	EAttribute getPrivate_Insurance_and_Plan_Category();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Private_Insurance_and_Plan#getDuration_of_contract <em>Duration of contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration of contract</em>'.
	 * @see TaxationWithRoot.Private_Insurance_and_Plan#getDuration_of_contract()
	 * @see #getPrivate_Insurance_and_Plan()
	 * @generated
	 */
	EAttribute getPrivate_Insurance_and_Plan_Duration_of_contract();

	/**
	 * Returns the meta object for class '{@link TaxationWithRoot.Health_and_Pension_Insurance <em>Health and Pension Insurance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Health and Pension Insurance</em>'.
	 * @see TaxationWithRoot.Health_and_Pension_Insurance
	 * @generated
	 */
	EClass getHealth_and_Pension_Insurance();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Health_and_Pension_Insurance#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see TaxationWithRoot.Health_and_Pension_Insurance#getCategory()
	 * @see #getHealth_and_Pension_Insurance()
	 * @generated
	 */
	EAttribute getHealth_and_Pension_Insurance_Category();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Health_and_Pension_Insurance#isIs_related_to_additional_salary <em>Is related to additional salary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is related to additional salary</em>'.
	 * @see TaxationWithRoot.Health_and_Pension_Insurance#isIs_related_to_additional_salary()
	 * @see #getHealth_and_Pension_Insurance()
	 * @generated
	 */
	EAttribute getHealth_and_Pension_Insurance_Is_related_to_additional_salary();

	/**
	 * Returns the meta object for class '{@link TaxationWithRoot.Donation <em>Donation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Donation</em>'.
	 * @see TaxationWithRoot.Donation
	 * @generated
	 */
	EClass getDonation();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Donation#getBeneficiary1 <em>Beneficiary1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beneficiary1</em>'.
	 * @see TaxationWithRoot.Donation#getBeneficiary1()
	 * @see #getDonation()
	 * @generated
	 */
	EAttribute getDonation_Beneficiary1();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Donation#isIs_donation_reported <em>Is donation reported</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is donation reported</em>'.
	 * @see TaxationWithRoot.Donation#isIs_donation_reported()
	 * @see #getDonation()
	 * @generated
	 */
	EAttribute getDonation_Is_donation_reported();

	/**
	 * Returns the meta object for class '{@link TaxationWithRoot.Loss_Carryforward <em>Loss Carryforward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loss Carryforward</em>'.
	 * @see TaxationWithRoot.Loss_Carryforward
	 * @generated
	 */
	EClass getLoss_Carryforward();

	/**
	 * Returns the meta object for class '{@link TaxationWithRoot.Spousal_Expense_AC <em>Spousal Expense AC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spousal Expense AC</em>'.
	 * @see TaxationWithRoot.Spousal_Expense_AC
	 * @generated
	 */
	EClass getSpousal_Expense_AC();

	/**
	 * Returns the meta object for class '{@link TaxationWithRoot.Extraordinary_Expense_CE <em>Extraordinary Expense CE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extraordinary Expense CE</em>'.
	 * @see TaxationWithRoot.Extraordinary_Expense_CE
	 * @generated
	 */
	EClass getExtraordinary_Expense_CE();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Extraordinary_Expense_CE#getThresholded_deduction_percentage <em>Thresholded deduction percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thresholded deduction percentage</em>'.
	 * @see TaxationWithRoot.Extraordinary_Expense_CE#getThresholded_deduction_percentage()
	 * @see #getExtraordinary_Expense_CE()
	 * @generated
	 */
	EAttribute getExtraordinary_Expense_CE_Thresholded_deduction_percentage();

	/**
	 * Returns the meta object for the attribute '{@link TaxationWithRoot.Extraordinary_Expense_CE#getCe_type <em>Ce type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ce type</em>'.
	 * @see TaxationWithRoot.Extraordinary_Expense_CE#getCe_type()
	 * @see #getExtraordinary_Expense_CE()
	 * @generated
	 */
	EAttribute getExtraordinary_Expense_CE_Ce_type();

	/**
	 * Returns the meta object for class '{@link TaxationWithRoot.Travel_Expense_FD <em>Travel Expense FD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Travel Expense FD</em>'.
	 * @see TaxationWithRoot.Travel_Expense_FD
	 * @generated
	 */
	EClass getTravel_Expense_FD();

	/**
	 * Returns the meta object for class '{@link TaxationWithRoot.Professional_Expense <em>Professional Expense</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Professional Expense</em>'.
	 * @see TaxationWithRoot.Professional_Expense
	 * @generated
	 */
	EClass getProfessional_Expense();

	/**
	 * Returns the meta object for class '{@link TaxationWithRoot.Miscellaneous_Expense_FO <em>Miscellaneous Expense FO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Miscellaneous Expense FO</em>'.
	 * @see TaxationWithRoot.Miscellaneous_Expense_FO
	 * @generated
	 */
	EClass getMiscellaneous_Expense_FO();

	/**
	 * Returns the meta object for class '{@link TaxationWithRoot.Resource <em>Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource</em>'.
	 * @see TaxationWithRoot.Resource
	 * @generated
	 */
	EClass getResource();

	/**
	 * Returns the meta object for the containment reference list '{@link TaxationWithRoot.Resource#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains</em>'.
	 * @see TaxationWithRoot.Resource#getContains()
	 * @see #getResource()
	 * @generated
	 */
	EReference getResource_Contains();

	/**
	 * Returns the meta object for enum '{@link TaxationWithRoot.Grantor <em>Grantor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Grantor</em>'.
	 * @see TaxationWithRoot.Grantor
	 * @generated
	 */
	EEnum getGrantor();

	/**
	 * Returns the meta object for enum '{@link TaxationWithRoot.Disability_Types <em>Disability Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Disability Types</em>'.
	 * @see TaxationWithRoot.Disability_Types
	 * @generated
	 */
	EEnum getDisability_Types();

	/**
	 * Returns the meta object for enum '{@link TaxationWithRoot.Country <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Country</em>'.
	 * @see TaxationWithRoot.Country
	 * @generated
	 */
	EEnum getCountry();

	/**
	 * Returns the meta object for enum '{@link TaxationWithRoot.Tax_Office <em>Tax Office</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tax Office</em>'.
	 * @see TaxationWithRoot.Tax_Office
	 * @generated
	 */
	EEnum getTax_Office();

	/**
	 * Returns the meta object for enum '{@link TaxationWithRoot.Tax_Class_Category <em>Tax Class Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tax Class Category</em>'.
	 * @see TaxationWithRoot.Tax_Class_Category
	 * @generated
	 */
	EEnum getTax_Class_Category();

	/**
	 * Returns the meta object for enum '{@link TaxationWithRoot.Job_Activity <em>Job Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Job Activity</em>'.
	 * @see TaxationWithRoot.Job_Activity
	 * @generated
	 */
	EEnum getJob_Activity();

	/**
	 * Returns the meta object for enum '{@link TaxationWithRoot.Town <em>Town</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Town</em>'.
	 * @see TaxationWithRoot.Town
	 * @generated
	 */
	EEnum getTown();

	/**
	 * Returns the meta object for enum '{@link TaxationWithRoot.CE_Type <em>CE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>CE Type</em>'.
	 * @see TaxationWithRoot.CE_Type
	 * @generated
	 */
	EEnum getCE_Type();

	/**
	 * Returns the meta object for enum '{@link TaxationWithRoot.Expense_Purpose <em>Expense Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Expense Purpose</em>'.
	 * @see TaxationWithRoot.Expense_Purpose
	 * @generated
	 */
	EEnum getExpense_Purpose();

	/**
	 * Returns the meta object for enum '{@link TaxationWithRoot.Dependent_Type <em>Dependent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dependent Type</em>'.
	 * @see TaxationWithRoot.Dependent_Type
	 * @generated
	 */
	EEnum getDependent_Type();

	/**
	 * Returns the meta object for enum '{@link TaxationWithRoot.Separation_Causes <em>Separation Causes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Separation Causes</em>'.
	 * @see TaxationWithRoot.Separation_Causes
	 * @generated
	 */
	EEnum getSeparation_Causes();

	/**
	 * Returns the meta object for enum '{@link TaxationWithRoot.Category_of_Permanent_Expense <em>Category of Permanent Expense</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Category of Permanent Expense</em>'.
	 * @see TaxationWithRoot.Category_of_Permanent_Expense
	 * @generated
	 */
	EEnum getCategory_of_Permanent_Expense();

	/**
	 * Returns the meta object for enum '{@link TaxationWithRoot.Category_of_Health_and_Pension_Insurances <em>Category of Health and Pension Insurances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Category of Health and Pension Insurances</em>'.
	 * @see TaxationWithRoot.Category_of_Health_and_Pension_Insurances
	 * @generated
	 */
	EEnum getCategory_of_Health_and_Pension_Insurances();

	/**
	 * Returns the meta object for enum '{@link TaxationWithRoot.Category_of_Private_Insurance_and_Plan <em>Category of Private Insurance and Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Category of Private Insurance and Plan</em>'.
	 * @see TaxationWithRoot.Category_of_Private_Insurance_and_Plan
	 * @generated
	 */
	EEnum getCategory_of_Private_Insurance_and_Plan();

	/**
	 * Returns the meta object for enum '{@link TaxationWithRoot.Legal_Union_Types <em>Legal Union Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Legal Union Types</em>'.
	 * @see TaxationWithRoot.Legal_Union_Types
	 * @generated
	 */
	EEnum getLegal_Union_Types();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TaxationFactory getTaxationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link TaxationWithRoot.impl.ConstantsImpl <em>Constants</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.impl.ConstantsImpl
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getConstants()
		 * @generated
		 */
		EClass CONSTANTS = eINSTANCE.getConstants();

		/**
		 * The meta object literal for the '<em><b>MAXIMUM CE RATE FOR CHILD NOT BEING PART OF HOUSEHOLD</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANTS__MAXIMUM_CE_RATE_FOR_CHILD_NOT_BEING_PART_OF_HOUSEHOLD = eINSTANCE.getConstants_MAXIMUM_CE_RATE_FOR_CHILD_NOT_BEING_PART_OF_HOUSEHOLD();

		/**
		 * The meta object literal for the '<em><b>MAXIMUM CE RATE FOR HOUSE CARE AND CHILD PART OF THE HOUSEHOLD CARE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANTS__MAXIMUM_CE_RATE_FOR_HOUSE_CARE_AND_CHILD_PART_OF_THE_HOUSEHOLD_CARE = eINSTANCE.getConstants_MAXIMUM_CE_RATE_FOR_HOUSE_CARE_AND_CHILD_PART_OF_THE_HOUSEHOLD_CARE();

		/**
		 * The meta object literal for the '<em><b>MINIMUM SALARY</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANTS__MINIMUM_SALARY = eINSTANCE.getConstants_MINIMUM_SALARY();

		/**
		 * The meta object literal for the '<em><b>FLAT RATE FOR EXTRA PROFESSIONAL DEDUCTION</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANTS__FLAT_RATE_FOR_EXTRA_PROFESSIONAL_DEDUCTION = eINSTANCE.getConstants_FLAT_RATE_FOR_EXTRA_PROFESSIONAL_DEDUCTION();

		/**
		 * The meta object literal for the '<em><b>MAXIMUM DEDUCTIBLE PERCENTAGE FOR DONATIONS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANTS__MAXIMUM_DEDUCTIBLE_PERCENTAGE_FOR_DONATIONS = eINSTANCE.getConstants_MAXIMUM_DEDUCTIBLE_PERCENTAGE_FOR_DONATIONS();

		/**
		 * The meta object literal for the '<em><b>MINIMUM DEDUCTIBLE AMOUNT FOR DONATIONS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANTS__MINIMUM_DEDUCTIBLE_AMOUNT_FOR_DONATIONS = eINSTANCE.getConstants_MINIMUM_DEDUCTIBLE_AMOUNT_FOR_DONATIONS();

		/**
		 * The meta object literal for the '<em><b>MAXIMUM DEDUCTIBLE AMOUNT FOR ADDITIONAL PENSION AND INSURANC</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANTS__MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANC = eINSTANCE.getConstants_MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANC();

		/**
		 * The meta object literal for the '<em><b>MAXIMUM DEDUCTIBLE AMOUNT FOR ALIMONY EXPENSE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANTS__MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ALIMONY_EXPENSE = eINSTANCE.getConstants_MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ALIMONY_EXPENSE();

		/**
		 * The meta object literal for the '<em><b>MAXIMAL DISTANCE FOR TRAVEL EXPENSE DEDUCTION</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANTS__MAXIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION = eINSTANCE.getConstants_MAXIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION();

		/**
		 * The meta object literal for the '<em><b>MAXIMAL FLAT DISTANCE FOR TRAVEL EXPENSE DEDUCTION</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANTS__MAXIMAL_FLAT_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION = eINSTANCE.getConstants_MAXIMAL_FLAT_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION();

		/**
		 * The meta object literal for the '<em><b>MINIMAL DISTANCE FOR TRAVEL EXPENSE DEDUCTION</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANTS__MINIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION = eINSTANCE.getConstants_MINIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION();

		/**
		 * The meta object literal for the '<em><b>FLAT RATE CIM DAILY</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANTS__FLAT_RATE_CIM_DAILY = eINSTANCE.getConstants_FLAT_RATE_CIM_DAILY();

		/**
		 * The meta object literal for the '<em><b>FLAT RATE CIM MONTHLY</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANTS__FLAT_RATE_CIM_MONTHLY = eINSTANCE.getConstants_FLAT_RATE_CIM_MONTHLY();

		/**
		 * The meta object literal for the '<em><b>FLAT RATE CIM YEARLY</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANTS__FLAT_RATE_CIM_YEARLY = eINSTANCE.getConstants_FLAT_RATE_CIM_YEARLY();

		/**
		 * The meta object literal for the '<em><b>FLAT RATE CIP DAILY</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANTS__FLAT_RATE_CIP_DAILY = eINSTANCE.getConstants_FLAT_RATE_CIP_DAILY();

		/**
		 * The meta object literal for the '<em><b>FLAT RATE CIP MONTHLY</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANTS__FLAT_RATE_CIP_MONTHLY = eINSTANCE.getConstants_FLAT_RATE_CIP_MONTHLY();

		/**
		 * The meta object literal for the '<em><b>FLAT RATE CIP YEARLY</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANTS__FLAT_RATE_CIP_YEARLY = eINSTANCE.getConstants_FLAT_RATE_CIP_YEARLY();

		/**
		 * The meta object literal for the '<em><b>FLAT RATE CIS DAILY</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANTS__FLAT_RATE_CIS_DAILY = eINSTANCE.getConstants_FLAT_RATE_CIS_DAILY();

		/**
		 * The meta object literal for the '<em><b>FLAT RATE CIS MONTHLY</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANTS__FLAT_RATE_CIS_MONTHLY = eINSTANCE.getConstants_FLAT_RATE_CIS_MONTHLY();

		/**
		 * The meta object literal for the '<em><b>FLAT RATE CIS YEARLY</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANTS__FLAT_RATE_CIS_YEARLY = eINSTANCE.getConstants_FLAT_RATE_CIS_YEARLY();

		/**
		 * The meta object literal for the '<em><b>FLAT RATE FOR TRAVEL EXPENSE PER UNIT</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANTS__FLAT_RATE_FOR_TRAVEL_EXPENSE_PER_UNIT = eINSTANCE.getConstants_FLAT_RATE_FOR_TRAVEL_EXPENSE_PER_UNIT();

		/**
		 * The meta object literal for the '<em><b>MAXIMUM DEDUCTIBLE AMOUNT FOR DS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANTS__MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_DS = eINSTANCE.getConstants_MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_DS();

		/**
		 * The meta object literal for the '<em><b>FLAT RATE FOR MISCELLANEOUS EXPENSE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANTS__FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE = eINSTANCE.getConstants_FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE();

		/**
		 * The meta object literal for the '<em><b>DISABILITY FLAT RATE FOR MISCELLANEOUS EXPENSE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANTS__DISABILITY_FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE = eINSTANCE.getConstants_DISABILITY_FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE();

		/**
		 * The meta object literal for the '<em><b>MAXIMUM DEDUCTIBLE AMOUNT FOR ADDITIONAL PENSION AND INSURANCE</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTANTS__MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANCE = eINSTANCE.getConstants_MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANCE();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.impl.Income_TaxImpl <em>Income Tax</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.impl.Income_TaxImpl
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getIncome_Tax()
		 * @generated
		 */
		EClass INCOME_TAX = eINSTANCE.getIncome_Tax();

		/**
		 * The meta object literal for the '<em><b>Tax Payer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCOME_TAX__TAX_PAYER = eINSTANCE.getIncome_Tax_TaxPayer();

		/**
		 * The meta object literal for the '<em><b>Tax amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCOME_TAX__TAX_AMOUNT = eINSTANCE.getIncome_Tax_Tax_amount();

		/**
		 * The meta object literal for the '<em><b>Tax year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCOME_TAX__TAX_YEAR = eINSTANCE.getIncome_Tax_Tax_year();

		/**
		 * The meta object literal for the '<em><b>Id6</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCOME_TAX__ID6 = eINSTANCE.getIncome_Tax_Id6();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.impl.Tax_PayerImpl <em>Tax Payer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.impl.Tax_PayerImpl
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getTax_Payer()
		 * @generated
		 */
		EClass TAX_PAYER = eINSTANCE.getTax_Payer();

		/**
		 * The meta object literal for the '<em><b>Dependents</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAX_PAYER__DEPENDENTS = eINSTANCE.getTax_Payer_Dependents();

		/**
		 * The meta object literal for the '<em><b>From agent</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAX_PAYER__FROM_AGENT = eINSTANCE.getTax_Payer_From_agent();

		/**
		 * The meta object literal for the '<em><b>Incomes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAX_PAYER__INCOMES = eINSTANCE.getTax_Payer_Incomes();

		/**
		 * The meta object literal for the '<em><b>From law</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAX_PAYER__FROM_LAW = eINSTANCE.getTax_Payer_From_law();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.impl.Physical_PersonImpl <em>Physical Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.impl.Physical_PersonImpl
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getPhysical_Person()
		 * @generated
		 */
		EClass PHYSICAL_PERSON = eINSTANCE.getPhysical_Person();

		/**
		 * The meta object literal for the '<em><b>SS No</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_PERSON__SS_NO = eINSTANCE.getPhysical_Person_SSNo();

		/**
		 * The meta object literal for the '<em><b>Addresses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_PERSON__ADDRESSES = eINSTANCE.getPhysical_Person_Addresses();

		/**
		 * The meta object literal for the '<em><b>Birth year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_PERSON__BIRTH_YEAR = eINSTANCE.getPhysical_Person_Birth_year();

		/**
		 * The meta object literal for the '<em><b>Disability percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_PERSON__DISABILITY_PERCENTAGE = eINSTANCE.getPhysical_Person_Disability_percentage();

		/**
		 * The meta object literal for the '<em><b>Disability type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_PERSON__DISABILITY_TYPE = eINSTANCE.getPhysical_Person_Disability_type();

		/**
		 * The meta object literal for the '<em><b>Birth month</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_PERSON__BIRTH_MONTH = eINSTANCE.getPhysical_Person_Birth_month();

		/**
		 * The meta object literal for the '<em><b>Birth day</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_PERSON__BIRTH_DAY = eINSTANCE.getPhysical_Person_Birth_day();

		/**
		 * The meta object literal for the '<em><b>Expenses</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_PERSON__EXPENSES = eINSTANCE.getPhysical_Person_Expenses();

		/**
		 * The meta object literal for the '<em><b>Is widower</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_PERSON__IS_WIDOWER = eINSTANCE.getPhysical_Person_Is_widower();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.impl.AddressImpl <em>Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.impl.AddressImpl
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getAddress()
		 * @generated
		 */
		EClass ADDRESS = eINSTANCE.getAddress();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__COUNTRY = eINSTANCE.getAddress_Country();

		/**
		 * The meta object literal for the '<em><b>Street</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__STREET = eINSTANCE.getAddress_Street();

		/**
		 * The meta object literal for the '<em><b>Zip Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__ZIP_CODE = eINSTANCE.getAddress_ZipCode();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__CITY = eINSTANCE.getAddress_City();

		/**
		 * The meta object literal for the '<em><b>Id2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS__ID2 = eINSTANCE.getAddress_Id2();

		/**
		 * The meta object literal for the '<em><b>Tax Payer</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS__TAX_PAYER = eINSTANCE.getAddress_TaxPayer();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.impl.ExpenseImpl <em>Expense</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.impl.ExpenseImpl
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getExpense()
		 * @generated
		 */
		EClass EXPENSE = eINSTANCE.getExpense();

		/**
		 * The meta object literal for the '<em><b>Declared amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPENSE__DECLARED_AMOUNT = eINSTANCE.getExpense_Declared_amount();

		/**
		 * The meta object literal for the '<em><b>Expense purpose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPENSE__EXPENSE_PURPOSE = eINSTANCE.getExpense_Expense_purpose();

		/**
		 * The meta object literal for the '<em><b>Dependent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPENSE__DEPENDENT = eINSTANCE.getExpense_Dependent();

		/**
		 * The meta object literal for the '<em><b>From agent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPENSE__FROM_AGENT = eINSTANCE.getExpense_From_agent();

		/**
		 * The meta object literal for the '<em><b>Income</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPENSE__INCOME = eINSTANCE.getExpense_Income();

		/**
		 * The meta object literal for the '<em><b>Id4</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXPENSE__ID4 = eINSTANCE.getExpense_Id4();

		/**
		 * The meta object literal for the '<em><b>Beneficiary</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXPENSE__BENEFICIARY = eINSTANCE.getExpense_Beneficiary();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.impl.DependentImpl <em>Dependent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.impl.DependentImpl
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getDependent()
		 * @generated
		 */
		EClass DEPENDENT = eINSTANCE.getDependent();

		/**
		 * The meta object literal for the '<em><b>Dependent type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENT__DEPENDENT_TYPE = eINSTANCE.getDependent_Dependent_type();

		/**
		 * The meta object literal for the '<em><b>Responsible person</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENT__RESPONSIBLE_PERSON = eINSTANCE.getDependent_Responsible_person();

		/**
		 * The meta object literal for the '<em><b>Continued studies</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEPENDENT__CONTINUED_STUDIES = eINSTANCE.getDependent_Continued_studies();

		/**
		 * The meta object literal for the '<em><b>Allowances</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENT__ALLOWANCES = eINSTANCE.getDependent_Allowances();

		/**
		 * The meta object literal for the '<em><b>Household</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENT__HOUSEHOLD = eINSTANCE.getDependent_Household();

		/**
		 * The meta object literal for the '<em><b>From agent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENT__FROM_AGENT = eINSTANCE.getDependent_From_agent();

		/**
		 * The meta object literal for the '<em><b>Expense</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEPENDENT__EXPENSE = eINSTANCE.getDependent_Expense();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.impl.External_AllowanceImpl <em>External Allowance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.impl.External_AllowanceImpl
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getExternal_Allowance()
		 * @generated
		 */
		EClass EXTERNAL_ALLOWANCE = eINSTANCE.getExternal_Allowance();

		/**
		 * The meta object literal for the '<em><b>Grantor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_ALLOWANCE__GRANTOR = eINSTANCE.getExternal_Allowance_Grantor();

		/**
		 * The meta object literal for the '<em><b>Starting year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_ALLOWANCE__STARTING_YEAR = eINSTANCE.getExternal_Allowance_Starting_year();

		/**
		 * The meta object literal for the '<em><b>Ending year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_ALLOWANCE__ENDING_YEAR = eINSTANCE.getExternal_Allowance_Ending_year();

		/**
		 * The meta object literal for the '<em><b>Reciver</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_ALLOWANCE__RECIVER = eINSTANCE.getExternal_Allowance_Reciver();

		/**
		 * The meta object literal for the '<em><b>Id5</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_ALLOWANCE__ID5 = eINSTANCE.getExternal_Allowance_Id5();

		/**
		 * The meta object literal for the '<em><b>Person</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXTERNAL_ALLOWANCE__PERSON = eINSTANCE.getExternal_Allowance_Person();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.impl.HouseholdImpl <em>Household</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.impl.HouseholdImpl
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getHousehold()
		 * @generated
		 */
		EClass HOUSEHOLD = eINSTANCE.getHousehold();

		/**
		 * The meta object literal for the '<em><b>Parents</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOUSEHOLD__PARENTS = eINSTANCE.getHousehold_Parents();

		/**
		 * The meta object literal for the '<em><b>Id1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOUSEHOLD__ID1 = eINSTANCE.getHousehold_Id1();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOUSEHOLD__CHILDREN = eINSTANCE.getHousehold_Children();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.impl.Legal_Union_RecordImpl <em>Legal Union Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.impl.Legal_Union_RecordImpl
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getLegal_Union_Record()
		 * @generated
		 */
		EClass LEGAL_UNION_RECORD = eINSTANCE.getLegal_Union_Record();

		/**
		 * The meta object literal for the '<em><b>Start year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGAL_UNION_RECORD__START_YEAR = eINSTANCE.getLegal_Union_Record_Start_year();

		/**
		 * The meta object literal for the '<em><b>End year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGAL_UNION_RECORD__END_YEAR = eINSTANCE.getLegal_Union_Record_End_year();

		/**
		 * The meta object literal for the '<em><b>Separation cause</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGAL_UNION_RECORD__SEPARATION_CAUSE = eINSTANCE.getLegal_Union_Record_Separation_cause();

		/**
		 * The meta object literal for the '<em><b>Individual A</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGAL_UNION_RECORD__INDIVIDUAL_A = eINSTANCE.getLegal_Union_Record_Individual_A();

		/**
		 * The meta object literal for the '<em><b>Individual B</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGAL_UNION_RECORD__INDIVIDUAL_B = eINSTANCE.getLegal_Union_Record_Individual_B();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGAL_UNION_RECORD__PROPERTIES = eINSTANCE.getLegal_Union_Record_Properties();

		/**
		 * The meta object literal for the '<em><b>Mutual agreement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGAL_UNION_RECORD__MUTUAL_AGREEMENT = eINSTANCE.getLegal_Union_Record_Mutual_agreement();

		/**
		 * The meta object literal for the '<em><b>Id9</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGAL_UNION_RECORD__ID9 = eINSTANCE.getLegal_Union_Record_Id9();

		/**
		 * The meta object literal for the '<em><b>Household</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGAL_UNION_RECORD__HOUSEHOLD = eINSTANCE.getLegal_Union_Record_Household();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.impl.Tax_PropertyImpl <em>Tax Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.impl.Tax_PropertyImpl
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getTax_Property()
		 * @generated
		 */
		EClass TAX_PROPERTY = eINSTANCE.getTax_Property();

		/**
		 * The meta object literal for the '<em><b>Starting year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_PROPERTY__STARTING_YEAR = eINSTANCE.getTax_Property_Starting_year();

		/**
		 * The meta object literal for the '<em><b>Id10</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_PROPERTY__ID10 = eINSTANCE.getTax_Property_Id10();

		/**
		 * The meta object literal for the '<em><b>Union record</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAX_PROPERTY__UNION_RECORD = eINSTANCE.getTax_Property_Union_record();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.Tax_Case <em>Tax Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.Tax_Case
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getTax_Case()
		 * @generated
		 */
		EClass TAX_CASE = eINSTANCE.getTax_Case();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.impl.FromAgentImpl <em>From Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.impl.FromAgentImpl
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getFromAgent()
		 * @generated
		 */
		EClass FROM_AGENT = eINSTANCE.getFromAgent();

		/**
		 * The meta object literal for the '<em><b>Tax Payer</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FROM_AGENT__TAX_PAYER = eINSTANCE.getFromAgent_TaxPayer();

		/**
		 * The meta object literal for the '<em><b>Is dependent eligible for CE Not In Houshold Children Care</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FROM_AGENT__IS_DEPENDENT_ELIGIBLE_FOR_CE_NOT_IN_HOUSHOLD_CHILDREN_CARE = eINSTANCE.getFromAgent_Is_dependent_eligible_for_CE_Not_In_Houshold_Children_Care();

		/**
		 * The meta object literal for the '<em><b>Expense</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FROM_AGENT__EXPENSE = eINSTANCE.getFromAgent_Expense();

		/**
		 * The meta object literal for the '<em><b>Is eligible debt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FROM_AGENT__IS_ELIGIBLE_DEBT = eINSTANCE.getFromAgent_Is_eligible_debt();

		/**
		 * The meta object literal for the '<em><b>Dependent</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FROM_AGENT__DEPENDENT = eINSTANCE.getFromAgent_Dependent();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.impl.IncomeImpl <em>Income</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.impl.IncomeImpl
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getIncome()
		 * @generated
		 */
		EClass INCOME = eINSTANCE.getIncome();

		/**
		 * The meta object literal for the '<em><b>Income amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCOME__INCOME_AMOUNT = eINSTANCE.getIncome_Income_amount();

		/**
		 * The meta object literal for the '<em><b>Income type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCOME__INCOME_TYPE = eINSTANCE.getIncome_Income_type();

		/**
		 * The meta object literal for the '<em><b>Tax card</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCOME__TAX_CARD = eINSTANCE.getIncome_Tax_card();

		/**
		 * The meta object literal for the '<em><b>Tax liability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCOME__TAX_LIABILITY = eINSTANCE.getIncome_Tax_liability();

		/**
		 * The meta object literal for the '<em><b>Tax Payer</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCOME__TAX_PAYER = eINSTANCE.getIncome_TaxPayer();

		/**
		 * The meta object literal for the '<em><b>Details</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCOME__DETAILS = eINSTANCE.getIncome_Details();

		/**
		 * The meta object literal for the '<em><b>Num</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCOME__NUM = eINSTANCE.getIncome_Num();

		/**
		 * The meta object literal for the '<em><b>Expenses</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCOME__EXPENSES = eINSTANCE.getIncome_Expenses();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.impl.Income_TypeImpl <em>Income Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.impl.Income_TypeImpl
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getIncome_Type()
		 * @generated
		 */
		EClass INCOME_TYPE = eINSTANCE.getIncome_Type();

		/**
		 * The meta object literal for the '<em><b>Id8</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCOME_TYPE__ID8 = eINSTANCE.getIncome_Type_Id8();

		/**
		 * The meta object literal for the '<em><b>Income</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCOME_TYPE__INCOME = eINSTANCE.getIncome_Type_Income();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.impl.Tax_CardImpl <em>Tax Card</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.impl.Tax_CardImpl
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getTax_Card()
		 * @generated
		 */
		EClass TAX_CARD = eINSTANCE.getTax_Card();

		/**
		 * The meta object literal for the '<em><b>Card identifier</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_CARD__CARD_IDENTIFIER = eINSTANCE.getTax_Card_Card_identifier();

		/**
		 * The meta object literal for the '<em><b>Tax office</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_CARD__TAX_OFFICE = eINSTANCE.getTax_Card_Tax_office();

		/**
		 * The meta object literal for the '<em><b>Percentage of witholding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_CARD__PERCENTAGE_OF_WITHOLDING = eINSTANCE.getTax_Card_Percentage_of_witholding();

		/**
		 * The meta object literal for the '<em><b>Tax payers name surname</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_CARD__TAX_PAYERS_NAME_SURNAME = eINSTANCE.getTax_Card_Tax_payers_name_surname();

		/**
		 * The meta object literal for the '<em><b>Tax payers partner name surname</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_CARD__TAX_PAYERS_PARTNER_NAME_SURNAME = eINSTANCE.getTax_Card_Tax_payers_partner_name_surname();

		/**
		 * The meta object literal for the '<em><b>Tax payers address</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAX_CARD__TAX_PAYERS_ADDRESS = eINSTANCE.getTax_Card_Tax_payers_address();

		/**
		 * The meta object literal for the '<em><b>Jobs Employer SS No</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_CARD__JOBS_EMPLOYER_SS_NO = eINSTANCE.getTax_Card_Jobs_Employer_SSNo();

		/**
		 * The meta object literal for the '<em><b>Jobs employers name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_CARD__JOBS_EMPLOYERS_NAME = eINSTANCE.getTax_Card_Jobs_employers_name();

		/**
		 * The meta object literal for the '<em><b>Jobs activity type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_CARD__JOBS_ACTIVITY_TYPE = eINSTANCE.getTax_Card_Jobs_activity_type();

		/**
		 * The meta object literal for the '<em><b>Jobs place of work</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_CARD__JOBS_PLACE_OF_WORK = eINSTANCE.getTax_Card_Jobs_place_of_work();

		/**
		 * The meta object literal for the '<em><b>Deduction FD daily</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_CARD__DEDUCTION_FD_DAILY = eINSTANCE.getTax_Card_Deduction_FD_daily();

		/**
		 * The meta object literal for the '<em><b>Deduction FD monthly</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_CARD__DEDUCTION_FD_MONTHLY = eINSTANCE.getTax_Card_Deduction_FD_monthly();

		/**
		 * The meta object literal for the '<em><b>Deduction AC daily</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_CARD__DEDUCTION_AC_DAILY = eINSTANCE.getTax_Card_Deduction_AC_daily();

		/**
		 * The meta object literal for the '<em><b>Deduction AC monthly</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_CARD__DEDUCTION_AC_MONTHLY = eINSTANCE.getTax_Card_Deduction_AC_monthly();

		/**
		 * The meta object literal for the '<em><b>Deduction AC yearly</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_CARD__DEDUCTION_AC_YEARLY = eINSTANCE.getTax_Card_Deduction_AC_yearly();

		/**
		 * The meta object literal for the '<em><b>Deduction CE daily</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_CARD__DEDUCTION_CE_DAILY = eINSTANCE.getTax_Card_Deduction_CE_daily();

		/**
		 * The meta object literal for the '<em><b>Deduction CE monthly</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_CARD__DEDUCTION_CE_MONTHLY = eINSTANCE.getTax_Card_Deduction_CE_monthly();

		/**
		 * The meta object literal for the '<em><b>Deduction CE yearly</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_CARD__DEDUCTION_CE_YEARLY = eINSTANCE.getTax_Card_Deduction_CE_yearly();

		/**
		 * The meta object literal for the '<em><b>Deduction DS daily</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_CARD__DEDUCTION_DS_DAILY = eINSTANCE.getTax_Card_Deduction_DS_daily();

		/**
		 * The meta object literal for the '<em><b>Deduction DS monthly</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_CARD__DEDUCTION_DS_MONTHLY = eINSTANCE.getTax_Card_Deduction_DS_monthly();

		/**
		 * The meta object literal for the '<em><b>Deduction FO daily</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_CARD__DEDUCTION_FO_DAILY = eINSTANCE.getTax_Card_Deduction_FO_daily();

		/**
		 * The meta object literal for the '<em><b>Deduction FO monthly</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_CARD__DEDUCTION_FO_MONTHLY = eINSTANCE.getTax_Card_Deduction_FO_monthly();

		/**
		 * The meta object literal for the '<em><b>Deduction FO yearly</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_CARD__DEDUCTION_FO_YEARLY = eINSTANCE.getTax_Card_Deduction_FO_yearly();

		/**
		 * The meta object literal for the '<em><b>Credit CIS daily</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_CARD__CREDIT_CIS_DAILY = eINSTANCE.getTax_Card_Credit_CIS_daily();

		/**
		 * The meta object literal for the '<em><b>Credit CIS monthly</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_CARD__CREDIT_CIS_MONTHLY = eINSTANCE.getTax_Card_Credit_CIS_monthly();

		/**
		 * The meta object literal for the '<em><b>Credit CIM daily</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_CARD__CREDIT_CIM_DAILY = eINSTANCE.getTax_Card_Credit_CIM_daily();

		/**
		 * The meta object literal for the '<em><b>Validity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_CARD__VALIDITY = eINSTANCE.getTax_Card_Validity();

		/**
		 * The meta object literal for the '<em><b>Income Tax Credit</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAX_CARD__INCOME_TAX_CREDIT = eINSTANCE.getTax_Card_Income_Tax_Credit();

		/**
		 * The meta object literal for the '<em><b>Previous</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAX_CARD__PREVIOUS = eINSTANCE.getTax_Card_Previous();

		/**
		 * The meta object literal for the '<em><b>Current tax card</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAX_CARD__CURRENT_TAX_CARD = eINSTANCE.getTax_Card_Current_tax_card();

		/**
		 * The meta object literal for the '<em><b>Credit CIM yearly</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_CARD__CREDIT_CIM_YEARLY = eINSTANCE.getTax_Card_Credit_CIM_yearly();

		/**
		 * The meta object literal for the '<em><b>Deduction DS Alimony yearly</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_CARD__DEDUCTION_DS_ALIMONY_YEARLY = eINSTANCE.getTax_Card_Deduction_DS_Alimony_yearly();

		/**
		 * The meta object literal for the '<em><b>Deduction DS Debt yearly</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_CARD__DEDUCTION_DS_DEBT_YEARLY = eINSTANCE.getTax_Card_Deduction_DS_Debt_yearly();

		/**
		 * The meta object literal for the '<em><b>Income</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TAX_CARD__INCOME = eINSTANCE.getTax_Card_Income();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.impl.Income_Tax_CreditImpl <em>Income Tax Credit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.impl.Income_Tax_CreditImpl
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getIncome_Tax_Credit()
		 * @generated
		 */
		EClass INCOME_TAX_CREDIT = eINSTANCE.getIncome_Tax_Credit();

		/**
		 * The meta object literal for the '<em><b>Granted By</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCOME_TAX_CREDIT__GRANTED_BY = eINSTANCE.getIncome_Tax_Credit_GrantedBy();

		/**
		 * The meta object literal for the '<em><b>Tax Payer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCOME_TAX_CREDIT__TAX_PAYER = eINSTANCE.getIncome_Tax_Credit_TaxPayer();

		/**
		 * The meta object literal for the '<em><b>Tax year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCOME_TAX_CREDIT__TAX_YEAR = eINSTANCE.getIncome_Tax_Credit_Tax_year();

		/**
		 * The meta object literal for the '<em><b>Yearly</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCOME_TAX_CREDIT__YEARLY = eINSTANCE.getIncome_Tax_Credit_Yearly();

		/**
		 * The meta object literal for the '<em><b>Monthly</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCOME_TAX_CREDIT__MONTHLY = eINSTANCE.getIncome_Tax_Credit_Monthly();

		/**
		 * The meta object literal for the '<em><b>Daily</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCOME_TAX_CREDIT__DAILY = eINSTANCE.getIncome_Tax_Credit_Daily();

		/**
		 * The meta object literal for the '<em><b>Id7</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCOME_TAX_CREDIT__ID7 = eINSTANCE.getIncome_Tax_Credit_Id7();

		/**
		 * The meta object literal for the '<em><b>Taxation Frame</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCOME_TAX_CREDIT__TAXATION_FRAME = eINSTANCE.getIncome_Tax_Credit_Taxation_Frame();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.impl.Income_DetailImpl <em>Income Detail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.impl.Income_DetailImpl
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getIncome_Detail()
		 * @generated
		 */
		EClass INCOME_DETAIL = eINSTANCE.getIncome_Detail();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCOME_DETAIL__AMOUNT = eINSTANCE.getIncome_Detail_Amount();

		/**
		 * The meta object literal for the '<em><b>Is worked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCOME_DETAIL__IS_WORKED = eINSTANCE.getIncome_Detail_Is_worked();

		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCOME_DETAIL__DISTANCE = eINSTANCE.getIncome_Detail_Distance();

		/**
		 * The meta object literal for the '<em><b>Worked days</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCOME_DETAIL__WORKED_DAYS = eINSTANCE.getIncome_Detail_Worked_days();

		/**
		 * The meta object literal for the '<em><b>Is contributing CNS</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCOME_DETAIL__IS_CONTRIBUTING_CNS = eINSTANCE.getIncome_Detail_Is_contributing_CNS();

		/**
		 * The meta object literal for the '<em><b>Id5</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCOME_DETAIL__ID5 = eINSTANCE.getIncome_Detail_Id5();

		/**
		 * The meta object literal for the '<em><b>Income</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INCOME_DETAIL__INCOME = eINSTANCE.getIncome_Detail_Income();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.impl.FromLawImpl <em>From Law</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.impl.FromLawImpl
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getFromLaw()
		 * @generated
		 */
		EClass FROM_LAW = eINSTANCE.getFromLaw();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FROM_LAW__ID = eINSTANCE.getFromLaw_Id();

		/**
		 * The meta object literal for the '<em><b>Tax Payer</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FROM_LAW__TAX_PAYER = eINSTANCE.getFromLaw_TaxPayer();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.impl.Fiscal_AddressImpl <em>Fiscal Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.impl.Fiscal_AddressImpl
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getFiscal_Address()
		 * @generated
		 */
		EClass FISCAL_ADDRESS = eINSTANCE.getFiscal_Address();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.impl.Habitual_AddressImpl <em>Habitual Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.impl.Habitual_AddressImpl
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getHabitual_Address()
		 * @generated
		 */
		EClass HABITUAL_ADDRESS = eINSTANCE.getHabitual_Address();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.impl.Marriage_RecordImpl <em>Marriage Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.impl.Marriage_RecordImpl
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getMarriage_Record()
		 * @generated
		 */
		EClass MARRIAGE_RECORD = eINSTANCE.getMarriage_Record();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.impl.Non_Resident_Tax_PayerImpl <em>Non Resident Tax Payer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.impl.Non_Resident_Tax_PayerImpl
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getNon_Resident_Tax_Payer()
		 * @generated
		 */
		EClass NON_RESIDENT_TAX_PAYER = eINSTANCE.getNon_Resident_Tax_Payer();

		/**
		 * The meta object literal for the '<em><b>Is assimilated to resident</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NON_RESIDENT_TAX_PAYER__IS_ASSIMILATED_TO_RESIDENT = eINSTANCE.getNon_Resident_Tax_Payer_Is_assimilated_to_resident();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.impl.Partnership_RecordImpl <em>Partnership Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.impl.Partnership_RecordImpl
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getPartnership_Record()
		 * @generated
		 */
		EClass PARTNERSHIP_RECORD = eINSTANCE.getPartnership_Record();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.impl.Resident_Tax_PayerImpl <em>Resident Tax Payer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.impl.Resident_Tax_PayerImpl
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getResident_Tax_Payer()
		 * @generated
		 */
		EClass RESIDENT_TAX_PAYER = eINSTANCE.getResident_Tax_Payer();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.impl.Trade_and_Business_IncomeImpl <em>Trade and Business Income</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.impl.Trade_and_Business_IncomeImpl
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getTrade_and_Business_Income()
		 * @generated
		 */
		EClass TRADE_AND_BUSINESS_INCOME = eINSTANCE.getTrade_and_Business_Income();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.impl.Agriculture_and_Forestry_IncomeImpl <em>Agriculture and Forestry Income</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.impl.Agriculture_and_Forestry_IncomeImpl
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getAgriculture_and_Forestry_Income()
		 * @generated
		 */
		EClass AGRICULTURE_AND_FORESTRY_INCOME = eINSTANCE.getAgriculture_and_Forestry_Income();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.impl.Pensions_and_Annuities_IncomeImpl <em>Pensions and Annuities Income</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.impl.Pensions_and_Annuities_IncomeImpl
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getPensions_and_Annuities_Income()
		 * @generated
		 */
		EClass PENSIONS_AND_ANNUITIES_INCOME = eINSTANCE.getPensions_and_Annuities_Income();

		/**
		 * The meta object literal for the '<em><b>Occasional payement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PENSIONS_AND_ANNUITIES_INCOME__OCCASIONAL_PAYEMENT = eINSTANCE.getPensions_and_Annuities_Income_Occasional_payement();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.impl.Capital_and_Investments_IncomeImpl <em>Capital and Investments Income</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.impl.Capital_and_Investments_IncomeImpl
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getCapital_and_Investments_Income()
		 * @generated
		 */
		EClass CAPITAL_AND_INVESTMENTS_INCOME = eINSTANCE.getCapital_and_Investments_Income();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.impl.Employment_IncomeImpl <em>Employment Income</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.impl.Employment_IncomeImpl
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getEmployment_Income()
		 * @generated
		 */
		EClass EMPLOYMENT_INCOME = eINSTANCE.getEmployment_Income();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.impl.Rentals_and_Leases_IncomeImpl <em>Rentals and Leases Income</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.impl.Rentals_and_Leases_IncomeImpl
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getRentals_and_Leases_Income()
		 * @generated
		 */
		EClass RENTALS_AND_LEASES_INCOME = eINSTANCE.getRentals_and_Leases_Income();

		/**
		 * The meta object literal for the '<em><b>Is periodic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENTALS_AND_LEASES_INCOME__IS_PERIODIC = eINSTANCE.getRentals_and_Leases_Income_Is_periodic();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.impl.Foreign_IncomeImpl <em>Foreign Income</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.impl.Foreign_IncomeImpl
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getForeign_Income()
		 * @generated
		 */
		EClass FOREIGN_INCOME = eINSTANCE.getForeign_Income();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.impl.Local_IncomeImpl <em>Local Income</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.impl.Local_IncomeImpl
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getLocal_Income()
		 * @generated
		 */
		EClass LOCAL_INCOME = eINSTANCE.getLocal_Income();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.impl.CIMImpl <em>CIM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.impl.CIMImpl
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getCIM()
		 * @generated
		 */
		EClass CIM = eINSTANCE.getCIM();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.impl.CIPImpl <em>CIP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.impl.CIPImpl
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getCIP()
		 * @generated
		 */
		EClass CIP = eINSTANCE.getCIP();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.impl.CISImpl <em>CIS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.impl.CISImpl
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getCIS()
		 * @generated
		 */
		EClass CIS = eINSTANCE.getCIS();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.impl.Permanent_ExpenseImpl <em>Permanent Expense</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.impl.Permanent_ExpenseImpl
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getPermanent_Expense()
		 * @generated
		 */
		EClass PERMANENT_EXPENSE = eINSTANCE.getPermanent_Expense();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMANENT_EXPENSE__CATEGORY = eINSTANCE.getPermanent_Expense_Category();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.impl.Special_Expense_DSImpl <em>Special Expense DS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.impl.Special_Expense_DSImpl
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getSpecial_Expense_DS()
		 * @generated
		 */
		EClass SPECIAL_EXPENSE_DS = eINSTANCE.getSpecial_Expense_DS();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.impl.Interest_ExpenseImpl <em>Interest Expense</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.impl.Interest_ExpenseImpl
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getInterest_Expense()
		 * @generated
		 */
		EClass INTEREST_EXPENSE = eINSTANCE.getInterest_Expense();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.impl.Private_Insurance_and_PlanImpl <em>Private Insurance and Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.impl.Private_Insurance_and_PlanImpl
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getPrivate_Insurance_and_Plan()
		 * @generated
		 */
		EClass PRIVATE_INSURANCE_AND_PLAN = eINSTANCE.getPrivate_Insurance_and_Plan();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIVATE_INSURANCE_AND_PLAN__CATEGORY = eINSTANCE.getPrivate_Insurance_and_Plan_Category();

		/**
		 * The meta object literal for the '<em><b>Duration of contract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIVATE_INSURANCE_AND_PLAN__DURATION_OF_CONTRACT = eINSTANCE.getPrivate_Insurance_and_Plan_Duration_of_contract();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.impl.Health_and_Pension_InsuranceImpl <em>Health and Pension Insurance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.impl.Health_and_Pension_InsuranceImpl
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getHealth_and_Pension_Insurance()
		 * @generated
		 */
		EClass HEALTH_AND_PENSION_INSURANCE = eINSTANCE.getHealth_and_Pension_Insurance();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTH_AND_PENSION_INSURANCE__CATEGORY = eINSTANCE.getHealth_and_Pension_Insurance_Category();

		/**
		 * The meta object literal for the '<em><b>Is related to additional salary</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEALTH_AND_PENSION_INSURANCE__IS_RELATED_TO_ADDITIONAL_SALARY = eINSTANCE.getHealth_and_Pension_Insurance_Is_related_to_additional_salary();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.impl.DonationImpl <em>Donation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.impl.DonationImpl
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getDonation()
		 * @generated
		 */
		EClass DONATION = eINSTANCE.getDonation();

		/**
		 * The meta object literal for the '<em><b>Beneficiary1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DONATION__BENEFICIARY1 = eINSTANCE.getDonation_Beneficiary1();

		/**
		 * The meta object literal for the '<em><b>Is donation reported</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DONATION__IS_DONATION_REPORTED = eINSTANCE.getDonation_Is_donation_reported();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.impl.Loss_CarryforwardImpl <em>Loss Carryforward</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.impl.Loss_CarryforwardImpl
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getLoss_Carryforward()
		 * @generated
		 */
		EClass LOSS_CARRYFORWARD = eINSTANCE.getLoss_Carryforward();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.impl.Spousal_Expense_ACImpl <em>Spousal Expense AC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.impl.Spousal_Expense_ACImpl
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getSpousal_Expense_AC()
		 * @generated
		 */
		EClass SPOUSAL_EXPENSE_AC = eINSTANCE.getSpousal_Expense_AC();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.impl.Extraordinary_Expense_CEImpl <em>Extraordinary Expense CE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.impl.Extraordinary_Expense_CEImpl
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getExtraordinary_Expense_CE()
		 * @generated
		 */
		EClass EXTRAORDINARY_EXPENSE_CE = eINSTANCE.getExtraordinary_Expense_CE();

		/**
		 * The meta object literal for the '<em><b>Thresholded deduction percentage</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRAORDINARY_EXPENSE_CE__THRESHOLDED_DEDUCTION_PERCENTAGE = eINSTANCE.getExtraordinary_Expense_CE_Thresholded_deduction_percentage();

		/**
		 * The meta object literal for the '<em><b>Ce type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRAORDINARY_EXPENSE_CE__CE_TYPE = eINSTANCE.getExtraordinary_Expense_CE_Ce_type();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.impl.Travel_Expense_FDImpl <em>Travel Expense FD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.impl.Travel_Expense_FDImpl
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getTravel_Expense_FD()
		 * @generated
		 */
		EClass TRAVEL_EXPENSE_FD = eINSTANCE.getTravel_Expense_FD();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.impl.Professional_ExpenseImpl <em>Professional Expense</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.impl.Professional_ExpenseImpl
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getProfessional_Expense()
		 * @generated
		 */
		EClass PROFESSIONAL_EXPENSE = eINSTANCE.getProfessional_Expense();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.impl.Miscellaneous_Expense_FOImpl <em>Miscellaneous Expense FO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.impl.Miscellaneous_Expense_FOImpl
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getMiscellaneous_Expense_FO()
		 * @generated
		 */
		EClass MISCELLANEOUS_EXPENSE_FO = eINSTANCE.getMiscellaneous_Expense_FO();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.impl.ResourceImpl <em>Resource</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.impl.ResourceImpl
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getResource()
		 * @generated
		 */
		EClass RESOURCE = eINSTANCE.getResource();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE__CONTAINS = eINSTANCE.getResource_Contains();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.Grantor <em>Grantor</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.Grantor
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getGrantor()
		 * @generated
		 */
		EEnum GRANTOR = eINSTANCE.getGrantor();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.Disability_Types <em>Disability Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.Disability_Types
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getDisability_Types()
		 * @generated
		 */
		EEnum DISABILITY_TYPES = eINSTANCE.getDisability_Types();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.Country <em>Country</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.Country
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getCountry()
		 * @generated
		 */
		EEnum COUNTRY = eINSTANCE.getCountry();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.Tax_Office <em>Tax Office</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.Tax_Office
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getTax_Office()
		 * @generated
		 */
		EEnum TAX_OFFICE = eINSTANCE.getTax_Office();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.Tax_Class_Category <em>Tax Class Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.Tax_Class_Category
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getTax_Class_Category()
		 * @generated
		 */
		EEnum TAX_CLASS_CATEGORY = eINSTANCE.getTax_Class_Category();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.Job_Activity <em>Job Activity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.Job_Activity
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getJob_Activity()
		 * @generated
		 */
		EEnum JOB_ACTIVITY = eINSTANCE.getJob_Activity();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.Town <em>Town</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.Town
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getTown()
		 * @generated
		 */
		EEnum TOWN = eINSTANCE.getTown();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.CE_Type <em>CE Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.CE_Type
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getCE_Type()
		 * @generated
		 */
		EEnum CE_TYPE = eINSTANCE.getCE_Type();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.Expense_Purpose <em>Expense Purpose</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.Expense_Purpose
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getExpense_Purpose()
		 * @generated
		 */
		EEnum EXPENSE_PURPOSE = eINSTANCE.getExpense_Purpose();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.Dependent_Type <em>Dependent Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.Dependent_Type
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getDependent_Type()
		 * @generated
		 */
		EEnum DEPENDENT_TYPE = eINSTANCE.getDependent_Type();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.Separation_Causes <em>Separation Causes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.Separation_Causes
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getSeparation_Causes()
		 * @generated
		 */
		EEnum SEPARATION_CAUSES = eINSTANCE.getSeparation_Causes();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.Category_of_Permanent_Expense <em>Category of Permanent Expense</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.Category_of_Permanent_Expense
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getCategory_of_Permanent_Expense()
		 * @generated
		 */
		EEnum CATEGORY_OF_PERMANENT_EXPENSE = eINSTANCE.getCategory_of_Permanent_Expense();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.Category_of_Health_and_Pension_Insurances <em>Category of Health and Pension Insurances</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.Category_of_Health_and_Pension_Insurances
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getCategory_of_Health_and_Pension_Insurances()
		 * @generated
		 */
		EEnum CATEGORY_OF_HEALTH_AND_PENSION_INSURANCES = eINSTANCE.getCategory_of_Health_and_Pension_Insurances();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.Category_of_Private_Insurance_and_Plan <em>Category of Private Insurance and Plan</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.Category_of_Private_Insurance_and_Plan
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getCategory_of_Private_Insurance_and_Plan()
		 * @generated
		 */
		EEnum CATEGORY_OF_PRIVATE_INSURANCE_AND_PLAN = eINSTANCE.getCategory_of_Private_Insurance_and_Plan();

		/**
		 * The meta object literal for the '{@link TaxationWithRoot.Legal_Union_Types <em>Legal Union Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see TaxationWithRoot.Legal_Union_Types
		 * @see TaxationWithRoot.impl.TaxationPackageImpl#getLegal_Union_Types()
		 * @generated
		 */
		EEnum LEGAL_UNION_TYPES = eINSTANCE.getLegal_Union_Types();

	}

} //TaxationPackage
