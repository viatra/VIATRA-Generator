/**
 */
package Taxation.impl;

import Taxation.Address;
import Taxation.Income;
import Taxation.Income_Tax_Credit;
import Taxation.Job_Activity;
import Taxation.Tax_Card;
import Taxation.Tax_Card_Type;
import Taxation.Tax_Office;
import Taxation.TaxationPackage;
import Taxation.Town;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tax Card</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Taxation.impl.Tax_CardImpl#getCard_identifier <em>Card identifier</em>}</li>
 *   <li>{@link Taxation.impl.Tax_CardImpl#getTax_card_type <em>Tax card type</em>}</li>
 *   <li>{@link Taxation.impl.Tax_CardImpl#getTax_office <em>Tax office</em>}</li>
 *   <li>{@link Taxation.impl.Tax_CardImpl#getValid_from_date <em>Valid from date</em>}</li>
 *   <li>{@link Taxation.impl.Tax_CardImpl#getValid_until_date <em>Valid until date</em>}</li>
 *   <li>{@link Taxation.impl.Tax_CardImpl#getPercentage_of_witholding <em>Percentage of witholding</em>}</li>
 *   <li>{@link Taxation.impl.Tax_CardImpl#getTax_payers_name_surname <em>Tax payers name surname</em>}</li>
 *   <li>{@link Taxation.impl.Tax_CardImpl#getTax_payers_partner_name_surname <em>Tax payers partner name surname</em>}</li>
 *   <li>{@link Taxation.impl.Tax_CardImpl#getTax_payers_address <em>Tax payers address</em>}</li>
 *   <li>{@link Taxation.impl.Tax_CardImpl#getJobs_Employer_SSNo <em>Jobs Employer SS No</em>}</li>
 *   <li>{@link Taxation.impl.Tax_CardImpl#getJobs_employers_name <em>Jobs employers name</em>}</li>
 *   <li>{@link Taxation.impl.Tax_CardImpl#getJobs_activity_type <em>Jobs activity type</em>}</li>
 *   <li>{@link Taxation.impl.Tax_CardImpl#getJobs_place_of_work <em>Jobs place of work</em>}</li>
 *   <li>{@link Taxation.impl.Tax_CardImpl#getDeduction_FD_daily <em>Deduction FD daily</em>}</li>
 *   <li>{@link Taxation.impl.Tax_CardImpl#getDeduction_FD_monthly <em>Deduction FD monthly</em>}</li>
 *   <li>{@link Taxation.impl.Tax_CardImpl#getDeduction_AC_daily <em>Deduction AC daily</em>}</li>
 *   <li>{@link Taxation.impl.Tax_CardImpl#getDeduction_AC_monthly <em>Deduction AC monthly</em>}</li>
 *   <li>{@link Taxation.impl.Tax_CardImpl#getDeduction_AC_yearly <em>Deduction AC yearly</em>}</li>
 *   <li>{@link Taxation.impl.Tax_CardImpl#getDeduction_CE_daily <em>Deduction CE daily</em>}</li>
 *   <li>{@link Taxation.impl.Tax_CardImpl#getDeduction_CE_monthly <em>Deduction CE monthly</em>}</li>
 *   <li>{@link Taxation.impl.Tax_CardImpl#getDeduction_CE_yearly <em>Deduction CE yearly</em>}</li>
 *   <li>{@link Taxation.impl.Tax_CardImpl#getDeduction_DS_daily <em>Deduction DS daily</em>}</li>
 *   <li>{@link Taxation.impl.Tax_CardImpl#getDeduction_DS_monthly <em>Deduction DS monthly</em>}</li>
 *   <li>{@link Taxation.impl.Tax_CardImpl#getDeduction_FO_daily <em>Deduction FO daily</em>}</li>
 *   <li>{@link Taxation.impl.Tax_CardImpl#getDeduction_FO_monthly <em>Deduction FO monthly</em>}</li>
 *   <li>{@link Taxation.impl.Tax_CardImpl#getDeduction_FO_yearly <em>Deduction FO yearly</em>}</li>
 *   <li>{@link Taxation.impl.Tax_CardImpl#getCredit_CIS_daily <em>Credit CIS daily</em>}</li>
 *   <li>{@link Taxation.impl.Tax_CardImpl#getCredit_CIS_monthly <em>Credit CIS monthly</em>}</li>
 *   <li>{@link Taxation.impl.Tax_CardImpl#getCredit_CIM_daily <em>Credit CIM daily</em>}</li>
 *   <li>{@link Taxation.impl.Tax_CardImpl#isValidity <em>Validity</em>}</li>
 *   <li>{@link Taxation.impl.Tax_CardImpl#getIncome_Tax_Credit <em>Income Tax Credit</em>}</li>
 *   <li>{@link Taxation.impl.Tax_CardImpl#getPrevious <em>Previous</em>}</li>
 *   <li>{@link Taxation.impl.Tax_CardImpl#getCurrent_tax_card <em>Current tax card</em>}</li>
 *   <li>{@link Taxation.impl.Tax_CardImpl#getCredit_CIM_yearly <em>Credit CIM yearly</em>}</li>
 *   <li>{@link Taxation.impl.Tax_CardImpl#getDeduction_DS_Alimony_yearly <em>Deduction DS Alimony yearly</em>}</li>
 *   <li>{@link Taxation.impl.Tax_CardImpl#getDeduction_DS_Debt_yearly <em>Deduction DS Debt yearly</em>}</li>
 *   <li>{@link Taxation.impl.Tax_CardImpl#getIncome <em>Income</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Tax_CardImpl extends MinimalEObjectImpl.Container implements Tax_Card {
	/**
	 * The default value of the '{@link #getCard_identifier() <em>Card identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCard_identifier()
	 * @generated
	 * @ordered
	 */
	protected static final String CARD_IDENTIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCard_identifier() <em>Card identifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCard_identifier()
	 * @generated
	 * @ordered
	 */
	protected String card_identifier = CARD_IDENTIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTax_card_type() <em>Tax card type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTax_card_type()
	 * @generated
	 * @ordered
	 */
	protected static final Tax_Card_Type TAX_CARD_TYPE_EDEFAULT = Tax_Card_Type.PRINCIPAL;

	/**
	 * The cached value of the '{@link #getTax_card_type() <em>Tax card type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTax_card_type()
	 * @generated
	 * @ordered
	 */
	protected Tax_Card_Type tax_card_type = TAX_CARD_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTax_office() <em>Tax office</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTax_office()
	 * @generated
	 * @ordered
	 */
	protected static final Tax_Office TAX_OFFICE_EDEFAULT = Tax_Office.RTS_2;

	/**
	 * The cached value of the '{@link #getTax_office() <em>Tax office</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTax_office()
	 * @generated
	 * @ordered
	 */
	protected Tax_Office tax_office = TAX_OFFICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValid_from_date() <em>Valid from date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValid_from_date()
	 * @generated
	 * @ordered
	 */
	protected static final Date VALID_FROM_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValid_from_date() <em>Valid from date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValid_from_date()
	 * @generated
	 * @ordered
	 */
	protected Date valid_from_date = VALID_FROM_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getValid_until_date() <em>Valid until date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValid_until_date()
	 * @generated
	 * @ordered
	 */
	protected static final Date VALID_UNTIL_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValid_until_date() <em>Valid until date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValid_until_date()
	 * @generated
	 * @ordered
	 */
	protected Date valid_until_date = VALID_UNTIL_DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPercentage_of_witholding() <em>Percentage of witholding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentage_of_witholding()
	 * @generated
	 * @ordered
	 */
	protected static final double PERCENTAGE_OF_WITHOLDING_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPercentage_of_witholding() <em>Percentage of witholding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentage_of_witholding()
	 * @generated
	 * @ordered
	 */
	protected double percentage_of_witholding = PERCENTAGE_OF_WITHOLDING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTax_payers_name_surname() <em>Tax payers name surname</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTax_payers_name_surname()
	 * @generated
	 * @ordered
	 */
	protected EList<String> tax_payers_name_surname;

	/**
	 * The cached value of the '{@link #getTax_payers_partner_name_surname() <em>Tax payers partner name surname</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTax_payers_partner_name_surname()
	 * @generated
	 * @ordered
	 */
	protected EList<String> tax_payers_partner_name_surname;

	/**
	 * The cached value of the '{@link #getTax_payers_address() <em>Tax payers address</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTax_payers_address()
	 * @generated
	 * @ordered
	 */
	protected Address tax_payers_address;

	/**
	 * The default value of the '{@link #getJobs_Employer_SSNo() <em>Jobs Employer SS No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobs_Employer_SSNo()
	 * @generated
	 * @ordered
	 */
	protected static final String JOBS_EMPLOYER_SS_NO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJobs_Employer_SSNo() <em>Jobs Employer SS No</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobs_Employer_SSNo()
	 * @generated
	 * @ordered
	 */
	protected String jobs_Employer_SSNo = JOBS_EMPLOYER_SS_NO_EDEFAULT;

	/**
	 * The default value of the '{@link #getJobs_employers_name() <em>Jobs employers name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobs_employers_name()
	 * @generated
	 * @ordered
	 */
	protected static final String JOBS_EMPLOYERS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJobs_employers_name() <em>Jobs employers name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobs_employers_name()
	 * @generated
	 * @ordered
	 */
	protected String jobs_employers_name = JOBS_EMPLOYERS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getJobs_activity_type() <em>Jobs activity type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobs_activity_type()
	 * @generated
	 * @ordered
	 */
	protected static final Job_Activity JOBS_ACTIVITY_TYPE_EDEFAULT = Job_Activity.SALARY;

	/**
	 * The cached value of the '{@link #getJobs_activity_type() <em>Jobs activity type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobs_activity_type()
	 * @generated
	 * @ordered
	 */
	protected Job_Activity jobs_activity_type = JOBS_ACTIVITY_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getJobs_place_of_work() <em>Jobs place of work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobs_place_of_work()
	 * @generated
	 * @ordered
	 */
	protected static final Town JOBS_PLACE_OF_WORK_EDEFAULT = Town.LL;

	/**
	 * The cached value of the '{@link #getJobs_place_of_work() <em>Jobs place of work</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobs_place_of_work()
	 * @generated
	 * @ordered
	 */
	protected Town jobs_place_of_work = JOBS_PLACE_OF_WORK_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeduction_FD_daily() <em>Deduction FD daily</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeduction_FD_daily()
	 * @generated
	 * @ordered
	 */
	protected static final double DEDUCTION_FD_DAILY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDeduction_FD_daily() <em>Deduction FD daily</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeduction_FD_daily()
	 * @generated
	 * @ordered
	 */
	protected double deduction_FD_daily = DEDUCTION_FD_DAILY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeduction_FD_monthly() <em>Deduction FD monthly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeduction_FD_monthly()
	 * @generated
	 * @ordered
	 */
	protected static final double DEDUCTION_FD_MONTHLY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDeduction_FD_monthly() <em>Deduction FD monthly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeduction_FD_monthly()
	 * @generated
	 * @ordered
	 */
	protected double deduction_FD_monthly = DEDUCTION_FD_MONTHLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeduction_AC_daily() <em>Deduction AC daily</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeduction_AC_daily()
	 * @generated
	 * @ordered
	 */
	protected static final double DEDUCTION_AC_DAILY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDeduction_AC_daily() <em>Deduction AC daily</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeduction_AC_daily()
	 * @generated
	 * @ordered
	 */
	protected double deduction_AC_daily = DEDUCTION_AC_DAILY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeduction_AC_monthly() <em>Deduction AC monthly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeduction_AC_monthly()
	 * @generated
	 * @ordered
	 */
	protected static final double DEDUCTION_AC_MONTHLY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDeduction_AC_monthly() <em>Deduction AC monthly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeduction_AC_monthly()
	 * @generated
	 * @ordered
	 */
	protected double deduction_AC_monthly = DEDUCTION_AC_MONTHLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeduction_AC_yearly() <em>Deduction AC yearly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeduction_AC_yearly()
	 * @generated
	 * @ordered
	 */
	protected static final double DEDUCTION_AC_YEARLY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDeduction_AC_yearly() <em>Deduction AC yearly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeduction_AC_yearly()
	 * @generated
	 * @ordered
	 */
	protected double deduction_AC_yearly = DEDUCTION_AC_YEARLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeduction_CE_daily() <em>Deduction CE daily</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeduction_CE_daily()
	 * @generated
	 * @ordered
	 */
	protected static final double DEDUCTION_CE_DAILY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDeduction_CE_daily() <em>Deduction CE daily</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeduction_CE_daily()
	 * @generated
	 * @ordered
	 */
	protected double deduction_CE_daily = DEDUCTION_CE_DAILY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeduction_CE_monthly() <em>Deduction CE monthly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeduction_CE_monthly()
	 * @generated
	 * @ordered
	 */
	protected static final double DEDUCTION_CE_MONTHLY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDeduction_CE_monthly() <em>Deduction CE monthly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeduction_CE_monthly()
	 * @generated
	 * @ordered
	 */
	protected double deduction_CE_monthly = DEDUCTION_CE_MONTHLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeduction_CE_yearly() <em>Deduction CE yearly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeduction_CE_yearly()
	 * @generated
	 * @ordered
	 */
	protected static final double DEDUCTION_CE_YEARLY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDeduction_CE_yearly() <em>Deduction CE yearly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeduction_CE_yearly()
	 * @generated
	 * @ordered
	 */
	protected double deduction_CE_yearly = DEDUCTION_CE_YEARLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeduction_DS_daily() <em>Deduction DS daily</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeduction_DS_daily()
	 * @generated
	 * @ordered
	 */
	protected static final double DEDUCTION_DS_DAILY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDeduction_DS_daily() <em>Deduction DS daily</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeduction_DS_daily()
	 * @generated
	 * @ordered
	 */
	protected double deduction_DS_daily = DEDUCTION_DS_DAILY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeduction_DS_monthly() <em>Deduction DS monthly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeduction_DS_monthly()
	 * @generated
	 * @ordered
	 */
	protected static final double DEDUCTION_DS_MONTHLY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDeduction_DS_monthly() <em>Deduction DS monthly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeduction_DS_monthly()
	 * @generated
	 * @ordered
	 */
	protected double deduction_DS_monthly = DEDUCTION_DS_MONTHLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeduction_FO_daily() <em>Deduction FO daily</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeduction_FO_daily()
	 * @generated
	 * @ordered
	 */
	protected static final double DEDUCTION_FO_DAILY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDeduction_FO_daily() <em>Deduction FO daily</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeduction_FO_daily()
	 * @generated
	 * @ordered
	 */
	protected double deduction_FO_daily = DEDUCTION_FO_DAILY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeduction_FO_monthly() <em>Deduction FO monthly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeduction_FO_monthly()
	 * @generated
	 * @ordered
	 */
	protected static final double DEDUCTION_FO_MONTHLY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDeduction_FO_monthly() <em>Deduction FO monthly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeduction_FO_monthly()
	 * @generated
	 * @ordered
	 */
	protected double deduction_FO_monthly = DEDUCTION_FO_MONTHLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeduction_FO_yearly() <em>Deduction FO yearly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeduction_FO_yearly()
	 * @generated
	 * @ordered
	 */
	protected static final double DEDUCTION_FO_YEARLY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDeduction_FO_yearly() <em>Deduction FO yearly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeduction_FO_yearly()
	 * @generated
	 * @ordered
	 */
	protected double deduction_FO_yearly = DEDUCTION_FO_YEARLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCredit_CIS_daily() <em>Credit CIS daily</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredit_CIS_daily()
	 * @generated
	 * @ordered
	 */
	protected static final double CREDIT_CIS_DAILY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCredit_CIS_daily() <em>Credit CIS daily</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredit_CIS_daily()
	 * @generated
	 * @ordered
	 */
	protected double credit_CIS_daily = CREDIT_CIS_DAILY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCredit_CIS_monthly() <em>Credit CIS monthly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredit_CIS_monthly()
	 * @generated
	 * @ordered
	 */
	protected static final double CREDIT_CIS_MONTHLY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCredit_CIS_monthly() <em>Credit CIS monthly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredit_CIS_monthly()
	 * @generated
	 * @ordered
	 */
	protected double credit_CIS_monthly = CREDIT_CIS_MONTHLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getCredit_CIM_daily() <em>Credit CIM daily</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredit_CIM_daily()
	 * @generated
	 * @ordered
	 */
	protected static final double CREDIT_CIM_DAILY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCredit_CIM_daily() <em>Credit CIM daily</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredit_CIM_daily()
	 * @generated
	 * @ordered
	 */
	protected double credit_CIM_daily = CREDIT_CIM_DAILY_EDEFAULT;

	/**
	 * The default value of the '{@link #isValidity() <em>Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValidity()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VALIDITY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isValidity() <em>Validity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isValidity()
	 * @generated
	 * @ordered
	 */
	protected boolean validity = VALIDITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIncome_Tax_Credit() <em>Income Tax Credit</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncome_Tax_Credit()
	 * @generated
	 * @ordered
	 */
	protected EList<Income_Tax_Credit> income_Tax_Credit;

	/**
	 * The cached value of the '{@link #getPrevious() <em>Previous</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrevious()
	 * @generated
	 * @ordered
	 */
	protected Tax_Card previous;

	/**
	 * The cached value of the '{@link #getCurrent_tax_card() <em>Current tax card</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrent_tax_card()
	 * @generated
	 * @ordered
	 */
	protected Tax_Card current_tax_card;

	/**
	 * The default value of the '{@link #getCredit_CIM_yearly() <em>Credit CIM yearly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredit_CIM_yearly()
	 * @generated
	 * @ordered
	 */
	protected static final double CREDIT_CIM_YEARLY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getCredit_CIM_yearly() <em>Credit CIM yearly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredit_CIM_yearly()
	 * @generated
	 * @ordered
	 */
	protected double credit_CIM_yearly = CREDIT_CIM_YEARLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeduction_DS_Alimony_yearly() <em>Deduction DS Alimony yearly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeduction_DS_Alimony_yearly()
	 * @generated
	 * @ordered
	 */
	protected static final double DEDUCTION_DS_ALIMONY_YEARLY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDeduction_DS_Alimony_yearly() <em>Deduction DS Alimony yearly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeduction_DS_Alimony_yearly()
	 * @generated
	 * @ordered
	 */
	protected double deduction_DS_Alimony_yearly = DEDUCTION_DS_ALIMONY_YEARLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeduction_DS_Debt_yearly() <em>Deduction DS Debt yearly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeduction_DS_Debt_yearly()
	 * @generated
	 * @ordered
	 */
	protected static final double DEDUCTION_DS_DEBT_YEARLY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDeduction_DS_Debt_yearly() <em>Deduction DS Debt yearly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeduction_DS_Debt_yearly()
	 * @generated
	 * @ordered
	 */
	protected double deduction_DS_Debt_yearly = DEDUCTION_DS_DEBT_YEARLY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Tax_CardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaxationPackage.Literals.TAX_CARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCard_identifier() {
		return card_identifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCard_identifier(String newCard_identifier) {
		String oldCard_identifier = card_identifier;
		card_identifier = newCard_identifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.TAX_CARD__CARD_IDENTIFIER, oldCard_identifier, card_identifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tax_Card_Type getTax_card_type() {
		return tax_card_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTax_card_type(Tax_Card_Type newTax_card_type) {
		Tax_Card_Type oldTax_card_type = tax_card_type;
		tax_card_type = newTax_card_type == null ? TAX_CARD_TYPE_EDEFAULT : newTax_card_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.TAX_CARD__TAX_CARD_TYPE, oldTax_card_type, tax_card_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tax_Office getTax_office() {
		return tax_office;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTax_office(Tax_Office newTax_office) {
		Tax_Office oldTax_office = tax_office;
		tax_office = newTax_office == null ? TAX_OFFICE_EDEFAULT : newTax_office;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.TAX_CARD__TAX_OFFICE, oldTax_office, tax_office));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getValid_from_date() {
		return valid_from_date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValid_from_date(Date newValid_from_date) {
		Date oldValid_from_date = valid_from_date;
		valid_from_date = newValid_from_date;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.TAX_CARD__VALID_FROM_DATE, oldValid_from_date, valid_from_date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getValid_until_date() {
		return valid_until_date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValid_until_date(Date newValid_until_date) {
		Date oldValid_until_date = valid_until_date;
		valid_until_date = newValid_until_date;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.TAX_CARD__VALID_UNTIL_DATE, oldValid_until_date, valid_until_date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getPercentage_of_witholding() {
		return percentage_of_witholding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPercentage_of_witholding(double newPercentage_of_witholding) {
		double oldPercentage_of_witholding = percentage_of_witholding;
		percentage_of_witholding = newPercentage_of_witholding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.TAX_CARD__PERCENTAGE_OF_WITHOLDING, oldPercentage_of_witholding, percentage_of_witholding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getTax_payers_name_surname() {
		if (tax_payers_name_surname == null) {
			tax_payers_name_surname = new EDataTypeUniqueEList<String>(String.class, this, TaxationPackage.TAX_CARD__TAX_PAYERS_NAME_SURNAME);
		}
		return tax_payers_name_surname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getTax_payers_partner_name_surname() {
		if (tax_payers_partner_name_surname == null) {
			tax_payers_partner_name_surname = new EDataTypeUniqueEList<String>(String.class, this, TaxationPackage.TAX_CARD__TAX_PAYERS_PARTNER_NAME_SURNAME);
		}
		return tax_payers_partner_name_surname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Address getTax_payers_address() {
		if (tax_payers_address != null && tax_payers_address.eIsProxy()) {
			InternalEObject oldTax_payers_address = (InternalEObject)tax_payers_address;
			tax_payers_address = (Address)eResolveProxy(oldTax_payers_address);
			if (tax_payers_address != oldTax_payers_address) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaxationPackage.TAX_CARD__TAX_PAYERS_ADDRESS, oldTax_payers_address, tax_payers_address));
			}
		}
		return tax_payers_address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Address basicGetTax_payers_address() {
		return tax_payers_address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTax_payers_address(Address newTax_payers_address) {
		Address oldTax_payers_address = tax_payers_address;
		tax_payers_address = newTax_payers_address;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.TAX_CARD__TAX_PAYERS_ADDRESS, oldTax_payers_address, tax_payers_address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJobs_Employer_SSNo() {
		return jobs_Employer_SSNo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobs_Employer_SSNo(String newJobs_Employer_SSNo) {
		String oldJobs_Employer_SSNo = jobs_Employer_SSNo;
		jobs_Employer_SSNo = newJobs_Employer_SSNo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.TAX_CARD__JOBS_EMPLOYER_SS_NO, oldJobs_Employer_SSNo, jobs_Employer_SSNo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getJobs_employers_name() {
		return jobs_employers_name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobs_employers_name(String newJobs_employers_name) {
		String oldJobs_employers_name = jobs_employers_name;
		jobs_employers_name = newJobs_employers_name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.TAX_CARD__JOBS_EMPLOYERS_NAME, oldJobs_employers_name, jobs_employers_name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Job_Activity getJobs_activity_type() {
		return jobs_activity_type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobs_activity_type(Job_Activity newJobs_activity_type) {
		Job_Activity oldJobs_activity_type = jobs_activity_type;
		jobs_activity_type = newJobs_activity_type == null ? JOBS_ACTIVITY_TYPE_EDEFAULT : newJobs_activity_type;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.TAX_CARD__JOBS_ACTIVITY_TYPE, oldJobs_activity_type, jobs_activity_type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Town getJobs_place_of_work() {
		return jobs_place_of_work;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobs_place_of_work(Town newJobs_place_of_work) {
		Town oldJobs_place_of_work = jobs_place_of_work;
		jobs_place_of_work = newJobs_place_of_work == null ? JOBS_PLACE_OF_WORK_EDEFAULT : newJobs_place_of_work;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.TAX_CARD__JOBS_PLACE_OF_WORK, oldJobs_place_of_work, jobs_place_of_work));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getDeduction_FD_daily() {
		return deduction_FD_daily;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeduction_FD_daily(double newDeduction_FD_daily) {
		double oldDeduction_FD_daily = deduction_FD_daily;
		deduction_FD_daily = newDeduction_FD_daily;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.TAX_CARD__DEDUCTION_FD_DAILY, oldDeduction_FD_daily, deduction_FD_daily));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getDeduction_FD_monthly() {
		return deduction_FD_monthly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeduction_FD_monthly(double newDeduction_FD_monthly) {
		double oldDeduction_FD_monthly = deduction_FD_monthly;
		deduction_FD_monthly = newDeduction_FD_monthly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.TAX_CARD__DEDUCTION_FD_MONTHLY, oldDeduction_FD_monthly, deduction_FD_monthly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getDeduction_AC_daily() {
		return deduction_AC_daily;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeduction_AC_daily(double newDeduction_AC_daily) {
		double oldDeduction_AC_daily = deduction_AC_daily;
		deduction_AC_daily = newDeduction_AC_daily;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.TAX_CARD__DEDUCTION_AC_DAILY, oldDeduction_AC_daily, deduction_AC_daily));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getDeduction_AC_monthly() {
		return deduction_AC_monthly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeduction_AC_monthly(double newDeduction_AC_monthly) {
		double oldDeduction_AC_monthly = deduction_AC_monthly;
		deduction_AC_monthly = newDeduction_AC_monthly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.TAX_CARD__DEDUCTION_AC_MONTHLY, oldDeduction_AC_monthly, deduction_AC_monthly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getDeduction_AC_yearly() {
		return deduction_AC_yearly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeduction_AC_yearly(double newDeduction_AC_yearly) {
		double oldDeduction_AC_yearly = deduction_AC_yearly;
		deduction_AC_yearly = newDeduction_AC_yearly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.TAX_CARD__DEDUCTION_AC_YEARLY, oldDeduction_AC_yearly, deduction_AC_yearly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getDeduction_CE_daily() {
		return deduction_CE_daily;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeduction_CE_daily(double newDeduction_CE_daily) {
		double oldDeduction_CE_daily = deduction_CE_daily;
		deduction_CE_daily = newDeduction_CE_daily;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.TAX_CARD__DEDUCTION_CE_DAILY, oldDeduction_CE_daily, deduction_CE_daily));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getDeduction_CE_monthly() {
		return deduction_CE_monthly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeduction_CE_monthly(double newDeduction_CE_monthly) {
		double oldDeduction_CE_monthly = deduction_CE_monthly;
		deduction_CE_monthly = newDeduction_CE_monthly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.TAX_CARD__DEDUCTION_CE_MONTHLY, oldDeduction_CE_monthly, deduction_CE_monthly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getDeduction_CE_yearly() {
		return deduction_CE_yearly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeduction_CE_yearly(double newDeduction_CE_yearly) {
		double oldDeduction_CE_yearly = deduction_CE_yearly;
		deduction_CE_yearly = newDeduction_CE_yearly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.TAX_CARD__DEDUCTION_CE_YEARLY, oldDeduction_CE_yearly, deduction_CE_yearly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getDeduction_DS_daily() {
		return deduction_DS_daily;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeduction_DS_daily(double newDeduction_DS_daily) {
		double oldDeduction_DS_daily = deduction_DS_daily;
		deduction_DS_daily = newDeduction_DS_daily;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.TAX_CARD__DEDUCTION_DS_DAILY, oldDeduction_DS_daily, deduction_DS_daily));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getDeduction_DS_monthly() {
		return deduction_DS_monthly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeduction_DS_monthly(double newDeduction_DS_monthly) {
		double oldDeduction_DS_monthly = deduction_DS_monthly;
		deduction_DS_monthly = newDeduction_DS_monthly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.TAX_CARD__DEDUCTION_DS_MONTHLY, oldDeduction_DS_monthly, deduction_DS_monthly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getDeduction_FO_daily() {
		return deduction_FO_daily;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeduction_FO_daily(double newDeduction_FO_daily) {
		double oldDeduction_FO_daily = deduction_FO_daily;
		deduction_FO_daily = newDeduction_FO_daily;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.TAX_CARD__DEDUCTION_FO_DAILY, oldDeduction_FO_daily, deduction_FO_daily));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getDeduction_FO_monthly() {
		return deduction_FO_monthly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeduction_FO_monthly(double newDeduction_FO_monthly) {
		double oldDeduction_FO_monthly = deduction_FO_monthly;
		deduction_FO_monthly = newDeduction_FO_monthly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.TAX_CARD__DEDUCTION_FO_MONTHLY, oldDeduction_FO_monthly, deduction_FO_monthly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getDeduction_FO_yearly() {
		return deduction_FO_yearly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeduction_FO_yearly(double newDeduction_FO_yearly) {
		double oldDeduction_FO_yearly = deduction_FO_yearly;
		deduction_FO_yearly = newDeduction_FO_yearly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.TAX_CARD__DEDUCTION_FO_YEARLY, oldDeduction_FO_yearly, deduction_FO_yearly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCredit_CIS_daily() {
		return credit_CIS_daily;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCredit_CIS_daily(double newCredit_CIS_daily) {
		double oldCredit_CIS_daily = credit_CIS_daily;
		credit_CIS_daily = newCredit_CIS_daily;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.TAX_CARD__CREDIT_CIS_DAILY, oldCredit_CIS_daily, credit_CIS_daily));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCredit_CIS_monthly() {
		return credit_CIS_monthly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCredit_CIS_monthly(double newCredit_CIS_monthly) {
		double oldCredit_CIS_monthly = credit_CIS_monthly;
		credit_CIS_monthly = newCredit_CIS_monthly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.TAX_CARD__CREDIT_CIS_MONTHLY, oldCredit_CIS_monthly, credit_CIS_monthly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCredit_CIM_daily() {
		return credit_CIM_daily;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCredit_CIM_daily(double newCredit_CIM_daily) {
		double oldCredit_CIM_daily = credit_CIM_daily;
		credit_CIM_daily = newCredit_CIM_daily;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.TAX_CARD__CREDIT_CIM_DAILY, oldCredit_CIM_daily, credit_CIM_daily));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isValidity() {
		return validity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValidity(boolean newValidity) {
		boolean oldValidity = validity;
		validity = newValidity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.TAX_CARD__VALIDITY, oldValidity, validity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Income_Tax_Credit> getIncome_Tax_Credit() {
		if (income_Tax_Credit == null) {
			income_Tax_Credit = new EObjectWithInverseResolvingEList<Income_Tax_Credit>(Income_Tax_Credit.class, this, TaxationPackage.TAX_CARD__INCOME_TAX_CREDIT, TaxationPackage.INCOME_TAX_CREDIT__TAXATION_FRAME);
		}
		return income_Tax_Credit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tax_Card getPrevious() {
		if (previous != null && previous.eIsProxy()) {
			InternalEObject oldPrevious = (InternalEObject)previous;
			previous = (Tax_Card)eResolveProxy(oldPrevious);
			if (previous != oldPrevious) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaxationPackage.TAX_CARD__PREVIOUS, oldPrevious, previous));
			}
		}
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tax_Card basicGetPrevious() {
		return previous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrevious(Tax_Card newPrevious, NotificationChain msgs) {
		Tax_Card oldPrevious = previous;
		previous = newPrevious;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TaxationPackage.TAX_CARD__PREVIOUS, oldPrevious, newPrevious);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrevious(Tax_Card newPrevious) {
		if (newPrevious != previous) {
			NotificationChain msgs = null;
			if (previous != null)
				msgs = ((InternalEObject)previous).eInverseRemove(this, TaxationPackage.TAX_CARD__CURRENT_TAX_CARD, Tax_Card.class, msgs);
			if (newPrevious != null)
				msgs = ((InternalEObject)newPrevious).eInverseAdd(this, TaxationPackage.TAX_CARD__CURRENT_TAX_CARD, Tax_Card.class, msgs);
			msgs = basicSetPrevious(newPrevious, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.TAX_CARD__PREVIOUS, newPrevious, newPrevious));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tax_Card getCurrent_tax_card() {
		if (current_tax_card != null && current_tax_card.eIsProxy()) {
			InternalEObject oldCurrent_tax_card = (InternalEObject)current_tax_card;
			current_tax_card = (Tax_Card)eResolveProxy(oldCurrent_tax_card);
			if (current_tax_card != oldCurrent_tax_card) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaxationPackage.TAX_CARD__CURRENT_TAX_CARD, oldCurrent_tax_card, current_tax_card));
			}
		}
		return current_tax_card;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tax_Card basicGetCurrent_tax_card() {
		return current_tax_card;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCurrent_tax_card(Tax_Card newCurrent_tax_card, NotificationChain msgs) {
		Tax_Card oldCurrent_tax_card = current_tax_card;
		current_tax_card = newCurrent_tax_card;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TaxationPackage.TAX_CARD__CURRENT_TAX_CARD, oldCurrent_tax_card, newCurrent_tax_card);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurrent_tax_card(Tax_Card newCurrent_tax_card) {
		if (newCurrent_tax_card != current_tax_card) {
			NotificationChain msgs = null;
			if (current_tax_card != null)
				msgs = ((InternalEObject)current_tax_card).eInverseRemove(this, TaxationPackage.TAX_CARD__PREVIOUS, Tax_Card.class, msgs);
			if (newCurrent_tax_card != null)
				msgs = ((InternalEObject)newCurrent_tax_card).eInverseAdd(this, TaxationPackage.TAX_CARD__PREVIOUS, Tax_Card.class, msgs);
			msgs = basicSetCurrent_tax_card(newCurrent_tax_card, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.TAX_CARD__CURRENT_TAX_CARD, newCurrent_tax_card, newCurrent_tax_card));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getCredit_CIM_yearly() {
		return credit_CIM_yearly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCredit_CIM_yearly(double newCredit_CIM_yearly) {
		double oldCredit_CIM_yearly = credit_CIM_yearly;
		credit_CIM_yearly = newCredit_CIM_yearly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.TAX_CARD__CREDIT_CIM_YEARLY, oldCredit_CIM_yearly, credit_CIM_yearly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getDeduction_DS_Alimony_yearly() {
		return deduction_DS_Alimony_yearly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeduction_DS_Alimony_yearly(double newDeduction_DS_Alimony_yearly) {
		double oldDeduction_DS_Alimony_yearly = deduction_DS_Alimony_yearly;
		deduction_DS_Alimony_yearly = newDeduction_DS_Alimony_yearly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.TAX_CARD__DEDUCTION_DS_ALIMONY_YEARLY, oldDeduction_DS_Alimony_yearly, deduction_DS_Alimony_yearly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getDeduction_DS_Debt_yearly() {
		return deduction_DS_Debt_yearly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeduction_DS_Debt_yearly(double newDeduction_DS_Debt_yearly) {
		double oldDeduction_DS_Debt_yearly = deduction_DS_Debt_yearly;
		deduction_DS_Debt_yearly = newDeduction_DS_Debt_yearly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.TAX_CARD__DEDUCTION_DS_DEBT_YEARLY, oldDeduction_DS_Debt_yearly, deduction_DS_Debt_yearly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Income getIncome() {
		if (eContainerFeatureID() != TaxationPackage.TAX_CARD__INCOME) return null;
		return (Income)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncome(Income newIncome, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newIncome, TaxationPackage.TAX_CARD__INCOME, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIncome(Income newIncome) {
		if (newIncome != eInternalContainer() || (eContainerFeatureID() != TaxationPackage.TAX_CARD__INCOME && newIncome != null)) {
			if (EcoreUtil.isAncestor(this, newIncome))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newIncome != null)
				msgs = ((InternalEObject)newIncome).eInverseAdd(this, TaxationPackage.INCOME__TAX_CARD, Income.class, msgs);
			msgs = basicSetIncome(newIncome, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.TAX_CARD__INCOME, newIncome, newIncome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TaxationPackage.TAX_CARD__INCOME_TAX_CREDIT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncome_Tax_Credit()).basicAdd(otherEnd, msgs);
			case TaxationPackage.TAX_CARD__PREVIOUS:
				if (previous != null)
					msgs = ((InternalEObject)previous).eInverseRemove(this, TaxationPackage.TAX_CARD__CURRENT_TAX_CARD, Tax_Card.class, msgs);
				return basicSetPrevious((Tax_Card)otherEnd, msgs);
			case TaxationPackage.TAX_CARD__CURRENT_TAX_CARD:
				if (current_tax_card != null)
					msgs = ((InternalEObject)current_tax_card).eInverseRemove(this, TaxationPackage.TAX_CARD__PREVIOUS, Tax_Card.class, msgs);
				return basicSetCurrent_tax_card((Tax_Card)otherEnd, msgs);
			case TaxationPackage.TAX_CARD__INCOME:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetIncome((Income)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TaxationPackage.TAX_CARD__INCOME_TAX_CREDIT:
				return ((InternalEList<?>)getIncome_Tax_Credit()).basicRemove(otherEnd, msgs);
			case TaxationPackage.TAX_CARD__PREVIOUS:
				return basicSetPrevious(null, msgs);
			case TaxationPackage.TAX_CARD__CURRENT_TAX_CARD:
				return basicSetCurrent_tax_card(null, msgs);
			case TaxationPackage.TAX_CARD__INCOME:
				return basicSetIncome(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case TaxationPackage.TAX_CARD__INCOME:
				return eInternalContainer().eInverseRemove(this, TaxationPackage.INCOME__TAX_CARD, Income.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TaxationPackage.TAX_CARD__CARD_IDENTIFIER:
				return getCard_identifier();
			case TaxationPackage.TAX_CARD__TAX_CARD_TYPE:
				return getTax_card_type();
			case TaxationPackage.TAX_CARD__TAX_OFFICE:
				return getTax_office();
			case TaxationPackage.TAX_CARD__VALID_FROM_DATE:
				return getValid_from_date();
			case TaxationPackage.TAX_CARD__VALID_UNTIL_DATE:
				return getValid_until_date();
			case TaxationPackage.TAX_CARD__PERCENTAGE_OF_WITHOLDING:
				return getPercentage_of_witholding();
			case TaxationPackage.TAX_CARD__TAX_PAYERS_NAME_SURNAME:
				return getTax_payers_name_surname();
			case TaxationPackage.TAX_CARD__TAX_PAYERS_PARTNER_NAME_SURNAME:
				return getTax_payers_partner_name_surname();
			case TaxationPackage.TAX_CARD__TAX_PAYERS_ADDRESS:
				if (resolve) return getTax_payers_address();
				return basicGetTax_payers_address();
			case TaxationPackage.TAX_CARD__JOBS_EMPLOYER_SS_NO:
				return getJobs_Employer_SSNo();
			case TaxationPackage.TAX_CARD__JOBS_EMPLOYERS_NAME:
				return getJobs_employers_name();
			case TaxationPackage.TAX_CARD__JOBS_ACTIVITY_TYPE:
				return getJobs_activity_type();
			case TaxationPackage.TAX_CARD__JOBS_PLACE_OF_WORK:
				return getJobs_place_of_work();
			case TaxationPackage.TAX_CARD__DEDUCTION_FD_DAILY:
				return getDeduction_FD_daily();
			case TaxationPackage.TAX_CARD__DEDUCTION_FD_MONTHLY:
				return getDeduction_FD_monthly();
			case TaxationPackage.TAX_CARD__DEDUCTION_AC_DAILY:
				return getDeduction_AC_daily();
			case TaxationPackage.TAX_CARD__DEDUCTION_AC_MONTHLY:
				return getDeduction_AC_monthly();
			case TaxationPackage.TAX_CARD__DEDUCTION_AC_YEARLY:
				return getDeduction_AC_yearly();
			case TaxationPackage.TAX_CARD__DEDUCTION_CE_DAILY:
				return getDeduction_CE_daily();
			case TaxationPackage.TAX_CARD__DEDUCTION_CE_MONTHLY:
				return getDeduction_CE_monthly();
			case TaxationPackage.TAX_CARD__DEDUCTION_CE_YEARLY:
				return getDeduction_CE_yearly();
			case TaxationPackage.TAX_CARD__DEDUCTION_DS_DAILY:
				return getDeduction_DS_daily();
			case TaxationPackage.TAX_CARD__DEDUCTION_DS_MONTHLY:
				return getDeduction_DS_monthly();
			case TaxationPackage.TAX_CARD__DEDUCTION_FO_DAILY:
				return getDeduction_FO_daily();
			case TaxationPackage.TAX_CARD__DEDUCTION_FO_MONTHLY:
				return getDeduction_FO_monthly();
			case TaxationPackage.TAX_CARD__DEDUCTION_FO_YEARLY:
				return getDeduction_FO_yearly();
			case TaxationPackage.TAX_CARD__CREDIT_CIS_DAILY:
				return getCredit_CIS_daily();
			case TaxationPackage.TAX_CARD__CREDIT_CIS_MONTHLY:
				return getCredit_CIS_monthly();
			case TaxationPackage.TAX_CARD__CREDIT_CIM_DAILY:
				return getCredit_CIM_daily();
			case TaxationPackage.TAX_CARD__VALIDITY:
				return isValidity();
			case TaxationPackage.TAX_CARD__INCOME_TAX_CREDIT:
				return getIncome_Tax_Credit();
			case TaxationPackage.TAX_CARD__PREVIOUS:
				if (resolve) return getPrevious();
				return basicGetPrevious();
			case TaxationPackage.TAX_CARD__CURRENT_TAX_CARD:
				if (resolve) return getCurrent_tax_card();
				return basicGetCurrent_tax_card();
			case TaxationPackage.TAX_CARD__CREDIT_CIM_YEARLY:
				return getCredit_CIM_yearly();
			case TaxationPackage.TAX_CARD__DEDUCTION_DS_ALIMONY_YEARLY:
				return getDeduction_DS_Alimony_yearly();
			case TaxationPackage.TAX_CARD__DEDUCTION_DS_DEBT_YEARLY:
				return getDeduction_DS_Debt_yearly();
			case TaxationPackage.TAX_CARD__INCOME:
				return getIncome();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TaxationPackage.TAX_CARD__CARD_IDENTIFIER:
				setCard_identifier((String)newValue);
				return;
			case TaxationPackage.TAX_CARD__TAX_CARD_TYPE:
				setTax_card_type((Tax_Card_Type)newValue);
				return;
			case TaxationPackage.TAX_CARD__TAX_OFFICE:
				setTax_office((Tax_Office)newValue);
				return;
			case TaxationPackage.TAX_CARD__VALID_FROM_DATE:
				setValid_from_date((Date)newValue);
				return;
			case TaxationPackage.TAX_CARD__VALID_UNTIL_DATE:
				setValid_until_date((Date)newValue);
				return;
			case TaxationPackage.TAX_CARD__PERCENTAGE_OF_WITHOLDING:
				setPercentage_of_witholding((Double)newValue);
				return;
			case TaxationPackage.TAX_CARD__TAX_PAYERS_NAME_SURNAME:
				getTax_payers_name_surname().clear();
				getTax_payers_name_surname().addAll((Collection<? extends String>)newValue);
				return;
			case TaxationPackage.TAX_CARD__TAX_PAYERS_PARTNER_NAME_SURNAME:
				getTax_payers_partner_name_surname().clear();
				getTax_payers_partner_name_surname().addAll((Collection<? extends String>)newValue);
				return;
			case TaxationPackage.TAX_CARD__TAX_PAYERS_ADDRESS:
				setTax_payers_address((Address)newValue);
				return;
			case TaxationPackage.TAX_CARD__JOBS_EMPLOYER_SS_NO:
				setJobs_Employer_SSNo((String)newValue);
				return;
			case TaxationPackage.TAX_CARD__JOBS_EMPLOYERS_NAME:
				setJobs_employers_name((String)newValue);
				return;
			case TaxationPackage.TAX_CARD__JOBS_ACTIVITY_TYPE:
				setJobs_activity_type((Job_Activity)newValue);
				return;
			case TaxationPackage.TAX_CARD__JOBS_PLACE_OF_WORK:
				setJobs_place_of_work((Town)newValue);
				return;
			case TaxationPackage.TAX_CARD__DEDUCTION_FD_DAILY:
				setDeduction_FD_daily((Double)newValue);
				return;
			case TaxationPackage.TAX_CARD__DEDUCTION_FD_MONTHLY:
				setDeduction_FD_monthly((Double)newValue);
				return;
			case TaxationPackage.TAX_CARD__DEDUCTION_AC_DAILY:
				setDeduction_AC_daily((Double)newValue);
				return;
			case TaxationPackage.TAX_CARD__DEDUCTION_AC_MONTHLY:
				setDeduction_AC_monthly((Double)newValue);
				return;
			case TaxationPackage.TAX_CARD__DEDUCTION_AC_YEARLY:
				setDeduction_AC_yearly((Double)newValue);
				return;
			case TaxationPackage.TAX_CARD__DEDUCTION_CE_DAILY:
				setDeduction_CE_daily((Double)newValue);
				return;
			case TaxationPackage.TAX_CARD__DEDUCTION_CE_MONTHLY:
				setDeduction_CE_monthly((Double)newValue);
				return;
			case TaxationPackage.TAX_CARD__DEDUCTION_CE_YEARLY:
				setDeduction_CE_yearly((Double)newValue);
				return;
			case TaxationPackage.TAX_CARD__DEDUCTION_DS_DAILY:
				setDeduction_DS_daily((Double)newValue);
				return;
			case TaxationPackage.TAX_CARD__DEDUCTION_DS_MONTHLY:
				setDeduction_DS_monthly((Double)newValue);
				return;
			case TaxationPackage.TAX_CARD__DEDUCTION_FO_DAILY:
				setDeduction_FO_daily((Double)newValue);
				return;
			case TaxationPackage.TAX_CARD__DEDUCTION_FO_MONTHLY:
				setDeduction_FO_monthly((Double)newValue);
				return;
			case TaxationPackage.TAX_CARD__DEDUCTION_FO_YEARLY:
				setDeduction_FO_yearly((Double)newValue);
				return;
			case TaxationPackage.TAX_CARD__CREDIT_CIS_DAILY:
				setCredit_CIS_daily((Double)newValue);
				return;
			case TaxationPackage.TAX_CARD__CREDIT_CIS_MONTHLY:
				setCredit_CIS_monthly((Double)newValue);
				return;
			case TaxationPackage.TAX_CARD__CREDIT_CIM_DAILY:
				setCredit_CIM_daily((Double)newValue);
				return;
			case TaxationPackage.TAX_CARD__VALIDITY:
				setValidity((Boolean)newValue);
				return;
			case TaxationPackage.TAX_CARD__INCOME_TAX_CREDIT:
				getIncome_Tax_Credit().clear();
				getIncome_Tax_Credit().addAll((Collection<? extends Income_Tax_Credit>)newValue);
				return;
			case TaxationPackage.TAX_CARD__PREVIOUS:
				setPrevious((Tax_Card)newValue);
				return;
			case TaxationPackage.TAX_CARD__CURRENT_TAX_CARD:
				setCurrent_tax_card((Tax_Card)newValue);
				return;
			case TaxationPackage.TAX_CARD__CREDIT_CIM_YEARLY:
				setCredit_CIM_yearly((Double)newValue);
				return;
			case TaxationPackage.TAX_CARD__DEDUCTION_DS_ALIMONY_YEARLY:
				setDeduction_DS_Alimony_yearly((Double)newValue);
				return;
			case TaxationPackage.TAX_CARD__DEDUCTION_DS_DEBT_YEARLY:
				setDeduction_DS_Debt_yearly((Double)newValue);
				return;
			case TaxationPackage.TAX_CARD__INCOME:
				setIncome((Income)newValue);
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
			case TaxationPackage.TAX_CARD__CARD_IDENTIFIER:
				setCard_identifier(CARD_IDENTIFIER_EDEFAULT);
				return;
			case TaxationPackage.TAX_CARD__TAX_CARD_TYPE:
				setTax_card_type(TAX_CARD_TYPE_EDEFAULT);
				return;
			case TaxationPackage.TAX_CARD__TAX_OFFICE:
				setTax_office(TAX_OFFICE_EDEFAULT);
				return;
			case TaxationPackage.TAX_CARD__VALID_FROM_DATE:
				setValid_from_date(VALID_FROM_DATE_EDEFAULT);
				return;
			case TaxationPackage.TAX_CARD__VALID_UNTIL_DATE:
				setValid_until_date(VALID_UNTIL_DATE_EDEFAULT);
				return;
			case TaxationPackage.TAX_CARD__PERCENTAGE_OF_WITHOLDING:
				setPercentage_of_witholding(PERCENTAGE_OF_WITHOLDING_EDEFAULT);
				return;
			case TaxationPackage.TAX_CARD__TAX_PAYERS_NAME_SURNAME:
				getTax_payers_name_surname().clear();
				return;
			case TaxationPackage.TAX_CARD__TAX_PAYERS_PARTNER_NAME_SURNAME:
				getTax_payers_partner_name_surname().clear();
				return;
			case TaxationPackage.TAX_CARD__TAX_PAYERS_ADDRESS:
				setTax_payers_address((Address)null);
				return;
			case TaxationPackage.TAX_CARD__JOBS_EMPLOYER_SS_NO:
				setJobs_Employer_SSNo(JOBS_EMPLOYER_SS_NO_EDEFAULT);
				return;
			case TaxationPackage.TAX_CARD__JOBS_EMPLOYERS_NAME:
				setJobs_employers_name(JOBS_EMPLOYERS_NAME_EDEFAULT);
				return;
			case TaxationPackage.TAX_CARD__JOBS_ACTIVITY_TYPE:
				setJobs_activity_type(JOBS_ACTIVITY_TYPE_EDEFAULT);
				return;
			case TaxationPackage.TAX_CARD__JOBS_PLACE_OF_WORK:
				setJobs_place_of_work(JOBS_PLACE_OF_WORK_EDEFAULT);
				return;
			case TaxationPackage.TAX_CARD__DEDUCTION_FD_DAILY:
				setDeduction_FD_daily(DEDUCTION_FD_DAILY_EDEFAULT);
				return;
			case TaxationPackage.TAX_CARD__DEDUCTION_FD_MONTHLY:
				setDeduction_FD_monthly(DEDUCTION_FD_MONTHLY_EDEFAULT);
				return;
			case TaxationPackage.TAX_CARD__DEDUCTION_AC_DAILY:
				setDeduction_AC_daily(DEDUCTION_AC_DAILY_EDEFAULT);
				return;
			case TaxationPackage.TAX_CARD__DEDUCTION_AC_MONTHLY:
				setDeduction_AC_monthly(DEDUCTION_AC_MONTHLY_EDEFAULT);
				return;
			case TaxationPackage.TAX_CARD__DEDUCTION_AC_YEARLY:
				setDeduction_AC_yearly(DEDUCTION_AC_YEARLY_EDEFAULT);
				return;
			case TaxationPackage.TAX_CARD__DEDUCTION_CE_DAILY:
				setDeduction_CE_daily(DEDUCTION_CE_DAILY_EDEFAULT);
				return;
			case TaxationPackage.TAX_CARD__DEDUCTION_CE_MONTHLY:
				setDeduction_CE_monthly(DEDUCTION_CE_MONTHLY_EDEFAULT);
				return;
			case TaxationPackage.TAX_CARD__DEDUCTION_CE_YEARLY:
				setDeduction_CE_yearly(DEDUCTION_CE_YEARLY_EDEFAULT);
				return;
			case TaxationPackage.TAX_CARD__DEDUCTION_DS_DAILY:
				setDeduction_DS_daily(DEDUCTION_DS_DAILY_EDEFAULT);
				return;
			case TaxationPackage.TAX_CARD__DEDUCTION_DS_MONTHLY:
				setDeduction_DS_monthly(DEDUCTION_DS_MONTHLY_EDEFAULT);
				return;
			case TaxationPackage.TAX_CARD__DEDUCTION_FO_DAILY:
				setDeduction_FO_daily(DEDUCTION_FO_DAILY_EDEFAULT);
				return;
			case TaxationPackage.TAX_CARD__DEDUCTION_FO_MONTHLY:
				setDeduction_FO_monthly(DEDUCTION_FO_MONTHLY_EDEFAULT);
				return;
			case TaxationPackage.TAX_CARD__DEDUCTION_FO_YEARLY:
				setDeduction_FO_yearly(DEDUCTION_FO_YEARLY_EDEFAULT);
				return;
			case TaxationPackage.TAX_CARD__CREDIT_CIS_DAILY:
				setCredit_CIS_daily(CREDIT_CIS_DAILY_EDEFAULT);
				return;
			case TaxationPackage.TAX_CARD__CREDIT_CIS_MONTHLY:
				setCredit_CIS_monthly(CREDIT_CIS_MONTHLY_EDEFAULT);
				return;
			case TaxationPackage.TAX_CARD__CREDIT_CIM_DAILY:
				setCredit_CIM_daily(CREDIT_CIM_DAILY_EDEFAULT);
				return;
			case TaxationPackage.TAX_CARD__VALIDITY:
				setValidity(VALIDITY_EDEFAULT);
				return;
			case TaxationPackage.TAX_CARD__INCOME_TAX_CREDIT:
				getIncome_Tax_Credit().clear();
				return;
			case TaxationPackage.TAX_CARD__PREVIOUS:
				setPrevious((Tax_Card)null);
				return;
			case TaxationPackage.TAX_CARD__CURRENT_TAX_CARD:
				setCurrent_tax_card((Tax_Card)null);
				return;
			case TaxationPackage.TAX_CARD__CREDIT_CIM_YEARLY:
				setCredit_CIM_yearly(CREDIT_CIM_YEARLY_EDEFAULT);
				return;
			case TaxationPackage.TAX_CARD__DEDUCTION_DS_ALIMONY_YEARLY:
				setDeduction_DS_Alimony_yearly(DEDUCTION_DS_ALIMONY_YEARLY_EDEFAULT);
				return;
			case TaxationPackage.TAX_CARD__DEDUCTION_DS_DEBT_YEARLY:
				setDeduction_DS_Debt_yearly(DEDUCTION_DS_DEBT_YEARLY_EDEFAULT);
				return;
			case TaxationPackage.TAX_CARD__INCOME:
				setIncome((Income)null);
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
			case TaxationPackage.TAX_CARD__CARD_IDENTIFIER:
				return CARD_IDENTIFIER_EDEFAULT == null ? card_identifier != null : !CARD_IDENTIFIER_EDEFAULT.equals(card_identifier);
			case TaxationPackage.TAX_CARD__TAX_CARD_TYPE:
				return tax_card_type != TAX_CARD_TYPE_EDEFAULT;
			case TaxationPackage.TAX_CARD__TAX_OFFICE:
				return tax_office != TAX_OFFICE_EDEFAULT;
			case TaxationPackage.TAX_CARD__VALID_FROM_DATE:
				return VALID_FROM_DATE_EDEFAULT == null ? valid_from_date != null : !VALID_FROM_DATE_EDEFAULT.equals(valid_from_date);
			case TaxationPackage.TAX_CARD__VALID_UNTIL_DATE:
				return VALID_UNTIL_DATE_EDEFAULT == null ? valid_until_date != null : !VALID_UNTIL_DATE_EDEFAULT.equals(valid_until_date);
			case TaxationPackage.TAX_CARD__PERCENTAGE_OF_WITHOLDING:
				return percentage_of_witholding != PERCENTAGE_OF_WITHOLDING_EDEFAULT;
			case TaxationPackage.TAX_CARD__TAX_PAYERS_NAME_SURNAME:
				return tax_payers_name_surname != null && !tax_payers_name_surname.isEmpty();
			case TaxationPackage.TAX_CARD__TAX_PAYERS_PARTNER_NAME_SURNAME:
				return tax_payers_partner_name_surname != null && !tax_payers_partner_name_surname.isEmpty();
			case TaxationPackage.TAX_CARD__TAX_PAYERS_ADDRESS:
				return tax_payers_address != null;
			case TaxationPackage.TAX_CARD__JOBS_EMPLOYER_SS_NO:
				return JOBS_EMPLOYER_SS_NO_EDEFAULT == null ? jobs_Employer_SSNo != null : !JOBS_EMPLOYER_SS_NO_EDEFAULT.equals(jobs_Employer_SSNo);
			case TaxationPackage.TAX_CARD__JOBS_EMPLOYERS_NAME:
				return JOBS_EMPLOYERS_NAME_EDEFAULT == null ? jobs_employers_name != null : !JOBS_EMPLOYERS_NAME_EDEFAULT.equals(jobs_employers_name);
			case TaxationPackage.TAX_CARD__JOBS_ACTIVITY_TYPE:
				return jobs_activity_type != JOBS_ACTIVITY_TYPE_EDEFAULT;
			case TaxationPackage.TAX_CARD__JOBS_PLACE_OF_WORK:
				return jobs_place_of_work != JOBS_PLACE_OF_WORK_EDEFAULT;
			case TaxationPackage.TAX_CARD__DEDUCTION_FD_DAILY:
				return deduction_FD_daily != DEDUCTION_FD_DAILY_EDEFAULT;
			case TaxationPackage.TAX_CARD__DEDUCTION_FD_MONTHLY:
				return deduction_FD_monthly != DEDUCTION_FD_MONTHLY_EDEFAULT;
			case TaxationPackage.TAX_CARD__DEDUCTION_AC_DAILY:
				return deduction_AC_daily != DEDUCTION_AC_DAILY_EDEFAULT;
			case TaxationPackage.TAX_CARD__DEDUCTION_AC_MONTHLY:
				return deduction_AC_monthly != DEDUCTION_AC_MONTHLY_EDEFAULT;
			case TaxationPackage.TAX_CARD__DEDUCTION_AC_YEARLY:
				return deduction_AC_yearly != DEDUCTION_AC_YEARLY_EDEFAULT;
			case TaxationPackage.TAX_CARD__DEDUCTION_CE_DAILY:
				return deduction_CE_daily != DEDUCTION_CE_DAILY_EDEFAULT;
			case TaxationPackage.TAX_CARD__DEDUCTION_CE_MONTHLY:
				return deduction_CE_monthly != DEDUCTION_CE_MONTHLY_EDEFAULT;
			case TaxationPackage.TAX_CARD__DEDUCTION_CE_YEARLY:
				return deduction_CE_yearly != DEDUCTION_CE_YEARLY_EDEFAULT;
			case TaxationPackage.TAX_CARD__DEDUCTION_DS_DAILY:
				return deduction_DS_daily != DEDUCTION_DS_DAILY_EDEFAULT;
			case TaxationPackage.TAX_CARD__DEDUCTION_DS_MONTHLY:
				return deduction_DS_monthly != DEDUCTION_DS_MONTHLY_EDEFAULT;
			case TaxationPackage.TAX_CARD__DEDUCTION_FO_DAILY:
				return deduction_FO_daily != DEDUCTION_FO_DAILY_EDEFAULT;
			case TaxationPackage.TAX_CARD__DEDUCTION_FO_MONTHLY:
				return deduction_FO_monthly != DEDUCTION_FO_MONTHLY_EDEFAULT;
			case TaxationPackage.TAX_CARD__DEDUCTION_FO_YEARLY:
				return deduction_FO_yearly != DEDUCTION_FO_YEARLY_EDEFAULT;
			case TaxationPackage.TAX_CARD__CREDIT_CIS_DAILY:
				return credit_CIS_daily != CREDIT_CIS_DAILY_EDEFAULT;
			case TaxationPackage.TAX_CARD__CREDIT_CIS_MONTHLY:
				return credit_CIS_monthly != CREDIT_CIS_MONTHLY_EDEFAULT;
			case TaxationPackage.TAX_CARD__CREDIT_CIM_DAILY:
				return credit_CIM_daily != CREDIT_CIM_DAILY_EDEFAULT;
			case TaxationPackage.TAX_CARD__VALIDITY:
				return validity != VALIDITY_EDEFAULT;
			case TaxationPackage.TAX_CARD__INCOME_TAX_CREDIT:
				return income_Tax_Credit != null && !income_Tax_Credit.isEmpty();
			case TaxationPackage.TAX_CARD__PREVIOUS:
				return previous != null;
			case TaxationPackage.TAX_CARD__CURRENT_TAX_CARD:
				return current_tax_card != null;
			case TaxationPackage.TAX_CARD__CREDIT_CIM_YEARLY:
				return credit_CIM_yearly != CREDIT_CIM_YEARLY_EDEFAULT;
			case TaxationPackage.TAX_CARD__DEDUCTION_DS_ALIMONY_YEARLY:
				return deduction_DS_Alimony_yearly != DEDUCTION_DS_ALIMONY_YEARLY_EDEFAULT;
			case TaxationPackage.TAX_CARD__DEDUCTION_DS_DEBT_YEARLY:
				return deduction_DS_Debt_yearly != DEDUCTION_DS_DEBT_YEARLY_EDEFAULT;
			case TaxationPackage.TAX_CARD__INCOME:
				return getIncome() != null;
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
		result.append(" (card_identifier: ");
		result.append(card_identifier);
		result.append(", tax_card_type: ");
		result.append(tax_card_type);
		result.append(", tax_office: ");
		result.append(tax_office);
		result.append(", valid_from_date: ");
		result.append(valid_from_date);
		result.append(", valid_until_date: ");
		result.append(valid_until_date);
		result.append(", percentage_of_witholding: ");
		result.append(percentage_of_witholding);
		result.append(", tax_payers_name_surname: ");
		result.append(tax_payers_name_surname);
		result.append(", tax_payers_partner_name_surname: ");
		result.append(tax_payers_partner_name_surname);
		result.append(", jobs_Employer_SSNo: ");
		result.append(jobs_Employer_SSNo);
		result.append(", jobs_employers_name: ");
		result.append(jobs_employers_name);
		result.append(", jobs_activity_type: ");
		result.append(jobs_activity_type);
		result.append(", jobs_place_of_work: ");
		result.append(jobs_place_of_work);
		result.append(", deduction_FD_daily: ");
		result.append(deduction_FD_daily);
		result.append(", deduction_FD_monthly: ");
		result.append(deduction_FD_monthly);
		result.append(", deduction_AC_daily: ");
		result.append(deduction_AC_daily);
		result.append(", deduction_AC_monthly: ");
		result.append(deduction_AC_monthly);
		result.append(", deduction_AC_yearly: ");
		result.append(deduction_AC_yearly);
		result.append(", deduction_CE_daily: ");
		result.append(deduction_CE_daily);
		result.append(", deduction_CE_monthly: ");
		result.append(deduction_CE_monthly);
		result.append(", deduction_CE_yearly: ");
		result.append(deduction_CE_yearly);
		result.append(", deduction_DS_daily: ");
		result.append(deduction_DS_daily);
		result.append(", deduction_DS_monthly: ");
		result.append(deduction_DS_monthly);
		result.append(", deduction_FO_daily: ");
		result.append(deduction_FO_daily);
		result.append(", deduction_FO_monthly: ");
		result.append(deduction_FO_monthly);
		result.append(", deduction_FO_yearly: ");
		result.append(deduction_FO_yearly);
		result.append(", credit_CIS_daily: ");
		result.append(credit_CIS_daily);
		result.append(", credit_CIS_monthly: ");
		result.append(credit_CIS_monthly);
		result.append(", credit_CIM_daily: ");
		result.append(credit_CIM_daily);
		result.append(", validity: ");
		result.append(validity);
		result.append(", credit_CIM_yearly: ");
		result.append(credit_CIM_yearly);
		result.append(", deduction_DS_Alimony_yearly: ");
		result.append(deduction_DS_Alimony_yearly);
		result.append(", deduction_DS_Debt_yearly: ");
		result.append(deduction_DS_Debt_yearly);
		result.append(')');
		return result.toString();
	}

} //Tax_CardImpl
