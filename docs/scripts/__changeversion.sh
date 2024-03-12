#!/bin/sh

COMMAND="mvn -f ../../pom.xml versions:set -DnewVersion=$NEW_VERSION"

echo "$COMMAND" 
exec $COMMAND 


echo "PLEASE: CHANGE VERSION MANUALLY $NEW_VERSION ALSO IN <properties> ...  </properties>    pomx.xml" 











