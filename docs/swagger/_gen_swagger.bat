call ./_env.bat

set CLI_JAR_PATH=lib/swagger-codegen-cli.jar
set CUSTOM_GEN_JAR_PATH=lib/csi-java-swagger-codegen-1.0.0.jar
set YAML=starivbl-1.0.0-swagger.yaml

set YAML_FILE_CONFIG_RESTEASY=swagger_config_resteasy.json
set DIR_GEN_RESTEASY=./

java -cp "%CLI_JAR_PATH%;%CUSTOM_GEN_JAR_PATH%" %DEBUG_OPTS% io.swagger.codegen.SwaggerCodegen generate -i %YAML% -l jaxrs-resteasy-eap-csi -o gen --config %YAML_FILE_CONFIG_RESTEASY%

rem pause "#### generazione documentazione html ####"
java -jar %CLI_JAR_PATH% generate -l html -i %YAML% -o .