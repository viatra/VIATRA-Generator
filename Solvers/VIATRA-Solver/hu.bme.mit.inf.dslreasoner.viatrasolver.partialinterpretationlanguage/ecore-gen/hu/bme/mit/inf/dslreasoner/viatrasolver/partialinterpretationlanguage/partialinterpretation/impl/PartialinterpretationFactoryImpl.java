/**
 */
package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl;

import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.*;

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
public class PartialinterpretationFactoryImpl extends EFactoryImpl implements PartialinterpretationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PartialinterpretationFactory init() {
		try {
			PartialinterpretationFactory thePartialinterpretationFactory = (PartialinterpretationFactory)EPackage.Registry.INSTANCE.getEFactory(PartialinterpretationPackage.eNS_URI);
			if (thePartialinterpretationFactory != null) {
				return thePartialinterpretationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PartialinterpretationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartialinterpretationFactoryImpl() {
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
			case PartialinterpretationPackage.PARTIAL_INTERPRETATION: return createPartialInterpretation();
			case PartialinterpretationPackage.PARTIAL_CONSTANT_INTERPRETATION: return createPartialConstantInterpretation();
			case PartialinterpretationPackage.PARTIAL_RELATION_INTERPRETATION: return createPartialRelationInterpretation();
			case PartialinterpretationPackage.PARTIAL_FUNCTION_INTERPRETATION: return createPartialFunctionInterpretation();
			case PartialinterpretationPackage.UNARY_ELEMENT_RELATION_LINK: return createUnaryElementRelationLink();
			case PartialinterpretationPackage.BINARY_ELEMENT_RELATION_LINK: return createBinaryElementRelationLink();
			case PartialinterpretationPackage.NARY_RELATION_LINK: return createNaryRelationLink();
			case PartialinterpretationPackage.NARY_RELATION_LINK_ELEMENT: return createNaryRelationLinkElement();
			case PartialinterpretationPackage.BOOLEAN_ELEMENT: return createBooleanElement();
			case PartialinterpretationPackage.INTEGER_ELEMENT: return createIntegerElement();
			case PartialinterpretationPackage.REAL_ELEMENT: return createRealElement();
			case PartialinterpretationPackage.STRING_ELEMENT: return createStringElement();
			case PartialinterpretationPackage.SCOPE: return createScope();
			case PartialinterpretationPackage.PARTIAL_BOOLEAN_INTERPRETATION: return createPartialBooleanInterpretation();
			case PartialinterpretationPackage.PARTIAL_INTEGER_INTERPRETATION: return createPartialIntegerInterpretation();
			case PartialinterpretationPackage.PARTIAL_REAL_INTERPRETATION: return createPartialRealInterpretation();
			case PartialinterpretationPackage.PARTIAL_STRING_INTERPRETATION: return createPartialStringInterpretation();
			case PartialinterpretationPackage.PARTIAL_COMPLEX_TYPE_INTERPRETATION: return createPartialComplexTypeInterpretation();
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
	public PartialInterpretation createPartialInterpretation() {
		PartialInterpretationImpl partialInterpretation = new PartialInterpretationImpl();
		return partialInterpretation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartialConstantInterpretation createPartialConstantInterpretation() {
		PartialConstantInterpretationImpl partialConstantInterpretation = new PartialConstantInterpretationImpl();
		return partialConstantInterpretation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartialRelationInterpretation createPartialRelationInterpretation() {
		PartialRelationInterpretationImpl partialRelationInterpretation = new PartialRelationInterpretationImpl();
		return partialRelationInterpretation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartialFunctionInterpretation createPartialFunctionInterpretation() {
		PartialFunctionInterpretationImpl partialFunctionInterpretation = new PartialFunctionInterpretationImpl();
		return partialFunctionInterpretation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UnaryElementRelationLink createUnaryElementRelationLink() {
		UnaryElementRelationLinkImpl unaryElementRelationLink = new UnaryElementRelationLinkImpl();
		return unaryElementRelationLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BinaryElementRelationLink createBinaryElementRelationLink() {
		BinaryElementRelationLinkImpl binaryElementRelationLink = new BinaryElementRelationLinkImpl();
		return binaryElementRelationLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NaryRelationLink createNaryRelationLink() {
		NaryRelationLinkImpl naryRelationLink = new NaryRelationLinkImpl();
		return naryRelationLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NaryRelationLinkElement createNaryRelationLinkElement() {
		NaryRelationLinkElementImpl naryRelationLinkElement = new NaryRelationLinkElementImpl();
		return naryRelationLinkElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BooleanElement createBooleanElement() {
		BooleanElementImpl booleanElement = new BooleanElementImpl();
		return booleanElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public IntegerElement createIntegerElement() {
		IntegerElementImpl integerElement = new IntegerElementImpl();
		return integerElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RealElement createRealElement() {
		RealElementImpl realElement = new RealElementImpl();
		return realElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringElement createStringElement() {
		StringElementImpl stringElement = new StringElementImpl();
		return stringElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Scope createScope() {
		ScopeImpl scope = new ScopeImpl();
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartialBooleanInterpretation createPartialBooleanInterpretation() {
		PartialBooleanInterpretationImpl partialBooleanInterpretation = new PartialBooleanInterpretationImpl();
		return partialBooleanInterpretation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartialIntegerInterpretation createPartialIntegerInterpretation() {
		PartialIntegerInterpretationImpl partialIntegerInterpretation = new PartialIntegerInterpretationImpl();
		return partialIntegerInterpretation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartialRealInterpretation createPartialRealInterpretation() {
		PartialRealInterpretationImpl partialRealInterpretation = new PartialRealInterpretationImpl();
		return partialRealInterpretation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartialStringInterpretation createPartialStringInterpretation() {
		PartialStringInterpretationImpl partialStringInterpretation = new PartialStringInterpretationImpl();
		return partialStringInterpretation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartialComplexTypeInterpretation createPartialComplexTypeInterpretation() {
		PartialComplexTypeInterpretationImpl partialComplexTypeInterpretation = new PartialComplexTypeInterpretationImpl();
		return partialComplexTypeInterpretation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PartialinterpretationPackage getPartialinterpretationPackage() {
		return (PartialinterpretationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PartialinterpretationPackage getPackage() {
		return PartialinterpretationPackage.eINSTANCE;
	}

} //PartialinterpretationFactoryImpl
