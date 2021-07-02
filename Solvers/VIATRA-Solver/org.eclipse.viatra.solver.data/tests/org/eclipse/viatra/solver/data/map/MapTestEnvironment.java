package org.eclipse.viatra.solver.data.map;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import junit.framework.AssertionFailedError;

public class MapTestEnvironment<KEY,VALUE> {
	VersionedMap<KEY, VALUE> sut;
	Map<KEY,VALUE> oracle = new HashMap<KEY, VALUE>();
	
	public MapTestEnvironment(VersionedMap<KEY, VALUE> sut) {
		this.sut = sut;
	}
	
	public void put(KEY key, VALUE value) {
		sut.put(key, value);
		oracle.put(key, value);
	}
	
	public void checkEquivalence() {
		int nonDefault = 0;
		for(Entry<KEY, VALUE> entry : oracle.entrySet()) {
			VALUE sutAnswer = sut.get(entry.getKey());
			VALUE oracleAnswer1 = entry.getValue();
			VALUE oracleAnswer2 = (oracleAnswer1 == null)?sut.getDefaultValue():oracleAnswer1;
			if(sutAnswer!=oracleAnswer2) {
				fail("Non-equivalent gets: " + sutAnswer + " != " + oracleAnswer2 + "<-[oracle]") ;
			}
			if(entry.getValue() != sut.getDefaultValue()) {
				nonDefault++;
			}
		}
		int sutNonDefault = sut.getSize();
		assertEquals(sutNonDefault, nonDefault);
	}
}
