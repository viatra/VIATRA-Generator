package hu.bme.mit.inf.dlsreasoner.alloy.reasoner.builder

import edu.mit.csail.sdg.alloy4compiler.ast.ExprVar
import edu.mit.csail.sdg.alloy4compiler.translator.A4Solution
import java.util.Map
import edu.mit.csail.sdg.alloy4compiler.ast.Sig
import edu.mit.csail.sdg.alloy4compiler.ast.Sig.Field
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDeclaration
import java.util.List
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.LogiclanguageFactory

class AlloyModelInterpretation_TypeInterpretation_InheritanceAndHorizontal implements AlloyModelInterpretation_TypeInterpretation{
	protected val extension LogiclanguageFactory factory = LogiclanguageFactory.eINSTANCE
	
	override resolveUnknownAtoms(Iterable<ExprVar> objectAtoms, A4Solution solution, Logic2AlloyLanguageMapperTrace forwardTrace, Map<String, Sig> name2AlloySig, Map<String, Field> name2AlloyField, Map<String, DefinedElement> expression2DefinedElement, Map<TypeDeclaration, List<DefinedElement>> interpretationOfUndefinedType) {
		throw new UnsupportedOperationException("TODO: auto-generated method stub")
	}
	
}