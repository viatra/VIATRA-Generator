package org.eclipse.viatra.solver.language.resource;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.viatra.solver.language.ProblemUtil;
import org.eclipse.viatra.solver.language.model.problem.NamedElement;
import org.eclipse.viatra.solver.language.model.problem.Node;
import org.eclipse.viatra.solver.language.model.problem.Problem;
import org.eclipse.viatra.solver.language.model.problem.Variable;
import org.eclipse.viatra.solver.language.naming.NamingUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.EObjectDescription;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;
import org.eclipse.xtext.util.IAcceptor;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class ProblemResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {
	@Inject
	private IQualifiedNameConverter qualifiedNameConverter;

	@Override
	public boolean createEObjectDescriptions(EObject eObject, IAcceptor<IEObjectDescription> acceptor) {
		if (!shouldExport(eObject)) {
			return false;
		}
		var qualifiedName = getNameAsQualifiedName(eObject);
		if (qualifiedName == null) {
			return true;
		}
		var problem = EcoreUtil2.getContainerOfType(eObject, Problem.class);
		var problemQualifiedName = getNameAsQualifiedName(problem);
		boolean nameExported;
		if (shouldExportSimpleName(eObject)) {
			acceptEObjectDescription(eObject, problemQualifiedName, qualifiedName, acceptor);
			nameExported = true;
		} else {
			nameExported = false;
		}
		var parent = eObject.eContainer();
		while (parent != null && parent != problem) {
			var parentQualifiedName = getNameAsQualifiedName(parent);
			if (parentQualifiedName == null) {
				parent = parent.eContainer();
				continue;
			}
			qualifiedName = parentQualifiedName.append(qualifiedName);
			if (shouldExportSimpleName(parent)) {
				acceptEObjectDescription(eObject, problemQualifiedName, qualifiedName, acceptor);
				nameExported = true;
			} else {
				nameExported = false;
			}
			parent = parent.eContainer();
		}
		if (!nameExported) {
			acceptEObjectDescription(eObject, problemQualifiedName, qualifiedName, acceptor);
		}
		return true;
	}

	protected QualifiedName getNameAsQualifiedName(EObject eObject) {
		if (!(eObject instanceof NamedElement)) {
			return null;
		}
		var namedElement = (NamedElement) eObject;
		var name = namedElement.getName();
		if (NamingUtil.isNullOrEmpty(name)) {
			return null;
		}
		return qualifiedNameConverter.toQualifiedName(name);
	}

	protected boolean shouldExport(EObject eObject) {
		if (eObject instanceof Variable) {
			// Variables are always private to the containing predicate definition.
			return false;
		}
		if (eObject instanceof Node) {
			var node = (Node) eObject;
			// Only enum literals and new nodes are visible across problem files.
			return ProblemUtil.isUniqueNode(node) || ProblemUtil.isNewNode(node);
		}
		return true;
	}

	protected boolean shouldExportSimpleName(EObject eObject) {
		if (eObject instanceof Node) {
			return !ProblemUtil.isNewNode((Node) eObject);
		}
		return true;
	}

	private void acceptEObjectDescription(EObject eObject, QualifiedName prefix, QualifiedName qualifiedName,
			IAcceptor<IEObjectDescription> acceptor) {
		var qualifiedNameWithPrefix = prefix == null ? qualifiedName : prefix.append(qualifiedName);
		acceptor.accept(EObjectDescription.create(qualifiedNameWithPrefix, eObject));
	}
}
