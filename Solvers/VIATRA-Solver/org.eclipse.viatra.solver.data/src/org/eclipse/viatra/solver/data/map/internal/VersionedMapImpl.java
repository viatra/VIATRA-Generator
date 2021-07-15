package org.eclipse.viatra.solver.data.map.internal;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

import org.eclipse.viatra.solver.data.map.ContinousHashProvider;
import org.eclipse.viatra.solver.data.map.Cursor;
import org.eclipse.viatra.solver.data.map.VersionedMap;
import org.eclipse.viatra.solver.data.map.VersionedMapStoreImpl;

/**
 * Not threadSafe in itself
 * @author Oszkar Semerath
 *
 * @param <KEY>
 * @param <VALUE>
 */
public class VersionedMapImpl<KEY,VALUE> implements VersionedMap<KEY,VALUE>{
	protected final VersionedMapStoreImpl<KEY,VALUE> store;
	
	protected final ContinousHashProvider<? super KEY> hashProvider;
	protected final VALUE defaultValue;
	protected Node<KEY,VALUE> root;
	
	public VersionedMapImpl(
			VersionedMapStoreImpl<KEY,VALUE> store,
			ContinousHashProvider<? super KEY> hashProvider,
			VALUE defaultValue)
	{
		this.store = store;
		this.hashProvider = hashProvider;
		this.defaultValue = defaultValue;
		this.root = null;
	}
	public VersionedMapImpl(
			VersionedMapStoreImpl<KEY,VALUE> store,
			ContinousHashProvider<? super KEY> hashProvider,
			VALUE defaultValue, Node<KEY,VALUE> data)
	{
		this.store = store;
		this.hashProvider = hashProvider;
		this.defaultValue = defaultValue;
		this.root = data;
	}
		
	public VALUE getDefaultValue() {
		return defaultValue;
	}
	public ContinousHashProvider<? super KEY> getHashProvider() {
		return hashProvider;
	}
	@Override
	public void put(KEY key, VALUE value) {
		if(root!=null) {
			root = root.putValue(key, value, hashProvider, defaultValue, hashProvider.getHash(key, 0), 0);
		} else {
			root = MutableNode.initialize(key, value, hashProvider, defaultValue);
		}
	}
	@Override
	public VALUE get(KEY key) {
		if(root!=null) {
			return root.getValue(key, hashProvider, defaultValue, hashProvider.getHash(key, 0), 0);
		} else {
			return defaultValue;
		}
	}
	@Override
	public long getSize() {
		if(root == null) {
			return 0;
		} else {
			return root.getSize();
		}
	}
	@Override
	public
	Iterator<Map.Entry<KEY,VALUE>> getIterator() {
		MapEntryIterator<KEY,VALUE> iterator = new MapEntryIterator<>(this.root,this);
		return iterator;
	}
	@Override
	public Cursor<KEY, VALUE> getCursor() {
		MapEntryIterator<KEY,VALUE> cursor = new MapEntryIterator<>(this.root,this);
		return cursor;
	}

	@Override
	public long commit() {
		ImmutableNode<KEY,VALUE> immutable;
		if(this.root != null) {
			Map<Node<KEY, VALUE>, ImmutableNode<KEY, VALUE>> cache = this.store.getStore();
			if(cache != null) {
				immutable = root.toImmutable(cache);
			} else {
				immutable = root.toImmutable();
			}
			
		} else {
			immutable = null;
		}
		long result = this.store.addState(immutable);
		return result;
	}

	@Override
	public void restore(long state) {
		root = this.store.getStateData(state);
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((root == null) ? 0 : root.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VersionedMapImpl<?,?> other = (VersionedMapImpl<?,?>) obj;
		if (root == null) {
			if (other.root != null)
				return false;
		} else if (!root.equals(other.root))
			return false;
		return true;
	}
	public void prettyPrint() {
		StringBuilder s = new StringBuilder();
		if(this.root != null) {
			this.root.prettyPrint(s, 0, -1);
			System.out.println(s.toString());
		} else {
			System.out.println("empty tree");
		}
	}
}
