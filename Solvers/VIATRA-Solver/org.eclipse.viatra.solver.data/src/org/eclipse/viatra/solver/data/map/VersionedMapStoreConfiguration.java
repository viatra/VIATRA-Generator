package org.eclipse.viatra.solver.data.map;

public class VersionedMapStoreConfiguration {
	/**
	 * If true root is replaced with immutable node when committed. Frees up memory
	 * by releasing immutable nodes, but it may decrease performance by recreating
	 * immutable nodes upon changes (some evidence).
	 */
	public boolean immutableWhenCommiting = true;

	/**
	 * If true, all subnodes are cached within a {@link VersionedMapStore}. It
	 * decreases the memory requirements. It may increase performance by discovering
	 * existing immutable copy of a node (some evidence). Additional overhead may
	 * decrease performance (no example found). The option permits the efficient
	 * implementation of version deletion.
	 */
	public boolean sharedNodeCacheInStore = true;

	/**
	 * If true, all subnodes are cached within a group of
	 * {@link VersionedMapStoreImpl#createSharedVersionedMapStores(int, ContinousHashProvider, Object, VersionedMapStoreConfiguration)}.
	 * If {@link VersionedMapStoreConfiguration#sharedNodeCacheInStore} is
	 * <code>false</code>, then it has currently no impact.
	 */
	public boolean sharedNodeCacheInStoreGroups = true;
}
