/**
 */
package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partial2logicannotations.impl;

import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partial2logicannotations.*;

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
public class Partial2logicannotationsFactoryImpl extends EFactoryImpl implements Partial2logicannotationsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Partial2logicannotationsFactory init() {
		try {
			Partial2logicannotationsFactory thePartial2logicannotationsFactory = (Partial2logicannotationsFactory)EPackage.Registry.INSTANCE.getEFactory(Partial2logicannotationsPackage.eNS_URI);
			if (thePartial2logicannotationsFactory != null) {
				return thePartial2logicannotationsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Partial2logicannotationsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Partial2logicannotationsFactoryImpl() {
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
			case Partial2logicannotationsPackage.PARTIAL_MODEL_RELATION2_ASSERTION: return createPartialModelRelation2Assertion();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartialModelRelation2Assertion createPartialModelRelation2Assertion() {
		PartialModelRelation2AssertionImpl partialModelRelation2Assertion = new PartialModelRelation2AssertionImpl();
		return partialModelRelation2Assertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Partial2logicannotationsPackage getPartial2logicannotationsPackage() {
		return (Partial2logicannotationsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Partial2logicannotationsPackage getPackage() {
		return Partial2logicannotationsPackage.eINSTANCE;
	}

} //Partial2logicannotationsFactoryImpl
