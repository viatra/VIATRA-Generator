package org.eclipse.viatra.solver.data.map.internal;

import java.util.ArrayDeque;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

import org.eclipse.viatra.solver.data.map.Cursor;
import org.eclipse.viatra.solver.data.map.VersionedMap;

public class MapCursor<K,V> implements Cursor<K,V> {
	// Constants
	static final int INDEX_START = -1;
	static final int INDEX_FINISH = -2;
	
	// Tree stack
	ArrayDeque<Node<K,V>> nodeStack;
	ArrayDeque<Integer> nodeIndexStack;
	int dataIndex;
	
	// Values
	K key;
	V value;
	
	// Hash code for checking concurrent modifications
	final VersionedMap<K,V> map;
	final int creationHash; 
	
	public MapCursor(Node<K, V> root, VersionedMap<K,V> map) {
		// Initializing tree stack
		super();
		this.nodeStack = new ArrayDeque<>();
		this.nodeIndexStack = new ArrayDeque<>();
		if(root != null) {
			this.nodeStack.add(root);
			this.nodeIndexStack.push(INDEX_START);
		}
		
		this.dataIndex = INDEX_START;
		
		// Initializing cache
		this.key = null;
		this.value = null;
		
		// Initializing state
		this.map=map;
		this.creationHash = map.hashCode();
	}
	
	public K getKey() {
		return key;
	}
	
	public V getValue() {
		return value;
	}
	
	public boolean isTerminated() {
		return this.nodeStack.isEmpty();
	}
	
	public boolean move() {
		if(isDirty()) {
			throw new ConcurrentModificationException();
		}
		if(!isTerminated()) {
			boolean result = this.nodeStack.peek().moveToNext(this);
			if(this.nodeIndexStack.size() != this.nodeStack.size()) {
				throw new IllegalArgumentException("Node stack is corrupted by illegal moves!");
			}
			return result;
		}
		return false;
	}
	public boolean skipCurrentNode() {
		nodeStack.pop();
		nodeIndexStack.pop();
		dataIndex = INDEX_FINISH;
		return move();
	}
	@Override
	public boolean isDirty() {
		return this.map.hashCode() != this.creationHash;
	}
	@Override
	public List<VersionedMap<?, ?>> getDependingMaps() {
		return List.of(this.map);
	}
	
	public static <K,V> boolean sameSubnode(MapCursor<K,V> cursor1, MapCursor<K,V> cursor2) {
		Node<K, V> nodeOfCursor1 = cursor1.nodeStack.peek();
		Node<K, V> nodeOfCursor2 = cursor2.nodeStack.peek();
		if(nodeOfCursor1 != null && nodeOfCursor2 != null) {
			return nodeOfCursor1.equals(nodeOfCursor2);
		} else {
			return false;
		}
	}
	
	/**
	 * 
	 * @param <K>
	 * @param <V>
	 * @param cursor1
	 * @param cursor2
	 * @return Positive number if cursor 1 is behind, negative number if cursor 2 is behind, and 0 if they are at the same position.
	 */
	public static <K,V> int compare(MapCursor<K,V> cursor1, MapCursor<K,V> cursor2) {
		// two cursors are equally deep
		Iterator<Integer> stack1 = cursor1.nodeIndexStack.descendingIterator();
		Iterator<Integer> stack2 = cursor2.nodeIndexStack.descendingIterator();
		if(stack1.hasNext()) {
			if(!stack2.hasNext()) {
				// stack 2 has no more element, thus stack 1 is deeper
				return 1;
			}
			int val1 = stack1.next();
			int val2 = stack2.next();
			if(val1 < val2) {
				return -1;
			} else if(val2 < val1) {
				return 1;
			}
		}
		if(stack2.hasNext()) {
			// stack 2 has more element, thus stack 2 is deeper
			return 1;
		}
		return Integer.compare(cursor1.dataIndex, cursor2.dataIndex);
	}
}
