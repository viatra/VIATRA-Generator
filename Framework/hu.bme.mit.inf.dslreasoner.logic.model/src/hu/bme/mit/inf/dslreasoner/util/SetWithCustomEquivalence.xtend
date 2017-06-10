package hu.bme.mit.inf.dslreasoner.util

import org.eclipse.xtext.xbase.lib.Functions.Function1
import java.util.HashMap
import java.util.Set
import java.util.Collection
import java.util.HashSet

class SetWithCustomEquivalence<Type,Representation> implements Set<Type>{
	val Function1<Type,Representation> representer;
	val HashMap<Representation,Type> map
	
	public new(Function1<Type,Representation> representer) {
		this.representer = representer
		this.map = new HashMap<Representation,Type>
	}
	public new(Function1<Type,Representation> representer, Collection<? extends Type> initialElements) {
		this.representer = representer
		this.map = new HashMap
		initialElements.forEach[add]
	}
	
	override add(Type arg0) {
		val representation = representer.apply(arg0)
		if(!map.containsKey(representation)) {
			map.put(representation,arg0);
			return true
		} else return false
	}
	
	override addAll(Collection<? extends Type> arg0) {
		val originalSize = this.size
		arg0.forEach[add(it)]
		return (this.size != originalSize)
	}
	
	override clear() {
		map.clear
	}
	
	override contains(Object arg0) {
		try {
			val rep = this.representer.apply(arg0 as Type)
			return map.containsKey(rep)
		} catch (ClassCastException e) {
			return false
		}
	}
	
	override containsAll(Collection<?> arg0) {
		arg0.forall[it.contains]
	}
	
	override isEmpty() {
		return map.isEmpty
	}
	
	override iterator() {
		return map.values.iterator
	}
	
	override remove(Object arg0) {
		try {
			val rep = this.representer.apply(arg0 as Type)
			return map.remove(rep) != null
		} catch (ClassCastException e) {
			return false
		}
	}
	
	override removeAll(Collection<?> arg0) {
		val originalSize = this.size
		arg0.forEach[remove(it)]
		return (this.size != originalSize)
	}
	
	override retainAll(Collection<?> arg0) {
		val Set<Representation> representationsOfArg0 = new HashSet
		for(element: arg0) {
			try {
				representationsOfArg0 += this.representer.apply(element as Type)
			} catch(ClassCastException e) {}
		}
		val originalSize = this.size
		for(r:this.map.keySet) {
			if(!representationsOfArg0.contains(r))
				this.map.remove(r)
		}
		return (this.size != originalSize)
	}
	
	override size() {
		return this.map.size
	}
	
	override toArray() {
		map.values.toArray
	}
	
	override <T> toArray(T[] arg0) {
		map.values.toArray(arg0)
	}
}