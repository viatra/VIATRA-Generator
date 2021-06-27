/*
 * generated by Xtext 2.26.0.M1
 */
package org.eclipse.viatra.solver.language.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.viatra.solver.language.model.problem.Assertion;
import org.eclipse.viatra.solver.language.model.problem.Atom;
import org.eclipse.viatra.solver.language.model.problem.ClassDeclaration;
import org.eclipse.viatra.solver.language.model.problem.Conjunction;
import org.eclipse.viatra.solver.language.model.problem.ConstantArgument;
import org.eclipse.viatra.solver.language.model.problem.ConstantAssertionArgument;
import org.eclipse.viatra.solver.language.model.problem.EnumDeclaration;
import org.eclipse.viatra.solver.language.model.problem.ExactMultiplicity;
import org.eclipse.viatra.solver.language.model.problem.IntConstant;
import org.eclipse.viatra.solver.language.model.problem.NegativeLiteral;
import org.eclipse.viatra.solver.language.model.problem.Node;
import org.eclipse.viatra.solver.language.model.problem.NodeAssertionArgument;
import org.eclipse.viatra.solver.language.model.problem.NodeValueAssertion;
import org.eclipse.viatra.solver.language.model.problem.PredicateDefinition;
import org.eclipse.viatra.solver.language.model.problem.Problem;
import org.eclipse.viatra.solver.language.model.problem.ProblemPackage;
import org.eclipse.viatra.solver.language.model.problem.RangeMultiplicity;
import org.eclipse.viatra.solver.language.model.problem.RealConstant;
import org.eclipse.viatra.solver.language.model.problem.ReferenceDeclaration;
import org.eclipse.viatra.solver.language.model.problem.ScopeDeclaration;
import org.eclipse.viatra.solver.language.model.problem.StringConstant;
import org.eclipse.viatra.solver.language.model.problem.TypeScope;
import org.eclipse.viatra.solver.language.model.problem.UnboundedMultiplicity;
import org.eclipse.viatra.solver.language.model.problem.VariableOrNodeArgument;
import org.eclipse.viatra.solver.language.services.ProblemGrammarAccess;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class ProblemSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private ProblemGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == ProblemPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case ProblemPackage.ASSERTION:
				sequence_Assertion(context, (Assertion) semanticObject); 
				return; 
			case ProblemPackage.ATOM:
				sequence_Atom(context, (Atom) semanticObject); 
				return; 
			case ProblemPackage.CLASS_DECLARATION:
				sequence_ClassDeclaration(context, (ClassDeclaration) semanticObject); 
				return; 
			case ProblemPackage.CONJUNCTION:
				sequence_Conjunction(context, (Conjunction) semanticObject); 
				return; 
			case ProblemPackage.CONSTANT_ARGUMENT:
				sequence_ConstantArgument(context, (ConstantArgument) semanticObject); 
				return; 
			case ProblemPackage.CONSTANT_ASSERTION_ARGUMENT:
				sequence_ConstantAssertionArgument(context, (ConstantAssertionArgument) semanticObject); 
				return; 
			case ProblemPackage.ENUM_DECLARATION:
				sequence_EnumDeclaration(context, (EnumDeclaration) semanticObject); 
				return; 
			case ProblemPackage.EXACT_MULTIPLICITY:
				sequence_ExactMultiplicity(context, (ExactMultiplicity) semanticObject); 
				return; 
			case ProblemPackage.INT_CONSTANT:
				sequence_IntConstant(context, (IntConstant) semanticObject); 
				return; 
			case ProblemPackage.NEGATIVE_LITERAL:
				sequence_NegativeLiteral(context, (NegativeLiteral) semanticObject); 
				return; 
			case ProblemPackage.NODE:
				sequence_EnumLiteral(context, (Node) semanticObject); 
				return; 
			case ProblemPackage.NODE_ASSERTION_ARGUMENT:
				sequence_NodeAssertionArgument(context, (NodeAssertionArgument) semanticObject); 
				return; 
			case ProblemPackage.NODE_VALUE_ASSERTION:
				sequence_NodeValueAssertion(context, (NodeValueAssertion) semanticObject); 
				return; 
			case ProblemPackage.PARAMETER:
				sequence_Parameter(context, (org.eclipse.viatra.solver.language.model.problem.Parameter) semanticObject); 
				return; 
			case ProblemPackage.PREDICATE_DEFINITION:
				sequence_PredicateDefinition(context, (PredicateDefinition) semanticObject); 
				return; 
			case ProblemPackage.PROBLEM:
				sequence_Problem(context, (Problem) semanticObject); 
				return; 
			case ProblemPackage.RANGE_MULTIPLICITY:
				sequence_RangeMultiplicity(context, (RangeMultiplicity) semanticObject); 
				return; 
			case ProblemPackage.REAL_CONSTANT:
				sequence_RealConstant(context, (RealConstant) semanticObject); 
				return; 
			case ProblemPackage.REFERENCE_DECLARATION:
				sequence_ReferenceDeclaration(context, (ReferenceDeclaration) semanticObject); 
				return; 
			case ProblemPackage.SCOPE_DECLARATION:
				sequence_ScopeDeclaration(context, (ScopeDeclaration) semanticObject); 
				return; 
			case ProblemPackage.STRING_CONSTANT:
				sequence_StringConstant(context, (StringConstant) semanticObject); 
				return; 
			case ProblemPackage.TYPE_SCOPE:
				sequence_TypeScope(context, (TypeScope) semanticObject); 
				return; 
			case ProblemPackage.UNBOUNDED_MULTIPLICITY:
				sequence_UnboundedMultiplicity(context, (UnboundedMultiplicity) semanticObject); 
				return; 
			case ProblemPackage.VARIABLE_OR_NODE_ARGUMENT:
				sequence_VariableOrNodeArgument(context, (VariableOrNodeArgument) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Statement returns Assertion
	 *     Assertion returns Assertion
	 *
	 * Constraint:
	 *     (
	 *         (relation=[Relation|QualifiedName] (arguments+=AssertionArgument arguments+=AssertionArgument*)? value=LogicValue) | 
	 *         (value=ShortLogicValue? relation=[Relation|QualifiedName] (arguments+=AssertionArgument arguments+=AssertionArgument*)?)
	 *     )
	 */
	protected void sequence_Assertion(ISerializationContext context, Assertion semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Literal returns Atom
	 *     Atom returns Atom
	 *
	 * Constraint:
	 *     (relation=[Relation|QualifiedName] transitiveClosure?='+'? (arguments+=Argument arguments+=Argument*)?)
	 */
	protected void sequence_Atom(ISerializationContext context, Atom semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns ClassDeclaration
	 *     ClassDeclaration returns ClassDeclaration
	 *
	 * Constraint:
	 *     (
	 *         abstract?='abstract'? 
	 *         name=Identifier 
	 *         (superTypes+=[Relation|QualifiedName] superTypes+=[Relation|QualifiedName]*)? 
	 *         referenceDeclarations+=ReferenceDeclaration*
	 *     )
	 */
	protected void sequence_ClassDeclaration(ISerializationContext context, ClassDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Conjunction returns Conjunction
	 *
	 * Constraint:
	 *     (literals+=Literal literals+=Literal*)
	 */
	protected void sequence_Conjunction(ISerializationContext context, Conjunction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Argument returns ConstantArgument
	 *     ConstantArgument returns ConstantArgument
	 *
	 * Constraint:
	 *     constant=Constant
	 */
	protected void sequence_ConstantArgument(ISerializationContext context, ConstantArgument semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ProblemPackage.Literals.CONSTANT_ARGUMENT__CONSTANT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProblemPackage.Literals.CONSTANT_ARGUMENT__CONSTANT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConstantArgumentAccess().getConstantConstantParserRuleCall_0(), semanticObject.getConstant());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AssertionArgument returns ConstantAssertionArgument
	 *     ConstantAssertionArgument returns ConstantAssertionArgument
	 *
	 * Constraint:
	 *     constant=Constant
	 */
	protected void sequence_ConstantAssertionArgument(ISerializationContext context, ConstantAssertionArgument semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ProblemPackage.Literals.CONSTANT_ASSERTION_ARGUMENT__CONSTANT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProblemPackage.Literals.CONSTANT_ASSERTION_ARGUMENT__CONSTANT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getConstantAssertionArgumentAccess().getConstantConstantParserRuleCall_0(), semanticObject.getConstant());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns EnumDeclaration
	 *     EnumDeclaration returns EnumDeclaration
	 *
	 * Constraint:
	 *     (name=Identifier (literals+=EnumLiteral literals+=EnumLiteral*)?)
	 */
	protected void sequence_EnumDeclaration(ISerializationContext context, EnumDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     EnumLiteral returns Node
	 *
	 * Constraint:
	 *     name=QuotedOrUnquotedId
	 */
	protected void sequence_EnumLiteral(ISerializationContext context, Node semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ProblemPackage.Literals.NAMED_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProblemPackage.Literals.NAMED_ELEMENT__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEnumLiteralAccess().getNameQuotedOrUnquotedIdParserRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Multiplicity returns ExactMultiplicity
	 *     DefiniteMultiplicity returns ExactMultiplicity
	 *     ExactMultiplicity returns ExactMultiplicity
	 *
	 * Constraint:
	 *     exactValue=INT
	 */
	protected void sequence_ExactMultiplicity(ISerializationContext context, ExactMultiplicity semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ProblemPackage.Literals.EXACT_MULTIPLICITY__EXACT_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProblemPackage.Literals.EXACT_MULTIPLICITY__EXACT_VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getExactMultiplicityAccess().getExactValueINTTerminalRuleCall_0(), semanticObject.getExactValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Constant returns IntConstant
	 *     IntConstant returns IntConstant
	 *
	 * Constraint:
	 *     intValue=Integer
	 */
	protected void sequence_IntConstant(ISerializationContext context, IntConstant semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ProblemPackage.Literals.INT_CONSTANT__INT_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProblemPackage.Literals.INT_CONSTANT__INT_VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getIntConstantAccess().getIntValueIntegerParserRuleCall_0(), semanticObject.getIntValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Literal returns NegativeLiteral
	 *     NegativeLiteral returns NegativeLiteral
	 *
	 * Constraint:
	 *     atom=Atom
	 */
	protected void sequence_NegativeLiteral(ISerializationContext context, NegativeLiteral semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ProblemPackage.Literals.NEGATIVE_LITERAL__ATOM) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProblemPackage.Literals.NEGATIVE_LITERAL__ATOM));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNegativeLiteralAccess().getAtomAtomParserRuleCall_1_0(), semanticObject.getAtom());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     AssertionArgument returns NodeAssertionArgument
	 *     NodeAssertionArgument returns NodeAssertionArgument
	 *
	 * Constraint:
	 *     node=[Node|QualifiedName]
	 */
	protected void sequence_NodeAssertionArgument(ISerializationContext context, NodeAssertionArgument semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ProblemPackage.Literals.NODE_ASSERTION_ARGUMENT__NODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProblemPackage.Literals.NODE_ASSERTION_ARGUMENT__NODE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNodeAssertionArgumentAccess().getNodeNodeQualifiedNameParserRuleCall_0_1(), semanticObject.eGet(ProblemPackage.Literals.NODE_ASSERTION_ARGUMENT__NODE, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns NodeValueAssertion
	 *     NodeValueAssertion returns NodeValueAssertion
	 *
	 * Constraint:
	 *     (node=[Node|QualifiedName] value=Constant)
	 */
	protected void sequence_NodeValueAssertion(ISerializationContext context, NodeValueAssertion semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ProblemPackage.Literals.NODE_VALUE_ASSERTION__NODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProblemPackage.Literals.NODE_VALUE_ASSERTION__NODE));
			if (transientValues.isValueTransient(semanticObject, ProblemPackage.Literals.NODE_VALUE_ASSERTION__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProblemPackage.Literals.NODE_VALUE_ASSERTION__VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getNodeValueAssertionAccess().getNodeNodeQualifiedNameParserRuleCall_0_0_1(), semanticObject.eGet(ProblemPackage.Literals.NODE_VALUE_ASSERTION__NODE, false));
		feeder.accept(grammarAccess.getNodeValueAssertionAccess().getValueConstantParserRuleCall_2_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Parameter returns Parameter
	 *
	 * Constraint:
	 *     (parameterType=[Relation|QualifiedName]? name=Identifier)
	 */
	protected void sequence_Parameter(ISerializationContext context, org.eclipse.viatra.solver.language.model.problem.Parameter semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns PredicateDefinition
	 *     PredicateDefinition returns PredicateDefinition
	 *
	 * Constraint:
	 *     (error?='error'? name=Identifier (parameters+=Parameter parameters+=Parameter*)? (bodies+=Conjunction bodies+=Conjunction*)?)
	 */
	protected void sequence_PredicateDefinition(ISerializationContext context, PredicateDefinition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Problem returns Problem
	 *
	 * Constraint:
	 *     ((name=Identifier statements+=Statement+) | statements+=Statement+)?
	 */
	protected void sequence_Problem(ISerializationContext context, Problem semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Multiplicity returns RangeMultiplicity
	 *     DefiniteMultiplicity returns RangeMultiplicity
	 *     RangeMultiplicity returns RangeMultiplicity
	 *
	 * Constraint:
	 *     (lowerBound=INT upperBound=UpperBound)
	 */
	protected void sequence_RangeMultiplicity(ISerializationContext context, RangeMultiplicity semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ProblemPackage.Literals.RANGE_MULTIPLICITY__LOWER_BOUND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProblemPackage.Literals.RANGE_MULTIPLICITY__LOWER_BOUND));
			if (transientValues.isValueTransient(semanticObject, ProblemPackage.Literals.RANGE_MULTIPLICITY__UPPER_BOUND) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProblemPackage.Literals.RANGE_MULTIPLICITY__UPPER_BOUND));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRangeMultiplicityAccess().getLowerBoundINTTerminalRuleCall_0_0(), semanticObject.getLowerBound());
		feeder.accept(grammarAccess.getRangeMultiplicityAccess().getUpperBoundUpperBoundParserRuleCall_2_0(), semanticObject.getUpperBound());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Constant returns RealConstant
	 *     RealConstant returns RealConstant
	 *
	 * Constraint:
	 *     realValue=Real
	 */
	protected void sequence_RealConstant(ISerializationContext context, RealConstant semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ProblemPackage.Literals.REAL_CONSTANT__REAL_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProblemPackage.Literals.REAL_CONSTANT__REAL_VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRealConstantAccess().getRealValueRealParserRuleCall_0(), semanticObject.getRealValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ReferenceDeclaration returns ReferenceDeclaration
	 *
	 * Constraint:
	 *     (
	 *         containment?='contains'? 
	 *         referenceType=[Relation|QualifiedName] 
	 *         multiplicity=Multiplicity? 
	 *         name=Identifier 
	 *         opposite=[ReferenceDeclaration|QualifiedName]?
	 *     )
	 */
	protected void sequence_ReferenceDeclaration(ISerializationContext context, ReferenceDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Statement returns ScopeDeclaration
	 *     ScopeDeclaration returns ScopeDeclaration
	 *
	 * Constraint:
	 *     (typeScopes+=TypeScope typeScopes+=TypeScope*)
	 */
	protected void sequence_ScopeDeclaration(ISerializationContext context, ScopeDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Constant returns StringConstant
	 *     StringConstant returns StringConstant
	 *
	 * Constraint:
	 *     stringValue=STRING
	 */
	protected void sequence_StringConstant(ISerializationContext context, StringConstant semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ProblemPackage.Literals.STRING_CONSTANT__STRING_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProblemPackage.Literals.STRING_CONSTANT__STRING_VALUE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getStringConstantAccess().getStringValueSTRINGTerminalRuleCall_0(), semanticObject.getStringValue());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     TypeScope returns TypeScope
	 *
	 * Constraint:
	 *     (targetType=[ClassDeclaration|ID] increment?='+='? multiplicity=DefiniteMultiplicity)
	 */
	protected void sequence_TypeScope(ISerializationContext context, TypeScope semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Multiplicity returns UnboundedMultiplicity
	 *     UnboundedMultiplicity returns UnboundedMultiplicity
	 *
	 * Constraint:
	 *     {UnboundedMultiplicity}
	 */
	protected void sequence_UnboundedMultiplicity(ISerializationContext context, UnboundedMultiplicity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Argument returns VariableOrNodeArgument
	 *     VariableOrNodeArgument returns VariableOrNodeArgument
	 *
	 * Constraint:
	 *     variableOrNode=[VariableOrNode|QualifiedName]
	 */
	protected void sequence_VariableOrNodeArgument(ISerializationContext context, VariableOrNodeArgument semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, ProblemPackage.Literals.VARIABLE_OR_NODE_ARGUMENT__VARIABLE_OR_NODE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, ProblemPackage.Literals.VARIABLE_OR_NODE_ARGUMENT__VARIABLE_OR_NODE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getVariableOrNodeArgumentAccess().getVariableOrNodeVariableOrNodeQualifiedNameParserRuleCall_0_1(), semanticObject.eGet(ProblemPackage.Literals.VARIABLE_OR_NODE_ARGUMENT__VARIABLE_OR_NODE, false));
		feeder.finish();
	}
	
	
}
