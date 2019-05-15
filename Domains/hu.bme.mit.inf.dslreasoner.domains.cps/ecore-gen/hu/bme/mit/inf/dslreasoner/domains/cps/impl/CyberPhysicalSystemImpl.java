/**
 */
package hu.bme.mit.inf.dslreasoner.domains.cps.impl;

import hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationInstance;
import hu.bme.mit.inf.dslreasoner.domains.cps.ApplicationType;
import hu.bme.mit.inf.dslreasoner.domains.cps.CpsPackage;
import hu.bme.mit.inf.dslreasoner.domains.cps.CyberPhysicalSystem;
import hu.bme.mit.inf.dslreasoner.domains.cps.HostInstance;
import hu.bme.mit.inf.dslreasoner.domains.cps.HostType;
import hu.bme.mit.inf.dslreasoner.domains.cps.Request;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cyber Physical System</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.cps.impl.CyberPhysicalSystemImpl#getRequests <em>Requests</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.cps.impl.CyberPhysicalSystemImpl#getApplicationTypes <em>Application Types</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.cps.impl.CyberPhysicalSystemImpl#getHostTypes <em>Host Types</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.cps.impl.CyberPhysicalSystemImpl#getHosts <em>Hosts</em>}</li>
 *   <li>{@link hu.bme.mit.inf.dslreasoner.domains.cps.impl.CyberPhysicalSystemImpl#getApplications <em>Applications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CyberPhysicalSystemImpl extends MinimalEObjectImpl.Container implements CyberPhysicalSystem {
	/**
	 * The cached value of the '{@link #getRequests() <em>Requests</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequests()
	 * @generated
	 * @ordered
	 */
	protected EList<Request> requests;

	/**
	 * The cached value of the '{@link #getApplicationTypes() <em>Application Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ApplicationType> applicationTypes;

	/**
	 * The cached value of the '{@link #getHostTypes() <em>Host Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<HostType> hostTypes;

	/**
	 * The cached setting delegate for the '{@link #getHosts() <em>Hosts</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHosts()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate HOSTS__ESETTING_DELEGATE = ((EStructuralFeature.Internal) CpsPackage.Literals.CYBER_PHYSICAL_SYSTEM__HOSTS)
			.getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getApplications() <em>Applications</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplications()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate APPLICATIONS__ESETTING_DELEGATE = ((EStructuralFeature.Internal) CpsPackage.Literals.CYBER_PHYSICAL_SYSTEM__APPLICATIONS)
			.getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CyberPhysicalSystemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CpsPackage.Literals.CYBER_PHYSICAL_SYSTEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Request> getRequests() {
		if (requests == null) {
			requests = new EObjectContainmentEList<Request>(Request.class, this,
					CpsPackage.CYBER_PHYSICAL_SYSTEM__REQUESTS);
		}
		return requests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ApplicationType> getApplicationTypes() {
		if (applicationTypes == null) {
			applicationTypes = new EObjectContainmentEList<ApplicationType>(ApplicationType.class, this,
					CpsPackage.CYBER_PHYSICAL_SYSTEM__APPLICATION_TYPES);
		}
		return applicationTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<HostType> getHostTypes() {
		if (hostTypes == null) {
			hostTypes = new EObjectContainmentEList<HostType>(HostType.class, this,
					CpsPackage.CYBER_PHYSICAL_SYSTEM__HOST_TYPES);
		}
		return hostTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<HostInstance> getHosts() {
		return (EList<HostInstance>) HOSTS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ApplicationInstance> getApplications() {
		return (EList<ApplicationInstance>) APPLICATIONS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case CpsPackage.CYBER_PHYSICAL_SYSTEM__REQUESTS:
			return ((InternalEList<?>) getRequests()).basicRemove(otherEnd, msgs);
		case CpsPackage.CYBER_PHYSICAL_SYSTEM__APPLICATION_TYPES:
			return ((InternalEList<?>) getApplicationTypes()).basicRemove(otherEnd, msgs);
		case CpsPackage.CYBER_PHYSICAL_SYSTEM__HOST_TYPES:
			return ((InternalEList<?>) getHostTypes()).basicRemove(otherEnd, msgs);
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
		case CpsPackage.CYBER_PHYSICAL_SYSTEM__REQUESTS:
			return getRequests();
		case CpsPackage.CYBER_PHYSICAL_SYSTEM__APPLICATION_TYPES:
			return getApplicationTypes();
		case CpsPackage.CYBER_PHYSICAL_SYSTEM__HOST_TYPES:
			return getHostTypes();
		case CpsPackage.CYBER_PHYSICAL_SYSTEM__HOSTS:
			return getHosts();
		case CpsPackage.CYBER_PHYSICAL_SYSTEM__APPLICATIONS:
			return getApplications();
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
		case CpsPackage.CYBER_PHYSICAL_SYSTEM__REQUESTS:
			getRequests().clear();
			getRequests().addAll((Collection<? extends Request>) newValue);
			return;
		case CpsPackage.CYBER_PHYSICAL_SYSTEM__APPLICATION_TYPES:
			getApplicationTypes().clear();
			getApplicationTypes().addAll((Collection<? extends ApplicationType>) newValue);
			return;
		case CpsPackage.CYBER_PHYSICAL_SYSTEM__HOST_TYPES:
			getHostTypes().clear();
			getHostTypes().addAll((Collection<? extends HostType>) newValue);
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
		case CpsPackage.CYBER_PHYSICAL_SYSTEM__REQUESTS:
			getRequests().clear();
			return;
		case CpsPackage.CYBER_PHYSICAL_SYSTEM__APPLICATION_TYPES:
			getApplicationTypes().clear();
			return;
		case CpsPackage.CYBER_PHYSICAL_SYSTEM__HOST_TYPES:
			getHostTypes().clear();
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
		case CpsPackage.CYBER_PHYSICAL_SYSTEM__REQUESTS:
			return requests != null && !requests.isEmpty();
		case CpsPackage.CYBER_PHYSICAL_SYSTEM__APPLICATION_TYPES:
			return applicationTypes != null && !applicationTypes.isEmpty();
		case CpsPackage.CYBER_PHYSICAL_SYSTEM__HOST_TYPES:
			return hostTypes != null && !hostTypes.isEmpty();
		case CpsPackage.CYBER_PHYSICAL_SYSTEM__HOSTS:
			return HOSTS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		case CpsPackage.CYBER_PHYSICAL_SYSTEM__APPLICATIONS:
			return APPLICATIONS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

} //CyberPhysicalSystemImpl
