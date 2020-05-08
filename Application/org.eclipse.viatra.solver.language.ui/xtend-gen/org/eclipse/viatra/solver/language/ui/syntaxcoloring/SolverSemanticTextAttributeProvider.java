package org.eclipse.viatra.solver.language.ui.syntaxcoloring;

import com.google.inject.Inject;
import java.util.WeakHashMap;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.viatra.solver.language.ui.syntaxcoloring.SolverSemanticHighlightCalculator;
import org.eclipse.xtext.ui.editor.preferences.IPreferenceStoreAccess;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.PreferenceStoreAccessor;
import org.eclipse.xtext.ui.editor.syntaxcoloring.TextAttributeProvider;
import org.eclipse.xtext.ui.editor.utils.EditorUtils;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

@SuppressWarnings("all")
public class SolverSemanticTextAttributeProvider extends TextAttributeProvider {
  private final TextStyle defaultTextStyle = new TextStyle();
  
  private final WeakHashMap<String, TextAttribute> colorID2TextAttribute = new WeakHashMap<String, TextAttribute>();
  
  @Inject
  public SolverSemanticTextAttributeProvider(final IHighlightingConfiguration highlightingConfig, final IPreferenceStoreAccess preferenceStoreAccess, final PreferenceStoreAccessor prefStoreAccessor) {
    super(highlightingConfig, preferenceStoreAccess, prefStoreAccessor);
  }
  
  @Override
  public TextAttribute getAttribute(final String id) {
    TextAttribute _xifexpression = null;
    boolean _isMetamodelElementColorID = this.isMetamodelElementColorID(id);
    if (_isMetamodelElementColorID) {
      boolean _containsKey = this.colorID2TextAttribute.containsKey(id);
      if (_containsKey) {
        return this.colorID2TextAttribute.get(id);
      } else {
        final TextAttribute style = this.metamodelElementTextStyle(id);
        this.colorID2TextAttribute.put(id, style);
        return style;
      }
    } else {
      _xifexpression = super.getAttribute(id);
    }
    return _xifexpression;
  }
  
  private boolean isMetamodelElementColorID(final String id) {
    return id.startsWith(SolverSemanticHighlightCalculator.SYMBOL_CODE);
  }
  
  private TextAttribute metamodelElementTextStyle(final String id) {
    final String[] texts = id.split(" ");
    float _parseFloat = Float.parseFloat(texts[1]);
    float _parseFloat_1 = Float.parseFloat(texts[2]);
    float _parseFloat_2 = Float.parseFloat(texts[3]);
    final RGB backgroundColor = new RGB(_parseFloat, _parseFloat_1, _parseFloat_2);
    Color _colorFromRGB = EditorUtils.colorFromRGB(this.defaultTextStyle.getColor());
    Color _colorFromRGB_1 = EditorUtils.colorFromRGB(backgroundColor);
    int _style = this.defaultTextStyle.getStyle();
    Font _fontFromFontData = EditorUtils.fontFromFontData(this.defaultTextStyle.getFontData());
    return new TextAttribute(_colorFromRGB, _colorFromRGB_1, _style, _fontFromFontData);
  }
}
