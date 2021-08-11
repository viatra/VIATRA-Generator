package org.eclipse.viatra.solver.data.map.internal;

import java.util.Arrays;
import java.util.Map;

import org.eclipse.viatra.solver.data.map.ContinousHashProvider;

public class MutableNode<K, V> extends Node<K, V> {
	int cachedHash;
	protected Object[] content;

	protected MutableNode() {
		this.content = new Object[2 * FACTOR];
		updateHash();
	}

	public static <K, V> MutableNode<K, V> initialize(K key, V value, ContinousHashProvider<? super K> hashProvider,
			V defaultValue) {
		if (value == defaultValue) {
			return null;
		} else {
			int hash = hashProvider.getHash(key, 0);
			int fragment = hashFragment(hash, 0);
			MutableNode<K, V> res = new MutableNode<>();
			res.content[2 * fragment] = key;
			res.content[2 * fragment + 1] = value;
			res.updateHash();
			return res;
		}
	}

	/**
	 * Constructs a {@link MutableNode} as a copy of an {@link ImmutableNode}
	 * 
	 * @param node
	 */
	protected MutableNode(ImmutableNode<K, V> node) {
		this.content = new Object[2 * FACTOR];
		int dataUsed = 0;
		int nodeUsed = 0;
		for (int i = 0; i < FACTOR; i++) {
			int bitposition = 1 << i;
			if ((node.dataMap & bitposition) != 0) {
				content[2 * i] = node.content[dataUsed * 2];
				content[2 * i + 1] = node.content[dataUsed * 2 + 1];
				dataUsed++;
			} else if ((node.nodeMap & bitposition) != 0) {
				content[2 * i + 1] = node.content[node.content.length - 1 - nodeUsed];
				nodeUsed++;
			}
		}
		this.cachedHash = node.hashCode();
	}

	@SuppressWarnings("unchecked")
	@Override
	public V getValue(K key, ContinousHashProvider<? super K> hashProvider, V defaultValue, int hash, int depth) {
		int selectedHashFragment = hashFragment(hash, shiftDepth(depth));
		K keyCandidate = (K) this.content[2 * selectedHashFragment];
		if (keyCandidate != null) {
			if (keyCandidate.equals(key)) {
				return (V) this.content[2 * selectedHashFragment + 1];
			} else {
				return defaultValue;
			}
		} else {
			Node<K, V> nodeCandidate = (Node<K, V>) content[2 * selectedHashFragment + 1];
			if (nodeCandidate != null) {
				int newDepth = depth + 1;
				int newHash = newHash(hashProvider, key, hash, newDepth);
				return nodeCandidate.getValue(key, hashProvider, defaultValue, newHash, newDepth);
			} else {
				return defaultValue;
			}
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public Node<K, V> putValue(K key, V value, OldValueBox<V> oldValue, ContinousHashProvider<? super K> hashProvider, V defaultValue, int hash,
			int depth) {
		int selectedHashFragment = hashFragment(hash, shiftDepth(depth));
		K keyCandidate = (K) content[2 * selectedHashFragment];
		if (keyCandidate != null) {
			// If has key
			if (keyCandidate.equals(key)) {
				// The key is equals to an existing key -> update entry
				if (value == defaultValue) {
					return removeEntry(selectedHashFragment, oldValue);
				} else {
					return updateValue(value, oldValue, selectedHashFragment);
				}
			} else {
				// The key is not equivalent to an existing key on the same hash bin
				// -> split entry if it is necessary
				if (value == defaultValue) {
					// Value is default -> do not need to add new node
					oldValue.setOldValue(defaultValue);
					return this;
				} else {
					// Value is not default -> Split entry data to a new node
					oldValue.setOldValue(defaultValue);
					return moveDownAndSplit(hashProvider, key, value, keyCandidate, hash, depth, selectedHashFragment);
				}
			}
		} else {
			// If it does not have key, check for value
			Node<K, V> nodeCandidate = (Node<K, V>) content[2 * selectedHashFragment + 1];
			if (nodeCandidate != null) {
				// If it has value, it is a subnode -> upate that
				Node<K, V> newNode = nodeCandidate.putValue(key, value, oldValue, hashProvider, defaultValue,
						newHash(hashProvider, key, hash, depth + 1), depth + 1);
				return updateWithSubNode(selectedHashFragment, newNode, value.equals(defaultValue));
			} else {
				// If it does not have value, put it in the empty place
				if (value == defaultValue) {
					// dont need to add new key-value pair
					oldValue.setOldValue(defaultValue);
					return this;
				} else {
					return addEntry(key, value, oldValue, selectedHashFragment);
				}

			}
		}
	}

	@SuppressWarnings("unchecked")
	private Node<K, V> addEntry(K key, V value, OldValueBox<V> oldValue, int selectedHashFragment) {
		content[2 * selectedHashFragment] = key;
		oldValue.setOldValue((V) content[2 * selectedHashFragment + 1]);
		content[2 * selectedHashFragment + 1] = value;
		updateHash();
		return this;
	}

	/**
	 * Updates an entry in a selected hash-fragment to a non-default value.
	 * 
	 * @param value
	 * @param selectedHashFragment
	 * @return
	 */
	@SuppressWarnings("unchecked")
	Node<K, V> updateValue(V value, OldValueBox<V> oldValue, int selectedHashFragment) {
		oldValue.setOldValue((V) content[2 * selectedHashFragment + 1]);
		content[2 * selectedHashFragment + 1] = value;
		updateHash();
		return this;
	}

	/**
	 * 
	 * @param selectedHashFragment
	 * @param newNode
	 * @return
	 */
	Node<K, V> updateWithSubNode(int selectedHashFragment, Node<K, V> newNode, boolean deletionHappened) {
		if (deletionHappened) {
			if (newNode == null) {
				// Check whether this node become empty
				content[2 * selectedHashFragment + 1] = null; // i.e. the new node
				if (hasContent()) {
					updateHash();
					return this;
				} else {
					return null;
				}
			} else {
				// check whether newNode is orphan
				MutableNode<K, V> immutableNewNode = newNode.isMutable();
				if (immutableNewNode != null) {
					int orphaned = immutableNewNode.isOrphaned();
					if (orphaned >= 0) {
						// orphan subnode data is replaced with data
						content[2 * selectedHashFragment] = immutableNewNode.content[orphaned * 2];
						content[2 * selectedHashFragment + 1] = immutableNewNode.content[orphaned * 2 + 1];
						updateHash();
						return this;
					}
				}
			}
		}
		// normal behaviour
		content[2 * selectedHashFragment + 1] = newNode;
		updateHash();
		return this;

	}

	private boolean hasContent() {
		for (Object element : this.content) {
			if (element != null)
				return true;
		}
		return false;
	}

	@Override
	protected MutableNode<K, V> isMutable() {
		return this;
	}

	protected int isOrphaned() {
		int dataFound = -2;
		for (int i = 0; i < FACTOR; i++) {
			if (content[i * 2] != null) {
				if (dataFound >= 0) {
					return -1;
				} else {
					dataFound = i;
				}
			} else if (content[i * 2 + 1] != null) {
				return -3;
			}
		}
		return dataFound;
	}

	@SuppressWarnings("unchecked")
	private Node<K, V> moveDownAndSplit(ContinousHashProvider<? super K> hashProvider, K newKey, V newValue,
			K previousKey, int hashOfNewKey, int depth, int selectedHashFragmentOfCurrentDepth) {
		V previousValue = (V) content[2 * selectedHashFragmentOfCurrentDepth + 1];

		MutableNode<K, V> newSubNode = newNodeWithTwoEntries(hashProvider, previousKey, previousValue,
				hashProvider.getHash(previousKey, hashDepth(depth)), newKey, newValue, hashOfNewKey, depth + 1);

		content[2 * selectedHashFragmentOfCurrentDepth] = null;
		content[2 * selectedHashFragmentOfCurrentDepth + 1] = newSubNode;
		updateHash();
		return this;
	}

	private MutableNode<K, V> newNodeWithTwoEntries(ContinousHashProvider<? super K> hashProvider, K key1, V value1,
			int oldHash1, K key2, V value2, int oldHash2, int newdepth) {
		int newHash1 = newHash(hashProvider, key1, oldHash1, newdepth);
		int newHash2 = newHash(hashProvider, key2, oldHash2, newdepth);
		int newFragment1 = hashFragment(newHash1, shiftDepth(newdepth));
		int newFragment2 = hashFragment(newHash2, shiftDepth(newdepth));

		MutableNode<K, V> subNode = new MutableNode<>();
		if (newFragment1 != newFragment2) {
			subNode.content[newFragment1 * 2] = key1;
			subNode.content[newFragment1 * 2 + 1] = value1;

			subNode.content[newFragment2 * 2] = key2;
			subNode.content[newFragment2 * 2 + 1] = value2;
		} else {
			MutableNode<K, V> subSubNode = newNodeWithTwoEntries(hashProvider, key1, value1, newHash1, key2, value2,
					newHash2, newdepth + 1);
			subNode.content[newFragment1 * 2 + 1] = subSubNode;
		}
		subNode.updateHash();
		return subNode;
	}

	@SuppressWarnings("unchecked")
	Node<K, V> removeEntry(int selectedHashFragment, OldValueBox<V> oldValue) {
		content[2 * selectedHashFragment] = null;
		oldValue.setOldValue((V) content[2 * selectedHashFragment + 1]);
		content[2 * selectedHashFragment + 1] = null;
		if (hasContent()) {
			updateHash();
			return this;
		} else {
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public long getSize() {
		int size = 0;
		for (int i = 0; i < FACTOR; i++) {
			if (content[i * 2] != null) {
				size++;
			} else {
				Node<K, V> nodeCandidate = (Node<K, V>) content[i * 2 + 1];
				if (nodeCandidate != null) {
					size += nodeCandidate.getSize();
				}
			}
		}
		return size;
	}

	@Override
	protected MutableNode<K, V> toMutable() {
		return this;
	}

	@Override
	public ImmutableNode<K, V> toImmutable(Map<Node<K, V>, ImmutableNode<K, V>> cache) {
		return ImmutableNode.constructImmutable(this, cache);
	}

	@SuppressWarnings("unchecked")
	@Override
	boolean moveToNext(MapCursor<K, V> cursor) {
		// 1. try to move to data
		if (cursor.dataIndex != MapCursor.INDEX_FINISH) {
			for (int index = cursor.dataIndex + 1; index < FACTOR; index++) {
				if (this.content[index * 2] != null) {
					// 1.1 found next data
					cursor.dataIndex = index;
					cursor.key = (K) this.content[index * 2];
					cursor.value = (V) this.content[index * 2 + 1];
					return true;
				}
			}
			cursor.dataIndex = MapCursor.INDEX_FINISH;
		}

		// 2. look inside the subnodes
		for (int index = cursor.nodeIndexStack.peek() + 1; index < FACTOR; index++) {
			if (this.content[index * 2] == null && this.content[index * 2 + 1] != null) {
				// 2.1 found next subnode, move down to the subnode
				Node<K, V> subnode = (Node<K, V>) this.content[index * 2 + 1];

				cursor.dataIndex = MapCursor.INDEX_START;
				cursor.nodeIndexStack.pop();
				cursor.nodeIndexStack.push(index);
				cursor.nodeIndexStack.push(MapCursor.INDEX_START);
				cursor.nodeStack.push(subnode);

				return subnode.moveToNext(cursor);
			}
		}
		// 3. no subnode found, move up
		cursor.nodeStack.pop();
		cursor.nodeIndexStack.pop();
		if (!cursor.nodeStack.isEmpty()) {
			Node<K, V> supernode = cursor.nodeStack.peek();
			return supernode.moveToNext(cursor);
		} else {
			cursor.key = null;
			cursor.value = null;
			return false;
		}
	}

	@Override
	public void prettyPrint(StringBuilder builder, int depth, int code) {
		for (int i = 0; i < depth; i++) {
			builder.append("\t");
		}
		if (code >= 0) {
			builder.append(code);
			builder.append(":");
		}
		builder.append("Mutable(");
		// print content
		boolean hadContent = false;
		for (int i = 0; i < FACTOR; i++) {
			if (content[2 * i] != null) {
				if (hadContent) {
					builder.append(",");
				}
				builder.append(i);
				builder.append(":[");
				builder.append(content[2 * i].toString());
				builder.append("]->[");
				builder.append(content[2 * i + 1].toString());
				builder.append("]");
				hadContent = true;
			}
		}
		builder.append(")");
		// print subnodes
		for (int i = 0; i < FACTOR; i++) {
			if (content[2 * i] == null && content[2 * i + 1] != null) {
				@SuppressWarnings("unchecked")
				Node<K, V> subNode = (Node<K, V>) content[2 * i + 1];
				builder.append("\n");
				subNode.prettyPrint(builder, depth + 1, i);
			}
		}
	}

	@SuppressWarnings({ "unchecked" })
	@Override
	public void checkIntegrity(ContinousHashProvider<? super K> hashProvider, V defaultValue, int depth) {
		// check for orphan nodes
		if (depth > 0) {
			int orphaned = isOrphaned();
			if (orphaned >= 0) {
				throw new IllegalStateException("Orphaned node! " + orphaned + ": " + content[2 * orphaned]);
			}
		}
		// check the place of data
		for (int i = 0; i < FACTOR; i++) {
			if (this.content[2 * i] != null) {
				K key = (K) this.content[2 * i];
				V value = (V) this.content[2 * i + 1];

				if (value == defaultValue) {
					throw new IllegalStateException("Node contains default value!");
				}
				int hashCode = hashProvider.getHash(key, hashDepth(depth));
				int shiftDepth = shiftDepth(depth);
				int selectedHashFragment = hashFragment(hashCode, shiftDepth);
				if (i != selectedHashFragment) {
					throw new IllegalStateException("Key " + key + " with hash code " + hashCode
							+ " is in bad place! Fragment=" + selectedHashFragment + ", Place=" + i);
				}
			}
		}
		// check subnodes
		for (int i = 0; i < FACTOR; i++) {
			if (this.content[2 * i + 1] != null && this.content[2 * i] == null) {
				Node<K, V> subNode = (Node<K, V>) this.content[2 * i + 1];
				subNode.checkIntegrity(hashProvider, defaultValue, depth + 1);
			}
		}
		// check the hash
		int oldHash = this.cachedHash;
		updateHash();
		int newHash = this.cachedHash;
		if (oldHash != newHash) {
			throw new IllegalStateException("Hash code was not up to date! (old=" + oldHash + ",new=" + newHash + ")");
		}
	}

	protected void updateHash() {
		this.cachedHash = Arrays.hashCode(content);
	}

	@Override
	public int hashCode() {
		return this.cachedHash;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (obj instanceof MutableNode<?, ?>) {
			MutableNode<?, ?> other = (MutableNode<?, ?>) obj;
			return Arrays.deepEquals(this.content, other.content);
		} else if (obj instanceof ImmutableNode<?, ?>) {
			ImmutableNode<?, ?> other = (ImmutableNode<?, ?>) obj;
			return ImmutableNode.compareImmutableMutable(other, this);
		} else {
			return false;
		}
	}
}
