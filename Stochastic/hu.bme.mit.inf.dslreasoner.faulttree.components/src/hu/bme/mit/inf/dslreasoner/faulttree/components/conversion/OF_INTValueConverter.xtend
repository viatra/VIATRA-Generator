package hu.bme.mit.inf.dslreasoner.faulttree.components.conversion

import org.eclipse.xtext.conversion.ValueConverterException
import org.eclipse.xtext.conversion.impl.AbstractLexerBasedConverter
import org.eclipse.xtext.nodemodel.INode

class OF_INTValueConverter extends AbstractLexerBasedConverter<Integer> {
	static val PREFIX = "of"

	override toValue(String string, INode node) throws ValueConverterException {
		if (string === null) {
			return null
		}
		if (string.length < PREFIX.length || string.substring(0, PREFIX.length) != PREFIX) {
			throw new ValueConverterException("'" + string + "' must start with the characters 'of'.", node, null);
		}
		try {
			val intValue = Integer.parseInt(string.substring(PREFIX.length), 10)
			Integer.valueOf(intValue)
		} catch (NumberFormatException e) {
			throw new ValueConverterException("Couldn't convert '" + string + "' to an int value.", node, e);
		}
	}

	override protected toEscapedString(Integer value) {
		PREFIX + value
	}

	override protected assertValidValue(Integer value) {
		super.assertValidValue(value)
		if (value < 0) {
			throw new ValueConverterException(getRuleName() + " may not be negative.", null, null);
		}
	}
}
