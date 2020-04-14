package hu.bme.mit.inf.dslreasoner.visualisation.pi2graphviz

import guru.nidi.graphviz.engine.Format
import guru.nidi.graphviz.engine.Graphviz
import guru.nidi.graphviz.engine.GraphvizEngine
import guru.nidi.graphviz.model.Graph
import java.io.File
import java.io.IOException
import java.util.concurrent.BlockingQueue
import java.util.concurrent.CompletableFuture
import java.util.concurrent.LinkedBlockingQueue
import java.util.function.Consumer
import org.eclipse.xtend.lib.annotations.Data
import guru.nidi.graphviz.engine.GraphvizV8Engine

class VisualisationQueque {
	val BlockingQueue<VisualisationQueueEntry> taskQueue = new LinkedBlockingQueue
	var Thread runnerThread = null;
	
	def addTask(Graph document, File targetFile) {
		val future = new CompletableFuture<String>();
		taskQueue.add(
			new VisualisationQueueEntry(document,targetFile,targetFile.speficyFormat,future)
		)
		return future
	}
	
	private def Format speficyFormat(File targetFile) {
		val ^extension = targetFile.name.split('\\.').last
		if(^extension === null) {
			throw new IllegalArgumentException('''No file extension specified in path "«targetFile.path»"!''')
		} else {
			val extensionInUppercase = ^extension.toUpperCase
			try {
				return Format.valueOf(extensionInUppercase)
			} catch(IllegalArgumentException e) {
				throw new IllegalArgumentException('''Unsupported extension: ".«extensionInUppercase»"!''',e)
			}
		}
	}
	
	def void start() {
		if(runnerThread !== null) {
			// do nothing
		} else {
			runnerThread = new Thread(new Runnable() {
				override run() {
					val engine = new GraphvizV8Engine
					val nullConsumer = new Consumer<GraphvizEngine>() {
						override accept(GraphvizEngine t) {}
					}
					engine.init(nullConsumer,nullConsumer)
					//println("Visualisation thread started")
					while(true) {
						val head = taskQueue.take
						//println("Task scheduled: "+head.targetFile)
						val message = engine.execute(head.document,head.targetFile,head.format)
						//println("Task finished: "+head.targetFile)
						head.future.complete(message)
					}
				}
			})
			runnerThread.daemon = true
			runnerThread.name = "GraphVizVisualiser"
			runnerThread.start
		}
	}
	
	private def execute(GraphvizEngine engine, Graph document, File targetFile, Format format) {
		Graphviz.useEngine(engine);
		try {
			Graphviz.fromGraph(document).totalMemory(536870912).render(format).toFile(targetFile)
			return null
		} catch(IOException e){
			return e.message
		}
	}
	
	@Data private static class VisualisationQueueEntry {
		Graph document
		File targetFile
		Format format
		CompletableFuture<String> future
	}
}

