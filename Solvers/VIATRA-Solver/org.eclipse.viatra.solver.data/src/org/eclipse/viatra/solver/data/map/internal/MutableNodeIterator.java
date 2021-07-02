package org.eclipse.viatra.solver.data.map.internal;

import java.util.Map.Entry;

public class MutableNodeIterator<KEY,VALUE> extends NodeIterator<MutableNode<KEY,VALUE>,KEY, VALUE>{
	
	public MutableNodeIterator(MutableNode<KEY, VALUE> node) {
		super(node);
	}
	
	/**
	 * Index of the last result value;
	 */
	int index = -1;
	NodeIterator<KEY,VALUE> actualSubNode = null;
	
	@Override
	public boolean hasNext() {
		for(int i = index; i<node.factor; i++) {
			
		}
		return false;
	}
	@Override
	public Entry<KEY, VALUE> next() {
		// TODO Auto-generated method stub
		return null;
	}
}
