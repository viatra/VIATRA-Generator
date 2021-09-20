package org.eclipse.viatra.solver.data.query.building;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class PredicateAtom implements DNFAtom{
	private DNFPredicate referred;
	private List<Variable> substitution;
	private boolean positive;
	private boolean transitive;
	
	public PredicateAtom(boolean positive, boolean transitive, DNFPredicate referred, List<Variable> substitution) {
		this.positive = positive;
		this.referred = referred;
		this.substitution = substitution;
		this.transitive = transitive;
	}
	public DNFPredicate getReferred() {
		return referred;
	}
	public void setReferred(DNFPredicate referred) {
		this.referred = referred;
	}
	public List<Variable> getSubstitution() {
		return substitution;
	}
	public void setSubstitution(List<Variable> substitution) {
		this.substitution = substitution;
	}
	public boolean isPositive() {
		return positive;
	}
	public void setPositive(boolean positive) {
		this.positive = positive;
	}
	public boolean isTransitive() {
		return transitive;
	}
	public void setTransitive(boolean transitive) {
		this.transitive = transitive;
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
