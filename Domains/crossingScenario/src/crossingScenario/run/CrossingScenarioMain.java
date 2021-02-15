package crossingScenario.run;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
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
//		String errorMessages = StandaloneScriptExecutor.executeScript("inputs/csGenScale.vsconfig");
		String errorMessages = StandaloneScriptExecutor.executeScript("inputs/crossingScenarioGen.vsconfig");
		if (errorMessages != null) {
			System.out.println(errorMessages);
		}
		
		Path pathStats = Paths.get("outputs/statistics.csv");
//		String pathXmi = "outputs/models/1.xmi";
//		String savePath = "outputs/drawnModel1.png";
//		Path target = Paths.get("../..//Tests/MODELS2020-CaseStudies/case.study.pledge.run/measurements1/stats.csv");
//		Files.copy(path, target, StandardCopyOption.REPLACE_EXISTING);
		
		printStats(pathStats);
		for (int i = 1; i <= 3; i++) {
			DrawScenario.drawScenario("outputs/models/"+i+".xmi", "outputs/drawnModel"+i+".png");
			System.out.println("DONE " + i);
		}
		
//		String p1 = "outputs/models/1.xmi";
//		String p2 = "outputs/simplePrevLane.tgf";
//		QueryDebug.checkPrevLanes(p1, p2);
//		Desktop.getDesktop().open(new File(p2));  
		System.gc();
	}
	
	public static void printStats(Path pathToStats) throws IOException {
		List<String> content = Files.readAllLines(pathToStats);
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
	}
}
