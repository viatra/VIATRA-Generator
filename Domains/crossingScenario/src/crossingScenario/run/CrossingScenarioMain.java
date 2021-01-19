package crossingScenario.run;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import hu.bme.mit.inf.dslreasoner.application.execution.StandaloneScriptExecutor;

public class CrossingScenarioMain {
	private CrossingScenarioMain() {
		throw new IllegalStateException("This is a static utility class and should not be instantiated directly.");
	}

	public static void main(String[] args) throws IOException, InterruptedException {
//		System.out.println(System.getProperty("java.library.path"));
////		System.setProperty("java.library.path", 
////				"/home/models/VIATRA-Generator/Solvers/SMT-Solver/com.microsoft.z3/lib");
//		Thread.sleep(2000);
//		System.out.println(System.getProperty("java.library.path"));
//		System.loadLibrary("z3java");
		String errorMessages = StandaloneScriptExecutor.executeScript("inputs/crossingScenarioGen.vsconfig");
		if (errorMessages != null) {
			System.out.println(errorMessages);
		}
		Path path = Paths.get("outputs/statistics.csv");		
		List<String> content = Files.readAllLines(path);
		String[] times = content.get(1).split(",");
		System.out.println("STATISTICS");
		int t1 = Integer.parseInt(times[3]);
		int t2 = Integer.parseInt(times[4]);
		int t3 = Integer.parseInt(times[5]);
		int t4 = Integer.parseInt(times[6]);
		int t5 = Integer.parseInt(times[7]);
		int tot = t1+t2+t3+t4;
		System.out.println("preprocessingTime -> ~" + (t1+t2));
		System.out.println("sol0FoundAt -> " + (t5));
		System.out.println("solver -> ~" + t3);
		System.out.println("postprocessing -> " + t4);
		
		System.out.println("TOTAL -> " + tot);
		
		String p1 = "outputs/models/1.xmi";
		String p2 = "outputs/simplePrevLane.tgf";
		QueryDebug.checkPrevLanes(p1, p2);
//		Desktop.getDesktop().open(new File(p2));  
	}
}
