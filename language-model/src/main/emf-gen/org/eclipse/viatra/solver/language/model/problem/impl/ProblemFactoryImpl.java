/**
 */
package org.eclipse.viatra.solver.language.model.problem.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.viatra.solver.language.model.problem.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ProblemFactoryImpl extends EFactoryImpl implements ProblemFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProblemFactory init() {
		try {
			ProblemFactory theProblemFactory = (ProblemFactory) EPackage.Registry.INSTANCE
					.getEFactory(ProblemPackage.eNS_URI);
			if (theProblemFactory != null) {
				return theProblemFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ProblemFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemFactoryImpl() {
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
		case ProblemPackage.PROBLEM:
			return createProblem();
		case ProblemPackage.CLASS_DECLARATION:
			return createClassDeclaration();
		case ProblemPackage.REFERENCE_DECLARATION:
			return createReferenceDeclaration();
		case ProblemPackage.PREDICATE_DEFINITION:
			return createPredicateDefinition();
		case ProblemPackage.PARAMETER:
			return createParameter();
		case ProblemPackage.CONJUNCTION:
			return createConjunction();
		case ProblemPackage.ATOM:
			return createAtom();
		case ProblemPackage.IMPLICIT_VARIABLE:
			return createImplicitVariable();
		case ProblemPackage.NEGATIVE_LITERAL:
			return createNegativeLiteral();
		case ProblemPackage.ASSERTION:
			return createAssertion();
		case ProblemPackage.NODE:
			return createNode();
		case ProblemPackage.SCOPE_DECLARATION:
			return createScopeDeclaration();
		case ProblemPackage.TYPE_SCOPE:
			return createTypeScope();
		case ProblemPackage.RANGE_MULTIPLICITY:
			return createRangeMultiplicity();
		case ProblemPackage.EXACT_MULTIPLICITY:
			return createExactMultiplicity();
		case ProblemPackage.UNBOUNDED_MULTIPLICITY:
			return createUnboundedMultiplicity();
		case ProblemPackage.VARIABLE_OR_NODE_ARGUMENT:
			return createVariableOrNodeArgument();
		case ProblemPackage.ENUM_DECLARATION:
			return createEnumDeclaration();
		case ProblemPackage.INT_CONSTANT:
			return createIntConstant();
		case ProblemPackage.REAL_CONSTANT:
			return createRealConstant();
		case ProblemPackage.STRING_CONSTANT:
			return createStringConstant();
		case ProblemPackage.CONSTANT_ARGUMENT:
			return createConstantArgument();
		case ProblemPackage.NODE_ASSERTION_ARGUMENT:
			return createNodeAssertionArgument();
		case ProblemPackage.CONSTANT_ASSERTION_ARGUMENT:
			return createConstantAssertionArgument();
		case ProblemPackage.NODE_VALUE_ASSERTION:
			return createNodeValueAssertion();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case ProblemPackage.LOGIC_VALUE:
			return createLogicValueFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case ProblemPackage.LOGIC_VALUE:
			return convertLogicValueToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Problem createProblem() {
		ProblemImpl problem = new ProblemImpl();
		return problem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassDeclaration createClassDeclaration() {
		ClassDeclarationImpl classDeclaration = new ClassDeclarationImpl();
		return classDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceDeclaration createReferenceDeclaration() {
		ReferenceDeclarationImpl referenceDeclaration = new ReferenceDeclarationImpl();
		return referenceDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PredicateDefinition createPredicateDefinition() {
		PredicateDefinitionImpl predicateDefinition = new PredicateDefinitionImpl();
		return predicateDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Conjunction createConjunction() {
		ConjunctionImpl conjunction = new ConjunctionImpl();
		return conjunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Atom createAtom() {
		AtomImpl atom = new AtomImpl();
		return atom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImplicitVariable createImplicitVariable() {
		ImplicitVariableImpl implicitVariable = new ImplicitVariableImpl();
		return implicitVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegativeLiteral createNegativeLiteral() {
		NegativeLiteralImpl negativeLiteral = new NegativeLiteralImpl();
		return negativeLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Assertion createAssertion() {
		AssertionImpl assertion = new AssertionImpl();
		return assertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeDeclaration createScopeDeclaration() {
		ScopeDeclarationImpl scopeDeclaration = new ScopeDeclarationImpl();
		return scopeDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeScope createTypeScope() {
		TypeScopeImpl typeScope = new TypeScopeImpl();
		return typeScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RangeMultiplicity createRangeMultiplicity() {
		RangeMultiplicityImpl rangeMultiplicity = new RangeMultiplicityImpl();
		return rangeMultiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExactMultiplicity createExactMultiplicity() {
		ExactMultiplicityImpl exactMultiplicity = new ExactMultiplicityImpl();
		return exactMultiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnboundedMultiplicity createUnboundedMultiplicity() {
		UnboundedMultiplicityImpl unboundedMultiplicity = new UnboundedMultiplicityImpl();
		return unboundedMultiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableOrNodeArgument createVariableOrNodeArgument() {
		VariableOrNodeArgumentImpl variableOrNodeArgument = new VariableOrNodeArgumentImpl();
		return variableOrNodeArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumDeclaration createEnumDeclaration() {
		EnumDeclarationImpl enumDeclaration = new EnumDeclarationImpl();
		return enumDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntConstant createIntConstant() {
		IntConstantImpl intConstant = new IntConstantImpl();
		return intConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RealConstant createRealConstant() {
		RealConstantImpl realConstant = new RealConstantImpl();
		return realConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StringConstant createStringConstant() {
		StringConstantImpl stringConstant = new StringConstantImpl();
		return stringConstant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantArgument createConstantArgument() {
		ConstantArgumentImpl constantArgument = new ConstantArgumentImpl();
		return constantArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeAssertionArgument createNodeAssertionArgument() {
		NodeAssertionArgumentImpl nodeAssertionArgument = new NodeAssertionArgumentImpl();
		return nodeAssertionArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantAssertionArgument createConstantAssertionArgument() {
		ConstantAssertionArgumentImpl constantAssertionArgument = new ConstantAssertionArgumentImpl();
		return constantAssertionArgument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NodeValueAssertion createNodeValueAssertion() {
		NodeValueAssertionImpl nodeValueAssertion = new NodeValueAssertionImpl();
		return nodeValueAssertion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicValue createLogicValueFromString(EDataType eDataType, String initialValue) {
		LogicValue result = LogicValue.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLogicValueToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProblemPackage getProblemPackage() {
		return (ProblemPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ProblemPackage getPackage() {
		return ProblemPackage.eINSTANCE;
	}

} //ProblemFactoryImpl
