package hu.bme.mit.inf.dslreasoner.vampire.reasoner.builder

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration
import hu.bme.mit.inf.dslreasoner.vampireLanguage.VampireLanguageFactory

class Logic2VampireLanguageMapper_RelationMapper {
	private val extension VampireLanguageFactory factory = VampireLanguageFactory.eINSTANCE
	private val Logic2VampireLanguageMapper_Support support = new Logic2VampireLanguageMapper_Support
	val Logic2VampireLanguageMapper base
	
	public new(Logic2VampireLanguageMapper base) {
		this.base = base
	}
	
	def dispatch public void transformRelation(RelationDeclaration r, Logic2VampireLanguageMapperTrace trace) {
		if(!trace.relationDefinitions.containsKey(r)) {
			if(r.transformToHostedField(trace)) {
				transformRelationDeclarationToHostedField(r,trace)
			} else {
				transformRelationDeclarationToGlobalField(r,trace)
			}
		}
	}
}