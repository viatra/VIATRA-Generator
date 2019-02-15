package hu.bme.mit.inf.dslreasoner.faulttree.transformation.cft2ft;

import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.ComponentFaultTree;
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.ConstantEvent;
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.ConstantModel;
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.Event;
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.FaultTree;
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.FtFactory;
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.RandomEvent;
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.ReliabilityModel;
import hu.bme.mit.inf.dslreasoner.faulttree.transformation.cft2ft.EventMaterializer;
import hu.bme.mit.inf.dslreasoner.faulttree.transformation.cft2ft.FaultTreeBuilder;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class Cft2FtTransformation {
  public ReliabilityModel createFaultTree(final ComponentFaultTree componentFaultTree) {
    ReliabilityModel _xblockexpression = null;
    {
      final EventMaterializer materializer = new EventMaterializer();
      final Event topEvent = materializer.getOrMaterialize(componentFaultTree.getTopEvent());
      ReliabilityModel _switchResult = null;
      boolean _matched = false;
      if (topEvent instanceof ConstantEvent) {
        _matched=true;
        ConstantModel _createConstantModel = FtFactory.eINSTANCE.createConstantModel();
        final Procedure1<ConstantModel> _function = (ConstantModel it) -> {
          it.setFailed(((ConstantEvent)topEvent).isFailed());
        };
        _switchResult = ObjectExtensions.<ConstantModel>operator_doubleArrow(_createConstantModel, _function);
      }
      if (!_matched) {
        if (topEvent instanceof RandomEvent) {
          _matched=true;
          FaultTree _xblockexpression_1 = null;
          {
            final FaultTreeBuilder builder = new FaultTreeBuilder();
            builder.addTopLevel(((RandomEvent)topEvent));
            _xblockexpression_1 = builder.getFaultTree();
          }
          _switchResult = _xblockexpression_1;
        }
      }
      _xblockexpression = _switchResult;
    }
    return _xblockexpression;
  }
}
