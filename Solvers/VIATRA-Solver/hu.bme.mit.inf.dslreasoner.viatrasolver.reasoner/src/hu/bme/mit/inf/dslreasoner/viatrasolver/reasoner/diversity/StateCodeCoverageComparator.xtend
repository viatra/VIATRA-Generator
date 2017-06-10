package hu.bme.mit.inf.dslreasoner.viatrasolver.reasoner.diversity

abstract class StateCodeCoverageComparator<StateCodeType>{
	def public boolean covers(Object superStateCode, Object subStateCode) {
		return innerCover(superStateCode as StateCodeType, subStateCode as StateCodeType)
	}
	abstract def protected boolean innerCover(StateCodeType superStateCode, StateCodeType subStateCode)
}