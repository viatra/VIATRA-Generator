package org.eclipse.viatra.solver.data.model.internal;

import java.util.Objects;

import org.eclipse.viatra.solver.data.map.ContinousHashProvider;
import org.eclipse.viatra.solver.data.model.Tuple;
import org.eclipse.viatra.solver.data.model.representation.Relation;

public class SymbolRepresentationEquivalenceClass {
	final ContinousHashProvider<Tuple> hashProvider;
	final Class<?> domainClass;
	final Object defaultValue;
	final int arity;
	public SymbolRepresentationEquivalenceClass(Relation<?> representation) {
		this.hashProvider = representation.getHashProvider();
		this.domainClass = representation.getValueClass();
		this.defaultValue = representation.getDefaultValue();
		this.arity = representation.getSymbol().getArity();
	}
	@Override
	public int hashCode() {
		return Objects.hash(arity, defaultValue, domainClass, hashProvider);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SymbolRepresentationEquivalenceClass other = (SymbolRepresentationEquivalenceClass) obj;
		return arity == other.arity && Objects.equals(defaultValue, other.defaultValue)
				&& Objects.equals(domainClass, other.domainClass) && Objects.equals(hashProvider, other.hashProvider);
	}
}
