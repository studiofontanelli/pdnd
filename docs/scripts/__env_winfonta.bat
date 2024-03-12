rem #########################################
rem ###### ambiente OPENJDK 11 +  WILDFLY 23
rem #########################################

set JAVA_HOME=C:/opt/java/openjdk-11.0.2/jdk-11.0.2
set WILDFLY_HOME=C:/opt/java/wildfly230_CSI
set MVN_HOME=C:/opt/java/apache-maven-3.6.0
set MVN_SETTINGS=C:/opt/java/apache-maven-3.6.0/conf/settings.xml


rem # HOME PROGETTO ANGULAR
set STARIVWCL_HOME=C:/opt/angular/projects/csi/tau/stariv/starivwcl
set STARIVBL_HOME=C:/opt/java/projects/csi/tau/stariv/starivbl

set PATH=%JAVA_HOME%/bin;%MVN_HOME%/bin;%PATH%

echo JAVA_HOME = %JAVA_HOME%
echo MVN_HOME = %MVN_HOME%
echo MVN_SETTINGS = %MVN_SETTINGS%

java -version