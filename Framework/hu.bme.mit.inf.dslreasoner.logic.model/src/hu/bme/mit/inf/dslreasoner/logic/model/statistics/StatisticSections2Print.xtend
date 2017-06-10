package hu.bme.mit.inf.dslreasoner.logic.model.statistics

import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.IntStatisticEntry
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.RealStatisticEntry
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.StatisticEntry
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.StringStatisticEntry
import java.util.List

class StatisticSections2Print {
	public def CharSequence transformStatisticDatas2CSV(
		List<StatisticEntry> statistics)
	{
		var result = "";
		for(statistic : statistics) {
			result+= '''«statistic.readValue»;'''
		}
		return result
	}
	
	private def dispatch String readValue(IntStatisticEntry e) { return e.value.toString }
	private def dispatch String readValue(RealStatisticEntry e){ return e.value.toString }
	private def dispatch String readValue(StringStatisticEntry e) { return "\n" + e.value }
}