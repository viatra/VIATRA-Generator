package org.eclipse.viatra.solver.language.ide.syntaxcoloring;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.viatra.solver.language.model.problem.ClassDeclaration;
import org.eclipse.viatra.solver.language.model.problem.Node;
import org.eclipse.viatra.solver.language.model.problem.Parameter;
import org.eclipse.viatra.solver.language.model.problem.PredicateDefinition;
import org.eclipse.viatra.solver.language.model.problem.ReferenceDeclaration;
import org.eclipse.viatra.solver.language.model.problem.Variable;
import org.eclipse.viatra.solver.language.scoping.ProblemGlobalScopeProvider;
import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.service.OperationCanceledManager;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.util.SimpleAttributeResolver;

import com.google.inject.Inject;

public class ProblemSemanticHighlightingCalculator extends DefaultSemanticHighlightingCalculator {
	private static final String BUILTIN_CLASS = "cm-keyword";
	private static final String CLASS_CLASS = "problem-class";
	private static final String ABSTRACT_CLASS = "problem-abstract";
	private static final String REFERENCE_CLASS = "problem-reference";
	private static final String CONTAINMENT_CLASS = "problem-containment";
	private static final String PREDICATE_CLASS = "problem-predicate";
	private static final String ERROR_CLASS = "problem-error";
	private static final String NODE_CLASS = "problem-node";
	private static final String PARAMETER_CLASS = "problem-parameter";
	private static final String VARIABLE_CLASS = "problem-variable";

	@Inject
	private OperationCanceledManager operationCanceledManager;

	@Override
	protected boolean highlightElement(EObject object, IHighlightedPositionAcceptor acceptor,
			CancelIndicator cancelIndicator) {
		highlightName(object, acceptor, cancelIndicator);
		highlightCrossReferences(object, acceptor, cancelIndicator);
		return false;
	}
	
	protected void highlightName(EObject object, IHighlightedPositionAcceptor acceptor,
			CancelIndicator cancelIndicator) {
		String highlightClass = getHighlightClass(object);
		if (highlightClass != null) {
			EAttribute nameAttribute = SimpleAttributeResolver.NAME_RESOLVER.getAttribute(object);
			if (nameAttribute != null) {
				highlightFeature(acceptor, object, nameAttribute, highlightClass);
			}
		}
	}

	protected void highlightCrossReferences(EObject object, IHighlightedPositionAcceptor acceptor,
			CancelIndicator cancelIndicator) {
		for (EReference reference : object.eClass().getEAllReferences()) {
			if (reference.isContainment()) {
				continue;
			}
			operationCanceledManager.checkCanceled(cancelIndicator);
			Object value = object.eGet(reference);
			if (value instanceof EList) {
				@SuppressWarnings("unchecked")
				EList<? extends EObject> values = (EList<? extends EObject>) value;
				List<INode> nodes = NodeModelUtils.findNodesForFeature(object, reference);
				int size = Math.min(values.size(), nodes.size());
				for (int i = 0; i < size; i++) {
					EObject valueInList = values.get(i);
					INode node = nodes.get(i);
					String highlightClass = getHighlightClass(valueInList);
					if (highlightClass != null) {
						highlightNode(acceptor, node, highlightClass);
					}
				}
			} else if (value instanceof EObject) {
				EObject valueObj = (EObject) value;
				String highlightClass = getHighlightClass(valueObj);
				if (highlightClass != null) {
					highlightFeature(acceptor, object, reference, highlightClass);
				}
			}
		}
	}

	protected String getHighlightClass(EObject eObject) {
		if (isBuiltIn(eObject)) {
			return BUILTIN_CLASS;
		}
		if (eObject instanceof ClassDeclaration) {
			ClassDeclaration classDeclaration = (ClassDeclaration) eObject;
			if (classDeclaration.isAbstract()) {
				return ABSTRACT_CLASS;
			}
			return CLASS_CLASS;
		}
		if (eObject instanceof ReferenceDeclaration) {
			ReferenceDeclaration referenceDeclaration = (ReferenceDeclaration) eObject;
			if (referenceDeclaration.isContainment()) {
				return CONTAINMENT_CLASS;
			}
			return REFERENCE_CLASS;
		}
		if (eObject instanceof PredicateDefinition) {
			PredicateDefinition predicateDefinition = (PredicateDefinition) eObject;
			if (predicateDefinition.isError()) {
				return ERROR_CLASS;
			}
			return PREDICATE_CLASS;
		}
		if (eObject instanceof Node) {
			return NODE_CLASS;
		}
		if (eObject instanceof Parameter) {
			return PARAMETER_CLASS;
		}
		if (eObject instanceof Variable) {
			return VARIABLE_CLASS;
		}
		return null;
	}

	protected boolean isBuiltIn(EObject eObject) {
		if (eObject != null) {
			Resource eResource = eObject.eResource();
			if (eResource != null) {
				return ProblemGlobalScopeProvider.LIBRARY_URI.equals(eResource.getURI());
			}
		}
		return false;
	}
}
