# VIATRA-Generator

## Contributors guide
This guide gives a step-by-step instruction to setup a developement environment.
* Install Eclipse, choose Eclipse Modeling Tools edition.
* Set the character encoding to UTF8 (*Window > Preferences > Workspace > Text file encoding*).
* Install the newest stable version of the following tools from the Neon Update Site:
  * Xtext Complete SDK
  * Xtend IDE
* Install the latest version of the VIATRA plugins from the following update site: ```VIATRA - https://hudson.eclipse.org/viatra/job/viatra-master/lastSuccessfulBuild/artifact/releng/org.eclipse.viatra.update/target/repository/```
* Install those plugins:
  * VIATRA Query and Transformation SDK
  * VIATRA-DSE framework (Incubation) Developer Resources
* Clone the Git repository.
* Currently the Alloy Analyser tool need to be added manually.  Download alloy4.2_2015-02-22.jar from http://alloy.mit.edu/alloy/downloads/alloy4.2_2015-02-22.jar and place it to the ```hu.bme.mit.inf.dlsreasoner.alloy.reasoner/lib/``` folder.

