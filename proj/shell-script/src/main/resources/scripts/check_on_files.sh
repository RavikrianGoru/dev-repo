#! /bin/bash
# file checks 


# way-1
if test -f $1 
then
	echo "$1 File is exists"
fi


# way-2
if [ -f $1 ]
then
	echo "file existe $1"
fi


# way-3
if [[ -f $1 ]]
then
	echo "file existe $1"
fi



test -f $1 && echo "File is available" || echo "File is not avaiable"
[ -f $1 ] && echo "File is available" || echo "File is not avaiable"
[[ -f $1 ]] && echo "File is available" || echo "File is not avaiable"


test -f $1 && { echo "File is available";  cat $1; } || echo "File is not avaiable"
[ -f $1 ] && { echo "File is available";  cat $1; } || echo "File is not avaiable"
[[ -f $1 ]] && { echo "File is available";  cat $1; } || echo "File is not avaiable"




if [ ! -f $1 ]
then 
	echo "File is not available"
fi


if [ -f $1 -a -f $2 ]
then
	echo "$1 and $2 file available"
fi

if [[ -f $1 && -f $2 ]]
then
	echo "$1 and $2 file available"
fi

 
test -d $1 && { echo "$1 is direcory"; } || { echo "$1 is file not dir";  }
test -s $1 && { echo "$1 is not empty"; } || { echo "$1 is empty file";  }
