/**
 */
package hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.impl;

import hu.bme.mit.inf.dslreasoner.viatra2logic.viatra2logicannotations.*;

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
public class Viatra2LogicAnnotationsFactoryImpl extends EFactoryImpl implements Viatra2LogicAnnotationsFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Viatra2LogicAnnotationsFactory init() {
		try {
			Viatra2LogicAnnotationsFactory theViatra2LogicAnnotationsFactory = (Viatra2LogicAnnotationsFactory)EPackage.Registry.INSTANCE.getEFactory(Viatra2LogicAnnotationsPackage.eNS_URI);
			if (theViatra2LogicAnnotationsFactory != null) {
				return theViatra2LogicAnnotationsFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Viatra2LogicAnnotationsFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Viatra2LogicAnnotationsFactoryImpl() {
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
			case Viatra2LogicAnnotationsPackage.TRANSFOMED_VIATRA_QUERY: return createTransfomedViatraQuery();
			case Viatra2LogicAnnotationsPackage.TRANSFORMED_VIATRA_WELLFORMEDNESS_CONSTRAINT: return createTransformedViatraWellformednessConstraint();
			case Viatra2LogicAnnotationsPackage.DEFINED_BY_DERIVED_FEATURE: return createDefinedByDerivedFeature();
			case Viatra2LogicAnnotationsPackage.VARIABLE_MAPPING: return createVariableMapping();
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
	public TransfomedViatraQuery createTransfomedViatraQuery() {
		TransfomedViatraQueryImpl transfomedViatraQuery = new TransfomedViatraQueryImpl();
		return transfomedViatraQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TransformedViatraWellformednessConstraint createTransformedViatraWellformednessConstraint() {
		TransformedViatraWellformednessConstraintImpl transformedViatraWellformednessConstraint = new TransformedViatraWellformednessConstraintImpl();
		return transformedViatraWellformednessConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefinedByDerivedFeature createDefinedByDerivedFeature() {
		DefinedByDerivedFeatureImpl definedByDerivedFeature = new DefinedByDerivedFeatureImpl();
		return definedByDerivedFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VariableMapping createVariableMapping() {
		VariableMappingImpl variableMapping = new VariableMappingImpl();
		return variableMapping;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Viatra2LogicAnnotationsPackage getViatra2LogicAnnotationsPackage() {
		return (Viatra2LogicAnnotationsPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Viatra2LogicAnnotationsPackage getPackage() {
		return Viatra2LogicAnnotationsPackage.eINSTANCE;
	}

} //Viatra2LogicAnnotationsFactoryImpl
