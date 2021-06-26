/**
 */
package org.eclipse.viatra.solver.language.model.problem.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.viatra.solver.language.model.problem.Argument;
import org.eclipse.viatra.solver.language.model.problem.Assertion;
import org.eclipse.viatra.solver.language.model.problem.Atom;
import org.eclipse.viatra.solver.language.model.problem.ClassDeclaration;
import org.eclipse.viatra.solver.language.model.problem.Conjunction;
import org.eclipse.viatra.solver.language.model.problem.ExactMultiplicity;
import org.eclipse.viatra.solver.language.model.problem.ExistentialQuantifier;
import org.eclipse.viatra.solver.language.model.problem.ImplicitVariable;
import org.eclipse.viatra.solver.language.model.problem.Literal;
import org.eclipse.viatra.solver.language.model.problem.LogicValue;
import org.eclipse.viatra.solver.language.model.problem.Multiplicity;
import org.eclipse.viatra.solver.language.model.problem.NamedElement;
import org.eclipse.viatra.solver.language.model.problem.NegativeLiteral;
import org.eclipse.viatra.solver.language.model.problem.Node;
import org.eclipse.viatra.solver.language.model.problem.Parameter;
import org.eclipse.viatra.solver.language.model.problem.PredicateDefinition;
import org.eclipse.viatra.solver.language.model.problem.Problem;
import org.eclipse.viatra.solver.language.model.problem.ProblemFactory;
import org.eclipse.viatra.solver.language.model.problem.ProblemPackage;
import org.eclipse.viatra.solver.language.model.problem.RangeMultiplicity;
import org.eclipse.viatra.solver.language.model.problem.ReferenceDeclaration;
import org.eclipse.viatra.solver.language.model.problem.Relation;
import org.eclipse.viatra.solver.language.model.problem.ScopeDeclaration;
import org.eclipse.viatra.solver.language.model.problem.Statement;
import org.eclipse.viatra.solver.language.model.problem.TypeScope;
import org.eclipse.viatra.solver.language.model.problem.UnboundedMultiplicity;
import org.eclipse.viatra.solver.language.model.problem.Variable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProblemPackageImpl extends EPackageImpl implements ProblemPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass problemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass relationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass predicateDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conjunctionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass atomEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implicitVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negativeLiteralEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass existentialQuantifierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assertionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scopeDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass statementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeScopeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiplicityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rangeMultiplicityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exactMultiplicityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unboundedMultiplicityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argumentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum logicValueEEnum = null;

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
	 * @see org.eclipse.viatra.solver.language.model.problem.ProblemPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ProblemPackageImpl() {
		super(eNS_URI, ProblemFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ProblemPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ProblemPackage init() {
		if (isInited)
			return (ProblemPackage) EPackage.Registry.INSTANCE.getEPackage(ProblemPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredProblemPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		ProblemPackageImpl theProblemPackage = registeredProblemPackage instanceof ProblemPackageImpl
				? (ProblemPackageImpl) registeredProblemPackage
				: new ProblemPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theProblemPackage.createPackageContents();

		// Initialize created meta-data
		theProblemPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theProblemPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ProblemPackage.eNS_URI, theProblemPackage);
		return theProblemPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProblem() {
		return problemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProblem_Nodes() {
		return (EReference) problemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProblem_Statements() {
		return (EReference) problemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRelation() {
		return relationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassDeclaration() {
		return classDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassDeclaration_Abstract() {
		return (EAttribute) classDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassDeclaration_SuperTypes() {
		return (EReference) classDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassDeclaration_ReferenceDeclarations() {
		return (EReference) classDeclarationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClassDeclaration_NewNode() {
		return (EReference) classDeclarationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceDeclaration() {
		return referenceDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceDeclaration_ReferenceType() {
		return (EReference) referenceDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceDeclaration_Opposite() {
		return (EReference) referenceDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceDeclaration_Containment() {
		return (EAttribute) referenceDeclarationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceDeclaration_Multiplicity() {
		return (EReference) referenceDeclarationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNamedElement_Name() {
		return (EAttribute) namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPredicateDefinition() {
		return predicateDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPredicateDefinition_Error() {
		return (EAttribute) predicateDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPredicateDefinition_Parameters() {
		return (EReference) predicateDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPredicateDefinition_Bodies() {
		return (EReference) predicateDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameter_ParameterType() {
		return (EReference) parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConjunction() {
		return conjunctionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConjunction_Literals() {
		return (EReference) conjunctionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteral() {
		return literalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAtom() {
		return atomEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtom_Relation() {
		return (EReference) atomEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAtom_Arguments() {
		return (EReference) atomEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAtom_TransitiveClosure() {
		return (EAttribute) atomEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplicitVariable() {
		return implicitVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNegativeLiteral() {
		return negativeLiteralEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNegativeLiteral_Atom() {
		return (EReference) negativeLiteralEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExistentialQuantifier() {
		return existentialQuantifierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExistentialQuantifier_ImplicitVariables() {
		return (EReference) existentialQuantifierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssertion() {
		return assertionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssertion_Relation() {
		return (EReference) assertionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssertion_Arguments() {
		return (EReference) assertionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssertion_Value() {
		return (EAttribute) assertionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScopeDeclaration() {
		return scopeDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScopeDeclaration_TypeScopes() {
		return (EReference) scopeDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStatement() {
		return statementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeScope() {
		return typeScopeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeScope_TargetType() {
		return (EReference) typeScopeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeScope_Increment() {
		return (EAttribute) typeScopeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTypeScope_Multiplicity() {
		return (EReference) typeScopeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiplicity() {
		return multiplicityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRangeMultiplicity() {
		return rangeMultiplicityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRangeMultiplicity_LowerBound() {
		return (EAttribute) rangeMultiplicityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRangeMultiplicity_UpperBound() {
		return (EAttribute) rangeMultiplicityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExactMultiplicity() {
		return exactMultiplicityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExactMultiplicity_ExactValue() {
		return (EAttribute) exactMultiplicityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnboundedMultiplicity() {
		return unboundedMultiplicityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgument() {
		return argumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgument_Variable() {
		return (EReference) argumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgument_SingletonVariable() {
		return (EReference) argumentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLogicValue() {
		return logicValueEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemFactory getProblemFactory() {
		return (ProblemFactory) getEFactoryInstance();
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
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		problemEClass = createEClass(PROBLEM);
		createEReference(problemEClass, PROBLEM__NODES);
		createEReference(problemEClass, PROBLEM__STATEMENTS);

		relationEClass = createEClass(RELATION);

		classDeclarationEClass = createEClass(CLASS_DECLARATION);
		createEAttribute(classDeclarationEClass, CLASS_DECLARATION__ABSTRACT);
		createEReference(classDeclarationEClass, CLASS_DECLARATION__SUPER_TYPES);
		createEReference(classDeclarationEClass, CLASS_DECLARATION__REFERENCE_DECLARATIONS);
		createEReference(classDeclarationEClass, CLASS_DECLARATION__NEW_NODE);

		referenceDeclarationEClass = createEClass(REFERENCE_DECLARATION);
		createEReference(referenceDeclarationEClass, REFERENCE_DECLARATION__REFERENCE_TYPE);
		createEReference(referenceDeclarationEClass, REFERENCE_DECLARATION__OPPOSITE);
		createEAttribute(referenceDeclarationEClass, REFERENCE_DECLARATION__CONTAINMENT);
		createEReference(referenceDeclarationEClass, REFERENCE_DECLARATION__MULTIPLICITY);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		predicateDefinitionEClass = createEClass(PREDICATE_DEFINITION);
		createEAttribute(predicateDefinitionEClass, PREDICATE_DEFINITION__ERROR);
		createEReference(predicateDefinitionEClass, PREDICATE_DEFINITION__PARAMETERS);
		createEReference(predicateDefinitionEClass, PREDICATE_DEFINITION__BODIES);

		parameterEClass = createEClass(PARAMETER);
		createEReference(parameterEClass, PARAMETER__PARAMETER_TYPE);

		variableEClass = createEClass(VARIABLE);

		conjunctionEClass = createEClass(CONJUNCTION);
		createEReference(conjunctionEClass, CONJUNCTION__LITERALS);

		literalEClass = createEClass(LITERAL);

		atomEClass = createEClass(ATOM);
		createEReference(atomEClass, ATOM__RELATION);
		createEAttribute(atomEClass, ATOM__TRANSITIVE_CLOSURE);
		createEReference(atomEClass, ATOM__ARGUMENTS);

		implicitVariableEClass = createEClass(IMPLICIT_VARIABLE);

		negativeLiteralEClass = createEClass(NEGATIVE_LITERAL);
		createEReference(negativeLiteralEClass, NEGATIVE_LITERAL__ATOM);

		existentialQuantifierEClass = createEClass(EXISTENTIAL_QUANTIFIER);
		createEReference(existentialQuantifierEClass, EXISTENTIAL_QUANTIFIER__IMPLICIT_VARIABLES);

		assertionEClass = createEClass(ASSERTION);
		createEReference(assertionEClass, ASSERTION__RELATION);
		createEReference(assertionEClass, ASSERTION__ARGUMENTS);
		createEAttribute(assertionEClass, ASSERTION__VALUE);

		nodeEClass = createEClass(NODE);

		scopeDeclarationEClass = createEClass(SCOPE_DECLARATION);
		createEReference(scopeDeclarationEClass, SCOPE_DECLARATION__TYPE_SCOPES);

		statementEClass = createEClass(STATEMENT);

		typeScopeEClass = createEClass(TYPE_SCOPE);
		createEReference(typeScopeEClass, TYPE_SCOPE__TARGET_TYPE);
		createEAttribute(typeScopeEClass, TYPE_SCOPE__INCREMENT);
		createEReference(typeScopeEClass, TYPE_SCOPE__MULTIPLICITY);

		multiplicityEClass = createEClass(MULTIPLICITY);

		rangeMultiplicityEClass = createEClass(RANGE_MULTIPLICITY);
		createEAttribute(rangeMultiplicityEClass, RANGE_MULTIPLICITY__LOWER_BOUND);
		createEAttribute(rangeMultiplicityEClass, RANGE_MULTIPLICITY__UPPER_BOUND);

		exactMultiplicityEClass = createEClass(EXACT_MULTIPLICITY);
		createEAttribute(exactMultiplicityEClass, EXACT_MULTIPLICITY__EXACT_VALUE);

		unboundedMultiplicityEClass = createEClass(UNBOUNDED_MULTIPLICITY);

		argumentEClass = createEClass(ARGUMENT);
		createEReference(argumentEClass, ARGUMENT__VARIABLE);
		createEReference(argumentEClass, ARGUMENT__SINGLETON_VARIABLE);

		// Create enums
		logicValueEEnum = createEEnum(LOGIC_VALUE);
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
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		problemEClass.getESuperTypes().add(this.getNamedElement());
		relationEClass.getESuperTypes().add(this.getNamedElement());
		classDeclarationEClass.getESuperTypes().add(this.getRelation());
		classDeclarationEClass.getESuperTypes().add(this.getStatement());
		referenceDeclarationEClass.getESuperTypes().add(this.getRelation());
		predicateDefinitionEClass.getESuperTypes().add(this.getRelation());
		predicateDefinitionEClass.getESuperTypes().add(this.getStatement());
		parameterEClass.getESuperTypes().add(this.getVariable());
		variableEClass.getESuperTypes().add(this.getNamedElement());
		conjunctionEClass.getESuperTypes().add(this.getExistentialQuantifier());
		atomEClass.getESuperTypes().add(this.getLiteral());
		implicitVariableEClass.getESuperTypes().add(this.getVariable());
		negativeLiteralEClass.getESuperTypes().add(this.getExistentialQuantifier());
		negativeLiteralEClass.getESuperTypes().add(this.getLiteral());
		assertionEClass.getESuperTypes().add(this.getStatement());
		nodeEClass.getESuperTypes().add(this.getNamedElement());
		scopeDeclarationEClass.getESuperTypes().add(this.getStatement());
		rangeMultiplicityEClass.getESuperTypes().add(this.getMultiplicity());
		exactMultiplicityEClass.getESuperTypes().add(this.getMultiplicity());
		unboundedMultiplicityEClass.getESuperTypes().add(this.getMultiplicity());

		// Initialize classes, features, and operations; add parameters
		initEClass(problemEClass, Problem.class, "Problem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProblem_Nodes(), this.getNode(), null, "nodes", null, 0, -1, Problem.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getProblem_Statements(), this.getStatement(), null, "statements", null, 0, -1, Problem.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(relationEClass, Relation.class, "Relation", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(classDeclarationEClass, ClassDeclaration.class, "ClassDeclaration", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassDeclaration_Abstract(), ecorePackage.getEBoolean(), "abstract", null, 0, 1,
				ClassDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getClassDeclaration_SuperTypes(), this.getClassDeclaration(), null, "superTypes", null, 0, -1,
				ClassDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassDeclaration_ReferenceDeclarations(), this.getReferenceDeclaration(), null,
				"referenceDeclarations", null, 0, -1, ClassDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getClassDeclaration_NewNode(), this.getNode(), null, "newNode", null, 0, 1,
				ClassDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceDeclarationEClass, ReferenceDeclaration.class, "ReferenceDeclaration", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceDeclaration_ReferenceType(), this.getClassDeclaration(), null, "referenceType", null,
				0, 1, ReferenceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferenceDeclaration_Opposite(), this.getReferenceDeclaration(), null, "opposite", null, 0, 1,
				ReferenceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceDeclaration_Containment(), ecorePackage.getEBoolean(), "containment", null, 0, 1,
				ReferenceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferenceDeclaration_Multiplicity(), this.getMultiplicity(), null, "multiplicity", null, 0, 1,
				ReferenceDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(predicateDefinitionEClass, PredicateDefinition.class, "PredicateDefinition", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPredicateDefinition_Error(), ecorePackage.getEBoolean(), "error", null, 0, 1,
				PredicateDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPredicateDefinition_Parameters(), this.getParameter(), null, "parameters", null, 0, -1,
				PredicateDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPredicateDefinition_Bodies(), this.getConjunction(), null, "bodies", null, 0, -1,
				PredicateDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameter_ParameterType(), this.getClassDeclaration(), null, "parameterType", null, 0, 1,
				Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(conjunctionEClass, Conjunction.class, "Conjunction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getConjunction_Literals(), this.getLiteral(), null, "literals", null, 0, -1, Conjunction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(literalEClass, Literal.class, "Literal", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(atomEClass, Atom.class, "Atom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAtom_Relation(), this.getRelation(), null, "relation", null, 0, 1, Atom.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getAtom_TransitiveClosure(), ecorePackage.getEBoolean(), "transitiveClosure", null, 0, 1,
				Atom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getAtom_Arguments(), this.getArgument(), null, "arguments", null, 0, -1, Atom.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(implicitVariableEClass, ImplicitVariable.class, "ImplicitVariable", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(negativeLiteralEClass, NegativeLiteral.class, "NegativeLiteral", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNegativeLiteral_Atom(), this.getAtom(), null, "atom", null, 0, 1, NegativeLiteral.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(existentialQuantifierEClass, ExistentialQuantifier.class, "ExistentialQuantifier", IS_ABSTRACT,
				IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getExistentialQuantifier_ImplicitVariables(), this.getImplicitVariable(), null,
				"implicitVariables", null, 0, -1, ExistentialQuantifier.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(assertionEClass, Assertion.class, "Assertion", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAssertion_Relation(), this.getRelation(), null, "relation", null, 0, 1, Assertion.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAssertion_Arguments(), this.getNode(), null, "arguments", null, 0, -1, Assertion.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAssertion_Value(), this.getLogicValue(), "value", null, 0, 1, Assertion.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(scopeDeclarationEClass, ScopeDeclaration.class, "ScopeDeclaration", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getScopeDeclaration_TypeScopes(), this.getTypeScope(), null, "typeScopes", null, 0, -1,
				ScopeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(statementEClass, Statement.class, "Statement", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(typeScopeEClass, TypeScope.class, "TypeScope", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTypeScope_TargetType(), this.getClassDeclaration(), null, "targetType", null, 0, 1,
				TypeScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTypeScope_Increment(), ecorePackage.getEBoolean(), "increment", null, 0, 1, TypeScope.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTypeScope_Multiplicity(), this.getMultiplicity(), null, "multiplicity", null, 0, 1,
				TypeScope.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(multiplicityEClass, Multiplicity.class, "Multiplicity", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(rangeMultiplicityEClass, RangeMultiplicity.class, "RangeMultiplicity", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRangeMultiplicity_LowerBound(), ecorePackage.getEInt(), "lowerBound", "0", 0, 1,
				RangeMultiplicity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getRangeMultiplicity_UpperBound(), ecorePackage.getEInt(), "upperBound", "-1", 0, 1,
				RangeMultiplicity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(exactMultiplicityEClass, ExactMultiplicity.class, "ExactMultiplicity", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExactMultiplicity_ExactValue(), ecorePackage.getEInt(), "exactValue", "1", 0, 1,
				ExactMultiplicity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(unboundedMultiplicityEClass, UnboundedMultiplicity.class, "UnboundedMultiplicity", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(argumentEClass, Argument.class, "Argument", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArgument_Variable(), this.getVariable(), null, "variable", null, 0, 1, Argument.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArgument_SingletonVariable(), this.getImplicitVariable(), null, "singletonVariable", null, 0,
				1, Argument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(logicValueEEnum, LogicValue.class, "LogicValue");
		addEEnumLiteral(logicValueEEnum, LogicValue.TRUE);
		addEEnumLiteral(logicValueEEnum, LogicValue.FALSE);
		addEEnumLiteral(logicValueEEnum, LogicValue.UNKNOWN);

		// Create resource
		createResource(eNS_URI);
	}

} //ProblemPackageImpl
