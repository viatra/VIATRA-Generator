package org.eclipse.viatra.solver.language.resource;

import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.viatra.solver.language.model.problem.Assertion;
import org.eclipse.viatra.solver.language.model.problem.Atom;
import org.eclipse.viatra.solver.language.model.problem.Conjunction;
import org.eclipse.viatra.solver.language.model.problem.ImplicitVariable;
import org.eclipse.viatra.solver.language.model.problem.Literal;
import org.eclipse.viatra.solver.language.model.problem.NegativeLiteral;
import org.eclipse.viatra.solver.language.model.problem.Node;
import org.eclipse.viatra.solver.language.model.problem.Problem;
import org.eclipse.viatra.solver.language.model.problem.ProblemPackage;
import org.eclipse.viatra.solver.language.model.problem.Statement;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.DefaultLocationInFileProvider;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.util.ITextRegion;

import com.google.inject.Inject;

public class ProblemLocationInFileProvider extends DefaultLocationInFileProvider {
	@Inject
	private IQualifiedNameProvider qualifiedNameProvider;

	@Inject
	private IScopeProvider scopeProvider;

	@Override
	protected ITextRegion doGetTextRegion(EObject obj, RegionDescription query) {
		if (obj instanceof Node) {
			return getNodeTextRegion((Node) obj, query);
		}
		if (obj instanceof ImplicitVariable) {
			return getVariableTextRegion((ImplicitVariable) obj, query);
		}
		return super.doGetTextRegion(obj, query);
	}

	protected ITextRegion getNodeTextRegion(Node node, RegionDescription query) {
		ITextRegion newNodeRegion = getNewNodeTextRegion(node, query);
		if (newNodeRegion != null) {
			return newNodeRegion;
		}
		return getNodeFirstReferenceTextRegion(node, query);
	}
	
	protected ITextRegion getNewNodeTextRegion(Node node, RegionDescription query) {
		QualifiedName nodeName = qualifiedNameProvider.getFullyQualifiedName(node);
		if (nodeName == null || nodeName.getSegmentCount() <= 1) {
			return null;
		}
		if (ProblemDerivedStateComputer.NEW_NODE.equals(nodeName.getLastSegment())) {
			QualifiedName className = nodeName.skipLast(1);
			IScope classScope = scopeProvider.getScope(node, ProblemPackage.Literals.ASSERTION__RELATION);
			IEObjectDescription description = classScope.getSingleElement(className);
			if (description == null) {
				return null;
			}
			EObject classDeclaration = description.getEObjectOrProxy();
			if (!classDeclaration.eIsProxy()) {
				return doGetTextRegion(classDeclaration, query);
			}
		}
		return null;
	}

	protected ITextRegion getNodeFirstReferenceTextRegion(Node node, RegionDescription query) {
		Problem problem = EcoreUtil2.getContainerOfType(node, Problem.class);
		if (problem == null) {
			return ITextRegion.EMPTY_REGION;
		}
		for (Statement statement : problem.getStatements()) {
			if (statement instanceof Assertion) {
				Assertion assertion = (Assertion) statement;
				int index = assertion.getArguments().indexOf(node);
				if (index >= 0) {
					return doGetLocationOfFeature(assertion, ProblemPackage.Literals.ASSERTION__ARGUMENTS, index,
							query);
				}
			}
		}
		return ITextRegion.EMPTY_REGION;
	}

	protected ITextRegion getVariableTextRegion(ImplicitVariable variable, RegionDescription query) {
		EObject container = variable.eContainer();
		if (container instanceof Conjunction) {
			return getFirstReferenceToVariableInConjunction(variable, (Conjunction) container, query);
		}
		if (container instanceof NegativeLiteral) {
			return getFirstReferenceToVariableInNegativeLiteral(variable, (NegativeLiteral) container, query);
		}
		return ITextRegion.EMPTY_REGION;
	}

	protected ITextRegion getFirstReferenceToVariableInConjunction(ImplicitVariable variable, Conjunction conjunction,
			RegionDescription query) {
		Iterator<Literal> iterator = conjunction.getLiterals().iterator();
		ITextRegion found = ITextRegion.EMPTY_REGION;
		while (found == ITextRegion.EMPTY_REGION && iterator.hasNext()) {
			Literal literal = iterator.next();
			if (literal instanceof Atom) {
				found = getFirstReferenceToVariableInAtom(variable, (Atom) literal, query);
			} else if (literal instanceof NegativeLiteral) {
				found = getFirstReferenceToVariableInNegativeLiteral(variable, (NegativeLiteral) literal, query);
			}
		}
		return found;
	}

	protected ITextRegion getFirstReferenceToVariableInNegativeLiteral(ImplicitVariable variable,
			NegativeLiteral literal, RegionDescription query) {
		return getFirstReferenceToVariableInAtom(variable, literal.getAtom(), query);
	}

	protected ITextRegion getFirstReferenceToVariableInAtom(ImplicitVariable variable, Atom atom,
			RegionDescription query) {
		int index = atom.getArguments().indexOf(variable);
		if (index >= 0) {
			return doGetLocationOfFeature(atom, ProblemPackage.Literals.ATOM__ARGUMENTS, index, query);
		}
		return ITextRegion.EMPTY_REGION;
	}
}
