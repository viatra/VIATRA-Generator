/**
 */
package hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.impl;

import hu.bme.mit.inf.dslreasoner.ecore2logic.ecore2logicannotations.*;

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
public class Ecore2logicannotationsFactoryImpl extends EFactoryImpl implements Ecore2logicannotationsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Ecore2logicannotationsFactory init() {
		try {
			Ecore2logicannotationsFactory theEcore2logicannotationsFactory = (Ecore2logicannotationsFactory)EPackage.Registry.INSTANCE.getEFactory(Ecore2logicannotationsPackage.eNS_URI);
			if (theEcore2logicannotationsFactory != null) {
				return theEcore2logicannotationsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Ecore2logicannotationsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ecore2logicannotationsFactoryImpl() {
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
			case Ecore2logicannotationsPackage.MULTIPLICITY_ASSERTION: return createMultiplicityAssertion();
			case Ecore2logicannotationsPackage.INVERSE_RELATION_ASSERTION: return createInverseRelationAssertion();
			case Ecore2logicannotationsPackage.LOWER_MULTIPLICITY_ASSERTION: return createLowerMultiplicityAssertion();
			case Ecore2logicannotationsPackage.UPPER_MULTIPLICITY_ASSERTION: return createUpperMultiplicityAssertion();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplicityAssertion createMultiplicityAssertion() {
		MultiplicityAssertionImpl multiplicityAssertion = new MultiplicityAssertionImpl();
		return multiplicityAssertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InverseRelationAssertion createInverseRelationAssertion() {
		InverseRelationAssertionImpl inverseRelationAssertion = new InverseRelationAssertionImpl();
		return inverseRelationAssertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LowerMultiplicityAssertion createLowerMultiplicityAssertion() {
		LowerMultiplicityAssertionImpl lowerMultiplicityAssertion = new LowerMultiplicityAssertionImpl();
		return lowerMultiplicityAssertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpperMultiplicityAssertion createUpperMultiplicityAssertion() {
		UpperMultiplicityAssertionImpl upperMultiplicityAssertion = new UpperMultiplicityAssertionImpl();
		return upperMultiplicityAssertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Ecore2logicannotationsPackage getEcore2logicannotationsPackage() {
		return (Ecore2logicannotationsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Ecore2logicannotationsPackage getPackage() {
		return Ecore2logicannotationsPackage.eINSTANCE;
	}

} //Ecore2logicannotationsFactoryImpl
