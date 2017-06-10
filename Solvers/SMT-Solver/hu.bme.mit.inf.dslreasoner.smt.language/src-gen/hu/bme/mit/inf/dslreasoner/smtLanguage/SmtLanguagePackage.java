/**
 */
package hu.bme.mit.inf.dslreasoner.smtLanguage;

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
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguageFactory
 * @model kind="package"
 * @generated
 */
public interface SmtLanguagePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "smtLanguage";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.bme.hu/mit/inf/dslreasoner/SmtLanguage";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "smtLanguage";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SmtLanguagePackage eINSTANCE = hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl.init();

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTDocumentImpl <em>SMT Document</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTDocumentImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTDocument()
   * @generated
   */
  int SMT_DOCUMENT = 0;

  /**
   * The feature id for the '<em><b>Input</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_DOCUMENT__INPUT = 0;

  /**
   * The feature id for the '<em><b>Output</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_DOCUMENT__OUTPUT = 1;

  /**
   * The number of structural features of the '<em>SMT Document</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_DOCUMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTInputImpl <em>SMT Input</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTInputImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTInput()
   * @generated
   */
  int SMT_INPUT = 1;

  /**
   * The feature id for the '<em><b>Options</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_INPUT__OPTIONS = 0;

  /**
   * The feature id for the '<em><b>Type Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_INPUT__TYPE_DECLARATIONS = 1;

  /**
   * The feature id for the '<em><b>Function Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_INPUT__FUNCTION_DECLARATIONS = 2;

  /**
   * The feature id for the '<em><b>Function Definition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_INPUT__FUNCTION_DEFINITION = 3;

  /**
   * The feature id for the '<em><b>Assertions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_INPUT__ASSERTIONS = 4;

  /**
   * The feature id for the '<em><b>Sat Command</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_INPUT__SAT_COMMAND = 5;

  /**
   * The feature id for the '<em><b>Get Model Command</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_INPUT__GET_MODEL_COMMAND = 6;

  /**
   * The number of structural features of the '<em>SMT Input</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_INPUT_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTOutputImpl <em>SMT Output</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTOutputImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTOutput()
   * @generated
   */
  int SMT_OUTPUT = 2;

  /**
   * The feature id for the '<em><b>Sat Result</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_OUTPUT__SAT_RESULT = 0;

  /**
   * The feature id for the '<em><b>Get Model Result</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_OUTPUT__GET_MODEL_RESULT = 1;

  /**
   * The feature id for the '<em><b>Statistics</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_OUTPUT__STATISTICS = 2;

  /**
   * The number of structural features of the '<em>SMT Output</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_OUTPUT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTOptionImpl <em>SMT Option</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTOptionImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTOption()
   * @generated
   */
  int SMT_OPTION = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_OPTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_OPTION__VALUE = 1;

  /**
   * The number of structural features of the '<em>SMT Option</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_OPTION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTTypeImpl <em>SMT Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTTypeImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTType()
   * @generated
   */
  int SMT_TYPE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_TYPE__NAME = 0;

  /**
   * The number of structural features of the '<em>SMT Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTSymbolicDeclarationImpl <em>SMT Symbolic Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTSymbolicDeclarationImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTSymbolicDeclaration()
   * @generated
   */
  int SMT_SYMBOLIC_DECLARATION = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_SYMBOLIC_DECLARATION__NAME = 0;

  /**
   * The number of structural features of the '<em>SMT Symbolic Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_SYMBOLIC_DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTEnumLiteralImpl <em>SMT Enum Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTEnumLiteralImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTEnumLiteral()
   * @generated
   */
  int SMT_ENUM_LITERAL = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_ENUM_LITERAL__NAME = SMT_SYMBOLIC_DECLARATION__NAME;

  /**
   * The number of structural features of the '<em>SMT Enum Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_ENUM_LITERAL_FEATURE_COUNT = SMT_SYMBOLIC_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTEnumeratedTypeDeclarationImpl <em>SMT Enumerated Type Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTEnumeratedTypeDeclarationImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTEnumeratedTypeDeclaration()
   * @generated
   */
  int SMT_ENUMERATED_TYPE_DECLARATION = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_ENUMERATED_TYPE_DECLARATION__NAME = SMT_TYPE__NAME;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_ENUMERATED_TYPE_DECLARATION__ELEMENTS = SMT_TYPE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>SMT Enumerated Type Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_ENUMERATED_TYPE_DECLARATION_FEATURE_COUNT = SMT_TYPE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTSetTypeDeclarationImpl <em>SMT Set Type Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTSetTypeDeclarationImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTSetTypeDeclaration()
   * @generated
   */
  int SMT_SET_TYPE_DECLARATION = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_SET_TYPE_DECLARATION__NAME = SMT_TYPE__NAME;

  /**
   * The number of structural features of the '<em>SMT Set Type Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_SET_TYPE_DECLARATION_FEATURE_COUNT = SMT_TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTTypeReferenceImpl <em>SMT Type Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTTypeReferenceImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTTypeReference()
   * @generated
   */
  int SMT_TYPE_REFERENCE = 8;

  /**
   * The number of structural features of the '<em>SMT Type Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_TYPE_REFERENCE_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTComplexTypeReferenceImpl <em>SMT Complex Type Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTComplexTypeReferenceImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTComplexTypeReference()
   * @generated
   */
  int SMT_COMPLEX_TYPE_REFERENCE = 9;

  /**
   * The feature id for the '<em><b>Referred</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_COMPLEX_TYPE_REFERENCE__REFERRED = SMT_TYPE_REFERENCE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>SMT Complex Type Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_COMPLEX_TYPE_REFERENCE_FEATURE_COUNT = SMT_TYPE_REFERENCE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTPrimitiveTypeReferenceImpl <em>SMT Primitive Type Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTPrimitiveTypeReferenceImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTPrimitiveTypeReference()
   * @generated
   */
  int SMT_PRIMITIVE_TYPE_REFERENCE = 10;

  /**
   * The number of structural features of the '<em>SMT Primitive Type Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_PRIMITIVE_TYPE_REFERENCE_FEATURE_COUNT = SMT_TYPE_REFERENCE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTIntTypeReferenceImpl <em>SMT Int Type Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTIntTypeReferenceImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTIntTypeReference()
   * @generated
   */
  int SMT_INT_TYPE_REFERENCE = 11;

  /**
   * The number of structural features of the '<em>SMT Int Type Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_INT_TYPE_REFERENCE_FEATURE_COUNT = SMT_PRIMITIVE_TYPE_REFERENCE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTBoolTypeReferenceImpl <em>SMT Bool Type Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTBoolTypeReferenceImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTBoolTypeReference()
   * @generated
   */
  int SMT_BOOL_TYPE_REFERENCE = 12;

  /**
   * The number of structural features of the '<em>SMT Bool Type Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_BOOL_TYPE_REFERENCE_FEATURE_COUNT = SMT_PRIMITIVE_TYPE_REFERENCE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTRealTypeReferenceImpl <em>SMT Real Type Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTRealTypeReferenceImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTRealTypeReference()
   * @generated
   */
  int SMT_REAL_TYPE_REFERENCE = 13;

  /**
   * The number of structural features of the '<em>SMT Real Type Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_REAL_TYPE_REFERENCE_FEATURE_COUNT = SMT_PRIMITIVE_TYPE_REFERENCE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTFunctionDeclarationImpl <em>SMT Function Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTFunctionDeclarationImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTFunctionDeclaration()
   * @generated
   */
  int SMT_FUNCTION_DECLARATION = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_FUNCTION_DECLARATION__NAME = SMT_SYMBOLIC_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_FUNCTION_DECLARATION__PARAMETERS = SMT_SYMBOLIC_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_FUNCTION_DECLARATION__RANGE = SMT_SYMBOLIC_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>SMT Function Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_FUNCTION_DECLARATION_FEATURE_COUNT = SMT_SYMBOLIC_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTFunctionDefinitionImpl <em>SMT Function Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTFunctionDefinitionImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTFunctionDefinition()
   * @generated
   */
  int SMT_FUNCTION_DEFINITION = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_FUNCTION_DEFINITION__NAME = SMT_SYMBOLIC_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_FUNCTION_DEFINITION__PARAMETERS = SMT_SYMBOLIC_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_FUNCTION_DEFINITION__RANGE = SMT_SYMBOLIC_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_FUNCTION_DEFINITION__VALUE = SMT_SYMBOLIC_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>SMT Function Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_FUNCTION_DEFINITION_FEATURE_COUNT = SMT_SYMBOLIC_DECLARATION_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTTermImpl <em>SMT Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTTermImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTTerm()
   * @generated
   */
  int SMT_TERM = 16;

  /**
   * The number of structural features of the '<em>SMT Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_TERM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTSymbolicValueImpl <em>SMT Symbolic Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTSymbolicValueImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTSymbolicValue()
   * @generated
   */
  int SMT_SYMBOLIC_VALUE = 18;

  /**
   * The feature id for the '<em><b>Symbolic Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_SYMBOLIC_VALUE__SYMBOLIC_REFERENCE = SMT_TERM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameter Substitutions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_SYMBOLIC_VALUE__PARAMETER_SUBSTITUTIONS = SMT_TERM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>SMT Symbolic Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_SYMBOLIC_VALUE_FEATURE_COUNT = SMT_TERM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTAtomicTermImpl <em>SMT Atomic Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTAtomicTermImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTAtomicTerm()
   * @generated
   */
  int SMT_ATOMIC_TERM = 19;

  /**
   * The number of structural features of the '<em>SMT Atomic Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_ATOMIC_TERM_FEATURE_COUNT = SMT_TERM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTIntLiteralImpl <em>SMT Int Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTIntLiteralImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTIntLiteral()
   * @generated
   */
  int SMT_INT_LITERAL = 20;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_INT_LITERAL__VALUE = SMT_ATOMIC_TERM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>SMT Int Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_INT_LITERAL_FEATURE_COUNT = SMT_ATOMIC_TERM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTBoolLiteralImpl <em>SMT Bool Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTBoolLiteralImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTBoolLiteral()
   * @generated
   */
  int SMT_BOOL_LITERAL = 21;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_BOOL_LITERAL__VALUE = SMT_ATOMIC_TERM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>SMT Bool Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_BOOL_LITERAL_FEATURE_COUNT = SMT_ATOMIC_TERM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTRealLiteralImpl <em>SMT Real Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTRealLiteralImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTRealLiteral()
   * @generated
   */
  int SMT_REAL_LITERAL = 22;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_REAL_LITERAL__VALUE = SMT_ATOMIC_TERM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>SMT Real Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_REAL_LITERAL_FEATURE_COUNT = SMT_ATOMIC_TERM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTSortedVariableImpl <em>SMT Sorted Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTSortedVariableImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTSortedVariable()
   * @generated
   */
  int SMT_SORTED_VARIABLE = 23;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_SORTED_VARIABLE__NAME = SMT_SYMBOLIC_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_SORTED_VARIABLE__RANGE = SMT_SYMBOLIC_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>SMT Sorted Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_SORTED_VARIABLE_FEATURE_COUNT = SMT_SYMBOLIC_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTQuantifiedExpressionImpl <em>SMT Quantified Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTQuantifiedExpressionImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTQuantifiedExpression()
   * @generated
   */
  int SMT_QUANTIFIED_EXPRESSION = 24;

  /**
   * The feature id for the '<em><b>Quantified Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_QUANTIFIED_EXPRESSION__QUANTIFIED_VARIABLES = SMT_TERM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_QUANTIFIED_EXPRESSION__EXPRESSION = SMT_TERM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_QUANTIFIED_EXPRESSION__PATTERN = SMT_TERM_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>SMT Quantified Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_QUANTIFIED_EXPRESSION_FEATURE_COUNT = SMT_TERM_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTExistsImpl <em>SMT Exists</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTExistsImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTExists()
   * @generated
   */
  int SMT_EXISTS = 25;

  /**
   * The feature id for the '<em><b>Quantified Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_EXISTS__QUANTIFIED_VARIABLES = SMT_QUANTIFIED_EXPRESSION__QUANTIFIED_VARIABLES;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_EXISTS__EXPRESSION = SMT_QUANTIFIED_EXPRESSION__EXPRESSION;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_EXISTS__PATTERN = SMT_QUANTIFIED_EXPRESSION__PATTERN;

  /**
   * The number of structural features of the '<em>SMT Exists</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_EXISTS_FEATURE_COUNT = SMT_QUANTIFIED_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTForallImpl <em>SMT Forall</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTForallImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTForall()
   * @generated
   */
  int SMT_FORALL = 26;

  /**
   * The feature id for the '<em><b>Quantified Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_FORALL__QUANTIFIED_VARIABLES = SMT_QUANTIFIED_EXPRESSION__QUANTIFIED_VARIABLES;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_FORALL__EXPRESSION = SMT_QUANTIFIED_EXPRESSION__EXPRESSION;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_FORALL__PATTERN = SMT_QUANTIFIED_EXPRESSION__PATTERN;

  /**
   * The number of structural features of the '<em>SMT Forall</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_FORALL_FEATURE_COUNT = SMT_QUANTIFIED_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTBoolOperationImpl <em>SMT Bool Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTBoolOperationImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTBoolOperation()
   * @generated
   */
  int SMT_BOOL_OPERATION = 27;

  /**
   * The number of structural features of the '<em>SMT Bool Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_BOOL_OPERATION_FEATURE_COUNT = SMT_TERM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTAndImpl <em>SMT And</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTAndImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTAnd()
   * @generated
   */
  int SMT_AND = 28;

  /**
   * The feature id for the '<em><b>Operands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_AND__OPERANDS = SMT_BOOL_OPERATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>SMT And</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_AND_FEATURE_COUNT = SMT_BOOL_OPERATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTOrImpl <em>SMT Or</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTOrImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTOr()
   * @generated
   */
  int SMT_OR = 29;

  /**
   * The feature id for the '<em><b>Operands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_OR__OPERANDS = SMT_BOOL_OPERATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>SMT Or</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_OR_FEATURE_COUNT = SMT_BOOL_OPERATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTImplImpl <em>SMT Impl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTImplImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTImpl()
   * @generated
   */
  int SMT_IMPL = 30;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_IMPL__LEFT_OPERAND = SMT_BOOL_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_IMPL__RIGHT_OPERAND = SMT_BOOL_OPERATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>SMT Impl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_IMPL_FEATURE_COUNT = SMT_BOOL_OPERATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTNotImpl <em>SMT Not</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTNotImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTNot()
   * @generated
   */
  int SMT_NOT = 31;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_NOT__OPERAND = SMT_BOOL_OPERATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>SMT Not</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_NOT_FEATURE_COUNT = SMT_BOOL_OPERATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTIffImpl <em>SMT Iff</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTIffImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTIff()
   * @generated
   */
  int SMT_IFF = 32;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_IFF__LEFT_OPERAND = SMT_BOOL_OPERATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_IFF__RIGHT_OPERAND = SMT_BOOL_OPERATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>SMT Iff</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_IFF_FEATURE_COUNT = SMT_BOOL_OPERATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTITEImpl <em>SMTITE</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTITEImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTITE()
   * @generated
   */
  int SMTITE = 33;

  /**
   * The feature id for the '<em><b>Condition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMTITE__CONDITION = SMT_TERM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>If</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMTITE__IF = SMT_TERM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMTITE__ELSE = SMT_TERM_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>SMTITE</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMTITE_FEATURE_COUNT = SMT_TERM_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTLetImpl <em>SMT Let</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTLetImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTLet()
   * @generated
   */
  int SMT_LET = 34;

  /**
   * The feature id for the '<em><b>Inline Constant Definitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_LET__INLINE_CONSTANT_DEFINITIONS = SMT_TERM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_LET__TERM = SMT_TERM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>SMT Let</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_LET_FEATURE_COUNT = SMT_TERM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTInlineConstantDefinitionImpl <em>SMT Inline Constant Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTInlineConstantDefinitionImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTInlineConstantDefinition()
   * @generated
   */
  int SMT_INLINE_CONSTANT_DEFINITION = 35;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_INLINE_CONSTANT_DEFINITION__NAME = SMT_SYMBOLIC_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Definition</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_INLINE_CONSTANT_DEFINITION__DEFINITION = SMT_SYMBOLIC_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>SMT Inline Constant Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_INLINE_CONSTANT_DEFINITION_FEATURE_COUNT = SMT_SYMBOLIC_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTRelationImpl <em>SMT Relation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTRelationImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTRelation()
   * @generated
   */
  int SMT_RELATION = 36;

  /**
   * The number of structural features of the '<em>SMT Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_RELATION_FEATURE_COUNT = SMT_TERM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTEqualsImpl <em>SMT Equals</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTEqualsImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTEquals()
   * @generated
   */
  int SMT_EQUALS = 37;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_EQUALS__LEFT_OPERAND = SMT_RELATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_EQUALS__RIGHT_OPERAND = SMT_RELATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>SMT Equals</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_EQUALS_FEATURE_COUNT = SMT_RELATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTDistinctImpl <em>SMT Distinct</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTDistinctImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTDistinct()
   * @generated
   */
  int SMT_DISTINCT = 38;

  /**
   * The feature id for the '<em><b>Operands</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_DISTINCT__OPERANDS = SMT_RELATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>SMT Distinct</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_DISTINCT_FEATURE_COUNT = SMT_RELATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTLTImpl <em>SMTLT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTLTImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTLT()
   * @generated
   */
  int SMTLT = 39;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMTLT__LEFT_OPERAND = SMT_RELATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMTLT__RIGHT_OPERAND = SMT_RELATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>SMTLT</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMTLT_FEATURE_COUNT = SMT_RELATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTMTImpl <em>SMTMT</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTMTImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTMT()
   * @generated
   */
  int SMTMT = 40;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMTMT__LEFT_OPERAND = SMT_RELATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMTMT__RIGHT_OPERAND = SMT_RELATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>SMTMT</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMTMT_FEATURE_COUNT = SMT_RELATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTLEQImpl <em>SMTLEQ</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTLEQImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTLEQ()
   * @generated
   */
  int SMTLEQ = 41;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMTLEQ__LEFT_OPERAND = SMT_RELATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMTLEQ__RIGHT_OPERAND = SMT_RELATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>SMTLEQ</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMTLEQ_FEATURE_COUNT = SMT_RELATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTMEQImpl <em>SMTMEQ</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTMEQImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTMEQ()
   * @generated
   */
  int SMTMEQ = 42;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMTMEQ__LEFT_OPERAND = SMT_RELATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMTMEQ__RIGHT_OPERAND = SMT_RELATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>SMTMEQ</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMTMEQ_FEATURE_COUNT = SMT_RELATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTIntOperationImpl <em>SMT Int Operation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTIntOperationImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTIntOperation()
   * @generated
   */
  int SMT_INT_OPERATION = 43;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_INT_OPERATION__LEFT_OPERAND = SMT_TERM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_INT_OPERATION__RIGHT_OPERAND = SMT_TERM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>SMT Int Operation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_INT_OPERATION_FEATURE_COUNT = SMT_TERM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTPlusImpl <em>SMT Plus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTPlusImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTPlus()
   * @generated
   */
  int SMT_PLUS = 44;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_PLUS__LEFT_OPERAND = SMT_INT_OPERATION__LEFT_OPERAND;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_PLUS__RIGHT_OPERAND = SMT_INT_OPERATION__RIGHT_OPERAND;

  /**
   * The number of structural features of the '<em>SMT Plus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_PLUS_FEATURE_COUNT = SMT_INT_OPERATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTMinusImpl <em>SMT Minus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTMinusImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTMinus()
   * @generated
   */
  int SMT_MINUS = 45;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_MINUS__LEFT_OPERAND = SMT_INT_OPERATION__LEFT_OPERAND;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_MINUS__RIGHT_OPERAND = SMT_INT_OPERATION__RIGHT_OPERAND;

  /**
   * The number of structural features of the '<em>SMT Minus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_MINUS_FEATURE_COUNT = SMT_INT_OPERATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTMultiplyImpl <em>SMT Multiply</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTMultiplyImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTMultiply()
   * @generated
   */
  int SMT_MULTIPLY = 46;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_MULTIPLY__LEFT_OPERAND = SMT_INT_OPERATION__LEFT_OPERAND;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_MULTIPLY__RIGHT_OPERAND = SMT_INT_OPERATION__RIGHT_OPERAND;

  /**
   * The number of structural features of the '<em>SMT Multiply</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_MULTIPLY_FEATURE_COUNT = SMT_INT_OPERATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTDivisonImpl <em>SMT Divison</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTDivisonImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTDivison()
   * @generated
   */
  int SMT_DIVISON = 47;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_DIVISON__LEFT_OPERAND = SMT_INT_OPERATION__LEFT_OPERAND;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_DIVISON__RIGHT_OPERAND = SMT_INT_OPERATION__RIGHT_OPERAND;

  /**
   * The number of structural features of the '<em>SMT Divison</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_DIVISON_FEATURE_COUNT = SMT_INT_OPERATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTDivImpl <em>SMT Div</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTDivImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTDiv()
   * @generated
   */
  int SMT_DIV = 48;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_DIV__LEFT_OPERAND = SMT_INT_OPERATION__LEFT_OPERAND;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_DIV__RIGHT_OPERAND = SMT_INT_OPERATION__RIGHT_OPERAND;

  /**
   * The number of structural features of the '<em>SMT Div</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_DIV_FEATURE_COUNT = SMT_INT_OPERATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTModImpl <em>SMT Mod</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTModImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTMod()
   * @generated
   */
  int SMT_MOD = 49;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_MOD__LEFT_OPERAND = SMT_INT_OPERATION__LEFT_OPERAND;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_MOD__RIGHT_OPERAND = SMT_INT_OPERATION__RIGHT_OPERAND;

  /**
   * The number of structural features of the '<em>SMT Mod</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_MOD_FEATURE_COUNT = SMT_INT_OPERATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTAssertionImpl <em>SMT Assertion</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTAssertionImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTAssertion()
   * @generated
   */
  int SMT_ASSERTION = 50;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_ASSERTION__VALUE = 0;

  /**
   * The number of structural features of the '<em>SMT Assertion</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_ASSERTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTCardinalityConstraintImpl <em>SMT Cardinality Constraint</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTCardinalityConstraintImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTCardinalityConstraint()
   * @generated
   */
  int SMT_CARDINALITY_CONSTRAINT = 51;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_CARDINALITY_CONSTRAINT__TYPE = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_CARDINALITY_CONSTRAINT__ELEMENTS = 1;

  /**
   * The number of structural features of the '<em>SMT Cardinality Constraint</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_CARDINALITY_CONSTRAINT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTSatCommandImpl <em>SMT Sat Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTSatCommandImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTSatCommand()
   * @generated
   */
  int SMT_SAT_COMMAND = 52;

  /**
   * The number of structural features of the '<em>SMT Sat Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_SAT_COMMAND_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTSimpleSatCommandImpl <em>SMT Simple Sat Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTSimpleSatCommandImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTSimpleSatCommand()
   * @generated
   */
  int SMT_SIMPLE_SAT_COMMAND = 53;

  /**
   * The number of structural features of the '<em>SMT Simple Sat Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_SIMPLE_SAT_COMMAND_FEATURE_COUNT = SMT_SAT_COMMAND_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTComplexSatCommandImpl <em>SMT Complex Sat Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTComplexSatCommandImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTComplexSatCommand()
   * @generated
   */
  int SMT_COMPLEX_SAT_COMMAND = 54;

  /**
   * The feature id for the '<em><b>Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_COMPLEX_SAT_COMMAND__METHOD = SMT_SAT_COMMAND_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>SMT Complex Sat Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_COMPLEX_SAT_COMMAND_FEATURE_COUNT = SMT_SAT_COMMAND_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTGetModelCommandImpl <em>SMT Get Model Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTGetModelCommandImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTGetModelCommand()
   * @generated
   */
  int SMT_GET_MODEL_COMMAND = 55;

  /**
   * The number of structural features of the '<em>SMT Get Model Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_GET_MODEL_COMMAND_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTReasoningTacticImpl <em>SMT Reasoning Tactic</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTReasoningTacticImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTReasoningTactic()
   * @generated
   */
  int SMT_REASONING_TACTIC = 56;

  /**
   * The number of structural features of the '<em>SMT Reasoning Tactic</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_REASONING_TACTIC_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTBuiltinTacticImpl <em>SMT Builtin Tactic</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTBuiltinTacticImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTBuiltinTactic()
   * @generated
   */
  int SMT_BUILTIN_TACTIC = 57;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_BUILTIN_TACTIC__NAME = SMT_REASONING_TACTIC_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>SMT Builtin Tactic</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_BUILTIN_TACTIC_FEATURE_COUNT = SMT_REASONING_TACTIC_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTReasoningCombinatorImpl <em>SMT Reasoning Combinator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTReasoningCombinatorImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTReasoningCombinator()
   * @generated
   */
  int SMT_REASONING_COMBINATOR = 58;

  /**
   * The number of structural features of the '<em>SMT Reasoning Combinator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_REASONING_COMBINATOR_FEATURE_COUNT = SMT_REASONING_TACTIC_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTAndThenCombinatorImpl <em>SMT And Then Combinator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTAndThenCombinatorImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTAndThenCombinator()
   * @generated
   */
  int SMT_AND_THEN_COMBINATOR = 59;

  /**
   * The feature id for the '<em><b>Tactics</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_AND_THEN_COMBINATOR__TACTICS = SMT_REASONING_COMBINATOR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>SMT And Then Combinator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_AND_THEN_COMBINATOR_FEATURE_COUNT = SMT_REASONING_COMBINATOR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTOrElseCombinatorImpl <em>SMT Or Else Combinator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTOrElseCombinatorImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTOrElseCombinator()
   * @generated
   */
  int SMT_OR_ELSE_COMBINATOR = 60;

  /**
   * The feature id for the '<em><b>Tactics</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_OR_ELSE_COMBINATOR__TACTICS = SMT_REASONING_COMBINATOR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>SMT Or Else Combinator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_OR_ELSE_COMBINATOR_FEATURE_COUNT = SMT_REASONING_COMBINATOR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTParOrCombinatorImpl <em>SMT Par Or Combinator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTParOrCombinatorImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTParOrCombinator()
   * @generated
   */
  int SMT_PAR_OR_COMBINATOR = 61;

  /**
   * The feature id for the '<em><b>Tactics</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_PAR_OR_COMBINATOR__TACTICS = SMT_REASONING_COMBINATOR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>SMT Par Or Combinator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_PAR_OR_COMBINATOR_FEATURE_COUNT = SMT_REASONING_COMBINATOR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTParThenCombinatorImpl <em>SMT Par Then Combinator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTParThenCombinatorImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTParThenCombinator()
   * @generated
   */
  int SMT_PAR_THEN_COMBINATOR = 62;

  /**
   * The feature id for the '<em><b>Pre Processing Tactic</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_PAR_THEN_COMBINATOR__PRE_PROCESSING_TACTIC = SMT_REASONING_COMBINATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Paralelly Postpricessing Tactic</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_PAR_THEN_COMBINATOR__PARALELLY_POSTPRICESSING_TACTIC = SMT_REASONING_COMBINATOR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>SMT Par Then Combinator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_PAR_THEN_COMBINATOR_FEATURE_COUNT = SMT_REASONING_COMBINATOR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTTryForCombinatorImpl <em>SMT Try For Combinator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTTryForCombinatorImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTTryForCombinator()
   * @generated
   */
  int SMT_TRY_FOR_COMBINATOR = 63;

  /**
   * The feature id for the '<em><b>Tactic</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_TRY_FOR_COMBINATOR__TACTIC = SMT_REASONING_COMBINATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Time</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_TRY_FOR_COMBINATOR__TIME = SMT_REASONING_COMBINATOR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>SMT Try For Combinator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_TRY_FOR_COMBINATOR_FEATURE_COUNT = SMT_REASONING_COMBINATOR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTIfCombinatorImpl <em>SMT If Combinator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTIfCombinatorImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTIfCombinator()
   * @generated
   */
  int SMT_IF_COMBINATOR = 64;

  /**
   * The feature id for the '<em><b>Probe</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_IF_COMBINATOR__PROBE = SMT_REASONING_COMBINATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>If Tactic</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_IF_COMBINATOR__IF_TACTIC = SMT_REASONING_COMBINATOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Else Tactic</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_IF_COMBINATOR__ELSE_TACTIC = SMT_REASONING_COMBINATOR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>SMT If Combinator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_IF_COMBINATOR_FEATURE_COUNT = SMT_REASONING_COMBINATOR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTWhenCombinatorImpl <em>SMT When Combinator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTWhenCombinatorImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTWhenCombinator()
   * @generated
   */
  int SMT_WHEN_COMBINATOR = 65;

  /**
   * The feature id for the '<em><b>Probe</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_WHEN_COMBINATOR__PROBE = SMT_REASONING_COMBINATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Tactic</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_WHEN_COMBINATOR__TACTIC = SMT_REASONING_COMBINATOR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>SMT When Combinator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_WHEN_COMBINATOR_FEATURE_COUNT = SMT_REASONING_COMBINATOR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTFailIfCombinatorImpl <em>SMT Fail If Combinator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTFailIfCombinatorImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTFailIfCombinator()
   * @generated
   */
  int SMT_FAIL_IF_COMBINATOR = 66;

  /**
   * The feature id for the '<em><b>Probe</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_FAIL_IF_COMBINATOR__PROBE = SMT_REASONING_COMBINATOR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>SMT Fail If Combinator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_FAIL_IF_COMBINATOR_FEATURE_COUNT = SMT_REASONING_COMBINATOR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTUsingParamCombinatorImpl <em>SMT Using Param Combinator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTUsingParamCombinatorImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTUsingParamCombinator()
   * @generated
   */
  int SMT_USING_PARAM_COMBINATOR = 67;

  /**
   * The feature id for the '<em><b>Tactic</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_USING_PARAM_COMBINATOR__TACTIC = SMT_REASONING_COMBINATOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_USING_PARAM_COMBINATOR__PARAMETERS = SMT_REASONING_COMBINATOR_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>SMT Using Param Combinator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_USING_PARAM_COMBINATOR_FEATURE_COUNT = SMT_REASONING_COMBINATOR_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.ReasoningProbeImpl <em>Reasoning Probe</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.ReasoningProbeImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getReasoningProbe()
   * @generated
   */
  int REASONING_PROBE = 68;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REASONING_PROBE__NAME = 0;

  /**
   * The number of structural features of the '<em>Reasoning Probe</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REASONING_PROBE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.ReasoningTacticParameterImpl <em>Reasoning Tactic Parameter</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.ReasoningTacticParameterImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getReasoningTacticParameter()
   * @generated
   */
  int REASONING_TACTIC_PARAMETER = 69;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REASONING_TACTIC_PARAMETER__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REASONING_TACTIC_PARAMETER__VALUE = 1;

  /**
   * The number of structural features of the '<em>Reasoning Tactic Parameter</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REASONING_TACTIC_PARAMETER_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTResultImpl <em>SMT Result</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTResultImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTResult()
   * @generated
   */
  int SMT_RESULT = 70;

  /**
   * The number of structural features of the '<em>SMT Result</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_RESULT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTErrorResultImpl <em>SMT Error Result</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTErrorResultImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTErrorResult()
   * @generated
   */
  int SMT_ERROR_RESULT = 71;

  /**
   * The feature id for the '<em><b>Message</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_ERROR_RESULT__MESSAGE = SMT_RESULT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>SMT Error Result</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_ERROR_RESULT_FEATURE_COUNT = SMT_RESULT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTUnsupportedResultImpl <em>SMT Unsupported Result</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTUnsupportedResultImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTUnsupportedResult()
   * @generated
   */
  int SMT_UNSUPPORTED_RESULT = 72;

  /**
   * The feature id for the '<em><b>Command</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_UNSUPPORTED_RESULT__COMMAND = SMT_RESULT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>SMT Unsupported Result</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_UNSUPPORTED_RESULT_FEATURE_COUNT = SMT_RESULT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTSatResultImpl <em>SMT Sat Result</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTSatResultImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTSatResult()
   * @generated
   */
  int SMT_SAT_RESULT = 73;

  /**
   * The feature id for the '<em><b>Sat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_SAT_RESULT__SAT = SMT_RESULT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Unsat</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_SAT_RESULT__UNSAT = SMT_RESULT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Unknown</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_SAT_RESULT__UNKNOWN = SMT_RESULT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>SMT Sat Result</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_SAT_RESULT_FEATURE_COUNT = SMT_RESULT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTModelResultImpl <em>SMT Model Result</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTModelResultImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTModelResult()
   * @generated
   */
  int SMT_MODEL_RESULT = 74;

  /**
   * The feature id for the '<em><b>New Function Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_MODEL_RESULT__NEW_FUNCTION_DECLARATIONS = SMT_RESULT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type Definitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_MODEL_RESULT__TYPE_DEFINITIONS = SMT_RESULT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>New Function Definitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_MODEL_RESULT__NEW_FUNCTION_DEFINITIONS = SMT_RESULT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>SMT Model Result</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_MODEL_RESULT_FEATURE_COUNT = SMT_RESULT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTStatisticValueImpl <em>SMT Statistic Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTStatisticValueImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTStatisticValue()
   * @generated
   */
  int SMT_STATISTIC_VALUE = 75;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_STATISTIC_VALUE__NAME = 0;

  /**
   * The number of structural features of the '<em>SMT Statistic Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_STATISTIC_VALUE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTStatisticIntValueImpl <em>SMT Statistic Int Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTStatisticIntValueImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTStatisticIntValue()
   * @generated
   */
  int SMT_STATISTIC_INT_VALUE = 76;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_STATISTIC_INT_VALUE__NAME = SMT_STATISTIC_VALUE__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_STATISTIC_INT_VALUE__VALUE = SMT_STATISTIC_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>SMT Statistic Int Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_STATISTIC_INT_VALUE_FEATURE_COUNT = SMT_STATISTIC_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTStatisticDoubleValueImpl <em>SMT Statistic Double Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTStatisticDoubleValueImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTStatisticDoubleValue()
   * @generated
   */
  int SMT_STATISTIC_DOUBLE_VALUE = 77;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_STATISTIC_DOUBLE_VALUE__NAME = SMT_STATISTIC_VALUE__NAME;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_STATISTIC_DOUBLE_VALUE__VALUE = SMT_STATISTIC_VALUE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>SMT Statistic Double Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_STATISTIC_DOUBLE_VALUE_FEATURE_COUNT = SMT_STATISTIC_VALUE_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTStatisticsSectionImpl <em>SMT Statistics Section</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTStatisticsSectionImpl
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTStatisticsSection()
   * @generated
   */
  int SMT_STATISTICS_SECTION = 78;

  /**
   * The feature id for the '<em><b>Values</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_STATISTICS_SECTION__VALUES = 0;

  /**
   * The number of structural features of the '<em>SMT Statistics Section</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SMT_STATISTICS_SECTION_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTDocument <em>SMT Document</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Document</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTDocument
   * @generated
   */
  EClass getSMTDocument();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTDocument#getInput <em>Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Input</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTDocument#getInput()
   * @see #getSMTDocument()
   * @generated
   */
  EReference getSMTDocument_Input();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTDocument#getOutput <em>Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Output</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTDocument#getOutput()
   * @see #getSMTDocument()
   * @generated
   */
  EReference getSMTDocument_Output();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTInput <em>SMT Input</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Input</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTInput
   * @generated
   */
  EClass getSMTInput();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTInput#getOptions <em>Options</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Options</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTInput#getOptions()
   * @see #getSMTInput()
   * @generated
   */
  EReference getSMTInput_Options();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTInput#getTypeDeclarations <em>Type Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Type Declarations</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTInput#getTypeDeclarations()
   * @see #getSMTInput()
   * @generated
   */
  EReference getSMTInput_TypeDeclarations();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTInput#getFunctionDeclarations <em>Function Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Function Declarations</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTInput#getFunctionDeclarations()
   * @see #getSMTInput()
   * @generated
   */
  EReference getSMTInput_FunctionDeclarations();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTInput#getFunctionDefinition <em>Function Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Function Definition</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTInput#getFunctionDefinition()
   * @see #getSMTInput()
   * @generated
   */
  EReference getSMTInput_FunctionDefinition();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTInput#getAssertions <em>Assertions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Assertions</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTInput#getAssertions()
   * @see #getSMTInput()
   * @generated
   */
  EReference getSMTInput_Assertions();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTInput#getSatCommand <em>Sat Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sat Command</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTInput#getSatCommand()
   * @see #getSMTInput()
   * @generated
   */
  EReference getSMTInput_SatCommand();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTInput#getGetModelCommand <em>Get Model Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Get Model Command</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTInput#getGetModelCommand()
   * @see #getSMTInput()
   * @generated
   */
  EReference getSMTInput_GetModelCommand();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTOutput <em>SMT Output</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Output</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTOutput
   * @generated
   */
  EClass getSMTOutput();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTOutput#getSatResult <em>Sat Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Sat Result</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTOutput#getSatResult()
   * @see #getSMTOutput()
   * @generated
   */
  EReference getSMTOutput_SatResult();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTOutput#getGetModelResult <em>Get Model Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Get Model Result</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTOutput#getGetModelResult()
   * @see #getSMTOutput()
   * @generated
   */
  EReference getSMTOutput_GetModelResult();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTOutput#getStatistics <em>Statistics</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Statistics</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTOutput#getStatistics()
   * @see #getSMTOutput()
   * @generated
   */
  EReference getSMTOutput_Statistics();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTOption <em>SMT Option</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Option</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTOption
   * @generated
   */
  EClass getSMTOption();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTOption#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTOption#getName()
   * @see #getSMTOption()
   * @generated
   */
  EAttribute getSMTOption_Name();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTOption#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTOption#getValue()
   * @see #getSMTOption()
   * @generated
   */
  EReference getSMTOption_Value();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTType <em>SMT Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Type</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTType
   * @generated
   */
  EClass getSMTType();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTType#getName()
   * @see #getSMTType()
   * @generated
   */
  EAttribute getSMTType_Name();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTEnumLiteral <em>SMT Enum Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Enum Literal</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTEnumLiteral
   * @generated
   */
  EClass getSMTEnumLiteral();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTEnumeratedTypeDeclaration <em>SMT Enumerated Type Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Enumerated Type Declaration</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTEnumeratedTypeDeclaration
   * @generated
   */
  EClass getSMTEnumeratedTypeDeclaration();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTEnumeratedTypeDeclaration#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTEnumeratedTypeDeclaration#getElements()
   * @see #getSMTEnumeratedTypeDeclaration()
   * @generated
   */
  EReference getSMTEnumeratedTypeDeclaration_Elements();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSetTypeDeclaration <em>SMT Set Type Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Set Type Declaration</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSetTypeDeclaration
   * @generated
   */
  EClass getSMTSetTypeDeclaration();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTTypeReference <em>SMT Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Type Reference</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTTypeReference
   * @generated
   */
  EClass getSMTTypeReference();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTComplexTypeReference <em>SMT Complex Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Complex Type Reference</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTComplexTypeReference
   * @generated
   */
  EClass getSMTComplexTypeReference();

  /**
   * Returns the meta object for the reference '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTComplexTypeReference#getReferred <em>Referred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Referred</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTComplexTypeReference#getReferred()
   * @see #getSMTComplexTypeReference()
   * @generated
   */
  EReference getSMTComplexTypeReference_Referred();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTPrimitiveTypeReference <em>SMT Primitive Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Primitive Type Reference</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTPrimitiveTypeReference
   * @generated
   */
  EClass getSMTPrimitiveTypeReference();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTIntTypeReference <em>SMT Int Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Int Type Reference</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTIntTypeReference
   * @generated
   */
  EClass getSMTIntTypeReference();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTBoolTypeReference <em>SMT Bool Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Bool Type Reference</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTBoolTypeReference
   * @generated
   */
  EClass getSMTBoolTypeReference();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTRealTypeReference <em>SMT Real Type Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Real Type Reference</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTRealTypeReference
   * @generated
   */
  EClass getSMTRealTypeReference();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTFunctionDeclaration <em>SMT Function Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Function Declaration</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTFunctionDeclaration
   * @generated
   */
  EClass getSMTFunctionDeclaration();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTFunctionDeclaration#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTFunctionDeclaration#getParameters()
   * @see #getSMTFunctionDeclaration()
   * @generated
   */
  EReference getSMTFunctionDeclaration_Parameters();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTFunctionDeclaration#getRange <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Range</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTFunctionDeclaration#getRange()
   * @see #getSMTFunctionDeclaration()
   * @generated
   */
  EReference getSMTFunctionDeclaration_Range();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTFunctionDefinition <em>SMT Function Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Function Definition</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTFunctionDefinition
   * @generated
   */
  EClass getSMTFunctionDefinition();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTFunctionDefinition#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTFunctionDefinition#getParameters()
   * @see #getSMTFunctionDefinition()
   * @generated
   */
  EReference getSMTFunctionDefinition_Parameters();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTFunctionDefinition#getRange <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Range</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTFunctionDefinition#getRange()
   * @see #getSMTFunctionDefinition()
   * @generated
   */
  EReference getSMTFunctionDefinition_Range();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTFunctionDefinition#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTFunctionDefinition#getValue()
   * @see #getSMTFunctionDefinition()
   * @generated
   */
  EReference getSMTFunctionDefinition_Value();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTTerm <em>SMT Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Term</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTTerm
   * @generated
   */
  EClass getSMTTerm();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSymbolicDeclaration <em>SMT Symbolic Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Symbolic Declaration</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSymbolicDeclaration
   * @generated
   */
  EClass getSMTSymbolicDeclaration();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSymbolicDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSymbolicDeclaration#getName()
   * @see #getSMTSymbolicDeclaration()
   * @generated
   */
  EAttribute getSMTSymbolicDeclaration_Name();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSymbolicValue <em>SMT Symbolic Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Symbolic Value</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSymbolicValue
   * @generated
   */
  EClass getSMTSymbolicValue();

  /**
   * Returns the meta object for the reference '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSymbolicValue#getSymbolicReference <em>Symbolic Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Symbolic Reference</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSymbolicValue#getSymbolicReference()
   * @see #getSMTSymbolicValue()
   * @generated
   */
  EReference getSMTSymbolicValue_SymbolicReference();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSymbolicValue#getParameterSubstitutions <em>Parameter Substitutions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameter Substitutions</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSymbolicValue#getParameterSubstitutions()
   * @see #getSMTSymbolicValue()
   * @generated
   */
  EReference getSMTSymbolicValue_ParameterSubstitutions();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTAtomicTerm <em>SMT Atomic Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Atomic Term</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTAtomicTerm
   * @generated
   */
  EClass getSMTAtomicTerm();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTIntLiteral <em>SMT Int Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Int Literal</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTIntLiteral
   * @generated
   */
  EClass getSMTIntLiteral();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTIntLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTIntLiteral#getValue()
   * @see #getSMTIntLiteral()
   * @generated
   */
  EAttribute getSMTIntLiteral_Value();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTBoolLiteral <em>SMT Bool Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Bool Literal</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTBoolLiteral
   * @generated
   */
  EClass getSMTBoolLiteral();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTBoolLiteral#isValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTBoolLiteral#isValue()
   * @see #getSMTBoolLiteral()
   * @generated
   */
  EAttribute getSMTBoolLiteral_Value();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTRealLiteral <em>SMT Real Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Real Literal</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTRealLiteral
   * @generated
   */
  EClass getSMTRealLiteral();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTRealLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTRealLiteral#getValue()
   * @see #getSMTRealLiteral()
   * @generated
   */
  EAttribute getSMTRealLiteral_Value();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSortedVariable <em>SMT Sorted Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Sorted Variable</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSortedVariable
   * @generated
   */
  EClass getSMTSortedVariable();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSortedVariable#getRange <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Range</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSortedVariable#getRange()
   * @see #getSMTSortedVariable()
   * @generated
   */
  EReference getSMTSortedVariable_Range();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTQuantifiedExpression <em>SMT Quantified Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Quantified Expression</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTQuantifiedExpression
   * @generated
   */
  EClass getSMTQuantifiedExpression();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTQuantifiedExpression#getQuantifiedVariables <em>Quantified Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Quantified Variables</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTQuantifiedExpression#getQuantifiedVariables()
   * @see #getSMTQuantifiedExpression()
   * @generated
   */
  EReference getSMTQuantifiedExpression_QuantifiedVariables();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTQuantifiedExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTQuantifiedExpression#getExpression()
   * @see #getSMTQuantifiedExpression()
   * @generated
   */
  EReference getSMTQuantifiedExpression_Expression();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTQuantifiedExpression#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pattern</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTQuantifiedExpression#getPattern()
   * @see #getSMTQuantifiedExpression()
   * @generated
   */
  EReference getSMTQuantifiedExpression_Pattern();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTExists <em>SMT Exists</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Exists</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTExists
   * @generated
   */
  EClass getSMTExists();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTForall <em>SMT Forall</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Forall</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTForall
   * @generated
   */
  EClass getSMTForall();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTBoolOperation <em>SMT Bool Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Bool Operation</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTBoolOperation
   * @generated
   */
  EClass getSMTBoolOperation();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTAnd <em>SMT And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT And</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTAnd
   * @generated
   */
  EClass getSMTAnd();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTAnd#getOperands <em>Operands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operands</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTAnd#getOperands()
   * @see #getSMTAnd()
   * @generated
   */
  EReference getSMTAnd_Operands();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTOr <em>SMT Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Or</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTOr
   * @generated
   */
  EClass getSMTOr();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTOr#getOperands <em>Operands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operands</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTOr#getOperands()
   * @see #getSMTOr()
   * @generated
   */
  EReference getSMTOr_Operands();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTImpl <em>SMT Impl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Impl</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTImpl
   * @generated
   */
  EClass getSMTImpl();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTImpl#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTImpl#getLeftOperand()
   * @see #getSMTImpl()
   * @generated
   */
  EReference getSMTImpl_LeftOperand();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTImpl#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTImpl#getRightOperand()
   * @see #getSMTImpl()
   * @generated
   */
  EReference getSMTImpl_RightOperand();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTNot <em>SMT Not</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Not</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTNot
   * @generated
   */
  EClass getSMTNot();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTNot#getOperand <em>Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operand</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTNot#getOperand()
   * @see #getSMTNot()
   * @generated
   */
  EReference getSMTNot_Operand();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTIff <em>SMT Iff</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Iff</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTIff
   * @generated
   */
  EClass getSMTIff();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTIff#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTIff#getLeftOperand()
   * @see #getSMTIff()
   * @generated
   */
  EReference getSMTIff_LeftOperand();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTIff#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTIff#getRightOperand()
   * @see #getSMTIff()
   * @generated
   */
  EReference getSMTIff_RightOperand();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTITE <em>SMTITE</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMTITE</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTITE
   * @generated
   */
  EClass getSMTITE();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTITE#getCondition <em>Condition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Condition</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTITE#getCondition()
   * @see #getSMTITE()
   * @generated
   */
  EReference getSMTITE_Condition();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTITE#getIf <em>If</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>If</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTITE#getIf()
   * @see #getSMTITE()
   * @generated
   */
  EReference getSMTITE_If();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTITE#getElse <em>Else</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTITE#getElse()
   * @see #getSMTITE()
   * @generated
   */
  EReference getSMTITE_Else();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTLet <em>SMT Let</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Let</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTLet
   * @generated
   */
  EClass getSMTLet();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTLet#getInlineConstantDefinitions <em>Inline Constant Definitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Inline Constant Definitions</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTLet#getInlineConstantDefinitions()
   * @see #getSMTLet()
   * @generated
   */
  EReference getSMTLet_InlineConstantDefinitions();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTLet#getTerm <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Term</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTLet#getTerm()
   * @see #getSMTLet()
   * @generated
   */
  EReference getSMTLet_Term();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTInlineConstantDefinition <em>SMT Inline Constant Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Inline Constant Definition</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTInlineConstantDefinition
   * @generated
   */
  EClass getSMTInlineConstantDefinition();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTInlineConstantDefinition#getDefinition <em>Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Definition</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTInlineConstantDefinition#getDefinition()
   * @see #getSMTInlineConstantDefinition()
   * @generated
   */
  EReference getSMTInlineConstantDefinition_Definition();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTRelation <em>SMT Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Relation</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTRelation
   * @generated
   */
  EClass getSMTRelation();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTEquals <em>SMT Equals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Equals</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTEquals
   * @generated
   */
  EClass getSMTEquals();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTEquals#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTEquals#getLeftOperand()
   * @see #getSMTEquals()
   * @generated
   */
  EReference getSMTEquals_LeftOperand();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTEquals#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTEquals#getRightOperand()
   * @see #getSMTEquals()
   * @generated
   */
  EReference getSMTEquals_RightOperand();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTDistinct <em>SMT Distinct</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Distinct</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTDistinct
   * @generated
   */
  EClass getSMTDistinct();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTDistinct#getOperands <em>Operands</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Operands</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTDistinct#getOperands()
   * @see #getSMTDistinct()
   * @generated
   */
  EReference getSMTDistinct_Operands();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTLT <em>SMTLT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMTLT</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTLT
   * @generated
   */
  EClass getSMTLT();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTLT#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTLT#getLeftOperand()
   * @see #getSMTLT()
   * @generated
   */
  EReference getSMTLT_LeftOperand();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTLT#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTLT#getRightOperand()
   * @see #getSMTLT()
   * @generated
   */
  EReference getSMTLT_RightOperand();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTMT <em>SMTMT</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMTMT</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTMT
   * @generated
   */
  EClass getSMTMT();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTMT#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTMT#getLeftOperand()
   * @see #getSMTMT()
   * @generated
   */
  EReference getSMTMT_LeftOperand();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTMT#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTMT#getRightOperand()
   * @see #getSMTMT()
   * @generated
   */
  EReference getSMTMT_RightOperand();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTLEQ <em>SMTLEQ</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMTLEQ</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTLEQ
   * @generated
   */
  EClass getSMTLEQ();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTLEQ#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTLEQ#getLeftOperand()
   * @see #getSMTLEQ()
   * @generated
   */
  EReference getSMTLEQ_LeftOperand();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTLEQ#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTLEQ#getRightOperand()
   * @see #getSMTLEQ()
   * @generated
   */
  EReference getSMTLEQ_RightOperand();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTMEQ <em>SMTMEQ</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMTMEQ</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTMEQ
   * @generated
   */
  EClass getSMTMEQ();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTMEQ#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTMEQ#getLeftOperand()
   * @see #getSMTMEQ()
   * @generated
   */
  EReference getSMTMEQ_LeftOperand();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTMEQ#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTMEQ#getRightOperand()
   * @see #getSMTMEQ()
   * @generated
   */
  EReference getSMTMEQ_RightOperand();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTIntOperation <em>SMT Int Operation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Int Operation</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTIntOperation
   * @generated
   */
  EClass getSMTIntOperation();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTIntOperation#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTIntOperation#getLeftOperand()
   * @see #getSMTIntOperation()
   * @generated
   */
  EReference getSMTIntOperation_LeftOperand();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTIntOperation#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTIntOperation#getRightOperand()
   * @see #getSMTIntOperation()
   * @generated
   */
  EReference getSMTIntOperation_RightOperand();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTPlus <em>SMT Plus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Plus</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTPlus
   * @generated
   */
  EClass getSMTPlus();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTMinus <em>SMT Minus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Minus</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTMinus
   * @generated
   */
  EClass getSMTMinus();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTMultiply <em>SMT Multiply</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Multiply</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTMultiply
   * @generated
   */
  EClass getSMTMultiply();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTDivison <em>SMT Divison</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Divison</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTDivison
   * @generated
   */
  EClass getSMTDivison();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTDiv <em>SMT Div</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Div</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTDiv
   * @generated
   */
  EClass getSMTDiv();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTMod <em>SMT Mod</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Mod</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTMod
   * @generated
   */
  EClass getSMTMod();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTAssertion <em>SMT Assertion</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Assertion</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTAssertion
   * @generated
   */
  EClass getSMTAssertion();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTAssertion#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTAssertion#getValue()
   * @see #getSMTAssertion()
   * @generated
   */
  EReference getSMTAssertion_Value();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTCardinalityConstraint <em>SMT Cardinality Constraint</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Cardinality Constraint</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTCardinalityConstraint
   * @generated
   */
  EClass getSMTCardinalityConstraint();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTCardinalityConstraint#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTCardinalityConstraint#getType()
   * @see #getSMTCardinalityConstraint()
   * @generated
   */
  EReference getSMTCardinalityConstraint_Type();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTCardinalityConstraint#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTCardinalityConstraint#getElements()
   * @see #getSMTCardinalityConstraint()
   * @generated
   */
  EReference getSMTCardinalityConstraint_Elements();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSatCommand <em>SMT Sat Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Sat Command</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSatCommand
   * @generated
   */
  EClass getSMTSatCommand();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSimpleSatCommand <em>SMT Simple Sat Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Simple Sat Command</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSimpleSatCommand
   * @generated
   */
  EClass getSMTSimpleSatCommand();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTComplexSatCommand <em>SMT Complex Sat Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Complex Sat Command</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTComplexSatCommand
   * @generated
   */
  EClass getSMTComplexSatCommand();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTComplexSatCommand#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Method</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTComplexSatCommand#getMethod()
   * @see #getSMTComplexSatCommand()
   * @generated
   */
  EReference getSMTComplexSatCommand_Method();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTGetModelCommand <em>SMT Get Model Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Get Model Command</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTGetModelCommand
   * @generated
   */
  EClass getSMTGetModelCommand();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTReasoningTactic <em>SMT Reasoning Tactic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Reasoning Tactic</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTReasoningTactic
   * @generated
   */
  EClass getSMTReasoningTactic();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTBuiltinTactic <em>SMT Builtin Tactic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Builtin Tactic</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTBuiltinTactic
   * @generated
   */
  EClass getSMTBuiltinTactic();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTBuiltinTactic#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTBuiltinTactic#getName()
   * @see #getSMTBuiltinTactic()
   * @generated
   */
  EAttribute getSMTBuiltinTactic_Name();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTReasoningCombinator <em>SMT Reasoning Combinator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Reasoning Combinator</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTReasoningCombinator
   * @generated
   */
  EClass getSMTReasoningCombinator();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTAndThenCombinator <em>SMT And Then Combinator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT And Then Combinator</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTAndThenCombinator
   * @generated
   */
  EClass getSMTAndThenCombinator();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTAndThenCombinator#getTactics <em>Tactics</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tactics</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTAndThenCombinator#getTactics()
   * @see #getSMTAndThenCombinator()
   * @generated
   */
  EReference getSMTAndThenCombinator_Tactics();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTOrElseCombinator <em>SMT Or Else Combinator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Or Else Combinator</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTOrElseCombinator
   * @generated
   */
  EClass getSMTOrElseCombinator();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTOrElseCombinator#getTactics <em>Tactics</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tactics</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTOrElseCombinator#getTactics()
   * @see #getSMTOrElseCombinator()
   * @generated
   */
  EReference getSMTOrElseCombinator_Tactics();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTParOrCombinator <em>SMT Par Or Combinator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Par Or Combinator</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTParOrCombinator
   * @generated
   */
  EClass getSMTParOrCombinator();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTParOrCombinator#getTactics <em>Tactics</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Tactics</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTParOrCombinator#getTactics()
   * @see #getSMTParOrCombinator()
   * @generated
   */
  EReference getSMTParOrCombinator_Tactics();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTParThenCombinator <em>SMT Par Then Combinator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Par Then Combinator</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTParThenCombinator
   * @generated
   */
  EClass getSMTParThenCombinator();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTParThenCombinator#getPreProcessingTactic <em>Pre Processing Tactic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pre Processing Tactic</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTParThenCombinator#getPreProcessingTactic()
   * @see #getSMTParThenCombinator()
   * @generated
   */
  EReference getSMTParThenCombinator_PreProcessingTactic();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTParThenCombinator#getParalellyPostpricessingTactic <em>Paralelly Postpricessing Tactic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Paralelly Postpricessing Tactic</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTParThenCombinator#getParalellyPostpricessingTactic()
   * @see #getSMTParThenCombinator()
   * @generated
   */
  EReference getSMTParThenCombinator_ParalellyPostpricessingTactic();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTTryForCombinator <em>SMT Try For Combinator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Try For Combinator</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTTryForCombinator
   * @generated
   */
  EClass getSMTTryForCombinator();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTTryForCombinator#getTactic <em>Tactic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tactic</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTTryForCombinator#getTactic()
   * @see #getSMTTryForCombinator()
   * @generated
   */
  EReference getSMTTryForCombinator_Tactic();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTTryForCombinator#getTime <em>Time</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Time</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTTryForCombinator#getTime()
   * @see #getSMTTryForCombinator()
   * @generated
   */
  EAttribute getSMTTryForCombinator_Time();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTIfCombinator <em>SMT If Combinator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT If Combinator</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTIfCombinator
   * @generated
   */
  EClass getSMTIfCombinator();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTIfCombinator#getProbe <em>Probe</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Probe</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTIfCombinator#getProbe()
   * @see #getSMTIfCombinator()
   * @generated
   */
  EReference getSMTIfCombinator_Probe();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTIfCombinator#getIfTactic <em>If Tactic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>If Tactic</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTIfCombinator#getIfTactic()
   * @see #getSMTIfCombinator()
   * @generated
   */
  EReference getSMTIfCombinator_IfTactic();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTIfCombinator#getElseTactic <em>Else Tactic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else Tactic</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTIfCombinator#getElseTactic()
   * @see #getSMTIfCombinator()
   * @generated
   */
  EReference getSMTIfCombinator_ElseTactic();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTWhenCombinator <em>SMT When Combinator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT When Combinator</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTWhenCombinator
   * @generated
   */
  EClass getSMTWhenCombinator();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTWhenCombinator#getProbe <em>Probe</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Probe</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTWhenCombinator#getProbe()
   * @see #getSMTWhenCombinator()
   * @generated
   */
  EReference getSMTWhenCombinator_Probe();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTWhenCombinator#getTactic <em>Tactic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tactic</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTWhenCombinator#getTactic()
   * @see #getSMTWhenCombinator()
   * @generated
   */
  EReference getSMTWhenCombinator_Tactic();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTFailIfCombinator <em>SMT Fail If Combinator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Fail If Combinator</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTFailIfCombinator
   * @generated
   */
  EClass getSMTFailIfCombinator();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTFailIfCombinator#getProbe <em>Probe</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Probe</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTFailIfCombinator#getProbe()
   * @see #getSMTFailIfCombinator()
   * @generated
   */
  EReference getSMTFailIfCombinator_Probe();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTUsingParamCombinator <em>SMT Using Param Combinator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Using Param Combinator</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTUsingParamCombinator
   * @generated
   */
  EClass getSMTUsingParamCombinator();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTUsingParamCombinator#getTactic <em>Tactic</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Tactic</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTUsingParamCombinator#getTactic()
   * @see #getSMTUsingParamCombinator()
   * @generated
   */
  EReference getSMTUsingParamCombinator_Tactic();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTUsingParamCombinator#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTUsingParamCombinator#getParameters()
   * @see #getSMTUsingParamCombinator()
   * @generated
   */
  EReference getSMTUsingParamCombinator_Parameters();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.ReasoningProbe <em>Reasoning Probe</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reasoning Probe</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.ReasoningProbe
   * @generated
   */
  EClass getReasoningProbe();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.ReasoningProbe#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.ReasoningProbe#getName()
   * @see #getReasoningProbe()
   * @generated
   */
  EAttribute getReasoningProbe_Name();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.ReasoningTacticParameter <em>Reasoning Tactic Parameter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reasoning Tactic Parameter</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.ReasoningTacticParameter
   * @generated
   */
  EClass getReasoningTacticParameter();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.ReasoningTacticParameter#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.ReasoningTacticParameter#getName()
   * @see #getReasoningTacticParameter()
   * @generated
   */
  EAttribute getReasoningTacticParameter_Name();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.ReasoningTacticParameter#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.ReasoningTacticParameter#getValue()
   * @see #getReasoningTacticParameter()
   * @generated
   */
  EReference getReasoningTacticParameter_Value();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTResult <em>SMT Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Result</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTResult
   * @generated
   */
  EClass getSMTResult();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTErrorResult <em>SMT Error Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Error Result</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTErrorResult
   * @generated
   */
  EClass getSMTErrorResult();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTErrorResult#getMessage <em>Message</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Message</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTErrorResult#getMessage()
   * @see #getSMTErrorResult()
   * @generated
   */
  EAttribute getSMTErrorResult_Message();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTUnsupportedResult <em>SMT Unsupported Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Unsupported Result</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTUnsupportedResult
   * @generated
   */
  EClass getSMTUnsupportedResult();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTUnsupportedResult#getCommand <em>Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Command</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTUnsupportedResult#getCommand()
   * @see #getSMTUnsupportedResult()
   * @generated
   */
  EAttribute getSMTUnsupportedResult_Command();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSatResult <em>SMT Sat Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Sat Result</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSatResult
   * @generated
   */
  EClass getSMTSatResult();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSatResult#isSat <em>Sat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Sat</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSatResult#isSat()
   * @see #getSMTSatResult()
   * @generated
   */
  EAttribute getSMTSatResult_Sat();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSatResult#isUnsat <em>Unsat</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unsat</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSatResult#isUnsat()
   * @see #getSMTSatResult()
   * @generated
   */
  EAttribute getSMTSatResult_Unsat();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSatResult#isUnknown <em>Unknown</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unknown</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSatResult#isUnknown()
   * @see #getSMTSatResult()
   * @generated
   */
  EAttribute getSMTSatResult_Unknown();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTModelResult <em>SMT Model Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Model Result</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTModelResult
   * @generated
   */
  EClass getSMTModelResult();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTModelResult#getNewFunctionDeclarations <em>New Function Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>New Function Declarations</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTModelResult#getNewFunctionDeclarations()
   * @see #getSMTModelResult()
   * @generated
   */
  EReference getSMTModelResult_NewFunctionDeclarations();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTModelResult#getTypeDefinitions <em>Type Definitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Type Definitions</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTModelResult#getTypeDefinitions()
   * @see #getSMTModelResult()
   * @generated
   */
  EReference getSMTModelResult_TypeDefinitions();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTModelResult#getNewFunctionDefinitions <em>New Function Definitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>New Function Definitions</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTModelResult#getNewFunctionDefinitions()
   * @see #getSMTModelResult()
   * @generated
   */
  EReference getSMTModelResult_NewFunctionDefinitions();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTStatisticValue <em>SMT Statistic Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Statistic Value</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTStatisticValue
   * @generated
   */
  EClass getSMTStatisticValue();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTStatisticValue#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTStatisticValue#getName()
   * @see #getSMTStatisticValue()
   * @generated
   */
  EAttribute getSMTStatisticValue_Name();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTStatisticIntValue <em>SMT Statistic Int Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Statistic Int Value</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTStatisticIntValue
   * @generated
   */
  EClass getSMTStatisticIntValue();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTStatisticIntValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTStatisticIntValue#getValue()
   * @see #getSMTStatisticIntValue()
   * @generated
   */
  EAttribute getSMTStatisticIntValue_Value();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTStatisticDoubleValue <em>SMT Statistic Double Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Statistic Double Value</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTStatisticDoubleValue
   * @generated
   */
  EClass getSMTStatisticDoubleValue();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTStatisticDoubleValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTStatisticDoubleValue#getValue()
   * @see #getSMTStatisticDoubleValue()
   * @generated
   */
  EAttribute getSMTStatisticDoubleValue_Value();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTStatisticsSection <em>SMT Statistics Section</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SMT Statistics Section</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTStatisticsSection
   * @generated
   */
  EClass getSMTStatisticsSection();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.SMTStatisticsSection#getValues <em>Values</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Values</em>'.
   * @see hu.bme.mit.inf.dslreasoner.smtLanguage.SMTStatisticsSection#getValues()
   * @see #getSMTStatisticsSection()
   * @generated
   */
  EReference getSMTStatisticsSection_Values();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SmtLanguageFactory getSmtLanguageFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTDocumentImpl <em>SMT Document</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTDocumentImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTDocument()
     * @generated
     */
    EClass SMT_DOCUMENT = eINSTANCE.getSMTDocument();

    /**
     * The meta object literal for the '<em><b>Input</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_DOCUMENT__INPUT = eINSTANCE.getSMTDocument_Input();

    /**
     * The meta object literal for the '<em><b>Output</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_DOCUMENT__OUTPUT = eINSTANCE.getSMTDocument_Output();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTInputImpl <em>SMT Input</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTInputImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTInput()
     * @generated
     */
    EClass SMT_INPUT = eINSTANCE.getSMTInput();

    /**
     * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_INPUT__OPTIONS = eINSTANCE.getSMTInput_Options();

    /**
     * The meta object literal for the '<em><b>Type Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_INPUT__TYPE_DECLARATIONS = eINSTANCE.getSMTInput_TypeDeclarations();

    /**
     * The meta object literal for the '<em><b>Function Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_INPUT__FUNCTION_DECLARATIONS = eINSTANCE.getSMTInput_FunctionDeclarations();

    /**
     * The meta object literal for the '<em><b>Function Definition</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_INPUT__FUNCTION_DEFINITION = eINSTANCE.getSMTInput_FunctionDefinition();

    /**
     * The meta object literal for the '<em><b>Assertions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_INPUT__ASSERTIONS = eINSTANCE.getSMTInput_Assertions();

    /**
     * The meta object literal for the '<em><b>Sat Command</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_INPUT__SAT_COMMAND = eINSTANCE.getSMTInput_SatCommand();

    /**
     * The meta object literal for the '<em><b>Get Model Command</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_INPUT__GET_MODEL_COMMAND = eINSTANCE.getSMTInput_GetModelCommand();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTOutputImpl <em>SMT Output</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTOutputImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTOutput()
     * @generated
     */
    EClass SMT_OUTPUT = eINSTANCE.getSMTOutput();

    /**
     * The meta object literal for the '<em><b>Sat Result</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_OUTPUT__SAT_RESULT = eINSTANCE.getSMTOutput_SatResult();

    /**
     * The meta object literal for the '<em><b>Get Model Result</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_OUTPUT__GET_MODEL_RESULT = eINSTANCE.getSMTOutput_GetModelResult();

    /**
     * The meta object literal for the '<em><b>Statistics</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_OUTPUT__STATISTICS = eINSTANCE.getSMTOutput_Statistics();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTOptionImpl <em>SMT Option</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTOptionImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTOption()
     * @generated
     */
    EClass SMT_OPTION = eINSTANCE.getSMTOption();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SMT_OPTION__NAME = eINSTANCE.getSMTOption_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_OPTION__VALUE = eINSTANCE.getSMTOption_Value();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTTypeImpl <em>SMT Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTTypeImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTType()
     * @generated
     */
    EClass SMT_TYPE = eINSTANCE.getSMTType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SMT_TYPE__NAME = eINSTANCE.getSMTType_Name();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTEnumLiteralImpl <em>SMT Enum Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTEnumLiteralImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTEnumLiteral()
     * @generated
     */
    EClass SMT_ENUM_LITERAL = eINSTANCE.getSMTEnumLiteral();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTEnumeratedTypeDeclarationImpl <em>SMT Enumerated Type Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTEnumeratedTypeDeclarationImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTEnumeratedTypeDeclaration()
     * @generated
     */
    EClass SMT_ENUMERATED_TYPE_DECLARATION = eINSTANCE.getSMTEnumeratedTypeDeclaration();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_ENUMERATED_TYPE_DECLARATION__ELEMENTS = eINSTANCE.getSMTEnumeratedTypeDeclaration_Elements();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTSetTypeDeclarationImpl <em>SMT Set Type Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTSetTypeDeclarationImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTSetTypeDeclaration()
     * @generated
     */
    EClass SMT_SET_TYPE_DECLARATION = eINSTANCE.getSMTSetTypeDeclaration();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTTypeReferenceImpl <em>SMT Type Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTTypeReferenceImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTTypeReference()
     * @generated
     */
    EClass SMT_TYPE_REFERENCE = eINSTANCE.getSMTTypeReference();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTComplexTypeReferenceImpl <em>SMT Complex Type Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTComplexTypeReferenceImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTComplexTypeReference()
     * @generated
     */
    EClass SMT_COMPLEX_TYPE_REFERENCE = eINSTANCE.getSMTComplexTypeReference();

    /**
     * The meta object literal for the '<em><b>Referred</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_COMPLEX_TYPE_REFERENCE__REFERRED = eINSTANCE.getSMTComplexTypeReference_Referred();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTPrimitiveTypeReferenceImpl <em>SMT Primitive Type Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTPrimitiveTypeReferenceImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTPrimitiveTypeReference()
     * @generated
     */
    EClass SMT_PRIMITIVE_TYPE_REFERENCE = eINSTANCE.getSMTPrimitiveTypeReference();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTIntTypeReferenceImpl <em>SMT Int Type Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTIntTypeReferenceImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTIntTypeReference()
     * @generated
     */
    EClass SMT_INT_TYPE_REFERENCE = eINSTANCE.getSMTIntTypeReference();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTBoolTypeReferenceImpl <em>SMT Bool Type Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTBoolTypeReferenceImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTBoolTypeReference()
     * @generated
     */
    EClass SMT_BOOL_TYPE_REFERENCE = eINSTANCE.getSMTBoolTypeReference();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTRealTypeReferenceImpl <em>SMT Real Type Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTRealTypeReferenceImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTRealTypeReference()
     * @generated
     */
    EClass SMT_REAL_TYPE_REFERENCE = eINSTANCE.getSMTRealTypeReference();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTFunctionDeclarationImpl <em>SMT Function Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTFunctionDeclarationImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTFunctionDeclaration()
     * @generated
     */
    EClass SMT_FUNCTION_DECLARATION = eINSTANCE.getSMTFunctionDeclaration();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_FUNCTION_DECLARATION__PARAMETERS = eINSTANCE.getSMTFunctionDeclaration_Parameters();

    /**
     * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_FUNCTION_DECLARATION__RANGE = eINSTANCE.getSMTFunctionDeclaration_Range();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTFunctionDefinitionImpl <em>SMT Function Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTFunctionDefinitionImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTFunctionDefinition()
     * @generated
     */
    EClass SMT_FUNCTION_DEFINITION = eINSTANCE.getSMTFunctionDefinition();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_FUNCTION_DEFINITION__PARAMETERS = eINSTANCE.getSMTFunctionDefinition_Parameters();

    /**
     * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_FUNCTION_DEFINITION__RANGE = eINSTANCE.getSMTFunctionDefinition_Range();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_FUNCTION_DEFINITION__VALUE = eINSTANCE.getSMTFunctionDefinition_Value();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTTermImpl <em>SMT Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTTermImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTTerm()
     * @generated
     */
    EClass SMT_TERM = eINSTANCE.getSMTTerm();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTSymbolicDeclarationImpl <em>SMT Symbolic Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTSymbolicDeclarationImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTSymbolicDeclaration()
     * @generated
     */
    EClass SMT_SYMBOLIC_DECLARATION = eINSTANCE.getSMTSymbolicDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SMT_SYMBOLIC_DECLARATION__NAME = eINSTANCE.getSMTSymbolicDeclaration_Name();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTSymbolicValueImpl <em>SMT Symbolic Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTSymbolicValueImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTSymbolicValue()
     * @generated
     */
    EClass SMT_SYMBOLIC_VALUE = eINSTANCE.getSMTSymbolicValue();

    /**
     * The meta object literal for the '<em><b>Symbolic Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_SYMBOLIC_VALUE__SYMBOLIC_REFERENCE = eINSTANCE.getSMTSymbolicValue_SymbolicReference();

    /**
     * The meta object literal for the '<em><b>Parameter Substitutions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_SYMBOLIC_VALUE__PARAMETER_SUBSTITUTIONS = eINSTANCE.getSMTSymbolicValue_ParameterSubstitutions();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTAtomicTermImpl <em>SMT Atomic Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTAtomicTermImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTAtomicTerm()
     * @generated
     */
    EClass SMT_ATOMIC_TERM = eINSTANCE.getSMTAtomicTerm();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTIntLiteralImpl <em>SMT Int Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTIntLiteralImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTIntLiteral()
     * @generated
     */
    EClass SMT_INT_LITERAL = eINSTANCE.getSMTIntLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SMT_INT_LITERAL__VALUE = eINSTANCE.getSMTIntLiteral_Value();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTBoolLiteralImpl <em>SMT Bool Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTBoolLiteralImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTBoolLiteral()
     * @generated
     */
    EClass SMT_BOOL_LITERAL = eINSTANCE.getSMTBoolLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SMT_BOOL_LITERAL__VALUE = eINSTANCE.getSMTBoolLiteral_Value();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTRealLiteralImpl <em>SMT Real Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTRealLiteralImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTRealLiteral()
     * @generated
     */
    EClass SMT_REAL_LITERAL = eINSTANCE.getSMTRealLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SMT_REAL_LITERAL__VALUE = eINSTANCE.getSMTRealLiteral_Value();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTSortedVariableImpl <em>SMT Sorted Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTSortedVariableImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTSortedVariable()
     * @generated
     */
    EClass SMT_SORTED_VARIABLE = eINSTANCE.getSMTSortedVariable();

    /**
     * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_SORTED_VARIABLE__RANGE = eINSTANCE.getSMTSortedVariable_Range();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTQuantifiedExpressionImpl <em>SMT Quantified Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTQuantifiedExpressionImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTQuantifiedExpression()
     * @generated
     */
    EClass SMT_QUANTIFIED_EXPRESSION = eINSTANCE.getSMTQuantifiedExpression();

    /**
     * The meta object literal for the '<em><b>Quantified Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_QUANTIFIED_EXPRESSION__QUANTIFIED_VARIABLES = eINSTANCE.getSMTQuantifiedExpression_QuantifiedVariables();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_QUANTIFIED_EXPRESSION__EXPRESSION = eINSTANCE.getSMTQuantifiedExpression_Expression();

    /**
     * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_QUANTIFIED_EXPRESSION__PATTERN = eINSTANCE.getSMTQuantifiedExpression_Pattern();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTExistsImpl <em>SMT Exists</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTExistsImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTExists()
     * @generated
     */
    EClass SMT_EXISTS = eINSTANCE.getSMTExists();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTForallImpl <em>SMT Forall</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTForallImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTForall()
     * @generated
     */
    EClass SMT_FORALL = eINSTANCE.getSMTForall();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTBoolOperationImpl <em>SMT Bool Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTBoolOperationImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTBoolOperation()
     * @generated
     */
    EClass SMT_BOOL_OPERATION = eINSTANCE.getSMTBoolOperation();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTAndImpl <em>SMT And</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTAndImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTAnd()
     * @generated
     */
    EClass SMT_AND = eINSTANCE.getSMTAnd();

    /**
     * The meta object literal for the '<em><b>Operands</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_AND__OPERANDS = eINSTANCE.getSMTAnd_Operands();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTOrImpl <em>SMT Or</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTOrImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTOr()
     * @generated
     */
    EClass SMT_OR = eINSTANCE.getSMTOr();

    /**
     * The meta object literal for the '<em><b>Operands</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_OR__OPERANDS = eINSTANCE.getSMTOr_Operands();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTImplImpl <em>SMT Impl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTImplImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTImpl()
     * @generated
     */
    EClass SMT_IMPL = eINSTANCE.getSMTImpl();

    /**
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_IMPL__LEFT_OPERAND = eINSTANCE.getSMTImpl_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_IMPL__RIGHT_OPERAND = eINSTANCE.getSMTImpl_RightOperand();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTNotImpl <em>SMT Not</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTNotImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTNot()
     * @generated
     */
    EClass SMT_NOT = eINSTANCE.getSMTNot();

    /**
     * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_NOT__OPERAND = eINSTANCE.getSMTNot_Operand();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTIffImpl <em>SMT Iff</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTIffImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTIff()
     * @generated
     */
    EClass SMT_IFF = eINSTANCE.getSMTIff();

    /**
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_IFF__LEFT_OPERAND = eINSTANCE.getSMTIff_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_IFF__RIGHT_OPERAND = eINSTANCE.getSMTIff_RightOperand();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTITEImpl <em>SMTITE</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTITEImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTITE()
     * @generated
     */
    EClass SMTITE = eINSTANCE.getSMTITE();

    /**
     * The meta object literal for the '<em><b>Condition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMTITE__CONDITION = eINSTANCE.getSMTITE_Condition();

    /**
     * The meta object literal for the '<em><b>If</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMTITE__IF = eINSTANCE.getSMTITE_If();

    /**
     * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMTITE__ELSE = eINSTANCE.getSMTITE_Else();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTLetImpl <em>SMT Let</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTLetImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTLet()
     * @generated
     */
    EClass SMT_LET = eINSTANCE.getSMTLet();

    /**
     * The meta object literal for the '<em><b>Inline Constant Definitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_LET__INLINE_CONSTANT_DEFINITIONS = eINSTANCE.getSMTLet_InlineConstantDefinitions();

    /**
     * The meta object literal for the '<em><b>Term</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_LET__TERM = eINSTANCE.getSMTLet_Term();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTInlineConstantDefinitionImpl <em>SMT Inline Constant Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTInlineConstantDefinitionImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTInlineConstantDefinition()
     * @generated
     */
    EClass SMT_INLINE_CONSTANT_DEFINITION = eINSTANCE.getSMTInlineConstantDefinition();

    /**
     * The meta object literal for the '<em><b>Definition</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_INLINE_CONSTANT_DEFINITION__DEFINITION = eINSTANCE.getSMTInlineConstantDefinition_Definition();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTRelationImpl <em>SMT Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTRelationImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTRelation()
     * @generated
     */
    EClass SMT_RELATION = eINSTANCE.getSMTRelation();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTEqualsImpl <em>SMT Equals</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTEqualsImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTEquals()
     * @generated
     */
    EClass SMT_EQUALS = eINSTANCE.getSMTEquals();

    /**
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_EQUALS__LEFT_OPERAND = eINSTANCE.getSMTEquals_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_EQUALS__RIGHT_OPERAND = eINSTANCE.getSMTEquals_RightOperand();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTDistinctImpl <em>SMT Distinct</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTDistinctImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTDistinct()
     * @generated
     */
    EClass SMT_DISTINCT = eINSTANCE.getSMTDistinct();

    /**
     * The meta object literal for the '<em><b>Operands</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_DISTINCT__OPERANDS = eINSTANCE.getSMTDistinct_Operands();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTLTImpl <em>SMTLT</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTLTImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTLT()
     * @generated
     */
    EClass SMTLT = eINSTANCE.getSMTLT();

    /**
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMTLT__LEFT_OPERAND = eINSTANCE.getSMTLT_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMTLT__RIGHT_OPERAND = eINSTANCE.getSMTLT_RightOperand();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTMTImpl <em>SMTMT</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTMTImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTMT()
     * @generated
     */
    EClass SMTMT = eINSTANCE.getSMTMT();

    /**
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMTMT__LEFT_OPERAND = eINSTANCE.getSMTMT_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMTMT__RIGHT_OPERAND = eINSTANCE.getSMTMT_RightOperand();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTLEQImpl <em>SMTLEQ</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTLEQImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTLEQ()
     * @generated
     */
    EClass SMTLEQ = eINSTANCE.getSMTLEQ();

    /**
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMTLEQ__LEFT_OPERAND = eINSTANCE.getSMTLEQ_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMTLEQ__RIGHT_OPERAND = eINSTANCE.getSMTLEQ_RightOperand();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTMEQImpl <em>SMTMEQ</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTMEQImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTMEQ()
     * @generated
     */
    EClass SMTMEQ = eINSTANCE.getSMTMEQ();

    /**
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMTMEQ__LEFT_OPERAND = eINSTANCE.getSMTMEQ_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMTMEQ__RIGHT_OPERAND = eINSTANCE.getSMTMEQ_RightOperand();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTIntOperationImpl <em>SMT Int Operation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTIntOperationImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTIntOperation()
     * @generated
     */
    EClass SMT_INT_OPERATION = eINSTANCE.getSMTIntOperation();

    /**
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_INT_OPERATION__LEFT_OPERAND = eINSTANCE.getSMTIntOperation_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_INT_OPERATION__RIGHT_OPERAND = eINSTANCE.getSMTIntOperation_RightOperand();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTPlusImpl <em>SMT Plus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTPlusImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTPlus()
     * @generated
     */
    EClass SMT_PLUS = eINSTANCE.getSMTPlus();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTMinusImpl <em>SMT Minus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTMinusImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTMinus()
     * @generated
     */
    EClass SMT_MINUS = eINSTANCE.getSMTMinus();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTMultiplyImpl <em>SMT Multiply</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTMultiplyImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTMultiply()
     * @generated
     */
    EClass SMT_MULTIPLY = eINSTANCE.getSMTMultiply();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTDivisonImpl <em>SMT Divison</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTDivisonImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTDivison()
     * @generated
     */
    EClass SMT_DIVISON = eINSTANCE.getSMTDivison();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTDivImpl <em>SMT Div</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTDivImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTDiv()
     * @generated
     */
    EClass SMT_DIV = eINSTANCE.getSMTDiv();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTModImpl <em>SMT Mod</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTModImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTMod()
     * @generated
     */
    EClass SMT_MOD = eINSTANCE.getSMTMod();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTAssertionImpl <em>SMT Assertion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTAssertionImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTAssertion()
     * @generated
     */
    EClass SMT_ASSERTION = eINSTANCE.getSMTAssertion();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_ASSERTION__VALUE = eINSTANCE.getSMTAssertion_Value();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTCardinalityConstraintImpl <em>SMT Cardinality Constraint</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTCardinalityConstraintImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTCardinalityConstraint()
     * @generated
     */
    EClass SMT_CARDINALITY_CONSTRAINT = eINSTANCE.getSMTCardinalityConstraint();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_CARDINALITY_CONSTRAINT__TYPE = eINSTANCE.getSMTCardinalityConstraint_Type();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_CARDINALITY_CONSTRAINT__ELEMENTS = eINSTANCE.getSMTCardinalityConstraint_Elements();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTSatCommandImpl <em>SMT Sat Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTSatCommandImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTSatCommand()
     * @generated
     */
    EClass SMT_SAT_COMMAND = eINSTANCE.getSMTSatCommand();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTSimpleSatCommandImpl <em>SMT Simple Sat Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTSimpleSatCommandImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTSimpleSatCommand()
     * @generated
     */
    EClass SMT_SIMPLE_SAT_COMMAND = eINSTANCE.getSMTSimpleSatCommand();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTComplexSatCommandImpl <em>SMT Complex Sat Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTComplexSatCommandImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTComplexSatCommand()
     * @generated
     */
    EClass SMT_COMPLEX_SAT_COMMAND = eINSTANCE.getSMTComplexSatCommand();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_COMPLEX_SAT_COMMAND__METHOD = eINSTANCE.getSMTComplexSatCommand_Method();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTGetModelCommandImpl <em>SMT Get Model Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTGetModelCommandImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTGetModelCommand()
     * @generated
     */
    EClass SMT_GET_MODEL_COMMAND = eINSTANCE.getSMTGetModelCommand();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTReasoningTacticImpl <em>SMT Reasoning Tactic</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTReasoningTacticImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTReasoningTactic()
     * @generated
     */
    EClass SMT_REASONING_TACTIC = eINSTANCE.getSMTReasoningTactic();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTBuiltinTacticImpl <em>SMT Builtin Tactic</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTBuiltinTacticImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTBuiltinTactic()
     * @generated
     */
    EClass SMT_BUILTIN_TACTIC = eINSTANCE.getSMTBuiltinTactic();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SMT_BUILTIN_TACTIC__NAME = eINSTANCE.getSMTBuiltinTactic_Name();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTReasoningCombinatorImpl <em>SMT Reasoning Combinator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTReasoningCombinatorImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTReasoningCombinator()
     * @generated
     */
    EClass SMT_REASONING_COMBINATOR = eINSTANCE.getSMTReasoningCombinator();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTAndThenCombinatorImpl <em>SMT And Then Combinator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTAndThenCombinatorImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTAndThenCombinator()
     * @generated
     */
    EClass SMT_AND_THEN_COMBINATOR = eINSTANCE.getSMTAndThenCombinator();

    /**
     * The meta object literal for the '<em><b>Tactics</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_AND_THEN_COMBINATOR__TACTICS = eINSTANCE.getSMTAndThenCombinator_Tactics();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTOrElseCombinatorImpl <em>SMT Or Else Combinator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTOrElseCombinatorImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTOrElseCombinator()
     * @generated
     */
    EClass SMT_OR_ELSE_COMBINATOR = eINSTANCE.getSMTOrElseCombinator();

    /**
     * The meta object literal for the '<em><b>Tactics</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_OR_ELSE_COMBINATOR__TACTICS = eINSTANCE.getSMTOrElseCombinator_Tactics();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTParOrCombinatorImpl <em>SMT Par Or Combinator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTParOrCombinatorImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTParOrCombinator()
     * @generated
     */
    EClass SMT_PAR_OR_COMBINATOR = eINSTANCE.getSMTParOrCombinator();

    /**
     * The meta object literal for the '<em><b>Tactics</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_PAR_OR_COMBINATOR__TACTICS = eINSTANCE.getSMTParOrCombinator_Tactics();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTParThenCombinatorImpl <em>SMT Par Then Combinator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTParThenCombinatorImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTParThenCombinator()
     * @generated
     */
    EClass SMT_PAR_THEN_COMBINATOR = eINSTANCE.getSMTParThenCombinator();

    /**
     * The meta object literal for the '<em><b>Pre Processing Tactic</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_PAR_THEN_COMBINATOR__PRE_PROCESSING_TACTIC = eINSTANCE.getSMTParThenCombinator_PreProcessingTactic();

    /**
     * The meta object literal for the '<em><b>Paralelly Postpricessing Tactic</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_PAR_THEN_COMBINATOR__PARALELLY_POSTPRICESSING_TACTIC = eINSTANCE.getSMTParThenCombinator_ParalellyPostpricessingTactic();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTTryForCombinatorImpl <em>SMT Try For Combinator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTTryForCombinatorImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTTryForCombinator()
     * @generated
     */
    EClass SMT_TRY_FOR_COMBINATOR = eINSTANCE.getSMTTryForCombinator();

    /**
     * The meta object literal for the '<em><b>Tactic</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_TRY_FOR_COMBINATOR__TACTIC = eINSTANCE.getSMTTryForCombinator_Tactic();

    /**
     * The meta object literal for the '<em><b>Time</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SMT_TRY_FOR_COMBINATOR__TIME = eINSTANCE.getSMTTryForCombinator_Time();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTIfCombinatorImpl <em>SMT If Combinator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTIfCombinatorImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTIfCombinator()
     * @generated
     */
    EClass SMT_IF_COMBINATOR = eINSTANCE.getSMTIfCombinator();

    /**
     * The meta object literal for the '<em><b>Probe</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_IF_COMBINATOR__PROBE = eINSTANCE.getSMTIfCombinator_Probe();

    /**
     * The meta object literal for the '<em><b>If Tactic</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_IF_COMBINATOR__IF_TACTIC = eINSTANCE.getSMTIfCombinator_IfTactic();

    /**
     * The meta object literal for the '<em><b>Else Tactic</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_IF_COMBINATOR__ELSE_TACTIC = eINSTANCE.getSMTIfCombinator_ElseTactic();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTWhenCombinatorImpl <em>SMT When Combinator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTWhenCombinatorImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTWhenCombinator()
     * @generated
     */
    EClass SMT_WHEN_COMBINATOR = eINSTANCE.getSMTWhenCombinator();

    /**
     * The meta object literal for the '<em><b>Probe</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_WHEN_COMBINATOR__PROBE = eINSTANCE.getSMTWhenCombinator_Probe();

    /**
     * The meta object literal for the '<em><b>Tactic</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_WHEN_COMBINATOR__TACTIC = eINSTANCE.getSMTWhenCombinator_Tactic();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTFailIfCombinatorImpl <em>SMT Fail If Combinator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTFailIfCombinatorImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTFailIfCombinator()
     * @generated
     */
    EClass SMT_FAIL_IF_COMBINATOR = eINSTANCE.getSMTFailIfCombinator();

    /**
     * The meta object literal for the '<em><b>Probe</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_FAIL_IF_COMBINATOR__PROBE = eINSTANCE.getSMTFailIfCombinator_Probe();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTUsingParamCombinatorImpl <em>SMT Using Param Combinator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTUsingParamCombinatorImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTUsingParamCombinator()
     * @generated
     */
    EClass SMT_USING_PARAM_COMBINATOR = eINSTANCE.getSMTUsingParamCombinator();

    /**
     * The meta object literal for the '<em><b>Tactic</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_USING_PARAM_COMBINATOR__TACTIC = eINSTANCE.getSMTUsingParamCombinator_Tactic();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_USING_PARAM_COMBINATOR__PARAMETERS = eINSTANCE.getSMTUsingParamCombinator_Parameters();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.ReasoningProbeImpl <em>Reasoning Probe</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.ReasoningProbeImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getReasoningProbe()
     * @generated
     */
    EClass REASONING_PROBE = eINSTANCE.getReasoningProbe();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REASONING_PROBE__NAME = eINSTANCE.getReasoningProbe_Name();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.ReasoningTacticParameterImpl <em>Reasoning Tactic Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.ReasoningTacticParameterImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getReasoningTacticParameter()
     * @generated
     */
    EClass REASONING_TACTIC_PARAMETER = eINSTANCE.getReasoningTacticParameter();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REASONING_TACTIC_PARAMETER__NAME = eINSTANCE.getReasoningTacticParameter_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REASONING_TACTIC_PARAMETER__VALUE = eINSTANCE.getReasoningTacticParameter_Value();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTResultImpl <em>SMT Result</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTResultImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTResult()
     * @generated
     */
    EClass SMT_RESULT = eINSTANCE.getSMTResult();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTErrorResultImpl <em>SMT Error Result</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTErrorResultImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTErrorResult()
     * @generated
     */
    EClass SMT_ERROR_RESULT = eINSTANCE.getSMTErrorResult();

    /**
     * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SMT_ERROR_RESULT__MESSAGE = eINSTANCE.getSMTErrorResult_Message();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTUnsupportedResultImpl <em>SMT Unsupported Result</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTUnsupportedResultImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTUnsupportedResult()
     * @generated
     */
    EClass SMT_UNSUPPORTED_RESULT = eINSTANCE.getSMTUnsupportedResult();

    /**
     * The meta object literal for the '<em><b>Command</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SMT_UNSUPPORTED_RESULT__COMMAND = eINSTANCE.getSMTUnsupportedResult_Command();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTSatResultImpl <em>SMT Sat Result</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTSatResultImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTSatResult()
     * @generated
     */
    EClass SMT_SAT_RESULT = eINSTANCE.getSMTSatResult();

    /**
     * The meta object literal for the '<em><b>Sat</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SMT_SAT_RESULT__SAT = eINSTANCE.getSMTSatResult_Sat();

    /**
     * The meta object literal for the '<em><b>Unsat</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SMT_SAT_RESULT__UNSAT = eINSTANCE.getSMTSatResult_Unsat();

    /**
     * The meta object literal for the '<em><b>Unknown</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SMT_SAT_RESULT__UNKNOWN = eINSTANCE.getSMTSatResult_Unknown();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTModelResultImpl <em>SMT Model Result</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTModelResultImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTModelResult()
     * @generated
     */
    EClass SMT_MODEL_RESULT = eINSTANCE.getSMTModelResult();

    /**
     * The meta object literal for the '<em><b>New Function Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_MODEL_RESULT__NEW_FUNCTION_DECLARATIONS = eINSTANCE.getSMTModelResult_NewFunctionDeclarations();

    /**
     * The meta object literal for the '<em><b>Type Definitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_MODEL_RESULT__TYPE_DEFINITIONS = eINSTANCE.getSMTModelResult_TypeDefinitions();

    /**
     * The meta object literal for the '<em><b>New Function Definitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_MODEL_RESULT__NEW_FUNCTION_DEFINITIONS = eINSTANCE.getSMTModelResult_NewFunctionDefinitions();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTStatisticValueImpl <em>SMT Statistic Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTStatisticValueImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTStatisticValue()
     * @generated
     */
    EClass SMT_STATISTIC_VALUE = eINSTANCE.getSMTStatisticValue();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SMT_STATISTIC_VALUE__NAME = eINSTANCE.getSMTStatisticValue_Name();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTStatisticIntValueImpl <em>SMT Statistic Int Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTStatisticIntValueImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTStatisticIntValue()
     * @generated
     */
    EClass SMT_STATISTIC_INT_VALUE = eINSTANCE.getSMTStatisticIntValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SMT_STATISTIC_INT_VALUE__VALUE = eINSTANCE.getSMTStatisticIntValue_Value();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTStatisticDoubleValueImpl <em>SMT Statistic Double Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTStatisticDoubleValueImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTStatisticDoubleValue()
     * @generated
     */
    EClass SMT_STATISTIC_DOUBLE_VALUE = eINSTANCE.getSMTStatisticDoubleValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SMT_STATISTIC_DOUBLE_VALUE__VALUE = eINSTANCE.getSMTStatisticDoubleValue_Value();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTStatisticsSectionImpl <em>SMT Statistics Section</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SMTStatisticsSectionImpl
     * @see hu.bme.mit.inf.dslreasoner.smtLanguage.impl.SmtLanguagePackageImpl#getSMTStatisticsSection()
     * @generated
     */
    EClass SMT_STATISTICS_SECTION = eINSTANCE.getSMTStatisticsSection();

    /**
     * The meta object literal for the '<em><b>Values</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SMT_STATISTICS_SECTION__VALUES = eINSTANCE.getSMTStatisticsSection_Values();

  }

} //SmtLanguagePackage
