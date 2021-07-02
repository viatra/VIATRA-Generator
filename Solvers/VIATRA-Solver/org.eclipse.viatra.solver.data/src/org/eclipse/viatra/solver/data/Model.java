package org.eclipse.viatra.solver.data;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Model {
	Set<ModelObject> objects;
	Map<String,Map<List<ModelObject>,TruthValue>> interpretation;
}
