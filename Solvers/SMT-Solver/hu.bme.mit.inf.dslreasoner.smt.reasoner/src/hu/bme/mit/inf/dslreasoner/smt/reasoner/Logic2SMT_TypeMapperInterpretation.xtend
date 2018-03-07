package hu.bme.mit.inf.dslreasoner.smt.reasoner

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTSymbolicDeclaration
import java.util.List
import java.util.Map
import static extension hu.bme.mit.inf.dslreasoner.util.CollectionsUtil.*

class Logic2SMT_TypeMapperInterpretation {
	
	val Map<Type, ? extends List<DefinedElement>> type2Elements
	val Map<DefinedElement, ValueType> logic2smt
	val Map<SMTSymbolicDeclaration, DefinedElement> smt2logic
	
	public new(
		Map<Type, ? extends List<DefinedElement>> type2Elements,
		Map<DefinedElement, ValueType> logic2smt,
		Map<SMTSymbolicDeclaration, DefinedElement> smt2logic) {
		this.type2Elements = type2Elements
		this.logic2smt = logic2smt
		this.smt2logic = smt2logic
	}
	
	public def getElements(Type type) {
		return type.lookup(this.type2Elements)
	}
	
	public def ValueType logicElement2Smt(DefinedElement element) {
		return element.lookup(this.logic2smt)
	}
	
	public def smtElement2Logic(SMTSymbolicDeclaration element) {
		return element.lookup(this.smt2logic)
	}
}
