package hu.bme.mit.inf.dslreasoner.faulttree.components.conversion;

import com.google.common.base.Objects;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.AbstractLexerBasedConverter;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.xbase.lib.Exceptions;

@SuppressWarnings("all")
public class OF_INTValueConverter extends AbstractLexerBasedConverter<Integer> {
  private static final String PREFIX = "of";
  
  @Override
  public Integer toValue(final String string, final INode node) throws ValueConverterException {
    Integer _xblockexpression = null;
    {
      if ((string == null)) {
        return null;
      }
      if (((string.length() < OF_INTValueConverter.PREFIX.length()) || (!Objects.equal(string.substring(0, OF_INTValueConverter.PREFIX.length()), OF_INTValueConverter.PREFIX)))) {
        throw new ValueConverterException((("\'" + string) + "\' must start with the characters \'of\'."), node, null);
      }
      Integer _xtrycatchfinallyexpression = null;
      try {
        Integer _xblockexpression_1 = null;
        {
          final int intValue = Integer.parseInt(string.substring(OF_INTValueConverter.PREFIX.length()), 10);
          _xblockexpression_1 = Integer.valueOf(intValue);
        }
        _xtrycatchfinallyexpression = _xblockexpression_1;
      } catch (final Throwable _t) {
        if (_t instanceof NumberFormatException) {
          final NumberFormatException e = (NumberFormatException)_t;
          throw new ValueConverterException((("Couldn\'t convert \'" + string) + "\' to an int value."), node, e);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      _xblockexpression = _xtrycatchfinallyexpression;
    }
    return _xblockexpression;
  }
  
  @Override
  protected String toEscapedString(final Integer value) {
    return (OF_INTValueConverter.PREFIX + value);
  }
  
  @Override
  protected void assertValidValue(final Integer value) {
    super.assertValidValue(value);
    if (((value).intValue() < 0)) {
      String _ruleName = this.getRuleName();
      String _plus = (_ruleName + " may not be negative.");
      throw new ValueConverterException(_plus, null, null);
    }
  }
}
