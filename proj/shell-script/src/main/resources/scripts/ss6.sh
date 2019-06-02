#!/bin/bash
# how to set position params by passing text, cmd  output

	set -x
	set ravi kiran goru
	echo "-----" 
	echo "0-param : $0"
	echo "1-param : $1"
	echo "2-param : $2"
	echo "all-param  as array: $@"
	echo "param length :" $#
	echo "previous cmd status: $?"
	echo "all-param : $*"
	set +x
	
	
	set `cat src.txt`
	echo "-----" 
	echo "0-param : $0"
	echo "1-param : $1"
	echo "2-param : $2"
	echo "all-param  as array: $@"
	echo "param length :" $#
	
	mv rav.txt ravi.txt
	echo "previous cmd status: $?"
	
	echo "all-param : $*"
	echo "-----" 
	
#	set `who am i`
#	user_name=$1
#	login_time=$3
	
#	echo "user is $user_name"
#	echo "logged in at $login_time"
