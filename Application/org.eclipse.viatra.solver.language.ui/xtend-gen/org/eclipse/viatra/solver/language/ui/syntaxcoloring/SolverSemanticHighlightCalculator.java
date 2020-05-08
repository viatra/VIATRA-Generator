package org.eclipse.viatra.solver.language.ui.syntaxcoloring;

import com.google.common.collect.Iterators;
import java.util.Iterator;
import java.util.Random;
import java.util.WeakHashMap;
import org.eclipse.viatra.solver.language.solverLanguage.Reference;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.ide.editor.syntaxcoloring.DefaultSemanticHighlightingCalculator;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.CancelIndicator;

@SuppressWarnings("all")
public class SolverSemanticHighlightCalculator extends DefaultSemanticHighlightingCalculator {
  public static final String SYMBOL_CODE = "SymbolCode::";
  
  private final WeakHashMap<String, String> symbolName2ID = new WeakHashMap<String, String>();
  
  @Override
  public void provideHighlightingFor(final XtextResource resource, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    if (((resource == null) || (resource.getParseResult() == null))) {
      return;
    } else {
      final Iterator<Reference> modelSymbols = Iterators.<Reference>filter(resource.getAllContents(), Reference.class);
      while (modelSymbols.hasNext()) {
        {
          final Reference symbolElement = modelSymbols.next();
          final ICompositeNode node = NodeModelUtils.getNode(symbolElement);
          acceptor.addPosition(
            node.getOffset(), 
            node.getLength(), 
            this.getSymbolCode(node.getText()));
        }
      }
    }
  }
  
  public String getSymbolCode(final String name) {
    boolean _containsKey = this.symbolName2ID.containsKey(name);
    if (_containsKey) {
      return this.symbolName2ID.get(name);
    } else {
      final String id = this.calculateSymbolCode(name);
      this.symbolName2ID.put(name, id);
      return id;
    }
  }
  
  public String calculateSymbolCode(final String name) {
    int _hashCode = name.hashCode();
    final Random random = new Random(_hashCode);
    final float hue = this.huePick(random.nextFloat());
    float _nextFloat = random.nextFloat();
    double _multiply = (_nextFloat * 0.3);
    final double saturation = (0.2 + _multiply);
    float _nextFloat_1 = random.nextFloat();
    double _multiply_1 = (_nextFloat_1 * 0.2);
    final double brightness = (_multiply_1 + 0.7f);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(SolverSemanticHighlightCalculator.SYMBOL_CODE);
    _builder.append(" ");
    _builder.append(hue);
    _builder.append(" ");
    _builder.append(saturation);
    _builder.append(" ");
    _builder.append(brightness);
    return _builder.toString();
  }
  
  private float huePick(final float random) {
    final int pink = 300;
    final int tolerance = 10;
    final float degree = (random * (360 - (2 * tolerance)));
    if ((degree < (pink - tolerance))) {
      return degree;
    } else {
      return (degree + (2 * tolerance));
    }
  }
}
