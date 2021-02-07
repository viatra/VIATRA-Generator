#!/usr/bin/env bash
NODE="$1"
shift
CPUS="$((NODE*3))-$((NODE*3+2))"
taskset -c "${CPUS}" env LD_LIBRARY_PATH=/home/models/VIATRA-Generator/Framework/hu.bme.mit.inf.dslreasoner.viatra2logic/lib:/home/models/VIATRA-Generator/olvers/SMT-Solver/com.microsoft.z3/lib:/home/models/VIATRA-Generator/Solvers/ILP-Solver/hu.bme.mit.inf.dslreasoner.ilp.cbc/lib java -Xmx6g -Xms6g -XX:+UseG1GC -XX:ParallelGCThreads=3 -XX:ConcGCThreads=1 -XX:G1ConcRefinementThreads=3 -jar RunGeneratorConfig.jar "$@"
