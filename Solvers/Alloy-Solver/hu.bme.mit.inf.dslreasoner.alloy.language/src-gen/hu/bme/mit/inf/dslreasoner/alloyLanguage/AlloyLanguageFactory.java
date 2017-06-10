/**
 */
package hu.bme.mit.inf.dslreasoner.alloyLanguage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguagePackage
 * @generated
 */
public interface AlloyLanguageFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AlloyLanguageFactory eINSTANCE = hu.bme.mit.inf.dslreasoner.alloyLanguage.impl.AlloyLanguageFactoryImpl.init();

  /**
   * Returns a new object of class '<em>ALS Document</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ALS Document</em>'.
   * @generated
   */
  ALSDocument createALSDocument();

  /**
   * Returns a new object of class '<em>ALS Relation Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ALS Relation Declaration</em>'.
   * @generated
   */
  ALSRelationDeclaration createALSRelationDeclaration();

  /**
   * Returns a new object of class '<em>ALS Type Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ALS Type Declaration</em>'.
   * @generated
   */
  ALSTypeDeclaration createALSTypeDeclaration();

  /**
   * Returns a new object of class '<em>ALS Enum Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ALS Enum Declaration</em>'.
   * @generated
   */
  ALSEnumDeclaration createALSEnumDeclaration();

  /**
   * Returns a new object of class '<em>ALS Enum Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ALS Enum Literal</em>'.
   * @generated
   */
  ALSEnumLiteral createALSEnumLiteral();

  /**
   * Returns a new object of class '<em>ALS Signature Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ALS Signature Declaration</em>'.
   * @generated
   */
  ALSSignatureDeclaration createALSSignatureDeclaration();

  /**
   * Returns a new object of class '<em>ALS Signature Body</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ALS Signature Body</em>'.
   * @generated
   */
  ALSSignatureBody createALSSignatureBody();

  /**
   * Returns a new object of class '<em>ALS Field Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ALS Field Declaration</em>'.
   * @generated
   */
  ALSFieldDeclaration createALSFieldDeclaration();

  /**
   * Returns a new object of class '<em>ALS Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ALS Definition</em>'.
   * @generated
   */
  ALSDefinition createALSDefinition();

  /**
   * Returns a new object of class '<em>ALS Function Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ALS Function Definition</em>'.
   * @generated
   */
  ALSFunctionDefinition createALSFunctionDefinition();

  /**
   * Returns a new object of class '<em>ALS Relation Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ALS Relation Definition</em>'.
   * @generated
   */
  ALSRelationDefinition createALSRelationDefinition();

  /**
   * Returns a new object of class '<em>ALS Fact Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ALS Fact Declaration</em>'.
   * @generated
   */
  ALSFactDeclaration createALSFactDeclaration();

  /**
   * Returns a new object of class '<em>ALS Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ALS Term</em>'.
   * @generated
   */
  ALSTerm createALSTerm();

  /**
   * Returns a new object of class '<em>ALS Variable Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ALS Variable Declaration</em>'.
   * @generated
   */
  ALSVariableDeclaration createALSVariableDeclaration();

  /**
   * Returns a new object of class '<em>ALS Run Command</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ALS Run Command</em>'.
   * @generated
   */
  ALSRunCommand createALSRunCommand();

  /**
   * Returns a new object of class '<em>ALS Type Scope</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ALS Type Scope</em>'.
   * @generated
   */
  ALSTypeScope createALSTypeScope();

  /**
   * Returns a new object of class '<em>ALS Sig Scope</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ALS Sig Scope</em>'.
   * @generated
   */
  ALSSigScope createALSSigScope();

  /**
   * Returns a new object of class '<em>ALS Int Scope</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ALS Int Scope</em>'.
   * @generated
   */
  ALSIntScope createALSIntScope();

  /**
   * Returns a new object of class '<em>ALS Quantified Ex</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ALS Quantified Ex</em>'.
   * @generated
   */
  ALSQuantifiedEx createALSQuantifiedEx();

  /**
   * Returns a new object of class '<em>ALS Or</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ALS Or</em>'.
   * @generated
   */
  ALSOr createALSOr();

  /**
   * Returns a new object of class '<em>ALS Iff</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ALS Iff</em>'.
   * @generated
   */
  ALSIff createALSIff();

  /**
   * Returns a new object of class '<em>ALS Impl</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ALS Impl</em>'.
   * @generated
   */
  ALSImpl createALSImpl();

  /**
   * Returns a new object of class '<em>ALS And</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ALS And</em>'.
   * @generated
   */
  ALSAnd createALSAnd();

  /**
   * Returns a new object of class '<em>ALS Equals</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ALS Equals</em>'.
   * @generated
   */
  ALSEquals createALSEquals();

  /**
   * Returns a new object of class '<em>ALS Not Equals</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ALS Not Equals</em>'.
   * @generated
   */
  ALSNotEquals createALSNotEquals();

  /**
   * Returns a new object of class '<em>ALS Subset</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ALS Subset</em>'.
   * @generated
   */
  ALSSubset createALSSubset();

  /**
   * Returns a new object of class '<em>ALS Less</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ALS Less</em>'.
   * @generated
   */
  ALSLess createALSLess();

  /**
   * Returns a new object of class '<em>ALS Leq</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ALS Leq</em>'.
   * @generated
   */
  ALSLeq createALSLeq();

  /**
   * Returns a new object of class '<em>ALS More</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ALS More</em>'.
   * @generated
   */
  ALSMore createALSMore();

  /**
   * Returns a new object of class '<em>ALS Meq</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ALS Meq</em>'.
   * @generated
   */
  ALSMeq createALSMeq();

  /**
   * Returns a new object of class '<em>ALS Override</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ALS Override</em>'.
   * @generated
   */
  ALSOverride createALSOverride();

  /**
   * Returns a new object of class '<em>ALS Range Restriction Right</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ALS Range Restriction Right</em>'.
   * @generated
   */
  ALSRangeRestrictionRight createALSRangeRestrictionRight();

  /**
   * Returns a new object of class '<em>ALS Range Restriction Left</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ALS Range Restriction Left</em>'.
   * @generated
   */
  ALSRangeRestrictionLeft createALSRangeRestrictionLeft();

  /**
   * Returns a new object of class '<em>ALS Join</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ALS Join</em>'.
   * @generated
   */
  ALSJoin createALSJoin();

  /**
   * Returns a new object of class '<em>ALS Minus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ALS Minus</em>'.
   * @generated
   */
  ALSMinus createALSMinus();

  /**
   * Returns a new object of class '<em>ALS Plus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ALS Plus</em>'.
   * @generated
   */
  ALSPlus createALSPlus();

  /**
   * Returns a new object of class '<em>ALS Intersection</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ALS Intersection</em>'.
   * @generated
   */
  ALSIntersection createALSIntersection();

  /**
   * Returns a new object of class '<em>ALS Direct Product</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ALS Direct Product</em>'.
   * @generated
   */
  ALSDirectProduct createALSDirectProduct();

  /**
   * Returns a new object of class '<em>ALS Not</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ALS Not</em>'.
   * @generated
   */
  ALSNot createALSNot();

  /**
   * Returns a new object of class '<em>ALS Inverse Relation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ALS Inverse Relation</em>'.
   * @generated
   */
  ALSInverseRelation createALSInverseRelation();

  /**
   * Returns a new object of class '<em>Al STransitive Closure</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Al STransitive Closure</em>'.
   * @generated
   */
  AlSTransitiveClosure createAlSTransitiveClosure();

  /**
   * Returns a new object of class '<em>ALS Reflective Transitive Closure</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ALS Reflective Transitive Closure</em>'.
   * @generated
   */
  ALSReflectiveTransitiveClosure createALSReflectiveTransitiveClosure();

  /**
   * Returns a new object of class '<em>ALS Cardinality</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ALS Cardinality</em>'.
   * @generated
   */
  ALSCardinality createALSCardinality();

  /**
   * Returns a new object of class '<em>ALS Unary Minus</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ALS Unary Minus</em>'.
   * @generated
   */
  ALSUnaryMinus createALSUnaryMinus();

  /**
   * Returns a new object of class '<em>ALS Sum</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ALS Sum</em>'.
   * @generated
   */
  ALSSum createALSSum();

  /**
   * Returns a new object of class '<em>ALS Function Call</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ALS Function Call</em>'.
   * @generated
   */
  ALSFunctionCall createALSFunctionCall();

  /**
   * Returns a new object of class '<em>ALS None</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ALS None</em>'.
   * @generated
   */
  ALSNone createALSNone();

  /**
   * Returns a new object of class '<em>ALS Iden</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ALS Iden</em>'.
   * @generated
   */
  ALSIden createALSIden();

  /**
   * Returns a new object of class '<em>ALS Univ</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ALS Univ</em>'.
   * @generated
   */
  ALSUniv createALSUniv();

  /**
   * Returns a new object of class '<em>ALS Int</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ALS Int</em>'.
   * @generated
   */
  ALSInt createALSInt();

  /**
   * Returns a new object of class '<em>ALS Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ALS Reference</em>'.
   * @generated
   */
  ALSReference createALSReference();

  /**
   * Returns a new object of class '<em>ALS Number Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>ALS Number Literal</em>'.
   * @generated
   */
  ALSNumberLiteral createALSNumberLiteral();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  AlloyLanguagePackage getAlloyLanguagePackage();

} //AlloyLanguageFactory
