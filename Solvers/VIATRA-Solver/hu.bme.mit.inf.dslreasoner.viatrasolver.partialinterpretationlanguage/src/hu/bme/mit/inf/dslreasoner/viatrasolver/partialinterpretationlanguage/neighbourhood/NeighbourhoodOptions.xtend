package hu.bme.mit.inf.dslreasoner.viatrasolver.partialinterpretationlanguage.neighbourhood

import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.RelationDeclaration
import hu.bme.mit.inf.dslreasoner.logic.model.logiclanguage.TypeDeclaration
import java.util.Set
import org.eclipse.xtend.lib.annotations.Data

@Data
class NeighbourhoodOptions {
	public static val FixPointRage = -1
	public static val GraphWidthRange = -2
	public static val FullParallels = Integer.MAX_VALUE
	public static val MaxNumbers = Integer.MAX_VALUE

	public static val DEFAULT = new NeighbourhoodOptions(GraphWidthRange, FullParallels, MaxNumbers, null, null)

	val int range
	val int parallels
	val int maxNumber
	val Set<TypeDeclaration> relevantTypes
	val Set<RelationDeclaration> relevantRelations
}
