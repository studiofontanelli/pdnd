#!/bin/sh


COMMAND="mvn -f ../../pom.xml -s $MVN_SETTINGS -Dmaven.test.skip=true -P$MVN_PROFILE clean"

echo "$COMMAND"
exec $COMMAND












