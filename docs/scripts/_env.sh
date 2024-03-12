#! /bin/sh

export JAVA_HOME=/Library/Java/JavaVirtualMachines/1.6.0.jdk/Contents/Home
export ANT_HOME=/opt/java/apache-ant-1.8.4


#export JAVA_TOOL_OPTIONS=-Dfile.encoding=UTF8
#export JAVA_TOOL_OPTIONS=-Dfile.encoding=ISO-8859-1


export ANT_FILE=../../build.xml


export PATH=$JAVA_HOME/bin:$ANT_HOME/bin:$PATH


