package org.eclipse.viatra.solver.language.conversion;

import org.eclipse.xtext.common.services.DefaultTerminalConverters;
import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;

import com.google.inject.Inject;

public class ProblemValueConverterService extends DefaultTerminalConverters {
	@Inject
	private UpperBoundValueConverter upperBoundValueConverter;
	
	@ValueConverter(rule = "UpperBound")
	public IValueConverter<Integer> UpperBound() {
		return upperBoundValueConverter;
	}
}
