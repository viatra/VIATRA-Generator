package org.eclipse.viatra.solver.data.query.view;

import org.eclipse.viatra.solver.data.map.CursorAsIterator;
import org.eclipse.viatra.solver.data.model.Model;
import org.eclipse.viatra.solver.data.model.Tuple;
import org.eclipse.viatra.solver.data.model.representation.Relation;
import org.eclipse.viatra.solver.data.query.internal.RelationViewKey;

/**
 * Represents a view of a {@link Relation} that can be queried.
 * @author Oszkar Semerath
 *
 * @param <D>
 */
public abstract class RelationView<D>{
	protected final Model model;
	protected final Relation<D> representation;
	RelationViewKey<D> key = new RelationViewKey<>(this, getArity());
	
	protected RelationView(Model model, Relation<D> representation) {
		this.model = model;
		this.representation = representation;
	}
	
	public Model getModel() {
		return model;
	}
	public Relation<D> getRepresentation() {
		return representation;
	}
	
	public abstract int getArity();
	protected abstract boolean filter(Tuple key, D value);
	protected abstract Object[] forwardMap(Tuple key, D value);
	public abstract boolean get(Object[] tuple);

	public Object[] transform(Tuple tuple, D value) {
		if(filter(tuple, value)) {
			return forwardMap(tuple, value);
		} else return null;
	}

	public Iterable<Object[]> getAll() {
		return (()->new CursorAsIterator<>(model.getAll(representation), (k,v)->forwardMap(k,v), (k,v)->filter(k,v)));
	}
	
	public RelationViewKey<D> getKey() {
		return key;
	}
}
