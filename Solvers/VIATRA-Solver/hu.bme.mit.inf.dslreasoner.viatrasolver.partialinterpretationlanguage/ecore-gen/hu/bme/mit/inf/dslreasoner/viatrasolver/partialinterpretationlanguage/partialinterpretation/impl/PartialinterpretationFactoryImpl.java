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
			case PartialinterpretationPackage.PARTIAL_TYPE_INTERPRATATION: return createPartialTypeInterpratation();
			case PartialinterpretationPackage.UNARY_ELEMENT_RELATION_LINK: return createUnaryElementRelationLink();
			case PartialinterpretationPackage.BINARY_ELEMENT_RELATION_LINK: return createBinaryElementRelationLink();
			case PartialinterpretationPackage.NARY_RELATION_LINK: return createNaryRelationLink();
			case PartialinterpretationPackage.NARY_RELATION_LINK_ELEMENT: return createNaryRelationLinkElement();
			case PartialinterpretationPackage.BOOLEAN_ELEMENT: return createBooleanElement();
			case PartialinterpretationPackage.INTEGER_ELEMENT: return createIntegerElement();
			case PartialinterpretationPackage.REAL_ELEMENT: return createRealElement();
			case PartialinterpretationPackage.STRING_ELEMENT: return createStringElement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartialInterpretation createPartialInterpretation() {
		PartialInterpretationImpl partialInterpretation = new PartialInterpretationImpl();
		return partialInterpretation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartialConstantInterpretation createPartialConstantInterpretation() {
		PartialConstantInterpretationImpl partialConstantInterpretation = new PartialConstantInterpretationImpl();
		return partialConstantInterpretation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartialRelationInterpretation createPartialRelationInterpretation() {
		PartialRelationInterpretationImpl partialRelationInterpretation = new PartialRelationInterpretationImpl();
		return partialRelationInterpretation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartialFunctionInterpretation createPartialFunctionInterpretation() {
		PartialFunctionInterpretationImpl partialFunctionInterpretation = new PartialFunctionInterpretationImpl();
		return partialFunctionInterpretation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartialTypeInterpratation createPartialTypeInterpratation() {
		PartialTypeInterpratationImpl partialTypeInterpratation = new PartialTypeInterpratationImpl();
		return partialTypeInterpratation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnaryElementRelationLink createUnaryElementRelationLink() {
		UnaryElementRelationLinkImpl unaryElementRelationLink = new UnaryElementRelationLinkImpl();
		return unaryElementRelationLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryElementRelationLink createBinaryElementRelationLink() {
		BinaryElementRelationLinkImpl binaryElementRelationLink = new BinaryElementRelationLinkImpl();
		return binaryElementRelationLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NaryRelationLink createNaryRelationLink() {
		NaryRelationLinkImpl naryRelationLink = new NaryRelationLinkImpl();
		return naryRelationLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NaryRelationLinkElement createNaryRelationLinkElement() {
		NaryRelationLinkElementImpl naryRelationLinkElement = new NaryRelationLinkElementImpl();
		return naryRelationLinkElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BooleanElement createBooleanElement() {
		BooleanElementImpl booleanElement = new BooleanElementImpl();
		return booleanElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntegerElement createIntegerElement() {
		IntegerElementImpl integerElement = new IntegerElementImpl();
		return integerElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealElement createRealElement() {
		RealElementImpl realElement = new RealElementImpl();
		return realElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringElement createStringElement() {
		StringElementImpl stringElement = new StringElementImpl();
		return stringElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
