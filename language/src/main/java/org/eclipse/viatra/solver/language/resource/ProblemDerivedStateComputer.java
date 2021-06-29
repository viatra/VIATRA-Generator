package org.eclipse.viatra.solver.language.resource;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.viatra.solver.language.ProblemUtil;
import org.eclipse.viatra.solver.language.model.problem.Argument;
import org.eclipse.viatra.solver.language.model.problem.Atom;
import org.eclipse.viatra.solver.language.model.problem.ClassDeclaration;
import org.eclipse.viatra.solver.language.model.problem.Conjunction;
import org.eclipse.viatra.solver.language.model.problem.ExistentialQuantifier;
import org.eclipse.viatra.solver.language.model.problem.ImplicitVariable;
import org.eclipse.viatra.solver.language.model.problem.Literal;
import org.eclipse.viatra.solver.language.model.problem.NegativeLiteral;
import org.eclipse.viatra.solver.language.model.problem.Node;
import org.eclipse.viatra.solver.language.model.problem.Parameter;
import org.eclipse.viatra.solver.language.model.problem.PredicateDefinition;
import org.eclipse.viatra.solver.language.model.problem.Problem;
import org.eclipse.viatra.solver.language.model.problem.ProblemFactory;
import org.eclipse.viatra.solver.language.model.problem.ProblemPackage;
import org.eclipse.viatra.solver.language.model.problem.Statement;
import org.eclipse.viatra.solver.language.model.problem.VariableOrNodeArgument;
import org.eclipse.xtext.Constants;
import org.eclipse.xtext.linking.impl.LinkingHelper;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.resource.IDerivedStateComputer;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.google.inject.Singleton;
import com.google.inject.name.Named;

@Singleton
public class ProblemDerivedStateComputer implements IDerivedStateComputer {
	public static final String NEW_NODE = "new";

	private static final Pattern ID_REGEX = Pattern.compile("[_a-zA-Z][_0-9a-zA-Z]*");

	private static final Pattern QUOTED_ID_REGEX = Pattern.compile("'(\\\\.|[^\\'])*'");

	@Inject
	@Named(Constants.LANGUAGE_NAME)
	private String languageName;

	@Inject
	private LinkingHelper linkingHelper;

	@Inject
	private IQualifiedNameConverter qualifiedNameConverter;

	@Inject
	@Named(AbstractDeclarativeScopeProvider.NAMED_DELEGATE)
	private IScopeProvider scopeProvider;

	@Inject
	private Provider<NodeNameCollector> nodeNameCollectorProvider;
	
	@Override
	public void installDerivedState(DerivedStateAwareResource resource, boolean preLinkingPhase) {
		Problem problem = getProblem(resource);
		if (problem != null) {
			Adapter adapter = getOrInstallAdapter(resource);
			installDerivedProblemState(problem, adapter, preLinkingPhase);
		}
	}

	protected Problem getProblem(Resource resource) {
		List<EObject> contents = resource.getContents();
		if (contents.isEmpty()) {
			return null;
		}
		EObject object = contents.get(0);
		if (object instanceof Problem) {
			return (Problem) object;
		}
		return null;
	}

	protected void installDerivedProblemState(Problem problem, Adapter adapter, boolean preLinkingPhase) {
		installNewNodes(problem, adapter);
		if (preLinkingPhase) {
			return;
		}
		Set<String> nodeNames = installDerivedNodes(problem);
		for (Statement statement : problem.getStatements()) {
			if (statement instanceof PredicateDefinition) {
				PredicateDefinition definition = (PredicateDefinition) statement;
				installDerivedPredicateDefinitionState(definition, nodeNames);
			}
		}
	}

	protected void installNewNodes(Problem problem, Adapter adapter) {
		for (Statement statement : problem.getStatements()) {
			if (statement instanceof ClassDeclaration) {
				ClassDeclaration declaration = (ClassDeclaration) statement;
				if (!declaration.isAbstract() && declaration.getNewNode() == null) {
					Node newNode = adapter.newNodes.computeIfAbsent(declaration, key -> createNode(NEW_NODE));
					declaration.setNewNode(newNode);
				}
			}
		}
	}

	protected Set<String> installDerivedNodes(Problem problem) {
		NodeNameCollector collector = nodeNameCollectorProvider.get();
		collector.collectNodeNames(problem);
		Set<String> nodeNames = collector.getNodeNames();
		List<Node> grapNodes = problem.getNodes();
		for (String nodeName : nodeNames) {
			Node graphNode = createNode(nodeName);
			grapNodes.add(graphNode);
		}
		return nodeNames;
	}

	protected Node createNode(String name) {
		Node node = ProblemFactory.eINSTANCE.createNode();
		node.setName(name);
		return node;
	}

	protected void installDerivedPredicateDefinitionState(PredicateDefinition definition, Set<String> nodeNames) {
		Set<String> knownVariables = new HashSet<>();
		knownVariables.addAll(nodeNames);
		for (Parameter parameter : definition.getParameters()) {
			String name = parameter.getName();
			if (name != null) {
				knownVariables.add(name);
			}
		}
		for (Conjunction body : definition.getBodies()) {
			installDeriveConjunctionState(body, knownVariables);
		}
	}

	protected void installDeriveConjunctionState(Conjunction conjunction, Set<String> knownVariables) {
		Set<String> newVariables = new HashSet<>();
		for (Literal literal : conjunction.getLiterals()) {
			if (literal instanceof Atom) {
				Atom atom = (Atom) literal;
				createSigletonVariablesAndCollectVariables(atom, knownVariables, newVariables);
			}
		}
		createVariables(conjunction, newVariables);
		newVariables.addAll(knownVariables);
		for (Literal literal : conjunction.getLiterals()) {
			if (literal instanceof NegativeLiteral) {
				NegativeLiteral negativeLiteral = (NegativeLiteral) literal;
				installDeriveNegativeLiteralState(negativeLiteral, newVariables);
			}
		}
	}

	protected void installDeriveNegativeLiteralState(NegativeLiteral negativeLiteral, Set<String> knownVariables) {
		Set<String> newVariables = new HashSet<>();
		createSigletonVariablesAndCollectVariables(negativeLiteral.getAtom(), knownVariables, newVariables);
		createVariables(negativeLiteral, newVariables);
	}

	protected void createSigletonVariablesAndCollectVariables(Atom atom, Set<String> knownVariables,
			Set<String> newVariables) {
		for (Argument argument : atom.getArguments()) {
			if (argument instanceof VariableOrNodeArgument) {
				VariableOrNodeArgument variableOrNodeArgument = (VariableOrNodeArgument) argument;
				IScope scope = scopeProvider.getScope(variableOrNodeArgument,
						ProblemPackage.Literals.VARIABLE_OR_NODE_ARGUMENT__VARIABLE_OR_NODE);
				List<INode> nodes = NodeModelUtils.findNodesForFeature(variableOrNodeArgument,
						ProblemPackage.Literals.VARIABLE_OR_NODE_ARGUMENT__VARIABLE_OR_NODE);
				for (INode node : nodes) {
					String variableName = linkingHelper.getCrossRefNodeAsString(node, true);
					if (!validId(variableName)) {
						continue;
					}
					QualifiedName qualifiedName = qualifiedNameConverter.toQualifiedName(variableName);
					if (scope.getSingleElement(qualifiedName) != null) {
						continue;
					}
					if (ProblemUtil.isSingletonVariableName(variableName)) {
						createSingletonVariable(variableOrNodeArgument, variableName);
						break;
					}
					if (!knownVariables.contains(variableName)) {
						newVariables.add(variableName);
						break;
					}
				}
			}
		}
	}

	protected void createVariables(ExistentialQuantifier quantifier, Set<String> newVariables) {
		for (String variableName : newVariables) {
			createVariable(quantifier, variableName);
		}
	}

	protected void createVariable(ExistentialQuantifier quantifier, String variableName) {
		if (validId(variableName)) {
			ImplicitVariable variable = createNamedVariable(variableName);
			quantifier.getImplicitVariables().add(variable);
		}
	}

	protected void createSingletonVariable(VariableOrNodeArgument argument, String variableName) {
		if (validId(variableName)) {
			ImplicitVariable variable = createNamedVariable(variableName);
			argument.setSingletonVariable(variable);
		}
	}

	protected ImplicitVariable createNamedVariable(String variableName) {
		ImplicitVariable variable = ProblemFactory.eINSTANCE.createImplicitVariable();
		variable.setName(variableName);
		return variable;
	}

	@Override
	public void discardDerivedState(DerivedStateAwareResource resource) {
		Problem problem = getProblem(resource);
		if (problem != null) {
			Adapter adapter = getOrInstallAdapter(resource);
			discardDerivedProblemState(problem, adapter);
		}
	}

	protected void discardDerivedProblemState(Problem problem, Adapter adapter) {
		Set<ClassDeclaration> classDeclarations = new HashSet<>();
		problem.getNodes().clear();
		for (Statement statement : problem.getStatements()) {
			if (statement instanceof ClassDeclaration) {
				ClassDeclaration classDeclaration = (ClassDeclaration) statement;
				classDeclaration.setNewNode(null);
				classDeclarations.add(classDeclaration);
			}
			if (statement instanceof PredicateDefinition) {
				PredicateDefinition definition = (PredicateDefinition) statement;
				for (Conjunction body : definition.getBodies()) {
					body.getImplicitVariables().clear();
					for (Literal literal : body.getLiterals()) {
						if (literal instanceof Atom) {
							discardDerivedAtomState((Atom) literal);
						}
						if (literal instanceof NegativeLiteral) {
							NegativeLiteral negativeLiteral = (NegativeLiteral) literal;
							negativeLiteral.getImplicitVariables().clear();
							discardDerivedAtomState(negativeLiteral.getAtom());
						}
					}
				}
			}
		}
		adapter.newNodes.keySet().retainAll(classDeclarations);
	}

	protected void discardDerivedAtomState(Atom atom) {
		if (atom == null) {
			return;
		}
		for (Argument argument : atom.getArguments()) {
			if (argument instanceof VariableOrNodeArgument) {
				VariableOrNodeArgument variableOrNodeArgument = (VariableOrNodeArgument) argument;
				variableOrNodeArgument.setSingletonVariable(null);
			}
		}
	}

	protected static boolean validId(String name) {
		return name != null && ID_REGEX.matcher(name).matches();
	}

	protected static boolean validQuotedId(String name) {
		return name != null && QUOTED_ID_REGEX.matcher(name).matches();
	}

	protected static boolean validNodeName(String name) {
		return validId(name) || validQuotedId(name);
	}

	protected Adapter getOrInstallAdapter(Resource resource) {
		if (!(resource instanceof XtextResource)) {
			return new Adapter();
		}
		String resourceLanguageName = ((XtextResource) resource).getLanguageName();
		if (!languageName.equals(resourceLanguageName)) {
			return new Adapter();
		}
		Adapter adapter = (Adapter) EcoreUtil.getAdapter(resource.eAdapters(), Adapter.class);
		if (adapter == null) {
			adapter = new Adapter();
			resource.eAdapters().add(adapter);
		}
		return adapter;
	}

	protected static class Adapter extends AdapterImpl {
		public Map<ClassDeclaration, Node> newNodes = new HashMap<>();

		@Override
		public boolean isAdapterForType(Object type) {
			return Adapter.class == type;
		}
	}
}
