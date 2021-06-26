package org.eclipse.viatra.solver.language.ide.syntaxcoloring;

import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.viatra.solver.language.ProblemUtil;
import org.eclipse.viatra.solver.language.model.problem.ClassDeclaration;
import org.eclipse.viatra.solver.language.model.problem.EnumDeclaration;
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

import com.google.common.collect.ImmutableList;
import com.google.inject.Inject;

public class ProblemSemanticHighlightingCalculator extends DefaultSemanticHighlightingCalculator {
	private static final String BUILTIN_CLASS = "cm-keyword";
	private static final String CLASS_CLASS = "problem-class";
	private static final String ABSTRACT_CLASS = "problem-abstract";
	private static final String ENUM_CLASS = "problem-enum";
	private static final String REFERENCE_CLASS = "problem-reference";
	private static final String CONTAINMENT_CLASS = "problem-containment";
	private static final String PREDICATE_CLASS = "problem-predicate";
	private static final String ERROR_CLASS = "problem-error";
	private static final String NODE_CLASS = "problem-node";
	private static final String ENUM_NODE_CLASS = "problem-enum-node";
	private static final String NEW_NODE_CLASS = "problem-new-node";
	private static final String PARAMETER_CLASS = "problem-parameter";
	private static final String VARIABLE_CLASS = "problem-variable";
	private static final String SINGLETON_VARIABLE_CLASS = "problem-singleton-variable";

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
		String[] highlightClass = getHighlightClass(object);
		if (highlightClass.length > 0) {
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
			if (reference.isMany()) {
				@SuppressWarnings("unchecked")
				EList<? extends EObject> values = (EList<? extends EObject>) object.eGet(reference);
				List<INode> nodes = NodeModelUtils.findNodesForFeature(object, reference);
				int size = Math.min(values.size(), nodes.size());
				for (int i = 0; i < size; i++) {
					EObject valueInList = values.get(i);
					INode node = nodes.get(i);
					String[] highlightClass = getHighlightClass(valueInList);
					if (highlightClass.length > 0) {
						highlightNode(acceptor, node, highlightClass);
					}
				}
			} else {
				EObject valueObj = (EObject) object.eGet(reference);
				String[] highlightClass = getHighlightClass(valueObj);
				if (highlightClass.length > 0) {
					highlightFeature(acceptor, object, reference, highlightClass);
				}
			}
		}
	}

	protected String[] getHighlightClass(EObject eObject) {
		if (isBuiltIn(eObject)) {
			return new String[] { BUILTIN_CLASS };
		}
		ImmutableList.Builder<String> classesBuilder = ImmutableList.builder();
		if (eObject instanceof ClassDeclaration) {
			classesBuilder.add(CLASS_CLASS);
			ClassDeclaration classDeclaration = (ClassDeclaration) eObject;
			if (classDeclaration.isAbstract()) {
				classesBuilder.add(ABSTRACT_CLASS);
			}
		}
		if (eObject instanceof EnumDeclaration) {
			classesBuilder.add(ENUM_CLASS);
		}
		if (eObject instanceof ReferenceDeclaration) {
			classesBuilder.add(REFERENCE_CLASS);
			ReferenceDeclaration referenceDeclaration = (ReferenceDeclaration) eObject;
			if (referenceDeclaration.isContainment()) {
				classesBuilder.add(CONTAINMENT_CLASS);
			}
		}
		if (eObject instanceof PredicateDefinition) {
			classesBuilder.add(PREDICATE_CLASS);
			PredicateDefinition predicateDefinition = (PredicateDefinition) eObject;
			if (predicateDefinition.isError()) {
				classesBuilder.add(ERROR_CLASS);
			}
		}
		if (eObject instanceof Node) {
			classesBuilder.add(NODE_CLASS);
			Node node = (Node) eObject;
			if (ProblemUtil.isEnumNode(node)) {
				classesBuilder.add(ENUM_NODE_CLASS);
			}
			if (ProblemUtil.isNewNode(node)) {
				classesBuilder.add(NEW_NODE_CLASS);
			}
		}
		if (eObject instanceof Parameter) {
			classesBuilder.add(PARAMETER_CLASS);
		}
		if (eObject instanceof Variable) {
			classesBuilder.add(VARIABLE_CLASS);
			Variable variable = (Variable) eObject;
			if (ProblemUtil.isSingletonVariable(variable)) {
				classesBuilder.add(SINGLETON_VARIABLE_CLASS);
			}
		}
		List<String> classes = classesBuilder.build();
		return classes.toArray(new String[0]);
	}

	protected boolean isBuiltIn(EObject eObject) {
		if (eObject != null) {
			Resource eResource = eObject.eResource();
			if (eResource != null) {
				return ProblemGlobalScopeProvider.BULTIN_LIBRARY_URI.equals(eResource.getURI());
			}
		}
		return false;
	}
}
