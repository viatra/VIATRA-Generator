package ca.mcgill.dslreasoner.runner;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.impl.EcorePackageImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.viatra.query.runtime.rete.matcher.ReteEngine;

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.app.Domain;
import fr.inria.atlanmod.instantiator.GenerationException;
import fr.obeo.emf.specimen.SpecimenGenerator;
import github.impl.GithubPackageImpl;
import hu.bme.mit.inf.dslreasoner.domains.yakindu.sgraph.yakindumm.impl.YakindummPackageImpl;

public class Main {
	public static void main(String[] args) throws IllegalArgumentException, GenerationException, IOException {
		Domain d = Domain.valueOf(args[0]);
		
		org.apache.log4j.Logger.getRootLogger();
		RandomEMFRunner.LOGGER.setLevel(Level.OFF);
		SpecimenGenerator.LOGGER.setLevel(Level.OFF);		
		ReteEngine.class.getClass();
		
		if(d == Domain.Yakindumm){
			YakindummPackageImpl.eINSTANCE.eClass();
		}else if (d == Domain.Ecore){
			EcorePackageImpl.eINSTANCE.eClass();
		}else if (d == Domain.Github){
			GithubPackageImpl.eINSTANCE.eClass();
		}
		
		
		
		long start = System.nanoTime();
		BestKRunner bestSelectorRunner = new BestKRunner(100, 3600000, d, 100);		
		IGeneratorRunner runner = args[1].equals("RandomEMF")?new RandomEMFRunner(Arrays.copyOfRange(args, 2, args.length)) : new ViatraRunner(args[2], args[3]);
		bestSelectorRunner.setRunner(runner);
		
		List<EObject> roots = bestSelectorRunner.generate();
		System.out.println((System.nanoTime() - start) / 1000000);

		
		
		ResourceSetImpl resourceSet = new ResourceSetImpl();
		System.out.println("Size is " + roots.size());
		for(int i = 0; i < roots.size(); i++) {
			System.out.println(i);
			Resource resource = resourceSet.createResource(formatURI("output/" + args[1] + "/", d.toString(), 30, i));
			resource.getContents().add(roots.get(i));
			resource.save(Collections.emptyMap());
		}
	}
	
	protected static URI formatURI(String path, String modelPrefix, long maxElement, int index) {
		StringBuilder builder = new StringBuilder();
		builder.append(path);
		builder.append(File.separator);
		builder.append(modelPrefix);
		builder.append(File.separator);
		builder.append("result");
		builder.append(maxElement);
		builder.append("_");
		builder.append(index);
		builder.append(".");
		builder.append(XMIResource.XMI_NS);;
		return URI.createFileURI(builder.toString());
	}
}
