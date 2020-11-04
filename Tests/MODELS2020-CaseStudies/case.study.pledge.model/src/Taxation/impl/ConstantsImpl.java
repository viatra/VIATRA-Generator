/**
 */
package Taxation.impl;

import Taxation.Constants;
import Taxation.TaxationPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constants</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Taxation.impl.ConstantsImpl#getMAXIMUM_CE_RATE_FOR_CHILD_NOT_BEING_PART_OF_HOUSEHOLD <em>MAXIMUM CE RATE FOR CHILD NOT BEING PART OF HOUSEHOLD</em>}</li>
 *   <li>{@link Taxation.impl.ConstantsImpl#getMAXIMUM_CE_RATE_FOR_HOUSE_CARE_AND_CHILD_PART_OF_THE_HOUSEHOLD_CARE <em>MAXIMUM CE RATE FOR HOUSE CARE AND CHILD PART OF THE HOUSEHOLD CARE</em>}</li>
 *   <li>{@link Taxation.impl.ConstantsImpl#getMINIMUM_SALARY <em>MINIMUM SALARY</em>}</li>
 *   <li>{@link Taxation.impl.ConstantsImpl#getFLAT_RATE_FOR_EXTRA_PROFESSIONAL_DEDUCTION <em>FLAT RATE FOR EXTRA PROFESSIONAL DEDUCTION</em>}</li>
 *   <li>{@link Taxation.impl.ConstantsImpl#getMAXIMUM_DEDUCTIBLE_PERCENTAGE_FOR_DONATIONS <em>MAXIMUM DEDUCTIBLE PERCENTAGE FOR DONATIONS</em>}</li>
 *   <li>{@link Taxation.impl.ConstantsImpl#getMINIMUM_DEDUCTIBLE_AMOUNT_FOR_DONATIONS <em>MINIMUM DEDUCTIBLE AMOUNT FOR DONATIONS</em>}</li>
 *   <li>{@link Taxation.impl.ConstantsImpl#getMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANC <em>MAXIMUM DEDUCTIBLE AMOUNT FOR ADDITIONAL PENSION AND INSURANC</em>}</li>
 *   <li>{@link Taxation.impl.ConstantsImpl#getMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ALIMONY_EXPENSE <em>MAXIMUM DEDUCTIBLE AMOUNT FOR ALIMONY EXPENSE</em>}</li>
 *   <li>{@link Taxation.impl.ConstantsImpl#getMAXIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION <em>MAXIMAL DISTANCE FOR TRAVEL EXPENSE DEDUCTION</em>}</li>
 *   <li>{@link Taxation.impl.ConstantsImpl#getMAXIMAL_FLAT_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION <em>MAXIMAL FLAT DISTANCE FOR TRAVEL EXPENSE DEDUCTION</em>}</li>
 *   <li>{@link Taxation.impl.ConstantsImpl#getMINIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION <em>MINIMAL DISTANCE FOR TRAVEL EXPENSE DEDUCTION</em>}</li>
 *   <li>{@link Taxation.impl.ConstantsImpl#getFLAT_RATE_CIM_DAILY <em>FLAT RATE CIM DAILY</em>}</li>
 *   <li>{@link Taxation.impl.ConstantsImpl#getFLAT_RATE_CIM_MONTHLY <em>FLAT RATE CIM MONTHLY</em>}</li>
 *   <li>{@link Taxation.impl.ConstantsImpl#getFLAT_RATE_CIM_YEARLY <em>FLAT RATE CIM YEARLY</em>}</li>
 *   <li>{@link Taxation.impl.ConstantsImpl#getFLAT_RATE_CIP_DAILY <em>FLAT RATE CIP DAILY</em>}</li>
 *   <li>{@link Taxation.impl.ConstantsImpl#getFLAT_RATE_CIP_MONTHLY <em>FLAT RATE CIP MONTHLY</em>}</li>
 *   <li>{@link Taxation.impl.ConstantsImpl#getFLAT_RATE_CIP_YEARLY <em>FLAT RATE CIP YEARLY</em>}</li>
 *   <li>{@link Taxation.impl.ConstantsImpl#getFLAT_RATE_CIS_DAILY <em>FLAT RATE CIS DAILY</em>}</li>
 *   <li>{@link Taxation.impl.ConstantsImpl#getFLAT_RATE_CIS_MONTHLY <em>FLAT RATE CIS MONTHLY</em>}</li>
 *   <li>{@link Taxation.impl.ConstantsImpl#getFLAT_RATE_CIS_YEARLY <em>FLAT RATE CIS YEARLY</em>}</li>
 *   <li>{@link Taxation.impl.ConstantsImpl#getFLAT_RATE_FOR_TRAVEL_EXPENSE_PER_UNIT <em>FLAT RATE FOR TRAVEL EXPENSE PER UNIT</em>}</li>
 *   <li>{@link Taxation.impl.ConstantsImpl#getMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_DS <em>MAXIMUM DEDUCTIBLE AMOUNT FOR DS</em>}</li>
 *   <li>{@link Taxation.impl.ConstantsImpl#getFLAT_RATE_FOR_MISCELLANEOUS_EXPENSE <em>FLAT RATE FOR MISCELLANEOUS EXPENSE</em>}</li>
 *   <li>{@link Taxation.impl.ConstantsImpl#getDISABILITY_FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE <em>DISABILITY FLAT RATE FOR MISCELLANEOUS EXPENSE</em>}</li>
 *   <li>{@link Taxation.impl.ConstantsImpl#getMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANCE <em>MAXIMUM DEDUCTIBLE AMOUNT FOR ADDITIONAL PENSION AND INSURANCE</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ConstantsImpl extends MinimalEObjectImpl.Container implements Constants {
	/**
	 * The default value of the '{@link #getMAXIMUM_CE_RATE_FOR_CHILD_NOT_BEING_PART_OF_HOUSEHOLD() <em>MAXIMUM CE RATE FOR CHILD NOT BEING PART OF HOUSEHOLD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMAXIMUM_CE_RATE_FOR_CHILD_NOT_BEING_PART_OF_HOUSEHOLD()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMUM_CE_RATE_FOR_CHILD_NOT_BEING_PART_OF_HOUSEHOLD_EDEFAULT = 3480.0;

	/**
	 * The cached value of the '{@link #getMAXIMUM_CE_RATE_FOR_CHILD_NOT_BEING_PART_OF_HOUSEHOLD() <em>MAXIMUM CE RATE FOR CHILD NOT BEING PART OF HOUSEHOLD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMAXIMUM_CE_RATE_FOR_CHILD_NOT_BEING_PART_OF_HOUSEHOLD()
	 * @generated
	 * @ordered
	 */
	protected double maximuM_CE_RATE_FOR_CHILD_NOT_BEING_PART_OF_HOUSEHOLD = MAXIMUM_CE_RATE_FOR_CHILD_NOT_BEING_PART_OF_HOUSEHOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getMAXIMUM_CE_RATE_FOR_HOUSE_CARE_AND_CHILD_PART_OF_THE_HOUSEHOLD_CARE() <em>MAXIMUM CE RATE FOR HOUSE CARE AND CHILD PART OF THE HOUSEHOLD CARE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMAXIMUM_CE_RATE_FOR_HOUSE_CARE_AND_CHILD_PART_OF_THE_HOUSEHOLD_CARE()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMUM_CE_RATE_FOR_HOUSE_CARE_AND_CHILD_PART_OF_THE_HOUSEHOLD_CARE_EDEFAULT = 3600.0;

	/**
	 * The cached value of the '{@link #getMAXIMUM_CE_RATE_FOR_HOUSE_CARE_AND_CHILD_PART_OF_THE_HOUSEHOLD_CARE() <em>MAXIMUM CE RATE FOR HOUSE CARE AND CHILD PART OF THE HOUSEHOLD CARE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMAXIMUM_CE_RATE_FOR_HOUSE_CARE_AND_CHILD_PART_OF_THE_HOUSEHOLD_CARE()
	 * @generated
	 * @ordered
	 */
	protected double maximuM_CE_RATE_FOR_HOUSE_CARE_AND_CHILD_PART_OF_THE_HOUSEHOLD_CARE = MAXIMUM_CE_RATE_FOR_HOUSE_CARE_AND_CHILD_PART_OF_THE_HOUSEHOLD_CARE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMINIMUM_SALARY() <em>MINIMUM SALARY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMINIMUM_SALARY()
	 * @generated
	 * @ordered
	 */
	protected static final double MINIMUM_SALARY_EDEFAULT = 1500.0;

	/**
	 * The cached value of the '{@link #getMINIMUM_SALARY() <em>MINIMUM SALARY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMINIMUM_SALARY()
	 * @generated
	 * @ordered
	 */
	protected double minimuM_SALARY = MINIMUM_SALARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFLAT_RATE_FOR_EXTRA_PROFESSIONAL_DEDUCTION() <em>FLAT RATE FOR EXTRA PROFESSIONAL DEDUCTION</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFLAT_RATE_FOR_EXTRA_PROFESSIONAL_DEDUCTION()
	 * @generated
	 * @ordered
	 */
	protected static final double FLAT_RATE_FOR_EXTRA_PROFESSIONAL_DEDUCTION_EDEFAULT = 4500.0;

	/**
	 * The cached value of the '{@link #getFLAT_RATE_FOR_EXTRA_PROFESSIONAL_DEDUCTION() <em>FLAT RATE FOR EXTRA PROFESSIONAL DEDUCTION</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFLAT_RATE_FOR_EXTRA_PROFESSIONAL_DEDUCTION()
	 * @generated
	 * @ordered
	 */
	protected double flaT_RATE_FOR_EXTRA_PROFESSIONAL_DEDUCTION = FLAT_RATE_FOR_EXTRA_PROFESSIONAL_DEDUCTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMAXIMUM_DEDUCTIBLE_PERCENTAGE_FOR_DONATIONS() <em>MAXIMUM DEDUCTIBLE PERCENTAGE FOR DONATIONS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMAXIMUM_DEDUCTIBLE_PERCENTAGE_FOR_DONATIONS()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMUM_DEDUCTIBLE_PERCENTAGE_FOR_DONATIONS_EDEFAULT = 20.0;

	/**
	 * The cached value of the '{@link #getMAXIMUM_DEDUCTIBLE_PERCENTAGE_FOR_DONATIONS() <em>MAXIMUM DEDUCTIBLE PERCENTAGE FOR DONATIONS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMAXIMUM_DEDUCTIBLE_PERCENTAGE_FOR_DONATIONS()
	 * @generated
	 * @ordered
	 */
	protected double maximuM_DEDUCTIBLE_PERCENTAGE_FOR_DONATIONS = MAXIMUM_DEDUCTIBLE_PERCENTAGE_FOR_DONATIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMINIMUM_DEDUCTIBLE_AMOUNT_FOR_DONATIONS() <em>MINIMUM DEDUCTIBLE AMOUNT FOR DONATIONS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMINIMUM_DEDUCTIBLE_AMOUNT_FOR_DONATIONS()
	 * @generated
	 * @ordered
	 */
	protected static final double MINIMUM_DEDUCTIBLE_AMOUNT_FOR_DONATIONS_EDEFAULT = 120.0;

	/**
	 * The cached value of the '{@link #getMINIMUM_DEDUCTIBLE_AMOUNT_FOR_DONATIONS() <em>MINIMUM DEDUCTIBLE AMOUNT FOR DONATIONS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMINIMUM_DEDUCTIBLE_AMOUNT_FOR_DONATIONS()
	 * @generated
	 * @ordered
	 */
	protected double minimuM_DEDUCTIBLE_AMOUNT_FOR_DONATIONS = MINIMUM_DEDUCTIBLE_AMOUNT_FOR_DONATIONS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANC() <em>MAXIMUM DEDUCTIBLE AMOUNT FOR ADDITIONAL PENSION AND INSURANC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANC()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANC_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANC() <em>MAXIMUM DEDUCTIBLE AMOUNT FOR ADDITIONAL PENSION AND INSURANC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANC()
	 * @generated
	 * @ordered
	 */
	protected double maximuM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANC = MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANC_EDEFAULT;

	/**
	 * The default value of the '{@link #getMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ALIMONY_EXPENSE() <em>MAXIMUM DEDUCTIBLE AMOUNT FOR ALIMONY EXPENSE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ALIMONY_EXPENSE()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ALIMONY_EXPENSE_EDEFAULT = 24000.0;

	/**
	 * The cached value of the '{@link #getMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ALIMONY_EXPENSE() <em>MAXIMUM DEDUCTIBLE AMOUNT FOR ALIMONY EXPENSE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ALIMONY_EXPENSE()
	 * @generated
	 * @ordered
	 */
	protected double maximuM_DEDUCTIBLE_AMOUNT_FOR_ALIMONY_EXPENSE = MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ALIMONY_EXPENSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMAXIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION() <em>MAXIMAL DISTANCE FOR TRAVEL EXPENSE DEDUCTION</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMAXIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION_EDEFAULT = 99.0;

	/**
	 * The cached value of the '{@link #getMAXIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION() <em>MAXIMAL DISTANCE FOR TRAVEL EXPENSE DEDUCTION</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMAXIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION()
	 * @generated
	 * @ordered
	 */
	protected double maximaL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION = MAXIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMAXIMAL_FLAT_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION() <em>MAXIMAL FLAT DISTANCE FOR TRAVEL EXPENSE DEDUCTION</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMAXIMAL_FLAT_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMAL_FLAT_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION_EDEFAULT = 30.0;

	/**
	 * The cached value of the '{@link #getMAXIMAL_FLAT_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION() <em>MAXIMAL FLAT DISTANCE FOR TRAVEL EXPENSE DEDUCTION</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMAXIMAL_FLAT_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION()
	 * @generated
	 * @ordered
	 */
	protected double maximaL_FLAT_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION = MAXIMAL_FLAT_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getMINIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION() <em>MINIMAL DISTANCE FOR TRAVEL EXPENSE DEDUCTION</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMINIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION()
	 * @generated
	 * @ordered
	 */
	protected static final double MINIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION_EDEFAULT = 4.0;

	/**
	 * The cached value of the '{@link #getMINIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION() <em>MINIMAL DISTANCE FOR TRAVEL EXPENSE DEDUCTION</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMINIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION()
	 * @generated
	 * @ordered
	 */
	protected double minimaL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION = MINIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFLAT_RATE_CIM_DAILY() <em>FLAT RATE CIM DAILY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFLAT_RATE_CIM_DAILY()
	 * @generated
	 * @ordered
	 */
	protected static final double FLAT_RATE_CIM_DAILY_EDEFAULT = 2.0;

	/**
	 * The cached value of the '{@link #getFLAT_RATE_CIM_DAILY() <em>FLAT RATE CIM DAILY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFLAT_RATE_CIM_DAILY()
	 * @generated
	 * @ordered
	 */
	protected double flaT_RATE_CIM_DAILY = FLAT_RATE_CIM_DAILY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFLAT_RATE_CIM_MONTHLY() <em>FLAT RATE CIM MONTHLY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFLAT_RATE_CIM_MONTHLY()
	 * @generated
	 * @ordered
	 */
	protected static final double FLAT_RATE_CIM_MONTHLY_EDEFAULT = 62.0;

	/**
	 * The cached value of the '{@link #getFLAT_RATE_CIM_MONTHLY() <em>FLAT RATE CIM MONTHLY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFLAT_RATE_CIM_MONTHLY()
	 * @generated
	 * @ordered
	 */
	protected double flaT_RATE_CIM_MONTHLY = FLAT_RATE_CIM_MONTHLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFLAT_RATE_CIM_YEARLY() <em>FLAT RATE CIM YEARLY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFLAT_RATE_CIM_YEARLY()
	 * @generated
	 * @ordered
	 */
	protected static final double FLAT_RATE_CIM_YEARLY_EDEFAULT = 750.0;

	/**
	 * The cached value of the '{@link #getFLAT_RATE_CIM_YEARLY() <em>FLAT RATE CIM YEARLY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFLAT_RATE_CIM_YEARLY()
	 * @generated
	 * @ordered
	 */
	protected double flaT_RATE_CIM_YEARLY = FLAT_RATE_CIM_YEARLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFLAT_RATE_CIP_DAILY() <em>FLAT RATE CIP DAILY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFLAT_RATE_CIP_DAILY()
	 * @generated
	 * @ordered
	 */
	protected static final double FLAT_RATE_CIP_DAILY_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getFLAT_RATE_CIP_DAILY() <em>FLAT RATE CIP DAILY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFLAT_RATE_CIP_DAILY()
	 * @generated
	 * @ordered
	 */
	protected double flaT_RATE_CIP_DAILY = FLAT_RATE_CIP_DAILY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFLAT_RATE_CIP_MONTHLY() <em>FLAT RATE CIP MONTHLY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFLAT_RATE_CIP_MONTHLY()
	 * @generated
	 * @ordered
	 */
	protected static final double FLAT_RATE_CIP_MONTHLY_EDEFAULT = 25.0;

	/**
	 * The cached value of the '{@link #getFLAT_RATE_CIP_MONTHLY() <em>FLAT RATE CIP MONTHLY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFLAT_RATE_CIP_MONTHLY()
	 * @generated
	 * @ordered
	 */
	protected double flaT_RATE_CIP_MONTHLY = FLAT_RATE_CIP_MONTHLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFLAT_RATE_CIP_YEARLY() <em>FLAT RATE CIP YEARLY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFLAT_RATE_CIP_YEARLY()
	 * @generated
	 * @ordered
	 */
	protected static final double FLAT_RATE_CIP_YEARLY_EDEFAULT = 30.0;

	/**
	 * The cached value of the '{@link #getFLAT_RATE_CIP_YEARLY() <em>FLAT RATE CIP YEARLY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFLAT_RATE_CIP_YEARLY()
	 * @generated
	 * @ordered
	 */
	protected double flaT_RATE_CIP_YEARLY = FLAT_RATE_CIP_YEARLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFLAT_RATE_CIS_DAILY() <em>FLAT RATE CIS DAILY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFLAT_RATE_CIS_DAILY()
	 * @generated
	 * @ordered
	 */
	protected static final double FLAT_RATE_CIS_DAILY_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getFLAT_RATE_CIS_DAILY() <em>FLAT RATE CIS DAILY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFLAT_RATE_CIS_DAILY()
	 * @generated
	 * @ordered
	 */
	protected double flaT_RATE_CIS_DAILY = FLAT_RATE_CIS_DAILY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFLAT_RATE_CIS_MONTHLY() <em>FLAT RATE CIS MONTHLY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFLAT_RATE_CIS_MONTHLY()
	 * @generated
	 * @ordered
	 */
	protected static final double FLAT_RATE_CIS_MONTHLY_EDEFAULT = 25.0;

	/**
	 * The cached value of the '{@link #getFLAT_RATE_CIS_MONTHLY() <em>FLAT RATE CIS MONTHLY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFLAT_RATE_CIS_MONTHLY()
	 * @generated
	 * @ordered
	 */
	protected double flaT_RATE_CIS_MONTHLY = FLAT_RATE_CIS_MONTHLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFLAT_RATE_CIS_YEARLY() <em>FLAT RATE CIS YEARLY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFLAT_RATE_CIS_YEARLY()
	 * @generated
	 * @ordered
	 */
	protected static final double FLAT_RATE_CIS_YEARLY_EDEFAULT = 300.0;

	/**
	 * The cached value of the '{@link #getFLAT_RATE_CIS_YEARLY() <em>FLAT RATE CIS YEARLY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFLAT_RATE_CIS_YEARLY()
	 * @generated
	 * @ordered
	 */
	protected double flaT_RATE_CIS_YEARLY = FLAT_RATE_CIS_YEARLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getFLAT_RATE_FOR_TRAVEL_EXPENSE_PER_UNIT() <em>FLAT RATE FOR TRAVEL EXPENSE PER UNIT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFLAT_RATE_FOR_TRAVEL_EXPENSE_PER_UNIT()
	 * @generated
	 * @ordered
	 */
	protected static final double FLAT_RATE_FOR_TRAVEL_EXPENSE_PER_UNIT_EDEFAULT = 99.0;

	/**
	 * The cached value of the '{@link #getFLAT_RATE_FOR_TRAVEL_EXPENSE_PER_UNIT() <em>FLAT RATE FOR TRAVEL EXPENSE PER UNIT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFLAT_RATE_FOR_TRAVEL_EXPENSE_PER_UNIT()
	 * @generated
	 * @ordered
	 */
	protected double flaT_RATE_FOR_TRAVEL_EXPENSE_PER_UNIT = FLAT_RATE_FOR_TRAVEL_EXPENSE_PER_UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_DS() <em>MAXIMUM DEDUCTIBLE AMOUNT FOR DS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_DS()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_DS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_DS() <em>MAXIMUM DEDUCTIBLE AMOUNT FOR DS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_DS()
	 * @generated
	 * @ordered
	 */
	protected double maximuM_DEDUCTIBLE_AMOUNT_FOR_DS = MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_DS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFLAT_RATE_FOR_MISCELLANEOUS_EXPENSE() <em>FLAT RATE FOR MISCELLANEOUS EXPENSE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFLAT_RATE_FOR_MISCELLANEOUS_EXPENSE()
	 * @generated
	 * @ordered
	 */
	protected static final double FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getFLAT_RATE_FOR_MISCELLANEOUS_EXPENSE() <em>FLAT RATE FOR MISCELLANEOUS EXPENSE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFLAT_RATE_FOR_MISCELLANEOUS_EXPENSE()
	 * @generated
	 * @ordered
	 */
	protected double flaT_RATE_FOR_MISCELLANEOUS_EXPENSE = FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDISABILITY_FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE() <em>DISABILITY FLAT RATE FOR MISCELLANEOUS EXPENSE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDISABILITY_FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE()
	 * @generated
	 * @ordered
	 */
	protected static final double DISABILITY_FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDISABILITY_FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE() <em>DISABILITY FLAT RATE FOR MISCELLANEOUS EXPENSE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDISABILITY_FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE()
	 * @generated
	 * @ordered
	 */
	protected double disabilitY_FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE = DISABILITY_FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANCE() <em>MAXIMUM DEDUCTIBLE AMOUNT FOR ADDITIONAL PENSION AND INSURANCE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANCE()
	 * @generated
	 * @ordered
	 */
	protected static final double MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANCE() <em>MAXIMUM DEDUCTIBLE AMOUNT FOR ADDITIONAL PENSION AND INSURANCE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANCE()
	 * @generated
	 * @ordered
	 */
	protected double maximuM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANCE = MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstantsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaxationPackage.Literals.CONSTANTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMAXIMUM_CE_RATE_FOR_CHILD_NOT_BEING_PART_OF_HOUSEHOLD() {
		return maximuM_CE_RATE_FOR_CHILD_NOT_BEING_PART_OF_HOUSEHOLD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMAXIMUM_CE_RATE_FOR_CHILD_NOT_BEING_PART_OF_HOUSEHOLD(double newMAXIMUM_CE_RATE_FOR_CHILD_NOT_BEING_PART_OF_HOUSEHOLD) {
		double oldMAXIMUM_CE_RATE_FOR_CHILD_NOT_BEING_PART_OF_HOUSEHOLD = maximuM_CE_RATE_FOR_CHILD_NOT_BEING_PART_OF_HOUSEHOLD;
		maximuM_CE_RATE_FOR_CHILD_NOT_BEING_PART_OF_HOUSEHOLD = newMAXIMUM_CE_RATE_FOR_CHILD_NOT_BEING_PART_OF_HOUSEHOLD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.CONSTANTS__MAXIMUM_CE_RATE_FOR_CHILD_NOT_BEING_PART_OF_HOUSEHOLD, oldMAXIMUM_CE_RATE_FOR_CHILD_NOT_BEING_PART_OF_HOUSEHOLD, maximuM_CE_RATE_FOR_CHILD_NOT_BEING_PART_OF_HOUSEHOLD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMAXIMUM_CE_RATE_FOR_HOUSE_CARE_AND_CHILD_PART_OF_THE_HOUSEHOLD_CARE() {
		return maximuM_CE_RATE_FOR_HOUSE_CARE_AND_CHILD_PART_OF_THE_HOUSEHOLD_CARE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMAXIMUM_CE_RATE_FOR_HOUSE_CARE_AND_CHILD_PART_OF_THE_HOUSEHOLD_CARE(double newMAXIMUM_CE_RATE_FOR_HOUSE_CARE_AND_CHILD_PART_OF_THE_HOUSEHOLD_CARE) {
		double oldMAXIMUM_CE_RATE_FOR_HOUSE_CARE_AND_CHILD_PART_OF_THE_HOUSEHOLD_CARE = maximuM_CE_RATE_FOR_HOUSE_CARE_AND_CHILD_PART_OF_THE_HOUSEHOLD_CARE;
		maximuM_CE_RATE_FOR_HOUSE_CARE_AND_CHILD_PART_OF_THE_HOUSEHOLD_CARE = newMAXIMUM_CE_RATE_FOR_HOUSE_CARE_AND_CHILD_PART_OF_THE_HOUSEHOLD_CARE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.CONSTANTS__MAXIMUM_CE_RATE_FOR_HOUSE_CARE_AND_CHILD_PART_OF_THE_HOUSEHOLD_CARE, oldMAXIMUM_CE_RATE_FOR_HOUSE_CARE_AND_CHILD_PART_OF_THE_HOUSEHOLD_CARE, maximuM_CE_RATE_FOR_HOUSE_CARE_AND_CHILD_PART_OF_THE_HOUSEHOLD_CARE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMINIMUM_SALARY() {
		return minimuM_SALARY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMINIMUM_SALARY(double newMINIMUM_SALARY) {
		double oldMINIMUM_SALARY = minimuM_SALARY;
		minimuM_SALARY = newMINIMUM_SALARY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.CONSTANTS__MINIMUM_SALARY, oldMINIMUM_SALARY, minimuM_SALARY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getFLAT_RATE_FOR_EXTRA_PROFESSIONAL_DEDUCTION() {
		return flaT_RATE_FOR_EXTRA_PROFESSIONAL_DEDUCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFLAT_RATE_FOR_EXTRA_PROFESSIONAL_DEDUCTION(double newFLAT_RATE_FOR_EXTRA_PROFESSIONAL_DEDUCTION) {
		double oldFLAT_RATE_FOR_EXTRA_PROFESSIONAL_DEDUCTION = flaT_RATE_FOR_EXTRA_PROFESSIONAL_DEDUCTION;
		flaT_RATE_FOR_EXTRA_PROFESSIONAL_DEDUCTION = newFLAT_RATE_FOR_EXTRA_PROFESSIONAL_DEDUCTION;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.CONSTANTS__FLAT_RATE_FOR_EXTRA_PROFESSIONAL_DEDUCTION, oldFLAT_RATE_FOR_EXTRA_PROFESSIONAL_DEDUCTION, flaT_RATE_FOR_EXTRA_PROFESSIONAL_DEDUCTION));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMAXIMUM_DEDUCTIBLE_PERCENTAGE_FOR_DONATIONS() {
		return maximuM_DEDUCTIBLE_PERCENTAGE_FOR_DONATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMAXIMUM_DEDUCTIBLE_PERCENTAGE_FOR_DONATIONS(double newMAXIMUM_DEDUCTIBLE_PERCENTAGE_FOR_DONATIONS) {
		double oldMAXIMUM_DEDUCTIBLE_PERCENTAGE_FOR_DONATIONS = maximuM_DEDUCTIBLE_PERCENTAGE_FOR_DONATIONS;
		maximuM_DEDUCTIBLE_PERCENTAGE_FOR_DONATIONS = newMAXIMUM_DEDUCTIBLE_PERCENTAGE_FOR_DONATIONS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.CONSTANTS__MAXIMUM_DEDUCTIBLE_PERCENTAGE_FOR_DONATIONS, oldMAXIMUM_DEDUCTIBLE_PERCENTAGE_FOR_DONATIONS, maximuM_DEDUCTIBLE_PERCENTAGE_FOR_DONATIONS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMINIMUM_DEDUCTIBLE_AMOUNT_FOR_DONATIONS() {
		return minimuM_DEDUCTIBLE_AMOUNT_FOR_DONATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMINIMUM_DEDUCTIBLE_AMOUNT_FOR_DONATIONS(double newMINIMUM_DEDUCTIBLE_AMOUNT_FOR_DONATIONS) {
		double oldMINIMUM_DEDUCTIBLE_AMOUNT_FOR_DONATIONS = minimuM_DEDUCTIBLE_AMOUNT_FOR_DONATIONS;
		minimuM_DEDUCTIBLE_AMOUNT_FOR_DONATIONS = newMINIMUM_DEDUCTIBLE_AMOUNT_FOR_DONATIONS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.CONSTANTS__MINIMUM_DEDUCTIBLE_AMOUNT_FOR_DONATIONS, oldMINIMUM_DEDUCTIBLE_AMOUNT_FOR_DONATIONS, minimuM_DEDUCTIBLE_AMOUNT_FOR_DONATIONS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANC() {
		return maximuM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANC(double newMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANC) {
		double oldMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANC = maximuM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANC;
		maximuM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANC = newMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANC;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.CONSTANTS__MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANC, oldMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANC, maximuM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANC));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ALIMONY_EXPENSE() {
		return maximuM_DEDUCTIBLE_AMOUNT_FOR_ALIMONY_EXPENSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ALIMONY_EXPENSE(double newMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ALIMONY_EXPENSE) {
		double oldMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ALIMONY_EXPENSE = maximuM_DEDUCTIBLE_AMOUNT_FOR_ALIMONY_EXPENSE;
		maximuM_DEDUCTIBLE_AMOUNT_FOR_ALIMONY_EXPENSE = newMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ALIMONY_EXPENSE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.CONSTANTS__MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ALIMONY_EXPENSE, oldMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ALIMONY_EXPENSE, maximuM_DEDUCTIBLE_AMOUNT_FOR_ALIMONY_EXPENSE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMAXIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION() {
		return maximaL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMAXIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION(double newMAXIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION) {
		double oldMAXIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION = maximaL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION;
		maximaL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION = newMAXIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.CONSTANTS__MAXIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION, oldMAXIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION, maximaL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMAXIMAL_FLAT_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION() {
		return maximaL_FLAT_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMAXIMAL_FLAT_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION(double newMAXIMAL_FLAT_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION) {
		double oldMAXIMAL_FLAT_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION = maximaL_FLAT_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION;
		maximaL_FLAT_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION = newMAXIMAL_FLAT_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.CONSTANTS__MAXIMAL_FLAT_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION, oldMAXIMAL_FLAT_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION, maximaL_FLAT_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMINIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION() {
		return minimaL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMINIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION(double newMINIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION) {
		double oldMINIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION = minimaL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION;
		minimaL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION = newMINIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.CONSTANTS__MINIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION, oldMINIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION, minimaL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getFLAT_RATE_CIM_DAILY() {
		return flaT_RATE_CIM_DAILY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFLAT_RATE_CIM_DAILY(double newFLAT_RATE_CIM_DAILY) {
		double oldFLAT_RATE_CIM_DAILY = flaT_RATE_CIM_DAILY;
		flaT_RATE_CIM_DAILY = newFLAT_RATE_CIM_DAILY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.CONSTANTS__FLAT_RATE_CIM_DAILY, oldFLAT_RATE_CIM_DAILY, flaT_RATE_CIM_DAILY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getFLAT_RATE_CIM_MONTHLY() {
		return flaT_RATE_CIM_MONTHLY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFLAT_RATE_CIM_MONTHLY(double newFLAT_RATE_CIM_MONTHLY) {
		double oldFLAT_RATE_CIM_MONTHLY = flaT_RATE_CIM_MONTHLY;
		flaT_RATE_CIM_MONTHLY = newFLAT_RATE_CIM_MONTHLY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.CONSTANTS__FLAT_RATE_CIM_MONTHLY, oldFLAT_RATE_CIM_MONTHLY, flaT_RATE_CIM_MONTHLY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getFLAT_RATE_CIM_YEARLY() {
		return flaT_RATE_CIM_YEARLY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFLAT_RATE_CIM_YEARLY(double newFLAT_RATE_CIM_YEARLY) {
		double oldFLAT_RATE_CIM_YEARLY = flaT_RATE_CIM_YEARLY;
		flaT_RATE_CIM_YEARLY = newFLAT_RATE_CIM_YEARLY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.CONSTANTS__FLAT_RATE_CIM_YEARLY, oldFLAT_RATE_CIM_YEARLY, flaT_RATE_CIM_YEARLY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getFLAT_RATE_CIP_DAILY() {
		return flaT_RATE_CIP_DAILY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFLAT_RATE_CIP_DAILY(double newFLAT_RATE_CIP_DAILY) {
		double oldFLAT_RATE_CIP_DAILY = flaT_RATE_CIP_DAILY;
		flaT_RATE_CIP_DAILY = newFLAT_RATE_CIP_DAILY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.CONSTANTS__FLAT_RATE_CIP_DAILY, oldFLAT_RATE_CIP_DAILY, flaT_RATE_CIP_DAILY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getFLAT_RATE_CIP_MONTHLY() {
		return flaT_RATE_CIP_MONTHLY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFLAT_RATE_CIP_MONTHLY(double newFLAT_RATE_CIP_MONTHLY) {
		double oldFLAT_RATE_CIP_MONTHLY = flaT_RATE_CIP_MONTHLY;
		flaT_RATE_CIP_MONTHLY = newFLAT_RATE_CIP_MONTHLY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.CONSTANTS__FLAT_RATE_CIP_MONTHLY, oldFLAT_RATE_CIP_MONTHLY, flaT_RATE_CIP_MONTHLY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getFLAT_RATE_CIP_YEARLY() {
		return flaT_RATE_CIP_YEARLY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFLAT_RATE_CIP_YEARLY(double newFLAT_RATE_CIP_YEARLY) {
		double oldFLAT_RATE_CIP_YEARLY = flaT_RATE_CIP_YEARLY;
		flaT_RATE_CIP_YEARLY = newFLAT_RATE_CIP_YEARLY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.CONSTANTS__FLAT_RATE_CIP_YEARLY, oldFLAT_RATE_CIP_YEARLY, flaT_RATE_CIP_YEARLY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getFLAT_RATE_CIS_DAILY() {
		return flaT_RATE_CIS_DAILY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFLAT_RATE_CIS_DAILY(double newFLAT_RATE_CIS_DAILY) {
		double oldFLAT_RATE_CIS_DAILY = flaT_RATE_CIS_DAILY;
		flaT_RATE_CIS_DAILY = newFLAT_RATE_CIS_DAILY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.CONSTANTS__FLAT_RATE_CIS_DAILY, oldFLAT_RATE_CIS_DAILY, flaT_RATE_CIS_DAILY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getFLAT_RATE_CIS_MONTHLY() {
		return flaT_RATE_CIS_MONTHLY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFLAT_RATE_CIS_MONTHLY(double newFLAT_RATE_CIS_MONTHLY) {
		double oldFLAT_RATE_CIS_MONTHLY = flaT_RATE_CIS_MONTHLY;
		flaT_RATE_CIS_MONTHLY = newFLAT_RATE_CIS_MONTHLY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.CONSTANTS__FLAT_RATE_CIS_MONTHLY, oldFLAT_RATE_CIS_MONTHLY, flaT_RATE_CIS_MONTHLY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getFLAT_RATE_CIS_YEARLY() {
		return flaT_RATE_CIS_YEARLY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFLAT_RATE_CIS_YEARLY(double newFLAT_RATE_CIS_YEARLY) {
		double oldFLAT_RATE_CIS_YEARLY = flaT_RATE_CIS_YEARLY;
		flaT_RATE_CIS_YEARLY = newFLAT_RATE_CIS_YEARLY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.CONSTANTS__FLAT_RATE_CIS_YEARLY, oldFLAT_RATE_CIS_YEARLY, flaT_RATE_CIS_YEARLY));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getFLAT_RATE_FOR_TRAVEL_EXPENSE_PER_UNIT() {
		return flaT_RATE_FOR_TRAVEL_EXPENSE_PER_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFLAT_RATE_FOR_TRAVEL_EXPENSE_PER_UNIT(double newFLAT_RATE_FOR_TRAVEL_EXPENSE_PER_UNIT) {
		double oldFLAT_RATE_FOR_TRAVEL_EXPENSE_PER_UNIT = flaT_RATE_FOR_TRAVEL_EXPENSE_PER_UNIT;
		flaT_RATE_FOR_TRAVEL_EXPENSE_PER_UNIT = newFLAT_RATE_FOR_TRAVEL_EXPENSE_PER_UNIT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.CONSTANTS__FLAT_RATE_FOR_TRAVEL_EXPENSE_PER_UNIT, oldFLAT_RATE_FOR_TRAVEL_EXPENSE_PER_UNIT, flaT_RATE_FOR_TRAVEL_EXPENSE_PER_UNIT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_DS() {
		return maximuM_DEDUCTIBLE_AMOUNT_FOR_DS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_DS(double newMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_DS) {
		double oldMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_DS = maximuM_DEDUCTIBLE_AMOUNT_FOR_DS;
		maximuM_DEDUCTIBLE_AMOUNT_FOR_DS = newMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_DS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.CONSTANTS__MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_DS, oldMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_DS, maximuM_DEDUCTIBLE_AMOUNT_FOR_DS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getFLAT_RATE_FOR_MISCELLANEOUS_EXPENSE() {
		return flaT_RATE_FOR_MISCELLANEOUS_EXPENSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFLAT_RATE_FOR_MISCELLANEOUS_EXPENSE(double newFLAT_RATE_FOR_MISCELLANEOUS_EXPENSE) {
		double oldFLAT_RATE_FOR_MISCELLANEOUS_EXPENSE = flaT_RATE_FOR_MISCELLANEOUS_EXPENSE;
		flaT_RATE_FOR_MISCELLANEOUS_EXPENSE = newFLAT_RATE_FOR_MISCELLANEOUS_EXPENSE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.CONSTANTS__FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE, oldFLAT_RATE_FOR_MISCELLANEOUS_EXPENSE, flaT_RATE_FOR_MISCELLANEOUS_EXPENSE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getDISABILITY_FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE() {
		return disabilitY_FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDISABILITY_FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE(double newDISABILITY_FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE) {
		double oldDISABILITY_FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE = disabilitY_FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE;
		disabilitY_FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE = newDISABILITY_FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.CONSTANTS__DISABILITY_FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE, oldDISABILITY_FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE, disabilitY_FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANCE() {
		return maximuM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANCE(double newMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANCE) {
		double oldMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANCE = maximuM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANCE;
		maximuM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANCE = newMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANCE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.CONSTANTS__MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANCE, oldMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANCE, maximuM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANCE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TaxationPackage.CONSTANTS__MAXIMUM_CE_RATE_FOR_CHILD_NOT_BEING_PART_OF_HOUSEHOLD:
				return getMAXIMUM_CE_RATE_FOR_CHILD_NOT_BEING_PART_OF_HOUSEHOLD();
			case TaxationPackage.CONSTANTS__MAXIMUM_CE_RATE_FOR_HOUSE_CARE_AND_CHILD_PART_OF_THE_HOUSEHOLD_CARE:
				return getMAXIMUM_CE_RATE_FOR_HOUSE_CARE_AND_CHILD_PART_OF_THE_HOUSEHOLD_CARE();
			case TaxationPackage.CONSTANTS__MINIMUM_SALARY:
				return getMINIMUM_SALARY();
			case TaxationPackage.CONSTANTS__FLAT_RATE_FOR_EXTRA_PROFESSIONAL_DEDUCTION:
				return getFLAT_RATE_FOR_EXTRA_PROFESSIONAL_DEDUCTION();
			case TaxationPackage.CONSTANTS__MAXIMUM_DEDUCTIBLE_PERCENTAGE_FOR_DONATIONS:
				return getMAXIMUM_DEDUCTIBLE_PERCENTAGE_FOR_DONATIONS();
			case TaxationPackage.CONSTANTS__MINIMUM_DEDUCTIBLE_AMOUNT_FOR_DONATIONS:
				return getMINIMUM_DEDUCTIBLE_AMOUNT_FOR_DONATIONS();
			case TaxationPackage.CONSTANTS__MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANC:
				return getMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANC();
			case TaxationPackage.CONSTANTS__MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ALIMONY_EXPENSE:
				return getMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ALIMONY_EXPENSE();
			case TaxationPackage.CONSTANTS__MAXIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION:
				return getMAXIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION();
			case TaxationPackage.CONSTANTS__MAXIMAL_FLAT_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION:
				return getMAXIMAL_FLAT_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION();
			case TaxationPackage.CONSTANTS__MINIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION:
				return getMINIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION();
			case TaxationPackage.CONSTANTS__FLAT_RATE_CIM_DAILY:
				return getFLAT_RATE_CIM_DAILY();
			case TaxationPackage.CONSTANTS__FLAT_RATE_CIM_MONTHLY:
				return getFLAT_RATE_CIM_MONTHLY();
			case TaxationPackage.CONSTANTS__FLAT_RATE_CIM_YEARLY:
				return getFLAT_RATE_CIM_YEARLY();
			case TaxationPackage.CONSTANTS__FLAT_RATE_CIP_DAILY:
				return getFLAT_RATE_CIP_DAILY();
			case TaxationPackage.CONSTANTS__FLAT_RATE_CIP_MONTHLY:
				return getFLAT_RATE_CIP_MONTHLY();
			case TaxationPackage.CONSTANTS__FLAT_RATE_CIP_YEARLY:
				return getFLAT_RATE_CIP_YEARLY();
			case TaxationPackage.CONSTANTS__FLAT_RATE_CIS_DAILY:
				return getFLAT_RATE_CIS_DAILY();
			case TaxationPackage.CONSTANTS__FLAT_RATE_CIS_MONTHLY:
				return getFLAT_RATE_CIS_MONTHLY();
			case TaxationPackage.CONSTANTS__FLAT_RATE_CIS_YEARLY:
				return getFLAT_RATE_CIS_YEARLY();
			case TaxationPackage.CONSTANTS__FLAT_RATE_FOR_TRAVEL_EXPENSE_PER_UNIT:
				return getFLAT_RATE_FOR_TRAVEL_EXPENSE_PER_UNIT();
			case TaxationPackage.CONSTANTS__MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_DS:
				return getMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_DS();
			case TaxationPackage.CONSTANTS__FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE:
				return getFLAT_RATE_FOR_MISCELLANEOUS_EXPENSE();
			case TaxationPackage.CONSTANTS__DISABILITY_FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE:
				return getDISABILITY_FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE();
			case TaxationPackage.CONSTANTS__MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANCE:
				return getMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANCE();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TaxationPackage.CONSTANTS__MAXIMUM_CE_RATE_FOR_CHILD_NOT_BEING_PART_OF_HOUSEHOLD:
				setMAXIMUM_CE_RATE_FOR_CHILD_NOT_BEING_PART_OF_HOUSEHOLD((Double)newValue);
				return;
			case TaxationPackage.CONSTANTS__MAXIMUM_CE_RATE_FOR_HOUSE_CARE_AND_CHILD_PART_OF_THE_HOUSEHOLD_CARE:
				setMAXIMUM_CE_RATE_FOR_HOUSE_CARE_AND_CHILD_PART_OF_THE_HOUSEHOLD_CARE((Double)newValue);
				return;
			case TaxationPackage.CONSTANTS__MINIMUM_SALARY:
				setMINIMUM_SALARY((Double)newValue);
				return;
			case TaxationPackage.CONSTANTS__FLAT_RATE_FOR_EXTRA_PROFESSIONAL_DEDUCTION:
				setFLAT_RATE_FOR_EXTRA_PROFESSIONAL_DEDUCTION((Double)newValue);
				return;
			case TaxationPackage.CONSTANTS__MAXIMUM_DEDUCTIBLE_PERCENTAGE_FOR_DONATIONS:
				setMAXIMUM_DEDUCTIBLE_PERCENTAGE_FOR_DONATIONS((Double)newValue);
				return;
			case TaxationPackage.CONSTANTS__MINIMUM_DEDUCTIBLE_AMOUNT_FOR_DONATIONS:
				setMINIMUM_DEDUCTIBLE_AMOUNT_FOR_DONATIONS((Double)newValue);
				return;
			case TaxationPackage.CONSTANTS__MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANC:
				setMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANC((Double)newValue);
				return;
			case TaxationPackage.CONSTANTS__MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ALIMONY_EXPENSE:
				setMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ALIMONY_EXPENSE((Double)newValue);
				return;
			case TaxationPackage.CONSTANTS__MAXIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION:
				setMAXIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION((Double)newValue);
				return;
			case TaxationPackage.CONSTANTS__MAXIMAL_FLAT_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION:
				setMAXIMAL_FLAT_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION((Double)newValue);
				return;
			case TaxationPackage.CONSTANTS__MINIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION:
				setMINIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION((Double)newValue);
				return;
			case TaxationPackage.CONSTANTS__FLAT_RATE_CIM_DAILY:
				setFLAT_RATE_CIM_DAILY((Double)newValue);
				return;
			case TaxationPackage.CONSTANTS__FLAT_RATE_CIM_MONTHLY:
				setFLAT_RATE_CIM_MONTHLY((Double)newValue);
				return;
			case TaxationPackage.CONSTANTS__FLAT_RATE_CIM_YEARLY:
				setFLAT_RATE_CIM_YEARLY((Double)newValue);
				return;
			case TaxationPackage.CONSTANTS__FLAT_RATE_CIP_DAILY:
				setFLAT_RATE_CIP_DAILY((Double)newValue);
				return;
			case TaxationPackage.CONSTANTS__FLAT_RATE_CIP_MONTHLY:
				setFLAT_RATE_CIP_MONTHLY((Double)newValue);
				return;
			case TaxationPackage.CONSTANTS__FLAT_RATE_CIP_YEARLY:
				setFLAT_RATE_CIP_YEARLY((Double)newValue);
				return;
			case TaxationPackage.CONSTANTS__FLAT_RATE_CIS_DAILY:
				setFLAT_RATE_CIS_DAILY((Double)newValue);
				return;
			case TaxationPackage.CONSTANTS__FLAT_RATE_CIS_MONTHLY:
				setFLAT_RATE_CIS_MONTHLY((Double)newValue);
				return;
			case TaxationPackage.CONSTANTS__FLAT_RATE_CIS_YEARLY:
				setFLAT_RATE_CIS_YEARLY((Double)newValue);
				return;
			case TaxationPackage.CONSTANTS__FLAT_RATE_FOR_TRAVEL_EXPENSE_PER_UNIT:
				setFLAT_RATE_FOR_TRAVEL_EXPENSE_PER_UNIT((Double)newValue);
				return;
			case TaxationPackage.CONSTANTS__MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_DS:
				setMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_DS((Double)newValue);
				return;
			case TaxationPackage.CONSTANTS__FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE:
				setFLAT_RATE_FOR_MISCELLANEOUS_EXPENSE((Double)newValue);
				return;
			case TaxationPackage.CONSTANTS__DISABILITY_FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE:
				setDISABILITY_FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE((Double)newValue);
				return;
			case TaxationPackage.CONSTANTS__MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANCE:
				setMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANCE((Double)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TaxationPackage.CONSTANTS__MAXIMUM_CE_RATE_FOR_CHILD_NOT_BEING_PART_OF_HOUSEHOLD:
				setMAXIMUM_CE_RATE_FOR_CHILD_NOT_BEING_PART_OF_HOUSEHOLD(MAXIMUM_CE_RATE_FOR_CHILD_NOT_BEING_PART_OF_HOUSEHOLD_EDEFAULT);
				return;
			case TaxationPackage.CONSTANTS__MAXIMUM_CE_RATE_FOR_HOUSE_CARE_AND_CHILD_PART_OF_THE_HOUSEHOLD_CARE:
				setMAXIMUM_CE_RATE_FOR_HOUSE_CARE_AND_CHILD_PART_OF_THE_HOUSEHOLD_CARE(MAXIMUM_CE_RATE_FOR_HOUSE_CARE_AND_CHILD_PART_OF_THE_HOUSEHOLD_CARE_EDEFAULT);
				return;
			case TaxationPackage.CONSTANTS__MINIMUM_SALARY:
				setMINIMUM_SALARY(MINIMUM_SALARY_EDEFAULT);
				return;
			case TaxationPackage.CONSTANTS__FLAT_RATE_FOR_EXTRA_PROFESSIONAL_DEDUCTION:
				setFLAT_RATE_FOR_EXTRA_PROFESSIONAL_DEDUCTION(FLAT_RATE_FOR_EXTRA_PROFESSIONAL_DEDUCTION_EDEFAULT);
				return;
			case TaxationPackage.CONSTANTS__MAXIMUM_DEDUCTIBLE_PERCENTAGE_FOR_DONATIONS:
				setMAXIMUM_DEDUCTIBLE_PERCENTAGE_FOR_DONATIONS(MAXIMUM_DEDUCTIBLE_PERCENTAGE_FOR_DONATIONS_EDEFAULT);
				return;
			case TaxationPackage.CONSTANTS__MINIMUM_DEDUCTIBLE_AMOUNT_FOR_DONATIONS:
				setMINIMUM_DEDUCTIBLE_AMOUNT_FOR_DONATIONS(MINIMUM_DEDUCTIBLE_AMOUNT_FOR_DONATIONS_EDEFAULT);
				return;
			case TaxationPackage.CONSTANTS__MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANC:
				setMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANC(MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANC_EDEFAULT);
				return;
			case TaxationPackage.CONSTANTS__MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ALIMONY_EXPENSE:
				setMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ALIMONY_EXPENSE(MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ALIMONY_EXPENSE_EDEFAULT);
				return;
			case TaxationPackage.CONSTANTS__MAXIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION:
				setMAXIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION(MAXIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION_EDEFAULT);
				return;
			case TaxationPackage.CONSTANTS__MAXIMAL_FLAT_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION:
				setMAXIMAL_FLAT_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION(MAXIMAL_FLAT_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION_EDEFAULT);
				return;
			case TaxationPackage.CONSTANTS__MINIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION:
				setMINIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION(MINIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION_EDEFAULT);
				return;
			case TaxationPackage.CONSTANTS__FLAT_RATE_CIM_DAILY:
				setFLAT_RATE_CIM_DAILY(FLAT_RATE_CIM_DAILY_EDEFAULT);
				return;
			case TaxationPackage.CONSTANTS__FLAT_RATE_CIM_MONTHLY:
				setFLAT_RATE_CIM_MONTHLY(FLAT_RATE_CIM_MONTHLY_EDEFAULT);
				return;
			case TaxationPackage.CONSTANTS__FLAT_RATE_CIM_YEARLY:
				setFLAT_RATE_CIM_YEARLY(FLAT_RATE_CIM_YEARLY_EDEFAULT);
				return;
			case TaxationPackage.CONSTANTS__FLAT_RATE_CIP_DAILY:
				setFLAT_RATE_CIP_DAILY(FLAT_RATE_CIP_DAILY_EDEFAULT);
				return;
			case TaxationPackage.CONSTANTS__FLAT_RATE_CIP_MONTHLY:
				setFLAT_RATE_CIP_MONTHLY(FLAT_RATE_CIP_MONTHLY_EDEFAULT);
				return;
			case TaxationPackage.CONSTANTS__FLAT_RATE_CIP_YEARLY:
				setFLAT_RATE_CIP_YEARLY(FLAT_RATE_CIP_YEARLY_EDEFAULT);
				return;
			case TaxationPackage.CONSTANTS__FLAT_RATE_CIS_DAILY:
				setFLAT_RATE_CIS_DAILY(FLAT_RATE_CIS_DAILY_EDEFAULT);
				return;
			case TaxationPackage.CONSTANTS__FLAT_RATE_CIS_MONTHLY:
				setFLAT_RATE_CIS_MONTHLY(FLAT_RATE_CIS_MONTHLY_EDEFAULT);
				return;
			case TaxationPackage.CONSTANTS__FLAT_RATE_CIS_YEARLY:
				setFLAT_RATE_CIS_YEARLY(FLAT_RATE_CIS_YEARLY_EDEFAULT);
				return;
			case TaxationPackage.CONSTANTS__FLAT_RATE_FOR_TRAVEL_EXPENSE_PER_UNIT:
				setFLAT_RATE_FOR_TRAVEL_EXPENSE_PER_UNIT(FLAT_RATE_FOR_TRAVEL_EXPENSE_PER_UNIT_EDEFAULT);
				return;
			case TaxationPackage.CONSTANTS__MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_DS:
				setMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_DS(MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_DS_EDEFAULT);
				return;
			case TaxationPackage.CONSTANTS__FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE:
				setFLAT_RATE_FOR_MISCELLANEOUS_EXPENSE(FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE_EDEFAULT);
				return;
			case TaxationPackage.CONSTANTS__DISABILITY_FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE:
				setDISABILITY_FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE(DISABILITY_FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE_EDEFAULT);
				return;
			case TaxationPackage.CONSTANTS__MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANCE:
				setMAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANCE(MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANCE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TaxationPackage.CONSTANTS__MAXIMUM_CE_RATE_FOR_CHILD_NOT_BEING_PART_OF_HOUSEHOLD:
				return maximuM_CE_RATE_FOR_CHILD_NOT_BEING_PART_OF_HOUSEHOLD != MAXIMUM_CE_RATE_FOR_CHILD_NOT_BEING_PART_OF_HOUSEHOLD_EDEFAULT;
			case TaxationPackage.CONSTANTS__MAXIMUM_CE_RATE_FOR_HOUSE_CARE_AND_CHILD_PART_OF_THE_HOUSEHOLD_CARE:
				return maximuM_CE_RATE_FOR_HOUSE_CARE_AND_CHILD_PART_OF_THE_HOUSEHOLD_CARE != MAXIMUM_CE_RATE_FOR_HOUSE_CARE_AND_CHILD_PART_OF_THE_HOUSEHOLD_CARE_EDEFAULT;
			case TaxationPackage.CONSTANTS__MINIMUM_SALARY:
				return minimuM_SALARY != MINIMUM_SALARY_EDEFAULT;
			case TaxationPackage.CONSTANTS__FLAT_RATE_FOR_EXTRA_PROFESSIONAL_DEDUCTION:
				return flaT_RATE_FOR_EXTRA_PROFESSIONAL_DEDUCTION != FLAT_RATE_FOR_EXTRA_PROFESSIONAL_DEDUCTION_EDEFAULT;
			case TaxationPackage.CONSTANTS__MAXIMUM_DEDUCTIBLE_PERCENTAGE_FOR_DONATIONS:
				return maximuM_DEDUCTIBLE_PERCENTAGE_FOR_DONATIONS != MAXIMUM_DEDUCTIBLE_PERCENTAGE_FOR_DONATIONS_EDEFAULT;
			case TaxationPackage.CONSTANTS__MINIMUM_DEDUCTIBLE_AMOUNT_FOR_DONATIONS:
				return minimuM_DEDUCTIBLE_AMOUNT_FOR_DONATIONS != MINIMUM_DEDUCTIBLE_AMOUNT_FOR_DONATIONS_EDEFAULT;
			case TaxationPackage.CONSTANTS__MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANC:
				return maximuM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANC != MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANC_EDEFAULT;
			case TaxationPackage.CONSTANTS__MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ALIMONY_EXPENSE:
				return maximuM_DEDUCTIBLE_AMOUNT_FOR_ALIMONY_EXPENSE != MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ALIMONY_EXPENSE_EDEFAULT;
			case TaxationPackage.CONSTANTS__MAXIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION:
				return maximaL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION != MAXIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION_EDEFAULT;
			case TaxationPackage.CONSTANTS__MAXIMAL_FLAT_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION:
				return maximaL_FLAT_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION != MAXIMAL_FLAT_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION_EDEFAULT;
			case TaxationPackage.CONSTANTS__MINIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION:
				return minimaL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION != MINIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION_EDEFAULT;
			case TaxationPackage.CONSTANTS__FLAT_RATE_CIM_DAILY:
				return flaT_RATE_CIM_DAILY != FLAT_RATE_CIM_DAILY_EDEFAULT;
			case TaxationPackage.CONSTANTS__FLAT_RATE_CIM_MONTHLY:
				return flaT_RATE_CIM_MONTHLY != FLAT_RATE_CIM_MONTHLY_EDEFAULT;
			case TaxationPackage.CONSTANTS__FLAT_RATE_CIM_YEARLY:
				return flaT_RATE_CIM_YEARLY != FLAT_RATE_CIM_YEARLY_EDEFAULT;
			case TaxationPackage.CONSTANTS__FLAT_RATE_CIP_DAILY:
				return flaT_RATE_CIP_DAILY != FLAT_RATE_CIP_DAILY_EDEFAULT;
			case TaxationPackage.CONSTANTS__FLAT_RATE_CIP_MONTHLY:
				return flaT_RATE_CIP_MONTHLY != FLAT_RATE_CIP_MONTHLY_EDEFAULT;
			case TaxationPackage.CONSTANTS__FLAT_RATE_CIP_YEARLY:
				return flaT_RATE_CIP_YEARLY != FLAT_RATE_CIP_YEARLY_EDEFAULT;
			case TaxationPackage.CONSTANTS__FLAT_RATE_CIS_DAILY:
				return flaT_RATE_CIS_DAILY != FLAT_RATE_CIS_DAILY_EDEFAULT;
			case TaxationPackage.CONSTANTS__FLAT_RATE_CIS_MONTHLY:
				return flaT_RATE_CIS_MONTHLY != FLAT_RATE_CIS_MONTHLY_EDEFAULT;
			case TaxationPackage.CONSTANTS__FLAT_RATE_CIS_YEARLY:
				return flaT_RATE_CIS_YEARLY != FLAT_RATE_CIS_YEARLY_EDEFAULT;
			case TaxationPackage.CONSTANTS__FLAT_RATE_FOR_TRAVEL_EXPENSE_PER_UNIT:
				return flaT_RATE_FOR_TRAVEL_EXPENSE_PER_UNIT != FLAT_RATE_FOR_TRAVEL_EXPENSE_PER_UNIT_EDEFAULT;
			case TaxationPackage.CONSTANTS__MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_DS:
				return maximuM_DEDUCTIBLE_AMOUNT_FOR_DS != MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_DS_EDEFAULT;
			case TaxationPackage.CONSTANTS__FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE:
				return flaT_RATE_FOR_MISCELLANEOUS_EXPENSE != FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE_EDEFAULT;
			case TaxationPackage.CONSTANTS__DISABILITY_FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE:
				return disabilitY_FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE != DISABILITY_FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE_EDEFAULT;
			case TaxationPackage.CONSTANTS__MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANCE:
				return maximuM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANCE != MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANCE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (MAXIMUM_CE_RATE_FOR_CHILD_NOT_BEING_PART_OF_HOUSEHOLD: ");
		result.append(maximuM_CE_RATE_FOR_CHILD_NOT_BEING_PART_OF_HOUSEHOLD);
		result.append(", MAXIMUM_CE_RATE_FOR_HOUSE_CARE_AND_CHILD_PART_OF_THE_HOUSEHOLD_CARE: ");
		result.append(maximuM_CE_RATE_FOR_HOUSE_CARE_AND_CHILD_PART_OF_THE_HOUSEHOLD_CARE);
		result.append(", MINIMUM_SALARY: ");
		result.append(minimuM_SALARY);
		result.append(", FLAT_RATE_FOR_EXTRA_PROFESSIONAL_DEDUCTION: ");
		result.append(flaT_RATE_FOR_EXTRA_PROFESSIONAL_DEDUCTION);
		result.append(", MAXIMUM_DEDUCTIBLE_PERCENTAGE_FOR_DONATIONS: ");
		result.append(maximuM_DEDUCTIBLE_PERCENTAGE_FOR_DONATIONS);
		result.append(", MINIMUM_DEDUCTIBLE_AMOUNT_FOR_DONATIONS: ");
		result.append(minimuM_DEDUCTIBLE_AMOUNT_FOR_DONATIONS);
		result.append(", MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANC: ");
		result.append(maximuM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANC);
		result.append(", MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ALIMONY_EXPENSE: ");
		result.append(maximuM_DEDUCTIBLE_AMOUNT_FOR_ALIMONY_EXPENSE);
		result.append(", MAXIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION: ");
		result.append(maximaL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION);
		result.append(", MAXIMAL_FLAT_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION: ");
		result.append(maximaL_FLAT_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION);
		result.append(", MINIMAL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION: ");
		result.append(minimaL_DISTANCE_FOR_TRAVEL_EXPENSE_DEDUCTION);
		result.append(", FLAT_RATE_CIM_DAILY: ");
		result.append(flaT_RATE_CIM_DAILY);
		result.append(", FLAT_RATE_CIM_MONTHLY: ");
		result.append(flaT_RATE_CIM_MONTHLY);
		result.append(", FLAT_RATE_CIM_YEARLY: ");
		result.append(flaT_RATE_CIM_YEARLY);
		result.append(", FLAT_RATE_CIP_DAILY: ");
		result.append(flaT_RATE_CIP_DAILY);
		result.append(", FLAT_RATE_CIP_MONTHLY: ");
		result.append(flaT_RATE_CIP_MONTHLY);
		result.append(", FLAT_RATE_CIP_YEARLY: ");
		result.append(flaT_RATE_CIP_YEARLY);
		result.append(", FLAT_RATE_CIS_DAILY: ");
		result.append(flaT_RATE_CIS_DAILY);
		result.append(", FLAT_RATE_CIS_MONTHLY: ");
		result.append(flaT_RATE_CIS_MONTHLY);
		result.append(", FLAT_RATE_CIS_YEARLY: ");
		result.append(flaT_RATE_CIS_YEARLY);
		result.append(", FLAT_RATE_FOR_TRAVEL_EXPENSE_PER_UNIT: ");
		result.append(flaT_RATE_FOR_TRAVEL_EXPENSE_PER_UNIT);
		result.append(", MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_DS: ");
		result.append(maximuM_DEDUCTIBLE_AMOUNT_FOR_DS);
		result.append(", FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE: ");
		result.append(flaT_RATE_FOR_MISCELLANEOUS_EXPENSE);
		result.append(", DISABILITY_FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE: ");
		result.append(disabilitY_FLAT_RATE_FOR_MISCELLANEOUS_EXPENSE);
		result.append(", MAXIMUM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANCE: ");
		result.append(maximuM_DEDUCTIBLE_AMOUNT_FOR_ADDITIONAL_PENSION_AND_INSURANCE);
		result.append(')');
		return result.toString();
	}

} //ConstantsImpl
