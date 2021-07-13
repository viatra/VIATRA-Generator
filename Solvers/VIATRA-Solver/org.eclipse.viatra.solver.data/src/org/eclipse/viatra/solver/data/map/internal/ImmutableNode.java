package org.eclipse.viatra.solver.data.map.internal;

import java.util.Arrays;
import java.util.Map;

import org.eclipse.viatra.solver.data.map.ContinousHashProvider;

public class ImmutableNode<KEY, VALUE> extends Node<KEY, VALUE> {
	/**
	 * Bitmap defining the stored key and values.
	 */
	final int dataMap;
	/**
	 * Bitmap defining the positions of further nodes.
	 */
	final int nodeMap;
	/**
	 * Stores Keys, Values, and subnodes. Structure: (KEY,VALUE)*,NODE; NODES are stored backwards. 
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
	 * @param node
	 */
	@SuppressWarnings("unchecked")
	static <KEY,VALUE> ImmutableNode<KEY,VALUE> constructImmutable(MutableNode<KEY,VALUE> node, Map<Node<KEY, VALUE>, ImmutableNode<KEY, VALUE>> cache) {
		// 1. try to return from cache
		if(cache != null) {
			ImmutableNode<KEY, VALUE> cachedResult = cache.get(node);
			if(cachedResult != null) {
				// 1.1 Already cached, return from cache.
				return cachedResult;
			}
		}
		
		// 2. otherwise construct a new ImmutableNode
		
		final int resultHash = node.hashCode();
		
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
		for(int i = 0; i<factor; i++) {
			Object key = node.content[i*2];
			if(key != null) {
				resultDataMap |= bitposition;
				resultContent[datas*2] = key;
				resultContent[datas*2+1] = node.content[i*2+1];
				datas++;
			} else {
				Node<KEY,VALUE> subnode = (Node<KEY, VALUE>) node.content[i*2+1];
				if(subnode != null) {
					ImmutableNode<KEY, VALUE> immutableSubnode = subnode.toImmutable(cache);
					resultNodeMap |=bitposition;
					resultContent[size-1-nodes] = immutableSubnode;
					nodes++;
				}
			}
			bitposition<<=1;
		}
		
		return new ImmutableNode<>(resultDataMap, resultNodeMap, resultContent, resultHash);
	}
	
	private int index(int bitmap, int bitpos) {
		return Integer.bitCount(bitmap & (bitpos-1));
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public VALUE getValue(KEY key, ContinousHashProvider<? super KEY> hashProvider, VALUE defaultValue, int hash, int depth) {
		int selectedHashFragment = hashFragment(hash,shiftDepth(depth));
		int bitposition = 1 << selectedHashFragment;
		// If the key is stored as a data
		if((dataMap & bitposition) != 0) {
			int keyIndex = 2*index(dataMap, bitposition);
			KEY keyCandidate = (KEY) content[keyIndex];
			if(hashProvider.equals(keyCandidate, key)) {
				return (VALUE) content[keyIndex+1];
			} else {
				return defaultValue;
			}
		}
		// the key is stored as a node
		else if((nodeMap & bitposition) != 0) {
			int keyIndex = content.length-1-index(nodeMap, bitposition);
			ImmutableNode<KEY,VALUE> subNode = (ImmutableNode<KEY,VALUE>) content[keyIndex];
			int newHash = depth%numberOfFactors == 0?
					hashProvider.getHash(key, hashDepth(depth)) :
					hash;
			int newDepth = depth+1;
			return subNode.getValue(key, hashProvider, defaultValue, newHash, newDepth);
		}
		// the key is not stored at all
		else {
			return defaultValue;
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Node<KEY,VALUE> putValue(KEY key, VALUE value, ContinousHashProvider<? super KEY> hashProvider, VALUE defaultValue, int hash, int depth) {
		int selectedHashFragment = hashFragment(hash,shiftDepth(depth));
		int bitposition = 1 << selectedHashFragment;
		if((dataMap & bitposition) != 0) {
			int keyIndex = 2*index(dataMap, bitposition);
			KEY keyCandidate = (KEY) content[keyIndex];
			if(hashProvider.equals(keyCandidate, key)) {
				if(value == defaultValue) {
					// delete
					MutableNode<KEY, VALUE> mutable = this.toMutable();
					mutable.removeEntry(selectedHashFragment);
					return mutable;
				} else if(value == content[keyIndex+1]) {
					// dont change
					return this;
				} else {
					// update existing value
					MutableNode<KEY, VALUE> mutable = this.toMutable();
					mutable.updateValue(value, selectedHashFragment);
					return mutable;
				}
			} else {
				if(value == defaultValue) {
					// dont change
					return this;
				} else {
					// add new key + value
					MutableNode<KEY, VALUE> mutable = this.toMutable();
					mutable.putValue(key, value, hashProvider, defaultValue, selectedHashFragment, depth);
					return mutable;
				}
			}
		} else if((nodeMap & bitposition)!=0) {
			
			int keyIndex = content.length-1-index(dataMap, bitposition);
			ImmutableNode<KEY,VALUE> subNode = (ImmutableNode<KEY,VALUE>) content[keyIndex];
			int newHash = newHash(hashProvider, key, selectedHashFragment, depth);
			int newDepth = depth+1;
			Node<KEY,VALUE> newsubNode = subNode.putValue(key, value, hashProvider, defaultValue, newHash, newDepth);
			
			if(subNode == newsubNode) {
				// nothing changed
				return this;
			} else {
				MutableNode<KEY, VALUE> result = toMutable();
				result.updateSubNode(selectedHashFragment, newsubNode);
				return result;
			}
		} else {
			// add new key + value
			MutableNode<KEY, VALUE> mutable = this.toMutable();
			mutable.putValue(key, value, hashProvider, defaultValue, selectedHashFragment, depth);
			return mutable;
		}
	}
	
	
	@SuppressWarnings("unchecked")
	@Override
	public long getSize() {
		int result = Integer.bitCount(this.dataMap);
		for(int subnodeIndex = 0; subnodeIndex < Integer.bitCount(this.nodeMap); subnodeIndex++) {
			ImmutableNode<KEY,VALUE> subnode = (ImmutableNode<KEY, VALUE>) this.content[this.content.length-1-subnodeIndex];
			result += subnode.getSize();
		}
		return result;
	}
	
	@Override
	protected MutableNode<KEY,VALUE> toMutable() {
		return new MutableNode<KEY,VALUE>(this);
	}

	@Override
	public ImmutableNode<KEY,VALUE> toImmutable() {
		return this;
	}
	
	@Override
	public ImmutableNode<KEY, VALUE> toImmutable(
			Map<Node<KEY, VALUE>, ImmutableNode<KEY, VALUE>> cache) {
		return this;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	boolean moveToNext(MapCursor<KEY, VALUE> cursor) {
		// 1. try to move to data
		int datas = Integer.bitCount(this.dataMap);
		if(cursor.dataIndex != MapCursor.IndexFinish) {
			int newDataIndex = cursor.dataIndex + 1;
			if(newDataIndex < datas) {
				cursor.dataIndex = newDataIndex;
				cursor.key = (KEY) this.content[newDataIndex*2];
				cursor.value = (VALUE) this.content[newDataIndex*2+1];
				return true;
			} else {
				cursor.dataIndex = MapCursor.IndexFinish;
			}
		}
		
		// 2. look inside the subnodes
		int nodes = Integer.bitCount(this.nodeMap);
		int newNodeIndex = cursor.nodeIndexStack.peek() + 1;
		if(newNodeIndex < nodes) {
			// 2.1 found next subnode, move down to the subnode
			Node<KEY, VALUE> subnode = (Node<KEY, VALUE>) this.content[this.content.length-1-newNodeIndex];
			cursor.dataIndex = MapCursor.IndexStart;
			cursor.nodeStack.push(subnode);
			cursor.nodeIndexStack.push(newNodeIndex);
			return subnode.moveToNext(cursor);
		} else {
			// 3. no subnode found, move up
			cursor.nodeStack.pop();
			cursor.nodeIndexStack.pop();
			if(!cursor.nodeStack.isEmpty()) {
				Node<KEY, VALUE> supernode = cursor.nodeStack.peek();
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
		for(int i = 0; i<factor; i++) {
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
		for(int i = 0; i<factor; i++) {
			if((nodeMask & nodeMap)!=0) {
				@SuppressWarnings("unchecked")
				Node<KEY,VALUE> subNode = (Node<KEY, VALUE>) content[content.length-1-index(nodeMap, nodeMask)];
				builder.append("\n");
				subNode.prettyPrint(builder, depth+1, i);
			}
			nodeMask<<=1;
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
			if (precalculatedHash != other.precalculatedHash)
				return false;
			if (dataMap != other.dataMap)
				return false;
			if (nodeMap != other.nodeMap)
				return false;
			if (!Arrays.deepEquals(content, other.content))
				return false;
			return true;
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
		for(int i = 0; i<factor; i++) {
			Object key = immutable.content[i*2];
			if(key != null) {
				if(datas*2+nodes+2 <= immutableLength) {
					if(	mutable.content[datas*2]	!= key ||
						mutable.content[datas*2+1]	!= immutable.content[i*2+1])
					{
						return false;
					}
				} else return false;
				datas++;
			} else {
				Node<?,?> mutableSubnode = (Node<?, ?>) mutable.content[i*2+1];
				if(mutableSubnode != null) {
					if(datas*2+nodes+1 <= immutableLength) {
						Node<?,?> immutableSubnode = (Node<?, ?>) immutable.content[immutableLength-1-nodes];
						if(!mutableSubnode.equals(immutableSubnode)) {
							return false;
						}
						nodes++;
					}
				}
			}
		}
		return true;
	}
	
}
