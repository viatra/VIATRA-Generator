package org.eclipse.viatra.solver.data.map;

import org.eclipse.viatra.solver.data.map.internal.Node;

/**
 * A class representing an equivalence relation for a type {@code KEY} with a continuous hash function.
 * @author Oszkar Semerath
 *
 * @param <KEY> Target java type.
 */
public interface ContinousHashProvider<KEY> {
	public static final int effectiveBits = Node.effectiveBits;
	public static final int effectiveBitMask = (1<<(effectiveBits))-1;
	/**
	 * Maximal practical depth for differentiating keys. If two keys have the same hash code until that depth, the algorithm can stop.
	 */
	public static final int maxPracticalDepth = 500;
	/**
	 * Provides a hash code for a object {@code key} with a given {@code index}. It has the following contracts:
	 * <ul>
	 * <li>If {@link #equals}{@code (key1,key2)}, then {@code getHash(key1, index) == getHash(key2, index)} for all values of {@code index}.</li>
	 * <li>If {@code getHash(key1,index) == getHash(key2, index)} for all values of {@code index}, then {@link #equals}{@code (key1, key2)}</li>
	 * <li>In current implementation, we use only the least significant {@link #effectiveBits}
	 * </ul>
	 * Check {@link #equals} for further details.
	 * @param key The target data object.
	 * @param index The depth of the the hash code. Needs to be non-negative.
	 * @return A hash code.
	 */
	public int getHash(KEY key, int index);
//	/**
//	 * Compares the equivalence of two objects {@code key1} and {@code key2}. It has the contracts of a equivalence relation:
//	 * <ul>
//	 * <li> Reflexive: {@code equals(key,key) == true}.</li>
//	 * <li> Symmetric: {@code equals(key1,key2) == equals(key2,key1)}.</li>
//	 * <li> Transitive: {@code equals(key1,key2) == true} and {@code equals(key2,key3) == true} then {@code equals(key1,key3) == true}.</li>
//	 * </ul>
//	 * TODO: clarify relation to Object.equals() on keys
//	 * @param key1 First data object.
//	 * @param key2 Second data object.
//	 * @return whether {@code key1} and {@code key2} are equivalent with respect to an equivalence relation represented by the given .
//	 */
//	public boolean equals(KEY key1, KEY key2);

	public default int getEffectiveHash(KEY key, int index) {
		return getHash(key, index) & effectiveBitMask;
	}
	public default int compare(KEY key1, KEY key2) {
		if(key1.equals(key2)) {
			return 0;
		} else {
			for(int i=0; i<ContinousHashProvider.maxPracticalDepth; i++) {
				int hash1 = getEffectiveHash(key1, i);
				int hash2 = getEffectiveHash(key2, i);
				int result = Integer.compare(hash1, hash2);
				if(result != 0) {
					return result;
				}
			}
			throw new IllegalArgumentException(
				"Two different keys ("+key1+" and "+key2+") have the same hashcode over the practical depth limitation ("+ContinousHashProvider.maxPracticalDepth+")!");
		}
	}
}
