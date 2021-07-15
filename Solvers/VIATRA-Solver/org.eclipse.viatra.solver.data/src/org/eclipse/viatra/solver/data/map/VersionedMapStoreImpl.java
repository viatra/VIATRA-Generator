package org.eclipse.viatra.solver.data.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.viatra.solver.data.map.internal.ImmutableNode;
import org.eclipse.viatra.solver.data.map.internal.Node;
import org.eclipse.viatra.solver.data.map.internal.VersionedMapImpl;

public class VersionedMapStoreImpl<KEY,VALUE> implements VersionedMapStore<KEY, VALUE> {
	protected final ContinousHashProvider<? super KEY> hashProvider;
	protected final VALUE defaultValue;
	
	final protected Map<Long, ImmutableNode<KEY,VALUE>> states;
	final protected Map<Node<KEY,VALUE>, ImmutableNode<KEY,VALUE>> nodeCache;
	protected long nextID;
	
	public VersionedMapStoreImpl(ContinousHashProvider<? super KEY> hashProvider, VALUE defaultValue) {
		this.hashProvider = hashProvider;
		this.defaultValue = defaultValue;
		
		states = new HashMap<>();
		nextID = 0;
		nodeCache = new HashMap<>();
	}
	
	Set<Long> getStates() {
		return states.keySet();
	}
	
	@Override
	public VersionedMap<KEY,VALUE> createMap() {
		return new VersionedMapImpl<KEY,VALUE>(this,hashProvider,defaultValue);
	}
	@Override
	public VersionedMap<KEY,VALUE> createMap(long state) throws IllegalAccessException {
		ImmutableNode<KEY, VALUE> data = getStateData(state);
		if(data != null) {
			return new VersionedMapImpl<KEY,VALUE>(this,hashProvider,defaultValue,data); 
		} else {
			throw new IllegalAccessException("Store does not contain state " + state + "!");
		}
	}

	private long getNextID() {
		if(nextID == Long.MAX_VALUE) throw new IllegalStateException("Map store run out of Id-s");
		return nextID++;
	}
	
	public ImmutableNode<KEY,VALUE> getStateData(long state) {
		return states.get(state);
	}
	public Map<Node<KEY,VALUE>, ImmutableNode<KEY,VALUE>> getStore() {
		return this.nodeCache;
	}
	public long addState(ImmutableNode<KEY,VALUE> data) {
		long id = getNextID();
		states.put(id,data);
		return id;
	}
}
