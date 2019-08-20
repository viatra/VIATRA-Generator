package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.app

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.graph.EMFGraph
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.io.CsvFileWriter
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.io.GraphReader
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.validation.ViolationCheck
import hu.bme.mit.inf.dslreasoner.domains.yakindu.sgraph.yakindumm.impl.YakindummPackageImpl
import java.io.File
import java.util.ArrayList
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EcorePackage
import org.eclipse.viatra.query.runtime.rete.matcher.ReteEngine
import org.eclipse.emf.ecore.impl.EcorePackageImpl
import org.eclipse.emf.ecore.EReference

//import yakindumm2.impl.Yakindumm2PackageImpl

class Main {
	var static Domain d = Domain.Yakindumm;
	val static String suffix = '.xmi'
	val static String OUTPUT_FOLDER = "Inputs/measurement2/yakindu/Alloy/";
	val static String INPUT_FOLDER = "outputs/measurement2/yakindu/Alloy/";
	val static int NUM_RUNS = 1;
	
	static class RWInformation{
		public var String inputFolder;
		public var String outputFolder;
		public var int numRuns;
		
		new(String inputFolder, String outputFolder, int numRuns){
			this.inputFolder = inputFolder;
			this.outputFolder = outputFolder;
			this.numRuns = numRuns;
		}
	}
	
	def static void main(String[] args){
		//init model
		var EPackage metamodel;
		//init viatra engine for the violation checker
		ReteEngine.getClass();
		
		if(d == Domain.Yakindumm){
			YakindummPackageImpl.eINSTANCE.eClass;
			metamodel = YakindummPackageImpl.eINSTANCE;
		}else if (d == Domain.Ecore){
			EcorePackage.eINSTANCE.eClass;
			metamodel = EcorePackageImpl.eINSTANCE;
		}else if (d == Domain.Github){
			//TODO: Initialize Github Package
		}
		
										
		println("Start Reading Models...");
		var reader = new GraphReader(metamodel, suffix);

		val models = new RWInformation(OUTPUT_FOLDER, INPUT_FOLDER, NUM_RUNS);
		calculateAllModels(models.inputFolder, models.outputFolder,models.numRuns, reader);	
		println("finished");
	}
	
	static def calculateAllModels(String inputFolder, String outputFolder, int numRuns, GraphReader reader){
		(new File(outputFolder)).mkdir();
		for(var i = 1; i <= numRuns; i++){
			val models = new ArrayList<EMFGraph>();
			models.addAll(reader.readModels(inputFolder + "run" + i));
			for(model : models){
				calculateAndOutputMetrics(model, YakindummPackageImpl.eNAME, outputFolder+model.name+"_run_"+i+".csv");
			}
		}
		println("output results Ended for: " + outputFolder);
		
		
	}
	
	static def calculateAndOutputMetrics(EMFGraph model, String metaModel, String fileName){
		//println("evaluating for " + model.name);		
		model.metaModel = metaModel;
		
		//remove eGenericType for Ecore domain
		if(d == Domain.Ecore){
			var refsToRemove = EcorePackageImpl.eINSTANCE.eAllContents.filter(EReference).filter[
				it.name.equals('eGenericType') || it.name.equals('eGenericSuperTypes') || it.name.equals('eFactoryInstance')||
				it.name.equals('eGenericExceptions') || it.name.equals('references') || it.name.equals('contents');
			];
			refsToRemove.forEach[model.removeReference(it)];
		}
		
		var outputs = model.evaluateAllMetrics();
		var violations = ViolationCheck.calculateViolationCounts(model.root, d);
		println(violations);
		var violationsOutput = newArrayList('violations', violations+'');
		outputs.add(violationsOutput);
		CsvFileWriter.write(outputs, fileName);
	}
}