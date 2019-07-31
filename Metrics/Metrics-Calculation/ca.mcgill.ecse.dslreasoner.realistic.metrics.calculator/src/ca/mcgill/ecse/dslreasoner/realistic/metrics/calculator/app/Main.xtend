package ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.app

import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.graph.EMFGraph
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.io.CsvFileWriter
import ca.mcgill.ecse.dslreasoner.realistic.metrics.calculator.io.GraphReader
import hu.bme.mit.inf.dslreasoner.domains.yakindu.sgraph.yakindumm.impl.YakindummPackageImpl
import java.util.ArrayList
import org.eclipse.emf.ecore.EcorePackage

//import yakindumm2.impl.Yakindumm2PackageImpl

class Main {
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
		YakindummPackageImpl.eINSTANCE.eClass;
		EcorePackage.eINSTANCE.eClass;
//		Yakindumm2PackageImpl.eINSTANCE.eClass;
		//val infos = initData();									
										
		println("Start Reading Models...");
		var reader = new GraphReader(EcorePackage.eINSTANCE, ".xmi");
//		for(info : infos){
//			calculateAllModels(info.inputFolder, info.outputFolder,info.numRuns, reader);
//		}
		
		//human input has different package declaration
//		reader = new GraphReader(Yakindumm2PackageImpl.eINSTANCE);
		val human = new RWInformation("Inputs/viatra75/", "outputs/", 50);
		calculateAllModels(human.inputFolder, human.outputFolder,human.numRuns, reader);
		
		
		println("finished");
	}
	
	static def initData(){
		val infos = new ArrayList<RWInformation>();
		infos.add(new RWInformation("inputs/alloyInput/models/", "../plot/statistics/alloyOutput/", 20));
		infos.add(new RWInformation("inputs/randomInput/models/", "../plot/statistics/randomOutput/", 20));
		infos.add(new RWInformation("inputs/viatraInput30/", "../plot/statistics/viatraOutput30/", 20));
		infos.add(new RWInformation("inputs/viatraInput100/", "../plot/statistics/viatraOutput100/", 10));
		return infos;
	}
	
	static def calculateAllModels(String inputFolder, String outputFolder, int numRuns, GraphReader reader){
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
		CsvFileWriter.write(model.evaluateAllMetrics(), fileName);
	}
}