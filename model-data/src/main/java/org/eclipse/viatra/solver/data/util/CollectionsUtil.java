package org.eclipse.viatra.solver.data.util;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Function;
import java.util.function.Predicate;

public final class CollectionsUtil {
	private CollectionsUtil() {
		throw new UnsupportedOperationException();
	}
	
	static <S,T> Iterator<T> map(Iterator<S> source, Function<S, T> transformation) {
		return new Iterator<T>() {

			@Override
			public boolean hasNext() {
				return source.hasNext();
			}

			@Override
			public T next() {
				return transformation.apply(source.next());
			}
		};
	}
	
	static <S,T> Iterable<T> map(Iterable<S> source, Function<S, T> transformation) {
		return (()->map(source.iterator(),transformation));
	}
	
	static <T> Iterator<T> filter(Iterator<T> source, Predicate<T> condition) {
		return new Iterator<T>() {
			T internalNext = move();
			boolean internalHasNext;
			
			private T move() {
				internalHasNext = source.hasNext();
				if(internalHasNext) {
					internalNext = source.next();
				}
				while(internalHasNext && !condition.test(internalNext)) {
					internalHasNext = source.hasNext();
					if(internalHasNext) {
						internalNext = source.next();
					}
				}
				return internalNext;
			}

			@Override
			public boolean hasNext() {
				return internalHasNext;
			}

			@Override
			public T next() {
				if(!internalHasNext) {
					throw new NoSuchElementException();
				} else {
					T result = internalNext;
					move();
					return result;
				}
			}
		};
	}
	
	static <T> Iterable<T> filter(Iterable<T> source, Predicate<T> condition) {
		return (()->filter(source.iterator(),condition));
	}
}
