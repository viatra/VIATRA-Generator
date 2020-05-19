/**
 */
package TaxationWithRoot.impl;

import TaxationWithRoot.Grantor;
import TaxationWithRoot.Income_Tax_Credit;
import TaxationWithRoot.Tax_Card;
import TaxationWithRoot.Tax_Payer;
import TaxationWithRoot.TaxationPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Income Tax Credit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TaxationWithRoot.impl.Income_Tax_CreditImpl#getGrantedBy <em>Granted By</em>}</li>
 *   <li>{@link TaxationWithRoot.impl.Income_Tax_CreditImpl#getTaxPayer <em>Tax Payer</em>}</li>
 *   <li>{@link TaxationWithRoot.impl.Income_Tax_CreditImpl#getTax_year <em>Tax year</em>}</li>
 *   <li>{@link TaxationWithRoot.impl.Income_Tax_CreditImpl#getYearly <em>Yearly</em>}</li>
 *   <li>{@link TaxationWithRoot.impl.Income_Tax_CreditImpl#getMonthly <em>Monthly</em>}</li>
 *   <li>{@link TaxationWithRoot.impl.Income_Tax_CreditImpl#getDaily <em>Daily</em>}</li>
 *   <li>{@link TaxationWithRoot.impl.Income_Tax_CreditImpl#getId7 <em>Id7</em>}</li>
 *   <li>{@link TaxationWithRoot.impl.Income_Tax_CreditImpl#getTaxation_Frame <em>Taxation Frame</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Income_Tax_CreditImpl extends MinimalEObjectImpl.Container implements Income_Tax_Credit {
	/**
	 * The default value of the '{@link #getGrantedBy() <em>Granted By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrantedBy()
	 * @generated
	 * @ordered
	 */
	protected static final Grantor GRANTED_BY_EDEFAULT = Grantor.WWW;

	/**
	 * The cached value of the '{@link #getGrantedBy() <em>Granted By</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrantedBy()
	 * @generated
	 * @ordered
	 */
	protected Grantor grantedBy = GRANTED_BY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTaxPayer() <em>Tax Payer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxPayer()
	 * @generated
	 * @ordered
	 */
	protected Tax_Payer taxPayer;

	/**
	 * The default value of the '{@link #getTax_year() <em>Tax year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTax_year()
	 * @generated
	 * @ordered
	 */
	protected static final int TAX_YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTax_year() <em>Tax year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTax_year()
	 * @generated
	 * @ordered
	 */
	protected int tax_year = TAX_YEAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getYearly() <em>Yearly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearly()
	 * @generated
	 * @ordered
	 */
	protected static final double YEARLY_EDEFAULT = 300.0;

	/**
	 * The cached value of the '{@link #getYearly() <em>Yearly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYearly()
	 * @generated
	 * @ordered
	 */
	protected double yearly = YEARLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMonthly() <em>Monthly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonthly()
	 * @generated
	 * @ordered
	 */
	protected static final double MONTHLY_EDEFAULT = 25.0;

	/**
	 * The cached value of the '{@link #getMonthly() <em>Monthly</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonthly()
	 * @generated
	 * @ordered
	 */
	protected double monthly = MONTHLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDaily() <em>Daily</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaily()
	 * @generated
	 * @ordered
	 */
	protected static final double DAILY_EDEFAULT = 1.0;

	/**
	 * The cached value of the '{@link #getDaily() <em>Daily</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaily()
	 * @generated
	 * @ordered
	 */
	protected double daily = DAILY_EDEFAULT;

	/**
	 * The default value of the '{@link #getId7() <em>Id7</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId7()
	 * @generated
	 * @ordered
	 */
	protected static final String ID7_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId7() <em>Id7</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId7()
	 * @generated
	 * @ordered
	 */
	protected String id7 = ID7_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTaxation_Frame() <em>Taxation Frame</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxation_Frame()
	 * @generated
	 * @ordered
	 */
	protected Tax_Card taxation_Frame;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Income_Tax_CreditImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaxationPackage.Literals.INCOME_TAX_CREDIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Grantor getGrantedBy() {
		return grantedBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGrantedBy(Grantor newGrantedBy) {
		Grantor oldGrantedBy = grantedBy;
		grantedBy = newGrantedBy == null ? GRANTED_BY_EDEFAULT : newGrantedBy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.INCOME_TAX_CREDIT__GRANTED_BY, oldGrantedBy, grantedBy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tax_Payer getTaxPayer() {
		if (taxPayer != null && taxPayer.eIsProxy()) {
			InternalEObject oldTaxPayer = (InternalEObject)taxPayer;
			taxPayer = (Tax_Payer)eResolveProxy(oldTaxPayer);
			if (taxPayer != oldTaxPayer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaxationPackage.INCOME_TAX_CREDIT__TAX_PAYER, oldTaxPayer, taxPayer));
			}
		}
		return taxPayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tax_Payer basicGetTaxPayer() {
		return taxPayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTaxPayer(Tax_Payer newTaxPayer) {
		Tax_Payer oldTaxPayer = taxPayer;
		taxPayer = newTaxPayer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.INCOME_TAX_CREDIT__TAX_PAYER, oldTaxPayer, taxPayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getTax_year() {
		return tax_year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTax_year(int newTax_year) {
		int oldTax_year = tax_year;
		tax_year = newTax_year;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.INCOME_TAX_CREDIT__TAX_YEAR, oldTax_year, tax_year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getYearly() {
		return yearly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setYearly(double newYearly) {
		double oldYearly = yearly;
		yearly = newYearly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.INCOME_TAX_CREDIT__YEARLY, oldYearly, yearly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getMonthly() {
		return monthly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMonthly(double newMonthly) {
		double oldMonthly = monthly;
		monthly = newMonthly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.INCOME_TAX_CREDIT__MONTHLY, oldMonthly, monthly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getDaily() {
		return daily;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDaily(double newDaily) {
		double oldDaily = daily;
		daily = newDaily;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.INCOME_TAX_CREDIT__DAILY, oldDaily, daily));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId7() {
		return id7;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId7(String newId7) {
		String oldId7 = id7;
		id7 = newId7;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.INCOME_TAX_CREDIT__ID7, oldId7, id7));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tax_Card getTaxation_Frame() {
		if (taxation_Frame != null && taxation_Frame.eIsProxy()) {
			InternalEObject oldTaxation_Frame = (InternalEObject)taxation_Frame;
			taxation_Frame = (Tax_Card)eResolveProxy(oldTaxation_Frame);
			if (taxation_Frame != oldTaxation_Frame) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaxationPackage.INCOME_TAX_CREDIT__TAXATION_FRAME, oldTaxation_Frame, taxation_Frame));
			}
		}
		return taxation_Frame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tax_Card basicGetTaxation_Frame() {
		return taxation_Frame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTaxation_Frame(Tax_Card newTaxation_Frame, NotificationChain msgs) {
		Tax_Card oldTaxation_Frame = taxation_Frame;
		taxation_Frame = newTaxation_Frame;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TaxationPackage.INCOME_TAX_CREDIT__TAXATION_FRAME, oldTaxation_Frame, newTaxation_Frame);
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
	public void setTaxation_Frame(Tax_Card newTaxation_Frame) {
		if (newTaxation_Frame != taxation_Frame) {
			NotificationChain msgs = null;
			if (taxation_Frame != null)
				msgs = ((InternalEObject)taxation_Frame).eInverseRemove(this, TaxationPackage.TAX_CARD__INCOME_TAX_CREDIT, Tax_Card.class, msgs);
			if (newTaxation_Frame != null)
				msgs = ((InternalEObject)newTaxation_Frame).eInverseAdd(this, TaxationPackage.TAX_CARD__INCOME_TAX_CREDIT, Tax_Card.class, msgs);
			msgs = basicSetTaxation_Frame(newTaxation_Frame, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.INCOME_TAX_CREDIT__TAXATION_FRAME, newTaxation_Frame, newTaxation_Frame));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TaxationPackage.INCOME_TAX_CREDIT__TAXATION_FRAME:
				if (taxation_Frame != null)
					msgs = ((InternalEObject)taxation_Frame).eInverseRemove(this, TaxationPackage.TAX_CARD__INCOME_TAX_CREDIT, Tax_Card.class, msgs);
				return basicSetTaxation_Frame((Tax_Card)otherEnd, msgs);
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
			case TaxationPackage.INCOME_TAX_CREDIT__TAXATION_FRAME:
				return basicSetTaxation_Frame(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TaxationPackage.INCOME_TAX_CREDIT__GRANTED_BY:
				return getGrantedBy();
			case TaxationPackage.INCOME_TAX_CREDIT__TAX_PAYER:
				if (resolve) return getTaxPayer();
				return basicGetTaxPayer();
			case TaxationPackage.INCOME_TAX_CREDIT__TAX_YEAR:
				return getTax_year();
			case TaxationPackage.INCOME_TAX_CREDIT__YEARLY:
				return getYearly();
			case TaxationPackage.INCOME_TAX_CREDIT__MONTHLY:
				return getMonthly();
			case TaxationPackage.INCOME_TAX_CREDIT__DAILY:
				return getDaily();
			case TaxationPackage.INCOME_TAX_CREDIT__ID7:
				return getId7();
			case TaxationPackage.INCOME_TAX_CREDIT__TAXATION_FRAME:
				if (resolve) return getTaxation_Frame();
				return basicGetTaxation_Frame();
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
			case TaxationPackage.INCOME_TAX_CREDIT__GRANTED_BY:
				setGrantedBy((Grantor)newValue);
				return;
			case TaxationPackage.INCOME_TAX_CREDIT__TAX_PAYER:
				setTaxPayer((Tax_Payer)newValue);
				return;
			case TaxationPackage.INCOME_TAX_CREDIT__TAX_YEAR:
				setTax_year((Integer)newValue);
				return;
			case TaxationPackage.INCOME_TAX_CREDIT__YEARLY:
				setYearly((Double)newValue);
				return;
			case TaxationPackage.INCOME_TAX_CREDIT__MONTHLY:
				setMonthly((Double)newValue);
				return;
			case TaxationPackage.INCOME_TAX_CREDIT__DAILY:
				setDaily((Double)newValue);
				return;
			case TaxationPackage.INCOME_TAX_CREDIT__ID7:
				setId7((String)newValue);
				return;
			case TaxationPackage.INCOME_TAX_CREDIT__TAXATION_FRAME:
				setTaxation_Frame((Tax_Card)newValue);
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
			case TaxationPackage.INCOME_TAX_CREDIT__GRANTED_BY:
				setGrantedBy(GRANTED_BY_EDEFAULT);
				return;
			case TaxationPackage.INCOME_TAX_CREDIT__TAX_PAYER:
				setTaxPayer((Tax_Payer)null);
				return;
			case TaxationPackage.INCOME_TAX_CREDIT__TAX_YEAR:
				setTax_year(TAX_YEAR_EDEFAULT);
				return;
			case TaxationPackage.INCOME_TAX_CREDIT__YEARLY:
				setYearly(YEARLY_EDEFAULT);
				return;
			case TaxationPackage.INCOME_TAX_CREDIT__MONTHLY:
				setMonthly(MONTHLY_EDEFAULT);
				return;
			case TaxationPackage.INCOME_TAX_CREDIT__DAILY:
				setDaily(DAILY_EDEFAULT);
				return;
			case TaxationPackage.INCOME_TAX_CREDIT__ID7:
				setId7(ID7_EDEFAULT);
				return;
			case TaxationPackage.INCOME_TAX_CREDIT__TAXATION_FRAME:
				setTaxation_Frame((Tax_Card)null);
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
			case TaxationPackage.INCOME_TAX_CREDIT__GRANTED_BY:
				return grantedBy != GRANTED_BY_EDEFAULT;
			case TaxationPackage.INCOME_TAX_CREDIT__TAX_PAYER:
				return taxPayer != null;
			case TaxationPackage.INCOME_TAX_CREDIT__TAX_YEAR:
				return tax_year != TAX_YEAR_EDEFAULT;
			case TaxationPackage.INCOME_TAX_CREDIT__YEARLY:
				return yearly != YEARLY_EDEFAULT;
			case TaxationPackage.INCOME_TAX_CREDIT__MONTHLY:
				return monthly != MONTHLY_EDEFAULT;
			case TaxationPackage.INCOME_TAX_CREDIT__DAILY:
				return daily != DAILY_EDEFAULT;
			case TaxationPackage.INCOME_TAX_CREDIT__ID7:
				return ID7_EDEFAULT == null ? id7 != null : !ID7_EDEFAULT.equals(id7);
			case TaxationPackage.INCOME_TAX_CREDIT__TAXATION_FRAME:
				return taxation_Frame != null;
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
		result.append(" (grantedBy: ");
		result.append(grantedBy);
		result.append(", tax_year: ");
		result.append(tax_year);
		result.append(", yearly: ");
		result.append(yearly);
		result.append(", monthly: ");
		result.append(monthly);
		result.append(", daily: ");
		result.append(daily);
		result.append(", id7: ");
		result.append(id7);
		result.append(')');
		return result.toString();
	}

} //Income_Tax_CreditImpl
