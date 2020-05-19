REM java -Xms12G -jar gencache.jar -d Satellite -lb 50 -ub 70
REM java -Xms12G -jar gencache.jar -d FamilyTree -lb 50 -ub 70
REM java -Xms12G -jar gencache.jar -d TaxationNoRoot -lb 50 -ub 100
REM java -Xms12G -jar gencache.jar -d TaxationWithRoot -lb 50 -ub 100 -hh 1

REM java -Xms12G -jar gencache.jar -d Satellite -lb 100 -ub 120
REM java -Xms12G -jar gencache.jar -d FamilyTree -lb 100 -ub 120
REM java -Xms12G -jar gencache.jar -d TaxationNoRoot -lb 100 -ub 150
REM java -Xms12G -jar gencache.jar -d TaxationWithRoot -lb 100 -ub 150 -hh 2

REM java -Xms12G -jar gencache.jar -d Satellite -lb 150 -ub 170
REM java -Xms12G -jar gencache.jar -d FamilyTree -lb 150 -ub 170
REM java -Xms12G -jar gencache.jar -d TaxationNoRoot -lb 150 -ub 200
REM java -Xms12G -jar gencache.jar -d TaxationWithRoot -lb 150 -ub 200 -hh 3

REM java -Xms12G -jar gencache.jar -d Satellite -lb 200 -ub 220
REM java -Xms12G -jar gencache.jar -d FamilyTree -lb 200 -ub 220
REM java -Xms12G -jar gencache.jar -d TaxationNoRoot -lb 200 -ub 250
REM java -Xms12G -jar gencache.jar -d TaxationWithRoot -lb 200 -ub 250 -hh 4

REM java -Xms12G -jar gencache.jar -d TaxationNoRoot -lb 50
REM java -Xms12G -jar gencache.jar -d TaxationWithRoot -lb 50 -hh 1
REM java -Xms12G -jar gencache.jar -d FamilyTreeSMTEnd -lb 50

REM java -Xms12G -jar gencache.jar -d TaxationNoRoot -lb 100
REM java -Xms12G -jar gencache.jar -d TaxationWithRoot -lb 100 -hh 2
java -Xms12G -jar gencache.jar -d FamilyTreeSMTEnd -lb 100

java -Xms12G -jar gencache.jar -d TaxationNoRoot -lb 150
REM java -Xms12G -jar gencache.jar -d TaxationWithRoot -lb 150 -hh 3
java -Xms12G -jar gencache.jar -d FamilyTreeSMTEnd -lb 150

java -Xms12G -jar gencache.jar -d TaxationNoRoot -lb 200
REM java -Xms12G -jar gencache.jar -d TaxationWithRoot -lb 200 -hh 4
java -Xms12G -jar gencache.jar -d FamilyTreeSMTEnd -lb 200
