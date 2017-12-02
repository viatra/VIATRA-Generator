package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.visualisation

import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement
import java.util.Map
import java.util.HashMap
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDefinition
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialRelationInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.BinaryElementRelationLink
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Relation
import java.util.Set
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.ralismcalculator.RealismCalculator
import java.io.PrintStream
import java.io.FileOutputStream
import java.io.FileDescriptor

class PartialInterpretation2Gml {
	def public transform(PartialInterpretation i) {
		var postGenCalculationStartTime = System.nanoTime();
//		System.setOut(new PrintStream(new FileOutputStream(FileDescriptor.out)))
//		System.out.print("_____________")
		var numberOfElements = RealismCalculator.getNumberOfElements(i)
		var numberOfRepeaters = RealismCalculator.getNumberOfRepeaters(i)
		var percentageOfRepeaters = RealismCalculator.calculatePercentageOfRepeatersInSmartGrid(i)
		System.out.print("SumElements;" + numberOfElements + ";")
		System.out.print("Repeaters;" + numberOfRepeaters + ";")
		System.out.print("RepPercentage;" + percentageOfRepeaters + ";")
//		System.out.print("_____________")
		var minimumRepeaterDegree = RealismCalculator.calculateMinimumDegreeOfRepeaters(i)
		var maximumRepeaterDegree = RealismCalculator.calculateMaximumDegreeOfRepeaters(i)
		var averageRepeaterDegree = RealismCalculator.calculateAverageRepeaterDegree(i)
		System.out.print("MinRepeaterDegree;" + minimumRepeaterDegree + ";");
		System.out.print("MaxRepeaterDegree;" + maximumRepeaterDegree + ";");
		System.out.print("AvgRepeaterDegree;" + averageRepeaterDegree + ";");		
//		System.out.print("_____________")
		var minimumConcentratorDegree = RealismCalculator.calculateMinimumDegreeOfConcentrators(i)
		var maximumConcentratorDegree = RealismCalculator.calculateMaximumDegreeOfConcentrators(i)
		var avgConcentratorDegree = RealismCalculator.calculateAverageConcentratorDegree(i)
		System.out.print("MinConcentratorDegree;" + minimumConcentratorDegree + ";");
		System.out.print("MaxConcentratorDegree;" + maximumConcentratorDegree + ";");
		System.out.print("AvgConcentratorDegree;" + avgConcentratorDegree + ";");
//		System.out.print("_____________")
		var maxHops = RealismCalculator.calculateMaximumNumberOfHops(i)
		var minHops= RealismCalculator.calculateMinimumNumberOfHops(i)
		var avgHops= RealismCalculator.calculateAverageNumberOfHops(i)
		System.out.print("MaxHops;" + maxHops + ";");
		System.out.print("MinHops;" + minHops + ";");
		System.out.print("AvgHops;" + avgHops + ";");
//		System.out.print("_____________")
		var postGenElapsedTime = (System.nanoTime()-postGenCalculationStartTime)		
		System.out.print("Post Generation Realism Calculation Time;" + postGenElapsedTime + ";")
		System.out.print("Post Generation Realism Calculation Time In Seconds;" + postGenElapsedTime *0.000000001 + ";")
		var generationCalculationTime = i.elapsedTime
		System.out.print("Realism Calculation Time During Generation;" + generationCalculationTime + ";")
		System.out.print("Realism Calculation Time During Generation In Seconds;" + generationCalculationTime *0.000000001 + ";")
		var totalCalculationTime = postGenElapsedTime + generationCalculationTime
		System.out.print("Total Realism Calculation Time;" + totalCalculationTime + ";")
		System.out.print("Total Realism Calculation Time In Seconds;" + totalCalculationTime*0.000000001 + ";")
//		System.out.print("_____________")
		val p = i.problem
		val Map<DefinedElement, Integer> objectToID = new HashMap
		val containmentRelations = p.containmentHierarchies.map[it.containmentRelations].flatten.toSet
		'''
		graph
		[
			«FOR object:p.elements + i.newElements SEPARATOR '\n'»
				«this.transformObject(object,object.typesOfElement(i),objectToID, i)»
			«ENDFOR»
			«FOR relation:i.partialrelationinterpretation»
				«FOR link:relation.relationlinks.filter(BinaryElementRelationLink)»
					«transformLink(relation,link,objectToID,containmentRelations)»
				«ENDFOR»
			«ENDFOR»
		]
		'''.toString
	}
	def typesOfElement(DefinedElement e, PartialInterpretation i) {
		i.problem.types.filter(TypeDefinition).filter[it.elements.contains(e)] +
		i.partialtypeinterpratation.filter[it.elements.contains(e)].map[it.interpretationOf]
	}
	
	val protected titleSize = 16
	val protected attributeSize = 14
	val protected borderDistance = 6
	val protected attributeBorderDistance = 8
	val protected ratio = 11.0/20.0
	
	def protected transformObject(DefinedElement object,Iterable<Type> types,Map<DefinedElement, Integer> objectToID, PartialInterpretation i){
		val title = object.transormTitle
		val attributes = types.map[it.name]
		
		//SmartGrid
		val degree = RealismCalculator.calculateDegreeOfNode(object)
		val isRepeater = RealismCalculator.elementIsRepeater(object, i)
		val hops = RealismCalculator.calculateNumberOfHopsForSmartGridElement(object)
		
		var double width = title.length*titleSize + borderDistance*2;
		for(x:attributes.map[length*attributeSize + borderDistance*2 + attributeBorderDistance*2])
			width = Math::max(width,x)
		width = width*ratio
		
		val height = Math::max(
			titleSize+4,
			(attributes.size+1)*attributeSize + borderDistance*2)+38
		
		val id = objectToID.size
		objectToID.put(object,id)
		
		'''
		node
			[
				id	«id»
				graphics
				[
					w	«width»
					h	«height»
					type	"rectangle"
					fill	"#FFFFFF"
					fill2	"#FFFFFF"
					outline	"#000000"
				]
				LabelGraphics
				[
					text	"«title»"
					outline	"#000000"
					fill	"#FFFFFF"
					fontSize	«titleSize»
					fontName	"Monospace"
					autoSizePolicy	"node_width"
					anchor	"t"
					borderDistance	0.0
				]
				LabelGraphics
				[
					text	"
		«FOR attribute : attributes»
		«attribute»
		«ENDFOR»
		Degree: «degree»
		Repeater: «isRepeater»
		#Hops: «hops»"
					fontSize	«attributeSize»
					fontName	"Consolas"
					alignment	"left"
					anchor	"tl"
					borderDistance	«borderDistance»
				]
			]
		'''
	}
	
	def protected transormTitle(DefinedElement object) {
		if(object.name!= null)object.name
		else "null"
	}
	
	def protected transformLink(
		PartialRelationInterpretation reference,
		BinaryElementRelationLink link,
		Map<DefinedElement, Integer> objectToID,
		Set<Relation> containmentRelations)
	{
		'''
		edge
		[
			source	«objectToID.get(link.param1)»
			target	«objectToID.get(link.param2)»
			graphics
			[
				fill	"#000000"
				«IF containmentRelations.contains(reference.interpretationOf)»
					width	3
				«ENDIF»
				targetArrow	"standard"
			]
			LabelGraphics
			[
				text	"«reference.interpretationOf.name»"
				fontSize	14
				fontName	"Consolas"
				configuration	"AutoFlippingLabel"
				model	"six_pos"
				position	"thead"
			]
		]
		'''
	}
}