package org.eclipse.viatra.solver.data.query.building;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import org.eclipse.viatra.solver.data.query.view.RelationView;

public class PredicateBuilder_string {
	private PredicateBuilder_string() {}
	
	public static PredicateBuild1 predicate(String name) {
		return new PredicateBuild1(name);
	}
	public static class PredicateBuild1 {
		private String name;
		public PredicateBuild1(String name) {
			this.name = name;
		}
		public PredicateBuild2 parameters(String... parameters) {
			return new PredicateBuild2(name, parameters);
		}
	}
	public static class PredicateBuild2 {
		private String name;
		private String[] parameters;
		public PredicateBuild2(String name, String[] parameters) {
			this.name = name;
			this.parameters = parameters;
		}
		
		public PredicateBuild3 clause(DNFAtom...constraints) {
			return new PredicateBuild3(name,parameters,List.<DNFAtom[]>of(constraints));
		}
	}
	public static class PredicateBuild3 {
		String name;
		String[] parameters;
		List<DNFAtom[]> clauses;
		public PredicateBuild3(String name, String[] parameters, List<DNFAtom[]> clauses) {
			super();
			this.name = name;
			this.parameters = parameters;
			this.clauses = clauses;
		}
		
		public PredicateBuild3 clause(DNFAtom...constraints) {
			List<DNFAtom[]> newClauses = new ArrayList<>();
			newClauses.addAll(clauses);
			newClauses.add(constraints);
			return new PredicateBuild3(name, parameters, newClauses);
		}
		public DNFPredicate build() {
			List<Variable> newParameters = new ArrayList<>(this.parameters.length);
			for(int i = 0; i<this.parameters.length; i++) {
				newParameters.add(new Variable(parameters[i]));
			}
			
			List<DNFAnd> newClauses = new ArrayList<>(this.clauses.size());
			for(DNFAtom[] clause : this.clauses) {
				List<DNFAtom> constraints = new ArrayList<>(clause.length);
				Collections.addAll(constraints, clause);
				newClauses.add(new DNFAnd(new HashSet<>(), constraints));
			}
			
			return new DNFPredicate(name,newParameters,newClauses);
		}
	}
	
	private static Variable stringToVariable(String name) {
		if(name != null) {
			return new Variable(name);
		} else {
			return null;
		}
	}
	private static List<Variable> stringToVariable(String[] names) {
		List<Variable> variables = new ArrayList<>();
		for(int i = 0; i<names.length; i++) {
			variables.add(stringToVariable(names[i]));
		}
		return variables;
	}
	
	public static EquivalenceAtom cEquals(String v1, String v2) {
		return new EquivalenceAtom(true,stringToVariable(v1),stringToVariable(v2));
	}
	public static EquivalenceAtom cNotEquals(String v1, String v2) {
		return new EquivalenceAtom(false,stringToVariable(v1),stringToVariable(v2));
	}
	
	public static RelationAtom cInRelation(RelationView<?> view, String... variables) {
		
		return new RelationAtom(view, stringToVariable(variables));
	}
	
	public static PredicateAtom cInPredicate(DNFPredicate referred, String... variables) {
		return new PredicateAtom(true, false, referred, stringToVariable(variables));
	}
	public static PredicateAtom cInTransitivePredicate(DNFPredicate referred, String... variables) {
		return new PredicateAtom(true, true, referred, stringToVariable(variables));
	}
	public static PredicateAtom cNotInPredicate(DNFPredicate referred, String... variables) {
		return new PredicateAtom(false, false, referred, stringToVariable(variables));
	}
}
