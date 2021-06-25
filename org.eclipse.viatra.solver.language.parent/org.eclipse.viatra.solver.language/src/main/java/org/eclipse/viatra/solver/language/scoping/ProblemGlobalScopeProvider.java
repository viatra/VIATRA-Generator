package org.eclipse.viatra.solver.language.scoping;

import java.util.LinkedHashSet;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.scoping.impl.ImportUriGlobalScopeProvider;

public class ProblemGlobalScopeProvider extends ImportUriGlobalScopeProvider {
	public static final URI LIBRARY_URI = URI.createURI(ProblemGlobalScopeProvider.class.getClassLoader()
			.getResource("org/eclipse/viatra/solver/language/library.problem").toString());

	@Override
	protected LinkedHashSet<URI> getImportedUris(Resource resource) {
		LinkedHashSet<URI> importedUris = super.getImportedUris(resource);
		importedUris.add(LIBRARY_URI);
		return importedUris;
	}
}
