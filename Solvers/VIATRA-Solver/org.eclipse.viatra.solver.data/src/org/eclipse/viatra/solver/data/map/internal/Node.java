package org.eclipse.viatra.solver.data.map.internal;

import org.eclipse.viatra.solver.data.map.ContinousHashProvider;

public abstract class Node<KEY,VALUE>{
	protected static final int branchingFactorBit = 5;
	protected static final int factor = 1<<branchingFactorBit;
	protected static final int numberOfFactors = Integer.SIZE / branchingFactorBit;
	protected static final int factorMask = factor-1;
	
	/**
	 * Calculates the index for the continuous hash.
	 * @param depth The depth of the node in the tree.
	 * @return The index of the continuous hash.
	 */
	protected static int hashDepth(int depth) {
		return depth/numberOfFactors;
	}
	
	/**
	 * Calculates the which segment of a single hash should be used.
	 * @param depth The depth of the node in the tree. 
	 * @return The segment of a hash code.
	 */
	protected static int shiftDepth(int depth) {
		return depth%numberOfFactors;
	}
	/**
	 * Selects a segments from a complete hash for a given depth.
	 * @param hash A complete hash.
	 * @param shiftDepth The index of the segment.
	 * @return The segment as an integer.
	 */
	protected static int hashFragment(int hash, int shiftDepth) {
		return (hash >>> shiftDepth*branchingFactorBit) & factorMask;
	}
	/**
	 * Returns the hash code for a given depth. It may calculate new hash code, or reuse a hash code calculated for depth-1.
	 * @param key The key.
	 * @param hash Hash code for depth-1
	 * @param depth The depth.
	 * @return The new hash code.
	 */
	protected int newHash(final ContinousHashProvider<? super KEY> hashProvider, KEY key, int hash, int depth) {
		return depth%numberOfFactors == 0?
				hashProvider.getHash(key, hashDepth(depth)) :
				hash;
	}
	
	
	abstract public VALUE getValue(KEY key, ContinousHashProvider<? super KEY> hashProvider, VALUE defaultValue,  int hash, int depth);
	abstract public Node<KEY,VALUE> putValue(KEY key, VALUE value, ContinousHashProvider<? super KEY> hashProvider, VALUE defaultValue, int hash, int depth);
	abstract public long getSize();
	
	abstract MutableNode<KEY, VALUE> toMutable();
	public abstract ImmutableNode<KEY, VALUE> toImmutable();
	
	/**
	 * Moves a {@link MapCursor} to its next position.
	 * @param cursor the cursor
	 * @return Whether there was a next value to move on.
	 */
	abstract boolean moveToNext(MapCursor<KEY,VALUE> cursor);
	
	///////// For iterators
	//abstract boolean moveIteratorToNextData(NodeIterator<KEY,VALUE> iterator, int currentIndex);
	//abstract boolean moveIteratorToNextNode(NodeIterator<KEY,VALUE> iterator, int currentIndex);
	///////// FOR printing
	abstract public void prettyPrint(StringBuilder builder, int depth, int code);
	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		prettyPrint(stringBuilder, 0, -1);
		return stringBuilder.toString();
	}
}
