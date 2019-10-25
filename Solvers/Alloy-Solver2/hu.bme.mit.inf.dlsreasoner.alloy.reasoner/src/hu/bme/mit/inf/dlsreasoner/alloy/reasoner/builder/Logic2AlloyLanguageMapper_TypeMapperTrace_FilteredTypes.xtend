package hu.bme.mit.inf.dlsreasoner.alloy.reasoner.builder

import hu.bme.mit.inf.dslreasoner.alloyLanguage.ALSSignatureDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.DefinedElement
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.Type
import java.util.HashMap
import java.util.Map

class Logic2AlloyLanguageMapper_TypeMapperTrace_FilteredTypes
	implements Logic2AlloyLanguageMapper_TypeMapperTrace
{
	public var ALSSignatureDeclaration objectSupperClass;
	public val Map<Type, ALSSignatureDeclaration> type2ALSType = new HashMap;
	public val Map<DefinedElement, ALSSignatureDeclaration> definedElement2Declaration = new HashMap
}