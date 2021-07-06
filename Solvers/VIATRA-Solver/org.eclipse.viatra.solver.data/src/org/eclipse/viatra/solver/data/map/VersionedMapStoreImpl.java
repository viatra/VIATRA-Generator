package org.eclipse.viatra.solver.data.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.viatra.solver.data.map.internal.ImmutableNode;
import org.eclipse.viatra.solver.data.map.internal.VersionedMapImpl;

public class VersionedMapStoreImpl<KEY,VALUE> implements VersionedMapStore<KEY, VALUE> {
	protected final ContinousHashProvider<? super KEY> hashProvider;
	protected final VALUE defaultValue;
	protected Map<Long, ImmutableNode<KEY,VALUE>> states;
	protected long nextID;
	
	public VersionedMapStoreImpl(ContinousHashProvider<? super KEY> hashProvider, VALUE defaultValue) {
		this.hashProvider = hashProvider;
		this.defaultValue = defaultValue;
		
		states = new HashMap<>();
		nextID = 0;
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
	private ImmutableNode<KEY,VALUE> getStateData(long state) {
		return states.get(state);
	}

	public long addState(ImmutableNode<KEY,VALUE> data) {
		if(data != null) {
			ImmutableNode<KEY, VALUE> immutable = data.toImmutable();
			long id = nextID++;
			states.put(id,immutable);
			return id;
		} else {
			throw new NullPointerException("data is null!");
		}
		
	}
//	public void removeState(long state) {
//		if(states.containsKey(state)) {
//			this.states.remove(state);
//		}
//	}
}
