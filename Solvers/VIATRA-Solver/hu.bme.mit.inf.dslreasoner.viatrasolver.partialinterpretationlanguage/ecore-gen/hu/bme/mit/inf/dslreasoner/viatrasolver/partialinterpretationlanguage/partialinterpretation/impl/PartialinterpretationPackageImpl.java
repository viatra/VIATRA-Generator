/**
 */
package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguagePackage;

import hu.bme.mit.inf.dslreasoner.logic.model.logicproblem.LogicproblemPackage;

import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.BinaryElementRelationLink;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.BooleanElement;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.IntegerElement;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.NaryRelationLink;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.NaryRelationLinkElement;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialConstantInterpretation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialFunctionInterpretation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialRelationInterpretation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialTypeInterpratation;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationFactory;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationPackage;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PrimitiveElement;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.RealElement;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.RelationLink;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.StringElement;
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.UnaryElementRelationLink;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PartialinterpretationPackageImpl extends EPackageImpl implements PartialinterpretationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partialInterpretationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partialConstantInterpretationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partialRelationInterpretationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partialFunctionInterpretationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partialTypeInterpratationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unaryElementRelationLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass binaryElementRelationLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass naryRelationLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass naryRelationLinkElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass integerElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass realElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringElementEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private PartialinterpretationPackageImpl() {
		super(eNS_URI, PartialinterpretationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link PartialinterpretationPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static PartialinterpretationPackage init() {
		if (isInited) return (PartialinterpretationPackage)EPackage.Registry.INSTANCE.getEPackage(PartialinterpretationPackage.eNS_URI);

		// Obtain or create and register package
		PartialinterpretationPackageImpl thePartialinterpretationPackage = (PartialinterpretationPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PartialinterpretationPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PartialinterpretationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		LogiclanguagePackage.eINSTANCE.eClass();
		LogicproblemPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		thePartialinterpretationPackage.createPackageContents();

		// Initialize created meta-data
		thePartialinterpretationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePartialinterpretationPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(PartialinterpretationPackage.eNS_URI, thePartialinterpretationPackage);
		return thePartialinterpretationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartialInterpretation() {
		return partialInterpretationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartialInterpretation_Problem() {
		return (EReference)partialInterpretationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartialInterpretation_Partialconstantinterpretation() {
		return (EReference)partialInterpretationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartialInterpretation_Partialrelationinterpretation() {
		return (EReference)partialInterpretationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartialInterpretation_Partialfunctioninterpretation() {
		return (EReference)partialInterpretationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartialInterpretation_NewElements() {
		return (EReference)partialInterpretationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartialInterpretation_Partialtypeinterpratation() {
		return (EReference)partialInterpretationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartialInterpretation_MinNewElements() {
		return (EAttribute)partialInterpretationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartialInterpretation_MaxNewElements() {
		return (EAttribute)partialInterpretationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartialInterpretation_OpenWorldElementPrototypes() {
		return (EReference)partialInterpretationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartialInterpretation_ProblemConainer() {
		return (EReference)partialInterpretationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartialInterpretation_Stringelement() {
		return (EReference)partialInterpretationEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartialInterpretation_Stringelements() {
		return (EReference)partialInterpretationEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartialInterpretation_Realelements() {
		return (EReference)partialInterpretationEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartialInterpretation_Integerelements() {
		return (EReference)partialInterpretationEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartialInterpretation_Booleanelements() {
		return (EReference)partialInterpretationEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartialInterpretation_MaxNewIntegers() {
		return (EAttribute)partialInterpretationEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartialInterpretation_MaxNewReals() {
		return (EAttribute)partialInterpretationEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPartialInterpretation_MaxNewStrings() {
		return (EAttribute)partialInterpretationEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartialInterpretation_NewStrings() {
		return (EReference)partialInterpretationEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartialInterpretation_NewReals() {
		return (EReference)partialInterpretationEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartialInterpretation_NewIntegers() {
		return (EReference)partialInterpretationEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartialConstantInterpretation() {
		return partialConstantInterpretationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartialConstantInterpretation_InterpretationOf() {
		return (EReference)partialConstantInterpretationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartialRelationInterpretation() {
		return partialRelationInterpretationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartialRelationInterpretation_InterpretationOf() {
		return (EReference)partialRelationInterpretationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartialRelationInterpretation_Relationlinks() {
		return (EReference)partialRelationInterpretationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartialRelationInterpretation_Param1() {
		return (EReference)partialRelationInterpretationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartialRelationInterpretation_Param2() {
		return (EReference)partialRelationInterpretationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartialFunctionInterpretation() {
		return partialFunctionInterpretationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartialFunctionInterpretation_InterpretationOf() {
		return (EReference)partialFunctionInterpretationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartialTypeInterpratation() {
		return partialTypeInterpratationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartialTypeInterpratation_InterpretationOf() {
		return (EReference)partialTypeInterpratationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartialTypeInterpratation_Elements() {
		return (EReference)partialTypeInterpratationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartialTypeInterpratation_SupertypeInterpretation() {
		return (EReference)partialTypeInterpratationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelationLink() {
		return relationLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnaryElementRelationLink() {
		return unaryElementRelationLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnaryElementRelationLink_Param1() {
		return (EReference)unaryElementRelationLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBinaryElementRelationLink() {
		return binaryElementRelationLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryElementRelationLink_Param1() {
		return (EReference)binaryElementRelationLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBinaryElementRelationLink_Param2() {
		return (EReference)binaryElementRelationLinkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNaryRelationLink() {
		return naryRelationLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNaryRelationLink_Elements() {
		return (EReference)naryRelationLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNaryRelationLinkElement() {
		return naryRelationLinkElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNaryRelationLinkElement_Index() {
		return (EAttribute)naryRelationLinkElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveElement() {
		return primitiveElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrimitiveElement_ValueSet() {
		return (EAttribute)primitiveElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanElement() {
		return booleanElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanElement_Value() {
		return (EAttribute)booleanElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntegerElement() {
		return integerElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIntegerElement_Value() {
		return (EAttribute)integerElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRealElement() {
		return realElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRealElement_Value() {
		return (EAttribute)realElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringElement() {
		return stringElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringElement_Value() {
		return (EAttribute)stringElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PartialinterpretationFactory getPartialinterpretationFactory() {
		return (PartialinterpretationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		partialInterpretationEClass = createEClass(PARTIAL_INTERPRETATION);
		createEReference(partialInterpretationEClass, PARTIAL_INTERPRETATION__PROBLEM);
		createEReference(partialInterpretationEClass, PARTIAL_INTERPRETATION__PARTIALCONSTANTINTERPRETATION);
		createEReference(partialInterpretationEClass, PARTIAL_INTERPRETATION__PARTIALRELATIONINTERPRETATION);
		createEReference(partialInterpretationEClass, PARTIAL_INTERPRETATION__PARTIALFUNCTIONINTERPRETATION);
		createEReference(partialInterpretationEClass, PARTIAL_INTERPRETATION__NEW_ELEMENTS);
		createEReference(partialInterpretationEClass, PARTIAL_INTERPRETATION__PARTIALTYPEINTERPRATATION);
		createEAttribute(partialInterpretationEClass, PARTIAL_INTERPRETATION__MIN_NEW_ELEMENTS);
		createEAttribute(partialInterpretationEClass, PARTIAL_INTERPRETATION__MAX_NEW_ELEMENTS);
		createEReference(partialInterpretationEClass, PARTIAL_INTERPRETATION__OPEN_WORLD_ELEMENT_PROTOTYPES);
		createEReference(partialInterpretationEClass, PARTIAL_INTERPRETATION__PROBLEM_CONAINER);
		createEReference(partialInterpretationEClass, PARTIAL_INTERPRETATION__STRINGELEMENT);
		createEReference(partialInterpretationEClass, PARTIAL_INTERPRETATION__STRINGELEMENTS);
		createEReference(partialInterpretationEClass, PARTIAL_INTERPRETATION__REALELEMENTS);
		createEReference(partialInterpretationEClass, PARTIAL_INTERPRETATION__INTEGERELEMENTS);
		createEReference(partialInterpretationEClass, PARTIAL_INTERPRETATION__BOOLEANELEMENTS);
		createEAttribute(partialInterpretationEClass, PARTIAL_INTERPRETATION__MAX_NEW_INTEGERS);
		createEAttribute(partialInterpretationEClass, PARTIAL_INTERPRETATION__MAX_NEW_REALS);
		createEAttribute(partialInterpretationEClass, PARTIAL_INTERPRETATION__MAX_NEW_STRINGS);
		createEReference(partialInterpretationEClass, PARTIAL_INTERPRETATION__NEW_STRINGS);
		createEReference(partialInterpretationEClass, PARTIAL_INTERPRETATION__NEW_REALS);
		createEReference(partialInterpretationEClass, PARTIAL_INTERPRETATION__NEW_INTEGERS);

		partialConstantInterpretationEClass = createEClass(PARTIAL_CONSTANT_INTERPRETATION);
		createEReference(partialConstantInterpretationEClass, PARTIAL_CONSTANT_INTERPRETATION__INTERPRETATION_OF);

		partialRelationInterpretationEClass = createEClass(PARTIAL_RELATION_INTERPRETATION);
		createEReference(partialRelationInterpretationEClass, PARTIAL_RELATION_INTERPRETATION__INTERPRETATION_OF);
		createEReference(partialRelationInterpretationEClass, PARTIAL_RELATION_INTERPRETATION__RELATIONLINKS);
		createEReference(partialRelationInterpretationEClass, PARTIAL_RELATION_INTERPRETATION__PARAM1);
		createEReference(partialRelationInterpretationEClass, PARTIAL_RELATION_INTERPRETATION__PARAM2);

		partialFunctionInterpretationEClass = createEClass(PARTIAL_FUNCTION_INTERPRETATION);
		createEReference(partialFunctionInterpretationEClass, PARTIAL_FUNCTION_INTERPRETATION__INTERPRETATION_OF);

		partialTypeInterpratationEClass = createEClass(PARTIAL_TYPE_INTERPRATATION);
		createEReference(partialTypeInterpratationEClass, PARTIAL_TYPE_INTERPRATATION__INTERPRETATION_OF);
		createEReference(partialTypeInterpratationEClass, PARTIAL_TYPE_INTERPRATATION__ELEMENTS);
		createEReference(partialTypeInterpratationEClass, PARTIAL_TYPE_INTERPRATATION__SUPERTYPE_INTERPRETATION);

		relationLinkEClass = createEClass(RELATION_LINK);

		unaryElementRelationLinkEClass = createEClass(UNARY_ELEMENT_RELATION_LINK);
		createEReference(unaryElementRelationLinkEClass, UNARY_ELEMENT_RELATION_LINK__PARAM1);

		binaryElementRelationLinkEClass = createEClass(BINARY_ELEMENT_RELATION_LINK);
		createEReference(binaryElementRelationLinkEClass, BINARY_ELEMENT_RELATION_LINK__PARAM1);
		createEReference(binaryElementRelationLinkEClass, BINARY_ELEMENT_RELATION_LINK__PARAM2);

		naryRelationLinkEClass = createEClass(NARY_RELATION_LINK);
		createEReference(naryRelationLinkEClass, NARY_RELATION_LINK__ELEMENTS);

		naryRelationLinkElementEClass = createEClass(NARY_RELATION_LINK_ELEMENT);
		createEAttribute(naryRelationLinkElementEClass, NARY_RELATION_LINK_ELEMENT__INDEX);

		primitiveElementEClass = createEClass(PRIMITIVE_ELEMENT);
		createEAttribute(primitiveElementEClass, PRIMITIVE_ELEMENT__VALUE_SET);

		booleanElementEClass = createEClass(BOOLEAN_ELEMENT);
		createEAttribute(booleanElementEClass, BOOLEAN_ELEMENT__VALUE);

		integerElementEClass = createEClass(INTEGER_ELEMENT);
		createEAttribute(integerElementEClass, INTEGER_ELEMENT__VALUE);

		realElementEClass = createEClass(REAL_ELEMENT);
		createEAttribute(realElementEClass, REAL_ELEMENT__VALUE);

		stringElementEClass = createEClass(STRING_ELEMENT);
		createEAttribute(stringElementEClass, STRING_ELEMENT__VALUE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		LogicproblemPackage theLogicproblemPackage = (LogicproblemPackage)EPackage.Registry.INSTANCE.getEPackage(LogicproblemPackage.eNS_URI);
		LogiclanguagePackage theLogiclanguagePackage = (LogiclanguagePackage)EPackage.Registry.INSTANCE.getEPackage(LogiclanguagePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		unaryElementRelationLinkEClass.getESuperTypes().add(this.getRelationLink());
		binaryElementRelationLinkEClass.getESuperTypes().add(this.getRelationLink());
		naryRelationLinkEClass.getESuperTypes().add(this.getRelationLink());
		primitiveElementEClass.getESuperTypes().add(theLogiclanguagePackage.getDefinedElement());
		booleanElementEClass.getESuperTypes().add(this.getPrimitiveElement());
		integerElementEClass.getESuperTypes().add(this.getPrimitiveElement());
		realElementEClass.getESuperTypes().add(this.getPrimitiveElement());
		stringElementEClass.getESuperTypes().add(this.getPrimitiveElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(partialInterpretationEClass, PartialInterpretation.class, "PartialInterpretation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartialInterpretation_Problem(), theLogicproblemPackage.getLogicProblem(), null, "problem", null, 1, 1, PartialInterpretation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartialInterpretation_Partialconstantinterpretation(), this.getPartialConstantInterpretation(), null, "partialconstantinterpretation", null, 0, -1, PartialInterpretation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartialInterpretation_Partialrelationinterpretation(), this.getPartialRelationInterpretation(), null, "partialrelationinterpretation", null, 0, -1, PartialInterpretation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartialInterpretation_Partialfunctioninterpretation(), this.getPartialFunctionInterpretation(), null, "partialfunctioninterpretation", null, 0, -1, PartialInterpretation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartialInterpretation_NewElements(), theLogiclanguagePackage.getDefinedElement(), null, "newElements", null, 0, -1, PartialInterpretation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartialInterpretation_Partialtypeinterpratation(), this.getPartialTypeInterpratation(), null, "partialtypeinterpratation", null, 0, -1, PartialInterpretation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartialInterpretation_MinNewElements(), ecorePackage.getEInt(), "minNewElements", "0", 1, 1, PartialInterpretation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartialInterpretation_MaxNewElements(), ecorePackage.getEInt(), "maxNewElements", "0", 1, 1, PartialInterpretation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartialInterpretation_OpenWorldElementPrototypes(), theLogiclanguagePackage.getDefinedElement(), null, "openWorldElementPrototypes", null, 0, -1, PartialInterpretation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartialInterpretation_ProblemConainer(), theLogicproblemPackage.getLogicProblem(), null, "problemConainer", null, 0, 1, PartialInterpretation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartialInterpretation_Stringelement(), this.getStringElement(), null, "stringelement", null, 0, -1, PartialInterpretation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartialInterpretation_Stringelements(), this.getStringElement(), null, "stringelements", null, 0, -1, PartialInterpretation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartialInterpretation_Realelements(), this.getRealElement(), null, "realelements", null, 0, -1, PartialInterpretation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartialInterpretation_Integerelements(), this.getIntegerElement(), null, "integerelements", null, 0, -1, PartialInterpretation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartialInterpretation_Booleanelements(), this.getBooleanElement(), null, "booleanelements", null, 0, -1, PartialInterpretation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartialInterpretation_MaxNewIntegers(), ecorePackage.getEInt(), "maxNewIntegers", null, 1, 1, PartialInterpretation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartialInterpretation_MaxNewReals(), ecorePackage.getEInt(), "maxNewReals", null, 1, 1, PartialInterpretation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPartialInterpretation_MaxNewStrings(), ecorePackage.getEInt(), "maxNewStrings", null, 1, 1, PartialInterpretation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartialInterpretation_NewStrings(), this.getStringElement(), null, "newStrings", null, 0, -1, PartialInterpretation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartialInterpretation_NewReals(), this.getRealElement(), null, "newReals", null, 0, -1, PartialInterpretation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartialInterpretation_NewIntegers(), this.getIntegerElement(), null, "newIntegers", null, 0, -1, PartialInterpretation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partialConstantInterpretationEClass, PartialConstantInterpretation.class, "PartialConstantInterpretation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartialConstantInterpretation_InterpretationOf(), theLogiclanguagePackage.getConstantDeclaration(), null, "interpretationOf", null, 1, 1, PartialConstantInterpretation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partialRelationInterpretationEClass, PartialRelationInterpretation.class, "PartialRelationInterpretation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartialRelationInterpretation_InterpretationOf(), theLogiclanguagePackage.getRelationDeclaration(), null, "interpretationOf", null, 1, 1, PartialRelationInterpretation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartialRelationInterpretation_Relationlinks(), this.getRelationLink(), null, "relationlinks", null, 0, -1, PartialRelationInterpretation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartialRelationInterpretation_Param1(), theLogiclanguagePackage.getTypeReference(), null, "param1", null, 0, 1, PartialRelationInterpretation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartialRelationInterpretation_Param2(), theLogiclanguagePackage.getTypeReference(), null, "param2", null, 0, 1, PartialRelationInterpretation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partialFunctionInterpretationEClass, PartialFunctionInterpretation.class, "PartialFunctionInterpretation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartialFunctionInterpretation_InterpretationOf(), theLogiclanguagePackage.getFunctionDeclaration(), null, "interpretationOf", null, 1, 1, PartialFunctionInterpretation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(partialTypeInterpratationEClass, PartialTypeInterpratation.class, "PartialTypeInterpratation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPartialTypeInterpratation_InterpretationOf(), theLogiclanguagePackage.getTypeDeclaration(), null, "interpretationOf", null, 1, 1, PartialTypeInterpratation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartialTypeInterpratation_Elements(), theLogiclanguagePackage.getDefinedElement(), null, "elements", null, 0, -1, PartialTypeInterpratation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPartialTypeInterpratation_SupertypeInterpretation(), this.getPartialTypeInterpratation(), null, "supertypeInterpretation", null, 0, -1, PartialTypeInterpratation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationLinkEClass, RelationLink.class, "RelationLink", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unaryElementRelationLinkEClass, UnaryElementRelationLink.class, "UnaryElementRelationLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUnaryElementRelationLink_Param1(), theLogiclanguagePackage.getDefinedElement(), null, "param1", null, 1, 1, UnaryElementRelationLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(binaryElementRelationLinkEClass, BinaryElementRelationLink.class, "BinaryElementRelationLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBinaryElementRelationLink_Param1(), theLogiclanguagePackage.getDefinedElement(), null, "param1", null, 1, 1, BinaryElementRelationLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBinaryElementRelationLink_Param2(), theLogiclanguagePackage.getDefinedElement(), null, "param2", null, 1, 1, BinaryElementRelationLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(naryRelationLinkEClass, NaryRelationLink.class, "NaryRelationLink", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNaryRelationLink_Elements(), this.getNaryRelationLinkElement(), null, "elements", null, 0, -1, NaryRelationLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(naryRelationLinkElementEClass, NaryRelationLinkElement.class, "NaryRelationLinkElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNaryRelationLinkElement_Index(), ecorePackage.getEInt(), "index", null, 0, 1, NaryRelationLinkElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primitiveElementEClass, PrimitiveElement.class, "PrimitiveElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrimitiveElement_ValueSet(), ecorePackage.getEBoolean(), "valueSet", null, 1, 1, PrimitiveElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanElementEClass, BooleanElement.class, "BooleanElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanElement_Value(), ecorePackage.getEBoolean(), "value", null, 1, 1, BooleanElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(integerElementEClass, IntegerElement.class, "IntegerElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIntegerElement_Value(), ecorePackage.getEInt(), "value", null, 1, 1, IntegerElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(realElementEClass, RealElement.class, "RealElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRealElement_Value(), ecorePackage.getEBigDecimal(), "value", null, 1, 1, RealElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringElementEClass, StringElement.class, "StringElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringElement_Value(), ecorePackage.getEString(), "value", null, 1, 1, StringElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //PartialinterpretationPackageImpl
