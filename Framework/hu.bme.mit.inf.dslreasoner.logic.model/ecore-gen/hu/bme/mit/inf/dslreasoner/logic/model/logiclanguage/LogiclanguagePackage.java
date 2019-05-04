/**
 */
package hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage;

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
 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguageFactory
 * @model kind="package"
 * @generated
 */
public interface LogiclanguagePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "logiclanguage";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.bme.hu/mit/inf/dslreasoner/logic/model/language";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "language";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LogiclanguagePackage eINSTANCE = hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl.init();

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDescriptor <em>Type Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDescriptor
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getTypeDescriptor()
	 * @generated
	 */
	int TYPE_DESCRIPTOR = 40;

	/**
	 * The number of structural features of the '<em>Type Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DESCRIPTOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Type Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DESCRIPTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.TypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.TypeImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getType()
	 * @generated
	 */
	int TYPE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__NAME = TYPE_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Subtypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__SUBTYPES = TYPE_DESCRIPTOR_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Supertypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__SUPERTYPES = TYPE_DESCRIPTOR_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE__IS_ABSTRACT = TYPE_DESCRIPTOR_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_FEATURE_COUNT = TYPE_DESCRIPTOR_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_OPERATION_COUNT = TYPE_DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TermDescription <em>Term Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TermDescription
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getTermDescription()
	 * @generated
	 */
	int TERM_DESCRIPTION = 41;

	/**
	 * The number of structural features of the '<em>Term Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_DESCRIPTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Term Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_DESCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.SymbolicDeclarationImpl <em>Symbolic Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.SymbolicDeclarationImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getSymbolicDeclaration()
	 * @generated
	 */
	int SYMBOLIC_DECLARATION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOLIC_DECLARATION__NAME = TERM_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Symbolic Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOLIC_DECLARATION_FEATURE_COUNT = TERM_DESCRIPTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Symbolic Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOLIC_DECLARATION_OPERATION_COUNT = TERM_DESCRIPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.DefinedElementImpl <em>Defined Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.DefinedElementImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getDefinedElement()
	 * @generated
	 */
	int DEFINED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_ELEMENT__NAME = SYMBOLIC_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Defined In Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_ELEMENT__DEFINED_IN_TYPE = SYMBOLIC_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Defined Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_ELEMENT_FEATURE_COUNT = SYMBOLIC_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Defined Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFINED_ELEMENT_OPERATION_COUNT = SYMBOLIC_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.TypeDefinitionImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getTypeDefinition()
	 * @generated
	 */
	int TYPE_DEFINITION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Subtypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__SUBTYPES = TYPE__SUBTYPES;

	/**
	 * The feature id for the '<em><b>Supertypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__SUPERTYPES = TYPE__SUPERTYPES;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__IS_ABSTRACT = TYPE__IS_ABSTRACT;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__ELEMENTS = TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Defines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION__DEFINES = TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Type Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DEFINITION_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.TypeReferenceImpl <em>Type Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.TypeReferenceImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getTypeReference()
	 * @generated
	 */
	int TYPE_REFERENCE = 3;

	/**
	 * The number of structural features of the '<em>Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE_FEATURE_COUNT = TYPE_DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_REFERENCE_OPERATION_COUNT = TYPE_DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.ComplexTypeReferenceImpl <em>Complex Type Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.ComplexTypeReferenceImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getComplexTypeReference()
	 * @generated
	 */
	int COMPLEX_TYPE_REFERENCE = 4;

	/**
	 * The feature id for the '<em><b>Referred</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_REFERENCE__REFERRED = TYPE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Complex Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_REFERENCE_FEATURE_COUNT = TYPE_REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Complex Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPLEX_TYPE_REFERENCE_OPERATION_COUNT = TYPE_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.PrimitiveTypeReferenceImpl <em>Primitive Type Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.PrimitiveTypeReferenceImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getPrimitiveTypeReference()
	 * @generated
	 */
	int PRIMITIVE_TYPE_REFERENCE = 5;

	/**
	 * The number of structural features of the '<em>Primitive Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_REFERENCE_FEATURE_COUNT = TYPE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Primitive Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_TYPE_REFERENCE_OPERATION_COUNT = TYPE_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.IntTypeReferenceImpl <em>Int Type Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.IntTypeReferenceImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getIntTypeReference()
	 * @generated
	 */
	int INT_TYPE_REFERENCE = 6;

	/**
	 * The number of structural features of the '<em>Int Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_TYPE_REFERENCE_FEATURE_COUNT = PRIMITIVE_TYPE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Int Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_TYPE_REFERENCE_OPERATION_COUNT = PRIMITIVE_TYPE_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.BoolTypeReferenceImpl <em>Bool Type Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.BoolTypeReferenceImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getBoolTypeReference()
	 * @generated
	 */
	int BOOL_TYPE_REFERENCE = 7;

	/**
	 * The number of structural features of the '<em>Bool Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_TYPE_REFERENCE_FEATURE_COUNT = PRIMITIVE_TYPE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bool Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_TYPE_REFERENCE_OPERATION_COUNT = PRIMITIVE_TYPE_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.RealTypeReferenceImpl <em>Real Type Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.RealTypeReferenceImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getRealTypeReference()
	 * @generated
	 */
	int REAL_TYPE_REFERENCE = 8;

	/**
	 * The number of structural features of the '<em>Real Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE_REFERENCE_FEATURE_COUNT = PRIMITIVE_TYPE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Real Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_TYPE_REFERENCE_OPERATION_COUNT = PRIMITIVE_TYPE_REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.FunctionImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = SYMBOLIC_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__RANGE = SYMBOLIC_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__PARAMETERS = SYMBOLIC_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__ANNOTATIONS = SYMBOLIC_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = SYMBOLIC_DECLARATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = SYMBOLIC_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.TermImpl <em>Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.TermImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getTerm()
	 * @generated
	 */
	int TERM = 10;

	/**
	 * The number of structural features of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_FEATURE_COUNT = TERM_DESCRIPTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_OPERATION_COUNT = TERM_DESCRIPTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.SymbolicValueImpl <em>Symbolic Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.SymbolicValueImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getSymbolicValue()
	 * @generated
	 */
	int SYMBOLIC_VALUE = 12;

	/**
	 * The feature id for the '<em><b>Symbolic Reference</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOLIC_VALUE__SYMBOLIC_REFERENCE = TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter Substitutions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOLIC_VALUE__PARAMETER_SUBSTITUTIONS = TERM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Symbolic Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOLIC_VALUE_FEATURE_COUNT = TERM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Symbolic Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYMBOLIC_VALUE_OPERATION_COUNT = TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.AtomicTermImpl <em>Atomic Term</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.AtomicTermImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getAtomicTerm()
	 * @generated
	 */
	int ATOMIC_TERM = 13;

	/**
	 * The number of structural features of the '<em>Atomic Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_TERM_FEATURE_COUNT = TERM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Atomic Term</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATOMIC_TERM_OPERATION_COUNT = TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.IntLiteralImpl <em>Int Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.IntLiteralImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getIntLiteral()
	 * @generated
	 */
	int INT_LITERAL = 14;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_LITERAL__VALUE = ATOMIC_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Int Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_LITERAL_FEATURE_COUNT = ATOMIC_TERM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Int Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INT_LITERAL_OPERATION_COUNT = ATOMIC_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.BoolLiteralImpl <em>Bool Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.BoolLiteralImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getBoolLiteral()
	 * @generated
	 */
	int BOOL_LITERAL = 15;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_LITERAL__VALUE = ATOMIC_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Bool Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_LITERAL_FEATURE_COUNT = ATOMIC_TERM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Bool Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_LITERAL_OPERATION_COUNT = ATOMIC_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.RealLiteralImpl <em>Real Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.RealLiteralImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getRealLiteral()
	 * @generated
	 */
	int REAL_LITERAL = 16;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_LITERAL__VALUE = ATOMIC_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Real Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_LITERAL_FEATURE_COUNT = ATOMIC_TERM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Real Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REAL_LITERAL_OPERATION_COUNT = ATOMIC_TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.VariableImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 17;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = SYMBOLIC_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__RANGE = SYMBOLIC_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = SYMBOLIC_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_OPERATION_COUNT = SYMBOLIC_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.QuantifiedExpressionImpl <em>Quantified Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.QuantifiedExpressionImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getQuantifiedExpression()
	 * @generated
	 */
	int QUANTIFIED_EXPRESSION = 18;

	/**
	 * The feature id for the '<em><b>Quantified Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_EXPRESSION__QUANTIFIED_VARIABLES = TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_EXPRESSION__EXPRESSION = TERM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Quantified Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_EXPRESSION_FEATURE_COUNT = TERM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Quantified Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUANTIFIED_EXPRESSION_OPERATION_COUNT = TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.ExistsImpl <em>Exists</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.ExistsImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getExists()
	 * @generated
	 */
	int EXISTS = 19;

	/**
	 * The feature id for the '<em><b>Quantified Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS__QUANTIFIED_VARIABLES = QUANTIFIED_EXPRESSION__QUANTIFIED_VARIABLES;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS__EXPRESSION = QUANTIFIED_EXPRESSION__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Exists</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS_FEATURE_COUNT = QUANTIFIED_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Exists</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXISTS_OPERATION_COUNT = QUANTIFIED_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.ForallImpl <em>Forall</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.ForallImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getForall()
	 * @generated
	 */
	int FORALL = 20;

	/**
	 * The feature id for the '<em><b>Quantified Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORALL__QUANTIFIED_VARIABLES = QUANTIFIED_EXPRESSION__QUANTIFIED_VARIABLES;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORALL__EXPRESSION = QUANTIFIED_EXPRESSION__EXPRESSION;

	/**
	 * The number of structural features of the '<em>Forall</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORALL_FEATURE_COUNT = QUANTIFIED_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Forall</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORALL_OPERATION_COUNT = QUANTIFIED_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.BoolOperationImpl <em>Bool Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.BoolOperationImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getBoolOperation()
	 * @generated
	 */
	int BOOL_OPERATION = 21;

	/**
	 * The number of structural features of the '<em>Bool Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_OPERATION_FEATURE_COUNT = TERM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Bool Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOL_OPERATION_OPERATION_COUNT = TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.AndImpl <em>And</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.AndImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getAnd()
	 * @generated
	 */
	int AND = 22;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND__OPERANDS = BOOL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_FEATURE_COUNT = BOOL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>And</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AND_OPERATION_COUNT = BOOL_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.OrImpl <em>Or</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.OrImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getOr()
	 * @generated
	 */
	int OR = 23;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR__OPERANDS = BOOL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_FEATURE_COUNT = BOOL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Or</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OR_OPERATION_COUNT = BOOL_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.ImplImpl <em>Impl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.ImplImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getImpl()
	 * @generated
	 */
	int IMPL = 24;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL__LEFT_OPERAND = BOOL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL__RIGHT_OPERAND = BOOL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_FEATURE_COUNT = BOOL_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Impl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPL_OPERATION_COUNT = BOOL_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.NotImpl <em>Not</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.NotImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getNot()
	 * @generated
	 */
	int NOT = 25;

	/**
	 * The feature id for the '<em><b>Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT__OPERAND = BOOL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_FEATURE_COUNT = BOOL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Not</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOT_OPERATION_COUNT = BOOL_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.IffImpl <em>Iff</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.IffImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getIff()
	 * @generated
	 */
	int IFF = 26;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFF__LEFT_OPERAND = BOOL_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFF__RIGHT_OPERAND = BOOL_OPERATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Iff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFF_FEATURE_COUNT = BOOL_OPERATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Iff</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IFF_OPERATION_COUNT = BOOL_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.PrimitiveRelationImpl <em>Primitive Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.PrimitiveRelationImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getPrimitiveRelation()
	 * @generated
	 */
	int PRIMITIVE_RELATION = 27;

	/**
	 * The number of structural features of the '<em>Primitive Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_RELATION_FEATURE_COUNT = TERM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Primitive Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMITIVE_RELATION_OPERATION_COUNT = TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.EqualsImpl <em>Equals</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.EqualsImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getEquals()
	 * @generated
	 */
	int EQUALS = 28;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS__LEFT_OPERAND = PRIMITIVE_RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS__RIGHT_OPERAND = PRIMITIVE_RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Equals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_FEATURE_COUNT = PRIMITIVE_RELATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Equals</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EQUALS_OPERATION_COUNT = PRIMITIVE_RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.DistinctImpl <em>Distinct</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.DistinctImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getDistinct()
	 * @generated
	 */
	int DISTINCT = 29;

	/**
	 * The feature id for the '<em><b>Operands</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTINCT__OPERANDS = PRIMITIVE_RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Distinct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTINCT_FEATURE_COUNT = PRIMITIVE_RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Distinct</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISTINCT_OPERATION_COUNT = PRIMITIVE_RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LessThanImpl <em>Less Than</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LessThanImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getLessThan()
	 * @generated
	 */
	int LESS_THAN = 30;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN__LEFT_OPERAND = PRIMITIVE_RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN__RIGHT_OPERAND = PRIMITIVE_RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Less Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_FEATURE_COUNT = PRIMITIVE_RELATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Less Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_THAN_OPERATION_COUNT = PRIMITIVE_RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.MoreThanImpl <em>More Than</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.MoreThanImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getMoreThan()
	 * @generated
	 */
	int MORE_THAN = 31;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORE_THAN__LEFT_OPERAND = PRIMITIVE_RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORE_THAN__RIGHT_OPERAND = PRIMITIVE_RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>More Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORE_THAN_FEATURE_COUNT = PRIMITIVE_RELATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>More Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORE_THAN_OPERATION_COUNT = PRIMITIVE_RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LessOrEqualThanImpl <em>Less Or Equal Than</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LessOrEqualThanImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getLessOrEqualThan()
	 * @generated
	 */
	int LESS_OR_EQUAL_THAN = 32;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_OR_EQUAL_THAN__LEFT_OPERAND = PRIMITIVE_RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_OR_EQUAL_THAN__RIGHT_OPERAND = PRIMITIVE_RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Less Or Equal Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_OR_EQUAL_THAN_FEATURE_COUNT = PRIMITIVE_RELATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Less Or Equal Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LESS_OR_EQUAL_THAN_OPERATION_COUNT = PRIMITIVE_RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.MoreOrEqualThanImpl <em>More Or Equal Than</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.MoreOrEqualThanImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getMoreOrEqualThan()
	 * @generated
	 */
	int MORE_OR_EQUAL_THAN = 33;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORE_OR_EQUAL_THAN__LEFT_OPERAND = PRIMITIVE_RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORE_OR_EQUAL_THAN__RIGHT_OPERAND = PRIMITIVE_RELATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>More Or Equal Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORE_OR_EQUAL_THAN_FEATURE_COUNT = PRIMITIVE_RELATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>More Or Equal Than</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MORE_OR_EQUAL_THAN_OPERATION_COUNT = PRIMITIVE_RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.NumericOperationImpl <em>Numeric Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.NumericOperationImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getNumericOperation()
	 * @generated
	 */
	int NUMERIC_OPERATION = 34;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_OPERATION__LEFT_OPERAND = TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_OPERATION__RIGHT_OPERAND = TERM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Numeric Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_OPERATION_FEATURE_COUNT = TERM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Numeric Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMERIC_OPERATION_OPERATION_COUNT = TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.PlusImpl <em>Plus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.PlusImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getPlus()
	 * @generated
	 */
	int PLUS = 35;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS__LEFT_OPERAND = NUMERIC_OPERATION__LEFT_OPERAND;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS__RIGHT_OPERAND = NUMERIC_OPERATION__RIGHT_OPERAND;

	/**
	 * The number of structural features of the '<em>Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_FEATURE_COUNT = NUMERIC_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLUS_OPERATION_COUNT = NUMERIC_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.MinusImpl <em>Minus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.MinusImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getMinus()
	 * @generated
	 */
	int MINUS = 36;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS__LEFT_OPERAND = NUMERIC_OPERATION__LEFT_OPERAND;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS__RIGHT_OPERAND = NUMERIC_OPERATION__RIGHT_OPERAND;

	/**
	 * The number of structural features of the '<em>Minus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_FEATURE_COUNT = NUMERIC_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Minus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MINUS_OPERATION_COUNT = NUMERIC_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.MultiplyImpl <em>Multiply</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.MultiplyImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getMultiply()
	 * @generated
	 */
	int MULTIPLY = 37;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLY__LEFT_OPERAND = NUMERIC_OPERATION__LEFT_OPERAND;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLY__RIGHT_OPERAND = NUMERIC_OPERATION__RIGHT_OPERAND;

	/**
	 * The number of structural features of the '<em>Multiply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLY_FEATURE_COUNT = NUMERIC_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Multiply</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTIPLY_OPERATION_COUNT = NUMERIC_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.DivisonImpl <em>Divison</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.DivisonImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getDivison()
	 * @generated
	 */
	int DIVISON = 38;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISON__LEFT_OPERAND = NUMERIC_OPERATION__LEFT_OPERAND;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISON__RIGHT_OPERAND = NUMERIC_OPERATION__RIGHT_OPERAND;

	/**
	 * The number of structural features of the '<em>Divison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISON_FEATURE_COUNT = NUMERIC_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Divison</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DIVISON_OPERATION_COUNT = NUMERIC_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.ModImpl <em>Mod</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.ModImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getMod()
	 * @generated
	 */
	int MOD = 39;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOD__LEFT_OPERAND = NUMERIC_OPERATION__LEFT_OPERAND;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOD__RIGHT_OPERAND = NUMERIC_OPERATION__RIGHT_OPERAND;

	/**
	 * The number of structural features of the '<em>Mod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOD_FEATURE_COUNT = NUMERIC_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Mod</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOD_OPERATION_COUNT = NUMERIC_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.AssertionImpl <em>Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.AssertionImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getAssertion()
	 * @generated
	 */
	int ASSERTION = 42;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__NAME = 1;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__ANNOTATIONS = 2;

	/**
	 * The number of structural features of the '<em>Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.RelationImpl <em>Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.RelationImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getRelation()
	 * @generated
	 */
	int RELATION = 43;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__NAME = SYMBOLIC_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__PARAMETERS = SYMBOLIC_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION__ANNOTATIONS = SYMBOLIC_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_FEATURE_COUNT = SYMBOLIC_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_OPERATION_COUNT = SYMBOLIC_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.ConstantImpl <em>Constant</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.ConstantImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getConstant()
	 * @generated
	 */
	int CONSTANT = 44;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__NAME = SYMBOLIC_DECLARATION__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__TYPE = SYMBOLIC_DECLARATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT__ANNOTATIONS = SYMBOLIC_DECLARATION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_FEATURE_COUNT = SYMBOLIC_DECLARATION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Constant</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_OPERATION_COUNT = SYMBOLIC_DECLARATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.ConstantDefinitionImpl <em>Constant Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.ConstantDefinitionImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getConstantDefinition()
	 * @generated
	 */
	int CONSTANT_DEFINITION = 45;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_DEFINITION__NAME = CONSTANT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_DEFINITION__TYPE = CONSTANT__TYPE;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_DEFINITION__ANNOTATIONS = CONSTANT__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_DEFINITION__VALUE = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Defines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_DEFINITION__DEFINES = CONSTANT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Constant Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_DEFINITION_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Constant Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_DEFINITION_OPERATION_COUNT = CONSTANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.RelationDefinitionImpl <em>Relation Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.RelationDefinitionImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getRelationDefinition()
	 * @generated
	 */
	int RELATION_DEFINITION = 46;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DEFINITION__NAME = RELATION__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DEFINITION__PARAMETERS = RELATION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DEFINITION__ANNOTATIONS = RELATION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DEFINITION__VARIABLES = RELATION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DEFINITION__VALUE = RELATION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Defines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DEFINITION__DEFINES = RELATION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Relation Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DEFINITION_FEATURE_COUNT = RELATION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Relation Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DEFINITION_OPERATION_COUNT = RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.FunctionDefinitionImpl <em>Function Definition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.FunctionDefinitionImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getFunctionDefinition()
	 * @generated
	 */
	int FUNCTION_DEFINITION = 47;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__NAME = FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__RANGE = FUNCTION__RANGE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__PARAMETERS = FUNCTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__ANNOTATIONS = FUNCTION__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__VARIABLE = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Defines</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__DEFINES = FUNCTION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION__VALUE = FUNCTION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Function Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Function Definition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DEFINITION_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.IfThenElseImpl <em>If Then Else</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.IfThenElseImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getIfThenElse()
	 * @generated
	 */
	int IF_THEN_ELSE = 48;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE__CONDITION = TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>If True</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE__IF_TRUE = TERM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>If False</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE__IF_FALSE = TERM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>If Then Else</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE_FEATURE_COUNT = TERM_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>If Then Else</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IF_THEN_ELSE_OPERATION_COUNT = TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.ConstantDeclarationImpl <em>Constant Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.ConstantDeclarationImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getConstantDeclaration()
	 * @generated
	 */
	int CONSTANT_DECLARATION = 49;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_DECLARATION__NAME = CONSTANT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_DECLARATION__TYPE = CONSTANT__TYPE;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_DECLARATION__ANNOTATIONS = CONSTANT__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Constant Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_DECLARATION_FEATURE_COUNT = CONSTANT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Constant Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTANT_DECLARATION_OPERATION_COUNT = CONSTANT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.RelationDeclarationImpl <em>Relation Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.RelationDeclarationImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getRelationDeclaration()
	 * @generated
	 */
	int RELATION_DECLARATION = 50;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DECLARATION__NAME = RELATION__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DECLARATION__PARAMETERS = RELATION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DECLARATION__ANNOTATIONS = RELATION__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Relation Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DECLARATION_FEATURE_COUNT = RELATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Relation Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATION_DECLARATION_OPERATION_COUNT = RELATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.FunctionDeclarationImpl <em>Function Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.FunctionDeclarationImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getFunctionDeclaration()
	 * @generated
	 */
	int FUNCTION_DECLARATION = 51;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__NAME = FUNCTION__NAME;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__RANGE = FUNCTION__RANGE;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__PARAMETERS = FUNCTION__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION__ANNOTATIONS = FUNCTION__ANNOTATIONS;

	/**
	 * The number of structural features of the '<em>Function Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION_FEATURE_COUNT = FUNCTION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Function Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_DECLARATION_OPERATION_COUNT = FUNCTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.TypeDeclarationImpl <em>Type Declaration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.TypeDeclarationImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getTypeDeclaration()
	 * @generated
	 */
	int TYPE_DECLARATION = 52;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__NAME = TYPE__NAME;

	/**
	 * The feature id for the '<em><b>Subtypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__SUBTYPES = TYPE__SUBTYPES;

	/**
	 * The feature id for the '<em><b>Supertypes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__SUPERTYPES = TYPE__SUPERTYPES;

	/**
	 * The feature id for the '<em><b>Is Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION__IS_ABSTRACT = TYPE__IS_ABSTRACT;

	/**
	 * The number of structural features of the '<em>Type Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Type Declaration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_DECLARATION_OPERATION_COUNT = TYPE_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.UnknownBecauseUninterpretedImpl <em>Unknown Because Uninterpreted</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.UnknownBecauseUninterpretedImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getUnknownBecauseUninterpreted()
	 * @generated
	 */
	int UNKNOWN_BECAUSE_UNINTERPRETED = 53;

	/**
	 * The number of structural features of the '<em>Unknown Because Uninterpreted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_BECAUSE_UNINTERPRETED_FEATURE_COUNT = TERM_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Unknown Because Uninterpreted</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNKNOWN_BECAUSE_UNINTERPRETED_OPERATION_COUNT = TERM_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.InstanceOfImpl <em>Instance Of</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.InstanceOfImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getInstanceOf()
	 * @generated
	 */
	int INSTANCE_OF = 54;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OF__VALUE = TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OF__RANGE = TERM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Instance Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OF_FEATURE_COUNT = TERM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Instance Of</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTANCE_OF_OPERATION_COUNT = TERM_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.StringTypeReferenceImpl <em>String Type Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.StringTypeReferenceImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getStringTypeReference()
	 * @generated
	 */
	int STRING_TYPE_REFERENCE = 55;

	/**
	 * The number of structural features of the '<em>String Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE_REFERENCE_FEATURE_COUNT = PRIMITIVE_TYPE_REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>String Type Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_TYPE_REFERENCE_OPERATION_COUNT = PRIMITIVE_TYPE_REFERENCE_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.StringLiteralImpl <em>String Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.StringLiteralImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getStringLiteral()
	 * @generated
	 */
	int STRING_LITERAL = 56;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL__VALUE = ATOMIC_TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_FEATURE_COUNT = ATOMIC_TERM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_LITERAL_OPERATION_COUNT = ATOMIC_TERM_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.TransitiveClosureImpl <em>Transitive Closure</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.TransitiveClosureImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getTransitiveClosure()
	 * @generated
	 */
	int TRANSITIVE_CLOSURE = 57;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITIVE_CLOSURE__LEFT_OPERAND = TERM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITIVE_CLOSURE__RIGHT_OPERAND = TERM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITIVE_CLOSURE__RELATION = TERM_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Transitive Closure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITIVE_CLOSURE_FEATURE_COUNT = TERM_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Transitive Closure</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITIVE_CLOSURE_OPERATION_COUNT = TERM_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.PowImpl <em>Pow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.PowImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getPow()
	 * @generated
	 */
	int POW = 58;

	/**
	 * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POW__LEFT_OPERAND = NUMERIC_OPERATION__LEFT_OPERAND;

	/**
	 * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POW__RIGHT_OPERAND = NUMERIC_OPERATION__RIGHT_OPERAND;

	/**
	 * The number of structural features of the '<em>Pow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POW_FEATURE_COUNT = NUMERIC_OPERATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Pow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POW_OPERATION_COUNT = NUMERIC_OPERATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.AggregateExpressionImpl <em>Aggregate Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.AggregateExpressionImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getAggregateExpression()
	 * @generated
	 */
	int AGGREGATE_EXPRESSION = 59;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_EXPRESSION__RELATION = TERM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Aggregate Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_EXPRESSION_FEATURE_COUNT = TERM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Aggregate Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATE_EXPRESSION_OPERATION_COUNT = TERM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.ProjectedAggregateExpressionImpl <em>Projected Aggregate Expression</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.ProjectedAggregateExpressionImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getProjectedAggregateExpression()
	 * @generated
	 */
	int PROJECTED_AGGREGATE_EXPRESSION = 64;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTED_AGGREGATE_EXPRESSION__RELATION = AGGREGATE_EXPRESSION__RELATION;

	/**
	 * The feature id for the '<em><b>Projection Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTED_AGGREGATE_EXPRESSION__PROJECTION_INDEX = AGGREGATE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Projected Aggregate Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTED_AGGREGATE_EXPRESSION_FEATURE_COUNT = AGGREGATE_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Projected Aggregate Expression</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECTED_AGGREGATE_EXPRESSION_OPERATION_COUNT = AGGREGATE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.SumImpl <em>Sum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.SumImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getSum()
	 * @generated
	 */
	int SUM = 60;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM__RELATION = PROJECTED_AGGREGATE_EXPRESSION__RELATION;

	/**
	 * The feature id for the '<em><b>Projection Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM__PROJECTION_INDEX = PROJECTED_AGGREGATE_EXPRESSION__PROJECTION_INDEX;

	/**
	 * The number of structural features of the '<em>Sum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_FEATURE_COUNT = PROJECTED_AGGREGATE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Sum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUM_OPERATION_COUNT = PROJECTED_AGGREGATE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.CountImpl <em>Count</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.CountImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getCount()
	 * @generated
	 */
	int COUNT = 61;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT__RELATION = AGGREGATE_EXPRESSION__RELATION;

	/**
	 * The number of structural features of the '<em>Count</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_FEATURE_COUNT = AGGREGATE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Count</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNT_OPERATION_COUNT = AGGREGATE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.MinImpl <em>Min</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.MinImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getMin()
	 * @generated
	 */
	int MIN = 62;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN__RELATION = PROJECTED_AGGREGATE_EXPRESSION__RELATION;

	/**
	 * The feature id for the '<em><b>Projection Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN__PROJECTION_INDEX = PROJECTED_AGGREGATE_EXPRESSION__PROJECTION_INDEX;

	/**
	 * The number of structural features of the '<em>Min</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_FEATURE_COUNT = PROJECTED_AGGREGATE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Min</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MIN_OPERATION_COUNT = PROJECTED_AGGREGATE_EXPRESSION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.MaxImpl <em>Max</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.MaxImpl
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getMax()
	 * @generated
	 */
	int MAX = 63;

	/**
	 * The feature id for the '<em><b>Relation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX__RELATION = PROJECTED_AGGREGATE_EXPRESSION__RELATION;

	/**
	 * The feature id for the '<em><b>Projection Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX__PROJECTION_INDEX = PROJECTED_AGGREGATE_EXPRESSION__PROJECTION_INDEX;

	/**
	 * The number of structural features of the '<em>Max</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_FEATURE_COUNT = PROJECTED_AGGREGATE_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Max</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAX_OPERATION_COUNT = PROJECTED_AGGREGATE_EXPRESSION_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
	 * @generated
	 */
	EClass getType();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type#getName()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_Name();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type#getSubtypes <em>Subtypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Subtypes</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type#getSubtypes()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Subtypes();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type#getSupertypes <em>Supertypes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supertypes</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type#getSupertypes()
	 * @see #getType()
	 * @generated
	 */
	EReference getType_Supertypes();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type#isIsAbstract <em>Is Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Abstract</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type#isIsAbstract()
	 * @see #getType()
	 * @generated
	 */
	EAttribute getType_IsAbstract();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement <em>Defined Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Defined Element</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement
	 * @generated
	 */
	EClass getDefinedElement();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement#getDefinedInType <em>Defined In Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Defined In Type</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement#getDefinedInType()
	 * @see #getDefinedElement()
	 * @generated
	 */
	EReference getDefinedElement_DefinedInType();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDefinition <em>Type Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Definition</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDefinition
	 * @generated
	 */
	EClass getTypeDefinition();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDefinition#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Elements</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDefinition#getElements()
	 * @see #getTypeDefinition()
	 * @generated
	 */
	EReference getTypeDefinition_Elements();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDefinition#getDefines <em>Defines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Defines</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDefinition#getDefines()
	 * @see #getTypeDefinition()
	 * @generated
	 */
	EReference getTypeDefinition_Defines();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeReference <em>Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Reference</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeReference
	 * @generated
	 */
	EClass getTypeReference();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ComplexTypeReference <em>Complex Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Complex Type Reference</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ComplexTypeReference
	 * @generated
	 */
	EClass getComplexTypeReference();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ComplexTypeReference#getReferred <em>Referred</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Referred</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ComplexTypeReference#getReferred()
	 * @see #getComplexTypeReference()
	 * @generated
	 */
	EReference getComplexTypeReference_Referred();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.PrimitiveTypeReference <em>Primitive Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Type Reference</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.PrimitiveTypeReference
	 * @generated
	 */
	EClass getPrimitiveTypeReference();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.IntTypeReference <em>Int Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Type Reference</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.IntTypeReference
	 * @generated
	 */
	EClass getIntTypeReference();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.BoolTypeReference <em>Bool Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bool Type Reference</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.BoolTypeReference
	 * @generated
	 */
	EClass getBoolTypeReference();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RealTypeReference <em>Real Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Type Reference</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RealTypeReference
	 * @generated
	 */
	EClass getRealTypeReference();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Function#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Function#getRange()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Range();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Function#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Function#getParameters()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Parameters();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Function#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Annotations</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Function#getAnnotations()
	 * @see #getFunction()
	 * @generated
	 */
	EReference getFunction_Annotations();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Term <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Term
	 * @generated
	 */
	EClass getTerm();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.SymbolicDeclaration <em>Symbolic Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symbolic Declaration</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.SymbolicDeclaration
	 * @generated
	 */
	EClass getSymbolicDeclaration();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.SymbolicDeclaration#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.SymbolicDeclaration#getName()
	 * @see #getSymbolicDeclaration()
	 * @generated
	 */
	EAttribute getSymbolicDeclaration_Name();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.SymbolicValue <em>Symbolic Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Symbolic Value</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.SymbolicValue
	 * @generated
	 */
	EClass getSymbolicValue();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.SymbolicValue#getSymbolicReference <em>Symbolic Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Symbolic Reference</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.SymbolicValue#getSymbolicReference()
	 * @see #getSymbolicValue()
	 * @generated
	 */
	EReference getSymbolicValue_SymbolicReference();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.SymbolicValue#getParameterSubstitutions <em>Parameter Substitutions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter Substitutions</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.SymbolicValue#getParameterSubstitutions()
	 * @see #getSymbolicValue()
	 * @generated
	 */
	EReference getSymbolicValue_ParameterSubstitutions();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.AtomicTerm <em>Atomic Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Atomic Term</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.AtomicTerm
	 * @generated
	 */
	EClass getAtomicTerm();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.IntLiteral <em>Int Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Int Literal</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.IntLiteral
	 * @generated
	 */
	EClass getIntLiteral();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.IntLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.IntLiteral#getValue()
	 * @see #getIntLiteral()
	 * @generated
	 */
	EAttribute getIntLiteral_Value();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.BoolLiteral <em>Bool Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bool Literal</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.BoolLiteral
	 * @generated
	 */
	EClass getBoolLiteral();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.BoolLiteral#isValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.BoolLiteral#isValue()
	 * @see #getBoolLiteral()
	 * @generated
	 */
	EAttribute getBoolLiteral_Value();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RealLiteral <em>Real Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Real Literal</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RealLiteral
	 * @generated
	 */
	EClass getRealLiteral();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RealLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RealLiteral#getValue()
	 * @see #getRealLiteral()
	 * @generated
	 */
	EAttribute getRealLiteral_Value();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Variable#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Variable#getRange()
	 * @see #getVariable()
	 * @generated
	 */
	EReference getVariable_Range();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.QuantifiedExpression <em>Quantified Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Quantified Expression</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.QuantifiedExpression
	 * @generated
	 */
	EClass getQuantifiedExpression();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.QuantifiedExpression#getQuantifiedVariables <em>Quantified Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Quantified Variables</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.QuantifiedExpression#getQuantifiedVariables()
	 * @see #getQuantifiedExpression()
	 * @generated
	 */
	EReference getQuantifiedExpression_QuantifiedVariables();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.QuantifiedExpression#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.QuantifiedExpression#getExpression()
	 * @see #getQuantifiedExpression()
	 * @generated
	 */
	EReference getQuantifiedExpression_Expression();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Exists <em>Exists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exists</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Exists
	 * @generated
	 */
	EClass getExists();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Forall <em>Forall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Forall</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Forall
	 * @generated
	 */
	EClass getForall();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.BoolOperation <em>Bool Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bool Operation</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.BoolOperation
	 * @generated
	 */
	EClass getBoolOperation();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.And <em>And</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>And</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.And
	 * @generated
	 */
	EClass getAnd();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.And#getOperands <em>Operands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operands</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.And#getOperands()
	 * @see #getAnd()
	 * @generated
	 */
	EReference getAnd_Operands();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Or <em>Or</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Or</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Or
	 * @generated
	 */
	EClass getOr();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Or#getOperands <em>Operands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operands</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Or#getOperands()
	 * @see #getOr()
	 * @generated
	 */
	EReference getOr_Operands();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Impl <em>Impl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Impl</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Impl
	 * @generated
	 */
	EClass getImpl();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Impl#getLeftOperand <em>Left Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Operand</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Impl#getLeftOperand()
	 * @see #getImpl()
	 * @generated
	 */
	EReference getImpl_LeftOperand();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Impl#getRightOperand <em>Right Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Operand</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Impl#getRightOperand()
	 * @see #getImpl()
	 * @generated
	 */
	EReference getImpl_RightOperand();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Not <em>Not</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Not</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Not
	 * @generated
	 */
	EClass getNot();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Not#getOperand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Operand</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Not#getOperand()
	 * @see #getNot()
	 * @generated
	 */
	EReference getNot_Operand();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Iff <em>Iff</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iff</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Iff
	 * @generated
	 */
	EClass getIff();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Iff#getLeftOperand <em>Left Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Operand</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Iff#getLeftOperand()
	 * @see #getIff()
	 * @generated
	 */
	EReference getIff_LeftOperand();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Iff#getRightOperand <em>Right Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Operand</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Iff#getRightOperand()
	 * @see #getIff()
	 * @generated
	 */
	EReference getIff_RightOperand();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.PrimitiveRelation <em>Primitive Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primitive Relation</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.PrimitiveRelation
	 * @generated
	 */
	EClass getPrimitiveRelation();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Equals <em>Equals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Equals</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Equals
	 * @generated
	 */
	EClass getEquals();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Equals#getLeftOperand <em>Left Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Operand</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Equals#getLeftOperand()
	 * @see #getEquals()
	 * @generated
	 */
	EReference getEquals_LeftOperand();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Equals#getRightOperand <em>Right Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Operand</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Equals#getRightOperand()
	 * @see #getEquals()
	 * @generated
	 */
	EReference getEquals_RightOperand();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Distinct <em>Distinct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Distinct</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Distinct
	 * @generated
	 */
	EClass getDistinct();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Distinct#getOperands <em>Operands</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operands</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Distinct#getOperands()
	 * @see #getDistinct()
	 * @generated
	 */
	EReference getDistinct_Operands();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LessThan <em>Less Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less Than</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LessThan
	 * @generated
	 */
	EClass getLessThan();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LessThan#getLeftOperand <em>Left Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Operand</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LessThan#getLeftOperand()
	 * @see #getLessThan()
	 * @generated
	 */
	EReference getLessThan_LeftOperand();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LessThan#getRightOperand <em>Right Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Operand</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LessThan#getRightOperand()
	 * @see #getLessThan()
	 * @generated
	 */
	EReference getLessThan_RightOperand();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.MoreThan <em>More Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>More Than</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.MoreThan
	 * @generated
	 */
	EClass getMoreThan();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.MoreThan#getLeftOperand <em>Left Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Operand</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.MoreThan#getLeftOperand()
	 * @see #getMoreThan()
	 * @generated
	 */
	EReference getMoreThan_LeftOperand();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.MoreThan#getRightOperand <em>Right Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Operand</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.MoreThan#getRightOperand()
	 * @see #getMoreThan()
	 * @generated
	 */
	EReference getMoreThan_RightOperand();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LessOrEqualThan <em>Less Or Equal Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Less Or Equal Than</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LessOrEqualThan
	 * @generated
	 */
	EClass getLessOrEqualThan();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LessOrEqualThan#getLeftOperand <em>Left Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Operand</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LessOrEqualThan#getLeftOperand()
	 * @see #getLessOrEqualThan()
	 * @generated
	 */
	EReference getLessOrEqualThan_LeftOperand();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LessOrEqualThan#getRightOperand <em>Right Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Operand</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LessOrEqualThan#getRightOperand()
	 * @see #getLessOrEqualThan()
	 * @generated
	 */
	EReference getLessOrEqualThan_RightOperand();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.MoreOrEqualThan <em>More Or Equal Than</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>More Or Equal Than</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.MoreOrEqualThan
	 * @generated
	 */
	EClass getMoreOrEqualThan();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.MoreOrEqualThan#getLeftOperand <em>Left Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Operand</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.MoreOrEqualThan#getLeftOperand()
	 * @see #getMoreOrEqualThan()
	 * @generated
	 */
	EReference getMoreOrEqualThan_LeftOperand();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.MoreOrEqualThan#getRightOperand <em>Right Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Operand</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.MoreOrEqualThan#getRightOperand()
	 * @see #getMoreOrEqualThan()
	 * @generated
	 */
	EReference getMoreOrEqualThan_RightOperand();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.NumericOperation <em>Numeric Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Numeric Operation</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.NumericOperation
	 * @generated
	 */
	EClass getNumericOperation();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.NumericOperation#getLeftOperand <em>Left Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Operand</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.NumericOperation#getLeftOperand()
	 * @see #getNumericOperation()
	 * @generated
	 */
	EReference getNumericOperation_LeftOperand();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.NumericOperation#getRightOperand <em>Right Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Operand</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.NumericOperation#getRightOperand()
	 * @see #getNumericOperation()
	 * @generated
	 */
	EReference getNumericOperation_RightOperand();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Plus <em>Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Plus</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Plus
	 * @generated
	 */
	EClass getPlus();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Minus <em>Minus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Minus</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Minus
	 * @generated
	 */
	EClass getMinus();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Multiply <em>Multiply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Multiply</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Multiply
	 * @generated
	 */
	EClass getMultiply();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Divison <em>Divison</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Divison</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Divison
	 * @generated
	 */
	EClass getDivison();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Mod <em>Mod</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mod</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Mod
	 * @generated
	 */
	EClass getMod();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDescriptor <em>Type Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Descriptor</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDescriptor
	 * @generated
	 */
	EClass getTypeDescriptor();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TermDescription <em>Term Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term Description</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TermDescription
	 * @generated
	 */
	EClass getTermDescription();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Assertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assertion</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Assertion
	 * @generated
	 */
	EClass getAssertion();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Assertion#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Assertion#getValue()
	 * @see #getAssertion()
	 * @generated
	 */
	EReference getAssertion_Value();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Assertion#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Assertion#getName()
	 * @see #getAssertion()
	 * @generated
	 */
	EAttribute getAssertion_Name();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Assertion#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Annotations</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Assertion#getAnnotations()
	 * @see #getAssertion()
	 * @generated
	 */
	EReference getAssertion_Annotations();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Relation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Relation
	 * @generated
	 */
	EClass getRelation();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Relation#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Relation#getParameters()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Parameters();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Relation#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Annotations</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Relation#getAnnotations()
	 * @see #getRelation()
	 * @generated
	 */
	EReference getRelation_Annotations();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Constant <em>Constant</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Constant
	 * @generated
	 */
	EClass getConstant();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Constant#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Constant#getType()
	 * @see #getConstant()
	 * @generated
	 */
	EReference getConstant_Type();

	/**
	 * Returns the meta object for the reference list '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Constant#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Annotations</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Constant#getAnnotations()
	 * @see #getConstant()
	 * @generated
	 */
	EReference getConstant_Annotations();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ConstantDefinition <em>Constant Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant Definition</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ConstantDefinition
	 * @generated
	 */
	EClass getConstantDefinition();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ConstantDefinition#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ConstantDefinition#getValue()
	 * @see #getConstantDefinition()
	 * @generated
	 */
	EReference getConstantDefinition_Value();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ConstantDefinition#getDefines <em>Defines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Defines</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ConstantDefinition#getDefines()
	 * @see #getConstantDefinition()
	 * @generated
	 */
	EReference getConstantDefinition_Defines();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDefinition <em>Relation Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Definition</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDefinition
	 * @generated
	 */
	EClass getRelationDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDefinition#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDefinition#getVariables()
	 * @see #getRelationDefinition()
	 * @generated
	 */
	EReference getRelationDefinition_Variables();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDefinition#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDefinition#getValue()
	 * @see #getRelationDefinition()
	 * @generated
	 */
	EReference getRelationDefinition_Value();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDefinition#getDefines <em>Defines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Defines</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDefinition#getDefines()
	 * @see #getRelationDefinition()
	 * @generated
	 */
	EReference getRelationDefinition_Defines();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.FunctionDefinition <em>Function Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Definition</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.FunctionDefinition
	 * @generated
	 */
	EClass getFunctionDefinition();

	/**
	 * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.FunctionDefinition#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variable</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.FunctionDefinition#getVariable()
	 * @see #getFunctionDefinition()
	 * @generated
	 */
	EReference getFunctionDefinition_Variable();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.FunctionDefinition#getDefines <em>Defines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Defines</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.FunctionDefinition#getDefines()
	 * @see #getFunctionDefinition()
	 * @generated
	 */
	EReference getFunctionDefinition_Defines();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.FunctionDefinition#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.FunctionDefinition#getValue()
	 * @see #getFunctionDefinition()
	 * @generated
	 */
	EReference getFunctionDefinition_Value();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.IfThenElse <em>If Then Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>If Then Else</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.IfThenElse
	 * @generated
	 */
	EClass getIfThenElse();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.IfThenElse#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.IfThenElse#getCondition()
	 * @see #getIfThenElse()
	 * @generated
	 */
	EReference getIfThenElse_Condition();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.IfThenElse#getIfTrue <em>If True</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If True</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.IfThenElse#getIfTrue()
	 * @see #getIfThenElse()
	 * @generated
	 */
	EReference getIfThenElse_IfTrue();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.IfThenElse#getIfFalse <em>If False</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If False</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.IfThenElse#getIfFalse()
	 * @see #getIfThenElse()
	 * @generated
	 */
	EReference getIfThenElse_IfFalse();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ConstantDeclaration <em>Constant Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constant Declaration</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ConstantDeclaration
	 * @generated
	 */
	EClass getConstantDeclaration();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration <em>Relation Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relation Declaration</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration
	 * @generated
	 */
	EClass getRelationDeclaration();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.FunctionDeclaration <em>Function Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Declaration</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.FunctionDeclaration
	 * @generated
	 */
	EClass getFunctionDeclaration();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDeclaration <em>Type Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Declaration</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDeclaration
	 * @generated
	 */
	EClass getTypeDeclaration();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.UnknownBecauseUninterpreted <em>Unknown Because Uninterpreted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unknown Because Uninterpreted</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.UnknownBecauseUninterpreted
	 * @generated
	 */
	EClass getUnknownBecauseUninterpreted();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.InstanceOf <em>Instance Of</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Instance Of</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.InstanceOf
	 * @generated
	 */
	EClass getInstanceOf();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.InstanceOf#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.InstanceOf#getValue()
	 * @see #getInstanceOf()
	 * @generated
	 */
	EReference getInstanceOf_Value();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.InstanceOf#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.InstanceOf#getRange()
	 * @see #getInstanceOf()
	 * @generated
	 */
	EReference getInstanceOf_Range();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.StringTypeReference <em>String Type Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Type Reference</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.StringTypeReference
	 * @generated
	 */
	EClass getStringTypeReference();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.StringLiteral <em>String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Literal</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.StringLiteral
	 * @generated
	 */
	EClass getStringLiteral();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.StringLiteral#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.StringLiteral#getValue()
	 * @see #getStringLiteral()
	 * @generated
	 */
	EAttribute getStringLiteral_Value();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TransitiveClosure <em>Transitive Closure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transitive Closure</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TransitiveClosure
	 * @generated
	 */
	EClass getTransitiveClosure();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TransitiveClosure#getLeftOperand <em>Left Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Operand</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TransitiveClosure#getLeftOperand()
	 * @see #getTransitiveClosure()
	 * @generated
	 */
	EReference getTransitiveClosure_LeftOperand();

	/**
	 * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TransitiveClosure#getRightOperand <em>Right Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Operand</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TransitiveClosure#getRightOperand()
	 * @see #getTransitiveClosure()
	 * @generated
	 */
	EReference getTransitiveClosure_RightOperand();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TransitiveClosure#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relation</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TransitiveClosure#getRelation()
	 * @see #getTransitiveClosure()
	 * @generated
	 */
	EReference getTransitiveClosure_Relation();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Pow <em>Pow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pow</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Pow
	 * @generated
	 */
	EClass getPow();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.AggregateExpression <em>Aggregate Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregate Expression</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.AggregateExpression
	 * @generated
	 */
	EClass getAggregateExpression();

	/**
	 * Returns the meta object for the reference '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.AggregateExpression#getRelation <em>Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Relation</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.AggregateExpression#getRelation()
	 * @see #getAggregateExpression()
	 * @generated
	 */
	EReference getAggregateExpression_Relation();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Sum <em>Sum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sum</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Sum
	 * @generated
	 */
	EClass getSum();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Count <em>Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Count</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Count
	 * @generated
	 */
	EClass getCount();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Min <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Min</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Min
	 * @generated
	 */
	EClass getMin();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Max <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Max</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Max
	 * @generated
	 */
	EClass getMax();

	/**
	 * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ProjectedAggregateExpression <em>Projected Aggregate Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Projected Aggregate Expression</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ProjectedAggregateExpression
	 * @generated
	 */
	EClass getProjectedAggregateExpression();

	/**
	 * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ProjectedAggregateExpression#getProjectionIndex <em>Projection Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Projection Index</em>'.
	 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ProjectedAggregateExpression#getProjectionIndex()
	 * @see #getProjectedAggregateExpression()
	 * @generated
	 */
	EAttribute getProjectedAggregateExpression_ProjectionIndex();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LogiclanguageFactory getLogiclanguageFactory();

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
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.TypeImpl <em>Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.TypeImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getType()
		 * @generated
		 */
		EClass TYPE = eINSTANCE.getType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__NAME = eINSTANCE.getType_Name();

		/**
		 * The meta object literal for the '<em><b>Subtypes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__SUBTYPES = eINSTANCE.getType_Subtypes();

		/**
		 * The meta object literal for the '<em><b>Supertypes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE__SUPERTYPES = eINSTANCE.getType_Supertypes();

		/**
		 * The meta object literal for the '<em><b>Is Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE__IS_ABSTRACT = eINSTANCE.getType_IsAbstract();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.DefinedElementImpl <em>Defined Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.DefinedElementImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getDefinedElement()
		 * @generated
		 */
		EClass DEFINED_ELEMENT = eINSTANCE.getDefinedElement();

		/**
		 * The meta object literal for the '<em><b>Defined In Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFINED_ELEMENT__DEFINED_IN_TYPE = eINSTANCE.getDefinedElement_DefinedInType();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.TypeDefinitionImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getTypeDefinition()
		 * @generated
		 */
		EClass TYPE_DEFINITION = eINSTANCE.getTypeDefinition();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_DEFINITION__ELEMENTS = eINSTANCE.getTypeDefinition_Elements();

		/**
		 * The meta object literal for the '<em><b>Defines</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TYPE_DEFINITION__DEFINES = eINSTANCE.getTypeDefinition_Defines();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.TypeReferenceImpl <em>Type Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.TypeReferenceImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getTypeReference()
		 * @generated
		 */
		EClass TYPE_REFERENCE = eINSTANCE.getTypeReference();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.ComplexTypeReferenceImpl <em>Complex Type Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.ComplexTypeReferenceImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getComplexTypeReference()
		 * @generated
		 */
		EClass COMPLEX_TYPE_REFERENCE = eINSTANCE.getComplexTypeReference();

		/**
		 * The meta object literal for the '<em><b>Referred</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPLEX_TYPE_REFERENCE__REFERRED = eINSTANCE.getComplexTypeReference_Referred();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.PrimitiveTypeReferenceImpl <em>Primitive Type Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.PrimitiveTypeReferenceImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getPrimitiveTypeReference()
		 * @generated
		 */
		EClass PRIMITIVE_TYPE_REFERENCE = eINSTANCE.getPrimitiveTypeReference();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.IntTypeReferenceImpl <em>Int Type Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.IntTypeReferenceImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getIntTypeReference()
		 * @generated
		 */
		EClass INT_TYPE_REFERENCE = eINSTANCE.getIntTypeReference();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.BoolTypeReferenceImpl <em>Bool Type Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.BoolTypeReferenceImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getBoolTypeReference()
		 * @generated
		 */
		EClass BOOL_TYPE_REFERENCE = eINSTANCE.getBoolTypeReference();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.RealTypeReferenceImpl <em>Real Type Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.RealTypeReferenceImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getRealTypeReference()
		 * @generated
		 */
		EClass REAL_TYPE_REFERENCE = eINSTANCE.getRealTypeReference();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.FunctionImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__RANGE = eINSTANCE.getFunction_Range();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__PARAMETERS = eINSTANCE.getFunction_Parameters();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION__ANNOTATIONS = eINSTANCE.getFunction_Annotations();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.TermImpl <em>Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.TermImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getTerm()
		 * @generated
		 */
		EClass TERM = eINSTANCE.getTerm();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.SymbolicDeclarationImpl <em>Symbolic Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.SymbolicDeclarationImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getSymbolicDeclaration()
		 * @generated
		 */
		EClass SYMBOLIC_DECLARATION = eINSTANCE.getSymbolicDeclaration();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYMBOLIC_DECLARATION__NAME = eINSTANCE.getSymbolicDeclaration_Name();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.SymbolicValueImpl <em>Symbolic Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.SymbolicValueImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getSymbolicValue()
		 * @generated
		 */
		EClass SYMBOLIC_VALUE = eINSTANCE.getSymbolicValue();

		/**
		 * The meta object literal for the '<em><b>Symbolic Reference</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMBOLIC_VALUE__SYMBOLIC_REFERENCE = eINSTANCE.getSymbolicValue_SymbolicReference();

		/**
		 * The meta object literal for the '<em><b>Parameter Substitutions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYMBOLIC_VALUE__PARAMETER_SUBSTITUTIONS = eINSTANCE.getSymbolicValue_ParameterSubstitutions();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.AtomicTermImpl <em>Atomic Term</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.AtomicTermImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getAtomicTerm()
		 * @generated
		 */
		EClass ATOMIC_TERM = eINSTANCE.getAtomicTerm();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.IntLiteralImpl <em>Int Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.IntLiteralImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getIntLiteral()
		 * @generated
		 */
		EClass INT_LITERAL = eINSTANCE.getIntLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INT_LITERAL__VALUE = eINSTANCE.getIntLiteral_Value();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.BoolLiteralImpl <em>Bool Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.BoolLiteralImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getBoolLiteral()
		 * @generated
		 */
		EClass BOOL_LITERAL = eINSTANCE.getBoolLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOL_LITERAL__VALUE = eINSTANCE.getBoolLiteral_Value();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.RealLiteralImpl <em>Real Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.RealLiteralImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getRealLiteral()
		 * @generated
		 */
		EClass REAL_LITERAL = eINSTANCE.getRealLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REAL_LITERAL__VALUE = eINSTANCE.getRealLiteral_Value();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.VariableImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE__RANGE = eINSTANCE.getVariable_Range();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.QuantifiedExpressionImpl <em>Quantified Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.QuantifiedExpressionImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getQuantifiedExpression()
		 * @generated
		 */
		EClass QUANTIFIED_EXPRESSION = eINSTANCE.getQuantifiedExpression();

		/**
		 * The meta object literal for the '<em><b>Quantified Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTIFIED_EXPRESSION__QUANTIFIED_VARIABLES = eINSTANCE.getQuantifiedExpression_QuantifiedVariables();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUANTIFIED_EXPRESSION__EXPRESSION = eINSTANCE.getQuantifiedExpression_Expression();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.ExistsImpl <em>Exists</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.ExistsImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getExists()
		 * @generated
		 */
		EClass EXISTS = eINSTANCE.getExists();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.ForallImpl <em>Forall</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.ForallImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getForall()
		 * @generated
		 */
		EClass FORALL = eINSTANCE.getForall();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.BoolOperationImpl <em>Bool Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.BoolOperationImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getBoolOperation()
		 * @generated
		 */
		EClass BOOL_OPERATION = eINSTANCE.getBoolOperation();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.AndImpl <em>And</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.AndImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getAnd()
		 * @generated
		 */
		EClass AND = eINSTANCE.getAnd();

		/**
		 * The meta object literal for the '<em><b>Operands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AND__OPERANDS = eINSTANCE.getAnd_Operands();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.OrImpl <em>Or</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.OrImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getOr()
		 * @generated
		 */
		EClass OR = eINSTANCE.getOr();

		/**
		 * The meta object literal for the '<em><b>Operands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OR__OPERANDS = eINSTANCE.getOr_Operands();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.ImplImpl <em>Impl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.ImplImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getImpl()
		 * @generated
		 */
		EClass IMPL = eINSTANCE.getImpl();

		/**
		 * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPL__LEFT_OPERAND = eINSTANCE.getImpl_LeftOperand();

		/**
		 * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPL__RIGHT_OPERAND = eINSTANCE.getImpl_RightOperand();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.NotImpl <em>Not</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.NotImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getNot()
		 * @generated
		 */
		EClass NOT = eINSTANCE.getNot();

		/**
		 * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOT__OPERAND = eINSTANCE.getNot_Operand();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.IffImpl <em>Iff</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.IffImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getIff()
		 * @generated
		 */
		EClass IFF = eINSTANCE.getIff();

		/**
		 * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IFF__LEFT_OPERAND = eINSTANCE.getIff_LeftOperand();

		/**
		 * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IFF__RIGHT_OPERAND = eINSTANCE.getIff_RightOperand();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.PrimitiveRelationImpl <em>Primitive Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.PrimitiveRelationImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getPrimitiveRelation()
		 * @generated
		 */
		EClass PRIMITIVE_RELATION = eINSTANCE.getPrimitiveRelation();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.EqualsImpl <em>Equals</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.EqualsImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getEquals()
		 * @generated
		 */
		EClass EQUALS = eINSTANCE.getEquals();

		/**
		 * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUALS__LEFT_OPERAND = eINSTANCE.getEquals_LeftOperand();

		/**
		 * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EQUALS__RIGHT_OPERAND = eINSTANCE.getEquals_RightOperand();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.DistinctImpl <em>Distinct</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.DistinctImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getDistinct()
		 * @generated
		 */
		EClass DISTINCT = eINSTANCE.getDistinct();

		/**
		 * The meta object literal for the '<em><b>Operands</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DISTINCT__OPERANDS = eINSTANCE.getDistinct_Operands();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LessThanImpl <em>Less Than</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LessThanImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getLessThan()
		 * @generated
		 */
		EClass LESS_THAN = eINSTANCE.getLessThan();

		/**
		 * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LESS_THAN__LEFT_OPERAND = eINSTANCE.getLessThan_LeftOperand();

		/**
		 * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LESS_THAN__RIGHT_OPERAND = eINSTANCE.getLessThan_RightOperand();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.MoreThanImpl <em>More Than</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.MoreThanImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getMoreThan()
		 * @generated
		 */
		EClass MORE_THAN = eINSTANCE.getMoreThan();

		/**
		 * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MORE_THAN__LEFT_OPERAND = eINSTANCE.getMoreThan_LeftOperand();

		/**
		 * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MORE_THAN__RIGHT_OPERAND = eINSTANCE.getMoreThan_RightOperand();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LessOrEqualThanImpl <em>Less Or Equal Than</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LessOrEqualThanImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getLessOrEqualThan()
		 * @generated
		 */
		EClass LESS_OR_EQUAL_THAN = eINSTANCE.getLessOrEqualThan();

		/**
		 * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LESS_OR_EQUAL_THAN__LEFT_OPERAND = eINSTANCE.getLessOrEqualThan_LeftOperand();

		/**
		 * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LESS_OR_EQUAL_THAN__RIGHT_OPERAND = eINSTANCE.getLessOrEqualThan_RightOperand();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.MoreOrEqualThanImpl <em>More Or Equal Than</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.MoreOrEqualThanImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getMoreOrEqualThan()
		 * @generated
		 */
		EClass MORE_OR_EQUAL_THAN = eINSTANCE.getMoreOrEqualThan();

		/**
		 * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MORE_OR_EQUAL_THAN__LEFT_OPERAND = eINSTANCE.getMoreOrEqualThan_LeftOperand();

		/**
		 * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MORE_OR_EQUAL_THAN__RIGHT_OPERAND = eINSTANCE.getMoreOrEqualThan_RightOperand();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.NumericOperationImpl <em>Numeric Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.NumericOperationImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getNumericOperation()
		 * @generated
		 */
		EClass NUMERIC_OPERATION = eINSTANCE.getNumericOperation();

		/**
		 * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMERIC_OPERATION__LEFT_OPERAND = eINSTANCE.getNumericOperation_LeftOperand();

		/**
		 * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMERIC_OPERATION__RIGHT_OPERAND = eINSTANCE.getNumericOperation_RightOperand();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.PlusImpl <em>Plus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.PlusImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getPlus()
		 * @generated
		 */
		EClass PLUS = eINSTANCE.getPlus();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.MinusImpl <em>Minus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.MinusImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getMinus()
		 * @generated
		 */
		EClass MINUS = eINSTANCE.getMinus();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.MultiplyImpl <em>Multiply</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.MultiplyImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getMultiply()
		 * @generated
		 */
		EClass MULTIPLY = eINSTANCE.getMultiply();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.DivisonImpl <em>Divison</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.DivisonImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getDivison()
		 * @generated
		 */
		EClass DIVISON = eINSTANCE.getDivison();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.ModImpl <em>Mod</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.ModImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getMod()
		 * @generated
		 */
		EClass MOD = eINSTANCE.getMod();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDescriptor <em>Type Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDescriptor
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getTypeDescriptor()
		 * @generated
		 */
		EClass TYPE_DESCRIPTOR = eINSTANCE.getTypeDescriptor();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TermDescription <em>Term Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TermDescription
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getTermDescription()
		 * @generated
		 */
		EClass TERM_DESCRIPTION = eINSTANCE.getTermDescription();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.AssertionImpl <em>Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.AssertionImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getAssertion()
		 * @generated
		 */
		EClass ASSERTION = eINSTANCE.getAssertion();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSERTION__VALUE = eINSTANCE.getAssertion_Value();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERTION__NAME = eINSTANCE.getAssertion_Name();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSERTION__ANNOTATIONS = eINSTANCE.getAssertion_Annotations();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.RelationImpl <em>Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.RelationImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getRelation()
		 * @generated
		 */
		EClass RELATION = eINSTANCE.getRelation();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__PARAMETERS = eINSTANCE.getRelation_Parameters();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION__ANNOTATIONS = eINSTANCE.getRelation_Annotations();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.ConstantImpl <em>Constant</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.ConstantImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getConstant()
		 * @generated
		 */
		EClass CONSTANT = eINSTANCE.getConstant();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTANT__TYPE = eINSTANCE.getConstant_Type();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTANT__ANNOTATIONS = eINSTANCE.getConstant_Annotations();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.ConstantDefinitionImpl <em>Constant Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.ConstantDefinitionImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getConstantDefinition()
		 * @generated
		 */
		EClass CONSTANT_DEFINITION = eINSTANCE.getConstantDefinition();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTANT_DEFINITION__VALUE = eINSTANCE.getConstantDefinition_Value();

		/**
		 * The meta object literal for the '<em><b>Defines</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONSTANT_DEFINITION__DEFINES = eINSTANCE.getConstantDefinition_Defines();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.RelationDefinitionImpl <em>Relation Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.RelationDefinitionImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getRelationDefinition()
		 * @generated
		 */
		EClass RELATION_DEFINITION = eINSTANCE.getRelationDefinition();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_DEFINITION__VARIABLES = eINSTANCE.getRelationDefinition_Variables();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_DEFINITION__VALUE = eINSTANCE.getRelationDefinition_Value();

		/**
		 * The meta object literal for the '<em><b>Defines</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATION_DEFINITION__DEFINES = eINSTANCE.getRelationDefinition_Defines();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.FunctionDefinitionImpl <em>Function Definition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.FunctionDefinitionImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getFunctionDefinition()
		 * @generated
		 */
		EClass FUNCTION_DEFINITION = eINSTANCE.getFunctionDefinition();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_DEFINITION__VARIABLE = eINSTANCE.getFunctionDefinition_Variable();

		/**
		 * The meta object literal for the '<em><b>Defines</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_DEFINITION__DEFINES = eINSTANCE.getFunctionDefinition_Defines();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTION_DEFINITION__VALUE = eINSTANCE.getFunctionDefinition_Value();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.IfThenElseImpl <em>If Then Else</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.IfThenElseImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getIfThenElse()
		 * @generated
		 */
		EClass IF_THEN_ELSE = eINSTANCE.getIfThenElse();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_THEN_ELSE__CONDITION = eINSTANCE.getIfThenElse_Condition();

		/**
		 * The meta object literal for the '<em><b>If True</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_THEN_ELSE__IF_TRUE = eINSTANCE.getIfThenElse_IfTrue();

		/**
		 * The meta object literal for the '<em><b>If False</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IF_THEN_ELSE__IF_FALSE = eINSTANCE.getIfThenElse_IfFalse();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.ConstantDeclarationImpl <em>Constant Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.ConstantDeclarationImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getConstantDeclaration()
		 * @generated
		 */
		EClass CONSTANT_DECLARATION = eINSTANCE.getConstantDeclaration();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.RelationDeclarationImpl <em>Relation Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.RelationDeclarationImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getRelationDeclaration()
		 * @generated
		 */
		EClass RELATION_DECLARATION = eINSTANCE.getRelationDeclaration();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.FunctionDeclarationImpl <em>Function Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.FunctionDeclarationImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getFunctionDeclaration()
		 * @generated
		 */
		EClass FUNCTION_DECLARATION = eINSTANCE.getFunctionDeclaration();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.TypeDeclarationImpl <em>Type Declaration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.TypeDeclarationImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getTypeDeclaration()
		 * @generated
		 */
		EClass TYPE_DECLARATION = eINSTANCE.getTypeDeclaration();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.UnknownBecauseUninterpretedImpl <em>Unknown Because Uninterpreted</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.UnknownBecauseUninterpretedImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getUnknownBecauseUninterpreted()
		 * @generated
		 */
		EClass UNKNOWN_BECAUSE_UNINTERPRETED = eINSTANCE.getUnknownBecauseUninterpreted();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.InstanceOfImpl <em>Instance Of</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.InstanceOfImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getInstanceOf()
		 * @generated
		 */
		EClass INSTANCE_OF = eINSTANCE.getInstanceOf();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_OF__VALUE = eINSTANCE.getInstanceOf_Value();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSTANCE_OF__RANGE = eINSTANCE.getInstanceOf_Range();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.StringTypeReferenceImpl <em>String Type Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.StringTypeReferenceImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getStringTypeReference()
		 * @generated
		 */
		EClass STRING_TYPE_REFERENCE = eINSTANCE.getStringTypeReference();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.StringLiteralImpl <em>String Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.StringLiteralImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getStringLiteral()
		 * @generated
		 */
		EClass STRING_LITERAL = eINSTANCE.getStringLiteral();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_LITERAL__VALUE = eINSTANCE.getStringLiteral_Value();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.TransitiveClosureImpl <em>Transitive Closure</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.TransitiveClosureImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getTransitiveClosure()
		 * @generated
		 */
		EClass TRANSITIVE_CLOSURE = eINSTANCE.getTransitiveClosure();

		/**
		 * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITIVE_CLOSURE__LEFT_OPERAND = eINSTANCE.getTransitiveClosure_LeftOperand();

		/**
		 * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITIVE_CLOSURE__RIGHT_OPERAND = eINSTANCE.getTransitiveClosure_RightOperand();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITIVE_CLOSURE__RELATION = eINSTANCE.getTransitiveClosure_Relation();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.PowImpl <em>Pow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.PowImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getPow()
		 * @generated
		 */
		EClass POW = eINSTANCE.getPow();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.AggregateExpressionImpl <em>Aggregate Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.AggregateExpressionImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getAggregateExpression()
		 * @generated
		 */
		EClass AGGREGATE_EXPRESSION = eINSTANCE.getAggregateExpression();

		/**
		 * The meta object literal for the '<em><b>Relation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AGGREGATE_EXPRESSION__RELATION = eINSTANCE.getAggregateExpression_Relation();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.SumImpl <em>Sum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.SumImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getSum()
		 * @generated
		 */
		EClass SUM = eINSTANCE.getSum();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.CountImpl <em>Count</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.CountImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getCount()
		 * @generated
		 */
		EClass COUNT = eINSTANCE.getCount();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.MinImpl <em>Min</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.MinImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getMin()
		 * @generated
		 */
		EClass MIN = eINSTANCE.getMin();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.MaxImpl <em>Max</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.MaxImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getMax()
		 * @generated
		 */
		EClass MAX = eINSTANCE.getMax();

		/**
		 * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.ProjectedAggregateExpressionImpl <em>Projected Aggregate Expression</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.ProjectedAggregateExpressionImpl
		 * @see hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.impl.LogiclanguagePackageImpl#getProjectedAggregateExpression()
		 * @generated
		 */
		EClass PROJECTED_AGGREGATE_EXPRESSION = eINSTANCE.getProjectedAggregateExpression();

		/**
		 * The meta object literal for the '<em><b>Projection Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECTED_AGGREGATE_EXPRESSION__PROJECTION_INDEX = eINSTANCE.getProjectedAggregateExpression_ProjectionIndex();

	}

} //LogiclanguagePackage
