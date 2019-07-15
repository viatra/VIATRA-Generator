package hu.bme.mit.inf.dslreasoner.viatra2logic

import org.eclipse.viatra.query.patternlanguage.emf.specification.XBaseEvaluator
import org.eclipse.viatra.query.runtime.matchers.psystem.IExpressionEvaluator
import org.eclipse.xtext.xbase.XExpression

class XExpressionExtractor {
	def dispatch XExpression extractExpression(XBaseEvaluator evaluator) { evaluator.expression }
	def dispatch XExpression extractExpression(IExpressionEvaluator evaluator) {
		val clazz = evaluator.class
		if(clazz.name == "org.eclipse.viatra.query.runtime.matchers.psystem.rewriters.VariableMappingExpressionEvaluatorWrapper") {
			val field = clazz.declaredFields.filter[it.name == "wrapped"].head
			if(field === null) {
				throw new IllegalArgumentException('''Class «clazz.simpleName» has no field "wrapped"!''')
			} else {
				field.setAccessible(true);
				val wrappedEvaluator = field.get(evaluator) as XBaseEvaluator
				return wrappedEvaluator.extractExpression
			}
		} else {
			throw new IllegalArgumentException('''Unsupported expression evaluation form: «clazz.simpleName»!''')
		}
	}
}