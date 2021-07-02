package org.eclipse.viatra.solver.data.map;

/**
 * A class representing an equivalence relation for a type {@code KEY} with a continuous hash function.
 * @author Oszkar Semerath
 *
 * @param <KEY> Target java type.
 */
public interface ContinousHashProvider<KEY> {
	/**
	 * Provides a hash code for a object {@code key} with a given {@code index}. It has the following contracts:
	 * <ul>
	 * <li>If {@link #equals}{@code (key1,key2)}, then {@code getHash(key1, index) == getHash(key2, index)} for all values of {@code index}.</li>
	 * <li>If {@code getHash(key1,index) == getHash(key2, index)} for all values of {@code index}, then {@link #equals}{@code (key1, key2)}</li>
	 * </ul>
	 * Check {@link #equals} for further details.
	 * @param key The target data object.
	 * @param index The depth of the the hash code. Needs to be non-negative.
	 * @return A hash code.
	 */
	public int getHash(KEY key, int index);
	/**
	 * Compares the equivalnce of two objects {@code key1} and {@code key2}. It has the contracts of a equivalence relation:
	 * <ul>
	 * <li> Reflexive: {@code equals(key,key) == true}.</li>
	 * <li> Symmetric: {@code equals(key1,key2) == equals(key2,key1)}.</li>
	 * <li> Transitive: {@code equals(key1,key2) == true} and {@code equals(key2,key3) == true} then {@code equals(key1,key3) == true}.</li>
	 * </ul>
	 * @param key1 First data object.
	 * @param key2 Second data object.
	 * @return whether {@code key1} and {@code key2} are equivalent with respect to an equivalence relation represented by the given .
	 */
	public boolean equals(KEY key1, KEY key2);
}
