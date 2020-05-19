REM java -jar generator.jar -d Satellite -s 275 -n 4
REM java -jar generator.jar -d Satellite -s 300 -n 4

REM java -jar generator.jar -d FamilyTree -s 50 -rt 900
REM java -jar generator.jar -d FamilyTree -s 100 -rt 900 
REM java -jar generator.jar -d FamilyTree -s 150 -rt 900
REM java -jar generator.jar -d FamilyTree -s 200 -rt 900
REM java -jar generator.jar -d FamilyTree -s 250 -rt 900

REM java -jar generator.jar -d TaxationWithRoot -s 100 -n 5 
REM java -jar generator.jar -d TaxationNoRoot -s 100 -n 5 

REM java -jar generator.jar -d TaxationNoRoot -s 200 -rt 600 -n 6
REM java -jar generator.jar -d TaxationNoRoot -s 250 -n 3

java -jar generator.jar -d TaxationWithRoot -s 200 -n 5
java -jar generator.jar -d TaxationNoRoot -s 250 -n 3