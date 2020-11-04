java -Xms12G -jar gencache.jar -d Taxation -lb 20 -hh 1
java -Xms12G -jar gencache.jar -d Satellite -lb 20
REM java -Xms12G -jar gencache.jar -d FamilyTree -lb 20

java -Xms12G -jar gencache.jar -d Taxation -lb 40 -hh 2
java -Xms12G -jar gencache.jar -d Satellite -lb 40
REM java -Xms12G -jar gencache.jar -d FamilyTree -lb 40

java -Xms12G -jar gencache.jar -d Satellite -lb 60
java -Xms12G -jar gencache.jar -d FamilyTree -lb 60
java -Xms12G -jar gencache.jar -d Satellite -lb 80
java -Xms12G -jar gencache.jar -d FamilyTree -lb 80
java -Xms12G -jar gencache.jar -d Satellite -lb 100
java -Xms12G -jar gencache.jar -d FamilyTree -lb 100

java -Xms12G -jar gencache.jar -d Taxation -lb 60 -hh 3
java -Xms12G -jar gencache.jar -d Taxation -lb 80 -hh 4
java -Xms12G -jar gencache.jar -d Taxation -lb 100 -hh 5
