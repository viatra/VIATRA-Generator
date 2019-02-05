package hu.bme.mit.inf.dslreasoner.faulttree.components.scoping;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import hu.bme.mit.inf.dslreasoner.faulttree.components.naming.PackageNameProvider;
import java.util.List;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.scoping.ICaseInsensitivityHelper;
import org.eclipse.xtext.scoping.IGlobalScopeProvider;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.impl.ImportNormalizer;
import org.eclipse.xtext.scoping.impl.ImportScope;
import org.eclipse.xtext.scoping.impl.ImportedNamespaceAwareLocalScopeProvider;

@Singleton
@SuppressWarnings("all")
public class CftLanguageImportedNamespaceAwareLocalScopeProvider extends ImportedNamespaceAwareLocalScopeProvider {
  @Inject
  private PackageNameProvider packageNameProvider;
  
  @Inject
  public CftLanguageImportedNamespaceAwareLocalScopeProvider() {
  }
  
  public CftLanguageImportedNamespaceAwareLocalScopeProvider(final IGlobalScopeProvider globalScopeProvider, final IQualifiedNameProvider qualifiedNameProvider, final IQualifiedNameConverter qualifiedNameConverter, final ICaseInsensitivityHelper caseInsensitivityHelper) {
    super(globalScopeProvider, qualifiedNameProvider, qualifiedNameConverter, caseInsensitivityHelper);
    PackageNameProvider _packageNameProvider = new PackageNameProvider(qualifiedNameConverter);
    this.packageNameProvider = _packageNameProvider;
  }
  
  @Override
  protected List<ImportNormalizer> internalGetImportedNamespaceResolvers(final EObject context, final boolean ignoreCase) {
    List<ImportNormalizer> _xblockexpression = null;
    {
      final List<ImportNormalizer> resolvers = super.internalGetImportedNamespaceResolvers(context, ignoreCase);
      final QualifiedName packageName = this.packageNameProvider.getPackageName(context);
      boolean _isEmpty = packageName.isEmpty();
      boolean _not = (!_isEmpty);
      if (_not) {
        final ImportNormalizer packageNormalizer = this.doCreateImportNormalizer(packageName, true, ignoreCase);
        resolvers.add(0, packageNormalizer);
      }
      _xblockexpression = resolvers;
    }
    return _xblockexpression;
  }
  
  public ImportScope createImportNormalizedScope(final IScope elements, final EObject context, final EReference reference) {
    ImportScope _xblockexpression = null;
    {
      final boolean ignoreCase = this.isIgnoreCase(reference);
      final EClass type = reference.getEReferenceType();
      final List<ImportNormalizer> namespaceResolvers = this.getImportedNamespaceResolvers(context, ignoreCase);
      _xblockexpression = this.createImportScope(elements, namespaceResolvers, null, type, ignoreCase);
    }
    return _xblockexpression;
  }
}
