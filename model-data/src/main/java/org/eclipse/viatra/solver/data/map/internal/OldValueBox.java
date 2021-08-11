package org.eclipse.viatra.solver.data.map.internal;

public class OldValueBox<V>{
	V oldValue;
	boolean isSet = false;

	public V getOldValue() {
		if(!isSet) throw new IllegalStateException();
		isSet = false;
		return oldValue;
	}

	public void setOldValue(V ouldValue) {
		if(isSet) throw new IllegalStateException();
		this.oldValue = ouldValue;
		isSet = true;
	}
	
}
