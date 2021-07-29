package org.eclipse.viatra.solver.language.resource;

import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.viatra.solver.language.model.problem.Argument;
import org.eclipse.viatra.solver.language.model.problem.Assertion;
import org.eclipse.viatra.solver.language.model.problem.AssertionArgument;
import org.eclipse.viatra.solver.language.model.problem.Atom;
import org.eclipse.viatra.solver.language.model.problem.Conjunction;
import org.eclipse.viatra.solver.language.model.problem.Literal;
import org.eclipse.viatra.solver.language.model.problem.NegativeLiteral;
import org.eclipse.viatra.solver.language.model.problem.NodeAssertionArgument;
import org.eclipse.viatra.solver.language.model.problem.NodeValueAssertion;
import org.eclipse.viatra.solver.language.model.problem.PredicateDefinition;
import org.eclipse.viatra.solver.language.model.problem.Problem;
import org.eclipse.viatra.solver.language.model.problem.ProblemPackage;
import org.eclipse.viatra.solver.language.model.problem.Statement;
import org.eclipse.viatra.solver.language.model.problem.VariableOrNodeArgument;
import org.eclipse.viatra.solver.language.naming.NamingUtil;
import org.eclipse.xtext.linking.impl.LinkingHelper;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;

import com.google.common.collect.ImmutableSet;
import com.google.inject.Inject;
import com.google.inject.name.Named;

public class NodeNameCollector {
	@Inject
	private LinkingHelper linkingHelper;

	@Inject
	private IQualifiedNameConverter qualifiedNameConverter;

	@Inject
	@Named(AbstractDeclarativeScopeProvider.NAMED_DELEGATE)
	private IScopeProvider scopeProvider;

	private final ImmutableSet.Builder<String> nodeNames = ImmutableSet.builder();

	private IScope nodeScope;

	public Set<String> getNodeNames() {
		return nodeNames.build();
	}

	public void collectNodeNames(Problem problem) {
		nodeScope = scopeProvider.getScope(problem, ProblemPackage.Literals.NODE_ASSERTION_ARGUMENT__NODE);
		for (Statement statement : problem.getStatements()) {
			collectStatementNodeNames(statement);
		}
	}

	protected void collectStatementNodeNames(Statement statement) {
		if (statement instanceof Assertion) {
			collectAssertionNodeNames((Assertion) statement);
		} else if (statement instanceof NodeValueAssertion) {
			collectNodeValueAssertionNodeNames((NodeValueAssertion) statement);
		} else if (statement instanceof PredicateDefinition) {
			collectPredicateDefinitionNodeNames((PredicateDefinition) statement);
		}
	}

	protected void collectAssertionNodeNames(Assertion assertion) {
		for (AssertionArgument argument : assertion.getArguments()) {
			if (argument instanceof NodeAssertionArgument) {
				collectNodeNames(argument, ProblemPackage.Literals.NODE_ASSERTION_ARGUMENT__NODE,
						NamingUtil::isValidNodeName);
			}
		}
	}

	protected void collectNodeValueAssertionNodeNames(NodeValueAssertion nodeValueAssertion) {
		collectNodeNames(nodeValueAssertion, ProblemPackage.Literals.NODE_VALUE_ASSERTION__NODE,
				NamingUtil::isValidNodeName);
	}

	protected void collectPredicateDefinitionNodeNames(PredicateDefinition predicateDefinition) {
		for (Conjunction body : predicateDefinition.getBodies()) {
			for (Literal literal : body.getLiterals()) {
				collectLiteralNodeNames(literal);
			}
		}
	}

	protected void collectLiteralNodeNames(Literal literal) {
		Atom atom = null;
		if (literal instanceof Atom) {
			atom = (Atom) literal;
		} else if (literal instanceof NegativeLiteral) {
			var negativeLiteral = (NegativeLiteral) literal;
			atom = negativeLiteral.getAtom();
		}
		if (atom == null) {
			return;
		}
		for (Argument argument : atom.getArguments()) {
			if (argument instanceof VariableOrNodeArgument) {
				collectNodeNames(argument, ProblemPackage.Literals.VARIABLE_OR_NODE_ARGUMENT__VARIABLE_OR_NODE,
						NamingUtil::isQuotedName);
			}
		}
	}

	private void collectNodeNames(EObject eObject, EStructuralFeature feature, Predicate<String> condition) {
		List<INode> nodes = NodeModelUtils.findNodesForFeature(eObject, feature);
		for (INode node : nodes) {
			var nodeName = linkingHelper.getCrossRefNodeAsString(node, true);
			if (!condition.test(nodeName)) {
				continue;
			}
			var qualifiedName = qualifiedNameConverter.toQualifiedName(nodeName);
			if (nodeScope.getSingleElement(qualifiedName) == null) {
				nodeNames.add(nodeName);
			}
		}
	}
}