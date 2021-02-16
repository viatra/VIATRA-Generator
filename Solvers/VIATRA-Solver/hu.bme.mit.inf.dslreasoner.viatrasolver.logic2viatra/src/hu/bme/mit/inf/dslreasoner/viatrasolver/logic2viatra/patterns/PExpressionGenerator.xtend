package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.patterns

import java.util.Map
import org.eclipse.viatra.query.runtime.matchers.psystem.PVariable
import org.eclipse.xtext.xbase.XBinaryOperation
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.XFeatureCall
import org.eclipse.xtext.xbase.XMemberFeatureCall
import org.eclipse.xtext.xbase.XNumberLiteral
import org.eclipse.xtext.xbase.XUnaryOperation
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.PrimitiveTypeReference
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RealTypeReference
import org.eclipse.xtext.xbase.XIfExpression
import org.eclipse.xtext.xbase.XBlockExpression

class PExpressionGenerator {
	static val N_Base = "org.eclipse.xtext.xbase.lib."
	
	static val N_PLUS1 = "operator_plus"
	static val N_MINUS1 = "operator_minus"
	
	static val N_MINUS2 = "operator_minus"
	static val N_PLUS2 = "operator_plus"
	static val N_POWER = "operator_power"
	static val N_MULTIPLY = "operator_multiply"
	static val N_DIVIDE = "operator_divide"
	static val N_MODULO = "operator_modulo"
	static val N_LESSTHAN = "operator_lessThan"
	static val N_LESSEQUALSTHAN = "operator_lessEqualsThan"
	static val N_GREATERTHAN = "operator_greaterThan"
	static val N_GREATEREQUALTHAN = "operator_greaterEqualsThan"
	static val N_EQUALS = "operator_equals"
	static val N_NOTEQUALS = "operator_notEquals"
	static val N_EQUALS3 = "operator_tripleEquals"
	static val N_NOTEQUALS3 = "operator_tripleNotEquals"
	
	protected def isN(String name, String s) {
		val res = name.startsWith(N_Base) && name.endsWith(s)
		//println('''[«res»] «name» ?= «N_Base»*«s»''')
		return res
	}
	
	static val N_POWER2 = "java.lang.Math.pow"
	
	def dispatch CharSequence translateExpression(XBinaryOperation e, Map<PVariable,String> valueName, Map<PVariable, PrimitiveTypeReference> variable2Type) {
		val left = e.leftOperand.translateExpression(valueName,variable2Type)
		val right = e.rightOperand.translateExpression(valueName,variable2Type)
		val feature = e.feature.qualifiedName
		     if(feature.isN(N_MINUS2)) { return '''(«left»-«right»)'''}
		else if(feature.isN(N_PLUS2)) { return '''(«left»+«right»)''' }
		else if(feature.isN(N_POWER)) { return '''(«left»^«right»)'''  }
		else if(feature.isN(N_MULTIPLY)) { return '''(«left»*«right»)''' }
		else if(feature.isN(N_DIVIDE)) { return '''(«left»/«right»)''' }
		else if(feature.isN(N_MODULO)) { return '''(«left»%«right»)''' }
		else if(feature.isN(N_LESSTHAN)) { return '''(«left»<«right»)''' }
		else if(feature.isN(N_LESSEQUALSTHAN)) { return '''(«left»<=«right»)''' }
		else if(feature.isN(N_GREATERTHAN)) { return '''(«left»>«right»)''' }
		else if(feature.isN(N_GREATEREQUALTHAN)) { return '''(«left»>=«right»)''' }
		else if(feature.isN(N_EQUALS)) { return '''(«left»==«right»)''' }
		else if(feature.isN(N_NOTEQUALS)) { return '''(«left»!=«right»)''' }
		else if(feature.isN(N_EQUALS3)) { return '''(«left»===«right»)''' }
		else if(feature.isN(N_NOTEQUALS3)) { return '''(«left»!==«right»)''' }
		else {
			println("-> " + e.feature+","+e.class)
			println("-> " + e.leftOperand)
			println("-> " + e.rightOperand)
			println("-> " + e.feature.qualifiedName)
			throw new UnsupportedOperationException('''Unsupported binary operator feature: "«e.feature.class.simpleName»" - «e»''')
		}
	}
	
	def dispatch CharSequence translateExpression(XUnaryOperation e, Map<PVariable,String> valueName, Map<PVariable, PrimitiveTypeReference> variable2Type) {
		val operand = e.operand.translateExpression(valueName,variable2Type)
		val feature = e.feature.qualifiedName
		if(feature.isN(N_MINUS1)) { return '''(-«operand»)'''}
		else if(feature.isN(N_PLUS1)) { return '''(+«operand»)'''}
		else{
			println("-> " + e.feature+","+e.class)
			println("-> " + e.operand)
			println("-> " + e.feature.qualifiedName)
			throw new UnsupportedOperationException('''Unsupported unary operator feature: "«e.feature.class.simpleName»" - «e»''')
		}
	}
	
	def dispatch CharSequence translateExpression(XMemberFeatureCall e, Map<PVariable,String> valueName, Map<PVariable, PrimitiveTypeReference> variable2Type) {
		val transformedArguments = e.actualArguments.map[translateExpression(valueName,variable2Type)]
		val feature = e.feature.qualifiedName
		if(feature == N_POWER2) {
			return '''Math.pow(«transformedArguments.get(0)»,«transformedArguments.get(1)»)'''
		}else {
			println(e.feature+","+e.class)
			println(e.actualArguments.join(", "))
			println(e.feature.qualifiedName)
			throw new UnsupportedOperationException('''Unsupported feature call: "«e.feature.qualifiedName»" - «e»''')
		}
	}
	
	def dispatch CharSequence translateExpression(XFeatureCall e, Map<PVariable,String> valueName, Map<PVariable, PrimitiveTypeReference> variable2Type) {
		val featureName = e.feature.qualifiedName
		val type = variable2Type.entrySet.filter[it.key.name===featureName].head.value
		val entryWithName = valueName.entrySet.filter[it.key.name == featureName].head
		if(entryWithName !== null) {
			if(type instanceof RealTypeReference) {
				return '''(«entryWithName.value».doubleValue)'''
			} else {
				return entryWithName.value
			}
		} else {
			throw new IllegalArgumentException('''Feature call reference to unavailable variable "«featureName»"''')
		}
	}
	
	def dispatch CharSequence translateExpression(XNumberLiteral l, Map<PVariable,String> valueName, Map<PVariable, PrimitiveTypeReference> variable2Type) '''«l.value»'''
	
	def dispatch CharSequence translateExpression(XExpression expression, Map<PVariable,String> valueName, Map<PVariable, PrimitiveTypeReference> variable2Type) {
		throw new UnsupportedOperationException('''Unsupported expression in check or eval: «expression.class.name», «expression»"''')
	}
	
	def dispatch CharSequence translateExpression(XIfExpression e, Map<PVariable,String> valueName, Map<PVariable, PrimitiveTypeReference> variable2Type) {
		val i = e.^if.translateExpression(valueName,variable2Type)
		val t = e.then.translateExpression(valueName,variable2Type)
		val el = e.^else.translateExpression(valueName,variable2Type)
		
		return '''(if(«i»){«t»}else{«el»})'''
	}
	
	def dispatch CharSequence translateExpression(XBlockExpression e, Map<PVariable,String> valueName, Map<PVariable, PrimitiveTypeReference> variable2Type) {
		//Assuming 1-item blocks only
		return (e as XBlockExpression).expressions.get(0).translateExpression(valueName,variable2Type)
	}
}