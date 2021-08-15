package org.eclipse.viatra.solver.data.query.internal;

import static org.eclipse.viatra.solver.data.util.CollectionsUtil.filter;
import static org.eclipse.viatra.solver.data.util.CollectionsUtil.map;

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.Optional;
import java.util.concurrent.Callable;

import org.eclipse.viatra.query.runtime.base.core.NavigationHelperImpl;
import org.eclipse.viatra.query.runtime.matchers.context.IInputKey;
import org.eclipse.viatra.query.runtime.matchers.context.IQueryMetaContext;
import org.eclipse.viatra.query.runtime.matchers.context.IQueryRuntimeContext;
import org.eclipse.viatra.query.runtime.matchers.context.IQueryRuntimeContextListener;
import org.eclipse.viatra.query.runtime.matchers.context.IndexingService;
import org.eclipse.viatra.query.runtime.matchers.tuple.ITuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuple;
import org.eclipse.viatra.query.runtime.matchers.tuple.TupleMask;
import org.eclipse.viatra.query.runtime.matchers.tuple.Tuples;
import org.eclipse.viatra.query.runtime.matchers.util.Accuracy;

public class RelationalRuntimeContext implements IQueryRuntimeContext {
	private final RelationalQueryMetaContext metaContext = new RelationalQueryMetaContext();
	private final RelationUpdateListener relationUpdateListener;
	
	public RelationalRuntimeContext(RelationUpdateListener relationUpdateListener) {
		this.relationUpdateListener = relationUpdateListener;
	}
	
	@Override
	public IQueryMetaContext getMetaContext() {
		return metaContext;
	}

	// 
	/**
	 * TODO: check {@link NavigationHelperImpl#coalesceTraversals(Callable)}
	 */
	@Override
	public <V> V coalesceTraversals(Callable<V> callable) throws InvocationTargetException {
        try {
            return callable.call();
        } catch (Exception e) {
            throw new InvocationTargetException(e);
        }
	}

	@Override
	public boolean isCoalescing() {
		return true;
	}

	@Override
	public boolean isIndexed(IInputKey key, IndexingService service) {
		if(key instanceof RelationViewKey<?>) {
			RelationViewKey<?> relationalKey = (RelationViewKey<?>) key;
			return this.relationUpdateListener.containsRelationalView(relationalKey);
		} else {
			return false;
		}
	}

	@Override
	public void ensureIndexed(IInputKey key, IndexingService service) {
		if(!isIndexed(key, service)) {
			throw new IllegalStateException("Engine tries to index a new key " +key);
		}
	}
	
	RelationViewKey<?> checkKey(IInputKey key) {
		if(key instanceof RelationViewKey) {
			RelationViewKey<?> relationViewKey = (RelationViewKey<?>) key;
			if(relationUpdateListener.containsRelationalView(relationViewKey)) {
				return relationViewKey;
			} else {
				throw new IllegalStateException("Query is asking for non-indexed key");
			}
		} else {
			throw new IllegalStateException("Query is asking for non-relational key");
		}
	}
	
	@Override
	public int countTuples(IInputKey key, TupleMask seedMask, ITuple seed) {
		RelationViewKey<?> relationalViewKey = checkKey(key);
		Iterable<Object[]> allObjects = relationalViewKey.getWrappedKey().getAll();
		Iterable<Object[]> filteredBySeed = filter(allObjects,objectArray -> isMatching(objectArray,seedMask,seed));
		Iterator<Object[]> iterator = filteredBySeed.iterator();
		int result = 0;
		while(iterator.hasNext()) {
			iterator.next();
			result++;
		}
		return result;
	}

	@Override
	public Optional<Long> estimateCardinality(IInputKey key, TupleMask groupMask, Accuracy requiredAccuracy) {
		return Optional.empty();
	}

	@Override
	public Iterable<Tuple> enumerateTuples(IInputKey key, TupleMask seedMask, ITuple seed) {
		RelationViewKey<?> relationalViewKey = checkKey(key);
		Iterable<Object[]> allObjects = relationalViewKey.getWrappedKey().getAll();
		Iterable<Object[]> filteredBySeed = filter(allObjects,objectArray -> isMatching(objectArray,seedMask,seed));
		return map(filteredBySeed,Tuples::flatTupleOf);
	}
	
	private boolean isMatching(Object[] tuple, TupleMask seedMask, ITuple seed) {
		for(int i=0; i<seedMask.indices.length; i++) {
			final Object seedElement = seed.get(i);
			final Object tupleElement = tuple[seedMask.indices[i]];
			if(!tupleElement.equals(seedElement)) {
				return false;
			}
		}
		return true;
	}
//	private Object[] toObjectMask(RelationViewKey<?> relationalViewKey, TupleMask seedMask, ITuple seed) {
//		final int arity = relationalViewKey.getArity();
//		Object[] result = new Object[arity];
//		for(int i = 0; i<seedMask.indices.length; i++) {
//			result[seedMask.indices[i]] = seed.get(i);
//		}
//		return result;
//	}

	@Override
	public Iterable<? extends Object> enumerateValues(IInputKey key, TupleMask seedMask, ITuple seed) {
		return enumerateTuples(key, seedMask, seed);
	}

	@Override
	public boolean containsTuple(IInputKey key, ITuple seed) {
		RelationViewKey<?> relationalViewKey = checkKey(key);
		return relationalViewKey.getWrappedKey().get(seed.getElements());
	}

	@Override
	public void addUpdateListener(IInputKey key, Tuple seed, IQueryRuntimeContextListener listener) {
		RelationViewKey<?> relationalKey = checkKey(key);
		this.relationUpdateListener.addListener(relationalKey, seed, listener);
		
	}

	@Override
	public void removeUpdateListener(IInputKey key, Tuple seed, IQueryRuntimeContextListener listener) {
		RelationViewKey<?> relationalKey = checkKey(key);
		this.relationUpdateListener.removeListener(relationalKey, seed, listener);
	}

	@Override
	public Object wrapElement(Object externalElement) {
		return externalElement;
	}

	@Override
	public Object unwrapElement(Object internalElement) {
		return internalElement;
	}

	@Override
	public Tuple wrapTuple(Tuple externalElements) {
		return externalElements;
	}

	@Override
	public Tuple unwrapTuple(Tuple internalElements) {
		return internalElements;
	}

	@Override
	public void ensureWildcardIndexing(IndexingService service) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void executeAfterTraversal(Runnable runnable) throws InvocationTargetException {
		runnable.run();
	}
}
