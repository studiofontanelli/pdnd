#!/bin/sh

source ./_env.sh

java -version

# SET NEW VERSION HERE

export NEW_VERSION=1.11.0


COMMAND="mvn -f ../../pom.xml versions:set -DnewVersion=$NEW_VERSION"

echo "$COMMAND" 

exec $COMMAND 












