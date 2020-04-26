/**
 */
package Taxation.impl;

import Taxation.Income_Tax;
import Taxation.Tax_Payer;
import Taxation.TaxationPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Income Tax</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Taxation.impl.Income_TaxImpl#getTaxPayer <em>Tax Payer</em>}</li>
 *   <li>{@link Taxation.impl.Income_TaxImpl#getTax_amount <em>Tax amount</em>}</li>
 *   <li>{@link Taxation.impl.Income_TaxImpl#getTax_year <em>Tax year</em>}</li>
 *   <li>{@link Taxation.impl.Income_TaxImpl#getId6 <em>Id6</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Income_TaxImpl extends MinimalEObjectImpl.Container implements Income_Tax {
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
	 * The default value of the '{@link #getTax_amount() <em>Tax amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTax_amount()
	 * @generated
	 * @ordered
	 */
	protected static final double TAX_AMOUNT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTax_amount() <em>Tax amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTax_amount()
	 * @generated
	 * @ordered
	 */
	protected double tax_amount = TAX_AMOUNT_EDEFAULT;

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
	 * The default value of the '{@link #getId6() <em>Id6</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId6()
	 * @generated
	 * @ordered
	 */
	protected static final String ID6_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId6() <em>Id6</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId6()
	 * @generated
	 * @ordered
	 */
	protected String id6 = ID6_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Income_TaxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaxationPackage.Literals.INCOME_TAX;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TaxationPackage.INCOME_TAX__TAX_PAYER, oldTaxPayer, taxPayer));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.INCOME_TAX__TAX_PAYER, oldTaxPayer, taxPayer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getTax_amount() {
		return tax_amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTax_amount(double newTax_amount) {
		double oldTax_amount = tax_amount;
		tax_amount = newTax_amount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.INCOME_TAX__TAX_AMOUNT, oldTax_amount, tax_amount));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.INCOME_TAX__TAX_YEAR, oldTax_year, tax_year));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId6() {
		return id6;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId6(String newId6) {
		String oldId6 = id6;
		id6 = newId6;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.INCOME_TAX__ID6, oldId6, id6));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TaxationPackage.INCOME_TAX__TAX_PAYER:
				if (resolve) return getTaxPayer();
				return basicGetTaxPayer();
			case TaxationPackage.INCOME_TAX__TAX_AMOUNT:
				return getTax_amount();
			case TaxationPackage.INCOME_TAX__TAX_YEAR:
				return getTax_year();
			case TaxationPackage.INCOME_TAX__ID6:
				return getId6();
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
			case TaxationPackage.INCOME_TAX__TAX_PAYER:
				setTaxPayer((Tax_Payer)newValue);
				return;
			case TaxationPackage.INCOME_TAX__TAX_AMOUNT:
				setTax_amount((Double)newValue);
				return;
			case TaxationPackage.INCOME_TAX__TAX_YEAR:
				setTax_year((Integer)newValue);
				return;
			case TaxationPackage.INCOME_TAX__ID6:
				setId6((String)newValue);
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
			case TaxationPackage.INCOME_TAX__TAX_PAYER:
				setTaxPayer((Tax_Payer)null);
				return;
			case TaxationPackage.INCOME_TAX__TAX_AMOUNT:
				setTax_amount(TAX_AMOUNT_EDEFAULT);
				return;
			case TaxationPackage.INCOME_TAX__TAX_YEAR:
				setTax_year(TAX_YEAR_EDEFAULT);
				return;
			case TaxationPackage.INCOME_TAX__ID6:
				setId6(ID6_EDEFAULT);
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
			case TaxationPackage.INCOME_TAX__TAX_PAYER:
				return taxPayer != null;
			case TaxationPackage.INCOME_TAX__TAX_AMOUNT:
				return tax_amount != TAX_AMOUNT_EDEFAULT;
			case TaxationPackage.INCOME_TAX__TAX_YEAR:
				return tax_year != TAX_YEAR_EDEFAULT;
			case TaxationPackage.INCOME_TAX__ID6:
				return ID6_EDEFAULT == null ? id6 != null : !ID6_EDEFAULT.equals(id6);
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
		result.append(" (tax_amount: ");
		result.append(tax_amount);
		result.append(", tax_year: ");
		result.append(tax_year);
		result.append(", id6: ");
		result.append(id6);
		result.append(')');
		return result.toString();
	}

} //Income_TaxImpl
