/**
 */
package TaxationWithRoot.impl;

import TaxationWithRoot.Address;
import TaxationWithRoot.Country;
import TaxationWithRoot.Physical_Person;
import TaxationWithRoot.TaxationPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Address</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link TaxationWithRoot.impl.AddressImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link TaxationWithRoot.impl.AddressImpl#getStreet <em>Street</em>}</li>
 *   <li>{@link TaxationWithRoot.impl.AddressImpl#getZipCode <em>Zip Code</em>}</li>
 *   <li>{@link TaxationWithRoot.impl.AddressImpl#getCity <em>City</em>}</li>
 *   <li>{@link TaxationWithRoot.impl.AddressImpl#getId2 <em>Id2</em>}</li>
 *   <li>{@link TaxationWithRoot.impl.AddressImpl#getTaxPayer <em>Tax Payer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddressImpl extends MinimalEObjectImpl.Container implements Address {
	/**
	 * The default value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected static final Country COUNTRY_EDEFAULT = Country.ZZ;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected Country country = COUNTRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getStreet() <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreet()
	 * @generated
	 * @ordered
	 */
	protected static final String STREET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStreet() <em>Street</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStreet()
	 * @generated
	 * @ordered
	 */
	protected String street = STREET_EDEFAULT;

	/**
	 * The default value of the '{@link #getZipCode() <em>Zip Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZipCode()
	 * @generated
	 * @ordered
	 */
	protected static final String ZIP_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getZipCode() <em>Zip Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getZipCode()
	 * @generated
	 * @ordered
	 */
	protected String zipCode = ZIP_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected static final String CITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected String city = CITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getId2() <em>Id2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId2()
	 * @generated
	 * @ordered
	 */
	protected static final String ID2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId2() <em>Id2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId2()
	 * @generated
	 * @ordered
	 */
	protected String id2 = ID2_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTaxPayer() <em>Tax Payer</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxPayer()
	 * @generated
	 * @ordered
	 */
	protected EList<Physical_Person> taxPayer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TaxationPackage.Literals.ADDRESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Country getCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCountry(Country newCountry) {
		Country oldCountry = country;
		country = newCountry == null ? COUNTRY_EDEFAULT : newCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.ADDRESS__COUNTRY, oldCountry, country));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStreet() {
		return street;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStreet(String newStreet) {
		String oldStreet = street;
		street = newStreet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.ADDRESS__STREET, oldStreet, street));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setZipCode(String newZipCode) {
		String oldZipCode = zipCode;
		zipCode = newZipCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.ADDRESS__ZIP_CODE, oldZipCode, zipCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCity() {
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCity(String newCity) {
		String oldCity = city;
		city = newCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.ADDRESS__CITY, oldCity, city));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId2() {
		return id2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId2(String newId2) {
		String oldId2 = id2;
		id2 = newId2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TaxationPackage.ADDRESS__ID2, oldId2, id2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Physical_Person> getTaxPayer() {
		if (taxPayer == null) {
			taxPayer = new EObjectWithInverseResolvingEList.ManyInverse<Physical_Person>(Physical_Person.class, this, TaxationPackage.ADDRESS__TAX_PAYER, TaxationPackage.PHYSICAL_PERSON__ADDRESSES);
		}
		return taxPayer;
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
			case TaxationPackage.ADDRESS__TAX_PAYER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTaxPayer()).basicAdd(otherEnd, msgs);
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
			case TaxationPackage.ADDRESS__TAX_PAYER:
				return ((InternalEList<?>)getTaxPayer()).basicRemove(otherEnd, msgs);
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
			case TaxationPackage.ADDRESS__COUNTRY:
				return getCountry();
			case TaxationPackage.ADDRESS__STREET:
				return getStreet();
			case TaxationPackage.ADDRESS__ZIP_CODE:
				return getZipCode();
			case TaxationPackage.ADDRESS__CITY:
				return getCity();
			case TaxationPackage.ADDRESS__ID2:
				return getId2();
			case TaxationPackage.ADDRESS__TAX_PAYER:
				return getTaxPayer();
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
			case TaxationPackage.ADDRESS__COUNTRY:
				setCountry((Country)newValue);
				return;
			case TaxationPackage.ADDRESS__STREET:
				setStreet((String)newValue);
				return;
			case TaxationPackage.ADDRESS__ZIP_CODE:
				setZipCode((String)newValue);
				return;
			case TaxationPackage.ADDRESS__CITY:
				setCity((String)newValue);
				return;
			case TaxationPackage.ADDRESS__ID2:
				setId2((String)newValue);
				return;
			case TaxationPackage.ADDRESS__TAX_PAYER:
				getTaxPayer().clear();
				getTaxPayer().addAll((Collection<? extends Physical_Person>)newValue);
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
			case TaxationPackage.ADDRESS__COUNTRY:
				setCountry(COUNTRY_EDEFAULT);
				return;
			case TaxationPackage.ADDRESS__STREET:
				setStreet(STREET_EDEFAULT);
				return;
			case TaxationPackage.ADDRESS__ZIP_CODE:
				setZipCode(ZIP_CODE_EDEFAULT);
				return;
			case TaxationPackage.ADDRESS__CITY:
				setCity(CITY_EDEFAULT);
				return;
			case TaxationPackage.ADDRESS__ID2:
				setId2(ID2_EDEFAULT);
				return;
			case TaxationPackage.ADDRESS__TAX_PAYER:
				getTaxPayer().clear();
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
			case TaxationPackage.ADDRESS__COUNTRY:
				return country != COUNTRY_EDEFAULT;
			case TaxationPackage.ADDRESS__STREET:
				return STREET_EDEFAULT == null ? street != null : !STREET_EDEFAULT.equals(street);
			case TaxationPackage.ADDRESS__ZIP_CODE:
				return ZIP_CODE_EDEFAULT == null ? zipCode != null : !ZIP_CODE_EDEFAULT.equals(zipCode);
			case TaxationPackage.ADDRESS__CITY:
				return CITY_EDEFAULT == null ? city != null : !CITY_EDEFAULT.equals(city);
			case TaxationPackage.ADDRESS__ID2:
				return ID2_EDEFAULT == null ? id2 != null : !ID2_EDEFAULT.equals(id2);
			case TaxationPackage.ADDRESS__TAX_PAYER:
				return taxPayer != null && !taxPayer.isEmpty();
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
		result.append(" (country: ");
		result.append(country);
		result.append(", street: ");
		result.append(street);
		result.append(", zipCode: ");
		result.append(zipCode);
		result.append(", city: ");
		result.append(city);
		result.append(", id2: ");
		result.append(id2);
		result.append(')');
		return result.toString();
	}

} //AddressImpl
