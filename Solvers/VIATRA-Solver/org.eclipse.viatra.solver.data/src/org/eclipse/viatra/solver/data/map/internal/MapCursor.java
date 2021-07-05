package org.eclipse.viatra.solver.data.map.internal;

import java.util.Stack;

public class MapCursor<KEY,VALUE> {
	// Constants
	static int IndexStart = -1;
	static int IndexFinish = -2;
	
	// Tree stack
	Stack<Node<KEY,VALUE>> nodeStack;
	Stack<Integer> nodeIndexStack;
	int dataIndex;
	
	// Values
	KEY key;
	VALUE value;
	
	public MapCursor(Node<KEY, VALUE> root) {
		// Initializing tree stack
		super();
		this.nodeStack = new Stack<>();
		if(root != null) {
			this.nodeStack.add(root);
		}
		this.nodeIndexStack = new Stack<>();
		this.nodeIndexStack.push(IndexStart);
		this.dataIndex = IndexStart;
		
		// Initializing cache
		this.key = null;
		this.value = null;
		
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
		return this.nodeStack.empty();
	}
	
	public boolean move() {
		if(!isTerminated()) {
			return this.nodeStack.peek().moveToNext(this);
		} else {
			return false;
		}
	}
}
