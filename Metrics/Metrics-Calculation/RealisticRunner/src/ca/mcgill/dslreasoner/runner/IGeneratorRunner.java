package ca.mcgill.dslreasoner.runner;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

public interface IGeneratorRunner {
	List<EObject> runGeneration(int run) throws Exception;
}
