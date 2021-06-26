package org.eclipse.viatra.solver.language;

import org.eclipse.viatra.solver.language.model.problem.Node;
import org.eclipse.viatra.solver.language.model.problem.ProblemPackage;
import org.eclipse.viatra.solver.language.model.problem.Variable;

import com.google.inject.Singleton;

@Singleton
public class ProblemUtil {
	public static final String SINGLETON_VARIABLE_PREFIX = "_";

	public static final String ENUM_NODE_NAME_QUOTE = "'";

	public static boolean isSingletonVariableName(String name) {
		return name != null && name.startsWith(SINGLETON_VARIABLE_PREFIX);
	}

	public static boolean isSingletonVariable(Variable variable) {
		return variable.eContainingFeature() == ProblemPackage.Literals.ARGUMENT__SINGLETON_VARIABLE;
	}

	public static boolean isEnumNode(Node node) {
		String name = node.getName();
		return name != null && name.startsWith(ENUM_NODE_NAME_QUOTE) && name.endsWith(ENUM_NODE_NAME_QUOTE);
	}

	public static boolean isNewNode(Node node) {
		return node.eContainingFeature() == ProblemPackage.Literals.CLASS_DECLARATION__NEW_NODE;
	}
}
