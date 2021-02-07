#!/usr/bin/bash
NODE="$1"
./run.sh "${NODE}" -d Taxation -lb 20 -nm 10 -rt 3600 -hh 1 -ns z3
./run.sh "${NODE}" -d Taxation -lb 40 -nm 10 -rt 3600 -hh 2 -ns z3
./run.sh "${NODE}" -d Taxation -lb 60 -nm 10 -rt 3600 -hh 3 -ns z3
./run.sh "${NODE}" -d Taxation -lb 80 -nm 10 -rt 3600 -hh 4 -ns z3
./run.sh "${NODE}" -d Taxation -lb 100 -nm 10 -rt 3600 -hh 5 -ns z3
./run.sh "${NODE}" -d Taxation -lb 20 -nm 10 -rt 3600 -hh 1 -ns dreal -drp /home/models/dreal4/bazel-bin/dreal/dreal
./run.sh "${NODE}" -d Taxation -lb 40 -nm 10 -rt 3600 -hh 2 -ns dreal -drp /home/models/dreal4/bazel-bin/dreal/dreal
./run.sh "${NODE}" -d Taxation -lb 60 -nm 10 -rt 3600 -hh 3 -ns dreal -drp /home/models/dreal4/bazel-bin/dreal/dreal
./run.sh "${NODE}" -d Taxation -lb 80 -nm 10 -rt 3600 -hh 4 -ns dreal -drp /home/models/dreal4/bazel-bin/dreal/dreal
./run.sh "${NODE}" -d Taxation -lb 100 -nm 10 -rt 3600 -hh 5 -ns dreal -drp /home/models/dreal4/bazel-bin/dreal/dreal
