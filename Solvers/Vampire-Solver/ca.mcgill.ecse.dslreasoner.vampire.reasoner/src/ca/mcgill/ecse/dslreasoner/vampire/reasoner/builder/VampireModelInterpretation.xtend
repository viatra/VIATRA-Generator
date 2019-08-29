package ca.mcgill.ecse.dslreasoner.vampire.reasoner.builder

import ca.mcgill.ecse.dslreasoner.vampireLanguage.VampireModel
import hu.bme.mit.inf.dslreasoner.logic.model.builder.LogicModelInterpretation
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.ConstantDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.FunctionDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguageFactory
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type

class VampireModelInterpretation implements LogicModelInterpretation {
	protected val extension LogiclanguageFactory factory = LogiclanguageFactory.eINSTANCE
	
	protected val Logic2VampireLanguageMapperTrace forwardTrace;
	
	
	public new(VampireModel model, Logic2VampireLanguageMapperTrace trace) {
		this.forwardTrace = trace
	}
	
	override getElements(Type type) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getInterpretation(FunctionDeclaration function, Object[] parameterSubstitution) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getInterpretation(RelationDeclaration relation, Object[] parameterSubstitution) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getInterpretation(ConstantDeclaration constant) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getAllIntegersInStructure() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getAllRealsInStructure() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
	override getAllStringsInStructure() {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
}