#! /bin/bash -x

# rename a file: src and dest file names can be passes as cmd line args
# position parameters $1 $2 $3........ $0 script file , $@ all args as array , $* all elements $#   args length .... $?

if [ $# -eq 2 ]
then
	mv $1 $2
	cat $2
	
	echo "-----" 
	echo $0
	echo $1
	echo $2
	echo $@
	echo $#
	echo $?
	echo $*	
	
else
	echo "usage: sh ss4.sh arg1 arg2"
	echo "usage: bash -x ss4.sh arg1 arg2"	
fi
