package org.eclipse.viatra.solver.data.query.building;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class DNFPredicate {
	private final String name;
	private final String uniqueName;
	private final List<Variable> parameters;
	private final List<DNFAnd> clauses;
	
	public DNFPredicate(String name, List<Variable> parameters, List<DNFAnd> clauses) {
		this.name = name;
		this.uniqueName = generateUniqueName(name,"predicate");
		this.parameters = parameters;
		this.clauses = clauses;
		
		postProcess();
	}
	
	public static String generateUniqueName(String originalName, String defaultPrefix) {
		UUID uuid = UUID.randomUUID();
		String uniqueString = uuid.toString().replace('-', '_');
		if(originalName == null) {
			return defaultPrefix+uniqueString;
		} else {
			return originalName+uniqueString;
		}
	}
	
	public String getName() {
		return name;
	}
	public String getUniqueName() {
		return uniqueName;
	}
	public List<Variable> getVariables() {
		return parameters;
	}
	public List<DNFAnd> getClauses() {
		return clauses;
	}
	
	public void unifyVariables() {
		Map<String,Variable> uniqueVariableMap = new HashMap<>();
		for(Variable parameter : this.parameters) {
			if(parameter.isNamed()) {
				String parameterName = parameter.getName();
				if(uniqueVariableMap.containsKey(parameterName)) {
					throw new IllegalArgumentException("Multiple parameters has the name "+parameterName);
				} else {
					uniqueVariableMap.put(parameterName, parameter);
				}
			}
		}
		for(DNFAnd clause : this.clauses) {
			clause.unifyVariables(uniqueVariableMap);
		}
	}
	public void collectQuantifiedVariables() {
		for(DNFAnd clause : this.clauses) {
			clause.collectQuantifiedVariables(new HashSet<>(parameters));
		}
	}
	public void postProcess() {
		unifyVariables();
		collectQuantifiedVariables();
	}
}
