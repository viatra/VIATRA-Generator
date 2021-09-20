package org.eclipse.viatra.solver.data.query.building;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.viatra.solver.data.query.view.FilteredRelationView;
import org.eclipse.viatra.solver.data.query.view.RelationView;

public class RelationAtom implements DNFAtom{
	RelationView<?> view;
	List<Variable> substitution;
	
	public RelationAtom(RelationView<?> view, List<Variable> substitution) {
		this.view = view;
		this.substitution = substitution;
	}
	public RelationView<?> getView() {
		return view;
	}
	public void setView(FilteredRelationView<?> view) {
		this.view = view;
	}
	public List<Variable> getSubstitution() {
		return substitution;
	}
	public void setSubstitution(List<Variable> substitution) {
		this.substitution = substitution;
	}
	
	@Override
	public void unifyVariables(Map<String, Variable> variables) {
		for(int i = 0; i<this.substitution.size(); i++) {
			final Object term = this.substitution.get(i);
			if(term instanceof Variable) {
				Variable variableReference = (Variable) term;
				this.substitution.set(i, DNFAtom.unifyVariables(variables, variableReference));
			}
		}
	}
	@Override
	public void collectAllVariables(Set<Variable> variables) {
		DNFAtom.addToCollection(variables, substitution);
	}
}
