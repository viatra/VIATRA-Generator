package org.eclipse.viatra.solver.data.query.building;

import java.util.Map;
import java.util.Set;

public class EquivalenceAtom implements DNFAtom{
	private boolean positive;
	private Variable left;
	private Variable right;
	public EquivalenceAtom(boolean positive, Variable left, Variable right) {
		this.positive = positive;
		this.left = left;
		this.right = right;
	}
	public boolean isPositive() {
		return positive;
	}
	public void setPositive(boolean positive) {
		this.positive = positive;
	}
	public Variable getLeft() {
		return left;
	}
	public void setLeft(Variable left) {
		this.left = left;
	}
	public Variable getRight() {
		return right;
	}
	public void setRight(Variable right) {
		this.right = right;
	}
	
	@Override
	public void unifyVariables(Map<String, Variable> variables) {
		this.left = DNFAtom.unifyVariables(variables,left);
		this.right = DNFAtom.unifyVariables(variables,right);
	}
	@Override
	public void collectAllVariables(Set<Variable> variables) {
		DNFAtom.addToCollection(variables, left);
		DNFAtom.addToCollection(variables, right);
	}
}
