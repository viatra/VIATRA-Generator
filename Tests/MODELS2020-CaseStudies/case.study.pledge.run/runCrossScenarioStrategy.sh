#!/usr/bin/bash
NODE="$1"
./run.sh "${NODE}" -d StrategyYes -lb 0 -nr 10 -nm 1 -rt 300 -ns dreal -drp /home/models/dreal4/bazel-bin/dreal/dreal -drto 300000

./run.sh "${NODE}" -d StrategyNoWithHints -lb 1 -nr 10 -nm 1 -rt 300 -ns dreal -drp /home/models/dreal4/bazel-bin/dreal/dreal -drto 10000
./run.sh "${NODE}" -d StrategyNo -lb 1 -nr 10 -nm 1 -rt 300 -ns dreal -drp /home/models/dreal4/bazel-bin/dreal/dreal -drto 10000

./run.sh "${NODE}" -d StrategyNoWithHints -lb 1 -ub 1 -nr 10 -nm 1 -rt 300 -ns dreal -drp /home/models/dreal4/bazel-bin/dreal/dreal -drto 10000
./run.sh "${NODE}" -d StrategyNo -lb 1 -ub 1 -nr 10 -nm 1 -rt 300 -ns dreal -drp /home/models/dreal4/bazel-bin/dreal/dreal -drto 10000

./run.sh "${NODE}" -d StrategyNoWithHints -lb 0 -nr 10 -nm 1 -rt 300 -ns dreal -drp /home/models/dreal4/bazel-bin/dreal/dreal -drto 10000
./run.sh "${NODE}" -d StrategyNo -lb 0 -nr 10 -nm 1 -rt 300 -ns dreal -drp /home/models/dreal4/bazel-bin/dreal/dreal -drto 10000

./run.sh "${NODE}" -d StrategyNoWithHints -lb 0 -nr 10 -nm 1 -rt 300 -ns dreal -drp /home/models/dreal4/bazel-bin/dreal/dreal -drto 300000
./run.sh "${NODE}" -d StrategyNo -lb 0 -nr 10 -nm 1 -rt 300 -ns dreal -drp /home/models/dreal4/bazel-bin/dreal/dreal -drto 300000
