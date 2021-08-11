package org.eclipse.viatra.solver.data.map.internal;

import java.util.Map;

import org.eclipse.viatra.solver.data.map.ContinousHashProvider;

public abstract class Node<K,V>{
	public static final int BRANCHING_FACTOR_BITS = 5;
	public static final int FACTOR = 1<<BRANCHING_FACTOR_BITS;
	protected static final int NUMBER_OF_FACTORS = Integer.SIZE / BRANCHING_FACTOR_BITS;
	protected static final int FACTOR_MASK = FACTOR-1;
	public static final int EFFECTIVE_BITS = BRANCHING_FACTOR_BITS * NUMBER_OF_FACTORS;
	
	/**
	 * Calculates the index for the continuous hash.
	 * @param depth The depth of the node in the tree.
	 * @return The index of the continuous hash.
	 */
	protected static int hashDepth(int depth) {
		return depth/NUMBER_OF_FACTORS;
	}
	
	/**
	 * Calculates the which segment of a single hash should be used.
	 * @param depth The depth of the node in the tree. 
	 * @return The segment of a hash code.
	 */
	protected static int shiftDepth(int depth) {
		return depth%NUMBER_OF_FACTORS;
	}
	/**
	 * Selects a segments from a complete hash for a given depth.
	 * @param hash A complete hash.
	 * @param shiftDepth The index of the segment.
	 * @return The segment as an integer.
	 */
	protected static int hashFragment(int hash, int shiftDepth) {
		if(shiftDepth<0 || Node.NUMBER_OF_FACTORS<shiftDepth) throw new IllegalArgumentException("Invalid shift depth! valid intervall=[0;5], input="+shiftDepth);
		return (hash >>> shiftDepth*BRANCHING_FACTOR_BITS) & FACTOR_MASK;
	}
	
	/**
	 * Returns the hash code for a given depth. It may calculate new hash code, or reuse a hash code calculated for depth-1.
	 * @param key The key.
	 * @param hash Hash code for depth-1
	 * @param depth The depth.
	 * @return The new hash code.
	 */
	protected int newHash(final ContinousHashProvider<? super K> hashProvider, K key, int hash, int depth) {
		final int hashDepth = hashDepth(depth);
		if(hashDepth>=ContinousHashProvider.MAX_PRACTICAL_DEPTH) {
			throw new IllegalArgumentException("Key "+key+" have the clashing hashcode over the practical depth limitation ("+ContinousHashProvider.MAX_PRACTICAL_DEPTH+")!");
		}
		return depth%NUMBER_OF_FACTORS == 0?
				hashProvider.getHash(key, hashDepth) :
				hash;
	}
	
	
	public abstract V getValue(K key, ContinousHashProvider<? super K> hashProvider, V defaultValue,  int hash, int depth);
	public abstract Node<K,V> putValue(K key, V value, OldValueBox<V> old, ContinousHashProvider<? super K> hashProvider, V defaultValue, int hash, int depth);
	public abstract long getSize();
	
	abstract MutableNode<K, V> toMutable();
	public abstract ImmutableNode<K, V> toImmutable(
			Map<Node<K, V>,ImmutableNode<K, V>> cache);
	protected abstract MutableNode<K, V> isMutable();
	/**
	 * Moves a {@link MapCursor} to its next position.
	 * @param cursor the cursor
	 * @return Whether there was a next value to move on.
	 */
	abstract boolean moveToNext(MapCursor<K,V> cursor);
	
	///////// FOR printing
	public abstract void prettyPrint(StringBuilder builder, int depth, int code);
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		prettyPrint(stringBuilder, 0, -1);
		return stringBuilder.toString();
	}
	public void checkIntegrity(ContinousHashProvider<? super K> hashProvider, V defaultValue, int depth) {}
	
}
