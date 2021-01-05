#!/usr/bin/bash
NODE="$1"
./run.sh "${NODE}" -d Taxation -lb 20 -nm 10 -rt 3600 -hh 1
./run.sh "${NODE}" -d Taxation -lb 40 -nm 10 -rt 3600 -hh 2
./run.sh "${NODE}" -d Taxation -lb 60 -nm 10 -rt 3600 -hh 3
./run.sh "${NODE}" -d Taxation -lb 80 -nm 10 -rt 3600 -hh 4
./run.sh "${NODE}" -d Taxation -lb 100 -nm 10 -rt 3600 -hh 5
