package hu.bme.mit.inf.dslreasoner.util

import java.util.HashSet
import java.util.LinkedList
import java.util.List
import java.util.Map
import java.util.Set
import org.eclipse.xtext.xbase.lib.Functions.Function1
import java.util.HashMap
import java.util.LinkedHashMap
import org.eclipse.emf.ecore.EObject

class CollectionsUtil {
	public def static <FROM,TO> TO lookup(FROM from, Map<? super FROM,TO> map) {
		if(map.containsKey(from)) {
			return map.get(from)
		} else {
			val proxys = map.values.filter(EObject).filter[it.eIsProxy]
			var message = '''
			The map does not contains the key "«from.toString»"!
			--- Elements: ---
			«FOR entry : map.entrySet SEPARATOR '\n'»«entry.key» -> «entry.value»«ENDFOR»
			-----------------'''
			if(!proxys.empty) {
				message = '''
				The map contains Proxy objects: «proxys.toList»
				«message»
				'''
			}
			throw new IllegalArgumentException(message);
		}
	}
	public def <FROM,TO> TO ifThenElse(FROM source, Function1<FROM,Boolean> condition, Function1<FROM,TO> ifTrue, Function1<FROM,TO> ifFalse) {
		if(condition.apply(source)) {
			return ifTrue.apply(source)
			}
		else {
			return ifFalse.apply(source)
		}
	}
	public def static <Key,Value> Union(Map<Key,Value> a, Map<Key,Value> b) {
		(a.keySet + b.keySet).toInvertedMap[key |
			if(a.containsKey(key)) a.get(key)
			else b.get(key)
		]
	}
	public def static <Key,Value> putOrAddToSet(Map<Key,Set<Value>> map, Key key, Value value) {
		if(map.containsKey(key)) {
			map.get(key).add(value)
		}else{
			val set = new HashSet<Value>() => [it.add(value)]
			map.put(key, set)
		}
	}
	public def static <Key,Value> putOrAddToList(Map<Key,List<Value>> map, Key key, Value value) {
		if(map.containsKey(key)) {
			map.get(key).add(value)
		}else{
			val set = new LinkedList<Value>() => [it.add(value)]
			map.put(key, set)
		}
	}
	def public static <From,To,Property> Map<From,To> copyMap(Map<From,To> oldMap, Iterable<To> newValues, Function1<To,Property> indexExtractor) {
		val Map<Property,To> valueIndexes = newValues.toMap[to|indexExtractor.apply(to)];
		val res = oldMap.mapValues[value | indexExtractor.apply(value).lookup(valueIndexes)]
//		println('''from:''')
//		newValues.forEach[println(it)]
//		println('''old:''')
//		oldMap.values.forEach[println(it)]
//		println('''new:''')
//		res.values.forEach[println(it)]
		return res
	}
	
	def public static <From,To> Map<To,From> bijectiveInverse(Map<From,To> m) { m.keySet.toMap[x|x.lookup(m)] }
	def public static <From,To> Map<To,List<From>> inverse(Map<From,To> m) {
		val res = new LinkedHashMap<To,List<From>>
		m.entrySet.forEach[res.putOrAddToList(it.value,it.key)]
		return res
	}
	
	def public static <Type> List<Type> transitiveClosurePlus(Type source, Function1<Type,Iterable<Type>> next) {
		val res = new LinkedList()
		transitiveClosureHelper(res,source,next)
		return res
	}
	def public static <Type> List<Type> transitiveClosureStar(Type source, Function1<Type,Iterable<Type>> next) {
		val res = new LinkedList()
		res += source
		transitiveClosureHelper(res,source,next)
		return res
	}
	def private static <Type> void transitiveClosureHelper(List<Type> result, Type actual, Function1<Type,Iterable<Type>> next) {
		val front = next.apply(actual)
		for(elementInFront : front) {
			result += elementInFront
			transitiveClosureHelper(result,elementInFront,next)
		}
	}
}
