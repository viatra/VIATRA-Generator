package org.eclipse.viatra.solver.data.model.hashTests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.eclipse.viatra.solver.data.map.ContinousHashProvider;
import org.eclipse.viatra.solver.data.model.Tuple;
import org.eclipse.viatra.solver.data.model.TupleHashProvider;
import org.eclipse.viatra.solver.data.model.TupleHashProviderBitMagic;
import org.junit.jupiter.api.Test;

class HashEfficiencyTest {

	private static List<Tuple> permutations(int range, int arity) {
		if(arity == 1) {
			List<Tuple> result = new ArrayList<>(range);
			for(int i=0; i<range; i++) {
				result.add(Tuple.of(i));
			}
			return result;
		} else if(arity > 1) {
			List<Tuple> smallers = permutations(range, arity-1);
			List<Tuple> result = new ArrayList<>(range*smallers.size());
			for(Tuple smaller : smallers) {
				for(int i=0; i<range; i++) {
					int[] larger = new int[arity];
					for(int x = 0; x<smaller.getSize(); x++) {
						larger[x] = smaller.get(x);
					}
					larger[arity-1] = i;
					result.add(Tuple.of(larger));
				}
			}
			return result;
		} else throw new IllegalArgumentException();
	}
	
	private static int amountToRange(int arity, int n) {
		int range = 1;
		while(Math.pow(range,arity)<n+0.1) {
			range++;
		}
		return 1024;
	}
	
	public static List<Tuple> nPermutations(int arity, int n) {
		int range = amountToRange(arity, n);
		List<Tuple> permutations = permutations(range, arity);
		return permutations.subList(0, n);
	}

	public static List<Tuple> nRandoms(int arity, int n, int seed) {
		int range = amountToRange(arity, n);
		List<Tuple> permutations = new ArrayList<>(n);
		Random r = new Random(seed);
		for(int i = 0; i<n; i++) {
			int[] tuple = new int[arity];
			for(int j=0; j<arity; j++) {
				tuple[j] = r.nextInt(range);
			}
			permutations.add(Tuple.of(tuple));
		}
		return permutations;
	}
	
	@Test
	void permutationTest() {
		List<Tuple> p = permutations(10, 2);
		assertEquals(p.size(),10*10);
	}
//	private void printTuples(List<Tuple> p) {
//		for(Tuple element : p) {
//			System.out.println(element);
//		}
//	}
	@Test
	void nPermutationTest() {
		final int amount = 500;
		List<Tuple> p = nPermutations(2, amount);
		assertEquals(amount,p.size());
	}
	@Test
	void nRandomTest() {
		final int amount = 500;
		List<Tuple> p = nRandoms(2, amount, 1);;
		assertEquals(amount,p.size());
	}
	private static double calculateHashClashes(List<Tuple> tuples, ContinousHashProvider<Tuple> chp) {
		int sumClashes = 0;
		
		for(int i = 0; i<tuples.size(); i++) {
			int height = 0;
			for(int j=0; j<tuples.size(); j++) {
				int clashes = calculateHashClash(chp, tuples.get(i), tuples.get(j));
				height = Math.max(height, clashes);
			}
			sumClashes += height;
		}
		return (sumClashes+0.0) / tuples.size();
	}
	private static int calculateHashClash(ContinousHashProvider<Tuple> chp, Tuple a, Tuple b) {
		if(a.equals(b)) return 0;
		final int bits = 5;
		final int segments = Integer.SIZE/bits;
		final int mask = (1<<bits)-1;
		for(int i = 0;;i++) {
			int index = i/segments;
			int depth = i%segments;
			int aHash = (chp.getHash(a, index)>>(depth*5))&mask;
			int bHash = (chp.getHash(b, index)>>(depth*5))&mask;
			if(aHash != bHash) {
				return i+1;
			}
			if(i>400) {
				throw new IllegalStateException(a+" vs "+b);
			}
		}
	}
	private static double caclulateOptimalHashClash(int size) {
		return (Math.log(size)/Math.log(32));
	}
	public static void main(String[] args) {
		List<String> hashNames = new LinkedList<>();
		List<ContinousHashProvider<Tuple>> hashes = new LinkedList<>();
		hashNames.add("PrimeGroup");
		hashes.add(new TupleHashProvider());
		hashNames.add("BitMagic");
		hashes.add(new TupleHashProviderBitMagic());
		
		int[] arities = new int[] {2,3,4,5};
		int[] sizes = new int[] {32*32,32*32*8};
		
		System.out.println("Size,Arity,DataSource,Hash,Chashes,Optimal,Badness");
		for(int size : sizes) {
			double optimalClashes = caclulateOptimalHashClash(size);
			for(int arity : arities) {
				List<String> dataSourceNames = new LinkedList<>();
				List<List<Tuple>> dataSources = new LinkedList<>();
				
//				dataSourceNames.add("Permutation");
//				dataSources.add(nPermutations(arity, size));
				dataSourceNames.add("Random");
				dataSources.add(nRandoms(arity, size, 0));
				
				for(int dataSourceIndex = 0; dataSourceIndex<dataSourceNames.size(); dataSourceIndex++) {
					for(int hashIndex = 0; hashIndex<hashNames.size(); hashIndex++) {
						double clashes = calculateHashClashes(dataSources.get(dataSourceIndex),hashes.get(hashIndex));
						System.out.println(
							size+","+arity+","+dataSourceNames.get(dataSourceIndex)+","+hashNames.get(hashIndex)+","+
							clashes+","+optimalClashes+","+(clashes+0.0)/optimalClashes);
					}
				}
			}
		}
	}
}
