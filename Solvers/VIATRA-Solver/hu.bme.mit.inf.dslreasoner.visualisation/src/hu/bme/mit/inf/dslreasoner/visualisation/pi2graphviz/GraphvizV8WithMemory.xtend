package hu.bme.mit.inf.dslreasoner.visualisation.pi2graphviz

import guru.nidi.graphviz.engine.GraphvizV8Engine

class GraphvizV8WithMemory extends GraphvizV8Engine {
	val int memory;
	new(int memory) {
		this.memory = memory
		//this.
	}
	
	override protected jsInitEnv() {
		println super.jsInitEnv()
		super.jsInitEnv()
	}
}
