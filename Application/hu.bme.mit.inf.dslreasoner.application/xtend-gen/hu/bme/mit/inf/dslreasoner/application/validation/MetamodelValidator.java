package hu.bme.mit.inf.dslreasoner.application.validation;

import hu.bme.mit.inf.dslreasoner.ecore2logic.EcoreMetamodelDescriptor;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class MetamodelValidator {
  public LinkedList<String> validateMetamodel(final EcoreMetamodelDescriptor descriptor) {
    final LinkedList<String> errors = new LinkedList<String>();
    this.allSupertypesAreIncluded(descriptor.getClasses(), errors);
    this.allEnumTypesareIncluded(descriptor.getEnums(), descriptor.getLiterals(), errors);
    this.referenceEndpointsAreIncluded(descriptor.getClasses(), descriptor.getReferences(), errors);
    this.attributeSourcePontIsIncluded(descriptor.getClasses(), descriptor.getAttributes(), errors);
    this.attributeTargetIsSupported(descriptor.getAttributes(), errors);
    return errors;
  }
  
  private boolean supportedEDataType(final EDataType dataType) {
    @Extension
    final EcorePackage l = EcorePackage.eINSTANCE;
    EDataType _eInt = l.getEInt();
    EDataType _eBoolean = l.getEBoolean();
    EDataType _eString = l.getEString();
    EDataType _eDouble = l.getEDouble();
    EDataType _eFloat = l.getEFloat();
    return Collections.<EDataType>unmodifiableList(CollectionLiterals.<EDataType>newArrayList(_eInt, _eBoolean, _eString, _eDouble, _eFloat)).contains(dataType);
  }
  
  public void allSupertypesAreIncluded(final List<EClass> classes, final List<String> errors) {
    for (final EClass c : classes) {
      EList<EClass> _eSuperTypes = c.getESuperTypes();
      for (final EClass s : _eSuperTypes) {
        boolean _contains = classes.contains(s);
        boolean _not = (!_contains);
        if (_not) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("Metamodel contains \"");
          String _name = c.getName();
          _builder.append(_name);
          _builder.append("\" but not contains its supertype \"");
          String _name_1 = s.getName();
          _builder.append(_name_1);
          _builder.append("\"!");
          errors.add(_builder.toString());
        }
      }
    }
  }
  
  public void allEnumTypesareIncluded(final List<EEnum> enums, final List<EEnumLiteral> literals, final List<String> errors) {
    for (final EEnumLiteral l : literals) {
      boolean _contains = enums.contains(l.getEEnum());
      boolean _not = (!_contains);
      if (_not) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Metamodel contains literal \"");
        String _name = l.getName();
        _builder.append(_name);
        _builder.append("\" but does not contains enum \"");
        String _name_1 = l.getEEnum().getName();
        _builder.append(_name_1);
        _builder.append("\"!");
        errors.add(_builder.toString());
      }
    }
  }
  
  public void referenceEndpointsAreIncluded(final List<EClass> classes, final List<EReference> references, final List<String> errors) {
    for (final EReference reference : references) {
      {
        final EClass src = reference.getEContainingClass();
        boolean _contains = classes.contains(src);
        boolean _not = (!_contains);
        if (_not) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("Metamodel contains reference \"");
          String _name = reference.getName();
          _builder.append(_name);
          _builder.append("\" but does not contains its source type \"");
          String _name_1 = src.getName();
          _builder.append(_name_1);
          _builder.append("\"!");
          errors.add(_builder.toString());
        }
        final EClass trg = reference.getEReferenceType();
        boolean _contains_1 = classes.contains(trg);
        boolean _not_1 = (!_contains_1);
        if (_not_1) {
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("Metamodel contains reference \"");
          String _name_2 = reference.getName();
          _builder_1.append(_name_2);
          _builder_1.append("\" but does not contains its target type \"");
          String _name_3 = trg.getName();
          _builder_1.append(_name_3);
          _builder_1.append("\"!");
          errors.add(_builder_1.toString());
        }
      }
    }
  }
  
  public void attributeSourcePontIsIncluded(final List<EClass> classes, final List<EAttribute> attributes, final List<String> errors) {
    for (final EAttribute attribute : attributes) {
      {
        final Class<?> src = attribute.getContainerClass();
        boolean _contains = classes.contains(src);
        boolean _not = (!_contains);
        if (_not) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("Metamodel contains attribute \"");
          String _name = attribute.getName();
          _builder.append(_name);
          _builder.append("\" but does not contains its source type \"");
          String _name_1 = src.getName();
          _builder.append(_name_1);
          _builder.append("\"!");
          errors.add(_builder.toString());
        }
      }
    }
  }
  
  public void attributeTargetIsSupported(final List<EAttribute> attributes, final List<String> errors) {
    for (final EAttribute attribute : attributes) {
      {
        final EDataType trg = attribute.getEAttributeType();
        boolean _supportedEDataType = this.supportedEDataType(trg);
        boolean _not = (!_supportedEDataType);
        if (_not) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("Metamodels contains attribute \"");
          String _name = attribute.getName();
          _builder.append(_name);
          _builder.append("\" with unsupported type \"");
          String _name_1 = trg.getName();
          _builder.append(_name_1);
          _builder.append("\"!");
          errors.add(_builder.toString());
        }
      }
    }
  }
}
