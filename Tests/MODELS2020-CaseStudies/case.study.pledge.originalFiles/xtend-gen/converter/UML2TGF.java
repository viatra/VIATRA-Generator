package converter;

import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.InstanceValue;
import org.eclipse.uml2.uml.Model;
import org.eclipse.uml2.uml.Slot;
import org.eclipse.uml2.uml.StructuralFeature;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.ValueSpecification;
import org.eclipse.uml2.uml.resource.UMLResource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class UML2TGF {
  public static void main(final String[] args) {
    try {
      final ResourceSetImpl resourceSet = new ResourceSetImpl();
      resourceSet.getPackageRegistry().put(UMLPackage.eNS_URI, UMLPackage.eINSTANCE);
      resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(UMLResource.FILE_EXTENSION, 
        UMLResource.Factory.INSTANCE);
      final Resource res = resourceSet.getResource(URI.createFileURI("instance//Instance_model_A.uml"), true);
      EObject _get = res.getContents().get(0);
      final Model docRoot = ((Model) _get);
      final Function1<Element, Boolean> _function = (Element it) -> {
        return Boolean.valueOf((it instanceof InstanceSpecification));
      };
      final Iterable<Element> nodes = IterableExtensions.<Element>filter(docRoot.allOwnedElements(), _function);
      final HashSet<Object> allTypes = new HashSet<Object>();
      for (final Element e : nodes) {
        allTypes.add(e.getClass());
      }
      long _currentTimeMillis = System.currentTimeMillis();
      final Date date = new Date(_currentTimeMillis);
      final SimpleDateFormat format = new SimpleDateFormat("dd-HHmm");
      final String formattedDate = format.format(date);
      final HashMap<InstanceSpecification, Integer> map = new HashMap<InstanceSpecification, Integer>();
      final HashSet<String> set = new HashSet<String>();
      final ArrayList<Object> unidentified = new ArrayList<Object>();
      final ArrayList<Object> enums = new ArrayList<Object>();
      final PrintWriter writer = new PrintWriter((("output//graph-" + formattedDate) + ".gml"));
      InputOutput.<String>println("begin Writing");
      writer.append("graph\n[\n");
      int ind = 0;
      int numNodes = ((Object[])Conversions.unwrapArray(nodes, Object.class)).length;
      int numEdges = 0;
      for (final Element node : nodes) {
        {
          final InstanceSpecification n = ((InstanceSpecification) node);
          map.put(n, Integer.valueOf(ind));
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("  ");
          _builder.append("node");
          _builder.newLine();
          _builder.append("  ");
          _builder.append("[");
          _builder.newLine();
          _builder.append("   ");
          _builder.append("id ");
          _builder.append(ind, "   ");
          _builder.newLineIfNotEmpty();
          _builder.append("   ");
          _builder.append("label \"");
          {
            String _name = n.getName();
            boolean _tripleNotEquals = (_name != null);
            if (_tripleNotEquals) {
              String _name_1 = n.getName();
              _builder.append(_name_1, "   ");
            }
          }
          _builder.append("\"");
          _builder.newLineIfNotEmpty();
          {
            if (((n.getName() != null) && n.getName().contains("Household"))) {
              _builder.append("     graphics");
              _builder.newLineIfNotEmpty();
              _builder.append("       ");
              _builder.append("[");
              _builder.newLine();
              _builder.append("         ");
              _builder.append("fill\t\"#00FF00\"");
              _builder.newLine();
              _builder.append("       ");
              _builder.append("]");
              _builder.newLine();
            }
          }
          _builder.append("  ");
          _builder.append("]");
          _builder.newLine();
          writer.append(_builder);
          ind++;
        }
      }
      Slot s = null;
      try {
        for (final Element node_1 : nodes) {
          if (((node_1 instanceof EnumerationLiteral) != true)) {
            final InstanceSpecification n = ((InstanceSpecification) node_1);
            final Integer nind = map.get(n);
            EList<Slot> _slots = n.getSlots();
            for (final Slot slot : _slots) {
              {
                s = slot;
                String fname = "";
                StructuralFeature _definingFeature = slot.getDefiningFeature();
                boolean _tripleNotEquals = (_definingFeature != null);
                if (_tripleNotEquals) {
                  fname = slot.getDefiningFeature().getName();
                }
                EList<ValueSpecification> _values = slot.getValues();
                for (final ValueSpecification v : _values) {
                  if ((v instanceof InstanceValue)) {
                    final InstanceValue value = ((InstanceValue) v);
                    boolean _containsKey = map.containsKey(value.getInstance());
                    if (_containsKey) {
                      final Integer vind = map.get(value.getInstance());
                      StringConcatenation _builder = new StringConcatenation();
                      _builder.append("  ");
                      _builder.append("edge");
                      _builder.newLine();
                      _builder.append("  ");
                      _builder.append("[");
                      _builder.newLine();
                      _builder.append("   ");
                      _builder.append("source ");
                      _builder.append(nind, "   ");
                      _builder.newLineIfNotEmpty();
                      _builder.append("   ");
                      _builder.append("target ");
                      _builder.append(vind, "   ");
                      _builder.newLineIfNotEmpty();
                      _builder.append("   ");
                      _builder.append("label \"");
                      _builder.append(fname, "   ");
                      _builder.append("\"");
                      _builder.newLineIfNotEmpty();
                      _builder.append("  ");
                      _builder.append("]");
                      _builder.newLine();
                      writer.append(_builder);
                      numEdges++;
                    } else {
                      String _plus = (value + " -> ");
                      InstanceSpecification _instance = value.getInstance();
                      String _plus_1 = (_plus + _instance);
                      unidentified.add(_plus_1);
                    }
                  } else {
                    set.add(v.getClass().toString());
                  }
                }
              }
            }
          } else {
            enums.add(node_1);
          }
        }
      } catch (final Throwable _t) {
        if (_t instanceof Exception) {
          InputOutput.<StructuralFeature>println(s.getDefiningFeature());
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
      UML2TGF.printset("Unhandled Edges", set);
      UML2TGF.printset("Unidentified trgs", unidentified);
      writer.append("]");
      writer.close();
      InputOutput.<String>println("End");
      InputOutput.<String>println(((("#nodes:" + Integer.valueOf(numNodes)) + ", #edges:") + Integer.valueOf(numEdges)));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static void printset(final String name, final Collection s) {
    InputOutput.<String>println((name + ":"));
    for (final Object k : s) {
      InputOutput.<String>println(("- " + k));
    }
    InputOutput.println();
  }
}
