package org.eclipse.viatra.solver.data.util;

import java.util.Iterator;
import java.util.function.Function;

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
}
