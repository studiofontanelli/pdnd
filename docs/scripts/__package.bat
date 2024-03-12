rem Package command

mvn -f ../../pom.xml -e -s %MVN_SETTINGS% -Dmaven.test.skip=true -P%MVN_PROFILE% clean compile package






