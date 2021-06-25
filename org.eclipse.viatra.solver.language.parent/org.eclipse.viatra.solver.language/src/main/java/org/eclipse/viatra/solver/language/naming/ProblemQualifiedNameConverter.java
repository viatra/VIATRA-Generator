package org.eclipse.viatra.solver.language.naming;

import org.eclipse.xtext.naming.IQualifiedNameConverter;

import com.google.inject.Singleton;

@Singleton
public class ProblemQualifiedNameConverter extends IQualifiedNameConverter.DefaultImpl {
	@Override
	public String getDelimiter() {
		return "::";
	}
}
