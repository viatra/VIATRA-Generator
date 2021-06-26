package org.eclipse.viatra.solver.language.resource;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.viatra.solver.language.ProblemUtil;
import org.eclipse.viatra.solver.language.model.problem.NamedElement;
import org.eclipse.viatra.solver.language.model.problem.Node;
import org.eclipse.viatra.solver.language.model.problem.Problem;
import org.eclipse.viatra.solver.language.model.problem.Variable;
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
		if (eObject instanceof Variable) {
			return false;
		}
		if (eObject instanceof NamedElement) {
			NamedElement namedElement = (NamedElement) eObject;
			String name = namedElement.getName();
			if (name == null || name.isEmpty()) {
				return true;
			}
			Problem problem = EcoreUtil2.getContainerOfType(namedElement, Problem.class);
			QualifiedName problemQualifiedName = null;
			if (problem != null) {
				String problemName = problem.getName();
				if (problemName != null && !problemName.isEmpty()) {
					problemQualifiedName = qualifiedNameConverter.toQualifiedName(problemName);
				}
			}
			QualifiedName qualifiedName = qualifiedNameConverter.toQualifiedName(namedElement.getName());
			boolean nameExported;
			if (shouldExportSimpleName(namedElement)) {
				acceptEObjectDescription(namedElement, problemQualifiedName, qualifiedName, acceptor);
				nameExported = true;
			} else {
				nameExported = false;
			}
			EObject parent = namedElement.eContainer();
			while (parent != null && parent != problem) {
				if (parent instanceof NamedElement) {
					NamedElement namedParent = (NamedElement) parent;
					String parentName = namedParent.getName();
					if (parentName != null || !name.isEmpty()) {
						QualifiedName parentQualifiedName = qualifiedNameConverter.toQualifiedName(parentName);
						qualifiedName = parentQualifiedName.append(qualifiedName);
						if (shouldExportSimpleName(parent)) {
							acceptEObjectDescription(namedElement, problemQualifiedName, qualifiedName, acceptor);
							nameExported = true;
						} else {
							nameExported = false;
						}
					}
				}
				parent = parent.eContainer();
			}
			if (!nameExported) {
				acceptEObjectDescription(namedElement, problemQualifiedName, qualifiedName, acceptor);
			}
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
		QualifiedName qualifiedNameWithPrefix = prefix == null ? qualifiedName : prefix.append(qualifiedName);
		acceptor.accept(EObjectDescription.create(qualifiedNameWithPrefix, eObject));
	}
}
