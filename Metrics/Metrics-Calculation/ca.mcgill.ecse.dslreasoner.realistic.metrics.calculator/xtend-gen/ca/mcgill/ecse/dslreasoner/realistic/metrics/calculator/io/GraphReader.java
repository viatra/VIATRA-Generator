package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.io;

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.graph.EMFGraph;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.EdgeTypeMetric;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.Metric;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.MultiplexParticipationCoefficientMetric;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.NodeActivityMetric;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.NodeTypeMetric;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.OutDegreeMetric;
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.metrics.TypedOutDegree;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class GraphReader {
  private final ResourceSet resSet = new ResourceSetImpl();
  
  private final ArrayList<EReference> referenceTypes = new ArrayList<EReference>();
  
  private String suffix;
  
  public GraphReader(final EPackage metaModel, final String suffix) {
    throw new Error("Unresolved compilation problems:"
      + "\nXMIResourceFactoryImpl cannot be resolved.");
  }
  
  public List<EMFGraph> readModels(final String path) {
    try {
      final File dir = new File(path);
      boolean _isDirectory = dir.isDirectory();
      boolean _not = (!_isDirectory);
      if (_not) {
        throw new Exception("expecting a directory");
      }
      final ArrayList<EMFGraph> graphs = new ArrayList<EMFGraph>();
      final ArrayList<Metric> metrics = new ArrayList<Metric>();
      OutDegreeMetric _outDegreeMetric = new OutDegreeMetric();
      metrics.add(_outDegreeMetric);
      NodeActivityMetric _nodeActivityMetric = new NodeActivityMetric();
      metrics.add(_nodeActivityMetric);
      MultiplexParticipationCoefficientMetric _multiplexParticipationCoefficientMetric = new MultiplexParticipationCoefficientMetric();
      metrics.add(_multiplexParticipationCoefficientMetric);
      TypedOutDegree _typedOutDegree = new TypedOutDegree();
      metrics.add(_typedOutDegree);
      NodeTypeMetric _nodeTypeMetric = new NodeTypeMetric();
      metrics.add(_nodeTypeMetric);
      EdgeTypeMetric _edgeTypeMetric = new EdgeTypeMetric();
      metrics.add(_edgeTypeMetric);
      int count = 1;
      final Function1<String, Boolean> _function = (String it) -> {
        return Boolean.valueOf(it.endsWith(this.suffix));
      };
      Iterable<String> _filter = IterableExtensions.<String>filter(((Iterable<String>)Conversions.doWrapArray(dir.list())), _function);
      for (final String name : _filter) {
        {
          final File file = new File(name);
          final List<EObject> roots = this.<EObject>readModel(EObject.class, path, file.getName());
          final EMFGraph g = new EMFGraph();
          for (final EObject root : roots) {
            g.init(root, metrics, name.replaceFirst(this.suffix, ""), this.referenceTypes);
          }
          count++;
          graphs.add(g);
        }
      }
      return graphs;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public EMFGraph readModel(final String path, final String filename) {
    final ArrayList<Metric> metrics = new ArrayList<Metric>();
    OutDegreeMetric _outDegreeMetric = new OutDegreeMetric();
    metrics.add(_outDegreeMetric);
    NodeActivityMetric _nodeActivityMetric = new NodeActivityMetric();
    metrics.add(_nodeActivityMetric);
    MultiplexParticipationCoefficientMetric _multiplexParticipationCoefficientMetric = new MultiplexParticipationCoefficientMetric();
    metrics.add(_multiplexParticipationCoefficientMetric);
    TypedOutDegree _typedOutDegree = new TypedOutDegree();
    metrics.add(_typedOutDegree);
    NodeTypeMetric _nodeTypeMetric = new NodeTypeMetric();
    metrics.add(_nodeTypeMetric);
    EdgeTypeMetric _edgeTypeMetric = new EdgeTypeMetric();
    metrics.add(_edgeTypeMetric);
    final File file = new File(filename);
    final List<EObject> roots = this.<EObject>readModel(EObject.class, path, file.getName());
    final EMFGraph g = new EMFGraph();
    for (final EObject root : roots) {
      g.init(root, metrics, filename.replaceFirst(this.suffix, ""), this.referenceTypes);
    }
    return g;
  }
  
  public <RootType extends EObject> List<RootType> readModel(final Class<RootType> type, final String path, final String name) {
    try {
      try {
        final Resource resource = this.resSet.getResource(GraphReader.getURI(path, name), true);
        if ((resource == null)) {
          String _string = GraphReader.getURI(path, name).toString();
          throw new FileNotFoundException(_string);
        } else {
          EList<EObject> _contents = resource.getContents();
          return ((List<RootType>) _contents);
        }
      } catch (final Throwable _t) {
        if (_t instanceof Exception) {
          final Exception e = (Exception)_t;
          e.printStackTrace();
          String _string_1 = GraphReader.getURI(path, name).toString();
          throw new Exception(_string_1);
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public static URI getURI(final String path, final String name) {
    return URI.createFileURI(((path + "/") + name));
  }
}
