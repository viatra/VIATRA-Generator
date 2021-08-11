package org.eclipse.viatra.solver.data.map.internal;

import java.util.Arrays;
import java.util.Map;

import org.eclipse.viatra.solver.data.map.ContinousHashProvider;

public class ImmutableNode<K, V> extends Node<K, V> {
	/**
	 * Bitmap defining the stored key and values.
	 */
	final int dataMap;
	/**
	 * Bitmap defining the positions of further nodes.
	 */
	final int nodeMap;
	/**
	 * Stores Keys, Values, and subnodes. Structure: (K,V)*,NODE; NODES are stored backwards. 
	 */
	final Object[] content;
	
	/**
	 * Hash code derived from immutable hash code
	 */
	final int precalculatedHash;
		
	private ImmutableNode(int dataMap, int nodeMap, Object[] content, int precalculatedHash) {
		super();
		this.dataMap = dataMap;
		this.nodeMap = nodeMap;
		this.content = content;
		this.precalculatedHash = precalculatedHash;
	}

	/**
	 * Constructor that copies a mutable node to an immutable.
	 * 
	 * @param node  A mutable node.
	 * @param cache A cache of existing immutable nodes. It can be used to search
	 *              and place reference immutable nodes. It can be null, if no cache
	 *              available.
	 * @return an immutable version of the input node.
	 */
	@SuppressWarnings("unchecked")
	static <K,V> ImmutableNode<K,V> constructImmutable(MutableNode<K,V> node, Map<Node<K, V>, ImmutableNode<K, V>> cache) {
		// 1. try to return from cache
		if(cache != null) {
			ImmutableNode<K, V> cachedResult = cache.get(node);
			if(cachedResult != null) {
				// 1.1 Already cached, return from cache.
				return cachedResult;
			}
		}
		
		// 2. otherwise construct a new ImmutableNode
		int size = 0;
		for(int i = 0; i<node.content.length; i++) {
			if(node.content[i]!=null) {
				size++;
			}
		}
		
		int datas = 0;
		int nodes = 0;
		int resultDataMap = 0;
		int resultNodeMap = 0;
		final Object[] resultContent = new Object[size];
		int bitposition = 1;
		for(int i = 0; i<FACTOR; i++) {
			Object key = node.content[i*2];
			if(key != null) {
				resultDataMap |= bitposition;
				resultContent[datas*2] = key;
				resultContent[datas*2+1] = node.content[i*2+1];
				datas++;
			} else {
				Node<K,V> subnode = (Node<K, V>) node.content[i*2+1];
				if(subnode != null) {
					ImmutableNode<K, V> immutableSubnode = subnode.toImmutable(cache);
					resultNodeMap |=bitposition;
					resultContent[size-1-nodes] = immutableSubnode;
					nodes++;
				}
			}
			bitposition<<=1;
		}
		final int resultHash = node.hashCode();
		ImmutableNode<K,V> newImmutable = new ImmutableNode<>(resultDataMap, resultNodeMap, resultContent, resultHash);
		
		// 3. save new immutable.
		if(cache != null) {
			cache.put(newImmutable, newImmutable);
		}
		return newImmutable;
	}
	
	private int index(int bitmap, int bitpos) {
		return Integer.bitCount(bitmap & (bitpos-1));
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public V getValue(K key, ContinousHashProvider<? super K> hashProvider, V defaultValue, int hash, int depth) {
		int selectedHashFragment = hashFragment(hash,shiftDepth(depth));
		int bitposition = 1 << selectedHashFragment;
		// If the key is stored as a data
		if((dataMap & bitposition) != 0) {
			int keyIndex = 2*index(dataMap, bitposition);
			K keyCandidate = (K) content[keyIndex];
			if(keyCandidate.equals(key)) {
				return (V) content[keyIndex+1];
			} else {
				return defaultValue;
			}
		}
		// the key is stored as a node
		else if((nodeMap & bitposition) != 0) {
			int keyIndex = content.length-1-index(nodeMap, bitposition);
			ImmutableNode<K,V> subNode = (ImmutableNode<K,V>) content[keyIndex];
			int newDepth = depth+1;
			int newHash = newHash(hashProvider, key, hash, newDepth);
			return subNode.getValue(key, hashProvider, defaultValue, newHash, newDepth);
		}
		// the key is not stored at all
		else {
			return defaultValue;
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Node<K,V> putValue(K key, V value, OldValueBox<V> oldValue, ContinousHashProvider<? super K> hashProvider, V defaultValue, int hash, int depth) {
		int selectedHashFragment = hashFragment(hash,shiftDepth(depth));
		int bitposition = 1 << selectedHashFragment;
		if((dataMap & bitposition) != 0) {
			int keyIndex = 2*index(dataMap, bitposition);
			K keyCandidate = (K) content[keyIndex];
			if(keyCandidate.equals(key)) {
				if(value == defaultValue) {
					// delete
					MutableNode<K, V> mutable = this.toMutable();
					return mutable.removeEntry(selectedHashFragment,oldValue);
				} else if(value == content[keyIndex+1]) {
					// dont change
					oldValue.setOldValue(value);
					return this;
				} else {
					// update existing value
					MutableNode<K, V> mutable = this.toMutable();
					return mutable.updateValue(value, oldValue, selectedHashFragment);
				}
			} else {
				if(value == defaultValue) {
					// dont change
					oldValue.setOldValue(defaultValue);
					return this;
				} else {
					// add new key + value
					MutableNode<K, V> mutable = this.toMutable();
					return mutable.putValue(key, value, oldValue, hashProvider, defaultValue, hash, depth);
				}
			}
		} else if((nodeMap & bitposition)!=0) {
			
			int keyIndex = content.length-1-index(nodeMap, bitposition);
			ImmutableNode<K,V> subNode = (ImmutableNode<K,V>) content[keyIndex];
			int newDepth = depth+1;
			int newHash = newHash(hashProvider, key, hash, newDepth);
			Node<K,V> newsubNode = subNode.putValue(key, value, oldValue, hashProvider, defaultValue, newHash, newDepth);
			
			if(subNode == newsubNode) {
				// nothing changed
				return this;
			} else {
				MutableNode<K, V> mutable  = toMutable();
				return mutable.updateWithSubNode(selectedHashFragment, newsubNode, value.equals(defaultValue));
			}
		} else {
			// add new key + value
			MutableNode<K, V> mutable = this.toMutable();
			return mutable.putValue(key, value, oldValue, hashProvider, defaultValue, hash, depth);
		}
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public long getSize() {
		int result = Integer.bitCount(this.dataMap);
		for(int subnodeIndex = 0; subnodeIndex < Integer.bitCount(this.nodeMap); subnodeIndex++) {
			ImmutableNode<K,V> subnode =
				(ImmutableNode<K, V>) this.content[this.content.length-1-subnodeIndex];
			result += subnode.getSize();
		}
		return result;
	}
	
	@Override
	protected MutableNode<K,V> toMutable() {
		return new MutableNode<>(this);
	}
	
	@Override
	public ImmutableNode<K, V> toImmutable(
			Map<Node<K, V>, ImmutableNode<K, V>> cache) {
		return this;
	}
	
	@Override
	protected MutableNode<K, V> isMutable() {
		return null;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	boolean moveToNext(MapCursor<K, V> cursor) {
		// 1. try to move to data
		int datas = Integer.bitCount(this.dataMap);
		if(cursor.dataIndex != MapCursor.INDEX_FINISH) {
			int newDataIndex = cursor.dataIndex + 1;
			if(newDataIndex < datas) {
				cursor.dataIndex = newDataIndex;
				cursor.key = (K) this.content[newDataIndex*2];
				cursor.value = (V) this.content[newDataIndex*2+1];
				return true;
			} else {
				cursor.dataIndex = MapCursor.INDEX_FINISH;
			}
		}
		
		// 2. look inside the subnodes
		int nodes = Integer.bitCount(this.nodeMap);
		int newNodeIndex = cursor.nodeIndexStack.peek() + 1;
		if(newNodeIndex < nodes) {
			// 2.1 found next subnode, move down to the subnode
			Node<K, V> subnode = (Node<K, V>) this.content[this.content.length-1-newNodeIndex];
			cursor.dataIndex = MapCursor.INDEX_START;
			cursor.nodeIndexStack.pop();
			cursor.nodeIndexStack.push(newNodeIndex);
			cursor.nodeIndexStack.push(MapCursor.INDEX_START);
			cursor.nodeStack.push(subnode);
			return subnode.moveToNext(cursor);
		} else {
			// 3. no subnode found, move up
			cursor.nodeStack.pop();
			cursor.nodeIndexStack.pop();
			if(!cursor.nodeStack.isEmpty()) {
				Node<K, V> supernode = cursor.nodeStack.peek();
				return supernode.moveToNext(cursor);
			} else {
				cursor.key = null;
				cursor.value = null;
				return false;
			}
		}
	}
	
	@Override
	public void prettyPrint(StringBuilder builder, int depth, int code) {
		for(int i = 0; i<depth; i++) {
			builder.append("\t");
		}
		if(code>=0) {
			builder.append(code);
			builder.append(":");
		}
		builder.append("Immutable(");
		boolean hadContent = false;
		int dataMask = 1;
		for(int i = 0; i<FACTOR; i++) {
			if((dataMask & dataMap) != 0) {
				if(hadContent) {
					builder.append(",");
				}
				builder.append(i);
				builder.append(":[");
				builder.append(content[2*index(dataMap, dataMask)].toString());
				builder.append("]->[");
				builder.append(content[2*index(dataMap, dataMask)+1].toString());
				builder.append("]");
				hadContent = true;
			}
			dataMask<<=1;
		}
		builder.append(")");
		int nodeMask = 1;
		for(int i = 0; i<FACTOR; i++) {
			if((nodeMask & nodeMap)!=0) {
				@SuppressWarnings("unchecked")
				Node<K,V> subNode = (Node<K, V>) content[content.length-1-index(nodeMap, nodeMask)];
				builder.append("\n");
				subNode.prettyPrint(builder, depth+1, i);
			}
			nodeMask<<=1;
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public void checkIntegrity(ContinousHashProvider<? super K> hashProvider, V defaultValue, int depth) {
		if(depth>0) {
			boolean orphaned = Integer.bitCount(dataMap) == 1 && nodeMap == 0;
			if(orphaned) {
				throw new IllegalStateException("Orphaned node! " + dataMap + ": " +  content[0]);
			}
		}
		// check the place of data
		
		// check subnodes
		for(int i = 0; i<Integer.bitCount(nodeMap); i++) {
			Node<K,V> subnode = (Node<K, V>) this.content[this.content.length-1-i];
			if(! (subnode instanceof ImmutableNode<?,?>)) {
				throw new IllegalStateException("Immutable node contains mutable subnodes!");
			} else {
				subnode.checkIntegrity(hashProvider, defaultValue, depth+1);
			}
		}
	}
	
	@Override
	public int hashCode() {
		return this.precalculatedHash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (obj instanceof ImmutableNode<?,?>) {
			ImmutableNode<?,?> other = (ImmutableNode<?,?>) obj;
			if (precalculatedHash != other.precalculatedHash || dataMap != other.dataMap || nodeMap != other.nodeMap || !Arrays.deepEquals(content, other.content))
				return false;
			else return true;
		} else if(obj instanceof MutableNode<?,?>) {
			return ImmutableNode.compareImmutableMutable(this, (MutableNode<?, ?>) obj);
		} else {
			return false;
		}
	}
	public static boolean compareImmutableMutable(
			ImmutableNode<?, ?> immutable,
			MutableNode<?, ?> mutable)
	{
		int datas = 0;
		int nodes = 0;
		final int immutableLength = immutable.content.length;
		for(int i = 0; i<FACTOR; i++) {
			Object key = mutable.content[i*2];
			// For each key candidate
			if(key != null) {
				// Check whether a new Key-Value pair can fit into the immutable container 
				if(datas*2+nodes+2 <= immutableLength) {
					if(	!immutable.content[datas*2].equals(key) ||
						!immutable.content[datas*2+1].equals(mutable.content[i*2+1]))
					{
						return false;
					}
				} else return false;
				datas++;
			} else {
				Node<?,?> mutableSubnode = (Node<?, ?>) mutable.content[i*2+1];
				if(mutableSubnode != null) {
					if(datas*2+nodes+1 <= immutableLength) {
						Object immutableSubnode = immutable.content[immutableLength-1-nodes];
						if(!mutableSubnode.equals(immutableSubnode)) {
							return false;
						}
						nodes++;
					} else {
						return false;
					}
				}
			}
		}
		return true;
	}
}
