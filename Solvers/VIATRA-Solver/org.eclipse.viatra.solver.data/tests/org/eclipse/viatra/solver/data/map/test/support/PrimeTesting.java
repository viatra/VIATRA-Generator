package org.eclipse.viatra.solver.data.map.test.support;

public class PrimeTesting {

	public static void main(String[] args) {
		int max = 2;
		for(int i=2147482647; i<Integer.MAX_VALUE; i++) {
			if(isPrime(i) ) {
				max = i;
				System.out.println(max);
			}
		}
		System.out.println(max);
	}
	private static boolean isPrime(int x) {
		for(int tester = 2; tester < Math.sqrt(x); tester++) {
			if(x%tester == 0) {
				return false;
			}
		}
		return true;
	}
}
