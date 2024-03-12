#! /bin/sh


#########################################
###### ambiente OPENJDK 11 +  WILDFLY 17
#########################################

export WILDFLY_HOME=/opt/java/wildfly230_CSI
export JAVA_HOME=/opt/java/jdk/jdk-11.0.2.jdk/Contents/Home
export MVN_HOME=/opt/java/apache-maven-3.6.0
export MVN_SETTINGS=$MVN_HOME/conf/settings.xml
export PATH=$JAVA_HOME/bin:$MVN_HOME/bin:$PATH


#export MVN_DEPENDENCIES=dependency:purge-local-repository
export MVN_DEPENDENCIES=

echo "JAVA VERSION " 
java -version






