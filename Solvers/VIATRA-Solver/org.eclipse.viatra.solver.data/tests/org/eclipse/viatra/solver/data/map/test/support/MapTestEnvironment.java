package org.eclipse.viatra.solver.data.map.test.support;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.eclipse.viatra.solver.data.map.ContinousHashProvider;
import org.eclipse.viatra.solver.data.map.Cursor;
import org.eclipse.viatra.solver.data.map.internal.VersionedMapImpl;

public class MapTestEnvironment<KEY,VALUE> {
	public static String[] prepareValues(int maxValue) {
		String[] values = new String[maxValue];
		values[0] = "DEFAULT";
		for(int i = 1; i<values.length; i++) {
			values[i] = "VAL"+i;
		}
		return values;
	}
	
	//private static final int maxPrime = 2147483629;
	public static ContinousHashProvider<Integer> prepareHashProvider(final boolean evil) {
		ContinousHashProvider<Integer> chp = new ContinousHashProvider<Integer>() {
			
			@Override
			public int getHash(Integer key, int index) {
				if(evil && index < 100 && index < key/3) {
					return 7;
				}
				int result = 1;
				final int prime = 31;
				
				result = prime*result + key;
				result = prime*result + index;
				
				return result;
			}
		};
		return chp;
	}
	
	public static <KEY, VALUE> void compareTwoMaps(String title, VersionedMapImpl<KEY, VALUE> map1, VersionedMapImpl<KEY, VALUE> map2) {
		//1. Comparing cursors.
		Cursor<KEY, VALUE> cursor1 = map1.getCursor();
		Cursor<KEY, VALUE> cursor2 = map2.getCursor();
		while(!cursor1.isTerminated()) {
			if(cursor2.isTerminated()) {
				fail("cursor 2 terminated before cursor1");
			}
			assertEquals(cursor1.getKey(), cursor2.getKey());
			assertEquals(cursor2.getValue(), cursor2.getValue());
			cursor1.move();
			cursor2.move();
		}
		if(!cursor2.isTerminated()) fail("cursor 1 terminated before cursor 2");
		
		// 2.1. comparing hash codes
		assertEquals(map1.hashCode(), map2.hashCode(), title+": hash code check");
		assertTrue(title+": 1.equals(2)", map1.equals(map2));
		assertTrue(title+": 2.equals(1)", map2.equals(map1));
	}
	
	public VersionedMapImpl<KEY, VALUE> sut;
	Map<KEY,VALUE> oracle = new HashMap<KEY, VALUE>();
	
	public MapTestEnvironment(VersionedMapImpl<KEY, VALUE> sut) {
		this.sut = sut;
	}
	
	public void put(KEY key, VALUE value) {
		sut.put(key, value);
		if(value != sut.getDefaultValue()) {
			oracle.put(key, value);
		} else {
			oracle.remove(key);
		}
	}
	
	public void checkEquivalence(String title) {
		// 0. Checking integrity
		try {
			sut.checkIntegrity();
		} catch(IllegalStateException e) {
			fail(title + ":  " + e.getMessage());
		}
		
		
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
		long sutSize = sut.getSize();
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
