#!/bin/bash

#Quick script for a POC, nothing more


if [ -f target/surefire-reports/*.xml ]
then
	echo "Found evidence.  Proceed!"
else
	echo "Missing evidence"
	exit 1
fi
