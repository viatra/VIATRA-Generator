package hu.bme.mit.inf.dslreasoner.faulttree.transformation.ecore2cft;

import com.google.common.collect.ImmutableList;
import hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.MappingDefinition;
import hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.TransformationDefinition;
import hu.bme.mit.inf.dslreasoner.faulttree.transformation.ecore2cft.ComponentFaultTreeTrace;
import hu.bme.mit.inf.dslreasoner.faulttree.transformation.ecore2cft.MappingHandler;
import hu.bme.mit.inf.dslreasoner.faulttree.transformation.ecore2cft.MappingQueries;
import java.util.List;
import org.eclipse.viatra.query.runtime.api.ViatraQueryEngine;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.ListExtensions;

@SuppressWarnings("all")
public class Ecore2CftTransformation {
  private final List<MappingHandler> mappingHandlers;
  
  public Ecore2CftTransformation(final TransformationDefinition transformationDefinition, final ViatraQueryEngine viatraQueryEngine) {
    final MappingQueries mappingQueries = new MappingQueries(transformationDefinition, viatraQueryEngine);
    final Function1<MappingDefinition, MappingHandler> _function = (MappingDefinition mappingDefinition) -> {
      return new MappingHandler(mappingDefinition, mappingQueries);
    };
    this.mappingHandlers = ImmutableList.<MappingHandler>copyOf(ListExtensions.<MappingDefinition, MappingHandler>map(transformationDefinition.getMappingDefinitions(), _function));
  }
  
  public void createComponentFaultTree() {
    final ComponentFaultTreeTrace trace = new ComponentFaultTreeTrace();
    for (final MappingHandler handler : this.mappingHandlers) {
      handler.instantiateComponents(trace);
    }
    for (final MappingHandler handler_1 : this.mappingHandlers) {
      handler_1.instantiateConnections(trace);
    }
  }
}
