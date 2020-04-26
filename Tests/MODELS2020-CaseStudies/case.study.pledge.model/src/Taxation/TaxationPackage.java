/**
 */
package Taxation;

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
 * @see Taxation.TaxationFactory
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
	String eNAME = "Taxation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///TaxCard.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "TaxCard";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TaxationPackage eINSTANCE = Taxation.impl.TaxationPackageImpl.init();

	/**
	 * The meta object id for the '{@link Taxation.impl.ConstantsImpl <em>Constants</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.impl.ConstantsImpl
	 * @see Taxation.impl.TaxationPackageImpl#getConstants()
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
	 * The meta object id for the '{@link Taxation.impl.Income_TaxImpl <em>Income Tax</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.impl.Income_TaxImpl
	 * @see Taxation.impl.TaxationPackageImpl#getIncome_Tax()
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
	 * The meta object id for the '{@link Taxation.impl.Physical_PersonImpl <em>Physical Person</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.impl.Physical_PersonImpl
	 * @see Taxation.impl.TaxationPackageImpl#getPhysical_Person()
	 * @generated
	 */
	int PHYSICAL_PERSON = 3;

	/**
	 * The feature id for the '<em><b>Is assisting spouse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PERSON__IS_ASSISTING_SPOUSE = 0;

	/**
	 * The feature id for the '<em><b>SS No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PERSON__SS_NO = 1;

	/**
	 * The feature id for the '<em><b>Addresses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PERSON__ADDRESSES = 2;

	/**
	 * The feature id for the '<em><b>Birth year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PERSON__BIRTH_YEAR = 3;

	/**
	 * The feature id for the '<em><b>Disability percentage</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PERSON__DISABILITY_PERCENTAGE = 4;

	/**
	 * The feature id for the '<em><b>Disability type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PERSON__DISABILITY_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Is affiliated personnaly to social security</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PERSON__IS_AFFILIATED_PERSONNALY_TO_SOCIAL_SECURITY = 6;

	/**
	 * The feature id for the '<em><b>Birth month</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PERSON__BIRTH_MONTH = 7;

	/**
	 * The feature id for the '<em><b>Birth day</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PERSON__BIRTH_DAY = 8;

	/**
	 * The feature id for the '<em><b>Expenses</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PERSON__EXPENSES = 9;

	/**
	 * The feature id for the '<em><b>Is widower</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PERSON__IS_WIDOWER = 10;

	/**
	 * The feature id for the '<em><b>Owns Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PERSON__OWNS_ADDRESS = 11;

	/**
	 * The number of structural features of the '<em>Physical Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PERSON_FEATURE_COUNT = 12;

	/**
	 * The number of operations of the '<em>Physical Person</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHYSICAL_PERSON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Taxation.impl.Tax_PayerImpl <em>Tax Payer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.impl.Tax_PayerImpl
	 * @see Taxation.impl.TaxationPackageImpl#getTax_Payer()
	 * @generated
	 */
	int TAX_PAYER = 2;

	/**
	 * The feature id for the '<em><b>Is assisting spouse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_PAYER__IS_ASSISTING_SPOUSE = PHYSICAL_PERSON__IS_ASSISTING_SPOUSE;

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
	 * The feature id for the '<em><b>Is affiliated personnaly to social security</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_PAYER__IS_AFFILIATED_PERSONNALY_TO_SOCIAL_SECURITY = PHYSICAL_PERSON__IS_AFFILIATED_PERSONNALY_TO_SOCIAL_SECURITY;

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
	 * The feature id for the '<em><b>Owns Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_PAYER__OWNS_ADDRESS = PHYSICAL_PERSON__OWNS_ADDRESS;

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
	 * The feature id for the '<em><b>Taxes Due</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_PAYER__TAXES_DUE = PHYSICAL_PERSON_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Tax Payer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_PAYER_FEATURE_COUNT = PHYSICAL_PERSON_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Tax Payer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_PAYER_OPERATION_COUNT = PHYSICAL_PERSON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Taxation.impl.AddressImpl <em>Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.impl.AddressImpl
	 * @see Taxation.impl.TaxationPackageImpl#getAddress()
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
	 * The meta object id for the '{@link Taxation.impl.ExpenseImpl <em>Expense</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.impl.ExpenseImpl
	 * @see Taxation.impl.TaxationPackageImpl#getExpense()
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
	 * The meta object id for the '{@link Taxation.impl.DependentImpl <em>Dependent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.impl.DependentImpl
	 * @see Taxation.impl.TaxationPackageImpl#getDependent()
	 * @generated
	 */
	int DEPENDENT = 6;

	/**
	 * The feature id for the '<em><b>Is assisting spouse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT__IS_ASSISTING_SPOUSE = PHYSICAL_PERSON__IS_ASSISTING_SPOUSE;

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
	 * The feature id for the '<em><b>Is affiliated personnaly to social security</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT__IS_AFFILIATED_PERSONNALY_TO_SOCIAL_SECURITY = PHYSICAL_PERSON__IS_AFFILIATED_PERSONNALY_TO_SOCIAL_SECURITY;

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
	 * The feature id for the '<em><b>Owns Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENT__OWNS_ADDRESS = PHYSICAL_PERSON__OWNS_ADDRESS;

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
	 * The meta object id for the '{@link Taxation.impl.External_AllowanceImpl <em>External Allowance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.impl.External_AllowanceImpl
	 * @see Taxation.impl.TaxationPackageImpl#getExternal_Allowance()
	 * @generated
	 */
	int EXTERNAL_ALLOWANCE = 7;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ALLOWANCE__AMOUNT = 0;

	/**
	 * The feature id for the '<em><b>Grantor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ALLOWANCE__GRANTOR = 1;

	/**
	 * The feature id for the '<em><b>Starting year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ALLOWANCE__STARTING_YEAR = 2;

	/**
	 * The feature id for the '<em><b>Ending year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ALLOWANCE__ENDING_YEAR = 3;

	/**
	 * The feature id for the '<em><b>Reciver</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ALLOWANCE__RECIVER = 4;

	/**
	 * The feature id for the '<em><b>Id5</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ALLOWANCE__ID5 = 5;

	/**
	 * The feature id for the '<em><b>Person</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ALLOWANCE__PERSON = 6;

	/**
	 * The number of structural features of the '<em>External Allowance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ALLOWANCE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>External Allowance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTERNAL_ALLOWANCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Taxation.Tax_Case <em>Tax Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.Tax_Case
	 * @see Taxation.impl.TaxationPackageImpl#getTax_Case()
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
	 * The meta object id for the '{@link Taxation.impl.HouseholdImpl <em>Household</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.impl.HouseholdImpl
	 * @see Taxation.impl.TaxationPackageImpl#getHousehold()
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
	 * The meta object id for the '{@link Taxation.impl.Legal_Union_RecordImpl <em>Legal Union Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.impl.Legal_Union_RecordImpl
	 * @see Taxation.impl.TaxationPackageImpl#getLegal_Union_Record()
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
	 * The meta object id for the '{@link Taxation.impl.Tax_PropertyImpl <em>Tax Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.impl.Tax_PropertyImpl
	 * @see Taxation.impl.TaxationPackageImpl#getTax_Property()
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
	 * The meta object id for the '{@link Taxation.impl.FromAgentImpl <em>From Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.impl.FromAgentImpl
	 * @see Taxation.impl.TaxationPackageImpl#getFromAgent()
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
	 * The meta object id for the '{@link Taxation.impl.IncomeImpl <em>Income</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.impl.IncomeImpl
	 * @see Taxation.impl.TaxationPackageImpl#getIncome()
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
	 * The feature id for the '<em><b>Start date within taxation year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME__START_DATE_WITHIN_TAXATION_YEAR = 2;

	/**
	 * The feature id for the '<em><b>Start date of contract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME__START_DATE_OF_CONTRACT = 3;

	/**
	 * The feature id for the '<em><b>End date within taxation year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME__END_DATE_WITHIN_TAXATION_YEAR = 4;

	/**
	 * The feature id for the '<em><b>Tax card</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME__TAX_CARD = 5;

	/**
	 * The feature id for the '<em><b>Tax liability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME__TAX_LIABILITY = 6;

	/**
	 * The feature id for the '<em><b>Tax Payer</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME__TAX_PAYER = 7;

	/**
	 * The feature id for the '<em><b>Details</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME__DETAILS = 8;

	/**
	 * The feature id for the '<em><b>Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME__NUM = 9;

	/**
	 * The feature id for the '<em><b>Expenses</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME__EXPENSES = 10;

	/**
	 * The number of structural features of the '<em>Income</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME_FEATURE_COUNT = 11;

	/**
	 * The number of operations of the '<em>Income</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Taxation.impl.Income_TypeImpl <em>Income Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.impl.Income_TypeImpl
	 * @see Taxation.impl.TaxationPackageImpl#getIncome_Type()
	 * @generated
	 */
	int INCOME_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Subject To Withholding Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME_TYPE__SUBJECT_TO_WITHHOLDING_TAX = 0;

	/**
	 * The feature id for the '<em><b>Id8</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME_TYPE__ID8 = 1;

	/**
	 * The feature id for the '<em><b>Income</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME_TYPE__INCOME = 2;

	/**
	 * The number of structural features of the '<em>Income Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Income Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCOME_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Taxation.impl.Tax_CardImpl <em>Tax Card</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.impl.Tax_CardImpl
	 * @see Taxation.impl.TaxationPackageImpl#getTax_Card()
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
	 * The feature id for the '<em><b>Tax card type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__TAX_CARD_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Tax office</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__TAX_OFFICE = 2;

	/**
	 * The feature id for the '<em><b>Valid from date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__VALID_FROM_DATE = 3;

	/**
	 * The feature id for the '<em><b>Valid until date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__VALID_UNTIL_DATE = 4;

	/**
	 * The feature id for the '<em><b>Percentage of witholding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__PERCENTAGE_OF_WITHOLDING = 5;

	/**
	 * The feature id for the '<em><b>Tax payers name surname</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__TAX_PAYERS_NAME_SURNAME = 6;

	/**
	 * The feature id for the '<em><b>Tax payers partner name surname</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__TAX_PAYERS_PARTNER_NAME_SURNAME = 7;

	/**
	 * The feature id for the '<em><b>Tax payers address</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__TAX_PAYERS_ADDRESS = 8;

	/**
	 * The feature id for the '<em><b>Jobs Employer SS No</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__JOBS_EMPLOYER_SS_NO = 9;

	/**
	 * The feature id for the '<em><b>Jobs employers name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__JOBS_EMPLOYERS_NAME = 10;

	/**
	 * The feature id for the '<em><b>Jobs activity type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__JOBS_ACTIVITY_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Jobs place of work</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__JOBS_PLACE_OF_WORK = 12;

	/**
	 * The feature id for the '<em><b>Deduction FD daily</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__DEDUCTION_FD_DAILY = 13;

	/**
	 * The feature id for the '<em><b>Deduction FD monthly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__DEDUCTION_FD_MONTHLY = 14;

	/**
	 * The feature id for the '<em><b>Deduction AC daily</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__DEDUCTION_AC_DAILY = 15;

	/**
	 * The feature id for the '<em><b>Deduction AC monthly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__DEDUCTION_AC_MONTHLY = 16;

	/**
	 * The feature id for the '<em><b>Deduction AC yearly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__DEDUCTION_AC_YEARLY = 17;

	/**
	 * The feature id for the '<em><b>Deduction CE daily</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__DEDUCTION_CE_DAILY = 18;

	/**
	 * The feature id for the '<em><b>Deduction CE monthly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__DEDUCTION_CE_MONTHLY = 19;

	/**
	 * The feature id for the '<em><b>Deduction CE yearly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__DEDUCTION_CE_YEARLY = 20;

	/**
	 * The feature id for the '<em><b>Deduction DS daily</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__DEDUCTION_DS_DAILY = 21;

	/**
	 * The feature id for the '<em><b>Deduction DS monthly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__DEDUCTION_DS_MONTHLY = 22;

	/**
	 * The feature id for the '<em><b>Deduction FO daily</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__DEDUCTION_FO_DAILY = 23;

	/**
	 * The feature id for the '<em><b>Deduction FO monthly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__DEDUCTION_FO_MONTHLY = 24;

	/**
	 * The feature id for the '<em><b>Deduction FO yearly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__DEDUCTION_FO_YEARLY = 25;

	/**
	 * The feature id for the '<em><b>Credit CIS daily</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__CREDIT_CIS_DAILY = 26;

	/**
	 * The feature id for the '<em><b>Credit CIS monthly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__CREDIT_CIS_MONTHLY = 27;

	/**
	 * The feature id for the '<em><b>Credit CIM daily</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__CREDIT_CIM_DAILY = 28;

	/**
	 * The feature id for the '<em><b>Validity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__VALIDITY = 29;

	/**
	 * The feature id for the '<em><b>Income Tax Credit</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__INCOME_TAX_CREDIT = 30;

	/**
	 * The feature id for the '<em><b>Previous</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__PREVIOUS = 31;

	/**
	 * The feature id for the '<em><b>Current tax card</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__CURRENT_TAX_CARD = 32;

	/**
	 * The feature id for the '<em><b>Credit CIM yearly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__CREDIT_CIM_YEARLY = 33;

	/**
	 * The feature id for the '<em><b>Deduction DS Alimony yearly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__DEDUCTION_DS_ALIMONY_YEARLY = 34;

	/**
	 * The feature id for the '<em><b>Deduction DS Debt yearly</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__DEDUCTION_DS_DEBT_YEARLY = 35;

	/**
	 * The feature id for the '<em><b>Income</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD__INCOME = 36;

	/**
	 * The number of structural features of the '<em>Tax Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD_FEATURE_COUNT = 37;

	/**
	 * The number of operations of the '<em>Tax Card</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TAX_CARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Taxation.impl.Income_Tax_CreditImpl <em>Income Tax Credit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.impl.Income_Tax_CreditImpl
	 * @see Taxation.impl.TaxationPackageImpl#getIncome_Tax_Credit()
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
	 * The meta object id for the '{@link Taxation.impl.Income_DetailImpl <em>Income Detail</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.impl.Income_DetailImpl
	 * @see Taxation.impl.TaxationPackageImpl#getIncome_Detail()
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
	 * The meta object id for the '{@link Taxation.impl.FromLawImpl <em>From Law</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.impl.FromLawImpl
	 * @see Taxation.impl.TaxationPackageImpl#getFromLaw()
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
	 * The meta object id for the '{@link Taxation.impl.Fiscal_AddressImpl <em>Fiscal Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.impl.Fiscal_AddressImpl
	 * @see Taxation.impl.TaxationPackageImpl#getFiscal_Address()
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
	 * The meta object id for the '{@link Taxation.impl.Habitual_AddressImpl <em>Habitual Address</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.impl.Habitual_AddressImpl
	 * @see Taxation.impl.TaxationPackageImpl#getHabitual_Address()
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
	 * The meta object id for the '{@link Taxation.impl.Marriage_RecordImpl <em>Marriage Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.impl.Marriage_RecordImpl
	 * @see Taxation.impl.TaxationPackageImpl#getMarriage_Record()
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
	 * The meta object id for the '{@link Taxation.impl.Non_Resident_Tax_PayerImpl <em>Non Resident Tax Payer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.impl.Non_Resident_Tax_PayerImpl
	 * @see Taxation.impl.TaxationPackageImpl#getNon_Resident_Tax_Payer()
	 * @generated
	 */
	int NON_RESIDENT_TAX_PAYER = 22;

	/**
	 * The feature id for the '<em><b>Is assisting spouse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_RESIDENT_TAX_PAYER__IS_ASSISTING_SPOUSE = TAX_PAYER__IS_ASSISTING_SPOUSE;

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
	 * The feature id for the '<em><b>Is affiliated personnaly to social security</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_RESIDENT_TAX_PAYER__IS_AFFILIATED_PERSONNALY_TO_SOCIAL_SECURITY = TAX_PAYER__IS_AFFILIATED_PERSONNALY_TO_SOCIAL_SECURITY;

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
	 * The feature id for the '<em><b>Owns Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_RESIDENT_TAX_PAYER__OWNS_ADDRESS = TAX_PAYER__OWNS_ADDRESS;

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
	 * The feature id for the '<em><b>Taxes Due</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NON_RESIDENT_TAX_PAYER__TAXES_DUE = TAX_PAYER__TAXES_DUE;

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
	 * The meta object id for the '{@link Taxation.impl.Partnership_RecordImpl <em>Partnership Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.impl.Partnership_RecordImpl
	 * @see Taxation.impl.TaxationPackageImpl#getPartnership_Record()
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
	 * The meta object id for the '{@link Taxation.impl.Resident_Tax_PayerImpl <em>Resident Tax Payer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.impl.Resident_Tax_PayerImpl
	 * @see Taxation.impl.TaxationPackageImpl#getResident_Tax_Payer()
	 * @generated
	 */
	int RESIDENT_TAX_PAYER = 24;

	/**
	 * The feature id for the '<em><b>Is assisting spouse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIDENT_TAX_PAYER__IS_ASSISTING_SPOUSE = TAX_PAYER__IS_ASSISTING_SPOUSE;

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
	 * The feature id for the '<em><b>Is affiliated personnaly to social security</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIDENT_TAX_PAYER__IS_AFFILIATED_PERSONNALY_TO_SOCIAL_SECURITY = TAX_PAYER__IS_AFFILIATED_PERSONNALY_TO_SOCIAL_SECURITY;

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
	 * The feature id for the '<em><b>Owns Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIDENT_TAX_PAYER__OWNS_ADDRESS = TAX_PAYER__OWNS_ADDRESS;

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
	 * The feature id for the '<em><b>Taxes Due</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESIDENT_TAX_PAYER__TAXES_DUE = TAX_PAYER__TAXES_DUE;

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
	 * The meta object id for the '{@link Taxation.impl.Trade_and_Business_IncomeImpl <em>Trade and Business Income</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.impl.Trade_and_Business_IncomeImpl
	 * @see Taxation.impl.TaxationPackageImpl#getTrade_and_Business_Income()
	 * @generated
	 */
	int TRADE_AND_BUSINESS_INCOME = 25;

	/**
	 * The feature id for the '<em><b>Subject To Withholding Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRADE_AND_BUSINESS_INCOME__SUBJECT_TO_WITHHOLDING_TAX = INCOME_TYPE__SUBJECT_TO_WITHHOLDING_TAX;

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
	 * The meta object id for the '{@link Taxation.impl.Agriculture_and_Forestry_IncomeImpl <em>Agriculture and Forestry Income</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.impl.Agriculture_and_Forestry_IncomeImpl
	 * @see Taxation.impl.TaxationPackageImpl#getAgriculture_and_Forestry_Income()
	 * @generated
	 */
	int AGRICULTURE_AND_FORESTRY_INCOME = 26;

	/**
	 * The feature id for the '<em><b>Subject To Withholding Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGRICULTURE_AND_FORESTRY_INCOME__SUBJECT_TO_WITHHOLDING_TAX = INCOME_TYPE__SUBJECT_TO_WITHHOLDING_TAX;

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
	 * The meta object id for the '{@link Taxation.impl.Pensions_and_Annuities_IncomeImpl <em>Pensions and Annuities Income</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.impl.Pensions_and_Annuities_IncomeImpl
	 * @see Taxation.impl.TaxationPackageImpl#getPensions_and_Annuities_Income()
	 * @generated
	 */
	int PENSIONS_AND_ANNUITIES_INCOME = 27;

	/**
	 * The feature id for the '<em><b>Subject To Withholding Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PENSIONS_AND_ANNUITIES_INCOME__SUBJECT_TO_WITHHOLDING_TAX = INCOME_TYPE__SUBJECT_TO_WITHHOLDING_TAX;

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
	 * The meta object id for the '{@link Taxation.impl.Capital_and_Investments_IncomeImpl <em>Capital and Investments Income</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.impl.Capital_and_Investments_IncomeImpl
	 * @see Taxation.impl.TaxationPackageImpl#getCapital_and_Investments_Income()
	 * @generated
	 */
	int CAPITAL_AND_INVESTMENTS_INCOME = 28;

	/**
	 * The feature id for the '<em><b>Subject To Withholding Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPITAL_AND_INVESTMENTS_INCOME__SUBJECT_TO_WITHHOLDING_TAX = INCOME_TYPE__SUBJECT_TO_WITHHOLDING_TAX;

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
	 * The meta object id for the '{@link Taxation.impl.Employment_IncomeImpl <em>Employment Income</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.impl.Employment_IncomeImpl
	 * @see Taxation.impl.TaxationPackageImpl#getEmployment_Income()
	 * @generated
	 */
	int EMPLOYMENT_INCOME = 29;

	/**
	 * The feature id for the '<em><b>Subject To Withholding Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPLOYMENT_INCOME__SUBJECT_TO_WITHHOLDING_TAX = INCOME_TYPE__SUBJECT_TO_WITHHOLDING_TAX;

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
	 * The meta object id for the '{@link Taxation.impl.Rentals_and_Leases_IncomeImpl <em>Rentals and Leases Income</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.impl.Rentals_and_Leases_IncomeImpl
	 * @see Taxation.impl.TaxationPackageImpl#getRentals_and_Leases_Income()
	 * @generated
	 */
	int RENTALS_AND_LEASES_INCOME = 30;

	/**
	 * The feature id for the '<em><b>Subject To Withholding Tax</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENTALS_AND_LEASES_INCOME__SUBJECT_TO_WITHHOLDING_TAX = INCOME_TYPE__SUBJECT_TO_WITHHOLDING_TAX;

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
	 * The meta object id for the '{@link Taxation.impl.Foreign_IncomeImpl <em>Foreign Income</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.impl.Foreign_IncomeImpl
	 * @see Taxation.impl.TaxationPackageImpl#getForeign_Income()
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
	 * The feature id for the '<em><b>Start date within taxation year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_INCOME__START_DATE_WITHIN_TAXATION_YEAR = INCOME__START_DATE_WITHIN_TAXATION_YEAR;

	/**
	 * The feature id for the '<em><b>Start date of contract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_INCOME__START_DATE_OF_CONTRACT = INCOME__START_DATE_OF_CONTRACT;

	/**
	 * The feature id for the '<em><b>End date within taxation year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_INCOME__END_DATE_WITHIN_TAXATION_YEAR = INCOME__END_DATE_WITHIN_TAXATION_YEAR;

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
	 * The meta object id for the '{@link Taxation.impl.Local_IncomeImpl <em>Local Income</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.impl.Local_IncomeImpl
	 * @see Taxation.impl.TaxationPackageImpl#getLocal_Income()
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
	 * The feature id for the '<em><b>Start date within taxation year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_INCOME__START_DATE_WITHIN_TAXATION_YEAR = INCOME__START_DATE_WITHIN_TAXATION_YEAR;

	/**
	 * The feature id for the '<em><b>Start date of contract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_INCOME__START_DATE_OF_CONTRACT = INCOME__START_DATE_OF_CONTRACT;

	/**
	 * The feature id for the '<em><b>End date within taxation year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_INCOME__END_DATE_WITHIN_TAXATION_YEAR = INCOME__END_DATE_WITHIN_TAXATION_YEAR;

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
	 * The meta object id for the '{@link Taxation.impl.CIMImpl <em>CIM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.impl.CIMImpl
	 * @see Taxation.impl.TaxationPackageImpl#getCIM()
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
	 * The meta object id for the '{@link Taxation.impl.CIPImpl <em>CIP</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.impl.CIPImpl
	 * @see Taxation.impl.TaxationPackageImpl#getCIP()
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
	 * The meta object id for the '{@link Taxation.impl.CISImpl <em>CIS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.impl.CISImpl
	 * @see Taxation.impl.TaxationPackageImpl#getCIS()
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
	 * The meta object id for the '{@link Taxation.impl.Professional_Expenses_DeductionImpl <em>Professional Expenses Deduction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.impl.Professional_Expenses_DeductionImpl
	 * @see Taxation.impl.TaxationPackageImpl#getProfessional_Expenses_Deduction()
	 * @generated
	 */
	int PROFESSIONAL_EXPENSES_DEDUCTION = 37;

	/**
	 * The number of structural features of the '<em>Professional Expenses Deduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSIONAL_EXPENSES_DEDUCTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Professional Expenses Deduction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROFESSIONAL_EXPENSES_DEDUCTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Taxation.impl.FDImpl <em>FD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.impl.FDImpl
	 * @see Taxation.impl.TaxationPackageImpl#getFD()
	 * @generated
	 */
	int FD = 36;

	/**
	 * The feature id for the '<em><b>Distance declared in january</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FD__DISTANCE_DECLARED_IN_JANUARY = PROFESSIONAL_EXPENSES_DEDUCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Calculated distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FD__CALCULATED_DISTANCE = PROFESSIONAL_EXPENSES_DEDUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>FD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FD_FEATURE_COUNT = PROFESSIONAL_EXPENSES_DEDUCTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>FD</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FD_OPERATION_COUNT = PROFESSIONAL_EXPENSES_DEDUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Taxation.impl.FOImpl <em>FO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.impl.FOImpl
	 * @see Taxation.impl.TaxationPackageImpl#getFO()
	 * @generated
	 */
	int FO = 38;

	/**
	 * The feature id for the '<em><b>Rate type for FO</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO__RATE_TYPE_FOR_FO = PROFESSIONAL_EXPENSES_DEDUCTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_FEATURE_COUNT = PROFESSIONAL_EXPENSES_DEDUCTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>FO</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FO_OPERATION_COUNT = PROFESSIONAL_EXPENSES_DEDUCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Taxation.impl.DSImpl <em>DS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.impl.DSImpl
	 * @see Taxation.impl.TaxationPackageImpl#getDS()
	 * @generated
	 */
	int DS = 40;

	/**
	 * The feature id for the '<em><b>Maximum deductible amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS__MAXIMUM_DEDUCTIBLE_AMOUNT = 0;

	/**
	 * The feature id for the '<em><b>Id3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS__ID3 = 1;

	/**
	 * The number of structural features of the '<em>DS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>DS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link Taxation.impl.DS_for_Permanent_ExpenseImpl <em>DS for Permanent Expense</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.impl.DS_for_Permanent_ExpenseImpl
	 * @see Taxation.impl.TaxationPackageImpl#getDS_for_Permanent_Expense()
	 * @generated
	 */
	int DS_FOR_PERMANENT_EXPENSE = 39;

	/**
	 * The feature id for the '<em><b>Maximum deductible amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_FOR_PERMANENT_EXPENSE__MAXIMUM_DEDUCTIBLE_AMOUNT = DS__MAXIMUM_DEDUCTIBLE_AMOUNT;

	/**
	 * The feature id for the '<em><b>Id3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_FOR_PERMANENT_EXPENSE__ID3 = DS__ID3;

	/**
	 * The feature id for the '<em><b>Permanent expense category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_FOR_PERMANENT_EXPENSE__PERMANENT_EXPENSE_CATEGORY = DS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DS for Permanent Expense</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_FOR_PERMANENT_EXPENSE_FEATURE_COUNT = DS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>DS for Permanent Expense</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_FOR_PERMANENT_EXPENSE_OPERATION_COUNT = DS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Taxation.impl.DS_for_Interest_ExpenseImpl <em>DS for Interest Expense</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.impl.DS_for_Interest_ExpenseImpl
	 * @see Taxation.impl.TaxationPackageImpl#getDS_for_Interest_Expense()
	 * @generated
	 */
	int DS_FOR_INTEREST_EXPENSE = 41;

	/**
	 * The feature id for the '<em><b>Maximum deductible amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_FOR_INTEREST_EXPENSE__MAXIMUM_DEDUCTIBLE_AMOUNT = DS__MAXIMUM_DEDUCTIBLE_AMOUNT;

	/**
	 * The feature id for the '<em><b>Id3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_FOR_INTEREST_EXPENSE__ID3 = DS__ID3;

	/**
	 * The number of structural features of the '<em>DS for Interest Expense</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_FOR_INTEREST_EXPENSE_FEATURE_COUNT = DS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DS for Interest Expense</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_FOR_INTEREST_EXPENSE_OPERATION_COUNT = DS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Taxation.impl.DS_for_Health_and_Pension_InsuranceImpl <em>DS for Health and Pension Insurance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.impl.DS_for_Health_and_Pension_InsuranceImpl
	 * @see Taxation.impl.TaxationPackageImpl#getDS_for_Health_and_Pension_Insurance()
	 * @generated
	 */
	int DS_FOR_HEALTH_AND_PENSION_INSURANCE = 42;

	/**
	 * The feature id for the '<em><b>Maximum deductible amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_FOR_HEALTH_AND_PENSION_INSURANCE__MAXIMUM_DEDUCTIBLE_AMOUNT = DS__MAXIMUM_DEDUCTIBLE_AMOUNT;

	/**
	 * The feature id for the '<em><b>Id3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_FOR_HEALTH_AND_PENSION_INSURANCE__ID3 = DS__ID3;

	/**
	 * The feature id for the '<em><b>Insurance category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_FOR_HEALTH_AND_PENSION_INSURANCE__INSURANCE_CATEGORY = DS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>DS for Health and Pension Insurance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_FOR_HEALTH_AND_PENSION_INSURANCE_FEATURE_COUNT = DS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>DS for Health and Pension Insurance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_FOR_HEALTH_AND_PENSION_INSURANCE_OPERATION_COUNT = DS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Taxation.impl.DS_for_Private_Insurance_and_PlanImpl <em>DS for Private Insurance and Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.impl.DS_for_Private_Insurance_and_PlanImpl
	 * @see Taxation.impl.TaxationPackageImpl#getDS_for_Private_Insurance_and_Plan()
	 * @generated
	 */
	int DS_FOR_PRIVATE_INSURANCE_AND_PLAN = 43;

	/**
	 * The feature id for the '<em><b>Maximum deductible amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_FOR_PRIVATE_INSURANCE_AND_PLAN__MAXIMUM_DEDUCTIBLE_AMOUNT = DS__MAXIMUM_DEDUCTIBLE_AMOUNT;

	/**
	 * The feature id for the '<em><b>Id3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_FOR_PRIVATE_INSURANCE_AND_PLAN__ID3 = DS__ID3;

	/**
	 * The feature id for the '<em><b>Private insurance and plan category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_FOR_PRIVATE_INSURANCE_AND_PLAN__PRIVATE_INSURANCE_AND_PLAN_CATEGORY = DS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Increase for life insurance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_FOR_PRIVATE_INSURANCE_AND_PLAN__INCREASE_FOR_LIFE_INSURANCE = DS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Maximum deductible amount for private insurance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_FOR_PRIVATE_INSURANCE_AND_PLAN__MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_PRIVATE_INSURANCE = DS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Maximum deductible amount for old age pension plan</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_FOR_PRIVATE_INSURANCE_AND_PLAN__MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_OLD_AGE_PENSION_PLAN = DS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>DS for Private Insurance and Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_FOR_PRIVATE_INSURANCE_AND_PLAN_FEATURE_COUNT = DS_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>DS for Private Insurance and Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_FOR_PRIVATE_INSURANCE_AND_PLAN_OPERATION_COUNT = DS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Taxation.impl.DS_for_Loss_CarryforwardImpl <em>DS for Loss Carryforward</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.impl.DS_for_Loss_CarryforwardImpl
	 * @see Taxation.impl.TaxationPackageImpl#getDS_for_Loss_Carryforward()
	 * @generated
	 */
	int DS_FOR_LOSS_CARRYFORWARD = 44;

	/**
	 * The feature id for the '<em><b>Maximum deductible amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_FOR_LOSS_CARRYFORWARD__MAXIMUM_DEDUCTIBLE_AMOUNT = DS__MAXIMUM_DEDUCTIBLE_AMOUNT;

	/**
	 * The feature id for the '<em><b>Id3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_FOR_LOSS_CARRYFORWARD__ID3 = DS__ID3;

	/**
	 * The number of structural features of the '<em>DS for Loss Carryforward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_FOR_LOSS_CARRYFORWARD_FEATURE_COUNT = DS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DS for Loss Carryforward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_FOR_LOSS_CARRYFORWARD_OPERATION_COUNT = DS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Taxation.impl.DS_for_DonationImpl <em>DS for Donation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.impl.DS_for_DonationImpl
	 * @see Taxation.impl.TaxationPackageImpl#getDS_for_Donation()
	 * @generated
	 */
	int DS_FOR_DONATION = 45;

	/**
	 * The feature id for the '<em><b>Maximum deductible amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_FOR_DONATION__MAXIMUM_DEDUCTIBLE_AMOUNT = DS__MAXIMUM_DEDUCTIBLE_AMOUNT;

	/**
	 * The feature id for the '<em><b>Id3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_FOR_DONATION__ID3 = DS__ID3;

	/**
	 * The number of structural features of the '<em>DS for Donation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_FOR_DONATION_FEATURE_COUNT = DS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>DS for Donation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DS_FOR_DONATION_OPERATION_COUNT = DS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Taxation.impl.Special_Expense_DSImpl <em>Special Expense DS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.impl.Special_Expense_DSImpl
	 * @see Taxation.impl.TaxationPackageImpl#getSpecial_Expense_DS()
	 * @generated
	 */
	int SPECIAL_EXPENSE_DS = 47;

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
	 * The meta object id for the '{@link Taxation.impl.Permanent_ExpenseImpl <em>Permanent Expense</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.impl.Permanent_ExpenseImpl
	 * @see Taxation.impl.TaxationPackageImpl#getPermanent_Expense()
	 * @generated
	 */
	int PERMANENT_EXPENSE = 46;

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
	 * The feature id for the '<em><b>Is eligible for deduction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMANENT_EXPENSE__IS_ELIGIBLE_FOR_DEDUCTION = SPECIAL_EXPENSE_DS_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Permanent Expense</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMANENT_EXPENSE_FEATURE_COUNT = SPECIAL_EXPENSE_DS_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Permanent Expense</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMANENT_EXPENSE_OPERATION_COUNT = SPECIAL_EXPENSE_DS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Taxation.impl.Interest_ExpenseImpl <em>Interest Expense</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.impl.Interest_ExpenseImpl
	 * @see Taxation.impl.TaxationPackageImpl#getInterest_Expense()
	 * @generated
	 */
	int INTEREST_EXPENSE = 48;

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
	 * The meta object id for the '{@link Taxation.impl.Private_Insurance_and_PlanImpl <em>Private Insurance and Plan</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.impl.Private_Insurance_and_PlanImpl
	 * @see Taxation.impl.TaxationPackageImpl#getPrivate_Insurance_and_Plan()
	 * @generated
	 */
	int PRIVATE_INSURANCE_AND_PLAN = 49;

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
	 * The feature id for the '<em><b>Is private insurance and plan eligible for deduction</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_INSURANCE_AND_PLAN__IS_PRIVATE_INSURANCE_AND_PLAN_ELIGIBLE_FOR_DEDUCTION = SPECIAL_EXPENSE_DS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Private Insurance and Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_INSURANCE_AND_PLAN_FEATURE_COUNT = SPECIAL_EXPENSE_DS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Private Insurance and Plan</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVATE_INSURANCE_AND_PLAN_OPERATION_COUNT = SPECIAL_EXPENSE_DS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Taxation.impl.Health_and_Pension_InsuranceImpl <em>Health and Pension Insurance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.impl.Health_and_Pension_InsuranceImpl
	 * @see Taxation.impl.TaxationPackageImpl#getHealth_and_Pension_Insurance()
	 * @generated
	 */
	int HEALTH_AND_PENSION_INSURANCE = 50;

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
	 * The meta object id for the '{@link Taxation.impl.DonationImpl <em>Donation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.impl.DonationImpl
	 * @see Taxation.impl.TaxationPackageImpl#getDonation()
	 * @generated
	 */
	int DONATION = 51;

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
	 * The feature id for the '<em><b>Is beneficiary eligible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATION__IS_BENEFICIARY_ELIGIBLE = SPECIAL_EXPENSE_DS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is donation reported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATION__IS_DONATION_REPORTED = SPECIAL_EXPENSE_DS_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Donation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATION_FEATURE_COUNT = SPECIAL_EXPENSE_DS_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Donation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DONATION_OPERATION_COUNT = SPECIAL_EXPENSE_DS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Taxation.impl.Loss_CarryforwardImpl <em>Loss Carryforward</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.impl.Loss_CarryforwardImpl
	 * @see Taxation.impl.TaxationPackageImpl#getLoss_Carryforward()
	 * @generated
	 */
	int LOSS_CARRYFORWARD = 52;

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
	 * The feature id for the '<em><b>Regular accountability</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_CARRYFORWARD__REGULAR_ACCOUNTABILITY = SPECIAL_EXPENSE_DS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Compensation by other means</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_CARRYFORWARD__COMPENSATION_BY_OTHER_MEANS = SPECIAL_EXPENSE_DS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Tax payer has inherited business ownership</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_CARRYFORWARD__TAX_PAYER_HAS_INHERITED_BUSINESS_OWNERSHIP = SPECIAL_EXPENSE_DS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tax payer has been partner in business</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_CARRYFORWARD__TAX_PAYER_HAS_BEEN_PARTNER_IN_BUSINESS = SPECIAL_EXPENSE_DS_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Loss Carryforward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_CARRYFORWARD_FEATURE_COUNT = SPECIAL_EXPENSE_DS_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Loss Carryforward</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOSS_CARRYFORWARD_OPERATION_COUNT = SPECIAL_EXPENSE_DS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link Taxation.impl.Spousal_Expense_ACImpl <em>Spousal Expense AC</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.impl.Spousal_Expense_ACImpl
	 * @see Taxation.impl.TaxationPackageImpl#getSpousal_Expense_AC()
	 * @generated
	 */
	int SPOUSAL_EXPENSE_AC = 53;

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
	 * The meta object id for the '{@link Taxation.impl.Extraordinary_Expense_CEImpl <em>Extraordinary Expense CE</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.impl.Extraordinary_Expense_CEImpl
	 * @see Taxation.impl.TaxationPackageImpl#getExtraordinary_Expense_CE()
	 * @generated
	 */
	int EXTRAORDINARY_EXPENSE_CE = 54;

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
	 * The meta object id for the '{@link Taxation.impl.Professional_ExpenseImpl <em>Professional Expense</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.impl.Professional_ExpenseImpl
	 * @see Taxation.impl.TaxationPackageImpl#getProfessional_Expense()
	 * @generated
	 */
	int PROFESSIONAL_EXPENSE = 56;

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
	 * The meta object id for the '{@link Taxation.impl.Travel_Expense_FDImpl <em>Travel Expense FD</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.impl.Travel_Expense_FDImpl
	 * @see Taxation.impl.TaxationPackageImpl#getTravel_Expense_FD()
	 * @generated
	 */
	int TRAVEL_EXPENSE_FD = 55;

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
	 * The meta object id for the '{@link Taxation.impl.Miscellaneous_Expense_FOImpl <em>Miscellaneous Expense FO</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.impl.Miscellaneous_Expense_FOImpl
	 * @see Taxation.impl.TaxationPackageImpl#getMiscellaneous_Expense_FO()
	 * @generated
	 */
	int MISCELLANEOUS_EXPENSE_FO = 57;

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
	 * The meta object id for the '{@link Taxation.Grantor <em>Grantor</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.Grantor
	 * @see Taxation.impl.TaxationPackageImpl#getGrantor()
	 * @generated
	 */
	int GRANTOR = 58;

	/**
	 * The meta object id for the '{@link Taxation.Disability_Types <em>Disability Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.Disability_Types
	 * @see Taxation.impl.TaxationPackageImpl#getDisability_Types()
	 * @generated
	 */
	int DISABILITY_TYPES = 59;

	/**
	 * The meta object id for the '{@link Taxation.Country <em>Country</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.Country
	 * @see Taxation.impl.TaxationPackageImpl#getCountry()
	 * @generated
	 */
	int COUNTRY = 60;

	/**
	 * The meta object id for the '{@link Taxation.Tax_Card_Type <em>Tax Card Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.Tax_Card_Type
	 * @see Taxation.impl.TaxationPackageImpl#getTax_Card_Type()
	 * @generated
	 */
	int TAX_CARD_TYPE = 61;

	/**
	 * The meta object id for the '{@link Taxation.Tax_Office <em>Tax Office</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.Tax_Office
	 * @see Taxation.impl.TaxationPackageImpl#getTax_Office()
	 * @generated
	 */
	int TAX_OFFICE = 62;

	/**
	 * The meta object id for the '{@link Taxation.Tax_Class_Category <em>Tax Class Category</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.Tax_Class_Category
	 * @see Taxation.impl.TaxationPackageImpl#getTax_Class_Category()
	 * @generated
	 */
	int TAX_CLASS_CATEGORY = 63;

	/**
	 * The meta object id for the '{@link Taxation.Job_Activity <em>Job Activity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.Job_Activity
	 * @see Taxation.impl.TaxationPackageImpl#getJob_Activity()
	 * @generated
	 */
	int JOB_ACTIVITY = 64;

	/**
	 * The meta object id for the '{@link Taxation.Town <em>Town</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.Town
	 * @see Taxation.impl.TaxationPackageImpl#getTown()
	 * @generated
	 */
	int TOWN = 65;

	/**
	 * The meta object id for the '{@link Taxation.Type_of_Rate <em>Type of Rate</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.Type_of_Rate
	 * @see Taxation.impl.TaxationPackageImpl#getType_of_Rate()
	 * @generated
	 */
	int TYPE_OF_RATE = 66;

	/**
	 * The meta object id for the '{@link Taxation.CE_Type <em>CE Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.CE_Type
	 * @see Taxation.impl.TaxationPackageImpl#getCE_Type()
	 * @generated
	 */
	int CE_TYPE = 67;

	/**
	 * The meta object id for the '{@link Taxation.Expense_Purpose <em>Expense Purpose</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.Expense_Purpose
	 * @see Taxation.impl.TaxationPackageImpl#getExpense_Purpose()
	 * @generated
	 */
	int EXPENSE_PURPOSE = 68;

	/**
	 * The meta object id for the '{@link Taxation.Dependent_Type <em>Dependent Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.Dependent_Type
	 * @see Taxation.impl.TaxationPackageImpl#getDependent_Type()
	 * @generated
	 */
	int DEPENDENT_TYPE = 69;

	/**
	 * The meta object id for the '{@link Taxation.Separation_Causes <em>Separation Causes</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.Separation_Causes
	 * @see Taxation.impl.TaxationPackageImpl#getSeparation_Causes()
	 * @generated
	 */
	int SEPARATION_CAUSES = 70;

	/**
	 * The meta object id for the '{@link Taxation.Category_of_Permanent_Expense <em>Category of Permanent Expense</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.Category_of_Permanent_Expense
	 * @see Taxation.impl.TaxationPackageImpl#getCategory_of_Permanent_Expense()
	 * @generated
	 */
	int CATEGORY_OF_PERMANENT_EXPENSE = 71;

	/**
	 * The meta object id for the '{@link Taxation.Category_of_Health_and_Pension_Insurances <em>Category of Health and Pension Insurances</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.Category_of_Health_and_Pension_Insurances
	 * @see Taxation.impl.TaxationPackageImpl#getCategory_of_Health_and_Pension_Insurances()
	 * @generated
	 */
	int CATEGORY_OF_HEALTH_AND_PENSION_INSURANCES = 72;

	/**
	 * The meta object id for the '{@link Taxation.Category_of_Private_Insurance_and_Plan <em>Category of Private Insurance and Plan</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.Category_of_Private_Insurance_and_Plan
	 * @see Taxation.impl.TaxationPackageImpl#getCategory_of_Private_Insurance_and_Plan()
	 * @generated
	 */
	int CATEGORY_OF_PRIVATE_INSURANCE_AND_PLAN = 73;

	/**
	 * The meta object id for the '{@link Taxation.Legal_Union_Types <em>Legal Union Types</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see Taxation.Legal_Union_Types
	 * @see Taxation.impl.TaxationPackageImpl#getLegal_Union_Types()
	 * @generated
	 */
	int LEGAL_UNION_TYPES = 74;


	/**
	 * Returns the meta object for class '{@link Taxation.Constants <em>Constants</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constants</em>'.
	 * @see Taxation.Constants
	 * @generated
	 */
	EClass getConstants();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Constants#getMAXIMUM_CE_RATE_FOR_CHILD_NOT_BEING_PART_OF_HOUSEHOLD <em>MAXIMUM CE RATE FOR CHILD NOT BEING PART OF HOUSEHOLD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MAXIMUM CE RATE FOR CHILD NOT BEING PART OF HOUSEHOLD</em>'.
	 * @see Taxation.Constants#getMAXIMUM_CE_RATE_FOR_CHILD_NOT_BEING_PART_OF_HOUSEHOLD()
	 * @see #getConstants()
	 * @generated
	 */
	EAttribute getConstants_MAXIMUM_CE_RATE_FOR_CHILD_NOT_BEING_PART_OF_HOUSEHOLD();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Constants#getMAXIMUM_CE_RATE_FOR_HOUSE_CARE_AND_CHILD_PART_OF_THE_HOUSEHOLD_CARE <em>MAXIMUM CE RATE FOR HOUSE CARE AND CHILD PART OF THE HOUSEHOLD CARE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MAXIMUM CE RATE FOR HOUSE CARE AND CHILD PART OF THE HOUSEHOLD CARE</em>'.
	 * @see Taxation.Constants#getMAXIMUM_CE_RATE_FOR_HOUSE_CARE_AND_CHILD_PART_OF_THE_HOUSEHOLD_CARE()
	 * @see #getConstants()
	 * @generated
	 */
	EAttribute getConstants_MAXIMUM_CE_RATE_FOR_HOUSE_CARE_AND_CHILD_PART_OF_THE_HOUSEHOLD_CARE();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Constants#getMINIMUM_SALARY <em>MINIMUM SALARY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MINIMUM SALARY</em>'.
	 * @see Taxation.Constants#getMINIMUM_SALARY()
	 * @see #getConstants()
	 * @generated
	 */
	EAttribute getConstants_MINIMUM_SALARY();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Constants#getFLAT_RATE_FOR_EXTRA_PROFESSIONAL_DEDUCTION <em>FLAT RATE FOR EXTRA PROFESSIONAL DEDUCTION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>FLAT RATE FOR EXTRA PROFESSIONAL DEDUCTION</em>'.
	 * @see Taxation.Constants#getFLAT_RATE_FOR_EXTRA_PROFESSIONAL_DEDUCTION()
	 * @see #getConstants()
	 * @generated
	 */
	EAttribute getConstants_FLAT_RATE_FOR_EXTRA_PROFESSIONAL_DEDUCTION();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Constants#getMAXIMUM_DEDUCTIBLE_PERCENTAGE_FOR_DONATIONS <em>MAXIMUM DEDUCTIBLE PERCENTAGE FOR DONATIONS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MAXIMUM DEDUCTIBLE PERCENTAGE FOR DONATIONS</em>'.
	 * @see Taxation.Constants#getMAXIMUM_DEDUCTIBLE_PERCENTAGE_FOR_DONATIONS()
	 * @see #getConstants()
	 * @generated
	 */
	EAttribute getConstants_MAXIMUM_DEDUCTIBLE_PERCENTAGE_FOR_DONATIONS();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Constants#getMINIMUM_DEDUCTIBLE_AMOUNT_FOR_DONATIONS <em>MINIMUM DEDUCTIBLE AMOUNT FOR DONATIONS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MINIMUM DEDUCTIBLE AMOUNT FOR DONATIONS</em>'.
	 * @see Taxation.Constants#getMINIMUM_DEDUCTIBLE_AMOUNT_FOR_DONATIONS()
	 * @see #getConstants()
	 * @generated
	 */
	EAttribute getConstants_MINIMUM_DEDUCTIBLE_AMOUNT_FOR_DONATIONS();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Constants#getMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANC <em>MAXIMUM DEDUCTIBLE AMOUNT FOR ADDITIONAL PENSION AND INSURANC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MAXIMUM DEDUCTIBLE AMOUNT FOR ADDITIONAL PENSION AND INSURANC</em>'.
	 * @see Taxation.Constants#getMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANC()
	 * @see #getConstants()
	 * @generated
	 */
	EAttribute getConstants_MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANC();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Constants#getMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ALIMONY_EXPENSE <em>MAXIMUM DEDUCTIBLE AMOUNT FOR ALIMONY EXPENSE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MAXIMUM DEDUCTIBLE AMOUNT FOR ALIMONY EXPENSE</em>'.
	 * @see Taxation.Constants#getMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ALIMONY_EXPENSE()
	 * @see #getConstants()
	 * @generated
	 */
	EAttribute getConstants_MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ALIMONY_EXPENSE();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Constants#getMAXIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION <em>MAXIMAL DISTANCE FOR TRAVEL EXPENSE DEDUCTION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MAXIMAL DISTANCE FOR TRAVEL EXPENSE DEDUCTION</em>'.
	 * @see Taxation.Constants#getMAXIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION()
	 * @see #getConstants()
	 * @generated
	 */
	EAttribute getConstants_MAXIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Constants#getMAXIMAL_FLAT_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION <em>MAXIMAL FLAT DISTANCE FOR TRAVEL EXPENSE DEDUCTION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MAXIMAL FLAT DISTANCE FOR TRAVEL EXPENSE DEDUCTION</em>'.
	 * @see Taxation.Constants#getMAXIMAL_FLAT_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION()
	 * @see #getConstants()
	 * @generated
	 */
	EAttribute getConstants_MAXIMAL_FLAT_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Constants#getMINIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION <em>MINIMAL DISTANCE FOR TRAVEL EXPENSE DEDUCTION</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MINIMAL DISTANCE FOR TRAVEL EXPENSE DEDUCTION</em>'.
	 * @see Taxation.Constants#getMINIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION()
	 * @see #getConstants()
	 * @generated
	 */
	EAttribute getConstants_MINIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Constants#getFLAT_RATE_CIM_DAILY <em>FLAT RATE CIM DAILY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>FLAT RATE CIM DAILY</em>'.
	 * @see Taxation.Constants#getFLAT_RATE_CIM_DAILY()
	 * @see #getConstants()
	 * @generated
	 */
	EAttribute getConstants_FLAT_RATE_CIM_DAILY();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Constants#getFLAT_RATE_CIM_MONTHLY <em>FLAT RATE CIM MONTHLY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>FLAT RATE CIM MONTHLY</em>'.
	 * @see Taxation.Constants#getFLAT_RATE_CIM_MONTHLY()
	 * @see #getConstants()
	 * @generated
	 */
	EAttribute getConstants_FLAT_RATE_CIM_MONTHLY();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Constants#getFLAT_RATE_CIM_YEARLY <em>FLAT RATE CIM YEARLY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>FLAT RATE CIM YEARLY</em>'.
	 * @see Taxation.Constants#getFLAT_RATE_CIM_YEARLY()
	 * @see #getConstants()
	 * @generated
	 */
	EAttribute getConstants_FLAT_RATE_CIM_YEARLY();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Constants#getFLAT_RATE_CIP_DAILY <em>FLAT RATE CIP DAILY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>FLAT RATE CIP DAILY</em>'.
	 * @see Taxation.Constants#getFLAT_RATE_CIP_DAILY()
	 * @see #getConstants()
	 * @generated
	 */
	EAttribute getConstants_FLAT_RATE_CIP_DAILY();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Constants#getFLAT_RATE_CIP_MONTHLY <em>FLAT RATE CIP MONTHLY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>FLAT RATE CIP MONTHLY</em>'.
	 * @see Taxation.Constants#getFLAT_RATE_CIP_MONTHLY()
	 * @see #getConstants()
	 * @generated
	 */
	EAttribute getConstants_FLAT_RATE_CIP_MONTHLY();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Constants#getFLAT_RATE_CIP_YEARLY <em>FLAT RATE CIP YEARLY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>FLAT RATE CIP YEARLY</em>'.
	 * @see Taxation.Constants#getFLAT_RATE_CIP_YEARLY()
	 * @see #getConstants()
	 * @generated
	 */
	EAttribute getConstants_FLAT_RATE_CIP_YEARLY();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Constants#getFLAT_RATE_CIS_DAILY <em>FLAT RATE CIS DAILY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>FLAT RATE CIS DAILY</em>'.
	 * @see Taxation.Constants#getFLAT_RATE_CIS_DAILY()
	 * @see #getConstants()
	 * @generated
	 */
	EAttribute getConstants_FLAT_RATE_CIS_DAILY();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Constants#getFLAT_RATE_CIS_MONTHLY <em>FLAT RATE CIS MONTHLY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>FLAT RATE CIS MONTHLY</em>'.
	 * @see Taxation.Constants#getFLAT_RATE_CIS_MONTHLY()
	 * @see #getConstants()
	 * @generated
	 */
	EAttribute getConstants_FLAT_RATE_CIS_MONTHLY();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Constants#getFLAT_RATE_CIS_YEARLY <em>FLAT RATE CIS YEARLY</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>FLAT RATE CIS YEARLY</em>'.
	 * @see Taxation.Constants#getFLAT_RATE_CIS_YEARLY()
	 * @see #getConstants()
	 * @generated
	 */
	EAttribute getConstants_FLAT_RATE_CIS_YEARLY();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Constants#getFLAT_RATE_FOR_TRAVEL_EXPENSE_PER_UNIT <em>FLAT RATE FOR TRAVEL EXPENSE PER UNIT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>FLAT RATE FOR TRAVEL EXPENSE PER UNIT</em>'.
	 * @see Taxation.Constants#getFLAT_RATE_FOR_TRAVEL_EXPENSE_PER_UNIT()
	 * @see #getConstants()
	 * @generated
	 */
	EAttribute getConstants_FLAT_RATE_FOR_TRAVEL_EXPENSE_PER_UNIT();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Constants#getMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_DS <em>MAXIMUM DEDUCTIBLE AMOUNT FOR DS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MAXIMUM DEDUCTIBLE AMOUNT FOR DS</em>'.
	 * @see Taxation.Constants#getMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_DS()
	 * @see #getConstants()
	 * @generated
	 */
	EAttribute getConstants_MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_DS();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Constants#getFLAT_RATE_FOR_MISCELLANEOUS_EXPENSE <em>FLAT RATE FOR MISCELLANEOUS EXPENSE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>FLAT RATE FOR MISCELLANEOUS EXPENSE</em>'.
	 * @see Taxation.Constants#getFLAT_RATE_FOR_MISCELLANEOUS_EXPENSE()
	 * @see #getConstants()
	 * @generated
	 */
	EAttribute getConstants_FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Constants#getDISABILITY_FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE <em>DISABILITY FLAT RATE FOR MISCELLANEOUS EXPENSE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>DISABILITY FLAT RATE FOR MISCELLANEOUS EXPENSE</em>'.
	 * @see Taxation.Constants#getDISABILITY_FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE()
	 * @see #getConstants()
	 * @generated
	 */
	EAttribute getConstants_DISABILITY_FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Constants#getMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANCE <em>MAXIMUM DEDUCTIBLE AMOUNT FOR ADDITIONAL PENSION AND INSURANCE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>MAXIMUM DEDUCTIBLE AMOUNT FOR ADDITIONAL PENSION AND INSURANCE</em>'.
	 * @see Taxation.Constants#getMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANCE()
	 * @see #getConstants()
	 * @generated
	 */
	EAttribute getConstants_MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANCE();

	/**
	 * Returns the meta object for class '{@link Taxation.Income_Tax <em>Income Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Income Tax</em>'.
	 * @see Taxation.Income_Tax
	 * @generated
	 */
	EClass getIncome_Tax();

	/**
	 * Returns the meta object for the reference '{@link Taxation.Income_Tax#getTaxPayer <em>Tax Payer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tax Payer</em>'.
	 * @see Taxation.Income_Tax#getTaxPayer()
	 * @see #getIncome_Tax()
	 * @generated
	 */
	EReference getIncome_Tax_TaxPayer();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Income_Tax#getTax_amount <em>Tax amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax amount</em>'.
	 * @see Taxation.Income_Tax#getTax_amount()
	 * @see #getIncome_Tax()
	 * @generated
	 */
	EAttribute getIncome_Tax_Tax_amount();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Income_Tax#getTax_year <em>Tax year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax year</em>'.
	 * @see Taxation.Income_Tax#getTax_year()
	 * @see #getIncome_Tax()
	 * @generated
	 */
	EAttribute getIncome_Tax_Tax_year();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Income_Tax#getId6 <em>Id6</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id6</em>'.
	 * @see Taxation.Income_Tax#getId6()
	 * @see #getIncome_Tax()
	 * @generated
	 */
	EAttribute getIncome_Tax_Id6();

	/**
	 * Returns the meta object for class '{@link Taxation.Tax_Payer <em>Tax Payer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tax Payer</em>'.
	 * @see Taxation.Tax_Payer
	 * @generated
	 */
	EClass getTax_Payer();

	/**
	 * Returns the meta object for the containment reference list '{@link Taxation.Tax_Payer#getDependents <em>Dependents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dependents</em>'.
	 * @see Taxation.Tax_Payer#getDependents()
	 * @see #getTax_Payer()
	 * @generated
	 */
	EReference getTax_Payer_Dependents();

	/**
	 * Returns the meta object for the containment reference '{@link Taxation.Tax_Payer#getFrom_agent <em>From agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From agent</em>'.
	 * @see Taxation.Tax_Payer#getFrom_agent()
	 * @see #getTax_Payer()
	 * @generated
	 */
	EReference getTax_Payer_From_agent();

	/**
	 * Returns the meta object for the containment reference list '{@link Taxation.Tax_Payer#getIncomes <em>Incomes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Incomes</em>'.
	 * @see Taxation.Tax_Payer#getIncomes()
	 * @see #getTax_Payer()
	 * @generated
	 */
	EReference getTax_Payer_Incomes();

	/**
	 * Returns the meta object for the containment reference '{@link Taxation.Tax_Payer#getFrom_law <em>From law</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>From law</em>'.
	 * @see Taxation.Tax_Payer#getFrom_law()
	 * @see #getTax_Payer()
	 * @generated
	 */
	EReference getTax_Payer_From_law();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Tax_Payer#getTaxesDue <em>Taxes Due</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Taxes Due</em>'.
	 * @see Taxation.Tax_Payer#getTaxesDue()
	 * @see #getTax_Payer()
	 * @generated
	 */
	EAttribute getTax_Payer_TaxesDue();

	/**
	 * Returns the meta object for class '{@link Taxation.Physical_Person <em>Physical Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Physical Person</em>'.
	 * @see Taxation.Physical_Person
	 * @generated
	 */
	EClass getPhysical_Person();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Physical_Person#isIs_assisting_spouse <em>Is assisting spouse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is assisting spouse</em>'.
	 * @see Taxation.Physical_Person#isIs_assisting_spouse()
	 * @see #getPhysical_Person()
	 * @generated
	 */
	EAttribute getPhysical_Person_Is_assisting_spouse();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Physical_Person#getSSNo <em>SS No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>SS No</em>'.
	 * @see Taxation.Physical_Person#getSSNo()
	 * @see #getPhysical_Person()
	 * @generated
	 */
	EAttribute getPhysical_Person_SSNo();

	/**
	 * Returns the meta object for the reference list '{@link Taxation.Physical_Person#getAddresses <em>Addresses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Addresses</em>'.
	 * @see Taxation.Physical_Person#getAddresses()
	 * @see #getPhysical_Person()
	 * @generated
	 */
	EReference getPhysical_Person_Addresses();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Physical_Person#getBirth_year <em>Birth year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Birth year</em>'.
	 * @see Taxation.Physical_Person#getBirth_year()
	 * @see #getPhysical_Person()
	 * @generated
	 */
	EAttribute getPhysical_Person_Birth_year();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Physical_Person#getDisability_percentage <em>Disability percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disability percentage</em>'.
	 * @see Taxation.Physical_Person#getDisability_percentage()
	 * @see #getPhysical_Person()
	 * @generated
	 */
	EAttribute getPhysical_Person_Disability_percentage();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Physical_Person#getDisability_type <em>Disability type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disability type</em>'.
	 * @see Taxation.Physical_Person#getDisability_type()
	 * @see #getPhysical_Person()
	 * @generated
	 */
	EAttribute getPhysical_Person_Disability_type();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Physical_Person#isIs_affiliated_personnaly_to_social_security <em>Is affiliated personnaly to social security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is affiliated personnaly to social security</em>'.
	 * @see Taxation.Physical_Person#isIs_affiliated_personnaly_to_social_security()
	 * @see #getPhysical_Person()
	 * @generated
	 */
	EAttribute getPhysical_Person_Is_affiliated_personnaly_to_social_security();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Physical_Person#getBirth_month <em>Birth month</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Birth month</em>'.
	 * @see Taxation.Physical_Person#getBirth_month()
	 * @see #getPhysical_Person()
	 * @generated
	 */
	EAttribute getPhysical_Person_Birth_month();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Physical_Person#getBirth_day <em>Birth day</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Birth day</em>'.
	 * @see Taxation.Physical_Person#getBirth_day()
	 * @see #getPhysical_Person()
	 * @generated
	 */
	EAttribute getPhysical_Person_Birth_day();

	/**
	 * Returns the meta object for the reference list '{@link Taxation.Physical_Person#getExpenses <em>Expenses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Expenses</em>'.
	 * @see Taxation.Physical_Person#getExpenses()
	 * @see #getPhysical_Person()
	 * @generated
	 */
	EReference getPhysical_Person_Expenses();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Physical_Person#isIs_widower <em>Is widower</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is widower</em>'.
	 * @see Taxation.Physical_Person#isIs_widower()
	 * @see #getPhysical_Person()
	 * @generated
	 */
	EAttribute getPhysical_Person_Is_widower();

	/**
	 * Returns the meta object for the containment reference list '{@link Taxation.Physical_Person#getOwns_Address <em>Owns Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owns Address</em>'.
	 * @see Taxation.Physical_Person#getOwns_Address()
	 * @see #getPhysical_Person()
	 * @generated
	 */
	EReference getPhysical_Person_Owns_Address();

	/**
	 * Returns the meta object for class '{@link Taxation.Address <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address</em>'.
	 * @see Taxation.Address
	 * @generated
	 */
	EClass getAddress();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Address#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see Taxation.Address#getCountry()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Country();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Address#getStreet <em>Street</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Street</em>'.
	 * @see Taxation.Address#getStreet()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Street();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Address#getZipCode <em>Zip Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zip Code</em>'.
	 * @see Taxation.Address#getZipCode()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_ZipCode();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Address#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see Taxation.Address#getCity()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_City();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Address#getId2 <em>Id2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id2</em>'.
	 * @see Taxation.Address#getId2()
	 * @see #getAddress()
	 * @generated
	 */
	EAttribute getAddress_Id2();

	/**
	 * Returns the meta object for the reference list '{@link Taxation.Address#getTaxPayer <em>Tax Payer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tax Payer</em>'.
	 * @see Taxation.Address#getTaxPayer()
	 * @see #getAddress()
	 * @generated
	 */
	EReference getAddress_TaxPayer();

	/**
	 * Returns the meta object for class '{@link Taxation.Expense <em>Expense</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Expense</em>'.
	 * @see Taxation.Expense
	 * @generated
	 */
	EClass getExpense();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Expense#getDeclared_amount <em>Declared amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Declared amount</em>'.
	 * @see Taxation.Expense#getDeclared_amount()
	 * @see #getExpense()
	 * @generated
	 */
	EAttribute getExpense_Declared_amount();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Expense#getExpense_purpose <em>Expense purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expense purpose</em>'.
	 * @see Taxation.Expense#getExpense_purpose()
	 * @see #getExpense()
	 * @generated
	 */
	EAttribute getExpense_Expense_purpose();

	/**
	 * Returns the meta object for the reference '{@link Taxation.Expense#getDependent <em>Dependent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dependent</em>'.
	 * @see Taxation.Expense#getDependent()
	 * @see #getExpense()
	 * @generated
	 */
	EReference getExpense_Dependent();

	/**
	 * Returns the meta object for the reference '{@link Taxation.Expense#getFrom_agent <em>From agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From agent</em>'.
	 * @see Taxation.Expense#getFrom_agent()
	 * @see #getExpense()
	 * @generated
	 */
	EReference getExpense_From_agent();

	/**
	 * Returns the meta object for the container reference '{@link Taxation.Expense#getIncome <em>Income</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Income</em>'.
	 * @see Taxation.Expense#getIncome()
	 * @see #getExpense()
	 * @generated
	 */
	EReference getExpense_Income();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Expense#getId4 <em>Id4</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id4</em>'.
	 * @see Taxation.Expense#getId4()
	 * @see #getExpense()
	 * @generated
	 */
	EAttribute getExpense_Id4();

	/**
	 * Returns the meta object for the reference '{@link Taxation.Expense#getBeneficiary <em>Beneficiary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Beneficiary</em>'.
	 * @see Taxation.Expense#getBeneficiary()
	 * @see #getExpense()
	 * @generated
	 */
	EReference getExpense_Beneficiary();

	/**
	 * Returns the meta object for class '{@link Taxation.Dependent <em>Dependent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependent</em>'.
	 * @see Taxation.Dependent
	 * @generated
	 */
	EClass getDependent();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Dependent#getDependent_type <em>Dependent type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dependent type</em>'.
	 * @see Taxation.Dependent#getDependent_type()
	 * @see #getDependent()
	 * @generated
	 */
	EAttribute getDependent_Dependent_type();

	/**
	 * Returns the meta object for the container reference '{@link Taxation.Dependent#getResponsible_person <em>Responsible person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Responsible person</em>'.
	 * @see Taxation.Dependent#getResponsible_person()
	 * @see #getDependent()
	 * @generated
	 */
	EReference getDependent_Responsible_person();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Dependent#isContinued_studies <em>Continued studies</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Continued studies</em>'.
	 * @see Taxation.Dependent#isContinued_studies()
	 * @see #getDependent()
	 * @generated
	 */
	EAttribute getDependent_Continued_studies();

	/**
	 * Returns the meta object for the containment reference '{@link Taxation.Dependent#getAllowances <em>Allowances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Allowances</em>'.
	 * @see Taxation.Dependent#getAllowances()
	 * @see #getDependent()
	 * @generated
	 */
	EReference getDependent_Allowances();

	/**
	 * Returns the meta object for the container reference '{@link Taxation.Dependent#getHousehold <em>Household</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Household</em>'.
	 * @see Taxation.Dependent#getHousehold()
	 * @see #getDependent()
	 * @generated
	 */
	EReference getDependent_Household();

	/**
	 * Returns the meta object for the reference '{@link Taxation.Dependent#getFrom_agent <em>From agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From agent</em>'.
	 * @see Taxation.Dependent#getFrom_agent()
	 * @see #getDependent()
	 * @generated
	 */
	EReference getDependent_From_agent();

	/**
	 * Returns the meta object for the reference list '{@link Taxation.Dependent#getExpense <em>Expense</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Expense</em>'.
	 * @see Taxation.Dependent#getExpense()
	 * @see #getDependent()
	 * @generated
	 */
	EReference getDependent_Expense();

	/**
	 * Returns the meta object for class '{@link Taxation.External_Allowance <em>External Allowance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>External Allowance</em>'.
	 * @see Taxation.External_Allowance
	 * @generated
	 */
	EClass getExternal_Allowance();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.External_Allowance#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see Taxation.External_Allowance#getAmount()
	 * @see #getExternal_Allowance()
	 * @generated
	 */
	EAttribute getExternal_Allowance_Amount();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.External_Allowance#getGrantor <em>Grantor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grantor</em>'.
	 * @see Taxation.External_Allowance#getGrantor()
	 * @see #getExternal_Allowance()
	 * @generated
	 */
	EAttribute getExternal_Allowance_Grantor();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.External_Allowance#getStarting_year <em>Starting year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Starting year</em>'.
	 * @see Taxation.External_Allowance#getStarting_year()
	 * @see #getExternal_Allowance()
	 * @generated
	 */
	EAttribute getExternal_Allowance_Starting_year();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.External_Allowance#getEnding_year <em>Ending year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ending year</em>'.
	 * @see Taxation.External_Allowance#getEnding_year()
	 * @see #getExternal_Allowance()
	 * @generated
	 */
	EAttribute getExternal_Allowance_Ending_year();

	/**
	 * Returns the meta object for the reference '{@link Taxation.External_Allowance#getReciver <em>Reciver</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reciver</em>'.
	 * @see Taxation.External_Allowance#getReciver()
	 * @see #getExternal_Allowance()
	 * @generated
	 */
	EReference getExternal_Allowance_Reciver();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.External_Allowance#getId5 <em>Id5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id5</em>'.
	 * @see Taxation.External_Allowance#getId5()
	 * @see #getExternal_Allowance()
	 * @generated
	 */
	EAttribute getExternal_Allowance_Id5();

	/**
	 * Returns the meta object for the container reference '{@link Taxation.External_Allowance#getPerson <em>Person</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Person</em>'.
	 * @see Taxation.External_Allowance#getPerson()
	 * @see #getExternal_Allowance()
	 * @generated
	 */
	EReference getExternal_Allowance_Person();

	/**
	 * Returns the meta object for class '{@link Taxation.Household <em>Household</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Household</em>'.
	 * @see Taxation.Household
	 * @generated
	 */
	EClass getHousehold();

	/**
	 * Returns the meta object for the containment reference '{@link Taxation.Household#getParents <em>Parents</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parents</em>'.
	 * @see Taxation.Household#getParents()
	 * @see #getHousehold()
	 * @generated
	 */
	EReference getHousehold_Parents();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Household#getId1 <em>Id1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id1</em>'.
	 * @see Taxation.Household#getId1()
	 * @see #getHousehold()
	 * @generated
	 */
	EAttribute getHousehold_Id1();

	/**
	 * Returns the meta object for the containment reference list '{@link Taxation.Household#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see Taxation.Household#getChildren()
	 * @see #getHousehold()
	 * @generated
	 */
	EReference getHousehold_Children();

	/**
	 * Returns the meta object for class '{@link Taxation.Legal_Union_Record <em>Legal Union Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legal Union Record</em>'.
	 * @see Taxation.Legal_Union_Record
	 * @generated
	 */
	EClass getLegal_Union_Record();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Legal_Union_Record#getStart_year <em>Start year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start year</em>'.
	 * @see Taxation.Legal_Union_Record#getStart_year()
	 * @see #getLegal_Union_Record()
	 * @generated
	 */
	EAttribute getLegal_Union_Record_Start_year();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Legal_Union_Record#getEnd_year <em>End year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End year</em>'.
	 * @see Taxation.Legal_Union_Record#getEnd_year()
	 * @see #getLegal_Union_Record()
	 * @generated
	 */
	EAttribute getLegal_Union_Record_End_year();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Legal_Union_Record#getSeparation_cause <em>Separation cause</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Separation cause</em>'.
	 * @see Taxation.Legal_Union_Record#getSeparation_cause()
	 * @see #getLegal_Union_Record()
	 * @generated
	 */
	EAttribute getLegal_Union_Record_Separation_cause();

	/**
	 * Returns the meta object for the containment reference '{@link Taxation.Legal_Union_Record#getIndividual_A <em>Individual A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Individual A</em>'.
	 * @see Taxation.Legal_Union_Record#getIndividual_A()
	 * @see #getLegal_Union_Record()
	 * @generated
	 */
	EReference getLegal_Union_Record_Individual_A();

	/**
	 * Returns the meta object for the containment reference list '{@link Taxation.Legal_Union_Record#getIndividual_B <em>Individual B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Individual B</em>'.
	 * @see Taxation.Legal_Union_Record#getIndividual_B()
	 * @see #getLegal_Union_Record()
	 * @generated
	 */
	EReference getLegal_Union_Record_Individual_B();

	/**
	 * Returns the meta object for the containment reference list '{@link Taxation.Legal_Union_Record#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see Taxation.Legal_Union_Record#getProperties()
	 * @see #getLegal_Union_Record()
	 * @generated
	 */
	EReference getLegal_Union_Record_Properties();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Legal_Union_Record#isMutual_agreement <em>Mutual agreement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mutual agreement</em>'.
	 * @see Taxation.Legal_Union_Record#isMutual_agreement()
	 * @see #getLegal_Union_Record()
	 * @generated
	 */
	EAttribute getLegal_Union_Record_Mutual_agreement();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Legal_Union_Record#getId9 <em>Id9</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id9</em>'.
	 * @see Taxation.Legal_Union_Record#getId9()
	 * @see #getLegal_Union_Record()
	 * @generated
	 */
	EAttribute getLegal_Union_Record_Id9();

	/**
	 * Returns the meta object for the container reference '{@link Taxation.Legal_Union_Record#getHousehold <em>Household</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Household</em>'.
	 * @see Taxation.Legal_Union_Record#getHousehold()
	 * @see #getLegal_Union_Record()
	 * @generated
	 */
	EReference getLegal_Union_Record_Household();

	/**
	 * Returns the meta object for class '{@link Taxation.Tax_Property <em>Tax Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tax Property</em>'.
	 * @see Taxation.Tax_Property
	 * @generated
	 */
	EClass getTax_Property();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Tax_Property#getStarting_year <em>Starting year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Starting year</em>'.
	 * @see Taxation.Tax_Property#getStarting_year()
	 * @see #getTax_Property()
	 * @generated
	 */
	EAttribute getTax_Property_Starting_year();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Tax_Property#getId10 <em>Id10</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id10</em>'.
	 * @see Taxation.Tax_Property#getId10()
	 * @see #getTax_Property()
	 * @generated
	 */
	EAttribute getTax_Property_Id10();

	/**
	 * Returns the meta object for the container reference '{@link Taxation.Tax_Property#getUnion_record <em>Union record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Union record</em>'.
	 * @see Taxation.Tax_Property#getUnion_record()
	 * @see #getTax_Property()
	 * @generated
	 */
	EReference getTax_Property_Union_record();

	/**
	 * Returns the meta object for class '{@link Taxation.Tax_Case <em>Tax Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tax Case</em>'.
	 * @see Taxation.Tax_Case
	 * @generated
	 */
	EClass getTax_Case();

	/**
	 * Returns the meta object for class '{@link Taxation.FromAgent <em>From Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>From Agent</em>'.
	 * @see Taxation.FromAgent
	 * @generated
	 */
	EClass getFromAgent();

	/**
	 * Returns the meta object for the container reference '{@link Taxation.FromAgent#getTaxPayer <em>Tax Payer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Tax Payer</em>'.
	 * @see Taxation.FromAgent#getTaxPayer()
	 * @see #getFromAgent()
	 * @generated
	 */
	EReference getFromAgent_TaxPayer();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.FromAgent#isIs_dependent_eligible_for_CE_Not_In_Houshold_Children_Care <em>Is dependent eligible for CE Not In Houshold Children Care</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is dependent eligible for CE Not In Houshold Children Care</em>'.
	 * @see Taxation.FromAgent#isIs_dependent_eligible_for_CE_Not_In_Houshold_Children_Care()
	 * @see #getFromAgent()
	 * @generated
	 */
	EAttribute getFromAgent_Is_dependent_eligible_for_CE_Not_In_Houshold_Children_Care();

	/**
	 * Returns the meta object for the reference '{@link Taxation.FromAgent#getExpense <em>Expense</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Expense</em>'.
	 * @see Taxation.FromAgent#getExpense()
	 * @see #getFromAgent()
	 * @generated
	 */
	EReference getFromAgent_Expense();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.FromAgent#isIs_eligible_debt <em>Is eligible debt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is eligible debt</em>'.
	 * @see Taxation.FromAgent#isIs_eligible_debt()
	 * @see #getFromAgent()
	 * @generated
	 */
	EAttribute getFromAgent_Is_eligible_debt();

	/**
	 * Returns the meta object for the reference '{@link Taxation.FromAgent#getDependent <em>Dependent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dependent</em>'.
	 * @see Taxation.FromAgent#getDependent()
	 * @see #getFromAgent()
	 * @generated
	 */
	EReference getFromAgent_Dependent();

	/**
	 * Returns the meta object for class '{@link Taxation.Income <em>Income</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Income</em>'.
	 * @see Taxation.Income
	 * @generated
	 */
	EClass getIncome();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Income#getIncome_amount <em>Income amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Income amount</em>'.
	 * @see Taxation.Income#getIncome_amount()
	 * @see #getIncome()
	 * @generated
	 */
	EAttribute getIncome_Income_amount();

	/**
	 * Returns the meta object for the containment reference '{@link Taxation.Income#getIncome_type <em>Income type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Income type</em>'.
	 * @see Taxation.Income#getIncome_type()
	 * @see #getIncome()
	 * @generated
	 */
	EReference getIncome_Income_type();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Income#getStart_date_within_taxation_year <em>Start date within taxation year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start date within taxation year</em>'.
	 * @see Taxation.Income#getStart_date_within_taxation_year()
	 * @see #getIncome()
	 * @generated
	 */
	EAttribute getIncome_Start_date_within_taxation_year();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Income#getStart_date_of_contract <em>Start date of contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start date of contract</em>'.
	 * @see Taxation.Income#getStart_date_of_contract()
	 * @see #getIncome()
	 * @generated
	 */
	EAttribute getIncome_Start_date_of_contract();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Income#getEnd_date_within_taxation_year <em>End date within taxation year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End date within taxation year</em>'.
	 * @see Taxation.Income#getEnd_date_within_taxation_year()
	 * @see #getIncome()
	 * @generated
	 */
	EAttribute getIncome_End_date_within_taxation_year();

	/**
	 * Returns the meta object for the containment reference '{@link Taxation.Income#getTax_card <em>Tax card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tax card</em>'.
	 * @see Taxation.Income#getTax_card()
	 * @see #getIncome()
	 * @generated
	 */
	EReference getIncome_Tax_card();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Income#getTax_liability <em>Tax liability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax liability</em>'.
	 * @see Taxation.Income#getTax_liability()
	 * @see #getIncome()
	 * @generated
	 */
	EAttribute getIncome_Tax_liability();

	/**
	 * Returns the meta object for the container reference '{@link Taxation.Income#getTaxPayer <em>Tax Payer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Tax Payer</em>'.
	 * @see Taxation.Income#getTaxPayer()
	 * @see #getIncome()
	 * @generated
	 */
	EReference getIncome_TaxPayer();

	/**
	 * Returns the meta object for the containment reference list '{@link Taxation.Income#getDetails <em>Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Details</em>'.
	 * @see Taxation.Income#getDetails()
	 * @see #getIncome()
	 * @generated
	 */
	EReference getIncome_Details();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Income#getNum <em>Num</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num</em>'.
	 * @see Taxation.Income#getNum()
	 * @see #getIncome()
	 * @generated
	 */
	EAttribute getIncome_Num();

	/**
	 * Returns the meta object for the containment reference list '{@link Taxation.Income#getExpenses <em>Expenses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Expenses</em>'.
	 * @see Taxation.Income#getExpenses()
	 * @see #getIncome()
	 * @generated
	 */
	EReference getIncome_Expenses();

	/**
	 * Returns the meta object for class '{@link Taxation.Income_Type <em>Income Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Income Type</em>'.
	 * @see Taxation.Income_Type
	 * @generated
	 */
	EClass getIncome_Type();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Income_Type#isSubjectToWithholdingTax <em>Subject To Withholding Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subject To Withholding Tax</em>'.
	 * @see Taxation.Income_Type#isSubjectToWithholdingTax()
	 * @see #getIncome_Type()
	 * @generated
	 */
	EAttribute getIncome_Type_SubjectToWithholdingTax();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Income_Type#getId8 <em>Id8</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id8</em>'.
	 * @see Taxation.Income_Type#getId8()
	 * @see #getIncome_Type()
	 * @generated
	 */
	EAttribute getIncome_Type_Id8();

	/**
	 * Returns the meta object for the container reference '{@link Taxation.Income_Type#getIncome <em>Income</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Income</em>'.
	 * @see Taxation.Income_Type#getIncome()
	 * @see #getIncome_Type()
	 * @generated
	 */
	EReference getIncome_Type_Income();

	/**
	 * Returns the meta object for class '{@link Taxation.Tax_Card <em>Tax Card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tax Card</em>'.
	 * @see Taxation.Tax_Card
	 * @generated
	 */
	EClass getTax_Card();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Tax_Card#getCard_identifier <em>Card identifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Card identifier</em>'.
	 * @see Taxation.Tax_Card#getCard_identifier()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Card_identifier();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Tax_Card#getTax_card_type <em>Tax card type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax card type</em>'.
	 * @see Taxation.Tax_Card#getTax_card_type()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Tax_card_type();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Tax_Card#getTax_office <em>Tax office</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax office</em>'.
	 * @see Taxation.Tax_Card#getTax_office()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Tax_office();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Tax_Card#getValid_from_date <em>Valid from date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid from date</em>'.
	 * @see Taxation.Tax_Card#getValid_from_date()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Valid_from_date();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Tax_Card#getValid_until_date <em>Valid until date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valid until date</em>'.
	 * @see Taxation.Tax_Card#getValid_until_date()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Valid_until_date();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Tax_Card#getPercentage_of_witholding <em>Percentage of witholding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Percentage of witholding</em>'.
	 * @see Taxation.Tax_Card#getPercentage_of_witholding()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Percentage_of_witholding();

	/**
	 * Returns the meta object for the attribute list '{@link Taxation.Tax_Card#getTax_payers_name_surname <em>Tax payers name surname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tax payers name surname</em>'.
	 * @see Taxation.Tax_Card#getTax_payers_name_surname()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Tax_payers_name_surname();

	/**
	 * Returns the meta object for the attribute list '{@link Taxation.Tax_Card#getTax_payers_partner_name_surname <em>Tax payers partner name surname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tax payers partner name surname</em>'.
	 * @see Taxation.Tax_Card#getTax_payers_partner_name_surname()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Tax_payers_partner_name_surname();

	/**
	 * Returns the meta object for the reference '{@link Taxation.Tax_Card#getTax_payers_address <em>Tax payers address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tax payers address</em>'.
	 * @see Taxation.Tax_Card#getTax_payers_address()
	 * @see #getTax_Card()
	 * @generated
	 */
	EReference getTax_Card_Tax_payers_address();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Tax_Card#getJobs_Employer_SSNo <em>Jobs Employer SS No</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jobs Employer SS No</em>'.
	 * @see Taxation.Tax_Card#getJobs_Employer_SSNo()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Jobs_Employer_SSNo();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Tax_Card#getJobs_employers_name <em>Jobs employers name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jobs employers name</em>'.
	 * @see Taxation.Tax_Card#getJobs_employers_name()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Jobs_employers_name();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Tax_Card#getJobs_activity_type <em>Jobs activity type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jobs activity type</em>'.
	 * @see Taxation.Tax_Card#getJobs_activity_type()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Jobs_activity_type();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Tax_Card#getJobs_place_of_work <em>Jobs place of work</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Jobs place of work</em>'.
	 * @see Taxation.Tax_Card#getJobs_place_of_work()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Jobs_place_of_work();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Tax_Card#getDeduction_FD_daily <em>Deduction FD daily</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deduction FD daily</em>'.
	 * @see Taxation.Tax_Card#getDeduction_FD_daily()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Deduction_FD_daily();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Tax_Card#getDeduction_FD_monthly <em>Deduction FD monthly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deduction FD monthly</em>'.
	 * @see Taxation.Tax_Card#getDeduction_FD_monthly()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Deduction_FD_monthly();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Tax_Card#getDeduction_AC_daily <em>Deduction AC daily</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deduction AC daily</em>'.
	 * @see Taxation.Tax_Card#getDeduction_AC_daily()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Deduction_AC_daily();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Tax_Card#getDeduction_AC_monthly <em>Deduction AC monthly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deduction AC monthly</em>'.
	 * @see Taxation.Tax_Card#getDeduction_AC_monthly()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Deduction_AC_monthly();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Tax_Card#getDeduction_AC_yearly <em>Deduction AC yearly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deduction AC yearly</em>'.
	 * @see Taxation.Tax_Card#getDeduction_AC_yearly()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Deduction_AC_yearly();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Tax_Card#getDeduction_CE_daily <em>Deduction CE daily</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deduction CE daily</em>'.
	 * @see Taxation.Tax_Card#getDeduction_CE_daily()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Deduction_CE_daily();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Tax_Card#getDeduction_CE_monthly <em>Deduction CE monthly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deduction CE monthly</em>'.
	 * @see Taxation.Tax_Card#getDeduction_CE_monthly()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Deduction_CE_monthly();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Tax_Card#getDeduction_CE_yearly <em>Deduction CE yearly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deduction CE yearly</em>'.
	 * @see Taxation.Tax_Card#getDeduction_CE_yearly()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Deduction_CE_yearly();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Tax_Card#getDeduction_DS_daily <em>Deduction DS daily</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deduction DS daily</em>'.
	 * @see Taxation.Tax_Card#getDeduction_DS_daily()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Deduction_DS_daily();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Tax_Card#getDeduction_DS_monthly <em>Deduction DS monthly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deduction DS monthly</em>'.
	 * @see Taxation.Tax_Card#getDeduction_DS_monthly()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Deduction_DS_monthly();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Tax_Card#getDeduction_FO_daily <em>Deduction FO daily</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deduction FO daily</em>'.
	 * @see Taxation.Tax_Card#getDeduction_FO_daily()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Deduction_FO_daily();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Tax_Card#getDeduction_FO_monthly <em>Deduction FO monthly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deduction FO monthly</em>'.
	 * @see Taxation.Tax_Card#getDeduction_FO_monthly()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Deduction_FO_monthly();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Tax_Card#getDeduction_FO_yearly <em>Deduction FO yearly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deduction FO yearly</em>'.
	 * @see Taxation.Tax_Card#getDeduction_FO_yearly()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Deduction_FO_yearly();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Tax_Card#getCredit_CIS_daily <em>Credit CIS daily</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credit CIS daily</em>'.
	 * @see Taxation.Tax_Card#getCredit_CIS_daily()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Credit_CIS_daily();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Tax_Card#getCredit_CIS_monthly <em>Credit CIS monthly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credit CIS monthly</em>'.
	 * @see Taxation.Tax_Card#getCredit_CIS_monthly()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Credit_CIS_monthly();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Tax_Card#getCredit_CIM_daily <em>Credit CIM daily</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credit CIM daily</em>'.
	 * @see Taxation.Tax_Card#getCredit_CIM_daily()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Credit_CIM_daily();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Tax_Card#isValidity <em>Validity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Validity</em>'.
	 * @see Taxation.Tax_Card#isValidity()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Validity();

	/**
	 * Returns the meta object for the reference list '{@link Taxation.Tax_Card#getIncome_Tax_Credit <em>Income Tax Credit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Income Tax Credit</em>'.
	 * @see Taxation.Tax_Card#getIncome_Tax_Credit()
	 * @see #getTax_Card()
	 * @generated
	 */
	EReference getTax_Card_Income_Tax_Credit();

	/**
	 * Returns the meta object for the reference '{@link Taxation.Tax_Card#getPrevious <em>Previous</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous</em>'.
	 * @see Taxation.Tax_Card#getPrevious()
	 * @see #getTax_Card()
	 * @generated
	 */
	EReference getTax_Card_Previous();

	/**
	 * Returns the meta object for the reference '{@link Taxation.Tax_Card#getCurrent_tax_card <em>Current tax card</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Current tax card</em>'.
	 * @see Taxation.Tax_Card#getCurrent_tax_card()
	 * @see #getTax_Card()
	 * @generated
	 */
	EReference getTax_Card_Current_tax_card();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Tax_Card#getCredit_CIM_yearly <em>Credit CIM yearly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Credit CIM yearly</em>'.
	 * @see Taxation.Tax_Card#getCredit_CIM_yearly()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Credit_CIM_yearly();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Tax_Card#getDeduction_DS_Alimony_yearly <em>Deduction DS Alimony yearly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deduction DS Alimony yearly</em>'.
	 * @see Taxation.Tax_Card#getDeduction_DS_Alimony_yearly()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Deduction_DS_Alimony_yearly();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Tax_Card#getDeduction_DS_Debt_yearly <em>Deduction DS Debt yearly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deduction DS Debt yearly</em>'.
	 * @see Taxation.Tax_Card#getDeduction_DS_Debt_yearly()
	 * @see #getTax_Card()
	 * @generated
	 */
	EAttribute getTax_Card_Deduction_DS_Debt_yearly();

	/**
	 * Returns the meta object for the container reference '{@link Taxation.Tax_Card#getIncome <em>Income</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Income</em>'.
	 * @see Taxation.Tax_Card#getIncome()
	 * @see #getTax_Card()
	 * @generated
	 */
	EReference getTax_Card_Income();

	/**
	 * Returns the meta object for class '{@link Taxation.Income_Tax_Credit <em>Income Tax Credit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Income Tax Credit</em>'.
	 * @see Taxation.Income_Tax_Credit
	 * @generated
	 */
	EClass getIncome_Tax_Credit();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Income_Tax_Credit#getGrantedBy <em>Granted By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Granted By</em>'.
	 * @see Taxation.Income_Tax_Credit#getGrantedBy()
	 * @see #getIncome_Tax_Credit()
	 * @generated
	 */
	EAttribute getIncome_Tax_Credit_GrantedBy();

	/**
	 * Returns the meta object for the reference '{@link Taxation.Income_Tax_Credit#getTaxPayer <em>Tax Payer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tax Payer</em>'.
	 * @see Taxation.Income_Tax_Credit#getTaxPayer()
	 * @see #getIncome_Tax_Credit()
	 * @generated
	 */
	EReference getIncome_Tax_Credit_TaxPayer();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Income_Tax_Credit#getTax_year <em>Tax year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax year</em>'.
	 * @see Taxation.Income_Tax_Credit#getTax_year()
	 * @see #getIncome_Tax_Credit()
	 * @generated
	 */
	EAttribute getIncome_Tax_Credit_Tax_year();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Income_Tax_Credit#getYearly <em>Yearly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Yearly</em>'.
	 * @see Taxation.Income_Tax_Credit#getYearly()
	 * @see #getIncome_Tax_Credit()
	 * @generated
	 */
	EAttribute getIncome_Tax_Credit_Yearly();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Income_Tax_Credit#getMonthly <em>Monthly</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Monthly</em>'.
	 * @see Taxation.Income_Tax_Credit#getMonthly()
	 * @see #getIncome_Tax_Credit()
	 * @generated
	 */
	EAttribute getIncome_Tax_Credit_Monthly();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Income_Tax_Credit#getDaily <em>Daily</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Daily</em>'.
	 * @see Taxation.Income_Tax_Credit#getDaily()
	 * @see #getIncome_Tax_Credit()
	 * @generated
	 */
	EAttribute getIncome_Tax_Credit_Daily();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Income_Tax_Credit#getId7 <em>Id7</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id7</em>'.
	 * @see Taxation.Income_Tax_Credit#getId7()
	 * @see #getIncome_Tax_Credit()
	 * @generated
	 */
	EAttribute getIncome_Tax_Credit_Id7();

	/**
	 * Returns the meta object for the reference '{@link Taxation.Income_Tax_Credit#getTaxation_Frame <em>Taxation Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Taxation Frame</em>'.
	 * @see Taxation.Income_Tax_Credit#getTaxation_Frame()
	 * @see #getIncome_Tax_Credit()
	 * @generated
	 */
	EReference getIncome_Tax_Credit_Taxation_Frame();

	/**
	 * Returns the meta object for class '{@link Taxation.Income_Detail <em>Income Detail</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Income Detail</em>'.
	 * @see Taxation.Income_Detail
	 * @generated
	 */
	EClass getIncome_Detail();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Income_Detail#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see Taxation.Income_Detail#getAmount()
	 * @see #getIncome_Detail()
	 * @generated
	 */
	EAttribute getIncome_Detail_Amount();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Income_Detail#isIs_worked <em>Is worked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is worked</em>'.
	 * @see Taxation.Income_Detail#isIs_worked()
	 * @see #getIncome_Detail()
	 * @generated
	 */
	EAttribute getIncome_Detail_Is_worked();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Income_Detail#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see Taxation.Income_Detail#getDistance()
	 * @see #getIncome_Detail()
	 * @generated
	 */
	EAttribute getIncome_Detail_Distance();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Income_Detail#getWorked_days <em>Worked days</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Worked days</em>'.
	 * @see Taxation.Income_Detail#getWorked_days()
	 * @see #getIncome_Detail()
	 * @generated
	 */
	EAttribute getIncome_Detail_Worked_days();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Income_Detail#isIs_contributing_CNS <em>Is contributing CNS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is contributing CNS</em>'.
	 * @see Taxation.Income_Detail#isIs_contributing_CNS()
	 * @see #getIncome_Detail()
	 * @generated
	 */
	EAttribute getIncome_Detail_Is_contributing_CNS();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Income_Detail#getId5 <em>Id5</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id5</em>'.
	 * @see Taxation.Income_Detail#getId5()
	 * @see #getIncome_Detail()
	 * @generated
	 */
	EAttribute getIncome_Detail_Id5();

	/**
	 * Returns the meta object for the container reference '{@link Taxation.Income_Detail#getIncome <em>Income</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Income</em>'.
	 * @see Taxation.Income_Detail#getIncome()
	 * @see #getIncome_Detail()
	 * @generated
	 */
	EReference getIncome_Detail_Income();

	/**
	 * Returns the meta object for class '{@link Taxation.FromLaw <em>From Law</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>From Law</em>'.
	 * @see Taxation.FromLaw
	 * @generated
	 */
	EClass getFromLaw();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.FromLaw#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see Taxation.FromLaw#getId()
	 * @see #getFromLaw()
	 * @generated
	 */
	EAttribute getFromLaw_Id();

	/**
	 * Returns the meta object for the container reference '{@link Taxation.FromLaw#getTaxPayer <em>Tax Payer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Tax Payer</em>'.
	 * @see Taxation.FromLaw#getTaxPayer()
	 * @see #getFromLaw()
	 * @generated
	 */
	EReference getFromLaw_TaxPayer();

	/**
	 * Returns the meta object for class '{@link Taxation.Fiscal_Address <em>Fiscal Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fiscal Address</em>'.
	 * @see Taxation.Fiscal_Address
	 * @generated
	 */
	EClass getFiscal_Address();

	/**
	 * Returns the meta object for class '{@link Taxation.Habitual_Address <em>Habitual Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Habitual Address</em>'.
	 * @see Taxation.Habitual_Address
	 * @generated
	 */
	EClass getHabitual_Address();

	/**
	 * Returns the meta object for class '{@link Taxation.Marriage_Record <em>Marriage Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Marriage Record</em>'.
	 * @see Taxation.Marriage_Record
	 * @generated
	 */
	EClass getMarriage_Record();

	/**
	 * Returns the meta object for class '{@link Taxation.Non_Resident_Tax_Payer <em>Non Resident Tax Payer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Non Resident Tax Payer</em>'.
	 * @see Taxation.Non_Resident_Tax_Payer
	 * @generated
	 */
	EClass getNon_Resident_Tax_Payer();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Non_Resident_Tax_Payer#isIs_assimilated_to_resident <em>Is assimilated to resident</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is assimilated to resident</em>'.
	 * @see Taxation.Non_Resident_Tax_Payer#isIs_assimilated_to_resident()
	 * @see #getNon_Resident_Tax_Payer()
	 * @generated
	 */
	EAttribute getNon_Resident_Tax_Payer_Is_assimilated_to_resident();

	/**
	 * Returns the meta object for class '{@link Taxation.Partnership_Record <em>Partnership Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partnership Record</em>'.
	 * @see Taxation.Partnership_Record
	 * @generated
	 */
	EClass getPartnership_Record();

	/**
	 * Returns the meta object for class '{@link Taxation.Resident_Tax_Payer <em>Resident Tax Payer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resident Tax Payer</em>'.
	 * @see Taxation.Resident_Tax_Payer
	 * @generated
	 */
	EClass getResident_Tax_Payer();

	/**
	 * Returns the meta object for class '{@link Taxation.Trade_and_Business_Income <em>Trade and Business Income</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trade and Business Income</em>'.
	 * @see Taxation.Trade_and_Business_Income
	 * @generated
	 */
	EClass getTrade_and_Business_Income();

	/**
	 * Returns the meta object for class '{@link Taxation.Agriculture_and_Forestry_Income <em>Agriculture and Forestry Income</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agriculture and Forestry Income</em>'.
	 * @see Taxation.Agriculture_and_Forestry_Income
	 * @generated
	 */
	EClass getAgriculture_and_Forestry_Income();

	/**
	 * Returns the meta object for class '{@link Taxation.Pensions_and_Annuities_Income <em>Pensions and Annuities Income</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pensions and Annuities Income</em>'.
	 * @see Taxation.Pensions_and_Annuities_Income
	 * @generated
	 */
	EClass getPensions_and_Annuities_Income();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Pensions_and_Annuities_Income#isOccasional_payement <em>Occasional payement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Occasional payement</em>'.
	 * @see Taxation.Pensions_and_Annuities_Income#isOccasional_payement()
	 * @see #getPensions_and_Annuities_Income()
	 * @generated
	 */
	EAttribute getPensions_and_Annuities_Income_Occasional_payement();

	/**
	 * Returns the meta object for class '{@link Taxation.Capital_and_Investments_Income <em>Capital and Investments Income</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capital and Investments Income</em>'.
	 * @see Taxation.Capital_and_Investments_Income
	 * @generated
	 */
	EClass getCapital_and_Investments_Income();

	/**
	 * Returns the meta object for class '{@link Taxation.Employment_Income <em>Employment Income</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Employment Income</em>'.
	 * @see Taxation.Employment_Income
	 * @generated
	 */
	EClass getEmployment_Income();

	/**
	 * Returns the meta object for class '{@link Taxation.Rentals_and_Leases_Income <em>Rentals and Leases Income</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rentals and Leases Income</em>'.
	 * @see Taxation.Rentals_and_Leases_Income
	 * @generated
	 */
	EClass getRentals_and_Leases_Income();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Rentals_and_Leases_Income#isIs_periodic <em>Is periodic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is periodic</em>'.
	 * @see Taxation.Rentals_and_Leases_Income#isIs_periodic()
	 * @see #getRentals_and_Leases_Income()
	 * @generated
	 */
	EAttribute getRentals_and_Leases_Income_Is_periodic();

	/**
	 * Returns the meta object for class '{@link Taxation.Foreign_Income <em>Foreign Income</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Foreign Income</em>'.
	 * @see Taxation.Foreign_Income
	 * @generated
	 */
	EClass getForeign_Income();

	/**
	 * Returns the meta object for class '{@link Taxation.Local_Income <em>Local Income</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Income</em>'.
	 * @see Taxation.Local_Income
	 * @generated
	 */
	EClass getLocal_Income();

	/**
	 * Returns the meta object for class '{@link Taxation.CIM <em>CIM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CIM</em>'.
	 * @see Taxation.CIM
	 * @generated
	 */
	EClass getCIM();

	/**
	 * Returns the meta object for class '{@link Taxation.CIP <em>CIP</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CIP</em>'.
	 * @see Taxation.CIP
	 * @generated
	 */
	EClass getCIP();

	/**
	 * Returns the meta object for class '{@link Taxation.CIS <em>CIS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>CIS</em>'.
	 * @see Taxation.CIS
	 * @generated
	 */
	EClass getCIS();

	/**
	 * Returns the meta object for class '{@link Taxation.FD <em>FD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FD</em>'.
	 * @see Taxation.FD
	 * @generated
	 */
	EClass getFD();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.FD#getDistance_declared_in_january <em>Distance declared in january</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance declared in january</em>'.
	 * @see Taxation.FD#getDistance_declared_in_january()
	 * @see #getFD()
	 * @generated
	 */
	EAttribute getFD_Distance_declared_in_january();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.FD#getCalculated_distance <em>Calculated distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Calculated distance</em>'.
	 * @see Taxation.FD#getCalculated_distance()
	 * @see #getFD()
	 * @generated
	 */
	EAttribute getFD_Calculated_distance();

	/**
	 * Returns the meta object for class '{@link Taxation.Professional_Expenses_Deduction <em>Professional Expenses Deduction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Professional Expenses Deduction</em>'.
	 * @see Taxation.Professional_Expenses_Deduction
	 * @generated
	 */
	EClass getProfessional_Expenses_Deduction();

	/**
	 * Returns the meta object for class '{@link Taxation.FO <em>FO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FO</em>'.
	 * @see Taxation.FO
	 * @generated
	 */
	EClass getFO();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.FO#getRate_type_for_FO <em>Rate type for FO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate type for FO</em>'.
	 * @see Taxation.FO#getRate_type_for_FO()
	 * @see #getFO()
	 * @generated
	 */
	EAttribute getFO_Rate_type_for_FO();

	/**
	 * Returns the meta object for class '{@link Taxation.DS_for_Permanent_Expense <em>DS for Permanent Expense</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DS for Permanent Expense</em>'.
	 * @see Taxation.DS_for_Permanent_Expense
	 * @generated
	 */
	EClass getDS_for_Permanent_Expense();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.DS_for_Permanent_Expense#getPermanent_expense_category <em>Permanent expense category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Permanent expense category</em>'.
	 * @see Taxation.DS_for_Permanent_Expense#getPermanent_expense_category()
	 * @see #getDS_for_Permanent_Expense()
	 * @generated
	 */
	EAttribute getDS_for_Permanent_Expense_Permanent_expense_category();

	/**
	 * Returns the meta object for class '{@link Taxation.DS <em>DS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DS</em>'.
	 * @see Taxation.DS
	 * @generated
	 */
	EClass getDS();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.DS#getMaximum_deductible_amount <em>Maximum deductible amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum deductible amount</em>'.
	 * @see Taxation.DS#getMaximum_deductible_amount()
	 * @see #getDS()
	 * @generated
	 */
	EAttribute getDS_Maximum_deductible_amount();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.DS#getId3 <em>Id3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id3</em>'.
	 * @see Taxation.DS#getId3()
	 * @see #getDS()
	 * @generated
	 */
	EAttribute getDS_Id3();

	/**
	 * Returns the meta object for class '{@link Taxation.DS_for_Interest_Expense <em>DS for Interest Expense</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DS for Interest Expense</em>'.
	 * @see Taxation.DS_for_Interest_Expense
	 * @generated
	 */
	EClass getDS_for_Interest_Expense();

	/**
	 * Returns the meta object for class '{@link Taxation.DS_for_Health_and_Pension_Insurance <em>DS for Health and Pension Insurance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DS for Health and Pension Insurance</em>'.
	 * @see Taxation.DS_for_Health_and_Pension_Insurance
	 * @generated
	 */
	EClass getDS_for_Health_and_Pension_Insurance();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.DS_for_Health_and_Pension_Insurance#getInsurance_category <em>Insurance category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insurance category</em>'.
	 * @see Taxation.DS_for_Health_and_Pension_Insurance#getInsurance_category()
	 * @see #getDS_for_Health_and_Pension_Insurance()
	 * @generated
	 */
	EAttribute getDS_for_Health_and_Pension_Insurance_Insurance_category();

	/**
	 * Returns the meta object for class '{@link Taxation.DS_for_Private_Insurance_and_Plan <em>DS for Private Insurance and Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DS for Private Insurance and Plan</em>'.
	 * @see Taxation.DS_for_Private_Insurance_and_Plan
	 * @generated
	 */
	EClass getDS_for_Private_Insurance_and_Plan();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.DS_for_Private_Insurance_and_Plan#getPrivate_insurance_and_plan_category <em>Private insurance and plan category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Private insurance and plan category</em>'.
	 * @see Taxation.DS_for_Private_Insurance_and_Plan#getPrivate_insurance_and_plan_category()
	 * @see #getDS_for_Private_Insurance_and_Plan()
	 * @generated
	 */
	EAttribute getDS_for_Private_Insurance_and_Plan_Private_insurance_and_plan_category();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.DS_for_Private_Insurance_and_Plan#getIncrease_for_life_insurance <em>Increase for life insurance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Increase for life insurance</em>'.
	 * @see Taxation.DS_for_Private_Insurance_and_Plan#getIncrease_for_life_insurance()
	 * @see #getDS_for_Private_Insurance_and_Plan()
	 * @generated
	 */
	EAttribute getDS_for_Private_Insurance_and_Plan_Increase_for_life_insurance();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.DS_for_Private_Insurance_and_Plan#getMaximum_deductible_amount_for_private_insurance <em>Maximum deductible amount for private insurance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum deductible amount for private insurance</em>'.
	 * @see Taxation.DS_for_Private_Insurance_and_Plan#getMaximum_deductible_amount_for_private_insurance()
	 * @see #getDS_for_Private_Insurance_and_Plan()
	 * @generated
	 */
	EAttribute getDS_for_Private_Insurance_and_Plan_Maximum_deductible_amount_for_private_insurance();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.DS_for_Private_Insurance_and_Plan#getMaximum_deductible_amount_for_old_age_pension_plan <em>Maximum deductible amount for old age pension plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum deductible amount for old age pension plan</em>'.
	 * @see Taxation.DS_for_Private_Insurance_and_Plan#getMaximum_deductible_amount_for_old_age_pension_plan()
	 * @see #getDS_for_Private_Insurance_and_Plan()
	 * @generated
	 */
	EAttribute getDS_for_Private_Insurance_and_Plan_Maximum_deductible_amount_for_old_age_pension_plan();

	/**
	 * Returns the meta object for class '{@link Taxation.DS_for_Loss_Carryforward <em>DS for Loss Carryforward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DS for Loss Carryforward</em>'.
	 * @see Taxation.DS_for_Loss_Carryforward
	 * @generated
	 */
	EClass getDS_for_Loss_Carryforward();

	/**
	 * Returns the meta object for class '{@link Taxation.DS_for_Donation <em>DS for Donation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DS for Donation</em>'.
	 * @see Taxation.DS_for_Donation
	 * @generated
	 */
	EClass getDS_for_Donation();

	/**
	 * Returns the meta object for class '{@link Taxation.Permanent_Expense <em>Permanent Expense</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Permanent Expense</em>'.
	 * @see Taxation.Permanent_Expense
	 * @generated
	 */
	EClass getPermanent_Expense();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Permanent_Expense#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see Taxation.Permanent_Expense#getCategory()
	 * @see #getPermanent_Expense()
	 * @generated
	 */
	EAttribute getPermanent_Expense_Category();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Permanent_Expense#isIs_eligible_for_deduction <em>Is eligible for deduction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is eligible for deduction</em>'.
	 * @see Taxation.Permanent_Expense#isIs_eligible_for_deduction()
	 * @see #getPermanent_Expense()
	 * @generated
	 */
	EAttribute getPermanent_Expense_Is_eligible_for_deduction();

	/**
	 * Returns the meta object for class '{@link Taxation.Special_Expense_DS <em>Special Expense DS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Special Expense DS</em>'.
	 * @see Taxation.Special_Expense_DS
	 * @generated
	 */
	EClass getSpecial_Expense_DS();

	/**
	 * Returns the meta object for class '{@link Taxation.Interest_Expense <em>Interest Expense</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interest Expense</em>'.
	 * @see Taxation.Interest_Expense
	 * @generated
	 */
	EClass getInterest_Expense();

	/**
	 * Returns the meta object for class '{@link Taxation.Private_Insurance_and_Plan <em>Private Insurance and Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Private Insurance and Plan</em>'.
	 * @see Taxation.Private_Insurance_and_Plan
	 * @generated
	 */
	EClass getPrivate_Insurance_and_Plan();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Private_Insurance_and_Plan#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see Taxation.Private_Insurance_and_Plan#getCategory()
	 * @see #getPrivate_Insurance_and_Plan()
	 * @generated
	 */
	EAttribute getPrivate_Insurance_and_Plan_Category();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Private_Insurance_and_Plan#getDuration_of_contract <em>Duration of contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration of contract</em>'.
	 * @see Taxation.Private_Insurance_and_Plan#getDuration_of_contract()
	 * @see #getPrivate_Insurance_and_Plan()
	 * @generated
	 */
	EAttribute getPrivate_Insurance_and_Plan_Duration_of_contract();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Private_Insurance_and_Plan#isIs_private_insurance_and_plan_eligible_for_deduction <em>Is private insurance and plan eligible for deduction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is private insurance and plan eligible for deduction</em>'.
	 * @see Taxation.Private_Insurance_and_Plan#isIs_private_insurance_and_plan_eligible_for_deduction()
	 * @see #getPrivate_Insurance_and_Plan()
	 * @generated
	 */
	EAttribute getPrivate_Insurance_and_Plan_Is_private_insurance_and_plan_eligible_for_deduction();

	/**
	 * Returns the meta object for class '{@link Taxation.Health_and_Pension_Insurance <em>Health and Pension Insurance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Health and Pension Insurance</em>'.
	 * @see Taxation.Health_and_Pension_Insurance
	 * @generated
	 */
	EClass getHealth_and_Pension_Insurance();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Health_and_Pension_Insurance#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Category</em>'.
	 * @see Taxation.Health_and_Pension_Insurance#getCategory()
	 * @see #getHealth_and_Pension_Insurance()
	 * @generated
	 */
	EAttribute getHealth_and_Pension_Insurance_Category();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Health_and_Pension_Insurance#isIs_related_to_additional_salary <em>Is related to additional salary</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is related to additional salary</em>'.
	 * @see Taxation.Health_and_Pension_Insurance#isIs_related_to_additional_salary()
	 * @see #getHealth_and_Pension_Insurance()
	 * @generated
	 */
	EAttribute getHealth_and_Pension_Insurance_Is_related_to_additional_salary();

	/**
	 * Returns the meta object for class '{@link Taxation.Donation <em>Donation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Donation</em>'.
	 * @see Taxation.Donation
	 * @generated
	 */
	EClass getDonation();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Donation#getBeneficiary1 <em>Beneficiary1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Beneficiary1</em>'.
	 * @see Taxation.Donation#getBeneficiary1()
	 * @see #getDonation()
	 * @generated
	 */
	EAttribute getDonation_Beneficiary1();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Donation#isIs_beneficiary_eligible <em>Is beneficiary eligible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is beneficiary eligible</em>'.
	 * @see Taxation.Donation#isIs_beneficiary_eligible()
	 * @see #getDonation()
	 * @generated
	 */
	EAttribute getDonation_Is_beneficiary_eligible();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Donation#isIs_donation_reported <em>Is donation reported</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is donation reported</em>'.
	 * @see Taxation.Donation#isIs_donation_reported()
	 * @see #getDonation()
	 * @generated
	 */
	EAttribute getDonation_Is_donation_reported();

	/**
	 * Returns the meta object for class '{@link Taxation.Loss_Carryforward <em>Loss Carryforward</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loss Carryforward</em>'.
	 * @see Taxation.Loss_Carryforward
	 * @generated
	 */
	EClass getLoss_Carryforward();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Loss_Carryforward#isRegular_accountability <em>Regular accountability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regular accountability</em>'.
	 * @see Taxation.Loss_Carryforward#isRegular_accountability()
	 * @see #getLoss_Carryforward()
	 * @generated
	 */
	EAttribute getLoss_Carryforward_Regular_accountability();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Loss_Carryforward#isCompensation_by_other_means <em>Compensation by other means</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Compensation by other means</em>'.
	 * @see Taxation.Loss_Carryforward#isCompensation_by_other_means()
	 * @see #getLoss_Carryforward()
	 * @generated
	 */
	EAttribute getLoss_Carryforward_Compensation_by_other_means();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Loss_Carryforward#isTax_payer_has_inherited_business_ownership <em>Tax payer has inherited business ownership</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax payer has inherited business ownership</em>'.
	 * @see Taxation.Loss_Carryforward#isTax_payer_has_inherited_business_ownership()
	 * @see #getLoss_Carryforward()
	 * @generated
	 */
	EAttribute getLoss_Carryforward_Tax_payer_has_inherited_business_ownership();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Loss_Carryforward#isTax_payer_has_been_partner_in_business <em>Tax payer has been partner in business</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tax payer has been partner in business</em>'.
	 * @see Taxation.Loss_Carryforward#isTax_payer_has_been_partner_in_business()
	 * @see #getLoss_Carryforward()
	 * @generated
	 */
	EAttribute getLoss_Carryforward_Tax_payer_has_been_partner_in_business();

	/**
	 * Returns the meta object for class '{@link Taxation.Spousal_Expense_AC <em>Spousal Expense AC</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spousal Expense AC</em>'.
	 * @see Taxation.Spousal_Expense_AC
	 * @generated
	 */
	EClass getSpousal_Expense_AC();

	/**
	 * Returns the meta object for class '{@link Taxation.Extraordinary_Expense_CE <em>Extraordinary Expense CE</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extraordinary Expense CE</em>'.
	 * @see Taxation.Extraordinary_Expense_CE
	 * @generated
	 */
	EClass getExtraordinary_Expense_CE();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Extraordinary_Expense_CE#getThresholded_deduction_percentage <em>Thresholded deduction percentage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Thresholded deduction percentage</em>'.
	 * @see Taxation.Extraordinary_Expense_CE#getThresholded_deduction_percentage()
	 * @see #getExtraordinary_Expense_CE()
	 * @generated
	 */
	EAttribute getExtraordinary_Expense_CE_Thresholded_deduction_percentage();

	/**
	 * Returns the meta object for the attribute '{@link Taxation.Extraordinary_Expense_CE#getCe_type <em>Ce type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ce type</em>'.
	 * @see Taxation.Extraordinary_Expense_CE#getCe_type()
	 * @see #getExtraordinary_Expense_CE()
	 * @generated
	 */
	EAttribute getExtraordinary_Expense_CE_Ce_type();

	/**
	 * Returns the meta object for class '{@link Taxation.Travel_Expense_FD <em>Travel Expense FD</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Travel Expense FD</em>'.
	 * @see Taxation.Travel_Expense_FD
	 * @generated
	 */
	EClass getTravel_Expense_FD();

	/**
	 * Returns the meta object for class '{@link Taxation.Professional_Expense <em>Professional Expense</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Professional Expense</em>'.
	 * @see Taxation.Professional_Expense
	 * @generated
	 */
	EClass getProfessional_Expense();

	/**
	 * Returns the meta object for class '{@link Taxation.Miscellaneous_Expense_FO <em>Miscellaneous Expense FO</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Miscellaneous Expense FO</em>'.
	 * @see Taxation.Miscellaneous_Expense_FO
	 * @generated
	 */
	EClass getMiscellaneous_Expense_FO();

	/**
	 * Returns the meta object for enum '{@link Taxation.Grantor <em>Grantor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Grantor</em>'.
	 * @see Taxation.Grantor
	 * @generated
	 */
	EEnum getGrantor();

	/**
	 * Returns the meta object for enum '{@link Taxation.Disability_Types <em>Disability Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Disability Types</em>'.
	 * @see Taxation.Disability_Types
	 * @generated
	 */
	EEnum getDisability_Types();

	/**
	 * Returns the meta object for enum '{@link Taxation.Country <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Country</em>'.
	 * @see Taxation.Country
	 * @generated
	 */
	EEnum getCountry();

	/**
	 * Returns the meta object for enum '{@link Taxation.Tax_Card_Type <em>Tax Card Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tax Card Type</em>'.
	 * @see Taxation.Tax_Card_Type
	 * @generated
	 */
	EEnum getTax_Card_Type();

	/**
	 * Returns the meta object for enum '{@link Taxation.Tax_Office <em>Tax Office</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tax Office</em>'.
	 * @see Taxation.Tax_Office
	 * @generated
	 */
	EEnum getTax_Office();

	/**
	 * Returns the meta object for enum '{@link Taxation.Tax_Class_Category <em>Tax Class Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Tax Class Category</em>'.
	 * @see Taxation.Tax_Class_Category
	 * @generated
	 */
	EEnum getTax_Class_Category();

	/**
	 * Returns the meta object for enum '{@link Taxation.Job_Activity <em>Job Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Job Activity</em>'.
	 * @see Taxation.Job_Activity
	 * @generated
	 */
	EEnum getJob_Activity();

	/**
	 * Returns the meta object for enum '{@link Taxation.Town <em>Town</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Town</em>'.
	 * @see Taxation.Town
	 * @generated
	 */
	EEnum getTown();

	/**
	 * Returns the meta object for enum '{@link Taxation.Type_of_Rate <em>Type of Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type of Rate</em>'.
	 * @see Taxation.Type_of_Rate
	 * @generated
	 */
	EEnum getType_of_Rate();

	/**
	 * Returns the meta object for enum '{@link Taxation.CE_Type <em>CE Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>CE Type</em>'.
	 * @see Taxation.CE_Type
	 * @generated
	 */
	EEnum getCE_Type();

	/**
	 * Returns the meta object for enum '{@link Taxation.Expense_Purpose <em>Expense Purpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Expense Purpose</em>'.
	 * @see Taxation.Expense_Purpose
	 * @generated
	 */
	EEnum getExpense_Purpose();

	/**
	 * Returns the meta object for enum '{@link Taxation.Dependent_Type <em>Dependent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dependent Type</em>'.
	 * @see Taxation.Dependent_Type
	 * @generated
	 */
	EEnum getDependent_Type();

	/**
	 * Returns the meta object for enum '{@link Taxation.Separation_Causes <em>Separation Causes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Separation Causes</em>'.
	 * @see Taxation.Separation_Causes
	 * @generated
	 */
	EEnum getSeparation_Causes();

	/**
	 * Returns the meta object for enum '{@link Taxation.Category_of_Permanent_Expense <em>Category of Permanent Expense</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Category of Permanent Expense</em>'.
	 * @see Taxation.Category_of_Permanent_Expense
	 * @generated
	 */
	EEnum getCategory_of_Permanent_Expense();

	/**
	 * Returns the meta object for enum '{@link Taxation.Category_of_Health_and_Pension_Insurances <em>Category of Health and Pension Insurances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Category of Health and Pension Insurances</em>'.
	 * @see Taxation.Category_of_Health_and_Pension_Insurances
	 * @generated
	 */
	EEnum getCategory_of_Health_and_Pension_Insurances();

	/**
	 * Returns the meta object for enum '{@link Taxation.Category_of_Private_Insurance_and_Plan <em>Category of Private Insurance and Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Category of Private Insurance and Plan</em>'.
	 * @see Taxation.Category_of_Private_Insurance_and_Plan
	 * @generated
	 */
	EEnum getCategory_of_Private_Insurance_and_Plan();

	/**
	 * Returns the meta object for enum '{@link Taxation.Legal_Union_Types <em>Legal Union Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Legal Union Types</em>'.
	 * @see Taxation.Legal_Union_Types
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
		 * The meta object literal for the '{@link Taxation.impl.ConstantsImpl <em>Constants</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.impl.ConstantsImpl
		 * @see Taxation.impl.TaxationPackageImpl#getConstants()
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
		 * The meta object literal for the '{@link Taxation.impl.Income_TaxImpl <em>Income Tax</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.impl.Income_TaxImpl
		 * @see Taxation.impl.TaxationPackageImpl#getIncome_Tax()
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
		 * The meta object literal for the '{@link Taxation.impl.Tax_PayerImpl <em>Tax Payer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.impl.Tax_PayerImpl
		 * @see Taxation.impl.TaxationPackageImpl#getTax_Payer()
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
		 * The meta object literal for the '<em><b>Taxes Due</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_PAYER__TAXES_DUE = eINSTANCE.getTax_Payer_TaxesDue();

		/**
		 * The meta object literal for the '{@link Taxation.impl.Physical_PersonImpl <em>Physical Person</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.impl.Physical_PersonImpl
		 * @see Taxation.impl.TaxationPackageImpl#getPhysical_Person()
		 * @generated
		 */
		EClass PHYSICAL_PERSON = eINSTANCE.getPhysical_Person();

		/**
		 * The meta object literal for the '<em><b>Is assisting spouse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_PERSON__IS_ASSISTING_SPOUSE = eINSTANCE.getPhysical_Person_Is_assisting_spouse();

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
		 * The meta object literal for the '<em><b>Is affiliated personnaly to social security</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHYSICAL_PERSON__IS_AFFILIATED_PERSONNALY_TO_SOCIAL_SECURITY = eINSTANCE.getPhysical_Person_Is_affiliated_personnaly_to_social_security();

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
		 * The meta object literal for the '<em><b>Owns Address</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHYSICAL_PERSON__OWNS_ADDRESS = eINSTANCE.getPhysical_Person_Owns_Address();

		/**
		 * The meta object literal for the '{@link Taxation.impl.AddressImpl <em>Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.impl.AddressImpl
		 * @see Taxation.impl.TaxationPackageImpl#getAddress()
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
		 * The meta object literal for the '{@link Taxation.impl.ExpenseImpl <em>Expense</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.impl.ExpenseImpl
		 * @see Taxation.impl.TaxationPackageImpl#getExpense()
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
		 * The meta object literal for the '{@link Taxation.impl.DependentImpl <em>Dependent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.impl.DependentImpl
		 * @see Taxation.impl.TaxationPackageImpl#getDependent()
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
		 * The meta object literal for the '{@link Taxation.impl.External_AllowanceImpl <em>External Allowance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.impl.External_AllowanceImpl
		 * @see Taxation.impl.TaxationPackageImpl#getExternal_Allowance()
		 * @generated
		 */
		EClass EXTERNAL_ALLOWANCE = eINSTANCE.getExternal_Allowance();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTERNAL_ALLOWANCE__AMOUNT = eINSTANCE.getExternal_Allowance_Amount();

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
		 * The meta object literal for the '{@link Taxation.impl.HouseholdImpl <em>Household</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.impl.HouseholdImpl
		 * @see Taxation.impl.TaxationPackageImpl#getHousehold()
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
		 * The meta object literal for the '{@link Taxation.impl.Legal_Union_RecordImpl <em>Legal Union Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.impl.Legal_Union_RecordImpl
		 * @see Taxation.impl.TaxationPackageImpl#getLegal_Union_Record()
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
		 * The meta object literal for the '{@link Taxation.impl.Tax_PropertyImpl <em>Tax Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.impl.Tax_PropertyImpl
		 * @see Taxation.impl.TaxationPackageImpl#getTax_Property()
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
		 * The meta object literal for the '{@link Taxation.Tax_Case <em>Tax Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.Tax_Case
		 * @see Taxation.impl.TaxationPackageImpl#getTax_Case()
		 * @generated
		 */
		EClass TAX_CASE = eINSTANCE.getTax_Case();

		/**
		 * The meta object literal for the '{@link Taxation.impl.FromAgentImpl <em>From Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.impl.FromAgentImpl
		 * @see Taxation.impl.TaxationPackageImpl#getFromAgent()
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
		 * The meta object literal for the '{@link Taxation.impl.IncomeImpl <em>Income</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.impl.IncomeImpl
		 * @see Taxation.impl.TaxationPackageImpl#getIncome()
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
		 * The meta object literal for the '<em><b>Start date within taxation year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCOME__START_DATE_WITHIN_TAXATION_YEAR = eINSTANCE.getIncome_Start_date_within_taxation_year();

		/**
		 * The meta object literal for the '<em><b>Start date of contract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCOME__START_DATE_OF_CONTRACT = eINSTANCE.getIncome_Start_date_of_contract();

		/**
		 * The meta object literal for the '<em><b>End date within taxation year</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCOME__END_DATE_WITHIN_TAXATION_YEAR = eINSTANCE.getIncome_End_date_within_taxation_year();

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
		 * The meta object literal for the '{@link Taxation.impl.Income_TypeImpl <em>Income Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.impl.Income_TypeImpl
		 * @see Taxation.impl.TaxationPackageImpl#getIncome_Type()
		 * @generated
		 */
		EClass INCOME_TYPE = eINSTANCE.getIncome_Type();

		/**
		 * The meta object literal for the '<em><b>Subject To Withholding Tax</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCOME_TYPE__SUBJECT_TO_WITHHOLDING_TAX = eINSTANCE.getIncome_Type_SubjectToWithholdingTax();

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
		 * The meta object literal for the '{@link Taxation.impl.Tax_CardImpl <em>Tax Card</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.impl.Tax_CardImpl
		 * @see Taxation.impl.TaxationPackageImpl#getTax_Card()
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
		 * The meta object literal for the '<em><b>Tax card type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_CARD__TAX_CARD_TYPE = eINSTANCE.getTax_Card_Tax_card_type();

		/**
		 * The meta object literal for the '<em><b>Tax office</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_CARD__TAX_OFFICE = eINSTANCE.getTax_Card_Tax_office();

		/**
		 * The meta object literal for the '<em><b>Valid from date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_CARD__VALID_FROM_DATE = eINSTANCE.getTax_Card_Valid_from_date();

		/**
		 * The meta object literal for the '<em><b>Valid until date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TAX_CARD__VALID_UNTIL_DATE = eINSTANCE.getTax_Card_Valid_until_date();

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
		 * The meta object literal for the '{@link Taxation.impl.Income_Tax_CreditImpl <em>Income Tax Credit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.impl.Income_Tax_CreditImpl
		 * @see Taxation.impl.TaxationPackageImpl#getIncome_Tax_Credit()
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
		 * The meta object literal for the '{@link Taxation.impl.Income_DetailImpl <em>Income Detail</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.impl.Income_DetailImpl
		 * @see Taxation.impl.TaxationPackageImpl#getIncome_Detail()
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
		 * The meta object literal for the '{@link Taxation.impl.FromLawImpl <em>From Law</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.impl.FromLawImpl
		 * @see Taxation.impl.TaxationPackageImpl#getFromLaw()
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
		 * The meta object literal for the '{@link Taxation.impl.Fiscal_AddressImpl <em>Fiscal Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.impl.Fiscal_AddressImpl
		 * @see Taxation.impl.TaxationPackageImpl#getFiscal_Address()
		 * @generated
		 */
		EClass FISCAL_ADDRESS = eINSTANCE.getFiscal_Address();

		/**
		 * The meta object literal for the '{@link Taxation.impl.Habitual_AddressImpl <em>Habitual Address</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.impl.Habitual_AddressImpl
		 * @see Taxation.impl.TaxationPackageImpl#getHabitual_Address()
		 * @generated
		 */
		EClass HABITUAL_ADDRESS = eINSTANCE.getHabitual_Address();

		/**
		 * The meta object literal for the '{@link Taxation.impl.Marriage_RecordImpl <em>Marriage Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.impl.Marriage_RecordImpl
		 * @see Taxation.impl.TaxationPackageImpl#getMarriage_Record()
		 * @generated
		 */
		EClass MARRIAGE_RECORD = eINSTANCE.getMarriage_Record();

		/**
		 * The meta object literal for the '{@link Taxation.impl.Non_Resident_Tax_PayerImpl <em>Non Resident Tax Payer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.impl.Non_Resident_Tax_PayerImpl
		 * @see Taxation.impl.TaxationPackageImpl#getNon_Resident_Tax_Payer()
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
		 * The meta object literal for the '{@link Taxation.impl.Partnership_RecordImpl <em>Partnership Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.impl.Partnership_RecordImpl
		 * @see Taxation.impl.TaxationPackageImpl#getPartnership_Record()
		 * @generated
		 */
		EClass PARTNERSHIP_RECORD = eINSTANCE.getPartnership_Record();

		/**
		 * The meta object literal for the '{@link Taxation.impl.Resident_Tax_PayerImpl <em>Resident Tax Payer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.impl.Resident_Tax_PayerImpl
		 * @see Taxation.impl.TaxationPackageImpl#getResident_Tax_Payer()
		 * @generated
		 */
		EClass RESIDENT_TAX_PAYER = eINSTANCE.getResident_Tax_Payer();

		/**
		 * The meta object literal for the '{@link Taxation.impl.Trade_and_Business_IncomeImpl <em>Trade and Business Income</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.impl.Trade_and_Business_IncomeImpl
		 * @see Taxation.impl.TaxationPackageImpl#getTrade_and_Business_Income()
		 * @generated
		 */
		EClass TRADE_AND_BUSINESS_INCOME = eINSTANCE.getTrade_and_Business_Income();

		/**
		 * The meta object literal for the '{@link Taxation.impl.Agriculture_and_Forestry_IncomeImpl <em>Agriculture and Forestry Income</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.impl.Agriculture_and_Forestry_IncomeImpl
		 * @see Taxation.impl.TaxationPackageImpl#getAgriculture_and_Forestry_Income()
		 * @generated
		 */
		EClass AGRICULTURE_AND_FORESTRY_INCOME = eINSTANCE.getAgriculture_and_Forestry_Income();

		/**
		 * The meta object literal for the '{@link Taxation.impl.Pensions_and_Annuities_IncomeImpl <em>Pensions and Annuities Income</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.impl.Pensions_and_Annuities_IncomeImpl
		 * @see Taxation.impl.TaxationPackageImpl#getPensions_and_Annuities_Income()
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
		 * The meta object literal for the '{@link Taxation.impl.Capital_and_Investments_IncomeImpl <em>Capital and Investments Income</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.impl.Capital_and_Investments_IncomeImpl
		 * @see Taxation.impl.TaxationPackageImpl#getCapital_and_Investments_Income()
		 * @generated
		 */
		EClass CAPITAL_AND_INVESTMENTS_INCOME = eINSTANCE.getCapital_and_Investments_Income();

		/**
		 * The meta object literal for the '{@link Taxation.impl.Employment_IncomeImpl <em>Employment Income</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.impl.Employment_IncomeImpl
		 * @see Taxation.impl.TaxationPackageImpl#getEmployment_Income()
		 * @generated
		 */
		EClass EMPLOYMENT_INCOME = eINSTANCE.getEmployment_Income();

		/**
		 * The meta object literal for the '{@link Taxation.impl.Rentals_and_Leases_IncomeImpl <em>Rentals and Leases Income</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.impl.Rentals_and_Leases_IncomeImpl
		 * @see Taxation.impl.TaxationPackageImpl#getRentals_and_Leases_Income()
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
		 * The meta object literal for the '{@link Taxation.impl.Foreign_IncomeImpl <em>Foreign Income</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.impl.Foreign_IncomeImpl
		 * @see Taxation.impl.TaxationPackageImpl#getForeign_Income()
		 * @generated
		 */
		EClass FOREIGN_INCOME = eINSTANCE.getForeign_Income();

		/**
		 * The meta object literal for the '{@link Taxation.impl.Local_IncomeImpl <em>Local Income</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.impl.Local_IncomeImpl
		 * @see Taxation.impl.TaxationPackageImpl#getLocal_Income()
		 * @generated
		 */
		EClass LOCAL_INCOME = eINSTANCE.getLocal_Income();

		/**
		 * The meta object literal for the '{@link Taxation.impl.CIMImpl <em>CIM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.impl.CIMImpl
		 * @see Taxation.impl.TaxationPackageImpl#getCIM()
		 * @generated
		 */
		EClass CIM = eINSTANCE.getCIM();

		/**
		 * The meta object literal for the '{@link Taxation.impl.CIPImpl <em>CIP</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.impl.CIPImpl
		 * @see Taxation.impl.TaxationPackageImpl#getCIP()
		 * @generated
		 */
		EClass CIP = eINSTANCE.getCIP();

		/**
		 * The meta object literal for the '{@link Taxation.impl.CISImpl <em>CIS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.impl.CISImpl
		 * @see Taxation.impl.TaxationPackageImpl#getCIS()
		 * @generated
		 */
		EClass CIS = eINSTANCE.getCIS();

		/**
		 * The meta object literal for the '{@link Taxation.impl.FDImpl <em>FD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.impl.FDImpl
		 * @see Taxation.impl.TaxationPackageImpl#getFD()
		 * @generated
		 */
		EClass FD = eINSTANCE.getFD();

		/**
		 * The meta object literal for the '<em><b>Distance declared in january</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FD__DISTANCE_DECLARED_IN_JANUARY = eINSTANCE.getFD_Distance_declared_in_january();

		/**
		 * The meta object literal for the '<em><b>Calculated distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FD__CALCULATED_DISTANCE = eINSTANCE.getFD_Calculated_distance();

		/**
		 * The meta object literal for the '{@link Taxation.impl.Professional_Expenses_DeductionImpl <em>Professional Expenses Deduction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.impl.Professional_Expenses_DeductionImpl
		 * @see Taxation.impl.TaxationPackageImpl#getProfessional_Expenses_Deduction()
		 * @generated
		 */
		EClass PROFESSIONAL_EXPENSES_DEDUCTION = eINSTANCE.getProfessional_Expenses_Deduction();

		/**
		 * The meta object literal for the '{@link Taxation.impl.FOImpl <em>FO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.impl.FOImpl
		 * @see Taxation.impl.TaxationPackageImpl#getFO()
		 * @generated
		 */
		EClass FO = eINSTANCE.getFO();

		/**
		 * The meta object literal for the '<em><b>Rate type for FO</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FO__RATE_TYPE_FOR_FO = eINSTANCE.getFO_Rate_type_for_FO();

		/**
		 * The meta object literal for the '{@link Taxation.impl.DS_for_Permanent_ExpenseImpl <em>DS for Permanent Expense</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.impl.DS_for_Permanent_ExpenseImpl
		 * @see Taxation.impl.TaxationPackageImpl#getDS_for_Permanent_Expense()
		 * @generated
		 */
		EClass DS_FOR_PERMANENT_EXPENSE = eINSTANCE.getDS_for_Permanent_Expense();

		/**
		 * The meta object literal for the '<em><b>Permanent expense category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DS_FOR_PERMANENT_EXPENSE__PERMANENT_EXPENSE_CATEGORY = eINSTANCE.getDS_for_Permanent_Expense_Permanent_expense_category();

		/**
		 * The meta object literal for the '{@link Taxation.impl.DSImpl <em>DS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.impl.DSImpl
		 * @see Taxation.impl.TaxationPackageImpl#getDS()
		 * @generated
		 */
		EClass DS = eINSTANCE.getDS();

		/**
		 * The meta object literal for the '<em><b>Maximum deductible amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DS__MAXIMUM_DEDUCTIBLE_AMOUNT = eINSTANCE.getDS_Maximum_deductible_amount();

		/**
		 * The meta object literal for the '<em><b>Id3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DS__ID3 = eINSTANCE.getDS_Id3();

		/**
		 * The meta object literal for the '{@link Taxation.impl.DS_for_Interest_ExpenseImpl <em>DS for Interest Expense</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.impl.DS_for_Interest_ExpenseImpl
		 * @see Taxation.impl.TaxationPackageImpl#getDS_for_Interest_Expense()
		 * @generated
		 */
		EClass DS_FOR_INTEREST_EXPENSE = eINSTANCE.getDS_for_Interest_Expense();

		/**
		 * The meta object literal for the '{@link Taxation.impl.DS_for_Health_and_Pension_InsuranceImpl <em>DS for Health and Pension Insurance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.impl.DS_for_Health_and_Pension_InsuranceImpl
		 * @see Taxation.impl.TaxationPackageImpl#getDS_for_Health_and_Pension_Insurance()
		 * @generated
		 */
		EClass DS_FOR_HEALTH_AND_PENSION_INSURANCE = eINSTANCE.getDS_for_Health_and_Pension_Insurance();

		/**
		 * The meta object literal for the '<em><b>Insurance category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DS_FOR_HEALTH_AND_PENSION_INSURANCE__INSURANCE_CATEGORY = eINSTANCE.getDS_for_Health_and_Pension_Insurance_Insurance_category();

		/**
		 * The meta object literal for the '{@link Taxation.impl.DS_for_Private_Insurance_and_PlanImpl <em>DS for Private Insurance and Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.impl.DS_for_Private_Insurance_and_PlanImpl
		 * @see Taxation.impl.TaxationPackageImpl#getDS_for_Private_Insurance_and_Plan()
		 * @generated
		 */
		EClass DS_FOR_PRIVATE_INSURANCE_AND_PLAN = eINSTANCE.getDS_for_Private_Insurance_and_Plan();

		/**
		 * The meta object literal for the '<em><b>Private insurance and plan category</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DS_FOR_PRIVATE_INSURANCE_AND_PLAN__PRIVATE_INSURANCE_AND_PLAN_CATEGORY = eINSTANCE.getDS_for_Private_Insurance_and_Plan_Private_insurance_and_plan_category();

		/**
		 * The meta object literal for the '<em><b>Increase for life insurance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DS_FOR_PRIVATE_INSURANCE_AND_PLAN__INCREASE_FOR_LIFE_INSURANCE = eINSTANCE.getDS_for_Private_Insurance_and_Plan_Increase_for_life_insurance();

		/**
		 * The meta object literal for the '<em><b>Maximum deductible amount for private insurance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DS_FOR_PRIVATE_INSURANCE_AND_PLAN__MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_PRIVATE_INSURANCE = eINSTANCE.getDS_for_Private_Insurance_and_Plan_Maximum_deductible_amount_for_private_insurance();

		/**
		 * The meta object literal for the '<em><b>Maximum deductible amount for old age pension plan</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DS_FOR_PRIVATE_INSURANCE_AND_PLAN__MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_OLD_AGE_PENSION_PLAN = eINSTANCE.getDS_for_Private_Insurance_and_Plan_Maximum_deductible_amount_for_old_age_pension_plan();

		/**
		 * The meta object literal for the '{@link Taxation.impl.DS_for_Loss_CarryforwardImpl <em>DS for Loss Carryforward</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.impl.DS_for_Loss_CarryforwardImpl
		 * @see Taxation.impl.TaxationPackageImpl#getDS_for_Loss_Carryforward()
		 * @generated
		 */
		EClass DS_FOR_LOSS_CARRYFORWARD = eINSTANCE.getDS_for_Loss_Carryforward();

		/**
		 * The meta object literal for the '{@link Taxation.impl.DS_for_DonationImpl <em>DS for Donation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.impl.DS_for_DonationImpl
		 * @see Taxation.impl.TaxationPackageImpl#getDS_for_Donation()
		 * @generated
		 */
		EClass DS_FOR_DONATION = eINSTANCE.getDS_for_Donation();

		/**
		 * The meta object literal for the '{@link Taxation.impl.Permanent_ExpenseImpl <em>Permanent Expense</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.impl.Permanent_ExpenseImpl
		 * @see Taxation.impl.TaxationPackageImpl#getPermanent_Expense()
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
		 * The meta object literal for the '<em><b>Is eligible for deduction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMANENT_EXPENSE__IS_ELIGIBLE_FOR_DEDUCTION = eINSTANCE.getPermanent_Expense_Is_eligible_for_deduction();

		/**
		 * The meta object literal for the '{@link Taxation.impl.Special_Expense_DSImpl <em>Special Expense DS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.impl.Special_Expense_DSImpl
		 * @see Taxation.impl.TaxationPackageImpl#getSpecial_Expense_DS()
		 * @generated
		 */
		EClass SPECIAL_EXPENSE_DS = eINSTANCE.getSpecial_Expense_DS();

		/**
		 * The meta object literal for the '{@link Taxation.impl.Interest_ExpenseImpl <em>Interest Expense</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.impl.Interest_ExpenseImpl
		 * @see Taxation.impl.TaxationPackageImpl#getInterest_Expense()
		 * @generated
		 */
		EClass INTEREST_EXPENSE = eINSTANCE.getInterest_Expense();

		/**
		 * The meta object literal for the '{@link Taxation.impl.Private_Insurance_and_PlanImpl <em>Private Insurance and Plan</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.impl.Private_Insurance_and_PlanImpl
		 * @see Taxation.impl.TaxationPackageImpl#getPrivate_Insurance_and_Plan()
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
		 * The meta object literal for the '<em><b>Is private insurance and plan eligible for deduction</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIVATE_INSURANCE_AND_PLAN__IS_PRIVATE_INSURANCE_AND_PLAN_ELIGIBLE_FOR_DEDUCTION = eINSTANCE.getPrivate_Insurance_and_Plan_Is_private_insurance_and_plan_eligible_for_deduction();

		/**
		 * The meta object literal for the '{@link Taxation.impl.Health_and_Pension_InsuranceImpl <em>Health and Pension Insurance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.impl.Health_and_Pension_InsuranceImpl
		 * @see Taxation.impl.TaxationPackageImpl#getHealth_and_Pension_Insurance()
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
		 * The meta object literal for the '{@link Taxation.impl.DonationImpl <em>Donation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.impl.DonationImpl
		 * @see Taxation.impl.TaxationPackageImpl#getDonation()
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
		 * The meta object literal for the '<em><b>Is beneficiary eligible</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DONATION__IS_BENEFICIARY_ELIGIBLE = eINSTANCE.getDonation_Is_beneficiary_eligible();

		/**
		 * The meta object literal for the '<em><b>Is donation reported</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DONATION__IS_DONATION_REPORTED = eINSTANCE.getDonation_Is_donation_reported();

		/**
		 * The meta object literal for the '{@link Taxation.impl.Loss_CarryforwardImpl <em>Loss Carryforward</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.impl.Loss_CarryforwardImpl
		 * @see Taxation.impl.TaxationPackageImpl#getLoss_Carryforward()
		 * @generated
		 */
		EClass LOSS_CARRYFORWARD = eINSTANCE.getLoss_Carryforward();

		/**
		 * The meta object literal for the '<em><b>Regular accountability</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOSS_CARRYFORWARD__REGULAR_ACCOUNTABILITY = eINSTANCE.getLoss_Carryforward_Regular_accountability();

		/**
		 * The meta object literal for the '<em><b>Compensation by other means</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOSS_CARRYFORWARD__COMPENSATION_BY_OTHER_MEANS = eINSTANCE.getLoss_Carryforward_Compensation_by_other_means();

		/**
		 * The meta object literal for the '<em><b>Tax payer has inherited business ownership</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOSS_CARRYFORWARD__TAX_PAYER_HAS_INHERITED_BUSINESS_OWNERSHIP = eINSTANCE.getLoss_Carryforward_Tax_payer_has_inherited_business_ownership();

		/**
		 * The meta object literal for the '<em><b>Tax payer has been partner in business</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOSS_CARRYFORWARD__TAX_PAYER_HAS_BEEN_PARTNER_IN_BUSINESS = eINSTANCE.getLoss_Carryforward_Tax_payer_has_been_partner_in_business();

		/**
		 * The meta object literal for the '{@link Taxation.impl.Spousal_Expense_ACImpl <em>Spousal Expense AC</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.impl.Spousal_Expense_ACImpl
		 * @see Taxation.impl.TaxationPackageImpl#getSpousal_Expense_AC()
		 * @generated
		 */
		EClass SPOUSAL_EXPENSE_AC = eINSTANCE.getSpousal_Expense_AC();

		/**
		 * The meta object literal for the '{@link Taxation.impl.Extraordinary_Expense_CEImpl <em>Extraordinary Expense CE</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.impl.Extraordinary_Expense_CEImpl
		 * @see Taxation.impl.TaxationPackageImpl#getExtraordinary_Expense_CE()
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
		 * The meta object literal for the '{@link Taxation.impl.Travel_Expense_FDImpl <em>Travel Expense FD</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.impl.Travel_Expense_FDImpl
		 * @see Taxation.impl.TaxationPackageImpl#getTravel_Expense_FD()
		 * @generated
		 */
		EClass TRAVEL_EXPENSE_FD = eINSTANCE.getTravel_Expense_FD();

		/**
		 * The meta object literal for the '{@link Taxation.impl.Professional_ExpenseImpl <em>Professional Expense</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.impl.Professional_ExpenseImpl
		 * @see Taxation.impl.TaxationPackageImpl#getProfessional_Expense()
		 * @generated
		 */
		EClass PROFESSIONAL_EXPENSE = eINSTANCE.getProfessional_Expense();

		/**
		 * The meta object literal for the '{@link Taxation.impl.Miscellaneous_Expense_FOImpl <em>Miscellaneous Expense FO</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.impl.Miscellaneous_Expense_FOImpl
		 * @see Taxation.impl.TaxationPackageImpl#getMiscellaneous_Expense_FO()
		 * @generated
		 */
		EClass MISCELLANEOUS_EXPENSE_FO = eINSTANCE.getMiscellaneous_Expense_FO();

		/**
		 * The meta object literal for the '{@link Taxation.Grantor <em>Grantor</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.Grantor
		 * @see Taxation.impl.TaxationPackageImpl#getGrantor()
		 * @generated
		 */
		EEnum GRANTOR = eINSTANCE.getGrantor();

		/**
		 * The meta object literal for the '{@link Taxation.Disability_Types <em>Disability Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.Disability_Types
		 * @see Taxation.impl.TaxationPackageImpl#getDisability_Types()
		 * @generated
		 */
		EEnum DISABILITY_TYPES = eINSTANCE.getDisability_Types();

		/**
		 * The meta object literal for the '{@link Taxation.Country <em>Country</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.Country
		 * @see Taxation.impl.TaxationPackageImpl#getCountry()
		 * @generated
		 */
		EEnum COUNTRY = eINSTANCE.getCountry();

		/**
		 * The meta object literal for the '{@link Taxation.Tax_Card_Type <em>Tax Card Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.Tax_Card_Type
		 * @see Taxation.impl.TaxationPackageImpl#getTax_Card_Type()
		 * @generated
		 */
		EEnum TAX_CARD_TYPE = eINSTANCE.getTax_Card_Type();

		/**
		 * The meta object literal for the '{@link Taxation.Tax_Office <em>Tax Office</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.Tax_Office
		 * @see Taxation.impl.TaxationPackageImpl#getTax_Office()
		 * @generated
		 */
		EEnum TAX_OFFICE = eINSTANCE.getTax_Office();

		/**
		 * The meta object literal for the '{@link Taxation.Tax_Class_Category <em>Tax Class Category</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.Tax_Class_Category
		 * @see Taxation.impl.TaxationPackageImpl#getTax_Class_Category()
		 * @generated
		 */
		EEnum TAX_CLASS_CATEGORY = eINSTANCE.getTax_Class_Category();

		/**
		 * The meta object literal for the '{@link Taxation.Job_Activity <em>Job Activity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.Job_Activity
		 * @see Taxation.impl.TaxationPackageImpl#getJob_Activity()
		 * @generated
		 */
		EEnum JOB_ACTIVITY = eINSTANCE.getJob_Activity();

		/**
		 * The meta object literal for the '{@link Taxation.Town <em>Town</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.Town
		 * @see Taxation.impl.TaxationPackageImpl#getTown()
		 * @generated
		 */
		EEnum TOWN = eINSTANCE.getTown();

		/**
		 * The meta object literal for the '{@link Taxation.Type_of_Rate <em>Type of Rate</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.Type_of_Rate
		 * @see Taxation.impl.TaxationPackageImpl#getType_of_Rate()
		 * @generated
		 */
		EEnum TYPE_OF_RATE = eINSTANCE.getType_of_Rate();

		/**
		 * The meta object literal for the '{@link Taxation.CE_Type <em>CE Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.CE_Type
		 * @see Taxation.impl.TaxationPackageImpl#getCE_Type()
		 * @generated
		 */
		EEnum CE_TYPE = eINSTANCE.getCE_Type();

		/**
		 * The meta object literal for the '{@link Taxation.Expense_Purpose <em>Expense Purpose</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.Expense_Purpose
		 * @see Taxation.impl.TaxationPackageImpl#getExpense_Purpose()
		 * @generated
		 */
		EEnum EXPENSE_PURPOSE = eINSTANCE.getExpense_Purpose();

		/**
		 * The meta object literal for the '{@link Taxation.Dependent_Type <em>Dependent Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.Dependent_Type
		 * @see Taxation.impl.TaxationPackageImpl#getDependent_Type()
		 * @generated
		 */
		EEnum DEPENDENT_TYPE = eINSTANCE.getDependent_Type();

		/**
		 * The meta object literal for the '{@link Taxation.Separation_Causes <em>Separation Causes</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.Separation_Causes
		 * @see Taxation.impl.TaxationPackageImpl#getSeparation_Causes()
		 * @generated
		 */
		EEnum SEPARATION_CAUSES = eINSTANCE.getSeparation_Causes();

		/**
		 * The meta object literal for the '{@link Taxation.Category_of_Permanent_Expense <em>Category of Permanent Expense</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.Category_of_Permanent_Expense
		 * @see Taxation.impl.TaxationPackageImpl#getCategory_of_Permanent_Expense()
		 * @generated
		 */
		EEnum CATEGORY_OF_PERMANENT_EXPENSE = eINSTANCE.getCategory_of_Permanent_Expense();

		/**
		 * The meta object literal for the '{@link Taxation.Category_of_Health_and_Pension_Insurances <em>Category of Health and Pension Insurances</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.Category_of_Health_and_Pension_Insurances
		 * @see Taxation.impl.TaxationPackageImpl#getCategory_of_Health_and_Pension_Insurances()
		 * @generated
		 */
		EEnum CATEGORY_OF_HEALTH_AND_PENSION_INSURANCES = eINSTANCE.getCategory_of_Health_and_Pension_Insurances();

		/**
		 * The meta object literal for the '{@link Taxation.Category_of_Private_Insurance_and_Plan <em>Category of Private Insurance and Plan</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.Category_of_Private_Insurance_and_Plan
		 * @see Taxation.impl.TaxationPackageImpl#getCategory_of_Private_Insurance_and_Plan()
		 * @generated
		 */
		EEnum CATEGORY_OF_PRIVATE_INSURANCE_AND_PLAN = eINSTANCE.getCategory_of_Private_Insurance_and_Plan();

		/**
		 * The meta object literal for the '{@link Taxation.Legal_Union_Types <em>Legal Union Types</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see Taxation.Legal_Union_Types
		 * @see Taxation.impl.TaxationPackageImpl#getLegal_Union_Types()
		 * @generated
		 */
		EEnum LEGAL_UNION_TYPES = eINSTANCE.getLegal_Union_Types();

	}

} //TaxationPackage
