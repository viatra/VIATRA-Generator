# Artifacts for the paper "Automated Generation of Consistent Models with Structural and Attribute Constraints"

This virtual machine image contains the following measurement setup and results for our paper:

  * `~/VIATRA-Generator` contains the source code our our graph generator.
    * `~/VIATRA-Generator/Tests/MODELS2020/case.study.pledge.run` is the measurement setup used in the paper.
      * `~/VIATRA-Generator/Tests/MODELS2020/case.study.pledge.run/config` contains the configuration files for the various model generation tasks.
      * `~/VIATRA-Generator/Tests/MODELS2020/case.study.pledge.run/inputs` contains the initial partial snapshots in single selected root objects.
      * `~/VIATRA-Generator/Tests/MODELS2020/case.study.pledge.run/queries` contains the well-formedness constraints for the domains.
  * `~/VIATRA-Generator.wiki` is the documentation for our graph generator.
  * `~/eclipse` is a preconfigured Eclipse 2020-06 instance for inspecting and compiling the source code of the graph generator.
  * `~/eclipse-workspace/models20.diversity-calculator` contains an additional utility used for measuring the diversity of models.
  * `~/MODELS20-Attributes.pdf` is a copy of our paper containing updated plots for the measurements.
  * `~/data-analysis` contains the raw data and the data analysis scripts.
    * `~/data-analysis/measurements` contains the raw data.
      * `~/data-analysis/measurements/stats` contains statistical logs of execution times.
      * `~/data-analysis/measurements/models` contain all the output models in `.xmi` and `.gml` formats. The standard `.gml` format can be opened with visualization tools such as [yEd](https://www.yworks.com/products/yed). Where the size of the model permitted it, `.png` visualizations are also available.
      * `~/data-analysis/measurements/debug` contains miscellaneous debug output.
      * `~/data-analysis/measurements/diversity.csv` contains the results of internal diversity evaluations of the generated models.
    * `~/data-analysis/MODELS2020Plots.ipynb` is the data analysis R script.

Throughout this set of instructions, commands

    set in code blocks

like above should be executed in the _Terminal_ (available from the _Applications_ menu in the top bar).

In file paths, the `~` symbol refers to the home directory `/home/models`.

## Setting up the workspace

This virtual machine image contains a fully set up workspace for inspecting, modifying and running VIATRA Generator extended with attribute constraint support. In particular, upon running

    ~/eclipse/eclipse &

a preconfigured Eclipse 2020-06 instance is started.

The workspace is ready to use, and no further tasks are required before running the measurements.

However, if you have made any changes to the generator, you should export the _RunGeneratorConfig_ launch configuration of the _case.study.pledge.run_ project to the path `~/VIATRA-Generator/Tests/MODELS2020/case.study.pledge.run/RunGeneratorConfig.jar`.

### Setting up on another machine

The version of VIATRA Generator used in the paper is available from https://github.com/viatra/VIATRA-Generator along with the installation instructions at https://github.com/viatra/VIATRA-Generator/wiki/Installation-Guide and the user guide at https://github.com/viatra/VIATRA-Generator/wiki/UserGuide. For completeness, we reproduce both the Installation guide and the User Guide in the folder `~/VIATRA-Generator.wiki`.

Currently, we only support running the generator on Linux systems. Additional system requirements are

  * [Coin-OR Cbc](https://github.com/coin-or/Cbc) version 2.9.8 or later with development headers;
  * [cmake](https://cmake.org/download/) version 3.13.5 or later;
  * Java JDK 11 with development header;
  * g++ compiler version 9.2.8 or later.

After installing these pieces of software (preferably from you distribution's package manager), the native libraries for the generator must be recompiled. You can do so by issuing the commands

    mkdir -p ~/VIATRA-Generator/Solvers/ILP-Solver/hu.bme.mit.inf.dslreasoner.ilp.cbc/cpp/build
    cd ~/VIATRA-Generator/Solvers/ILP-Solver/hu.bme.mit.inf.dslreasoner.ilp.cbc/cpp/build
    cmake ..
    make

## Running the measurements

### Adjusting memory limits

In order to achieve optimum performance, the memory limits in `~/VIATRA-Generator/Tests/MODELS2020-CaseStudies/case.study.pledge.run/run.sh` should be set to as large values as feasible.

To do so, replace the limits `-Xmx2g` and `-Xms2g` with the desired limits.

In our measurements, we used `12gb` for both values.

### Measurement runner script

The script `~/VIATRA-Generator/Tests/MODELS2020-CaseStudies/case.study.pledge.run/run.sh` is used to issue benchmarking campaigns.

Before running, you should switch to the containg directory:

    cd ~/VIATRA-Generator/Tests/MODELS2020-CaseStudies/case.study.pledge.run

The outputs of the measurements will be written to `~/VIATRA-Generator/Tests/MODELS2020-CaseStudies/case.study.pledge.run/measurements`. Each output file (statistics log, generated models, debug logs) is named after all the parameters passed to the script, as well as the current timestamp, so that various runs can be saved at the same place.

The first argument of the script is the index of the CPU cores to use. If the value `0` is passed, the measurements will run on cores 0, 1, 2. If you have at least 6 cores, `1` may be passed to run on cores 3, 4, 5, `2` may be passed to run on 6, 7, 8, etc.

The other arguments are the following:

  * `-d` selects the domain to run. Configuration files for each domain are located in `~/VIATRA-Generator/Tests/MODELS2020-CaseStudies/case.study.pledge.run/config`.
  * `-lb` is the lower bound of the number of objects in the model.
  * `-ub` is the upper bound of the number of objects in the model
  * `-nr` is the number of times to run the model generator. By default, the generator is run 10 times.
  * `-nm` is the number of models to generate per run.
  * `-rt` is the runtime limit in seconds.
  * `-hh` sets the numer of _Household_ objects. For other domains, this option is ignored.

For example, to generate models of sizes 20, 40 and 60 in the _Fam_, _Sat_ and _Tax_ domains, we may run

		./run.sh 0 -d FamilyTree -lb 20 -nr 10 -nm 1 -rt 3600
		./run.sh 0 -d FamilyTree -lb 40 -nr 10 -nm 1 -rt 3600
		./run.sh 0 -d FamilyTree -lb 60 -nr 10 -nm 1 -rt 3600
		
		./run.sh 0 -d Satellite -lb 20 -nr 10 -nm 1 -rt 3600
		./run.sh 0 -d Satellite -lb 40 -nr 10 -nm 1 -rt 3600
		./run.sh 0 -d Satellite -lb 60 -nr 10 -nm 1 -rt 3600
		
		./run.sh 0 -d Taxation -lb 20 -nr 10 -nm 1 -rt 3600 -hh 1
		./run.sh 0 -d Taxation -lb 40 -nr 10 -nm 1 -rt 3600 -hh 2
		./run.sh 0 -d Taxation -lb 60 -nr 10 -nm 1 -rt 3600 -hh 3

### RQ1

The script `runFamilyTree_exact.sh` runs the measurements for RQ1. The models for the _contSMT_ configuration are generated by running

    ./runFamilyTree_exact.sh 0 ""

for _qualSMT_ they are generated with

    ./runFamilyTree_exact.sh 0 SMTQual

and for _postSMT_ they are generated with

    ./runFamilyTree_exact.sh 0 SMTEnd

You can replace the `0` with the desired index of CPUs to use.

### RQ2

The scripts

    ./runFamilyTree.sh 0
    ./runSatellite.sh 0
    ./runTaxation.sh 0

are provided for measurements in the _Fam_, _Sat_ and _Tax_ domains.

You can replace the `0` with the desired index of CPUs to use.

### RQ3

As the individual measurements for RQ3 may take a very long time, they were separately executed using the `./run.sh` script. For example,

    ./run.sh 0 -d FamilyTree -lb 300 -nr 10 -nm 1 -rt 3600
    ./run.sh 0 -d Satellite -lb 300 -nr 10 -nm 1 -rt 3600

generate models with 300 objects from the _Fam_ and _Sat_ domains, respectively, while

    ./run.sh 0 -d Taxation -lb 1000 -nr 10 -nm 1 -rt 3600 -hh 50

generates a model with 1000 objects from the _Tax_ domain. In the _Tax_ domain, there should be 1 _Household_ object (`-hh`) for every 20 objects (`-lb`).

You can replace the `0` with the desired index of CPUs to use.

## Diversity measurements (RQ4)

The Eclipse project at `~/eclipse-workspace/models20.diversity-calculator` contains an additional utility used for measuring the diversity of models.

The `inputs` subfolder contains the models of which the internal diversity is measured. We already placed the models generated in our experiments there.

To run the measurements on newly generated models (see _RQ2_ above), copy the contents of

  * `~/VIATRA-Generator/Tests/MODELS2020/case.study.pledge.run/measurements/models/FamilyTree/size100to-1r10n10rt3600_*/run*/*_1.xmi` to `~/eclipse-workspace/models20.diversity-calculator/inputs/FamilyTree`;
  * `~/VIATRA-Generator/Tests/MODELS2020/case.study.pledge.run/measurements/models/Satellite/size100to-1r10n10rt3600_*/run*/*_1.xmi` to `~/eclipse-workspace/models20.diversity-calculator/inputs/Satellite`;
  * `~/VIATRA-Generator/Tests/MODELS2020/case.study.pledge.run/measurements/models/Taxation/size100to-1r10n10rt3600hh5_*/run*/*_1.xmi` to `~/eclipse-workspace/models20.diversity-calculator/inputs/Taxation`.

That is, the first modes output by each of the generator runs (`run1`-`run10`) in _RQ2_ with models of size 100 should be copied over to `inputs`.

The folders `inputs/FamilyTreeNoNum`, `inputs/SatelliteNoNum` and `inputs/TaxationNoNum` contains models generated with an earlier version of the generator (without numeric attribute support) for comparison.

Upon executing the _MeasureDiversity_ launch configuration in Eclipse, the output file `~/eclipse-workspace/models20.diversity-calculator/inputs/diversity.csv` is produced.

## Statistical analysis

To recreate the diagrams presented in our paper with the newly created statistical data, follow the instructions below.

The data analysis pipeline uses a [Jupyter](https://jupyter.org/) [R](https://www.r-project.org/) notebook run inside a [Docker](https://www.docker.com/) container to produce the plots.

### Preparing the raw data

The inputs for the analysis are stored in `~/data-analysis/measurements`. No further tasks are required if one wishes to run the analysis on them.

Nevertheless, it is possible to run the analysis on other data. To do so, raw statistical logs from `~/VIATRA-Generator/Tests/MODELS2020/case.study.pledge.run/measurements/stats` must be copied to `~/data-analysis/measurements/stats`. The file names for the logs as produced by `run.sh` contain timestamps to unambiguously store the results of multiple measurement campaigns. The logs must be renamed to remove the timestamps so that the R notebook can find and load them. Alternately, the paths in the R notebook may be edited to refer to the logs by timestamp.

Moreover, the diversity measurement results from `~/eclipse-workspace/models20.diversity-calculator/inputs/diversity.csv` must be copied to `~/data-analysis/measurements/diversity.csv`.

Lastly, in Fedora 32, the SELinux security context of the newly copied files must be changed so that Docker is allowed to access them:

    sudo chcon -Rt svirt_sandbox_file_t ~/data-analysis/

If `sudo` prompts for a password, the password `models20` of the `models` user should be provided.

### Running the Jupyter notebook

The Jupyer Docker container may be started with

    docker run --rm -p 8888:8888 -v /home/models/data-analysis:/home/jovyan/work jupyter/r-notebook

Upon starting the container, it will display instructions to access it via a web browser by navigatin to the URL `http://127.0.0.1:8888/?token=<security-token>`, where `<security-token>` is replaced with a hexadecimal string. Copy the URL from the terminal and open it in Firefox (available from the _Applications_ menu in the top bar).

If you ran your own measurements for RQ1-4, the paths for the statistical logs might need to be adjusted, e.g. if timestamps in log file names were preserved, or if different model sizes were used in RQ2.

The data analysis notebook can be accessed by navigating to `/work/MODELS2020Plots.ipynb` in the Jupyer web interface. To re-run all the analyses, select _Kernel > Restart & Run All_ from the menu and confirm the re-run.

The generated plots are displayed in the web interface. They are also saved as `.pdf` files in the `~/data-analysis` directory.

