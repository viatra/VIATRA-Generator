package hu.bme.mit.inf.dslreasoner.faulttree.transformation.cft2ft;

import com.google.common.base.Objects;
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.FaultTree;
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.FtFactory;
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.Gate;
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.RandomEvent;
import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class FaultTreeBuilder {
  @Accessors
  private final FaultTree faultTree = FtFactory.eINSTANCE.createFaultTree();
  
  public void addTopLevel(final RandomEvent event) {
    RandomEvent _topEvent = this.faultTree.getTopEvent();
    boolean _tripleNotEquals = (_topEvent != null);
    if (_tripleNotEquals) {
      throw new IllegalStateException("Top event was already set");
    }
    this.add(event);
    this.faultTree.setTopEvent(event);
  }
  
  protected void add(final RandomEvent event) {
    EObject _eContainer = this.faultTree.eContainer();
    boolean _equals = Objects.equal(_eContainer, this.faultTree);
    if (_equals) {
      return;
    }
    EObject _eContainer_1 = this.faultTree.eContainer();
    boolean _tripleNotEquals = (_eContainer_1 != null);
    if (_tripleNotEquals) {
      throw new IllegalStateException("Event is already in a different fault tree");
    }
    EList<RandomEvent> _events = this.faultTree.getEvents();
    _events.add(event);
    if ((event instanceof Gate)) {
      this.addAll(((Gate)event).getInputEvents());
    }
  }
  
  protected void addAll(final Collection<RandomEvent> events) {
    for (final RandomEvent event : events) {
      this.add(event);
    }
  }
  
  @Pure
  public FaultTree getFaultTree() {
    return this.faultTree;
  }
}
