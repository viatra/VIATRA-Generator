package org.eclipse.viatra.solver.data.query.building;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public interface DNFAtom {
	void unifyVariables(Map<String,Variable> variables);
	static Variable unifyVariables(Map<String,Variable> unifiedVariables, Variable variable) {
		if(variable != null) {
			if(variable.isNamed() && unifiedVariables.containsKey(variable.getName())) {
				return unifiedVariables.get(variable.getName());
			}
			return variable;
		} else {
			return null;
		}
	}
	void collectAllVariables(Set<Variable> variables);
	static void addToCollection(Set<Variable> variables, Variable variable) {
		if(variable != null) {
			variables.add(variable);
		}
	}
	static void addToCollection(Set<Variable> variables, Collection<Variable> variableCollection) {
		Iterator<Variable> iterator = variableCollection.iterator();
		while(iterator.hasNext()) {
			Variable variable = iterator.next();
			addToCollection(variables, variable);
		}
	}
}
