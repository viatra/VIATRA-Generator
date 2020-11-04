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
	 * The feature id for the '<em><b>Open World Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_INTERPRETATION__OPEN_WORLD_ELEMENTS = 6;

	/**
	 * The feature id for the '<em><b>Problem Conainer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_INTERPRETATION__PROBLEM_CONAINER = 7;

	/**
	 * The feature id for the '<em><b>Scopes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_INTERPRETATION__SCOPES = 8;

	/**
	 * The feature id for the '<em><b>Min New Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_INTERPRETATION__MIN_NEW_ELEMENTS = 9;

	/**
	 * The feature id for the '<em><b>Max New Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_INTERPRETATION__MAX_NEW_ELEMENTS = 10;

	/**
	 * The feature id for the '<em><b>Min New Elements Heuristic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_INTERPRETATION__MIN_NEW_ELEMENTS_HEURISTIC = 11;

	/**
	 * The number of structural features of the '<em>Partial Interpretation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_INTERPRETATION_FEATURE_COUNT = 12;

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
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_TYPE_INTERPRATATION__ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Scopes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_TYPE_INTERPRATATION__SCOPES = 1;

	/**
	 * The number of structural features of the '<em>Partial Type Interpratation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_TYPE_INTERPRATATION_FEATURE_COUNT = 2;

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
	 * The feature id for the '<em><b>Param</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARY_RELATION_LINK_ELEMENT__PARAM = 1;

	/**
	 * The number of structural features of the '<em>Nary Relation Link Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARY_RELATION_LINK_ELEMENT_FEATURE_COUNT = 2;

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
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.ScopeImpl <em>Scope</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.ScopeImpl
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialinterpretationPackageImpl#getScope()
	 * @generated
	 */
	int SCOPE = 15;

	/**
	 * The feature id for the '<em><b>Min New Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__MIN_NEW_ELEMENTS = 0;

	/**
	 * The feature id for the '<em><b>Max New Elements</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__MAX_NEW_ELEMENTS = 1;

	/**
	 * The feature id for the '<em><b>Target Type Interpretation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__TARGET_TYPE_INTERPRETATION = 2;

	/**
	 * The feature id for the '<em><b>Min New Elements Heuristic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE__MIN_NEW_ELEMENTS_HEURISTIC = 3;

	/**
	 * The number of structural features of the '<em>Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Scope</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCOPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialPrimitiveInterpretationImpl <em>Partial Primitive Interpretation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialPrimitiveInterpretationImpl
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialinterpretationPackageImpl#getPartialPrimitiveInterpretation()
	 * @generated
	 */
	int PARTIAL_PRIMITIVE_INTERPRETATION = 16;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_PRIMITIVE_INTERPRETATION__ELEMENTS = PARTIAL_TYPE_INTERPRATATION__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Scopes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_PRIMITIVE_INTERPRETATION__SCOPES = PARTIAL_TYPE_INTERPRATATION__SCOPES;

	/**
	 * The number of structural features of the '<em>Partial Primitive Interpretation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_PRIMITIVE_INTERPRETATION_FEATURE_COUNT = PARTIAL_TYPE_INTERPRATATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Partial Primitive Interpretation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_PRIMITIVE_INTERPRETATION_OPERATION_COUNT = PARTIAL_TYPE_INTERPRATATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialBooleanInterpretationImpl <em>Partial Boolean Interpretation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialBooleanInterpretationImpl
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialinterpretationPackageImpl#getPartialBooleanInterpretation()
	 * @generated
	 */
	int PARTIAL_BOOLEAN_INTERPRETATION = 17;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_BOOLEAN_INTERPRETATION__ELEMENTS = PARTIAL_PRIMITIVE_INTERPRETATION__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Scopes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_BOOLEAN_INTERPRETATION__SCOPES = PARTIAL_PRIMITIVE_INTERPRETATION__SCOPES;

	/**
	 * The number of structural features of the '<em>Partial Boolean Interpretation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_BOOLEAN_INTERPRETATION_FEATURE_COUNT = PARTIAL_PRIMITIVE_INTERPRETATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Partial Boolean Interpretation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_BOOLEAN_INTERPRETATION_OPERATION_COUNT = PARTIAL_PRIMITIVE_INTERPRETATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialIntegerInterpretationImpl <em>Partial Integer Interpretation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialIntegerInterpretationImpl
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialinterpretationPackageImpl#getPartialIntegerInterpretation()
	 * @generated
	 */
	int PARTIAL_INTEGER_INTERPRETATION = 18;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_INTEGER_INTERPRETATION__ELEMENTS = PARTIAL_PRIMITIVE_INTERPRETATION__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Scopes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_INTEGER_INTERPRETATION__SCOPES = PARTIAL_PRIMITIVE_INTERPRETATION__SCOPES;

	/**
	 * The number of structural features of the '<em>Partial Integer Interpretation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_INTEGER_INTERPRETATION_FEATURE_COUNT = PARTIAL_PRIMITIVE_INTERPRETATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Partial Integer Interpretation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_INTEGER_INTERPRETATION_OPERATION_COUNT = PARTIAL_PRIMITIVE_INTERPRETATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialRealInterpretationImpl <em>Partial Real Interpretation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialRealInterpretationImpl
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialinterpretationPackageImpl#getPartialRealInterpretation()
	 * @generated
	 */
	int PARTIAL_REAL_INTERPRETATION = 19;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_REAL_INTERPRETATION__ELEMENTS = PARTIAL_PRIMITIVE_INTERPRETATION__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Scopes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_REAL_INTERPRETATION__SCOPES = PARTIAL_PRIMITIVE_INTERPRETATION__SCOPES;

	/**
	 * The number of structural features of the '<em>Partial Real Interpretation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_REAL_INTERPRETATION_FEATURE_COUNT = PARTIAL_PRIMITIVE_INTERPRETATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Partial Real Interpretation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_REAL_INTERPRETATION_OPERATION_COUNT = PARTIAL_PRIMITIVE_INTERPRETATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialStringInterpretationImpl <em>Partial String Interpretation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialStringInterpretationImpl
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialinterpretationPackageImpl#getPartialStringInterpretation()
	 * @generated
	 */
	int PARTIAL_STRING_INTERPRETATION = 20;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_STRING_INTERPRETATION__ELEMENTS = PARTIAL_PRIMITIVE_INTERPRETATION__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Scopes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_STRING_INTERPRETATION__SCOPES = PARTIAL_PRIMITIVE_INTERPRETATION__SCOPES;

	/**
	 * The number of structural features of the '<em>Partial String Interpretation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_STRING_INTERPRETATION_FEATURE_COUNT = PARTIAL_PRIMITIVE_INTERPRETATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Partial String Interpretation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_STRING_INTERPRETATION_OPERATION_COUNT = PARTIAL_PRIMITIVE_INTERPRETATION_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialComplexTypeInterpretationImpl <em>Partial Complex Type Interpretation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialComplexTypeInterpretationImpl
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialinterpretationPackageImpl#getPartialComplexTypeInterpretation()
	 * @generated
	 */
	int PARTIAL_COMPLEX_TYPE_INTERPRETATION = 21;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_COMPLEX_TYPE_INTERPRETATION__ELEMENTS = PARTIAL_TYPE_INTERPRATATION__ELEMENTS;

	/**
	 * The feature id for the '<em><b>Scopes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_COMPLEX_TYPE_INTERPRETATION__SCOPES = PARTIAL_TYPE_INTERPRATATION__SCOPES;

	/**
	 * The feature id for the '<em><b>Supertype Interpretation</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_COMPLEX_TYPE_INTERPRETATION__SUPERTYPE_INTERPRETATION = PARTIAL_TYPE_INTERPRATATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interpretation Of</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_COMPLEX_TYPE_INTERPRETATION__INTERPRETATION_OF = PARTIAL_TYPE_INTERPRATATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Partial Complex Type Interpretation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_COMPLEX_TYPE_INTERPRETATION_FEATURE_COUNT = PARTIAL_TYPE_INTERPRATATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Partial Complex Type Interpretation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARTIAL_COMPLEX_TYPE_INTERPRETATION_OPERATION_COUNT = PARTIAL_TYPE_INTERPRATATION_OPERATION_COUNT + 0;


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
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getOpenWorldElements <em>Open World Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Open World Elements</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getOpenWorldElements()
	 * @see #getPartialInterpretation()
	 * @generated
	 */
	EReference getPartialInterpretation_OpenWorldElements();

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
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getScopes <em>Scopes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scopes</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getScopes()
	 * @see #getPartialInterpretation()
	 * @generated
	 */
	EReference getPartialInterpretation_Scopes();

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
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getMinNewElementsHeuristic <em>Min New Elements Heuristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min New Elements Heuristic</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation#getMinNewElementsHeuristic()
	 * @see #getPartialInterpretation()
	 * @generated
	 */
	EAttribute getPartialInterpretation_MinNewElementsHeuristic();

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
	 * Returns the meta object for the reference list '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialTypeInterpratation#getScopes <em>Scopes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Scopes</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialTypeInterpratation#getScopes()
	 * @see #getPartialTypeInterpratation()
	 * @generated
	 */
	EReference getPartialTypeInterpratation_Scopes();

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
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.NaryRelationLinkElement#getParam <em>Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Param</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.NaryRelationLinkElement#getParam()
	 * @see #getNaryRelationLinkElement()
	 * @generated
	 */
	EReference getNaryRelationLinkElement_Param();

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
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.Scope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scope</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.Scope
	 * @generated
	 */
	EClass getScope();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.Scope#getMinNewElements <em>Min New Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min New Elements</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.Scope#getMinNewElements()
	 * @see #getScope()
	 * @generated
	 */
	EAttribute getScope_MinNewElements();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.Scope#getMaxNewElements <em>Max New Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max New Elements</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.Scope#getMaxNewElements()
	 * @see #getScope()
	 * @generated
	 */
	EAttribute getScope_MaxNewElements();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.Scope#getTargetTypeInterpretation <em>Target Type Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target Type Interpretation</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.Scope#getTargetTypeInterpretation()
	 * @see #getScope()
	 * @generated
	 */
	EReference getScope_TargetTypeInterpretation();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.Scope#getMinNewElementsHeuristic <em>Min New Elements Heuristic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min New Elements Heuristic</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.Scope#getMinNewElementsHeuristic()
	 * @see #getScope()
	 * @generated
	 */
	EAttribute getScope_MinNewElementsHeuristic();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialPrimitiveInterpretation <em>Partial Primitive Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partial Primitive Interpretation</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialPrimitiveInterpretation
	 * @generated
	 */
	EClass getPartialPrimitiveInterpretation();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialBooleanInterpretation <em>Partial Boolean Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partial Boolean Interpretation</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialBooleanInterpretation
	 * @generated
	 */
	EClass getPartialBooleanInterpretation();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialIntegerInterpretation <em>Partial Integer Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partial Integer Interpretation</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialIntegerInterpretation
	 * @generated
	 */
	EClass getPartialIntegerInterpretation();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialRealInterpretation <em>Partial Real Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partial Real Interpretation</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialRealInterpretation
	 * @generated
	 */
	EClass getPartialRealInterpretation();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialStringInterpretation <em>Partial String Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partial String Interpretation</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialStringInterpretation
	 * @generated
	 */
	EClass getPartialStringInterpretation();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialComplexTypeInterpretation <em>Partial Complex Type Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Partial Complex Type Interpretation</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialComplexTypeInterpretation
	 * @generated
	 */
	EClass getPartialComplexTypeInterpretation();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialComplexTypeInterpretation#getSupertypeInterpretation <em>Supertype Interpretation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supertype Interpretation</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialComplexTypeInterpretation#getSupertypeInterpretation()
	 * @see #getPartialComplexTypeInterpretation()
	 * @generated
	 */
	EReference getPartialComplexTypeInterpretation_SupertypeInterpretation();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialComplexTypeInterpretation#getInterpretationOf <em>Interpretation Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Interpretation Of</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialComplexTypeInterpretation#getInterpretationOf()
	 * @see #getPartialComplexTypeInterpretation()
	 * @generated
	 */
	EReference getPartialComplexTypeInterpretation_InterpretationOf();

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
		 * The meta object literal for the '<em><b>Open World Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTIAL_INTERPRETATION__OPEN_WORLD_ELEMENTS = eINSTANCE.getPartialInterpretation_OpenWorldElements();

		/**
		 * The meta object literal for the '<em><b>Problem Conainer</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTIAL_INTERPRETATION__PROBLEM_CONAINER = eINSTANCE.getPartialInterpretation_ProblemConainer();

		/**
		 * The meta object literal for the '<em><b>Scopes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTIAL_INTERPRETATION__SCOPES = eINSTANCE.getPartialInterpretation_Scopes();

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
		 * The meta object literal for the '<em><b>Min New Elements Heuristic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARTIAL_INTERPRETATION__MIN_NEW_ELEMENTS_HEURISTIC = eINSTANCE.getPartialInterpretation_MinNewElementsHeuristic();

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
		 * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTIAL_TYPE_INTERPRATATION__ELEMENTS = eINSTANCE.getPartialTypeInterpratation_Elements();

		/**
		 * The meta object literal for the '<em><b>Scopes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTIAL_TYPE_INTERPRATATION__SCOPES = eINSTANCE.getPartialTypeInterpratation_Scopes();

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
		 * The meta object literal for the '<em><b>Param</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NARY_RELATION_LINK_ELEMENT__PARAM = eINSTANCE.getNaryRelationLinkElement_Param();

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

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.ScopeImpl <em>Scope</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.ScopeImpl
		 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialinterpretationPackageImpl#getScope()
		 * @generated
		 */
		EClass SCOPE = eINSTANCE.getScope();

		/**
		 * The meta object literal for the '<em><b>Min New Elements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCOPE__MIN_NEW_ELEMENTS = eINSTANCE.getScope_MinNewElements();

		/**
		 * The meta object literal for the '<em><b>Max New Elements</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCOPE__MAX_NEW_ELEMENTS = eINSTANCE.getScope_MaxNewElements();

		/**
		 * The meta object literal for the '<em><b>Target Type Interpretation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCOPE__TARGET_TYPE_INTERPRETATION = eINSTANCE.getScope_TargetTypeInterpretation();

		/**
		 * The meta object literal for the '<em><b>Min New Elements Heuristic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCOPE__MIN_NEW_ELEMENTS_HEURISTIC = eINSTANCE.getScope_MinNewElementsHeuristic();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialPrimitiveInterpretationImpl <em>Partial Primitive Interpretation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialPrimitiveInterpretationImpl
		 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialinterpretationPackageImpl#getPartialPrimitiveInterpretation()
		 * @generated
		 */
		EClass PARTIAL_PRIMITIVE_INTERPRETATION = eINSTANCE.getPartialPrimitiveInterpretation();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialBooleanInterpretationImpl <em>Partial Boolean Interpretation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialBooleanInterpretationImpl
		 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialinterpretationPackageImpl#getPartialBooleanInterpretation()
		 * @generated
		 */
		EClass PARTIAL_BOOLEAN_INTERPRETATION = eINSTANCE.getPartialBooleanInterpretation();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialIntegerInterpretationImpl <em>Partial Integer Interpretation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialIntegerInterpretationImpl
		 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialinterpretationPackageImpl#getPartialIntegerInterpretation()
		 * @generated
		 */
		EClass PARTIAL_INTEGER_INTERPRETATION = eINSTANCE.getPartialIntegerInterpretation();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialRealInterpretationImpl <em>Partial Real Interpretation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialRealInterpretationImpl
		 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialinterpretationPackageImpl#getPartialRealInterpretation()
		 * @generated
		 */
		EClass PARTIAL_REAL_INTERPRETATION = eINSTANCE.getPartialRealInterpretation();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialStringInterpretationImpl <em>Partial String Interpretation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialStringInterpretationImpl
		 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialinterpretationPackageImpl#getPartialStringInterpretation()
		 * @generated
		 */
		EClass PARTIAL_STRING_INTERPRETATION = eINSTANCE.getPartialStringInterpretation();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialComplexTypeInterpretationImpl <em>Partial Complex Type Interpretation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialComplexTypeInterpretationImpl
		 * @see hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.impl.PartialinterpretationPackageImpl#getPartialComplexTypeInterpretation()
		 * @generated
		 */
		EClass PARTIAL_COMPLEX_TYPE_INTERPRETATION = eINSTANCE.getPartialComplexTypeInterpretation();

		/**
		 * The meta object literal for the '<em><b>Supertype Interpretation</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTIAL_COMPLEX_TYPE_INTERPRETATION__SUPERTYPE_INTERPRETATION = eINSTANCE.getPartialComplexTypeInterpretation_SupertypeInterpretation();

		/**
		 * The meta object literal for the '<em><b>Interpretation Of</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARTIAL_COMPLEX_TYPE_INTERPRETATION__INTERPRETATION_OF = eINSTANCE.getPartialComplexTypeInterpretation_InterpretationOf();

	}

} //PartialinterpretationPackage
