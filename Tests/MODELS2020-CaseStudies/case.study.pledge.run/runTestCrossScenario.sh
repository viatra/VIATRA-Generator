#!/usr/bin/bash
NODE="$1"

./run.sh "${NODE}" -d CrossScenario -lb 3 -nm 1 -nr 1 -rt 300 -ns z3 -drto 300000
./run.sh "${NODE}" -d CrossScenario -lb 3 -nm 1 -nr 1 -rt 300 -ns dreal -drp /home/models/dreal4/bazel-bin/dreal/dreal -drto 300000

./run.sh "${NODE}" -d CrossScenario -lb 300 -nm 1 -nr 1 -rt 10 -ns z3 -drto 2000
./run.sh "${NODE}" -d CrossScenario -lb 300 -nm 1 -nr 1 -rt 10 -ns dreal -drp /home/models/dreal4/bazel-bin/dreal/dreal -drto 2000

./run.sh "${NODE}" -d StrategyYes -lb 0 -nr 1 -nm 1 -rt 300 -ns dreal -drp /home/models/dreal4/bazel-bin/dreal/dreal -drto 300000
./run.sh "${NODE}" -d StrategyNoWithHints -lb 1 -ub 1 -nr 1 -nm 1 -rt 300 -ns dreal -drp /home/models/dreal4/bazel-bin/dreal/dreal -drto 10000