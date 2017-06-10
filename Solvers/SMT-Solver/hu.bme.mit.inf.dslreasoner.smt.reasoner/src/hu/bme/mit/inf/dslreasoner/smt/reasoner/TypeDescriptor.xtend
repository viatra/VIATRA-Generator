package hu.bme.mit.inf.dslreasoner.smt.reasoner

import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTBoolTypeReference
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTComplexTypeReference
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTIntTypeReference
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTRealTypeReference
import hu.bme.mit.inf.dslreasoner.smtLanguage.SMTType
import java.util.List
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtend.lib.annotations.Data

@Data
class Descriptor<T> {
	List<TypeDescriptor> parameterTypes
	T relation
}

@Data
class TypeDescriptor {
	val boolean logic
	val boolean numeric
	val SMTType complexType
	
	@Accessors(PUBLIC_GETTER)
	static val LogicTypeDescriptor_Instance = new TypeDescriptor(true,false,null)
	@Accessors(PUBLIC_GETTER)
	static val NumericTypeDescriptor_Instance = new TypeDescriptor(false,true,null)
	
	private new(boolean logic, boolean numeric,	SMTType complexType) {
		this.logic = logic
		this.numeric = numeric
		this.complexType = complexType
	}
	public new(SMTType complexType) {
		this.logic = false
		this.numeric = false
		this.complexType = complexType
	}
	
	def static dispatch createFromTypeReference(SMTBoolTypeReference ref) { return TypeDescriptor::LogicTypeDescriptor_Instance}
	def static dispatch createFromTypeReference(SMTIntTypeReference ref) { return TypeDescriptor::NumericTypeDescriptor_Instance}
	def static dispatch createFromTypeReference(SMTRealTypeReference ref) { return TypeDescriptor::NumericTypeDescriptor_Instance}
	def static dispatch createFromTypeReference(SMTComplexTypeReference ref) { return new TypeDescriptor(false,false,ref.referred)}
}