/**
 */
package hu.bme.mit.inf.smartgrid.impl;

import hu.bme.mit.inf.smartgrid.*;

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
public class SmartgridFactoryImpl extends EFactoryImpl implements SmartgridFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SmartgridFactory init() {
		try {
			SmartgridFactory theSmartgridFactory = (SmartgridFactory) EPackage.Registry.INSTANCE
					.getEFactory(SmartgridPackage.eNS_URI);
			if (theSmartgridFactory != null) {
				return theSmartgridFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SmartgridFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartgridFactoryImpl() {
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
		case SmartgridPackage.CONCENTRATOR:
			return createConcentrator();
		case SmartgridPackage.SMART_METER:
			return createSmartMeter();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Concentrator createConcentrator() {
		ConcentratorImpl concentrator = new ConcentratorImpl();
		return concentrator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartMeter createSmartMeter() {
		SmartMeterImpl smartMeter = new SmartMeterImpl();
		return smartMeter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmartgridPackage getSmartgridPackage() {
		return (SmartgridPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SmartgridPackage getPackage() {
		return SmartgridPackage.eINSTANCE;
	}

} //SmartgridFactoryImpl
