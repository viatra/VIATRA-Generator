package org.eclipse.viatra.solver.data.map.internal;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.viatra.solver.data.map.ContinousHashProvider;
import org.eclipse.viatra.solver.data.map.Cursor;
import org.eclipse.viatra.solver.data.map.VersionedMap;
import org.eclipse.viatra.solver.data.map.VersionedMapStore;
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
	//TODO: protected final iterators
	
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
	public int getSize() {
		if(root == null) {
			return 0;
		} else {
			return root.getSize();
		}
	}
	@Override
	public
	Iterator<Map.Entry<KEY,VALUE>> getIterator() {
		return new MapEntryIterator<>(this.root);
	}
	@Override
	public Cursor<KEY, VALUE> getCursor() {
		return new MapEntryIterator<>(this.root);
	}

	@Override
	public long commit() {
		ImmutableNode<KEY,VALUE> immutable;
		if(this.root != null) {
			immutable = root.toImmutable();
		} else {
			immutable = null;
		}
		long result = this.store.addState(immutable);
		return result;
	}

	@Override
	public void restore(long state) {
		// TODO Auto-generated method stub
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
