package hu.bme.mit.inf.dslreasoner.faulttree.model.util;

import com.google.common.base.Objects;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Component;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Connection;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.ModalElement;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.Modality;

@SuppressWarnings("all")
public final class CftExtensions {
  private CftExtensions() {
    throw new IllegalStateException("This is a static utility class and should not be instantiated directly.");
  }
  
  public static boolean isMoreConcreteThan(final Modality newModality, final Modality original) {
    boolean _switchResult = false;
    if (original != null) {
      switch (original) {
        case MAY:
          _switchResult = (!Objects.equal(newModality, Modality.MAY));
          break;
        case CURRENT:
          _switchResult = Objects.equal(newModality, Modality.MUST);
          break;
        case MUST:
          _switchResult = false;
          break;
        default:
          break;
      }
    }
    return _switchResult;
  }
  
  public static boolean currentlyExists(final ModalElement element) {
    Modality _exists = element.getExists();
    return (!Objects.equal(_exists, Modality.MAY));
  }
  
  public static boolean mustExist(final ModalElement element) {
    Modality _exists = element.getExists();
    return Objects.equal(_exists, Modality.MUST);
  }
  
  public static boolean appearsExactlyOnce(final Component componentInstance) {
    return (CftExtensions.mustExist(componentInstance) && (!componentInstance.isMultipleAllowed()));
  }
  
  /**
   * Checks whether the connection and its target component are both currently present.
   * 
   * A currently present connection without a present target component is a partial model error,
   * so we throw an exception instead of returning <code>false</code>.
   * 
   * @param connection The connection to check.
   * @throws IllegalStateException When the target component is not currently present.
   */
  public static boolean isCurrentlyConnected(final Connection connection) {
    boolean _xblockexpression = false;
    {
      boolean _currentlyExists = CftExtensions.currentlyExists(connection.getOutput().getComponent());
      if (_currentlyExists) {
        throw new IllegalStateException("Inconsistent partial model: current connection to a component that may not currently exist");
      }
      _xblockexpression = CftExtensions.currentlyExists(connection);
    }
    return _xblockexpression;
  }
}
