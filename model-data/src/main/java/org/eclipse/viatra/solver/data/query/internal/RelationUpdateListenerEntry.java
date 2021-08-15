package org.eclipse.viatra.solver.data.query.internal;

import java.util.Arrays;
import java.util.Objects;

import org.eclipse.viatra.query.runtime.matchers.context.IQueryRuntimeContextListener;
import org.eclipse.viatra.query.runtime.matchers.tuple.ITuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.solver.data.model.Tuple;

public class RelationUpdateListenerEntry<D> {
	final RelationViewKey<D> key;
	final ITuple filter;
	final IQueryRuntimeContextListener listener;
	
	public RelationUpdateListenerEntry(RelationViewKey<D> key, ITuple filter, IQueryRuntimeContextListener listener) {
		super();
		this.key = key;
		this.filter = filter;
		this.listener = listener;
	}
	
	public void processChange(Tuple tuple, D oldValue, D newValue) {
		Object[] oldTuple = isMatching(key.getWrappedKey().transform(tuple, oldValue), filter);
		Object[] newTuple = isMatching(key.getWrappedKey().transform(tuple, newValue), filter);
		
		if(!Arrays.equals(oldTuple, newTuple)) {
			if(oldTuple != null) {
				listener.update(key, Tuples.flatTupleOf(oldTuple), false);
			}
			if(newTuple != null) {
				listener.update(key, Tuples.flatTupleOf(newTuple), true);
			}
		}
	}
	
	private Object[] isMatching(Object[] tuple, ITuple filter) {
		for(int i = 0; i<filter.getSize(); i++) {
			final Object filterObject = filter.get(i);
			if(filterObject != null && !filterObject.equals(tuple[i])) {
				return null;
			}
		}
		return tuple;
	}

	@Override
	public int hashCode() {
		return Objects.hash(filter, key, listener);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof RelationUpdateListenerEntry))
			return false;
		RelationUpdateListenerEntry<?> other = (RelationUpdateListenerEntry<?>) obj;
		return Objects.equals(filter, other.filter) && Objects.equals(key, other.key)
				&& Objects.equals(listener, other.listener);
	}
}
