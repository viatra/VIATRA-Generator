package org.eclipse.viatra.solver.data.map.internal;

import java.util.ArrayDeque;
import java.util.ConcurrentModificationException;
import java.util.Deque;

import org.eclipse.viatra.solver.data.map.Cursor;
import org.eclipse.viatra.solver.data.map.VersionedMap;

public class MapCursor<KEY,VALUE> implements Cursor<KEY,VALUE> {
	// Constants
	static int IndexStart = -1;
	static int IndexFinish = -2;
	
	// Tree stack
	Deque<Node<KEY,VALUE>> nodeStack;
	Deque<Integer> nodeIndexStack;
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
		
		// move to first
		move();
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
		} else {
			return false;
		}
	}
	
	public boolean isDirty() {
		return this.map.hashCode() != this.creationHash;
	}
}
