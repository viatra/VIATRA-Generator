package org.eclipse.viatra.solver.data.map.internal;

import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;

/**
 * Preorder iterator for map {@link #Node}s. 
 * 
 * @author Oszkar Semerath
 *
 * @param <KEY>
 * @param <VALUE>
 */
public class MapEntryIterator<KEY,VALUE> extends MapCursor<KEY, VALUE> implements Iterator<Map.Entry<KEY,VALUE>>{

	
	public MapEntryIterator(Node<KEY, VALUE> root) {
		super(root);

	}
	
	@Override
	public boolean hasNext() {
		return !this.isTerminated();
	}

	@Override
	public Entry<KEY, VALUE> next() {
		if(this.hasNext()) {
			Map.Entry<KEY, VALUE> result = new AbstractMap.SimpleEntry<KEY, VALUE>(this.key, this.value);
			this.move();
			return result;
		} else {
			throw new NoSuchElementException();
		}
	}
}
