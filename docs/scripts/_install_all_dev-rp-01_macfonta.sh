#!/bin/sh

source ./__env_macfonta.sh

export MVN_PROFILE=dev-rp-01


source ./__build_angular_client.sh

source ./__delete_angular_client.sh

source ./__copy_angular_client.sh

source ./__install.sh












