package hu.bme.mit.inf.dslreasoner.faulttree.components.naming;

import com.google.inject.Inject;
import hu.bme.mit.inf.dslreasoner.faulttree.components.cftLanguage.TransformationDefinition;
import hu.bme.mit.inf.dslreasoner.faulttree.components.naming.PackageNameProvider;
import hu.bme.mit.inf.dslreasoner.faulttree.model.cft.ComponentDefinition;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

@SuppressWarnings("all")
public class CftLanguageQualifiedNameProvider extends DefaultDeclarativeQualifiedNameProvider {
  @Inject
  private PackageNameProvider packageNameProvider;
  
  public QualifiedName qualifiedName(final ComponentDefinition componentDefinition) {
    return this.computePackageQualifiedName(componentDefinition, componentDefinition.getName());
  }
  
  public QualifiedName qualifiedName(final TransformationDefinition transformationDefinition) {
    return this.computePackageQualifiedName(transformationDefinition, transformationDefinition.getName());
  }
  
  private QualifiedName computePackageQualifiedName(final EObject eObj, final String name) {
    QualifiedName _xblockexpression = null;
    {
      if ((name == null)) {
        return null;
      }
      final QualifiedName packageQualifier = this.packageNameProvider.getPackageName(eObj);
      _xblockexpression = packageQualifier.append(name);
    }
    return _xblockexpression;
  }
}
