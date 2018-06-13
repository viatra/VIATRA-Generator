/**
 */
package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.util;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.SymbolicDeclaration;
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TermDescription;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationPackage
 * @generated
 */
public class PartialinterpretationAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static PartialinterpretationPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartialinterpretationAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = PartialinterpretationPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartialinterpretationSwitch<Adapter> modelSwitch =
		new PartialinterpretationSwitch<Adapter>() {
			@Override
			public Adapter casePartialInterpretation(PartialInterpretation object) {
				return createPartialInterpretationAdapter();
			}
			@Override
			public Adapter casePartialConstantInterpretation(PartialConstantInterpretation object) {
				return createPartialConstantInterpretationAdapter();
			}
			@Override
			public Adapter casePartialRelationInterpretation(PartialRelationInterpretation object) {
				return createPartialRelationInterpretationAdapter();
			}
			@Override
			public Adapter casePartialFunctionInterpretation(PartialFunctionInterpretation object) {
				return createPartialFunctionInterpretationAdapter();
			}
			@Override
			public Adapter casePartialTypeInterpratation(PartialTypeInterpratation object) {
				return createPartialTypeInterpratationAdapter();
			}
			@Override
			public Adapter caseRelationLink(RelationLink object) {
				return createRelationLinkAdapter();
			}
			@Override
			public Adapter caseUnaryElementRelationLink(UnaryElementRelationLink object) {
				return createUnaryElementRelationLinkAdapter();
			}
			@Override
			public Adapter caseBinaryElementRelationLink(BinaryElementRelationLink object) {
				return createBinaryElementRelationLinkAdapter();
			}
			@Override
			public Adapter caseNaryRelationLink(NaryRelationLink object) {
				return createNaryRelationLinkAdapter();
			}
			@Override
			public Adapter caseNaryRelationLinkElement(NaryRelationLinkElement object) {
				return createNaryRelationLinkElementAdapter();
			}
			@Override
			public Adapter casePrimitiveElement(PrimitiveElement object) {
				return createPrimitiveElementAdapter();
			}
			@Override
			public Adapter caseBooleanElement(BooleanElement object) {
				return createBooleanElementAdapter();
			}
			@Override
			public Adapter caseIntegerElement(IntegerElement object) {
				return createIntegerElementAdapter();
			}
			@Override
			public Adapter caseRealElement(RealElement object) {
				return createRealElementAdapter();
			}
			@Override
			public Adapter caseStringElement(StringElement object) {
				return createStringElementAdapter();
			}
			@Override
			public Adapter caseScope(Scope object) {
				return createScopeAdapter();
			}
			@Override
			public Adapter casePartialPrimitiveInterpretation(PartialPrimitiveInterpretation object) {
				return createPartialPrimitiveInterpretationAdapter();
			}
			@Override
			public Adapter casePartialBooleanInterpretation(PartialBooleanInterpretation object) {
				return createPartialBooleanInterpretationAdapter();
			}
			@Override
			public Adapter casePartialIntegerInterpretation(PartialIntegerInterpretation object) {
				return createPartialIntegerInterpretationAdapter();
			}
			@Override
			public Adapter casePartialRealInterpretation(PartialRealInterpretation object) {
				return createPartialRealInterpretationAdapter();
			}
			@Override
			public Adapter casePartialStringInterpretation(PartialStringInterpretation object) {
				return createPartialStringInterpretationAdapter();
			}
			@Override
			public Adapter casePartialComplexTypeInterpretation(PartialComplexTypeInterpretation object) {
				return createPartialComplexTypeInterpretationAdapter();
			}
			@Override
			public Adapter caseTermDescription(TermDescription object) {
				return createTermDescriptionAdapter();
			}
			@Override
			public Adapter caseSymbolicDeclaration(SymbolicDeclaration object) {
				return createSymbolicDeclarationAdapter();
			}
			@Override
			public Adapter caseDefinedElement(DefinedElement object) {
				return createDefinedElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation <em>Partial Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
	 * @generated
	 */
	public Adapter createPartialInterpretationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialConstantInterpretation <em>Partial Constant Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialConstantInterpretation
	 * @generated
	 */
	public Adapter createPartialConstantInterpretationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialRelationInterpretation <em>Partial Relation Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialRelationInterpretation
	 * @generated
	 */
	public Adapter createPartialRelationInterpretationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialFunctionInterpretation <em>Partial Function Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialFunctionInterpretation
	 * @generated
	 */
	public Adapter createPartialFunctionInterpretationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialTypeInterpratation <em>Partial Type Interpratation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialTypeInterpratation
	 * @generated
	 */
	public Adapter createPartialTypeInterpratationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.RelationLink <em>Relation Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.RelationLink
	 * @generated
	 */
	public Adapter createRelationLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.UnaryElementRelationLink <em>Unary Element Relation Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.UnaryElementRelationLink
	 * @generated
	 */
	public Adapter createUnaryElementRelationLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.BinaryElementRelationLink <em>Binary Element Relation Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.BinaryElementRelationLink
	 * @generated
	 */
	public Adapter createBinaryElementRelationLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.NaryRelationLink <em>Nary Relation Link</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.NaryRelationLink
	 * @generated
	 */
	public Adapter createNaryRelationLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.NaryRelationLinkElement <em>Nary Relation Link Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.NaryRelationLinkElement
	 * @generated
	 */
	public Adapter createNaryRelationLinkElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PrimitiveElement <em>Primitive Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PrimitiveElement
	 * @generated
	 */
	public Adapter createPrimitiveElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.BooleanElement <em>Boolean Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.BooleanElement
	 * @generated
	 */
	public Adapter createBooleanElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.IntegerElement <em>Integer Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.IntegerElement
	 * @generated
	 */
	public Adapter createIntegerElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.RealElement <em>Real Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.RealElement
	 * @generated
	 */
	public Adapter createRealElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.StringElement <em>String Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.StringElement
	 * @generated
	 */
	public Adapter createStringElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.Scope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.Scope
	 * @generated
	 */
	public Adapter createScopeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialPrimitiveInterpretation <em>Partial Primitive Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialPrimitiveInterpretation
	 * @generated
	 */
	public Adapter createPartialPrimitiveInterpretationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialBooleanInterpretation <em>Partial Boolean Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialBooleanInterpretation
	 * @generated
	 */
	public Adapter createPartialBooleanInterpretationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialIntegerInterpretation <em>Partial Integer Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialIntegerInterpretation
	 * @generated
	 */
	public Adapter createPartialIntegerInterpretationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialRealInterpretation <em>Partial Real Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialRealInterpretation
	 * @generated
	 */
	public Adapter createPartialRealInterpretationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialStringInterpretation <em>Partial String Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialStringInterpretation
	 * @generated
	 */
	public Adapter createPartialStringInterpretationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialComplexTypeInterpretation <em>Partial Complex Type Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialComplexTypeInterpretation
	 * @generated
	 */
	public Adapter createPartialComplexTypeInterpretationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TermDescription <em>Term Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TermDescription
	 * @generated
	 */
	public Adapter createTermDescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.SymbolicDeclaration <em>Symbolic Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.SymbolicDeclaration
	 * @generated
	 */
	public Adapter createSymbolicDeclarationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement <em>Defined Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement
	 * @generated
	 */
	public Adapter createDefinedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //PartialinterpretationAdapterFactory
