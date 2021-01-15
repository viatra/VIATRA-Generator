package crossingScenario.run;

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

	public static void main(String[] args) throws IOException {
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
		int tot = t1+t2+t3+t4;
		System.out.println("domain2logic -> " + t1);
		System.out.println("logic2solver -> " + t2);
		System.out.println("solver -> " + t3);
		System.out.println("postprocessing -> " + t4);
		
		System.out.println("TOTAL -> " + tot);

	}
}
