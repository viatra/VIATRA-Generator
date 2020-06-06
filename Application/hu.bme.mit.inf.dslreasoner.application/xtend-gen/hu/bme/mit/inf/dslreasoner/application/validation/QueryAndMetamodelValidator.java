package hu.bme.mit.inf.dslreasoner.application.validation;

import com.google.common.collect.Iterables;
import hu.bme.mit.inf.dslreasoner.ecore2logic.EcoreMetamodelDescriptor;
import hu.bme.mit.inf.dslreasoner.viatra2logic.ViatraQuerySetDescriptor;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.viatra.query.patternlanguage.emf.vql.Pattern;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Pair;

@SuppressWarnings("all")
public class QueryAndMetamodelValidator {
  public LinkedList<String> validateQueryAndMetamodel(final EcoreMetamodelDescriptor metamodel, final Pair<ViatraQuerySetDescriptor, Set<Pattern>> viatra) {
    final Set<Pattern> patterns = viatra.getValue();
    List<EClass> _classes = metamodel.getClasses();
    List<EEnum> _enums = metamodel.getEnums();
    Iterable<EClassifier> _plus = Iterables.<EClassifier>concat(_classes, _enums);
    List<EEnumLiteral> _literals = metamodel.getLiterals();
    Iterable<ENamedElement> _plus_1 = Iterables.<ENamedElement>concat(_plus, _literals);
    List<EAttribute> _attributes = metamodel.getAttributes();
    Iterable<ENamedElement> _plus_2 = Iterables.<ENamedElement>concat(_plus_1, _attributes);
    List<EReference> _references = metamodel.getReferences();
    final Set<ENamedElement> elementsInMetamodel = IterableExtensions.<ENamedElement>toSet(Iterables.<ENamedElement>concat(_plus_2, _references));
    final LinkedList<String> errors = new LinkedList<String>();
    for (final Pattern pattern : patterns) {
      {
        final Iterable<ENamedElement> elements = this.getReferredNamedElements(pattern);
        for (final ENamedElement element : elements) {
          boolean _contains = elementsInMetamodel.contains(element);
          boolean _not = (!_contains);
          if (_not) {
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("Pattern \"");
            String _name = pattern.getName();
            _builder.append(_name);
            _builder.append("\" refers to an element \"");
            _builder.append(element);
            _builder.append("\" that is not included to the selected metamodel!");
            errors.add(_builder.toString());
          }
        }
      }
    }
    return errors;
  }
  
  public Iterable<ENamedElement> getReferredNamedElements(final Pattern pattern) {
    final List<EObject> elements = IteratorExtensions.<EObject>toList(pattern.eAllContents());
    final Function1<EObject, Iterable<ENamedElement>> _function = (EObject element) -> {
      final EList<EReference> references = element.eClass().getEAllReferences();
      final Function1<EReference, Iterable<ENamedElement>> _function_1 = (EReference r) -> {
        boolean _isMany = r.isMany();
        if (_isMany) {
          Object _eGet = element.eGet(r);
          return Iterables.<ENamedElement>filter(((List<?>) _eGet), ENamedElement.class);
        } else {
          final Object value = element.eGet(r);
          if ((value instanceof ENamedElement)) {
            return Collections.<ENamedElement>unmodifiableList(CollectionLiterals.<ENamedElement>newArrayList(((ENamedElement)value)));
          } else {
            return Collections.<ENamedElement>unmodifiableList(CollectionLiterals.<ENamedElement>newArrayList());
          }
        }
      };
      return Iterables.<ENamedElement>filter((Iterables.<ENamedElement>concat(ListExtensions.<EReference, Iterable<ENamedElement>>map(references, _function_1))), ENamedElement.class);
    };
    return Iterables.<ENamedElement>concat(ListExtensions.<EObject, Iterable<ENamedElement>>map(elements, _function));
  }
}
