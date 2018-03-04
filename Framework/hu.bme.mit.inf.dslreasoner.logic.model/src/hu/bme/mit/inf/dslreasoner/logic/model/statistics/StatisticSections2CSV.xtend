package hu.bme.mit.inf.dslreasoner.logic.model.statistics

import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.IntStatisticEntry
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.RealStatisticEntry
import hu.bme.mit.inf.dslreasoner.logic.model.logicresult.Statistics
import java.util.ArrayList
import java.util.HashMap
import java.util.LinkedList
import java.util.List
import java.util.Map

class StatisticsData {
	public var List<Pair<String,String>> inputConfiguration
	public var List<Pair<String,String>> outputMetrics
	public var Statistics solverStatistics
}

class StatisticSections2CSV {
	static val separator = ';'
	static val empty = ""
	
	private def getValue(Map<String, String> map,String key) {
		if(map.containsKey(key)) return map.get(key)
		else return empty
	}
	private def addKey(List<String> list, String newValue) {
		if(! list.contains(newValue)) list+=newValue
	}
	
	public def CharSequence transformStatisticDatas2CSV(
		List<StatisticsData> statistics)
	{
		val inputConfigurationColumns = new LinkedList
		val inputConfigurationValues = new ArrayList(statistics.length)
		val solverStatisticColumns = new LinkedList
		val solverStatisticValues = new ArrayList(statistics.length)
		val outputMetricColumns = new LinkedList
		val outputMetricValues = new ArrayList(statistics.length)
		
		statistics.map[inputConfiguration].indexColumnsForPairs(inputConfigurationColumns, inputConfigurationValues)
		statistics.map[it.solverStatistics].indexColumnsForEntries(solverStatisticColumns, solverStatisticValues)
		statistics.map[outputMetrics].indexColumnsForPairs(outputMetricColumns,outputMetricValues)
				
		return '''
		ID« // Header
		IF inputConfigurationColumns.length>0»«separator»«FOR name : inputConfigurationColumns SEPARATOR separator»«name»«ENDFOR»«ENDIF»«
		separator»Transformation_Time«separator»Solver_Time«separator»Solver_Memory«
		IF solverStatisticColumns.length>0»«separator»«ENDIF»«
		FOR name:solverStatisticColumns SEPARATOR separator»«name»«ENDFOR»«
		IF outputMetricColumns.length>0»«separator»«ENDIF»«
		FOR name:outputMetricColumns SEPARATOR separator»«name»«ENDFOR»
		« // Table
		FOR index : 0..<statistics.size»
		«index+1 /*ID*/»«
			IF inputConfigurationColumns.size>0»«separator»«ENDIF»«
			FOR name : inputConfigurationColumns SEPARATOR separator»«inputConfigurationValues.get(index).getValue(name)»«ENDFOR»«
				separator»«statistics.get(index).solverStatistics.transformationTime»«
				separator»«statistics.get(index).solverStatistics.solverTime»«
				separator»«statistics.get(index).solverStatistics.solverMemory»«
			IF solverStatisticColumns.size>0»«separator»«ENDIF»«
			FOR name:solverStatisticColumns SEPARATOR separator»«solverStatisticValues.get(index).getValue(name)»«ENDFOR»«
			IF outputMetricColumns.size>0»«separator»«ENDIF»«
			FOR name:outputMetricColumns SEPARATOR separator»«outputMetricValues.get(index).getValue(name)»«ENDFOR»
		«ENDFOR»'''
	}
	
	def private indexColumnsForPairs(List<List<Pair<String, String>>> datas, List<String> columns, List<Map<String, String>> values) {
		for(inputConfiguration : datas) {
			val map = new HashMap
			for(entry : inputConfiguration) {
				columns.addKey(entry.key)
				map.put(entry.key,entry.value)	
			}
			values+=map
		}
	}
	def private indexColumnsForEntries(List<Statistics> datas, List<String> columns, List<Map<String, String>> values) {
		for(inputConfiguration : datas) {
			val map = new HashMap
			for(entry : inputConfiguration.entries) {
				columns.addKey(entry.name)
				map.put(entry.name,entry.readValue)	
			}
			values+=map
		}
	}
	public def dispatch String readValue(IntStatisticEntry e) { return e.value.toString }
	public def dispatch String readValue(RealStatisticEntry e){ return e.value.toString }
}