/**
 */
package hu.bme.mit.inf.dslreasoner.alloyLanguage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguageFactory
 * @model kind="package"
 * @generated
 */
public interface AlloyLanguagePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "alloyLanguage";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.bme.hu/mit/inf/dslreasoner/AlloyLanguage";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "alloyLanguage";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AlloyLanguagePackage eINSTANCE = hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl.init();

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSDocumentImpl <em>ALS Document</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSDocumentImpl
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSDocument()
   * @generated
   */
  int ALS_DOCUMENT = 0;

  /**
   * The feature id for the '<em><b>Enum Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_DOCUMENT__ENUM_DECLARATIONS = 0;

  /**
   * The feature id for the '<em><b>Signature Bodies</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_DOCUMENT__SIGNATURE_BODIES = 1;

  /**
   * The feature id for the '<em><b>Function Definitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_DOCUMENT__FUNCTION_DEFINITIONS = 2;

  /**
   * The feature id for the '<em><b>Relation Definitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_DOCUMENT__RELATION_DEFINITIONS = 3;

  /**
   * The feature id for the '<em><b>Fact Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_DOCUMENT__FACT_DECLARATIONS = 4;

  /**
   * The feature id for the '<em><b>Run Command</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_DOCUMENT__RUN_COMMAND = 5;

  /**
   * The number of structural features of the '<em>ALS Document</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_DOCUMENT_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSRelationDeclarationImpl <em>ALS Relation Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSRelationDeclarationImpl
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSRelationDeclaration()
   * @generated
   */
  int ALS_RELATION_DECLARATION = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_RELATION_DECLARATION__NAME = 0;

  /**
   * The number of structural features of the '<em>ALS Relation Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_RELATION_DECLARATION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSTypeDeclarationImpl <em>ALS Type Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSTypeDeclarationImpl
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSTypeDeclaration()
   * @generated
   */
  int ALS_TYPE_DECLARATION = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_TYPE_DECLARATION__NAME = ALS_RELATION_DECLARATION__NAME;

  /**
   * The number of structural features of the '<em>ALS Type Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_TYPE_DECLARATION_FEATURE_COUNT = ALS_RELATION_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSEnumDeclarationImpl <em>ALS Enum Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSEnumDeclarationImpl
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSEnumDeclaration()
   * @generated
   */
  int ALS_ENUM_DECLARATION = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_ENUM_DECLARATION__NAME = ALS_TYPE_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Literal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_ENUM_DECLARATION__LITERAL = ALS_TYPE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>ALS Enum Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_ENUM_DECLARATION_FEATURE_COUNT = ALS_TYPE_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSEnumLiteralImpl <em>ALS Enum Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSEnumLiteralImpl
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSEnumLiteral()
   * @generated
   */
  int ALS_ENUM_LITERAL = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_ENUM_LITERAL__NAME = ALS_RELATION_DECLARATION__NAME;

  /**
   * The number of structural features of the '<em>ALS Enum Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_ENUM_LITERAL_FEATURE_COUNT = ALS_RELATION_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSSignatureDeclarationImpl <em>ALS Signature Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSSignatureDeclarationImpl
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSSignatureDeclaration()
   * @generated
   */
  int ALS_SIGNATURE_DECLARATION = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_SIGNATURE_DECLARATION__NAME = ALS_TYPE_DECLARATION__NAME;

  /**
   * The number of structural features of the '<em>ALS Signature Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_SIGNATURE_DECLARATION_FEATURE_COUNT = ALS_TYPE_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSSignatureBodyImpl <em>ALS Signature Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSSignatureBodyImpl
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSSignatureBody()
   * @generated
   */
  int ALS_SIGNATURE_BODY = 6;

  /**
   * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_SIGNATURE_BODY__MULTIPLICITY = 0;

  /**
   * The feature id for the '<em><b>Abstract</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_SIGNATURE_BODY__ABSTRACT = 1;

  /**
   * The feature id for the '<em><b>Declarations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_SIGNATURE_BODY__DECLARATIONS = 2;

  /**
   * The feature id for the '<em><b>Supertype</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_SIGNATURE_BODY__SUPERTYPE = 3;

  /**
   * The feature id for the '<em><b>Superset</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_SIGNATURE_BODY__SUPERSET = 4;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_SIGNATURE_BODY__FIELDS = 5;

  /**
   * The number of structural features of the '<em>ALS Signature Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_SIGNATURE_BODY_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSFieldDeclarationImpl <em>ALS Field Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSFieldDeclarationImpl
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSFieldDeclaration()
   * @generated
   */
  int ALS_FIELD_DECLARATION = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_FIELD_DECLARATION__NAME = ALS_RELATION_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_FIELD_DECLARATION__MULTIPLICITY = ALS_RELATION_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_FIELD_DECLARATION__TYPE = ALS_RELATION_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ALS Field Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_FIELD_DECLARATION_FEATURE_COUNT = ALS_RELATION_DECLARATION_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSDefinitionImpl <em>ALS Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSDefinitionImpl
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSDefinition()
   * @generated
   */
  int ALS_DEFINITION = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_DEFINITION__NAME = 0;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_DEFINITION__VARIABLES = 1;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_DEFINITION__VALUE = 2;

  /**
   * The number of structural features of the '<em>ALS Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_DEFINITION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSFunctionDefinitionImpl <em>ALS Function Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSFunctionDefinitionImpl
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSFunctionDefinition()
   * @generated
   */
  int ALS_FUNCTION_DEFINITION = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_FUNCTION_DEFINITION__NAME = ALS_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_FUNCTION_DEFINITION__VARIABLES = ALS_DEFINITION__VARIABLES;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_FUNCTION_DEFINITION__VALUE = ALS_DEFINITION__VALUE;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_FUNCTION_DEFINITION__TYPE = ALS_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>ALS Function Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_FUNCTION_DEFINITION_FEATURE_COUNT = ALS_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSRelationDefinitionImpl <em>ALS Relation Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSRelationDefinitionImpl
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSRelationDefinition()
   * @generated
   */
  int ALS_RELATION_DEFINITION = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_RELATION_DEFINITION__NAME = ALS_DEFINITION__NAME;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_RELATION_DEFINITION__VARIABLES = ALS_DEFINITION__VARIABLES;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_RELATION_DEFINITION__VALUE = ALS_DEFINITION__VALUE;

  /**
   * The number of structural features of the '<em>ALS Relation Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_RELATION_DEFINITION_FEATURE_COUNT = ALS_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSFactDeclarationImpl <em>ALS Fact Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSFactDeclarationImpl
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSFactDeclaration()
   * @generated
   */
  int ALS_FACT_DECLARATION = 11;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_FACT_DECLARATION__NAME = 0;

  /**
   * The feature id for the '<em><b>Term</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_FACT_DECLARATION__TERM = 1;

  /**
   * The number of structural features of the '<em>ALS Fact Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_FACT_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSTermImpl <em>ALS Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSTermImpl
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSTerm()
   * @generated
   */
  int ALS_TERM = 12;

  /**
   * The number of structural features of the '<em>ALS Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_TERM_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSVariableDeclarationImpl <em>ALS Variable Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSVariableDeclarationImpl
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSVariableDeclaration()
   * @generated
   */
  int ALS_VARIABLE_DECLARATION = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_VARIABLE_DECLARATION__NAME = ALS_RELATION_DECLARATION__NAME;

  /**
   * The feature id for the '<em><b>Range</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_VARIABLE_DECLARATION__RANGE = ALS_RELATION_DECLARATION_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>ALS Variable Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_VARIABLE_DECLARATION_FEATURE_COUNT = ALS_RELATION_DECLARATION_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSRunCommandImpl <em>ALS Run Command</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSRunCommandImpl
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSRunCommand()
   * @generated
   */
  int ALS_RUN_COMMAND = 14;

  /**
   * The feature id for the '<em><b>Type Scopes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_RUN_COMMAND__TYPE_SCOPES = 0;

  /**
   * The number of structural features of the '<em>ALS Run Command</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_RUN_COMMAND_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSTypeScopeImpl <em>ALS Type Scope</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSTypeScopeImpl
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSTypeScope()
   * @generated
   */
  int ALS_TYPE_SCOPE = 15;

  /**
   * The feature id for the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_TYPE_SCOPE__NUMBER = 0;

  /**
   * The number of structural features of the '<em>ALS Type Scope</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_TYPE_SCOPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSSigScopeImpl <em>ALS Sig Scope</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSSigScopeImpl
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSSigScope()
   * @generated
   */
  int ALS_SIG_SCOPE = 16;

  /**
   * The feature id for the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_SIG_SCOPE__NUMBER = ALS_TYPE_SCOPE__NUMBER;

  /**
   * The feature id for the '<em><b>Exactly</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_SIG_SCOPE__EXACTLY = ALS_TYPE_SCOPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_SIG_SCOPE__TYPE = ALS_TYPE_SCOPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ALS Sig Scope</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_SIG_SCOPE_FEATURE_COUNT = ALS_TYPE_SCOPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSIntScopeImpl <em>ALS Int Scope</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSIntScopeImpl
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSIntScope()
   * @generated
   */
  int ALS_INT_SCOPE = 17;

  /**
   * The feature id for the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_INT_SCOPE__NUMBER = ALS_TYPE_SCOPE__NUMBER;

  /**
   * The number of structural features of the '<em>ALS Int Scope</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_INT_SCOPE_FEATURE_COUNT = ALS_TYPE_SCOPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSStringScopeImpl <em>ALS String Scope</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSStringScopeImpl
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSStringScope()
   * @generated
   */
  int ALS_STRING_SCOPE = 18;

  /**
   * The feature id for the '<em><b>Number</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_STRING_SCOPE__NUMBER = ALS_TYPE_SCOPE__NUMBER;

  /**
   * The number of structural features of the '<em>ALS String Scope</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_STRING_SCOPE_FEATURE_COUNT = ALS_TYPE_SCOPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSQuantifiedExImpl <em>ALS Quantified Ex</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSQuantifiedExImpl
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSQuantifiedEx()
   * @generated
   */
  int ALS_QUANTIFIED_EX = 19;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_QUANTIFIED_EX__TYPE = ALS_TERM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Disj</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_QUANTIFIED_EX__DISJ = ALS_TERM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_QUANTIFIED_EX__VARIABLES = ALS_TERM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_QUANTIFIED_EX__EXPRESSION = ALS_TERM_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>ALS Quantified Ex</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_QUANTIFIED_EX_FEATURE_COUNT = ALS_TERM_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSOrImpl <em>ALS Or</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSOrImpl
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSOr()
   * @generated
   */
  int ALS_OR = 20;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_OR__LEFT_OPERAND = ALS_TERM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_OR__RIGHT_OPERAND = ALS_TERM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ALS Or</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_OR_FEATURE_COUNT = ALS_TERM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSIffImpl <em>ALS Iff</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSIffImpl
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSIff()
   * @generated
   */
  int ALS_IFF = 21;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_IFF__LEFT_OPERAND = ALS_TERM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_IFF__RIGHT_OPERAND = ALS_TERM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ALS Iff</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_IFF_FEATURE_COUNT = ALS_TERM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSImplImpl <em>ALS Impl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSImplImpl
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSImpl()
   * @generated
   */
  int ALS_IMPL = 22;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_IMPL__LEFT_OPERAND = ALS_TERM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_IMPL__RIGHT_OPERAND = ALS_TERM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Else Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_IMPL__ELSE_OPERAND = ALS_TERM_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>ALS Impl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_IMPL_FEATURE_COUNT = ALS_TERM_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSAndImpl <em>ALS And</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSAndImpl
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSAnd()
   * @generated
   */
  int ALS_AND = 23;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_AND__LEFT_OPERAND = ALS_TERM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_AND__RIGHT_OPERAND = ALS_TERM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ALS And</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_AND_FEATURE_COUNT = ALS_TERM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSEqualsImpl <em>ALS Equals</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSEqualsImpl
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSEquals()
   * @generated
   */
  int ALS_EQUALS = 24;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_EQUALS__LEFT_OPERAND = ALS_TERM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_EQUALS__RIGHT_OPERAND = ALS_TERM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ALS Equals</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_EQUALS_FEATURE_COUNT = ALS_TERM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSNotEqualsImpl <em>ALS Not Equals</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSNotEqualsImpl
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSNotEquals()
   * @generated
   */
  int ALS_NOT_EQUALS = 25;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_NOT_EQUALS__LEFT_OPERAND = ALS_TERM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_NOT_EQUALS__RIGHT_OPERAND = ALS_TERM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ALS Not Equals</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_NOT_EQUALS_FEATURE_COUNT = ALS_TERM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSSubsetImpl <em>ALS Subset</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSSubsetImpl
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSSubset()
   * @generated
   */
  int ALS_SUBSET = 26;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_SUBSET__LEFT_OPERAND = ALS_TERM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_SUBSET__RIGHT_OPERAND = ALS_TERM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ALS Subset</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_SUBSET_FEATURE_COUNT = ALS_TERM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSLessImpl <em>ALS Less</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSLessImpl
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSLess()
   * @generated
   */
  int ALS_LESS = 27;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_LESS__LEFT_OPERAND = ALS_TERM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_LESS__RIGHT_OPERAND = ALS_TERM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ALS Less</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_LESS_FEATURE_COUNT = ALS_TERM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSLeqImpl <em>ALS Leq</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSLeqImpl
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSLeq()
   * @generated
   */
  int ALS_LEQ = 28;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_LEQ__LEFT_OPERAND = ALS_TERM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_LEQ__RIGHT_OPERAND = ALS_TERM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ALS Leq</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_LEQ_FEATURE_COUNT = ALS_TERM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSMoreImpl <em>ALS More</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSMoreImpl
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSMore()
   * @generated
   */
  int ALS_MORE = 29;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_MORE__LEFT_OPERAND = ALS_TERM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_MORE__RIGHT_OPERAND = ALS_TERM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ALS More</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_MORE_FEATURE_COUNT = ALS_TERM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSMeqImpl <em>ALS Meq</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSMeqImpl
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSMeq()
   * @generated
   */
  int ALS_MEQ = 30;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_MEQ__LEFT_OPERAND = ALS_TERM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_MEQ__RIGHT_OPERAND = ALS_TERM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ALS Meq</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_MEQ_FEATURE_COUNT = ALS_TERM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSOverrideImpl <em>ALS Override</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSOverrideImpl
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSOverride()
   * @generated
   */
  int ALS_OVERRIDE = 31;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_OVERRIDE__LEFT_OPERAND = ALS_TERM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_OVERRIDE__RIGHT_OPERAND = ALS_TERM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ALS Override</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_OVERRIDE_FEATURE_COUNT = ALS_TERM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSRangeRestrictionRightImpl <em>ALS Range Restriction Right</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSRangeRestrictionRightImpl
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSRangeRestrictionRight()
   * @generated
   */
  int ALS_RANGE_RESTRICTION_RIGHT = 32;

  /**
   * The feature id for the '<em><b>Relation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_RANGE_RESTRICTION_RIGHT__RELATION = ALS_TERM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_RANGE_RESTRICTION_RIGHT__FILTER = ALS_TERM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ALS Range Restriction Right</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_RANGE_RESTRICTION_RIGHT_FEATURE_COUNT = ALS_TERM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSRangeRestrictionLeftImpl <em>ALS Range Restriction Left</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSRangeRestrictionLeftImpl
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSRangeRestrictionLeft()
   * @generated
   */
  int ALS_RANGE_RESTRICTION_LEFT = 33;

  /**
   * The feature id for the '<em><b>Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_RANGE_RESTRICTION_LEFT__FILTER = ALS_TERM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Relation</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_RANGE_RESTRICTION_LEFT__RELATION = ALS_TERM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ALS Range Restriction Left</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_RANGE_RESTRICTION_LEFT_FEATURE_COUNT = ALS_TERM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSJoinImpl <em>ALS Join</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSJoinImpl
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSJoin()
   * @generated
   */
  int ALS_JOIN = 34;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_JOIN__LEFT_OPERAND = ALS_TERM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_JOIN__RIGHT_OPERAND = ALS_TERM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ALS Join</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_JOIN_FEATURE_COUNT = ALS_TERM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSMinusImpl <em>ALS Minus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSMinusImpl
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSMinus()
   * @generated
   */
  int ALS_MINUS = 35;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_MINUS__LEFT_OPERAND = ALS_TERM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_MINUS__RIGHT_OPERAND = ALS_TERM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ALS Minus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_MINUS_FEATURE_COUNT = ALS_TERM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSPlusImpl <em>ALS Plus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSPlusImpl
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSPlus()
   * @generated
   */
  int ALS_PLUS = 36;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_PLUS__LEFT_OPERAND = ALS_TERM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_PLUS__RIGHT_OPERAND = ALS_TERM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ALS Plus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_PLUS_FEATURE_COUNT = ALS_TERM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSIntersectionImpl <em>ALS Intersection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSIntersectionImpl
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSIntersection()
   * @generated
   */
  int ALS_INTERSECTION = 37;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_INTERSECTION__LEFT_OPERAND = ALS_TERM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_INTERSECTION__RIGHT_OPERAND = ALS_TERM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ALS Intersection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_INTERSECTION_FEATURE_COUNT = ALS_TERM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSDirectProductImpl <em>ALS Direct Product</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSDirectProductImpl
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSDirectProduct()
   * @generated
   */
  int ALS_DIRECT_PRODUCT = 38;

  /**
   * The feature id for the '<em><b>Left Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_DIRECT_PRODUCT__LEFT_OPERAND = ALS_TERM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Left Multiplicit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_DIRECT_PRODUCT__LEFT_MULTIPLICIT = ALS_TERM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right Multiplicit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_DIRECT_PRODUCT__RIGHT_MULTIPLICIT = ALS_TERM_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Right Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_DIRECT_PRODUCT__RIGHT_OPERAND = ALS_TERM_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>ALS Direct Product</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_DIRECT_PRODUCT_FEATURE_COUNT = ALS_TERM_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSNotImpl <em>ALS Not</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSNotImpl
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSNot()
   * @generated
   */
  int ALS_NOT = 39;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_NOT__OPERAND = ALS_TERM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>ALS Not</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_NOT_FEATURE_COUNT = ALS_TERM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSInverseRelationImpl <em>ALS Inverse Relation</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSInverseRelationImpl
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSInverseRelation()
   * @generated
   */
  int ALS_INVERSE_RELATION = 40;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_INVERSE_RELATION__OPERAND = ALS_TERM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>ALS Inverse Relation</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_INVERSE_RELATION_FEATURE_COUNT = ALS_TERM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlSTransitiveClosureImpl <em>Al STransitive Closure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlSTransitiveClosureImpl
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getAlSTransitiveClosure()
   * @generated
   */
  int AL_STRANSITIVE_CLOSURE = 41;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AL_STRANSITIVE_CLOSURE__OPERAND = ALS_TERM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Al STransitive Closure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AL_STRANSITIVE_CLOSURE_FEATURE_COUNT = ALS_TERM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSReflectiveTransitiveClosureImpl <em>ALS Reflective Transitive Closure</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSReflectiveTransitiveClosureImpl
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSReflectiveTransitiveClosure()
   * @generated
   */
  int ALS_REFLECTIVE_TRANSITIVE_CLOSURE = 42;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_REFLECTIVE_TRANSITIVE_CLOSURE__OPERAND = ALS_TERM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>ALS Reflective Transitive Closure</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_REFLECTIVE_TRANSITIVE_CLOSURE_FEATURE_COUNT = ALS_TERM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSCardinalityImpl <em>ALS Cardinality</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSCardinalityImpl
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSCardinality()
   * @generated
   */
  int ALS_CARDINALITY = 43;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_CARDINALITY__OPERAND = ALS_TERM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>ALS Cardinality</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_CARDINALITY_FEATURE_COUNT = ALS_TERM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSUnaryMinusImpl <em>ALS Unary Minus</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSUnaryMinusImpl
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSUnaryMinus()
   * @generated
   */
  int ALS_UNARY_MINUS = 44;

  /**
   * The feature id for the '<em><b>Operand</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_UNARY_MINUS__OPERAND = ALS_TERM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>ALS Unary Minus</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_UNARY_MINUS_FEATURE_COUNT = ALS_TERM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSSumImpl <em>ALS Sum</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSSumImpl
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSSum()
   * @generated
   */
  int ALS_SUM = 45;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_SUM__VARIABLES = ALS_TERM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_SUM__EXPRESSION = ALS_TERM_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>ALS Sum</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_SUM_FEATURE_COUNT = ALS_TERM_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSFunctionCallImpl <em>ALS Function Call</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSFunctionCallImpl
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSFunctionCall()
   * @generated
   */
  int ALS_FUNCTION_CALL = 46;

  /**
   * The feature id for the '<em><b>Referred Definition</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_FUNCTION_CALL__REFERRED_DEFINITION = ALS_TERM_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Referred Numeric Operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_FUNCTION_CALL__REFERRED_NUMERIC_OPERATOR = ALS_TERM_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Params</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_FUNCTION_CALL__PARAMS = ALS_TERM_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>ALS Function Call</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_FUNCTION_CALL_FEATURE_COUNT = ALS_TERM_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSNoneImpl <em>ALS None</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSNoneImpl
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSNone()
   * @generated
   */
  int ALS_NONE = 47;

  /**
   * The number of structural features of the '<em>ALS None</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_NONE_FEATURE_COUNT = ALS_TERM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSIdenImpl <em>ALS Iden</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSIdenImpl
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSIden()
   * @generated
   */
  int ALS_IDEN = 48;

  /**
   * The number of structural features of the '<em>ALS Iden</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_IDEN_FEATURE_COUNT = ALS_TERM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSUnivImpl <em>ALS Univ</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSUnivImpl
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSUniv()
   * @generated
   */
  int ALS_UNIV = 49;

  /**
   * The number of structural features of the '<em>ALS Univ</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_UNIV_FEATURE_COUNT = ALS_TERM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSIntImpl <em>ALS Int</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSIntImpl
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSInt()
   * @generated
   */
  int ALS_INT = 50;

  /**
   * The number of structural features of the '<em>ALS Int</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_INT_FEATURE_COUNT = ALS_TERM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSStringImpl <em>ALS String</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSStringImpl
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSString()
   * @generated
   */
  int ALS_STRING = 51;

  /**
   * The number of structural features of the '<em>ALS String</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_STRING_FEATURE_COUNT = ALS_TERM_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSReferenceImpl <em>ALS Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSReferenceImpl
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSReference()
   * @generated
   */
  int ALS_REFERENCE = 52;

  /**
   * The feature id for the '<em><b>Referred</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_REFERENCE__REFERRED = ALS_TERM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>ALS Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_REFERENCE_FEATURE_COUNT = ALS_TERM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSNumberLiteralImpl <em>ALS Number Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSNumberLiteralImpl
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSNumberLiteral()
   * @generated
   */
  int ALS_NUMBER_LITERAL = 53;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_NUMBER_LITERAL__VALUE = ALS_TERM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>ALS Number Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_NUMBER_LITERAL_FEATURE_COUNT = ALS_TERM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSStringLiteralImpl <em>ALS String Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSStringLiteralImpl
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSStringLiteral()
   * @generated
   */
  int ALS_STRING_LITERAL = 54;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_STRING_LITERAL__VALUE = ALS_TERM_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>ALS String Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALS_STRING_LITERAL_FEATURE_COUNT = ALS_TERM_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSMultiplicity <em>ALS Multiplicity</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSMultiplicity
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSMultiplicity()
   * @generated
   */
  int ALS_MULTIPLICITY = 55;

  /**
   * The meta object id for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSNumericOperator <em>ALS Numeric Operator</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSNumericOperator
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSNumericOperator()
   * @generated
   */
  int ALS_NUMERIC_OPERATOR = 56;


  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDocument <em>ALS Document</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ALS Document</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDocument
   * @generated
   */
  EClass getALSDocument();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDocument#getEnumDeclarations <em>Enum Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Enum Declarations</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDocument#getEnumDeclarations()
   * @see #getALSDocument()
   * @generated
   */
  EReference getALSDocument_EnumDeclarations();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDocument#getSignatureBodies <em>Signature Bodies</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Signature Bodies</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDocument#getSignatureBodies()
   * @see #getALSDocument()
   * @generated
   */
  EReference getALSDocument_SignatureBodies();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDocument#getFunctionDefinitions <em>Function Definitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Function Definitions</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDocument#getFunctionDefinitions()
   * @see #getALSDocument()
   * @generated
   */
  EReference getALSDocument_FunctionDefinitions();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDocument#getRelationDefinitions <em>Relation Definitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Relation Definitions</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDocument#getRelationDefinitions()
   * @see #getALSDocument()
   * @generated
   */
  EReference getALSDocument_RelationDefinitions();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDocument#getFactDeclarations <em>Fact Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fact Declarations</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDocument#getFactDeclarations()
   * @see #getALSDocument()
   * @generated
   */
  EReference getALSDocument_FactDeclarations();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDocument#getRunCommand <em>Run Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Run Command</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDocument#getRunCommand()
   * @see #getALSDocument()
   * @generated
   */
  EReference getALSDocument_RunCommand();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSRelationDeclaration <em>ALS Relation Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ALS Relation Declaration</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSRelationDeclaration
   * @generated
   */
  EClass getALSRelationDeclaration();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSRelationDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSRelationDeclaration#getName()
   * @see #getALSRelationDeclaration()
   * @generated
   */
  EAttribute getALSRelationDeclaration_Name();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSTypeDeclaration <em>ALS Type Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ALS Type Declaration</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSTypeDeclaration
   * @generated
   */
  EClass getALSTypeDeclaration();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSEnumDeclaration <em>ALS Enum Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ALS Enum Declaration</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSEnumDeclaration
   * @generated
   */
  EClass getALSEnumDeclaration();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSEnumDeclaration#getLiteral <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Literal</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSEnumDeclaration#getLiteral()
   * @see #getALSEnumDeclaration()
   * @generated
   */
  EReference getALSEnumDeclaration_Literal();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSEnumLiteral <em>ALS Enum Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ALS Enum Literal</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSEnumLiteral
   * @generated
   */
  EClass getALSEnumLiteral();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSignatureDeclaration <em>ALS Signature Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ALS Signature Declaration</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSignatureDeclaration
   * @generated
   */
  EClass getALSSignatureDeclaration();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSignatureBody <em>ALS Signature Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ALS Signature Body</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSignatureBody
   * @generated
   */
  EClass getALSSignatureBody();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSignatureBody#getMultiplicity <em>Multiplicity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Multiplicity</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSignatureBody#getMultiplicity()
   * @see #getALSSignatureBody()
   * @generated
   */
  EAttribute getALSSignatureBody_Multiplicity();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSignatureBody#isAbstract <em>Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Abstract</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSignatureBody#isAbstract()
   * @see #getALSSignatureBody()
   * @generated
   */
  EAttribute getALSSignatureBody_Abstract();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSignatureBody#getDeclarations <em>Declarations</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Declarations</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSignatureBody#getDeclarations()
   * @see #getALSSignatureBody()
   * @generated
   */
  EReference getALSSignatureBody_Declarations();

  /**
   * Returns the meta object for the reference '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSignatureBody#getSupertype <em>Supertype</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Supertype</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSignatureBody#getSupertype()
   * @see #getALSSignatureBody()
   * @generated
   */
  EReference getALSSignatureBody_Supertype();

  /**
   * Returns the meta object for the reference list '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSignatureBody#getSuperset <em>Superset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Superset</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSignatureBody#getSuperset()
   * @see #getALSSignatureBody()
   * @generated
   */
  EReference getALSSignatureBody_Superset();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSignatureBody#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSignatureBody#getFields()
   * @see #getALSSignatureBody()
   * @generated
   */
  EReference getALSSignatureBody_Fields();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSFieldDeclaration <em>ALS Field Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ALS Field Declaration</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSFieldDeclaration
   * @generated
   */
  EClass getALSFieldDeclaration();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSFieldDeclaration#getMultiplicity <em>Multiplicity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Multiplicity</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSFieldDeclaration#getMultiplicity()
   * @see #getALSFieldDeclaration()
   * @generated
   */
  EAttribute getALSFieldDeclaration_Multiplicity();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSFieldDeclaration#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSFieldDeclaration#getType()
   * @see #getALSFieldDeclaration()
   * @generated
   */
  EReference getALSFieldDeclaration_Type();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDefinition <em>ALS Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ALS Definition</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDefinition
   * @generated
   */
  EClass getALSDefinition();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDefinition#getName()
   * @see #getALSDefinition()
   * @generated
   */
  EAttribute getALSDefinition_Name();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDefinition#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDefinition#getVariables()
   * @see #getALSDefinition()
   * @generated
   */
  EReference getALSDefinition_Variables();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDefinition#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDefinition#getValue()
   * @see #getALSDefinition()
   * @generated
   */
  EReference getALSDefinition_Value();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSFunctionDefinition <em>ALS Function Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ALS Function Definition</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSFunctionDefinition
   * @generated
   */
  EClass getALSFunctionDefinition();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSFunctionDefinition#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSFunctionDefinition#getType()
   * @see #getALSFunctionDefinition()
   * @generated
   */
  EReference getALSFunctionDefinition_Type();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSRelationDefinition <em>ALS Relation Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ALS Relation Definition</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSRelationDefinition
   * @generated
   */
  EClass getALSRelationDefinition();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSFactDeclaration <em>ALS Fact Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ALS Fact Declaration</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSFactDeclaration
   * @generated
   */
  EClass getALSFactDeclaration();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSFactDeclaration#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSFactDeclaration#getName()
   * @see #getALSFactDeclaration()
   * @generated
   */
  EAttribute getALSFactDeclaration_Name();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSFactDeclaration#getTerm <em>Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Term</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSFactDeclaration#getTerm()
   * @see #getALSFactDeclaration()
   * @generated
   */
  EReference getALSFactDeclaration_Term();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSTerm <em>ALS Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ALS Term</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSTerm
   * @generated
   */
  EClass getALSTerm();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSVariableDeclaration <em>ALS Variable Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ALS Variable Declaration</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSVariableDeclaration
   * @generated
   */
  EClass getALSVariableDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSVariableDeclaration#getRange <em>Range</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Range</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSVariableDeclaration#getRange()
   * @see #getALSVariableDeclaration()
   * @generated
   */
  EReference getALSVariableDeclaration_Range();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSRunCommand <em>ALS Run Command</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ALS Run Command</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSRunCommand
   * @generated
   */
  EClass getALSRunCommand();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSRunCommand#getTypeScopes <em>Type Scopes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Type Scopes</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSRunCommand#getTypeScopes()
   * @see #getALSRunCommand()
   * @generated
   */
  EReference getALSRunCommand_TypeScopes();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSTypeScope <em>ALS Type Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ALS Type Scope</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSTypeScope
   * @generated
   */
  EClass getALSTypeScope();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSTypeScope#getNumber <em>Number</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Number</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSTypeScope#getNumber()
   * @see #getALSTypeScope()
   * @generated
   */
  EAttribute getALSTypeScope_Number();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSigScope <em>ALS Sig Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ALS Sig Scope</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSigScope
   * @generated
   */
  EClass getALSSigScope();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSigScope#isExactly <em>Exactly</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Exactly</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSigScope#isExactly()
   * @see #getALSSigScope()
   * @generated
   */
  EAttribute getALSSigScope_Exactly();

  /**
   * Returns the meta object for the reference '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSigScope#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Type</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSigScope#getType()
   * @see #getALSSigScope()
   * @generated
   */
  EReference getALSSigScope_Type();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSIntScope <em>ALS Int Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ALS Int Scope</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSIntScope
   * @generated
   */
  EClass getALSIntScope();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSStringScope <em>ALS String Scope</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ALS String Scope</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSStringScope
   * @generated
   */
  EClass getALSStringScope();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSQuantifiedEx <em>ALS Quantified Ex</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ALS Quantified Ex</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSQuantifiedEx
   * @generated
   */
  EClass getALSQuantifiedEx();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSQuantifiedEx#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSQuantifiedEx#getType()
   * @see #getALSQuantifiedEx()
   * @generated
   */
  EAttribute getALSQuantifiedEx_Type();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSQuantifiedEx#isDisj <em>Disj</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Disj</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSQuantifiedEx#isDisj()
   * @see #getALSQuantifiedEx()
   * @generated
   */
  EAttribute getALSQuantifiedEx_Disj();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSQuantifiedEx#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSQuantifiedEx#getVariables()
   * @see #getALSQuantifiedEx()
   * @generated
   */
  EReference getALSQuantifiedEx_Variables();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSQuantifiedEx#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSQuantifiedEx#getExpression()
   * @see #getALSQuantifiedEx()
   * @generated
   */
  EReference getALSQuantifiedEx_Expression();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSOr <em>ALS Or</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ALS Or</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSOr
   * @generated
   */
  EClass getALSOr();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSOr#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSOr#getLeftOperand()
   * @see #getALSOr()
   * @generated
   */
  EReference getALSOr_LeftOperand();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSOr#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSOr#getRightOperand()
   * @see #getALSOr()
   * @generated
   */
  EReference getALSOr_RightOperand();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSIff <em>ALS Iff</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ALS Iff</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSIff
   * @generated
   */
  EClass getALSIff();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSIff#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSIff#getLeftOperand()
   * @see #getALSIff()
   * @generated
   */
  EReference getALSIff_LeftOperand();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSIff#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSIff#getRightOperand()
   * @see #getALSIff()
   * @generated
   */
  EReference getALSIff_RightOperand();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSImpl <em>ALS Impl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ALS Impl</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSImpl
   * @generated
   */
  EClass getALSImpl();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSImpl#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSImpl#getLeftOperand()
   * @see #getALSImpl()
   * @generated
   */
  EReference getALSImpl_LeftOperand();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSImpl#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSImpl#getRightOperand()
   * @see #getALSImpl()
   * @generated
   */
  EReference getALSImpl_RightOperand();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSImpl#getElseOperand <em>Else Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Else Operand</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSImpl#getElseOperand()
   * @see #getALSImpl()
   * @generated
   */
  EReference getALSImpl_ElseOperand();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSAnd <em>ALS And</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ALS And</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSAnd
   * @generated
   */
  EClass getALSAnd();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSAnd#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSAnd#getLeftOperand()
   * @see #getALSAnd()
   * @generated
   */
  EReference getALSAnd_LeftOperand();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSAnd#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSAnd#getRightOperand()
   * @see #getALSAnd()
   * @generated
   */
  EReference getALSAnd_RightOperand();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSEquals <em>ALS Equals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ALS Equals</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSEquals
   * @generated
   */
  EClass getALSEquals();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSEquals#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSEquals#getLeftOperand()
   * @see #getALSEquals()
   * @generated
   */
  EReference getALSEquals_LeftOperand();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSEquals#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSEquals#getRightOperand()
   * @see #getALSEquals()
   * @generated
   */
  EReference getALSEquals_RightOperand();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSNotEquals <em>ALS Not Equals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ALS Not Equals</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSNotEquals
   * @generated
   */
  EClass getALSNotEquals();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSNotEquals#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSNotEquals#getLeftOperand()
   * @see #getALSNotEquals()
   * @generated
   */
  EReference getALSNotEquals_LeftOperand();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSNotEquals#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSNotEquals#getRightOperand()
   * @see #getALSNotEquals()
   * @generated
   */
  EReference getALSNotEquals_RightOperand();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSubset <em>ALS Subset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ALS Subset</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSubset
   * @generated
   */
  EClass getALSSubset();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSubset#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSubset#getLeftOperand()
   * @see #getALSSubset()
   * @generated
   */
  EReference getALSSubset_LeftOperand();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSubset#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSubset#getRightOperand()
   * @see #getALSSubset()
   * @generated
   */
  EReference getALSSubset_RightOperand();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSLess <em>ALS Less</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ALS Less</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSLess
   * @generated
   */
  EClass getALSLess();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSLess#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSLess#getLeftOperand()
   * @see #getALSLess()
   * @generated
   */
  EReference getALSLess_LeftOperand();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSLess#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSLess#getRightOperand()
   * @see #getALSLess()
   * @generated
   */
  EReference getALSLess_RightOperand();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSLeq <em>ALS Leq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ALS Leq</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSLeq
   * @generated
   */
  EClass getALSLeq();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSLeq#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSLeq#getLeftOperand()
   * @see #getALSLeq()
   * @generated
   */
  EReference getALSLeq_LeftOperand();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSLeq#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSLeq#getRightOperand()
   * @see #getALSLeq()
   * @generated
   */
  EReference getALSLeq_RightOperand();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSMore <em>ALS More</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ALS More</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSMore
   * @generated
   */
  EClass getALSMore();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSMore#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSMore#getLeftOperand()
   * @see #getALSMore()
   * @generated
   */
  EReference getALSMore_LeftOperand();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSMore#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSMore#getRightOperand()
   * @see #getALSMore()
   * @generated
   */
  EReference getALSMore_RightOperand();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSMeq <em>ALS Meq</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ALS Meq</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSMeq
   * @generated
   */
  EClass getALSMeq();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSMeq#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSMeq#getLeftOperand()
   * @see #getALSMeq()
   * @generated
   */
  EReference getALSMeq_LeftOperand();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSMeq#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSMeq#getRightOperand()
   * @see #getALSMeq()
   * @generated
   */
  EReference getALSMeq_RightOperand();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSOverride <em>ALS Override</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ALS Override</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSOverride
   * @generated
   */
  EClass getALSOverride();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSOverride#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSOverride#getLeftOperand()
   * @see #getALSOverride()
   * @generated
   */
  EReference getALSOverride_LeftOperand();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSOverride#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSOverride#getRightOperand()
   * @see #getALSOverride()
   * @generated
   */
  EReference getALSOverride_RightOperand();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSRangeRestrictionRight <em>ALS Range Restriction Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ALS Range Restriction Right</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSRangeRestrictionRight
   * @generated
   */
  EClass getALSRangeRestrictionRight();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSRangeRestrictionRight#getRelation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Relation</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSRangeRestrictionRight#getRelation()
   * @see #getALSRangeRestrictionRight()
   * @generated
   */
  EReference getALSRangeRestrictionRight_Relation();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSRangeRestrictionRight#getFilter <em>Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Filter</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSRangeRestrictionRight#getFilter()
   * @see #getALSRangeRestrictionRight()
   * @generated
   */
  EReference getALSRangeRestrictionRight_Filter();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSRangeRestrictionLeft <em>ALS Range Restriction Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ALS Range Restriction Left</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSRangeRestrictionLeft
   * @generated
   */
  EClass getALSRangeRestrictionLeft();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSRangeRestrictionLeft#getFilter <em>Filter</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Filter</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSRangeRestrictionLeft#getFilter()
   * @see #getALSRangeRestrictionLeft()
   * @generated
   */
  EReference getALSRangeRestrictionLeft_Filter();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSRangeRestrictionLeft#getRelation <em>Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Relation</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSRangeRestrictionLeft#getRelation()
   * @see #getALSRangeRestrictionLeft()
   * @generated
   */
  EReference getALSRangeRestrictionLeft_Relation();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSJoin <em>ALS Join</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ALS Join</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSJoin
   * @generated
   */
  EClass getALSJoin();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSJoin#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSJoin#getLeftOperand()
   * @see #getALSJoin()
   * @generated
   */
  EReference getALSJoin_LeftOperand();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSJoin#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSJoin#getRightOperand()
   * @see #getALSJoin()
   * @generated
   */
  EReference getALSJoin_RightOperand();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSMinus <em>ALS Minus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ALS Minus</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSMinus
   * @generated
   */
  EClass getALSMinus();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSMinus#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSMinus#getLeftOperand()
   * @see #getALSMinus()
   * @generated
   */
  EReference getALSMinus_LeftOperand();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSMinus#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSMinus#getRightOperand()
   * @see #getALSMinus()
   * @generated
   */
  EReference getALSMinus_RightOperand();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSPlus <em>ALS Plus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ALS Plus</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSPlus
   * @generated
   */
  EClass getALSPlus();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSPlus#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSPlus#getLeftOperand()
   * @see #getALSPlus()
   * @generated
   */
  EReference getALSPlus_LeftOperand();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSPlus#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSPlus#getRightOperand()
   * @see #getALSPlus()
   * @generated
   */
  EReference getALSPlus_RightOperand();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSIntersection <em>ALS Intersection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ALS Intersection</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSIntersection
   * @generated
   */
  EClass getALSIntersection();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSIntersection#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSIntersection#getLeftOperand()
   * @see #getALSIntersection()
   * @generated
   */
  EReference getALSIntersection_LeftOperand();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSIntersection#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSIntersection#getRightOperand()
   * @see #getALSIntersection()
   * @generated
   */
  EReference getALSIntersection_RightOperand();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDirectProduct <em>ALS Direct Product</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ALS Direct Product</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDirectProduct
   * @generated
   */
  EClass getALSDirectProduct();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDirectProduct#getLeftOperand <em>Left Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left Operand</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDirectProduct#getLeftOperand()
   * @see #getALSDirectProduct()
   * @generated
   */
  EReference getALSDirectProduct_LeftOperand();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDirectProduct#getLeftMultiplicit <em>Left Multiplicit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Left Multiplicit</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDirectProduct#getLeftMultiplicit()
   * @see #getALSDirectProduct()
   * @generated
   */
  EAttribute getALSDirectProduct_LeftMultiplicit();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDirectProduct#getRightMultiplicit <em>Right Multiplicit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Right Multiplicit</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDirectProduct#getRightMultiplicit()
   * @see #getALSDirectProduct()
   * @generated
   */
  EAttribute getALSDirectProduct_RightMultiplicit();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDirectProduct#getRightOperand <em>Right Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right Operand</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDirectProduct#getRightOperand()
   * @see #getALSDirectProduct()
   * @generated
   */
  EReference getALSDirectProduct_RightOperand();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSNot <em>ALS Not</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ALS Not</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSNot
   * @generated
   */
  EClass getALSNot();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSNot#getOperand <em>Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operand</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSNot#getOperand()
   * @see #getALSNot()
   * @generated
   */
  EReference getALSNot_Operand();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSInverseRelation <em>ALS Inverse Relation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ALS Inverse Relation</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSInverseRelation
   * @generated
   */
  EClass getALSInverseRelation();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSInverseRelation#getOperand <em>Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operand</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSInverseRelation#getOperand()
   * @see #getALSInverseRelation()
   * @generated
   */
  EReference getALSInverseRelation_Operand();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.AlSTransitiveClosure <em>Al STransitive Closure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Al STransitive Closure</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.AlSTransitiveClosure
   * @generated
   */
  EClass getAlSTransitiveClosure();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.AlSTransitiveClosure#getOperand <em>Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operand</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.AlSTransitiveClosure#getOperand()
   * @see #getAlSTransitiveClosure()
   * @generated
   */
  EReference getAlSTransitiveClosure_Operand();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSReflectiveTransitiveClosure <em>ALS Reflective Transitive Closure</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ALS Reflective Transitive Closure</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSReflectiveTransitiveClosure
   * @generated
   */
  EClass getALSReflectiveTransitiveClosure();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSReflectiveTransitiveClosure#getOperand <em>Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operand</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSReflectiveTransitiveClosure#getOperand()
   * @see #getALSReflectiveTransitiveClosure()
   * @generated
   */
  EReference getALSReflectiveTransitiveClosure_Operand();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSCardinality <em>ALS Cardinality</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ALS Cardinality</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSCardinality
   * @generated
   */
  EClass getALSCardinality();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSCardinality#getOperand <em>Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operand</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSCardinality#getOperand()
   * @see #getALSCardinality()
   * @generated
   */
  EReference getALSCardinality_Operand();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSUnaryMinus <em>ALS Unary Minus</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ALS Unary Minus</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSUnaryMinus
   * @generated
   */
  EClass getALSUnaryMinus();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSUnaryMinus#getOperand <em>Operand</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Operand</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSUnaryMinus#getOperand()
   * @see #getALSUnaryMinus()
   * @generated
   */
  EReference getALSUnaryMinus_Operand();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSum <em>ALS Sum</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ALS Sum</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSum
   * @generated
   */
  EClass getALSSum();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSum#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSum#getVariables()
   * @see #getALSSum()
   * @generated
   */
  EReference getALSSum_Variables();

  /**
   * Returns the meta object for the containment reference '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSum#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSum#getExpression()
   * @see #getALSSum()
   * @generated
   */
  EReference getALSSum_Expression();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSFunctionCall <em>ALS Function Call</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ALS Function Call</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSFunctionCall
   * @generated
   */
  EClass getALSFunctionCall();

  /**
   * Returns the meta object for the reference '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSFunctionCall#getReferredDefinition <em>Referred Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Referred Definition</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSFunctionCall#getReferredDefinition()
   * @see #getALSFunctionCall()
   * @generated
   */
  EReference getALSFunctionCall_ReferredDefinition();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSFunctionCall#getReferredNumericOperator <em>Referred Numeric Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Referred Numeric Operator</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSFunctionCall#getReferredNumericOperator()
   * @see #getALSFunctionCall()
   * @generated
   */
  EAttribute getALSFunctionCall_ReferredNumericOperator();

  /**
   * Returns the meta object for the containment reference list '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSFunctionCall#getParams <em>Params</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Params</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSFunctionCall#getParams()
   * @see #getALSFunctionCall()
   * @generated
   */
  EReference getALSFunctionCall_Params();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSNone <em>ALS None</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ALS None</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSNone
   * @generated
   */
  EClass getALSNone();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSIden <em>ALS Iden</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ALS Iden</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSIden
   * @generated
   */
  EClass getALSIden();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSUniv <em>ALS Univ</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ALS Univ</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSUniv
   * @generated
   */
  EClass getALSUniv();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSInt <em>ALS Int</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ALS Int</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSInt
   * @generated
   */
  EClass getALSInt();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSString <em>ALS String</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ALS String</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSString
   * @generated
   */
  EClass getALSString();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSReference <em>ALS Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ALS Reference</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSReference
   * @generated
   */
  EClass getALSReference();

  /**
   * Returns the meta object for the reference '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSReference#getReferred <em>Referred</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Referred</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSReference#getReferred()
   * @see #getALSReference()
   * @generated
   */
  EReference getALSReference_Referred();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSNumberLiteral <em>ALS Number Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ALS Number Literal</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSNumberLiteral
   * @generated
   */
  EClass getALSNumberLiteral();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSNumberLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSNumberLiteral#getValue()
   * @see #getALSNumberLiteral()
   * @generated
   */
  EAttribute getALSNumberLiteral_Value();

  /**
   * Returns the meta object for class '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSStringLiteral <em>ALS String Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>ALS String Literal</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSStringLiteral
   * @generated
   */
  EClass getALSStringLiteral();

  /**
   * Returns the meta object for the attribute '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSStringLiteral#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSStringLiteral#getValue()
   * @see #getALSStringLiteral()
   * @generated
   */
  EAttribute getALSStringLiteral_Value();

  /**
   * Returns the meta object for enum '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSMultiplicity <em>ALS Multiplicity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>ALS Multiplicity</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSMultiplicity
   * @generated
   */
  EEnum getALSMultiplicity();

  /**
   * Returns the meta object for enum '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSNumericOperator <em>ALS Numeric Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>ALS Numeric Operator</em>'.
   * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSNumericOperator
   * @generated
   */
  EEnum getALSNumericOperator();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  AlloyLanguageFactory getAlloyLanguageFactory();

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
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSDocumentImpl <em>ALS Document</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSDocumentImpl
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSDocument()
     * @generated
     */
    EClass ALS_DOCUMENT = eINSTANCE.getALSDocument();

    /**
     * The meta object literal for the '<em><b>Enum Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_DOCUMENT__ENUM_DECLARATIONS = eINSTANCE.getALSDocument_EnumDeclarations();

    /**
     * The meta object literal for the '<em><b>Signature Bodies</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_DOCUMENT__SIGNATURE_BODIES = eINSTANCE.getALSDocument_SignatureBodies();

    /**
     * The meta object literal for the '<em><b>Function Definitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_DOCUMENT__FUNCTION_DEFINITIONS = eINSTANCE.getALSDocument_FunctionDefinitions();

    /**
     * The meta object literal for the '<em><b>Relation Definitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_DOCUMENT__RELATION_DEFINITIONS = eINSTANCE.getALSDocument_RelationDefinitions();

    /**
     * The meta object literal for the '<em><b>Fact Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_DOCUMENT__FACT_DECLARATIONS = eINSTANCE.getALSDocument_FactDeclarations();

    /**
     * The meta object literal for the '<em><b>Run Command</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_DOCUMENT__RUN_COMMAND = eINSTANCE.getALSDocument_RunCommand();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSRelationDeclarationImpl <em>ALS Relation Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSRelationDeclarationImpl
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSRelationDeclaration()
     * @generated
     */
    EClass ALS_RELATION_DECLARATION = eINSTANCE.getALSRelationDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALS_RELATION_DECLARATION__NAME = eINSTANCE.getALSRelationDeclaration_Name();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSTypeDeclarationImpl <em>ALS Type Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSTypeDeclarationImpl
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSTypeDeclaration()
     * @generated
     */
    EClass ALS_TYPE_DECLARATION = eINSTANCE.getALSTypeDeclaration();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSEnumDeclarationImpl <em>ALS Enum Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSEnumDeclarationImpl
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSEnumDeclaration()
     * @generated
     */
    EClass ALS_ENUM_DECLARATION = eINSTANCE.getALSEnumDeclaration();

    /**
     * The meta object literal for the '<em><b>Literal</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_ENUM_DECLARATION__LITERAL = eINSTANCE.getALSEnumDeclaration_Literal();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSEnumLiteralImpl <em>ALS Enum Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSEnumLiteralImpl
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSEnumLiteral()
     * @generated
     */
    EClass ALS_ENUM_LITERAL = eINSTANCE.getALSEnumLiteral();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSSignatureDeclarationImpl <em>ALS Signature Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSSignatureDeclarationImpl
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSSignatureDeclaration()
     * @generated
     */
    EClass ALS_SIGNATURE_DECLARATION = eINSTANCE.getALSSignatureDeclaration();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSSignatureBodyImpl <em>ALS Signature Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSSignatureBodyImpl
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSSignatureBody()
     * @generated
     */
    EClass ALS_SIGNATURE_BODY = eINSTANCE.getALSSignatureBody();

    /**
     * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALS_SIGNATURE_BODY__MULTIPLICITY = eINSTANCE.getALSSignatureBody_Multiplicity();

    /**
     * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALS_SIGNATURE_BODY__ABSTRACT = eINSTANCE.getALSSignatureBody_Abstract();

    /**
     * The meta object literal for the '<em><b>Declarations</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_SIGNATURE_BODY__DECLARATIONS = eINSTANCE.getALSSignatureBody_Declarations();

    /**
     * The meta object literal for the '<em><b>Supertype</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_SIGNATURE_BODY__SUPERTYPE = eINSTANCE.getALSSignatureBody_Supertype();

    /**
     * The meta object literal for the '<em><b>Superset</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_SIGNATURE_BODY__SUPERSET = eINSTANCE.getALSSignatureBody_Superset();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_SIGNATURE_BODY__FIELDS = eINSTANCE.getALSSignatureBody_Fields();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSFieldDeclarationImpl <em>ALS Field Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSFieldDeclarationImpl
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSFieldDeclaration()
     * @generated
     */
    EClass ALS_FIELD_DECLARATION = eINSTANCE.getALSFieldDeclaration();

    /**
     * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALS_FIELD_DECLARATION__MULTIPLICITY = eINSTANCE.getALSFieldDeclaration_Multiplicity();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_FIELD_DECLARATION__TYPE = eINSTANCE.getALSFieldDeclaration_Type();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSDefinitionImpl <em>ALS Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSDefinitionImpl
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSDefinition()
     * @generated
     */
    EClass ALS_DEFINITION = eINSTANCE.getALSDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALS_DEFINITION__NAME = eINSTANCE.getALSDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_DEFINITION__VARIABLES = eINSTANCE.getALSDefinition_Variables();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_DEFINITION__VALUE = eINSTANCE.getALSDefinition_Value();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSFunctionDefinitionImpl <em>ALS Function Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSFunctionDefinitionImpl
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSFunctionDefinition()
     * @generated
     */
    EClass ALS_FUNCTION_DEFINITION = eINSTANCE.getALSFunctionDefinition();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_FUNCTION_DEFINITION__TYPE = eINSTANCE.getALSFunctionDefinition_Type();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSRelationDefinitionImpl <em>ALS Relation Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSRelationDefinitionImpl
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSRelationDefinition()
     * @generated
     */
    EClass ALS_RELATION_DEFINITION = eINSTANCE.getALSRelationDefinition();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSFactDeclarationImpl <em>ALS Fact Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSFactDeclarationImpl
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSFactDeclaration()
     * @generated
     */
    EClass ALS_FACT_DECLARATION = eINSTANCE.getALSFactDeclaration();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALS_FACT_DECLARATION__NAME = eINSTANCE.getALSFactDeclaration_Name();

    /**
     * The meta object literal for the '<em><b>Term</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_FACT_DECLARATION__TERM = eINSTANCE.getALSFactDeclaration_Term();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSTermImpl <em>ALS Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSTermImpl
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSTerm()
     * @generated
     */
    EClass ALS_TERM = eINSTANCE.getALSTerm();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSVariableDeclarationImpl <em>ALS Variable Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSVariableDeclarationImpl
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSVariableDeclaration()
     * @generated
     */
    EClass ALS_VARIABLE_DECLARATION = eINSTANCE.getALSVariableDeclaration();

    /**
     * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_VARIABLE_DECLARATION__RANGE = eINSTANCE.getALSVariableDeclaration_Range();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSRunCommandImpl <em>ALS Run Command</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSRunCommandImpl
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSRunCommand()
     * @generated
     */
    EClass ALS_RUN_COMMAND = eINSTANCE.getALSRunCommand();

    /**
     * The meta object literal for the '<em><b>Type Scopes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_RUN_COMMAND__TYPE_SCOPES = eINSTANCE.getALSRunCommand_TypeScopes();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSTypeScopeImpl <em>ALS Type Scope</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSTypeScopeImpl
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSTypeScope()
     * @generated
     */
    EClass ALS_TYPE_SCOPE = eINSTANCE.getALSTypeScope();

    /**
     * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALS_TYPE_SCOPE__NUMBER = eINSTANCE.getALSTypeScope_Number();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSSigScopeImpl <em>ALS Sig Scope</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSSigScopeImpl
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSSigScope()
     * @generated
     */
    EClass ALS_SIG_SCOPE = eINSTANCE.getALSSigScope();

    /**
     * The meta object literal for the '<em><b>Exactly</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALS_SIG_SCOPE__EXACTLY = eINSTANCE.getALSSigScope_Exactly();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_SIG_SCOPE__TYPE = eINSTANCE.getALSSigScope_Type();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSIntScopeImpl <em>ALS Int Scope</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSIntScopeImpl
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSIntScope()
     * @generated
     */
    EClass ALS_INT_SCOPE = eINSTANCE.getALSIntScope();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSStringScopeImpl <em>ALS String Scope</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSStringScopeImpl
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSStringScope()
     * @generated
     */
    EClass ALS_STRING_SCOPE = eINSTANCE.getALSStringScope();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSQuantifiedExImpl <em>ALS Quantified Ex</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSQuantifiedExImpl
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSQuantifiedEx()
     * @generated
     */
    EClass ALS_QUANTIFIED_EX = eINSTANCE.getALSQuantifiedEx();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALS_QUANTIFIED_EX__TYPE = eINSTANCE.getALSQuantifiedEx_Type();

    /**
     * The meta object literal for the '<em><b>Disj</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALS_QUANTIFIED_EX__DISJ = eINSTANCE.getALSQuantifiedEx_Disj();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_QUANTIFIED_EX__VARIABLES = eINSTANCE.getALSQuantifiedEx_Variables();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_QUANTIFIED_EX__EXPRESSION = eINSTANCE.getALSQuantifiedEx_Expression();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSOrImpl <em>ALS Or</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSOrImpl
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSOr()
     * @generated
     */
    EClass ALS_OR = eINSTANCE.getALSOr();

    /**
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_OR__LEFT_OPERAND = eINSTANCE.getALSOr_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_OR__RIGHT_OPERAND = eINSTANCE.getALSOr_RightOperand();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSIffImpl <em>ALS Iff</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSIffImpl
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSIff()
     * @generated
     */
    EClass ALS_IFF = eINSTANCE.getALSIff();

    /**
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_IFF__LEFT_OPERAND = eINSTANCE.getALSIff_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_IFF__RIGHT_OPERAND = eINSTANCE.getALSIff_RightOperand();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSImplImpl <em>ALS Impl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSImplImpl
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSImpl()
     * @generated
     */
    EClass ALS_IMPL = eINSTANCE.getALSImpl();

    /**
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_IMPL__LEFT_OPERAND = eINSTANCE.getALSImpl_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_IMPL__RIGHT_OPERAND = eINSTANCE.getALSImpl_RightOperand();

    /**
     * The meta object literal for the '<em><b>Else Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_IMPL__ELSE_OPERAND = eINSTANCE.getALSImpl_ElseOperand();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSAndImpl <em>ALS And</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSAndImpl
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSAnd()
     * @generated
     */
    EClass ALS_AND = eINSTANCE.getALSAnd();

    /**
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_AND__LEFT_OPERAND = eINSTANCE.getALSAnd_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_AND__RIGHT_OPERAND = eINSTANCE.getALSAnd_RightOperand();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSEqualsImpl <em>ALS Equals</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSEqualsImpl
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSEquals()
     * @generated
     */
    EClass ALS_EQUALS = eINSTANCE.getALSEquals();

    /**
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_EQUALS__LEFT_OPERAND = eINSTANCE.getALSEquals_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_EQUALS__RIGHT_OPERAND = eINSTANCE.getALSEquals_RightOperand();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSNotEqualsImpl <em>ALS Not Equals</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSNotEqualsImpl
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSNotEquals()
     * @generated
     */
    EClass ALS_NOT_EQUALS = eINSTANCE.getALSNotEquals();

    /**
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_NOT_EQUALS__LEFT_OPERAND = eINSTANCE.getALSNotEquals_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_NOT_EQUALS__RIGHT_OPERAND = eINSTANCE.getALSNotEquals_RightOperand();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSSubsetImpl <em>ALS Subset</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSSubsetImpl
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSSubset()
     * @generated
     */
    EClass ALS_SUBSET = eINSTANCE.getALSSubset();

    /**
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_SUBSET__LEFT_OPERAND = eINSTANCE.getALSSubset_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_SUBSET__RIGHT_OPERAND = eINSTANCE.getALSSubset_RightOperand();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSLessImpl <em>ALS Less</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSLessImpl
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSLess()
     * @generated
     */
    EClass ALS_LESS = eINSTANCE.getALSLess();

    /**
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_LESS__LEFT_OPERAND = eINSTANCE.getALSLess_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_LESS__RIGHT_OPERAND = eINSTANCE.getALSLess_RightOperand();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSLeqImpl <em>ALS Leq</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSLeqImpl
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSLeq()
     * @generated
     */
    EClass ALS_LEQ = eINSTANCE.getALSLeq();

    /**
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_LEQ__LEFT_OPERAND = eINSTANCE.getALSLeq_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_LEQ__RIGHT_OPERAND = eINSTANCE.getALSLeq_RightOperand();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSMoreImpl <em>ALS More</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSMoreImpl
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSMore()
     * @generated
     */
    EClass ALS_MORE = eINSTANCE.getALSMore();

    /**
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_MORE__LEFT_OPERAND = eINSTANCE.getALSMore_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_MORE__RIGHT_OPERAND = eINSTANCE.getALSMore_RightOperand();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSMeqImpl <em>ALS Meq</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSMeqImpl
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSMeq()
     * @generated
     */
    EClass ALS_MEQ = eINSTANCE.getALSMeq();

    /**
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_MEQ__LEFT_OPERAND = eINSTANCE.getALSMeq_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_MEQ__RIGHT_OPERAND = eINSTANCE.getALSMeq_RightOperand();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSOverrideImpl <em>ALS Override</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSOverrideImpl
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSOverride()
     * @generated
     */
    EClass ALS_OVERRIDE = eINSTANCE.getALSOverride();

    /**
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_OVERRIDE__LEFT_OPERAND = eINSTANCE.getALSOverride_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_OVERRIDE__RIGHT_OPERAND = eINSTANCE.getALSOverride_RightOperand();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSRangeRestrictionRightImpl <em>ALS Range Restriction Right</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSRangeRestrictionRightImpl
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSRangeRestrictionRight()
     * @generated
     */
    EClass ALS_RANGE_RESTRICTION_RIGHT = eINSTANCE.getALSRangeRestrictionRight();

    /**
     * The meta object literal for the '<em><b>Relation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_RANGE_RESTRICTION_RIGHT__RELATION = eINSTANCE.getALSRangeRestrictionRight_Relation();

    /**
     * The meta object literal for the '<em><b>Filter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_RANGE_RESTRICTION_RIGHT__FILTER = eINSTANCE.getALSRangeRestrictionRight_Filter();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSRangeRestrictionLeftImpl <em>ALS Range Restriction Left</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSRangeRestrictionLeftImpl
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSRangeRestrictionLeft()
     * @generated
     */
    EClass ALS_RANGE_RESTRICTION_LEFT = eINSTANCE.getALSRangeRestrictionLeft();

    /**
     * The meta object literal for the '<em><b>Filter</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_RANGE_RESTRICTION_LEFT__FILTER = eINSTANCE.getALSRangeRestrictionLeft_Filter();

    /**
     * The meta object literal for the '<em><b>Relation</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_RANGE_RESTRICTION_LEFT__RELATION = eINSTANCE.getALSRangeRestrictionLeft_Relation();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSJoinImpl <em>ALS Join</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSJoinImpl
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSJoin()
     * @generated
     */
    EClass ALS_JOIN = eINSTANCE.getALSJoin();

    /**
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_JOIN__LEFT_OPERAND = eINSTANCE.getALSJoin_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_JOIN__RIGHT_OPERAND = eINSTANCE.getALSJoin_RightOperand();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSMinusImpl <em>ALS Minus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSMinusImpl
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSMinus()
     * @generated
     */
    EClass ALS_MINUS = eINSTANCE.getALSMinus();

    /**
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_MINUS__LEFT_OPERAND = eINSTANCE.getALSMinus_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_MINUS__RIGHT_OPERAND = eINSTANCE.getALSMinus_RightOperand();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSPlusImpl <em>ALS Plus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSPlusImpl
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSPlus()
     * @generated
     */
    EClass ALS_PLUS = eINSTANCE.getALSPlus();

    /**
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_PLUS__LEFT_OPERAND = eINSTANCE.getALSPlus_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_PLUS__RIGHT_OPERAND = eINSTANCE.getALSPlus_RightOperand();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSIntersectionImpl <em>ALS Intersection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSIntersectionImpl
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSIntersection()
     * @generated
     */
    EClass ALS_INTERSECTION = eINSTANCE.getALSIntersection();

    /**
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_INTERSECTION__LEFT_OPERAND = eINSTANCE.getALSIntersection_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_INTERSECTION__RIGHT_OPERAND = eINSTANCE.getALSIntersection_RightOperand();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSDirectProductImpl <em>ALS Direct Product</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSDirectProductImpl
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSDirectProduct()
     * @generated
     */
    EClass ALS_DIRECT_PRODUCT = eINSTANCE.getALSDirectProduct();

    /**
     * The meta object literal for the '<em><b>Left Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_DIRECT_PRODUCT__LEFT_OPERAND = eINSTANCE.getALSDirectProduct_LeftOperand();

    /**
     * The meta object literal for the '<em><b>Left Multiplicit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALS_DIRECT_PRODUCT__LEFT_MULTIPLICIT = eINSTANCE.getALSDirectProduct_LeftMultiplicit();

    /**
     * The meta object literal for the '<em><b>Right Multiplicit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALS_DIRECT_PRODUCT__RIGHT_MULTIPLICIT = eINSTANCE.getALSDirectProduct_RightMultiplicit();

    /**
     * The meta object literal for the '<em><b>Right Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_DIRECT_PRODUCT__RIGHT_OPERAND = eINSTANCE.getALSDirectProduct_RightOperand();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSNotImpl <em>ALS Not</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSNotImpl
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSNot()
     * @generated
     */
    EClass ALS_NOT = eINSTANCE.getALSNot();

    /**
     * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_NOT__OPERAND = eINSTANCE.getALSNot_Operand();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSInverseRelationImpl <em>ALS Inverse Relation</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSInverseRelationImpl
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSInverseRelation()
     * @generated
     */
    EClass ALS_INVERSE_RELATION = eINSTANCE.getALSInverseRelation();

    /**
     * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_INVERSE_RELATION__OPERAND = eINSTANCE.getALSInverseRelation_Operand();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlSTransitiveClosureImpl <em>Al STransitive Closure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlSTransitiveClosureImpl
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getAlSTransitiveClosure()
     * @generated
     */
    EClass AL_STRANSITIVE_CLOSURE = eINSTANCE.getAlSTransitiveClosure();

    /**
     * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AL_STRANSITIVE_CLOSURE__OPERAND = eINSTANCE.getAlSTransitiveClosure_Operand();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSReflectiveTransitiveClosureImpl <em>ALS Reflective Transitive Closure</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSReflectiveTransitiveClosureImpl
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSReflectiveTransitiveClosure()
     * @generated
     */
    EClass ALS_REFLECTIVE_TRANSITIVE_CLOSURE = eINSTANCE.getALSReflectiveTransitiveClosure();

    /**
     * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_REFLECTIVE_TRANSITIVE_CLOSURE__OPERAND = eINSTANCE.getALSReflectiveTransitiveClosure_Operand();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSCardinalityImpl <em>ALS Cardinality</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSCardinalityImpl
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSCardinality()
     * @generated
     */
    EClass ALS_CARDINALITY = eINSTANCE.getALSCardinality();

    /**
     * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_CARDINALITY__OPERAND = eINSTANCE.getALSCardinality_Operand();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSUnaryMinusImpl <em>ALS Unary Minus</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSUnaryMinusImpl
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSUnaryMinus()
     * @generated
     */
    EClass ALS_UNARY_MINUS = eINSTANCE.getALSUnaryMinus();

    /**
     * The meta object literal for the '<em><b>Operand</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_UNARY_MINUS__OPERAND = eINSTANCE.getALSUnaryMinus_Operand();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSSumImpl <em>ALS Sum</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSSumImpl
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSSum()
     * @generated
     */
    EClass ALS_SUM = eINSTANCE.getALSSum();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_SUM__VARIABLES = eINSTANCE.getALSSum_Variables();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_SUM__EXPRESSION = eINSTANCE.getALSSum_Expression();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSFunctionCallImpl <em>ALS Function Call</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSFunctionCallImpl
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSFunctionCall()
     * @generated
     */
    EClass ALS_FUNCTION_CALL = eINSTANCE.getALSFunctionCall();

    /**
     * The meta object literal for the '<em><b>Referred Definition</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_FUNCTION_CALL__REFERRED_DEFINITION = eINSTANCE.getALSFunctionCall_ReferredDefinition();

    /**
     * The meta object literal for the '<em><b>Referred Numeric Operator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALS_FUNCTION_CALL__REFERRED_NUMERIC_OPERATOR = eINSTANCE.getALSFunctionCall_ReferredNumericOperator();

    /**
     * The meta object literal for the '<em><b>Params</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_FUNCTION_CALL__PARAMS = eINSTANCE.getALSFunctionCall_Params();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSNoneImpl <em>ALS None</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSNoneImpl
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSNone()
     * @generated
     */
    EClass ALS_NONE = eINSTANCE.getALSNone();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSIdenImpl <em>ALS Iden</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSIdenImpl
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSIden()
     * @generated
     */
    EClass ALS_IDEN = eINSTANCE.getALSIden();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSUnivImpl <em>ALS Univ</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSUnivImpl
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSUniv()
     * @generated
     */
    EClass ALS_UNIV = eINSTANCE.getALSUniv();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSIntImpl <em>ALS Int</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSIntImpl
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSInt()
     * @generated
     */
    EClass ALS_INT = eINSTANCE.getALSInt();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSStringImpl <em>ALS String</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSStringImpl
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSString()
     * @generated
     */
    EClass ALS_STRING = eINSTANCE.getALSString();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSReferenceImpl <em>ALS Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSReferenceImpl
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSReference()
     * @generated
     */
    EClass ALS_REFERENCE = eINSTANCE.getALSReference();

    /**
     * The meta object literal for the '<em><b>Referred</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALS_REFERENCE__REFERRED = eINSTANCE.getALSReference_Referred();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSNumberLiteralImpl <em>ALS Number Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSNumberLiteralImpl
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSNumberLiteral()
     * @generated
     */
    EClass ALS_NUMBER_LITERAL = eINSTANCE.getALSNumberLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALS_NUMBER_LITERAL__VALUE = eINSTANCE.getALSNumberLiteral_Value();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSStringLiteralImpl <em>ALS String Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.ALSStringLiteralImpl
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSStringLiteral()
     * @generated
     */
    EClass ALS_STRING_LITERAL = eINSTANCE.getALSStringLiteral();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALS_STRING_LITERAL__VALUE = eINSTANCE.getALSStringLiteral_Value();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSMultiplicity <em>ALS Multiplicity</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSMultiplicity
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSMultiplicity()
     * @generated
     */
    EEnum ALS_MULTIPLICITY = eINSTANCE.getALSMultiplicity();

    /**
     * The meta object literal for the '{@link hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSNumericOperator <em>ALS Numeric Operator</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSNumericOperator
     * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguagePackageImpl#getALSNumericOperator()
     * @generated
     */
    EEnum ALS_NUMERIC_OPERATOR = eINSTANCE.getALSNumericOperator();

  }

} //AlloyLanguagePackage
