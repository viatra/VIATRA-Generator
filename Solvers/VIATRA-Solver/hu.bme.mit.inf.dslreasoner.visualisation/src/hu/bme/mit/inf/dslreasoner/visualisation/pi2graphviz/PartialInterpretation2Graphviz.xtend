package hu.bme.mit.inf.dslreasoner.visualisation.pi2graphviz

import guru.nidi.graphviz.attribute.Shape
import guru.nidi.graphviz.attribute.Style
import guru.nidi.graphviz.engine.Format
import guru.nidi.graphviz.engine.Graphviz
import guru.nidi.graphviz.engine.GraphvizV8Engine
import guru.nidi.graphviz.model.Graph
import guru.nidi.graphviz.model.Label
import guru.nidi.graphviz.model.Node
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Relation
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDefinition
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.BinaryElementRelationLink
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PartialInterpretation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.visualisation.PartialInterpretationVisualisation
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.visualisation.PartialInterpretationVisualiser
import hu.bme.mit.inf.dslreasoner.workspace.ReasonerWorkspace
import java.io.File
import java.util.HashMap
import java.util.HashSet
import java.util.LinkedList
import java.util.List
import java.util.Random
import java.util.Set

import static guru.nidi.graphviz.model.Factory.*

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*
import java.awt.image.BufferedImage
import java.util.Collection
import org.eclipse.xtext.xbase.lib.Functions.Function1

class GraphvizVisualisation implements PartialInterpretationVisualiser {
	
	val TypeColoringStyle typeColoringStyle = TypeColoringStyle::AVERAGE;
	val smallFontSize=9
	val keywords = #{"class","reference","literal","enum"}
	
	override visualiseConcretization(PartialInterpretation partialInterpretation) {
		visualisePartialInterpretation(partialInterpretation,true)
	}
	
	override visualisePartialSolution(PartialInterpretation partialInterpretation) {
		visualisePartialInterpretation(partialInterpretation,false)
	}
	
	def private getElements(PartialInterpretation model) {
		return
			model.problem.elements +
			model.newElements +
			model.booleanelements+
			model.integerelements+
			model.stringelement+
			model.realelements
	}
	
	def private visualisePartialInterpretation(PartialInterpretation partialInterpretation, boolean concretizationOnly) {
		val problem = partialInterpretation.problem
		
		// Elements of the partial solutions
		val oldElements = problem.elements
		val newElements = partialInterpretation.newElements
		//val prototypeElements = #[partialInterpretation.openWorldElementPrototype]
		val allElements = getElements(partialInterpretation)
		
		// Indexing types
		val mustTypes = new HashMap<DefinedElement,Set<Type>>
		val mayTypes = new HashMap<DefinedElement,Set<Type>>
		for(element : allElements) {
			mustTypes.put(element,new HashSet)
			mayTypes.put(element,new HashSet)
		}
		for(typeDefinition: problem.types.filter(TypeDefinition)) {
			for(element : typeDefinition.elements) {
				mustTypes.get(element)+=typeDefinition
			}
		}
		for(partialTypeInterpretations: partialInterpretation.partialtypeinterpratation) {
			for(element : partialTypeInterpretations.elements) {
				mustTypes.get(element)+=partialTypeInterpretations.interpretationOf
			}
		}
		
		// Indexing references
		
		// Drawing the nodes
		val elements2Node = new HashMap
		val elements2ID = new HashMap
		for(oldElemenetIndex : 0..<oldElements.size) {
			val oldElement = oldElements.get(oldElemenetIndex)
			val id = '''o «oldElemenetIndex»'''			
			val image = drawElement(oldElement,id,true,oldElement.lookup(mustTypes),emptySet)
			elements2ID.put(oldElement, id)
			elements2Node.put(oldElement, image)
		}
		for(newElementIndex: 0..<newElements.size) {
			val newElement = newElements.get(newElementIndex)
			val id = '''n «newElementIndex»'''
			val image = drawElement(newElement,id,false,newElement.lookup(mustTypes),emptySet)
			elements2ID.put(newElement,id)
			elements2Node.put(newElement,image)
		}
//		for(booleanElementIndex: 0..<partialInterpretation.booleanelements.size) {
//			val newElement = partialInterpretation.booleanelements.get(booleanElementIndex)
//			val id = '''«newElement.value»'''
//			val image = drawElement(newElement,id,false,emptySet,emptySet)
//			elements2ID.put(newElement,id)
//			elements2Node.put(newElement,image)
//		}
		
		partialInterpretation.booleanelements.drawDataTypes([it.value.toString],elements2Node,elements2ID)
		partialInterpretation.integerelements.drawDataTypes([it.value.toString],elements2Node,elements2ID)
		partialInterpretation.stringelement.drawDataTypes(['''"«it.value.toString»"'''],elements2Node,elements2ID)
		partialInterpretation.realelements.drawDataTypes([it.value.toString],elements2Node,elements2ID)
		
		// Drawing the edges
		val edges = new HashMap
		for(element : elements2Node.values) {
			edges.put(element,new LinkedList)
		}
		for(relationInterpretation : partialInterpretation.partialrelationinterpretation) {
			val type = relationInterpretation.interpretationOf
			val isContainment = problem.containmentHierarchies.exists[it.containmentRelations.contains(type)]
			for(link : relationInterpretation.relationlinks.filter(BinaryElementRelationLink)) {
				val sourceNode = link.param1.lookup(elements2Node)
				val targetNode = link.param2.lookup(elements2Node)
				
				val edge = drawEdge(link,type,targetNode,isContainment)
				sourceNode.lookup(edges).add(edge)
			}
		}
		
		val graph = graph("PartialInterpretation").directed.with(
			edges.entrySet.map[entry | entry.key.link(entry.value)]
		)
		
		return new GraphvisVisualisation(graph)
	}
	
	def protected <T extends DefinedElement> void drawDataTypes(Collection<T> collection, Function1<T,String> namer, HashMap<DefinedElement, Node> elements2Node, HashMap<DefinedElement, String> elements2ID) {
		for(booleanElementIndex: 0..<collection.size) {
			val newElement = collection.get(booleanElementIndex)
			val id = namer.apply(newElement)
			val image = drawElement(newElement,id,false,emptySet,emptySet)
			elements2ID.put(newElement,id)
			elements2Node.put(newElement,image)
		}
	}
	
	def protected drawElement(DefinedElement element, String ID, boolean old, Set<Type> mustTypes, Set<Type> mayTypes) {
		var tableStyle =  ''' CELLSPACING="0" BORDER="2" CELLBORDER="0" CELLPADDING="1" STYLE="ROUNDED"'''
		if(typeColoringStyle==TypeColoringStyle::AVERAGE) {
			tableStyle += ''' BGCOLOR="#«typePredicateColor(mustTypes).toBackgroundColorString»"'''
		}
		val mainLabel = if(element.name !== null) {
			val parts = element.name.split("\\s+")
			textWithSubSup(parts.getOrNull(0),parts.getOrNull(1),parts.getOrNull(2),null)
		} else {
			val parts = ID.split("\\s+")
			textWithSubSup(parts.get(0),parts.get(1),parts.getOrNull(2),null)
		}
		val label = Label.html(
			'''<TABLE«tableStyle»>'''+
			'''<TR><TD COLSPAN="2" BORDER="2" SIDES="B">«mainLabel»</TD></TR>'''+
			'''«FOR mustTypeName : mustTypes.map[it.name].sort»«typePredicateDescription(mustTypeName,true)»«ENDFOR»'''+
			'''«FOR mayTypeName : mayTypes.map[it.name].sort»«typePredicateDescription(mayTypeName,false)»«ENDFOR»'''+
			'''</TABLE>''')
			
		val node = node(ID).with(label).with(
			Shape.NONE
			//,
			//Attributes::attr("margin","0")
			//new MapAttributes() => [add("margin", "0")]
		)
		return node
	}
	
	protected def drawEdge(BinaryElementRelationLink link, Relation relation, Node to, boolean isContainemnt) {
		val nameSegments = relation.name.split("\\s+")
		var l = to(to).with(Label.html(textWithSubSup(nameSegments.getOrNull(0),nameSegments.getOrNull(1),nameSegments.getOrNull(2),null)))
		if(isContainemnt) {
			l = l.with(Style.BOLD)
		}
		return l
	}
	
	private def <T> getOrNull(List<T> list, int index) {
		if(list.size>index) return list.get(index)
		else return null
	}
	
	def private textWithSubSup(String text, String sub, String sup, String after) {
		val actualText = text
		val actualSub = if(sub===null) {" "} else {sub.checkAndHighlightKeyword}
		val actualSup = if(sup==null) {" "} else {sup.checkAndHighlightKeyword}
		val actualAfter = if(after === null) {""} else {
			'''<TD ROWSPAN="2" ALIGN="LEFT">«after»</TD>'''
		}
		return
			'''<FONT FACE="helvetica"><Table  CELLSPACING="0" BORDER="0" CELLBORDER="0" CELLPADDING="0">'''+
				'''<TR><TD ROWSPAN="2" ALIGN="RIGHT">«actualText»</TD><TD ALIGN="LEFT" VALIGN="BOTTOM"><FONT POINT-SIZE="«smallFontSize»">«actualSup»</FONT></TD>«actualAfter»</TR>'''+
				'''<TR><TD ALIGN="LEFT" VALIGN="TOP"><FONT POINT-SIZE="«smallFontSize»">«actualSub»</FONT></TD></TR>'''+
			'''</Table></FONT>'''
	}
	def checkAndHighlightKeyword(String word) {
		if(keywords.contains(word)) {
			return '''<B>«word»</B>'''
		} else {
			word
		}
	}
	def typePredicateDescription(String typeName, boolean must)
	{
		val value = if(must){'''1'''} else{'''½'''}
		val backgroundColor = if(this.typeColoringStyle == TypeColoringStyle.FLAG) {
			''' BGCOLOR="#«typeName.typePredicateColor.toBackgroundColorString»"'''
		} else {
			""
		}
		val typeNameSegments = typeName.split("\\s+")
		return '''<TR><TD«backgroundColor»>«textWithSubSup(typeNameSegments.getOrNull(0),typeNameSegments.getOrNull(1),typeNameSegments.getOrNull(2),null)»</TD><TD«backgroundColor»> = «value» </TD></TR>'''
	}
	def toBackgroundColorString(List<Integer> backgroundColor) {
		'''«Integer.toHexString(backgroundColor.get(0))»«Integer.toHexString(backgroundColor.get(1))»«Integer.toHexString(backgroundColor.get(2))»'''
	}
	protected def typePredicateColor(Set<Type> types) { types.averageColor }
	protected def typePredicateColor(String name) {
		val Random random = new Random(name.hashCode)
		val rangePicker = [|random.nextInt(128)+128]
		return #[rangePicker.apply(), rangePicker.apply(), rangePicker.apply()]
	}
	private def averageColor(Set<Type> types) {
		if(types.empty) {
			return #[256,256,256]
		} else {
			val typeColors = types.filter[!it.isIsAbstract].map[typePredicateColor(it.name)]
			return #[
				typeColors.map[get(0)].average,
				typeColors.map[get(1)].average,
				typeColors.map[get(2)].average
			]
		}
	}
	private def average(Iterable<Integer> doubles) { return doubles.reduce[p1, p2|p1+p2]/doubles.size }
	
	
	
	
}

enum TypeColoringStyle {
	FLAG, AVERAGE
}

class GraphvisVisualisation implements PartialInterpretationVisualisation {
	val private Graph graph
	
	public new(Graph graph) {
		this.graph = graph
	}
	
	override writeToFile(ReasonerWorkspace workspace, String name) {
		val file = workspace.getFile('''«name».svg''')
		//val bufferedImage = new BufferedImage 
		Graphviz.useEngine(new GraphvizV8Engine());
		Graphviz.fromGraph(graph)//.engine(Engine::NEATO)
		.render(Format.SVG_STANDALONE).toFile(file)
		workspace.refreshFile('''«name».svg''')
	}
}
