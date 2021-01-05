#!/usr/bin/bash
NODE="$1"
VERSION="$2"
./run.sh "${NODE}" -d "FamilyTree${VERSION}" -lb 5 -ub 5 -nm 1 -rt 300
./run.sh "${NODE}" -d "FamilyTree${VERSION}" -lb 6 -ub 6 -nm 1 -rt 300
./run.sh "${NODE}" -d "FamilyTree${VERSION}" -lb 7 -ub 7 -nm 1 -rt 300
./run.sh "${NODE}" -d "FamilyTree${VERSION}" -lb 8 -ub 8 -nm 1 -rt 300
./run.sh "${NODE}" -d "FamilyTree${VERSION}" -lb 9 -ub 9 -nm 1 -rt 300
./run.sh "${NODE}" -d "FamilyTree${VERSION}" -lb 10 -ub 10 -nm 1 -rt 300
./run.sh "${NODE}" -d "FamilyTree${VERSION}" -lb 20 -ub 20 -nm 1 -rt 300
./run.sh "${NODE}" -d "FamilyTree${VERSION}" -lb 40 -ub 40 -nm 1 -rt 300
./run.sh "${NODE}" -d "FamilyTree${VERSION}" -lb 60 -ub 60 -nm 1 -rt 300
./run.sh "${NODE}" -d "FamilyTree${VERSION}" -lb 80 -ub 80 -nm 1 -rt 300
./run.sh "${NODE}" -d "FamilyTree${VERSION}" -lb 100 -ub 100 -nm 1 -rt 300
