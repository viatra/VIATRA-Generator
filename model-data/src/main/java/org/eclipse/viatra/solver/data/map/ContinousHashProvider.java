package org.eclipse.viatra.solver.data.map;

import org.eclipse.viatra.solver.data.map.internal.Node;

/**
 * A class representing an equivalence relation for a type {@code KEY} with a
 * continuous hash function.
 * 
 * @author Oszkar Semerath
 *
 * @param <K> Target java type.
 */
public interface ContinousHashProvider<K> {
	public static final int EFFECTIVE_BITS = Node.effectiveBits;
	public static final int EFFECTIVE_BIT_MASK = (1 << (EFFECTIVE_BITS)) - 1;

	/**
	 * Maximal practical depth for differentiating keys. If two keys have the same
	 * hash code until that depth, the algorithm can stop.
	 */
	public static final int MAX_PRACTICAL_DEPTH = 500;

	/**
	 * Provides a hash code for a object {@code key} with a given {@code index}. It
	 * has the following contracts:
	 * <ul>
	 * <li>If {@link #equals}{@code (key1,key2)}, then
	 * {@code getHash(key1, index) == getHash(key2, index)} for all values of
	 * {@code index}.</li>
	 * <li>If {@code getHash(key1,index) == getHash(key2, index)} for all values of
	 * {@code index}, then {@link #equals}{@code (key1, key2)}</li>
	 * <li>In current implementation, we use only the least significant
	 * {@link #EFFECTIVE_BITS}
	 * </ul>
	 * Check {@link #equals} for further details.
	 * 
	 * @param key   The target data object.
	 * @param index The depth of the the hash code. Needs to be non-negative.
	 * @return A hash code.
	 */
	public int getHash(K key, int index);

	public default int getEffectiveHash(K key, int index) {
		return getHash(key, index) & EFFECTIVE_BIT_MASK;
	}

	public default int compare(K key1, K key2) {
		if (key1.equals(key2)) {
			return 0;
		} else {
			for (var i = 0; i < ContinousHashProvider.MAX_PRACTICAL_DEPTH; i++) {
				int hash1 = getEffectiveHash(key1, i);
				int hash2 = getEffectiveHash(key2, i);
				var result = Integer.compare(hash1, hash2);
				if (result != 0) {
					return result;
				}
			}
			throw new IllegalArgumentException("Two different keys (" + key1 + " and " + key2
					+ ") have the same hashcode over the practical depth limitation ("
					+ ContinousHashProvider.MAX_PRACTICAL_DEPTH + ")!");
		}
	}
}
