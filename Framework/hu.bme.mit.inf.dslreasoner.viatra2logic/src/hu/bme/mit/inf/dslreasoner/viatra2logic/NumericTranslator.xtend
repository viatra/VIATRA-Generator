package hu.bme.mit.inf.dslreasoner.viatra2logic

import org.eclipse.xtext.xbase.XExpression
import org.eclipse.viatra.query.runtime.matchers.psystem.basicdeferred.ExpressionEvaluation
import org.eclipse.xtext.common.types.JvmIdentifiableElement
import java.util.Set
import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PrimitiveElement
import java.util.Map
import com.microsoft.z3.BoolExpr
import org.eclipse.viatra.query.runtime.matchers.psystem.PConstraint
import java.util.Map.Entry
import org.eclipse.xtext.xbase.XFeatureCall
import java.util.Comparator
import java.util.ArrayList
import java.util.HashMap
import java.util.List

class NumericTranslator {
	
	private XExpressionExtractor extractor = new XExpressionExtractor();
	
	val comparator = new Comparator<JvmIdentifiableElement>(){
			override compare(JvmIdentifiableElement o1, JvmIdentifiableElement o2) {
				//println('''«o1.simpleName» - «o2.simpleName»''')
				o1.simpleName.compareTo(o2.simpleName)
			}
		}
	def Map<JvmIdentifiableElement, PrimitiveElement> arrayToMap(Object[] tuple, ArrayList<JvmIdentifiableElement> variablesInOrder) {
		val res = new HashMap
		for(var i=0; i<tuple.length; i++) {
			res.put(variablesInOrder.get(i),tuple.get(i) as PrimitiveElement)
		}
		return res
	}
	def formNumericProblemInstance(Map<PConstraint, Iterable<Object[]>> matches) throws Exception {
		val res = new HashMap
		for (Entry<PConstraint, Iterable<Object[]>> entry: matches.entrySet()) {
			val ExpressionEvaluation constraint = entry.getKey() as ExpressionEvaluation;
			val XExpression expression = extractor.extractExpression(constraint.getEvaluator());
			val Iterable<Object[]> tuples = entry.getValue();
			val features = expression.eAllContents.filter(XFeatureCall).map[it.feature].toSet
			val variablesInOrder = new ArrayList(features)
			variablesInOrder.toList.sort(comparator)
			//println(variablesInOrder)
			val map = tuples.map[it.arrayToMap(variablesInOrder)]
			res.put(expression,map)
		}
		return res
	}
	
	def delegateIsSatisfiable(Map<PConstraint, Iterable<Object[]>> matches) {
		val input = formNumericProblemInstance(matches)
		val solver = new NumericProblemSolver
		val satisfiability = solver.isSatisfiable(input)
		return satisfiability
	}
	
	def delegateGetSolution(List<PrimitiveElement> primitiveElements, Map<PConstraint, Iterable<Object[]>> matches) {
		val input = formNumericProblemInstance(matches)
		val solver = new NumericProblemSolver
		val solution = solver.getOneSolution(primitiveElements,input)
		return solution
	}
}