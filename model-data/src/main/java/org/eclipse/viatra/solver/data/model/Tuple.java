package org.eclipse.viatra.solver.data.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Tuple {
	private static final int CUSTOMTUPLESIZE = 2;
	protected static final List<Tuple1> tuple1Cash = new ArrayList<>(1024);
	
	public abstract int getSize();
	public abstract int get(int element);
	public abstract int[] toArray();
	
	@Override
	public String toString() {
		StringBuilder b = new StringBuilder();
		b.append("[");
		for(int i = 0; i<getSize(); i++) {
			if(i!=0) {
				b.append(",");
			}
			b.append(get(i));
		}
		b.append("]");
		return b.toString();
	}
	
	public static Tuple1 of1(int value) {
		if(value < tuple1Cash.size()) {
			return tuple1Cash.get(value);
		} else {
			Tuple1 newlyCreated = null;
			while(value >= tuple1Cash.size()) {
				newlyCreated = new Tuple1(tuple1Cash.size());
				tuple1Cash.add(newlyCreated);
			}
			return newlyCreated;
		}
	}
	
	public static Tuple of(int... values) {
		if(values.length == 0) {
			return new Tuple0();
		} else if(values.length == 1) {
			return of1(values[0]);
		} else if(values.length == 2) {
			return new Tuple2(values[0],values[1]);
		} else return new TupleN(values);
	}
	
	protected IllegalArgumentException doesNotContain(int element) {
		return new IllegalArgumentException("Tuple does not contain element "+element);
	}
	
	public static class Tuple0 extends Tuple{
		protected Tuple0() { }
		@Override public int getSize() { return 0; }
		@Override public int get(int element) {
			throw doesNotContain(element);
		}
		@Override public int[] toArray() {return new int[]{};}
		@Override public int hashCode() { return TupleHashProvider.singleton().getHash(this, 0); }
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			return true;
		}
	}
	public static class Tuple1 extends Tuple{
		final int value0;
		protected Tuple1(int value0) { this.value0 = value0; }
		@Override public int getSize() { return 1; }
		@Override public int get(int element) {
			if(element == 0) return value0;
			throw doesNotContain(element);
		}
		@Override public int[] toArray() {return new int[]{ value0 };}
		@Override public int hashCode() { return TupleHashProvider.singleton().getHash(this, 0); }
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Tuple1 other = (Tuple1) obj;
			return value0 == other.value0;
		}
	}
	public static class Tuple2 extends Tuple{
		final int value0;
		final int value1;
		protected Tuple2(int value0, int value1) { this.value0 = value0; this.value1 = value1; }
		@Override public int getSize() { return 2; }
		@Override public int get(int element) {
			if(element == 0) return value0;
			else if(element == 1) return value1;
			throw doesNotContain(element);
		}
		@Override public int[] toArray() {return new int[]{ value0,value1 };}
		@Override public int hashCode() { return TupleHashProvider.singleton().getHash(this, 0); }
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Tuple2 other = (Tuple2) obj;
			return value0 == other.value0 && value1 == other.value1;
		}
	}
	public static class TupleN extends Tuple{
		final int[] values;
		protected TupleN(int[] values) { 
			if(values.length<CUSTOMTUPLESIZE)
				throw new IllegalArgumentException();
			this.values = Arrays.copyOf(values, values.length);
		}
		@Override public int getSize() { return values.length; }
		@Override public int get(int element) {
			if(0<=element && element < values.length) {
				return values[element];
			} else throw doesNotContain(element);
		}
		@Override public int[] toArray() { return values; }
		@Override public int hashCode() { return TupleHashProvider.singleton().getHash(this, 0); }
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			TupleN other = (TupleN) obj;
			return Arrays.equals(values, other.values);
		}
	}
}
