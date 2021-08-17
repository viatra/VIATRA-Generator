package org.eclipse.viatra.solver.data.query.view;

import java.util.Objects;

import org.eclipse.viatra.query.runtime.matchers.context.common.BaseInputKeyWrapper;
import org.eclipse.viatra.solver.data.map.CursorAsIterator;
import org.eclipse.viatra.solver.data.model.Model;
import org.eclipse.viatra.solver.data.model.Tuple;
import org.eclipse.viatra.solver.data.model.representation.Relation;

/**
 * Represents a view of a {@link Relation} that can be queried.
 * 
 * @author Oszkar Semerath
 *
 * @param <D>
 */
public abstract class RelationView<D> extends BaseInputKeyWrapper<RelationView<D>> {
	protected final Relation<D> representation;

	protected RelationView(Relation<D> representation) {
		super(null);
		this.wrappedKey = this;
		this.representation = representation;
	}

	@Override
	public String getPrettyPrintableName() {
		return representation.getName();
	}

	@Override
	public String getStringID() {
		return representation.getName() + this.getClass().getName();
	}

	public Relation<D> getRepresentation() {
		return representation;
	}

	@Override
	public boolean isEnumerable() {
		return true;
	}

	protected abstract boolean filter(Tuple key, D value);

	protected abstract Object[] forwardMap(Tuple key, D value);

	public abstract boolean get(Model model, Object[] tuple);

	public Object[] transform(Tuple tuple, D value) {
		if (filter(tuple, value)) {
			return forwardMap(tuple, value);
		} else
			return null;
	}

	public Iterable<Object[]> getAll(Model model) {
		return (() -> new CursorAsIterator<>(model.getAll(representation), (k, v) -> forwardMap(k, v),
				(k, v) -> filter(k, v)));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Objects.hash(representation);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (!(obj instanceof RelationView))
			return false;
		@SuppressWarnings("unchecked")
		RelationView<D> other = ((RelationView<D>) obj);
		return Objects.equals(representation, other.representation);
	}

}
