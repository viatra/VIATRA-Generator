package hu.bme.mit.inf.dslreasoner.faulttree.components.naming;

import com.google.inject.Inject;
import hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.CftModel;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class PackageNameProvider {
  private final IQualifiedNameConverter qualifiedNameConverter;
  
  @FinalFieldsConstructor
  @Inject
  public PackageNameProvider(final IQualifiedNameConverter qualifiedNameConverter) {
    super();
    this.qualifiedNameConverter = qualifiedNameConverter;
  }
  
  public QualifiedName getPackageName(final EObject eObj) {
    QualifiedName _xblockexpression = null;
    {
      if ((eObj == null)) {
        return QualifiedName.EMPTY;
      }
      CftModel _containerOfType = EcoreUtil2.<CftModel>getContainerOfType(eObj, CftModel.class);
      String _packageName = null;
      if (_containerOfType!=null) {
        _packageName=_containerOfType.getPackageName();
      }
      final String pacakgeName = _packageName;
      QualifiedName _xifexpression = null;
      boolean _isNullOrEmpty = StringExtensions.isNullOrEmpty(pacakgeName);
      if (_isNullOrEmpty) {
        _xifexpression = QualifiedName.EMPTY;
      } else {
        _xifexpression = this.qualifiedNameConverter.toQualifiedName(pacakgeName);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
}
