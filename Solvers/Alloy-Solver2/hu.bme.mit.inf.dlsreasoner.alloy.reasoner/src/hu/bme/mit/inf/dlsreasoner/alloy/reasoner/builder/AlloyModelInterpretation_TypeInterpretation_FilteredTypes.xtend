package hu.bme.mit.inf.dlsreasoner.alloy.reasoner.builder

import edu.mit.csail.sdg.alloy4compiler.ast.ExprVar
import edu.mit.csail.sdg.alloy4compiler.ast.Sig
import edu.mit.csail.sdg.alloy4compiler.ast.Sig.Field
import edu.mit.csail.sdg.alloy4compiler.translator.A4Solution
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguageFactory
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDeclaration
import java.util.ArrayList
import java.util.List
import java.util.Map

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*

class AlloyModelInterpretation_TypeInterpretation_FilteredTypes implements AlloyModelInterpretation_TypeInterpretation{
	protected val extension LogiclanguageFactory factory = LogiclanguageFactory.eINSTANCE
	
	override resolveUnknownAtoms(
		Iterable<ExprVar> objectAtoms, 
		A4Solution solution,
		Logic2AlloyLanguageMapperTrace forwardTrace,
		Map<String, Sig> name2AlloySig,
		Map<String, Field> name2AlloyField,
		Map<String,DefinedElement> expression2DefinedElement,
		Map<TypeDeclaration, List<DefinedElement>> interpretationOfUndefinedType)
	{
		/*val Map<String,DefinedElement> expression2DefinedElement = new HashMap()
		val Map<TypeDeclaration, List<DefinedElement>> interpretationOfUndefinedType = new HashMap;*/
		
		val typeTrace = forwardTrace.typeMapperTrace as Logic2AlloyLanguageMapper_TypeMapperTrace_FilteredTypes
		
		// 1. Evaluate the defined elements
		for(definedElementMappingEntry : typeTrace.definedElement2Declaration.entrySet) {
			val name = definedElementMappingEntry.value.name
			val matchingSig = '''this/«name»'''.toString.lookup(name2AlloySig)
			val elementsOfSingletonSignature = solution.eval(matchingSig)
			if(elementsOfSingletonSignature.size != 1) {
				throw new IllegalArgumentException('''Defined element is unambigous: "«name»", possible values: «elementsOfSingletonSignature»!''')
			} else {
				val expressionOfDefinedElement	= elementsOfSingletonSignature.head.atom(0)// as ExprVar
				expression2DefinedElement.put(expressionOfDefinedElement, definedElementMappingEntry.key)
			}
		}
		
		// 2. evaluate the signatures and create new elements if necessary
		for(type2SingatureEntry : typeTrace.type2ALSType.entrySet) {
			val type = type2SingatureEntry.key
			if(type instanceof TypeDeclaration) {
				val name = type2SingatureEntry.value.name
				val matchingSig = '''this/«name»'''.toString.lookup(name2AlloySig)
				val elementsOfSignature = solution.eval(matchingSig)
				val elementList = new ArrayList(elementsOfSignature.size)
				var newVariableIndex = 1;
				for(elementOfSignature : elementsOfSignature) {
					val expressionOfDefinedElement	= elementOfSignature.atom(0)
					if(expression2DefinedElement.containsKey(expressionOfDefinedElement)) {
						elementList += expressionOfDefinedElement.lookup(expression2DefinedElement)
					} else {
						val newElementName = '''newObject «newVariableIndex.toString»'''
						val newRepresentation = createDefinedElement => [
							it.name = newElementName
						]
						elementList += newRepresentation
						expression2DefinedElement.put(expressionOfDefinedElement,newRepresentation)
					}
				}
				interpretationOfUndefinedType.put(type,elementList)
			}
		}
	}
}