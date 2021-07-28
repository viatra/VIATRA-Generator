package org.eclipse.viatra.solver.data.map.internal;

import java.util.ArrayDeque;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

import org.eclipse.viatra.solver.data.map.Cursor;
import org.eclipse.viatra.solver.data.map.VersionedMap;

public class MapCursor<KEY,VALUE> implements Cursor<KEY,VALUE> {
	// Constants
	static int IndexStart = -1;
	static int IndexFinish = -2;
	
	// Tree stack
	ArrayDeque<Node<KEY,VALUE>> nodeStack;
	ArrayDeque<Integer> nodeIndexStack;
	int dataIndex;
	
	// Values
	KEY key;
	VALUE value;
	
	// Hash code for checking concurrent modifications
	final VersionedMap<KEY,VALUE> map;
	final int creationHash; 
	
	public MapCursor(Node<KEY, VALUE> root, VersionedMap<KEY,VALUE> map) {
		// Initializing tree stack
		super();
		this.nodeStack = new ArrayDeque<>();
		if(root != null) {
			this.nodeStack.add(root);
		}
		this.nodeIndexStack = new ArrayDeque<>();
		this.nodeIndexStack.push(IndexStart);
		this.dataIndex = IndexStart;
		
		// Initializing cache
		this.key = null;
		this.value = null;
		
		// Initializing state
		this.map=map;
		this.creationHash = map.hashCode();
	}
	
	public KEY getKey() {
		return key;
	}
	
	public VALUE getValue() {
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
			return this.nodeStack.peek().moveToNext(this);
		}
		return false;
	}
	public boolean skipCurrentNode() {
		nodeStack.pop();
		nodeIndexStack.pop();
		dataIndex = IndexFinish;
		return move();
	}
	@Override
	public boolean isDirty() {
		return this.map.hashCode() != this.creationHash;
	}
	@Override
	public List<VersionedMap<KEY, VALUE>> getDependingMaps() {
		return List.of(this.map);
	}
	
	public static <KEY,VALUE> boolean sameSubnode(MapCursor<KEY,VALUE> cursor1, MapCursor<KEY,VALUE> cursor2) {
		Node<KEY, VALUE> nodeOfCursor1 = cursor1.nodeStack.peek();
		Node<KEY, VALUE> nodeOfCursor2 = cursor2.nodeStack.peek();
		return nodeOfCursor1.equals(nodeOfCursor2);
	}
	
	/**
	 * 
	 * @param <KEY>
	 * @param <VALUE>
	 * @param cursor1
	 * @param cursor2
	 * @returnv Positive number if cursor 1 is behind, negative number if cursor 2 is behind, and 0 if they are at the same position.
	 */
	public static <KEY,VALUE> int compare(MapCursor<KEY,VALUE> cursor1, MapCursor<KEY,VALUE> cursor2) {
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
