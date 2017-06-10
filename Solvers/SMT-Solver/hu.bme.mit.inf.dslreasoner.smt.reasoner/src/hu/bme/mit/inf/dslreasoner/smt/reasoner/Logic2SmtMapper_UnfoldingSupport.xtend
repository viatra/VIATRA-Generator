package hu.bme.mit.inf.dslreasoner.smt.reasoner

//import hu.bme.mit.inf.dslreasoner.smtLanguage.SmtLanguageFactory
import java.util.ArrayList
import java.util.List

class Logic2SmtMapper_UnfoldingSupport {
	//val extension SmtLanguageFactory factory = SmtLanguageFactory.eINSTANCE
	
	def List<List<TypeConstraint>> getPermutations(List<List<TypeConstraint>> lists) {
		if(lists.size == 1) {
			val elements = lists.head
			val result = new ArrayList(elements.size)
			for(element: elements){
				result.add(#[element.copy])
			}
			return result
		} else {
			val permuteThis = lists.head
			val withThat = getPermutations(lists.tail.toList)
			val result = new ArrayList(permuteThis.size*withThat.size)
			for(h:permuteThis) {
				for(t:withThat) {
					val l = new ArrayList(withThat.size+1)
					l+=h.copy
					l.addAll(t.map[copy])
					result.add(l)
				}
			}
			return result
		}
	}
}