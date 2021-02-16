#!/usr/bin/bash
NODE="$1"
./run.sh "${NODE}" -d CrossScenario -lb 3 -nm 1 -nr 10 -rt 300 -ns z3 -drto 300000
./run.sh "${NODE}" -d CrossScenario -lb 3 -nm 1 -nr 10 -rt 300 -ns dreal -drp /home/models/dreal4/bazel-bin/dreal/dreal -drto 300000
./run.sh "${NODE}" -d CrossScenario -lb 4 -nm 1 -nr 10 -rt 300 -ns z3 -drto 300000
./run.sh "${NODE}" -d CrossScenario -lb 4 -nm 1 -nr 10 -rt 300 -ns dreal -drp /home/models/dreal4/bazel-bin/dreal/dreal -drto 300000
./run.sh "${NODE}" -d CrossScenario -lb 6 -nm 1 -nr 10 -rt 300 -ns z3 -drto 300000
./run.sh "${NODE}" -d CrossScenario -lb 6 -nm 1 -nr 10 -rt 300 -ns dreal -drp /home/models/dreal4/bazel-bin/dreal/dreal -drto 300000
./run.sh "${NODE}" -d CrossScenario -lb 8 -nm 1 -nr 10 -rt 300 -ns dreal -drp /home/models/dreal4/bazel-bin/dreal/dreal -drto 300000
./run.sh "${NODE}" -d CrossScenario -lb 9 -nm 1 -nr 10 -rt 300 -ns dreal -drp /home/models/dreal4/bazel-bin/dreal/dreal -drto 300000
./run.sh "${NODE}" -d CrossScenario -lb 12 -nm 1 -nr 10 -rt 300 -ns dreal -drp /home/models/dreal4/bazel-bin/dreal/dreal -drto 300000
./run.sh "${NODE}" -d CrossScenario -lb 15 -nm 1 -nr 10 -rt 300 -ns dreal -drp /home/models/dreal4/bazel-bin/dreal/dreal -drto 300000
./run.sh "${NODE}" -d CrossScenario -lb 16 -nm 1 -nr 10 -rt 300 -ns dreal -drp /home/models/dreal4/bazel-bin/dreal/dreal -drto 300000
./run.sh "${NODE}" -d CrossScenario -lb 18 -nm 1 -nr 10 -rt 300 -ns dreal -drp /home/models/dreal4/bazel-bin/dreal/dreal -drto 300000

./run.sh "${NODE}" -d CrossScenario -lb 8 -nm 1 -nr 10 -rt 300 -ns z3 -drp /home/models/dreal4/bazel-bin/dreal/dreal -drto 300000
./run.sh "${NODE}" -d CrossScenario -lb 20 -nm 1 -nr 10 -rt 300 -ns dreal -drp /home/models/dreal4/bazel-bin/dreal/dreal -drto 300000

./run.sh "${NODE}" -d CrossScenario -lb 21 -nm 1 -nr 10 -rt 300 -ns dreal -drp /home/models/dreal4/bazel-bin/dreal/dreal -drto 300000
./run.sh "${NODE}" -d CrossScenario -lb 9 -nm 1 -nr 10 -rt 300 -ns z3 -drp /home/models/dreal4/bazel-bin/dreal/dreal -drto 300000

