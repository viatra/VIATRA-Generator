package hu.bme.mit.inf.dslreasoner.viatrasolver.logic2viatra.interval

abstract class IntervalRedBlackNode extends RedBlackNode<IntervalRedBlackNode> {
	public val Interval interval
	public var int count = 1
	public var Interval result

	new(Interval interval) {
		this.interval = interval
	}

	def boolean isMultiplicitySensitive() {
		false
	}

	def Interval multiply(Interval interval, int count) {
		interval
	}

	abstract def Interval op(Interval left, Interval right)

	override augment() {
		val value = calcualteAugmentation()
		if (result == value) {
			false
		} else {
			result = value
			true
		}
	}

	private def calcualteAugmentation() {
		var value = multiply(interval, count)
		if (!left.leaf) {
			value = op(value, left.result)
		}
		if (!right.leaf) {
			value = op(value, right.result)
		}
		value
	}

	override assertNodeIsValid() {
		super.assertNodeIsValid()
		if (leaf) {
			return
		}
		if (count <= 0) {
			throw new IllegalStateException("Node with nonpositive count")
		}
		val value = calcualteAugmentation()
		if (result != value) {
			throw new IllegalStateException("Node with invalid augmentation: " + result + " != " + value)
		}
	}

	override assertSubtreeIsValid() {
		super.assertSubtreeIsValid()
		assertNodeIsValid()
	}

	override compareTo(IntervalRedBlackNode other) {
		if (leaf || other.leaf) {
			throw new IllegalArgumentException("One of the nodes is a leaf node")
		}
		interval.compareTo(other.interval)
	}

	def add(IntervalRedBlackNode newNode) {
		if (parent !== null) {
			throw new IllegalArgumentException("This is not the root of a tree")
		}
		if (leaf) {
			newNode.isRed = false
			newNode.left = this
			newNode.right = this
			newNode.parent = null
			newNode.augment
			return newNode
		}
		val modifiedNode = addWithoutFixup(newNode)
		if (modifiedNode === newNode) {
			// Must augment here, because fixInsertion() might call augment()
			// on a node repeatedly, which might lose the change notification the
			// second time it is called, and the augmentation will fail to
			// reach the root.
			modifiedNode.augmentRecursively
			modifiedNode.isRed = true
			return modifiedNode.fixInsertion
		}
		if (multiplicitySensitive) {
			modifiedNode.augmentRecursively
		}
		this
	}

	private def addWithoutFixup(IntervalRedBlackNode newNode) {
		var node = this
		while (!node.leaf) {
			val comparison = node.interval.compareTo(newNode.interval)
			if (comparison < 0) {
				if (node.left.leaf) {
					newNode.left = node.left
					newNode.right = node.left
					node.left = newNode
					newNode.parent = node
					return newNode
				} else {
					node = node.left
				}
			} else if (comparison > 0) {
				if (node.right.leaf) {
					newNode.left = node.right
					newNode.right = node.right
					node.right = newNode
					newNode.parent = node
					return newNode
				} else {
					node = node.right
				}
			} else { // comparison == 0
				newNode.parent = null
				node.count++
				return node
			}
		}
		throw new IllegalStateException("Reached leaf node while searching for insertion point")
	}

	private def augmentRecursively() {
		for (var node = this; node !== null; node = node.parent) {
			if (!node.augment) {
				return
			}
		}
	}

	def remove(Interval interval) {
		val node = find(interval)
		node.count--
		if (node.count == 0) {
			return node.remove
		}
		if (multiplicitySensitive) {
			node.augmentRecursively
		}
		this
	}

	private def find(Interval interval) {
		var node = this
		while (!node.leaf) {
			val comparison = node.interval.compareTo(interval)
			if (comparison < 0) {
				node = node.left
			} else if (comparison > 0) {
				node = node.right
			} else { // comparison == 0
				return node
			}
		}
		throw new IllegalStateException("Reached leaf node while searching for interval to remove")
	}

	override toString() {
		if (leaf) {
			"L"
		} else {
			'''
				«IF isRed»R«ELSE»B«ENDIF» «count»«interval» : «result»
					«left»
					«right»
			'''
		}
	}

}
