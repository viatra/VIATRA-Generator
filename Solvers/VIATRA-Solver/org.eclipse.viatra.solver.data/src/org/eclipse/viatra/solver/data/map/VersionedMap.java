package org.eclipse.viatra.solver.data.map;

import java.util.Iterator;
import java.util.Map;

import org.eclipse.viatra.solver.data.map.internal.MapCursor;
import org.eclipse.viatra.solver.data.map.internal.MapEntryIterator;
import org.eclipse.viatra.solver.data.map.internal.MutableNode;
import org.eclipse.viatra.solver.data.map.internal.Node;

public class VersionedMap<KEY,VALUE> implements Versioned{

	protected final ContinousHashProvider<? super KEY> hashProvider;
	protected final VALUE defaultValue;
	protected Node<KEY,VALUE> root = null;
	
	protected VersionedMap(ContinousHashProvider<? super KEY> hashProvider, VALUE defaultValue) {
		this.hashProvider = hashProvider;
		this.defaultValue = defaultValue;
	}
	
	public VALUE getDefaultValue() {
		return defaultValue;
	}
	public ContinousHashProvider<? super KEY> getHashProvider() {
		return hashProvider;
	}
	
	public void put(KEY key, VALUE value) {
		if(root!=null) {
			root = root.putValue(key, value, hashProvider, defaultValue, hashProvider.getHash(key, 0), 0);
		} else {
			root = MutableNode.initialize(key, value, hashProvider, defaultValue);
		}
	}
	public VALUE get(KEY key) {
		if(root!=null) {
			return root.getValue(key, hashProvider, defaultValue, hashProvider.getHash(key, 0), 0);
		} else {
			return defaultValue;
		}
	}
	public int getSize() {
		if(root == null) {
			return 0;
		} else {
			return root.getSize();
		}
	}
	Iterator<Map.Entry<KEY,VALUE>> getIterator() {
		return new MapEntryIterator<>(this.root);
	}

	@Override
	public long commit() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void restore(long state) {
		// TODO Auto-generated method stub
	}
}
