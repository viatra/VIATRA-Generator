package org.eclipse.viatra.solver.data.map.internal;

import java.util.Iterator;
import java.util.Map;

public abstract class NodeIterator<NODETYPE extends Node<KEY,VALUE>,KEY,VALUE>
	implements Iterator<Map.Entry<KEY,VALUE>>
{
	protected NODETYPE node;
	public NodeIterator(NODETYPE node) {
		this.node = node;
	}
}
