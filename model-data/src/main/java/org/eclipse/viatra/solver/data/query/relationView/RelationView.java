package org.eclipse.viatra.solver.data.query.relationView;

import org.eclipse.viatra.solver.data.map.CursorAsIterator;
import org.eclipse.viatra.solver.data.model.Model;
import org.eclipse.viatra.solver.data.model.Tuple;
import org.eclipse.viatra.solver.data.model.representation.RelationRepresentation;

/**
 * Represents a view of a {@link RelationRepresentation} that can be queried.
 * @author Oszkar Semerath
 *
 * @param <D>
 */
public abstract class RelationView<D>{
	protected final Model model;
	protected final RelationRepresentation<D> representation;
	
	protected RelationView(Model model, RelationRepresentation<D> representation) {
		this.model = model;
		this.representation = representation;
	}
	
	public Model getModel() {
		return model;
	}
	public RelationRepresentation<D> getRepresentation() {
		return representation;
	}
	
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
}
