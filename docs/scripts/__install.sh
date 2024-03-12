#!/bin/sh

COMMAND="mvn -f ../../pom.xml -s $MVN_SETTINGS -Dmaven.test.skip=true -P$MVN_PROFILE $MVN_DEPENDENCIES clean compile package install"

echo "$COMMAND"
exec $COMMAND












