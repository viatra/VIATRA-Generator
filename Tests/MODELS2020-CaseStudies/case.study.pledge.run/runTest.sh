#!/usr/bin/bash
NODE="$1"
./run.sh "${NODE}" -d FamilyTree -lb 10 -nr 3 -nm 2 -rt 3600 -hh 1 -ns z3
./run.sh "${NODE}" -d Satellite -lb 10 -nr 3 -nm 2 -rt 3600 -hh 1 -ns dreal -drp /home/models/dreal4/bazel-bin/dreal/dreal
./run.sh "${NODE}" -d Taxation -lb 10 -nr 1 -nm 2 -rt 3600 -hh 1 -ns z3

