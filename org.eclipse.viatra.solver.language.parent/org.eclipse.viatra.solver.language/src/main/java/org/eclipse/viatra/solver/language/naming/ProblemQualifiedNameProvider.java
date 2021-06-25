package org.eclipse.viatra.solver.language.naming;

import org.eclipse.viatra.solver.language.model.problem.Node;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

public class ProblemQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
	public QualifiedName qualifiedName(Node node) {
		String name = node.getName();
		if (name == null || name.isEmpty()) {
			return null;
		}
		return getConverter().toQualifiedName(name);
	}
}
