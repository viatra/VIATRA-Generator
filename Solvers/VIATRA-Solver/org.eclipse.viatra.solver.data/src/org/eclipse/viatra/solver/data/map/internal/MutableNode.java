package org.eclipse.viatra.solver.data.map.internal;

import org.eclipse.viatra.solver.data.map.ContinousHashProvider;

public class MutableNode<KEY,VALUE> extends Node<KEY,VALUE> {
	Object[] content;
	protected MutableNode() {
		this.content = new Object[2*factor];
	}
	public static <KEY,VALUE> MutableNode<KEY,VALUE> initialize(
			KEY key, VALUE value,
			ContinousHashProvider<? super KEY> hashProvider,
			VALUE defaultValue)
	{
		if(value == defaultValue) {
			return null;
		} else {
			int hash = hashProvider.getHash(key, 0);
			int fragment = hashFragment(hash, 0);
			MutableNode<KEY, VALUE> res = new MutableNode<KEY, VALUE>();
			res.content[2*fragment] = key;
			res.content[2*fragment+1] = value;
			return res;
		}
	}
	
	protected MutableNode(ImmutableNode<KEY,VALUE> node) {
		this.content = new Object[2*factor]; 
		int dataUsed=0;
		int nodeUsed=0;
		for(int i=0; i<factor; i++) {
			int bitposition = 1 << i;
			if((node.dataMap & bitposition) != 0) {
				content[2*i] = this.content[dataUsed*2];
				content[2*i+1] = this.content[dataUsed*2+1];
				dataUsed++;
			} else if((node.nodeMap & bitposition) != 0) {
				content[2*i+1] = this.content[this.content.length-1-nodeUsed];
				nodeUsed++;
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public VALUE getValue(KEY key, ContinousHashProvider<? super KEY> hashProvider, VALUE defaultValue, int hash, int depth) {
		int selectedHashFragment = hashFragment(hash,shiftDepth(depth));
		KEY keyCandidate = (KEY) content[2*selectedHashFragment];
		if(keyCandidate != null) {
			if(hashProvider.equals(keyCandidate, key)) {
				return (VALUE) content[2*selectedHashFragment+1];
			} else {
				return defaultValue;
			}
		} else {
			Node<KEY,VALUE> nodeCandidate = (Node<KEY,VALUE>) content[2*selectedHashFragment+1];
			if(nodeCandidate != null) {
				int newHash = newHash(hashProvider, key, hash, depth);
				int newDepth = depth+1;
				return (VALUE) nodeCandidate.getValue(key, hashProvider, defaultValue, newHash, newDepth);
			} else {
				return defaultValue;
			}
		}
	}
	
	private boolean hasContent() {
		for(Object element : this.content) {
			if(element != null) return true;
		}
		return false;
	}

	private MutableNode<KEY,VALUE> createNewNode(
			ContinousHashProvider<? super KEY> hashProvider,
			KEY key1, VALUE value1, int oldHash1,
			KEY key2, VALUE value2, int oldHash2,
			int newdepth)
	{
		int newHash1 = newHash(hashProvider, key1, oldHash1, newdepth);
		int newHash2 = newHash(hashProvider, key2, oldHash2, newdepth);
		int newFragment1 = hashFragment(newHash1, newdepth);
		int newFragment2 = hashFragment(newHash2, newdepth);
		
		MutableNode<KEY,VALUE> subNode = new MutableNode<KEY,VALUE>();
		if(newFragment1 != newFragment2) {
			subNode.content[newFragment1*2]=key1;
			subNode.content[newFragment1*2+1]=value1;
			
			subNode.content[newFragment2*2]=key2;
			subNode.content[newFragment2*2+1]=value2;
			return subNode;
		} else {
			MutableNode<KEY,VALUE> subSubNode = createNewNode(
					hashProvider,
					key1, value1, newHash1,
					key2, value2, newHash2,
					newdepth+1);
			subNode.content[newFragment1*2+1] = subSubNode;
			return subNode;
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Node<KEY,VALUE> putValue(KEY key, VALUE value, ContinousHashProvider<? super KEY> hashProvider, VALUE defaultValue, int hash, int depth) {
		int selectedHashFragment = hashFragment(hash,shiftDepth(depth));
		KEY keyCandidate = (KEY) content[2*selectedHashFragment];
		if(keyCandidate != null) {
			if(hashProvider.equals(keyCandidate,key)) {
				// Update entry
				if(value == defaultValue) {
					return removeEntry(selectedHashFragment);
				} else {
					return updateValue(value, selectedHashFragment);
				}
			} else {
				if(value == defaultValue) {
					// dont need to add new node
					return this;
				} else {
					// Split entry: data -> node
					return moveDown(key, value, hashProvider, hash, depth, selectedHashFragment, keyCandidate);
				}
			}
		} else {
			Node<KEY,VALUE> nodeCandidate =  (Node<KEY,VALUE>) content[2*selectedHashFragment+1];
			if(nodeCandidate != null) {
				Node<KEY, VALUE> newNode = nodeCandidate.putValue(key, value, hashProvider, defaultValue, newHash(hashProvider, key, hash, depth+1), depth+1);
				return updateSubNode(selectedHashFragment,newNode);
			} else {
				content[2*selectedHashFragment] = key;
				return updateValue(value, selectedHashFragment);
			}
		}
	}
	
	Node<KEY, VALUE> updateSubNode(int selectedHashFragment, Node<KEY, VALUE> newNode) {
		content[2*selectedHashFragment+1] = newNode;
		for(int i = 0; i<this.content.length; i++) {
			if(content[i]!=null) return this;
		}
		return null;
	}
	
	@SuppressWarnings("unchecked")
	Node<KEY, VALUE> moveDown(
			KEY key, VALUE value,
			ContinousHashProvider<? super KEY> hashProvider, int hash,
			int depth, int selectedHashFragment, KEY keyCandidate) {
		KEY previousKey = keyCandidate;
		VALUE previousValue = (VALUE) content[2*selectedHashFragment+1];
		
		MutableNode<KEY,VALUE> subNode = createNewNode(
			hashProvider,
			previousKey, previousValue, hashProvider.getHash(previousKey, hashDepth(depth)),
			key, value, hash,
			depth+1);
		
		content[2*selectedHashFragment] = null;
		content[2*selectedHashFragment+1] = subNode;
		return this;
	}
	
	Node<KEY, VALUE> updateValue(VALUE value, int selectedHashFragment) {
		content[2*selectedHashFragment+1] = value;
		return this;
	}
	Node<KEY, VALUE> removeEntry(int selectedHashFragment) {
		content[2*selectedHashFragment] = null;
		content[2*selectedHashFragment+1] = null;
		if(hasContent()) {
			return this;
		} else {
			return null;
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public int getSize() {
		int size = 0;
		for(int i=0; i<factor; i++) {
			if(content[i*2]!=null) {
				size++;
			} else{
				 Node<KEY,VALUE> nodeCandidate = (Node<KEY, VALUE>) content[i*2+1];
				 if(nodeCandidate!=null) {
					 size+=nodeCandidate.getSize();
				 }
			}
		}
		return size;
	}

	@Override
	protected MutableNode<KEY,VALUE> toMutable() {
		return this;
	}
	
	@Override
	protected ImmutableNode<KEY,VALUE> toImmutable() {
		return new ImmutableNode<KEY,VALUE>(this);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	boolean moveToNext(MapCursor<KEY, VALUE> cursor) {
		// 1. try to move to data
		if(cursor.dataIndex != MapCursor.IndexFinish) {
			for(int index = cursor.dataIndex+1; index < factor; index++) {
				if(this.content[index*2]!=null) {
					// 1.1 found next data
					cursor.dataIndex = index;
					cursor.key = (KEY) this.content[index*2];
					cursor.value = (VALUE) this.content[index*2+1];
					return true;
				}
			}
		}
		cursor.dataIndex = MapCursor.IndexFinish;
		// 2. look inside the subnodes
		for(int index = cursor.nodeIndexStack.peek()+1; index < factor; index++) {
			if(this.content[index*2]==null && this.content[index*2+1] !=null) {
				// 2.1 found next subnode, move down to the subnode
				Node<KEY, VALUE> subnode = (Node<KEY, VALUE>) this.content[index*2+1];
				
				cursor.dataIndex = MapCursor.IndexStart;
				cursor.nodeStack.add(subnode);
				cursor.nodeIndexStack.add(index);
				
				return subnode.moveToNext(cursor);
			}
		}
		// 3. no subnode found, move up
		cursor.nodeStack.pop();
		cursor.nodeIndexStack.pop();
		if(!cursor.nodeStack.empty()) {
			Node<KEY, VALUE> supernode = cursor.nodeStack.peek();
			return supernode.moveToNext(cursor);
		} else {
			cursor.key = null;
			cursor.value = null;
			return false;
		}
	}
	
	@Override
	protected void prettyPrint(StringBuilder builder, int depth, int code) {
		for(int i = 0; i<depth; i++) {
			builder.append("\t");
		}
		if(code>=0) {
			builder.append(code);
			builder.append(":");
		}
		builder.append("Mutable(");
		boolean hadContent = false;
		for(int i = 0; i<factor; i++) {
			if(content[2*i] != null) {
				if(hadContent) {
					builder.append(",");
				}
				builder.append(i);
				builder.append(":[");
				builder.append(content[2*i].toString());
				builder.append("]->[");
				builder.append(content[2*i+1].toString());
				builder.append("]");
				hadContent = true;
			}
		}
		builder.append(")");
		for(int i = 0; i<factor; i++) {
			if(content[2*i] == null || content[2*i+1]!=null) {
				@SuppressWarnings("unchecked")
				Node<KEY,VALUE> subNode = (Node<KEY, VALUE>) content[2*i+1];
				builder.append("\n");
				subNode.prettyPrint(builder, depth+1, i);
			}
		}
	}
}
