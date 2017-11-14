/**
 */
package logic2vampire.impl;

import logic2vampire.*;

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
public class Logic2vampireFactoryImpl extends EFactoryImpl implements Logic2vampireFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Logic2vampireFactory init() {
		try {
			Logic2vampireFactory theLogic2vampireFactory = (Logic2vampireFactory)EPackage.Registry.INSTANCE.getEFactory(Logic2vampirePackage.eNS_URI);
			if (theLogic2vampireFactory != null) {
				return theLogic2vampireFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Logic2vampireFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Logic2vampireFactoryImpl() {
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
			case Logic2vampirePackage.LOGIC2_VAMPIRE: return createLogic2Vampire();
			case Logic2vampirePackage.LOGIC2_VAMPIRE_TRACE: return createLogic2VampireTrace();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Logic2Vampire createLogic2Vampire() {
		Logic2VampireImpl logic2Vampire = new Logic2VampireImpl();
		return logic2Vampire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Logic2VampireTrace createLogic2VampireTrace() {
		Logic2VampireTraceImpl logic2VampireTrace = new Logic2VampireTraceImpl();
		return logic2VampireTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Logic2vampirePackage getLogic2vampirePackage() {
		return (Logic2vampirePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Logic2vampirePackage getPackage() {
		return Logic2vampirePackage.eINSTANCE;
	}

} //Logic2vampireFactoryImpl
