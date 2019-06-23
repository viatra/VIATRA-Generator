package ca.mcgill.ecse.dslreasoner.realistic.metrics.examples

import hu.bme.mit.inf.dslreasoner.domains.yakindu.sgraph.yakindumm.YakindummPackage
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.Neighbourhood2Gml
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.Neighbourhood2ShapeGraph
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.PartialInterpretation2ImmutableTypeLattice
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.visualisation.PartialInterpretation2Gml
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace
import java.io.PrintWriter
import linkedList.LinkedListPackage
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.viatra.query.runtime.rete.matcher.ReteEngine
import simpleStatechart.SimpleStatechartPackage

class CSERposterSample {
	static val neighbourhoodComputer = new PartialInterpretation2ImmutableTypeLattice
	static val Ecore2Logic ecore2Logic = new Ecore2Logic
	static val partialVisualizer = new PartialInterpretation2Gml
	static val neighbourhoodVisualizer = new Neighbourhood2Gml
	static val neighbouhood2ShapeGraph = new Neighbourhood2ShapeGraph
	static val depth = 1
	static val REALISTIC = "simpleSCRealistic"
	static val IRREALISTIC = "simpleSCIrrealistic"

	def static void main(String[] args) {
		Resource.Factory.Registry.INSTANCE.extensionToFactoryMap.put("*", new XMIResourceFactoryImpl)
		YakindummPackage.eINSTANCE.eClass
		LinkedListPackage.eINSTANCE.eClass
		SimpleStatechartPackage.eINSTANCE.eClass
		ReteEngine.getClass

		val outputs = "outputs"
		val instModName = "sampleList"
		val workspace = new FileSystemWorkspace('''resources''', "")
		val model = workspace.readModel(EObject, instModName + ".xmi")

		val partialModelOutput = Util.getPartialModel(workspace, model)

		val writer = new PrintWriter(outputs + "/" + instModName + "/" + instModName + "MODEL.gml")

		writer.print(partialVisualizer.transform(partialModelOutput))

		writer.close

		val hood = neighbourhoodComputer.createRepresentation(partialModelOutput, depth, Integer.MAX_VALUE,
			Integer.MAX_VALUE)

		val w2 = new PrintWriter(outputs + "/" + instModName + "/" + instModName + depth + "NEIGHBOURHOOD.gml")

		w2.print(neighbourhoodVisualizer.transform2gml(hood, partialModelOutput))
		w2.close

		val w3 = new PrintWriter(outputs + "/" + instModName + "/" + instModName + depth + "SHAPE.txt")

		val y = neighbouhood2ShapeGraph.createShapeGraph(hood, partialModelOutput)

		for (node : y.nodes) {
			w3.println("----------------------")
			w3.println("NEW NODE")
			var locNode = Util.toLocalNode(node.correspondingAND)
			w3.println("   -node type  : " + locNode)
			
			w3.println("   -Incoming Relations:")
			for (inRel : node.incomingEdges) {
				w3.println("       -----------------")
				w3.println("       -IN RELATION:")
				w3.println("              -type    : " + inRel.type)
				locNode = Util.toLocalNode(inRel.from.correspondingAND)
				w3.println("              -from    : " + locNode)
				w3.println("              -srcDis  : " + inRel.sourceDistrib)
				w3.println("              -trgDis  : " + inRel.targetDistrib)
			}
			w3.println()
			w3.println("    -Outgoing Relations:")
			for (outRel : node.outgoingEdges) {
				w3.println("       -----------------")
				w3.println("       -OUT RELATION:")
				w3.println("              -type    : " + outRel.type)
				locNode = Util.toLocalNode(outRel.to.correspondingAND)
				w3.println("              -to    : " + locNode)
				w3.println("              -srcDis  : " + outRel.sourceDistrib)
				w3.println("              -trgDis  : " + outRel.targetDistrib)
			}
		}
		w3.close

//		partialModelOutput.openWorldElements
	// RESULTS
//		print(hood)
	}
	
}
