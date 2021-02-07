#!/usr/bin/bash
NODE="$1"
./run.sh "${NODE}" -d Satellite -lb 20 -nm 10 -rt 3600 -ns z3
./run.sh "${NODE}" -d Satellite -lb 40 -nm 10 -rt 3600 -ns z3
./run.sh "${NODE}" -d Satellite -lb 60 -nm 10 -rt 3600 -ns z3
./run.sh "${NODE}" -d Satellite -lb 80 -nm 10 -rt 3600 -ns z3
./run.sh "${NODE}" -d Satellite -lb 100 -nm 10 -rt 3600 -ns z3
./run.sh "${NODE}" -d Satellite -lb 20 -nm 10 -rt 3600 -ns dreal -drp /home/models/dreal4/bazel-bin/dreal/dreal
./run.sh "${NODE}" -d Satellite -lb 40 -nm 10 -rt 3600 -ns dreal -drp /home/models/dreal4/bazel-bin/dreal/dreal
./run.sh "${NODE}" -d Satellite -lb 60 -nm 10 -rt 3600 -ns dreal -drp /home/models/dreal4/bazel-bin/dreal/dreal
./run.sh "${NODE}" -d Satellite -lb 80 -nm 10 -rt 3600 -ns dreal -drp /home/models/dreal4/bazel-bin/dreal/dreal
./run.sh "${NODE}" -d Satellite -lb 100 -nm 10 -rt 3600 -ns dreal -drp /home/models/dreal4/bazel-bin/dreal/dreal