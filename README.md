
# How to contribute

## With Eclipse IDE

1. Download and install a _Java 11_ compatible JDK. For Windows, prefer OpenJDK builds from [Adoptium](https://adoptium.net/).

2. Download and extract the [Eclipse Modeling Tools 2021-09](https://www.eclipse.org/downloads/packages/release/2021-09/r/eclipse-modeling-tools) package.

3. Launch Eclipse and create a new workspace.

4. Switch to the _Java_ perspective and close the _Modeling_ perspective.

5. Open _Help > Install New Software..._ and install the following software from the _2021-09_ update site:
    * _Modeling > Ecore Diagram Editor (SDK)_
    * _Modeling > Xtext Complete SDK_
    * _Programming Languages > Xtend IDE_

6. Open _Help > Eclipse Marketplace_ and install _Buildship Gradle Integration_.

7. Open _Window > Preferences_ and set the following preferences:
    * _General > Workspace > Text file encoding_ should be _UTF-8_.
    * _General > Workspace > New text file line delimiter_ should be _Unix_.
    * Add the JDK 11 to _Java > Installed JREs_.
    * Make sure JDK 11 is selected for _JavaSE-11_ at _Java > Installed JREs > Execution Environments_.
    * Set _Gradle > Java home_ to the `JAVA_HOME` directory (the directory which contains the `bin` directory) of JDK 11.
      Buildship will show a yellow warning sign, which can be safely ignored.
	  
8. Clone the project Git repository but do not import it into Eclipse.

9. Open a new terminal an run `./gradlew build` (`.\gradlew build` on Windows) in the cloned repository. This should complete without any compilation error.

10. Select _File > Import... > Gradle > Existing Gradle Project_ and import the cloned repository in Eclipse.
  Make sure to select the root of the repository (containing this file) as the _Project root directory_ and that the _Gradle distribution_ is _Gradle wrapper_.
  If you have previously imported the project into Eclipse, this step will likely fail.
  In that case, you can remove the projects from Eclipse, run `git clean -fxd` in the repository, and start over from step 9. 

## With IntelliJ IDEA

It is possible to import the project into IntelliJ IDEA, but it gives no editing help for Xtext (`*.xtext`), MWE2 (`*.mwe2`), and Xtend (`*.xtend`) and Ecore class diagrams (`*.aird`, `*.ecore`, `*.genmodel`). 
