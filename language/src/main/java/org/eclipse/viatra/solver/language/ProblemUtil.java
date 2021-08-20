package org.eclipse.viatra.solver.language;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.viatra.solver.language.model.problem.ClassDeclaration;
import org.eclipse.viatra.solver.language.model.problem.Node;
import org.eclipse.viatra.solver.language.model.problem.Problem;
import org.eclipse.viatra.solver.language.model.problem.ProblemPackage;
import org.eclipse.viatra.solver.language.model.problem.ReferenceDeclaration;
import org.eclipse.viatra.solver.language.model.problem.Relation;
import org.eclipse.viatra.solver.language.model.problem.Variable;
import org.eclipse.viatra.solver.language.scoping.ProblemGlobalScopeProvider;

import com.google.common.collect.ImmutableList;

public final class ProblemUtil {
	private ProblemUtil() {
		throw new IllegalStateException("This is a static utility class and should not be instantiated directly");
	}

	public static final String NODE_CLASS_NAME = "node";

	public static boolean isSingletonVariable(Variable variable) {
		return variable.eContainingFeature() == ProblemPackage.Literals.VARIABLE_OR_NODE_ARGUMENT__SINGLETON_VARIABLE;
	}

	public static boolean isUniqueNode(Node node) {
		var containingFeature = node.eContainingFeature();
		return containingFeature == ProblemPackage.Literals.UNIQUE_DECLARATION__NODES
				|| containingFeature == ProblemPackage.Literals.ENUM_DECLARATION__LITERALS;
	}

	public static boolean isNewNode(Node node) {
		return node.eContainingFeature() == ProblemPackage.Literals.CLASS_DECLARATION__NEW_NODE;
	}

	public static Optional<Problem> getBuiltInLibrary(EObject context) {
		return Optional.ofNullable(context.eResource()).map(Resource::getResourceSet)
				.map(resourceSet -> resourceSet.getResource(ProblemGlobalScopeProvider.BULTIN_LIBRARY_URI, true))
				.map(Resource::getContents).filter(contents -> !contents.isEmpty()).map(contents -> contents.get(0))
				.filter(Problem.class::isInstance).map(Problem.class::cast);
	}

	public static boolean isBuiltIn(EObject eObject) {
		if (eObject != null) {
			var eResource = eObject.eResource();
			if (eResource != null) {
				return ProblemGlobalScopeProvider.BULTIN_LIBRARY_URI.equals(eResource.getURI());
			}
		}
		return false;
	}

	public static Optional<ClassDeclaration> getNodeClassDeclaration(EObject context) {
		return getBuiltInLibrary(context).flatMap(problem -> problem.getStatements().stream()
				.filter(ClassDeclaration.class::isInstance).map(ClassDeclaration.class::cast)
				.filter(declaration -> NODE_CLASS_NAME.equals(declaration.getName())).findFirst());
	}

	public static Collection<ClassDeclaration> getSuperclassesAndSelf(ClassDeclaration classDeclaration) {
		Set<ClassDeclaration> found = new HashSet<>();
		getNodeClassDeclaration(classDeclaration).ifPresent(found::add);
		Deque<ClassDeclaration> queue = new ArrayDeque<>();
		queue.addLast(classDeclaration);
		while (!queue.isEmpty()) {
			ClassDeclaration current = queue.removeFirst();
			if (!found.contains(current)) {
				found.add(current);
				for (Relation superType : current.getSuperTypes()) {
					if (superType instanceof ClassDeclaration) {
						queue.addLast((ClassDeclaration) superType);
					}
				}
			}
		}
		return found;
	}

	public static Collection<ReferenceDeclaration> getAllReferenceDeclarations(ClassDeclaration classDeclaration) {
		ImmutableList.Builder<ReferenceDeclaration> builder = ImmutableList.builder();
		for (ClassDeclaration superclass : getSuperclassesAndSelf(classDeclaration)) {
			builder.addAll(superclass.getReferenceDeclarations());
		}
		return builder.build();
	}
}
