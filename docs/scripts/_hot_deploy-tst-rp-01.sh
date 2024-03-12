#! /bin/sh

source ./_env.sh

ant -f $ANT_FILE -Dtarget=tst-rp-01 _hot_deploy-remote-jboss