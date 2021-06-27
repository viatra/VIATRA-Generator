/**
 */
package org.eclipse.viatra.solver.language.model.problem;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.viatra.solver.language.model.problem.ProblemPackage
 * @generated
 */
public interface ProblemFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ProblemFactory eINSTANCE = org.eclipse.viatra.solver.language.model.problem.impl.ProblemFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Problem</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Problem</em>'.
	 * @generated
	 */
	Problem createProblem();

	/**
	 * Returns a new object of class '<em>Class Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class Declaration</em>'.
	 * @generated
	 */
	ClassDeclaration createClassDeclaration();

	/**
	 * Returns a new object of class '<em>Reference Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reference Declaration</em>'.
	 * @generated
	 */
	ReferenceDeclaration createReferenceDeclaration();

	/**
	 * Returns a new object of class '<em>Predicate Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Predicate Definition</em>'.
	 * @generated
	 */
	PredicateDefinition createPredicateDefinition();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Conjunction</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Conjunction</em>'.
	 * @generated
	 */
	Conjunction createConjunction();

	/**
	 * Returns a new object of class '<em>Atom</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Atom</em>'.
	 * @generated
	 */
	Atom createAtom();

	/**
	 * Returns a new object of class '<em>Implicit Variable</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Implicit Variable</em>'.
	 * @generated
	 */
	ImplicitVariable createImplicitVariable();

	/**
	 * Returns a new object of class '<em>Negative Literal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Negative Literal</em>'.
	 * @generated
	 */
	NegativeLiteral createNegativeLiteral();

	/**
	 * Returns a new object of class '<em>Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Assertion</em>'.
	 * @generated
	 */
	Assertion createAssertion();

	/**
	 * Returns a new object of class '<em>Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node</em>'.
	 * @generated
	 */
	Node createNode();

	/**
	 * Returns a new object of class '<em>Scope Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Scope Declaration</em>'.
	 * @generated
	 */
	ScopeDeclaration createScopeDeclaration();

	/**
	 * Returns a new object of class '<em>Type Scope</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Type Scope</em>'.
	 * @generated
	 */
	TypeScope createTypeScope();

	/**
	 * Returns a new object of class '<em>Range Multiplicity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Range Multiplicity</em>'.
	 * @generated
	 */
	RangeMultiplicity createRangeMultiplicity();

	/**
	 * Returns a new object of class '<em>Exact Multiplicity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Exact Multiplicity</em>'.
	 * @generated
	 */
	ExactMultiplicity createExactMultiplicity();

	/**
	 * Returns a new object of class '<em>Unbounded Multiplicity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unbounded Multiplicity</em>'.
	 * @generated
	 */
	UnboundedMultiplicity createUnboundedMultiplicity();

	/**
	 * Returns a new object of class '<em>Variable Or Node Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Variable Or Node Argument</em>'.
	 * @generated
	 */
	VariableOrNodeArgument createVariableOrNodeArgument();

	/**
	 * Returns a new object of class '<em>Enum Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Enum Declaration</em>'.
	 * @generated
	 */
	EnumDeclaration createEnumDeclaration();

	/**
	 * Returns a new object of class '<em>Int Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Int Constant</em>'.
	 * @generated
	 */
	IntConstant createIntConstant();

	/**
	 * Returns a new object of class '<em>Real Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Real Constant</em>'.
	 * @generated
	 */
	RealConstant createRealConstant();

	/**
	 * Returns a new object of class '<em>String Constant</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Constant</em>'.
	 * @generated
	 */
	StringConstant createStringConstant();

	/**
	 * Returns a new object of class '<em>Constant Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constant Argument</em>'.
	 * @generated
	 */
	ConstantArgument createConstantArgument();

	/**
	 * Returns a new object of class '<em>Node Assertion Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Assertion Argument</em>'.
	 * @generated
	 */
	NodeAssertionArgument createNodeAssertionArgument();

	/**
	 * Returns a new object of class '<em>Constant Assertion Argument</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Constant Assertion Argument</em>'.
	 * @generated
	 */
	ConstantAssertionArgument createConstantAssertionArgument();

	/**
	 * Returns a new object of class '<em>Node Value Assertion</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Node Value Assertion</em>'.
	 * @generated
	 */
	NodeValueAssertion createNodeValueAssertion();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ProblemPackage getProblemPackage();

} //ProblemFactory
