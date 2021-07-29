package org.eclipse.viatra.solver.data.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.viatra.solver.data.map.internal.ImmutableNode;
import org.eclipse.viatra.solver.data.map.internal.MapDiffCursor;
import org.eclipse.viatra.solver.data.map.internal.Node;
import org.eclipse.viatra.solver.data.map.internal.VersionedMapImpl;

public class VersionedMapStoreImpl<KEY,VALUE> implements VersionedMapStore<KEY, VALUE> {
	// Configuration
	final private boolean immutableWhenCommiting;
	
	// Static data
	protected final ContinousHashProvider<? super KEY> hashProvider;
	protected final VALUE defaultValue;
	
	// Dynamic data
	final protected Map<Long, ImmutableNode<KEY,VALUE>> states;
	final protected Map<Node<KEY,VALUE>, ImmutableNode<KEY,VALUE>> nodeCache;
	protected long nextID;
	
	public VersionedMapStoreImpl(
		ContinousHashProvider<? super KEY> hashProvider,
		VALUE defaultValue,
		VersionedMapStoreConfiguration config)
	{
		this.immutableWhenCommiting = config.immutableWhenCommiting;
		
		this.hashProvider = hashProvider;
		this.defaultValue = defaultValue;
		
		states = new HashMap<>();
		nextID = 0;
		if(config.sharedNodeCacheInStore) {
			nodeCache = new HashMap<>();
		} else {
			nodeCache = null;
		}
	}
	private VersionedMapStoreImpl(
		ContinousHashProvider<? super KEY> hashProvider,
		VALUE defaultValue,
		Map<Node<KEY,VALUE>, ImmutableNode<KEY,VALUE>> nodeCache,
		VersionedMapStoreConfiguration config)
	{
		this.immutableWhenCommiting = config.immutableWhenCommiting;
		
		this.hashProvider = hashProvider;
		this.defaultValue = defaultValue;
		
		states = new HashMap<>();
		nextID = 0;
		this.nodeCache = nodeCache;
	}
	
	public VersionedMapStoreImpl(ContinousHashProvider<KEY> hashProvider, VALUE defaultValue) {
		this(hashProvider,defaultValue,new VersionedMapStoreConfiguration());
	}
	
	public static <MAP,KEY,VALUE> List<VersionedMapStore<KEY,VALUE>> createSharedVersionedMapStores(
		int amount,
		ContinousHashProvider<? super KEY> hashProvider,
		VALUE defaultValue,
		VersionedMapStoreConfiguration config)
	{
		List<VersionedMapStore<KEY,VALUE>> result = new ArrayList<>(amount);
		if(config.sharedNodeCacheInStoreGroups) {
			Map<Node<KEY,VALUE>, ImmutableNode<KEY,VALUE>> nodeCache;
			if(config.sharedNodeCacheInStore) {
				nodeCache = new HashMap<>();
			} else {
				nodeCache = null;
			}
			for (int i = 0; i < amount; i++) {
				result.add(new VersionedMapStoreImpl<KEY, VALUE>(hashProvider, defaultValue, nodeCache, config));
			}
		} else {
			for (int i = 0; i < amount; i++) {
				result.add(new VersionedMapStoreImpl<KEY, VALUE>(hashProvider, defaultValue, config));
			}
		}
		return result;
	}
	public static <MAP,KEY,VALUE> List<VersionedMapStore<KEY,VALUE>> createSharedVersionedMapStores(
		int amount,
		ContinousHashProvider<? super KEY> hashProvider,
		VALUE defaultValue)
	{
		return createSharedVersionedMapStores(amount,hashProvider,defaultValue,new VersionedMapStoreConfiguration());
	}
	
	synchronized Set<Long> getStates() {
		return states.keySet();
	}
	
	@Override
	public VersionedMap<KEY,VALUE> createMap() {
		return new VersionedMapImpl<KEY,VALUE>(this,hashProvider,defaultValue);
	}
	@Override
	public VersionedMap<KEY,VALUE> createMap(long state) {
		ImmutableNode<KEY, VALUE> data = revert(state);
		return new VersionedMapImpl<KEY,VALUE>(this,hashProvider,defaultValue,data); 
	}
	
	synchronized public ImmutableNode<KEY,VALUE> revert(long state) {
		if(states.containsKey(state)) {
			return states.get(state);
		} else {
			ArrayList<Long> existingKeys = new ArrayList<Long>(states.keySet());
			Collections.sort(existingKeys);
			throw new IllegalArgumentException(
				"Store does not contain state "+state+"! Avaliable states: "+existingKeys.toArray().toString());
		}
	}
	synchronized public long commit(Node<KEY,VALUE> data, VersionedMapImpl<KEY, VALUE> mapToUpdateRoot) {
		ImmutableNode<KEY,VALUE> immutable;
		if(data != null) {
			if(this.nodeCache != null) {
				immutable = data.toImmutable(this.nodeCache);
			} else {
				immutable = data.toImmutable();
			}
		} else {
			immutable = null;
		}
		
		
		if(nextID == Long.MAX_VALUE) throw new IllegalStateException(
			"Map store run out of Id-s");
		long id = nextID++;
		this.states.put(id, immutable);
		if(this.immutableWhenCommiting) {
			mapToUpdateRoot.setRoot(immutable);
		}
		return id;
	}
	
//	public Map<Node<KEY,VALUE>, ImmutableNode<KEY,VALUE>> getStore() {
//		return this.nodeCache;
//	}
//	public long addState(ImmutableNode<KEY,VALUE> data) {
//		
//		states.put(id,data);
//		return id;
//	}

	@Override
	public DiffCursor<KEY, VALUE> getDiffCursor(long fromState, long toState) {
		VersionedMap<KEY, VALUE> map1 = createMap(fromState);
		VersionedMap<KEY, VALUE> map2 = createMap(toState);
		Cursor<KEY, VALUE> cursor1 = map1.getCursor();
		Cursor<KEY, VALUE> cursor2 = map2.getCursor();
		return new MapDiffCursor<KEY, VALUE>(this.hashProvider,this.defaultValue,cursor1,cursor2);
	}
}
