package ca.mcgill.ecse.dslreasoner.realistic.metrics.examples

import hu.bme.mit.inf.dslreasoner.domains.yakindu.sgraph.yakindumm.YakindummPackage
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2Logic
import hu.bme.mit.inf.dslreasoner.ecore2logic.Ecore2LogicConfiguration
import hu.bme.mit.inf.dslreasoner.ecore2logic.EcoreMetamodelDescriptor
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretation2logic.InstanceModel2PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.PartialInterpretation2ImmutableTypeLattice
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.visualisation.PartialInterpretation2Gml
import hu.bme.mit.inf.dslreasoner.workspace.FileSystemWorkspace
import java.util.Collections
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EEnum
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.viatra.query.runtime.rete.matcher.ReteEngine
import java.io.PrintWriter
import linkedList.LinkedListPackage
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.Neighbourhood2Gml
import simpleStatechart.SimpleStatechartPackage
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.Neighbourhood2ShapeGraph
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.LocalNodeDescriptor
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood.FurtherNodeDescriptor

class CSERposterSample {
	static val partialInterpretation2Logic = new InstanceModel2PartialInterpretation
	static val neighbourhoodComputer = new PartialInterpretation2ImmutableTypeLattice
	static val Ecore2Logic ecore2Logic = new Ecore2Logic
	static val partialVisualizer = new PartialInterpretation2Gml
	static val neighbourhoodVisualizer = new Neighbourhood2Gml
	static val neighbouhood2ShapeGraph = new Neighbourhood2ShapeGraph
	static val depth = 0
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

		val pckg = model.eClass.EPackage
		val metamodel = new EcoreMetamodelDescriptor(
			pckg.EClassifiers.filter(EClass).toList,
			Collections::emptySet,
			false,
			pckg.EClassifiers.filter(EEnum).toList,
			pckg.EClassifiers.filter(EEnum).map[ELiterals].flatten.toList,
			pckg.EClassifiers.filter(EClass).map[EReferences].flatten.toList,
			pckg.EClassifiers.filter(EClass).map[EAttributes].flatten.toList
		)
		val metamodelTransformationOutput = ecore2Logic.transformMetamodel(metamodel, new Ecore2LogicConfiguration)

		val partialModelOutput = partialInterpretation2Logic.transform(metamodelTransformationOutput, model.eResource,
			false)

		val writer = new PrintWriter(outputs + "//" + instModName + "MODEL.gml")

		writer.print(partialVisualizer.transform(partialModelOutput))

		writer.close

		val hood = neighbourhoodComputer.createRepresentation(partialModelOutput, depth, Integer.MAX_VALUE,
			Integer.MAX_VALUE)

		val w2 = new PrintWriter(outputs + "/" + instModName + depth + "NEIGHBOURHOOD.gml")

		w2.print(neighbourhoodVisualizer.transform(hood, partialModelOutput))
		w2.close

		val w3 = new PrintWriter(outputs + "/" + instModName + depth + "SHAPE.txt")

		val y = neighbouhood2ShapeGraph.createShapeGraph(hood, partialModelOutput)

		for (node : y.nodes) {
			w3.println("----------------------")
			w3.println("NEW NODE")
			if (depth == 1) {
				w3.println("   -node type  : " +
					((node.correspondingAND as FurtherNodeDescriptor).previousRepresentation as LocalNodeDescriptor).
						types)
			} else {
				w3.println("   -node type  : " + (node.correspondingAND as LocalNodeDescriptor).types)
			}

			w3.println("   -Incoming Relations:")
			for (inRel : node.incomingEdges) {
				w3.println("       -----------------")
				w3.println("       -IN RELATION:")
				w3.println("              -type    : " + inRel.type)
				if (depth == 1) {
					w3.println("              -from    : " +
						((inRel.from.correspondingAND as FurtherNodeDescriptor).
							previousRepresentation as LocalNodeDescriptor).types)
				} else {
					w3.println("              -from    : " + (inRel.from.correspondingAND as LocalNodeDescriptor).types)
				}
				w3.println("              -srcDis  : " + inRel.sourceDistrib)
				w3.println("              -trgDis  : " + inRel.targetDistrib)
			}
			w3.println()
			w3.println("    -Outgoing Relations:")
			for (outRel : node.outgoingEdges) {
				w3.println("       -----------------")
				w3.println("       -OUT RELATION:")
				w3.println("              -type    : " + outRel.type)
				if (depth == 1) {
					w3.println("              -to      : " +
						((outRel.to.correspondingAND as FurtherNodeDescriptor).
							previousRepresentation as LocalNodeDescriptor).types)
				} else {
					w3.println("              -to      : " + (outRel.to.correspondingAND as LocalNodeDescriptor).types)
				}
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
