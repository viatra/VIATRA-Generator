package org.eclipse.viatra.solver.data.map;

import static org.junit.Assert.fail;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.TreeSet;

public class MapTestEnvironment<KEY,VALUE> {
	VersionedMap<KEY, VALUE> sut;
	Map<KEY,VALUE> oracle = new HashMap<KEY, VALUE>();
	
	public MapTestEnvironment(VersionedMap<KEY, VALUE> sut) {
		this.sut = sut;
	}
	
	public void put(KEY key, VALUE value) {
		sut.put(key, value);
		if(value != sut.defaultValue) {
			oracle.put(key, value);
		} else {
			oracle.remove(key);
		}
	}
	
	public void checkEquivalence(String title) {
		// 1. Checking: if Reference contains <key,value> pair, then SUT contains <key,value> pair.
		// Tests get functions
		for(Entry<KEY, VALUE> entry : oracle.entrySet()) {
			VALUE sutValue = sut.get(entry.getKey());
			VALUE oracleValue = entry.getValue();
			if(sutValue!=oracleValue) {
				printComparison();
				fail(title + ": Non-equivalent get("+entry.getKey()+") results: SUT=" + sutValue + ", Oracle=" + oracleValue + "!") ;
			}
		}
		
		// 2. Checking: if SUT contains <key,value> pair, then Reference contains <key,value> pair.
		// Tests iterators
		// TODO: Counts the number of elements in the entryset
		int elementsInSutEntrySet = 0;
		Iterator<Entry<KEY, VALUE>> iterator = sut.getIterator();
		while(iterator.hasNext()) {
			elementsInSutEntrySet++;
			Entry<KEY, VALUE> entry = iterator.next();
			KEY key = entry.getKey();
			VALUE sutValue = entry.getValue();
			//System.out.println(key + " -> " + sutValue);
			VALUE oracleValue = oracle.get(key);
			if(sutValue != oracleValue) {
				printComparison();
				fail(title+": Non-equivalent entry in iterator: SUT=<"+key+","+sutValue+">, Oracle=<"+key+","+oracleValue+">!");
			}
			
		}
		
		// 3. Checking sizes
		// Counting of non-default value pairs.
		int oracleSize = oracle.entrySet().size();
		int sutSize = sut.getSize();
		if(oracleSize != sutSize || oracleSize != elementsInSutEntrySet) {
			printComparison();
			fail(title + ": Non-eqivalent size() result: SUT.getSize()="+sutSize+", SUT.entryset.size="+elementsInSutEntrySet+", Oracle="+oracleSize+"!" );
		}
		
		//assertEquals(sutNonDefault, sizeOfNondefaults);
	}
	public void printComparison() {
		System.out.println("SUT:");
		printEntrySet(sut.getIterator());
		System.out.println("Oracle:");
		printEntrySet(oracle.entrySet().iterator());
	}
	private void printEntrySet(Iterator<Entry<KEY, VALUE>> iterator) {
		TreeMap<KEY, VALUE> treemap= new TreeMap<>();
		while(iterator.hasNext()) {
			Entry<KEY, VALUE> entry = iterator.next();
			treemap.put(entry.getKey(),entry.getValue());
		}
		for(Entry<KEY, VALUE> e : treemap.entrySet()) {
			System.out.println("\t" + e.getKey() + " -> " + e.getValue());
		}
	}
}
