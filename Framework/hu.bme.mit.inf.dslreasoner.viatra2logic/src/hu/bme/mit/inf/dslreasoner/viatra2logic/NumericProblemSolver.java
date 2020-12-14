package hu.bme.mit.inf.dslreasoner.viatra2logic;

import java.util.List;
import java.util.Map;

import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.xbase.XExpression;

import hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.partialinterpretation.PrimitiveElement;

public abstract class NumericProblemSolver {
	
	long endformingProblem=0;
	long endSolvingProblem=0;
	long endFormingSolution=0;	

	public long getEndformingProblem() {return endformingProblem;}
	public long getEndSolvingProblem() {return endSolvingProblem;}
	public long getEndFormingSolution() {return endFormingSolution;}
	
	public abstract  boolean isSatisfiable(Map<XExpression, Iterable<Map<JvmIdentifiableElement,PrimitiveElement>>> matches) throws Exception;
	public abstract Map<PrimitiveElement,Number> getOneSolution(List<PrimitiveElement> objs, Map<XExpression, Iterable<Map<JvmIdentifiableElement,PrimitiveElement>>> matches) throws Exception;
}
