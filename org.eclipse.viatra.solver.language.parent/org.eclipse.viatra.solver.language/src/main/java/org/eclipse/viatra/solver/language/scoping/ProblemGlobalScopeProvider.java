package org.eclipse.viatra.solver.language.scoping;

import java.util.LinkedHashSet;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.scoping.impl.ImportUriGlobalScopeProvider;

public class ProblemGlobalScopeProvider extends ImportUriGlobalScopeProvider {
	public static final String BUILTIN_LIBRARY_NAME = "builtin";

	public static final URI BULTIN_LIBRARY_URI = getLibraryUri(BUILTIN_LIBRARY_NAME);

	@Override
	protected LinkedHashSet<URI> getImportedUris(Resource resource) {
		LinkedHashSet<URI> importedUris = new LinkedHashSet<>();
		importedUris.add(BULTIN_LIBRARY_URI);
		return importedUris;
	}

	private static URI getLibraryUri(String libraryName) {
		return URI.createURI(ProblemGlobalScopeProvider.class.getClassLoader()
				.getResource("org/eclipse/viatra/solver/language/" + libraryName + ".problem").toString());
	}
}
