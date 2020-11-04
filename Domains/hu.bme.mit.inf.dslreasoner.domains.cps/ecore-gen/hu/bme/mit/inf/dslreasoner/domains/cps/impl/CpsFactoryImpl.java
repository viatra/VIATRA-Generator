/**
 */
package hu.bme.mit.inf.dslreasoner.domains.cps.impl;

import hu.bme.mit.inf.dslreasoner.domains.cps.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CpsFactoryImpl extends EFactoryImpl implements CpsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CpsFactory init() {
		try {
			CpsFactory theCpsFactory = (CpsFactory) EPackage.Registry.INSTANCE.getEFactory(CpsPackage.eNS_URI);
			if (theCpsFactory != null) {
				return theCpsFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CpsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CpsFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case CpsPackage.CYBER_PHYSICAL_SYSTEM:
			return createCyberPhysicalSystem();
		case CpsPackage.APPLICATION_TYPE:
			return createApplicationType();
		case CpsPackage.HOST_TYPE:
			return createHostType();
		case CpsPackage.REQUEST:
			return createRequest();
		case CpsPackage.REQUIREMENT:
			return createRequirement();
		case CpsPackage.APPLICATION_INSTANCE:
			return createApplicationInstance();
		case CpsPackage.RESOURCE_REQUIREMENT:
			return createResourceRequirement();
		case CpsPackage.HOST_INSTANCE:
			return createHostInstance();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CyberPhysicalSystem createCyberPhysicalSystem() {
		CyberPhysicalSystemImpl cyberPhysicalSystem = new CyberPhysicalSystemImpl();
		return cyberPhysicalSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApplicationType createApplicationType() {
		ApplicationTypeImpl applicationType = new ApplicationTypeImpl();
		return applicationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HostType createHostType() {
		HostTypeImpl hostType = new HostTypeImpl();
		return hostType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Request createRequest() {
		RequestImpl request = new RequestImpl();
		return request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Requirement createRequirement() {
		RequirementImpl requirement = new RequirementImpl();
		return requirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ApplicationInstance createApplicationInstance() {
		ApplicationInstanceImpl applicationInstance = new ApplicationInstanceImpl();
		return applicationInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceRequirement createResourceRequirement() {
		ResourceRequirementImpl resourceRequirement = new ResourceRequirementImpl();
		return resourceRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public HostInstance createHostInstance() {
		HostInstanceImpl hostInstance = new HostInstanceImpl();
		return hostInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CpsPackage getCpsPackage() {
		return (CpsPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CpsPackage getPackage() {
		return CpsPackage.eINSTANCE;
	}

} //CpsFactoryImpl
