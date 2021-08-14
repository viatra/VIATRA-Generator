package org.eclipse.viatra.solver.data.map;

import java.util.Iterator;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class MapAsIterable<K,V,D> implements Iterable<D> {
	private final VersionedMap<K, V> internal;
	private final BiFunction<K, V, D> entryTransformation;
	private final BiPredicate<K,V> filtering;
	
	public MapAsIterable(VersionedMap<K, V> internal, BiFunction<K, V, D> entryTransformation, BiPredicate<K,V> filtering) {
		this.internal = internal;
		this.entryTransformation = entryTransformation;
		this.filtering = filtering;
	}
	public MapAsIterable(VersionedMap<K, V> internal, BiFunction<K, V, D> entryTransformation) {
		this.internal = internal;
		this.entryTransformation = entryTransformation;
		this.filtering = ((k,v)->true);
	}
	@Override
	public Iterator<D> iterator() {
		return new CursorAsIterator<>(internal.getAll(), entryTransformation, filtering);
	}
}
