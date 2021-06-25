package org.eclipse.viatra.solver.language.resource;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.viatra.solver.language.model.problem.ReferenceDeclaration;
import org.eclipse.viatra.solver.language.model.problem.Variable;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.AliasedEObjectDescription;
import org.eclipse.xtext.resource.impl.DefaultResourceDescriptionStrategy;
import org.eclipse.xtext.util.IAcceptor;

import com.google.inject.Singleton;

@Singleton
public class ProblemResourceDescriptionStrategy extends DefaultResourceDescriptionStrategy {
	@Override
	public boolean createEObjectDescriptions(EObject eObject, IAcceptor<IEObjectDescription> acceptor) {
		IAcceptor<IEObjectDescription> wrappedAcceptor;
		if (eObject instanceof Variable) {
			return false;
		}
		if (eObject instanceof ReferenceDeclaration) {
			wrappedAcceptor = new IAcceptor<IEObjectDescription>() {
				public void accept(IEObjectDescription description) {
					acceptor.accept(description);
					QualifiedName qualifiedName = description.getQualifiedName();
					if (qualifiedName.getSegmentCount() >= 2) {
						QualifiedName simpleName = QualifiedName.create(qualifiedName.getLastSegment());
						IEObjectDescription aliasedDescription = new AliasedEObjectDescription(simpleName, description);
						acceptor.accept(aliasedDescription);
					}
				};
			};
		} else {
			wrappedAcceptor = acceptor;
		}
		return super.createEObjectDescriptions(eObject, wrappedAcceptor);
	}
}
