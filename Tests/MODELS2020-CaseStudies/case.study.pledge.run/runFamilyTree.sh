#!/usr/bin/bash
NODE="$1"
./run.sh "${NODE}" -d FamilyTree -lb 20 -nm 10 -rt 3600
./run.sh "${NODE}" -d FamilyTree -lb 40 -nm 10 -rt 3600
./run.sh "${NODE}" -d FamilyTree -lb 60 -nm 10 -rt 3600
./run.sh "${NODE}" -d FamilyTree -lb 80 -nm 10 -rt 3600
./run.sh "${NODE}" -d FamilyTree -lb 100 -nm 10 -rt 3600
