package org.eclipse.viatra.solver.data.query.building;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DNFAnd {
	private Set<Variable> existentiallyQuantified;
	private List<DNFAtom> constraints;
	public DNFAnd(Set<Variable> quantifiedVariables, List<DNFAtom> constraints) {
		super();
		this.existentiallyQuantified = quantifiedVariables;
		this.constraints = constraints;
	}
	public Set<Variable> getExistentiallyQuantified() {
		return existentiallyQuantified;
	}
	public List<DNFAtom> getConstraints() {
		return constraints;
	}
	void unifyVariables(Map<String,Variable> uniqueVariableMap) {
		Map<String,Variable> uniqueVariableMapForClause = new HashMap<>(uniqueVariableMap);
		for(DNFAtom atom : constraints) {
			atom.unifyVariables(uniqueVariableMapForClause);
		}
	}
	void collectQuantifiedVariables(Set<Variable> parameters) {
		Set<Variable> result = new HashSet<>();
		for(DNFAtom constraint : constraints) {
			constraint.collectAllVariables(result);
		}
		result.removeAll(parameters);
		existentiallyQuantified = result;
	}
}
