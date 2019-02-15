package hu.bme.mit.inf.dslreasoner.faulttree.transformation.cft2ft

import com.google.common.collect.ImmutableSet
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.ConstantEvent
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.Event
import hu.bme.mit.inf.dslreasoner.faulttree.model.ft.RandomEvent
import java.util.Set
import org.eclipse.xtend.lib.annotations.Data

@Data
class EventCollection {
	val int falseEventCount
	val int trueEventCount
	val Set<RandomEvent> randomEvents

	def containsFalseEvent() {
		falseEventCount >= 1
	}

	def containsTrueEvent() {
		trueEventCount >= 1
	}

	def getVariableEventCount() {
		randomEvents.size
	}

	def containsRandomEvent() {
		variableEventCount >= 1
	}

	def getCount() {
		falseEventCount + trueEventCount + variableEventCount
	}

	def isEmpty() {
		!containsFalseEvent && !containsTrueEvent && !containsRandomEvent
	}

	def containsExactlyOneRandomEvent() {
		!containsFalseEvent && !containsTrueEvent && variableEventCount == 1
	}

	def toSingleRandomEvent() {
		if (!containsExactlyOneRandomEvent) {
			throw new IllegalStateException("Input collection is not a single random event")
		}
		randomEvents.head
	}

	static def builder() {
		new Builder()
	}

	static class Builder {
		var falseEventCount = 0
		var trueEventCount = 0
		val randomEventsBuilder = ImmutableSet.<RandomEvent>builder

		private new() {
		}

		def add(Event event) {
			switch (event) {
				ConstantEvent:
					if (event.failed) {
						trueEventCount++
					} else {
						falseEventCount++
					}
				RandomEvent:
					randomEventsBuilder.add(event)
				default:
					throw new IllegalArgumentException("Unknown event: " + event)
			}
			this
		}

		def addAll(EventCollection materializedEvens) {
			falseEventCount += materializedEvens.falseEventCount
			trueEventCount += materializedEvens.trueEventCount
			randomEventsBuilder.addAll(materializedEvens.randomEvents)
			this
		}

		def build() {
			new EventCollection(falseEventCount, trueEventCount, randomEventsBuilder.build)
		}
	}
}
