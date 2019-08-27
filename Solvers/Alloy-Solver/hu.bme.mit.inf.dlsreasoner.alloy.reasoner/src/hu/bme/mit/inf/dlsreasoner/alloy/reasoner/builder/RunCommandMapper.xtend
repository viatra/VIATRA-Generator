package hu.bme.mit.inf.dlsreasoner.alloy.reasoner.builder

import hu.bme.mit.inf.dlsreasoner.alloy.reasoner.AlloySolverConfiguration
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSDocument
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSInt
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSNumberLiteral
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSRunCommand
import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSTerm
import hu.bme.mit.inf.dslreasoner.alloyLanguage.AlloyLanguageFactory
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicSolverConfiguration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDefinition
import java.util.LinkedList
import java.util.List

import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*

class RunCommandMapper {
	val extension AlloyLanguageFactory factory = AlloyLanguageFactory.eINSTANCE
	val Logic2AlloyLanguageMapper_Support support = new Logic2AlloyLanguageMapper_Support;
	val Logic2AlloyLanguageMapper_TypeMapper typeMapper;
	
	new(Logic2AlloyLanguageMapper_TypeMapper typeMapper) {
		this.typeMapper = typeMapper
	}
	
	def transformRunCommand(Logic2AlloyLanguageMapper mapper, ALSDocument specification, Logic2AlloyLanguageMapperTrace trace, AlloySolverConfiguration config)
	{
		//val knownStringNumber = specification.eAllContents.filter(ALSStringLiteral).map[it.value].toSet.size
		
		// add fact to ensure the existence of all literals in the scope
		if(!config.typeScopes.knownStrings.empty) {
			specification.factDeclarations += createALSFactDeclaration => [
				it.name = "EnsureAllStrings"
				val List<? extends ALSTerm> equals = config.typeScopes.knownStrings.map[x|createALSEquals => [
					it.leftOperand =createALSStringLiteral => [it.value = x]
					it.rightOperand =createALSStringLiteral => [it.value = x]
				]].toList
				it.term = support.unfoldAnd(equals)
			]
		}
		val typeScopes = new LinkedList
		for(definedScope : config.typeScopes.maxNewElementsByType.entrySet) {
				val key = definedScope.key
				val amount = definedScope.value
				val exactly = config.typeScopes.minNewElementsByType.containsKey(key) && config.typeScopes.minNewElementsByType.get(key) === amount
				
				val existing = key.transitiveClosureStar[it.subtypes].filter(TypeDefinition).map[elements].flatten.toSet
				if(amount == 0 && exactly) {
					specification.factDeclarations += createALSFactDeclaration => [
						it.term = createALSEquals => [
							it.leftOperand = support.unfoldPlus(typeMapper.transformTypeReference(key,mapper,trace).map[t|createALSReference => [it.referred = t]].toList)
							it.rightOperand =  support.unfoldPlus( existing.map[typeMapper.transformReference(it,trace)].toList )
						]
					]
				}
				val int n = existing.size-amount
				typeScopes += createALSSigScope => [
					it.type = typeMapper.transformTypeReference(key,mapper,trace).head
					it.number = n
					it.exactly =exactly
				]
			}
		
		specification.runCommand = createALSRunCommand => [
			it.typeScopes+= createALSSigScope => [
				it.type= typeMapper.getUndefinedSupertype(trace)
				it.number = typeMapper.getUndefinedSupertypeScope(config.typeScopes.maxNewElements,trace) 
				it.exactly = (config.typeScopes.maxNewElements == config.typeScopes.minNewElements)
			]
			setIntegerScope(specification,config,it)
			setStringScope(specification,config,it)
		]
	}
	
	protected def Boolean setStringScope(ALSDocument specification, AlloySolverConfiguration config, ALSRunCommand it) {
		if(config.typeScopes.maxNewStrings === LogicSolverConfiguration::Unlimited) {
			throw new UnsupportedOperationException('''A string scope have to be specified for Alloy!''')
		} else {
			if(config.typeScopes.maxNewStrings == 0) {
				it.typeScopes += createALSStringScope => [it.number = 0]
			} else {
				throw new UnsupportedOperationException('''A string scope have to be specified for Alloy!''')
			}
		}
	}
	
	protected def setIntegerScope(ALSDocument specification, AlloySolverConfiguration config, ALSRunCommand command) {
		//AlloySolverConfiguration config, ALSRunCommand it
		
		// If the scope is unlimited ...
		if(config.typeScopes.maxNewIntegers == LogicSolverConfiguration::Unlimited) {
			val integersUsed = specification.eAllContents.filter(ALSInt)
			if(integersUsed.empty) {
				// ... but the problem has no integers => scope can be empty
				command.typeScopes+= createALSIntScope => [ it.number = 0 ]
			} else {
				// If no integer scope is defined, and the problem has integers => error
				throw new UnsupportedOperationException('''An integer scope have to be specified for Alloy!''')
			}
		} else {
			// If the scope is limited, collect the integers in the problem and the scope,...
			val maxIntScope = config.typeScopes.maxNewIntegers
			val minIntScope = config.typeScopes.minNewIntegers
			val knownIntegers = config.typeScopes.knownIntegers
			val integersInProblem = specification.eAllContents.filter(ALSNumberLiteral).map[it.value]
			// And select the range of integers
			val min = #[minIntScope,knownIntegers.min,integersInProblem.min].min
			val max = #[maxIntScope,knownIntegers.max,integersInProblem.max].max
			//val abs = Math.max(Math.abs(min),Math.abs(max))
			
			
			command.typeScopes += createALSIntScope => [
				it.number = toBits(min, max)
			]
		}
		
//		if(config.typeScopes.knownIntegers.empty) {
//			return Integer.SIZE-Integer.numberOfLeadingZeros((config.typeScopes.maxNewIntegers+1)/2)
//		} else {
//			var scope = Math.max(
//				Math.abs(config.typeScopes.knownIntegers.max),
//				Math.abs(config.typeScopes.knownIntegers.min))
//			if(scope*2+1 < config.typeScopes.knownIntegers.size + config.typeScopes.maxNewIntegers) {
//				scope += ((config.typeScopes.knownIntegers.size + config.typeScopes.maxNewIntegers) - (scope*2))/2
//			}
//			return Integer.SIZE-Integer.numberOfLeadingZeros(scope)+1
//		}
	}
	
	private static def toBits(int min, int max) {
		// 4 Int = {-8, ..., 7}
		// x Int = {- (2^(x-1)) , ... , 2^(x-1)-1}
		var int bits = 1
		// range = 2^(x-1)
		var int range = 1
		while((!(-range <= min)) || (!(max <= range-1))) {
			bits++
			range*=2
		}
		return bits
	}
//	
//	def static void main(String[] args) {
//		println('''0,0->«toBits(0,0)»''')
//		println('''1,1->«toBits(1,1)»''')
//		println('''-1,-1->«toBits(-1,-1)»''')
//		println('''5,6->«toBits(5,6)»''')
//		println('''0,6->«toBits(0,6)»''')
//		println('''-10,0->«toBits(-10,0)»''')
//		println('''-8,7->«toBits(-8,7)»''')
//		println('''-100,100->«toBits(-100,100)»''')
//		println('''-300,300->«toBits(-300,300)»''')
//	}
}