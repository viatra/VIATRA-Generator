package org.eclipse.viatra.solver.data.map;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class CursorAsIterator<K,V,D> implements Iterator<D> {
	private final Cursor<K, V> internal;
	private final BiFunction<K, V, D> entryTransformation;
	private final BiPredicate<K,V> filtering;
	
	D lastValidElement;
	
	public CursorAsIterator(Cursor<K, V> internal, BiFunction<K, V, D> entryTransformation, BiPredicate<K,V> filtering) {
		this.internal = internal;
		this.entryTransformation = entryTransformation;
		this.filtering = filtering;
		
		moveToNext();
	}
	public CursorAsIterator(Cursor<K, V> internal, BiFunction<K, V, D> entryTransformation) {
		this.internal = internal;
		this.entryTransformation = entryTransformation;
		this.filtering = ((k,v)->true);
		
		moveToNext();
	}
	
	private void moveToNext() {
		internal.move();
		while(!internal.isTerminated() && !filtering.test(internal.getKey(), internal.getValue())) {
			internal.move();
		}
		if(!internal.isTerminated()) {
			lastValidElement = entryTransformation.apply(internal.getKey(), internal.getValue());
		}
	}
	
	
	@Override
	public boolean hasNext() {
		return !internal.isTerminated();
	}
	@Override
	public D next() {
		if(hasNext()) {
			D last = lastValidElement;
			moveToNext();
			return last;
		} else {
			throw new NoSuchElementException();
		}

	}
	
}
