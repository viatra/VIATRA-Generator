/**
 */
package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation;

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguagePackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialinterpretationFactory
 * @model kind="package"
 * @generated
 */
public interface PartialinterpretationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "partialinterpretation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.bme.hu/mit/inf/dslreasoner/viatrasolver/partialinterpretationlanguage";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "partialinterpretation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PartialinterpretationPackage eINSTANCE = hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialinterpretationPackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialInterpretationImpl <em>Partial Interpretation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialInterpretationImpl
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialinterpretationPackageImpl#getPartialInterpretation()
	 * @generated
	 */
	int PARTIAL_INTERPRETATION = 0;

	/**
	 * The feature id for the '<em><b>Problem</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_INTERPRETATION__PROBLEM = 0;

	/**
	 * The feature id for the '<em><b>Partialconstantinterpretation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_INTERPRETATION__PARTIALCONSTANTINTERPRETATION = 1;

	/**
	 * The feature id for the '<em><b>Partialrelationinterpretation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_INTERPRETATION__PARTIALRELATIONINTERPRETATION = 2;

	/**
	 * The feature id for the '<em><b>Partialfunctioninterpretation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_INTERPRETATION__PARTIALFUNCTIONINTERPRETATION = 3;

	/**
	 * The feature id for the '<em><b>New Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_INTERPRETATION__NEW_ELEMENTS = 4;

	/**
	 * The feature id for the '<em><b>Partialtypeinterpratation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_INTERPRETATION__PARTIALTYPEINTERPRATATION = 5;

	/**
	 * The feature id for the '<em><b>Min New Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_INTERPRETATION__MIN_NEW_ELEMENTS = 6;

	/**
	 * The feature id for the '<em><b>Max New Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_INTERPRETATION__MAX_NEW_ELEMENTS = 7;

	/**
	 * The feature id for the '<em><b>Open World Element Prototypes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_INTERPRETATION__OPEN_WORLD_ELEMENT_PROTOTYPES = 8;

	/**
	 * The feature id for the '<em><b>Problem Conainer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_INTERPRETATION__PROBLEM_CONAINER = 9;

	/**
	 * The feature id for the '<em><b>Stringelement</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_INTERPRETATION__STRINGELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Stringelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_INTERPRETATION__STRINGELEMENTS = 11;

	/**
	 * The feature id for the '<em><b>Realelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_INTERPRETATION__REALELEMENTS = 12;

	/**
	 * The feature id for the '<em><b>Integerelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_INTERPRETATION__INTEGERELEMENTS = 13;

	/**
	 * The feature id for the '<em><b>Booleanelements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_INTERPRETATION__BOOLEANELEMENTS = 14;

	/**
	 * The feature id for the '<em><b>Max New Integers</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_INTERPRETATION__MAX_NEW_INTEGERS = 15;

	/**
	 * The feature id for the '<em><b>Max New Reals</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_INTERPRETATION__MAX_NEW_REALS = 16;

	/**
	 * The feature id for the '<em><b>Max New Strings</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_INTERPRETATION__MAX_NEW_STRINGS = 17;

	/**
	 * The feature id for the '<em><b>New Strings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_INTERPRETATION__NEW_STRINGS = 18;

	/**
	 * The feature id for the '<em><b>New Reals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_INTERPRETATION__NEW_REALS = 19;

	/**
	 * The feature id for the '<em><b>New Integers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_INTERPRETATION__NEW_INTEGERS = 20;

	/**
	 * The number of structural features of the '<em>Partial Interpretation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_INTERPRETATION_FEATURE_COUNT = 21;

	/**
	 * The number of operations of the '<em>Partial Interpretation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_INTERPRETATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialConstantInterpretationImpl <em>Partial Constant Interpretation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialConstantInterpretationImpl
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialinterpretationPackageImpl#getPartialConstantInterpretation()
	 * @generated
	 */
	int PARTIAL_CONSTANT_INTERPRETATION = 1;

	/**
	 * The feature id for the '<em><b>Interpretation Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_CONSTANT_INTERPRETATION__INTERPRETATION_OF = 0;

	/**
	 * The number of structural features of the '<em>Partial Constant Interpretation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_CONSTANT_INTERPRETATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Partial Constant Interpretation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_CONSTANT_INTERPRETATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialRelationInterpretationImpl <em>Partial Relation Interpretation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialRelationInterpretationImpl
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialinterpretationPackageImpl#getPartialRelationInterpretation()
	 * @generated
	 */
	int PARTIAL_RELATION_INTERPRETATION = 2;

	/**
	 * The feature id for the '<em><b>Interpretation Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_RELATION_INTERPRETATION__INTERPRETATION_OF = 0;

	/**
	 * The feature id for the '<em><b>Relationlinks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_RELATION_INTERPRETATION__RELATIONLINKS = 1;

	/**
	 * The feature id for the '<em><b>Param1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_RELATION_INTERPRETATION__PARAM1 = 2;

	/**
	 * The feature id for the '<em><b>Param2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_RELATION_INTERPRETATION__PARAM2 = 3;

	/**
	 * The number of structural features of the '<em>Partial Relation Interpretation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_RELATION_INTERPRETATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Partial Relation Interpretation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_RELATION_INTERPRETATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialFunctionInterpretationImpl <em>Partial Function Interpretation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialFunctionInterpretationImpl
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialinterpretationPackageImpl#getPartialFunctionInterpretation()
	 * @generated
	 */
	int PARTIAL_FUNCTION_INTERPRETATION = 3;

	/**
	 * The feature id for the '<em><b>Interpretation Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_FUNCTION_INTERPRETATION__INTERPRETATION_OF = 0;

	/**
	 * The number of structural features of the '<em>Partial Function Interpretation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_FUNCTION_INTERPRETATION_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Partial Function Interpretation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_FUNCTION_INTERPRETATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialTypeInterpratationImpl <em>Partial Type Interpratation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialTypeInterpratationImpl
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialinterpretationPackageImpl#getPartialTypeInterpratation()
	 * @generated
	 */
	int PARTIAL_TYPE_INTERPRATATION = 4;

	/**
	 * The feature id for the '<em><b>Interpretation Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_TYPE_INTERPRATATION__INTERPRETATION_OF = 0;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_TYPE_INTERPRATATION__ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Supertype Interpretation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_TYPE_INTERPRATATION__SUPERTYPE_INTERPRETATION = 2;

	/**
	 * The number of structural features of the '<em>Partial Type Interpratation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_TYPE_INTERPRATATION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Partial Type Interpratation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_TYPE_INTERPRATATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.RelationLinkImpl <em>Relation Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.RelationLinkImpl
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialinterpretationPackageImpl#getRelationLink()
	 * @generated
	 */
	int RELATION_LINK = 5;

	/**
	 * The number of structural features of the '<em>Relation Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_LINK_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Relation Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.UnaryElementRelationLinkImpl <em>Unary Element Relation Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.UnaryElementRelationLinkImpl
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialinterpretationPackageImpl#getUnaryElementRelationLink()
	 * @generated
	 */
	int UNARY_ELEMENT_RELATION_LINK = 6;

	/**
	 * The feature id for the '<em><b>Param1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ELEMENT_RELATION_LINK__PARAM1 = RELATION_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Unary Element Relation Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ELEMENT_RELATION_LINK_FEATURE_COUNT = RELATION_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Unary Element Relation Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNARY_ELEMENT_RELATION_LINK_OPERATION_COUNT = RELATION_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.BinaryElementRelationLinkImpl <em>Binary Element Relation Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.BinaryElementRelationLinkImpl
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialinterpretationPackageImpl#getBinaryElementRelationLink()
	 * @generated
	 */
	int BINARY_ELEMENT_RELATION_LINK = 7;

	/**
	 * The feature id for the '<em><b>Param1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ELEMENT_RELATION_LINK__PARAM1 = RELATION_LINK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Param2</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ELEMENT_RELATION_LINK__PARAM2 = RELATION_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Binary Element Relation Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ELEMENT_RELATION_LINK_FEATURE_COUNT = RELATION_LINK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Binary Element Relation Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINARY_ELEMENT_RELATION_LINK_OPERATION_COUNT = RELATION_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.NaryRelationLinkImpl <em>Nary Relation Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.NaryRelationLinkImpl
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialinterpretationPackageImpl#getNaryRelationLink()
	 * @generated
	 */
	int NARY_RELATION_LINK = 8;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARY_RELATION_LINK__ELEMENTS = RELATION_LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Nary Relation Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARY_RELATION_LINK_FEATURE_COUNT = RELATION_LINK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Nary Relation Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARY_RELATION_LINK_OPERATION_COUNT = RELATION_LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.NaryRelationLinkElementImpl <em>Nary Relation Link Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.NaryRelationLinkElementImpl
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialinterpretationPackageImpl#getNaryRelationLinkElement()
	 * @generated
	 */
	int NARY_RELATION_LINK_ELEMENT = 9;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARY_RELATION_LINK_ELEMENT__INDEX = 0;

	/**
	 * The number of structural features of the '<em>Nary Relation Link Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARY_RELATION_LINK_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Nary Relation Link Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARY_RELATION_LINK_ELEMENT_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PrimitiveElementImpl <em>Primitive Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PrimitiveElementImpl
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialinterpretationPackageImpl#getPrimitiveElement()
	 * @generated
	 */
	int PRIMITIVE_ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ELEMENT__NAME = LogiclanguagePackage.DEFINED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Defined In Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ELEMENT__DEFINED_IN_TYPE = LogiclanguagePackage.DEFINED_ELEMENT__DEFINED_IN_TYPE;

	/**
	 * The feature id for the '<em><b>Value Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ELEMENT__VALUE_SET = LogiclanguagePackage.DEFINED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Primitive Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ELEMENT_FEATURE_COUNT = LogiclanguagePackage.DEFINED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Primitive Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_ELEMENT_OPERATION_COUNT = LogiclanguagePackage.DEFINED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.BooleanElementImpl <em>Boolean Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.BooleanElementImpl
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialinterpretationPackageImpl#getBooleanElement()
	 * @generated
	 */
	int BOOLEAN_ELEMENT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ELEMENT__NAME = PRIMITIVE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Defined In Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ELEMENT__DEFINED_IN_TYPE = PRIMITIVE_ELEMENT__DEFINED_IN_TYPE;

	/**
	 * The feature id for the '<em><b>Value Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ELEMENT__VALUE_SET = PRIMITIVE_ELEMENT__VALUE_SET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ELEMENT__VALUE = PRIMITIVE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ELEMENT_FEATURE_COUNT = PRIMITIVE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Boolean Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ELEMENT_OPERATION_COUNT = PRIMITIVE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.IntegerElementImpl <em>Integer Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.IntegerElementImpl
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialinterpretationPackageImpl#getIntegerElement()
	 * @generated
	 */
	int INTEGER_ELEMENT = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ELEMENT__NAME = PRIMITIVE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Defined In Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ELEMENT__DEFINED_IN_TYPE = PRIMITIVE_ELEMENT__DEFINED_IN_TYPE;

	/**
	 * The feature id for the '<em><b>Value Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ELEMENT__VALUE_SET = PRIMITIVE_ELEMENT__VALUE_SET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ELEMENT__VALUE = PRIMITIVE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Integer Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ELEMENT_FEATURE_COUNT = PRIMITIVE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Integer Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEGER_ELEMENT_OPERATION_COUNT = PRIMITIVE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.RealElementImpl <em>Real Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.RealElementImpl
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialinterpretationPackageImpl#getRealElement()
	 * @generated
	 */
	int REAL_ELEMENT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_ELEMENT__NAME = PRIMITIVE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Defined In Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_ELEMENT__DEFINED_IN_TYPE = PRIMITIVE_ELEMENT__DEFINED_IN_TYPE;

	/**
	 * The feature id for the '<em><b>Value Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_ELEMENT__VALUE_SET = PRIMITIVE_ELEMENT__VALUE_SET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_ELEMENT__VALUE = PRIMITIVE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Real Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_ELEMENT_FEATURE_COUNT = PRIMITIVE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Real Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_ELEMENT_OPERATION_COUNT = PRIMITIVE_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.StringElementImpl <em>String Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.StringElementImpl
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialinterpretationPackageImpl#getStringElement()
	 * @generated
	 */
	int STRING_ELEMENT = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ELEMENT__NAME = PRIMITIVE_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Defined In Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ELEMENT__DEFINED_IN_TYPE = PRIMITIVE_ELEMENT__DEFINED_IN_TYPE;

	/**
	 * The feature id for the '<em><b>Value Set</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ELEMENT__VALUE_SET = PRIMITIVE_ELEMENT__VALUE_SET;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ELEMENT__VALUE = PRIMITIVE_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ELEMENT_FEATURE_COUNT = PRIMITIVE_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ELEMENT_OPERATION_COUNT = PRIMITIVE_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation <em>Partial Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partial Interpretation</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
	 * @generated
	 */
	EClass getPartialInterpretation();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getProblem <em>Problem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Problem</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getProblem()
	 * @see #getPartialInterpretation()
	 * @generated
	 */
	EReference getPartialInterpretation_Problem();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getPartialconstantinterpretation <em>Partialconstantinterpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Partialconstantinterpretation</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getPartialconstantinterpretation()
	 * @see #getPartialInterpretation()
	 * @generated
	 */
	EReference getPartialInterpretation_Partialconstantinterpretation();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getPartialrelationinterpretation <em>Partialrelationinterpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Partialrelationinterpretation</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getPartialrelationinterpretation()
	 * @see #getPartialInterpretation()
	 * @generated
	 */
	EReference getPartialInterpretation_Partialrelationinterpretation();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getPartialfunctioninterpretation <em>Partialfunctioninterpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Partialfunctioninterpretation</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getPartialfunctioninterpretation()
	 * @see #getPartialInterpretation()
	 * @generated
	 */
	EReference getPartialInterpretation_Partialfunctioninterpretation();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getNewElements <em>New Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>New Elements</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getNewElements()
	 * @see #getPartialInterpretation()
	 * @generated
	 */
	EReference getPartialInterpretation_NewElements();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getPartialtypeinterpratation <em>Partialtypeinterpratation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Partialtypeinterpratation</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getPartialtypeinterpratation()
	 * @see #getPartialInterpretation()
	 * @generated
	 */
	EReference getPartialInterpretation_Partialtypeinterpratation();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getMinNewElements <em>Min New Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min New Elements</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getMinNewElements()
	 * @see #getPartialInterpretation()
	 * @generated
	 */
	EAttribute getPartialInterpretation_MinNewElements();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getMaxNewElements <em>Max New Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max New Elements</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getMaxNewElements()
	 * @see #getPartialInterpretation()
	 * @generated
	 */
	EAttribute getPartialInterpretation_MaxNewElements();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getOpenWorldElementPrototypes <em>Open World Element Prototypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Open World Element Prototypes</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getOpenWorldElementPrototypes()
	 * @see #getPartialInterpretation()
	 * @generated
	 */
	EReference getPartialInterpretation_OpenWorldElementPrototypes();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getProblemConainer <em>Problem Conainer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Problem Conainer</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getProblemConainer()
	 * @see #getPartialInterpretation()
	 * @generated
	 */
	EReference getPartialInterpretation_ProblemConainer();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getStringelement <em>Stringelement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stringelement</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getStringelement()
	 * @see #getPartialInterpretation()
	 * @generated
	 */
	EReference getPartialInterpretation_Stringelement();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getStringelements <em>Stringelements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stringelements</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getStringelements()
	 * @see #getPartialInterpretation()
	 * @generated
	 */
	EReference getPartialInterpretation_Stringelements();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getRealelements <em>Realelements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Realelements</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getRealelements()
	 * @see #getPartialInterpretation()
	 * @generated
	 */
	EReference getPartialInterpretation_Realelements();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getIntegerelements <em>Integerelements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Integerelements</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getIntegerelements()
	 * @see #getPartialInterpretation()
	 * @generated
	 */
	EReference getPartialInterpretation_Integerelements();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getBooleanelements <em>Booleanelements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Booleanelements</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getBooleanelements()
	 * @see #getPartialInterpretation()
	 * @generated
	 */
	EReference getPartialInterpretation_Booleanelements();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getMaxNewIntegers <em>Max New Integers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max New Integers</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getMaxNewIntegers()
	 * @see #getPartialInterpretation()
	 * @generated
	 */
	EAttribute getPartialInterpretation_MaxNewIntegers();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getMaxNewReals <em>Max New Reals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max New Reals</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getMaxNewReals()
	 * @see #getPartialInterpretation()
	 * @generated
	 */
	EAttribute getPartialInterpretation_MaxNewReals();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getMaxNewStrings <em>Max New Strings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max New Strings</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getMaxNewStrings()
	 * @see #getPartialInterpretation()
	 * @generated
	 */
	EAttribute getPartialInterpretation_MaxNewStrings();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getNewStrings <em>New Strings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>New Strings</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getNewStrings()
	 * @see #getPartialInterpretation()
	 * @generated
	 */
	EReference getPartialInterpretation_NewStrings();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getNewReals <em>New Reals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>New Reals</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getNewReals()
	 * @see #getPartialInterpretation()
	 * @generated
	 */
	EReference getPartialInterpretation_NewReals();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getNewIntegers <em>New Integers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>New Integers</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getNewIntegers()
	 * @see #getPartialInterpretation()
	 * @generated
	 */
	EReference getPartialInterpretation_NewIntegers();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialConstantInterpretation <em>Partial Constant Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partial Constant Interpretation</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialConstantInterpretation
	 * @generated
	 */
	EClass getPartialConstantInterpretation();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialConstantInterpretation#getInterpretationOf <em>Interpretation Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interpretation Of</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialConstantInterpretation#getInterpretationOf()
	 * @see #getPartialConstantInterpretation()
	 * @generated
	 */
	EReference getPartialConstantInterpretation_InterpretationOf();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialRelationInterpretation <em>Partial Relation Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partial Relation Interpretation</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialRelationInterpretation
	 * @generated
	 */
	EClass getPartialRelationInterpretation();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialRelationInterpretation#getInterpretationOf <em>Interpretation Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interpretation Of</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialRelationInterpretation#getInterpretationOf()
	 * @see #getPartialRelationInterpretation()
	 * @generated
	 */
	EReference getPartialRelationInterpretation_InterpretationOf();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialRelationInterpretation#getRelationlinks <em>Relationlinks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationlinks</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialRelationInterpretation#getRelationlinks()
	 * @see #getPartialRelationInterpretation()
	 * @generated
	 */
	EReference getPartialRelationInterpretation_Relationlinks();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialRelationInterpretation#getParam1 <em>Param1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Param1</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialRelationInterpretation#getParam1()
	 * @see #getPartialRelationInterpretation()
	 * @generated
	 */
	EReference getPartialRelationInterpretation_Param1();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialRelationInterpretation#getParam2 <em>Param2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Param2</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialRelationInterpretation#getParam2()
	 * @see #getPartialRelationInterpretation()
	 * @generated
	 */
	EReference getPartialRelationInterpretation_Param2();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialFunctionInterpretation <em>Partial Function Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partial Function Interpretation</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialFunctionInterpretation
	 * @generated
	 */
	EClass getPartialFunctionInterpretation();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialFunctionInterpretation#getInterpretationOf <em>Interpretation Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interpretation Of</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialFunctionInterpretation#getInterpretationOf()
	 * @see #getPartialFunctionInterpretation()
	 * @generated
	 */
	EReference getPartialFunctionInterpretation_InterpretationOf();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialTypeInterpratation <em>Partial Type Interpratation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partial Type Interpratation</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialTypeInterpratation
	 * @generated
	 */
	EClass getPartialTypeInterpratation();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialTypeInterpratation#getInterpretationOf <em>Interpretation Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interpretation Of</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialTypeInterpratation#getInterpretationOf()
	 * @see #getPartialTypeInterpratation()
	 * @generated
	 */
	EReference getPartialTypeInterpratation_InterpretationOf();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialTypeInterpratation#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elements</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialTypeInterpratation#getElements()
	 * @see #getPartialTypeInterpratation()
	 * @generated
	 */
	EReference getPartialTypeInterpratation_Elements();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialTypeInterpratation#getSupertypeInterpretation <em>Supertype Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supertype Interpretation</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialTypeInterpratation#getSupertypeInterpretation()
	 * @see #getPartialTypeInterpratation()
	 * @generated
	 */
	EReference getPartialTypeInterpratation_SupertypeInterpretation();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.RelationLink <em>Relation Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Link</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.RelationLink
	 * @generated
	 */
	EClass getRelationLink();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.UnaryElementRelationLink <em>Unary Element Relation Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unary Element Relation Link</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.UnaryElementRelationLink
	 * @generated
	 */
	EClass getUnaryElementRelationLink();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.UnaryElementRelationLink#getParam1 <em>Param1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Param1</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.UnaryElementRelationLink#getParam1()
	 * @see #getUnaryElementRelationLink()
	 * @generated
	 */
	EReference getUnaryElementRelationLink_Param1();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.BinaryElementRelationLink <em>Binary Element Relation Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binary Element Relation Link</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.BinaryElementRelationLink
	 * @generated
	 */
	EClass getBinaryElementRelationLink();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.BinaryElementRelationLink#getParam1 <em>Param1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Param1</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.BinaryElementRelationLink#getParam1()
	 * @see #getBinaryElementRelationLink()
	 * @generated
	 */
	EReference getBinaryElementRelationLink_Param1();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.BinaryElementRelationLink#getParam2 <em>Param2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Param2</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.BinaryElementRelationLink#getParam2()
	 * @see #getBinaryElementRelationLink()
	 * @generated
	 */
	EReference getBinaryElementRelationLink_Param2();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.NaryRelationLink <em>Nary Relation Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nary Relation Link</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.NaryRelationLink
	 * @generated
	 */
	EClass getNaryRelationLink();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.NaryRelationLink#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.NaryRelationLink#getElements()
	 * @see #getNaryRelationLink()
	 * @generated
	 */
	EReference getNaryRelationLink_Elements();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.NaryRelationLinkElement <em>Nary Relation Link Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nary Relation Link Element</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.NaryRelationLinkElement
	 * @generated
	 */
	EClass getNaryRelationLinkElement();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.NaryRelationLinkElement#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.NaryRelationLinkElement#getIndex()
	 * @see #getNaryRelationLinkElement()
	 * @generated
	 */
	EAttribute getNaryRelationLinkElement_Index();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PrimitiveElement <em>Primitive Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Element</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PrimitiveElement
	 * @generated
	 */
	EClass getPrimitiveElement();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PrimitiveElement#isValueSet <em>Value Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Set</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PrimitiveElement#isValueSet()
	 * @see #getPrimitiveElement()
	 * @generated
	 */
	EAttribute getPrimitiveElement_ValueSet();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.BooleanElement <em>Boolean Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Element</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.BooleanElement
	 * @generated
	 */
	EClass getBooleanElement();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.BooleanElement#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.BooleanElement#isValue()
	 * @see #getBooleanElement()
	 * @generated
	 */
	EAttribute getBooleanElement_Value();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.IntegerElement <em>Integer Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Integer Element</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.IntegerElement
	 * @generated
	 */
	EClass getIntegerElement();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.IntegerElement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.IntegerElement#getValue()
	 * @see #getIntegerElement()
	 * @generated
	 */
	EAttribute getIntegerElement_Value();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.RealElement <em>Real Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Element</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.RealElement
	 * @generated
	 */
	EClass getRealElement();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.RealElement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.RealElement#getValue()
	 * @see #getRealElement()
	 * @generated
	 */
	EAttribute getRealElement_Value();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.StringElement <em>String Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Element</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.StringElement
	 * @generated
	 */
	EClass getStringElement();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.StringElement#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.StringElement#getValue()
	 * @see #getStringElement()
	 * @generated
	 */
	EAttribute getStringElement_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PartialinterpretationFactory getPartialinterpretationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialInterpretationImpl <em>Partial Interpretation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialInterpretationImpl
		 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialinterpretationPackageImpl#getPartialInterpretation()
		 * @generated
		 */
		EClass PARTIAL_INTERPRETATION = eINSTANCE.getPartialInterpretation();

		/**
		 * The meta object literal for the '<em><b>Problem</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTIAL_INTERPRETATION__PROBLEM = eINSTANCE.getPartialInterpretation_Problem();

		/**
		 * The meta object literal for the '<em><b>Partialconstantinterpretation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTIAL_INTERPRETATION__PARTIALCONSTANTINTERPRETATION = eINSTANCE.getPartialInterpretation_Partialconstantinterpretation();

		/**
		 * The meta object literal for the '<em><b>Partialrelationinterpretation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTIAL_INTERPRETATION__PARTIALRELATIONINTERPRETATION = eINSTANCE.getPartialInterpretation_Partialrelationinterpretation();

		/**
		 * The meta object literal for the '<em><b>Partialfunctioninterpretation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTIAL_INTERPRETATION__PARTIALFUNCTIONINTERPRETATION = eINSTANCE.getPartialInterpretation_Partialfunctioninterpretation();

		/**
		 * The meta object literal for the '<em><b>New Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTIAL_INTERPRETATION__NEW_ELEMENTS = eINSTANCE.getPartialInterpretation_NewElements();

		/**
		 * The meta object literal for the '<em><b>Partialtypeinterpratation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTIAL_INTERPRETATION__PARTIALTYPEINTERPRATATION = eINSTANCE.getPartialInterpretation_Partialtypeinterpratation();

		/**
		 * The meta object literal for the '<em><b>Min New Elements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTIAL_INTERPRETATION__MIN_NEW_ELEMENTS = eINSTANCE.getPartialInterpretation_MinNewElements();

		/**
		 * The meta object literal for the '<em><b>Max New Elements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTIAL_INTERPRETATION__MAX_NEW_ELEMENTS = eINSTANCE.getPartialInterpretation_MaxNewElements();

		/**
		 * The meta object literal for the '<em><b>Open World Element Prototypes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTIAL_INTERPRETATION__OPEN_WORLD_ELEMENT_PROTOTYPES = eINSTANCE.getPartialInterpretation_OpenWorldElementPrototypes();

		/**
		 * The meta object literal for the '<em><b>Problem Conainer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTIAL_INTERPRETATION__PROBLEM_CONAINER = eINSTANCE.getPartialInterpretation_ProblemConainer();

		/**
		 * The meta object literal for the '<em><b>Stringelement</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTIAL_INTERPRETATION__STRINGELEMENT = eINSTANCE.getPartialInterpretation_Stringelement();

		/**
		 * The meta object literal for the '<em><b>Stringelements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTIAL_INTERPRETATION__STRINGELEMENTS = eINSTANCE.getPartialInterpretation_Stringelements();

		/**
		 * The meta object literal for the '<em><b>Realelements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTIAL_INTERPRETATION__REALELEMENTS = eINSTANCE.getPartialInterpretation_Realelements();

		/**
		 * The meta object literal for the '<em><b>Integerelements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTIAL_INTERPRETATION__INTEGERELEMENTS = eINSTANCE.getPartialInterpretation_Integerelements();

		/**
		 * The meta object literal for the '<em><b>Booleanelements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTIAL_INTERPRETATION__BOOLEANELEMENTS = eINSTANCE.getPartialInterpretation_Booleanelements();

		/**
		 * The meta object literal for the '<em><b>Max New Integers</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTIAL_INTERPRETATION__MAX_NEW_INTEGERS = eINSTANCE.getPartialInterpretation_MaxNewIntegers();

		/**
		 * The meta object literal for the '<em><b>Max New Reals</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTIAL_INTERPRETATION__MAX_NEW_REALS = eINSTANCE.getPartialInterpretation_MaxNewReals();

		/**
		 * The meta object literal for the '<em><b>Max New Strings</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTIAL_INTERPRETATION__MAX_NEW_STRINGS = eINSTANCE.getPartialInterpretation_MaxNewStrings();

		/**
		 * The meta object literal for the '<em><b>New Strings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTIAL_INTERPRETATION__NEW_STRINGS = eINSTANCE.getPartialInterpretation_NewStrings();

		/**
		 * The meta object literal for the '<em><b>New Reals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTIAL_INTERPRETATION__NEW_REALS = eINSTANCE.getPartialInterpretation_NewReals();

		/**
		 * The meta object literal for the '<em><b>New Integers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTIAL_INTERPRETATION__NEW_INTEGERS = eINSTANCE.getPartialInterpretation_NewIntegers();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialConstantInterpretationImpl <em>Partial Constant Interpretation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialConstantInterpretationImpl
		 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialinterpretationPackageImpl#getPartialConstantInterpretation()
		 * @generated
		 */
		EClass PARTIAL_CONSTANT_INTERPRETATION = eINSTANCE.getPartialConstantInterpretation();

		/**
		 * The meta object literal for the '<em><b>Interpretation Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTIAL_CONSTANT_INTERPRETATION__INTERPRETATION_OF = eINSTANCE.getPartialConstantInterpretation_InterpretationOf();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialRelationInterpretationImpl <em>Partial Relation Interpretation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialRelationInterpretationImpl
		 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialinterpretationPackageImpl#getPartialRelationInterpretation()
		 * @generated
		 */
		EClass PARTIAL_RELATION_INTERPRETATION = eINSTANCE.getPartialRelationInterpretation();

		/**
		 * The meta object literal for the '<em><b>Interpretation Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTIAL_RELATION_INTERPRETATION__INTERPRETATION_OF = eINSTANCE.getPartialRelationInterpretation_InterpretationOf();

		/**
		 * The meta object literal for the '<em><b>Relationlinks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTIAL_RELATION_INTERPRETATION__RELATIONLINKS = eINSTANCE.getPartialRelationInterpretation_Relationlinks();

		/**
		 * The meta object literal for the '<em><b>Param1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTIAL_RELATION_INTERPRETATION__PARAM1 = eINSTANCE.getPartialRelationInterpretation_Param1();

		/**
		 * The meta object literal for the '<em><b>Param2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTIAL_RELATION_INTERPRETATION__PARAM2 = eINSTANCE.getPartialRelationInterpretation_Param2();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialFunctionInterpretationImpl <em>Partial Function Interpretation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialFunctionInterpretationImpl
		 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialinterpretationPackageImpl#getPartialFunctionInterpretation()
		 * @generated
		 */
		EClass PARTIAL_FUNCTION_INTERPRETATION = eINSTANCE.getPartialFunctionInterpretation();

		/**
		 * The meta object literal for the '<em><b>Interpretation Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTIAL_FUNCTION_INTERPRETATION__INTERPRETATION_OF = eINSTANCE.getPartialFunctionInterpretation_InterpretationOf();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialTypeInterpratationImpl <em>Partial Type Interpratation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialTypeInterpratationImpl
		 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialinterpretationPackageImpl#getPartialTypeInterpratation()
		 * @generated
		 */
		EClass PARTIAL_TYPE_INTERPRATATION = eINSTANCE.getPartialTypeInterpratation();

		/**
		 * The meta object literal for the '<em><b>Interpretation Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTIAL_TYPE_INTERPRATATION__INTERPRETATION_OF = eINSTANCE.getPartialTypeInterpratation_InterpretationOf();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTIAL_TYPE_INTERPRATATION__ELEMENTS = eINSTANCE.getPartialTypeInterpratation_Elements();

		/**
		 * The meta object literal for the '<em><b>Supertype Interpretation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTIAL_TYPE_INTERPRATATION__SUPERTYPE_INTERPRETATION = eINSTANCE.getPartialTypeInterpratation_SupertypeInterpretation();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.RelationLinkImpl <em>Relation Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.RelationLinkImpl
		 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialinterpretationPackageImpl#getRelationLink()
		 * @generated
		 */
		EClass RELATION_LINK = eINSTANCE.getRelationLink();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.UnaryElementRelationLinkImpl <em>Unary Element Relation Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.UnaryElementRelationLinkImpl
		 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialinterpretationPackageImpl#getUnaryElementRelationLink()
		 * @generated
		 */
		EClass UNARY_ELEMENT_RELATION_LINK = eINSTANCE.getUnaryElementRelationLink();

		/**
		 * The meta object literal for the '<em><b>Param1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNARY_ELEMENT_RELATION_LINK__PARAM1 = eINSTANCE.getUnaryElementRelationLink_Param1();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.BinaryElementRelationLinkImpl <em>Binary Element Relation Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.BinaryElementRelationLinkImpl
		 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialinterpretationPackageImpl#getBinaryElementRelationLink()
		 * @generated
		 */
		EClass BINARY_ELEMENT_RELATION_LINK = eINSTANCE.getBinaryElementRelationLink();

		/**
		 * The meta object literal for the '<em><b>Param1</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_ELEMENT_RELATION_LINK__PARAM1 = eINSTANCE.getBinaryElementRelationLink_Param1();

		/**
		 * The meta object literal for the '<em><b>Param2</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINARY_ELEMENT_RELATION_LINK__PARAM2 = eINSTANCE.getBinaryElementRelationLink_Param2();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.NaryRelationLinkImpl <em>Nary Relation Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.NaryRelationLinkImpl
		 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialinterpretationPackageImpl#getNaryRelationLink()
		 * @generated
		 */
		EClass NARY_RELATION_LINK = eINSTANCE.getNaryRelationLink();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NARY_RELATION_LINK__ELEMENTS = eINSTANCE.getNaryRelationLink_Elements();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.NaryRelationLinkElementImpl <em>Nary Relation Link Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.NaryRelationLinkElementImpl
		 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialinterpretationPackageImpl#getNaryRelationLinkElement()
		 * @generated
		 */
		EClass NARY_RELATION_LINK_ELEMENT = eINSTANCE.getNaryRelationLinkElement();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NARY_RELATION_LINK_ELEMENT__INDEX = eINSTANCE.getNaryRelationLinkElement_Index();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PrimitiveElementImpl <em>Primitive Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PrimitiveElementImpl
		 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialinterpretationPackageImpl#getPrimitiveElement()
		 * @generated
		 */
		EClass PRIMITIVE_ELEMENT = eINSTANCE.getPrimitiveElement();

		/**
		 * The meta object literal for the '<em><b>Value Set</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIMITIVE_ELEMENT__VALUE_SET = eINSTANCE.getPrimitiveElement_ValueSet();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.BooleanElementImpl <em>Boolean Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.BooleanElementImpl
		 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialinterpretationPackageImpl#getBooleanElement()
		 * @generated
		 */
		EClass BOOLEAN_ELEMENT = eINSTANCE.getBooleanElement();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_ELEMENT__VALUE = eINSTANCE.getBooleanElement_Value();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.IntegerElementImpl <em>Integer Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.IntegerElementImpl
		 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialinterpretationPackageImpl#getIntegerElement()
		 * @generated
		 */
		EClass INTEGER_ELEMENT = eINSTANCE.getIntegerElement();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTEGER_ELEMENT__VALUE = eINSTANCE.getIntegerElement_Value();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.RealElementImpl <em>Real Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.RealElementImpl
		 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialinterpretationPackageImpl#getRealElement()
		 * @generated
		 */
		EClass REAL_ELEMENT = eINSTANCE.getRealElement();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_ELEMENT__VALUE = eINSTANCE.getRealElement_Value();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.StringElementImpl <em>String Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.StringElementImpl
		 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialinterpretationPackageImpl#getStringElement()
		 * @generated
		 */
		EClass STRING_ELEMENT = eINSTANCE.getStringElement();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_ELEMENT__VALUE = eINSTANCE.getStringElement_Value();

	}

} //PartialinterpretationPackage
