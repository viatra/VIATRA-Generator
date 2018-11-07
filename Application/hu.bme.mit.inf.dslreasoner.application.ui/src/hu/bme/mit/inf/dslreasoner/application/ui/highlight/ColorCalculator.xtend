package hu.bme.mit.inf.dslreasoner.application.ui.highlight

import java.util.List
import java.util.Random
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EDataType

class ColorCalculator {
	
	def dispatch getColor(EClass c) {
		val supertypes = (c.getEAllSuperTypes + #[c])
		val typeHashcodes = supertypes.map[(c.getEPackage.nsURI->c.name).hashCode+2]
		return randomColor(typeHashcodes)
	}
	def dispatch getColor(EDataType e) {
		return randomColor((e.getEPackage.nsURI->e.name).hashCode)
	}
	
	protected def randomColor(Integer seed) {
		val Random random = new Random(seed)
		val rangePicker = [|random.nextInt(128)+128]
		return #[rangePicker.apply(), rangePicker.apply(), rangePicker.apply()]
	}
	protected def randomColor(Iterable<Integer> seeds) { seeds.map[randomColor].averageColor }
	private def averageColor(Iterable<List<Integer>> colors) {
		if(colors.empty) {
			return #[256,256,256]
		} else {
			return #[
				colors.map[get(0)].average,
				colors.map[get(1)].average,
				colors.map[get(2)].average
			]
		}
	}
	private def average(Iterable<Integer> doubles) { return doubles.reduce[p1, p2|p1+p2]/doubles.size }
}

